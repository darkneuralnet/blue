package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
/* renamed from: kv */
/* loaded from: classes8.dex */
public class C25548kv implements Key, PublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient C41590gY2 f95193b;

    public C25548kv(C39159cT5 c39159cT5) throws IOException {
        m28166a(c39159cT5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m28166a(C39159cT5.m61288o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m28166a(C39159cT5 c39159cT5) throws IOException {
        this.f95193b = (C41590gY2) C43389ja4.m30293a(c39159cT5);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C25548kv)) {
            return false;
        }
        return C0210Ao.m115254a(this.f95193b.m39181a(), ((C25548kv) obj).f95193b.m39181a());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C39770dT5.m44228a(this.f95193b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C0210Ao.m115244k(this.f95193b.m39181a());
    }
}
