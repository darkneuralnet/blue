package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import java.util.Map;
/* loaded from: classes.dex */
public interface ILoggingEvent extends DeferredProcessingAware {
    Object[] getArgumentArray();

    StackTraceElement[] getCallerData();

    String getFormattedMessage();

    Level getLevel();

    LoggerContextVO getLoggerContextVO();

    String getLoggerName();

    Map<String, String> getMDCPropertyMap();

    InterfaceC41482gM2 getMarker();

    Map<String, String> getMdc();

    String getMessage();

    String getThreadName();

    IThrowableProxy getThrowableProxy();

    long getTimeStamp();

    boolean hasCallerData();

    @Override // ch.qos.logback.core.spi.DeferredProcessingAware
    void prepareForDeferredProcessing();
}
