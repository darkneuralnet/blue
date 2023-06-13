package p000;
/* renamed from: jM5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43264jM5 {

    /* renamed from: a */
    public WB1[] f92604a;

    public C43264jM5(WB1 wb1, WB1 wb12) {
        this.f92604a = r0;
        WB1[] wb1Arr = {wb1, wb12};
    }

    /* renamed from: b */
    public static WB1 m30755b(WB1 wb1, WB1 wb12, int i) {
        return new C43264jM5(wb1, wb12).m30756a(i);
    }

    /* renamed from: a */
    public WB1 m30756a(int i) {
        boolean z;
        WB1 wb1;
        RuntimeException runtimeException = null;
        try {
            WB1[] wb1Arr = this.f92604a;
            wb1 = C50861wA3.m7320v(wb1Arr[0], wb1Arr[1], i);
            z = true;
        } catch (RuntimeException e) {
            z = false;
            wb1 = null;
            runtimeException = e;
        }
        if (!z) {
            try {
                WB1[] wb1Arr2 = this.f92604a;
                return C43857kM5.m29042c(wb1Arr2[0], wb1Arr2[1], i);
            } catch (RuntimeException unused) {
                throw runtimeException;
            }
        }
        return wb1;
    }
}
