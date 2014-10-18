/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.ws.manage_advice;

public enum ManageAdviceErrorCodes {
	UNAUTHORIZED_CALLER, 
	ERROR_UNKNOWN_CLIENT, 
	ERROR_LABELID_NULL, 
	ERROR_UNKNOWN_ADVICE, 
	ERROR_UNKNOWN_UNITLOADTYPE, 
	ERROR_UNKNOWN_ITEMNUMBER, 
	ERROR_NOTIFIEDAMOUNT_NULL, 
	ERROR_NOTIFIEDAMOUNT_NEGATIVE, 
	ERROR_NO_ADVICE_FOR_LABEL, 
	ERROR_DUPLICATE_UNITLOAD_ADVICE, 
	ERROR_NO_ADVICE_WITH_NUMBER, 
	ERROR_INVALID_ADVICE_STATE, 
	ERROR_FINISHING_ADVICE,
	ERROR_CREATION,
	ERROR_ADVICE_FINISHED,
	ERROR_ADVICE_STARTED,
	ERROR_DELETE

}
