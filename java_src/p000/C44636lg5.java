package p000;

import kotlin.UByte;
/* renamed from: lg5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44636lg5 extends AbstractC42568iB1 {

    /* renamed from: d */
    public int f96543d;

    /* renamed from: e */
    public int f96544e;

    /* renamed from: f */
    public int f96545f;

    /* renamed from: g */
    public int f96546g;

    /* renamed from: h */
    public int f96547h;

    /* renamed from: i */
    public int[] f96548i = new int[80];

    /* renamed from: j */
    public int f96549j;

    public C44636lg5() {
        mo23328k();
    }

    @Override // p000.P31
    /* renamed from: a */
    public int mo15581a(byte[] bArr, int i) {
        m34376g();
        DD3.m110680d(this.f96543d, bArr, i);
        DD3.m110680d(this.f96544e, bArr, i + 4);
        DD3.m110680d(this.f96545f, bArr, i + 8);
        DD3.m110680d(this.f96546g, bArr, i + 12);
        DD3.m110680d(this.f96547h, bArr, i + 16);
        mo23328k();
        return 20;
    }

    @Override // p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "SHA-1";
    }

    @Override // p000.P31
    /* renamed from: e */
    public int mo15578e() {
        return 20;
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: h */
    public void mo23331h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        for (int i13 = 16; i13 < 80; i13++) {
            int[] iArr = this.f96548i;
            int i14 = ((iArr[i13 - 3] ^ iArr[i13 - 8]) ^ iArr[i13 - 14]) ^ iArr[i13 - 16];
            iArr[i13] = (i14 >>> 31) | (i14 << 1);
        }
        int i15 = this.f96543d;
        int i16 = this.f96544e;
        int i17 = this.f96545f;
        int i18 = this.f96546g;
        int i19 = this.f96547h;
        int i20 = 0;
        int i21 = 0;
        while (i20 < 4) {
            int i22 = i21 + 1;
            int m27007l = i19 + ((i15 << 5) | (i15 >>> 27)) + m27007l(i16, i17, i18) + this.f96548i[i21] + 1518500249;
            int i23 = (i16 >>> 2) | (i16 << 30);
            int i24 = i22 + 1;
            int m27007l2 = i18 + ((m27007l << 5) | (m27007l >>> 27)) + m27007l(i15, i23, i17) + this.f96548i[i22] + 1518500249;
            int i25 = (i15 >>> 2) | (i15 << 30);
            int i26 = i24 + 1;
            int m27007l3 = i17 + ((m27007l2 << 5) | (m27007l2 >>> 27)) + m27007l(m27007l, i25, i23) + this.f96548i[i24] + 1518500249;
            i19 = (m27007l >>> 2) | (m27007l << 30);
            int i27 = i26 + 1;
            i16 = i23 + ((m27007l3 << 5) | (m27007l3 >>> 27)) + m27007l(m27007l2, i19, i25) + this.f96548i[i26] + 1518500249;
            i18 = (m27007l2 >>> 2) | (m27007l2 << 30);
            i15 = i25 + ((i16 << 5) | (i16 >>> 27)) + m27007l(m27007l3, i18, i19) + this.f96548i[i27] + 1518500249;
            i17 = (m27007l3 >>> 2) | (m27007l3 << 30);
            i20++;
            i21 = i27 + 1;
        }
        int i28 = 0;
        while (i28 < 4) {
            int i29 = i21 + 1;
            int m27005n = i19 + ((i15 << 5) | (i15 >>> 27)) + m27005n(i16, i17, i18) + this.f96548i[i21] + 1859775393;
            int i30 = (i16 >>> 2) | (i16 << 30);
            int i31 = i29 + 1;
            int m27005n2 = i18 + ((m27005n << 5) | (m27005n >>> 27)) + m27005n(i15, i30, i17) + this.f96548i[i29] + 1859775393;
            int i32 = (i15 >>> 2) | (i15 << 30);
            int i33 = i31 + 1;
            int m27005n3 = i17 + ((m27005n2 << 5) | (m27005n2 >>> 27)) + m27005n(m27005n, i32, i30) + this.f96548i[i31] + 1859775393;
            i19 = (m27005n >>> 2) | (m27005n << 30);
            int i34 = i33 + 1;
            i16 = i30 + ((m27005n3 << 5) | (m27005n3 >>> 27)) + m27005n(m27005n2, i19, i32) + this.f96548i[i33] + 1859775393;
            i18 = (m27005n2 >>> 2) | (m27005n2 << 30);
            i15 = i32 + ((i16 << 5) | (i16 >>> 27)) + m27005n(m27005n3, i18, i19) + this.f96548i[i34] + 1859775393;
            i17 = (m27005n3 >>> 2) | (m27005n3 << 30);
            i28++;
            i21 = i34 + 1;
        }
        int i35 = 0;
        while (i35 < 4) {
            int m27006m = i19 + (((((i15 << 5) | (i15 >>> 27)) + m27006m(i16, i17, i18)) + this.f96548i[i21]) - 1894007588);
            int m27006m2 = i18 + (((((m27006m << 5) | (m27006m >>> 27)) + m27006m(i15, i8, i17)) + this.f96548i[i7]) - 1894007588);
            int m27006m3 = i17 + (((((m27006m2 << 5) | (m27006m2 >>> 27)) + m27006m(m27006m, i10, i8)) + this.f96548i[i9]) - 1894007588);
            i19 = (m27006m >>> 2) | (m27006m << 30);
            i16 = ((i16 >>> 2) | (i16 << 30)) + (((((m27006m3 << 5) | (m27006m3 >>> 27)) + m27006m(m27006m2, i19, i10)) + this.f96548i[i11]) - 1894007588);
            i18 = (m27006m2 >>> 2) | (m27006m2 << 30);
            i15 = ((i15 >>> 2) | (i15 << 30)) + (((((i16 << 5) | (i16 >>> 27)) + m27006m(m27006m3, i18, i19)) + this.f96548i[i12]) - 1894007588);
            i17 = (m27006m3 >>> 2) | (m27006m3 << 30);
            i35++;
            i21 = i21 + 1 + 1 + 1 + 1 + 1;
        }
        int i36 = 0;
        while (i36 <= 3) {
            int m27005n4 = i19 + (((((i15 << 5) | (i15 >>> 27)) + m27005n(i16, i17, i18)) + this.f96548i[i21]) - 899497514);
            int m27005n5 = i18 + (((((m27005n4 << 5) | (m27005n4 >>> 27)) + m27005n(i15, i2, i17)) + this.f96548i[i]) - 899497514);
            int m27005n6 = i17 + (((((m27005n5 << 5) | (m27005n5 >>> 27)) + m27005n(m27005n4, i4, i2)) + this.f96548i[i3]) - 899497514);
            i19 = (m27005n4 >>> 2) | (m27005n4 << 30);
            i16 = ((i16 >>> 2) | (i16 << 30)) + (((((m27005n6 << 5) | (m27005n6 >>> 27)) + m27005n(m27005n5, i19, i4)) + this.f96548i[i5]) - 899497514);
            i18 = (m27005n5 >>> 2) | (m27005n5 << 30);
            i15 = ((i15 >>> 2) | (i15 << 30)) + (((((i16 << 5) | (i16 >>> 27)) + m27005n(m27005n6, i18, i19)) + this.f96548i[i6]) - 899497514);
            i17 = (m27005n6 >>> 2) | (m27005n6 << 30);
            i36++;
            i21 = i21 + 1 + 1 + 1 + 1 + 1;
        }
        this.f96543d += i15;
        this.f96544e += i16;
        this.f96545f += i17;
        this.f96546g += i18;
        this.f96547h += i19;
        this.f96549j = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            this.f96548i[i37] = 0;
        }
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: i */
    public void mo23330i(long j) {
        if (this.f96549j > 14) {
            mo23331h();
        }
        int[] iArr = this.f96548i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: j */
    public void mo23329j(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i2] & UByte.MAX_VALUE) << 16) | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f96548i;
        int i5 = this.f96549j;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f96549j = i6;
        if (i6 == 16) {
            mo23331h();
        }
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: k */
    public void mo23328k() {
        super.mo23328k();
        this.f96543d = 1732584193;
        this.f96544e = -271733879;
        this.f96545f = -1732584194;
        this.f96546g = 271733878;
        this.f96547h = -1009589776;
        this.f96549j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f96548i;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    /* renamed from: l */
    public final int m27007l(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: m */
    public final int m27006m(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    /* renamed from: n */
    public final int m27005n(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }
}
