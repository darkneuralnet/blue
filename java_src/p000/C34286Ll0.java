package p000;

import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: Ll0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34286Ll0 extends AbstractC31679Ah3 {

    /* renamed from: Ll0$a */
    /* loaded from: classes6.dex */
    public enum EnumC5078a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: f */
    public static int m96379f(CharSequence charSequence, int i, int i2) {
        EnumC5078a m96378g;
        EnumC5078a m96378g2;
        char charAt;
        EnumC5078a m96378g3 = m96378g(charSequence, i);
        EnumC5078a enumC5078a = EnumC5078a.ONE_DIGIT;
        if (m96378g3 == enumC5078a) {
            return 100;
        }
        EnumC5078a enumC5078a2 = EnumC5078a.UNCODABLE;
        if (m96378g3 == enumC5078a2) {
            if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) {
                return 100;
            }
            return 101;
        } else if (i2 == 99) {
            return 99;
        } else {
            if (i2 == 100) {
                EnumC5078a enumC5078a3 = EnumC5078a.FNC_1;
                if (m96378g3 == enumC5078a3 || (m96378g = m96378g(charSequence, i + 2)) == enumC5078a2 || m96378g == enumC5078a) {
                    return 100;
                }
                if (m96378g == enumC5078a3) {
                    if (m96378g(charSequence, i + 3) != EnumC5078a.TWO_DIGITS) {
                        return 100;
                    }
                    return 99;
                }
                int i3 = i + 4;
                while (true) {
                    m96378g2 = m96378g(charSequence, i3);
                    if (m96378g2 != EnumC5078a.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                if (m96378g2 == EnumC5078a.ONE_DIGIT) {
                    return 100;
                }
                return 99;
            }
            if (m96378g3 == EnumC5078a.FNC_1) {
                m96378g3 = m96378g(charSequence, i + 1);
            }
            if (m96378g3 != EnumC5078a.TWO_DIGITS) {
                return 100;
            }
            return 99;
        }
    }

    /* renamed from: g */
    public static EnumC5078a m96378g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return EnumC5078a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return EnumC5078a.FNC_1;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i2 = i + 1;
            if (i2 >= length) {
                return EnumC5078a.ONE_DIGIT;
            }
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return EnumC5078a.TWO_DIGITS;
            }
            return EnumC5078a.ONE_DIGIT;
        }
        return EnumC5078a.UNCODABLE;
    }

    @Override // p000.AbstractC31679Ah3, p000.InterfaceC45592nH6
    /* renamed from: a */
    public C1837ET mo3433a(String str, EnumC7009Qx enumC7009Qx, int i, int i2, Map<EnumC40431eb1, ?> map) throws WriterException {
        if (enumC7009Qx == EnumC7009Qx.CODE_128) {
            return super.mo3433a(str, enumC7009Qx, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(enumC7009Qx)));
    }

    @Override // p000.AbstractC31679Ah3
    /* renamed from: c */
    public boolean[] mo30717c(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt <= 127) {
                            break;
                        } else {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                        }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (true) {
                int i7 = 103;
                if (i3 < length) {
                    int m96379f = m96379f(str, i3, i5);
                    int i8 = 100;
                    if (m96379f == i5) {
                        switch (str.charAt(i3)) {
                            case 241:
                                i8 = 102;
                                break;
                            case 242:
                                i8 = 97;
                                break;
                            case 243:
                                i8 = 96;
                                break;
                            case 244:
                                if (i5 == 101) {
                                    i8 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i5 == 100) {
                                    i8 = str.charAt(i3) - ' ';
                                    break;
                                } else if (i5 != 101) {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                }
                                break;
                        }
                        i3++;
                    } else {
                        if (i5 == 0) {
                            if (m96379f != 100) {
                                if (m96379f != 101) {
                                    i7 = 105;
                                }
                            } else {
                                i7 = 104;
                            }
                        } else {
                            i7 = m96379f;
                        }
                        i8 = i7;
                        i5 = m96379f;
                    }
                    arrayList.add(C34052Kl0.f20177a[i8]);
                    i4 += i8 * i6;
                    if (i3 != 0) {
                        i6++;
                    }
                } else {
                    int[][] iArr = C34052Kl0.f20177a;
                    arrayList.add(iArr[i4 % 103]);
                    arrayList.add(iArr[106]);
                    int i9 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i10 : iArr2) {
                            i9 += i10;
                        }
                    }
                    boolean[] zArr = new boolean[i9];
                    for (int[] iArr3 : arrayList) {
                        i += AbstractC31679Ah3.m115386b(zArr, i, iArr3, true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
