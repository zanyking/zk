/* B01259FormKeyNotWork.java

	Purpose:
		
	Description:
		
	History:
		Jul 23, 2012, Created by Ian Tsai(Zanyking)

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under ZOL in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zktest.bind.issue;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ian Y.T Tsai(zanyking)
 *
 */
public class B01259FormKeyNotWork {

	
	private Map<String, String> hash = new HashMap<String, String>();
	private String key = "key";

	public B01259FormKeyNotWork() {
		this.hash.put("key", "Hello Word!!!");
	}

	public Map<String, String> getHash() {
		return this.hash;
	}

	public String getKey() {
		return this.key;
	}

	public void setHash(final Map<String, String> hash) {
		this.hash = hash;
	}

	public void setKey(final String key) {
		this.key = key;
	}
}
