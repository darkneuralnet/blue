package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtn;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: Ja7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC33726Ja7 extends C46357oa7 {

    /* renamed from: b */
    public static final Logger f17883b = Logger.getLogger(AbstractC33726Ja7.class.getName());

    /* renamed from: c */
    public static final boolean f17884c = C34212Lc7.m96580C();

    /* renamed from: a */
    public C33960Ka7 f17885a;

    private AbstractC33726Ja7() {
    }

    public /* synthetic */ AbstractC33726Ja7(C33492Ia7 c33492Ia7) {
    }

    @Deprecated
    /* renamed from: A */
    public static int m100171A(int i, InterfaceC36075Tb7 interfaceC36075Tb7, InterfaceC42819ic7 interfaceC42819ic7) {
        int mo41145a = ((AbstractC40427ea7) interfaceC36075Tb7).mo41145a(interfaceC42819ic7);
        int m100166a = m100166a(i << 3);
        return m100166a + m100166a + mo41145a;
    }

    /* renamed from: B */
    public static int m100170B(int i) {
        if (i >= 0) {
            return m100166a(i);
        }
        return 10;
    }

    /* renamed from: C */
    public static int m100169C(InterfaceC36075Tb7 interfaceC36075Tb7) {
        int mo41143d = interfaceC36075Tb7.mo41143d();
        return m100166a(mo41143d) + mo41143d;
    }

    /* renamed from: D */
    public static int m100168D(InterfaceC36075Tb7 interfaceC36075Tb7, InterfaceC42819ic7 interfaceC42819ic7) {
        int mo41145a = ((AbstractC40427ea7) interfaceC36075Tb7).mo41145a(interfaceC42819ic7);
        return m100166a(mo41145a) + mo41145a;
    }

    /* renamed from: E */
    public static int m100167E(String str) {
        int length;
        try {
            length = C35382Qc7.m88316c(str);
        } catch (C35148Pc7 unused) {
            length = str.getBytes(C46960pb7.f103840b).length;
        }
        return m100166a(length) + length;
    }

    /* renamed from: a */
    public static int m100166a(int i) {
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

    /* renamed from: b */
    public static int m100165b(long j) {
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

    /* renamed from: c */
    public static AbstractC33726Ja7 m100164c(byte[] bArr, int i, int i2) {
        return new C33258Ha7(bArr, 0, i2);
    }

    /* renamed from: d */
    public final void m100163d() {
        if (mo100160g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: e */
    public final void m100162e(String str, C35148Pc7 c35148Pc7) throws IOException {
        f17883b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c35148Pc7);
        byte[] bytes = str.getBytes(C46960pb7.f103840b);
        try {
            int length = bytes.length;
            mo100143x(length);
            mo100149r(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zbtn(e);
        }
    }

    /* renamed from: g */
    public abstract int mo100160g();

    /* renamed from: h */
    public abstract void mo100159h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo100158i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo100157j(int i, AbstractC32088Ca7 abstractC32088Ca7) throws IOException;

    /* renamed from: k */
    public abstract void mo100156k(AbstractC32088Ca7 abstractC32088Ca7) throws IOException;

    /* renamed from: l */
    public abstract void mo100155l(int i, int i2) throws IOException;

    /* renamed from: m */
    public abstract void mo100154m(int i) throws IOException;

    /* renamed from: n */
    public abstract void mo100153n(int i, long j) throws IOException;

    /* renamed from: o */
    public abstract void mo100152o(long j) throws IOException;

    /* renamed from: p */
    public abstract void mo100151p(int i, int i2) throws IOException;

    /* renamed from: q */
    public abstract void mo100150q(int i) throws IOException;

    /* renamed from: r */
    public abstract void mo100149r(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo100148s(InterfaceC36075Tb7 interfaceC36075Tb7) throws IOException;

    /* renamed from: t */
    public abstract void mo100147t(int i, String str) throws IOException;

    /* renamed from: u */
    public abstract void mo100146u(String str) throws IOException;

    /* renamed from: v */
    public abstract void mo100145v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo100144w(int i, int i2) throws IOException;

    /* renamed from: x */
    public abstract void mo100143x(int i) throws IOException;

    /* renamed from: y */
    public abstract void mo100142y(int i, long j) throws IOException;

    /* renamed from: z */
    public abstract void mo100141z(long j) throws IOException;
}
