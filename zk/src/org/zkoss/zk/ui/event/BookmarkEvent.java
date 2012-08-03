/* BookmarkEvent.java

	Purpose:
		
	Description:
		
	History:
		Mon May 29 22:44:05     2006, Created by tomyeh

Copyright (C) 2006 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under LGPL Version 2.1 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zk.ui.event;

import java.util.Map;

import org.zkoss.zk.au.AuRequest;

/** The bookmark update event used with <code>onBookmarkChange</code>
 * to notify that user pressed BACK, FORWARD or others
 * that causes the bookmark changed (but still in the same desktop).
 *
 * <p>All root components of all pages of the desktop will
 * receives this event.
 * 
 * @author tomyeh
 * @see URIEvent
 */
public class BookmarkEvent extends Event {
	/** The bookmark name. */
	private final String _bookmark;

	/** Converts an AU request to a bookmark event.
	 * @since 5.0.0
	 */
	public static final BookmarkEvent getBookmarkEvent(AuRequest request) {
		final Map<String, Object> data = request.getData();
		final String nm = (String)data.get("");
		return new BookmarkEvent(request.getCommand(), nm);
	}

	public BookmarkEvent(String name, String bookmark) {
		super(name, null);
		_bookmark = bookmark != null ? bookmark: "";
	}

	/** Returns the bookmark name (never null).
	 */
	public String getBookmark() {
		return _bookmark;
	}
}
