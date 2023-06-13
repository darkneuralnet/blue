package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.Map;
/* renamed from: ed6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC40456ed6 extends AbstractC52944zh3 {

    /* renamed from: d */
    public static final int[] f78632d = {1, 1, 1};

    /* renamed from: e */
    public static final int[] f78633e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[] f78634f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    public static final int[][] f78635g;

    /* renamed from: h */
    public static final int[][] f78636h;

    /* renamed from: a */
    public final StringBuilder f78637a = new StringBuilder(20);

    /* renamed from: b */
    public final C39864dd6 f78638b = new C39864dd6();

    /* renamed from: c */
    public final I81 f78639c = new I81();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f78635g = iArr;
        int[][] iArr2 = new int[20];
        f78636h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f78635g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f78636h[i] = iArr4;
        }
    }

    /* renamed from: h */
    public static boolean m42690h(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (m42684q(charSequence.subSequence(0, i)) != Character.digit(charSequence.charAt(i), 10)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static int m42689i(C1027CT c1027ct, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        AbstractC52944zh3.m540e(c1027ct, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float m541d = AbstractC52944zh3.m541d(iArr, iArr2[i3], 0.7f);
            if (m541d < f) {
                i2 = i3;
                f = m541d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: m */
    public static int[] m42687m(C1027CT c1027ct, int i, boolean z, int[] iArr) throws NotFoundException {
        return m42686n(c1027ct, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: n */
    public static int[] m42686n(C1027CT c1027ct, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int m112215m;
        int m112213o = c1027ct.m112213o();
        if (z) {
            m112215m = c1027ct.m112214n(i);
        } else {
            m112215m = c1027ct.m112215m(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = m112215m;
        while (m112215m < m112213o) {
            if (c1027ct.m112217k(m112215m) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 == length - 1) {
                    if (AbstractC52944zh3.m541d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, m112215m};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            m112215m++;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: o */
    public static int[] m42685o(C1027CT c1027ct) throws NotFoundException {
        int[] iArr = new int[f78632d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f78632d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m42686n(c1027ct, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = c1027ct.m112211q(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: q */
    public static int m42684q(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i += charAt;
            } else {
                throw FormatException.m45945a();
            }
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i3 += charAt2;
            } else {
                throw FormatException.m45945a();
            }
        }
        return (1000 - i3) % 10;
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return mo42688l(i, c1027ct, m42685o(c1027ct), map);
    }

    /* renamed from: g */
    public boolean mo37951g(String str) throws FormatException {
        return m42690h(str);
    }

    /* renamed from: j */
    public int[] mo37950j(C1027CT c1027ct, int i) throws NotFoundException {
        return m42687m(c1027ct, i, false, f78632d);
    }

    /* renamed from: k */
    public abstract int mo37949k(C1027CT c1027ct, int[] iArr, StringBuilder sb) throws NotFoundException;

    /* renamed from: l */
    public C38511bN4 mo42688l(int i, C1027CT c1027ct, int[] iArr, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException {
        InterfaceC41493gN4 interfaceC41493gN4;
        int i2;
        String m102916c;
        int[] iArr2 = null;
        if (map == null) {
            interfaceC41493gN4 = null;
        } else {
            interfaceC41493gN4 = (InterfaceC41493gN4) map.get(EnumC47491qV0.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (interfaceC41493gN4 != null) {
            interfaceC41493gN4.m39547a(new C40900fN4((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f78637a;
        sb.setLength(0);
        int mo37949k = mo37949k(c1027ct, iArr, sb);
        if (interfaceC41493gN4 != null) {
            interfaceC41493gN4.m39547a(new C40900fN4(mo37949k, i));
        }
        int[] mo37950j = mo37950j(c1027ct, mo37949k);
        if (interfaceC41493gN4 != null) {
            interfaceC41493gN4.m39547a(new C40900fN4((mo37950j[0] + mo37950j[1]) / 2.0f, i));
        }
        int i3 = mo37950j[1];
        int i4 = (i3 - mo37950j[0]) + i3;
        if (i4 < c1027ct.m112213o() && c1027ct.m112211q(i3, i4, false)) {
            String sb2 = sb.toString();
            if (sb2.length() >= 8) {
                if (mo37951g(sb2)) {
                    EnumC7009Qx mo37948p = mo37948p();
                    float f = i;
                    C38511bN4 c38511bN4 = new C38511bN4(sb2, null, new C40900fN4[]{new C40900fN4((iArr[1] + iArr[0]) / 2.0f, f), new C40900fN4((mo37950j[1] + mo37950j[0]) / 2.0f, f)}, mo37948p);
                    try {
                        C38511bN4 m44001a = this.f78638b.m44001a(i, c1027ct, mo37950j[1]);
                        c38511bN4.m64615h(EnumC39715dN4.UPC_EAN_EXTENSION, m44001a.m64617f());
                        c38511bN4.m64616g(m44001a.m64619d());
                        c38511bN4.m64622a(m44001a.m64618e());
                        i2 = m44001a.m64617f().length();
                    } catch (ReaderException unused) {
                        i2 = 0;
                    }
                    if (map != null) {
                        iArr2 = (int[]) map.get(EnumC47491qV0.ALLOWED_EAN_EXTENSIONS);
                    }
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (i2 == iArr2[i5]) {
                                    break;
                                }
                                i5++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            throw NotFoundException.m45943a();
                        }
                    }
                    if ((mo37948p == EnumC7009Qx.EAN_13 || mo37948p == EnumC7009Qx.UPC_A) && (m102916c = this.f78639c.m102916c(sb2)) != null) {
                        c38511bN4.m64615h(EnumC39715dN4.POSSIBLE_COUNTRY, m102916c);
                    }
                    return c38511bN4;
                }
                throw ChecksumException.m45946a();
            }
            throw FormatException.m45945a();
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: p */
    public abstract EnumC7009Qx mo37948p();
}
