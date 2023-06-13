package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m28432d2 = {"LpZ0;", "LwB5;", "Li30;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "", "write", "flush", "b", "()V", "close", "LJ46;", "timeout", "", "toString", "", "syncFlush", C17296a.f69688o, "Ln30;", "Ln30;", "sink", "Ljava/util/zip/Deflater;", "c", "Ljava/util/zip/Deflater;", "deflater", DateTokenConverter.CONVERTER_KEY, "Z", "closed", "<init>", "(Ln30;Ljava/util/zip/Deflater;)V", "(LwB5;Ljava/util/zip/Deflater;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: pZ0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46934pZ0 implements InterfaceC50872wB5 {

    /* renamed from: b */
    public final InterfaceC45453n30 f103797b;

    /* renamed from: c */
    public final Deflater f103798c;

    /* renamed from: d */
    public boolean f103799d;

    public C46934pZ0(InterfaceC45453n30 sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f103797b = sink;
        this.f103798c = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public final void m19108a(boolean z) {
        C36208Tq5 m34568S;
        int deflate;
        C42488i30 mo24529e = this.f103797b.mo24529e();
        while (true) {
            m34568S = mo24529e.m34568S(1);
            if (z) {
                Deflater deflater = this.f103798c;
                byte[] bArr = m34568S.f36326a;
                int i = m34568S.f36328c;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.f103798c;
                byte[] bArr2 = m34568S.f36326a;
                int i2 = m34568S.f36328c;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                m34568S.f36328c += deflate;
                mo24529e.m34571O(mo24529e.size() + deflate);
                this.f103797b.mo24531T1();
            } else if (this.f103798c.needsInput()) {
                break;
            }
        }
        if (m34568S.f36327b == m34568S.f36328c) {
            mo24529e.f86657b = m34568S.m82375b();
            C38799br5.m62277b(m34568S);
        }
    }

    /* renamed from: b */
    public final void m19107b() {
        this.f103798c.finish();
        m19108a(false);
    }

    @Override // p000.InterfaceC50872wB5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f103799d) {
            return;
        }
        try {
            m19107b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f103798c.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f103797b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f103799d = true;
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // p000.InterfaceC50872wB5, java.io.Flushable
    public void flush() throws IOException {
        m19108a(true);
        this.f103797b.flush();
    }

    @Override // p000.InterfaceC50872wB5
    public J46 timeout() {
        return this.f103797b.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f103797b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC50872wB5
    public void write(C42488i30 source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        FJ6.m107320b(source.size(), 0L, j);
        while (j > 0) {
            C36208Tq5 c36208Tq5 = source.f86657b;
            Intrinsics.checkNotNull(c36208Tq5);
            int min = (int) Math.min(j, c36208Tq5.f36328c - c36208Tq5.f36327b);
            this.f103798c.setInput(c36208Tq5.f36326a, c36208Tq5.f36327b, min);
            m19108a(false);
            long j2 = min;
            source.m34571O(source.size() - j2);
            int i = c36208Tq5.f36327b + min;
            c36208Tq5.f36327b = i;
            if (i == c36208Tq5.f36328c) {
                source.f86657b = c36208Tq5.m82375b();
                C38799br5.m62277b(c36208Tq5);
            }
            j -= j2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46934pZ0(InterfaceC50872wB5 sink, Deflater deflater) {
        this(C34928Oe3.m91760c(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
