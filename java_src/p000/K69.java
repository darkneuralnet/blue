package p000;
/* renamed from: K69 */
/* loaded from: classes5.dex */
public final class K69 {

    /* renamed from: a */
    public static C69 f19098a;

    /* renamed from: a */
    public static synchronized C51993y49 m99217a(L29 l29) {
        C51993y49 c51993y49;
        synchronized (K69.class) {
            if (f19098a == null) {
                f19098a = new C69(null);
            }
            c51993y49 = (C51993y49) f19098a.m98291b(l29);
        }
        return c51993y49;
    }

    /* renamed from: b */
    public static synchronized C51993y49 m99216b(String str) {
        C51993y49 m99217a;
        synchronized (K69.class) {
            m99217a = m99217a(L29.m97901d(str).mo77537c());
        }
        return m99217a;
    }
}
