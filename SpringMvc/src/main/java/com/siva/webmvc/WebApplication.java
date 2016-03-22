/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siva.webmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author siva
 */
public class WebApplication implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.siva.webmvc");
        sc.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = sc.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/mvc/*");
    }
    
    
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//            AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//            context.setServletContext(servletContext);
//            context.register(AppConfig.class);
//            Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
//            dynamic.addMapping("/");
//            dynamic.setLoadOnStartup(1);
//    }
    
}
