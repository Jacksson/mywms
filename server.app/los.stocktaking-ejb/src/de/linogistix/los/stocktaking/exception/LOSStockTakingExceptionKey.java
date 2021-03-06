/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.stocktaking.exception;

public enum LOSStockTakingExceptionKey {
	NO_ACTIVE_STOCKTAKING_ORDER, 
	STOCKTAKING_ORDER_NOT_COUNTED, 
	ERROR_DELETING_EMPTY_UNITLOAD, 
	UNKOWN_CLIENT, UNKOWN_ITEMNUMBER, 
	UNKOWN_LOT, UNKNOWN_LOCATION,
	ERROR_TRANSFER_UNITLOAD,
	STATE_MISMATCH,
	NO_RECORDS,
	ITEM_MISMATCH,
	LOT_MISMATCH,
	LOT_MISSING,
	CLIENT_MISMATCH,
	STOCK_WITH_RESERVATION,
	STOCK_LOCKED,
	LOCATION_LOCKED,
	UNITLOAD_LOCKED,
	SERIAL_AMOUNT_MISMATCH,
	CUSTOM_TEXT, 
	UNKOWN_UNITLOADTYPE, 
	NO_UNITLOADTYPE_SET,
	STOCKTAKING_ORDER_NOT_FOUND,
	NO_PERMISSION,
	CANNOT_DELETE,
	NOT_AUTHORIZED
}
