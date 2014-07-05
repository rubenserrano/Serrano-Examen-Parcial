/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exa.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Ruben
 */

public class WebApp extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
return new Class<?>[]{WebAppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

    return new Class<?>[0];
    }

    @Override
    protected String[] getServletMappings() {
String mapeo[]={"/servicios/*"};
return mapeo;
    }
    
}
