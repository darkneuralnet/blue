package p000;

import com.google.p034ar.core.ImageMetadata;
import kotlin.KotlinVersion;
import kotlin.UByte;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
/* renamed from: mV0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45119mV0 {

    /* renamed from: a */
    public static final int[] f98110a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* renamed from: b */
    public static final int[] f98111b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* renamed from: c */
    public static final int[] f98112c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* renamed from: d */
    public static final int[] f98113d = {DateUtils.FORMAT_NUMERIC_DATE, 131076, 131075, 196610, DateUtils.FORMAT_NUMERIC_DATE, 131076, 131075, 262145, DateUtils.FORMAT_NUMERIC_DATE, 131076, 131075, 196610, DateUtils.FORMAT_NUMERIC_DATE, 131076, 131075, ImageMetadata.FLASH_STATE};

    /* renamed from: a */
    public static void m25522a(C48035rP5 c48035rP5) {
        C3535IT c3535it = c48035rP5.f106995c;
        byte[] bArr = c48035rP5.f106996d;
        int i = c48035rP5.f106999g;
        if (i <= 0) {
            C3535IT.m102390k(c3535it);
            c48035rP5.f106993a = 1;
            return;
        }
        int min = Math.min(c48035rP5.f106983Q - c48035rP5.f107010r, i);
        C3535IT.m102398c(c3535it, bArr, c48035rP5.f107010r, min);
        c48035rP5.f106999g -= min;
        int i2 = c48035rP5.f107010r + min;
        c48035rP5.f107010r = i2;
        int i3 = c48035rP5.f106983Q;
        if (i2 == i3) {
            c48035rP5.f106994b = 5;
            c48035rP5.f106991Y = i3;
            c48035rP5.f106990X = 0;
            c48035rP5.f106993a = 12;
            return;
        }
        C3535IT.m102390k(c3535it);
        c48035rP5.f106993a = 1;
    }

    /* renamed from: b */
    public static void m25521b(C48035rP5 c48035rP5, int i) {
        int i2;
        C3535IT c3535it = c48035rP5.f106995c;
        int[] iArr = c48035rP5.f107008p;
        int i3 = i * 2;
        C3535IT.m102397d(c3535it);
        int i4 = i * 1080;
        int m25505r = m25505r(c48035rP5.f106997e, i4, c3535it);
        c48035rP5.f107006n[i] = m25510m(c48035rP5.f106998f, i4, c3535it);
        if (m25505r == 1) {
            i2 = iArr[i3 + 1] + 1;
        } else if (m25505r == 0) {
            i2 = iArr[i3];
        } else {
            i2 = m25505r - 2;
        }
        int i5 = c48035rP5.f107007o[i];
        if (i2 >= i5) {
            i2 -= i5;
        }
        int i6 = i3 + 1;
        iArr[i3] = iArr[i6];
        iArr[i6] = i2;
    }

    /* renamed from: c */
    public static void m25520c(C48035rP5 c48035rP5) {
        m25521b(c48035rP5, 1);
        c48035rP5.f106972F = c48035rP5.f107004l.f31973c[c48035rP5.f107008p[3]];
    }

    /* renamed from: d */
    public static int m25519d(int i, byte[] bArr, C3535IT c3535it) {
        boolean z;
        int i2;
        C3535IT.m102391j(c3535it);
        int m25515h = m25515h(c3535it) + 1;
        if (m25515h == 1) {
            C33797Ji6.m99921a(bArr, 0, i);
            return m25515h;
        }
        if (C3535IT.m102392i(c3535it, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = C3535IT.m102392i(c3535it, 4) + 1;
        } else {
            i2 = 0;
        }
        int[] iArr = new int[1080];
        m25509n(m25515h + i2, iArr, 0, c3535it);
        int i3 = 0;
        while (i3 < i) {
            C3535IT.m102391j(c3535it);
            C3535IT.m102397d(c3535it);
            int m25505r = m25505r(iArr, 0, c3535it);
            if (m25505r == 0) {
                bArr[i3] = 0;
            } else if (m25505r <= i2) {
                for (int m102392i = (1 << m25505r) + C3535IT.m102392i(c3535it, m25505r); m102392i != 0; m102392i--) {
                    if (i3 < i) {
                        bArr[i3] = 0;
                        i3++;
                    } else {
                        throw new P20("Corrupted context map");
                    }
                }
                continue;
            } else {
                bArr[i3] = (byte) (m25505r - i2);
            }
            i3++;
        }
        if (C3535IT.m102392i(c3535it, 1) == 1) {
            m25513j(bArr, i);
        }
        return m25515h;
    }

    /* renamed from: e */
    public static void m25518e(C48035rP5 c48035rP5) {
        m25521b(c48035rP5, 2);
        c48035rP5.f106969C = c48035rP5.f107008p[5] << 2;
    }

    /* renamed from: f */
    public static void m25517f(C48035rP5 c48035rP5) {
        m25521b(c48035rP5, 0);
        int i = c48035rP5.f107008p[1];
        int i2 = i << 6;
        c48035rP5.f106968B = i2;
        int i3 = c48035rP5.f106967A[i2] & UByte.MAX_VALUE;
        c48035rP5.f107014v = i3;
        c48035rP5.f107015w = c48035rP5.f107003k.f31973c[i3];
        byte b = c48035rP5.f107018z[i];
        int[] iArr = JA0.f16931b;
        c48035rP5.f106970D = iArr[b];
        c48035rP5.f106971E = iArr[b + 1];
    }

    /* renamed from: g */
    public static void m25516g(C3535IT c3535it, C48035rP5 c48035rP5) {
        boolean z;
        boolean z2 = true;
        if (C3535IT.m102392i(c3535it, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        c48035rP5.f107000h = z;
        c48035rP5.f106999g = 0;
        c48035rP5.f107001i = false;
        c48035rP5.f107002j = false;
        if (z && C3535IT.m102392i(c3535it, 1) != 0) {
            return;
        }
        int m102392i = C3535IT.m102392i(c3535it, 2) + 4;
        if (m102392i == 7) {
            c48035rP5.f107002j = true;
            if (C3535IT.m102392i(c3535it, 1) == 0) {
                int m102392i2 = C3535IT.m102392i(c3535it, 2);
                if (m102392i2 == 0) {
                    return;
                }
                for (int i = 0; i < m102392i2; i++) {
                    int m102392i3 = C3535IT.m102392i(c3535it, 8);
                    if (m102392i3 == 0 && i + 1 == m102392i2 && m102392i2 > 1) {
                        throw new P20("Exuberant nibble");
                    }
                    c48035rP5.f106999g = (m102392i3 << (i * 8)) | c48035rP5.f106999g;
                }
            } else {
                throw new P20("Corrupted reserved bit");
            }
        } else {
            for (int i2 = 0; i2 < m102392i; i2++) {
                int m102392i4 = C3535IT.m102392i(c3535it, 4);
                if (m102392i4 == 0 && i2 + 1 == m102392i && m102392i > 4) {
                    throw new P20("Exuberant nibble");
                }
                c48035rP5.f106999g = (m102392i4 << (i2 * 4)) | c48035rP5.f106999g;
            }
        }
        c48035rP5.f106999g++;
        if (!c48035rP5.f107000h) {
            if (C3535IT.m102392i(c3535it, 1) != 1) {
                z2 = false;
            }
            c48035rP5.f107001i = z2;
        }
    }

    /* renamed from: h */
    public static int m25515h(C3535IT c3535it) {
        if (C3535IT.m102392i(c3535it, 1) != 0) {
            int m102392i = C3535IT.m102392i(c3535it, 3);
            if (m102392i == 0) {
                return 1;
            }
            return C3535IT.m102392i(c3535it, m102392i) + (1 << m102392i);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
        throw new p000.P20("Invalid backward reference");
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b A[LOOP:2: B:48:0x013b->B:54:0x0171, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m25514i(C48035rP5 c48035rP5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = c48035rP5.f106993a;
        if (i7 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (i7 != 11) {
            C3535IT c3535it = c48035rP5.f106995c;
            int i8 = c48035rP5.f106983Q - 1;
            byte[] bArr = c48035rP5.f106996d;
            while (true) {
                int i9 = c48035rP5.f106993a;
                if (i9 == 10) {
                    if (i9 == 10) {
                        if (c48035rP5.f106999g >= 0) {
                            C3535IT.m102394g(c3535it);
                            C3535IT.m102400a(c48035rP5.f106995c, true);
                            return;
                        }
                        throw new P20("Invalid metablock length");
                    }
                    return;
                } else if (i9 != 12) {
                    int i10 = 0;
                    switch (i9) {
                        case 1:
                            if (c48035rP5.f106999g >= 0) {
                                m25506q(c48035rP5);
                                i8 = c48035rP5.f106983Q - 1;
                                bArr = c48035rP5.f106996d;
                                break;
                            } else {
                                throw new P20("Invalid metablock length");
                            }
                        case 2:
                            m25507p(c48035rP5);
                            c48035rP5.f106993a = 3;
                            if (c48035rP5.f106999g > 0) {
                                c48035rP5.f106993a = 1;
                                break;
                            } else {
                                C3535IT.m102391j(c3535it);
                                if (c48035rP5.f107006n[1] == 0) {
                                    m25520c(c48035rP5);
                                }
                                int[] iArr = c48035rP5.f107006n;
                                iArr[1] = iArr[1] - 1;
                                C3535IT.m102397d(c3535it);
                                int m25505r = m25505r(c48035rP5.f107004l.f31972b, c48035rP5.f106972F, c3535it);
                                int i11 = m25505r >>> 6;
                                c48035rP5.f106973G = 0;
                                if (i11 >= 2) {
                                    i11 -= 2;
                                    c48035rP5.f106973G = -1;
                                }
                                int i12 = VZ3.f39246g[i11] + ((m25505r >>> 3) & 7);
                                int i13 = VZ3.f39247h[i11] + (m25505r & 7);
                                c48035rP5.f107017y = VZ3.f39242c[i12] + C3535IT.m102392i(c3535it, VZ3.f39243d[i12]);
                                c48035rP5.f106979M = VZ3.f39244e[i13] + C3535IT.m102392i(c3535it, VZ3.f39245f[i13]);
                                c48035rP5.f107016x = 0;
                                c48035rP5.f106993a = 6;
                                if (c48035rP5.f107013u) {
                                    int i14 = c48035rP5.f107010r;
                                    int i15 = bArr[(i14 - 1) & i8] & UByte.MAX_VALUE;
                                    int i16 = bArr[(i14 - 2) & i8] & UByte.MAX_VALUE;
                                    while (true) {
                                        if (c48035rP5.f107016x < c48035rP5.f107017y) {
                                            C3535IT.m102391j(c3535it);
                                            if (c48035rP5.f107006n[0] == 0) {
                                                m25517f(c48035rP5);
                                            }
                                            byte[] bArr2 = c48035rP5.f106967A;
                                            int i17 = c48035rP5.f106968B;
                                            int[] iArr2 = JA0.f16930a;
                                            int i18 = bArr2[i17 + (iArr2[c48035rP5.f106971E + i16] | iArr2[c48035rP5.f106970D + i15])] & UByte.MAX_VALUE;
                                            int[] iArr3 = c48035rP5.f107006n;
                                            iArr3[0] = iArr3[0] - 1;
                                            C3535IT.m102397d(c3535it);
                                            RN1 rn1 = c48035rP5.f107003k;
                                            int m25505r2 = m25505r(rn1.f31972b, rn1.f31973c[i18], c3535it);
                                            int i19 = c48035rP5.f107010r;
                                            bArr[i19] = (byte) m25505r2;
                                            c48035rP5.f107016x++;
                                            c48035rP5.f107010r = i19 + 1;
                                            if (i19 == i8) {
                                                c48035rP5.f106994b = 6;
                                                c48035rP5.f106991Y = c48035rP5.f106983Q;
                                                c48035rP5.f106990X = 0;
                                                c48035rP5.f106993a = 12;
                                            } else {
                                                int i20 = i15;
                                                i15 = m25505r2;
                                                i16 = i20;
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (c48035rP5.f107016x < c48035rP5.f107017y) {
                                            C3535IT.m102391j(c3535it);
                                            if (c48035rP5.f107006n[0] == 0) {
                                                m25517f(c48035rP5);
                                            }
                                            int[] iArr4 = c48035rP5.f107006n;
                                            iArr4[0] = iArr4[0] - 1;
                                            C3535IT.m102397d(c3535it);
                                            bArr[c48035rP5.f107010r] = (byte) m25505r(c48035rP5.f107003k.f31972b, c48035rP5.f107015w, c3535it);
                                            c48035rP5.f107016x++;
                                            int i21 = c48035rP5.f107010r;
                                            c48035rP5.f107010r = i21 + 1;
                                            if (i21 == i8) {
                                                c48035rP5.f106994b = 6;
                                                c48035rP5.f106991Y = c48035rP5.f106983Q;
                                                c48035rP5.f106990X = 0;
                                                c48035rP5.f106993a = 12;
                                            }
                                        }
                                    }
                                }
                                if (c48035rP5.f106993a == 6) {
                                    continue;
                                } else {
                                    int i22 = c48035rP5.f106999g - c48035rP5.f107017y;
                                    c48035rP5.f106999g = i22;
                                    if (i22 <= 0) {
                                        c48035rP5.f106993a = 3;
                                        break;
                                    } else {
                                        if (c48035rP5.f106973G < 0) {
                                            C3535IT.m102391j(c3535it);
                                            if (c48035rP5.f107006n[2] == 0) {
                                                m25518e(c48035rP5);
                                            }
                                            int[] iArr5 = c48035rP5.f107006n;
                                            iArr5[2] = iArr5[2] - 1;
                                            C3535IT.m102397d(c3535it);
                                            RN1 rn12 = c48035rP5.f107005m;
                                            int[] iArr6 = rn12.f31972b;
                                            int[] iArr7 = rn12.f31973c;
                                            byte[] bArr3 = c48035rP5.f106974H;
                                            int i23 = c48035rP5.f106969C;
                                            int i24 = c48035rP5.f106979M;
                                            int m25505r3 = m25505r(iArr6, iArr7[bArr3[i23 + (i24 > 4 ? 3 : i24 - 2)] & UByte.MAX_VALUE], c3535it);
                                            c48035rP5.f106973G = m25505r3;
                                            int i25 = c48035rP5.f106975I;
                                            if (m25505r3 >= i25) {
                                                int i26 = m25505r3 - i25;
                                                int i27 = c48035rP5.f106976J & i26;
                                                int i28 = i26 >>> c48035rP5.f106977K;
                                                c48035rP5.f106973G = i28;
                                                int i29 = (i28 >>> 1) + 1;
                                                c48035rP5.f106973G = i25 + i27 + ((((((i28 & 1) + 2) << i29) - 4) + C3535IT.m102392i(c3535it, i29)) << c48035rP5.f106977K);
                                            }
                                        }
                                        int m25503t = m25503t(c48035rP5.f106973G, c48035rP5.f107009q, c48035rP5.f107012t);
                                        c48035rP5.f106978L = m25503t;
                                        if (m25503t >= 0) {
                                            int i30 = c48035rP5.f107011s;
                                            int i31 = c48035rP5.f106981O;
                                            if (i30 != i31 && (i6 = c48035rP5.f107010r) < i31) {
                                                c48035rP5.f107011s = i6;
                                            } else {
                                                c48035rP5.f107011s = i31;
                                            }
                                            c48035rP5.f106980N = c48035rP5.f107010r;
                                            if (m25503t > c48035rP5.f107011s) {
                                                c48035rP5.f106993a = 9;
                                                break;
                                            } else {
                                                if (c48035rP5.f106973G > 0) {
                                                    int[] iArr8 = c48035rP5.f107009q;
                                                    int i32 = c48035rP5.f107012t;
                                                    iArr8[i32 & 3] = m25503t;
                                                    c48035rP5.f107012t = i32 + 1;
                                                }
                                                if (c48035rP5.f106979M <= c48035rP5.f106999g) {
                                                    c48035rP5.f107016x = 0;
                                                    c48035rP5.f106993a = 7;
                                                    int i33 = c48035rP5.f107010r;
                                                    i = (i33 - c48035rP5.f106978L) & i8;
                                                    i2 = c48035rP5.f106979M - c48035rP5.f107016x;
                                                    if (i + i2 >= i8 && i33 + i2 < i8) {
                                                        while (i10 < i2) {
                                                            bArr[i33] = bArr[i];
                                                            i10++;
                                                            i33++;
                                                            i++;
                                                        }
                                                        c48035rP5.f107016x += i2;
                                                        c48035rP5.f106999g -= i2;
                                                        c48035rP5.f107010r += i2;
                                                    } else {
                                                        do {
                                                            i3 = c48035rP5.f107016x;
                                                            if (i3 >= c48035rP5.f106979M) {
                                                                i4 = c48035rP5.f107010r;
                                                                bArr[i4] = bArr[(i4 - c48035rP5.f106978L) & i8];
                                                                c48035rP5.f106999g--;
                                                                c48035rP5.f107016x = i3 + 1;
                                                                c48035rP5.f107010r = i4 + 1;
                                                            }
                                                        } while (i4 != i8);
                                                        i5 = 7;
                                                        c48035rP5.f106994b = 7;
                                                        c48035rP5.f106991Y = c48035rP5.f106983Q;
                                                        c48035rP5.f106990X = 0;
                                                        c48035rP5.f106993a = 12;
                                                        if (c48035rP5.f106993a != i5) {
                                                            break;
                                                        } else {
                                                            c48035rP5.f106993a = 3;
                                                            break;
                                                        }
                                                    }
                                                    i5 = 7;
                                                    if (c48035rP5.f106993a != i5) {
                                                    }
                                                } else {
                                                    throw new P20("Invalid backward reference");
                                                }
                                            }
                                        } else {
                                            throw new P20("Negative distance");
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (c48035rP5.f106999g > 0) {
                            }
                            break;
                        case 4:
                            while (c48035rP5.f106999g > 0) {
                                C3535IT.m102391j(c3535it);
                                C3535IT.m102392i(c3535it, 8);
                                c48035rP5.f106999g--;
                            }
                            c48035rP5.f106993a = 1;
                            break;
                        case 5:
                            m25522a(c48035rP5);
                            break;
                        case 6:
                            if (c48035rP5.f107013u) {
                            }
                            if (c48035rP5.f106993a == 6) {
                            }
                            break;
                        case 7:
                            int i332 = c48035rP5.f107010r;
                            i = (i332 - c48035rP5.f106978L) & i8;
                            i2 = c48035rP5.f106979M - c48035rP5.f107016x;
                            if (i + i2 >= i8) {
                                break;
                            }
                            do {
                                i3 = c48035rP5.f107016x;
                                if (i3 >= c48035rP5.f106979M) {
                                }
                            } while (i4 != i8);
                            i5 = 7;
                            c48035rP5.f106994b = 7;
                            c48035rP5.f106991Y = c48035rP5.f106983Q;
                            c48035rP5.f106990X = 0;
                            c48035rP5.f106993a = 12;
                            if (c48035rP5.f106993a != i5) {
                            }
                            break;
                        case 8:
                            int i34 = c48035rP5.f106983Q;
                            System.arraycopy(bArr, i34, bArr, 0, c48035rP5.f106980N - i34);
                            c48035rP5.f106993a = 3;
                            break;
                        case 9:
                            int i35 = c48035rP5.f106979M;
                            if (i35 >= 4 && i35 <= 24) {
                                int i36 = K31.f18986a[i35];
                                int i37 = (c48035rP5.f106978L - c48035rP5.f107011s) - 1;
                                int i38 = K31.f18987b[i35];
                                int i39 = ((1 << i38) - 1) & i37;
                                int i40 = i37 >>> i38;
                                int i41 = i36 + (i39 * i35);
                                C44333l96[] c44333l96Arr = C44333l96.f95651d;
                                if (i40 < c44333l96Arr.length) {
                                    int m27727b = C44333l96.m27727b(bArr, c48035rP5.f106980N, K31.m99307a(), i41, c48035rP5.f106979M, c44333l96Arr[i40]);
                                    int i42 = c48035rP5.f106980N + m27727b;
                                    c48035rP5.f106980N = i42;
                                    c48035rP5.f107010r += m27727b;
                                    c48035rP5.f106999g -= m27727b;
                                    int i43 = c48035rP5.f106983Q;
                                    if (i42 >= i43) {
                                        c48035rP5.f106994b = 8;
                                        c48035rP5.f106991Y = i43;
                                        c48035rP5.f106990X = 0;
                                        c48035rP5.f106993a = 12;
                                        break;
                                    } else {
                                        c48035rP5.f106993a = 3;
                                        break;
                                    }
                                } else {
                                    throw new P20("Invalid backward reference");
                                }
                            }
                            break;
                        default:
                            throw new P20("Unexpected state " + c48035rP5.f106993a);
                    }
                } else if (!m25502u(c48035rP5)) {
                    return;
                } else {
                    int i44 = c48035rP5.f107010r;
                    int i45 = c48035rP5.f106981O;
                    if (i44 >= i45) {
                        c48035rP5.f107011s = i45;
                    }
                    c48035rP5.f107010r = i44 & i8;
                    c48035rP5.f106993a = c48035rP5.f106994b;
                }
            }
        } else {
            throw new IllegalStateException("Can't decompress after close");
        }
    }

    /* renamed from: j */
    public static void m25513j(byte[] bArr, int i) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & UByte.MAX_VALUE;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                m25511l(iArr, i4);
            }
        }
    }

    /* renamed from: k */
    public static void m25512k(C48035rP5 c48035rP5) {
        int i;
        int i2 = c48035rP5.f106982P;
        long j = c48035rP5.f106984R;
        if (i2 > j) {
            while (true) {
                int i3 = i2 >> 1;
                if (i3 <= ((int) j) + c48035rP5.f106985S.length) {
                    break;
                }
                i2 = i3;
            }
            if (!c48035rP5.f107000h && i2 < 16384 && c48035rP5.f106982P >= 16384) {
                i2 = 16384;
            }
        }
        int i4 = c48035rP5.f106983Q;
        if (i2 <= i4) {
            return;
        }
        byte[] bArr = new byte[i2 + 37];
        byte[] bArr2 = c48035rP5.f106996d;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i4);
        } else {
            byte[] bArr3 = c48035rP5.f106985S;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i5 = c48035rP5.f106981O;
                if (length > i5) {
                    i = length - i5;
                } else {
                    i5 = length;
                    i = 0;
                }
                System.arraycopy(bArr3, i, bArr, 0, i5);
                c48035rP5.f107010r = i5;
                c48035rP5.f106986T = i5;
            }
        }
        c48035rP5.f106996d = bArr;
        c48035rP5.f106983Q = i2;
    }

    /* renamed from: l */
    public static void m25511l(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    /* renamed from: m */
    public static int m25510m(int[] iArr, int i, C3535IT c3535it) {
        C3535IT.m102397d(c3535it);
        int m25505r = m25505r(iArr, i, c3535it);
        return VZ3.f39240a[m25505r] + C3535IT.m102392i(c3535it, VZ3.f39241b[m25505r]);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m25509n(int i, int[] iArr, int i2, C3535IT c3535it) {
        int i3;
        boolean z;
        int i4;
        int i5;
        C3535IT.m102391j(c3535it);
        int[] iArr2 = new int[i];
        int m102392i = C3535IT.m102392i(c3535it, 2);
        boolean z2 = false;
        boolean z3 = true;
        if (m102392i == 1) {
            int i6 = i - 1;
            int[] iArr3 = new int[4];
            int m102392i2 = C3535IT.m102392i(c3535it, 2) + 1;
            int i7 = 0;
            while (i6 != 0) {
                i6 >>= 1;
                i7++;
            }
            for (int i8 = 0; i8 < m102392i2; i8++) {
                int m102392i3 = C3535IT.m102392i(c3535it, i7) % i;
                iArr3[i8] = m102392i3;
                iArr2[m102392i3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (m102392i2 != 1) {
                if (m102392i2 != 2) {
                    if (m102392i2 != 3) {
                        int i9 = iArr3[0];
                        int i10 = iArr3[1];
                        if (i9 != i10 && i9 != (i4 = iArr3[2]) && i9 != (i5 = iArr3[3]) && i10 != i4 && i10 != i5 && i4 != i5) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (C3535IT.m102392i(c3535it, 1) == 1) {
                            iArr2[iArr3[2]] = 3;
                            iArr2[iArr3[3]] = 3;
                        } else {
                            iArr2[iArr3[0]] = 2;
                        }
                        z3 = z;
                    } else {
                        int i11 = iArr3[0];
                        int i12 = iArr3[1];
                        if (i11 != i12 && i11 != (i3 = iArr3[2]) && i12 != i3) {
                            z2 = true;
                        }
                    }
                } else {
                    int i13 = iArr3[0];
                    int i14 = iArr3[1];
                    if (i13 != i14) {
                        z2 = true;
                    }
                    iArr2[i14] = 1;
                }
            }
            if (!z3) {
                QN1.m88543a(iArr, i2, 8, iArr2, i);
                return;
            }
            throw new P20("Can't readHuffmanCode");
        }
        int[] iArr4 = new int[18];
        int i15 = 0;
        int i16 = 32;
        while (m102392i < 18 && i16 > 0) {
            int i17 = f98110a[m102392i];
            C3535IT.m102397d(c3535it);
            long j = c3535it.f15504f;
            int i18 = c3535it.f15505g;
            int i19 = f98113d[((int) (j >>> i18)) & 15];
            c3535it.f15505g = i18 + (i19 >> 16);
            int i20 = i19 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            iArr4[i17] = i20;
            if (i20 != 0) {
                i16 -= 32 >> i20;
                i15++;
            }
            m102392i++;
        }
        z2 = (i15 == 1 || i16 == 0) ? true : true;
        m25508o(iArr4, i, iArr2, c3535it);
        z3 = z2;
        if (!z3) {
        }
    }

    /* renamed from: o */
    public static void m25508o(int[] iArr, int i, int[] iArr2, C3535IT c3535it) {
        int i2;
        int i3;
        int[] iArr3 = new int[32];
        QN1.m88543a(iArr3, 0, 5, iArr, 18);
        int i4 = 8;
        int i5 = 32768;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i && i5 > 0) {
            C3535IT.m102391j(c3535it);
            C3535IT.m102397d(c3535it);
            long j = c3535it.f15504f;
            int i9 = c3535it.f15505g;
            int i10 = iArr3[((int) (j >>> i9)) & 31];
            c3535it.f15505g = i9 + (i10 >> 16);
            int i11 = i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i11 < 16) {
                int i12 = i6 + 1;
                iArr2[i6] = i11;
                if (i11 != 0) {
                    i5 -= DateUtils.FORMAT_ABBREV_WEEKDAY >> i11;
                    i6 = i12;
                    i4 = i11;
                } else {
                    i6 = i12;
                }
                i8 = 0;
            } else {
                int i13 = i11 - 14;
                if (i11 == 16) {
                    i2 = i4;
                } else {
                    i2 = 0;
                }
                if (i7 != i2) {
                    i8 = 0;
                    i7 = i2;
                }
                if (i8 > 0) {
                    i3 = (i8 - 2) << i13;
                } else {
                    i3 = i8;
                }
                int m102392i = i3 + C3535IT.m102392i(c3535it, i13) + 3;
                int i14 = m102392i - i8;
                if (i6 + i14 <= i) {
                    int i15 = 0;
                    while (i15 < i14) {
                        iArr2[i6] = i7;
                        i15++;
                        i6++;
                    }
                    if (i7 != 0) {
                        i5 -= i14 << (15 - i7);
                    }
                    i8 = m102392i;
                } else {
                    throw new P20("symbol + repeatDelta > numSymbols");
                }
            }
        }
        if (i5 == 0) {
            C33797Ji6.m99920b(iArr2, i6, i - i6);
            return;
        }
        throw new P20("Unused space");
    }

    /* renamed from: p */
    public static void m25507p(C48035rP5 c48035rP5) {
        int i;
        int[] iArr;
        C3535IT c3535it = c48035rP5.f106995c;
        for (int i2 = 0; i2 < 3; i2++) {
            c48035rP5.f107007o[i2] = m25515h(c3535it) + 1;
            c48035rP5.f107006n[i2] = 268435456;
            int i3 = c48035rP5.f107007o[i2];
            if (i3 > 1) {
                int i4 = i2 * 1080;
                m25509n(i3 + 2, c48035rP5.f106997e, i4, c3535it);
                m25509n(26, c48035rP5.f106998f, i4, c3535it);
                c48035rP5.f107006n[i2] = m25510m(c48035rP5.f106998f, i4, c3535it);
            }
        }
        C3535IT.m102391j(c3535it);
        c48035rP5.f106977K = C3535IT.m102392i(c3535it, 2);
        int m102392i = C3535IT.m102392i(c3535it, 4);
        int i5 = c48035rP5.f106977K;
        int i6 = (m102392i << i5) + 16;
        c48035rP5.f106975I = i6;
        c48035rP5.f106976J = (1 << i5) - 1;
        int i7 = i6 + (48 << i5);
        c48035rP5.f107018z = new byte[c48035rP5.f107007o[0]];
        int i8 = 0;
        while (true) {
            i = c48035rP5.f107007o[0];
            if (i8 >= i) {
                break;
            }
            int min = Math.min(i8 + 96, i);
            while (i8 < min) {
                c48035rP5.f107018z[i8] = (byte) (C3535IT.m102392i(c3535it, 2) << 1);
                i8++;
            }
            C3535IT.m102391j(c3535it);
        }
        byte[] bArr = new byte[i << 6];
        c48035rP5.f106967A = bArr;
        int m25519d = m25519d(i << 6, bArr, c3535it);
        c48035rP5.f107013u = true;
        int i9 = 0;
        while (true) {
            iArr = c48035rP5.f107007o;
            if (i9 >= (iArr[0] << 6)) {
                break;
            } else if (c48035rP5.f106967A[i9] != (i9 >> 6)) {
                c48035rP5.f107013u = false;
                break;
            } else {
                i9++;
            }
        }
        int i10 = iArr[2];
        byte[] bArr2 = new byte[i10 << 2];
        c48035rP5.f106974H = bArr2;
        int m25519d2 = m25519d(i10 << 2, bArr2, c3535it);
        RN1.m86805b(c48035rP5.f107003k, 256, m25519d);
        RN1.m86805b(c48035rP5.f107004l, 704, c48035rP5.f107007o[1]);
        RN1.m86805b(c48035rP5.f107005m, i7, m25519d2);
        RN1.m86806a(c48035rP5.f107003k, c3535it);
        RN1.m86806a(c48035rP5.f107004l, c3535it);
        RN1.m86806a(c48035rP5.f107005m, c3535it);
        c48035rP5.f106968B = 0;
        c48035rP5.f106969C = 0;
        int[] iArr2 = JA0.f16931b;
        byte b = c48035rP5.f107018z[0];
        c48035rP5.f106970D = iArr2[b];
        c48035rP5.f106971E = iArr2[b + 1];
        c48035rP5.f107014v = 0;
        c48035rP5.f107015w = c48035rP5.f107003k.f31973c[0];
        c48035rP5.f106972F = c48035rP5.f107004l.f31973c[0];
        int[] iArr3 = c48035rP5.f107008p;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    /* renamed from: q */
    public static void m25506q(C48035rP5 c48035rP5) {
        int i;
        C3535IT c3535it = c48035rP5.f106995c;
        if (c48035rP5.f107000h) {
            c48035rP5.f106994b = 10;
            c48035rP5.f106991Y = c48035rP5.f107010r;
            c48035rP5.f106990X = 0;
            c48035rP5.f106993a = 12;
            return;
        }
        RN1 rn1 = c48035rP5.f107003k;
        rn1.f31972b = null;
        rn1.f31973c = null;
        RN1 rn12 = c48035rP5.f107004l;
        rn12.f31972b = null;
        rn12.f31973c = null;
        RN1 rn13 = c48035rP5.f107005m;
        rn13.f31972b = null;
        rn13.f31973c = null;
        C3535IT.m102391j(c3535it);
        m25516g(c3535it, c48035rP5);
        if (c48035rP5.f106999g == 0 && !c48035rP5.f107002j) {
            return;
        }
        if (!c48035rP5.f107001i && !c48035rP5.f107002j) {
            c48035rP5.f106993a = 2;
        } else {
            C3535IT.m102394g(c3535it);
            if (c48035rP5.f107002j) {
                i = 4;
            } else {
                i = 5;
            }
            c48035rP5.f106993a = i;
        }
        if (c48035rP5.f107002j) {
            return;
        }
        c48035rP5.f106984R += c48035rP5.f106999g;
        if (c48035rP5.f106983Q < c48035rP5.f106982P) {
            m25512k(c48035rP5);
        }
    }

    /* renamed from: r */
    public static int m25505r(int[] iArr, int i, C3535IT c3535it) {
        long j = c3535it.f15504f;
        int i2 = c3535it.f15505g;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i6 <= 8) {
            c3535it.f15505g = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        c3535it.f15505g = i2 + (i8 >> 16) + 8;
        return i8 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    /* renamed from: s */
    public static void m25504s(C48035rP5 c48035rP5, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        c48035rP5.f106985S = bArr;
    }

    /* renamed from: t */
    public static int m25503t(int i, int[] iArr, int i2) {
        if (i < 16) {
            return iArr[(i2 + f98111b[i]) & 3] + f98112c[i];
        }
        return (i - 16) + 1;
    }

    /* renamed from: u */
    public static boolean m25502u(C48035rP5 c48035rP5) {
        int i = c48035rP5.f106986T;
        if (i != 0) {
            c48035rP5.f106990X += i;
            c48035rP5.f106986T = 0;
        }
        int min = Math.min(c48035rP5.f106988V - c48035rP5.f106989W, c48035rP5.f106991Y - c48035rP5.f106990X);
        if (min != 0) {
            System.arraycopy(c48035rP5.f106996d, c48035rP5.f106990X, c48035rP5.f106992Z, c48035rP5.f106987U + c48035rP5.f106989W, min);
            c48035rP5.f106989W += min;
            c48035rP5.f106990X += min;
        }
        if (c48035rP5.f106989W >= c48035rP5.f106988V) {
            return false;
        }
        return true;
    }
}
