package p000;
/* renamed from: Ls9 */
/* loaded from: classes6.dex */
public final class Ls9 extends Js9 {
    @Override // p000.Js9
    /* renamed from: a */
    public final int mo96245a(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i3) {
            return 0;
        }
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b < 0) {
                if (b < -32) {
                    if (i5 < i3) {
                        if (b >= -62) {
                            i4 = i5 + 1;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b;
                }
                if (b < -16) {
                    if (i5 >= i3 - 1) {
                        return Ps9.m89660a(bArr, i5, i3);
                    }
                    int i6 = i5 + 1;
                    byte b2 = bArr[i5];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i4 = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                } else if (i5 >= i3 - 2) {
                    return Ps9.m89660a(bArr, i5, i3);
                } else {
                    int i7 = i5 + 1;
                    byte b3 = bArr[i5];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i8 = i7 + 1;
                        if (bArr[i7] <= -65) {
                            i5 = i8 + 1;
                            if (bArr[i8] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i4 = i5;
        }
        return 0;
    }
}
