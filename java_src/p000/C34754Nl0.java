package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.WriterException;
import java.util.Map;
/* renamed from: Nl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34754Nl0 extends AbstractC31679Ah3 {
    /* renamed from: f */
    public static void m93497f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: g */
    public static String m93496g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt != '@') {
                        if (charAt != '`') {
                            if (charAt != '-' && charAt != '.') {
                                if (charAt <= 26) {
                                    sb.append('$');
                                    sb.append((char) ((charAt - 1) + 65));
                                } else if (charAt < ' ') {
                                    sb.append(CoreConstants.PERCENT_CHAR);
                                    sb.append((char) ((charAt - 27) + 65));
                                } else if (charAt > ',' && charAt != '/' && charAt != ':') {
                                    if (charAt <= '9') {
                                        sb.append((char) ((charAt - '0') + 48));
                                    } else if (charAt <= '?') {
                                        sb.append(CoreConstants.PERCENT_CHAR);
                                        sb.append((char) ((charAt - ';') + 70));
                                    } else if (charAt <= 'Z') {
                                        sb.append((char) ((charAt - 'A') + 65));
                                    } else if (charAt <= '_') {
                                        sb.append(CoreConstants.PERCENT_CHAR);
                                        sb.append((char) ((charAt - '[') + 75));
                                    } else if (charAt <= 'z') {
                                        sb.append('+');
                                        sb.append((char) ((charAt - 'a') + 65));
                                    } else if (charAt <= 127) {
                                        sb.append(CoreConstants.PERCENT_CHAR);
                                        sb.append((char) ((charAt - '{') + 80));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                                    }
                                } else {
                                    sb.append(JsonPointer.SEPARATOR);
                                    sb.append((char) ((charAt - '!') + 65));
                                }
                            }
                        } else {
                            sb.append("%W");
                        }
                    } else {
                        sb.append("%V");
                    }
                }
                sb.append(charAt);
            } else {
                sb.append("%U");
            }
        }
        return sb.toString();
    }

    @Override // p000.AbstractC31679Ah3, p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.CODE_39) {
            return super.mo3433a(str, enumC7009Qx, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(enumC7009Qx)));
    }

    @Override // p000.AbstractC31679Ah3
    /* renamed from: c */
    public boolean[] mo30717c(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    str = m93496g(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            int i2 = length + 25;
            for (int i3 = 0; i3 < length; i3++) {
                m93497f(C34520Ml0.f23494e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
                for (int i4 = 0; i4 < 9; i4++) {
                    i2 += iArr[i4];
                }
            }
            boolean[] zArr = new boolean[i2];
            m93497f(148, iArr);
            int m115386b = AbstractC31679Ah3.m115386b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int m115386b2 = m115386b + AbstractC31679Ah3.m115386b(zArr, m115386b, iArr2, false);
            for (int i5 = 0; i5 < length; i5++) {
                m93497f(C34520Ml0.f23494e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
                int m115386b3 = m115386b2 + AbstractC31679Ah3.m115386b(zArr, m115386b2, iArr, true);
                m115386b2 = m115386b3 + AbstractC31679Ah3.m115386b(zArr, m115386b3, iArr2, false);
            }
            m93497f(148, iArr);
            AbstractC31679Ah3.m115386b(zArr, m115386b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
