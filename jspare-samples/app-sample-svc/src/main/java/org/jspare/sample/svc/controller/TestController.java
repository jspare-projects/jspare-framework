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
package org.jspare.sample.svc.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jspare.server.controller.Controller;
import org.jspare.server.mapping.Mapping;
import org.jspare.server.mapping.Method;
import org.jspare.server.mapping.Namespace;
import org.jspare.server.mapping.Type;

@Namespace("tests")
public class TestController extends Controller {

	@Method(Type.POST)
	@Mapping("formUpload")
	public void upload() {

		byte[] image = entity().asBytes();
		try {
			FileUtils.writeByteArrayToFile(new File("test.zip"), image);
		} catch (IOException e) {

			error(e);
		}
		success(image);
	}
}