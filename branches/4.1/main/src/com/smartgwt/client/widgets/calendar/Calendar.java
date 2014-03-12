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
 
package com.smartgwt.client.widgets.calendar;


import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.tools.*;
import com.smartgwt.client.bean.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.rte.*;
import com.smartgwt.client.widgets.rte.events.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
import com.smartgwt.logicalstructure.core.*;
import com.smartgwt.logicalstructure.widgets.*;
import com.smartgwt.logicalstructure.widgets.drawing.*;
import com.smartgwt.logicalstructure.widgets.plugins.*;
import com.smartgwt.logicalstructure.widgets.form.*;
import com.smartgwt.logicalstructure.widgets.tile.*;
import com.smartgwt.logicalstructure.widgets.grid.*;
import com.smartgwt.logicalstructure.widgets.chart.*;
import com.smartgwt.logicalstructure.widgets.layout.*;
import com.smartgwt.logicalstructure.widgets.menu.*;
import com.smartgwt.logicalstructure.widgets.rte.*;
import com.smartgwt.logicalstructure.widgets.tab.*;
import com.smartgwt.logicalstructure.widgets.tableview.*;
import com.smartgwt.logicalstructure.widgets.toolbar.*;
import com.smartgwt.logicalstructure.widgets.tree.*;
import com.smartgwt.logicalstructure.widgets.viewer.*;
import com.smartgwt.logicalstructure.widgets.calendar.*;
import com.smartgwt.logicalstructure.widgets.cube.*;
import com.smartgwt.logicalstructure.widgets.tools.*;

/**
 * The Calendar component provides several different ways for a user to view and edit a set of events. Note that the
 * <b>ISC_Calendar.js</b> module must be  loaded to make use of the Calendar class. <P> <b>CalendarEvents</b> <P> Events
 * are represented as ordinary JavaScript Objects (see {@link com.smartgwt.client.widgets.calendar.CalendarEvent}).   The
 * Calendar expects to be able to read and write a basic set of properties  on events: name, startDate, endDate,
 * description, etc, which can be stored  under configurable property names (see eg {@link
 * com.smartgwt.client.widgets.calendar.Calendar#getStartDateField startDateField}). <P> Much like a {@link
 * com.smartgwt.client.widgets.grid.ListGrid} manages it's ListGridRecords, the Calendar can  either be passed an ordinary
 * Array of CalendarEvents or can fetch data from a  DataSource. <P> If the calendar is bound to a DataSource, event
 * changes by user action or by  calling methods will be saved to the DataSource. <P> <b>Navigation</b> <P> The calendar
 * supports a number of views by default: {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day}, {@link
 * com.smartgwt.client.widgets.calendar.Calendar#getWeekView week}, {@link
 * com.smartgwt.client.widgets.calendar.Calendar#getMonthView month} and  {@link
 * com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timeline}.  The user can navigate using back and forward
 * buttons or  via an attached {@link com.smartgwt.client.widgets.calendar.Calendar#getDateChooser DateChooser}. <P>
 * <b>Event Manipulation</b> <P> Events can be created by clicking directly onto one of the views, or via the  {@link
 * com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton Add Event} button.  In the day, week and timeline views,
 * the user may  click and drag to create an event of a specific duration. <P> Creating an event via click or click and
 * drag pops up the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventDialog EventDialog}, which provides a
 * simple form for  quick event entry (for normal events, only the description is required by default - for  events that
 * are shown in a {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lane}, that field is also required). <P> A
 * separate editor called the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventEditor EventEditor} provides  an
 * interface for editing all possible properties of an event, including custom  properties.  The EventEditor is used
 * whenever a pre-existing event is being  edited, and can also be invoked by the user wherever the simpler EventDialog
 * appears. <P> Events can also be programmatically {@link com.smartgwt.client.widgets.calendar.Calendar#addEvent added},
 * {@link com.smartgwt.client.widgets.calendar.Calendar#removeEvent removed}, or {@link
 * com.smartgwt.client.widgets.calendar.Calendar#updateEvent updated}.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("Calendar")
public class Calendar extends Canvas implements DataBoundComponent, com.smartgwt.client.widgets.calendar.events.HasBackgroundClickHandlers, com.smartgwt.client.widgets.calendar.events.HasBackgroundMouseDownHandlers, com.smartgwt.client.widgets.calendar.events.HasCurrentViewChangedHandlers, com.smartgwt.client.widgets.calendar.events.HasDateChangedHandlers, com.smartgwt.client.widgets.calendar.events.HasDayBodyClickHandlers, com.smartgwt.client.widgets.calendar.events.HasDayHeaderClickHandlers, com.smartgwt.client.widgets.calendar.events.HasEventAddedHandlers, com.smartgwt.client.widgets.calendar.events.HasEventChangedHandlers, com.smartgwt.client.widgets.calendar.events.HasEventClickHandlers, com.smartgwt.client.widgets.calendar.events.HasEventMovedHandlers, com.smartgwt.client.widgets.calendar.events.HasEventRemoveClickHandlers, com.smartgwt.client.widgets.calendar.events.HasEventRemovedHandlers, com.smartgwt.client.widgets.calendar.events.HasEventResizedHandlers, com.smartgwt.client.widgets.calendar.events.HasEventHoverHTMLHandlers, com.smartgwt.client.widgets.calendar.events.HasTimelineEventMovedHandlers, com.smartgwt.client.widgets.calendar.events.HasTimelineEventResizedHandlers {

    public static Calendar getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new Calendar(jsObj);
        } else {
            assert refInstance instanceof Calendar;
            return (Calendar)refInstance;
        }
    }


    /**
     * Changes the defaults for Canvas AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults Canvas defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, Canvas defaults) /*-{
        $wnd.isc.Calendar.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
    }-*/;

    /**
     * Changes the defaults for FormItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults FormItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, FormItem defaults) /*-{
        $wnd.isc.Calendar.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public Calendar(){
        checkCalendarLoaded();
				scClassName = "Calendar";
    }

    public Calendar(JavaScriptObject jsObj){
        scClassName = "Calendar";
        setJavaScriptObject(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var scClassName = this.@com.smartgwt.client.widgets.BaseWidget::scClassName;
        var widget = $wnd.isc[scClassName].create(config);
        if ($wnd.isc.keepGlobals) this.@com.smartgwt.client.widgets.BaseWidget::internalSetID(Lcom/google/gwt/core/client/JavaScriptObject;)(widget);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;

    // ********************* Properties / Attributes ***********************

    /**
     * An {@link com.smartgwt.client.widgets.ImgButton} that appears in a Calendar's week/day/month views and offers an 
     * alternative way to create a new {@link com.smartgwt.client.widgets.calendar.CalendarEvent event}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getAddEventButton() throws IllegalStateException {
        errorIfNotCreated("addEventButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("addEventButton"));
    }

    /**
     * The text to be displayed when a user hovers over the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton add event} toolbar button
     *
     * @param addEventButtonHoverText  Default value is "Add an event"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setAddEventButtonHoverText(String addEventButtonHoverText)  throws IllegalStateException {
        setAttribute("addEventButtonHoverText", addEventButtonHoverText, false);
    }

    /**
     * The text to be displayed when a user hovers over the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton add event} toolbar button
     *
     * @return String
     */
    public String getAddEventButtonHoverText()  {
        return getAttributeAsString("addEventButtonHoverText");
    }

    /**
     * When showing a {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView Timeline}, or a {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day view} when  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true, whether to make lane boundaries
     * more obvious by showing alternate lanes in a different color.
     *
     * @param alternateLaneStyles  Default value is null
     */
    public void setAlternateLaneStyles(Boolean alternateLaneStyles) {
        setAttribute("alternateLaneStyles", alternateLaneStyles, true);
    }

    /**
     * When showing a {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView Timeline}, or a {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day view} when  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true, whether to make lane boundaries
     * more obvious by showing alternate lanes in a different color.
     *
     * @return Boolean
     */
    public Boolean getAlternateLaneStyles()  {
        return getAttributeAsBoolean("alternateLaneStyles");
    }

    /**
     * The base name for the CSS class applied to the grid cells of the day and week views of the calendar. This style will
     * have "Dark", "Over", "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @param baseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calendar"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setBaseStyle(String baseStyle) {
        setAttribute("baseStyle", baseStyle, true);
    }

    /**
     * The base name for the CSS class applied to the grid cells of the day and week views of the calendar. This style will
     * have "Dark", "Over", "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getBaseStyle()  {
        return getAttributeAsString("baseStyle");
    }

    /**
     * The title for the cancel button in the event editor
     *
     * @param cancelButtonTitle  Default value is "Cancel"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCancelButtonTitle(String cancelButtonTitle)  throws IllegalStateException {
        setAttribute("cancelButtonTitle", cancelButtonTitle, false);
    }

    /**
     * The title for the cancel button in the event editor
     *
     * @return String
     */
    public String getCancelButtonTitle()  {
        return getAttributeAsString("cancelButtonTitle");
    }

    /**
     * If true, users can create new events.
     *
     * @param canCreateEvents  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCanCreateEvents(Boolean canCreateEvents)  throws IllegalStateException {
        setAttribute("canCreateEvents", canCreateEvents, false);
    }

    /**
     * If true, users can create new events.
     *
     * @return Boolean
     */
    public Boolean getCanCreateEvents()  {
        return getAttributeAsBoolean("canCreateEvents");
    }

    /**
     * If true, users can delete existing events. Defaults to {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getCanEditEvents canEditEvents}.
     *
     * @param canDeleteEvents  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @deprecated in favor of {@link com.smartgwt.client.widgets.calendar.Calendar#getCanRemoveEvents canRemoveEvents}
     */
    public void setCanDeleteEvents(Boolean canDeleteEvents)  throws IllegalStateException {
        setAttribute("canDeleteEvents", canDeleteEvents, false);
    }

    /**
     * If true, users can delete existing events. Defaults to {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getCanEditEvents canEditEvents}.
     *
     * @return Boolean
     * @deprecated in favor of {@link com.smartgwt.client.widgets.calendar.Calendar#getCanRemoveEvents canRemoveEvents}
     */
    public Boolean getCanDeleteEvents()  {
        return getAttributeAsBoolean("canDeleteEvents");
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines dragability.
     *
     * @param canDragEventField  Default value is "canEdit"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setCanDragEventField(String canDragEventField)  throws IllegalStateException {
        setAttribute("canDragEventField", canDragEventField, false);
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines dragability.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getCanDragEventField()  {
        return getAttributeAsString("canDragEventField");
    }

    /**
     * If true, users can drag-reposition existing events.
     *
     * @param canDragEvents  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCanDragEvents(Boolean canDragEvents)  throws IllegalStateException {
        setAttribute("canDragEvents", canDragEvents, false);
    }

    /**
     * If true, users can drag-reposition existing events.
     *
     * @return Boolean
     */
    public Boolean getCanDragEvents()  {
        return getAttributeAsBoolean("canDragEvents");
    }

    /**
     * If true, users can edit existing events.
     *
     * @param canEditEvents  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCanEditEvents(Boolean canEditEvents)  throws IllegalStateException {
        setAttribute("canEditEvents", canEditEvents, false);
    }

    /**
     * If true, users can edit existing events.
     *
     * @return Boolean
     */
    public Boolean getCanEditEvents()  {
        return getAttributeAsBoolean("canEditEvents");
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines editability.
     *
     * @param canEditField  Default value is "canEdit"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setCanEditField(String canEditField)  throws IllegalStateException {
        setAttribute("canEditField", canEditField, false);
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines editability.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getCanEditField()  {
        return getAttributeAsString("canEditField");
    }

    /**
     * Can we edit the lane of the event, specified by the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLaneNameField laneNameField}? If so, the event can be dragged to a
     * different {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lane} and, when it's editor is shown, an
     * additional drop-down widget is provided allowing the user to select a different lane. <P> In either case, the event's
     * {@link com.smartgwt.client.widgets.calendar.Calendar#getLaneNameField laneNameField} is updated automatically. <P> This
     * setting can be overridden on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent#getCanEditLane event}.
     *
     * @param canEditLane  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCanEditLane(Boolean canEditLane)  throws IllegalStateException {
        setAttribute("canEditLane", canEditLane, false);
    }

    /**
     * Can we edit the lane of the event, specified by the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLaneNameField laneNameField}? If so, the event can be dragged to a
     * different {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lane} and, when it's editor is shown, an
     * additional drop-down widget is provided allowing the user to select a different lane. <P> In either case, the event's
     * {@link com.smartgwt.client.widgets.calendar.Calendar#getLaneNameField laneNameField} is updated automatically. <P> This
     * setting can be overridden on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent#getCanEditLane event}.
     *
     * @return Boolean
     */
    public Boolean getCanEditLane()  {
        return getAttributeAsBoolean("canEditLane");
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines whether that event
     * can be  moved between lanes.
     *
     * @param canEditLaneField  Default value is "canEditLane"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setCanEditLaneField(String canEditLaneField)  throws IllegalStateException {
        setAttribute("canEditLaneField", canEditLaneField, false);
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines whether that event
     * can be  moved between lanes.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getCanEditLaneField()  {
        return getAttributeAsString("canEditLaneField");
    }

    /**
     * If true, users can remove existing events. Defaults to {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getCanEditEvents canEditEvents}.
     *
     * @param canRemoveEvents  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCanRemoveEvents(Boolean canRemoveEvents)  throws IllegalStateException {
        setAttribute("canRemoveEvents", canRemoveEvents, false);
    }

    /**
     * If true, users can remove existing events. Defaults to {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getCanEditEvents canEditEvents}.
     *
     * @return Boolean
     */
    public Boolean getCanRemoveEvents()  {
        return getAttributeAsBoolean("canRemoveEvents");
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines whether an event
     * shows a remove button.
     *
     * @param canRemoveField  Default value is "canRemove"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setCanRemoveField(String canRemoveField)  throws IllegalStateException {
        setAttribute("canRemoveField", canRemoveField, false);
    }

    /**
     * Name of the field on each {@link com.smartgwt.client.widgets.calendar.CalendarEvent} that determines whether an event
     * shows a remove button.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getCanRemoveField()  {
        return getAttributeAsString("canRemoveField");
    }

    /**
     * If true, lanes can be reordered by dragging them with the mouse.
     *
     * @param canReorderLanes  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCanReorderLanes(Boolean canReorderLanes)  throws IllegalStateException {
        setAttribute("canReorderLanes", canReorderLanes, false);
    }

    /**
     * If true, lanes can be reordered by dragging them with the mouse.
     *
     * @return Boolean
     */
    public Boolean getCanReorderLanes()  {
        return getAttributeAsBoolean("canReorderLanes");
    }

    /**
     * Can {@link com.smartgwt.client.widgets.calendar.Timeline} events be stretched by their left and right edges?
     *
     * @param canResizeTimelineEvents  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCanResizeTimelineEvents(Boolean canResizeTimelineEvents)  throws IllegalStateException {
        setAttribute("canResizeTimelineEvents", canResizeTimelineEvents, false);
    }

    /**
     * Can {@link com.smartgwt.client.widgets.calendar.Timeline} events be stretched by their left and right edges?
     *
     * @return Boolean
     */
    public Boolean getCanResizeTimelineEvents()  {
        return getAttributeAsBoolean("canResizeTimelineEvents");
    }

    /**
     * The date for which events are displayed in the day, week, and month tabs of  the calendar.  Default is today.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Set the current date for which the calendar will display events.
     *
     * @param chosenDate the new date to set as the current date. Default value is 'Today'
     */
    public void setChosenDate(Date chosenDate) {
        setAttribute("chosenDate", chosenDate, true);
    }

    /**
     * The date for which events are displayed in the day, week, and month tabs of  the calendar.  Default is today.
     *
     * @return Date
     */
    public Date getChosenDate()  {
        return getAttributeAsDate("chosenDate");
    }

    /**
     * When using the Next and Previous arrows to scroll a Timeline, this is the number of columns  of the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} to scroll by.  With the
     * default value of null, the Timeline will scroll by its current length.
     *
     * @param columnsPerPage  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setColumnsPerPage(Integer columnsPerPage)  throws IllegalStateException {
        setAttribute("columnsPerPage", columnsPerPage, false);
    }

    /**
     * When using the Next and Previous arrows to scroll a Timeline, this is the number of columns  of the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} to scroll by.  With the
     * default value of null, the Timeline will scroll by its current length.
     *
     * @return Integer
     */
    public Integer getColumnsPerPage()  {
        return getAttributeAsInt("columnsPerPage");
    }

    /**
     * An {@link com.smartgwt.client.widgets.layout.HLayout HLayout} shown above the Calendar views and displaying a set of
     * controls for interacting with the current view - namely, the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getNextButton next}, {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getPreviousButton previous} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton add} buttons,  the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDateLabel date label} and the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDatePickerButton date-picker} icon.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return HLayout
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public HLayout getControlsBar() throws IllegalStateException {
        errorIfNotCreated("controlsBar");
        return (HLayout)HLayout.getByJSObject(getAttributeAsJavaScriptObject("controlsBar"));
    }

    /**
     * The name of the view that should be visible initially by default.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Sets the currently visible view.
     *
     * @param currentViewName The name of the view that should be made visible.. Default value is null
     */
    public void setCurrentViewName(ViewName currentViewName) {
        setAttribute("currentViewName", currentViewName == null ? null : currentViewName.getValue(), true);
    }

    /**
     * The name of the view that should be visible initially by default.
     *
     * @return Get the name of the visible view.   Returns one of 'day', 'week', 'month' or 'timeline'.
     */
    public ViewName getCurrentViewName()  {
        return EnumUtil.getEnum(ViewName.values(), getAttribute("currentViewName"));
    }

    /**
     * A List of CalendarEvent objects, specifying the data to be used to populate the calendar.   <p> This property will
     * typically not be explicitly specified for databound Calendars, where the data is returned from the server via databound
     * component methods such as {@link com.smartgwt.client.widgets.calendar.Calendar#fetchData Calendar.fetchData}. In this
     * case the data objects will be set to a  {@link com.smartgwt.client.data.ResultSet resultSet} rather than a simple array.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Initialize the data object with the given array. Observes methods of the data object so that when the data changes, the calendar will redraw automatically.
     *
     * @param data data to show in the list. Default value is null
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setData(CalendarEvent[] data) {
        setAttribute("data", data, true);
    }

    /**
     * A List of CalendarEvent objects, specifying the data to be used to populate the calendar.   <p> This property will
     * typically not be explicitly specified for databound Calendars, where the data is returned from the server via databound
     * component methods such as {@link com.smartgwt.client.widgets.calendar.Calendar#fetchData Calendar.fetchData}. In this
     * case the data objects will be set to a  {@link com.smartgwt.client.data.ResultSet resultSet} rather than a simple array.
     *
     * @return CalendarEvent[]
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public CalendarEvent[] getData()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfCalendarEvent(getAttributeAsJavaScriptObject("data"));
    }

    /**
     * How to fetch and manage records retrieve from the server.  See {@link com.smartgwt.client.types.FetchMode}. <P> This
     * setting only applies to the {@link com.smartgwt.client.data.ResultSet} automatically created by calling {@link
     * com.smartgwt.client.widgets.grid.ListGrid#fetchData fetchData()}.  If a pre-existing ResultSet is passed to setData()
     * instead, it's existing setting for {@link com.smartgwt.client.data.ResultSet#getFetchMode fetchMode} applies.
     *
     * @param dataFetchMode  Default value is "paged"
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public void setDataFetchMode(FetchMode dataFetchMode) {
        setAttribute("dataFetchMode", dataFetchMode == null ? null : dataFetchMode.getValue(), true);
    }

    /**
     * How to fetch and manage records retrieve from the server.  See {@link com.smartgwt.client.types.FetchMode}. <P> This
     * setting only applies to the {@link com.smartgwt.client.data.ResultSet} automatically created by calling {@link
     * com.smartgwt.client.widgets.grid.ListGrid#fetchData fetchData()}.  If a pre-existing ResultSet is passed to setData()
     * instead, it's existing setting for {@link com.smartgwt.client.data.ResultSet#getFetchMode fetchMode} applies.
     *
     * @return FetchMode
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public FetchMode getDataFetchMode()  {
        return EnumUtil.getEnum(FetchMode.values(), getAttribute("dataFetchMode"));
    }

    /**
     * {@link com.smartgwt.client.widgets.DateChooser} used to select the date for which events will be displayed.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return DateChooser
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public DateChooser getDateChooser() throws IllegalStateException {
        errorIfNotCreated("dateChooser");
        return (DateChooser)DateChooser.getByJSObject(getAttributeAsJavaScriptObject("dateChooser"));
    }

    /**
     * Indicates the type of controls to use in event-windows.  Valid values are those in the  {@link
     * com.smartgwt.client.types.DateEditingStyle DateEditingStyle} type. <P> If unset, the editing style will be set to the
     * field-type on the DataSource, if there is one. If there's no DataSource, it will be set to "date" if the  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity granularity} is "day" or larger and "time" if
     * granularity  is "minute" or smaller, otherwise "datetime".
     *
     * @param dateEditingStyle  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDateEditingStyle(DateEditingStyle dateEditingStyle)  throws IllegalStateException {
        setAttribute("dateEditingStyle", dateEditingStyle == null ? null : dateEditingStyle.getValue(), false);
    }

    /**
     * Indicates the type of controls to use in event-windows.  Valid values are those in the  {@link
     * com.smartgwt.client.types.DateEditingStyle DateEditingStyle} type. <P> If unset, the editing style will be set to the
     * field-type on the DataSource, if there is one. If there's no DataSource, it will be set to "date" if the  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity granularity} is "day" or larger and "time" if
     * granularity  is "minute" or smaller, otherwise "datetime".
     *
     * @return DateEditingStyle
     */
    public DateEditingStyle getDateEditingStyle()  {
        return EnumUtil.getEnum(DateEditingStyle.values(), getAttribute("dateEditingStyle"));
    }

    /**
     * Date formatter for displaying events. Default is to use the system-wide default short date format, configured via {@link
     * com.smartgwt.client.util.Date#setShortDisplayFormat Date.setShortDisplayFormat}.  Specify any valid {@link
     * com.smartgwt.client.types.DateDisplayFormat}.
     *
     * @param dateFormatter  Default value is null
     */
    public void setDateFormatter(DateDisplayFormat dateFormatter) {
        setAttribute("dateFormatter", dateFormatter == null ? null : dateFormatter.getValue(), true);
    }

    /**
     * Date formatter for displaying events. Default is to use the system-wide default short date format, configured via {@link
     * com.smartgwt.client.util.Date#setShortDisplayFormat Date.setShortDisplayFormat}.  Specify any valid {@link
     * com.smartgwt.client.types.DateDisplayFormat}.
     *
     * @return DateDisplayFormat
     */
    public DateDisplayFormat getDateFormatter()  {
        return EnumUtil.getEnum(DateDisplayFormat.values(), getAttribute("dateFormatter"));
    }

    /**
     * The {@link com.smartgwt.client.types.AutoChild} {@link com.smartgwt.client.widgets.Label} used to display the current
     * date or range above the  selected calendar view.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Label
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Label getDateLabel() throws IllegalStateException {
        errorIfNotCreated("dateLabel");
        return (Label)Label.getByJSObject(getAttributeAsJavaScriptObject("dateLabel"));
    }

    /**
     * An {@link com.smartgwt.client.widgets.ImgButton ImgButton} that appears above the various views of the calendar and
     * offers alternative access to a {@link com.smartgwt.client.widgets.DateChooser} to pick the current day.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getDatePickerButton() throws IllegalStateException {
        errorIfNotCreated("datePickerButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("datePickerButton"));
    }

    /**
     * The text to be displayed when a user hovers over the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDatePickerButton date picker} toolbar button
     *
     * @param datePickerHoverText  Default value is "Choose a date"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDatePickerHoverText(String datePickerHoverText)  throws IllegalStateException {
        setAttribute("datePickerHoverText", datePickerHoverText, false);
    }

    /**
     * The text to be displayed when a user hovers over the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDatePickerButton date picker} toolbar button
     *
     * @return String
     */
    public String getDatePickerHoverText()  {
        return getAttributeAsString("datePickerHoverText");
    }

    /**
     * The base name for the CSS class applied to the day body of the month view of the calendar. This style will have "Dark",
     * "Over", "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @param dayBodyBaseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calMonthDayBody"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setDayBodyBaseStyle(String dayBodyBaseStyle) {
        setAttribute("dayBodyBaseStyle", dayBodyBaseStyle, true);
    }

    /**
     * The base name for the CSS class applied to the day body of the month view of the calendar. This style will have "Dark",
     * "Over", "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getDayBodyBaseStyle()  {
        return getAttributeAsString("dayBodyBaseStyle");
    }

    /**
     * The base name for the CSS class applied to the day headers of the month view. This style will have "Dark", "Over",
     * "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @param dayHeaderBaseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calMonthDayHeader"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setDayHeaderBaseStyle(String dayHeaderBaseStyle) {
        setAttribute("dayHeaderBaseStyle", dayHeaderBaseStyle, true);
    }

    /**
     * The base name for the CSS class applied to the day headers of the month view. This style will have "Dark", "Over",
     * "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getDayHeaderBaseStyle()  {
        return getAttributeAsString("dayHeaderBaseStyle");
    }

    /**
     * {@link com.smartgwt.client.widgets.grid.ListGrid} used to display events that pertain to a given day.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ListGrid
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ListGrid getDayView() throws IllegalStateException {
        errorIfNotCreated("dayView");
        return (ListGrid)ListGrid.getByJSObject(getAttributeAsJavaScriptObject("dayView"));
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day view}.
     *
     * @param dayViewTitle  Default value is "Day"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDayViewTitle(String dayViewTitle)  throws IllegalStateException {
        setAttribute("dayViewTitle", dayViewTitle, false);
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day view}.
     *
     * @return String
     */
    public String getDayViewTitle()  {
        return getAttributeAsString("dayViewTitle");
    }

    /**
     * The number of columns of the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity
     * timelineGranularity} to give the timeline by default if no {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getEndDate endDate} is provided.  The  default is 20.
     *
     * @param defaultTimelineColumnSpan  Default value is 20
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDefaultTimelineColumnSpan(int defaultTimelineColumnSpan)  throws IllegalStateException {
        setAttribute("defaultTimelineColumnSpan", defaultTimelineColumnSpan, false);
    }

    /**
     * The number of columns of the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity
     * timelineGranularity} to give the timeline by default if no {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getEndDate endDate} is provided.  The  default is 20.
     *
     * @return int
     */
    public int getDefaultTimelineColumnSpan()  {
        return getAttributeAsInt("defaultTimelineColumnSpan");
    }

    /**
     * The name of the description field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @param descriptionField  Default value is "description"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDescriptionField(String descriptionField)  throws IllegalStateException {
        setAttribute("descriptionField", descriptionField, false);
    }

    /**
     * The name of the description field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @return String
     */
    public String getDescriptionField()  {
        return getAttributeAsString("descriptionField");
    }

    /**
     * The title for the edit button in the quick event dialog
     *
     * @param detailsButtonTitle  Default value is "Edit Details"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDetailsButtonTitle(String detailsButtonTitle)  throws IllegalStateException {
        setAttribute("detailsButtonTitle", detailsButtonTitle, false);
    }

    /**
     * The title for the edit button in the quick event dialog
     *
     * @return String
     */
    public String getDetailsButtonTitle()  {
        return getAttributeAsString("detailsButtonTitle");
    }

    /**
     * If set, weekend days appear in disabled style and events cannot be created on weekends. Which days are considered
     * weekends is controlled by {@link com.smartgwt.client.util.Date#weekendDays weekendDays}.
     *
     * @param disableWeekends  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public void setDisableWeekends(Boolean disableWeekends)  throws IllegalStateException {
        setAttribute("disableWeekends", disableWeekends, false);
    }

    /**
     * If set, weekend days appear in disabled style and events cannot be created on weekends. Which days are considered
     * weekends is controlled by {@link com.smartgwt.client.util.Date#weekendDays weekendDays}.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public Boolean getDisableWeekends()  {
        return getAttributeAsBoolean("disableWeekends");
    }

    /**
     * The end date of the calendar timeline view.  Has no effect in other views. <P> To set different {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getStartDate start} and end dates after initial draw, see {@link
     * com.smartgwt.client.widgets.calendar.Calendar#setTimelineRange setTimelineRange}. <P> Note that this attribute may be
     * automatically altered if showing  {@link com.smartgwt.client.widgets.calendar.Calendar#getHeaderLevels header-levels},
     * to fit to header boundaries.
     *
     * @param endDate  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEndDate(Date endDate)  throws IllegalStateException {
        setAttribute("endDate", endDate, false);
    }

    /**
     * The end date of the calendar timeline view.  Has no effect in other views. <P> To set different {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getStartDate start} and end dates after initial draw, see {@link
     * com.smartgwt.client.widgets.calendar.Calendar#setTimelineRange setTimelineRange}. <P> Note that this attribute may be
     * automatically altered if showing  {@link com.smartgwt.client.widgets.calendar.Calendar#getHeaderLevels header-levels},
     * to fit to header boundaries.
     *
     * @return Date
     */
    public Date getEndDate()  {
        return getAttributeAsDate("endDate");
    }

    /**
     * The name of the end date field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @param endDateField  Default value is "endDate"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setEndDateField(String endDateField)  throws IllegalStateException {
        setAttribute("endDateField", endDateField, false);
    }

    /**
     * The name of the end date field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getEndDateField()  {
        return getAttributeAsString("endDateField");
    }

    /**
     * If set to true, enables the auto-arrangement of events that share time in the calendar.  The default is true.
     *
     * @param eventAutoArrange  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventAutoArrange(Boolean eventAutoArrange)  throws IllegalStateException {
        setAttribute("eventAutoArrange", eventAutoArrange, false);
    }

    /**
     * If set to true, enables the auto-arrangement of events that share time in the calendar.  The default is true.
     *
     * @return Boolean
     */
    public Boolean getEventAutoArrange()  {
        return getAttributeAsBoolean("eventAutoArrange");
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getDescriptionField descriptionField} field in
     * the quick and advanced event dialogs
     *
     * @param eventDescriptionFieldTitle  Default value is "Description"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventDescriptionFieldTitle(String eventDescriptionFieldTitle)  throws IllegalStateException {
        setAttribute("eventDescriptionFieldTitle", eventDescriptionFieldTitle, false);
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getDescriptionField descriptionField} field in
     * the quick and advanced event dialogs
     *
     * @return String
     */
    public String getEventDescriptionFieldTitle()  {
        return getAttributeAsString("eventDescriptionFieldTitle");
    }

    /**
     * An {@link com.smartgwt.client.types.AutoChild} of type {@link com.smartgwt.client.widgets.Window} that displays a quick
     * event entry form in a  popup window.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Window
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Window getEventDialog() throws IllegalStateException {
        errorIfNotCreated("eventDialog");
        return (Window)Window.getByJSObject(getAttributeAsJavaScriptObject("eventDialog"));
    }

    /**
     * The number of pixels to leave to the right of events so overlapping events can still be  added using the mouse.
     *
     * @param eventDragGap  Default value is 10
     */
    public void setEventDragGap(int eventDragGap) {
        setAttribute("eventDragGap", eventDragGap, true);
    }

    /**
     * The number of pixels to leave to the right of events so overlapping events can still be  added using the mouse.
     *
     * @return int
     */
    public int getEventDragGap()  {
        return getAttributeAsInt("eventDragGap");
    }

    /**
     * An {@link com.smartgwt.client.types.AutoChild} of type {@link com.smartgwt.client.widgets.form.DynamicForm} which
     * displays {@link com.smartgwt.client.widgets.calendar.CalendarEvent event data}.  This form is created within the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getEventEditorLayout event editor layout}
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return DynamicForm
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public DynamicForm getEventEditor() throws IllegalStateException {
        errorIfNotCreated("eventEditor");
        return (DynamicForm)DynamicForm.getByJSObject(getAttributeAsJavaScriptObject("eventEditor"));
    }

    /**
     * An {@link com.smartgwt.client.types.AutoChild} of type {@link com.smartgwt.client.widgets.Window} that displays the full
     *  {@link com.smartgwt.client.widgets.calendar.Calendar#getEventEditor event editor}
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Window
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public Window getEventEditorLayout() throws IllegalStateException {
        errorIfNotCreated("eventEditorLayout");
        return (Window)Window.getByJSObject(getAttributeAsJavaScriptObject("eventEditorLayout"));
    }

    /**
     * The title for the end date field in the quick and advanced event dialogs
     *
     * @param eventEndDateFieldTitle  Default value is "To"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventEndDateFieldTitle(String eventEndDateFieldTitle)  throws IllegalStateException {
        setAttribute("eventEndDateFieldTitle", eventEndDateFieldTitle, false);
    }

    /**
     * The title for the end date field in the quick and advanced event dialogs
     *
     * @return String
     */
    public String getEventEndDateFieldTitle()  {
        return getAttributeAsString("eventEndDateFieldTitle");
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getLaneFields laneField} field in the quick and
     * advanced event dialogs
     *
     * @param eventLaneFieldTitle  Default value is "Lane"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventLaneFieldTitle(String eventLaneFieldTitle)  throws IllegalStateException {
        setAttribute("eventLaneFieldTitle", eventLaneFieldTitle, false);
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getLaneFields laneField} field in the quick and
     * advanced event dialogs
     *
     * @return String
     */
    public String getEventLaneFieldTitle()  {
        return getAttributeAsString("eventLaneFieldTitle");
    }

    /**
     * The title for the event name field in the quick and advanced event dialogs
     *
     * @param eventNameFieldTitle  Default value is "Event Name"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventNameFieldTitle(String eventNameFieldTitle)  throws IllegalStateException {
        setAttribute("eventNameFieldTitle", eventNameFieldTitle, false);
    }

    /**
     * The title for the event name field in the quick and advanced event dialogs
     *
     * @return String
     */
    public String getEventNameFieldTitle()  {
        return getAttributeAsString("eventNameFieldTitle");
    }

    /**
     * When {@link com.smartgwt.client.widgets.calendar.Calendar#getEventAutoArrange eventAutoArrange} is true, setting
     * eventOverlap to true causes events that  share timeslots to overlap each other by a percentage of their width, specified
     * by  {@link com.smartgwt.client.widgets.calendar.Calendar#getEventOverlapPercent eventOverlapPercent}.  The default is
     * true.
     *
     * @param eventOverlap  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventOverlap(Boolean eventOverlap)  throws IllegalStateException {
        setAttribute("eventOverlap", eventOverlap, false);
    }

    /**
     * When {@link com.smartgwt.client.widgets.calendar.Calendar#getEventAutoArrange eventAutoArrange} is true, setting
     * eventOverlap to true causes events that  share timeslots to overlap each other by a percentage of their width, specified
     * by  {@link com.smartgwt.client.widgets.calendar.Calendar#getEventOverlapPercent eventOverlapPercent}.  The default is
     * true.
     *
     * @return Boolean
     */
    public Boolean getEventOverlap()  {
        return getAttributeAsBoolean("eventOverlap");
    }

    /**
     * When set to true, events that start at the same time will not overlap each other to prevent  events having their close
     * button hidden.
     *
     * @param eventOverlapIdenticalStartTimes  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventOverlapIdenticalStartTimes(Boolean eventOverlapIdenticalStartTimes)  throws IllegalStateException {
        setAttribute("eventOverlapIdenticalStartTimes", eventOverlapIdenticalStartTimes, false);
    }

    /**
     * When set to true, events that start at the same time will not overlap each other to prevent  events having their close
     * button hidden.
     *
     * @return Boolean
     */
    public Boolean getEventOverlapIdenticalStartTimes()  {
        return getAttributeAsBoolean("eventOverlapIdenticalStartTimes");
    }

    /**
     * The size of the overlap, presented as a percentage of the width of events sharing timeslots.
     *
     * @param eventOverlapPercent  Default value is 10
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventOverlapPercent(int eventOverlapPercent)  throws IllegalStateException {
        setAttribute("eventOverlapPercent", eventOverlapPercent, false);
    }

    /**
     * The size of the overlap, presented as a percentage of the width of events sharing timeslots.
     *
     * @return int
     */
    public int getEventOverlapPercent()  {
        return getAttributeAsInt("eventOverlapPercent");
    }

    /**
     * In {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWeekView week} views, determines the number of vertical  pixels by
     * which an event can be moved or resized when dragging.  The default of 20px means  that snapping occurs to each row
     * border, since the default height of each  {@link com.smartgwt.client.widgets.calendar.Calendar#getRowHeight row} in
     * those views is also 20px. <P> For timelines, this attribute affects the number of horizontal pixels used for
     * drag-snapping. Since the default width for {@link com.smartgwt.client.widgets.calendar.Calendar#getHeaderLevels
     * headerLevels} is 60px, the default eventSnapGap of 20px means that each column is split into 20 minute sections,
     * assuming that the  {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} is
     * "hour".
     *
     * @param eventSnapGap  Default value is 20
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Editing Editing overview and related methods
     */
    public void setEventSnapGap(Integer eventSnapGap)  throws IllegalStateException {
        setAttribute("eventSnapGap", eventSnapGap, false);
    }

    /**
     * In {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWeekView week} views, determines the number of vertical  pixels by
     * which an event can be moved or resized when dragging.  The default of 20px means  that snapping occurs to each row
     * border, since the default height of each  {@link com.smartgwt.client.widgets.calendar.Calendar#getRowHeight row} in
     * those views is also 20px. <P> For timelines, this attribute affects the number of horizontal pixels used for
     * drag-snapping. Since the default width for {@link com.smartgwt.client.widgets.calendar.Calendar#getHeaderLevels
     * headerLevels} is 60px, the default eventSnapGap of 20px means that each column is split into 20 minute sections,
     * assuming that the  {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} is
     * "hour".
     *
     * @return Integer
     * @see com.smartgwt.client.docs.Editing Editing overview and related methods
     */
    public Integer getEventSnapGap()  {
        return getAttributeAsInt("eventSnapGap");
    }

    /**
     * The title for the start date field in the quick and advanced event dialogs
     *
     * @param eventStartDateFieldTitle  Default value is "From"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventStartDateFieldTitle(String eventStartDateFieldTitle)  throws IllegalStateException {
        setAttribute("eventStartDateFieldTitle", eventStartDateFieldTitle, false);
    }

    /**
     * The title for the start date field in the quick and advanced event dialogs
     *
     * @return String
     */
    public String getEventStartDateFieldTitle()  {
        return getAttributeAsString("eventStartDateFieldTitle");
    }

    /**
     * To display events in day and week views, the Calendar creates instance of {@link
     * com.smartgwt.client.widgets.calendar.EventWindow} for each event.  Use the {@link com.smartgwt.client.types.AutoChild}
     * system to customize these windows.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return EventWindow
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public EventWindow getEventWindow() throws IllegalStateException {
        errorIfNotCreated("eventWindow");
        return (EventWindow)EventWindow.getByJSObject(getAttributeAsJavaScriptObject("eventWindow"));
    }

    /**
     * The base name for the CSS class applied to event windows within calendars. This style will have "Header", "HeaderLabel",
     * and "Body" appended to it, according to  which part of the event window is being styled. For example, to style the
     * header, define a css class called 'eventWindowHeader'.
     *
     * @param eventWindowStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "eventWindow"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setEventWindowStyle(String eventWindowStyle) {
        setAttribute("eventWindowStyle", eventWindowStyle, true);
    }

    /**
     * The base name for the CSS class applied to event windows within calendars. This style will have "Header", "HeaderLabel",
     * and "Body" appended to it, according to  which part of the event window is being styled. For example, to style the
     * header, define a css class called 'eventWindowHeader'.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getEventWindowStyle()  {
        return getAttributeAsString("eventWindowStyle");
    }

    /**
     * The name of the field used to override {@link com.smartgwt.client.widgets.calendar.Calendar#getEventWindowStyle
     * eventWindowStyle} for an individual {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.  See {@link
     * com.smartgwt.client.widgets.calendar.CalendarEvent#getEventWindowStyle eventWindowStyle}.
     *
     * @param eventWindowStyleField  Default value is "eventWindowStyle"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setEventWindowStyleField(String eventWindowStyleField)  throws IllegalStateException {
        setAttribute("eventWindowStyleField", eventWindowStyleField, false);
    }

    /**
     * The name of the field used to override {@link com.smartgwt.client.widgets.calendar.Calendar#getEventWindowStyle
     * eventWindowStyle} for an individual {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.  See {@link
     * com.smartgwt.client.widgets.calendar.CalendarEvent#getEventWindowStyle eventWindowStyle}.
     *
     * @return String
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getEventWindowStyleField()  {
        return getAttributeAsString("eventWindowStyleField");
    }

    /**
     * The numeric day (0-6) which the calendar should consider as the first day of the week - if unset, the default is taken
     * from the current locale.
     *
     * @param firstDayOfWeek  Default value is null
     */
    public void setFirstDayOfWeek(Integer firstDayOfWeek) {
        setAttribute("firstDayOfWeek", firstDayOfWeek, true);
    }

    /**
     * The numeric day (0-6) which the calendar should consider as the first day of the week - if unset, the default is taken
     * from the current locale.
     *
     * @return Integer
     */
    public Integer getFirstDayOfWeek()  {
        return getAttributeAsInt("firstDayOfWeek");
    }

    /**
     * Configures the levels of {@link com.smartgwt.client.widgets.calendar.HeaderLevel headers} shown above the event area,
     * and  their time units. <P> Header levels are provided from the top down, so the first header level should be the largest
     *  time unit and the last one the smallest.  The smallest is then used for the actual  field-headers.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * For {@link com.smartgwt.client.widgets.calendar.Timeline}s, configures the levels of {@link com.smartgwt.client.widgets.calendar.HeaderLevel headers} shown above the  event area, and their time units, after initialization.
     *
     * @param headerLevels the array of HeaderLevels to set. Default value is null
     */
    public void setHeaderLevels(HeaderLevel... headerLevels) {
        setAttribute("headerLevels", headerLevels, true);
    }

    /**
     * Configures the levels of {@link com.smartgwt.client.widgets.calendar.HeaderLevel headers} shown above the event area,
     * and  their time units. <P> Header levels are provided from the top down, so the first header level should be the largest
     *  time unit and the last one the smallest.  The smallest is then used for the actual  field-headers.
     *
     * @return HeaderLevel...
     */
    public HeaderLevel[] getHeaderLevels()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfHeaderLevel(getAttributeAsJavaScriptObject("headerLevels"));
    }

    /**
     * The message to display in the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventEditor eventEditor} when the
     * 'To' date is greater than the 'From' date and a save is attempted.
     *
     * @param invalidDateMessage  Default value is "From must be before To"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setInvalidDateMessage(Boolean invalidDateMessage)  throws IllegalStateException {
        setAttribute("invalidDateMessage", invalidDateMessage, false);
    }

    /**
     * The message to display in the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventEditor eventEditor} when the
     * 'To' date is greater than the 'From' date and a save is attempted.
     *
     * @return Boolean
     */
    public Boolean getInvalidDateMessage()  {
        return getAttributeAsBoolean("invalidDateMessage");
    }

    /**
     * Field definitions for the frozen area of the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView
     * timelineView}, which shows data about the timeline {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lanes}.
     * Each field shows one attribute of the objects provided as {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes
     * lanes}.
     *
     * @param laneFields  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setLaneFields(ListGridField... laneFields)  throws IllegalStateException {
        setAttribute("laneFields", laneFields, false);
    }

    /**
     * Field definitions for the frozen area of the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView
     * timelineView}, which shows data about the timeline {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lanes}.
     * Each field shows one attribute of the objects provided as {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes
     * lanes}.
     *
     * @return ListGridField...
     */
    public ListGridField[] getLaneFields()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfListGridField(getAttributeAsJavaScriptObject("laneFields"));
    }

    /**
     * The name of the field which will determine the {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lane} in
     * which this  event will be displayed in {@link com.smartgwt.client.widgets.calendar.Timeline}s and in the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day view}, if  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true.
     *
     * @param laneNameField  Default value is "lane"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setLaneNameField(String laneNameField)  throws IllegalStateException {
        setAttribute("laneNameField", laneNameField, false);
    }

    /**
     * The name of the field which will determine the {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lane} in
     * which this  event will be displayed in {@link com.smartgwt.client.widgets.calendar.Timeline}s and in the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day view}, if  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getLaneNameField()  {
        return getAttributeAsString("laneNameField");
    }

    /**
     * An array of {@link com.smartgwt.client.widgets.calendar.Lane} definitions that represent the rows of the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timelineView}, or the columns of the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView} if {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes lanes} in the current calendar view.  Only has an effect in {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timeline views}, and in {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day views} when  {@link com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true.
     *
     * @param lanes array of lanes to display. Default value is null
     */
    public void setLanes(Lane... lanes) {
        setAttribute("lanes", lanes, true);
    }

    /**
     * An array of {@link com.smartgwt.client.widgets.calendar.Lane} definitions that represent the rows of the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timelineView}, or the columns of the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView} if {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true.
     *
     * @return Lane...
     */
    public Lane[] getLanes()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfLane(getAttributeAsJavaScriptObject("lanes"));
    }

    /**
     * The name of the leading date field for each event.  When this attribute and  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTrailingDateField trailingDateField} are present in the data, a line
     * extends out from the event showing the  extent of the leading and trailing dates - useful for visualizing a pipeline of
     * events  where some can be moved a certain amount without affecting others.
     *
     * @param leadingDateField  Default value is "leadingDate"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setLeadingDateField(String leadingDateField)  throws IllegalStateException {
        setAttribute("leadingDateField", leadingDateField, false);
    }

    /**
     * The name of the leading date field for each event.  When this attribute and  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTrailingDateField trailingDateField} are present in the data, a line
     * extends out from the event showing the  extent of the leading and trailing dates - useful for visualizing a pipeline of
     * events  where some can be moved a certain amount without affecting others.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getLeadingDateField()  {
        return getAttributeAsString("leadingDateField");
    }

    /**
     * {@link com.smartgwt.client.widgets.tab.TabSet} for managing calendar views when multiple views are available (eg, {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getMonthView month}).
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return TabSet
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public TabSet getMainView() throws IllegalStateException {
        errorIfNotCreated("mainView");
        return (TabSet)TabSet.getByJSObject(getAttributeAsJavaScriptObject("mainView"));
    }

    /**
     * In the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view} when {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayHeaders showDayHeaders} is true, this is the minimum height
     * applied to a day cell and its header combined. <P> If <code>showDayHeaders</code> is false, this attribute has no effect
     * - the minimum height  of day cells is either an equal share of the available height, or the rendered height of the
     * cell's HTML content, whichever is greater.  If the latter, a vertical scrollbar is shown.
     *
     * @param minimumDayHeight  Default value is 80
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setMinimumDayHeight(Integer minimumDayHeight) {
        setAttribute("minimumDayHeight", minimumDayHeight, true);
    }

    /**
     * In the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view} when {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayHeaders showDayHeaders} is true, this is the minimum height
     * applied to a day cell and its header combined. <P> If <code>showDayHeaders</code> is false, this attribute has no effect
     * - the minimum height  of day cells is either an equal share of the available height, or the rendered height of the
     * cell's HTML content, whichever is greater.  If the latter, a vertical scrollbar is shown.
     *
     * @return Integer
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Integer getMinimumDayHeight()  {
        return getAttributeAsInt("minimumDayHeight");
    }

    /**
     * When showing {@link com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes vertical lanes} in the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView}, this attribute sets  the minimum width of each column
     * or field.
     *
     * @param minLaneWidth  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setMinLaneWidth(Integer minLaneWidth)  throws IllegalStateException {
        setAttribute("minLaneWidth", minLaneWidth, false);
    }

    /**
     * When showing {@link com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes vertical lanes} in the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView}, this attribute sets  the minimum width of each column
     * or field.
     *
     * @return Integer
     */
    public Integer getMinLaneWidth()  {
        return getAttributeAsInt("minLaneWidth");
    }

    /**
     * {@link com.smartgwt.client.widgets.grid.ListGrid} used to display events that pertain to a given month.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ListGrid
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ListGrid getMonthView() throws IllegalStateException {
        errorIfNotCreated("monthView");
        return (ListGrid)ListGrid.getByJSObject(getAttributeAsJavaScriptObject("monthView"));
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}.
     *
     * @param monthViewTitle  Default value is "Month"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setMonthViewTitle(String monthViewTitle)  throws IllegalStateException {
        setAttribute("monthViewTitle", monthViewTitle, false);
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}.
     *
     * @return String
     */
    public String getMonthViewTitle()  {
        return getAttributeAsString("monthViewTitle");
    }

    /**
     * The name of the name field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @param nameField  Default value is "name"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setNameField(String nameField)  throws IllegalStateException {
        setAttribute("nameField", nameField, false);
    }

    /**
     * The name of the name field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getNameField()  {
        return getAttributeAsString("nameField");
    }

    /**
     * An {@link com.smartgwt.client.widgets.ImgButton} that appears above the week/day/month views of the calendar and allows
     * the user to move the calendar forwards in time.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getNextButton() throws IllegalStateException {
        errorIfNotCreated("nextButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("nextButton"));
    }

    /**
     * The text to be displayed when a user hovers over the {@link com.smartgwt.client.widgets.calendar.Calendar#getNextButton
     * next}  toolbar button
     *
     * @param nextButtonHoverText  Default value is "Next"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setNextButtonHoverText(String nextButtonHoverText)  throws IllegalStateException {
        setAttribute("nextButtonHoverText", nextButtonHoverText, false);
    }

    /**
     * The text to be displayed when a user hovers over the {@link com.smartgwt.client.widgets.calendar.Calendar#getNextButton
     * next}  toolbar button
     *
     * @return String
     */
    public String getNextButtonHoverText()  {
        return getAttributeAsString("nextButtonHoverText");
    }

    /**
     * The CSS style applied to both the header and body of days from other months in the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, when {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowOtherDays showOtherDays} is false.
     *
     * @param otherDayBlankStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calMonthOtherDayBlank"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setOtherDayBlankStyle(String otherDayBlankStyle)  throws IllegalStateException {
        setAttribute("otherDayBlankStyle", otherDayBlankStyle, false);
    }

    /**
     * The CSS style applied to both the header and body of days from other months in the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, when {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowOtherDays showOtherDays} is false.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getOtherDayBlankStyle()  {
        return getAttributeAsString("otherDayBlankStyle");
    }

    /**
     * The base name for the CSS class applied to the day body of the month view of the calendar. This style will have "Dark",
     * "Over", "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @param otherDayBodyBaseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calMonthDayBody"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setOtherDayBodyBaseStyle(String otherDayBodyBaseStyle) {
        setAttribute("otherDayBodyBaseStyle", otherDayBodyBaseStyle, true);
    }

    /**
     * The base name for the CSS class applied to the day body of the month view of the calendar. This style will have "Dark",
     * "Over", "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getOtherDayBodyBaseStyle()  {
        return getAttributeAsString("otherDayBodyBaseStyle");
    }

    /**
     * The base name for the CSS class applied to the day headers of the month view. This style will have "Dark", "Over",
     * "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @param otherDayHeaderBaseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calMonthDayHeader"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setOtherDayHeaderBaseStyle(String otherDayHeaderBaseStyle) {
        setAttribute("otherDayHeaderBaseStyle", otherDayHeaderBaseStyle, true);
    }

    /**
     * The base name for the CSS class applied to the day headers of the month view. This style will have "Dark", "Over",
     * "Selected", or "Disabled" appended to it according to the state of the cell.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getOtherDayHeaderBaseStyle()  {
        return getAttributeAsString("otherDayHeaderBaseStyle");
    }

    /**
     * For {@link com.smartgwt.client.widgets.calendar.Timeline timelines} that allow overlapping events, an array of  {@link
     * com.smartgwt.client.data.SortSpecifier sort-specifiers} that dictate the vertical rendering order of  overlapped events
     * in each {@link com.smartgwt.client.widgets.calendar.Lane lane}. <P> By default, events that share space in a Lane are
     * rendered from top to bottom according to  their {@link com.smartgwt.client.widgets.calendar.Calendar#getStartDateField
     * start-dates} - the earliest in a given lane appears top-most in  that lane. <P> Providing
     * <code>overlapSortSpecifiers</code> allows for the events to be ordered by one or more of the fields stored on the
     * events, or in the underlying {@link com.smartgwt.client.data.DataSource data-source}, if the timeline is databound.
     *
     * @param overlapSortSpecifiers  Default value is null
     */
    public void setOverlapSortSpecifiers(SortSpecifier... overlapSortSpecifiers) {
        setAttribute("overlapSortSpecifiers", overlapSortSpecifiers, true);
    }

    /**
     * For {@link com.smartgwt.client.widgets.calendar.Timeline timelines} that allow overlapping events, an array of  {@link
     * com.smartgwt.client.data.SortSpecifier sort-specifiers} that dictate the vertical rendering order of  overlapped events
     * in each {@link com.smartgwt.client.widgets.calendar.Lane lane}. <P> By default, events that share space in a Lane are
     * rendered from top to bottom according to  their {@link com.smartgwt.client.widgets.calendar.Calendar#getStartDateField
     * start-dates} - the earliest in a given lane appears top-most in  that lane. <P> Providing
     * <code>overlapSortSpecifiers</code> allows for the events to be ordered by one or more of the fields stored on the
     * events, or in the underlying {@link com.smartgwt.client.data.DataSource data-source}, if the timeline is databound.
     *
     * @return SortSpecifier...
     */
    public SortSpecifier[] getOverlapSortSpecifiers()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfSortSpecifier(getAttributeAsJavaScriptObject("overlapSortSpecifiers"));
    }

    /**
     * An {@link com.smartgwt.client.widgets.ImgButton} that appears above the week/day/month views of the calendar and allows
     * the user to move the calendar backwards in time.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ImgButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ImgButton getPreviousButton() throws IllegalStateException {
        errorIfNotCreated("previousButton");
        return (ImgButton)ImgButton.getByJSObject(getAttributeAsJavaScriptObject("previousButton"));
    }

    /**
     * The text to be displayed when a user hovers over the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getPreviousButton previous} toolbar button.
     *
     * @param previousButtonHoverText  Default value is "Previous"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setPreviousButtonHoverText(String previousButtonHoverText)  throws IllegalStateException {
        setAttribute("previousButtonHoverText", previousButtonHoverText, false);
    }

    /**
     * The text to be displayed when a user hovers over the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getPreviousButton previous} toolbar button.
     *
     * @return String
     */
    public String getPreviousButtonHoverText()  {
        return getAttributeAsString("previousButtonHoverText");
    }

    /**
     * The height of time-slots in the calendar.
     *
     * @param rowHeight  Default value is 20
     */
    public void setRowHeight(int rowHeight) {
        setAttribute("rowHeight", rowHeight, true);
    }

    /**
     * The height of time-slots in the calendar.
     *
     * @return int
     */
    public int getRowHeight()  {
        return getAttributeAsInt("rowHeight");
    }

    /**
     * The title for the save button in the quick event dialog and the event editor
     *
     * @param saveButtonTitle  Default value is "Save Event"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSaveButtonTitle(String saveButtonTitle)  throws IllegalStateException {
        setAttribute("saveButtonTitle", saveButtonTitle, false);
    }

    /**
     * The title for the save button in the quick event dialog and the event editor
     *
     * @return String
     */
    public String getSaveButtonTitle()  {
        return getAttributeAsString("saveButtonTitle");
    }

    /**
     * If set, causes the {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart workday hours} to be sized to
     * fill the available space in the day view and week view, and automatically scrolls these views to the start of the
     * workday when the calendar is first displayed and whenever the user switches to a new day or week.
     *
     * @param scrollToWorkday  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setScrollToWorkday(Boolean scrollToWorkday)  throws IllegalStateException {
        setAttribute("scrollToWorkday", scrollToWorkday, false);
    }

    /**
     * If set, causes the {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart workday hours} to be sized to
     * fill the available space in the day view and week view, and automatically scrolls these views to the start of the
     * workday when the calendar is first displayed and whenever the user switches to a new day or week.
     *
     * @return Boolean
     */
    public Boolean getScrollToWorkday()  {
        return getAttributeAsBoolean("scrollToWorkday");
    }

    /**
     * The base name for the CSS class applied to a cell that is selected via a mouse drag.
     *
     * @param selectedCellStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calendarCellSelected"
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setSelectedCellStyle(String selectedCellStyle) {
        setAttribute("selectedCellStyle", selectedCellStyle, true);
    }

    /**
     * The base name for the CSS class applied to a cell that is selected via a mouse drag.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getSelectedCellStyle()  {
        return getAttributeAsString("selectedCellStyle");
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton Add Event} button.
     *
     * @param showAddEventButton  Default value is null
     */
    public void setShowAddEventButton(Boolean showAddEventButton) {
        setAttribute("showAddEventButton", showAddEventButton, true);
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton Add Event} button.
     *
     * @return Boolean
     */
    public Boolean getShowAddEventButton()  {
        return getAttributeAsBoolean("showAddEventButton");
    }

    /**
     * If false the controls bar at the top of the calendar will not be displayed - this means  that the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getControlsBar controlsBar} will be hidden, so the autoChildren ({@link
     * com.smartgwt.client.widgets.calendar.Calendar#getPreviousButton previousButton},  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDateLabel dateLabel}, {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getNextButton nextButton}, {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton addEventButton}, and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDatePickerButton datePickerButton})  will not be created or shown.
     *
     * @param showControlsBar  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowControlsBar(Boolean showControlsBar)  throws IllegalStateException {
        setAttribute("showControlsBar", showControlsBar, false);
    }

    /**
     * If false the controls bar at the top of the calendar will not be displayed - this means  that the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getControlsBar controlsBar} will be hidden, so the autoChildren ({@link
     * com.smartgwt.client.widgets.calendar.Calendar#getPreviousButton previousButton},  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDateLabel dateLabel}, {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getNextButton nextButton}, {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getAddEventButton addEventButton}, and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDatePickerButton datePickerButton})  will not be created or shown.
     *
     * @return Boolean
     */
    public Boolean getShowControlsBar()  {
        return getAttributeAsBoolean("showControlsBar");
    }

    /**
     * Determines whether the {@link com.smartgwt.client.widgets.calendar.Calendar#getDateChooser dateChooser} is displayed.
     *
     * @param showDateChooser  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public void setShowDateChooser(Boolean showDateChooser)  throws IllegalStateException {
        setAttribute("showDateChooser", showDateChooser, false);
    }

    /**
     * Determines whether the {@link com.smartgwt.client.widgets.calendar.Calendar#getDateChooser dateChooser} is displayed.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public Boolean getShowDateChooser()  {
        return getAttributeAsBoolean("showDateChooser");
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getDatePickerButton datePickerButton} that
     * allows selecting a new base date for  this Calendar.
     *
     * @param showDatePickerButton  Default value is null
     */
    public void setShowDatePickerButton(Boolean showDatePickerButton) {
        setAttribute("showDatePickerButton", showDatePickerButton, true);
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getDatePickerButton datePickerButton} that
     * allows selecting a new base date for  this Calendar.
     *
     * @return Boolean
     */
    public Boolean getShowDatePickerButton()  {
        return getAttributeAsBoolean("showDatePickerButton");
    }

    /**
     * If true, the default, show a header cell for each day cell in the  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, with both cells having a minimum combined height
     * of  {@link com.smartgwt.client.widgets.calendar.Calendar#getMinimumDayHeight minimumDayHeight}.  If false, the header
     * cells will not be shown, and the value  of {@link com.smartgwt.client.widgets.calendar.Calendar#getMinimumDayHeight
     * minimumDayHeight} is ignored.  This causes the available vertical space in month views to be shared equally between day
     * cells, such that no vertical scrollbar is required unless the HTML in the cells renders them taller than will fit.
     *
     * @param showDayHeaders  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public void setShowDayHeaders(Boolean showDayHeaders)  throws IllegalStateException {
        setAttribute("showDayHeaders", showDayHeaders, false);
    }

    /**
     * If true, the default, show a header cell for each day cell in the  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, with both cells having a minimum combined height
     * of  {@link com.smartgwt.client.widgets.calendar.Calendar#getMinimumDayHeight minimumDayHeight}.  If false, the header
     * cells will not be shown, and the value  of {@link com.smartgwt.client.widgets.calendar.Calendar#getMinimumDayHeight
     * minimumDayHeight} is ignored.  This causes the available vertical space in month views to be shared equally between day
     * cells, such that no vertical scrollbar is required unless the HTML in the cells renders them taller than will fit.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public Boolean getShowDayHeaders()  {
        return getAttributeAsBoolean("showDayHeaders");
    }

    /**
     * If set to true, the {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day view} uses {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLanes lanes} to render multiple vertical "lanes" within the day, very
     * much like a vertical {@link com.smartgwt.client.widgets.calendar.Timeline}. <P> Day lanes are useful for showing events
     * for various entities on the same day - agendas for  various staff members, for example, or delivery schedules for a
     * fleet of trucks. <P> Each day lane is self-contained, showing in a column with a header and individual events  are
     * placed in {@link com.smartgwt.client.widgets.calendar.CalendarEvent#getLane appropriate lanes}, respecting padding and 
     * overlapping.  If {@link com.smartgwt.client.widgets.calendar.Calendar#getCanEditEvents canEditEvents} is true, events
     * can be drag-moved or drag-resized  from their top and bottom edges, within the containing lane.  To allow events to be
     * dragged  from one lane into another, see {@link com.smartgwt.client.widgets.calendar.Calendar#getCanEditLane
     * canEditLane}.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Changes the {@link com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes view mode} of the day view at runtime - whether to show a normal day column for the {@link com.smartgwt.client.widgets.calendar.Calendar#getChosenDate chosenDate}, or the specified set of  {@link com.smartgwt.client.widgets.calendar.Calendar#getLanes vertical lanes}.
     *
     * @param showDayLanes whether or not to show lanes in the day view. Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowDayLanes(Boolean showDayLanes)  throws IllegalStateException {
        setAttribute("showDayLanes", showDayLanes, false);
    }

    /**
     * If set to true, the {@link com.smartgwt.client.widgets.calendar.Calendar#getDayView day view} uses {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLanes lanes} to render multiple vertical "lanes" within the day, very
     * much like a vertical {@link com.smartgwt.client.widgets.calendar.Timeline}. <P> Day lanes are useful for showing events
     * for various entities on the same day - agendas for  various staff members, for example, or delivery schedules for a
     * fleet of trucks. <P> Each day lane is self-contained, showing in a column with a header and individual events  are
     * placed in {@link com.smartgwt.client.widgets.calendar.CalendarEvent#getLane appropriate lanes}, respecting padding and 
     * overlapping.  If {@link com.smartgwt.client.widgets.calendar.Calendar#getCanEditEvents canEditEvents} is true, events
     * can be drag-moved or drag-resized  from their top and bottom edges, within the containing lane.  To allow events to be
     * dragged  from one lane into another, see {@link com.smartgwt.client.widgets.calendar.Calendar#getCanEditLane
     * canEditLane}.
     *
     * @return Boolean
     */
    public Boolean getShowDayLanes()  {
        return getAttributeAsBoolean("showDayLanes");
    }

    /**
     * Whether to show fields marked <code>detail:true</code> when a DataBoundComponent is  given a DataSource but no
     * <code>component.fields</code>. <p> The <code>detail</code> property is used on DataSource fields to mark fields that 
     * shouldn't appear by default in a view that tries to show many records in a small space.
     *
     * @param showDetailFields  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public void setShowDetailFields(Boolean showDetailFields)  throws IllegalStateException {
        setAttribute("showDetailFields", showDetailFields, false);
    }

    /**
     * Whether to show fields marked <code>detail:true</code> when a DataBoundComponent is  given a DataSource but no
     * <code>component.fields</code>. <p> The <code>detail</code> property is used on DataSource fields to mark fields that 
     * shouldn't appear by default in a view that tries to show many records in a small space.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public Boolean getShowDetailFields()  {
        return getAttributeAsBoolean("showDetailFields");
    }

    /**
     * If false, the event header will take up the entire space of the event. This is useful when you want to be able to drag
     * reposition by the entire event and not just the header.
     *
     * @param showEventDescriptions  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowEventDescriptions(Boolean showEventDescriptions)  throws IllegalStateException {
        setAttribute("showEventDescriptions", showEventDescriptions, false);
    }

    /**
     * If false, the event header will take up the entire space of the event. This is useful when you want to be able to drag
     * reposition by the entire event and not just the header.
     *
     * @return Boolean
     */
    public Boolean getShowEventDescriptions()  {
        return getAttributeAsBoolean("showEventDescriptions");
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getNextButton Next} button.
     *
     * @param showNextButton  Default value is null
     */
    public void setShowNextButton(Boolean showNextButton) {
        setAttribute("showNextButton", showNextButton, true);
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getNextButton Next} button.
     *
     * @return Boolean
     */
    public Boolean getShowNextButton()  {
        return getAttributeAsBoolean("showNextButton");
    }

    /**
     * If set to true, in the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, days that fall in
     * an adjacent month are still shown with a header and body area, and are interactive.  Otherwise days from other  months
     * are rendered in the {@link com.smartgwt.client.widgets.calendar.Calendar#getOtherDayBlankStyle otherDayBlankStyle} and
     * are non-interactive.
     *
     * @param showOtherDays  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public void setShowOtherDays(Boolean showOtherDays)  throws IllegalStateException {
        setAttribute("showOtherDays", showOtherDays, false);
    }

    /**
     * If set to true, in the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, days that fall in
     * an adjacent month are still shown with a header and body area, and are interactive.  Otherwise days from other  months
     * are rendered in the {@link com.smartgwt.client.widgets.calendar.Calendar#getOtherDayBlankStyle otherDayBlankStyle} and
     * are non-interactive.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public Boolean getShowOtherDays()  {
        return getAttributeAsBoolean("showOtherDays");
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getPreviousButton Previous} button.
     *
     * @param showPreviousButton  Default value is null
     */
    public void setShowPreviousButton(Boolean showPreviousButton) {
        setAttribute("showPreviousButton", showPreviousButton, true);
    }

    /**
     * Set to false to hide the {@link com.smartgwt.client.widgets.calendar.Calendar#getPreviousButton Previous} button.
     *
     * @return Boolean
     */
    public Boolean getShowPreviousButton()  {
        return getAttributeAsBoolean("showPreviousButton");
    }

    /**
     * Determines whether the quick event dialog is displayed when a time is clicked. If this is false, the full event editor
     * is displayed.
     *
     * @param showQuickEventDialog  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Editing Editing overview and related methods
     */
    public void setShowQuickEventDialog(Boolean showQuickEventDialog)  throws IllegalStateException {
        setAttribute("showQuickEventDialog", showQuickEventDialog, false);
    }

    /**
     * Determines whether the quick event dialog is displayed when a time is clicked. If this is false, the full event editor
     * is displayed.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Editing Editing overview and related methods
     */
    public Boolean getShowQuickEventDialog()  {
        return getAttributeAsBoolean("showQuickEventDialog");
    }

    /**
     * If set to true, show the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView Timeline view}.
     *
     * @param showTimelineView  Default value is false
     */
    public void setShowTimelineView(Boolean showTimelineView) {
        setAttribute("showTimelineView", showTimelineView, true);
    }

    /**
     * If set to true, show the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView Timeline view}.
     *
     * @return Boolean
     */
    public Boolean getShowTimelineView()  {
        return getAttributeAsBoolean("showTimelineView");
    }

    /**
     * Suppresses the display of weekend days in the week and month views, and disallows the creation of events on weekends. 
     * Which days are considered weekends is controlled by {@link com.smartgwt.client.util.Date#weekendDays weekendDays}.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Setter for {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWeekends showWeekends} to change this property at runtime.
     *
     * @param showWeekends  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public void setShowWeekends(Boolean showWeekends)  throws IllegalStateException {
        setAttribute("showWeekends", showWeekends, false);
    }

    /**
     * Suppresses the display of weekend days in the week and month views, and disallows the creation of events on weekends. 
     * Which days are considered weekends is controlled by {@link com.smartgwt.client.util.Date#weekendDays weekendDays}.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Visibility Visibility overview and related methods
     */
    public Boolean getShowWeekends()  {
        return getAttributeAsBoolean("showWeekends");
    }

    /**
     * If set, causes the calendar to use {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayBaseStyle
     * workdayBaseStyle} for cells falling within the workday as defined by {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart workdayStart} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd workdayEnd}, in both the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWeekView weekView} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView}. <P> The hours of the workday can be customized for
     * particular dates by providing implementations of {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart
     * Calendar.getWorkdayStart} and {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd
     * Calendar.getWorkdayEnd}.
     *
     * @param showWorkday  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowWorkday(Boolean showWorkday)  throws IllegalStateException {
        setAttribute("showWorkday", showWorkday, false);
    }

    /**
     * If set, causes the calendar to use {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayBaseStyle
     * workdayBaseStyle} for cells falling within the workday as defined by {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart workdayStart} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd workdayEnd}, in both the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWeekView weekView} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView}. <P> The hours of the workday can be customized for
     * particular dates by providing implementations of {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart
     * Calendar.getWorkdayStart} and {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd
     * Calendar.getWorkdayEnd}.
     *
     * @return Boolean
     */
    public Boolean getShowWorkday()  {
        return getAttributeAsBoolean("showWorkday");
    }

    /**
     * If true, events will be sized to the grid, even if they start and/or end at times between grid cells.
     *
     * @param sizeEventsToGrid  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSizeEventsToGrid(Boolean sizeEventsToGrid)  throws IllegalStateException {
        setAttribute("sizeEventsToGrid", sizeEventsToGrid, false);
    }

    /**
     * If true, events will be sized to the grid, even if they start and/or end at times between grid cells.
     *
     * @return Boolean
     */
    public Boolean getSizeEventsToGrid()  {
        return getAttributeAsBoolean("sizeEventsToGrid");
    }

    /**
     * The start date of the calendar {@link com.smartgwt.client.widgets.calendar.Timeline timeline view}.  Has no effect in 
     * other views.  If not specified, defaults to a timeline starting from the beginning  of the current {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} and spanning {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDefaultTimelineColumnSpan a default of 20} columns of that granularity.
     * <P> To set different start and {@link com.smartgwt.client.widgets.calendar.Calendar#getEndDate end} dates after initial
     * draw, see {@link com.smartgwt.client.widgets.calendar.Calendar#setTimelineRange setTimelineRange}. <P> Note that this
     * attribute may be automatically altered if showing  {@link com.smartgwt.client.widgets.calendar.Calendar#getHeaderLevels
     * header-levels}, to fit to header boundaries.
     *
     * @param startDate  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setStartDate(Date startDate)  throws IllegalStateException {
        setAttribute("startDate", startDate, false);
    }

    /**
     * The start date of the calendar {@link com.smartgwt.client.widgets.calendar.Timeline timeline view}.  Has no effect in 
     * other views.  If not specified, defaults to a timeline starting from the beginning  of the current {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} and spanning {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDefaultTimelineColumnSpan a default of 20} columns of that granularity.
     * <P> To set different start and {@link com.smartgwt.client.widgets.calendar.Calendar#getEndDate end} dates after initial
     * draw, see {@link com.smartgwt.client.widgets.calendar.Calendar#setTimelineRange setTimelineRange}. <P> Note that this
     * attribute may be automatically altered if showing  {@link com.smartgwt.client.widgets.calendar.Calendar#getHeaderLevels
     * header-levels}, to fit to header boundaries.
     *
     * @return Date
     */
    public Date getStartDate()  {
        return getAttributeAsDate("startDate");
    }

    /**
     * The name of the start date field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @param startDateField  Default value is "startDate"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setStartDateField(String startDateField)  throws IllegalStateException {
        setAttribute("startDateField", startDateField, false);
    }

    /**
     * The name of the start date field in a {@link com.smartgwt.client.widgets.calendar.CalendarEvent}.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getStartDateField()  {
        return getAttributeAsString("startDateField");
    }

    /**
     * The granularity with which the timelineView will display events.  Possible values are those available in the built-in
     * {@link com.smartgwt.client.types.TimeUnit TimeUnit} type.
     *
     * @param timelineGranularity  Default value is "day"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTimelineGranularity(TimeUnit timelineGranularity)  throws IllegalStateException {
        setAttribute("timelineGranularity", timelineGranularity == null ? null : timelineGranularity.getValue(), false);
    }

    /**
     * The granularity with which the timelineView will display events.  Possible values are those available in the built-in
     * {@link com.smartgwt.client.types.TimeUnit TimeUnit} type.
     *
     * @return TimeUnit
     */
    public TimeUnit getTimelineGranularity()  {
        return EnumUtil.getEnum(TimeUnit.values(), getAttribute("timelineGranularity"));
    }

    /**
     * How many units of {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} each
     * cell represents.
     *
     * @param timelineUnitsPerColumn  Default value is 1
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTimelineUnitsPerColumn(int timelineUnitsPerColumn)  throws IllegalStateException {
        setAttribute("timelineUnitsPerColumn", timelineUnitsPerColumn, false);
    }

    /**
     * How many units of {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity timelineGranularity} each
     * cell represents.
     *
     * @return int
     */
    public int getTimelineUnitsPerColumn()  {
        return getAttributeAsInt("timelineUnitsPerColumn");
    }

    /**
     * {@link com.smartgwt.client.widgets.grid.ListGrid} used to display events in lanes in a horizontal {@link
     * com.smartgwt.client.widgets.calendar.Timeline} view.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ListGrid
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ListGrid getTimelineView() throws IllegalStateException {
        errorIfNotCreated("timelineView");
        return (ListGrid)ListGrid.getByJSObject(getAttributeAsJavaScriptObject("timelineView"));
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timeline view}.
     *
     * @param timelineViewTitle  Default value is "Timeline"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTimelineViewTitle(String timelineViewTitle)  throws IllegalStateException {
        setAttribute("timelineViewTitle", timelineViewTitle, false);
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timeline view}.
     *
     * @return String
     */
    public String getTimelineViewTitle()  {
        return getAttributeAsString("timelineViewTitle");
    }

    /**
     * The background color for today in the Month view, or in the Timeline view when  +{timelineGranularity} is "day".
     *
     * @param todayBackgroundColor  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTodayBackgroundColor(String todayBackgroundColor)  throws IllegalStateException {
        setAttribute("todayBackgroundColor", todayBackgroundColor, false);
    }

    /**
     * The background color for today in the Month view, or in the Timeline view when  +{timelineGranularity} is "day".
     *
     * @return String
     */
    public String getTodayBackgroundColor()  {
        return getAttributeAsString("todayBackgroundColor");
    }

    /**
     * The name of the trailing date field for each event.  When this attribute and  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLeadingDateField leadingDateField} are present in the data, a line
     * extends out from the event showing  the extent of the leading and trailing dates - useful for visualizing a pipeline of
     * events  where some can be moved a certain amount without affecting others.
     *
     * @param trailingDateField  Default value is "trailingDate"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public void setTrailingDateField(String trailingDateField)  throws IllegalStateException {
        setAttribute("trailingDateField", trailingDateField, false);
    }

    /**
     * The name of the trailing date field for each event.  When this attribute and  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLeadingDateField leadingDateField} are present in the data, a line
     * extends out from the event showing  the extent of the leading and trailing dates - useful for visualizing a pipeline of
     * events  where some can be moved a certain amount without affecting others.
     *
     * @return String
     * @see com.smartgwt.client.widgets.calendar.CalendarEvent
     */
    public String getTrailingDateField()  {
        return getAttributeAsString("trailingDateField");
    }

    /**
     * Augments the width of week event windows slightly to avoid duplicate adjacent borders between events.
     *
     * @param weekEventBorderOverlap  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setWeekEventBorderOverlap(Boolean weekEventBorderOverlap)  throws IllegalStateException {
        setAttribute("weekEventBorderOverlap", weekEventBorderOverlap, false);
    }

    /**
     * Augments the width of week event windows slightly to avoid duplicate adjacent borders between events.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getWeekEventBorderOverlap()  {
        return getAttributeAsBoolean("weekEventBorderOverlap");
    }

    /**
     * The text to appear before the week number in the title of {@link com.smartgwt.client.types.TimeUnit week-based}  {@link
     * com.smartgwt.client.widgets.calendar.HeaderLevel}s when this calendar is showing a timeline.
     *
     * @param weekPrefix  Default value is "Week"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setWeekPrefix(String weekPrefix)  throws IllegalStateException {
        setAttribute("weekPrefix", weekPrefix, false);
    }

    /**
     * The text to appear before the week number in the title of {@link com.smartgwt.client.types.TimeUnit week-based}  {@link
     * com.smartgwt.client.widgets.calendar.HeaderLevel}s when this calendar is showing a timeline.
     *
     * @return String
     */
    public String getWeekPrefix()  {
        return getAttributeAsString("weekPrefix");
    }

    /**
     * {@link com.smartgwt.client.widgets.grid.ListGrid} used to display events that pertain to a given week.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ListGrid
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public ListGrid getWeekView() throws IllegalStateException {
        errorIfNotCreated("weekView");
        return (ListGrid)ListGrid.getByJSObject(getAttributeAsJavaScriptObject("weekView"));
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getWeekView week view}.
     *
     * @param weekViewTitle  Default value is "Week"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setWeekViewTitle(String weekViewTitle)  throws IllegalStateException {
        setAttribute("weekViewTitle", weekViewTitle, false);
    }

    /**
     * The title for the {@link com.smartgwt.client.widgets.calendar.Calendar#getWeekView week view}.
     *
     * @return String
     */
    public String getWeekViewTitle()  {
        return getAttributeAsString("weekViewTitle");
    }

    /**
     * If {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWorkday showWorkday} is set, this is the style used for
     * cells that are within the workday,  as defined by {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart
     * workdayStart} and {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd workdayEnd}, or by a date-specific
     * range  provided in {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart Calendar.getWorkdayStart} and
     * {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd Calendar.getWorkdayEnd} implementations.
     *
     * @param workdayBaseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "calendarWorkday"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setWorkdayBaseStyle(String workdayBaseStyle)  throws IllegalStateException {
        setAttribute("workdayBaseStyle", workdayBaseStyle, false);
    }

    /**
     * If {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWorkday showWorkday} is set, this is the style used for
     * cells that are within the workday,  as defined by {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart
     * workdayStart} and {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd workdayEnd}, or by a date-specific
     * range  provided in {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart Calendar.getWorkdayStart} and
     * {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd Calendar.getWorkdayEnd} implementations.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getWorkdayBaseStyle()  {
        return getAttributeAsString("workdayBaseStyle");
    }

    // ********************* Methods ***********************

	/**
     * Adds a new {@link com.smartgwt.client.widgets.calendar.Lane} to the calendar {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timelineView}, or to the  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView} if {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} is true.
     * @param lane a new Lane object to add to the view
     */
    public native void addLane(Lane lane) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addLane(lane.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;


	/**
     * For {@link com.smartgwt.client.widgets.calendar.Timeline}s, and for {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView}s with {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} set, create a new  event and adds it to a
     * particular {@link com.smartgwt.client.widgets.calendar.Lane}.
     * @param laneName the Lane in which to add this event
     * @param startDate start date of event, or CalendarEvent Object
     */
    public native void addLaneEvent(Lane laneName, Date startDate) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addLaneEvent(laneName.@com.smartgwt.client.core.DataClass::getJsObj()(), @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(startDate));
    }-*/;

    /**
     * @see {@link Calendar#addLaneEvent()}
     */
    public void addLaneEvent(Lane laneName, Date startDate, Date endDate){
        addLaneEvent(laneName, startDate, endDate, null, null, null);
    }

    /**
     * @see {@link Calendar#addLaneEvent()}
     */
    public void addLaneEvent(Lane laneName, Date startDate, Date endDate, String name){
        addLaneEvent(laneName, startDate, endDate, name, null, null);
    }

    /**
     * @see {@link Calendar#addLaneEvent()}
     */
    public void addLaneEvent(Lane laneName, Date startDate, Date endDate, String name, String description){
        addLaneEvent(laneName, startDate, endDate, name, description, null);
    }

	/**
     * For {@link com.smartgwt.client.widgets.calendar.Timeline}s, and for {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView dayView}s with {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowDayLanes showDayLanes} set, create a new  event and adds it to a
     * particular {@link com.smartgwt.client.widgets.calendar.Lane}.
     * @param laneName the Lane in which to add this event
     * @param startDate start date of event, or CalendarEvent Object
     * @param endDate end date of event
     * @param name name of event
     * @param description description of event
     * @param otherFields new values of additional fields to be updated
     */
    public native void addLaneEvent(Lane laneName, Date startDate, Date endDate, String name, String description, Object otherFields) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addLaneEvent(laneName.@com.smartgwt.client.core.DataClass::getJsObj()(), @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(startDate), @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(endDate), name, description, otherFields);
    }-*/;

    /**
     * Add a backgroundClick handler.
     * <p>
     * Callback fired when the mouse is clicked in a background-cell, ie, one without an  event.
     *
     * @param handler the backgroundClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addBackgroundClickHandler(com.smartgwt.client.widgets.calendar.events.BackgroundClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.BackgroundClickEvent.getType()) == 0) setupBackgroundClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.BackgroundClickEvent.getType());
    }

    private native void setupBackgroundClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var backgroundClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.BackgroundClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({backgroundClick: 
                function () {
                    var param = {"startDate" : arguments[0], "endDate" : arguments[1]};
                    return backgroundClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.backgroundClick = 
                function () {
                    var param = {"startDate" : arguments[0], "endDate" : arguments[1]};
                    return backgroundClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a backgroundMouseDown handler.
     * <p>
     * Callback fired when the mouse button is depressed over a background-cell, ie, one  without an event.  Call {@link
     * com.smartgwt.client.widgets.calendar.events.BackgroundMouseDownEvent#cancel()} from within {@link
     * com.smartgwt.client.widgets.calendar.events.BackgroundMouseDownHandler#onBackgroundMouseDown} to cancel the default
     * behavior of allowing sweep selection via dragging.
     *
     * @param handler the backgroundMouseDown handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addBackgroundMouseDownHandler(com.smartgwt.client.widgets.calendar.events.BackgroundMouseDownHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.BackgroundMouseDownEvent.getType()) == 0) setupBackgroundMouseDownEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.BackgroundMouseDownEvent.getType());
    }

    private native void setupBackgroundMouseDownEvent() /*-{
        var obj = null;
        var selfJ = this;
        var backgroundMouseDown = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.BackgroundMouseDownEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({backgroundMouseDown: 
                function () {
                    var param = {"startDate" : arguments[0]};
                    return backgroundMouseDown(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.backgroundMouseDown = 
                function () {
                    var param = {"startDate" : arguments[0]};
                    return backgroundMouseDown(param) == true;
                }
            ;
        }
   }-*/;

	/**
     * Notification method fired when the mouse button is released over a background-cell, ie,  one without an event.  Return
     * false to cancel the default behavior of showing a dialog to add a new event with the passed dates.
     * @param startDate the datetime of the slot where the mouse button was depressed
     * @param endDate the datetime of the slot where the mouse button was released
     *
     * @return return false to suppress default behavior of showing a dialog                      to add a new event with the passed
     * dates.
     */
    public native boolean backgroundMouseUp(Date startDate, Date endDate) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.backgroundMouseUp(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(startDate), @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(endDate));
        return ret;
    }-*/;

    /**
     * Add a currentViewChanged handler.
     * <p>
     * Notification that fires whenever the current view changes via the  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getMainView mainView tabset}.
     *
     * @param handler the currentViewChanged handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addCurrentViewChangedHandler(com.smartgwt.client.widgets.calendar.events.CurrentViewChangedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CurrentViewChangedEvent.getType()) == 0) setupCurrentViewChangedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CurrentViewChangedEvent.getType());
    }

    private native void setupCurrentViewChangedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var currentViewChanged = $entry(function(){
            var param = {"viewName" : arguments[0]};

                var event = @com.smartgwt.client.widgets.calendar.events.CurrentViewChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({currentViewChanged:  currentViewChanged              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.currentViewChanged =  currentViewChanged             ;
        }
   }-*/;
    /**
     * Add a dateChanged handler.
     * <p>
     * Fires whenever the user changes the current date, including picking a specific date or navigating to a new week or
     * month.
     *
     * @param handler the dateChanged handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDateChangedHandler(com.smartgwt.client.widgets.calendar.events.DateChangedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.DateChangedEvent.getType()) == 0) setupDateChangedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.DateChangedEvent.getType());
    }

    private native void setupDateChangedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var dateChanged = $entry(function(){
            var param = {};

                var event = @com.smartgwt.client.widgets.calendar.events.DateChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({dateChanged:  dateChanged              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.dateChanged =  dateChanged             ;
        }
   }-*/;
    /**
     * Add a dayBodyClick handler.
     * <p>
     * Called when the body area of a day in the month view is clicked on, outside of any links to a particular event. <P> By
     * default, if the user can add events, shows a dialog for adding a new event for that day.  Call {@link
     * com.smartgwt.client.widgets.calendar.events.DayBodyClickEvent#cancel()} from within {@link
     * com.smartgwt.client.widgets.calendar.events.DayBodyClickHandler#onDayBodyClick} to cancel this action. <P> Not called if
     * the day falls outside the current month and {@link com.smartgwt.client.widgets.calendar.Calendar#getShowOtherDays
     * showOtherDays} is false.
     *
     * @param handler the dayBodyClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDayBodyClickHandler(com.smartgwt.client.widgets.calendar.events.DayBodyClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.DayBodyClickEvent.getType()) == 0) setupDayBodyClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.DayBodyClickEvent.getType());
    }

    private native void setupDayBodyClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var dayBodyClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.DayBodyClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({dayBodyClick: 
                function () {
                    var param = {"date" : arguments[0], "events" : arguments[1], "calendar" : arguments[2], "rowNum" : arguments[3], "colNum" : arguments[4]};
                    return dayBodyClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.dayBodyClick = 
                function () {
                    var param = {"date" : arguments[0], "events" : arguments[1], "calendar" : arguments[2], "rowNum" : arguments[3], "colNum" : arguments[4]};
                    return dayBodyClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a dayHeaderClick handler.
     * <p>
     * Called when the header area of a day in the month view is clicked on. <P> By default, moves to the day tab and shows the
     * clicked days events. Call {@link com.smartgwt.client.widgets.calendar.events.DayHeaderClickEvent#cancel()} from within
     * {@link com.smartgwt.client.widgets.calendar.events.DayHeaderClickHandler#onDayHeaderClick} to cancel this action. <P>
     * Not called if the day falls outside the current month and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getShowOtherDays showOtherDays} is false.
     *
     * @param handler the dayHeaderClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDayHeaderClickHandler(com.smartgwt.client.widgets.calendar.events.DayHeaderClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.DayHeaderClickEvent.getType()) == 0) setupDayHeaderClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.DayHeaderClickEvent.getType());
    }

    private native void setupDayHeaderClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var dayHeaderClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.DayHeaderClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({dayHeaderClick: 
                function () {
                    var param = {"date" : arguments[0], "events" : arguments[1], "calendar" : arguments[2], "rowNum" : arguments[3], "colNum" : arguments[4]};
                    return dayHeaderClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.dayHeaderClick = 
                function () {
                    var param = {"date" : arguments[0], "events" : arguments[1], "calendar" : arguments[2], "rowNum" : arguments[3], "colNum" : arguments[4]};
                    return dayHeaderClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a eventAdded handler.
     * <p>
     * Notification fired whenever a user adds an event. <P> In a calendar with a DataSource, eventAdded() fires <b>after</b>
     * the event has been successfully added to the server
     *
     * @param handler the eventAdded handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addEventAddedHandler(com.smartgwt.client.widgets.calendar.events.EventAddedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CalendarEventAdded.getType()) == 0) setupEventAddedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CalendarEventAdded.getType());
    }

    private native void setupEventAddedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var eventAdded = $entry(function(){
            var param = {"event" : arguments[0]};

                var event = @com.smartgwt.client.widgets.calendar.events.CalendarEventAdded::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({eventAdded:  eventAdded              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.eventAdded =  eventAdded             ;
        }
   }-*/;
    /**
     * Add a eventChanged handler.
     * <p>
     * Notification fired whenever a user changes an event, whether by dragging the event or by editing it in a dialog. <P> In
     * a calendar with a DataSource, eventChanged() fires <b>after</b> the updated event has been successfully saved to the
     * server
     *
     * @param handler the eventChanged handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addEventChangedHandler(com.smartgwt.client.widgets.calendar.events.EventChangedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CalendarEventChangedEvent.getType()) == 0) setupEventChangedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CalendarEventChangedEvent.getType());
    }

    private native void setupEventChangedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var eventChanged = $entry(function(){
            var param = {"event" : arguments[0]};

                var event = @com.smartgwt.client.widgets.calendar.events.CalendarEventChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({eventChanged:  eventChanged              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.eventChanged =  eventChanged             ;
        }
   }-*/;
    /**
     * Add a eventClick handler.
     * <p>
     * Called whenever an event is clicked on in the day, week or month views. <P> By default a dialog appears showing details
     * for the event, and offering the ability to edit events which are editable.  Call {@link
     * com.smartgwt.client.widgets.calendar.events.CalendarEventClick#cancel()} from within {@link
     * com.smartgwt.client.widgets.calendar.events.EventClickHandler#onEventClick} to cancel the default action. This is a good
     * place to, for example, show a completely customized event dialog instead of the default one.
     *
     * @param handler the eventClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addEventClickHandler(com.smartgwt.client.widgets.calendar.events.EventClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CalendarEventClick.getType()) == 0) setupEventClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CalendarEventClick.getType());
    }

    private native void setupEventClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var eventClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.CalendarEventClick::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({eventClick: 
                function () {
                    var param = {"event" : arguments[0], "viewName" : arguments[1]};
                    return eventClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.eventClick = 
                function () {
                    var param = {"event" : arguments[0], "viewName" : arguments[1]};
                    return eventClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a eventMoved handler.
     * <p>
     * Called when an event is moved via dragging by a user.  Call {@link
     * com.smartgwt.client.widgets.calendar.events.CalendarEventMoved#cancel()} from within {@link
     * com.smartgwt.client.widgets.calendar.events.EventMovedHandler#onEventMoved} to disallow the move.
     *
     * @param handler the eventMoved handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addEventMovedHandler(com.smartgwt.client.widgets.calendar.events.EventMovedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CalendarEventMoved.getType()) == 0) setupEventMovedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CalendarEventMoved.getType());
    }

    private native void setupEventMovedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var eventMoved = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.CalendarEventMoved::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({eventMoved: 
                function () {
                    var param = {"newDate" : arguments[0], "event" : arguments[1], "newLane" : arguments[2]};
                    return eventMoved(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.eventMoved = 
                function () {
                    var param = {"newDate" : arguments[0], "event" : arguments[1], "newLane" : arguments[2]};
                    return eventMoved(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a eventRemoveClick handler.
     * <p>
     * Called whenever the close icon of an event is clicked within the day or week view. Return false to cancel the removal.
     * <P> Implement this method to do something like, for example, showing a confirmation dialog  before an event is removed.
     *
     * @param handler the eventRemoveClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addEventRemoveClickHandler(com.smartgwt.client.widgets.calendar.events.EventRemoveClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CalendarEventRemoveClick.getType()) == 0) setupEventRemoveClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CalendarEventRemoveClick.getType());
    }

    private native void setupEventRemoveClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var eventRemoveClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.CalendarEventRemoveClick::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({eventRemoveClick: 
                function () {
                    var param = {"event" : arguments[0], "viewName" : arguments[1]};
                    return eventRemoveClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.eventRemoveClick = 
                function () {
                    var param = {"event" : arguments[0], "viewName" : arguments[1]};
                    return eventRemoveClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a eventRemoved handler.
     * <p>
     * Notification fired whenever a user removes an event <P> In a calendar with a DataSource, eventRemoved() fires
     * <b>after</b> the event has been successfully removed from the server
     *
     * @param handler the eventRemoved handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addEventRemovedHandler(com.smartgwt.client.widgets.calendar.events.EventRemovedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CalendarEventRemoved.getType()) == 0) setupEventRemovedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CalendarEventRemoved.getType());
    }

    private native void setupEventRemovedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var eventRemoved = $entry(function(){
            var param = {"event" : arguments[0]};

                var event = @com.smartgwt.client.widgets.calendar.events.CalendarEventRemoved::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({eventRemoved:  eventRemoved              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.eventRemoved =  eventRemoved             ;
        }
   }-*/;
    /**
     * Add a eventResized handler.
     * <p>
     * Called when an event is resized via dragging by a user.  The passed date value is the new *end* date for the event,
     * since resizing can only be performed on the bottom edge of an event in normal calendar views.
     *
     * @param handler the eventResized handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addEventResizedHandler(com.smartgwt.client.widgets.calendar.events.EventResizedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.CalendarEventResized.getType()) == 0) setupEventResizedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.CalendarEventResized.getType());
    }

    private native void setupEventResizedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var eventResized = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.CalendarEventResized::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({eventResized: 
                function () {
                    var param = {"newDate" : arguments[0], "event" : arguments[1]};
                    return eventResized(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.eventResized = 
                function () {
                    var param = {"newDate" : arguments[0], "event" : arguments[1]};
                    return eventResized(param) == true;
                }
            ;
        }
   }-*/;
	/**
     * A notification method fired when the events in the current view have been refreshed.
     */
    public native void eventsRendered() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.eventsRendered();
    }-*/;

	/**
     * Gets the day of the week (0-6) that the mouse is currently over.
     *
     * @return the day that the mouse is currently over
     * @see com.smartgwt.client.widgets.calendar.Calendar#getActiveTime
     */
    public native Integer getActiveDay() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getActiveDay();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toInteger(I)(ret);
    }-*/;

	/**
     * Gets a date object representing the date over which the mouse is hovering for the current selected view. For month view,
     * the time will be set to midnight of the active day. For day and week views, the time will be the rounded to the closest
     * half hour relative to the mouse position.
     *
     * @return the date that the mouse is over
     */
    public native Date getActiveTime() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getActiveTime();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;


	/**
     * Return the Date instance associated with the passed co-ordinates in the current view.  If the cell at the passed
     * co-ordinates is not a date-cell, returns null. <P> To determine the date at a more specific point within a cell, see
     * {@link com.smartgwt.client.widgets.calendar.Calendar#getDateFromPoint Calendar.getDateFromPoint}.
     * @param rowNum the row number to get the date for
     * @param colNum the column number to get the date for
     *
     * @return the date, if any, associated with the passed co-ords in the current view
     */
    public native Date getCellDate(Integer rowNum, Integer colNum) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getCellDate(rowNum == null ? null : rowNum.@java.lang.Integer::intValue()(), colNum == null ? null : colNum.@java.lang.Integer::intValue()());
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;


	/**
     * Return CSS text for styling the cell associated with the passed date and/or rowNum & colNum, which will be applied in
     * addition to the CSS class for the cell, as overrides. <p> "CSS text" means semicolon-separated style settings, suitable
     * for inclusion in a CSS stylesheet or in a STYLE attribute of an HTML element.
     * @param date the date to return CSS text for
     * @param rowNum the row number to get the CSS for
     * @param colNum the column number to get the date for
     * @param viewer the ListGrid used by the current Calendar view
     *
     * @return CSS text for the associated cell
     * @see com.smartgwt.client.widgets.calendar.Calendar#getDateStyle
     */
    public native String getDateCSSText(Date date, Integer rowNum, Integer colNum, ListGrid viewer) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDateCSSText(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(date), rowNum == null ? null : rowNum.@java.lang.Integer::intValue()(), colNum == null ? null : colNum.@java.lang.Integer::intValue()(), viewer.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
        return ret;
    }-*/;

	/**
     * Returns a Date instance representing the point at the passed offsets into the body of the  current view. <P> If
     * snapOffsets is passed as false, returns the date representing the  exact position of the passed offsets.  If unset or
     * passed as true, returns the date at the  nearest eventSnapGap to the left, for {@link
     * com.smartgwt.client.widgets.calendar.Timeline}s, or above for {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day}  and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWeekView week} views. <P> If neither x nor y offsets are passed,
     * assumes them from the last mouse event. <P> If the cell at the eventual offsets is not a date-cell, returns null. <P>
     * Note that, for the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, this method is
     * functionally equivalent to  {@link com.smartgwt.client.widgets.calendar.Calendar#getCellDate Calendar.getCellDate},
     * which determines the date associated with a cell, without the additional  offset precision offered here.
     *
     * @return the date, if any, associated with the passed co-ords in the current view
     */
    public native Date getDateFromPoint() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDateFromPoint();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;

    /**
     * @see {@link Calendar#getDateFromPoint()}
     */
    public Date getDateFromPoint(Integer x){
        return getDateFromPoint(x, (Integer) null, null);
    }

    /**
     * @see {@link Calendar#getDateFromPoint()}
     */
    public Date getDateFromPoint(Integer x, Integer y){
        return getDateFromPoint(x, y, null);
    }

	/**
     * Returns a Date instance representing the point at the passed offsets into the body of the  current view. <P> If
     * snapOffsets is passed as false, returns the date representing the  exact position of the passed offsets.  If unset or
     * passed as true, returns the date at the  nearest eventSnapGap to the left, for {@link
     * com.smartgwt.client.widgets.calendar.Timeline}s, or above for {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day}  and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWeekView week} views. <P> If neither x nor y offsets are passed,
     * assumes them from the last mouse event. <P> If the cell at the eventual offsets is not a date-cell, returns null. <P>
     * Note that, for the {@link com.smartgwt.client.widgets.calendar.Calendar#getMonthView month view}, this method is
     * functionally equivalent to  {@link com.smartgwt.client.widgets.calendar.Calendar#getCellDate Calendar.getCellDate},
     * which determines the date associated with a cell, without the additional  offset precision offered here.
     * @param x the x offset into the body of the selected view - non-functional for                       the {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDayView day view}.  If this param and "y" are both unset,              
     *         assumes both offsets from the last mouse event.
     * @param y the y offset into the body of the selected view - non-functional for the                            {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timeline view}.  If this param and "x" are                
     *             both unset, assumes both offsets from the last mouse event.
     * @param snapOffsets whether to snap the offsets to the nearest eventSnapGap - if                                 unset, the default is true
     *
     * @return the date, if any, associated with the passed co-ords in the current view
     */
    public native Date getDateFromPoint(Integer x, Integer y, Boolean snapOffsets) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDateFromPoint(x == null ? null : x.@java.lang.Integer::intValue()(), y == null ? null : y.@java.lang.Integer::intValue()(), snapOffsets == null ? null : snapOffsets.@java.lang.Boolean::booleanValue()());
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;


	/**
     * Return the CSS styleName for the cell associated with the passed date and/or rowNum & colNum.
     * @param date the date to return CSS text for
     * @param rowNum the row number to get the CSS for
     * @param colNum the column number to get the date for
     * @param viewer the ListGrid used by the current Calendar view
     *
     * @return CSS style for the cell associated with the passed date
     * @see com.smartgwt.client.widgets.calendar.Calendar#getDateCSSText
     */
    public native String getDateStyle(Date date, Integer rowNum, Integer colNum, ListGrid viewer) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDateStyle(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(date), rowNum == null ? null : rowNum.@java.lang.Integer::intValue()(), colNum == null ? null : colNum.@java.lang.Integer::intValue()(), viewer.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
        return ret;
    }-*/;

    /**
     * Add a eventHoverHTML handler.
     * <p>
     * Gets the hover HTML for an event being hovered over. Override here to return custom  HTML based upon the parameter event
     * object.
     *
     * @param handler the eventHoverHTML handler
     * @return {@link HandlerRegistration} used to remove this handler
     * @deprecated Please use setEventHoverHTMLCustomizer instead, this will be removed in a future release.
     */
    public HandlerRegistration addEventHoverHTMLHandler(com.smartgwt.client.widgets.calendar.events.EventHoverHTMLHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.EventHoverHTMLEvent.getType()) == 0) setupEventHoverHTMLEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.EventHoverHTMLEvent.getType());
    }

    private native void setupEventHoverHTMLEvent() /*-{
        var obj = null;
        var selfJ = this;
        var getEventHoverHTML = $entry(function(){
            var param = {"event" : arguments[0], "eventWindow" : arguments[1]};

                var event = @com.smartgwt.client.widgets.calendar.events.EventHoverHTMLEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({getEventHoverHTML:  getEventHoverHTML              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.getEventHoverHTML =  getEventHoverHTML             ;
        }
   }-*/;

	/**
     * This method returns the hover HTML to be displayed when the user hovers over a cell displayed in the calendar month view
     * tab. <P> Default implementation will display a list of the events occurring on the date the user is hovering over.
     * Override for custom behavior. Note that returning null will suppress the hover altogether.
     * @param date Date the user is hovering over
     * @param events array of events occurring on the current date. May be empty.
     *
     * @return HTML string to display
     */
    public native String getMonthViewHoverHTML(Date date, CalendarEvent... events) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getMonthViewHoverHTML(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(date), @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(events));
        return ret;
    }-*/;

	/**
     * Returns the end of the selected week or month depending on the current calendar view.   For the month view, and for the
     * week view when not showing weekends, this will often be a  different date than that returned by {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getVisibleEndDate Calendar.getVisibleEndDate}.
     *
     * @return period end date
     */
    public native Date getPeriodEndDate() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getPeriodEndDate();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;

	/**
     * Returns the start of the selected week or month depending on the current calendar view.   For the month view, and for
     * the week view when not showing weekends, this will often be a  different date than that returned by {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getVisibleStartDate Calendar.getVisibleStartDate}.
     *
     * @return period start date
     */
    public native Date getPeriodStartDate() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getPeriodStartDate();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;

	/**
     * Returns the last visible date in the currently selected calendar view.
     *
     * @return last visible date
     */
    public native Date getVisibleEndDate() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getVisibleEndDate();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;

	/**
     * Returns the first visible date in the currently selected calendar view.
     *
     * @return first visible date
     */
    public native Date getVisibleStartDate() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getVisibleStartDate();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toDate(D)(ret.getTime());
    }-*/;

	/**
     * Move to the next day, week, or month, depending on which tab is selected.
     */
    public native void next() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.next();
    }-*/;

	/**
     * Move to the previous day, week, month, or timeline range depending on which tab is selected.
     */
    public native void previous() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.previous();
    }-*/;


	/**
     * Scroll the calendar Day or Week views to the specified time.
     * @param time any parsable time-string
     */
    public native void scrollToTime(String time) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.scrollToTime(time);
    }-*/;


	/**
     * Selects the calendar view in the passed tab number.
     * @param tabnum the index of the tab to select
     */
    public native void selectTab(int tabnum) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.selectTab(tabnum);
    }-*/;


	/**
     * Sets the range over which the timeline will display events. <P> If the <code>end</code> parameter is not passed, the end
     * date of the range will default to  {@link com.smartgwt.client.widgets.calendar.Calendar#getDefaultTimelineColumnSpan 20}
     * columns of the current  {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity granularity}
     * following the start date.
     * @param start start of range
     */
    public native void setTimelineRange(Date start) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTimelineRange(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(start));
    }-*/;

	/**
     * Sets the range over which the timeline will display events. <P> If the <code>end</code> parameter is not passed, the end
     * date of the range will default to  {@link com.smartgwt.client.widgets.calendar.Calendar#getDefaultTimelineColumnSpan 20}
     * columns of the current  {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineGranularity granularity}
     * following the start date.
     * @param start start of range
     * @param end end of range
     */
    public native void setTimelineRange(Date start, Date end) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTimelineRange(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(start), @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(end));
    }-*/;


	/**
     * Open the Quick Event dialog showing minimal information about an existing  {@link
     * com.smartgwt.client.widgets.calendar.CalendarEvent event}. <P> The {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getStartDateField startDate} field on the event is used to calculate the 
     * display location for the dialog. <P> If this method is called when the Event Dialog is already showing another event,
     * and if  changes have been made, a confirmation dialog is displayed and editing of the new event  is cancelled unless
     * confirmed.
     * @param event the event to show in the Editor
     */
    public native void showEventDialog(CalendarEvent event) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.showEventDialog(event.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

	/**
     * Show an Event Editor for the passed event.  Event Editor's fill the Calendar and allow  for editing of the built-in
     * Event fields, like {@link com.smartgwt.client.widgets.calendar.Calendar#getNameField name} and  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDescriptionField description}, as well as any  custom fields supplied
     * via {@link com.smartgwt.client.widgets.calendar.Calendar#getEventDialogFields eventDialogFields}. <P> If no event is
     * passed, a new Event with no default values is created via  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#showNewEventEditor Calendar.showNewEventEditor}.
     */
    public native void showEventEditor() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.showEventEditor();
    }-*/;

	/**
     * Show an Event Editor for the passed event.  Event Editor's fill the Calendar and allow  for editing of the built-in
     * Event fields, like {@link com.smartgwt.client.widgets.calendar.Calendar#getNameField name} and  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getDescriptionField description}, as well as any  custom fields supplied
     * via {@link com.smartgwt.client.widgets.calendar.Calendar#getEventDialogFields eventDialogFields}. <P> If no event is
     * passed, a new Event with no default values is created via  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#showNewEventEditor Calendar.showNewEventEditor}.
     * @param event an existing event to show in the Editor
     */
    public native void showEventEditor(CalendarEvent event) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.showEventEditor(event == null ? null : event.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

	/**
     * Open the Quick Event dialog to begin editing a new {@link com.smartgwt.client.widgets.calendar.CalendarEvent event}. <P>
     * If passed, the event parameter is used as defaults for the new event - in addition, the  event's {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getStartDateField startDate}, and its  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLaneNameField lane}, for timeline events, are used to calculate the 
     * display location for the dialog. <P> If this method is called when the Event Dialog is already showing another event,
     * and if  changes have been made, a confirmation dialog is displayed and editing of the new event  is cancelled unless
     * confirmed.
     */
    public native void showNewEventDialog() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.showNewEventDialog();
    }-*/;

	/**
     * Open the Quick Event dialog to begin editing a new {@link com.smartgwt.client.widgets.calendar.CalendarEvent event}. <P>
     * If passed, the event parameter is used as defaults for the new event - in addition, the  event's {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getStartDateField startDate}, and its  {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getLaneNameField lane}, for timeline events, are used to calculate the 
     * display location for the dialog. <P> If this method is called when the Event Dialog is already showing another event,
     * and if  changes have been made, a confirmation dialog is displayed and editing of the new event  is cancelled unless
     * confirmed.
     * @param event defaults for the new event
     */
    public native void showNewEventDialog(CalendarEvent event) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.showNewEventDialog(event == null ? null : event.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

	/**
     * Show an Event Editor for a new event.  If an {@link com.smartgwt.client.widgets.calendar.CalendarEvent event} is passed
     * as the  parameter, it is used as defaults for the new event.
     */
    public native void showNewEventEditor() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.showNewEventEditor();
    }-*/;

	/**
     * Show an Event Editor for a new event.  If an {@link com.smartgwt.client.widgets.calendar.CalendarEvent event} is passed
     * as the  parameter, it is used as defaults for the new event.
     * @param event defaults for the new event to show in the Editor
     */
    public native void showNewEventEditor(CalendarEvent event) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.showNewEventEditor(event == null ? null : event.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    /**
     * Add a timelineEventMoved handler.
     * <p>
     * Called when a Timeline event is moved via dragging by a user.  Call {@link
     * com.smartgwt.client.widgets.calendar.events.TimelineEventMoved#cancel()} from within {@link
     * com.smartgwt.client.widgets.calendar.events.TimelineEventMovedHandler#onTimelineEventMoved} to disallow the  move.
     *
     * @param handler the timelineEventMoved handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addTimelineEventMovedHandler(com.smartgwt.client.widgets.calendar.events.TimelineEventMovedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.TimelineEventMoved.getType()) == 0) setupTimelineEventMovedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.TimelineEventMoved.getType());
    }

    private native void setupTimelineEventMovedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var timelineEventMoved = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.TimelineEventMoved::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({timelineEventMoved: 
                function () {
                    var param = {"event" : arguments[0], "startDate" : arguments[1], "endDate" : arguments[2], "lane" : arguments[3]};
                    return timelineEventMoved(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.timelineEventMoved = 
                function () {
                    var param = {"event" : arguments[0], "startDate" : arguments[1], "endDate" : arguments[2], "lane" : arguments[3]};
                    return timelineEventMoved(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a timelineEventResized handler.
     * <p>
     * Called when a Timeline event is resized via dragging by a user.  Call {@link
     * com.smartgwt.client.widgets.calendar.events.TimelineEventResized#cancel()} from within {@link
     * com.smartgwt.client.widgets.calendar.events.TimelineEventResizedHandler#onTimelineEventResized} to disallow  the resize.
     *
     * @param handler the timelineEventResized handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addTimelineEventResizedHandler(com.smartgwt.client.widgets.calendar.events.TimelineEventResizedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.calendar.events.TimelineEventResized.getType()) == 0) setupTimelineEventResizedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.calendar.events.TimelineEventResized.getType());
    }

    private native void setupTimelineEventResizedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var timelineEventResized = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.calendar.events.TimelineEventResized::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({timelineEventResized: 
                function () {
                    var param = {"event" : arguments[0], "startDate" : arguments[1], "endDate" : arguments[2]};
                    return timelineEventResized(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.timelineEventResized = 
                function () {
                    var param = {"event" : arguments[0], "startDate" : arguments[1], "endDate" : arguments[2]};
                    return timelineEventResized(param) == true;
                }
            ;
        }
   }-*/;

    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties set on the SmartGWT class instance passed to this function before its
     * underlying SmartClient JS object was created.
     * This is a powerful feature that eliminates the need for users to create a separate
     * hierarchy of subclasses that only alter the default properties of this class. Can also
     * be used for skinning / styling purposes.  <P> <b>Note:</b> This method is intended for
     * setting default attributes only and will affect all instances of the underlying class
     * (including those automatically generated in JavaScript).  This method should not be used
     * to apply standard EventHandlers or override methods for a class - use a custom subclass
     * instead.  Calling this method after instances have been created can result in undefined
     * behavior, since it bypasses any setters and a class instance may have already examined 
     * a particular property and not be expecting any changes through this route.
     *
     * @param calendarProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(Calendar calendarProperties) /*-{
    	var properties = $wnd.isc.addProperties({},calendarProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.Calendar.addProperties(properties);
    }-*/;

    // ***********************************************************


	protected void onInit() {
		super.onInit();
		onInit_Calendar();
	}
    protected native void onInit_Calendar() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self._getDayBodyHTML = self.getDayBodyHTML;

        self.getDayBodyHTML = $debox($entry(function(date, events, calendar, rowNum, colNum) {
            var jObj = this.__ref;
            if (jObj == null || jObj === undefined) return this._getDayBodyHTML(date, events, calendar, rowNum, colNum);
            var dateJ = @com.smartgwt.client.util.JSOHelper::toDate(D)(date.getTime());
            var eventsJ = events == null ? null : @com.smartgwt.client.util.ConvertTo::arrayOfCalendarEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(events);
            var calendarJ = @com.smartgwt.client.widgets.calendar.Calendar::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(calendar);
            return jObj.@com.smartgwt.client.widgets.calendar.Calendar::getDayBodyHTML(Ljava/util/Date;[Lcom/smartgwt/client/widgets/calendar/CalendarEvent;Lcom/smartgwt/client/widgets/calendar/Calendar;II)(dateJ, eventsJ, calendarJ, rowNum, colNum);
        }));
        
        self.__getDateLabelText = self.getDateLabelText;
        self.getDateLabelText = $debox($entry(function(viewName, startDate, endDate) {
        	var jObj = this.__ref;
            if(jObj == null || jObj === undefined) return this.__getDateLabelText(viewName, startDate, endDate);
            var startDateJava = startDate == null ? null : @com.smartgwt.client.util.JSOHelper::toDate(D)(startDate.getTime());
            var endDateJava = endDate == null ? null :  @com.smartgwt.client.util.JSOHelper::toDate(D)(endDate.getTime());
            return jObj.@com.smartgwt.client.widgets.calendar.Calendar::getDateLabelText(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)(viewName, startDateJava, endDateJava);
        }));        
        
        self.__getWorkdayStart = self.getWorkdayStart;
        self.getWorkdayStart = $debox($entry(function(date) {
        	var jObj = this.__ref;
            if(jObj == null || jObj === undefined) return this.__getWorkdayStart(date);
            var dateJava = date == null ? null : @com.smartgwt.client.util.JSOHelper::toDate(D)(date.getTime());
            return jObj.@com.smartgwt.client.widgets.calendar.Calendar::getWorkdayStart(Ljava/util/Date;)(dateJava);
        }));

        self.__getWorkdayEnd = self.getWorkdayEnd;
        self.getWorkdayEnd = $debox($entry(function(date) {
        	var jObj = this.__ref;
            if(jObj == null || jObj === undefined) return this.__getWorkdayEnd(date);
            var dateJava = date == null ? null : @com.smartgwt.client.util.JSOHelper::toDate(D)(date.getTime());
            return jObj.@com.smartgwt.client.widgets.calendar.Calendar::getWorkdayEnd(Ljava/util/Date;)(dateJava);
        }));

        self.__dateIsWorkday = self.dateIsWorkday;
        self.dateIsWorkday = $debox($entry(function(date) {
        	var jObj = this.__ref;
            if(jObj == null || jObj === undefined) return this.__dateIsWorkday(date);
            var dateJava = date == null ? null : @com.smartgwt.client.util.JSOHelper::toDate(D)(date.getTime());
            var result = jObj.@com.smartgwt.client.widgets.calendar.Calendar::dateIsWorkday(Ljava/util/Date;)(dateJava);
            return (result == null ? false : result);
        }));

        }-*/;
    
    /**
     * When using {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWorkday showWorkday}:true,
     * <code>workdayStart</code> and <code>workdayEnd</code> specify the time of day when the workday starts and ends,
     * specified as a String acceptable to String. <P> Both start and end time must fall on a 30 minute increment (eg 9:30, but
     * not 9:45). <P> The hours of the workday can be customized for particular dates by providing implementations of {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart Calendar.getWorkdayStart} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd Calendar.getWorkdayEnd}.
     *
     * @param workdayEnd  Default value is "5:00pm"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setWorkdayEnd(String workdayEnd)  throws IllegalStateException {
        setAttribute("workdayEnd", workdayEnd, false);
    }

    /**
     * When using {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWorkday showWorkday}:true,
     * <code>workdayStart</code> and <code>workdayEnd</code> specify the time of day when the workday starts and ends,
     * specified as a String acceptable to String. <P> Both start and end time must fall on a 30 minute increment (eg 9:30, but
     * not 9:45). <P> The hours of the workday can be customized for particular dates by providing implementations of {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart Calendar.getWorkdayStart} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd Calendar.getWorkdayEnd}.
     *
     * @param date  the date to get the workday end for
     * 
     * @return Returns the end of the working day on the passed date.  By default, this method returns the value of {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd workdayEnd}.
     */
    public native String getWorkdayEnd(Date date)  /*-{
    	var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
	    var dateJS = date == null ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(date);
    	return self.__getWorkdayEnd(dateJS);
	}-*/;

    /**
     * When using {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWorkday showWorkday}:true,
     * <code>workdayStart</code> and <code>workdayEnd</code> specify the time of day when the workday starts and ends,
     * specified as a String acceptable to String. <P> Both start and end time must fall on a 30 minute increment (eg 9:30, but
     * not 9:45). <P> The hours of the workday can be customized for particular dates by providing implementations of {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart Calendar.getWorkdayStart} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd Calendar.getWorkdayEnd}.
     *
     * @param workdayStart  Default value is "9:00am"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setWorkdayStart(String workdayStart)  throws IllegalStateException {
        setAttribute("workdayStart", workdayStart, false);
    }

    /**
     * When using {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWorkday showWorkday}:true,
     * <code>workdayStart</code> and <code>workdayEnd</code> specify the time of day when the workday starts and ends,
     * specified as a String acceptable to String. <P> Both start and end time must fall on a 30 minute increment (eg 9:30, but
     * not 9:45). <P> The hours of the workday can be customized for particular dates by providing implementations of {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart Calendar.getWorkdayStart} and {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayEnd Calendar.getWorkdayEnd}.
     *
     * @param date  the date to get the workday start for
     * 
     * @return Returns the start of the working day on the passed date.  By default, this method returns the value of {@link
     * com.smartgwt.client.widgets.calendar.Calendar#getWorkdayStart workdayStart}.
     */
    
    public native String getWorkdayStart(Date date)  /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
	    var dateJS = date == null ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(date);
        return self.__getWorkdayStart(dateJS);
    }-*/;
    
    /**
     * Should the parameter date be considered a workday? By default this method tries to find the
     * parameter date day in {@link com.smartgwt.client.widgets.calendar.Calendar#getWorkdays workdays}, 
     * and returns true if found. Override this method to provide custom logic for determining workday, 
     * for example returning false on holidays.
     *
     * @param date  the date being tested
     * 
     * @return Returns true if the date passed should be considered a workday
     */
    public native boolean dateIsWorkday(Date date)  /*-{
    	var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
	    var dateJS = date == null ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(date);
    	return self.__dateIsWorkday(dateJS);
	}-*/;

	/**
     * Return the HTML to be shown in the body of a day in the month view. <P> Default is to render a series of links that call
     * {@link com.smartgwt.client.widgets.calendar.Calendar#addEventClickHandler Calendar.eventClick} to provide details and/or
     * an editing interface for the events. <P> <code>getDayBodyHTML()</code> is not called for days outside of the current
     * month if {@link com.smartgwt.client.widgets.calendar.Calendar#getShowOtherDays showOtherDays} is false.
     * @param date JavaScript Date object representing this day
     * @param events events that fall on this day
     * @param calendar the calendar itself
     * @param rowNum the row number to which the parameter date belongs
     * @param colNum the column number to which the parameter date belongs
     *
     * @return HTML to display
     */
    protected native String getDayBodyHTML(Date date, CalendarEvent[] events, Calendar calendar, int rowNum, int colNum) /*-{
        var dateJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(date);
        var eventsJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(events);
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var calendarJS = calendar.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        return self._getDayBodyHTML(dateJS, eventsJS, calendarJS,rowNum, colNum);
    }-*/;

    /**
     * Returns the text to display with the navigation buttons above the Calendar - indicates the  visible date range.
     * <P>
     * <b>Note: </b> This is an override point.
     * 
     * @param viewName one of "day", "week", "month" or "timeline"
     * @param startDate the start of the visible date range
     * @param endDate the optional end of the visible date range. May be null.
     * 
     * @return a formmatted date or date-range string appropriate to the passed view
     */
    public native String getDateLabelText(String viewName, Date startDate, Date endDate) /*-{
    	var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
    	 
	    var startDateJS = startDate == null ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(startDate);
	    var endDateJS = endDate == null ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(endDate);
	    var ret = self.__getDateLabelText(viewName, startDateJS, endDateJS);
	    return ret;
	}-*/;

    /**
     * This method returns the hover HTML to be displayed when the user hovers over a cell displayed in the calendar month view tab.
     * <P>
     * Default implementation will display a list of the events occurring on the date the user is hovering over. Override for custom 
     * behavior. Note that returning null will suppress the hover altogether.
     * 
     * @param eventHoverHTMLCustomizer the customizer to execute.
     */
    public native void setEventHoverHTMLCustomizer(EventHoverHTMLCustomizer eventHoverHTMLCustomizer) /*-{
        var self;
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
        } else {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        }

        self.getEventHoverHTML = $debox($entry(function(jEvent, jEventWindow) {
        	
        	var calendarEvent = @com.smartgwt.client.widgets.calendar.CalendarEvent::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(jEvent);
        	var eventWindow   = @com.smartgwt.client.widgets.calendar.EventWindow::getByJSObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jEventWindow);
            var calendarJ     = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(this);

            eventHoverHTMLCustomizer.@com.smartgwt.client.widgets.calendar.EventHoverHTMLCustomizer::setCalendar(Lcom/smartgwt/client/widgets/calendar/Calendar;)(calendarJ);

            return eventHoverHTMLCustomizer.@com.smartgwt.client.widgets.calendar.EventHoverHTMLCustomizer::getEventHoverHTML(Lcom/smartgwt/client/widgets/calendar/CalendarEvent;Lcom/smartgwt/client/widgets/calendar/EventWindow;)(calendarEvent,eventWindow);
        }));
    }-*/;
    
    /**
     * This method returns the hover HTML to be displayed when the user hovers over a cell displayed in the calendar month view tab.
     * <P>
     * Default implementation will display a list of the events occurring on the date the user is hovering over. Override for custom 
     * behavior. Note that returning null will suppress the hover altogether.
     * 
     * @param monthViewHoverHTMLCustomizer the customizer to execute.
     */
    public native void setMonthViewHoverHTMLCustomizer(MonthViewHoverHTMLCustomizer monthViewHoverHTMLCustomizer) /*-{
        var self;
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
        } else {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        }
        self.getMonthViewHoverHTML = $debox($entry(function(currentDate,events) {
        	
            var calendarEvents = @com.smartgwt.client.util.ConvertTo::arrayOfCalendarEvent(Lcom/google/gwt/core/client/JavaScriptObject;)(events);
            var calendarJ      = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(this);
            var currentDateJ   = @com.smartgwt.client.util.JSOHelper::toDate(D)(currentDate.getTime());

            monthViewHoverHTMLCustomizer.@com.smartgwt.client.widgets.calendar.MonthViewHoverHTMLCustomizer::setCalendar(Lcom/smartgwt/client/widgets/calendar/Calendar;)(calendarJ);
            
            return monthViewHoverHTMLCustomizer.@com.smartgwt.client.widgets.calendar.MonthViewHoverHTMLCustomizer::getMonthViewHoverHTML(Ljava/util/Date;[Lcom/smartgwt/client/widgets/calendar/CalendarEvent;)(currentDateJ,calendarEvents);
        }));
    }-*/;
    
    /**
     * The set of fields for the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventEditor eventEditor}. <p>
     * The default set of fields are:  <pre>    {name: "startHours", title: "From", type: "select", width: 60},
     * {name: "startMinutes", showTitle: false, type: "select", width: 60},    {name: "startAMPM", showTitle: false,
     * type: "select", width: 60},    {name: "invalidDate", type: "blurb", colSpan: 4, visible: false}    {name:
     * "endHours", title: "To", type: "select", width: 60},    {name: "endMinutes", showTitle: false, type: "select",
     * width: 60},    {name: "endAMPM", showTitle: false, type: "select", width: 60},    {name: "name", title: "Name",
     * type: "text", colSpan: 4},    {name: "description", title: "Description", type: "textArea", colSpan: 4, height:
     * 50} </pre> See the Customized Binding example below for more information on altering default datasource  fields
     * within forms.
     *
     * @param eventEditorFields eventEditorFields Default value is see below
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventEditorFields(FormItem... eventEditorFields) throws IllegalStateException {
        setAttribute("eventEditorFields", toJsArray(eventEditorFields), false);
    }

    /**
     * The set of fields for the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventEditor eventEditor}. <p> The default set of fields are:  <pre>    {name: "startHours", title: "From", type: "select", width: 60},    {name: "startMinutes", showTitle: false, type: "select", width: 60},    {name: "startAMPM", showTitle: false, type: "select", width: 60},    {name: "invalidDate", type: "blurb", colSpan: 4, visible: false}    {name: "endHours", title: "To", type: "select", width: 60},    {name: "endMinutes", showTitle: false, type: "select", width: 60},    {name: "endAMPM", showTitle: false, type: "select", width: 60},    {name: "name", title: "Name", type: "text", colSpan: 4},    {name: "description", title: "Description", type: "textArea", colSpan: 4, height: 50} </pre> See the Customized Binding example below for more information on altering default datasource  fields within forms.
     *
     *
     * @return Array of FormItem
     *
     */
    /*
    public FormItem[] getEventEditorFields()  {
        return getAttribute("eventEditorFields");
    }*/

    /**
     * The set of fields for the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventDialog eventDialog}.  <p>
     * The default set of fields are:  <pre>    {name: "name", title: "Event Name", type: nameType, width: 250 },
     * {name: "save", title: "Save Event", type: "SubmitItem", endRow: false},    {name: "details", title: "Edit
     * Details", type: "button", startRow: false} </pre> See the Customized Binding example below for more information
     * on altering default datasource  fields within forms.
     *
     * @param eventDialogFields eventDialogFields Default value is see below
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEventDialogFields(FormItem... eventDialogFields) throws IllegalStateException {
        setAttribute("eventDialogFields", toJsArray(eventDialogFields), false);
    }

    private static JavaScriptObject toJsArray(FormItem[] formItems) {
        JavaScriptObject jsArray = JSOHelper.createJavaScriptArray();
        int i = 0;
        for (FormItem formItem : formItems) {
            JavaScriptObject config = formItem.getEditorTypeConfig();
            JSOHelper.setAttribute(config, "name", formItem.getName());
            JSOHelper.setAttribute(config, "type", formItem.getType());
            JSOHelper.setArrayValue(jsArray, i, config);
            i++;
        }
        return jsArray;
    }

    /**
     * The set of fields for the {@link com.smartgwt.client.widgets.calendar.Calendar#getEventDialog eventDialog}.  <p> The default set of fields are:  <pre>    {name: "name", title: "Event Name", type: nameType, width: 250 },    {name: "save", title: "Save Event", type: "SubmitItem", endRow: false},    {name: "details", title: "Edit Details", type: "button", startRow: false} </pre> See the Customized Binding example below for more information on altering default datasource  fields within forms.
     *
     *
     * @return Array of FormItem
     *
     */
    /*
    public FormItem[] getEventDialogFields()  {
        return getAttribute("eventDialogFields");
    } */
    
    /**
     * An array of Record objects, specifying the data to be used to populate the DataBoundComponent. Note that not
     * all DataBoundComponents observe the changes to the data to redraw themselves. Refer to the version of setData
     * that accepts component specific records.
     *
     * @param data array of Record objects.
     * @see #setData(CalendarEvent[])
     */
    public void setData(Record[] data) {
        setAttribute("data", data, true);
    }

    /**
     * An List of Record objects, specifying the data to be used to populate the DataBoundComponent. Note that not
     * all DataBoundComponents observe the changes to the data to redraw themselves. Refer to the version of setData
     * that accepts component specific records.
     *
     * @param data List of Records
     */
    public void setData(RecordList data) {
        setAttribute("data", data == null ? null : data.getOrCreateJsObj(), true);
    }

    /**
     * Display format to use for the time portion of events' date information.
     *
     * @param timeFormatter timeFormatter Default value is "toShortPaddedTime"
     * @deprecated use {@link #setTimeFormatter(TimeDisplayFormat)} instead.
     */
    public void setTimeFormatter(TimeFormatter timeFormatter) {
        setAttribute("timeFormatter", timeFormatter, true);
    }

    /**
     * Display format to use for the time portion of events' date information.
     *
     * @param timeFormatter timeFormatter Default value is "toShortPaddedTime"
     */
    public void setTimeFormatter(TimeDisplayFormat timeFormatter) {
        setAttribute("timeFormatter", timeFormatter, true);
    }

    /**
     * Display format to use for the time portion of events' date information.
     *
     *
     * @return TimeDisplayFormat
     */
    public TimeDisplayFormat getTimeFormatter()  {
        return EnumUtil.getEnum(TimeDisplayFormat.values(), getAttribute("timeFormatter"));
    }

    /**
     * Removes a lane from the calendar in {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timelineView}
     * mode.
     * @param lane the lane to remove
     */
    public native void removeLane(Lane lane) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeLane(lane);
    }-*/;

    /**
     * Removes a lane from the calendar in {@link com.smartgwt.client.widgets.calendar.Calendar#getTimelineView timelineView}
     * mode.
     * @param laneName the name of the lane to remove
     */
    public native void removeLane(String laneName) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeLane(laneName);
    }-*/;

    /**
     * Create a new event in this calendar instance.
     *
     * @param startDate   start date of event
     * @param endDate     end date of event
     * @param name        name of event
     * @param description description of event
     */
    public native void addEvent(Date startDate, Date endDate, String name, String description) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addEvent(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(startDate),
                      @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(endDate),
                      name, description);
    }-*/;

    /**
     * Create a new event in this calendar instance.
     *
     * @param startDate   start date of event
     * @param endDate     end date of event
     * @param name        name of event
     * @param description description of event
     * @param otherFields new values of additional fields to be updated
     */
    public native void addEvent(Date startDate, Date endDate, String name, String description, Map otherFields) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var otherFieldsJS = @com.smartgwt.client.util.JSOHelper::convertMapToJavascriptObject(Ljava/util/Map;)(otherFields);
        self.addEvent(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(startDate),
                      @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(endDate),
                      name, description,
                      otherFieldsJS);
    }-*/;

    /**
     * Remove an event from this calendar.
     *
     * @param event The event object to remove from the calendar
     */
    public native void removeEvent(CalendarEvent event) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeEvent(event.@com.smartgwt.client.widgets.calendar.CalendarEvent::getJsObj()());
    }-*/;

    /**
     * update an event in this calendar.
     *
     * @param event       The event object to remove from the calendar
     * @param startDate   start date of event
     * @param endDate     end date of event
     * @param name        name of event
     * @param description description of event
     */
    public native void updateEvent(CalendarEvent event, Date startDate, Date endDate, String name, String description) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.updateEvent(event.@com.smartgwt.client.widgets.calendar.CalendarEvent::getJsObj()(),
                @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(startDate),
                @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(endDate), name, description);
    }-*/;

    public void setShowDayView(Boolean showDayView) throws IllegalStateException {
        setAttribute("showDayView", showDayView, false);
    }

    public void setShowWeekView(Boolean showWeekView) throws IllegalStateException {
        setAttribute("showWeekView", showWeekView, false);
    }

    public void setShowMonthView(Boolean showMonthView) throws IllegalStateException {
        setAttribute("showMonthView", showMonthView, false);
    }

    /**
     * Array of days that are considered workdays when {@link com.smartgwt.client.widgets.calendar.Calendar#getShowWorkday
     * showWorkday} is true
     *
     * @param workdays workdays Default value is [1,2,3,4,5]
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setWorkdays(int[] workdays)  throws IllegalStateException {
        setAttribute("workdays", workdays, false);
    }

    private void checkCalendarLoaded () {
        if (!calendarLoaded()) {
            String errorMessage = "Attempt to create Calendar. This class requires the optional " +
                                    "Calendar module which is not present in this build.";
            SC.logWarn(errorMessage);
            throw new UnsupportedOperationException(errorMessage);
        }
    }

    /**
     * Static method indicating whether the optional Calendar module is loaded for the page.
     * The Calendar component requires this module.
     * @return true if the Calendar module is present
     */
    public static native boolean calendarLoaded() /*-{
        return ($wnd.isc.Calendar != null);
    }-*/;



    // ********************* DataBoundComponent Properties / Attributes ***********************

    public void setDataPageSize(int dataPageSize) {
        setAttribute("dataPageSize", dataPageSize, true);
    }

    public int getDataPageSize() {
        return getAttributeAsInt("dataPageSize");
    }

    public void setUseAllDataSourceFields(Boolean useAllDataSourceFields) {
        setAttribute("useAllDataSourceFields", useAllDataSourceFields, true);
    }

    public Boolean getUseAllDataSourceFields() {
        return getAttributeAsBoolean("useAllDataSourceFields");
    }

    public void setShowHiddenFields(Boolean showHiddenFields) {
        setAttribute("showHiddenFields", showHiddenFields, true);
    }

    public Boolean getShowHiddenFields() {
        return getAttributeAsBoolean("showHiddenFields");
    }

    public void setShowComplexFields(Boolean showComplexFields) {
        setAttribute("showComplexFields", showComplexFields, true);
    }

    public Boolean getShowComplexFields() {
        return getAttributeAsBoolean("showComplexFields");
    }

    public void setFetchOperation(String fetchOperation) {
        setAttribute("fetchOperation", fetchOperation, true);
    }

    public String getFetchOperation() {
        return getAttributeAsString("fetchOperation");
    }

    public void setUpdateOperation(String updateOperation) {
        setAttribute("updateOperation", updateOperation, true);
    }

    public String getUpdateOperation() {
        return getAttributeAsString("updateOperation");
    }

    public void setAddOperation(String addOperation) {
        setAttribute("addOperation", addOperation, true);
    }

    public String getAddOperation() {
        return getAttributeAsString("addOperation");
    }

    public void setRemoveOperation(String removeOperation) {
        setAttribute("removeOperation", removeOperation, true);
    }

    public String getRemoveOperation() {
        return getAttributeAsString("removeOperation");
    }

    public void setExportFields(String[] exportFields) {
        setAttribute("exportFields", exportFields, true);
    }

    public String[] getExportFields() {
        return getAttributeAsStringArray("exportFields");
    }

    public void setExportAll(Boolean exportAll) {
        setAttribute("exportAll", exportAll, true);
    }

    public Boolean getExportAll() {
        return getAttributeAsBoolean("exportAll");
    }

    public void setPreventDuplicates(Boolean preventDuplicates) throws IllegalStateException {
        setAttribute("preventDuplicates", preventDuplicates, false);
    }

    public Boolean getPreventDuplicates() {
        return getAttributeAsBoolean("preventDuplicates");
    }

    public void setDuplicateDragMessage(String duplicateDragMessage) throws IllegalStateException {
        setAttribute("duplicateDragMessage", duplicateDragMessage, false);
    }

    public String getDuplicateDragMessage() {
        return getAttributeAsString("duplicateDragMessage");
    }

    public void setAddDropValues(Boolean addDropValues) {
        setAttribute("addDropValues", addDropValues, true);
    }

    public Boolean getAddDropValues() {
        return getAttributeAsBoolean("addDropValues");
    }

    public void setDropValues(Map dropValues) {
        setAttribute("dropValues", dropValues, true);
    }

    public Map getDropValues() {
        return getAttributeAsMap("dropValues");
    }

    /**
     * Indicates whether or not this component will load its data {@link DataSource#setProgressiveLoading() progressively}
     * 
     * @see com.smartgwt.client.docs.ProgressiveLoading  
     * @see com.smartgwt.client.data.DataSource#setProgressiveLoading
     * @param progressiveLoading
     */
    public void setProgressiveLoading(Boolean progressiveLoading) {
        setAttribute("progressiveLoading", progressiveLoading, false);
    }

    /**
     * Indicates whether or not this component will load its data {@link DataSource#getProgressiveLoading() progressively}
     * 
     * @see com.smartgwt.client.docs.ProgressiveLoading
     * @see com.smartgwt.client.data.DataSource#getProgressiveLoading
     * @return
     */
    public Boolean getProgressiveLoading() {
        return getAttributeAsBoolean("progressiveLoading");
    }

    public void setUseFlatFields(Boolean useFlatFields) throws IllegalStateException {
        setAttribute("useFlatFields", useFlatFields, false);
    }

    public Boolean getUseFlatFields() {
        return getAttributeAsBoolean("useFlatFields");
    }

    public void setHiliteProperty(String hiliteProperty) {
        setAttribute("hiliteProperty", hiliteProperty, true);
    }

    public String getHiliteProperty() {
        return getAttributeAsString("hiliteProperty");
    }

    /** 
     * Shows a FieldPicker interface allowing end-users to rearrange the order and visibiility
     * of the fields in the associated DataBoundComponent.
     */
    public native void editFields() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.editFields();
    }-*/;

    /**
     * Shows a HiliteEditor interface allowing end-users to edit the data-hilites currently in use by this DataBoundComponent.
     */
    public native void editHilites() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.editHilites();
    }-*/;

    /**
     * Get the current hilites encoded as a String, for saving.
     *
     * @return the hilite state
     */
    public native String getHiliteState()  /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        return self.getHiliteState();
    }-*/;

    /**
     * Set the current hilites based on a hiliteState String previously returned from getHilitesState.
     *
     * @param hiliteState hilites state encoded as a String
     */
    public native void setHiliteState(String hiliteState)  /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        return self.setHiliteState(hiliteState);
    }-*/;

    /**
     * Accepts an array of hilite objects and applies them to this DataBoundComponent. See also {@link #getHilites() getHilites} for a method of
     * retrieving the hilite array for storage, including hilites manually added by the user.
     *
     * @param hilites array of hilite objects
     */
    public native void setHilites(Hilite[] hilites)/*-{
        var isCreated = this.@com.smartgwt.client.widgets.BaseWidget::isCreated()();
        var hilitesJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(hilites);
        if (isCreated) {
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.setHilites(hilitesJS);
        } else {
            var obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.hilites = hilitesJS;
        }
    }-*/;

    /**
     * Return the set of hilite-objects currently applied to this DataBoundComponent. These can be saved for
     * storage and then restored to a component later via setHilites().
     *
     * @return array of hilite objects
     */
    public native Hilite[] getHilites()/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var hilitesJS = self.getHilites();
        return @com.smartgwt.client.util.ConvertTo::arrayOfHilite(Lcom/google/gwt/core/client/JavaScriptObject;)(hilitesJS);
    }-*/;

    public void setDragDataAction(DragDataAction dragDataAction) {
        setAttribute("dragDataAction", dragDataAction.getValue(), true);
    }

    public DragDataAction getDragDataAction() {
        return EnumUtil.getEnum(DragDataAction.values(), getAttribute("dragDataAction"));
    }

    public void setDragTrackerStyle(String dragTrackerStyle) {
        setAttribute("dragTrackerStyle", dragTrackerStyle, true);
    }

    public String getDragTrackerStyle() {
        return getAttributeAsString("dragTrackerStyle");
    }

    public void setCanAddFormulaFields(Boolean canAddFormulaFields) {
        setAttribute("canAddFormulaFields", canAddFormulaFields, true);
    }

    public native void addSummaryField() /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.addSummaryField();
     }-*/;

    public native void addFormulaField() /*-{
       var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
       self.addFormulaField();
    }-*/;

    public Boolean getCanAddFormulaFields() {
        return getAttributeAsBoolean("canAddFormulaFields");
    }

    public void setAddFormulaFieldText(String addFormulaFieldText) {
        setAttribute("addFormulaFieldText", addFormulaFieldText, true);
    }

    public String getAddFormulaFieldText() {
        return getAttributeAsString("addFormulaFieldText");
    }

    public void setEditFormulaFieldText(String editFormulaFieldText) {
        setAttribute("editFormulaFieldText", editFormulaFieldText, true);
    }

    public String getEditFormulaFieldText() {
        return getAttributeAsString("editFormulaFieldText");
    }

    public void setCanAddSummaryFields(Boolean canAddSummaryFields) {
        setAttribute("canAddSummaryFields", canAddSummaryFields, true);
    }

    public Boolean getCanAddSummaryFields() {
        return getAttributeAsBoolean("canAddSummaryFields");
    }

    public void setAddSummaryFieldText(String addSummaryFieldText) {
        setAttribute("addSummaryFieldText", addSummaryFieldText, true);
    }

    public String getAddSummaryFieldText() {
        return getAttributeAsString("addSummaryFieldText");
    }

    public void setEditSummaryFieldText(String editSummaryFieldText) {
        setAttribute("editSummaryFieldText", editSummaryFieldText, true);
    }

    public String getEditSummaryFieldText() {
        return getAttributeAsString("editSummaryFieldText");
    }

    // ********************* Methods ***********************
    /**
     * Filters all objects according to the AdvancedCriteria passed
     *
     * @param adCriteria AdvancedCriteria to use to filter results
     *
     * @return all matching Objects or null if none found
     */
    public native Record[] findAll(AdvancedCriteria adCriteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = self.findAll(adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()());
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(adCriteria)){
    		var criteriaJ = adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        return recordsJS == null || recordsJS === undefined ? null : @com.smartgwt.client.data.Record::convertToRecordArray(Lcom/google/gwt/core/client/JavaScriptObject;)(recordsJS);
    }-*/;
    
    /**
     * Filters all objects according to the AdvancedCriteria passed and returns the first matching object or null if not found
     *
     * @param adCriteria AdvancedCriteria to use to filter results
     *
     * @return first matching object or null if not found
     */
    public native Record find(AdvancedCriteria adCriteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordJS = self.find(adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()());
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(adCriteria)){
    		var criteriaJ = adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        return recordJS == null || recordJS === undefined ? null : @com.smartgwt.client.data.Record::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(recordJS);
    }-*/;
    
    /**
     * Finds the index of the first Record that matches with the AdvacendCriteria passed.
     * @param adCriteria AdvancedCriteria to use to filter results
     *
     * @return index of the first matching Record or -1 if not found
     */
    public native int findIndex(AdvancedCriteria adCriteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(adCriteria)){
    		var criteriaJ = adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        return self.findIndex(adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;
    
    /**
     * Like {@link RecordList#findIndex}, but considering the startIndex and endIndex parameters.
     * @param startIndex first index to consider
     * @param adCriteria AdvancedCriteria to use to filter results
     * @param endIndex last index to consider
     * 
     * @return index of the first matching Record or -1 if not found
     */
    public native int findNextIndex(int startIndex, AdvancedCriteria adCriteria, int endIndex) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(adCriteria)){
    		var criteriaJ = adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        return self.findNextIndex(startIndex, adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()(), null, endIndex);
    }-*/;
    
    /**
     * Like {@link RecordList#findIndex}, but considering the startIndex parameter.
     * @param startIndex first index to consider
     * @param adCriteria AdvancedCriteria to use to filter results
     * 
     * @return index of the first matching Record or -1 if not found
     */
    public native int findNextIndex(int startIndex, AdvancedCriteria adCriteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(adCriteria)){
    		var criteriaJ = adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        return self.findNextIndex(startIndex, adCriteria.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    public native void selectRecord(Record record)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordJS = record.@com.smartgwt.client.data.Record::getJsObj()();
        self.selectRecord(recordJS);
     }-*/;

    public native void selectRecord(int record)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.selectRecord(record);
     }-*/;

    public native void selectRecord(int record, boolean newState)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.selectRecord(record, newState);
     }-*/;

    public native void selectRecord(Record record, boolean newState)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordJS = record.@com.smartgwt.client.data.Record::getJsObj()();
        self.selectRecord(recordJS, newState);
     }-*/;

    public native void selectRecords(int[] records)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([I)(records);
        self.selectRecord(recordsJS);
     }-*/;

    public native void selectRecords(int[] records, boolean newState)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([I)(records);
        self.selectRecords(recordsJS, newState);
     }-*/;

    public native void selectRecords(Record[] records)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(records);
        self.selectRecords(recordsJS);
     }-*/;

    public native void selectRecords(Record[] records, boolean newState)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(records);
        self.selectRecords(recordsJS, newState);
     }-*/;

    public native void deselectRecord(Record record)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordJS = record.@com.smartgwt.client.data.Record::getJsObj()();
        self.deselectRecord(recordJS);
     }-*/;

    public native void deselectRecord(int record)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.deselectRecord(record);
     }-*/;

    public native void deselectRecords(int[] records)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([I)(records);
        self.deselectRecords(recordsJS);
     }-*/;

    public native void deselectRecords(Record[] records)/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(records);
        self.deselectRecords(recordsJS);
     }-*/;

    public native void selectAllRecords() /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.selectAllRecords();
     }-*/;

    public native void deselectAllRecords() /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.deselectAllRecords();
     }-*/;

    public native Boolean anySelected() /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         var retVal =self.anySelected();
         if(retVal == null || retVal === undefined) {
             return null;
         } else {
             return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(retVal);
         }
     }-*/;

    public native void enableHilite(String hiliteID) /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.enableHilite(hiliteID);
     }-*/;

    public native void enableHilite(String hiliteID, boolean enable) /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.enableHilite(hiliteID, enable);
     }-*/;

    public native void disableHilite(String hiliteID) /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.disableHilite(hiliteID);
     }-*/;

    public native void enableHiliting() /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.enableHiliting();
     }-*/;

    public native void enableHiliting(boolean enable) /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.enableHiliting(enable);
     }-*/;

    public native void disableHiliting() /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         self.disableHiliting();
     }-*/;

    public native Record[] getDragData() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordsJS = self.getDragData();
        return @com.smartgwt.client.data.Record::convertToRecordArray(Lcom/google/gwt/core/client/JavaScriptObject;)(recordsJS);
     }-*/;

    public native void transferSelectedData(DataBoundComponent source) /*-{
         var self = this.@com.smartgwt.client.widgets.DataBoundComponent::getOrCreateJsObj()();
         self.transferSelectedData(source.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
     }-*/;

    public native void transferSelectedData(DataBoundComponent source, int index) /*-{
         var self = this.@com.smartgwt.client.widgets.DataBoundComponent::getOrCreateJsObj()();
         self.transferSelectedData(source.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), index);
     }-*/;

    public native int getRecordIndex(Record record) /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         return self.getRecordIndex(record.@com.smartgwt.client.core.DataClass::getJsObj()());
     }-*/;

    public native String getTitleFieldValue(Record record) /*-{
         var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
         return self.getTitleFieldValue(record);
     }-*/;

    public void setTitleField(String titleField) {
        setAttribute("titleField", titleField, true);
    }

    public String getTitleField() {
        return getAttributeAsString("titleField");
    }

    public void setDataSource(DataSource dataSource) {
    	if(dataSource==null) {
    		throw new IllegalArgumentException("Invalid call to setDataSource() passing null.  If you're having trouble with loading DataSources, please see the following FAQ: http://forums.smartclient.com/showthread.php?t=8159#aDSLoad");
    	}
        setAttribute("dataSource", dataSource.getOrCreateJsObj(), true);
    }

    public DataSource getDataSource() {
        return DataSource.getOrCreateRef(getAttributeAsJavaScriptObject("dataSource"));
    }

    public void setAutoFetchData(Boolean autoFetchData) throws IllegalStateException {
        setAttribute("autoFetchData", autoFetchData, false);
    }

    public Boolean getAutoFetchData() {
        return getAttributeAsBoolean("autoFetchData");
    }

    public void setAutoFetchTextMatchStyle(TextMatchStyle autoFetchTextMatchStyle) throws IllegalStateException {
        setAttribute("autoFetchTextMatchStyle", autoFetchTextMatchStyle.getValue(), false);
    }

    public TextMatchStyle getAutoFetchTextMatchStyle() {
        return TextMatchStyle.valueOf(getAttributeAsString("autoFetchTextMatchStyle"));
    }

    public void setAutoFetchAsFilter(Boolean autoFetchAsFilter) throws IllegalStateException {
        setAttribute("autoFetchAsFilter", autoFetchAsFilter, false);
    }

    public Boolean getAutoFetchAsFilter() {
        return getAttributeAsBoolean("autoFetchAsFilter");
    }

    public void setInitialCriteria(Criteria initialCriteria) throws IllegalStateException {
        setAttribute("initialCriteria", initialCriteria.getJsObj(), false);
    }

    public Criteria getInitialCriteria() {
        return new Criteria(getAttributeAsJavaScriptObject("initialCriteria"));
    }

    public native void fetchData() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.fetchData();
    }-*/;

    public native void fetchData(Criteria criteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(criteria)){
    		var criteriaJ = criteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        self.fetchData(criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()());
    }-*/;

    public native void fetchData(Criteria criteria, DSCallback callback) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(criteria)){
    		var criteriaJ = criteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        self.fetchData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }));
    }-*/;

    public native void fetchData(Criteria criteria, DSCallback callback, DSRequest requestProperties) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        var requestPropertiesJS = requestProperties == null ? null : requestProperties.@com.smartgwt.client.core.DataClass::getJsObj()();
    	if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(criteria)){
    		var criteriaJ = criteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        self.fetchData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }), requestPropertiesJS);
    }-*/;

    public native void filterData() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.filterData();
    }-*/;

    public native void filterData(Criteria criteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.filterData(criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()());
    }-*/;

    public native void filterData(Criteria criteria, DSCallback callback) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(criteria)){
    		var criteriaJ = criteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        self.filterData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }));
    }-*/;

    public native void filterData(Criteria criteria, DSCallback callback, DSRequest requestProperties) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        var requestPropertiesJS = requestProperties == null ? null : requestProperties.@com.smartgwt.client.core.DataClass::getJsObj()();
        if(@com.smartgwt.client.data.Criterion::instanceOf(Ljava/lang/Object;)(criteria)){
    		var criteriaJ = criteria.@com.smartgwt.client.core.DataClass::getJsObj()();
	    	@com.smartgwt.client.util.JSOHelper::setAttribute(Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Ljava/lang/String;)(criteriaJ,"_constructor","AdvancedCriteria");
	    }
        self.filterData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }), requestPropertiesJS);
    }-*/;

    public native void invalidateCache() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.invalidateCache();
    }-*/;

    public ResultSet getResultSet() {
        JavaScriptObject dataJS = getAttributeAsJavaScriptObject("data");
        if(dataJS == null) return null;
        if(!ResultSet.isResultSet(dataJS)) {
            SC.logWarn("getResultSet(): data is not a ResultSet; returning null " +
                "(if grouped, use getOriginalResultSet(); if unbound, use getRecordList(); " +
                "can only be called on DataBoundComponents after initial data has been fetched)");
            return null;
        }
        return ResultSet.getOrCreateRef(dataJS);
    }

    public native RecordList getRecordList() /*-{
        var dataJS = this.@com.smartgwt.client.widgets.DataBoundComponent::getDataAsJSList()();
        if (dataJS == null) return null;
        if ($wnd.isc.isA.ResultSet(dataJS)) {
            return this.@com.smartgwt.client.widgets.DataBoundComponent::getResultSet()();
        } else if ($wnd.isc.isA.ResultTree(dataJS)) {
            return @com.smartgwt.client.widgets.tree.ResultTree::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(dataJS);
        } else if ($wnd.isc.isA.Tree(dataJS)) {
            return @com.smartgwt.client.widgets.tree.Tree::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(dataJS);
        }
        return @com.smartgwt.client.data.RecordList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dataJS);
    }-*/;

    public native JavaScriptObject getDataAsJSList() /*-{
    	var self = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
    	if (self == null) return null;
    	return self.getDataAsList();
    	
    }-*/;

    public native void exportData() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.exportData();
    }-*/;

    public native void exportData(DSRequest requestProperties) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.exportData(requestProperties.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    /**
     * Add a fetchData handler.
     * <p>
     * Notification function fired on fetchData() or filterData()
     *
     * @param handler the filterData handler
     * @return {@link com.google.gwt.event.shared.HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addFetchDataHandler(FetchDataHandler handler) {
        if(getHandlerCount(FetchDataEvent.getType()) == 0) setupFetchDataEvent();
        return doAddHandler(handler, FetchDataEvent.getType());
    }

    private native void setupFetchDataEvent() /*-{
        var obj = null;
        var selfJ = this;
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({onFetchData:$debox($entry(function(){
                    var param = {"criteria" : arguments[0], "requestProperties" : arguments[1]};
                    var event = @com.smartgwt.client.widgets.events.FetchDataEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                }))
            });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.onFetchData = $debox($entry(function(){
                var param = {"criteria" : arguments[0], "requestProperties" : arguments[1]};
                var event = @com.smartgwt.client.widgets.events.FetchDataEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            }));
        }
    }-*/;

    /**
     * Add a {@link com.smartgwt.client.widgets.DropCompleteHandler}.  See that class's documentation for a definition of "drop complete",
     * and how it differs from "drag complete" ({@link com.smartgwt.client.widgets.DragCompleteHandler}).
     *
     * @param handler the DropCompleteHandler
     * @return {@link com.google.gwt.event.shared.HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDropCompleteHandler(DropCompleteHandler handler) {
        if(getHandlerCount(DropCompleteEvent.getType()) == 0) setupDropCompleteEvent();
        return doAddHandler(handler, DropCompleteEvent.getType());
    }

    private native void setupDropCompleteEvent() /*-{
        var obj = null;
        var selfJ = this;
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({dropComplete:$debox($entry(function(){
                    var param = {"transferredRecords" : arguments[0]};
                    var event = @com.smartgwt.client.widgets.events.DropCompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                }))
            });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.dropComplete = $debox($entry(function(){
                var param = {"transferredRecords" : arguments[0]};
                var event = @com.smartgwt.client.widgets.events.DropCompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            }));
        }
    }-*/;

    /**
     * Add a {@link com.smartgwt.client.widgets.DragCompleteHandler}.  See that class's documentation for a definition of "drag complete",
     * and how it differs from "drop complete" ({@link com.smartgwt.client.widgets.DropCompleteHandler}).
     *
     * @param handler the DropCompleteHandler
     * @return {@link com.google.gwt.event.shared.HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDragCompleteHandler(DragCompleteHandler handler) {
        if(getHandlerCount(DragCompleteEvent.getType()) == 0) setupDragCompleteEvent();
        return doAddHandler(handler, DragCompleteEvent.getType());
    }

    private native void setupDragCompleteEvent() /*-{
        var obj = null;
        var selfJ = this;
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({dragComplete:$debox($entry(function(){
                    var event = @com.smartgwt.client.widgets.events.DragCompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)();
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                }))
            });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.dragComplete = $debox($entry(function(){
                var event = @com.smartgwt.client.widgets.events.DragCompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)();
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            }));
        }
    }-*/;

    public LogicalStructureObject setLogicalStructure(CalendarLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.addEventButtonHoverText = getAttributeAsString("addEventButtonHoverText");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.addEventButtonHoverText:" + t.getMessage() + "\n";
        }
        try {
            s.alternateLaneStyles = getAttributeAsString("alternateLaneStyles");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.alternateLaneStyles:" + t.getMessage() + "\n";
        }
        try {
            s.baseStyle = getAttributeAsString("baseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.baseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.cancelButtonTitle = getAttributeAsString("cancelButtonTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.cancelButtonTitle:" + t.getMessage() + "\n";
        }
        try {
            s.canCreateEvents = getAttributeAsString("canCreateEvents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canCreateEvents:" + t.getMessage() + "\n";
        }
        try {
            s.canDeleteEvents = getAttributeAsString("canDeleteEvents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canDeleteEvents:" + t.getMessage() + "\n";
        }
        try {
            s.canDragEventField = getAttributeAsString("canDragEventField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canDragEventField:" + t.getMessage() + "\n";
        }
        try {
            s.canDragEvents = getAttributeAsString("canDragEvents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canDragEvents:" + t.getMessage() + "\n";
        }
        try {
            s.canEditEvents = getAttributeAsString("canEditEvents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canEditEvents:" + t.getMessage() + "\n";
        }
        try {
            s.canEditField = getAttributeAsString("canEditField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canEditField:" + t.getMessage() + "\n";
        }
        try {
            s.canEditLane = getAttributeAsString("canEditLane");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canEditLane:" + t.getMessage() + "\n";
        }
        try {
            s.canEditLaneField = getAttributeAsString("canEditLaneField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canEditLaneField:" + t.getMessage() + "\n";
        }
        try {
            s.canRemoveEvents = getAttributeAsString("canRemoveEvents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canRemoveEvents:" + t.getMessage() + "\n";
        }
        try {
            s.canRemoveField = getAttributeAsString("canRemoveField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canRemoveField:" + t.getMessage() + "\n";
        }
        try {
            s.canReorderLanes = getAttributeAsString("canReorderLanes");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canReorderLanes:" + t.getMessage() + "\n";
        }
        try {
            s.canResizeTimelineEvents = getAttributeAsString("canResizeTimelineEvents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.canResizeTimelineEvents:" + t.getMessage() + "\n";
        }
        try {
            s.chosenDate = getAttributeAsString("chosenDate");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.chosenDate:" + t.getMessage() + "\n";
        }
        try {
            s.columnsPerPage = getAttributeAsString("columnsPerPage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.columnsPerPage:" + t.getMessage() + "\n";
        }
        try {
            s.currentViewName = getAttributeAsString("currentViewName");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.currentViewName:" + t.getMessage() + "\n";
        }
        try {
            s.data = getAttributeAsStringArray("data");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.dataArray:" + t.getMessage() + "\n";
        }
        try {
            s.dataFetchMode = getAttributeAsString("dataFetchMode");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.dataFetchMode:" + t.getMessage() + "\n";
        }
        try {
            s.dateEditingStyle = getAttributeAsString("dateEditingStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.dateEditingStyle:" + t.getMessage() + "\n";
        }
        try {
            s.dateFormatter = getAttributeAsString("dateFormatter");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.dateFormatter:" + t.getMessage() + "\n";
        }
        try {
            s.datePickerHoverText = getAttributeAsString("datePickerHoverText");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.datePickerHoverText:" + t.getMessage() + "\n";
        }
        try {
            s.dayBodyBaseStyle = getAttributeAsString("dayBodyBaseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.dayBodyBaseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.dayHeaderBaseStyle = getAttributeAsString("dayHeaderBaseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.dayHeaderBaseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.dayViewTitle = getAttributeAsString("dayViewTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.dayViewTitle:" + t.getMessage() + "\n";
        }
        try {
            s.defaultTimelineColumnSpan = getAttributeAsString("defaultTimelineColumnSpan");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.defaultTimelineColumnSpan:" + t.getMessage() + "\n";
        }
        try {
            s.descriptionField = getAttributeAsString("descriptionField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.descriptionField:" + t.getMessage() + "\n";
        }
        try {
            s.detailsButtonTitle = getAttributeAsString("detailsButtonTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.detailsButtonTitle:" + t.getMessage() + "\n";
        }
        try {
            s.disableWeekends = getAttributeAsString("disableWeekends");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.disableWeekends:" + t.getMessage() + "\n";
        }
        try {
            s.endDate = getAttributeAsString("endDate");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.endDate:" + t.getMessage() + "\n";
        }
        try {
            s.endDateField = getAttributeAsString("endDateField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.endDateField:" + t.getMessage() + "\n";
        }
        try {
            s.eventAutoArrange = getAttributeAsString("eventAutoArrange");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventAutoArrange:" + t.getMessage() + "\n";
        }
        try {
            s.eventDescriptionFieldTitle = getAttributeAsString("eventDescriptionFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventDescriptionFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.eventDragGap = getAttributeAsString("eventDragGap");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventDragGap:" + t.getMessage() + "\n";
        }
        try {
            s.eventEndDateFieldTitle = getAttributeAsString("eventEndDateFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventEndDateFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.eventLaneFieldTitle = getAttributeAsString("eventLaneFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventLaneFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.eventNameFieldTitle = getAttributeAsString("eventNameFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventNameFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.eventOverlap = getAttributeAsString("eventOverlap");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventOverlap:" + t.getMessage() + "\n";
        }
        try {
            s.eventOverlapIdenticalStartTimes = getAttributeAsString("eventOverlapIdenticalStartTimes");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventOverlapIdenticalStartTimes:" + t.getMessage() + "\n";
        }
        try {
            s.eventOverlapPercent = getAttributeAsString("eventOverlapPercent");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventOverlapPercent:" + t.getMessage() + "\n";
        }
        try {
            s.eventSnapGap = getAttributeAsString("eventSnapGap");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventSnapGap:" + t.getMessage() + "\n";
        }
        try {
            s.eventStartDateFieldTitle = getAttributeAsString("eventStartDateFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventStartDateFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.eventWindowStyle = getAttributeAsString("eventWindowStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventWindowStyle:" + t.getMessage() + "\n";
        }
        try {
            s.eventWindowStyleField = getAttributeAsString("eventWindowStyleField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.eventWindowStyleField:" + t.getMessage() + "\n";
        }
        try {
            s.firstDayOfWeek = getAttributeAsString("firstDayOfWeek");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.firstDayOfWeek:" + t.getMessage() + "\n";
        }
        try {
            s.headerLevels = getHeaderLevels();
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.headerLevelsArray:" + t.getMessage() + "\n";
        }
        try {
            s.invalidDateMessage = getAttributeAsString("invalidDateMessage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.invalidDateMessage:" + t.getMessage() + "\n";
        }
        try {
            s.laneFields = getLaneFields();
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.laneFieldsArray:" + t.getMessage() + "\n";
        }
        try {
            s.laneNameField = getAttributeAsString("laneNameField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.laneNameField:" + t.getMessage() + "\n";
        }
        try {
            s.lanes = getLanes();
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.lanesArray:" + t.getMessage() + "\n";
        }
        try {
            s.leadingDateField = getAttributeAsString("leadingDateField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.leadingDateField:" + t.getMessage() + "\n";
        }
        try {
            s.minimumDayHeight = getAttributeAsString("minimumDayHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.minimumDayHeight:" + t.getMessage() + "\n";
        }
        try {
            s.minLaneWidth = getAttributeAsString("minLaneWidth");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.minLaneWidth:" + t.getMessage() + "\n";
        }
        try {
            s.monthViewTitle = getAttributeAsString("monthViewTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.monthViewTitle:" + t.getMessage() + "\n";
        }
        try {
            s.nameField = getAttributeAsString("nameField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.nameField:" + t.getMessage() + "\n";
        }
        try {
            s.nextButtonHoverText = getAttributeAsString("nextButtonHoverText");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.nextButtonHoverText:" + t.getMessage() + "\n";
        }
        try {
            s.otherDayBlankStyle = getAttributeAsString("otherDayBlankStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.otherDayBlankStyle:" + t.getMessage() + "\n";
        }
        try {
            s.otherDayBodyBaseStyle = getAttributeAsString("otherDayBodyBaseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.otherDayBodyBaseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.otherDayHeaderBaseStyle = getAttributeAsString("otherDayHeaderBaseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.otherDayHeaderBaseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.overlapSortSpecifiers = getOverlapSortSpecifiers();
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.overlapSortSpecifiersArray:" + t.getMessage() + "\n";
        }
        try {
            s.previousButtonHoverText = getAttributeAsString("previousButtonHoverText");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.previousButtonHoverText:" + t.getMessage() + "\n";
        }
        try {
            s.rowHeight = getAttributeAsString("rowHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.rowHeight:" + t.getMessage() + "\n";
        }
        try {
            s.saveButtonTitle = getAttributeAsString("saveButtonTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.saveButtonTitle:" + t.getMessage() + "\n";
        }
        try {
            s.scrollToWorkday = getAttributeAsString("scrollToWorkday");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.scrollToWorkday:" + t.getMessage() + "\n";
        }
        try {
            s.selectedCellStyle = getAttributeAsString("selectedCellStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.selectedCellStyle:" + t.getMessage() + "\n";
        }
        try {
            s.showAddEventButton = getAttributeAsString("showAddEventButton");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showAddEventButton:" + t.getMessage() + "\n";
        }
        try {
            s.showControlsBar = getAttributeAsString("showControlsBar");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showControlsBar:" + t.getMessage() + "\n";
        }
        try {
            s.showDateChooser = getAttributeAsString("showDateChooser");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showDateChooser:" + t.getMessage() + "\n";
        }
        try {
            s.showDatePickerButton = getAttributeAsString("showDatePickerButton");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showDatePickerButton:" + t.getMessage() + "\n";
        }
        try {
            s.showDayHeaders = getAttributeAsString("showDayHeaders");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showDayHeaders:" + t.getMessage() + "\n";
        }
        try {
            s.showDayLanes = getAttributeAsString("showDayLanes");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showDayLanes:" + t.getMessage() + "\n";
        }
        try {
            s.showDetailFields = getAttributeAsString("showDetailFields");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showDetailFields:" + t.getMessage() + "\n";
        }
        try {
            s.showEventDescriptions = getAttributeAsString("showEventDescriptions");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showEventDescriptions:" + t.getMessage() + "\n";
        }
        try {
            s.showNextButton = getAttributeAsString("showNextButton");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showNextButton:" + t.getMessage() + "\n";
        }
        try {
            s.showOtherDays = getAttributeAsString("showOtherDays");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showOtherDays:" + t.getMessage() + "\n";
        }
        try {
            s.showPreviousButton = getAttributeAsString("showPreviousButton");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showPreviousButton:" + t.getMessage() + "\n";
        }
        try {
            s.showQuickEventDialog = getAttributeAsString("showQuickEventDialog");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showQuickEventDialog:" + t.getMessage() + "\n";
        }
        try {
            s.showTimelineView = getAttributeAsString("showTimelineView");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showTimelineView:" + t.getMessage() + "\n";
        }
        try {
            s.showWeekends = getAttributeAsString("showWeekends");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showWeekends:" + t.getMessage() + "\n";
        }
        try {
            s.showWorkday = getAttributeAsString("showWorkday");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.showWorkday:" + t.getMessage() + "\n";
        }
        try {
            s.sizeEventsToGrid = getAttributeAsString("sizeEventsToGrid");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.sizeEventsToGrid:" + t.getMessage() + "\n";
        }
        try {
            s.startDate = getAttributeAsString("startDate");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.startDate:" + t.getMessage() + "\n";
        }
        try {
            s.startDateField = getAttributeAsString("startDateField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.startDateField:" + t.getMessage() + "\n";
        }
        try {
            s.timeFormatter = getAttributeAsString("timeFormatter");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.timeFormatter:" + t.getMessage() + "\n";
        }
        try {
            s.timelineGranularity = getAttributeAsString("timelineGranularity");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.timelineGranularity:" + t.getMessage() + "\n";
        }
        try {
            s.timelineUnitsPerColumn = getAttributeAsString("timelineUnitsPerColumn");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.timelineUnitsPerColumn:" + t.getMessage() + "\n";
        }
        try {
            s.timelineViewTitle = getAttributeAsString("timelineViewTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.timelineViewTitle:" + t.getMessage() + "\n";
        }
        try {
            s.todayBackgroundColor = getAttributeAsString("todayBackgroundColor");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.todayBackgroundColor:" + t.getMessage() + "\n";
        }
        try {
            s.trailingDateField = getAttributeAsString("trailingDateField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.trailingDateField:" + t.getMessage() + "\n";
        }
        try {
            s.weekEventBorderOverlap = getAttributeAsString("weekEventBorderOverlap");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.weekEventBorderOverlap:" + t.getMessage() + "\n";
        }
        try {
            s.weekPrefix = getAttributeAsString("weekPrefix");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.weekPrefix:" + t.getMessage() + "\n";
        }
        try {
            s.weekViewTitle = getAttributeAsString("weekViewTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.weekViewTitle:" + t.getMessage() + "\n";
        }
        try {
            s.workdayBaseStyle = getAttributeAsString("workdayBaseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.workdayBaseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.workdayEnd = getAttributeAsString("workdayEnd");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.workdayEnd:" + t.getMessage() + "\n";
        }
        try {
            s.workdays = getAttributeAsString("workdays");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.workdays:" + t.getMessage() + "\n";
        }
        try {
            s.workdayStart = getAttributeAsString("workdayStart");
        } catch (Throwable t) {
            s.logicalStructureErrors += "Calendar.workdayStart:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        CalendarLogicalStructure s = new CalendarLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}

