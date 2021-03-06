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
package org.jspare.server.session;

import org.jspare.core.container.Component;

/**
 * The Interface SessionManager.
 *
 * @author pflima
 * @since 30/03/2016
 */
@Component
public interface SessionManager {

	/** The Constant SESSION_ID_KEY. */
	String SESSION_ID_KEY = "jsid";

	/**
	 * Gets the session context.
	 *
	 * @param sessionId
	 *            the session id
	 * @return the session context
	 */
	SessionContext getSessionContext(String sessionId);

	/**
	 * Invalidate.
	 *
	 * @param sessionId
	 *            the session id
	 */
	void invalidate(String sessionId);

	/**
	 * Next session context.
	 *
	 * @return the session context
	 */
	SessionContext nextSessionContext();

	/**
	 * Renew.
	 *
	 * @param sessionId
	 *            the session id
	 * @return true, if successful
	 */
	boolean renew(String sessionId);

	/**
	 * Update session.
	 *
	 * @param sessionId
	 *            the session id
	 * @param session
	 *            the session
	 */
	void updateSession(String sessionId, SessionContext session);
}
