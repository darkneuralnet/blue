package p000;

import kotlin.UByte;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: JA1 */
/* loaded from: classes8.dex */
public class JA1 {

    /* renamed from: a */
    public InterfaceC6399PW f16932a;

    /* renamed from: b */
    public LA1 f16933b;

    /* renamed from: c */
    public KA1 f16934c;

    /* renamed from: d */
    public boolean f16935d;

    /* renamed from: e */
    public boolean f16936e;

    /* renamed from: f */
    public int f16937f;

    /* renamed from: g */
    public byte[] f16938g;

    /* renamed from: h */
    public byte[] f16939h;

    /* renamed from: i */
    public byte[] f16940i;

    /* renamed from: j */
    public byte[] f16941j;

    /* renamed from: k */
    public byte[] f16942k;

    /* renamed from: l */
    public byte[] f16943l;

    /* renamed from: m */
    public byte[] f16944m;

    /* renamed from: n */
    public byte[] f16945n;

    /* renamed from: o */
    public byte[] f16946o;

    /* renamed from: p */
    public byte[] f16947p;

    /* renamed from: q */
    public byte[] f16948q;

    /* renamed from: r */
    public int f16949r;

    /* renamed from: s */
    public int f16950s;

    /* renamed from: t */
    public long f16951t;

    /* renamed from: u */
    public byte[] f16952u;

    /* renamed from: v */
    public int f16953v;

    /* renamed from: w */
    public long f16954w;

    /* renamed from: x */
    public long f16955x;

    public JA1(InterfaceC6399PW interfaceC6399PW) {
        this(interfaceC6399PW, null);
    }

    /* renamed from: a */
    public final void m101070a() {
        if (this.f16936e) {
            return;
        }
        if (!this.f16935d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    /* renamed from: b */
    public int m101069b(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        m101070a();
        if (this.f16951t == 0) {
            m101061j();
        }
        int i2 = this.f16950s;
        if (!this.f16935d) {
            int i3 = this.f16937f;
            if (i2 < i3) {
                throw new InvalidCipherTextException("data too short");
            }
            i2 -= i3;
            if (bArr.length - i < i2) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i < this.f16937f + i2) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i2 > 0) {
            m101057n(this.f16943l, 0, i2, bArr, i);
        }
        long j = this.f16954w;
        int i4 = this.f16953v;
        long j2 = j + i4;
        this.f16954w = j2;
        if (j2 > this.f16955x) {
            if (i4 > 0) {
                m101065f(this.f16946o, this.f16952u, 0, i4);
            }
            if (this.f16955x > 0) {
                MA1.m95629p(this.f16946o, this.f16947p);
            }
            long j3 = ((this.f16951t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f16934c == null) {
                C4761LE c4761le = new C4761LE();
                this.f16934c = c4761le;
                c4761le.mo97515a(this.f16941j);
            }
            this.f16934c.mo97514b(j3, bArr2);
            MA1.m95636i(this.f16946o, bArr2);
            MA1.m95629p(this.f16945n, this.f16946o);
        }
        byte[] bArr3 = new byte[16];
        DD3.m110675i(this.f16954w * 8, bArr3, 0);
        DD3.m110675i(this.f16951t * 8, bArr3, 8);
        m101067d(this.f16945n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f16932a.mo29506b(this.f16942k, 0, bArr4, 0);
        MA1.m95629p(bArr4, this.f16945n);
        int i5 = this.f16937f;
        byte[] bArr5 = new byte[i5];
        this.f16944m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i5);
        if (this.f16935d) {
            System.arraycopy(this.f16944m, 0, bArr, i + this.f16950s, this.f16937f);
            i2 += this.f16937f;
        } else {
            int i6 = this.f16937f;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(this.f16943l, i2, bArr6, 0, i6);
            if (!C0210Ao.m115248g(this.f16944m, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        m101056o(false);
        return i2;
    }

    /* renamed from: c */
    public final void m101068c(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            m101065f(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    /* renamed from: d */
    public final void m101067d(byte[] bArr, byte[] bArr2) {
        MA1.m95629p(bArr, bArr2);
        this.f16933b.mo8448b(bArr);
    }

    /* renamed from: e */
    public final void m101066e(byte[] bArr, byte[] bArr2, int i) {
        MA1.m95628q(bArr, bArr2, i);
        this.f16933b.mo8448b(bArr);
    }

    /* renamed from: f */
    public final void m101065f(byte[] bArr, byte[] bArr2, int i, int i2) {
        MA1.m95627r(bArr, bArr2, i, i2);
        this.f16933b.mo8448b(bArr);
    }

    /* renamed from: g */
    public final void m101064g(byte[] bArr) {
        int i = this.f16949r;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.f16949r = i - 1;
        byte[] bArr2 = this.f16948q;
        int i2 = (bArr2[15] & UByte.MAX_VALUE) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & UByte.MAX_VALUE);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & UByte.MAX_VALUE);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & UByte.MAX_VALUE));
        this.f16932a.mo29506b(bArr2, 0, bArr, 0);
    }

    /* renamed from: h */
    public int m101063h(int i) {
        int i2 = i + this.f16950s;
        if (this.f16935d) {
            return i2 + this.f16937f;
        }
        int i3 = this.f16937f;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    /* renamed from: i */
    public void m101062i(boolean z, InterfaceC51182wj0 interfaceC51182wj0) throws IllegalArgumentException {
        byte[] m95475a;
        C52973zk2 c52973zk2;
        byte[] bArr;
        this.f16935d = z;
        this.f16944m = null;
        this.f16936e = true;
        if (interfaceC51182wj0 instanceof C22857i) {
            C22857i c22857i = (C22857i) interfaceC51182wj0;
            m95475a = c22857i.m35410d();
            this.f16940i = c22857i.m35413a();
            int m35411c = c22857i.m35411c();
            if (m35411c < 32 || m35411c > 128 || m35411c % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + m35411c);
            }
            this.f16937f = m35411c / 8;
            c52973zk2 = c22857i.m35412b();
        } else if (!(interfaceC51182wj0 instanceof ME3)) {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        } else {
            ME3 me3 = (ME3) interfaceC51182wj0;
            m95475a = me3.m95475a();
            this.f16940i = null;
            this.f16937f = 16;
            c52973zk2 = (C52973zk2) me3.m95474b();
        }
        this.f16943l = new byte[z ? 16 : this.f16937f + 16];
        if (m95475a == null || m95475a.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr = this.f16939h) != null && C0210Ao.m115254a(bArr, m95475a)) {
            if (c52973zk2 == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.f16938g;
            if (bArr2 != null && C0210Ao.m115254a(bArr2, c52973zk2.m456a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.f16939h = m95475a;
        if (c52973zk2 != null) {
            this.f16938g = c52973zk2.m456a();
        }
        if (c52973zk2 != null) {
            this.f16932a.mo29505c(true, c52973zk2);
            byte[] bArr3 = new byte[16];
            this.f16941j = bArr3;
            this.f16932a.mo29506b(bArr3, 0, bArr3, 0);
            this.f16933b.mo8449a(this.f16941j);
            this.f16934c = null;
        } else if (this.f16941j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.f16942k = bArr4;
        byte[] bArr5 = this.f16939h;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f16942k[15] = 1;
        } else {
            m101068c(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            DD3.m110675i(this.f16939h.length * 8, bArr6, 8);
            m101067d(this.f16942k, bArr6);
        }
        this.f16945n = new byte[16];
        this.f16946o = new byte[16];
        this.f16947p = new byte[16];
        this.f16952u = new byte[16];
        this.f16953v = 0;
        this.f16954w = 0L;
        this.f16955x = 0L;
        this.f16948q = C0210Ao.m115251d(this.f16942k);
        this.f16949r = -2;
        this.f16950s = 0;
        this.f16951t = 0L;
        byte[] bArr7 = this.f16940i;
        if (bArr7 != null) {
            m101060k(bArr7, 0, bArr7.length);
        }
    }

    /* renamed from: j */
    public final void m101061j() {
        if (this.f16954w > 0) {
            System.arraycopy(this.f16946o, 0, this.f16947p, 0, 16);
            this.f16955x = this.f16954w;
        }
        int i = this.f16953v;
        if (i > 0) {
            m101065f(this.f16947p, this.f16952u, 0, i);
            this.f16955x += this.f16953v;
        }
        if (this.f16955x > 0) {
            System.arraycopy(this.f16947p, 0, this.f16945n, 0, 16);
        }
    }

    /* renamed from: k */
    public void m101060k(byte[] bArr, int i, int i2) {
        m101070a();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f16952u;
            int i4 = this.f16953v;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.f16953v = i5;
            if (i5 == 16) {
                m101067d(this.f16946o, bArr2);
                this.f16953v = 0;
                this.f16954w += 16;
            }
        }
    }

    /* renamed from: l */
    public final void m101059l(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.f16951t == 0) {
            m101061j();
        }
        byte[] bArr3 = new byte[16];
        m101064g(bArr3);
        if (this.f16935d) {
            MA1.m95628q(bArr3, bArr, i);
            m101067d(this.f16945n, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            m101066e(this.f16945n, bArr, i);
            MA1.m95630o(bArr3, 0, bArr, i, bArr2, i2);
        }
        this.f16951t += 16;
    }

    /* renamed from: m */
    public int m101058m(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4;
        m101070a();
        if (bArr.length - i >= i2) {
            if (this.f16935d) {
                if (this.f16950s != 0) {
                    while (i2 > 0) {
                        i2--;
                        byte[] bArr3 = this.f16943l;
                        int i5 = this.f16950s;
                        int i6 = i + 1;
                        bArr3[i5] = bArr[i];
                        int i7 = i5 + 1;
                        this.f16950s = i7;
                        if (i7 == 16) {
                            m101059l(bArr3, 0, bArr2, i3);
                            this.f16950s = 0;
                            i4 = 16;
                            i = i6;
                            break;
                        }
                        i = i6;
                    }
                }
                i4 = 0;
                while (i2 >= 16) {
                    m101059l(bArr, i, bArr2, i3 + i4);
                    i += 16;
                    i2 -= 16;
                    i4 += 16;
                }
                if (i2 > 0) {
                    System.arraycopy(bArr, i, this.f16943l, 0, i2);
                    this.f16950s = i2;
                }
            } else {
                i4 = 0;
                for (int i8 = 0; i8 < i2; i8++) {
                    byte[] bArr4 = this.f16943l;
                    int i9 = this.f16950s;
                    bArr4[i9] = bArr[i + i8];
                    int i10 = i9 + 1;
                    this.f16950s = i10;
                    if (i10 == bArr4.length) {
                        m101059l(bArr4, 0, bArr2, i3 + i4);
                        byte[] bArr5 = this.f16943l;
                        System.arraycopy(bArr5, 16, bArr5, 0, this.f16937f);
                        this.f16950s = this.f16937f;
                        i4 += 16;
                    }
                }
            }
            return i4;
        }
        throw new DataLengthException("Input buffer too short");
    }

    /* renamed from: n */
    public final void m101057n(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[16];
        m101064g(bArr3);
        if (this.f16935d) {
            MA1.m95631n(bArr, i, bArr3, 0, i2);
            m101065f(this.f16945n, bArr, i, i2);
        } else {
            m101065f(this.f16945n, bArr, i, i2);
            MA1.m95631n(bArr, i, bArr3, 0, i2);
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.f16951t += i2;
    }

    /* renamed from: o */
    public final void m101056o(boolean z) {
        this.f16932a.reset();
        this.f16945n = new byte[16];
        this.f16946o = new byte[16];
        this.f16947p = new byte[16];
        this.f16952u = new byte[16];
        this.f16953v = 0;
        this.f16954w = 0L;
        this.f16955x = 0L;
        this.f16948q = C0210Ao.m115251d(this.f16942k);
        this.f16949r = -2;
        this.f16950s = 0;
        this.f16951t = 0L;
        byte[] bArr = this.f16943l;
        if (bArr != null) {
            C0210Ao.m115246i(bArr, (byte) 0);
        }
        if (z) {
            this.f16944m = null;
        }
        if (this.f16935d) {
            this.f16936e = false;
            return;
        }
        byte[] bArr2 = this.f16940i;
        if (bArr2 != null) {
            m101060k(bArr2, 0, bArr2.length);
        }
    }

    public JA1(InterfaceC6399PW interfaceC6399PW, LA1 la1) {
        if (interfaceC6399PW.mo29507a() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        la1 = la1 == null ? new C50486vY5() : la1;
        this.f16932a = interfaceC6399PW;
        this.f16933b = la1;
    }
}
