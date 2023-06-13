package p000;
/* renamed from: MB0 */
/* loaded from: classes8.dex */
public class MB0 {
    /* renamed from: a */
    public static C52053yB0 m95610a(int i) {
        return m95609b(i, 0);
    }

    /* renamed from: b */
    public static C52053yB0 m95609b(int i, int i2) {
        if (i == 2) {
            return new IB0();
        }
        if (i == 3 && i2 == 0) {
            return new C52053yB0();
        }
        if (i == 3 && i2 == 1) {
            return new JB0();
        }
        if (i == 4 && i2 == 1) {
            return new KB0();
        }
        return new C52053yB0();
    }

    /* renamed from: c */
    public static int m95608c(C52053yB0 c52053yB0) {
        if (c52053yB0 instanceof IB0) {
            return 2;
        }
        if (c52053yB0 instanceof JB0) {
            return 3;
        }
        if (c52053yB0 instanceof KB0) {
            return 4;
        }
        boolean z = c52053yB0 instanceof C52053yB0;
        return 3;
    }

    /* renamed from: d */
    public static int m95607d(C52053yB0 c52053yB0) {
        if (c52053yB0 instanceof IB0) {
            return 0;
        }
        if ((c52053yB0 instanceof JB0) || (c52053yB0 instanceof KB0)) {
            return 1;
        }
        boolean z = c52053yB0 instanceof C52053yB0;
        return 0;
    }
}
