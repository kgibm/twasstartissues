/*
 * Copyright 2023 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Servlet with startup.
 */
public class Startup extends HttpServlet implements ServletContextListener {
	private static final long serialVersionUID = 1L;

	public static final int STARTUP_DELAY = Integer.getInteger("STARTUP_DELAY", 10000);

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.getWriter().println("Hello World");
	}

	@Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(toString() + " started");

		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        System.out.println(toString() + " finished");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
