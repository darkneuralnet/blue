package p000;

import com.google.android.gms.internal.measurement.zzkg;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: QP8 */
/* loaded from: classes5.dex */
public abstract class QP8 extends C43258jL8 {

    /* renamed from: b */
    public static final Logger f30335b = Logger.getLogger(QP8.class.getName());

    /* renamed from: c */
    public static final boolean f30336c = C44919m89.m26281C();

    /* renamed from: a */
    public C38542bQ8 f30337a;

    private QP8() {
    }

    public /* synthetic */ QP8(FP8 fp8) {
    }

    /* renamed from: A */
    public static QP8 m88522A(byte[] bArr, int i, int i2) {
        return new C43887kP8(bArr, 0, i2);
    }

    @Deprecated
    /* renamed from: u */
    public static int m88518u(int i, InterfaceC47814r19 interfaceC47814r19, F39 f39) {
        int mo19212a = ((QJ8) interfaceC47814r19).mo19212a(f39);
        int m88514y = m88514y(i << 3);
        return m88514y + m88514y + mo19212a;
    }

    /* renamed from: v */
    public static int m88517v(int i) {
        if (i >= 0) {
            return m88514y(i);
        }
        return 10;
    }

    /* renamed from: w */
    public static int m88516w(InterfaceC47814r19 interfaceC47814r19, F39 f39) {
        int mo19212a = ((QJ8) interfaceC47814r19).mo19212a(f39);
        return m88514y(mo19212a) + mo19212a;
    }

    /* renamed from: x */
    public static int m88515x(String str) {
        int length;
        try {
            length = Z89.m73653c(str);
        } catch (S89 unused) {
            length = str.getBytes(XV8.f43342b).length;
        }
        return m88514y(length) + length;
    }

    /* renamed from: y */
    public static int m88514y(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: z */
    public static int m88513z(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public final void m88521a() {
        if (mo29010d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public final void m88520b(String str, S89 s89) throws IOException {
        f30335b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) s89);
        byte[] bytes = str.getBytes(XV8.f43342b);
        try {
            int length = bytes.length;
            mo28996r(length);
            mo29000n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(e);
        }
    }

    /* renamed from: d */
    public abstract int mo29010d();

    /* renamed from: e */
    public abstract void mo29009e(byte b) throws IOException;

    /* renamed from: f */
    public abstract void mo29008f(int i, boolean z) throws IOException;

    /* renamed from: g */
    public abstract void mo29007g(int i, AbstractC40913fO8 abstractC40913fO8) throws IOException;

    /* renamed from: h */
    public abstract void mo29006h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo29005i(int i) throws IOException;

    /* renamed from: j */
    public abstract void mo29004j(int i, long j) throws IOException;

    /* renamed from: k */
    public abstract void mo29003k(long j) throws IOException;

    /* renamed from: l */
    public abstract void mo29002l(int i, int i2) throws IOException;

    /* renamed from: m */
    public abstract void mo29001m(int i) throws IOException;

    /* renamed from: n */
    public abstract void mo29000n(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo28999o(int i, String str) throws IOException;

    /* renamed from: p */
    public abstract void mo28998p(int i, int i2) throws IOException;

    /* renamed from: q */
    public abstract void mo28997q(int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo28996r(int i) throws IOException;

    /* renamed from: s */
    public abstract void mo28995s(int i, long j) throws IOException;

    /* renamed from: t */
    public abstract void mo28994t(long j) throws IOException;
}
