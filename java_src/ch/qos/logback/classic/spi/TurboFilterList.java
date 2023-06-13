package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class TurboFilterList extends CopyOnWriteArrayList<TurboFilter> {
    private static final long serialVersionUID = 1;

    public FilterReply getTurboFilterChainDecision(InterfaceC41482gM2 interfaceC41482gM2, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (size() == 1) {
            try {
                return get(0).decide(interfaceC41482gM2, logger, level, str, objArr, th);
            } catch (IndexOutOfBoundsException unused) {
                return FilterReply.NEUTRAL;
            }
        }
        for (Object obj : toArray()) {
            FilterReply decide = ((TurboFilter) obj).decide(interfaceC41482gM2, logger, level, str, objArr, th);
            if (decide == FilterReply.DENY || decide == FilterReply.ACCEPT) {
                return decide;
            }
        }
        return FilterReply.NEUTRAL;
    }
}