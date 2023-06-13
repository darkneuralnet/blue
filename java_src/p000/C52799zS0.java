package p000;

import p000.C32447Do6;
/* renamed from: zS0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52799zS0 {

    /* renamed from: a */
    public final int f121382a;

    /* renamed from: b */
    public final byte[] f121383b;

    public C52799zS0(int i, byte[] bArr) {
        this.f121382a = i;
        this.f121383b = bArr;
    }

    /* renamed from: b */
    public static C52799zS0[] m1338b(byte[] bArr, C32447Do6 c32447Do6, EnumC41074fg1 enumC41074fg1) {
        int i;
        if (bArr.length == c32447Do6.m109908h()) {
            C32447Do6.C1619b m109910f = c32447Do6.m109910f(enumC41074fg1);
            C32447Do6.C1618a[] m109903a = m109910f.m109903a();
            int i2 = 0;
            for (C32447Do6.C1618a c1618a : m109903a) {
                i2 += c1618a.m109905a();
            }
            C52799zS0[] c52799zS0Arr = new C52799zS0[i2];
            int i3 = 0;
            for (C32447Do6.C1618a c1618a2 : m109903a) {
                int i4 = 0;
                while (i4 < c1618a2.m109905a()) {
                    int m109904b = c1618a2.m109904b();
                    c52799zS0Arr[i3] = new C52799zS0(m109904b, new byte[m109910f.m109902b() + m109904b]);
                    i4++;
                    i3++;
                }
            }
            int length = c52799zS0Arr[0].f121383b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && c52799zS0Arr[i5].f121383b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int m109902b = length - m109910f.m109902b();
            int i7 = 0;
            for (int i8 = 0; i8 < m109902b; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    c52799zS0Arr[i9].f121383b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i10 = i6;
            while (i10 < i3) {
                c52799zS0Arr[i10].f121383b[m109902b] = bArr[i7];
                i10++;
                i7++;
            }
            int length2 = c52799zS0Arr[0].f121383b.length;
            while (m109902b < length2) {
                int i11 = 0;
                while (i11 < i3) {
                    if (i11 < i6) {
                        i = m109902b;
                    } else {
                        i = m109902b + 1;
                    }
                    c52799zS0Arr[i11].f121383b[i] = bArr[i7];
                    i11++;
                    i7++;
                }
                m109902b++;
            }
            return c52799zS0Arr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m1339a() {
        return this.f121383b;
    }

    /* renamed from: c */
    public int m1337c() {
        return this.f121382a;
    }
}
