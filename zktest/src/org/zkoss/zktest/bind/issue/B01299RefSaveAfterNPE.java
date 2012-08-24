/* B01299RefSaveAfterNPE.java

	Purpose:
		
	Description:
		
	History:
		Aug 20, 2012, Created by Ian Tsai(Zanyking)

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under ZOL in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zktest.bind.issue;

import org.zkoss.bind.annotation.Command;

/**
 * @author Ian Y.T Tsai(zanyking)
 *
 */
public class B01299RefSaveAfterNPE {
	private String text = "text";
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText(){
		return text;
	}
	@Command
	public void periodSelected() {
		System.out.println(text);
	}
}
