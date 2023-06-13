package p000;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: S */
/* loaded from: classes8.dex */
public abstract class AbstractC7305S extends AbstractC5142M {
    /* renamed from: v */
    public static AbstractC7305S m86134v(byte[] bArr) throws IOException {
        C3828J c3828j = new C3828J(bArr);
        try {
            AbstractC7305S m101405k = c3828j.m101405k();
            if (c3828j.available() == 0) {
                return m101405k;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // p000.AbstractC5142M, p000.InterfaceC1693E
    /* renamed from: c */
    public final AbstractC7305S mo13850c() {
        return this;
    }

    @Override // p000.AbstractC5142M
    /* renamed from: e */
    public void mo86137e(OutputStream outputStream) throws IOException {
        C6617Q.m89170a(outputStream).m89153t(this);
    }

    @Override // p000.AbstractC5142M
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1693E) && mo39779j(((InterfaceC1693E) obj).mo13850c());
    }

    @Override // p000.AbstractC5142M
    /* renamed from: f */
    public void mo86136f(OutputStream outputStream, String str) throws IOException {
        C6617Q.m89169b(outputStream, str).m89153t(this);
    }

    @Override // p000.AbstractC5142M
    public abstract int hashCode();

    /* renamed from: j */
    public abstract boolean mo39779j(AbstractC7305S abstractC7305S);

    /* renamed from: o */
    public abstract void mo16145o(C6617Q c6617q, boolean z) throws IOException;

    /* renamed from: s */
    public abstract int mo16144s() throws IOException;

    /* renamed from: u */
    public final boolean m86135u(AbstractC7305S abstractC7305S) {
        return this == abstractC7305S || mo39779j(abstractC7305S);
    }

    /* renamed from: w */
    public abstract boolean mo16143w();

    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return this;
    }

    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return this;
    }
}
