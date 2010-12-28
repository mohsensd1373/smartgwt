/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.rpc;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
   /**
    * Encapsulates an RPC response from the server.  Instances of this class are automatically created&#010 and optionally passed to you in the callback you specify as part of your RPCRequest.

    */
public class RPCResponse extends DataClass {

    public static RPCResponse getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        return new RPCResponse(jsObj);
    }


    public RPCResponse(){
        
    }

    public RPCResponse(JavaScriptObject jsObj){
        super(jsObj);
    }

    // ********************* Properties / Attributes ***********************

    /**
     * Status code for this response.  Status codes less than zero are considered errors by the&#010 RPCManager, those greater than or equal to zero are considered successes.  Please see the&#010 error handling section the {@link com.smartgwt.client.rpc.RPCManager} for more information on&#010 what the RPCManager does with the status code and how you can override this behavior.&#010 <P>&#010 When using the SmartGWT server you can set the rpcResponse.status by calling the&#010 server-side method RPCResponse.setStatus().  &#010 <P>&#010 When not using the SmartGWT server, the RPCManager makes no assumptions about the&#010 structure of the response, so the status code just reflects the&#010 {@link com.smartgwt.client.rpc.RPCResponse#getHttpResponseCode httpResponseCode}: status will be &#010 {@link com.smartgwt.client.rpc.RPCResponse#STATUS_TRANSPORT_ERROR} if an HTTP-level error&#010 occurred such as "500 server error".  If you have a status code you need to transmit you can&#010 simply embed it in the response (as part of {@link com.smartgwt.client.rpc.RPCResponse#getData data}) and interpret it from&#010 the callback.&#010 <P>&#010 With or without the SmartGWT server, the {@link com.smartgwt.client.docs.Relogin} status codes (such as &#010 {@link com.smartgwt.client.rpc.RPCResponse#STATUS_LOGIN_REQUIRED}) are triggered whenever special markers, such as the&#010 loginRequiredMarker, appear in the body of the response.  See the {@link com.smartgwt.client.docs.Relogin 'Relogin&#010 Overview'} for details.
     *
     *
     * @return int
     *
     */
    public int getStatus()  {
        return getAttributeAsInt("status");
    }

    /**
     * This attribute (avialable when using the the <code>xmlHttpRequest</code> transport) contains&#010 the HTTP response code sent by the server.&#010 <p>&#010 Note that this is different from {@link com.smartgwt.client.rpc.RPCResponse#getStatus status} - that attribute is used to&#010 indicate a status code for the RPC itself whereas httpResponseCode is the raw HTTP response&#010 code for the HTTP request that contained the RPCRequest.&#010 <p>&#010 This feature relies on the XMLHttpRequest object which can be disabled by end-users in some&#010 supported browsers.  See {@link com.smartgwt.client.docs.PlatformDependencies} for more information.&#010 <p>&#010 If you're using this attribute, you'll typically want to avoid the default error&#010 handling response of RPCManager.  To do so, set&#010 {@link com.smartgwt.client.rpc.RPCRequest#getWillHandleError willHandleError} to <code>true</code>.
     *
     *
     * @return Integer
     *
     */
    public Integer getHttpResponseCode()  {
        return getAttributeAsInt("httpResponseCode");
    }

    /**
     * ID of the transaction sent to the server via {@link com.smartgwt.client.rpc.RPCManager#sendQueue} containing the&#010 {@link com.smartgwt.client.rpc.RPCRequest} associated with this response.
     *
     *
     * @return Integer
     *
     */
    public Integer getTransactionNum()  {
        return getAttributeAsInt("transactionNum");
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************





    public static int STATUS_FAILURE = -1;
    public static int STATUS_LOGIN_INCORRECT = -5;
    public static int STATUS_LOGIN_REQUIRED = -7;
    public static int STATUS_LOGIN_SUCCESS = -8;
    public static int STATUS_MAX_LOGIN_ATTEMPTS_EXCEEDED = -6;
    public static int STATUS_SERVER_TIMEOUT = -100;
    public static int STATUS_SUCCESS = 0;
    public static int STATUS_TRANSPORT_ERROR = -90;
    public static int STATUS_VALIDATION_ERROR = -4;

    /**
     * Status code for this response.  Status codes less than zero are considered errors by the RPCManager, those
     * greater than or equal to zero are considered successes.  Please see the error handling section the {@link
     * com.smartgwt.client.rpc.RPCManager} for more information on what the RPCManager does with the status code and how
     * you can override this behavior. <P> When using the SmartGWT server you can set the rpcResponse.status by
     * calling the server-side method RPCResponse.setStatus().   <P> When not using the SmartGWT server, the
     * RPCManager makes no assumptions about the structure of the response, so the status code just reflects the {@link
     * com.smartgwt.client.rpc.RPCResponse#getHttpResponseCode httpResponseCode}: status will be  {@link
     * com.smartgwt.client.rpc.RPCResponse#STATUS_TRANSPORT_ERROR} if an HTTP-level error occurred such as "500 server
     * error".  If you have a status code you need to transmit you can simply embed it in the response (as part of
     * {@link com.smartgwt.client.rpc.RPCResponse#getData data}) and interpret it from the callback. <P> With or without
     * the SmartGWT server, the Relogin Overview for details.
     *
     * @param status status
     */
    public void setStatus(int status) {
        setAttribute("status", status);
    }

}


