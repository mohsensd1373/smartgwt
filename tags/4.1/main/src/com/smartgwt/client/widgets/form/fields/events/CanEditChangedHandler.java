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
/* sgwtgen */
 
package com.smartgwt.client.widgets.form.fields.events;

import com.google.gwt.event.shared.EventHandler;

public interface CanEditChangedHandler extends EventHandler {
    /**
     * Notification method called when {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is modified.
     * Developers may make use of this to toggle between an editable and a read-only appearance for custom FormItems.
     *
     * @param event the event
     */
    void onCanEditChanged(com.smartgwt.client.widgets.form.fields.events.CanEditChangedEvent event);
}
