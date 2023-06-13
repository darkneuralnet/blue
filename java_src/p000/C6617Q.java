package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
/* renamed from: Q */
/* loaded from: classes8.dex */
public class C6617Q {

    /* renamed from: a */
    public OutputStream f29618a;

    public C6617Q(OutputStream outputStream) {
        this.f29618a = outputStream;
    }

    /* renamed from: a */
    public static C6617Q m89170a(OutputStream outputStream) {
        return new C6617Q(outputStream);
    }

    /* renamed from: b */
    public static C6617Q m89169b(OutputStream outputStream, String str) {
        return str.equals("DER") ? new XF0(outputStream) : str.equals("DL") ? new C44391lG0(outputStream) : new C6617Q(outputStream);
    }

    /* renamed from: c */
    public void m89168c() throws IOException {
    }

    /* renamed from: d */
    public XF0 mo77165d() {
        return new XF0(this.f29618a);
    }

    /* renamed from: e */
    public C6617Q mo27601e() {
        return new C44391lG0(this.f29618a);
    }

    /* renamed from: f */
    public final void m89167f(int i) throws IOException {
        this.f29618a.write(i);
    }

    /* renamed from: g */
    public final void m89166g(byte[] bArr, int i, int i2) throws IOException {
        this.f29618a.write(bArr, i, i2);
    }

    /* renamed from: h */
    public final void m89165h(Enumeration enumeration) throws IOException {
        while (enumeration.hasMoreElements()) {
            mo27600u(((InterfaceC1693E) enumeration.nextElement()).mo13850c(), true);
        }
    }

    /* renamed from: i */
    public final void m89164i(InterfaceC1693E[] interfaceC1693EArr) throws IOException {
        for (InterfaceC1693E interfaceC1693E : interfaceC1693EArr) {
            mo27600u(interfaceC1693E.mo13850c(), true);
        }
    }

    /* renamed from: j */
    public final void m89163j(boolean z, int i, byte b) throws IOException {
        if (z) {
            m89167f(i);
        }
        m89155r(1);
        m89167f(b);
    }

    /* renamed from: k */
    public final void m89162k(boolean z, int i, byte b, byte[] bArr) throws IOException {
        if (z) {
            m89167f(i);
        }
        m89155r(bArr.length + 1);
        m89167f(b);
        m89166g(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public final void m89161l(boolean z, int i, byte b, byte[] bArr, int i2, int i3, byte b2) throws IOException {
        if (z) {
            m89167f(i);
        }
        m89155r(i3 + 2);
        m89167f(b);
        m89166g(bArr, i2, i3);
        m89167f(b2);
    }

    /* renamed from: m */
    public final void m89160m(boolean z, int i, int i2, byte[] bArr) throws IOException {
        m89152v(z, i, i2);
        m89155r(bArr.length);
        m89166g(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public final void m89159n(boolean z, int i, byte[] bArr) throws IOException {
        if (z) {
            m89167f(i);
        }
        m89155r(bArr.length);
        m89166g(bArr, 0, bArr.length);
    }

    /* renamed from: o */
    public final void m89158o(boolean z, int i, int i2, byte[] bArr) throws IOException {
        m89152v(z, i, i2);
        m89167f(128);
        m89166g(bArr, 0, bArr.length);
        m89167f(0);
        m89167f(0);
    }

    /* renamed from: p */
    public final void m89157p(boolean z, int i, Enumeration enumeration) throws IOException {
        if (z) {
            m89167f(i);
        }
        m89167f(128);
        m89165h(enumeration);
        m89167f(0);
        m89167f(0);
    }

    /* renamed from: q */
    public final void m89156q(boolean z, int i, InterfaceC1693E[] interfaceC1693EArr) throws IOException {
        if (z) {
            m89167f(i);
        }
        m89167f(128);
        m89164i(interfaceC1693EArr);
        m89167f(0);
        m89167f(0);
    }

    /* renamed from: r */
    public final void m89155r(int i) throws IOException {
        if (i <= 127) {
            m89167f((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            }
            i3++;
        }
        m89167f((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            m89167f((byte) (i >> i4));
        }
    }

    /* renamed from: s */
    public void m89154s(InterfaceC1693E interfaceC1693E) throws IOException {
        if (interfaceC1693E == null) {
            throw new IOException("null object detected");
        }
        mo27600u(interfaceC1693E.mo13850c(), true);
        m89168c();
    }

    /* renamed from: t */
    public void m89153t(AbstractC7305S abstractC7305S) throws IOException {
        if (abstractC7305S == null) {
            throw new IOException("null object detected");
        }
        mo27600u(abstractC7305S, true);
        m89168c();
    }

    /* renamed from: u */
    public void mo27600u(AbstractC7305S abstractC7305S, boolean z) throws IOException {
        abstractC7305S.mo16145o(this, z);
    }

    /* renamed from: v */
    public final void m89152v(boolean z, int i, int i2) throws IOException {
        if (z) {
            if (i2 < 31) {
                m89167f(i | i2);
                return;
            }
            m89167f(31 | i);
            if (i2 < 128) {
                m89167f(i2);
                return;
            }
            byte[] bArr = new byte[5];
            int i3 = 4;
            bArr[4] = (byte) (i2 & 127);
            do {
                i2 >>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            } while (i2 > 127);
            m89166g(bArr, i3, 5 - i3);
        }
    }
}
