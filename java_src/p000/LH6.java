package p000;

import java.io.IOException;
/* renamed from: LH6 */
/* loaded from: classes8.dex */
public final class LH6 extends HH6 implements InterfaceC39228cb1 {

    /* renamed from: d */
    public final JH6 f21045d;

    /* renamed from: e */
    public final byte[] f21046e;

    /* renamed from: f */
    public final byte[] f21047f;

    /* renamed from: g */
    public final byte[] f21048g;

    /* renamed from: h */
    public final byte[] f21049h;

    /* renamed from: i */
    public volatile long f21050i;

    /* renamed from: j */
    public volatile C30340xv f21051j;

    /* renamed from: LH6$b */
    /* loaded from: classes8.dex */
    public static class C4794b {

        /* renamed from: a */
        public final JH6 f21052a;

        /* renamed from: b */
        public long f21053b = 0;

        /* renamed from: c */
        public long f21054c = -1;

        /* renamed from: d */
        public byte[] f21055d = null;

        /* renamed from: e */
        public byte[] f21056e = null;

        /* renamed from: f */
        public byte[] f21057f = null;

        /* renamed from: g */
        public byte[] f21058g = null;

        /* renamed from: h */
        public C30340xv f21059h = null;

        /* renamed from: i */
        public byte[] f21060i = null;

        /* renamed from: j */
        public RH6 f21061j = null;

        public C4794b(JH6 jh6) {
            this.f21052a = jh6;
        }

        /* renamed from: k */
        public LH6 m97383k() {
            return new LH6(this);
        }

        /* renamed from: l */
        public C4794b m97382l(C30340xv c30340xv) {
            if (c30340xv.m4444b() == 0) {
                this.f21059h = new C30340xv(c30340xv, (1 << this.f21052a.m100739a()) - 1);
            } else {
                this.f21059h = c30340xv;
            }
            return this;
        }

        /* renamed from: m */
        public C4794b m97381m(long j) {
            this.f21053b = j;
            return this;
        }

        /* renamed from: n */
        public C4794b m97380n(long j) {
            this.f21054c = j;
            return this;
        }

        /* renamed from: o */
        public C4794b m97379o(byte[] bArr) {
            this.f21057f = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: p */
        public C4794b m97378p(byte[] bArr) {
            this.f21058g = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: q */
        public C4794b m97377q(byte[] bArr) {
            this.f21056e = WH6.m78619c(bArr);
            return this;
        }

        /* renamed from: r */
        public C4794b m97376r(byte[] bArr) {
            this.f21055d = WH6.m78619c(bArr);
            return this;
        }
    }

    public LH6(C4794b c4794b) {
        super(true, c4794b.f21052a.m100735e());
        JH6 jh6 = c4794b.f21052a;
        this.f21045d = jh6;
        if (jh6 == null) {
            throw new NullPointerException("params == null");
        }
        int m100734f = jh6.m100734f();
        byte[] bArr = c4794b.f21060i;
        if (bArr != null) {
            if (c4794b.f21061j == null) {
                throw new NullPointerException("xmss == null");
            }
            int m100739a = jh6.m100739a();
            int i = (m100739a + 7) / 8;
            this.f21050i = WH6.m78621a(bArr, 0, i);
            if (!WH6.m78610l(m100739a, this.f21050i)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            int i2 = i + 0;
            this.f21046e = WH6.m78615g(bArr, i2, m100734f);
            int i3 = i2 + m100734f;
            this.f21047f = WH6.m78615g(bArr, i3, m100734f);
            int i4 = i3 + m100734f;
            this.f21048g = WH6.m78615g(bArr, i4, m100734f);
            int i5 = i4 + m100734f;
            this.f21049h = WH6.m78615g(bArr, i5, m100734f);
            int i6 = i5 + m100734f;
            try {
                this.f21051j = ((C30340xv) WH6.m78616f(WH6.m78615g(bArr, i6, bArr.length - i6), C30340xv.class)).m4440f(c4794b.f21061j.m86983g());
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        this.f21050i = c4794b.f21053b;
        byte[] bArr2 = c4794b.f21055d;
        if (bArr2 == null) {
            this.f21046e = new byte[m100734f];
        } else if (bArr2.length != m100734f) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.f21046e = bArr2;
        }
        byte[] bArr3 = c4794b.f21056e;
        if (bArr3 == null) {
            this.f21047f = new byte[m100734f];
        } else if (bArr3.length != m100734f) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.f21047f = bArr3;
        }
        byte[] bArr4 = c4794b.f21057f;
        if (bArr4 == null) {
            this.f21048g = new byte[m100734f];
        } else if (bArr4.length != m100734f) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.f21048g = bArr4;
        }
        byte[] bArr5 = c4794b.f21058g;
        if (bArr5 == null) {
            this.f21049h = new byte[m100734f];
        } else if (bArr5.length != m100734f) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.f21049h = bArr5;
        }
        C30340xv c30340xv = c4794b.f21059h;
        if (c30340xv == null) {
            c30340xv = (!WH6.m78610l(jh6.m100739a(), c4794b.f21053b) || bArr4 == null || bArr2 == null) ? new C30340xv(c4794b.f21054c + 1) : new C30340xv(jh6, c4794b.f21053b, bArr4, bArr2);
        }
        this.f21051j = c30340xv;
        if (c4794b.f21054c >= 0 && c4794b.f21054c != this.f21051j.m4444b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    /* renamed from: b */
    public JH6 m97395b() {
        return this.f21045d;
    }

    /* renamed from: c */
    public byte[] m97394c() {
        byte[] m115249f;
        synchronized (this) {
            int m100734f = this.f21045d.m100734f();
            int m100739a = (this.f21045d.m100739a() + 7) / 8;
            byte[] bArr = new byte[m100739a + m100734f + m100734f + m100734f + m100734f];
            WH6.m78617e(bArr, WH6.m78605q(this.f21050i, m100739a), 0);
            int i = m100739a + 0;
            WH6.m78617e(bArr, this.f21046e, i);
            int i2 = i + m100734f;
            WH6.m78617e(bArr, this.f21047f, i2);
            int i3 = i2 + m100734f;
            WH6.m78617e(bArr, this.f21048g, i3);
            WH6.m78617e(bArr, this.f21049h, i3 + m100734f);
            try {
                m115249f = C0210Ao.m115249f(bArr, WH6.m78606p(this.f21051j));
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
            }
        }
        return m115249f;
    }

    @Override // p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        byte[] m97394c;
        synchronized (this) {
            m97394c = m97394c();
        }
        return m97394c;
    }
}
