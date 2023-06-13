package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
/* renamed from: ev */
/* loaded from: classes8.dex */
public class C20138ev implements PublicKey, Key {
    private static final long serialVersionUID = -5617456225328969766L;

    /* renamed from: b */
    public transient AbstractC33820Jl2 f79114b;

    public C20138ev(C39159cT5 c39159cT5) throws IOException {
        m42392a(c39159cT5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m42392a(C39159cT5.m61288o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m42392a(C39159cT5 c39159cT5) throws IOException {
        this.f79114b = (AbstractC33820Jl2) C43389ja4.m30293a(c39159cT5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20138ev) {
            try {
                return C0210Ao.m115254a(this.f79114b.getEncoded(), ((C20138ev) obj).f79114b.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C39770dT5.m44228a(this.f79114b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return C0210Ao.m115244k(this.f79114b.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
