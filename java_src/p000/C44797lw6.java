package p000;

import p000.C32813Fd3;
/* renamed from: lw6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44797lw6 {

    /* renamed from: a */
    public final C45983nw6 f96995a;

    /* renamed from: b */
    public final C40532el2 f96996b;

    /* renamed from: c */
    public byte[] f96997c;

    /* renamed from: d */
    public byte[] f96998d;

    public C44797lw6(C45983nw6 c45983nw6) {
        if (c45983nw6 == null) {
            throw new NullPointerException("params == null");
        }
        this.f96995a = c45983nw6;
        int m22160c = c45983nw6.m22160c();
        this.f96996b = new C40532el2(c45983nw6.m22161b(), m22160c);
        this.f96997c = new byte[m22160c];
        this.f96998d = new byte[m22160c];
    }

    /* renamed from: a */
    public final byte[] m26617a(byte[] bArr, int i, int i2, C32813Fd3 c32813Fd3) {
        int m22160c = this.f96995a.m22160c();
        if (bArr != null) {
            if (bArr.length != m22160c) {
                throw new IllegalArgumentException("startHash needs to be " + m22160c + "bytes");
            } else if (c32813Fd3 != null) {
                if (c32813Fd3.mo12547d() != null) {
                    int i3 = i + i2;
                    if (i3 <= this.f96995a.m22159d() - 1) {
                        if (i2 == 0) {
                            return bArr;
                        }
                        byte[] m26617a = m26617a(bArr, i, i2 - 1, c32813Fd3);
                        C32813Fd3 c32813Fd32 = (C32813Fd3) new C32813Fd3.C2372b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m106839p(c32813Fd3.m106847g()).m106841n(c32813Fd3.m106849e()).m106840o(i3 - 1).m112394f(0).m106843l();
                        byte[] m42574c = this.f96996b.m42574c(this.f96998d, c32813Fd32.mo12547d());
                        byte[] m42574c2 = this.f96996b.m42574c(this.f96998d, ((C32813Fd3) new C32813Fd3.C2372b().m112393g(c32813Fd32.m112400b()).m112392h(c32813Fd32.m112399c()).m106839p(c32813Fd32.m106847g()).m106841n(c32813Fd32.m106849e()).m106840o(c32813Fd32.m106848f()).m112394f(1).m106843l()).mo12547d());
                        byte[] bArr2 = new byte[m22160c];
                        for (int i4 = 0; i4 < m22160c; i4++) {
                            bArr2[i4] = (byte) (m26617a[i4] ^ m42574c2[i4]);
                        }
                        return this.f96996b.m42576a(m42574c, bArr2);
                    }
                    throw new IllegalArgumentException("max chain length must not be greater than w");
                }
                throw new NullPointerException("otsHashAddress byte array == null");
            } else {
                throw new NullPointerException("otsHashAddress == null");
            }
        }
        throw new NullPointerException("startHash == null");
    }

    /* renamed from: b */
    public final byte[] m26616b(int i) {
        if (i < 0 || i >= this.f96995a.m22162a()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.f96996b.m42574c(this.f96997c, WH6.m78605q(i, 32));
    }

    /* renamed from: c */
    public C40532el2 m26615c() {
        return this.f96996b;
    }

    /* renamed from: d */
    public C45983nw6 m26614d() {
        return this.f96995a;
    }

    /* renamed from: e */
    public C46576ow6 m26613e(C32813Fd3 c32813Fd3) {
        if (c32813Fd3 != null) {
            byte[][] bArr = new byte[this.f96995a.m22162a()];
            for (int i = 0; i < this.f96995a.m22162a(); i++) {
                c32813Fd3 = (C32813Fd3) new C32813Fd3.C2372b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m106839p(c32813Fd3.m106847g()).m106841n(i).m106840o(c32813Fd3.m106848f()).m112394f(c32813Fd3.m112401a()).m106843l();
                bArr[i] = m26617a(m26616b(i), 0, this.f96995a.m22159d() - 1, c32813Fd3);
            }
            return new C46576ow6(this.f96995a, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* renamed from: f */
    public byte[] m26612f() {
        return C0210Ao.m115251d(this.f96998d);
    }

    /* renamed from: g */
    public byte[] m26611g(byte[] bArr, C32813Fd3 c32813Fd3) {
        return this.f96996b.m42574c(bArr, ((C32813Fd3) new C32813Fd3.C2372b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m106839p(c32813Fd3.m106847g()).m106843l()).mo12547d());
    }

    /* renamed from: h */
    public void m26610h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.f96995a.m22160c()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.f96995a.m22160c()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f96997c = bArr;
        this.f96998d = bArr2;
    }
}
