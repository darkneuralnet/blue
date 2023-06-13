package p000;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
/* renamed from: b21  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38311b21 {

    /* renamed from: a */
    public final C1837ET f56808a;

    /* renamed from: b */
    public InterfaceC41493gN4 f56809b;

    public C38311b21(C1837ET c1837et) {
        this.f56808a = c1837et;
    }

    /* renamed from: c */
    public static int m65094c(C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, float f) throws NotFoundException {
        int m44341c = ((C39713dN2.m44341c(C40900fN4.m41472b(c40900fN4, c40900fN42) / f) + C39713dN2.m44341c(C40900fN4.m41472b(c40900fN4, c40900fN43) / f)) / 2) + 7;
        int i = m44341c & 3;
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    throw NotFoundException.m45943a();
                }
                return m44341c;
            }
            return m44341c - 1;
        }
        return m44341c + 1;
    }

    /* renamed from: d */
    public static C43316jS3 m65093d(C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43, C40900fN4 c40900fN44, int i) {
        float m41471c;
        float m41470d;
        float f;
        float f2 = i - 3.5f;
        if (c40900fN44 != null) {
            m41471c = c40900fN44.m41471c();
            m41470d = c40900fN44.m41470d();
            f = f2 - 3.0f;
        } else {
            m41471c = (c40900fN42.m41471c() - c40900fN4.m41471c()) + c40900fN43.m41471c();
            m41470d = (c40900fN42.m41470d() - c40900fN4.m41470d()) + c40900fN43.m41470d();
            f = f2;
        }
        return C43316jS3.m30608b(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, c40900fN4.m41471c(), c40900fN4.m41470d(), c40900fN42.m41471c(), c40900fN42.m41470d(), m41471c, m41470d, c40900fN43.m41471c(), c40900fN43.m41470d());
    }

    /* renamed from: h */
    public static C1837ET m65089h(C1837ET c1837et, C43316jS3 c43316jS3, int i) throws NotFoundException {
        return AbstractC40223eE1.m43088b().mo20939d(c1837et, i, i, c43316jS3);
    }

    /* renamed from: a */
    public final float m65096a(C40900fN4 c40900fN4, C40900fN4 c40900fN42, C40900fN4 c40900fN43) {
        return (m65095b(c40900fN4, c40900fN42) + m65095b(c40900fN4, c40900fN43)) / 2.0f;
    }

    /* renamed from: b */
    public final float m65095b(C40900fN4 c40900fN4, C40900fN4 c40900fN42) {
        float m65087j = m65087j((int) c40900fN4.m41471c(), (int) c40900fN4.m41470d(), (int) c40900fN42.m41471c(), (int) c40900fN42.m41470d());
        float m65087j2 = m65087j((int) c40900fN42.m41471c(), (int) c40900fN42.m41470d(), (int) c40900fN4.m41471c(), (int) c40900fN4.m41470d());
        if (Float.isNaN(m65087j)) {
            return m65087j2 / 7.0f;
        }
        if (Float.isNaN(m65087j2)) {
            return m65087j / 7.0f;
        }
        return (m65087j + m65087j2) / 14.0f;
    }

    /* renamed from: e */
    public final C38904c21 m65092e(Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException {
        InterfaceC41493gN4 interfaceC41493gN4;
        if (map == null) {
            interfaceC41493gN4 = null;
        } else {
            interfaceC41493gN4 = (InterfaceC41493gN4) map.get(EnumC47491qV0.NEED_RESULT_POINT_CALLBACK);
        }
        this.f56809b = interfaceC41493gN4;
        return m65090g(new C45878nm1(this.f56808a, interfaceC41493gN4).m23200f(map));
    }

    /* renamed from: f */
    public final C7077R9 m65091f(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f56808a.m108953o() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f56808a.m108956l() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new C7347S9(this.f56808a, max, max2, min, min2, f, this.f56809b).m85900c();
            }
            throw NotFoundException.m45943a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: g */
    public final C38904c21 m65090g(C46471om1 c46471om1) throws NotFoundException, FormatException {
        C7077R9 c7077r9;
        C44692lm1 m20522b = c46471om1.m20522b();
        C44692lm1 m20521c = c46471om1.m20521c();
        C44692lm1 m20523a = c46471om1.m20523a();
        float m65096a = m65096a(m20522b, m20521c, m20523a);
        if (m65096a >= 1.0f) {
            int m65094c = m65094c(m20522b, m20521c, m20523a, m65096a);
            C32447Do6 m109909g = C32447Do6.m109909g(m65094c);
            int m109911e = m109909g.m109911e() - 7;
            if (m109909g.m109912d().length > 0) {
                float m41471c = (m20521c.m41471c() - m20522b.m41471c()) + m20523a.m41471c();
                float m41470d = (m20521c.m41470d() - m20522b.m41470d()) + m20523a.m41470d();
                float f = 1.0f - (3.0f / m109911e);
                int m41471c2 = (int) (m20522b.m41471c() + ((m41471c - m20522b.m41471c()) * f));
                int m41470d2 = (int) (m20522b.m41470d() + (f * (m41470d - m20522b.m41470d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        c7077r9 = m65091f(m65096a, m41471c2, m41470d2, i);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            c7077r9 = null;
            return new C38904c21(m65089h(this.f56808a, m65093d(m20522b, m20521c, m20523a, c7077r9, m65094c), m65094c), c7077r9 == null ? new C40900fN4[]{m20523a, m20522b, m20521c} : new C40900fN4[]{m20523a, m20522b, m20521c, c7077r9});
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: i */
    public final float m65088i(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C38311b21 c38311b21;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i5 < i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i6 < i8) {
            i16 = 1;
        }
        int i17 = i7 + i9;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 != i17) {
                if (z) {
                    i12 = i19;
                } else {
                    i12 = i18;
                }
                if (z) {
                    i13 = i18;
                } else {
                    i13 = i19;
                }
                if (i20 == z4) {
                    z2 = z;
                    z3 = z4;
                    i10 = i17;
                    c38311b21 = this;
                } else {
                    c38311b21 = this;
                    z2 = z;
                    i10 = i17;
                    z3 = false;
                }
                if (z3 == c38311b21.f56808a.m108959h(i12, i13)) {
                    if (i20 == 2) {
                        return C39713dN2.m44342b(i18, i19, i5, i6);
                    }
                    i20++;
                }
                i15 += abs2;
                if (i15 > 0) {
                    if (i19 != i8) {
                        i19 += i16;
                        i15 -= abs;
                    } else {
                        i11 = 2;
                        break;
                    }
                }
                i18 += i9;
                i17 = i10;
                z = z2;
                z4 = true;
                i14 = 2;
            } else {
                i10 = i17;
                i11 = i14;
                break;
            }
        }
        if (i20 == i11) {
            return C39713dN2.m44342b(i10, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    public final float m65087j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float m65088i = m65088i(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.f56808a.m108953o()) {
            f = ((this.f56808a.m108953o() - 1) - i) / (i5 - i);
            i5 = this.f56808a.m108953o() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.f56808a.m108956l()) {
            f2 = ((this.f56808a.m108956l() - 1) - i2) / (i7 - i2);
            i6 = this.f56808a.m108956l() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (m65088i + m65088i(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }
}
