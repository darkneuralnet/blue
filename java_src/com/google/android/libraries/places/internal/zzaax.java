package com.google.android.libraries.places.internal;

import java.math.RoundingMode;
/* loaded from: classes6.dex */
public final class zzaax {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if ((r6 & (r0 & 1)) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r1 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r5 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r5 < 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r2 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i, int i2, RoundingMode roundingMode) {
        int i3;
        roundingMode.getClass();
        if (i2 != 0) {
            int i4 = i / i2;
            int i5 = i - (i2 * i4);
            if (i5 == 0) {
                return i4;
            }
            boolean z = true;
            int i6 = ((i ^ i2) >> 31) | 1;
            switch (zzaaw.zza[roundingMode.ordinal()]) {
                case 1:
                    zzaay.zza(false);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return i4 + i6;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i5);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            break;
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return i4;
        }
        throw new ArithmeticException("/ by zero");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzb(int i, RoundingMode roundingMode) {
        boolean z;
        if (i > 0) {
            switch (zzaaw.zza[roundingMode.ordinal()]) {
                case 1:
                    if (((i - 1) & i) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzaay.zza(z);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        throw new IllegalArgumentException("x (0) must be > 0");
    }
}
