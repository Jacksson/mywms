/*
 * UserCRUDRemote.java
 *
 * Created on 14. September 2006, 06:53
 *
 * Copyright (c) 2006 LinogistiX GmbH. All rights reserved.
 *
 *<a href="http://www.linogistix.com/">browse for licence information</a>
 *
 */

package de.linogistix.los.crud;

import javax.ejb.Remote;

import org.mywms.model.ClearingItem;
import org.mywms.model.ClearingItemOption;

/**
 * CRUD operations for User entities
 * @see  BusinessObjectCRUDRemote
 * 
 * @author trautm
 *
 */
@Remote
public interface ClearingItemCRUDRemote extends BusinessObjectCRUDRemote<ClearingItem>{

    public void setClearingSolution(ClearingItem ci, ClearingItemOption solution);
}
