package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: M */
/* loaded from: classes8.dex */
public abstract class AbstractC5142M implements InterfaceC1693E, InterfaceC39228cb1 {
    @Override // p000.InterfaceC1693E
    /* renamed from: c */
    public abstract AbstractC7305S mo13850c();

    /* renamed from: e */
    public void mo86137e(OutputStream outputStream) throws IOException {
        C6617Q.m89170a(outputStream).m89154s(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC1693E) {
            return mo13850c().m86135u(((InterfaceC1693E) obj).mo13850c());
        }
        return false;
    }

    /* renamed from: f */
    public void mo86136f(OutputStream outputStream, String str) throws IOException {
        C6617Q.m89169b(outputStream, str).m89154s(this);
    }

    @Override // p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo86137e(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: h */
    public byte[] m96022h(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo86136f(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return mo13850c().hashCode();
    }
}
