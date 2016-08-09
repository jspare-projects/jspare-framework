/*
 * Copyright 2016 JSpare.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.jspare.sample.web.forvertx;

import org.jspare.core.exception.InfraException;
import org.jspare.server.application.Service;

public class Bootstrap extends Service {

	public static void main(String[] args) throws InfraException {

		new Bootstrap().start();
	}

	@Override
	protected void load() {

		super.load();

		// getServer().getRouter().addErrorHandler(Status.NOT_FOUND,
		// DefaultNotFoundErrorHandler.class);
	}

}