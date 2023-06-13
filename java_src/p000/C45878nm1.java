package p000;

import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* renamed from: nm1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45878nm1 {

    /* renamed from: a */
    public final C1837ET f100483a;

    /* renamed from: c */
    public boolean f100485c;

    /* renamed from: e */
    public final InterfaceC41493gN4 f100487e;

    /* renamed from: b */
    public final List<C44692lm1> f100484b = new ArrayList();

    /* renamed from: d */
    public final int[] f100486d = new int[5];

    /* renamed from: nm1$b */
    /* loaded from: classes6.dex */
    public static final class C26584b implements Serializable, Comparator<C44692lm1> {

        /* renamed from: b */
        public final float f100488b;

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C44692lm1 c44692lm1, C44692lm1 c44692lm12) {
            int compare = Integer.compare(c44692lm12.m26846h(), c44692lm1.m26846h());
            if (compare == 0) {
                return Float.compare(Math.abs(c44692lm1.m26845i() - this.f100488b), Math.abs(c44692lm12.m26845i() - this.f100488b));
            }
            return compare;
        }

        public C26584b(float f) {
            this.f100488b = f;
        }
    }

    /* renamed from: nm1$c */
    /* loaded from: classes6.dex */
    public static final class C26585c implements Serializable, Comparator<C44692lm1> {

        /* renamed from: b */
        public final float f100489b;

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C44692lm1 c44692lm1, C44692lm1 c44692lm12) {
            return Float.compare(Math.abs(c44692lm12.m26845i() - this.f100489b), Math.abs(c44692lm1.m26845i() - this.f100489b));
        }

        public C26585c(float f) {
            this.f100489b = f;
        }
    }

    public C45878nm1(C1837ET c1837et, InterfaceC41493gN4 interfaceC41493gN4) {
        this.f100483a = c1837et;
        this.f100487e = interfaceC41493gN4;
    }

    /* renamed from: a */
    public static float m23205a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: h */
    public static boolean m23198h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m23197i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m23204b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* renamed from: c */
    public final boolean m23203c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] m23196j = m23196j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f100483a.m108959h(i2 - i6, i - i6)) {
            m23196j[2] = m23196j[2] + 1;
            i6++;
        }
        if (m23196j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f100483a.m108959h(i2 - i6, i - i6)) {
            m23196j[1] = m23196j[1] + 1;
            i6++;
        }
        if (m23196j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f100483a.m108959h(i2 - i6, i - i6)) {
            m23196j[0] = m23196j[0] + 1;
            i6++;
        }
        if (m23196j[0] == 0) {
            return false;
        }
        int m108956l = this.f100483a.m108956l();
        int m108953o = this.f100483a.m108953o();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= m108956l || (i5 = i2 + i7) >= m108953o || !this.f100483a.m108959h(i5, i8)) {
                break;
            }
            m23196j[2] = m23196j[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= m108956l || (i4 = i2 + i7) >= m108953o || this.f100483a.m108959h(i4, i9)) {
                break;
            }
            m23196j[3] = m23196j[3] + 1;
            i7++;
        }
        if (m23196j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= m108956l || (i3 = i2 + i7) >= m108953o || !this.f100483a.m108959h(i3, i10)) {
                break;
            }
            m23196j[4] = m23196j[4] + 1;
            i7++;
        }
        if (m23196j[4] == 0) {
            return false;
        }
        return m23197i(m23196j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.m108959h(r11, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        if (m23198h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        return m23205a(r2, r11);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m23202d(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C1837ET c1837et = this.f100483a;
        int m108953o = c1837et.m108953o();
        int[] m23196j = m23196j();
        int i7 = i;
        while (i7 >= 0 && c1837et.m108959h(i7, i2)) {
            m23196j[2] = m23196j[2] + 1;
            i7--;
        }
        if (i7 < 0) {
            return Float.NaN;
        }
        while (i7 >= 0 && !c1837et.m108959h(i7, i2)) {
            int i8 = m23196j[1];
            if (i8 > i3) {
                break;
            }
            m23196j[1] = i8 + 1;
            i7--;
        }
        if (i7 >= 0 && m23196j[1] <= i3) {
            while (i7 >= 0 && c1837et.m108959h(i7, i2) && (i6 = m23196j[0]) <= i3) {
                m23196j[0] = i6 + 1;
                i7--;
            }
            if (m23196j[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < m108953o && c1837et.m108959h(i9, i2)) {
                m23196j[2] = m23196j[2] + 1;
                i9++;
            }
            if (i9 == m108953o) {
                return Float.NaN;
            }
            while (i9 < m108953o && !c1837et.m108959h(i9, i2) && (i5 = m23196j[3]) < i3) {
                m23196j[3] = i5 + 1;
                i9++;
            }
        }
        return Float.NaN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.m108959h(r12, r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
        if (m23198h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bf, code lost:
        return m23205a(r2, r11);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m23201e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C1837ET c1837et = this.f100483a;
        int m108956l = c1837et.m108956l();
        int[] m23196j = m23196j();
        int i7 = i;
        while (i7 >= 0 && c1837et.m108959h(i2, i7)) {
            m23196j[2] = m23196j[2] + 1;
            i7--;
        }
        if (i7 < 0) {
            return Float.NaN;
        }
        while (i7 >= 0 && !c1837et.m108959h(i2, i7)) {
            int i8 = m23196j[1];
            if (i8 > i3) {
                break;
            }
            m23196j[1] = i8 + 1;
            i7--;
        }
        if (i7 >= 0 && m23196j[1] <= i3) {
            while (i7 >= 0 && c1837et.m108959h(i2, i7) && (i6 = m23196j[0]) <= i3) {
                m23196j[0] = i6 + 1;
                i7--;
            }
            if (m23196j[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < m108956l && c1837et.m108959h(i2, i9)) {
                m23196j[2] = m23196j[2] + 1;
                i9++;
            }
            if (i9 == m108956l) {
                return Float.NaN;
            }
            while (i9 < m108956l && !c1837et.m108959h(i2, i9) && (i5 = m23196j[3]) < i3) {
                m23196j[3] = i5 + 1;
                i9++;
            }
        }
        return Float.NaN;
    }

    /* renamed from: f */
    public final C46471om1 m23200f(Map<EnumC47491qV0, ?> map) throws NotFoundException {
        boolean z;
        if (map != null && map.containsKey(EnumC47491qV0.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        int m108956l = this.f100483a.m108956l();
        int m108953o = this.f100483a.m108953o();
        int i = (m108956l * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < m108956l && !z2) {
            m23204b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < m108953o) {
                if (this.f100483a.m108959h(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) == 0) {
                    if (i4 == 4) {
                        if (m23198h(iArr)) {
                            if (m23195k(iArr, i2, i3)) {
                                if (this.f100485c) {
                                    z2 = m23194l();
                                } else {
                                    int m23199g = m23199g();
                                    int i5 = iArr[2];
                                    if (m23199g > i5) {
                                        i2 += (m23199g - i5) - 2;
                                        i3 = m108953o - 1;
                                    }
                                }
                                m23204b(iArr);
                                i = 2;
                                i4 = 0;
                            } else {
                                m23192n(iArr);
                            }
                        } else {
                            m23192n(iArr);
                        }
                        i4 = 3;
                    } else {
                        i4++;
                        iArr[i4] = iArr[i4] + 1;
                    }
                } else {
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m23198h(iArr) && m23195k(iArr, i2, m108953o)) {
                i = iArr[0];
                if (this.f100485c) {
                    z2 = m23194l();
                }
            }
            i2 += i;
        }
        C44692lm1[] m23193m = m23193m();
        C40900fN4.m41469e(m23193m);
        return new C46471om1(m23193m);
    }

    /* renamed from: g */
    public final int m23199g() {
        if (this.f100484b.size() <= 1) {
            return 0;
        }
        C44692lm1 c44692lm1 = null;
        for (C44692lm1 c44692lm12 : this.f100484b) {
            if (c44692lm12.m26846h() >= 2) {
                if (c44692lm1 == null) {
                    c44692lm1 = c44692lm12;
                } else {
                    this.f100485c = true;
                    return ((int) (Math.abs(c44692lm1.m41471c() - c44692lm12.m41471c()) - Math.abs(c44692lm1.m41470d() - c44692lm12.m41470d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: j */
    public final int[] m23196j() {
        m23204b(this.f100486d);
        return this.f100486d;
    }

    /* renamed from: k */
    public final boolean m23195k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m23205a = (int) m23205a(iArr, i2);
        float m23201e = m23201e(i, m23205a, iArr[2], i3);
        if (!Float.isNaN(m23201e)) {
            int i4 = (int) m23201e;
            float m23202d = m23202d(m23205a, i4, iArr[2], i3);
            if (!Float.isNaN(m23202d) && m23203c(i4, (int) m23202d)) {
                float f = i3 / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f100484b.size()) {
                        break;
                    }
                    C44692lm1 c44692lm1 = this.f100484b.get(i5);
                    if (c44692lm1.m26848f(f, m23201e, m23202d)) {
                        this.f100484b.set(i5, c44692lm1.m26847g(m23201e, m23202d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C44692lm1 c44692lm12 = new C44692lm1(m23202d, m23201e, f);
                    this.f100484b.add(c44692lm12);
                    InterfaceC41493gN4 interfaceC41493gN4 = this.f100487e;
                    if (interfaceC41493gN4 != null) {
                        interfaceC41493gN4.m39547a(c44692lm12);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m23194l() {
        int size = this.f100484b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C44692lm1 c44692lm1 : this.f100484b) {
            if (c44692lm1.m26846h() >= 2) {
                i++;
                f2 += c44692lm1.m26845i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (C44692lm1 c44692lm12 : this.f100484b) {
            f += Math.abs(c44692lm12.m26845i() - f3);
        }
        if (f > f2 * 0.05f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final C44692lm1[] m23193m() throws NotFoundException {
        float f;
        int size = this.f100484b.size();
        if (size >= 3) {
            float f2 = 0.0f;
            if (size > 3) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (C44692lm1 c44692lm1 : this.f100484b) {
                    float m26845i = c44692lm1.m26845i();
                    f3 += m26845i;
                    f4 += m26845i * m26845i;
                }
                float f5 = f3 / size;
                float sqrt = (float) Math.sqrt((f4 / f) - (f5 * f5));
                Collections.sort(this.f100484b, new C26585c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i = 0;
                while (i < this.f100484b.size() && this.f100484b.size() > 3) {
                    if (Math.abs(this.f100484b.get(i).m26845i() - f5) > max) {
                        this.f100484b.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (this.f100484b.size() > 3) {
                for (C44692lm1 c44692lm12 : this.f100484b) {
                    f2 += c44692lm12.m26845i();
                }
                Collections.sort(this.f100484b, new C26584b(f2 / this.f100484b.size()));
                List<C44692lm1> list = this.f100484b;
                list.subList(3, list.size()).clear();
            }
            return new C44692lm1[]{this.f100484b.get(0), this.f100484b.get(1), this.f100484b.get(2)};
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: n */
    public final void m23192n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
