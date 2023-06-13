package okhttp3;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.FileAppender;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import p000.C48371ry3;
import p000.M70;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0018\u00010\u001bR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006&"}, m28432d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "Lokhttp3/MultipartReader$Part;", "nextPart", "", "close", "Lo30;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lo30;", "", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "LM70;", "dashDashBoundary", "LM70;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "<init>", "(Lo30;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final C48371ry3 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final M70 crlfDashDashBoundary;
    private PartSource currentPart;
    private final M70 dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final InterfaceC46046o30 source;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lry3;", "afterBoundaryOptions", "Lry3;", "getAfterBoundaryOptions", "()Lry3;", "<init>", "()V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C48371ry3 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "", "close", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lo30;", "body", "Lo30;", "()Lo30;", "<init>", "(Lokhttp3/Headers;Lo30;)V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes8.dex */
    public static final class Part implements Closeable {
        private final InterfaceC46046o30 body;
        private final Headers headers;

        public Part(Headers headers, InterfaceC46046o30 body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @JvmName(name = "body")
        public final InterfaceC46046o30 body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        @JvmName(name = "headers")
        public final Headers headers() {
            return this.headers;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lokhttp3/MultipartReader$PartSource;", "LAN5;", "", "close", "Li30;", "sink", "", "byteCount", "read", "LJ46;", "timeout", "LJ46;", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes8.dex */
    public final class PartSource implements AN5 {
        final /* synthetic */ MultipartReader this$0;
        private final J46 timeout;

        public PartSource(MultipartReader this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new J46();
        }

        @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        @Override // p000.AN5
        public long read(C42488i30 sink, long j) {
            boolean z;
            long read;
            long read2;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Intrinsics.areEqual(this.this$0.currentPart, this)) {
                    J46 timeout = this.this$0.source.timeout();
                    J46 j46 = this.timeout;
                    MultipartReader multipartReader = this.this$0;
                    long timeoutNanos = timeout.timeoutNanos();
                    long m101197a = J46.Companion.m101197a(j46.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(m101197a, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (j46.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), j46.deadlineNanoTime()));
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(sink, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (j46.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            return read2;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (j46.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (j46.hasDeadline()) {
                        timeout.deadlineNanoTime(j46.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(sink, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (j46.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (j46.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
        }

        @Override // p000.AN5
        public J46 timeout() {
            return this.timeout;
        }
    }

    static {
        C48371ry3.C28077a c28077a = C48371ry3.f107972d;
        M70.C5195a c5195a = M70.f22644e;
        afterBoundaryOptions = c28077a.m14964d(c5195a.m95794d(FileUploadRequest.LINE_BREAK), c5195a.m95794d("--"), c5195a.m95794d(" "), c5195a.m95794d(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
    }

    public MultipartReader(InterfaceC46046o30 source, String boundary) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new C42488i30().mo24530a2("--").mo24530a2(boundary).mo21936h1();
        this.crlfDashDashBoundary = new C42488i30().mo24530a2("\r\n--").mo24530a2(boundary).mo21936h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.mo21928x2(this.crlfDashDashBoundary.size());
        long mo21937e2 = this.source.mo21939e().mo21937e2(this.crlfDashDashBoundary);
        if (mo21937e2 == -1) {
            return Math.min(j, (this.source.mo21939e().size() - this.crlfDashDashBoundary.size()) + 1);
        }
        return Math.min(j, mo21937e2);
    }

    @JvmName(name = "boundary")
    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.mo21933p3(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.size());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(FileAppender.DEFAULT_BUFFER_SIZE);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.size());
            }
            boolean z = false;
            while (true) {
                int mo21944Q2 = this.source.mo21944Q2(afterBoundaryOptions);
                if (mo21944Q2 != -1) {
                    if (mo21944Q2 != 0) {
                        if (mo21944Q2 != 1) {
                            if (mo21944Q2 == 2 || mo21944Q2 == 3) {
                                z = true;
                            }
                        } else if (!z) {
                            if (this.partCount != 0) {
                                this.noMoreParts = true;
                                return null;
                            }
                            throw new ProtocolException("expected at least 1 part");
                        } else {
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource(this);
                        this.currentPart = partSource;
                        return new Part(readHeaders, C34928Oe3.m91759d(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultipartReader(ResponseBody response) throws IOException {
        this(r0, r3);
        Intrinsics.checkNotNullParameter(response, "response");
        InterfaceC46046o30 source = response.source();
        MediaType contentType = response.contentType();
        String parameter = contentType == null ? null : contentType.parameter("boundary");
        if (parameter != null) {
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
