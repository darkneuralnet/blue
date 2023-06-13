package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
/* loaded from: classes.dex */
public class MDCFilter extends MatchingFilter {
    String MDCKey;
    String value;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(InterfaceC41482gM2 interfaceC41482gM2, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (isStarted()) {
            return this.value.equals(GE2.m105605b(this.MDCKey)) ? this.onMatch : this.onMismatch;
        }
        return FilterReply.NEUTRAL;
    }

    public void setMDCKey(String str) {
        this.MDCKey = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (this.value == null) {
            addError("'value' parameter is mandatory. Cannot start.");
            i = 1;
        } else {
            i = 0;
        }
        if (this.MDCKey == null) {
            addError("'MDCKey' parameter is mandatory. Cannot start.");
            i++;
        }
        if (i == 0) {
            this.start = true;
        }
    }
}
