package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
/* renamed from: ov */
/* loaded from: classes8.dex */
public class C27102ov implements PrivateKey, Key {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient C5448N f102757b;

    /* renamed from: c */
    public transient C49972ug5 f102758c;

    /* renamed from: d */
    public transient AbstractC8888W f102759d;

    public C27102ov(C44301l64 c44301l64) throws IOException {
        m20282a(c44301l64);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m20282a(C44301l64.m27863o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m20282a(C44301l64 c44301l64) throws IOException {
        this.f102759d = c44301l64.m27864j();
        this.f102757b = C48786sg5.m13849j(c44301l64.m27862s().m105698s()).m13848o().m105700j();
        this.f102758c = (C49972ug5) C43708k64.m29289b(c44301l64);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27102ov) {
            C27102ov c27102ov = (C27102ov) obj;
            return this.f102757b.m86135u(c27102ov.f102757b) && C0210Ao.m115254a(this.f102758c.m9883b(), c27102ov.f102758c.m9883b());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.f102758c.m11928a() != null ? C44894m64.m26341a(this.f102758c, this.f102759d) : new C44301l64(new C2675G9(BD3.f2087r, new C48786sg5(new C2675G9(this.f102757b))), new VF0(this.f102758c.m9883b()), this.f102759d)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f102757b.hashCode() + (C0210Ao.m115244k(this.f102758c.m9883b()) * 37);
    }
}
