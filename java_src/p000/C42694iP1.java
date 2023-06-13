package p000;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
/* renamed from: iP1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42694iP1 extends AbstractC52944zh3 {

    /* renamed from: b */
    public static final int[] f87240b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    public static final int[] f87241c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[][] f87242d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    public static final int[][] f87243e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f87244a = -1;

    /* renamed from: g */
    public static int m34023g(int[] iArr) throws NotFoundException {
        int length = f87243e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float m541d = AbstractC52944zh3.m541d(iArr, f87243e[i2], 0.5f);
            if (m541d < f) {
                i = i2;
                f = m541d;
            } else if (m541d == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: i */
    public static void m34021i(C1027CT c1027ct, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            AbstractC52944zh3.m540e(c1027ct, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m34023g(iArr2) + 48));
            sb.append((char) (m34023g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: k */
    public static int[] m34019k(C1027CT c1027ct, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m112213o = c1027ct.m112213o();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < m112213o) {
            if (c1027ct.m112217k(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 == length - 1) {
                    if (AbstractC52944zh3.m541d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i2, i};
                    }
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: l */
    public static int m34018l(C1027CT c1027ct) throws NotFoundException {
        int m112213o = c1027ct.m112213o();
        int m112215m = c1027ct.m112215m(0);
        if (m112215m != m112213o) {
            return m112215m;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws FormatException, NotFoundException {
        int[] iArr;
        boolean z;
        int[] m34020j = m34020j(c1027ct);
        int[] m34022h = m34022h(c1027ct);
        StringBuilder sb = new StringBuilder(20);
        m34021i(c1027ct, m34020j[1], m34022h[0], sb);
        String sb2 = sb.toString();
        if (map != null) {
            iArr = (int[]) map.get(EnumC47491qV0.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f87240b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length2) {
                int i4 = iArr[i2];
                if (length == i4) {
                    z = true;
                    break;
                }
                if (i4 > i3) {
                    i3 = i4;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = i;
            return new C38511bN4(sb2, null, new C40900fN4[]{new C40900fN4(m34020j[1], f), new C40900fN4(m34022h[0], f)}, EnumC7009Qx.ITF);
        }
        throw FormatException.m45945a();
    }

    /* renamed from: h */
    public final int[] m34022h(C1027CT c1027ct) throws NotFoundException {
        int i;
        int[] m34019k;
        c1027ct.m112209t();
        try {
            try {
                m34019k = m34019k(c1027ct, m34018l(c1027ct), f87242d[0]);
            } catch (NotFoundException unused) {
                m34019k = m34019k(c1027ct, i, f87242d[1]);
            }
            m34017m(c1027ct, m34019k[0]);
            int i2 = m34019k[0];
            m34019k[0] = c1027ct.m112213o() - m34019k[1];
            m34019k[1] = c1027ct.m112213o() - i2;
            return m34019k;
        } finally {
            c1027ct.m112209t();
        }
    }

    /* renamed from: j */
    public final int[] m34020j(C1027CT c1027ct) throws NotFoundException {
        int[] m34019k = m34019k(c1027ct, m34018l(c1027ct), f87241c);
        int i = m34019k[1];
        int i2 = m34019k[0];
        this.f87244a = (i - i2) / 4;
        m34017m(c1027ct, i2);
        return m34019k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m34017m(C1027CT c1027ct, int i) throws NotFoundException {
        int i2 = this.f87244a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        for (int i3 = i - 1; i2 > 0 && i3 >= 0 && !c1027ct.m112217k(i3); i3--) {
            i2--;
        }
        throw NotFoundException.m45943a();
    }
}
