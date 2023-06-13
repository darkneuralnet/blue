package p000;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LhA3;", "LwB5;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "flush", "close", "LJ46;", "timeout", "", "toString", "Ljava/io/OutputStream;", "b", "Ljava/io/OutputStream;", "out", "c", "LJ46;", "<init>", "(Ljava/io/OutputStream;LJ46;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: hA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41968hA3 implements InterfaceC50872wB5 {

    /* renamed from: b */
    public final OutputStream f84767b;

    /* renamed from: c */
    public final J46 f84768c;

    public C41968hA3(OutputStream out, J46 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f84767b = out;
        this.f84768c = timeout;
    }

    @Override // p000.InterfaceC50872wB5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f84767b.close();
    }

    @Override // p000.InterfaceC50872wB5, java.io.Flushable
    public void flush() {
        this.f84767b.flush();
    }

    @Override // p000.InterfaceC50872wB5
    public J46 timeout() {
        return this.f84768c;
    }

    public String toString() {
        return "sink(" + this.f84767b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC50872wB5
    public void write(C42488i30 source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        FJ6.m107320b(source.size(), 0L, j);
        while (j > 0) {
            this.f84768c.throwIfReached();
            C36208Tq5 c36208Tq5 = source.f86657b;
            Intrinsics.checkNotNull(c36208Tq5);
            int min = (int) Math.min(j, c36208Tq5.f36328c - c36208Tq5.f36327b);
            this.f84767b.write(c36208Tq5.f36326a, c36208Tq5.f36327b, min);
            c36208Tq5.f36327b += min;
            long j2 = min;
            j -= j2;
            source.m34571O(source.size() - j2);
            if (c36208Tq5.f36327b == c36208Tq5.f36328c) {
                source.f86657b = c36208Tq5.m82375b();
                C38799br5.m62277b(c36208Tq5);
            }
        }
    }
}
