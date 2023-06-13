package com.fasterxml.jackson.core.sym;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class NameN extends Name {

    /* renamed from: q */
    private final int[] f69957q;

    /* renamed from: q1 */
    private final int f69958q1;

    /* renamed from: q2 */
    private final int f69959q2;

    /* renamed from: q3 */
    private final int f69960q3;

    /* renamed from: q4 */
    private final int f69961q4;
    private final int qlen;

    public NameN(String str, int i, int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        super(str, i);
        this.f69958q1 = i2;
        this.f69959q2 = i3;
        this.f69960q3 = i4;
        this.f69961q4 = i5;
        this.f69957q = iArr;
        this.qlen = i6;
    }

    private final boolean _equals2(int[] iArr) {
        int i = this.qlen - 4;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2 + 4] != this.f69957q[i2]) {
                return false;
            }
        }
        return true;
    }

    public static NameN construct(String str, int i, int[] iArr, int i2) {
        int[] iArr2;
        if (i2 >= 4) {
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            if (i2 - 4 > 0) {
                iArr2 = Arrays.copyOfRange(iArr, 4, i2);
            } else {
                iArr2 = null;
            }
            return new NameN(str, i, i3, i4, i5, i6, iArr2, i2);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055 A[RETURN] */
    @Override // com.fasterxml.jackson.core.sym.Name
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(int[] iArr, int i) {
        if (i == this.qlen && iArr[0] == this.f69958q1 && iArr[1] == this.f69959q2 && iArr[2] == this.f69960q3 && iArr[3] == this.f69961q4) {
            switch (i) {
                case 4:
                    return true;
                case 5:
                    if (iArr[4] == this.f69957q[0]) {
                        return false;
                    }
                    break;
                case 6:
                    if (iArr[5] != this.f69957q[1]) {
                        return false;
                    }
                    if (iArr[4] == this.f69957q[0]) {
                    }
                    break;
                case 7:
                    if (iArr[6] != this.f69957q[2]) {
                        return false;
                    }
                    if (iArr[5] != this.f69957q[1]) {
                    }
                    if (iArr[4] == this.f69957q[0]) {
                    }
                    break;
                case 8:
                    if (iArr[7] != this.f69957q[3]) {
                        return false;
                    }
                    if (iArr[6] != this.f69957q[2]) {
                    }
                    if (iArr[5] != this.f69957q[1]) {
                    }
                    if (iArr[4] == this.f69957q[0]) {
                    }
                    break;
                default:
                    return _equals2(iArr);
            }
        } else {
            return false;
        }
    }
}
