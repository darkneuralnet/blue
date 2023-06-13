package p000;
/* renamed from: SA5 */
/* loaded from: classes8.dex */
public class SA5 implements NW3 {
    /* renamed from: b */
    public static boolean m85865b(C52053yB0 c52053yB0, CX3 cx3) {
        return 2 != m85862e(c52053yB0, cx3);
    }

    /* renamed from: c */
    public static int m85864c(C52053yB0 c52053yB0, WB1 wb1) {
        if (wb1.mo77226r0() || !wb1.m78759Z().m13891E(c52053yB0)) {
            return 2;
        }
        return m85863d(c52053yB0, wb1);
    }

    /* renamed from: d */
    public static int m85863d(C52053yB0 c52053yB0, WB1 wb1) {
        int m85863d;
        if (wb1 instanceof CX3) {
            return m85862e(c52053yB0, (CX3) wb1);
        }
        if (wb1 instanceof XB1) {
            YB1 yb1 = new YB1((XB1) wb1);
            while (yb1.hasNext()) {
                WB1 wb12 = (WB1) yb1.next();
                if (wb12 != wb1 && (m85863d = m85863d(c52053yB0, wb12)) != 2) {
                    return m85863d;
                }
            }
        }
        return 2;
    }

    /* renamed from: e */
    public static int m85862e(C52053yB0 c52053yB0, CX3 cx3) {
        if (cx3.mo77226r0()) {
            return 2;
        }
        int m85861f = m85861f(c52053yB0, cx3.m112157L0());
        if (m85861f != 0) {
            return m85861f;
        }
        for (int i = 0; i < cx3.m112155O0(); i++) {
            int m85861f2 = m85861f(c52053yB0, cx3.m112156M0(i));
            if (m85861f2 == 1) {
                return 1;
            }
            if (m85861f2 == 0) {
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static int m85861f(C52053yB0 c52053yB0, C34108Kr2 c34108Kr2) {
        if (!c34108Kr2.m78759Z().m13891E(c52053yB0)) {
            return 2;
        }
        return LW3.m96716c(c52053yB0, c34108Kr2.mo77238Y());
    }
}
