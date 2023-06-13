package p000;
/* renamed from: eC1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40205eC1 {

    /* renamed from: a */
    public static String f78096a = "ng";

    /* renamed from: b */
    public static boolean f78097b = false;

    /* renamed from: c */
    public static boolean f78098c = false;

    static {
        m43126b(System.getProperty("jts.overlay"));
    }

    /* renamed from: a */
    public static WB1 m43127a(WB1 wb1, WB1 wb12, int i) {
        if (f78098c) {
            return C49676uA3.m10718b(wb1, wb12, i);
        }
        return C43264jM5.m30755b(wb1, wb12, i);
    }

    /* renamed from: b */
    public static void m43126b(String str) {
        if (str == null) {
            return;
        }
        f78098c = f78097b;
        if (f78096a.equalsIgnoreCase(str)) {
            f78098c = true;
        }
    }

    /* renamed from: c */
    public static WB1 m43125c(WB1 wb1, WB1 wb12) {
        if (wb1.mo77226r0() || wb12.mo77226r0()) {
            if (wb1.mo77226r0() && wb12.mo77226r0()) {
                return C50861wA3.m7334h(2, wb1, wb12, wb1.m78758c0());
            }
            if (wb1.mo77226r0()) {
                return wb12.m78752m();
            }
            if (wb12.mo77226r0()) {
                return wb1.m78752m();
            }
        }
        WB1.m78757g(wb1);
        WB1.m78757g(wb12);
        return m43127a(wb1, wb12, 2);
    }
}
