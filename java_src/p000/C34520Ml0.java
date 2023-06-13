package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
/* renamed from: Ml0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34520Ml0 extends AbstractC52944zh3 {

    /* renamed from: e */
    public static final int[] f23494e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    public final boolean f23495a;

    /* renamed from: b */
    public final boolean f23496b;

    /* renamed from: c */
    public final StringBuilder f23497c;

    /* renamed from: d */
    public final int[] f23498d;

    public C34520Ml0() {
        this(false);
    }

    /* renamed from: g */
    public static String m94922g(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb.append(charAt);
            } else {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c = CoreConstants.COLON_CHAR;
                                    sb.append(c);
                                } else {
                                    throw FormatException.m45945a();
                                }
                            }
                            c = 0;
                            sb.append(c);
                        } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                        } else {
                            throw FormatException.m45945a();
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c = '@';
                            } else if (charAt2 == 'W') {
                                c = '`';
                            } else if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                throw FormatException.m45945a();
                            } else {
                                c = 127;
                            }
                            sb.append(c);
                        }
                        c = 0;
                        sb.append(c);
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                    i = charAt2 - '@';
                } else {
                    throw FormatException.m45945a();
                }
                c = (char) i;
                sb.append(c);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static int[] m94921h(C1027CT c1027ct, int[] iArr) throws NotFoundException {
        int m112213o = c1027ct.m112213o();
        int m112215m = c1027ct.m112215m(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = m112215m;
        while (m112215m < m112213o) {
            if (c1027ct.m112217k(m112215m) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (m94919j(iArr) == 148 && c1027ct.m112211q(Math.max(0, i2 - ((m112215m - i2) / 2)), i2, false)) {
                        return new int[]{i2, m112215m};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            m112215m++;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: i */
    public static char m94920i(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f23494e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw NotFoundException.m45943a();
            }
        }
    }

    /* renamed from: j */
    public static int m94919j(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] m94921h;
        String sb;
        int[] iArr = this.f23498d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f23497c;
        sb2.setLength(0);
        int m112215m = c1027ct.m112215m(m94921h(c1027ct, iArr)[1]);
        int m112213o = c1027ct.m112213o();
        while (true) {
            AbstractC52944zh3.m540e(c1027ct, m112215m, iArr);
            int m94919j = m94919j(iArr);
            if (m94919j >= 0) {
                char m94920i = m94920i(m94919j);
                sb2.append(m94920i);
                int i2 = m112215m;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int m112215m2 = c1027ct.m112215m(i2);
                if (m94920i == '*') {
                    sb2.setLength(sb2.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (m112215m2 - m112215m) - i4;
                    if (m112215m2 != m112213o && (i6 << 1) < i4) {
                        throw NotFoundException.m45943a();
                    }
                    if (this.f23495a) {
                        int length = sb2.length() - 1;
                        int i7 = 0;
                        for (int i8 = 0; i8 < length; i8++) {
                            i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f23497c.charAt(i8));
                        }
                        if (sb2.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7 % 43)) {
                            sb2.setLength(length);
                        } else {
                            throw ChecksumException.m45946a();
                        }
                    }
                    if (sb2.length() != 0) {
                        if (this.f23496b) {
                            sb = m94922g(sb2);
                        } else {
                            sb = sb2.toString();
                        }
                        float f = i;
                        return new C38511bN4(sb, null, new C40900fN4[]{new C40900fN4((m94921h[1] + m94921h[0]) / 2.0f, f), new C40900fN4(m112215m + (i4 / 2.0f), f)}, EnumC7009Qx.CODE_39);
                    }
                    throw NotFoundException.m45943a();
                }
                m112215m = m112215m2;
            } else {
                throw NotFoundException.m45943a();
            }
        }
    }

    public C34520Ml0(boolean z) {
        this(z, false);
    }

    public C34520Ml0(boolean z, boolean z2) {
        this.f23495a = z;
        this.f23496b = z2;
        this.f23497c = new StringBuilder(20);
        this.f23498d = new int[9];
    }
}
