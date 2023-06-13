package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
/* renamed from: dv */
/* loaded from: classes8.dex */
public class C19901dv implements PrivateKey, Key {
    private static final long serialVersionUID = 8568701712864512338L;

    /* renamed from: b */
    public transient AbstractC33820Jl2 f77406b;

    /* renamed from: c */
    public transient AbstractC8888W f77407c;

    public C19901dv(C44301l64 c44301l64) throws IOException {
        m43511a(c44301l64);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m43511a(C44301l64.m27863o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m43511a(C44301l64 c44301l64) throws IOException {
        this.f77407c = c44301l64.m27864j();
        this.f77406b = (AbstractC33820Jl2) C43708k64.m29289b(c44301l64);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19901dv) {
            try {
                return C0210Ao.m115254a(this.f77406b.getEncoded(), ((C19901dv) obj).f77406b.getEncoded());
            } catch (IOException unused) {
                throw new IllegalStateException("unable to perform equals");
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C44894m64.m26341a(this.f77406b, this.f77407c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return C0210Ao.m115244k(this.f77406b.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
