package p000;

import java.io.IOException;
import p000.C32813Fd3;
/* renamed from: TH6 */
/* loaded from: classes8.dex */
public final class TH6 extends EH6 implements InterfaceC39228cb1 {

    /* renamed from: d */
    public final RH6 f35174d;

    /* renamed from: e */
    public final byte[] f35175e;

    /* renamed from: f */
    public final byte[] f35176f;

    /* renamed from: g */
    public final byte[] f35177g;

    /* renamed from: h */
    public final byte[] f35178h;

    /* renamed from: i */
    public volatile C29993wv f35179i;

    /* renamed from: TH6$b */
    /* loaded from: classes8.dex */
    public static class C7751b {

        /* renamed from: a */
        public final RH6 f35180a;

        /* renamed from: b */
        public int f35181b = 0;

        /* renamed from: c */
        public int f35182c = -1;

        /* renamed from: d */
        public byte[] f35183d = null;

        /* renamed from: e */
        public byte[] f35184e = null;

        /* renamed from: f */
        public byte[] f35185f = null;

        /* renamed from: g */
        public byte[] f35186g = null;

        /* renamed from: h */
        public C29993wv f35187h = null;

        /* renamed from: i */
        public byte[] f35188i = null;

        public C7751b(RH6 rh6) {
            this.f35180a = rh6;
        }

        /* renamed from: j */
        public TH6 m83956j() {
            return new TH6(this);
        }

        /* renamed from: k */
        public C7751b m83955k(C29993wv c29993wv) {
            this.f35187h = c29993wv;
            return this;
        }

        /* renamed from: l */
        public C7751b m83954l(int i) {
            this.f35181b = i;
            return this;
        }

        /* renamed from: m */
        public C7751b m83953m(int i) {
            this.f35182c = i;
            return this;
        }

        /* renamed from: n */
        public C7751b m83952n(byte[] bArr) {
            this.f35185f = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: o */
        public C7751b m83951o(byte[] bArr) {
            this.f35186g = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: p */
        public C7751b m83950p(byte[] bArr) {
            this.f35184e = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: q */
        public C7751b m83949q(byte[] bArr) {
            this.f35183d = WH6.m78619c(bArr);
            return this;
        }
    }

    public TH6(C7751b c7751b) {
        super(true, c7751b.f35180a.m86984f());
        RH6 rh6 = c7751b.f35180a;
        this.f35174d = rh6;
        if (rh6 == null) {
            throw new NullPointerException("params == null");
        }
        int m86982h = rh6.m86982h();
        byte[] bArr = c7751b.f35188i;
        if (bArr != null) {
            int m86988b = rh6.m86988b();
            int m110683a = DD3.m110683a(bArr, 0);
            if (!WH6.m78610l(m86988b, m110683a)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f35175e = WH6.m78615g(bArr, 4, m86982h);
            int i = 4 + m86982h;
            this.f35176f = WH6.m78615g(bArr, i, m86982h);
            int i2 = i + m86982h;
            this.f35177g = WH6.m78615g(bArr, i2, m86982h);
            int i3 = i2 + m86982h;
            this.f35178h = WH6.m78615g(bArr, i3, m86982h);
            int i4 = i3 + m86982h;
            try {
                C29993wv c29993wv = (C29993wv) WH6.m78616f(WH6.m78615g(bArr, i4, bArr.length - i4), C29993wv.class);
                if (c29993wv.m6112b() != m110683a) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f35179i = c29993wv.m6106h(c7751b.f35180a.m86983g());
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        byte[] bArr2 = c7751b.f35183d;
        if (bArr2 == null) {
            this.f35175e = new byte[m86982h];
        } else if (bArr2.length != m86982h) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.f35175e = bArr2;
        }
        byte[] bArr3 = c7751b.f35184e;
        if (bArr3 == null) {
            this.f35176f = new byte[m86982h];
        } else if (bArr3.length != m86982h) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.f35176f = bArr3;
        }
        byte[] bArr4 = c7751b.f35185f;
        if (bArr4 == null) {
            this.f35177g = new byte[m86982h];
        } else if (bArr4.length != m86982h) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.f35177g = bArr4;
        }
        byte[] bArr5 = c7751b.f35186g;
        if (bArr5 == null) {
            this.f35178h = new byte[m86982h];
        } else if (bArr5.length != m86982h) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.f35178h = bArr5;
        }
        C29993wv c29993wv2 = c7751b.f35187h;
        this.f35179i = c29993wv2 == null ? (c7751b.f35181b >= (1 << rh6.m86988b()) + (-2) || bArr4 == null || bArr2 == null) ? new C29993wv(rh6, (1 << rh6.m86988b()) - 1, c7751b.f35181b) : new C29993wv(rh6, bArr4, bArr2, (C32813Fd3) new C32813Fd3.C2372b().m106843l(), c7751b.f35181b) : c29993wv2;
        if (c7751b.f35182c >= 0 && c7751b.f35182c != this.f35179i.m6111c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    /* renamed from: b */
    public RH6 m83967b() {
        return this.f35174d;
    }

    /* renamed from: c */
    public byte[] m83966c() {
        byte[] m115249f;
        synchronized (this) {
            int m86982h = this.f35174d.m86982h();
            byte[] bArr = new byte[m86982h + 4 + m86982h + m86982h + m86982h];
            DD3.m110680d(this.f35179i.m6112b(), bArr, 0);
            WH6.m78617e(bArr, this.f35175e, 4);
            int i = 4 + m86982h;
            WH6.m78617e(bArr, this.f35176f, i);
            int i2 = i + m86982h;
            WH6.m78617e(bArr, this.f35177g, i2);
            WH6.m78617e(bArr, this.f35178h, i2 + m86982h);
            try {
                m115249f = C0210Ao.m115249f(bArr, WH6.m78606p(this.f35179i));
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
            }
        }
        return m115249f;
    }

    @Override // p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        byte[] m83966c;
        synchronized (this) {
            m83966c = m83966c();
        }
        return m83966c;
    }
}
