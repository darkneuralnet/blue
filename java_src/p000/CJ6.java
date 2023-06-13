package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\b\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002\" \u0010\u0015\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LM70;", "Li30;", "buffer", "", "offset", "byteCount", "", DateTokenConverter.CONVERTER_KEY, "", "c", "e", "", "s", "codePointCount", "", C17296a.f69688o, "[C", "f", "()[C", "getHEX_DIGIT_CHARS$annotations", "()V", "HEX_DIGIT_CHARS", "okio"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: CJ6 */
/* loaded from: classes8.dex */
public final class CJ6 {

    /* renamed from: a */
    public static final char[] f3924a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:553:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0081 A[EDGE_INSN: B:556:0x0081->B:350:0x0081 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x00da A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m112348c(byte[] bArr, int i) {
        int i2;
        byte b;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        int i5;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i6;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i7;
        boolean z21;
        boolean z22;
        boolean z23;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (i8 < length) {
            byte b2 = bArr[i8];
            if (b2 >= 0) {
                int i11 = i10 + 1;
                if (i10 == i) {
                    return i9;
                }
                if (b2 != 10 && b2 != 13) {
                    if (b2 >= 0 && b2 < 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if (Byte.MAX_VALUE <= b2 && b2 < 160) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            z5 = false;
                            if (z5) {
                                return -1;
                            }
                        }
                    }
                    z5 = true;
                    if (z5) {
                    }
                }
                if (b2 == 65533) {
                    return -1;
                }
                if (b2 < 65536) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                i9 += i2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 < length && (b = bArr[i8]) >= 0) {
                        i8++;
                        i11 = i10 + 1;
                        if (i10 == i) {
                            return i9;
                        }
                        if (b != 10 && b != 13) {
                            if (b >= 0 && b < 32) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                if (Byte.MAX_VALUE <= b && b < 160) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    z2 = false;
                                    if (z2) {
                                        break loop0;
                                    }
                                }
                            }
                            z2 = true;
                            if (z2) {
                            }
                        }
                        if (b == 65533) {
                            break loop0;
                        }
                        if (b < 65536) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        i9 += i3;
                    }
                }
                return -1;
            }
            if ((b2 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length <= i12) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                byte b3 = bArr[i12];
                if ((b3 & 192) == 128) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (!z20) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                int i13 = (b3 ^ ByteCompanionObject.MIN_VALUE) ^ (b2 << 6);
                if (i13 < 128) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                i4 = i10 + 1;
                if (i10 == i) {
                    return i9;
                }
                if (i13 != 10 && i13 != 13) {
                    if (i13 >= 0 && i13 < 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (!z21) {
                        if (127 <= i13 && i13 < 160) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (!z23) {
                            z22 = false;
                            if (z22) {
                                return -1;
                            }
                        }
                    }
                    z22 = true;
                    if (z22) {
                    }
                }
                if (i13 == 65533) {
                    return -1;
                }
                if (i13 < 65536) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                i9 += i7;
                i8 += 2;
            } else if ((b2 >> 4) == -2) {
                int i14 = i8 + 2;
                if (length <= i14) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                byte b4 = bArr[i8 + 1];
                if ((b4 & 192) == 128) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                byte b5 = bArr[i14];
                if ((b5 & 192) == 128) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                int i15 = ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6)) ^ (b2 << 12);
                if (i15 < 2048) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                if (55296 <= i15 && i15 < 57344) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                i4 = i10 + 1;
                if (i10 == i) {
                    return i9;
                }
                if (i15 != 10 && i15 != 13) {
                    if (i15 >= 0 && i15 < 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        if (127 <= i15 && i15 < 160) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z19) {
                            z18 = false;
                            if (z18) {
                                return -1;
                            }
                        }
                    }
                    z18 = true;
                    if (z18) {
                    }
                }
                if (i15 == 65533) {
                    return -1;
                }
                if (i15 < 65536) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                i9 += i6;
                i8 += 3;
            } else if ((b2 >> 3) == -2) {
                int i16 = i8 + 3;
                if (length <= i16) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                byte b6 = bArr[i8 + 1];
                if ((b6 & 192) == 128) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                byte b7 = bArr[i8 + 2];
                if ((b7 & 192) == 128) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                byte b8 = bArr[i16];
                if ((b8 & 192) == 128) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                int i17 = (((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                if (i17 > 1114111) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                }
                if (55296 <= i17 && i17 < 57344) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                } else if (i17 < 65536) {
                    if (i10 != i) {
                        return -1;
                    }
                    return i9;
                } else {
                    i4 = i10 + 1;
                    if (i10 == i) {
                        return i9;
                    }
                    if (i17 != 10 && i17 != 13) {
                        if (i17 >= 0 && i17 < 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            if (127 <= i17 && i17 < 160) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                z12 = false;
                                if (z12) {
                                    return -1;
                                }
                            }
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                    if (i17 == 65533) {
                        return -1;
                    }
                    if (i17 < 65536) {
                        i5 = 1;
                    } else {
                        i5 = 2;
                    }
                    i9 += i5;
                    i8 += 4;
                }
            } else if (i10 != i) {
                return -1;
            } else {
                return i9;
            }
            i10 = i4;
        }
        return i9;
    }

    /* renamed from: d */
    public static final void m112347d(M70 m70, C42488i30 buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(m70, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.mo24527f1(m70.m95807f(), i, i2);
    }

    /* renamed from: e */
    public static final int m112346e(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: f */
    public static final char[] m112345f() {
        return f3924a;
    }
}
