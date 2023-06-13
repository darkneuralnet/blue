package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
/* renamed from: Ol0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34988Ol0 extends AbstractC52944zh3 {

    /* renamed from: c */
    public static final char[] f27198c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    public static final int[] f27199d;

    /* renamed from: e */
    public static final int f27200e;

    /* renamed from: a */
    public final StringBuilder f27201a = new StringBuilder(20);

    /* renamed from: b */
    public final int[] f27202b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, Constants.NO_SUCH_BUCKET_STATUS_CODE, 402, 394, 360, 356, 354, StatusLine.HTTP_PERM_REDIRECT, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f27199d = iArr;
        f27200e = iArr[47];
    }

    /* renamed from: g */
    public static void m91557g(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        m91556h(charSequence, length - 2, 20);
        m91556h(charSequence, length - 1, 15);
    }

    /* renamed from: h */
    public static void m91556h(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) == f27198c[i3 % 47]) {
            return;
        }
        throw ChecksumException.m45946a();
    }

    /* renamed from: i */
    public static String m91555i(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 < length - 1) {
                    i2++;
                    char charAt2 = charSequence.charAt(i2);
                    switch (charAt) {
                        case 'a':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 - '@';
                                c = (char) i;
                                break;
                            } else {
                                throw FormatException.m45945a();
                            }
                            break;
                        case 'b':
                            if (charAt2 >= 'A' && charAt2 <= 'E') {
                                i = charAt2 - '&';
                            } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                                i = charAt2 - 11;
                            } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                                i = charAt2 + 16;
                            } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                                i = charAt2 + '+';
                            } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                c = 127;
                                break;
                            } else {
                                throw FormatException.m45945a();
                            }
                            c = (char) i;
                            break;
                        case 'c':
                            if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                                c = (char) i;
                                break;
                            } else if (charAt2 == 'Z') {
                                c = CoreConstants.COLON_CHAR;
                                break;
                            } else {
                                throw FormatException.m45945a();
                            }
                        case 'd':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 + ' ';
                                c = (char) i;
                                break;
                            } else {
                                throw FormatException.m45945a();
                            }
                        default:
                            c = 0;
                            break;
                    }
                    sb.append(c);
                } else {
                    throw FormatException.m45945a();
                }
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static char m91553k(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f27199d;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f27198c[i2];
                }
                i2++;
            } else {
                throw NotFoundException.m45943a();
            }
        }
    }

    /* renamed from: l */
    public static int m91552l(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round > 0 && round <= 4) {
                if ((i4 & 1) == 0) {
                    for (int i5 = 0; i5 < round; i5++) {
                        i3 = (i3 << 1) | 1;
                    }
                } else {
                    i3 <<= round;
                }
            } else {
                return -1;
            }
        }
        return i3;
    }

    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] m91554j;
        int m112215m = c1027ct.m112215m(m91554j(c1027ct)[1]);
        int m112213o = c1027ct.m112213o();
        int[] iArr = this.f27202b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f27201a;
        sb.setLength(0);
        while (true) {
            AbstractC52944zh3.m540e(c1027ct, m112215m, iArr);
            int m91552l = m91552l(iArr);
            if (m91552l >= 0) {
                char m91553k = m91553k(m91552l);
                sb.append(m91553k);
                int i2 = m112215m;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int m112215m2 = c1027ct.m112215m(i2);
                if (m91553k == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (m112215m2 != m112213o && c1027ct.m112217k(m112215m2)) {
                        if (sb.length() >= 2) {
                            m91557g(sb);
                            sb.setLength(sb.length() - 2);
                            float f = i;
                            return new C38511bN4(m91555i(sb), null, new C40900fN4[]{new C40900fN4((m91554j[1] + m91554j[0]) / 2.0f, f), new C40900fN4(m112215m + (i4 / 2.0f), f)}, EnumC7009Qx.CODE_93);
                        }
                        throw NotFoundException.m45943a();
                    }
                    throw NotFoundException.m45943a();
                }
                m112215m = m112215m2;
            } else {
                throw NotFoundException.m45943a();
            }
        }
    }

    /* renamed from: j */
    public final int[] m91554j(C1027CT c1027ct) throws NotFoundException {
        int m112213o = c1027ct.m112213o();
        int m112215m = c1027ct.m112215m(0);
        Arrays.fill(this.f27202b, 0);
        int[] iArr = this.f27202b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = m112215m;
        while (m112215m < m112213o) {
            if (c1027ct.m112217k(m112215m) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (m91552l(iArr) == f27200e) {
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
}
