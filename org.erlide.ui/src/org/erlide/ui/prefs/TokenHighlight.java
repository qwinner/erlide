/**
 *
 */
package org.erlide.ui.prefs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.erlide.ui.prefs.PreferenceConstants.Color;

public enum TokenHighlight {
	DEFAULT(Color.BLACK.getColor(), SWT.NORMAL),

	KEYWORD(Color.BLACK.getColor(), SWT.BOLD),

	ATOM(Color.BLACK.getColor(), SWT.NORMAL),

	RECORD(new RGB(90, 150, 0), SWT.NORMAL),

	MACRO(new RGB(50, 150, 50), SWT.NORMAL),

	BIF(new RGB(0, 80, 150), SWT.BOLD),

	GUARD(new RGB(50, 80, 150), SWT.NORMAL),

	ARROW(new RGB(0, 50, 230), SWT.NORMAL),

	CHAR(new RGB(200, 0, 250), SWT.NORMAL),

	VARIABLE(new RGB(150, 100, 0), SWT.NORMAL),

	COMMENT(Color.DARKGREEN.getColor(), SWT.NORMAL),

	ATTRIBUTE(Color.BLUE.getColor(), SWT.NORMAL),

	STRING(Color.DARKORCHID.getColor(), SWT.NORMAL),

	INTEGER(new RGB(90, 90, 180), SWT.NORMAL),

	FLOAT(Color.NAVY.getColor(), SWT.NORMAL);

	private final HighlightData defaultData;

	private TokenHighlight(RGB color, int style) {
		defaultData = new HighlightData(color, style);
	}

	public HighlightData getDefaultData() {
		return defaultData;
	}

	public String getName() {
		return toString().toLowerCase();
	}
}