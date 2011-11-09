/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.tree.events;
import com.google.gwt.event.shared.EventHandler;

public interface NodeContextClickHandler extends EventHandler {
    /**
     * This method is called when a context click occurs on a leaf or folder record.  Note that if you set up a callback for
     * <code>nodeContextClick()</code> and e.g. {@link com.smartgwt.client.widgets.tree.TreeGrid#addLeafContextClickHandler
     * TreeGrid.leafContextClick}, then both will fire (in that order) if a leaf is contextclicked - unless
     * <code>nodeContextClick()</code> returns false, in which case no further contextClick callbacks will be called.
     *
     * @param event the event
     */
    void onNodeContextClick(com.smartgwt.client.widgets.tree.events.NodeContextClickEvent event);
}
