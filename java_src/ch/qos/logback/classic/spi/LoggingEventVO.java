package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
/* loaded from: classes.dex */
public class LoggingEventVO implements ILoggingEvent, Serializable {
    private static final int NULL_ARGUMENT_ARRAY = -1;
    private static final String NULL_ARGUMENT_ARRAY_ELEMENT = "NULL_ARGUMENT_ARRAY_ELEMENT";
    private static final long serialVersionUID = 6553722650255690312L;
    private transient Object[] argumentArray;
    private StackTraceElement[] callerDataArray;
    private transient String formattedMessage;
    private transient Level level;
    private LoggerContextVO loggerContextVO;
    private String loggerName;
    private InterfaceC41482gM2 marker;
    private Map<String, String> mdcPropertyMap;
    private String message;
    private String threadName;
    private ThrowableProxyVO throwableProxy;
    private long timeStamp;

    public static LoggingEventVO build(ILoggingEvent iLoggingEvent) {
        LoggingEventVO loggingEventVO = new LoggingEventVO();
        loggingEventVO.loggerName = iLoggingEvent.getLoggerName();
        loggingEventVO.loggerContextVO = iLoggingEvent.getLoggerContextVO();
        loggingEventVO.threadName = iLoggingEvent.getThreadName();
        loggingEventVO.level = iLoggingEvent.getLevel();
        loggingEventVO.message = iLoggingEvent.getMessage();
        loggingEventVO.argumentArray = iLoggingEvent.getArgumentArray();
        loggingEventVO.marker = iLoggingEvent.getMarker();
        loggingEventVO.mdcPropertyMap = iLoggingEvent.getMDCPropertyMap();
        loggingEventVO.timeStamp = iLoggingEvent.getTimeStamp();
        loggingEventVO.throwableProxy = ThrowableProxyVO.build(iLoggingEvent.getThrowableProxy());
        if (iLoggingEvent.hasCallerData()) {
            loggingEventVO.callerDataArray = iLoggingEvent.getCallerData();
        }
        return loggingEventVO;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.level = Level.toLevel(objectInputStream.readInt());
        int readInt = objectInputStream.readInt();
        if (readInt != -1) {
            this.argumentArray = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                Object readObject = objectInputStream.readObject();
                if (!NULL_ARGUMENT_ARRAY_ELEMENT.equals(readObject)) {
                    this.argumentArray[i] = readObject;
                }
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.level.levelInt);
        Object[] objArr = this.argumentArray;
        if (objArr == null) {
            objectOutputStream.writeInt(-1);
            return;
        }
        objectOutputStream.writeInt(objArr.length);
        int i = 0;
        while (true) {
            Object[] objArr2 = this.argumentArray;
            if (i >= objArr2.length) {
                return;
            }
            Object obj = objArr2[i];
            objectOutputStream.writeObject(obj != null ? obj.toString() : NULL_ARGUMENT_ARRAY_ELEMENT);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LoggingEventVO loggingEventVO = (LoggingEventVO) obj;
            String str = this.message;
            if (str == null) {
                if (loggingEventVO.message != null) {
                    return false;
                }
            } else if (!str.equals(loggingEventVO.message)) {
                return false;
            }
            String str2 = this.loggerName;
            if (str2 == null) {
                if (loggingEventVO.loggerName != null) {
                    return false;
                }
            } else if (!str2.equals(loggingEventVO.loggerName)) {
                return false;
            }
            String str3 = this.threadName;
            if (str3 == null) {
                if (loggingEventVO.threadName != null) {
                    return false;
                }
            } else if (!str3.equals(loggingEventVO.threadName)) {
                return false;
            }
            if (this.timeStamp != loggingEventVO.timeStamp) {
                return false;
            }
            InterfaceC41482gM2 interfaceC41482gM2 = this.marker;
            if (interfaceC41482gM2 == null) {
                if (loggingEventVO.marker != null) {
                    return false;
                }
            } else if (!interfaceC41482gM2.equals(loggingEventVO.marker)) {
                return false;
            }
            Map<String, String> map = this.mdcPropertyMap;
            Map<String, String> map2 = loggingEventVO.mdcPropertyMap;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Object[] getArgumentArray() {
        return this.argumentArray;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public StackTraceElement[] getCallerData() {
        return this.callerDataArray;
    }

    public long getContextBirthTime() {
        return this.loggerContextVO.getBirthTime();
    }

    public LoggerContextVO getContextLoggerRemoteView() {
        return this.loggerContextVO;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getFormattedMessage() {
        String str = this.formattedMessage;
        if (str != null) {
            return str;
        }
        Object[] objArr = this.argumentArray;
        this.formattedMessage = objArr != null ? C46882pT2.m19252a(this.message, objArr).m85a() : this.message;
        return this.formattedMessage;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Level getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public LoggerContextVO getLoggerContextVO() {
        return this.loggerContextVO;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getLoggerName() {
        return this.loggerName;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMDCPropertyMap() {
        return this.mdcPropertyMap;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public InterfaceC41482gM2 getMarker() {
        return this.marker;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMdc() {
        return this.mdcPropertyMap;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getThreadName() {
        return this.threadName;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public IThrowableProxy getThrowableProxy() {
        return this.throwableProxy;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public boolean hasCallerData() {
        return this.callerDataArray != null;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.threadName;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.timeStamp;
        return ((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent, ch.qos.logback.core.spi.DeferredProcessingAware
    public void prepareForDeferredProcessing() {
    }
}
