package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LZP3;", "LAN5;", "Li30;", "sink", "", "byteCount", "read", "LJ46;", "timeout", "", "close", "Lo30;", "b", "Lo30;", "upstream", "c", "Li30;", "buffer", "LTq5;", DateTokenConverter.CONVERTER_KEY, "LTq5;", "expectedSegment", "", "e", "I", "expectedPos", "", "f", "Z", "closed", "g", "J", "pos", "<init>", "(Lo30;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: ZP3 */
/* loaded from: classes8.dex */
public final class ZP3 implements AN5 {

    /* renamed from: b */
    public final InterfaceC46046o30 f48508b;

    /* renamed from: c */
    public final C42488i30 f48509c;

    /* renamed from: d */
    public C36208Tq5 f48510d;

    /* renamed from: e */
    public int f48511e;

    /* renamed from: f */
    public boolean f48512f;

    /* renamed from: g */
    public long f48513g;

    public ZP3(InterfaceC46046o30 upstream) {
        int i;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f48508b = upstream;
        C42488i30 mo21939e = upstream.mo21939e();
        this.f48509c = mo21939e;
        C36208Tq5 c36208Tq5 = mo21939e.f86657b;
        this.f48510d = c36208Tq5;
        if (c36208Tq5 != null) {
            i = c36208Tq5.f36327b;
        } else {
            i = -1;
        }
        this.f48511e = i;
    }

    @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48512f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f36327b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // p000.AN5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(C42488i30 sink, long j) {
        boolean z;
        C36208Tq5 c36208Tq5;
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f48512f) {
                C36208Tq5 c36208Tq52 = this.f48510d;
                if (c36208Tq52 != null) {
                    C36208Tq5 c36208Tq53 = this.f48509c.f86657b;
                    if (c36208Tq52 == c36208Tq53) {
                        int i2 = this.f48511e;
                        Intrinsics.checkNotNull(c36208Tq53);
                    }
                    if (!z2) {
                        if (i == 0) {
                            return 0L;
                        }
                        if (!this.f48508b.mo21935o(this.f48513g + 1)) {
                            return -1L;
                        }
                        if (this.f48510d == null && (c36208Tq5 = this.f48509c.f86657b) != null) {
                            this.f48510d = c36208Tq5;
                            Intrinsics.checkNotNull(c36208Tq5);
                            this.f48511e = c36208Tq5.f36327b;
                        }
                        long min = Math.min(j, this.f48509c.size() - this.f48513g);
                        this.f48509c.m34553l(sink, this.f48513g, min);
                        this.f48513g += min;
                        return min;
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
                }
                z2 = true;
                if (!z2) {
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @Override // p000.AN5
    public J46 timeout() {
        return this.f48508b.timeout();
    }
}
