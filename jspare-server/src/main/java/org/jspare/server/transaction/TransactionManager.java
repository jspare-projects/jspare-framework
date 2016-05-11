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
package org.jspare.server.transaction;

import java.util.Optional;

import org.jspare.core.container.Component;

/**
 * The Interface TransactionManager.
 *
 * @author pflima
 * @since 30/03/2016
 */
@Component
public interface TransactionManager {

	/**
	 * End.
	 *
	 * @param tid
	 *            the tid
	 */
	public void end(String tid);

	/**
	 * Yield.
	 *
	 * @param bind
	 *            the bind
	 * @param transaction
	 *            the transaction
	 */
	public void yield(String bind, Transaction transaction);

	/**
	 * Gets the transaction.
	 *
	 * @param tid
	 *            the tid
	 * @return the transaction
	 */
	Optional<Transaction> getTransaction(String tid);

	/**
	 * Registry transaction.
	 *
	 * @return the transaction
	 */
	Transaction registryTransaction();
}
