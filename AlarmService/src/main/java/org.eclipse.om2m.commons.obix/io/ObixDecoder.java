/*******************************************************************************
 * Copyright (c) 2013-2020 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
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
package org.eclipse.om2m.commons.obix.io;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.om2m.commons.obix.Obj;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Obix decoder to obtain the javaobject corresponding to an oBIX XML
 * representation.
 *
 * @author Francois Aissaoui
 */
public class ObixDecoder {

    private static final Log LOG = LogFactory.getLog(ObixDecoder.class);

    /**
     * Method not allowed
     */
    private ObixDecoder() {
        // Not allowed
    }

    /**
     * Get the java object from the oBIX XML representation
     *
     * @param representation Sting from the oBIX object
     * @return the oBIX object decoded
     */
    public static Obj fromString(String representation) {
        StringReader stringReader = new StringReader(representation);
        try {
            Unmarshaller unmarshaller = ObixMapper.getInstance()
                    .getJAXBContext().createUnmarshaller();
            return (Obj) unmarshaller.unmarshal(stringReader);
        } catch (JAXBException e) {
            LOG.error("Error in decoding oBIX object", e);
        }
        return null;
    }
}
