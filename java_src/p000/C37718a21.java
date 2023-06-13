package p000;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* renamed from: a21  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37718a21 {

    /* renamed from: a */
    public static final int[] f49736a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final int[] f49737b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final int[] f49738c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    public static final int[] f49739d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private C37718a21() {
    }

    /* renamed from: a */
    public static void m71970a(C40900fN4[] c40900fN4Arr, C40900fN4[] c40900fN4Arr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            c40900fN4Arr[iArr[i]] = c40900fN4Arr2[i];
        }
    }

    /* renamed from: b */
    public static C47925rD3 m71969b(C7707TG c7707tg, Map<EnumC47491qV0, ?> map, boolean z) throws NotFoundException {
        C1837ET m84122a = c7707tg.m84122a();
        List<C40900fN4[]> m71968c = m71968c(z, m84122a);
        if (m71968c.isEmpty()) {
            m84122a = m84122a.clone();
            m84122a.m108952p();
            m71968c = m71968c(z, m84122a);
        }
        return new C47925rD3(m84122a, m71968c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4 = (p000.C40900fN4[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = (int) java.lang.Math.max(r2, r7.m41470d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.m41470d());
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<C40900fN4[]> m71968c(boolean z, C1837ET c1837et) {
        int m41471c;
        float m41470d;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            int i3 = i2;
            while (true) {
                if (i >= c1837et.m108956l()) {
                    break loop0;
                }
                C40900fN4[] m71965f = m71965f(c1837et, i, i2);
                if (m71965f[0] != null || m71965f[3] != null) {
                    arrayList.add(m71965f);
                    if (!z) {
                        break loop0;
                    }
                    C40900fN4 c40900fN4 = m71965f[2];
                    if (c40900fN4 != null) {
                        m41471c = (int) c40900fN4.m41471c();
                        m41470d = m71965f[2].m41470d();
                    } else {
                        m41471c = (int) m71965f[4].m41471c();
                        m41470d = m71965f[4].m41470d();
                    }
                    i = (int) m41470d;
                    i2 = m41471c;
                    i3 = 1;
                } else {
                    break;
                }
            }
            i += 5;
            i2 = 0;
        }
        return arrayList;
    }

    /* renamed from: d */
    public static int[] m71967d(C1837ET c1837et, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (c1837et.m108959h(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (c1837et.m108959h(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 == length - 1) {
                    if (m71964g(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                } else {
                    i6++;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m71964g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    public static C40900fN4[] m71966e(C1837ET c1837et, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        C40900fN4[] c40900fN4Arr = new C40900fN4[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 < i) {
                int[] m71967d = m71967d(c1837et, i4, i8, i2, false, iArr, iArr2);
                if (m71967d != null) {
                    int i9 = i8;
                    int[] iArr3 = m71967d;
                    int i10 = i9;
                    while (true) {
                        if (i10 > 0) {
                            int i11 = i10 - 1;
                            int[] m71967d2 = m71967d(c1837et, i4, i11, i2, false, iArr, iArr2);
                            if (m71967d2 != null) {
                                iArr3 = m71967d2;
                                i10 = i11;
                            } else {
                                i7 = i11 + 1;
                                break;
                            }
                        } else {
                            i7 = i10;
                            break;
                        }
                    }
                    float f = i7;
                    c40900fN4Arr[0] = new C40900fN4(iArr3[0], f);
                    c40900fN4Arr[1] = new C40900fN4(iArr3[1], f);
                    z = true;
                    i8 = i7;
                } else {
                    i8 += 5;
                }
            } else {
                z = false;
                break;
            }
        }
        int i12 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) c40900fN4Arr[0].m41471c(), (int) c40900fN4Arr[1].m41471c()};
            int i13 = i12;
            int i14 = 0;
            while (true) {
                if (i13 < i) {
                    i5 = i14;
                    i6 = i13;
                    int[] m71967d3 = m71967d(c1837et, iArr4[0], i13, i2, false, iArr, iArr2);
                    if (m71967d3 != null && Math.abs(iArr4[0] - m71967d3[0]) < 5 && Math.abs(iArr4[1] - m71967d3[1]) < 5) {
                        iArr4 = m71967d3;
                        i14 = 0;
                    } else if (i5 > 25) {
                        break;
                    } else {
                        i14 = i5 + 1;
                    }
                    i13 = i6 + 1;
                } else {
                    i5 = i14;
                    i6 = i13;
                    break;
                }
            }
            i12 = i6 - (i5 + 1);
            float f2 = i12;
            c40900fN4Arr[2] = new C40900fN4(iArr4[0], f2);
            c40900fN4Arr[3] = new C40900fN4(iArr4[1], f2);
        }
        if (i12 - i8 < 10) {
            Arrays.fill(c40900fN4Arr, (Object) null);
        }
        return c40900fN4Arr;
    }

    /* renamed from: f */
    public static C40900fN4[] m71965f(C1837ET c1837et, int i, int i2) {
        int m108956l = c1837et.m108956l();
        int m108953o = c1837et.m108953o();
        C40900fN4[] c40900fN4Arr = new C40900fN4[8];
        m71970a(c40900fN4Arr, m71966e(c1837et, m108956l, m108953o, i, i2, f49738c), f49736a);
        C40900fN4 c40900fN4 = c40900fN4Arr[4];
        if (c40900fN4 != null) {
            i2 = (int) c40900fN4.m41471c();
            i = (int) c40900fN4Arr[4].m41470d();
        }
        m71970a(c40900fN4Arr, m71966e(c1837et, m108956l, m108953o, i, i2, f49739d), f49737b);
        return c40900fN4Arr;
    }

    /* renamed from: g */
    public static float m71964g(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i;
        float f4 = f3 / i2;
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f7 = iArr2[i4] * f4;
            float f8 = iArr[i4];
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }
}
