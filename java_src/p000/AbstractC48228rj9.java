package p000;

import com.google.android.gms.internal.recaptcha.zzqh;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: rj9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC48228rj9 extends If9 {

    /* renamed from: b */
    public static final Logger f107542b = Logger.getLogger(AbstractC48228rj9.class.getName());

    /* renamed from: c */
    public static final boolean f107543c = Fs9.m106358C();

    /* renamed from: a */
    public C52377yj9 f107544a;

    private AbstractC48228rj9() {
    }

    public /* synthetic */ AbstractC48228rj9(Ii9 ii9) {
    }

    /* renamed from: O */
    public static int m15518O(byte[] bArr) {
        int length = bArr.length;
        return m15506l(length) + length;
    }

    /* renamed from: b */
    public static int m15516b(AbstractC45836nh9 abstractC45836nh9) {
        int mo11924c = abstractC45836nh9.mo11924c();
        return m15506l(mo11924c) + mo11924c;
    }

    @Deprecated
    /* renamed from: c */
    public static int m15515c(int i, Np9 np9, InterfaceC38803br9 interfaceC38803br9) {
        int m15506l = m15506l(i << 3);
        int i2 = m15506l + m15506l;
        Ne9 ne9 = (Ne9) np9;
        int mo93595a = ne9.mo93595a();
        if (mo93595a == -1) {
            mo93595a = interfaceC38803br9.zza(ne9);
            ne9.mo93593i(mo93595a);
        }
        return i2 + mo93595a;
    }

    @Deprecated
    /* renamed from: d */
    public static int m15514d(Np9 np9) {
        return np9.mo93341g();
    }

    /* renamed from: e */
    public static int m15513e(int i) {
        if (i >= 0) {
            return m15506l(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m15512f(C38180ao9 c38180ao9) {
        int m65454a = c38180ao9.m65454a();
        return m15506l(m65454a) + m65454a;
    }

    /* renamed from: g */
    public static int m15511g(Np9 np9) {
        int mo93341g = np9.mo93341g();
        return m15506l(mo93341g) + mo93341g;
    }

    /* renamed from: h */
    public static int m15510h(Np9 np9, InterfaceC38803br9 interfaceC38803br9) {
        Ne9 ne9 = (Ne9) np9;
        int mo93595a = ne9.mo93595a();
        if (mo93595a == -1) {
            mo93595a = interfaceC38803br9.zza(ne9);
            ne9.mo93593i(mo93595a);
        }
        return m15506l(mo93595a) + mo93595a;
    }

    /* renamed from: i */
    public static int m15509i(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: j */
    public static int m15508j(String str) {
        int length;
        try {
            length = Ps9.m89658c(str);
        } catch (Ns9 unused) {
            length = str.getBytes(Fn9.f10238a).length;
        }
        return m15506l(length) + length;
    }

    /* renamed from: k */
    public static int m15507k(int i) {
        return m15506l(i << 3);
    }

    /* renamed from: l */
    public static int m15506l(int i) {
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

    /* renamed from: m */
    public static int m15505m(long j) {
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
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: n */
    public static AbstractC48228rj9 m15504n(byte[] bArr) {
        return new Xi9(bArr, 0, bArr.length);
    }

    /* renamed from: o */
    public static AbstractC48228rj9 m15503o(OutputStream outputStream, int i) {
        return new C44077kj9(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo15532A(int i) throws IOException;

    /* renamed from: B */
    public abstract void mo15531B(int i, long j) throws IOException;

    /* renamed from: C */
    public abstract void mo15530C(long j) throws IOException;

    /* renamed from: D */
    public abstract void mo15529D(int i, int i2) throws IOException;

    /* renamed from: E */
    public abstract void mo15528E(int i) throws IOException;

    /* renamed from: F */
    public abstract void mo15527F(int i, Np9 np9, InterfaceC38803br9 interfaceC38803br9) throws IOException;

    /* renamed from: G */
    public abstract void mo15526G(Np9 np9) throws IOException;

    /* renamed from: H */
    public abstract void mo15525H(int i, String str) throws IOException;

    /* renamed from: I */
    public abstract void mo15524I(String str) throws IOException;

    /* renamed from: J */
    public abstract void mo15523J(int i, int i2) throws IOException;

    /* renamed from: K */
    public abstract void mo15522K(int i, int i2) throws IOException;

    /* renamed from: L */
    public abstract void mo15521L(int i) throws IOException;

    /* renamed from: M */
    public abstract void mo15520M(int i, long j) throws IOException;

    /* renamed from: N */
    public abstract void mo15519N(long j) throws IOException;

    @Override // p000.If9
    /* renamed from: a */
    public abstract void mo15517a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: p */
    public final void m15502p() {
        if (mo15495w() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: q */
    public final void m15501q(String str, Ns9 ns9) throws IOException {
        f107542b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ns9);
        byte[] bytes = str.getBytes(Fn9.f10238a);
        try {
            int length = bytes.length;
            mo15521L(length);
            mo15517a(bytes, 0, length);
        } catch (zzqh e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzqh(e2);
        }
    }

    /* renamed from: s */
    public abstract void mo15499s() throws IOException;

    /* renamed from: t */
    public abstract void mo15498t(byte b) throws IOException;

    /* renamed from: u */
    public abstract void mo15497u(int i, boolean z) throws IOException;

    /* renamed from: v */
    public abstract void mo15496v(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract int mo15495w();

    /* renamed from: x */
    public abstract void mo15494x(int i, AbstractC45836nh9 abstractC45836nh9) throws IOException;

    /* renamed from: y */
    public abstract void mo15493y(AbstractC45836nh9 abstractC45836nh9) throws IOException;

    /* renamed from: z */
    public abstract void mo15492z(int i, int i2) throws IOException;
}
