package p000;

import java.io.IOException;
import java.security.PublicKey;
/* renamed from: gv */
/* loaded from: classes8.dex */
public class C22509gv implements InterfaceC51182wj0, PublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public C45058mO2 f84431b;

    public C22509gv(C45058mO2 c45058mO2) {
        this.f84431b = c45058mO2;
    }

    /* renamed from: a */
    public OA1 m37341a() {
        return this.f84431b.m25685b();
    }

    /* renamed from: b */
    public int m37340b() {
        return this.f84431b.m25684c();
    }

    /* renamed from: c */
    public int m37339c() {
        return this.f84431b.m25683d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C22509gv)) {
            return false;
        }
        C22509gv c22509gv = (C22509gv) obj;
        return this.f84431b.m25684c() == c22509gv.m37340b() && this.f84431b.m25683d() == c22509gv.m37339c() && this.f84431b.m25685b().equals(c22509gv.m37341a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C39159cT5(new C2675G9(BD3.f2083n), new C44465lO2(this.f84431b.m25684c(), this.f84431b.m25683d(), this.f84431b.m25685b(), C33563Ii6.m101755a(this.f84431b.m34031a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f84431b.m25684c() + (this.f84431b.m25683d() * 37)) * 37) + this.f84431b.m25685b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f84431b.m25684c() + "\n") + " error correction capability: " + this.f84431b.m25683d() + "\n") + " generator matrix           : " + this.f84431b.m25685b().toString();
    }
}
