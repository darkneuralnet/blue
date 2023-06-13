package p000;

import java.io.IOException;
import java.security.PrivateKey;
/* renamed from: hv */
/* loaded from: classes8.dex */
public class C22837hv implements InterfaceC51182wj0, PrivateKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public C48023rO2 f86168b;

    public C22837hv(C48023rO2 c48023rO2) {
        this.f86168b = c48023rO2;
    }

    /* renamed from: a */
    public PA1 m35503a() {
        return this.f86168b.m16014a();
    }

    /* renamed from: b */
    public TX3 m35502b() {
        return this.f86168b.m16013b();
    }

    /* renamed from: c */
    public int m35501c() {
        return this.f86168b.m16012c();
    }

    /* renamed from: d */
    public int m35500d() {
        return this.f86168b.m16011d();
    }

    /* renamed from: e */
    public C42121hR3 m35499e() {
        return this.f86168b.m16010e();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22837hv) {
            C22837hv c22837hv = (C22837hv) obj;
            return m35500d() == c22837hv.m35500d() && m35501c() == c22837hv.m35501c() && m35503a().equals(c22837hv.m35503a()) && m35502b().equals(c22837hv.m35502b()) && m35497g().equals(c22837hv.m35497g()) && m35499e().equals(c22837hv.m35499e()) && m35498f().equals(c22837hv.m35498f());
        }
        return false;
    }

    /* renamed from: f */
    public C42121hR3 m35498f() {
        return this.f86168b.m16009f();
    }

    /* renamed from: g */
    public OA1 m35497g() {
        return this.f86168b.m16008g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C44301l64(new C2675G9(BD3.f2082m), new C47430qO2(this.f86168b.m16011d(), this.f86168b.m16012c(), this.f86168b.m16014a(), this.f86168b.m16013b(), this.f86168b.m16010e(), this.f86168b.m16009f(), this.f86168b.m16008g())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.f86168b.m16012c() * 37) + this.f86168b.m16011d()) * 37) + this.f86168b.m16014a().hashCode()) * 37) + this.f86168b.m16013b().hashCode()) * 37) + this.f86168b.m16010e().hashCode()) * 37) + this.f86168b.m16009f().hashCode()) * 37) + this.f86168b.m16008g().hashCode();
    }
}
