package p000;
/* renamed from: Fw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32988Fw7 extends AbstractC32754Ew7 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // p000.AbstractC32754Ew7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo106227a(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        int m103204k;
        int m103205j;
        int m103205j2;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            } else if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i5 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i5 < i3) {
                        i2 = i5;
                        b3 = b4;
                    } else {
                        m103205j2 = C33456Hw7.m103205j(b2, b4);
                        return m103205j2;
                    }
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    int i6 = i2 + 1;
                    b5 = bArr[i2];
                    if (i6 < i3) {
                        i2 = i6;
                        b = 0;
                    } else {
                        m103205j = C33456Hw7.m103205j(b2, b5);
                        return m103205j;
                    }
                } else {
                    b = i >> 16;
                }
                if (b == 0) {
                    int i7 = i2 + 1;
                    byte b6 = bArr[i2];
                    if (i7 < i3) {
                        i2 = i7;
                        b = b6;
                    } else {
                        m103204k = C33456Hw7.m103204k(b2, b5, b6);
                        return m103204k;
                    }
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            i2 = i4;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i8 = i2 + 1;
            byte b7 = bArr[i2];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i8 < i3) {
                        if (b7 >= -62) {
                            i2 = i8 + 1;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b7;
                } else if (b7 < -16) {
                    if (i8 >= i3 - 1) {
                        return C33456Hw7.m103212c(bArr, i8, i3);
                    }
                    int i9 = i8 + 1;
                    byte b8 = bArr[i8];
                    if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                        i2 = i9 + 1;
                        if (bArr[i9] > -65) {
                        }
                    }
                    return -1;
                } else if (i8 >= i3 - 2) {
                    return C33456Hw7.m103212c(bArr, i8, i3);
                } else {
                    int i10 = i8 + 1;
                    byte b9 = bArr[i8];
                    if (b9 <= -65 && (((b7 << 28) + (b9 + 112)) >> 30) == 0) {
                        int i11 = i10 + 1;
                        if (bArr[i10] <= -65) {
                            i2 = i11 + 1;
                            if (bArr[i11] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i2 = i8;
        }
        return 0;
    }
}
