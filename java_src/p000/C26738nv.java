package p000;

import java.security.PublicKey;
/* renamed from: nv */
/* loaded from: classes8.dex */
public class C26738nv implements PublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public short[][] f101067b;

    /* renamed from: c */
    public short[][] f101068c;

    /* renamed from: d */
    public short[] f101069d;

    /* renamed from: e */
    public int f101070e;

    public C26738nv(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f101070e = i;
        this.f101067b = sArr;
        this.f101068c = sArr2;
        this.f101069d = sArr3;
    }

    /* renamed from: a */
    public short[][] m22194a() {
        return this.f101067b;
    }

    /* renamed from: b */
    public short[] m22193b() {
        return C0210Ao.m115250e(this.f101069d);
    }

    /* renamed from: c */
    public short[][] m22192c() {
        short[][] sArr = new short[this.f101068c.length];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.f101068c;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = C0210Ao.m115250e(sArr2[i]);
            i++;
        }
    }

    /* renamed from: d */
    public int m22191d() {
        return this.f101070e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C26738nv)) {
            return false;
        }
        C26738nv c26738nv = (C26738nv) obj;
        return this.f101070e == c26738nv.m22191d() && C39351cn4.m60870j(this.f101067b, c26738nv.m22194a()) && C39351cn4.m60870j(this.f101068c, c26738nv.m22192c()) && C39351cn4.m60871i(this.f101069d, c26738nv.m22193b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return C36151Tk2.m83045a(new C2675G9(BD3.f2070a, TF0.f35039b), new C38165an4(this.f101070e, this.f101067b, this.f101068c, this.f101069d));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f101070e * 37) + C0210Ao.m115239p(this.f101067b)) * 37) + C0210Ao.m115239p(this.f101068c)) * 37) + C0210Ao.m115240o(this.f101069d);
    }

    public C26738nv(C38758bn4 c38758bn4) {
        this(c38758bn4.m63975d(), c38758bn4.m63978a(), c38758bn4.m63976c(), c38758bn4.m63977b());
    }
}
