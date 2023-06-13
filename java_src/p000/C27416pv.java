package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
/* renamed from: pv */
/* loaded from: classes8.dex */
public class C27416pv implements PublicKey, Key {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient C5448N f104312b;

    /* renamed from: c */
    public transient C50564vg5 f104313c;

    public C27416pv(C39159cT5 c39159cT5) throws IOException {
        m18435a(c39159cT5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m18435a(C39159cT5.m61288o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m18435a(C39159cT5 c39159cT5) throws IOException {
        this.f104312b = C48786sg5.m13849j(c39159cT5.m61289j().m105698s()).m13848o().m105700j();
        this.f104313c = (C50564vg5) C43389ja4.m30293a(c39159cT5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27416pv) {
            C27416pv c27416pv = (C27416pv) obj;
            return this.f104312b.m86135u(c27416pv.f104312b) && C0210Ao.m115254a(this.f104313c.m8264b(), c27416pv.f104313c.m8264b());
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
            return (this.f104313c.m11928a() != null ? C39770dT5.m44228a(this.f104313c) : new C39159cT5(new C2675G9(BD3.f2087r, new C48786sg5(new C2675G9(this.f104312b))), this.f104313c.m8264b())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f104312b.hashCode() + (C0210Ao.m115244k(this.f104313c.m8264b()) * 37);
    }
}
