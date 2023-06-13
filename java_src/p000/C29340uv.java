package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
/* renamed from: uv */
/* loaded from: classes8.dex */
public class C29340uv implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient C48735sb4 f113193b;

    /* renamed from: c */
    public transient AbstractC8888W f113194c;

    public C29340uv(C44301l64 c44301l64) throws IOException {
        m9498a(c44301l64);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m9498a(C44301l64.m27863o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m9498a(C44301l64 c44301l64) throws IOException {
        this.f113194c = c44301l64.m27864j();
        this.f113193b = (C48735sb4) C43708k64.m29289b(c44301l64);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29340uv) {
            C29340uv c29340uv = (C29340uv) obj;
            return this.f113193b.m13960b() == c29340uv.f113193b.m13960b() && C0210Ao.m115254a(this.f113193b.m13961a(), c29340uv.f113193b.m13961a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return C49921ub4.m9999a(this.f113193b.m13960b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C44894m64.m26341a(this.f113193b, this.f113194c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f113193b.m13960b() + (C0210Ao.m115244k(this.f113193b.m13961a()) * 37);
    }
}
