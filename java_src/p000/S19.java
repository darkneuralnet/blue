package p000;

import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: S19 */
/* loaded from: classes6.dex */
public final class S19 {

    /* renamed from: a */
    public static final long[][] f33046a = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{LongCompanionObject.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* renamed from: a */
    public static long m86089a(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = true;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        C38912c29.m61997a(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    /* renamed from: b */
    public static long m86088b(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(1000L) + Long.numberOfLeadingZeros(-1001L);
        if (numberOfLeadingZeros > 65) {
            return j * 1000;
        }
        if (numberOfLeadingZeros >= 64) {
            z = true;
        } else {
            z = false;
        }
        C38912c29.m61997a(z, "checkedMultiply", j, 1000L);
        long j3 = j * 1000;
        if (j != 0 && j3 / j != 1000) {
            z2 = false;
        } else {
            z2 = true;
        }
        C38912c29.m61997a(z2, "checkedMultiply", j, 1000L);
        return j3;
    }

    /* renamed from: c */
    public static long m86087c(long j, long j2) {
        boolean z;
        long j3 = j - j2;
        boolean z2 = true;
        if ((j ^ j2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        C38912c29.m61997a(z | z2, "checkedSubtract", j, j2);
        return j3;
    }
}
