package p000;
/* renamed from: Ji6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C33797Ji6 {

    /* renamed from: a */
    public static final byte[] f18065a = new byte[1024];

    /* renamed from: b */
    public static final int[] f18066b = new int[1024];

    /* renamed from: a */
    public static void m99921a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(f18065a, 0, bArr, i + i3, min);
            i3 += min;
        }
    }

    /* renamed from: b */
    public static void m99920b(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(f18066b, 0, iArr, i + i3, min);
            i3 += min;
        }
    }
}
