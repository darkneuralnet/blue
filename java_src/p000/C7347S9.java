package p000;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: S9 */
/* loaded from: classes6.dex */
public final class C7347S9 {

    /* renamed from: a */
    public final C1837ET f33248a;

    /* renamed from: c */
    public final int f33250c;

    /* renamed from: d */
    public final int f33251d;

    /* renamed from: e */
    public final int f33252e;

    /* renamed from: f */
    public final int f33253f;

    /* renamed from: g */
    public final float f33254g;

    /* renamed from: i */
    public final InterfaceC41493gN4 f33256i;

    /* renamed from: b */
    public final List<C7077R9> f33249b = new ArrayList(5);

    /* renamed from: h */
    public final int[] f33255h = new int[3];

    public C7347S9(C1837ET c1837et, int i, int i2, int i3, int i4, float f, InterfaceC41493gN4 interfaceC41493gN4) {
        this.f33248a = c1837et;
        this.f33250c = i;
        this.f33251d = i2;
        this.f33252e = i3;
        this.f33253f = i4;
        this.f33254g = f;
        this.f33256i = interfaceC41493gN4;
    }

    /* renamed from: a */
    public static float m85902a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: b */
    public final float m85901b(int i, int i2, int i3, int i4) {
        C1837ET c1837et = this.f33248a;
        int m108956l = c1837et.m108956l();
        int[] iArr = this.f33255h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && c1837et.m108959h(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !c1837et.m108959h(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < m108956l && c1837et.m108959h(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != m108956l && iArr[1] <= i3) {
                while (i8 < m108956l && !c1837et.m108959h(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && m85899d(iArr)) {
                    return m85902a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: c */
    public C7077R9 m85900c() throws NotFoundException {
        int i;
        C7077R9 m85898e;
        C7077R9 m85898e2;
        int i2 = this.f33250c;
        int i3 = this.f33253f;
        int i4 = this.f33252e + i2;
        int i5 = this.f33251d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f33248a.m108959h(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (this.f33248a.m108959h(i8, i7)) {
                    if (i9 == 1) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i9 == 2) {
                        if (m85899d(iArr) && (m85898e2 = m85898e(iArr, i7, i8)) != null) {
                            return m85898e2;
                        }
                        iArr[0] = iArr[2];
                        iArr[1] = 1;
                        iArr[2] = 0;
                        i9 = 1;
                    } else {
                        i9++;
                        iArr[i9] = iArr[i9] + 1;
                    }
                } else {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                }
                i8++;
            }
            if (m85899d(iArr) && (m85898e = m85898e(iArr, i7, i4)) != null) {
                return m85898e;
            }
        }
        if (!this.f33249b.isEmpty()) {
            return this.f33249b.get(0);
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: d */
    public final boolean m85899d(int[] iArr) {
        float f = this.f33254g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C7077R9 m85898e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float m85902a = m85902a(iArr, i2);
        float m85901b = m85901b(i, (int) m85902a, iArr[1] * 2, i3);
        if (!Float.isNaN(m85901b)) {
            float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            for (C7077R9 c7077r9 : this.f33249b) {
                if (c7077r9.m87236f(f, m85901b, m85902a)) {
                    return c7077r9.m87235g(m85901b, m85902a, f);
                }
            }
            C7077R9 c7077r92 = new C7077R9(m85902a, m85901b, f);
            this.f33249b.add(c7077r92);
            InterfaceC41493gN4 interfaceC41493gN4 = this.f33256i;
            if (interfaceC41493gN4 != null) {
                interfaceC41493gN4.m39547a(c7077r92);
                return null;
            }
            return null;
        }
        return null;
    }
}
