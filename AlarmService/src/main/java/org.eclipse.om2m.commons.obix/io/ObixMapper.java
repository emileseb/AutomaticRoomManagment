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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Mapper class to convert oBIX XML representation to java object or vice-versa
 *
 * @author Francois Aissaoui
 */
public class ObixMapper {
    /**
     * Logger
     */
    private static final Log LOGGER = LogFactory.getLog(ObixMapper.class);
    /**
     * Package containing oBIX objects
     */
    private static final String OBIX_PACKAGE = "org.eclipse.om2m.commons.obix";
    /**
     * Current instance of the mapper
     */
    private static ObixMapper obixMapper;
    /**
     * JAXB Context of oBIX objects
     */
    private JAXBContext context;

    private ObixMapper() {
        try {
            context = JAXBContext.newInstance(OBIX_PACKAGE, ObixMapper.class.getClassLoader());
        } catch (JAXBException e) {
            LOGGER.error("Error creating the JAXB context for Obix objects", e);
        }
    }

    /**
     * Return the current instance of the oBIX mapper
     *
     * @return current instance of ObixMapper
     */
    public static ObixMapper getInstance() {
        if (obixMapper == null) {
            obixMapper = new ObixMapper();
        }
        return obixMapper;
    }

    protected JAXBContext getJAXBContext() {
        return context;
    }

}
