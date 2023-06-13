package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.UByte;
/* renamed from: Fy */
/* loaded from: classes6.dex */
public final class C2538Fy {

    /* renamed from: a */
    public static final Charset f10606a = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: Fy$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC2539a {

        /* renamed from: a */
        public byte[] f10607a;

        /* renamed from: b */
        public int f10608b;
    }

    /* renamed from: Fy$b */
    /* loaded from: classes6.dex */
    public static class C2540b extends AbstractC2539a {

        /* renamed from: f */
        public static final int[] f10609f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g */
        public static final int[] f10610g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c */
        public int f10611c;

        /* renamed from: d */
        public int f10612d;

        /* renamed from: e */
        public final int[] f10613e;

        public C2540b(int i, byte[] bArr) {
            int[] iArr;
            this.f10607a = bArr;
            if ((i & 8) == 0) {
                iArr = f10609f;
            } else {
                iArr = f10610g;
            }
            this.f10613e = iArr;
            this.f10611c = 0;
            this.f10612d = 0;
        }

        /* renamed from: a */
        public boolean m106143a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.f10611c;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.f10612d;
            byte[] bArr2 = this.f10607a;
            int[] iArr = this.f10613e;
            int i6 = 0;
            int i7 = i5;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4 || (i7 = (iArr[bArr[i9] & UByte.MAX_VALUE] << 18) | (iArr[bArr[i9 + 1] & UByte.MAX_VALUE] << 12) | (iArr[bArr[i9 + 2] & UByte.MAX_VALUE] << 6) | iArr[bArr[i9 + 3] & UByte.MAX_VALUE]) < 0) {
                            break;
                        }
                        bArr2[i6 + 2] = (byte) i7;
                        bArr2[i6 + 1] = (byte) (i7 >> 8);
                        bArr2[i6] = (byte) (i7 >> 16);
                        i6 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & UByte.MAX_VALUE];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5 && i12 != -1) {
                                        this.f10611c = 6;
                                        return false;
                                    }
                                } else if (i12 == -2) {
                                    i8++;
                                } else if (i12 != -1) {
                                    this.f10611c = 6;
                                    return false;
                                }
                            } else if (i12 >= 0) {
                                int i13 = i12 | (i7 << 6);
                                bArr2[i6 + 2] = (byte) i13;
                                bArr2[i6 + 1] = (byte) (i13 >> 8);
                                bArr2[i6] = (byte) (i13 >> 16);
                                i6 += 3;
                                i7 = i13;
                                i8 = 0;
                            } else if (i12 == -2) {
                                bArr2[i6 + 1] = (byte) (i7 >> 2);
                                bArr2[i6] = (byte) (i7 >> 10);
                                i6 += 2;
                                i8 = 5;
                            } else if (i12 != -1) {
                                this.f10611c = 6;
                                return false;
                            }
                        } else {
                            if (i12 < 0) {
                                if (i12 == -2) {
                                    bArr2[i6] = (byte) (i7 >> 4);
                                    i6++;
                                    i8 = 4;
                                } else if (i12 != -1) {
                                    this.f10611c = 6;
                                    return false;
                                }
                            }
                            i12 |= i7 << 6;
                        }
                    } else {
                        if (i12 < 0) {
                            if (i12 != -1) {
                                this.f10611c = 6;
                                return false;
                            }
                        }
                        i12 |= i7 << 6;
                    }
                    i8++;
                    i7 = i12;
                } else {
                    if (i12 < 0) {
                        if (i12 != -1) {
                            this.f10611c = 6;
                            return false;
                        }
                    }
                    i8++;
                    i7 = i12;
                }
                i9 = i11;
            }
            if (!z) {
                this.f10611c = i8;
                this.f10612d = i7;
                this.f10608b = i6;
                return true;
            } else if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            this.f10611c = 6;
                            return false;
                        }
                    } else {
                        int i14 = i6 + 1;
                        bArr2[i6] = (byte) (i7 >> 10);
                        i6 = i14 + 1;
                        bArr2[i14] = (byte) (i7 >> 2);
                    }
                } else {
                    bArr2[i6] = (byte) (i7 >> 4);
                    i6++;
                }
                this.f10611c = i8;
                this.f10608b = i6;
                return true;
            } else {
                this.f10611c = 6;
                return false;
            }
        }
    }

    /* renamed from: Fy$c */
    /* loaded from: classes6.dex */
    public static class C2541c extends AbstractC2539a {

        /* renamed from: j */
        public static final byte[] f10614j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k */
        public static final byte[] f10615k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c */
        public final byte[] f10616c;

        /* renamed from: d */
        public int f10617d;

        /* renamed from: e */
        public int f10618e;

        /* renamed from: f */
        public final boolean f10619f;

        /* renamed from: g */
        public final boolean f10620g;

        /* renamed from: h */
        public final boolean f10621h;

        /* renamed from: i */
        public final byte[] f10622i;

        public C2541c(int i, byte[] bArr) {
            boolean z;
            boolean z2;
            byte[] bArr2;
            int i2;
            this.f10607a = bArr;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f10619f = z;
            if ((i & 2) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f10620g = z2;
            this.f10621h = (i & 4) != 0;
            if ((i & 8) == 0) {
                bArr2 = f10614j;
            } else {
                bArr2 = f10615k;
            }
            this.f10622i = bArr2;
            this.f10616c = new byte[2];
            this.f10617d = 0;
            if (z2) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.f10618e = i2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:22:0x008a). Please submit an issue!!! */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m106142a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C2538Fy.C2541c.m106142a(byte[], int, int, boolean):boolean");
        }
    }

    private C2538Fy() {
    }

    /* renamed from: a */
    public static byte[] m106150a(String str, int i) {
        return m106149b(str.getBytes(f10606a), i);
    }

    /* renamed from: b */
    public static byte[] m106149b(byte[] bArr, int i) {
        return m106148c(bArr, 0, bArr.length, i);
    }

    /* renamed from: c */
    public static byte[] m106148c(byte[] bArr, int i, int i2, int i3) {
        C2540b c2540b = new C2540b(i3, new byte[(i2 * 3) / 4]);
        if (c2540b.m106143a(bArr, i, i2, true)) {
            int i4 = c2540b.f10608b;
            byte[] bArr2 = c2540b.f10607a;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    /* renamed from: d */
    public static String m106147d(byte[] bArr) {
        return m106144g(bArr, 2);
    }

    /* renamed from: e */
    public static byte[] m106146e(byte[] bArr, int i) {
        return m106145f(bArr, 0, bArr.length, i);
    }

    /* renamed from: f */
    public static byte[] m106145f(byte[] bArr, int i, int i2, int i3) {
        C2541c c2541c = new C2541c(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (c2541c.f10619f) {
            if (i2 % 3 > 0) {
                i4 += 4;
            }
        } else {
            int i6 = i2 % 3;
            if (i6 != 1) {
                if (i6 == 2) {
                    i4 += 3;
                }
            } else {
                i4 += 2;
            }
        }
        if (c2541c.f10620g && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!c2541c.f10621h) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        c2541c.f10607a = new byte[i4];
        c2541c.m106142a(bArr, i, i2, true);
        return c2541c.f10607a;
    }

    /* renamed from: g */
    public static String m106144g(byte[] bArr, int i) {
        try {
            return new String(m106146e(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
