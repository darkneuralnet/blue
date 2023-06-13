package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
/* renamed from: sv */
/* loaded from: classes8.dex */
public class C28477sv implements PrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;

    /* renamed from: b */
    public transient TH6 f109565b;

    /* renamed from: c */
    public transient C5448N f109566c;

    /* renamed from: d */
    public transient AbstractC8888W f109567d;

    public C28477sv(C44301l64 c44301l64) throws IOException {
        m13391a(c44301l64);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m13391a(C44301l64.m27863o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m13391a(C44301l64 c44301l64) throws IOException {
        this.f109567d = c44301l64.m27864j();
        this.f109566c = FH6.m107355o(c44301l64.m27862s().m105698s()).m107354s().m105700j();
        this.f109565b = (TH6) C43708k64.m29289b(c44301l64);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28477sv) {
            C28477sv c28477sv = (C28477sv) obj;
            return this.f109566c.m86135u(c28477sv.f109566c) && C0210Ao.m115254a(this.f109565b.m83966c(), c28477sv.f109565b.m83966c());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C44894m64.m26341a(this.f109565b, this.f109567d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f109566c.hashCode() + (C0210Ao.m115244k(this.f109565b.m83966c()) * 37);
    }
}
