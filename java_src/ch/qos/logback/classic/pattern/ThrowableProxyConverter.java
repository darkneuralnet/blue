package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import com.google.android.filament.gltfio.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class ThrowableProxyConverter extends ThrowableHandlingConverter {
    protected static final int BUILDER_CAPACITY = 2048;
    int lengthOption;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    List<String> ignoredStackTraceLines = null;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void addIgnoreStackTraceLine(String str) {
        if (this.ignoredStackTraceLines == null) {
            this.ignoredStackTraceLines = new ArrayList();
        }
        this.ignoredStackTraceLines.add(str);
    }

    private boolean isIgnoredStackTraceLine(String str) {
        List<String> list = this.ignoredStackTraceLines;
        if (list != null) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void printIgnoredCount(StringBuilder sb, int i) {
        sb.append(" [");
        sb.append(i);
        sb.append(" skipped]");
    }

    private void printStackLine(StringBuilder sb, int i, StackTraceElementProxy stackTraceElementProxy) {
        sb.append(stackTraceElementProxy);
        extraData(sb, stackTraceElementProxy);
        if (i > 0) {
            printIgnoredCount(sb, i);
        }
    }

    private void recursiveAppend(StringBuilder sb, String str, int i, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb, str, i, iThrowableProxy);
        sb.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb, i, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb, CoreConstants.SUPPRESSED, i + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb, CoreConstants.CAUSED_BY, i, iThrowableProxy.getCause());
    }

    private void subjoinExceptionMessage(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        sb.append(iThrowableProxy.getClassName());
        sb.append(": ");
        sb.append(iThrowableProxy.getMessage());
    }

    private void subjoinFirstLine(StringBuilder sb, String str, int i, IThrowableProxy iThrowableProxy) {
        ThrowableProxyUtil.indent(sb, i - 1);
        if (str != null) {
            sb.append(str);
        }
        subjoinExceptionMessage(sb, iThrowableProxy);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy == null) {
            return "";
        }
        if (this.evaluatorList != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.evaluatorList.size()) {
                    z = true;
                    break;
                }
                try {
                } catch (EvaluationException e) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e);
                    } else if (this.errorCount == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (this.evaluatorList.get(i).evaluate(iLoggingEvent)) {
                    break;
                }
                i++;
            }
            if (!z) {
                return "";
            }
        }
        return throwableProxyToString(throwableProxy);
    }

    public void extraData(StringBuilder sb, StackTraceElementProxy stackTraceElementProxy) {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void start() {
        List<String> optionList;
        int size;
        String firstOption = getFirstOption();
        if (firstOption != null) {
            String lowerCase = firstOption.toLowerCase(Locale.US);
            if (!BuildConfig.FLAVOR.equals(lowerCase)) {
                if ("short".equals(lowerCase)) {
                    this.lengthOption = 1;
                } else {
                    try {
                        this.lengthOption = Integer.parseInt(lowerCase);
                    } catch (NumberFormatException unused) {
                        addError("Could not parse [" + lowerCase + "] as an integer");
                    }
                }
                optionList = getOptionList();
                if (optionList != null && optionList.size() > 1) {
                    size = optionList.size();
                    for (int i = 1; i < size; i++) {
                        String str = optionList.get(i);
                        EventEvaluator<ILoggingEvent> eventEvaluator = (EventEvaluator) ((Map) getContext().getObject(CoreConstants.EVALUATOR_MAP)).get(str);
                        if (eventEvaluator != null) {
                            addEvaluator(eventEvaluator);
                        } else {
                            addIgnoreStackTraceLine(str);
                        }
                    }
                }
                super.start();
            }
        }
        this.lengthOption = Integer.MAX_VALUE;
        optionList = getOptionList();
        if (optionList != null) {
            size = optionList.size();
            while (i < size) {
            }
        }
        super.start();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.evaluatorList = null;
        super.stop();
    }

    public void subjoinSTEPArray(StringBuilder sb, int i, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        int i2 = this.lengthOption;
        boolean z = i2 > stackTraceElementProxyArray.length;
        if (z) {
            i2 = stackTraceElementProxyArray.length;
        }
        if (commonFrames > 0 && z) {
            i2 -= commonFrames;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i4];
            if (isIgnoredStackTraceLine(stackTraceElementProxy.toString())) {
                i3++;
                if (i2 < stackTraceElementProxyArray.length) {
                    i2++;
                }
            } else {
                ThrowableProxyUtil.indent(sb, i);
                printStackLine(sb, i3, stackTraceElementProxy);
                sb.append(CoreConstants.LINE_SEPARATOR);
                i3 = 0;
            }
        }
        if (i3 > 0) {
            printIgnoredCount(sb, i3);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames <= 0 || !z) {
            return;
        }
        ThrowableProxyUtil.indent(sb, i);
        sb.append("... ");
        sb.append(iThrowableProxy.getCommonFrames());
        sb.append(" common frames omitted");
        sb.append(CoreConstants.LINE_SEPARATOR);
    }

    public String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb = new StringBuilder(2048);
        recursiveAppend(sb, null, 1, iThrowableProxy);
        return sb.toString();
    }
}
