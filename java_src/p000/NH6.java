package p000;

import java.io.IOException;
/* renamed from: NH6 */
/* loaded from: classes8.dex */
public final class NH6 extends HH6 implements InterfaceC39228cb1 {

    /* renamed from: d */
    public final JH6 f24395d;

    /* renamed from: e */
    public final int f24396e;

    /* renamed from: f */
    public final byte[] f24397f;

    /* renamed from: g */
    public final byte[] f24398g;

    /* renamed from: NH6$b */
    /* loaded from: classes8.dex */
    public static class C5539b {

        /* renamed from: a */
        public final JH6 f24399a;

        /* renamed from: b */
        public byte[] f24400b = null;

        /* renamed from: c */
        public byte[] f24401c = null;

        /* renamed from: d */
        public byte[] f24402d = null;

        public C5539b(JH6 jh6) {
            this.f24399a = jh6;
        }

        /* renamed from: e */
        public NH6 m94095e() {
            return new NH6(this);
        }

        /* renamed from: f */
        public C5539b m94094f(byte[] bArr) {
            this.f24402d = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: g */
        public C5539b m94093g(byte[] bArr) {
            this.f24401c = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: h */
        public C5539b m94092h(byte[] bArr) {
            this.f24400b = WH6.m78619c(bArr);
            return this;
        }
    }

    public NH6(C5539b c5539b) {
        super(false, c5539b.f24399a.m100735e());
        JH6 jh6 = c5539b.f24399a;
        this.f24395d = jh6;
        if (jh6 == null) {
            throw new NullPointerException("params == null");
        }
        int m100734f = jh6.m100734f();
        byte[] bArr = c5539b.f24402d;
        if (bArr != null) {
            if (bArr.length == m100734f + m100734f) {
                this.f24396e = 0;
                this.f24397f = WH6.m78615g(bArr, 0, m100734f);
                this.f24398g = WH6.m78615g(bArr, m100734f + 0, m100734f);
                return;
            } else if (bArr.length != m100734f + 4 + m100734f) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.f24396e = DD3.m110683a(bArr, 0);
                this.f24397f = WH6.m78615g(bArr, 4, m100734f);
                this.f24398g = WH6.m78615g(bArr, 4 + m100734f, m100734f);
                return;
            }
        }
        if (jh6.m100736d() != null) {
            this.f24396e = jh6.m100736d().mo24690a();
        } else {
            this.f24396e = 0;
        }
        byte[] bArr2 = c5539b.f24400b;
        if (bArr2 == null) {
            this.f24397f = new byte[m100734f];
        } else if (bArr2.length != m100734f) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.f24397f = bArr2;
        }
        byte[] bArr3 = c5539b.f24401c;
        if (bArr3 == null) {
            this.f24398g = new byte[m100734f];
        } else if (bArr3.length != m100734f) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.f24398g = bArr3;
        }
    }

    /* renamed from: b */
    public JH6 m94103b() {
        return this.f24395d;
    }

    /* renamed from: c */
    public byte[] m94102c() {
        return WH6.m78619c(this.f24398g);
    }

    /* renamed from: d */
    public byte[] m94101d() {
        return WH6.m78619c(this.f24397f);
    }

    /* renamed from: e */
    public byte[] m94100e() {
        byte[] bArr;
        int m100734f = this.f24395d.m100734f();
        int i = this.f24396e;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[m100734f + 4 + m100734f];
            DD3.m110680d(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[m100734f + m100734f];
        }
        WH6.m78617e(bArr, this.f24397f, i2);
        WH6.m78617e(bArr, this.f24398g, i2 + m100734f);
        return bArr;
    }

    @Override // p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        return m94100e();
    }
}
