package p000;

import java.io.IOException;
import java.security.PublicKey;
/* renamed from: iv */
/* loaded from: classes8.dex */
public class C24633iv implements PublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public C49208tO2 f91677b;

    public C24633iv(C49208tO2 c49208tO2) {
        this.f91677b = c49208tO2;
    }

    /* renamed from: a */
    public OA1 m31656a() {
        return this.f91677b.m12440a();
    }

    /* renamed from: b */
    public int m31655b() {
        return this.f91677b.m12439b();
    }

    /* renamed from: c */
    public int m31654c() {
        return this.f91677b.m12438c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C24633iv) {
            C24633iv c24633iv = (C24633iv) obj;
            return this.f91677b.m12439b() == c24633iv.m31655b() && this.f91677b.m12438c() == c24633iv.m31654c() && this.f91677b.m12440a().equals(c24633iv.m31656a());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C39159cT5(new C2675G9(BD3.f2082m), new C48615sO2(this.f91677b.m12439b(), this.f91677b.m12438c(), this.f91677b.m12440a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f91677b.m12439b() + (this.f91677b.m12438c() * 37)) * 37) + this.f91677b.m12440a().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f91677b.m12439b() + "\n") + " error correction capability: " + this.f91677b.m12438c() + "\n") + " generator matrix           : " + this.f91677b.m12440a();
    }
}
