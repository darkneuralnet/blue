package p000;

import java.io.IOException;
/* renamed from: Cs8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32251Cs8 extends C32179Ck8<C32251Cs8> implements Cloneable {

    /* renamed from: d */
    public String[] f4845d;

    /* renamed from: e */
    public String[] f4846e;

    /* renamed from: f */
    public int[] f4847f;

    /* renamed from: g */
    public long[] f4848g;

    /* renamed from: h */
    public long[] f4849h;

    public C32251Cs8() {
        String[] strArr = C40558en8.f78866f;
        this.f4845d = strArr;
        this.f4846e = strArr;
        this.f4847f = C40558en8.f78861a;
        long[] jArr = C40558en8.f78862b;
        this.f4848g = jArr;
        this.f4849h = jArr;
        this.f4623c = null;
        this.f30878b = -1;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: d */
    public final void mo40568d(C39325ck8 c39325ck8) throws IOException {
        String[] strArr = this.f4845d;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f4845d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    c39325ck8.m60967b(1, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.f4846e;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f4846e;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    c39325ck8.m60967b(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.f4847f;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f4847f;
                if (i4 >= iArr2.length) {
                    break;
                }
                c39325ck8.m60957l(3, iArr2[i4]);
                i4++;
            }
        }
        long[] jArr = this.f4848g;
        if (jArr != null && jArr.length > 0) {
            int i5 = 0;
            while (true) {
                long[] jArr2 = this.f4848g;
                if (i5 >= jArr2.length) {
                    break;
                }
                c39325ck8.m60948u(4, jArr2[i5]);
                i5++;
            }
        }
        long[] jArr3 = this.f4849h;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f4849h;
                if (i >= jArr4.length) {
                    break;
                }
                c39325ck8.m60948u(5, jArr4[i]);
                i++;
            }
        }
        super.mo40568d(c39325ck8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32251Cs8) {
            C32251Cs8 c32251Cs8 = (C32251Cs8) obj;
            if (C32422Dl8.m109971c(this.f4845d, c32251Cs8.f4845d) && C32422Dl8.m109971c(this.f4846e, c32251Cs8.f4846e) && C32422Dl8.m109973a(this.f4847f, c32251Cs8.f4847f) && C32422Dl8.m109972b(this.f4848g, c32251Cs8.f4848g) && C32422Dl8.m109972b(this.f4849h, c32251Cs8.f4849h)) {
                C39335cl8 c39335cl8 = this.f4623c;
                if (c39335cl8 == null || c39335cl8.m60897d()) {
                    C39335cl8 c39335cl82 = c32251Cs8.f4623c;
                    return c39335cl82 == null || c39335cl82.m60897d();
                }
                return this.f4623c.equals(c32251Cs8.f4623c);
            }
            return false;
        }
        return false;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: g */
    public final int mo40567g() {
        long[] jArr;
        int[] iArr;
        int mo40567g = super.mo40567g();
        String[] strArr = this.f4845d;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f4845d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += C39325ck8.m60951r(str);
                }
                i2++;
            }
            mo40567g = mo40567g + i3 + (i4 * 1);
        }
        String[] strArr3 = this.f4846e;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f4846e;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += C39325ck8.m60951r(str2);
                }
                i5++;
            }
            mo40567g = mo40567g + i6 + (i7 * 1);
        }
        int[] iArr2 = this.f4847f;
        if (iArr2 != null && iArr2.length > 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr = this.f4847f;
                if (i8 >= iArr.length) {
                    break;
                }
                i9 += C39325ck8.m60943z(iArr[i8]);
                i8++;
            }
            mo40567g = mo40567g + i9 + (iArr.length * 1);
        }
        long[] jArr2 = this.f4848g;
        if (jArr2 != null && jArr2.length > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                jArr = this.f4848g;
                if (i10 >= jArr.length) {
                    break;
                }
                i11 += C39325ck8.m60945x(jArr[i10]);
                i10++;
            }
            mo40567g = mo40567g + i11 + (jArr.length * 1);
        }
        long[] jArr3 = this.f4849h;
        if (jArr3 == null || jArr3.length <= 0) {
            return mo40567g;
        }
        int i12 = 0;
        while (true) {
            long[] jArr4 = this.f4849h;
            if (i >= jArr4.length) {
                return mo40567g + i12 + (jArr4.length * 1);
            }
            i12 += C39325ck8.m60945x(jArr4[i]);
            i++;
        }
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: h */
    public final /* synthetic */ C35464Ql8 mo40566h() throws CloneNotSupportedException {
        return (C32251Cs8) clone();
    }

    public final int hashCode() {
        int hashCode = (((((((((((C32251Cs8.class.getName().hashCode() + 527) * 31) + C32422Dl8.m109968f(this.f4845d)) * 31) + C32422Dl8.m109968f(this.f4846e)) * 31) + C32422Dl8.m109970d(this.f4847f)) * 31) + C32422Dl8.m109969e(this.f4848g)) * 31) + C32422Dl8.m109969e(this.f4849h)) * 31;
        C39335cl8 c39335cl8 = this.f4623c;
        return hashCode + ((c39335cl8 == null || c39335cl8.m60897d()) ? 0 : this.f4623c.hashCode());
    }

    @Override // p000.C32179Ck8
    /* renamed from: j */
    public final /* synthetic */ C32251Cs8 mo40565j() throws CloneNotSupportedException {
        return (C32251Cs8) clone();
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: k */
    public final C32251Cs8 clone() {
        try {
            C32251Cs8 c32251Cs8 = (C32251Cs8) super.clone();
            String[] strArr = this.f4845d;
            if (strArr != null && strArr.length > 0) {
                c32251Cs8.f4845d = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f4846e;
            if (strArr2 != null && strArr2.length > 0) {
                c32251Cs8.f4846e = (String[]) strArr2.clone();
            }
            int[] iArr = this.f4847f;
            if (iArr != null && iArr.length > 0) {
                c32251Cs8.f4847f = (int[]) iArr.clone();
            }
            long[] jArr = this.f4848g;
            if (jArr != null && jArr.length > 0) {
                c32251Cs8.f4848g = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f4849h;
            if (jArr2 != null && jArr2.length > 0) {
                c32251Cs8.f4849h = (long[]) jArr2.clone();
            }
            return c32251Cs8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
