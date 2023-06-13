package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
/* renamed from: vv */
/* loaded from: classes8.dex */
public class C29699vv implements PublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient C49328tb4 f114902b;

    public C29699vv(C39159cT5 c39159cT5) throws IOException {
        m7775a(c39159cT5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m7775a(C39159cT5.m61288o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m7775a(C39159cT5 c39159cT5) throws IOException {
        this.f114902b = (C49328tb4) C43389ja4.m30293a(c39159cT5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29699vv) {
            C29699vv c29699vv = (C29699vv) obj;
            return this.f114902b.m12021b() == c29699vv.f114902b.m12021b() && C0210Ao.m115254a(this.f114902b.m12022a(), c29699vv.f114902b.m12022a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return C49921ub4.m9999a(this.f114902b.m12021b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C39770dT5.m44228a(this.f114902b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f114902b.m12021b() + (C0210Ao.m115244k(this.f114902b.m12022a()) * 37);
    }
}
