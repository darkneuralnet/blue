package ch.qos.logback.classic.android;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
/* loaded from: classes.dex */
public class BasicLogcatConfigurator {
    private BasicLogcatConfigurator() {
    }

    public static void configure(LoggerContext loggerContext) {
        StatusManager statusManager = loggerContext.getStatusManager();
        if (statusManager != null) {
            statusManager.add(new InfoStatus("Setting up default configuration.", loggerContext));
        }
        LogcatAppender logcatAppender = new LogcatAppender();
        logcatAppender.setContext(loggerContext);
        logcatAppender.setName("logcat");
        PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
        patternLayoutEncoder.setContext(loggerContext);
        patternLayoutEncoder.setPattern("%msg");
        patternLayoutEncoder.start();
        logcatAppender.setEncoder(patternLayoutEncoder);
        logcatAppender.start();
        loggerContext.getLogger("ROOT").addAppender(logcatAppender);
    }

    public static void configureDefaultContext() {
        configure((LoggerContext) C34162Kx2.m98063h());
    }
}