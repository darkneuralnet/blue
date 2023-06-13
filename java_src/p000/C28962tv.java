package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
/* renamed from: tv */
/* loaded from: classes8.dex */
public class C28962tv implements PublicKey {
    private static final long serialVersionUID = -5617456225328969766L;

    /* renamed from: b */
    public transient VH6 f111368b;

    /* renamed from: c */
    public transient C5448N f111369c;

    public C28962tv(C39159cT5 c39159cT5) throws IOException {
        m11222a(c39159cT5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m11222a(C39159cT5.m61288o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m11222a(C39159cT5 c39159cT5) throws IOException {
        VH6 vh6 = (VH6) C43389ja4.m30293a(c39159cT5);
        this.f111368b = vh6;
        this.f111369c = S31.m86058a(vh6.m109245a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28962tv) {
            C28962tv c28962tv = (C28962tv) obj;
            try {
                if (this.f111369c.m86135u(c28962tv.f111369c)) {
                    if (C0210Ao.m115254a(this.f111368b.getEncoded(), c28962tv.f111368b.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C39770dT5.m44228a(this.f111368b).getEncoded();
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
            return this.f111369c.hashCode() + (C0210Ao.m115244k(this.f111368b.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f111369c.hashCode();
        }
    }
}
