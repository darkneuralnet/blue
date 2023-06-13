package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
/* renamed from: rv */
/* loaded from: classes8.dex */
public class C28057rv implements PublicKey {
    private static final long serialVersionUID = 3230324130542413475L;

    /* renamed from: b */
    public transient C5448N f107890b;

    /* renamed from: c */
    public transient NH6 f107891c;

    public C28057rv(C39159cT5 c39159cT5) throws IOException {
        m15086a(c39159cT5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m15086a(C39159cT5.m61288o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m15086a(C39159cT5 c39159cT5) throws IOException {
        NH6 nh6 = (NH6) C43389ja4.m30293a(c39159cT5);
        this.f107891c = nh6;
        this.f107890b = S31.m86058a(nh6.m104061a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28057rv) {
            C28057rv c28057rv = (C28057rv) obj;
            return this.f107890b.m86135u(c28057rv.f107890b) && C0210Ao.m115254a(this.f107891c.m94100e(), c28057rv.f107891c.m94100e());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C39770dT5.m44228a(this.f107891c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f107890b.hashCode() + (C0210Ao.m115244k(this.f107891c.m94100e()) * 37);
    }
}
