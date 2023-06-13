package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Typography;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010G\u001a\u00020E¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\rH\u0016J \u0010/\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000fH\u0016J\u0018\u00108\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0018\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J(\u0010<\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\b\u0010=\u001a\u00020\u0001H\u0016J\b\u0010?\u001a\u00020>H\u0016J\b\u0010@\u001a\u00020\bH\u0016J\b\u0010A\u001a\u00020\nH\u0016J\b\u0010C\u001a\u00020BH\u0016J\b\u0010D\u001a\u00020\u001eH\u0016R\u0014\u0010G\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010FR\u0014\u0010I\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010HR\u0016\u0010K\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u0010JR\u001b\u0010P\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M¨\u0006S"}, m28432d2 = {"Lbs4;", "Lo30;", "Li30;", "F1", "sink", "", "byteCount", "read", "", "O2", "", "x2", "o", "", "readByte", "LM70;", "h1", "F0", "Lry3;", "options", "", "Q2", "", "L0", "r2", "readFully", "Ljava/nio/ByteBuffer;", "d0", "LwB5;", "Z2", "", "r1", "Ljava/nio/charset/Charset;", "charset", "e1", "o2", "limit", "V1", "", "readShort", "i", "readInt", "g", "readLong", "S2", "B1", "skip", "b", C17296a.f69688o, "fromIndex", "toIndex", "bytes", "e2", "c", "targetBytes", "x1", DateTokenConverter.CONVERTER_KEY, "offset", "p3", "bytesOffset", "f", "peek", "Ljava/io/InputStream;", "w3", "isOpen", "close", "LJ46;", "timeout", "toString", "LAN5;", "LAN5;", Stripe3ds2AuthParams.FIELD_SOURCE, "Li30;", "bufferField", "Z", "closed", "e", "()Li30;", "getBuffer$annotations", "()V", "buffer", "<init>", "(LAN5;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bs4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38808bs4 implements InterfaceC46046o30 {
    @JvmField

    /* renamed from: b */
    public final AN5 f59659b;
    @JvmField

    /* renamed from: c */
    public final C42488i30 f59660c;
    @JvmField

    /* renamed from: d */
    public boolean f59661d;

    public C38808bs4(AN5 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f59659b = source;
        this.f59660c = new C42488i30();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: B1 */
    public long mo21949B1() {
        byte m34547p;
        int checkRadix;
        int checkRadix2;
        mo21928x2(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo21935o(i2)) {
                break;
            }
            m34547p = this.f59660c.m34547p(i);
            if ((m34547p < ((byte) 48) || m34547p > ((byte) 57)) && ((m34547p < ((byte) 97) || m34547p > ((byte) 102)) && (m34547p < ((byte) 65) || m34547p > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            checkRadix = CharsKt__CharJVMKt.checkRadix(16);
            checkRadix2 = CharsKt__CharJVMKt.checkRadix(checkRadix);
            String num = Integer.toString(m34547p, checkRadix2);
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.f59660c.mo21949B1();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: F0 */
    public M70 mo21948F0(long j) {
        mo21928x2(j);
        return this.f59660c.mo21948F0(j);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: F1 */
    public C42488i30 mo21947F1() {
        return this.f59660c;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: L0 */
    public byte[] mo21946L0() {
        this.f59660c.mo24532R2(this.f59659b);
        return this.f59660c.mo21946L0();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: O2 */
    public boolean mo21945O2() {
        if (!this.f59661d) {
            if (this.f59660c.mo21945O2() && this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: Q2 */
    public int mo21944Q2(C48371ry3 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!this.f59661d) {
            while (true) {
                int m114102e = BJ6.m114102e(this.f59660c, options, true);
                if (m114102e != -2) {
                    if (m114102e != -1) {
                        this.f59660c.skip(options.m14972c()[m114102e].size());
                        return m114102e;
                    }
                } else if (this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    break;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(16);
        r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // p000.InterfaceC46046o30
    /* renamed from: S2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo21943S2() {
        mo21928x2(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo21935o(j2)) {
                break;
            }
            byte m34547p = this.f59660c.m34547p(j);
            if ((m34547p < ((byte) 48) || m34547p > ((byte) 57)) && !(j == 0 && m34547p == ((byte) 45))) {
                break;
            }
            j = j2;
        }
        return this.f59660c.mo21943S2();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: V1 */
    public String mo21942V1(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == LongCompanionObject.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long m62267b = m62267b(b, 0L, j2);
            if (m62267b != -1) {
                return BJ6.m114103d(this.f59660c, m62267b);
            }
            if (j2 < LongCompanionObject.MAX_VALUE && mo21935o(j2) && this.f59660c.m34547p(j2 - 1) == ((byte) 13) && mo21935o(1 + j2) && this.f59660c.m34547p(j2) == b) {
                return BJ6.m114103d(this.f59660c, j2);
            }
            C42488i30 c42488i30 = new C42488i30();
            C42488i30 c42488i302 = this.f59660c;
            c42488i302.m34553l(c42488i30, 0L, Math.min(32, c42488i302.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f59660c.size(), j) + " content=" + c42488i30.mo21936h1().mo43597j() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: Z2 */
    public long mo21941Z2(InterfaceC50872wB5 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
            long m34558g = this.f59660c.m34558g();
            if (m34558g > 0) {
                j += m34558g;
                sink.write(this.f59660c, m34558g);
            }
        }
        if (this.f59660c.size() > 0) {
            long size = j + this.f59660c.size();
            C42488i30 c42488i30 = this.f59660c;
            sink.write(c42488i30, c42488i30.size());
            return size;
        }
        return j;
    }

    /* renamed from: a */
    public long m62268a(byte b) {
        return m62267b(b, 0L, LongCompanionObject.MAX_VALUE);
    }

    /* renamed from: b */
    public long m62267b(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f59661d) {
            if (0 > j || j > j2) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long m34546q = this.f59660c.m34546q(b, j, j2);
                    if (m34546q != -1) {
                        return m34546q;
                    }
                    long size = this.f59660c.size();
                    if (size >= j2 || this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, size);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: c */
    public long m62266c(M70 bytes, long j) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.f59661d)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m34545r = this.f59660c.m34545r(bytes, j);
            if (m34545r == -1) {
                long size = this.f59660c.size();
                if (this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                j = Math.max(j, (size - bytes.size()) + 1);
            } else {
                return m34545r;
            }
        }
    }

    @Override // p000.AN5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f59661d) {
            this.f59661d = true;
            this.f59659b.close();
            this.f59660c.m34561d();
        }
    }

    /* renamed from: d */
    public long m62265d(M70 targetBytes, long j) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.f59661d)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m34543t = this.f59660c.m34543t(targetBytes, j);
            if (m34543t == -1) {
                long size = this.f59660c.size();
                if (this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                j = Math.max(j, size);
            } else {
                return m34543t;
            }
        }
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: d0 */
    public void mo21940d0(C42488i30 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            mo21928x2(j);
            this.f59660c.mo21940d0(sink, j);
        } catch (EOFException e) {
            sink.mo24532R2(this.f59660c);
            throw e;
        }
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: e */
    public C42488i30 mo21939e() {
        return this.f59660c;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: e1 */
    public String mo21938e1(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f59660c.mo24532R2(this.f59659b);
        return this.f59660c.mo21938e1(charset);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: e2 */
    public long mo21937e2(M70 bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m62266c(bytes, 0L);
    }

    /* renamed from: f */
    public boolean m62264f(long j, M70 bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!this.f59661d) {
            if (j >= 0 && i >= 0 && i2 >= 0 && bytes.size() - i >= i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    long j2 = i3 + j;
                    if (mo21935o(1 + j2) && this.f59660c.m34547p(j2) == bytes.m95808e(i + i3)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: g */
    public int m62263g() {
        mo21928x2(4L);
        return this.f59660c.m34576B();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: h1 */
    public M70 mo21936h1() {
        this.f59660c.mo24532R2(this.f59659b);
        return this.f59660c.mo21936h1();
    }

    /* renamed from: i */
    public short m62262i() {
        mo21928x2(2L);
        return this.f59660c.m34575C();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f59661d;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: o */
    public boolean mo21935o(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f59661d) {
                while (this.f59660c.size() < j) {
                    if (this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: o2 */
    public String mo21934o2() {
        return mo21942V1(LongCompanionObject.MAX_VALUE);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: p3 */
    public boolean mo21933p3(long j, M70 bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m62264f(j, bytes, 0, bytes.size());
    }

    @Override // p000.InterfaceC46046o30
    public InterfaceC46046o30 peek() {
        return C34928Oe3.m91759d(new ZP3(this));
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: r1 */
    public String mo21932r1() {
        this.f59660c.mo24532R2(this.f59659b);
        return this.f59660c.mo21932r1();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: r2 */
    public byte[] mo21931r2(long j) {
        mo21928x2(j);
        return this.f59660c.mo21931r2(j);
    }

    @Override // p000.AN5
    public long read(C42488i30 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j >= 0) {
            if (!this.f59661d) {
                if (this.f59660c.size() == 0 && this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                return this.f59660c.read(sink, Math.min(j, this.f59660c.size()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // p000.InterfaceC46046o30
    public byte readByte() {
        mo21928x2(1L);
        return this.f59660c.readByte();
    }

    @Override // p000.InterfaceC46046o30
    public void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            mo21928x2(sink.length);
            this.f59660c.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (this.f59660c.size() > 0) {
                C42488i30 c42488i30 = this.f59660c;
                int read = c42488i30.read(sink, i, (int) c42488i30.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    @Override // p000.InterfaceC46046o30
    public int readInt() {
        mo21928x2(4L);
        return this.f59660c.readInt();
    }

    @Override // p000.InterfaceC46046o30
    public long readLong() {
        mo21928x2(8L);
        return this.f59660c.readLong();
    }

    @Override // p000.InterfaceC46046o30
    public short readShort() {
        mo21928x2(2L);
        return this.f59660c.readShort();
    }

    @Override // p000.InterfaceC46046o30
    public void skip(long j) {
        if (!this.f59661d) {
            while (j > 0) {
                if (this.f59660c.size() == 0 && this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f59660c.size());
                this.f59660c.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000.AN5
    public J46 timeout() {
        return this.f59659b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f59659b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: w3 */
    public InputStream mo21930w3() {
        return new C13317a();
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: x1 */
    public long mo21929x1(M70 targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return m62265d(targetBytes, 0L);
    }

    @Override // p000.InterfaceC46046o30
    /* renamed from: x2 */
    public void mo21928x2(long j) {
        if (!mo21935o(j)) {
            throw new EOFException();
        }
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m28432d2 = {"bs4$a", "Ljava/io/InputStream;", "", "read", "", MessageExtension.FIELD_DATA, "offset", "byteCount", "available", "", "close", "", "toString", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bs4$a */
    /* loaded from: classes8.dex */
    public static final class C13317a extends InputStream {
        public C13317a() {
        }

        @Override // java.io.InputStream
        public int available() {
            C38808bs4 c38808bs4 = C38808bs4.this;
            if (!c38808bs4.f59661d) {
                return (int) Math.min(c38808bs4.f59660c.size(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C38808bs4.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C38808bs4 c38808bs4 = C38808bs4.this;
            if (!c38808bs4.f59661d) {
                if (c38808bs4.f59660c.size() == 0) {
                    C38808bs4 c38808bs42 = C38808bs4.this;
                    if (c38808bs42.f59659b.read(c38808bs42.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return C38808bs4.this.f59660c.readByte() & UByte.MAX_VALUE;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C38808bs4.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!C38808bs4.this.f59661d) {
                FJ6.m107320b(data.length, i, i2);
                if (C38808bs4.this.f59660c.size() == 0) {
                    C38808bs4 c38808bs4 = C38808bs4.this;
                    if (c38808bs4.f59659b.read(c38808bs4.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                }
                return C38808bs4.this.f59660c.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f59660c.size() == 0 && this.f59659b.read(this.f59660c, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.f59660c.read(sink);
    }
}
