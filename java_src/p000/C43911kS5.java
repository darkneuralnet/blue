package p000;

import java.nio.charset.Charset;
import java.util.Map;
import kotlin.UByte;
/* renamed from: kS5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43911kS5 {

    /* renamed from: a */
    public static final String f94406a;

    /* renamed from: b */
    public static final boolean f94407b;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        f94406a = name;
        if (!"SJIS".equalsIgnoreCase(name) && !"EUC_JP".equalsIgnoreCase(name)) {
            z = false;
        } else {
            z = true;
        }
        f94407b = z;
    }

    private C43911kS5() {
    }

    /* renamed from: a */
    public static String m28953a(byte[] bArr, Map<EnumC47491qV0, ?> map) {
        boolean z;
        byte[] bArr2 = bArr;
        if (map != null) {
            EnumC47491qV0 enumC47491qV0 = EnumC47491qV0.CHARACTER_SET;
            if (map.containsKey(enumC47491qV0)) {
                return map.get(enumC47491qV0).toString();
            }
        }
        int length = bArr2.length;
        boolean z2 = true;
        int i = 0;
        if (bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z2 || z3 || z4)) {
            int i13 = bArr2[i3] & UByte.MAX_VALUE;
            if (z4) {
                if (i4 > 0) {
                    if ((i13 & 128) != 0) {
                        i4--;
                    }
                    z4 = false;
                } else if ((i13 & 128) != 0) {
                    if ((i13 & 64) != 0) {
                        i4++;
                        if ((i13 & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((i13 & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((i13 & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                    z4 = false;
                }
            }
            if (z2) {
                if (i13 > 127 && i13 < 160) {
                    z2 = false;
                } else if (i13 > 159 && (i13 < 192 || i13 == 215 || i13 == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (i13 >= 64 && i13 != 127 && i13 <= 252) {
                        i5--;
                    }
                    z3 = false;
                } else {
                    if (i13 != 128 && i13 != 160 && i13 <= 239) {
                        if (i13 > 160 && i13 < 224) {
                            i2++;
                            int i14 = i12 + 1;
                            if (i14 > i9) {
                                i9 = i14;
                                i12 = i9;
                            } else {
                                i12 = i14;
                            }
                            i11 = 0;
                        } else {
                            if (i13 > 127) {
                                i5++;
                                int i15 = i11 + 1;
                                if (i15 > i) {
                                    i = i15;
                                    i11 = i;
                                } else {
                                    i11 = i15;
                                }
                            } else {
                                i11 = 0;
                            }
                            i12 = 0;
                        }
                    }
                    z3 = false;
                }
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        if (z4 && (z || i6 + i7 + i8 > 0)) {
            return "UTF8";
        }
        if (z3 && (f94407b || i9 >= 3 || i >= 3)) {
            return "SJIS";
        }
        if (z2 && z3) {
            if ((i9 == 2 && i2 == 2) || i10 * 10 >= length) {
                return "SJIS";
            }
            return "ISO8859_1";
        } else if (z2) {
            return "ISO8859_1";
        } else {
            if (z3) {
                return "SJIS";
            }
            if (z4) {
                return "UTF8";
            }
            return f94406a;
        }
    }
}
