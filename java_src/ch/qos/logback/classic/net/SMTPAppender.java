package ch.qos.logback.classic.net;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.boolex.OnErrorEvaluator;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.net.SMTPAppenderBase;
import ch.qos.logback.core.pattern.PatternLayoutBase;
/* loaded from: classes.dex */
public class SMTPAppender extends SMTPAppenderBase<ILoggingEvent> {
    static final String DEFAULT_SUBJECT_PATTERN = "%logger{20} - %m";
    private boolean includeCallerData = false;

    public SMTPAppender() {
    }

    @Override // ch.qos.logback.core.net.SMTPAppenderBase
    public boolean eventMarksEndOfLife(ILoggingEvent iLoggingEvent) {
        InterfaceC41482gM2 marker = iLoggingEvent.getMarker();
        if (marker == null) {
            return false;
        }
        return marker.mo39595z2(ClassicConstants.FINALIZE_SESSION_MARKER);
    }

    @Override // ch.qos.logback.core.net.SMTPAppenderBase
    public void fillBuffer(CyclicBuffer<ILoggingEvent> cyclicBuffer, StringBuffer stringBuffer) {
        int length = cyclicBuffer.length();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(this.layout.doLayout(cyclicBuffer.get()));
        }
    }

    public boolean isIncludeCallerData() {
        return this.includeCallerData;
    }

    @Override // ch.qos.logback.core.net.SMTPAppenderBase
    /* renamed from: makeNewToPatternLayout */
    public PatternLayoutBase<ILoggingEvent> makeNewToPatternLayout2(String str) {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.setPattern(str + "%nopex");
        return patternLayout;
    }

    @Override // ch.qos.logback.core.net.SMTPAppenderBase
    public Layout<ILoggingEvent> makeSubjectLayout(String str) {
        if (str == null) {
            str = DEFAULT_SUBJECT_PATTERN;
        }
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.setContext(getContext());
        patternLayout.setPattern(str);
        patternLayout.setPostCompileProcessor(null);
        patternLayout.start();
        return patternLayout;
    }

    public void setIncludeCallerData(boolean z) {
        this.includeCallerData = z;
    }

    @Override // ch.qos.logback.core.net.SMTPAppenderBase, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.eventEvaluator == null) {
            OnErrorEvaluator onErrorEvaluator = new OnErrorEvaluator();
            onErrorEvaluator.setContext(getContext());
            onErrorEvaluator.setName("onError");
            onErrorEvaluator.start();
            this.eventEvaluator = onErrorEvaluator;
        }
        super.start();
    }

    @Override // ch.qos.logback.core.net.SMTPAppenderBase
    public void subAppend(CyclicBuffer<ILoggingEvent> cyclicBuffer, ILoggingEvent iLoggingEvent) {
        if (this.includeCallerData) {
            iLoggingEvent.getCallerData();
        }
        iLoggingEvent.prepareForDeferredProcessing();
        cyclicBuffer.add(iLoggingEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SMTPAppender(EventEvaluator<ILoggingEvent> eventEvaluator) {
        this.eventEvaluator = eventEvaluator;
    }
}
