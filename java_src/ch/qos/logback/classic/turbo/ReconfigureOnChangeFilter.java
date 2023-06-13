package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.joran.GenericConfigurator;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.StatusUtil;
import java.io.File;
import java.net.URL;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.internal.p056ws.WebSocketProtocol;
/* loaded from: classes.dex */
public class ReconfigureOnChangeFilter extends TurboFilter {
    public static final long DEFAULT_REFRESH_PERIOD = 60000;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    ConfigurationWatchList configurationWatchList;
    URL mainConfigurationURL;
    protected volatile long nextCheck;
    long refreshPeriod = 60000;
    private long invocationCounter = 0;
    private volatile long mask = 15;
    private volatile long lastMaskCheck = System.currentTimeMillis();

    /* loaded from: classes.dex */
    public class ReconfiguringThread implements Runnable {
        public ReconfiguringThread() {
        }

        private void fallbackConfiguration(LoggerContext loggerContext, List<SaxEvent> list, URL url) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            if (list == null) {
                ReconfigureOnChangeFilter.this.addWarn("No previous configuration to fall back on.");
                return;
            }
            ReconfigureOnChangeFilter.this.addWarn("Falling back to previously registered safe configuration.");
            try {
                loggerContext.reset();
                new AndroidContextUtil().setupProperties(loggerContext);
                GenericConfigurator.informContextOfURLUsedForConfiguration(loggerContext, url);
                joranConfigurator.doConfigure(list);
                ReconfigureOnChangeFilter.this.addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
                joranConfigurator.registerSafeConfiguration(list);
            } catch (JoranException e) {
                ReconfigureOnChangeFilter.this.addError("Unexpected exception thrown by a configuration considered safe.", e);
            }
        }

        private void performXMLConfiguration(LoggerContext loggerContext) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            StatusUtil statusUtil = new StatusUtil(loggerContext);
            List<SaxEvent> recallSafeConfiguration = joranConfigurator.recallSafeConfiguration();
            URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(loggerContext);
            loggerContext.reset();
            new AndroidContextUtil().setupProperties(loggerContext);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                joranConfigurator.doConfigure(ReconfigureOnChangeFilter.this.mainConfigurationURL);
                if (statusUtil.hasXMLParsingErrors(currentTimeMillis)) {
                    fallbackConfiguration(loggerContext, recallSafeConfiguration, mainWatchURL);
                }
            } catch (JoranException unused) {
                fallbackConfiguration(loggerContext, recallSafeConfiguration, mainWatchURL);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ReconfigureOnChangeFilter reconfigureOnChangeFilter = ReconfigureOnChangeFilter.this;
            if (reconfigureOnChangeFilter.mainConfigurationURL == null) {
                reconfigureOnChangeFilter.addInfo("Due to missing top level configuration file, skipping reconfiguration");
                return;
            }
            LoggerContext loggerContext = (LoggerContext) ((ContextAwareBase) reconfigureOnChangeFilter).context;
            ReconfigureOnChangeFilter reconfigureOnChangeFilter2 = ReconfigureOnChangeFilter.this;
            reconfigureOnChangeFilter2.addInfo("Will reset and reconfigure context named [" + ((ContextAwareBase) ReconfigureOnChangeFilter.this).context.getName() + "]");
            if (ReconfigureOnChangeFilter.this.mainConfigurationURL.toString().endsWith("xml")) {
                performXMLConfiguration(loggerContext);
            }
        }
    }

    private void updateMaskIfNecessary(long j) {
        long j2;
        long j3 = j - this.lastMaskCheck;
        this.lastMaskCheck = j;
        if (j3 < 100 && this.mask < WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j2 = (this.mask << 1) | 1;
        } else if (j3 <= MASK_DECREASE_THRESHOLD) {
            return;
        } else {
            j2 = this.mask >>> 2;
        }
        this.mask = j2;
    }

    public boolean changeDetected(long j) {
        if (j >= this.nextCheck) {
            updateNextCheck(j);
            return this.configurationWatchList.changeDetected();
        }
        return false;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(InterfaceC41482gM2 interfaceC41482gM2, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (isStarted()) {
            long j = this.invocationCounter;
            this.invocationCounter = 1 + j;
            if ((j & this.mask) != this.mask) {
                return FilterReply.NEUTRAL;
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this.configurationWatchList) {
                updateMaskIfNecessary(currentTimeMillis);
                if (changeDetected(currentTimeMillis)) {
                    disableSubsequentReconfiguration();
                    detachReconfigurationToNewThread();
                }
            }
            return FilterReply.NEUTRAL;
        }
        return FilterReply.NEUTRAL;
    }

    public void detachReconfigurationToNewThread() {
        addInfo("Detected change in [" + this.configurationWatchList.getCopyOfFileWatchList() + "]");
        this.context.getScheduledExecutorService().submit(new ReconfiguringThread());
    }

    public void disableSubsequentReconfiguration() {
        this.nextCheck = LongCompanionObject.MAX_VALUE;
    }

    public long getRefreshPeriod() {
        return this.refreshPeriod;
    }

    public void setRefreshPeriod(long j) {
        this.refreshPeriod = j;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        ConfigurationWatchList configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(this.context);
        this.configurationWatchList = configurationWatchList;
        if (configurationWatchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        URL mainURL = configurationWatchList.getMainURL();
        this.mainConfigurationURL = mainURL;
        if (mainURL == null) {
            addWarn("Due to missing top level configuration file, automatic reconfiguration is impossible.");
            return;
        }
        List<File> copyOfFileWatchList = this.configurationWatchList.getCopyOfFileWatchList();
        addInfo("Will scan for changes in [" + copyOfFileWatchList + "] every " + (this.refreshPeriod / 1000) + " seconds. ");
        synchronized (this.configurationWatchList) {
            updateNextCheck(System.currentTimeMillis());
        }
        super.start();
    }

    public String toString() {
        return "ReconfigureOnChangeFilter{invocationCounter=" + this.invocationCounter + CoreConstants.CURLY_RIGHT;
    }

    public void updateNextCheck(long j) {
        this.nextCheck = j + this.refreshPeriod;
    }
}
