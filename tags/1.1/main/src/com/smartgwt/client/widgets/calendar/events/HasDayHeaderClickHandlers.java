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
 
package com.smartgwt.client.widgets.calendar.events;

import com.smartgwt.client.event.*;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public interface HasDayHeaderClickHandlers extends HasHandlers {
    /**
     * Called when the header area of a day in the month view is clicked on.&#010 <P>&#010 By default, moves to the day tab and shows the clicked days events.&#010 Return false to cancel this action.&#010 <P>&#010 Not called if the day falls outside the current month and {@link com.smartgwt.client.widgets.calendar.Calendar#getShowOtherDays showOtherDays} is false.&#010&#010
     *
     * @param handler the dayHeaderClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    HandlerRegistration addDayHeaderClickHandler(DayHeaderClickHandler handler);
}