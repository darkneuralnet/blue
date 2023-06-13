package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
/* renamed from: qv */
/* loaded from: classes8.dex */
public class C27735qv implements PrivateKey {
    private static final long serialVersionUID = 7682140473044521395L;

    /* renamed from: b */
    public transient C5448N f106058b;

    /* renamed from: c */
    public transient LH6 f106059c;

    /* renamed from: d */
    public transient AbstractC8888W f106060d;

    public C27735qv(C44301l64 c44301l64) throws IOException {
        m16793a(c44301l64);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m16793a(C44301l64.m27863o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m16793a(C44301l64 c44301l64) throws IOException {
        this.f106060d = c44301l64.m27864j();
        this.f106058b = IH6.m102558o(c44301l64.m27862s().m105698s()).m102556u().m105700j();
        this.f106059c = (LH6) C43708k64.m29289b(c44301l64);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27735qv) {
            C27735qv c27735qv = (C27735qv) obj;
            return this.f106058b.m86135u(c27735qv.f106058b) && C0210Ao.m115254a(this.f106059c.m97394c(), c27735qv.f106059c.m97394c());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C44894m64.m26341a(this.f106059c, this.f106060d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f106058b.hashCode() + (C0210Ao.m115244k(this.f106059c.m97394c()) * 37);
    }
}
