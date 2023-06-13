package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class Logger implements InterfaceC53103zx2, AppenderAttachable<ILoggingEvent>, Serializable {
    public static final String FQCN = "ch.qos.logback.classic.Logger";
    private static final long serialVersionUID = 5454405123156820674L;
    private transient AppenderAttachableImpl<ILoggingEvent> aai;
    private transient boolean additive = true;
    private transient List<Logger> childrenList;
    private transient int effectiveLevelInt;
    private transient Level level;
    final transient LoggerContext loggerContext;
    private String name;
    private transient Logger parent;

    public Logger(String str, Logger logger, LoggerContext loggerContext) {
        this.name = str;
        this.parent = logger;
        this.loggerContext = loggerContext;
    }

    private int appendLoopOnAppenders(ILoggingEvent iLoggingEvent) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl != null) {
            return appenderAttachableImpl.appendLoopOnAppenders(iLoggingEvent);
        }
        return 0;
    }

    private void buildLoggingEventAndAppend(String str, InterfaceC41482gM2 interfaceC41482gM2, Level level, String str2, Object[] objArr, Throwable th) {
        LoggingEvent loggingEvent = new LoggingEvent(str, this, level, str2, th, objArr);
        loggingEvent.setMarker(interfaceC41482gM2);
        callAppenders(loggingEvent);
    }

    private FilterReply callTurboFilters(InterfaceC41482gM2 interfaceC41482gM2, Level level) {
        return this.loggerContext.getTurboFilterChainDecision_0_3OrMore(interfaceC41482gM2, this, level, null, null, null);
    }

    private void filterAndLog_0_Or3Plus(String str, InterfaceC41482gM2 interfaceC41482gM2, Level level, String str2, Object[] objArr, Throwable th) {
        FilterReply turboFilterChainDecision_0_3OrMore = this.loggerContext.getTurboFilterChainDecision_0_3OrMore(interfaceC41482gM2, this, level, str2, objArr, th);
        if (turboFilterChainDecision_0_3OrMore == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_0_3OrMore == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, interfaceC41482gM2, level, str2, objArr, th);
    }

    private void filterAndLog_1(String str, InterfaceC41482gM2 interfaceC41482gM2, Level level, String str2, Object obj, Throwable th) {
        FilterReply turboFilterChainDecision_1 = this.loggerContext.getTurboFilterChainDecision_1(interfaceC41482gM2, this, level, str2, obj, th);
        if (turboFilterChainDecision_1 == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_1 == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, interfaceC41482gM2, level, str2, new Object[]{obj}, th);
    }

    private void filterAndLog_2(String str, InterfaceC41482gM2 interfaceC41482gM2, Level level, String str2, Object obj, Object obj2, Throwable th) {
        FilterReply turboFilterChainDecision_2 = this.loggerContext.getTurboFilterChainDecision_2(interfaceC41482gM2, this, level, str2, obj, obj2, th);
        if (turboFilterChainDecision_2 == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_2 == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, interfaceC41482gM2, level, str2, new Object[]{obj, obj2}, th);
    }

    private synchronized void handleParentLevelChange(int i) {
        if (this.level == null) {
            this.effectiveLevelInt = i;
            List<Logger> list = this.childrenList;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.childrenList.get(i2).handleParentLevelChange(i);
                }
            }
        }
    }

    private boolean isRootLogger() {
        return this.parent == null;
    }

    private void localLevelReset() {
        this.effectiveLevelInt = 10000;
        this.level = isRootLogger() ? Level.DEBUG : null;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public synchronized void addAppender(Appender<ILoggingEvent> appender) {
        if (this.aai == null) {
            this.aai = new AppenderAttachableImpl<>();
        }
        this.aai.addAppender(appender);
    }

    public void callAppenders(ILoggingEvent iLoggingEvent) {
        int i = 0;
        for (Logger logger = this; logger != null; logger = logger.parent) {
            i += logger.appendLoopOnAppenders(iLoggingEvent);
            if (!logger.additive) {
                break;
            }
        }
        if (i == 0) {
            this.loggerContext.noAppenderDefinedWarning(this);
        }
    }

    public Logger createChildByLastNamePart(String str) {
        Logger logger;
        if (LoggerNameUtil.getFirstSeparatorIndexOf(str) != -1) {
            throw new IllegalArgumentException("Child name [" + str + " passed as parameter, may not include [" + CoreConstants.DOT + "]");
        }
        if (this.childrenList == null) {
            this.childrenList = new CopyOnWriteArrayList();
        }
        if (isRootLogger()) {
            logger = new Logger(str, this, this.loggerContext);
        } else {
            logger = new Logger(this.name + CoreConstants.DOT + str, this, this.loggerContext);
        }
        this.childrenList.add(logger);
        logger.effectiveLevelInt = this.effectiveLevelInt;
        return logger;
    }

    public Logger createChildByName(String str) {
        if (LoggerNameUtil.getSeparatorIndexOf(str, this.name.length() + 1) == -1) {
            if (this.childrenList == null) {
                this.childrenList = new CopyOnWriteArrayList();
            }
            Logger logger = new Logger(str, this, this.loggerContext);
            this.childrenList.add(logger);
            logger.effectiveLevelInt = this.effectiveLevelInt;
            return logger;
        }
        throw new IllegalArgumentException("For logger [" + this.name + "] child name [" + str + " passed as parameter, may not include '.' after index" + (this.name.length() + 1));
    }

    public void debug(InterfaceC41482gM2 interfaceC41482gM2, String str) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.DEBUG, str, null, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl != null) {
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<ILoggingEvent> appender) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.detachAppender(appender);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(InterfaceC41482gM2 interfaceC41482gM2, String str) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.ERROR, str, null, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<ILoggingEvent> getAppender(String str) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return null;
        }
        return appenderAttachableImpl.getAppender(str);
    }

    public Logger getChildByName(String str) {
        List<Logger> list = this.childrenList;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Logger logger = this.childrenList.get(i);
            if (str.equals(logger.getName())) {
                return logger;
            }
        }
        return null;
    }

    public Level getEffectiveLevel() {
        return Level.toLevel(this.effectiveLevelInt);
    }

    public int getEffectiveLevelInt() {
        return this.effectiveLevelInt;
    }

    public Level getLevel() {
        return this.level;
    }

    public LoggerContext getLoggerContext() {
        return this.loggerContext;
    }

    @Override // p000.InterfaceC53103zx2
    public String getName() {
        return this.name;
    }

    public void info(InterfaceC41482gM2 interfaceC41482gM2, String str) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.INFO, str, null, null);
    }

    public boolean isAdditive() {
        return this.additive;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<ILoggingEvent> appender) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.isAttached(appender);
    }

    public boolean isDebugEnabled() {
        return isDebugEnabled(null);
    }

    public boolean isEnabledFor(InterfaceC41482gM2 interfaceC41482gM2, Level level) {
        FilterReply callTurboFilters = callTurboFilters(interfaceC41482gM2, level);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= level.levelInt;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isErrorEnabled() {
        return isErrorEnabled(null);
    }

    public boolean isInfoEnabled() {
        return isInfoEnabled(null);
    }

    public boolean isTraceEnabled() {
        return isTraceEnabled(null);
    }

    public boolean isWarnEnabled() {
        return isWarnEnabled(null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<ILoggingEvent>> iteratorForAppenders() {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        return appenderAttachableImpl == null ? Collections.EMPTY_LIST.iterator() : appenderAttachableImpl.iteratorForAppenders();
    }

    public void log(InterfaceC36268Tx2 interfaceC36268Tx2) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC36268Tx2.getMarker(), Level.fromLocationAwareLoggerInteger(interfaceC36268Tx2.getLevel().m18644a()), interfaceC36268Tx2.getMessage(), interfaceC36268Tx2.getArgumentArray(), interfaceC36268Tx2.getThrowable());
    }

    public Object readResolve() throws ObjectStreamException {
        return C34162Kx2.m98061j(getName());
    }

    public void recursiveReset() {
        detachAndStopAllAppenders();
        localLevelReset();
        this.additive = true;
        if (this.childrenList == null) {
            return;
        }
        Iterator it = new CopyOnWriteArrayList(this.childrenList).iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).recursiveReset();
        }
    }

    public void setAdditive(boolean z) {
        this.additive = z;
    }

    public synchronized void setLevel(Level level) {
        if (this.level == level) {
            return;
        }
        if (level == null && isRootLogger()) {
            throw new IllegalArgumentException("The level of the root logger cannot be set to null");
        }
        this.level = level;
        if (level == null) {
            Logger logger = this.parent;
            this.effectiveLevelInt = logger.effectiveLevelInt;
            level = logger.getEffectiveLevel();
        } else {
            this.effectiveLevelInt = level.levelInt;
        }
        List<Logger> list = this.childrenList;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.childrenList.get(i).handleParentLevelChange(this.effectiveLevelInt);
            }
        }
        this.loggerContext.fireOnLevelChange(this, level);
    }

    public String toString() {
        return "Logger[" + this.name + "]";
    }

    public void trace(InterfaceC41482gM2 interfaceC41482gM2, String str) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.TRACE, str, null, null);
    }

    public void warn(InterfaceC41482gM2 interfaceC41482gM2, String str) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.WARN, str, null, null);
    }

    public void debug(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj) {
        filterAndLog_1(FQCN, interfaceC41482gM2, Level.DEBUG, str, obj, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.detachAppender(str);
    }

    public void error(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj) {
        filterAndLog_1(FQCN, interfaceC41482gM2, Level.ERROR, str, obj, null);
    }

    public void info(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj) {
        filterAndLog_1(FQCN, interfaceC41482gM2, Level.INFO, str, obj, null);
    }

    public boolean isDebugEnabled(InterfaceC41482gM2 interfaceC41482gM2) {
        FilterReply callTurboFilters = callTurboFilters(interfaceC41482gM2, Level.DEBUG);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 10000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isEnabledFor(Level level) {
        return isEnabledFor(null, level);
    }

    public boolean isErrorEnabled(InterfaceC41482gM2 interfaceC41482gM2) {
        FilterReply callTurboFilters = callTurboFilters(interfaceC41482gM2, Level.ERROR);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 40000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isInfoEnabled(InterfaceC41482gM2 interfaceC41482gM2) {
        FilterReply callTurboFilters = callTurboFilters(interfaceC41482gM2, Level.INFO);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 20000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isTraceEnabled(InterfaceC41482gM2 interfaceC41482gM2) {
        FilterReply callTurboFilters = callTurboFilters(interfaceC41482gM2, Level.TRACE);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 5000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isWarnEnabled(InterfaceC41482gM2 interfaceC41482gM2) {
        FilterReply callTurboFilters = callTurboFilters(interfaceC41482gM2, Level.WARN);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 30000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public void log(InterfaceC41482gM2 interfaceC41482gM2, String str, int i, String str2, Object[] objArr, Throwable th) {
        filterAndLog_0_Or3Plus(str, interfaceC41482gM2, Level.fromLocationAwareLoggerInteger(i), str2, objArr, th);
    }

    public void trace(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj) {
        filterAndLog_1(FQCN, interfaceC41482gM2, Level.TRACE, str, obj, null);
    }

    public void warn(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj) {
        filterAndLog_1(FQCN, interfaceC41482gM2, Level.WARN, str, obj, null);
    }

    public void debug(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, interfaceC41482gM2, Level.DEBUG, str, obj, obj2, null);
    }

    public void error(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, interfaceC41482gM2, Level.ERROR, str, obj, obj2, null);
    }

    public void info(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, interfaceC41482gM2, Level.INFO, str, obj, obj2, null);
    }

    public void trace(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, interfaceC41482gM2, Level.TRACE, str, obj, obj2, null);
    }

    public void warn(InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, interfaceC41482gM2, Level.WARN, str, obj, obj2, null);
    }

    public void debug(InterfaceC41482gM2 interfaceC41482gM2, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.DEBUG, str, null, th);
    }

    public void error(InterfaceC41482gM2 interfaceC41482gM2, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.ERROR, str, null, th);
    }

    public void info(InterfaceC41482gM2 interfaceC41482gM2, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.INFO, str, null, th);
    }

    public void trace(InterfaceC41482gM2 interfaceC41482gM2, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.TRACE, str, null, th);
    }

    public void warn(InterfaceC41482gM2 interfaceC41482gM2, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.WARN, str, null, th);
    }

    public void debug(InterfaceC41482gM2 interfaceC41482gM2, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.DEBUG, str, objArr, null);
    }

    public void error(InterfaceC41482gM2 interfaceC41482gM2, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.ERROR, str, objArr, null);
    }

    public void info(InterfaceC41482gM2 interfaceC41482gM2, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.INFO, str, objArr, null);
    }

    public void trace(InterfaceC41482gM2 interfaceC41482gM2, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.TRACE, str, objArr, null);
    }

    public void warn(InterfaceC41482gM2 interfaceC41482gM2, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, interfaceC41482gM2, Level.WARN, str, objArr, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void debug(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, null, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, null, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void info(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, null, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void trace(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, null, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void warn(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, null, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void debug(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.DEBUG, str, obj, null);
    }

    public void error(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.ERROR, str, obj, null);
    }

    public void info(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.INFO, str, obj, null);
    }

    public void trace(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.TRACE, str, obj, null);
    }

    public void warn(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.WARN, str, obj, null);
    }

    public void debug(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.DEBUG, str, obj, obj2, null);
    }

    public void error(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.ERROR, str, obj, obj2, null);
    }

    public void info(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.INFO, str, obj, obj2, null);
    }

    public void trace(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.TRACE, str, obj, obj2, null);
    }

    public void warn(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.WARN, str, obj, obj2, null);
    }

    public void debug(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, null, th);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, null, th);
    }

    public void info(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, null, th);
    }

    public void trace(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, null, th);
    }

    public void warn(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, null, th);
    }

    public void debug(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, objArr, null);
    }

    public void error(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, objArr, null);
    }

    public void info(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, objArr, null);
    }

    public void trace(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, objArr, null);
    }

    public void warn(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, objArr, null);
    }
}
