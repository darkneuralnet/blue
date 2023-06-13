package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
/* loaded from: classes.dex */
public class MarkerFilter extends MatchingFilter {
    InterfaceC41482gM2 markerToMatch;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(InterfaceC41482gM2 interfaceC41482gM2, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (isStarted()) {
            if (interfaceC41482gM2 != null && interfaceC41482gM2.mo39595z2(this.markerToMatch)) {
                return this.onMatch;
            }
            return this.onMismatch;
        }
        return FilterReply.NEUTRAL;
    }

    public void setMarker(String str) {
        if (str != null) {
            this.markerToMatch = C43261jM2.m30757b(str);
        }
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.markerToMatch != null) {
            super.start();
            return;
        }
        addError("The marker property must be set for [" + getName() + "]");
    }
}
