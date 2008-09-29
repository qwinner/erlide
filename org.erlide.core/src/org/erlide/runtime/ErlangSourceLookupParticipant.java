package org.erlide.runtime;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.erlide.runtime.debug.ErlangStackFrame;

public class ErlangSourceLookupParticipant extends
		AbstractSourceLookupParticipant {

	public ErlangSourceLookupParticipant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSourceName(final Object object) throws CoreException {
		if (!(object instanceof ErlangStackFrame)) {
			return null;
		}
		final ErlangStackFrame f = (ErlangStackFrame) object;
		return f.getModule() + ".erl";
	}

}