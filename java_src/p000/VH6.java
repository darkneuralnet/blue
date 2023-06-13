package p000;

import java.io.IOException;
/* renamed from: VH6 */
/* loaded from: classes8.dex */
public final class VH6 extends EH6 implements InterfaceC39228cb1 {

    /* renamed from: d */
    public final RH6 f38841d;

    /* renamed from: e */
    public final int f38842e;

    /* renamed from: f */
    public final byte[] f38843f;

    /* renamed from: g */
    public final byte[] f38844g;

    /* renamed from: VH6$b */
    /* loaded from: classes8.dex */
    public static class C8597b {

        /* renamed from: a */
        public final RH6 f38845a;

        /* renamed from: b */
        public byte[] f38846b = null;

        /* renamed from: c */
        public byte[] f38847c = null;

        /* renamed from: d */
        public byte[] f38848d = null;

        public C8597b(RH6 rh6) {
            this.f38845a = rh6;
        }

        /* renamed from: e */
        public VH6 m80006e() {
            return new VH6(this);
        }

        /* renamed from: f */
        public C8597b m80005f(byte[] bArr) {
            this.f38848d = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: g */
        public C8597b m80004g(byte[] bArr) {
            this.f38847c = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: h */
        public C8597b m80003h(byte[] bArr) {
            this.f38846b = WH6.m78619c(bArr);
            return this;
        }
    }

    public VH6(C8597b c8597b) {
        super(false, c8597b.f38845a.m86984f());
        RH6 rh6 = c8597b.f38845a;
        this.f38841d = rh6;
        if (rh6 == null) {
            throw new NullPointerException("params == null");
        }
        int m86982h = rh6.m86982h();
        byte[] bArr = c8597b.f38848d;
        if (bArr != null) {
            if (bArr.length == m86982h + m86982h) {
                this.f38842e = 0;
                this.f38843f = WH6.m78615g(bArr, 0, m86982h);
                this.f38844g = WH6.m78615g(bArr, m86982h + 0, m86982h);
                return;
            } else if (bArr.length != m86982h + 4 + m86982h) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.f38842e = DD3.m110683a(bArr, 0);
                this.f38843f = WH6.m78615g(bArr, 4, m86982h);
                this.f38844g = WH6.m78615g(bArr, 4 + m86982h, m86982h);
                return;
            }
        }
        if (rh6.m86985e() != null) {
            this.f38842e = rh6.m86985e().mo24690a();
        } else {
            this.f38842e = 0;
        }
        byte[] bArr2 = c8597b.f38846b;
        if (bArr2 == null) {
            this.f38843f = new byte[m86982h];
        } else if (bArr2.length != m86982h) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.f38843f = bArr2;
        }
        byte[] bArr3 = c8597b.f38847c;
        if (bArr3 == null) {
            this.f38844g = new byte[m86982h];
        } else if (bArr3.length != m86982h) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.f38844g = bArr3;
        }
    }

    /* renamed from: b */
    public RH6 m80014b() {
        return this.f38841d;
    }

    /* renamed from: c */
    public byte[] m80013c() {
        return WH6.m78619c(this.f38844g);
    }

    /* renamed from: d */
    public byte[] m80012d() {
        return WH6.m78619c(this.f38843f);
    }

    /* renamed from: e */
    public byte[] m80011e() {
        byte[] bArr;
        int m86982h = this.f38841d.m86982h();
        int i = this.f38842e;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[m86982h + 4 + m86982h];
            DD3.m110680d(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[m86982h + m86982h];
        }
        WH6.m78617e(bArr, this.f38843f, i2);
        WH6.m78617e(bArr, this.f38844g, i2 + m86982h);
        return bArr;
    }

    @Override // p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        return m80011e();
    }
}
