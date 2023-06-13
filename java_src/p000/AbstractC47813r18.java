package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdh;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: r18  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC47813r18 extends C50461vV7 {

    /* renamed from: b */
    public static final Logger f106235b = Logger.getLogger(AbstractC47813r18.class.getName());

    /* renamed from: c */
    public static final boolean f106236c = C37192Xv8.m76081C();

    /* renamed from: a */
    public E18 f106237a;

    private AbstractC47813r18() {
    }

    public /* synthetic */ AbstractC47813r18(C38901c18 c38901c18) {
    }

    /* renamed from: A */
    public static int m16656A(int i) {
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

    /* renamed from: B */
    public static int m16655B(long j) {
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
    public static AbstractC47813r18 m16654a(byte[] bArr, int i, int i2) {
        return new A08(bArr, 0, i2);
    }

    @Deprecated
    /* renamed from: v */
    public static int m16633v(int i, InterfaceC39926dj8 interfaceC39926dj8, InterfaceC32449Do8 interfaceC32449Do8) {
        int mo80353b = ((GT7) interfaceC39926dj8).mo80353b(interfaceC32449Do8);
        int m16656A = m16656A(i << 3);
        return m16656A + m16656A + mo80353b;
    }

    /* renamed from: w */
    public static int m16632w(int i) {
        if (i >= 0) {
            return m16656A(i);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m16631x(InterfaceC39926dj8 interfaceC39926dj8) {
        int mo43831l = interfaceC39926dj8.mo43831l();
        return m16656A(mo43831l) + mo43831l;
    }

    /* renamed from: y */
    public static int m16630y(InterfaceC39926dj8 interfaceC39926dj8, InterfaceC32449Do8 interfaceC32449Do8) {
        int mo80353b = ((GT7) interfaceC39926dj8).mo80353b(interfaceC32449Do8);
        return m16656A(mo80353b) + mo80353b;
    }

    /* renamed from: z */
    public static int m16629z(String str) {
        int length;
        try {
            length = C43623jx8.m29598e(str);
        } catch (C37435Yw8 unused) {
            length = str.getBytes(C32791Fa8.f9737b).length;
        }
        return m16656A(length) + length;
    }

    /* renamed from: b */
    public final void m16653b() {
        if (mo16650e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c */
    public final void m16652c(String str, C37435Yw8 c37435Yw8) throws IOException {
        f106235b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c37435Yw8);
        byte[] bytes = str.getBytes(C32791Fa8.f9737b);
        try {
            int length = bytes.length;
            mo16636s(length);
            mo16640o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(e);
        }
    }

    /* renamed from: e */
    public abstract int mo16650e();

    /* renamed from: f */
    public abstract void mo16649f(byte b) throws IOException;

    /* renamed from: g */
    public abstract void mo16648g(int i, boolean z) throws IOException;

    /* renamed from: h */
    public abstract void mo16647h(int i, AbstractC41604gZ7 abstractC41604gZ7) throws IOException;

    /* renamed from: i */
    public abstract void mo16646i(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo16645j(int i) throws IOException;

    /* renamed from: k */
    public abstract void mo16644k(int i, long j) throws IOException;

    /* renamed from: l */
    public abstract void mo16643l(long j) throws IOException;

    /* renamed from: m */
    public abstract void mo16642m(int i, int i2) throws IOException;

    /* renamed from: n */
    public abstract void mo16641n(int i) throws IOException;

    /* renamed from: o */
    public abstract void mo16640o(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo16639p(int i, String str) throws IOException;

    /* renamed from: q */
    public abstract void mo16638q(int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo16637r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo16636s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo16635t(int i, long j) throws IOException;

    /* renamed from: u */
    public abstract void mo16634u(long j) throws IOException;
}
