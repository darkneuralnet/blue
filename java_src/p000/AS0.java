package p000;

import p000.C32213Co6;
/* renamed from: AS0 */
/* loaded from: classes6.dex */
public final class AS0 {

    /* renamed from: a */
    public final int f565a;

    /* renamed from: b */
    public final byte[] f566b;

    public AS0(int i, byte[] bArr) {
        this.f565a = i;
        this.f566b = bArr;
    }

    /* renamed from: b */
    public static AS0[] m115781b(byte[] bArr, C32213Co6 c32213Co6) {
        boolean z;
        int i;
        int i2;
        C32213Co6.C1187c m111516d = c32213Co6.m111516d();
        C32213Co6.C1186b[] m111508a = m111516d.m111508a();
        int i3 = 0;
        for (C32213Co6.C1186b c1186b : m111508a) {
            i3 += c1186b.m111510a();
        }
        AS0[] as0Arr = new AS0[i3];
        int i4 = 0;
        for (C32213Co6.C1186b c1186b2 : m111508a) {
            int i5 = 0;
            while (i5 < c1186b2.m111510a()) {
                int m111509b = c1186b2.m111509b();
                as0Arr[i4] = new AS0(m111509b, new byte[m111516d.m111507b() + m111509b]);
                i5++;
                i4++;
            }
        }
        int length = as0Arr[0].f566b.length - m111516d.m111507b();
        int i6 = length - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                as0Arr[i9].f566b[i8] = bArr[i7];
                i9++;
                i7++;
            }
        }
        if (c32213Co6.m111511i() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i4;
        }
        int i10 = 0;
        while (i10 < i) {
            as0Arr[i10].f566b[i6] = bArr[i7];
            i10++;
            i7++;
        }
        int length2 = as0Arr[0].f566b.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i4) {
                if (z) {
                    i2 = (i11 + 8) % i4;
                } else {
                    i2 = i11;
                }
                as0Arr[i2].f566b[(z && i2 > 7) ? length - 1 : length] = bArr[i7];
                i11++;
                i7++;
            }
            length++;
        }
        if (i7 == bArr.length) {
            return as0Arr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m115782a() {
        return this.f566b;
    }

    /* renamed from: c */
    public int m115780c() {
        return this.f565a;
    }
}
