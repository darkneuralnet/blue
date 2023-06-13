package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m28432d2 = {"LN12;", "LAN5;", "Li30;", "sink", "", "byteCount", "read", C17296a.f69688o, "", "b", "LJ46;", "timeout", "", "close", "c", "Lo30;", "Lo30;", Stripe3ds2AuthParams.FIELD_SOURCE, "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "", DateTokenConverter.CONVERTER_KEY, "I", "bufferBytesHeldByInflater", "e", "Z", "closed", "<init>", "(Lo30;Ljava/util/zip/Inflater;)V", "(LAN5;Ljava/util/zip/Inflater;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: N12 */
/* loaded from: classes8.dex */
public final class N12 implements AN5 {

    /* renamed from: b */
    public final InterfaceC46046o30 f23971b;

    /* renamed from: c */
    public final Inflater f23972c;

    /* renamed from: d */
    public int f23973d;

    /* renamed from: e */
    public boolean f23974e;

    public N12(InterfaceC46046o30 source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f23971b = source;
        this.f23972c = inflater;
    }

    /* renamed from: a */
    public final long m94454a(C42488i30 sink, long j) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f23974e) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    C36208Tq5 m34568S = sink.m34568S(1);
                    m94453b();
                    int inflate = this.f23972c.inflate(m34568S.f36326a, m34568S.f36328c, (int) Math.min(j, 8192 - m34568S.f36328c));
                    m94452c();
                    if (inflate > 0) {
                        m34568S.f36328c += inflate;
                        long j2 = inflate;
                        sink.m34571O(sink.size() + j2);
                        return j2;
                    }
                    if (m34568S.f36327b == m34568S.f36328c) {
                        sink.f86657b = m34568S.m82375b();
                        C38799br5.m62277b(m34568S);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* renamed from: b */
    public final boolean m94453b() throws IOException {
        if (!this.f23972c.needsInput()) {
            return false;
        }
        if (this.f23971b.mo21945O2()) {
            return true;
        }
        C36208Tq5 c36208Tq5 = this.f23971b.mo21939e().f86657b;
        Intrinsics.checkNotNull(c36208Tq5);
        int i = c36208Tq5.f36328c;
        int i2 = c36208Tq5.f36327b;
        int i3 = i - i2;
        this.f23973d = i3;
        this.f23972c.setInput(c36208Tq5.f36326a, i2, i3);
        return false;
    }

    /* renamed from: c */
    public final void m94452c() {
        int i = this.f23973d;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f23972c.getRemaining();
        this.f23973d -= remaining;
        this.f23971b.skip(remaining);
    }

    @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f23974e) {
            return;
        }
        this.f23972c.end();
        this.f23974e = true;
        this.f23971b.close();
    }

    @Override // p000.AN5
    public long read(C42488i30 sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long m94454a = m94454a(sink, j);
            if (m94454a > 0) {
                return m94454a;
            }
            if (this.f23972c.finished() || this.f23972c.needsDictionary()) {
                return -1L;
            }
        } while (!this.f23971b.mo21945O2());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p000.AN5
    public J46 timeout() {
        return this.f23971b.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N12(AN5 source, Inflater inflater) {
        this(C34928Oe3.m91759d(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
