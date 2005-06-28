/*************************************************************************
 *                                                                       *
 *  EJBCA: The OpenSource Certificate Authority                          *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
 
/*
 * BasicMatch.java
 *
 * Created on den 20 juli 2002, 23:20
 */
package se.anatom.ejbca.util.query;

/**
 * A base class used by Query class to build a query. Inherited by UserMatch, TimeMatch and
 * LogMatch. Main function is getQueryString which is abstract and must be overloaded.
 *
 * @author tomselleck
 * @version $Id: BasicMatch.java,v 1.5 2005-06-28 08:47:35 anatom Exp $
 *
 * @see se.anatom.ejbca.util.query.UserMatch
 * @see se.anatom.ejbca.util.query.TimeMatch
 * @see se.anatom.ejbca.util.query.LogMatch
 */
public abstract class BasicMatch implements java.io.Serializable {
    // Public Constants
    public static final int MATCH_TYPE_EQUALS = 0;
    public static final int MATCH_TYPE_BEGINSWITH = 1;
    public static final int MATCH_TYPE_CONTAINS = 2;

    /**
     * Creates a new instance of BasicMatch
     */
    public BasicMatch() {
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public abstract String getQueryString();

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public abstract boolean isLegalQuery();
}
