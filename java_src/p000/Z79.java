package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zznr;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: Z79 */
/* loaded from: classes5.dex */
public abstract class Z79 extends C43703k59 {

    /* renamed from: b */
    public static final Logger f47865b = Logger.getLogger(Z79.class.getName());

    /* renamed from: c */
    public static final boolean f47866c = C51221wm9.m6369C();

    /* renamed from: a */
    public C41954h89 f47867a;

    private Z79() {
    }

    public /* synthetic */ Z79(S79 s79) {
    }

    /* renamed from: A */
    public static int m73712A(byte[] bArr) {
        int length = bArr.length;
        return m73702d(length) + length;
    }

    /* renamed from: B */
    public static int m73711B(T69 t69) {
        int mo7402c = t69.mo7402c();
        return m73702d(mo7402c) + mo7402c;
    }

    @Deprecated
    /* renamed from: C */
    public static int m73710C(int i, InterfaceC47012pg9 interfaceC47012pg9, Ei9 ei9) {
        int m73702d = m73702d(i << 3);
        int i2 = m73702d + m73702d;
        A39 a39 = (A39) interfaceC47012pg9;
        int mo9994a = a39.mo9994a();
        if (mo9994a == -1) {
            mo9994a = ei9.zza(a39);
            a39.mo9993b(mo9994a);
        }
        return i2 + mo9994a;
    }

    @Deprecated
    /* renamed from: D */
    public static int m73709D(InterfaceC47012pg9 interfaceC47012pg9) {
        return interfaceC47012pg9.mo9989i();
    }

    /* renamed from: E */
    public static int m73708E(int i) {
        if (i >= 0) {
            return m73702d(i);
        }
        return 10;
    }

    /* renamed from: F */
    public static int m73707F(Rc9 rc9) {
        int m86542a = rc9.m86542a();
        return m73702d(m86542a) + m86542a;
    }

    /* renamed from: G */
    public static int m73706G(InterfaceC47012pg9 interfaceC47012pg9) {
        int mo9989i = interfaceC47012pg9.mo9989i();
        return m73702d(mo9989i) + mo9989i;
    }

    /* renamed from: a */
    public static int m73705a(InterfaceC47012pg9 interfaceC47012pg9, Ei9 ei9) {
        A39 a39 = (A39) interfaceC47012pg9;
        int mo9994a = a39.mo9994a();
        if (mo9994a == -1) {
            mo9994a = ei9.zza(a39);
            a39.mo9993b(mo9994a);
        }
        return m73702d(mo9994a) + mo9994a;
    }

    /* renamed from: b */
    public static int m73704b(String str) {
        int length;
        try {
            length = Zm9.m72529c(str);
        } catch (Tm9 unused) {
            length = str.getBytes(C44007kc9.f94654b).length;
        }
        return m73702d(length) + length;
    }

    /* renamed from: c */
    public static int m73703c(int i) {
        return m73702d(i << 3);
    }

    /* renamed from: d */
    public static int m73702d(int i) {
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

    /* renamed from: e */
    public static int m73701e(long j) {
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

    /* renamed from: f */
    public static Z79 m73700f(byte[] bArr) {
        return new E79(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final void m73699g() {
        if (mo73696j() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: h */
    public final void m73698h(String str, Tm9 tm9) throws IOException {
        f47865b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) tm9);
        byte[] bytes = str.getBytes(C44007kc9.f94654b);
        try {
            int length = bytes.length;
            mo73682x(length);
            mo73686t(bytes, 0, length);
        } catch (zznr e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zznr(e2);
        }
    }

    /* renamed from: j */
    public abstract int mo73696j();

    /* renamed from: k */
    public abstract void mo73695k(byte b) throws IOException;

    /* renamed from: l */
    public abstract void mo73694l(int i, boolean z) throws IOException;

    /* renamed from: m */
    public abstract void mo73693m(int i, T69 t69) throws IOException;

    /* renamed from: n */
    public abstract void mo73692n(int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo73691o(int i) throws IOException;

    /* renamed from: p */
    public abstract void mo73690p(int i, long j) throws IOException;

    /* renamed from: q */
    public abstract void mo73689q(long j) throws IOException;

    /* renamed from: r */
    public abstract void mo73688r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo73687s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo73686t(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo73685u(int i, String str) throws IOException;

    /* renamed from: v */
    public abstract void mo73684v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo73683w(int i, int i2) throws IOException;

    /* renamed from: x */
    public abstract void mo73682x(int i) throws IOException;

    /* renamed from: y */
    public abstract void mo73681y(int i, long j) throws IOException;

    /* renamed from: z */
    public abstract void mo73680z(long j) throws IOException;
}
