package org.erlide.launch.debug.events;

import org.erlide.jinterface.ErlLogger;
import org.erlide.launch.debug.model.ErlangDebugTarget;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.ericsson.otp.erlang.OtpErlangPid;

public class MetaEvent implements DebuggerEvent {

    private final OtpErlangObject event;
    private final OtpErlangPid metaPid;

    // private final OtpErlangPid pid;

    public MetaEvent(final OtpErlangPid metaPid, final OtpErlangObject event) {
        this.metaPid = metaPid;
        this.event = event;
    }

    @Override
    public void execute(final ErlangDebugTarget debugTarget) {
        ErlLogger
                .debug("unhandled meta event: %s %s", getMetaPid(), getEvent());
    }

    public OtpErlangPid getMetaPid() {
        return metaPid;
    }

    public OtpErlangObject getEvent() {
        return event;
    }

    public OtpErlangPid getPid(final ErlangDebugTarget debugTarget) {
        return debugTarget.getPidFromMeta(metaPid);
    }

}
