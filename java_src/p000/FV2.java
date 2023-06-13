package p000;
/* renamed from: FV2 */
/* loaded from: classes8.dex */
public class FV2 {
    /* renamed from: a */
    public final int m107075a(C52053yB0[] c52053yB0Arr, int i) {
        C52053yB0 c52053yB0 = c52053yB0Arr[i];
        int i2 = i + 1;
        int m4963b = C51699xb4.m4963b(c52053yB0, c52053yB0Arr[i2]);
        while (i2 < c52053yB0Arr.length && C51699xb4.m4963b(c52053yB0Arr[i2 - 1], c52053yB0Arr[i2]) == m4963b) {
            i2++;
        }
        return i2 - 1;
    }

    /* renamed from: b */
    public int[] m107074b(C52053yB0[] c52053yB0Arr) {
        C50810w52 c50810w52 = new C50810w52(c52053yB0Arr.length / 2);
        int i = 0;
        c50810w52.m7455a(0);
        do {
            i = m107075a(c52053yB0Arr, i);
            c50810w52.m7455a(i);
        } while (i < c52053yB0Arr.length - 1);
        return c50810w52.m7453c();
    }
}
