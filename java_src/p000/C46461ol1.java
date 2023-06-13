package p000;

import android.os.Handler;
import android.os.HandlerThread;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.rolling.FixedWindowRollingPolicy;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;
import ch.qos.logback.core.util.FileSize;
import co.bird.android.model.analytics.TraceKeyKt;
import com.facebook.share.internal.C17296a;
import com.michaelflisar.lumberjack.FileLoggingSetup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b \u0010!J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"Lol1;", "LwE;", "", "priority", "", "tag", "message", "", "t", "LnO5;", "stackData", "", "D", "Lcom/michaelflisar/lumberjack/FileLoggingSetup;", "setup", "H", "logMessage", TraceKeyKt.IS_MAIN_THREAD, "G", "Landroid/os/HandlerThread;", "e", "Landroid/os/HandlerThread;", "mHandlerThread", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "mBackgroundHandler", "LgM2;", "kotlin.jvm.PlatformType", "g", "LgM2;", "WTF_MARKER", "<init>", "(Lcom/michaelflisar/lumberjack/FileLoggingSetup;)V", "h", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ol1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46461ol1 extends AbstractC29810wE {

    /* renamed from: h */
    public static final C27054a f102430h = new C27054a(null);

    /* renamed from: i */
    public static final int f102431i = 8;

    /* renamed from: j */
    public static InterfaceC53103zx2 f102432j = C34162Kx2.m98062i(C46461ol1.class);

    /* renamed from: e */
    public HandlerThread f102433e;

    /* renamed from: f */
    public Handler f102434f;

    /* renamed from: g */
    public final InterfaceC41482gM2 f102435g;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"Lol1$a;", "", "", "DATE_FILE_NAME_PATTERN", "Ljava/lang/String;", "", "MIN_LOGGING_PRIORITY", "I", "NUMBERED_FILE_NAME_PATTERN", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ol1$a */
    /* loaded from: classes4.dex */
    public static final class C27054a {
        public /* synthetic */ C27054a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27054a() {
        }
    }

    public C46461ol1(FileLoggingSetup fileLoggingSetup) {
        if (fileLoggingSetup != null) {
            if (fileLoggingSetup.mo45920b()) {
                HandlerThread handlerThread = new HandlerThread("FileLoggingTree");
                handlerThread.start();
                this.f102434f = new Handler(handlerThread.getLooper());
                this.f102433e = handlerThread;
            }
            m20540H(fileLoggingSetup);
            this.f102435g = C43261jM2.m30757b("WTF-");
            return;
        }
        throw new RuntimeException("You can't create a FileLoggingTree without providing a setup!");
    }

    /* renamed from: J */
    public static final void m20539J(C46461ol1 this$0, int i, String logMessage, String thread) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(logMessage, "$logMessage");
        Intrinsics.checkNotNullParameter(thread, "$thread");
        this$0.m20541G(i, logMessage, thread);
    }

    @Override // p000.AbstractC29810wE
    /* renamed from: D */
    public void mo7229D(final int i, String str, String message, Throwable th, C45654nO5 stackData) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stackData, "stackData");
        final String m7232A = m7232A(str, message);
        final String thread = Thread.currentThread().toString();
        Intrinsics.checkNotNullExpressionValue(thread, "currentThread().toString()");
        Handler handler = this.f102434f;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nl1
                @Override // java.lang.Runnable
                public final void run() {
                    C46461ol1.m20539J(C46461ol1.this, i, m7232A, thread);
                }
            });
        } else {
            m20541G(i, m7232A, thread);
        }
    }

    /* renamed from: G */
    public final void m20541G(int i, String str, String str2) {
        if (i < 3) {
            return;
        }
        String str3 = str2 + " " + str;
        switch (i) {
            case 2:
                f102432j.trace(str3);
                return;
            case 3:
                f102432j.debug(str3);
                return;
            case 4:
                f102432j.info(str3);
                return;
            case 5:
                f102432j.warn(str3);
                return;
            case 6:
                f102432j.error(str3);
                return;
            case 7:
                f102432j.error(this.f102435g, str3);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public final void m20540H(FileLoggingSetup fileLoggingSetup) {
        SizeBasedTriggeringPolicy sizeBasedTriggeringPolicy;
        PO1 m98063h = C34162Kx2.m98063h();
        Intrinsics.checkNotNull(m98063h, "null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
        LoggerContext loggerContext = (LoggerContext) m98063h;
        loggerContext.reset();
        PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
        patternLayoutEncoder.setContext(loggerContext);
        patternLayoutEncoder.setPattern(fileLoggingSetup.mo45919c().m45912c());
        patternLayoutEncoder.start();
        RollingFileAppender rollingFileAppender = new RollingFileAppender();
        rollingFileAppender.setAppend(true);
        rollingFileAppender.setContext(loggerContext);
        if (fileLoggingSetup instanceof FileLoggingSetup.DateFiles) {
            TimeBasedRollingPolicy timeBasedRollingPolicy = new TimeBasedRollingPolicy();
            String mo45921a = fileLoggingSetup.mo45921a();
            String m45913b = fileLoggingSetup.mo45919c().m45913b();
            String m45914a = fileLoggingSetup.mo45919c().m45914a();
            timeBasedRollingPolicy.setFileNamePattern(mo45921a + "/" + m45913b + "_%d{yyyyMMdd}." + m45914a);
            timeBasedRollingPolicy.setMaxHistory(fileLoggingSetup.mo45919c().m45911d());
            timeBasedRollingPolicy.setCleanHistoryOnStart(true);
            timeBasedRollingPolicy.setParent(rollingFileAppender);
            timeBasedRollingPolicy.setContext(loggerContext);
            sizeBasedTriggeringPolicy = timeBasedRollingPolicy;
        } else if (fileLoggingSetup instanceof FileLoggingSetup.NumberedFiles) {
            FixedWindowRollingPolicy fixedWindowRollingPolicy = new FixedWindowRollingPolicy();
            String mo45921a2 = fileLoggingSetup.mo45921a();
            String m45913b2 = fileLoggingSetup.mo45919c().m45913b();
            String m45914a2 = fileLoggingSetup.mo45919c().m45914a();
            fixedWindowRollingPolicy.setFileNamePattern(mo45921a2 + "/" + m45913b2 + "%i." + m45914a2);
            fixedWindowRollingPolicy.setMinIndex(1);
            fixedWindowRollingPolicy.setMaxIndex(fileLoggingSetup.mo45919c().m45911d());
            fixedWindowRollingPolicy.setParent(rollingFileAppender);
            fixedWindowRollingPolicy.setContext(loggerContext);
            SizeBasedTriggeringPolicy sizeBasedTriggeringPolicy2 = new SizeBasedTriggeringPolicy();
            FileLoggingSetup.NumberedFiles numberedFiles = (FileLoggingSetup.NumberedFiles) fileLoggingSetup;
            sizeBasedTriggeringPolicy2.setMaxFileSize(FileSize.valueOf(numberedFiles.m45917e()));
            rollingFileAppender.setFile(numberedFiles.m45918d());
            rollingFileAppender.setRollingPolicy(fixedWindowRollingPolicy);
            fixedWindowRollingPolicy.start();
            sizeBasedTriggeringPolicy = sizeBasedTriggeringPolicy2;
        } else {
            sizeBasedTriggeringPolicy = null;
        }
        sizeBasedTriggeringPolicy.start();
        rollingFileAppender.setTriggeringPolicy(sizeBasedTriggeringPolicy);
        rollingFileAppender.setEncoder(patternLayoutEncoder);
        rollingFileAppender.start();
        InterfaceC53103zx2 interfaceC53103zx2 = f102432j;
        Intrinsics.checkNotNull(interfaceC53103zx2, "null cannot be cast to non-null type ch.qos.logback.classic.Logger");
        Logger logger = (Logger) interfaceC53103zx2;
        logger.detachAndStopAllAppenders();
        logger.addAppender(rollingFileAppender);
        logger.setLevel(Level.ALL);
    }
}
