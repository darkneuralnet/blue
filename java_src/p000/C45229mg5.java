package p000;

import kotlin.UByte;
/* renamed from: mg5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45229mg5 extends AbstractC42568iB1 {

    /* renamed from: n */
    public static final int[] f98548n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f98549d;

    /* renamed from: e */
    public int f98550e;

    /* renamed from: f */
    public int f98551f;

    /* renamed from: g */
    public int f98552g;

    /* renamed from: h */
    public int f98553h;

    /* renamed from: i */
    public int f98554i;

    /* renamed from: j */
    public int f98555j;

    /* renamed from: k */
    public int f98556k;

    /* renamed from: l */
    public int[] f98557l = new int[64];

    /* renamed from: m */
    public int f98558m;

    public C45229mg5() {
        mo23328k();
    }

    @Override // p000.P31
    /* renamed from: a */
    public int mo15581a(byte[] bArr, int i) {
        m34376g();
        DD3.m110680d(this.f98549d, bArr, i);
        DD3.m110680d(this.f98550e, bArr, i + 4);
        DD3.m110680d(this.f98551f, bArr, i + 8);
        DD3.m110680d(this.f98552g, bArr, i + 12);
        DD3.m110680d(this.f98553h, bArr, i + 16);
        DD3.m110680d(this.f98554i, bArr, i + 20);
        DD3.m110680d(this.f98555j, bArr, i + 24);
        mo23328k();
        return 28;
    }

    @Override // p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "SHA-224";
    }

    @Override // p000.P31
    /* renamed from: e */
    public int mo15578e() {
        return 28;
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: h */
    public void mo23331h() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f98557l;
            int m25175q = m25175q(iArr[i - 2]);
            int[] iArr2 = this.f98557l;
            iArr[i] = m25175q + iArr2[i - 7] + m25176p(iArr2[i - 15]) + this.f98557l[i - 16];
        }
        int i2 = this.f98549d;
        int i3 = this.f98550e;
        int i4 = this.f98551f;
        int i5 = this.f98552g;
        int i6 = this.f98553h;
        int i7 = this.f98554i;
        int i8 = this.f98555j;
        int i9 = this.f98556k;
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int m25177o = m25177o(i6) + m25180l(i6, i7, i8);
            int[] iArr3 = f98548n;
            int i12 = i9 + m25177o + iArr3[i10] + this.f98557l[i10];
            int i13 = i5 + i12;
            int m25178n = i12 + m25178n(i2) + m25179m(i2, i3, i4);
            int i14 = i10 + 1;
            int m25177o2 = i8 + m25177o(i13) + m25180l(i13, i6, i7) + iArr3[i14] + this.f98557l[i14];
            int i15 = i4 + m25177o2;
            int m25178n2 = m25177o2 + m25178n(m25178n) + m25179m(m25178n, i2, i3);
            int i16 = i14 + 1;
            int m25177o3 = i7 + m25177o(i15) + m25180l(i15, i13, i6) + iArr3[i16] + this.f98557l[i16];
            int i17 = i3 + m25177o3;
            int m25178n3 = m25177o3 + m25178n(m25178n2) + m25179m(m25178n2, m25178n, i2);
            int i18 = i16 + 1;
            int m25177o4 = i6 + m25177o(i17) + m25180l(i17, i15, i13) + iArr3[i18] + this.f98557l[i18];
            int i19 = i2 + m25177o4;
            int m25178n4 = m25177o4 + m25178n(m25178n3) + m25179m(m25178n3, m25178n2, m25178n);
            int i20 = i18 + 1;
            int m25177o5 = i13 + m25177o(i19) + m25180l(i19, i17, i15) + iArr3[i20] + this.f98557l[i20];
            i9 = m25178n + m25177o5;
            i5 = m25177o5 + m25178n(m25178n4) + m25179m(m25178n4, m25178n3, m25178n2);
            int i21 = i20 + 1;
            int m25177o6 = i15 + m25177o(i9) + m25180l(i9, i19, i17) + iArr3[i21] + this.f98557l[i21];
            i8 = m25178n2 + m25177o6;
            i4 = m25177o6 + m25178n(i5) + m25179m(i5, m25178n4, m25178n3);
            int i22 = i21 + 1;
            int m25177o7 = i17 + m25177o(i8) + m25180l(i8, i9, i19) + iArr3[i22] + this.f98557l[i22];
            i7 = m25178n3 + m25177o7;
            i3 = m25177o7 + m25178n(i4) + m25179m(i4, i5, m25178n4);
            int i23 = i22 + 1;
            int m25177o8 = i19 + m25177o(i7) + m25180l(i7, i8, i9) + iArr3[i23] + this.f98557l[i23];
            i6 = m25178n4 + m25177o8;
            i2 = m25177o8 + m25178n(i3) + m25179m(i3, i4, i5);
            i10 = i23 + 1;
        }
        this.f98549d += i2;
        this.f98550e += i3;
        this.f98551f += i4;
        this.f98552g += i5;
        this.f98553h += i6;
        this.f98554i += i7;
        this.f98555j += i8;
        this.f98556k += i9;
        this.f98558m = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            this.f98557l[i24] = 0;
        }
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: i */
    public void mo23330i(long j) {
        if (this.f98558m > 14) {
            mo23331h();
        }
        int[] iArr = this.f98557l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: j */
    public void mo23329j(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i2] & UByte.MAX_VALUE) << 16) | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f98557l;
        int i5 = this.f98558m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f98558m = i6;
        if (i6 == 16) {
            mo23331h();
        }
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: k */
    public void mo23328k() {
        super.mo23328k();
        this.f98549d = -1056596264;
        this.f98550e = 914150663;
        this.f98551f = 812702999;
        this.f98552g = -150054599;
        this.f98553h = -4191439;
        this.f98554i = 1750603025;
        this.f98555j = 1694076839;
        this.f98556k = -1090891868;
        this.f98558m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f98557l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    /* renamed from: l */
    public final int m25180l(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: m */
    public final int m25179m(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    /* renamed from: n */
    public final int m25178n(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: o */
    public final int m25177o(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: p */
    public final int m25176p(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    /* renamed from: q */
    public final int m25175q(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }
}
