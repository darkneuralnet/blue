package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.p053io.encoding.Base64;
/* renamed from: Ey */
/* loaded from: classes4.dex */
public class C2029Ey {

    /* renamed from: Ey$a */
    /* loaded from: classes4.dex */
    public static class C2030a {

        /* renamed from: c */
        public static final int[] f8346c;

        /* renamed from: d */
        public static final int[] f8347d;

        /* renamed from: e */
        public static final C2030a f8348e;

        /* renamed from: f */
        public static final C2030a f8349f;

        /* renamed from: g */
        public static final C2030a f8350g;

        /* renamed from: a */
        public final boolean f8351a;

        /* renamed from: b */
        public final boolean f8352b;

        static {
            int[] iArr = new int[256];
            f8346c = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < C2031b.f8353e.length; i++) {
                f8346c[C2031b.f8353e[i]] = i;
            }
            f8346c[61] = -2;
            int[] iArr2 = new int[256];
            f8347d = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < C2031b.f8354f.length; i2++) {
                f8347d[C2031b.f8354f[i2]] = i2;
            }
            f8347d[61] = -2;
            f8348e = new C2030a(false, false);
            f8349f = new C2030a(true, false);
            f8350g = new C2030a(false, true);
        }

        public C2030a(boolean z, boolean z2) {
            this.f8351a = z;
            this.f8352b = z2;
        }

        /* renamed from: a */
        public byte[] m108180a(String str) {
            return m108179b(str.getBytes(StandardCharsets.ISO_8859_1));
        }

        /* renamed from: b */
        public byte[] m108179b(byte[] bArr) {
            int m108177d = m108177d(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[m108177d];
            int m108178c = m108178c(bArr, 0, bArr.length, bArr2);
            if (m108178c != m108177d) {
                return Arrays.copyOf(bArr2, m108178c);
            }
            return bArr2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
            if (r11[r8] == 61) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
            if (r4 != 18) goto L25;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m108178c(byte[] bArr, int i, int i2, byte[] bArr2) {
            int[] iArr;
            if (this.f8351a) {
                iArr = f8347d;
            } else {
                iArr = f8346c;
            }
            int i3 = 18;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i >= i2) {
                    break;
                }
                int i6 = i + 1;
                int i7 = iArr[bArr[i] & UByte.MAX_VALUE];
                if (i7 < 0) {
                    if (i7 == -2) {
                        if (i3 == 6) {
                            if (i6 != i2) {
                                i = i6 + 1;
                            }
                            throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                        }
                        i = i6;
                    } else if (!this.f8352b) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bArr[i6 - 1], 16));
                    }
                } else {
                    int i8 = (i7 << i3) | i4;
                    i3 -= 6;
                    if (i3 < 0) {
                        int i9 = i5 + 1;
                        bArr2[i5] = (byte) (i8 >> 16);
                        int i10 = i9 + 1;
                        bArr2[i9] = (byte) (i8 >> 8);
                        i5 = i10 + 1;
                        bArr2[i10] = (byte) i8;
                        i3 = 18;
                        i4 = 0;
                    } else {
                        i4 = i8;
                    }
                }
                i = i6;
            }
            if (i3 == 6) {
                bArr2[i5] = (byte) (i4 >> 16);
                i5++;
            } else if (i3 == 0) {
                int i11 = i5 + 1;
                bArr2[i5] = (byte) (i4 >> 16);
                i5 = i11 + 1;
                bArr2[i11] = (byte) (i4 >> 8);
            } else if (i3 == 12) {
                throw new IllegalArgumentException("Last unit does not have enough valid bits");
            }
            while (i < i2) {
                if (this.f8352b) {
                    int i12 = i + 1;
                    if (iArr[bArr[i]] < 0) {
                        i = i12;
                    } else {
                        i = i12;
                    }
                }
                throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + i);
            }
            return i5;
        }

        /* renamed from: d */
        public final int m108177d(byte[] bArr, int i, int i2) {
            int[] iArr;
            int i3;
            if (this.f8351a) {
                iArr = f8347d;
            } else {
                iArr = f8346c;
            }
            int i4 = i2 - i;
            int i5 = 0;
            if (i4 == 0) {
                return 0;
            }
            if (i4 < 2) {
                if (this.f8352b && iArr[0] == -1) {
                    return 0;
                }
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
            if (this.f8352b) {
                int i6 = 0;
                while (true) {
                    if (i >= i2) {
                        break;
                    }
                    int i7 = i + 1;
                    int i8 = bArr[i] & UByte.MAX_VALUE;
                    if (i8 == 61) {
                        i4 -= (i2 - i7) + 1;
                        break;
                    }
                    if (iArr[i8] == -1) {
                        i6++;
                    }
                    i = i7;
                }
                i4 -= i6;
            } else if (bArr[i2 - 1] == 61) {
                i5 = bArr[i2 - 2] == 61 ? 2 : 1;
            }
            if (i5 == 0 && (i3 = i4 & 3) != 0) {
                i5 = 4 - i3;
            }
            return (((i4 + 3) / 4) * 3) - i5;
        }
    }

    /* renamed from: Ey$b */
    /* loaded from: classes4.dex */
    public static class C2031b {

        /* renamed from: g */
        public static final byte[] f8355g;

        /* renamed from: j */
        public static final C2031b f8358j;

        /* renamed from: a */
        public final byte[] f8359a;

        /* renamed from: b */
        public final int f8360b;

        /* renamed from: c */
        public final boolean f8361c;

        /* renamed from: d */
        public final boolean f8362d;

        /* renamed from: e */
        public static final char[] f8353e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', JsonPointer.SEPARATOR};

        /* renamed from: f */
        public static final char[] f8354f = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', CoreConstants.DASH_CHAR, '_'};

        /* renamed from: h */
        public static final C2031b f8356h = new C2031b(false, null, -1, true);

        /* renamed from: i */
        public static final C2031b f8357i = new C2031b(true, null, -1, true);

        static {
            byte[] bArr = {13, 10};
            f8355g = bArr;
            f8358j = new C2031b(false, bArr, 76, true);
        }

        public C2031b(boolean z, byte[] bArr, int i, boolean z2) {
            this.f8361c = z;
            this.f8359a = bArr;
            this.f8360b = i;
            this.f8362d = z2;
        }

        /* renamed from: c */
        public byte[] m108174c(byte[] bArr) {
            int m108171f = m108171f(bArr.length);
            byte[] bArr2 = new byte[m108171f];
            int m108173d = m108173d(bArr, 0, bArr.length, bArr2);
            if (m108173d != m108171f) {
                return Arrays.copyOf(bArr2, m108173d);
            }
            return bArr2;
        }

        /* renamed from: d */
        public final int m108173d(byte[] bArr, int i, int i2, byte[] bArr2) {
            char[] cArr;
            if (this.f8361c) {
                cArr = f8354f;
            } else {
                cArr = f8353e;
            }
            int i3 = ((i2 - i) / 3) * 3;
            int i4 = i + i3;
            int i5 = this.f8360b;
            if (i5 > 0 && i3 > (i5 / 4) * 3) {
                i3 = (i5 / 4) * 3;
            }
            int i6 = 0;
            while (i < i4) {
                int min = Math.min(i + i3, i4);
                int i7 = i;
                int i8 = i6;
                while (i7 < min) {
                    int i9 = i7 + 1;
                    int i10 = i9 + 1;
                    int i11 = ((bArr[i7] & UByte.MAX_VALUE) << 16) | ((bArr[i9] & UByte.MAX_VALUE) << 8);
                    int i12 = i10 + 1;
                    int i13 = i11 | (bArr[i10] & UByte.MAX_VALUE);
                    int i14 = i8 + 1;
                    bArr2[i8] = (byte) cArr[(i13 >>> 18) & 63];
                    int i15 = i14 + 1;
                    bArr2[i14] = (byte) cArr[(i13 >>> 12) & 63];
                    int i16 = i15 + 1;
                    bArr2[i15] = (byte) cArr[(i13 >>> 6) & 63];
                    i8 = i16 + 1;
                    bArr2[i16] = (byte) cArr[i13 & 63];
                    i7 = i12;
                }
                int i17 = ((min - i) / 3) * 4;
                i6 += i17;
                if (i17 == this.f8360b && min < i2) {
                    byte[] bArr3 = this.f8359a;
                    int length = bArr3.length;
                    int i18 = 0;
                    while (i18 < length) {
                        bArr2[i6] = bArr3[i18];
                        i18++;
                        i6++;
                    }
                }
                i = min;
            }
            if (i < i2) {
                int i19 = i + 1;
                int i20 = bArr[i] & UByte.MAX_VALUE;
                int i21 = i6 + 1;
                bArr2[i6] = (byte) cArr[i20 >> 2];
                if (i19 == i2) {
                    int i22 = i21 + 1;
                    bArr2[i21] = (byte) cArr[(i20 << 4) & 63];
                    if (this.f8362d) {
                        int i23 = i22 + 1;
                        bArr2[i22] = Base64.padSymbol;
                        int i24 = i23 + 1;
                        bArr2[i23] = Base64.padSymbol;
                        return i24;
                    }
                    return i22;
                }
                int i25 = bArr[i19] & UByte.MAX_VALUE;
                int i26 = i21 + 1;
                bArr2[i21] = (byte) cArr[((i20 << 4) & 63) | (i25 >> 4)];
                int i27 = i26 + 1;
                bArr2[i26] = (byte) cArr[(i25 << 2) & 63];
                if (this.f8362d) {
                    int i28 = i27 + 1;
                    bArr2[i27] = Base64.padSymbol;
                    return i28;
                }
                return i27;
            }
            return i6;
        }

        /* renamed from: e */
        public String m108172e(byte[] bArr) {
            byte[] m108174c = m108174c(bArr);
            return new String(m108174c, 0, 0, m108174c.length);
        }

        /* renamed from: f */
        public final int m108171f(int i) {
            int i2;
            int i3;
            if (this.f8362d) {
                i3 = ((i + 2) / 3) * 4;
            } else {
                int i4 = i % 3;
                int i5 = (i / 3) * 4;
                if (i4 == 0) {
                    i2 = 0;
                } else {
                    i2 = i4 + 1;
                }
                i3 = i5 + i2;
            }
            int i6 = this.f8360b;
            if (i6 > 0) {
                return i3 + (((i3 - 1) / i6) * this.f8359a.length);
            }
            return i3;
        }
    }

    private C2029Ey() {
    }

    /* renamed from: a */
    public static C2030a m108182a() {
        return C2030a.f8348e;
    }

    /* renamed from: b */
    public static C2031b m108181b() {
        return C2031b.f8356h;
    }
}
