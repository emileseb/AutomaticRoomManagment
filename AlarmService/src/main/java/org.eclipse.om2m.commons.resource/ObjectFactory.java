/*******************************************************************************
 * Copyright (c) 2013-2016 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.eclipse.om2m.commons.resource package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _AttributeList_QNAME = new QName(
			"http://www.onem2m.org/xml/protocols", "attributeList");
	private final static QName _URIlist_QNAME = new QName(
			"http://www.onem2m.org/xml/protocols", "URIlist");
	private final static QName _AggregatedResponse_QNAME = new QName(
			"http://www.onem2m.org/xml/protocols", "aggregatedResponse");
	private final static QName _Notification_QNAME = new QName(
			"http://www.onem2m.org/xml/protocols", "notification");
	private final static QName _Resource_QNAME = new QName(
			"http://www.onem2m.org/xml/protocols", "resource");
	private final static QName _AggregatedNotification_QNAME = new QName(
			"http://www.onem2m.org/xml/protocols", "aggregatedNotification");
	private final static QName _SoftwareActivate_QNAME = new QName("",
			"activate");
	private final static QName _SoftwareInstall_QNAME = new QName("", "install");
	private final static QName _SoftwareUninstall_QNAME = new QName("",
			"uninstall");
	private final static QName _SoftwareChildResource_QNAME = new QName("",
			"childResource");
	private final static QName _SoftwareName_QNAME = new QName("", "name");
	private final static QName _SoftwareActiveStatus_QNAME = new QName("",
			"activeStatus");
	private final static QName _SoftwareDeactivate_QNAME = new QName("",
			"deactivate");
	private final static QName _SoftwareURL_QNAME = new QName("", "URL");
	private final static QName _SoftwareInstallStatus_QNAME = new QName("",
			"installStatus");
	private final static QName _SoftwareVersion_QNAME = new QName("", "version");
	private final static QName _CmdhPolicyMgmtLink_QNAME = new QName("",
			"mgmtLink");
	private final static QName _FirmwareAnncUpdate_QNAME = new QName("",
			"update");
	private final static QName _FirmwareAnncUpdateStatus_QNAME = new QName("",
			"updateStatus");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.eclipse.om2m.commons.resource
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link AccessControlRule }
	 * 
	 */
	public AccessControlRule createAccessControlRule() {
		return new AccessControlRule();
	}

	/**
	 * Create an instance of {@link AccessControlRule.AccessControlContexts }
	 * 
	 */
	public AccessControlRule.AccessControlContexts createAccessControlRuleAccessControlContexts() {
		return new AccessControlRule.AccessControlContexts();
	}

	/**
	 * Create an instance of {@link Notification }
	 * 
	 */
	public Notification createNotification() {
		return new Notification();
	}

	/**
	 * Create an instance of {@link Notification.NotificationEvent }
	 * 
	 */
	public Notification.NotificationEvent createNotificationNotificationEvent() {
		return new Notification.NotificationEvent();
	}

	/**
	 * Create an instance of {@link AggregatedRequest }
	 * 
	 */
	public AggregatedRequest createAggregatedRequest() {
		return new AggregatedRequest();
	}

	/**
	 * Create an instance of {@link MetaInformation }
	 * 
	 */
	public MetaInformation createMetaInformation() {
		return new MetaInformation();
	}

	/**
	 * Create an instance of {@link ScheduleAnnc }
	 * 
	 */
	public ScheduleAnnc createScheduleAnnc() {
		return new ScheduleAnnc();
	}

	/**
	 * Create an instance of {@link AnnouncedSubordinateResource }
	 * 
	 */
	public AnnouncedSubordinateResource createAnnouncedSubordinateResource() {
		return new AnnouncedSubordinateResource();
	}

	/**
	 * Create an instance of {@link Resource }
	 * 
	 */
	public Resource createResource() {
		return new Resource();
	}

	/**
	 * Create an instance of {@link ScheduleEntries }
	 * 
	 */
	public ScheduleEntries createScheduleEntries() {
		return new ScheduleEntries();
	}

	/**
	 * Create an instance of {@link AEAnnc }
	 * 
	 */
	public AEAnnc createAEAnnc() {
		return new AEAnnc();
	}

	/**
	 * Create an instance of {@link AnnouncedResource }
	 * 
	 */
	public AnnouncedResource createAnnouncedResource() {
		return new AnnouncedResource();
	}

	/**
	 * Create an instance of {@link ChildResourceRef }
	 * 
	 */
	public ChildResourceRef createChildResourceRef() {
		return new ChildResourceRef();
	}

	/**
	 * Create an instance of {@link Container }
	 * 
	 */
	public Container createContainer() {
		return new Container();
	}

	/**
	 * Create an instance of {@link AnnounceableResource }
	 * 
	 */
	public AnnounceableResource createAnnounceableResource() {
		return new AnnounceableResource();
	}

	/**
	 * Create an instance of {@link RegularResource }
	 * 
	 */
	public RegularResource createRegularResource() {
		return new RegularResource();
	}

	/**
	 * Create an instance of {@link ContentInstance }
	 * 
	 */
	public ContentInstance createContentInstance() {
		return new ContentInstance();
	}

	/**
	 * Create an instance of {@link AnnounceableSubordinateResource }
	 * 
	 */
	public AnnounceableSubordinateResource createAnnounceableSubordinateResource() {
		return new AnnounceableSubordinateResource();
	}

	/**
	 * Create an instance of {@link Subscription }
	 * 
	 */
	public Subscription createSubscription() {
		return new Subscription();
	}

	/**
	 * Create an instance of {@link EventNotificationCriteria }
	 * 
	 */
	public EventNotificationCriteria createEventNotificationCriteria() {
		return new EventNotificationCriteria();
	}

	/**
	 * Create an instance of {@link BatchNotify }
	 * 
	 */
	public BatchNotify createBatchNotify() {
		return new BatchNotify();
	}

	/**
	 * Create an instance of {@link RateLimit }
	 * 
	 */
	public RateLimit createRateLimit() {
		return new RateLimit();
	}

	/**
	 * Create an instance of {@link Schedule }
	 * 
	 */
	public Schedule createSchedule() {
		return new Schedule();
	}

	/**
	 * Create an instance of {@link ContainerAnnc }
	 * 
	 */
	public ContainerAnnc createContainerAnnc() {
		return new ContainerAnnc();
	}

	/**
	 * Create an instance of {@link ContentInstanceAnnc }
	 * 
	 */
	public ContentInstanceAnnc createContentInstanceAnnc() {
		return new ContentInstanceAnnc();
	}

	/**
	 * Create an instance of {@link Group }
	 * 
	 */
	public Group createGroup() {
		return new Group();
	}

	/**
	 * Create an instance of {@link GroupAnnc }
	 * 
	 */
	public GroupAnnc createGroupAnnc() {
		return new GroupAnnc();
	}

	/**
	 * Create an instance of {@link AccessControlPolicy }
	 * 
	 */
	public AccessControlPolicy createAccessControlPolicy() {
		return new AccessControlPolicy();
	}

	/**
	 * Create an instance of {@link SetOfAcrs }
	 * 
	 */
	public SetOfAcrs createSetOfAcrs() {
		return new SetOfAcrs();
	}

	/**
	 * Create an instance of {@link AccessControlPolicyAnnc }
	 * 
	 */
	public AccessControlPolicyAnnc createAccessControlPolicyAnnc() {
		return new AccessControlPolicyAnnc();
	}

	/**
	 * Create an instance of {@link PollingChannel }
	 * 
	 */
	public PollingChannel createPollingChannel() {
		return new PollingChannel();
	}

	/**
	 * Create an instance of {@link CmdhNetworkAccessRules }
	 * 
	 */
	public CmdhNetworkAccessRules createCmdhNetworkAccessRules() {
		return new CmdhNetworkAccessRules();
	}

	/**
	 * Create an instance of {@link MgmtResource }
	 * 
	 */
	public MgmtResource createMgmtResource() {
		return new MgmtResource();
	}

	/**
	 * Create an instance of {@link MgmtLinkRef }
	 * 
	 */
	public MgmtLinkRef createMgmtLinkRef() {
		return new MgmtLinkRef();
	}

	/**
	 * Create an instance of {@link EventConfig }
	 * 
	 */
	public EventConfig createEventConfig() {
		return new EventConfig();
	}

	/**
	 * Create an instance of {@link CmdhDefaults }
	 * 
	 */
	public CmdhDefaults createCmdhDefaults() {
		return new CmdhDefaults();
	}

	/**
	 * Create an instance of {@link M2MServiceSubscriptionProfile }
	 * 
	 */
	public M2MServiceSubscriptionProfile createM2MServiceSubscriptionProfile() {
		return new M2MServiceSubscriptionProfile();
	}

	/**
	 * Create an instance of {@link ServiceSubscribedNode }
	 * 
	 */
	public ServiceSubscribedNode createServiceSubscribedNode() {
		return new ServiceSubscribedNode();
	}

	/**
	 * Create an instance of {@link NodeAnnc }
	 * 
	 */
	public NodeAnnc createNodeAnnc() {
		return new NodeAnnc();
	}

	/**
	 * Create an instance of {@link MemoryAnnc }
	 * 
	 */
	public MemoryAnnc createMemoryAnnc() {
		return new MemoryAnnc();
	}

	/**
	 * Create an instance of {@link AnnouncedMgmtResource }
	 * 
	 */
	public AnnouncedMgmtResource createAnnouncedMgmtResource() {
		return new AnnouncedMgmtResource();
	}

	/**
	 * Create an instance of {@link BatteryAnnc }
	 * 
	 */
	public BatteryAnnc createBatteryAnnc() {
		return new BatteryAnnc();
	}

	/**
	 * Create an instance of {@link AreaNwkInfoAnnc }
	 * 
	 */
	public AreaNwkInfoAnnc createAreaNwkInfoAnnc() {
		return new AreaNwkInfoAnnc();
	}

	/**
	 * Create an instance of {@link AreaNwkDeviceInfoAnnc }
	 * 
	 */
	public AreaNwkDeviceInfoAnnc createAreaNwkDeviceInfoAnnc() {
		return new AreaNwkDeviceInfoAnnc();
	}

	/**
	 * Create an instance of {@link FirmwareAnnc }
	 * 
	 */
	public FirmwareAnnc createFirmwareAnnc() {
		return new FirmwareAnnc();
	}

	/**
	 * Create an instance of {@link ActionStatus }
	 * 
	 */
	public ActionStatus createActionStatus() {
		return new ActionStatus();
	}

	/**
	 * Create an instance of {@link SoftwareAnnc }
	 * 
	 */
	public SoftwareAnnc createSoftwareAnnc() {
		return new SoftwareAnnc();
	}

	/**
	 * Create an instance of {@link DeviceInfoAnnc }
	 * 
	 */
	public DeviceInfoAnnc createDeviceInfoAnnc() {
		return new DeviceInfoAnnc();
	}

	/**
	 * Create an instance of {@link DeviceCapabilityAnnc }
	 * 
	 */
	public DeviceCapabilityAnnc createDeviceCapabilityAnnc() {
		return new DeviceCapabilityAnnc();
	}

	/**
	 * Create an instance of {@link RebootAnnc }
	 * 
	 */
	public RebootAnnc createRebootAnnc() {
		return new RebootAnnc();
	}

	/**
	 * Create an instance of {@link EventLogAnnc }
	 * 
	 */
	public EventLogAnnc createEventLogAnnc() {
		return new EventLogAnnc();
	}

	/**
	 * Create an instance of {@link ResponsePrimitive }
	 * 
	 */
	public ResponsePrimitive createResponsePrimitive() {
		return new ResponsePrimitive();
	}

	/**
	 * Create an instance of {@link PrimitiveContent }
	 * 
	 */
	public PrimitiveContent createPrimitiveContent() {
		return new PrimitiveContent();
	}

	/**
	 * Create an instance of {@link Software }
	 * 
	 */
	public Software createSoftware() {
		return new Software();
	}

	/**
	 * Create an instance of {@link org.eclipse.om2m.commons.resource.Request }
	 * 
	 */
	public org.eclipse.om2m.commons.resource.Request createRequest() {
		return new org.eclipse.om2m.commons.resource.Request();
	}

	/**
	 * Create an instance of {@link OperationResult }
	 * 
	 */
	public OperationResult createOperationResult() {
		return new OperationResult();
	}

	/**
	 * Create an instance of {@link MgmtCmd }
	 * 
	 */
	public MgmtCmd createMgmtCmd() {
		return new MgmtCmd();
	}

	/**
	 * Create an instance of {@link ExecReqArgsListType }
	 * 
	 */
	public ExecReqArgsListType createExecReqArgsListType() {
		return new ExecReqArgsListType();
	}

	/**
	 * Create an instance of {@link ExecInstance }
	 * 
	 */
	public ExecInstance createExecInstance() {
		return new ExecInstance();
	}

	/**
	 * Create an instance of {@link AreaNwkInfo }
	 * 
	 */
	public AreaNwkInfo createAreaNwkInfo() {
		return new AreaNwkInfo();
	}

	/**
	 * Create an instance of {@link Firmware }
	 * 
	 */
	public Firmware createFirmware() {
		return new Firmware();
	}

	/**
	 * Create an instance of {@link RemoteCSEAnnc }
	 * 
	 */
	public RemoteCSEAnnc createRemoteCSEAnnc() {
		return new RemoteCSEAnnc();
	}

	/**
	 * Create an instance of {@link AE }
	 * 
	 */
	public AE createAE() {
		return new AE();
	}

	/**
	 * Create an instance of {@link LocationPolicyAnnc }
	 * 
	 */
	public LocationPolicyAnnc createLocationPolicyAnnc() {
		return new LocationPolicyAnnc();
	}

	/**
	 * Create an instance of {@link CmdhNwAccessRule }
	 * 
	 */
	public CmdhNwAccessRule createCmdhNwAccessRule() {
		return new CmdhNwAccessRule();
	}

	/**
	 * Create an instance of {@link CmdhDefEcValue }
	 * 
	 */
	public CmdhDefEcValue createCmdhDefEcValue() {
		return new CmdhDefEcValue();
	}

	/**
	 * Create an instance of {@link CmdhPolicy }
	 * 
	 */
	public CmdhPolicy createCmdhPolicy() {
		return new CmdhPolicy();
	}

	/**
	 * Create an instance of {@link CmdhBuffer }
	 * 
	 */
	public CmdhBuffer createCmdhBuffer() {
		return new CmdhBuffer();
	}

	/**
	 * Create an instance of {@link ActiveCmdhPolicy }
	 * 
	 */
	public ActiveCmdhPolicy createActiveCmdhPolicy() {
		return new ActiveCmdhPolicy();
	}

	/**
	 * Create an instance of {@link Node }
	 * 
	 */
	public Node createNode() {
		return new Node();
	}

	/**
	 * Create an instance of {@link Memory }
	 * 
	 */
	public Memory createMemory() {
		return new Memory();
	}

	/**
	 * Create an instance of {@link Battery }
	 * 
	 */
	public Battery createBattery() {
		return new Battery();
	}

	/**
	 * Create an instance of {@link AreaNwkDeviceInfo }
	 * 
	 */
	public AreaNwkDeviceInfo createAreaNwkDeviceInfo() {
		return new AreaNwkDeviceInfo();
	}

	/**
	 * Create an instance of {@link DeviceInfo }
	 * 
	 */
	public DeviceInfo createDeviceInfo() {
		return new DeviceInfo();
	}

	/**
	 * Create an instance of {@link DeviceCapability }
	 * 
	 */
	public DeviceCapability createDeviceCapability() {
		return new DeviceCapability();
	}

	/**
	 * Create an instance of {@link Reboot }
	 * 
	 */
	public Reboot createReboot() {
		return new Reboot();
	}

	/**
	 * Create an instance of {@link EventLog }
	 * 
	 */
	public EventLog createEventLog() {
		return new EventLog();
	}

	/**
	 * Create an instance of {@link Delivery }
	 * 
	 */
	public Delivery createDelivery() {
		return new Delivery();
	}

	/**
	 * Create an instance of {@link DeliveryMetaData }
	 * 
	 */
	public DeliveryMetaData createDeliveryMetaData() {
		return new DeliveryMetaData();
	}

	/**
	 * Create an instance of {@link CmdhEcDefParamValues }
	 * 
	 */
	public CmdhEcDefParamValues createCmdhEcDefParamValues() {
		return new CmdhEcDefParamValues();
	}

	/**
	 * Create an instance of {@link CSEBase }
	 * 
	 */
	public CSEBase createCSEBase() {
		return new CSEBase();
	}

	/**
	 * Create an instance of {@link RemoteCSE }
	 * 
	 */
	public RemoteCSE createRemoteCSE() {
		return new RemoteCSE();
	}

	/**
	 * Create an instance of {@link LocationPolicy }
	 * 
	 */
	public LocationPolicy createLocationPolicy() {
		return new LocationPolicy();
	}

	/**
	 * Create an instance of {@link StatsConfig }
	 * 
	 */
	public StatsConfig createStatsConfig() {
		return new StatsConfig();
	}

	/**
	 * Create an instance of {@link StatsCollect }
	 * 
	 */
	public StatsCollect createStatsCollect() {
		return new StatsCollect();
	}

	/**
	 * Create an instance of {@link ServiceSubscribedAppRule }
	 * 
	 */
	public ServiceSubscribedAppRule createServiceSubscribedAppRule() {
		return new ServiceSubscribedAppRule();
	}

	/**
	 * Create an instance of {@link AggregatedNotification }
	 * 
	 */
	public AggregatedNotification createAggregatedNotification() {
		return new AggregatedNotification();
	}

	/**
	 * Create an instance of {@link AttributeList }
	 * 
	 */
	public AttributeList createAttributeList() {
		return new AttributeList();
	}

	/**
	 * Create an instance of {@link CmdhLimits }
	 * 
	 */
	public CmdhLimits createCmdhLimits() {
		return new CmdhLimits();
	}

	/**
	 * Create an instance of {@link AggregatedResponse }
	 * 
	 */
	public AggregatedResponse createAggregatedResponse() {
		return new AggregatedResponse();
	}

	/**
	 * Create an instance of {@link ResourceWrapper }
	 * 
	 */
	public ResourceWrapper createResourceWrapper() {
		return new ResourceWrapper();
	}

	/**
	 * Create an instance of {@link RequestPrimitive }
	 * 
	 */
	public RequestPrimitive createRequestPrimitive() {
		return new RequestPrimitive();
	}

	/**
	 * Create an instance of {@link FilterCriteria }
	 * 
	 */
	public FilterCriteria createFilterCriteria() {
		return new FilterCriteria();
	}

	/**
	 * Create an instance of {@link AnyArgType }
	 * 
	 */
	public AnyArgType createAnyArgType() {
		return new AnyArgType();
	}

	/**
	 * Create an instance of {@link SoftwareInstallArgsType }
	 * 
	 */
	public SoftwareInstallArgsType createSoftwareInstallArgsType() {
		return new SoftwareInstallArgsType();
	}

	/**
	 * Create an instance of {@link LocationRegion }
	 * 
	 */
	public LocationRegion createLocationRegion() {
		return new LocationRegion();
	}

	/**
	 * Create an instance of {@link RebootArgsType }
	 * 
	 */
	public RebootArgsType createRebootArgsType() {
		return new RebootArgsType();
	}

	/**
	 * Create an instance of {@link SoftwareUpdateArgsType }
	 * 
	 */
	public SoftwareUpdateArgsType createSoftwareUpdateArgsType() {
		return new SoftwareUpdateArgsType();
	}

	/**
	 * Create an instance of {@link DownloadArgsType }
	 * 
	 */
	public DownloadArgsType createDownloadArgsType() {
		return new DownloadArgsType();
	}

	/**
	 * Create an instance of {@link ResponseTypeInfo }
	 * 
	 */
	public ResponseTypeInfo createResponseTypeInfo() {
		return new ResponseTypeInfo();
	}

	/**
	 * Create an instance of {@link ResetArgsType }
	 * 
	 */
	public ResetArgsType createResetArgsType() {
		return new ResetArgsType();
	}

	/**
	 * Create an instance of {@link Attribute }
	 * 
	 */
	public Attribute createAttribute() {
		return new Attribute();
	}

	/**
	 * Create an instance of {@link SoftwareUninstallArgsType }
	 * 
	 */
	public SoftwareUninstallArgsType createSoftwareUninstallArgsType() {
		return new SoftwareUninstallArgsType();
	}

	/**
	 * Create an instance of {@link UploadArgsType }
	 * 
	 */
	public UploadArgsType createUploadArgsType() {
		return new UploadArgsType();
	}

	/**
	 * Create an instance of
	 * {@link AccessControlRule.AccessControlContexts.AccessControlIpAddresses }
	 * 
	 */
	public AccessControlRule.AccessControlContexts.AccessControlIpAddresses createAccessControlRuleAccessControlContextsAccessControlIpAddresses() {
		return new AccessControlRule.AccessControlContexts.AccessControlIpAddresses();
	}

	/**
	 * Create an instance of
	 * {@link Notification.NotificationEvent.OperationMonitor }
	 * 
	 */
	public Notification.NotificationEvent.OperationMonitor createNotificationNotificationEventOperationMonitor() {
		return new Notification.NotificationEvent.OperationMonitor();
	}

	/**
	 * Create an instance of {@link AggregatedRequest.Request }
	 * 
	 */
	public AggregatedRequest.Request createAggregatedRequestRequest() {
		return new AggregatedRequest.Request();
	}

	/**
	 * Create an instance of {@link MetaInformation.EventCategory }
	 * 
	 */
	public MetaInformation.EventCategory createMetaInformationEventCategory() {
		return new MetaInformation.EventCategory();
	}
	
	public URIList createURIList(){
		return new URIList();
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AttributeList }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.onem2m.org/xml/protocols", name = "attributeList")
	public JAXBElement<AttributeList> createAttributeList(AttributeList value) {
		return new JAXBElement<AttributeList>(_AttributeList_QNAME,
				AttributeList.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}
	 * {@link String }{@code >}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.onem2m.org/xml/protocols", name = "URIlist")
	public JAXBElement<List<String>> createURIlist(List<String> value) {
		return new JAXBElement<List<String>>(_URIlist_QNAME,
				((Class) List.class), null, ((List<String>) value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AggregatedResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.onem2m.org/xml/protocols", name = "aggregatedResponse")
	public JAXBElement<AggregatedResponse> createAggregatedResponse(
			AggregatedResponse value) {
		return new JAXBElement<AggregatedResponse>(_AggregatedResponse_QNAME,
				AggregatedResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Notification }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.onem2m.org/xml/protocols", name = "notification")
	public JAXBElement<Notification> createNotification(Notification value) {
		return new JAXBElement<Notification>(_Notification_QNAME,
				Notification.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ResourceWrapper }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.onem2m.org/xml/protocols", name = "resource")
	public JAXBElement<ResourceWrapper> createResource(ResourceWrapper value) {
		return new JAXBElement<ResourceWrapper>(_Resource_QNAME,
				ResourceWrapper.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AggregatedNotification }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.onem2m.org/xml/protocols", name = "aggregatedNotification")
	public JAXBElement<AggregatedNotification> createAggregatedNotification(
			AggregatedNotification value) {
		return new JAXBElement<AggregatedNotification>(
				_AggregatedNotification_QNAME, AggregatedNotification.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "activate", scope = Software.class)
	public JAXBElement<Boolean> createSoftwareActivate(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareActivate_QNAME, Boolean.class,
				Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "install", scope = Software.class)
	public JAXBElement<Boolean> createSoftwareInstall(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareInstall_QNAME, Boolean.class,
				Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "uninstall", scope = Software.class)
	public JAXBElement<Boolean> createSoftwareUninstall(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareUninstall_QNAME,
				Boolean.class, Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ChildResourceRef }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "childResource", scope = Software.class)
	public JAXBElement<ChildResourceRef> createSoftwareChildResource(
			ChildResourceRef value) {
		return new JAXBElement<ChildResourceRef>(_SoftwareChildResource_QNAME,
				ChildResourceRef.class, Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = Software.class)
	public JAXBElement<String> createSoftwareName(String value) {
		return new JAXBElement<String>(_SoftwareName_QNAME, String.class,
				Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ActionStatus }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "activeStatus", scope = Software.class)
	public JAXBElement<ActionStatus> createSoftwareActiveStatus(
			ActionStatus value) {
		return new JAXBElement<ActionStatus>(_SoftwareActiveStatus_QNAME,
				ActionStatus.class, Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "deactivate", scope = Software.class)
	public JAXBElement<Boolean> createSoftwareDeactivate(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareDeactivate_QNAME,
				Boolean.class, Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "URL", scope = Software.class)
	public JAXBElement<String> createSoftwareURL(String value) {
		return new JAXBElement<String>(_SoftwareURL_QNAME, String.class,
				Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ActionStatus }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "installStatus", scope = Software.class)
	public JAXBElement<ActionStatus> createSoftwareInstallStatus(
			ActionStatus value) {
		return new JAXBElement<ActionStatus>(_SoftwareInstallStatus_QNAME,
				ActionStatus.class, Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "version", scope = Software.class)
	public JAXBElement<String> createSoftwareVersion(String value) {
		return new JAXBElement<String>(_SoftwareVersion_QNAME, String.class,
				Software.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MgmtLinkRef }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "mgmtLink", scope = CmdhPolicy.class)
	public JAXBElement<MgmtLinkRef> createCmdhPolicyMgmtLink(MgmtLinkRef value) {
		return new JAXBElement<MgmtLinkRef>(_CmdhPolicyMgmtLink_QNAME,
				MgmtLinkRef.class, CmdhPolicy.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = CmdhPolicy.class)
	public JAXBElement<String> createCmdhPolicyName(String value) {
		return new JAXBElement<String>(_SoftwareName_QNAME, String.class,
				CmdhPolicy.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "update", scope = FirmwareAnnc.class)
	public JAXBElement<Boolean> createFirmwareAnncUpdate(Boolean value) {
		return new JAXBElement<Boolean>(_FirmwareAnncUpdate_QNAME,
				Boolean.class, FirmwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ChildResourceRef }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "childResource", scope = FirmwareAnnc.class)
	public JAXBElement<ChildResourceRef> createFirmwareAnncChildResource(
			ChildResourceRef value) {
		return new JAXBElement<ChildResourceRef>(_SoftwareChildResource_QNAME,
				ChildResourceRef.class, FirmwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = FirmwareAnnc.class)
	public JAXBElement<String> createFirmwareAnncName(String value) {
		return new JAXBElement<String>(_SoftwareName_QNAME, String.class,
				FirmwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ActionStatus }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "updateStatus", scope = FirmwareAnnc.class)
	public JAXBElement<ActionStatus> createFirmwareAnncUpdateStatus(
			ActionStatus value) {
		return new JAXBElement<ActionStatus>(_FirmwareAnncUpdateStatus_QNAME,
				ActionStatus.class, FirmwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "URL", scope = FirmwareAnnc.class)
	public JAXBElement<String> createFirmwareAnncURL(String value) {
		return new JAXBElement<String>(_SoftwareURL_QNAME, String.class,
				FirmwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "version", scope = FirmwareAnnc.class)
	public JAXBElement<String> createFirmwareAnncVersion(String value) {
		return new JAXBElement<String>(_SoftwareVersion_QNAME, String.class,
				FirmwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "update", scope = Firmware.class)
	public JAXBElement<Boolean> createFirmwareUpdate(Boolean value) {
		return new JAXBElement<Boolean>(_FirmwareAnncUpdate_QNAME,
				Boolean.class, Firmware.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ChildResourceRef }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "childResource", scope = Firmware.class)
	public JAXBElement<ChildResourceRef> createFirmwareChildResource(
			ChildResourceRef value) {
		return new JAXBElement<ChildResourceRef>(_SoftwareChildResource_QNAME,
				ChildResourceRef.class, Firmware.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = Firmware.class)
	public JAXBElement<String> createFirmwareName(String value) {
		return new JAXBElement<String>(_SoftwareName_QNAME, String.class,
				Firmware.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ActionStatus }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "updateStatus", scope = Firmware.class)
	public JAXBElement<ActionStatus> createFirmwareUpdateStatus(
			ActionStatus value) {
		return new JAXBElement<ActionStatus>(_FirmwareAnncUpdateStatus_QNAME,
				ActionStatus.class, Firmware.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "URL", scope = Firmware.class)
	public JAXBElement<String> createFirmwareURL(String value) {
		return new JAXBElement<String>(_SoftwareURL_QNAME, String.class,
				Firmware.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "version", scope = Firmware.class)
	public JAXBElement<String> createFirmwareVersion(String value) {
		return new JAXBElement<String>(_SoftwareVersion_QNAME, String.class,
				Firmware.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "activate", scope = SoftwareAnnc.class)
	public JAXBElement<Boolean> createSoftwareAnncActivate(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareActivate_QNAME, Boolean.class,
				SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "install", scope = SoftwareAnnc.class)
	public JAXBElement<Boolean> createSoftwareAnncInstall(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareInstall_QNAME, Boolean.class,
				SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "uninstall", scope = SoftwareAnnc.class)
	public JAXBElement<Boolean> createSoftwareAnncUninstall(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareUninstall_QNAME,
				Boolean.class, SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ChildResourceRef }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "childResource", scope = SoftwareAnnc.class)
	public JAXBElement<ChildResourceRef> createSoftwareAnncChildResource(
			ChildResourceRef value) {
		return new JAXBElement<ChildResourceRef>(_SoftwareChildResource_QNAME,
				ChildResourceRef.class, SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = SoftwareAnnc.class)
	public JAXBElement<String> createSoftwareAnncName(String value) {
		return new JAXBElement<String>(_SoftwareName_QNAME, String.class,
				SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ActionStatus }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "activeStatus", scope = SoftwareAnnc.class)
	public JAXBElement<ActionStatus> createSoftwareAnncActiveStatus(
			ActionStatus value) {
		return new JAXBElement<ActionStatus>(_SoftwareActiveStatus_QNAME,
				ActionStatus.class, SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "deactivate", scope = SoftwareAnnc.class)
	public JAXBElement<Boolean> createSoftwareAnncDeactivate(Boolean value) {
		return new JAXBElement<Boolean>(_SoftwareDeactivate_QNAME,
				Boolean.class, SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "URL", scope = SoftwareAnnc.class)
	public JAXBElement<String> createSoftwareAnncURL(String value) {
		return new JAXBElement<String>(_SoftwareURL_QNAME, String.class,
				SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ActionStatus }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "installStatus", scope = SoftwareAnnc.class)
	public JAXBElement<ActionStatus> createSoftwareAnncInstallStatus(
			ActionStatus value) {
		return new JAXBElement<ActionStatus>(_SoftwareInstallStatus_QNAME,
				ActionStatus.class, SoftwareAnnc.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "version", scope = SoftwareAnnc.class)
	public JAXBElement<String> createSoftwareAnncVersion(String value) {
		return new JAXBElement<String>(_SoftwareVersion_QNAME, String.class,
				SoftwareAnnc.class, value);
	}

}
