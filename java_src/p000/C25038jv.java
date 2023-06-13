package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
/* renamed from: jv */
/* loaded from: classes8.dex */
public class C25038jv implements Key, PrivateKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient C40997fY2 f93523b;

    /* renamed from: c */
    public transient AbstractC8888W f93524c;

    public C25038jv(C44301l64 c44301l64) throws IOException {
        m29769a(c44301l64);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m29769a(C44301l64.m27863o((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* renamed from: a */
    public final void m29769a(C44301l64 c44301l64) throws IOException {
        this.f93524c = c44301l64.m27864j();
        this.f93523b = (C40997fY2) C43708k64.m29289b(c44301l64);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C25038jv) {
            return C0210Ao.m115252c(this.f93523b.m41206a(), ((C25038jv) obj).f93523b.m41206a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return C44894m64.m26341a(this.f93523b, this.f93524c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return C0210Ao.m115240o(this.f93523b.m41206a());
    }
}
