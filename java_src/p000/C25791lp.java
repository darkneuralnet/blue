package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ'\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, m28432d2 = {"Llp;", "LJ46;", "", "now", "remainingNanos", "", "enter", "", "exit", "timedOut", "LwB5;", "sink", "LAN5;", Stripe3ds2AuthParams.FIELD_SOURCE, "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "newTimeoutException", "inQueue", "Z", "next", "Llp;", "timeoutAt", "J", "<init>", "()V", "Companion", C17296a.f69688o, "b", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: lp */
/* loaded from: classes8.dex */
public class C25791lp extends J46 {
    public static final C25792a Companion = new C25792a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static C25791lp head;
    private boolean inQueue;
    private C25791lp next;
    private long timeoutAt;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Llp$a;", "", "Llp;", "c", "()Llp;", "node", "", "timeoutNanos", "", "hasDeadline", "", "e", DateTokenConverter.CONVERTER_KEY, "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Llp;", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: lp$a */
    /* loaded from: classes8.dex */
    public static final class C25792a {
        public /* synthetic */ C25792a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final C25791lp m26784c() throws InterruptedException {
            C25791lp c25791lp = C25791lp.head;
            Intrinsics.checkNotNull(c25791lp);
            C25791lp c25791lp2 = c25791lp.next;
            if (c25791lp2 == null) {
                long nanoTime = System.nanoTime();
                C25791lp.class.wait(C25791lp.IDLE_TIMEOUT_MILLIS);
                C25791lp c25791lp3 = C25791lp.head;
                Intrinsics.checkNotNull(c25791lp3);
                if (c25791lp3.next != null || System.nanoTime() - nanoTime < C25791lp.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C25791lp.head;
            }
            long remainingNanos = c25791lp2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                long j = remainingNanos / 1000000;
                C25791lp.class.wait(j, (int) (remainingNanos - (1000000 * j)));
                return null;
            }
            C25791lp c25791lp4 = C25791lp.head;
            Intrinsics.checkNotNull(c25791lp4);
            c25791lp4.next = c25791lp2.next;
            c25791lp2.next = null;
            return c25791lp2;
        }

        /* renamed from: d */
        public final boolean m26783d(C25791lp c25791lp) {
            synchronized (C25791lp.class) {
                if (!c25791lp.inQueue) {
                    return false;
                }
                c25791lp.inQueue = false;
                for (C25791lp c25791lp2 = C25791lp.head; c25791lp2 != null; c25791lp2 = c25791lp2.next) {
                    if (c25791lp2.next == c25791lp) {
                        c25791lp2.next = c25791lp.next;
                        c25791lp.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* renamed from: e */
        public final void m26782e(C25791lp c25791lp, long j, boolean z) {
            synchronized (C25791lp.class) {
                if (!c25791lp.inQueue) {
                    c25791lp.inQueue = true;
                    if (C25791lp.head == null) {
                        C25791lp.head = new C25791lp();
                        new C25793b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i != 0 && z) {
                        c25791lp.timeoutAt = Math.min(j, c25791lp.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        c25791lp.timeoutAt = j + nanoTime;
                    } else if (z) {
                        c25791lp.timeoutAt = c25791lp.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long remainingNanos = c25791lp.remainingNanos(nanoTime);
                    C25791lp c25791lp2 = C25791lp.head;
                    Intrinsics.checkNotNull(c25791lp2);
                    while (c25791lp2.next != null) {
                        C25791lp c25791lp3 = c25791lp2.next;
                        Intrinsics.checkNotNull(c25791lp3);
                        if (remainingNanos < c25791lp3.remainingNanos(nanoTime)) {
                            break;
                        }
                        c25791lp2 = c25791lp2.next;
                        Intrinsics.checkNotNull(c25791lp2);
                    }
                    c25791lp.next = c25791lp2.next;
                    c25791lp2.next = c25791lp;
                    if (c25791lp2 == C25791lp.head) {
                        C25791lp.class.notify();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        private C25792a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Llp$b;", "Ljava/lang/Thread;", "", "run", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: lp$b */
    /* loaded from: classes8.dex */
    public static final class C25793b extends Thread {
        public C25793b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C25791lp m26784c;
            while (true) {
                try {
                    synchronized (C25791lp.class) {
                        m26784c = C25791lp.Companion.m26784c();
                        if (m26784c == C25791lp.head) {
                            C25791lp.head = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (m26784c != null) {
                        m26784c.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, m28432d2 = {"lp$c", "LwB5;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "flush", "close", "Llp;", C17296a.f69688o, "", "toString", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: lp$c */
    /* loaded from: classes8.dex */
    public static final class C25794c implements InterfaceC50872wB5 {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC50872wB5 f96768c;

        public C25794c(InterfaceC50872wB5 interfaceC50872wB5) {
            this.f96768c = interfaceC50872wB5;
        }

        @Override // p000.InterfaceC50872wB5
        /* renamed from: a */
        public C25791lp timeout() {
            return C25791lp.this;
        }

        @Override // p000.InterfaceC50872wB5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C25791lp c25791lp = C25791lp.this;
            InterfaceC50872wB5 interfaceC50872wB5 = this.f96768c;
            c25791lp.enter();
            try {
                interfaceC50872wB5.close();
                Unit unit = Unit.INSTANCE;
                if (!c25791lp.exit()) {
                    return;
                }
                throw c25791lp.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c25791lp.exit()) {
                    throw e;
                }
                throw c25791lp.access$newTimeoutException(e);
            } finally {
                c25791lp.exit();
            }
        }

        @Override // p000.InterfaceC50872wB5, java.io.Flushable
        public void flush() {
            C25791lp c25791lp = C25791lp.this;
            InterfaceC50872wB5 interfaceC50872wB5 = this.f96768c;
            c25791lp.enter();
            try {
                interfaceC50872wB5.flush();
                Unit unit = Unit.INSTANCE;
                if (!c25791lp.exit()) {
                    return;
                }
                throw c25791lp.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c25791lp.exit()) {
                    throw e;
                }
                throw c25791lp.access$newTimeoutException(e);
            } finally {
                c25791lp.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f96768c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // p000.InterfaceC50872wB5
        public void write(C42488i30 source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            FJ6.m107320b(source.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C36208Tq5 c36208Tq5 = source.f86657b;
                    Intrinsics.checkNotNull(c36208Tq5);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += c36208Tq5.f36328c - c36208Tq5.f36327b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            c36208Tq5 = c36208Tq5.f36331f;
                            Intrinsics.checkNotNull(c36208Tq5);
                        }
                    }
                    C25791lp c25791lp = C25791lp.this;
                    InterfaceC50872wB5 interfaceC50872wB5 = this.f96768c;
                    c25791lp.enter();
                    try {
                        interfaceC50872wB5.write(source, j2);
                        Unit unit = Unit.INSTANCE;
                        if (!c25791lp.exit()) {
                            j -= j2;
                        } else {
                            throw c25791lp.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        if (!c25791lp.exit()) {
                            throw e;
                        }
                        throw c25791lp.access$newTimeoutException(e);
                    } finally {
                        c25791lp.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m28432d2 = {"lp$d", "LAN5;", "Li30;", "sink", "", "byteCount", "read", "", "close", "Llp;", C17296a.f69688o, "", "toString", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: lp$d */
    /* loaded from: classes8.dex */
    public static final class C25795d implements AN5 {

        /* renamed from: c */
        public final /* synthetic */ AN5 f96770c;

        public C25795d(AN5 an5) {
            this.f96770c = an5;
        }

        @Override // p000.AN5
        /* renamed from: a */
        public C25791lp timeout() {
            return C25791lp.this;
        }

        @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C25791lp c25791lp = C25791lp.this;
            AN5 an5 = this.f96770c;
            c25791lp.enter();
            try {
                an5.close();
                Unit unit = Unit.INSTANCE;
                if (!c25791lp.exit()) {
                    return;
                }
                throw c25791lp.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c25791lp.exit()) {
                    throw e;
                }
                throw c25791lp.access$newTimeoutException(e);
            } finally {
                c25791lp.exit();
            }
        }

        @Override // p000.AN5
        public long read(C42488i30 sink, long j) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            C25791lp c25791lp = C25791lp.this;
            AN5 an5 = this.f96770c;
            c25791lp.enter();
            try {
                long read = an5.read(sink, j);
                if (!c25791lp.exit()) {
                    return read;
                }
                throw c25791lp.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!c25791lp.exit()) {
                    throw e;
                }
                throw c25791lp.access$newTimeoutException(e);
            } finally {
                c25791lp.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f96770c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    @PublishedApi
    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        Companion.m26782e(this, timeoutNanos, hasDeadline);
    }

    public final boolean exit() {
        return Companion.m26783d(this);
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final InterfaceC50872wB5 sink(InterfaceC50872wB5 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C25794c(sink);
    }

    public final AN5 source(AN5 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new C25795d(source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T invoke = block.invoke();
                InlineMarker.finallyStart(1);
                if (!exit()) {
                    InlineMarker.finallyEnd(1);
                    return invoke;
                }
                throw access$newTimeoutException(null);
            } catch (IOException e) {
                if (!exit()) {
                    throw e;
                }
                throw access$newTimeoutException(e);
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
