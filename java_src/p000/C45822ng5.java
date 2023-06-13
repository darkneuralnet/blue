package p000;

import kotlin.UByte;
/* renamed from: ng5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45822ng5 extends AbstractC42568iB1 {

    /* renamed from: n */
    public static final int[] f100309n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f100310d;

    /* renamed from: e */
    public int f100311e;

    /* renamed from: f */
    public int f100312f;

    /* renamed from: g */
    public int f100313g;

    /* renamed from: h */
    public int f100314h;

    /* renamed from: i */
    public int f100315i;

    /* renamed from: j */
    public int f100316j;

    /* renamed from: k */
    public int f100317k;

    /* renamed from: l */
    public int[] f100318l = new int[64];

    /* renamed from: m */
    public int f100319m;

    public C45822ng5() {
        mo23328k();
    }

    /* renamed from: l */
    public static int m23327l(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* renamed from: m */
    public static int m23326m(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    /* renamed from: n */
    public static int m23325n(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: o */
    public static int m23324o(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: p */
    public static int m23323p(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    /* renamed from: q */
    public static int m23322q(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    @Override // p000.P31
    /* renamed from: a */
    public int mo15581a(byte[] bArr, int i) {
        m34376g();
        DD3.m110680d(this.f100310d, bArr, i);
        DD3.m110680d(this.f100311e, bArr, i + 4);
        DD3.m110680d(this.f100312f, bArr, i + 8);
        DD3.m110680d(this.f100313g, bArr, i + 12);
        DD3.m110680d(this.f100314h, bArr, i + 16);
        DD3.m110680d(this.f100315i, bArr, i + 20);
        DD3.m110680d(this.f100316j, bArr, i + 24);
        DD3.m110680d(this.f100317k, bArr, i + 28);
        mo23328k();
        return 32;
    }

    @Override // p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "SHA-256";
    }

    @Override // p000.P31
    /* renamed from: e */
    public int mo15578e() {
        return 32;
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: h */
    public void mo23331h() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f100318l;
            int m23322q = m23322q(iArr[i - 2]);
            int[] iArr2 = this.f100318l;
            iArr[i] = m23322q + iArr2[i - 7] + m23323p(iArr2[i - 15]) + this.f100318l[i - 16];
        }
        int i2 = this.f100310d;
        int i3 = this.f100311e;
        int i4 = this.f100312f;
        int i5 = this.f100313g;
        int i6 = this.f100314h;
        int i7 = this.f100315i;
        int i8 = this.f100316j;
        int i9 = this.f100317k;
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int m23324o = m23324o(i6) + m23327l(i6, i7, i8);
            int[] iArr3 = f100309n;
            int i12 = i9 + m23324o + iArr3[i10] + this.f100318l[i10];
            int i13 = i5 + i12;
            int m23325n = i12 + m23325n(i2) + m23326m(i2, i3, i4);
            int i14 = i10 + 1;
            int m23324o2 = i8 + m23324o(i13) + m23327l(i13, i6, i7) + iArr3[i14] + this.f100318l[i14];
            int i15 = i4 + m23324o2;
            int m23325n2 = m23324o2 + m23325n(m23325n) + m23326m(m23325n, i2, i3);
            int i16 = i14 + 1;
            int m23324o3 = i7 + m23324o(i15) + m23327l(i15, i13, i6) + iArr3[i16] + this.f100318l[i16];
            int i17 = i3 + m23324o3;
            int m23325n3 = m23324o3 + m23325n(m23325n2) + m23326m(m23325n2, m23325n, i2);
            int i18 = i16 + 1;
            int m23324o4 = i6 + m23324o(i17) + m23327l(i17, i15, i13) + iArr3[i18] + this.f100318l[i18];
            int i19 = i2 + m23324o4;
            int m23325n4 = m23324o4 + m23325n(m23325n3) + m23326m(m23325n3, m23325n2, m23325n);
            int i20 = i18 + 1;
            int m23324o5 = i13 + m23324o(i19) + m23327l(i19, i17, i15) + iArr3[i20] + this.f100318l[i20];
            i9 = m23325n + m23324o5;
            i5 = m23324o5 + m23325n(m23325n4) + m23326m(m23325n4, m23325n3, m23325n2);
            int i21 = i20 + 1;
            int m23324o6 = i15 + m23324o(i9) + m23327l(i9, i19, i17) + iArr3[i21] + this.f100318l[i21];
            i8 = m23325n2 + m23324o6;
            i4 = m23324o6 + m23325n(i5) + m23326m(i5, m23325n4, m23325n3);
            int i22 = i21 + 1;
            int m23324o7 = i17 + m23324o(i8) + m23327l(i8, i9, i19) + iArr3[i22] + this.f100318l[i22];
            i7 = m23325n3 + m23324o7;
            i3 = m23324o7 + m23325n(i4) + m23326m(i4, i5, m23325n4);
            int i23 = i22 + 1;
            int m23324o8 = i19 + m23324o(i7) + m23327l(i7, i8, i9) + iArr3[i23] + this.f100318l[i23];
            i6 = m23325n4 + m23324o8;
            i2 = m23324o8 + m23325n(i3) + m23326m(i3, i4, i5);
            i10 = i23 + 1;
        }
        this.f100310d += i2;
        this.f100311e += i3;
        this.f100312f += i4;
        this.f100313g += i5;
        this.f100314h += i6;
        this.f100315i += i7;
        this.f100316j += i8;
        this.f100317k += i9;
        this.f100319m = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            this.f100318l[i24] = 0;
        }
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: i */
    public void mo23330i(long j) {
        if (this.f100319m > 14) {
            mo23331h();
        }
        int[] iArr = this.f100318l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: j */
    public void mo23329j(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i2] & UByte.MAX_VALUE) << 16) | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        int[] iArr = this.f100318l;
        int i5 = this.f100319m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f100319m = i6;
        if (i6 == 16) {
            mo23331h();
        }
    }

    @Override // p000.AbstractC42568iB1
    /* renamed from: k */
    public void mo23328k() {
        super.mo23328k();
        this.f100310d = 1779033703;
        this.f100311e = -1150833019;
        this.f100312f = 1013904242;
        this.f100313g = -1521486534;
        this.f100314h = 1359893119;
        this.f100315i = -1694144372;
        this.f100316j = 528734635;
        this.f100317k = 1541459225;
        this.f100319m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f100318l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
