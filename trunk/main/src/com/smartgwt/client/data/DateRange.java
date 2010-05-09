/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * is published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.smartgwt.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.smartgwt.client.core.JsObject;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.widgets.form.fields.RelativeDateItem;

import java.util.Date;

/**
 * A class specifying a range of dates. Values are start and end. If either value is omitted, the range is assumed to be open-ended in that direction -
 * so if dateRange.start is omitted, the range will include any date earlier than the value specified in dateRange.end.
 */
public class DateRange extends JsObject {
    private Date startDate;
    private Date endDate;

    private RelativeDate relativeStartDate;
    private RelativeDate relativeEndDate;

    public DateRange() {
    }
        

    public Date getStartDate() {
        if(startDate != null) return startDate;
        if(relativeStartDate != null) return RelativeDateItem.getAbsoluteDate(relativeStartDate);
        return null;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
        this.relativeStartDate = null;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
        this.relativeEndDate = null;
    }

    public RelativeDate getRelativeStartDate() {
        return relativeStartDate;
    }

    public void setRelativeStartDate(RelativeDate relativeStartDate) {
        this.relativeStartDate = relativeStartDate;
        this.startDate = null;
    }

    public RelativeDate getRelativeEndDate() {
        return relativeEndDate;
    }

    public void setRelativeEndDate(RelativeDate relativeEndDate) {
        this.relativeEndDate = relativeEndDate;
        this.endDate = null;
    }


    @Override
    public JavaScriptObject getJsObj() {
        JavaScriptObject jsObj = JavaScriptObject.createObject();
        if (startDate != null) {
            JSOHelper.setAttribute(jsObj, "start", startDate);
        }
        if (relativeStartDate != null) {
            if(relativeStartDate.getValue().startsWith("$")) {
                JSOHelper.setAttribute(jsObj, "start", relativeStartDate.getValue());
            } else {
                JSOHelper.setAttribute(jsObj, "start", relativeStartDate.getJsObj());
            }
        }
        if (endDate != null) {
            JSOHelper.setAttribute(jsObj, "end", endDate);
        }
        if (relativeEndDate != null) {
            if(relativeEndDate.getValue().startsWith("$")) {
                JSOHelper.setAttribute(jsObj, "end", relativeEndDate.getValue());
            } else {
                JSOHelper.setAttribute(jsObj, "end", relativeEndDate.getJsObj());
            }
        }
        return jsObj;
    }
}
