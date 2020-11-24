package fr.insa.automanagement;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import static java.util.concurrent.TimeUnit.*;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class AutomanagementApplication implements Runnable {

    // Alarm API
    private final String alarmAPIEndpoint = "http://localhost:8001/alarm/1";

    // Presence detector API
    private final String presenceAPIEndpoint = "http://localhost:8002/presence";

    // AutoManagement settings
    public boolean ON = true;
    public boolean IS_CLOSED = false;

    private RestTemplate restTemplate;


    public static void main(String[] args) throws InterruptedException {


        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);


        //schedule to run after sometime
        System.out.println("Current Time = "+new Date());

        AutomanagementApplication app = new AutomanagementApplication();
        scheduledThreadPool.schedule(app, 5, TimeUnit.SECONDS);

        //add some delay to let some threads spawn by scheduler
        Thread.sleep(30000);

        scheduledThreadPool.shutdown();
    }


    public void run() {
        restTemplate = new RestTemplate();
        // Check for presence
        if (checkPresence()) {
            // Check if INSA is closed
            if (isClosed()) {
                // Trigger the alarm
                triggerAlarm(1);
            }
        }
    }

    public boolean checkPresence() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        String body = restTemplate.exchange(this.presenceAPIEndpoint, HttpMethod.GET, entity, String.class).getBody();

        JSONObject json = null;
        try {
            json = new JSONObject(body);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            return json.getString("presence").equals("true");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void triggerAlarm(Integer duration) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(duration.toString(), headers);

        System.out.println(
                restTemplate.exchange(this.alarmAPIEndpoint, HttpMethod.POST, entity, String.class).getStatusCode());
    }

    public boolean isClosed() {
        // Everytime switch to CLOSED or OPENED for testing purposes
        this.IS_CLOSED = !this.IS_CLOSED;
        return this.IS_CLOSED;
    }

}
