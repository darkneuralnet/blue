package p000;
/* renamed from: Vj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36610Vj2 implements P31 {

    /* renamed from: g */
    public static long[] f39602g = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* renamed from: a */
    public long[] f39603a;

    /* renamed from: b */
    public byte[] f39604b;

    /* renamed from: c */
    public int f39605c;

    /* renamed from: d */
    public int f39606d;

    /* renamed from: e */
    public int f39607e;

    /* renamed from: f */
    public boolean f39608f;

    public C36610Vj2() {
        this(288);
    }

    @Override // p000.P31
    /* renamed from: a */
    public int mo15581a(byte[] bArr, int i) {
        m79521r(bArr, i, this.f39607e);
        m79522q();
        return mo15578e();
    }

    @Override // p000.P31
    /* renamed from: c */
    public void mo31323c(byte b) {
        m79529j(b);
    }

    @Override // p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "Keccak-" + this.f39607e;
    }

    @Override // p000.P31
    /* renamed from: e */
    public int mo15578e() {
        return this.f39607e / 8;
    }

    @Override // p000.P31
    /* renamed from: f */
    public void mo31322f(byte[] bArr, int i, int i2) {
        m79528k(bArr, i, i2);
    }

    /* renamed from: g */
    public final void m79532g(byte[] bArr, int i) {
        int i2 = this.f39605c >>> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.f39603a;
            jArr[i3] = jArr[i3] ^ DD3.m110677g(bArr, i);
            i += 8;
        }
        LL1.m97052c(m79526m()).toLowerCase();
        m79530i();
    }

    /* renamed from: h */
    public final void m79531h() {
        m79530i();
        m79526m();
        DD3.m110672l(this.f39603a, 0, this.f39605c >>> 6, this.f39604b, 0);
        this.f39606d = this.f39605c;
    }

    /* renamed from: i */
    public final void m79530i() {
        long[] jArr = this.f39603a;
        int i = 0;
        long j = jArr[0];
        char c = 1;
        long j2 = jArr[1];
        long j3 = jArr[2];
        char c2 = 3;
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        int i2 = 24;
        long j25 = jArr[24];
        while (i < i2) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << c) | (j27 >>> (-1))) ^ j30;
            long j32 = ((j28 << c) | (j28 >>> (-1))) ^ j26;
            long j33 = ((j29 << c) | (j29 >>> (-1))) ^ j27;
            long j34 = ((j30 << c) | (j30 >>> (-1))) ^ j28;
            long j35 = ((j26 << c) | (j26 >>> (-1))) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j3 ^ j33;
            long j47 = j8 ^ j33;
            long j48 = j13 ^ j33;
            long j49 = j18 ^ j33;
            long j50 = j23 ^ j33;
            long j51 = j4 ^ j34;
            long j52 = j9 ^ j34;
            long j53 = j14 ^ j34;
            long j54 = j19 ^ j34;
            long j55 = j24 ^ j34;
            long j56 = j5 ^ j35;
            long j57 = j10 ^ j35;
            long j58 = j15 ^ j35;
            long j59 = j20 ^ j35;
            long j60 = j25 ^ j35;
            long j61 = (j41 << c) | (j41 >>> 63);
            long j62 = (j42 << 44) | (j42 >>> 20);
            long j63 = (j57 << 20) | (j57 >>> 44);
            long j64 = (j50 << 61) | (j50 >>> c2);
            long j65 = (j58 << 39) | (j58 >>> 25);
            long j66 = (j40 << 18) | (j40 >>> 46);
            long j67 = (j46 << 62) | (j46 >>> 2);
            long j68 = (j48 << 43) | (j48 >>> 21);
            long j69 = (j53 << 25) | (j53 >>> 39);
            long j70 = (j59 << 8) | (j59 >>> 56);
            long j71 = (j55 << 56) | (j55 >>> 8);
            long j72 = (j39 << 41) | (j39 >>> 23);
            long j73 = (j56 << 27) | (j56 >>> 37);
            long j74 = (j60 << 14) | (j60 >>> 50);
            long j75 = (j45 << 2) | (j45 >>> 62);
            long j76 = (j52 << 55) | (j52 >>> 9);
            long j77 = (j44 << 45) | (j44 >>> 19);
            long j78 = (j37 << 36) | (j37 >>> 28);
            long j79 = (j51 << 28) | (j51 >>> 36);
            long j80 = (j54 << 21) | (j54 >>> 43);
            long j81 = (j49 << 15) | (j49 >>> 49);
            long j82 = (j43 << 10) | (j43 >>> 54);
            long j83 = (j47 << 6) | (j47 >>> 58);
            long j84 = (j38 << 3) | (j38 >>> 61);
            long j85 = ((~j62) & j68) ^ j36;
            long j86 = ((~j68) & j80) ^ j62;
            j3 = j68 ^ ((~j80) & j74);
            j4 = j80 ^ ((~j74) & j36);
            long j87 = j74 ^ ((~j36) & j62);
            long j88 = j79 ^ ((~j63) & j84);
            long j89 = ((~j84) & j77) ^ j63;
            long j90 = ((~j77) & j64) ^ j84;
            long j91 = j77 ^ ((~j64) & j79);
            long j92 = ((~j79) & j63) ^ j64;
            j11 = j61 ^ ((~j83) & j69);
            long j93 = ((~j69) & j70) ^ j83;
            long j94 = ((~j70) & j66) ^ j69;
            long j95 = j70 ^ ((~j66) & j61);
            long j96 = ((~j61) & j83) ^ j66;
            long j97 = j73 ^ ((~j78) & j82);
            long j98 = ((~j82) & j81) ^ j78;
            long j99 = j82 ^ ((~j81) & j71);
            long j100 = ((~j71) & j73) ^ j81;
            long j101 = ((~j73) & j78) ^ j71;
            long j102 = ((~j65) & j72) ^ j76;
            j21 = j67 ^ ((~j76) & j65);
            long j103 = j85 ^ f39602g[i];
            i++;
            j7 = j89;
            j13 = j94;
            j12 = j93;
            j14 = j95;
            j22 = j102;
            c2 = 3;
            j24 = ((~j75) & j67) ^ j72;
            j23 = j65 ^ ((~j72) & j75);
            j10 = j92;
            jArr = jArr;
            j20 = j101;
            j15 = j96;
            j8 = j90;
            j9 = j91;
            j18 = j99;
            j16 = j97;
            j5 = j87;
            j6 = j88;
            i2 = 24;
            j19 = j100;
            j17 = j98;
            c = 1;
            j2 = j86;
            j25 = ((~j67) & j76) ^ j75;
            j = j103;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j;
        jArr2[1] = j2;
        jArr2[2] = j3;
        jArr2[3] = j4;
        jArr2[4] = j5;
        jArr2[5] = j6;
        jArr2[6] = j7;
        jArr2[7] = j8;
        jArr2[8] = j9;
        jArr2[9] = j10;
        jArr2[10] = j11;
        jArr2[11] = j12;
        jArr2[12] = j13;
        jArr2[13] = j14;
        jArr2[14] = j15;
        jArr2[15] = j16;
        jArr2[16] = j17;
        jArr2[17] = j18;
        jArr2[18] = j19;
        jArr2[19] = j20;
        jArr2[20] = j21;
        jArr2[21] = j22;
        jArr2[22] = j23;
        jArr2[23] = j24;
        jArr2[24] = j25;
    }

    /* renamed from: j */
    public void m79529j(byte b) {
        int i = this.f39606d;
        if (i % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f39608f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.f39604b;
        bArr[i >>> 3] = b;
        int i2 = i + 8;
        this.f39606d = i2;
        if (i2 == this.f39605c) {
            m79532g(bArr, 0);
            this.f39606d = 0;
        }
    }

    /* renamed from: k */
    public void m79528k(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = this.f39606d;
        if (i6 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f39608f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i7 = i6 >>> 3;
        int i8 = this.f39605c >>> 3;
        int i9 = i8 - i7;
        if (i2 < i9) {
            System.arraycopy(bArr, i, this.f39604b, i7, i2);
            i5 = this.f39606d + (i2 << 3);
        } else {
            if (i7 > 0) {
                System.arraycopy(bArr, i, this.f39604b, i7, i9);
                i3 = i9 + 0;
                m79532g(this.f39604b, 0);
            } else {
                i3 = 0;
            }
            while (true) {
                i4 = i2 - i3;
                if (i4 < i8) {
                    break;
                }
                m79532g(bArr, i + i3);
                i3 += i8;
            }
            System.arraycopy(bArr, i + i3, this.f39604b, 0, i4);
            i5 = i4 << 3;
        }
        this.f39606d = i5;
    }

    /* renamed from: l */
    public void m79527l(int i, int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i3 = this.f39606d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f39608f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.f39604b[i3 >>> 3] = (byte) (i & ((1 << i2) - 1));
        this.f39606d = i3 + i2;
    }

    /* renamed from: m */
    public byte[] m79526m() {
        byte[] bArr = new byte[this.f39603a.length * 8];
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr = this.f39603a;
            if (i == jArr.length) {
                return bArr;
            }
            DD3.m110673k(jArr[i], bArr, i2);
            i2 += 8;
            i++;
        }
    }

    /* renamed from: n */
    public final void m79525n(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        m79524o(1600 - (i << 1));
    }

    /* renamed from: o */
    public final void m79524o(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f39605c = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.f39603a;
            if (i2 >= jArr.length) {
                C0210Ao.m115246i(this.f39604b, (byte) 0);
                this.f39606d = 0;
                this.f39608f = false;
                this.f39607e = (1600 - i) / 2;
                return;
            }
            jArr[i2] = 0;
            i2++;
        }
    }

    /* renamed from: p */
    public final void m79523p() {
        byte[] bArr = this.f39604b;
        int i = this.f39606d;
        int i2 = i >>> 3;
        bArr[i2] = (byte) (bArr[i2] | ((byte) (1 << (i & 7))));
        int i3 = i + 1;
        this.f39606d = i3;
        if (i3 == this.f39605c) {
            m79532g(bArr, 0);
        } else {
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                long[] jArr = this.f39603a;
                jArr[i7] = jArr[i7] ^ DD3.m110677g(this.f39604b, i6);
                i6 += 8;
            }
            m79526m();
            if (i5 > 0) {
                long[] jArr2 = this.f39603a;
                jArr2[i4] = (((1 << i5) - 1) & DD3.m110677g(this.f39604b, i6)) ^ jArr2[i4];
            }
        }
        long[] jArr3 = this.f39603a;
        int i8 = (this.f39605c - 1) >>> 6;
        jArr3[i8] = jArr3[i8] ^ Long.MIN_VALUE;
        this.f39606d = 0;
        this.f39608f = true;
    }

    /* renamed from: q */
    public void m79522q() {
        m79525n(this.f39607e);
    }

    /* renamed from: r */
    public void m79521r(byte[] bArr, int i, long j) {
        if (!this.f39608f) {
            m79523p();
        }
        m79526m();
        long j2 = 0;
        if (j % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j2 < j) {
            if (this.f39606d == 0) {
                m79531h();
            }
            int min = (int) Math.min(this.f39606d, j - j2);
            System.arraycopy(this.f39604b, (this.f39605c - this.f39606d) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
            this.f39606d -= min;
            j2 += min;
        }
        m79526m();
    }

    public C36610Vj2(int i) {
        this.f39603a = new long[25];
        this.f39604b = new byte[192];
        m79525n(i);
    }
}
