package p000;

import kotlin.UByte;
/* renamed from: C52 */
/* loaded from: classes8.dex */
public final class C52 {

    /* renamed from: a */
    public byte[] f3377a;

    /* renamed from: b */
    public int[] f3378b;

    /* renamed from: a */
    public static void m112901a(C52 c52, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = c52.f3378b;
            byte[] bArr = c52.f3377a;
            int i3 = i2 * 4;
            iArr[i2] = ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
        }
    }

    /* renamed from: b */
    public static void m112900b(C52 c52, byte[] bArr, int[] iArr) {
        c52.f3377a = bArr;
        c52.f3378b = iArr;
    }
}
