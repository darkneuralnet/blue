package p000;

import java.io.IOException;
import java.security.PrivateKey;
/* renamed from: fv */
/* loaded from: classes8.dex */
public class C20621fv implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public C43872kO2 f81052b;

    public C20621fv(C43872kO2 c43872kO2) {
        this.f81052b = c43872kO2;
    }

    /* renamed from: a */
    public PA1 m40562a() {
        return this.f81052b.m29030b();
    }

    /* renamed from: b */
    public TX3 m40561b() {
        return this.f81052b.m29029c();
    }

    /* renamed from: c */
    public OA1 m40560c() {
        return this.f81052b.m29028d();
    }

    /* renamed from: d */
    public int m40559d() {
        return this.f81052b.m29027e();
    }

    /* renamed from: e */
    public int m40558e() {
        return this.f81052b.m29026f();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20621fv)) {
            return false;
        }
        C20621fv c20621fv = (C20621fv) obj;
        return m40558e() == c20621fv.m40558e() && m40559d() == c20621fv.m40559d() && m40562a().equals(c20621fv.m40562a()) && m40561b().equals(c20621fv.m40561b()) && m40557f().equals(c20621fv.m40557f()) && m40560c().equals(c20621fv.m40560c());
    }

    /* renamed from: f */
    public C42121hR3 m40557f() {
        return this.f81052b.m29025g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C44301l64(new C2675G9(BD3.f2083n), new C43279jO2(m40558e(), m40559d(), m40562a(), m40561b(), m40557f(), C33563Ii6.m101755a(this.f81052b.m34031a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.f81052b.m29027e() * 37) + this.f81052b.m29026f()) * 37) + this.f81052b.m29030b().hashCode()) * 37) + this.f81052b.m29029c().hashCode()) * 37) + this.f81052b.m29025g().hashCode()) * 37) + this.f81052b.m29028d().hashCode();
    }
}
