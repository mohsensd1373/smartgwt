package com.smartgwt.client.types;


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
 
/**
 * What kind of mask to use for masking dragged element.
 */
public enum DragMaskType implements ValueEnum {
    /**
     * creates an element with ordinary HTML content that will block events
     */
    DIV("div"),
    /**
     * creates an iframe with empty content
     */
    IFRAME("iframe"),
    /**
     * hides the contents of this widget temporarily
     */
    HIDE("hide");
    private String value;

    DragMaskType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
