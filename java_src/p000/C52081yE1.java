package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J \u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"LyE1;", "LAN5;", "Li30;", "sink", "", "byteCount", "read", "LJ46;", "timeout", "", "close", "b", "c", "buffer", "offset", DateTokenConverter.CONVERTER_KEY, "", "name", "", "expected", "actual", C17296a.f69688o, "", "B", "section", "Lbs4;", "Lbs4;", Stripe3ds2AuthParams.FIELD_SOURCE, "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "LN12;", "e", "LN12;", "inflaterSource", "Ljava/util/zip/CRC32;", "f", "Ljava/util/zip/CRC32;", "crc", "<init>", "(LAN5;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: yE1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C52081yE1 implements AN5 {

    /* renamed from: b */
    public byte f119157b;

    /* renamed from: c */
    public final C38808bs4 f119158c;

    /* renamed from: d */
    public final Inflater f119159d;

    /* renamed from: e */
    public final N12 f119160e;

    /* renamed from: f */
    public final CRC32 f119161f;

    public C52081yE1(AN5 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        C38808bs4 c38808bs4 = new C38808bs4(source);
        this.f119158c = c38808bs4;
        Inflater inflater = new Inflater(true);
        this.f119159d = inflater;
        this.f119160e = new N12((InterfaceC46046o30) c38808bs4, inflater);
        this.f119161f = new CRC32();
    }

    /* renamed from: a */
    public final void m3800a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        throw new IOException(format);
    }

    /* renamed from: b */
    public final void m3799b() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        this.f119158c.mo21928x2(10L);
        byte m34547p = this.f119158c.f59660c.m34547p(3L);
        boolean z4 = true;
        if (((m34547p >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m3797d(this.f119158c.f59660c, 0L, 10L);
        }
        m3800a("ID1ID2", 8075, this.f119158c.readShort());
        this.f119158c.skip(8L);
        if (((m34547p >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f119158c.mo21928x2(2L);
            if (z) {
                m3797d(this.f119158c.f59660c, 0L, 2L);
            }
            long m34575C = this.f119158c.f59660c.m34575C();
            this.f119158c.mo21928x2(m34575C);
            if (z) {
                m3797d(this.f119158c.f59660c, 0L, m34575C);
            }
            this.f119158c.skip(m34575C);
        }
        if (((m34547p >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long m62268a = this.f119158c.m62268a((byte) 0);
            if (m62268a != -1) {
                if (z) {
                    m3797d(this.f119158c.f59660c, 0L, m62268a + 1);
                }
                this.f119158c.skip(m62268a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((m34547p >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long m62268a2 = this.f119158c.m62268a((byte) 0);
            if (m62268a2 != -1) {
                if (z) {
                    m3797d(this.f119158c.f59660c, 0L, m62268a2 + 1);
                }
                this.f119158c.skip(m62268a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m3800a("FHCRC", this.f119158c.m62262i(), (short) this.f119161f.getValue());
            this.f119161f.reset();
        }
    }

    /* renamed from: c */
    public final void m3798c() throws IOException {
        m3800a("CRC", this.f119158c.m62263g(), (int) this.f119161f.getValue());
        m3800a("ISIZE", this.f119158c.m62263g(), (int) this.f119159d.getBytesWritten());
    }

    @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f119160e.close();
    }

    /* renamed from: d */
    public final void m3797d(C42488i30 c42488i30, long j, long j2) {
        int i;
        C36208Tq5 c36208Tq5 = c42488i30.f86657b;
        Intrinsics.checkNotNull(c36208Tq5);
        while (true) {
            int i2 = c36208Tq5.f36328c;
            int i3 = c36208Tq5.f36327b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            c36208Tq5 = c36208Tq5.f36331f;
            Intrinsics.checkNotNull(c36208Tq5);
        }
        while (j2 > 0) {
            int min = (int) Math.min(c36208Tq5.f36328c - i, j2);
            this.f119161f.update(c36208Tq5.f36326a, (int) (c36208Tq5.f36327b + j), min);
            j2 -= min;
            c36208Tq5 = c36208Tq5.f36331f;
            Intrinsics.checkNotNull(c36208Tq5);
            j = 0;
        }
    }

    @Override // p000.AN5
    public long read(C42488i30 sink, long j) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return 0L;
            }
            if (this.f119157b == 0) {
                m3799b();
                this.f119157b = (byte) 1;
            }
            if (this.f119157b == 1) {
                long size = sink.size();
                long read = this.f119160e.read(sink, j);
                if (read != -1) {
                    m3797d(sink, size, read);
                    return read;
                }
                this.f119157b = (byte) 2;
            }
            if (this.f119157b == 2) {
                m3798c();
                this.f119157b = (byte) 3;
                if (!this.f119158c.mo21945O2()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // p000.AN5
    public J46 timeout() {
        return this.f119158c.timeout();
    }
}
