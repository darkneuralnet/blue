package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lr32;", "LAN5;", "Li30;", "sink", "", "byteCount", "read", "", "close", "LJ46;", "timeout", "", "toString", "Ljava/io/InputStream;", "b", "Ljava/io/InputStream;", "input", "c", "LJ46;", "<init>", "(Ljava/io/InputStream;LJ46;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: r32  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47827r32 implements AN5 {

    /* renamed from: b */
    public final InputStream f106352b;

    /* renamed from: c */
    public final J46 f106353c;

    public C47827r32(InputStream input, J46 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f106352b = input;
        this.f106353c = timeout;
    }

    @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f106352b.close();
    }

    @Override // p000.AN5
    public long read(C42488i30 sink, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f106353c.throwIfReached();
                C36208Tq5 m34568S = sink.m34568S(1);
                int read = this.f106352b.read(m34568S.f36326a, m34568S.f36328c, (int) Math.min(j, 8192 - m34568S.f36328c));
                if (read == -1) {
                    if (m34568S.f36327b == m34568S.f36328c) {
                        sink.f86657b = m34568S.m82375b();
                        C38799br5.m62277b(m34568S);
                        return -1L;
                    }
                    return -1L;
                }
                m34568S.f36328c += read;
                long j2 = read;
                sink.m34571O(sink.size() + j2);
                return j2;
            } catch (AssertionError e) {
                if (C34928Oe3.m91758e(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // p000.AN5
    public J46 timeout() {
        return this.f106353c;
    }

    public String toString() {
        return "source(" + this.f106352b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
