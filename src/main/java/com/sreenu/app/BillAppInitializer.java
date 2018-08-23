package com.sreenu.app;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sreenu.cofig.WebConfig;

public class BillAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 @Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] {};
	   }

	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return new Class[] { WebConfig.class };
	   }

	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }

}
