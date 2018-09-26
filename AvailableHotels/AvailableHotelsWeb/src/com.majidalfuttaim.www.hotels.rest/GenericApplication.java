package com.majidalfuttaim.www.hotels.rest;

import com.majidalfuttaim.www.hotels.rest.resources.impl.AvailableHotelsImpl;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
@ApplicationPath("rest")
public class GenericApplication extends Application {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        // Register root resources.
        classes.add(AvailableHotelsImpl.class);

        // Register provider classes.

        return classes;
    }
}
