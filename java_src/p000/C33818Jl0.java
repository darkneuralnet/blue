package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
/* renamed from: Jl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33818Jl0 extends AbstractC31679Ah3 {

    /* renamed from: a */
    public static final char[] f18129a;

    /* renamed from: b */
    public static final char[] f18130b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    public static final char[] f18131c = {JsonPointer.SEPARATOR, CoreConstants.COLON_CHAR, '+', CoreConstants.DOT};

    /* renamed from: d */
    public static final char f18132d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f18129a = cArr;
        f18132d = cArr[0];
    }

    @Override // p000.AbstractC31679Ah3
    /* renamed from: c */
    public boolean[] mo30717c(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f18132d;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f18129a;
            boolean m101739g = C33584Il0.m101739g(cArr, upperCase);
            boolean m101739g2 = C33584Il0.m101739g(cArr, upperCase2);
            char[] cArr2 = f18130b;
            boolean m101739g3 = C33584Il0.m101739g(cArr2, upperCase);
            boolean m101739g4 = C33584Il0.m101739g(cArr2, upperCase2);
            if (m101739g) {
                if (!m101739g2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (m101739g3) {
                if (!m101739g4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!m101739g2 && !m101739g4) {
                StringBuilder sb2 = new StringBuilder();
                char c2 = f18132d;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (!Character.isDigit(str.charAt(i3)) && str.charAt(i3) != '-' && str.charAt(i3) != '$') {
                if (C33584Il0.m101739g(f18131c, str.charAt(i3))) {
                    i2 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + CoreConstants.SINGLE_QUOTE_CHAR);
                }
            } else {
                i2 += 9;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = C33584Il0.f16154d;
                if (i6 < cArr3.length) {
                    if (upperCase3 == cArr3[i6]) {
                        i = C33584Il0.f16155e[i6];
                        break;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) != 0 && i8 != 1) {
                    i8++;
                } else {
                    z = !z;
                    i7++;
                    i8 = 0;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
