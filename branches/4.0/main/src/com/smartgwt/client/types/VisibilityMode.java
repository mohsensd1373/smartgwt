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
 
/**
 * Settings for whether multiple sections can be in the expanded state simultaneously.
 */
public enum VisibilityMode implements ValueEnum {
    /**
     * Only one section can be expanded at a time.
     */
    MUTEX("mutex"),
    /**
     * Multiple sections can be expanded at the same time, and will share space.
     */
    MULTIPLE("multiple");
    private String value;

    VisibilityMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
