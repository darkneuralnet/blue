package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzapn;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: ut7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC50104ut7 extends AbstractC33654Is7 {

    /* renamed from: b */
    public static final Logger f113168b = Logger.getLogger(AbstractC50104ut7.class.getName());

    /* renamed from: c */
    public static final boolean f113169c = C32286Cw7.m111255C();

    /* renamed from: a */
    public C50696vt7 f113170a;

    private AbstractC50104ut7() {
    }

    public /* synthetic */ AbstractC50104ut7(C47733qt7 c47733qt7) {
    }

    /* renamed from: b */
    public static int m9569b(byte[] bArr) {
        int length = bArr.length;
        return m9558m(length) + length;
    }

    /* renamed from: c */
    public static int m9568c(AbstractC44175kt7 abstractC44175kt7) {
        int mo28217e = abstractC44175kt7.mo28217e();
        return m9558m(mo28217e) + mo28217e;
    }

    @Deprecated
    /* renamed from: d */
    public static int m9567d(int i, InterfaceC41230fv7 interfaceC41230fv7, InterfaceC34851Nv7 interfaceC34851Nv7) {
        int m9558m = m9558m(i << 3);
        int i2 = m9558m + m9558m;
        AbstractC52465ys7 abstractC52465ys7 = (AbstractC52465ys7) interfaceC41230fv7;
        int mo2344b = abstractC52465ys7.mo2344b();
        if (mo2344b == -1) {
            mo2344b = interfaceC34851Nv7.zza(abstractC52465ys7);
            abstractC52465ys7.mo2342d(mo2344b);
        }
        return i2 + mo2344b;
    }

    @Deprecated
    /* renamed from: e */
    public static int m9566e(InterfaceC41230fv7 interfaceC41230fv7) {
        return interfaceC41230fv7.mo40440w();
    }

    /* renamed from: f */
    public static int m9565f(int i) {
        if (i >= 0) {
            return m9558m(i);
        }
        return 10;
    }

    /* renamed from: g */
    public static int m9564g(C34608Mu7 c34608Mu7) {
        int m94585a = c34608Mu7.m94585a();
        return m9558m(m94585a) + m94585a;
    }

    /* renamed from: h */
    public static int m9563h(InterfaceC41230fv7 interfaceC41230fv7) {
        int mo40440w = interfaceC41230fv7.mo40440w();
        return m9558m(mo40440w) + mo40440w;
    }

    /* renamed from: i */
    public static int m9562i(InterfaceC41230fv7 interfaceC41230fv7, InterfaceC34851Nv7 interfaceC34851Nv7) {
        AbstractC52465ys7 abstractC52465ys7 = (AbstractC52465ys7) interfaceC41230fv7;
        int mo2344b = abstractC52465ys7.mo2344b();
        if (mo2344b == -1) {
            mo2344b = interfaceC34851Nv7.zza(abstractC52465ys7);
            abstractC52465ys7.mo2342d(mo2344b);
        }
        return m9558m(mo2344b) + mo2344b;
    }

    /* renamed from: j */
    public static int m9561j(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: k */
    public static int m9560k(String str) {
        int length;
        try {
            length = C33456Hw7.m103210e(str);
        } catch (C33222Gw7 unused) {
            length = str.getBytes(C46557ou7.f102752b).length;
        }
        return m9558m(length) + length;
    }

    /* renamed from: l */
    public static int m9559l(int i) {
        return m9558m(i << 3);
    }

    /* renamed from: m */
    public static int m9558m(int i) {
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

    /* renamed from: n */
    public static int m9557n(long j) {
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

    /* renamed from: o */
    public static AbstractC50104ut7 m9556o(byte[] bArr) {
        return new C48918st7(bArr, 0, bArr.length);
    }

    /* renamed from: p */
    public static AbstractC50104ut7 m9555p(OutputStream outputStream, int i) {
        return new C49511tt7(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo9587A(int i, int i2) throws IOException;

    /* renamed from: B */
    public abstract void mo9586B(int i) throws IOException;

    /* renamed from: C */
    public abstract void mo9585C(int i, long j) throws IOException;

    /* renamed from: D */
    public abstract void mo9584D(long j) throws IOException;

    /* renamed from: E */
    public abstract void mo9583E(int i, int i2) throws IOException;

    /* renamed from: F */
    public abstract void mo9582F(int i) throws IOException;

    /* renamed from: G */
    public abstract void mo9581G(int i, InterfaceC41230fv7 interfaceC41230fv7, InterfaceC34851Nv7 interfaceC34851Nv7) throws IOException;

    /* renamed from: H */
    public abstract void mo9580H(InterfaceC41230fv7 interfaceC41230fv7) throws IOException;

    /* renamed from: I */
    public abstract void mo9579I(int i, InterfaceC41230fv7 interfaceC41230fv7) throws IOException;

    /* renamed from: J */
    public abstract void mo9578J(int i, AbstractC44175kt7 abstractC44175kt7) throws IOException;

    /* renamed from: K */
    public abstract void mo9577K(int i, String str) throws IOException;

    /* renamed from: L */
    public abstract void mo9576L(String str) throws IOException;

    /* renamed from: M */
    public abstract void mo9575M(int i, int i2) throws IOException;

    /* renamed from: N */
    public abstract void mo9574N(int i, int i2) throws IOException;

    /* renamed from: O */
    public abstract void mo9573O(int i) throws IOException;

    /* renamed from: P */
    public abstract void mo9572P(int i, long j) throws IOException;

    /* renamed from: Q */
    public abstract void mo9571Q(long j) throws IOException;

    @Override // p000.AbstractC33654Is7
    /* renamed from: a */
    public abstract void mo9570a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: q */
    public final void m9554q() {
        if (mo9547x() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: r */
    public final void m9553r(String str, C33222Gw7 c33222Gw7) throws IOException {
        f113168b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c33222Gw7);
        byte[] bytes = str.getBytes(C46557ou7.f102752b);
        try {
            int length = bytes.length;
            mo9573O(length);
            mo9570a(bytes, 0, length);
        } catch (zzapn e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzapn(e2);
        }
    }

    /* renamed from: t */
    public abstract void mo9551t() throws IOException;

    /* renamed from: u */
    public abstract void mo9550u(byte b) throws IOException;

    /* renamed from: v */
    public abstract void mo9549v(int i, boolean z) throws IOException;

    /* renamed from: w */
    public abstract void mo9548w(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: x */
    public abstract int mo9547x();

    /* renamed from: y */
    public abstract void mo9546y(int i, AbstractC44175kt7 abstractC44175kt7) throws IOException;

    /* renamed from: z */
    public abstract void mo9545z(AbstractC44175kt7 abstractC44175kt7) throws IOException;
}
