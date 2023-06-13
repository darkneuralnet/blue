package p000;
/* renamed from: gp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41763gp7 {

    /* renamed from: a */
    public static C41170fp7 f84334a;

    /* renamed from: a */
    public static synchronized C31746Ao7 m37437a(AbstractC50054uo7 abstractC50054uo7) {
        C31746Ao7 c31746Ao7;
        synchronized (C41763gp7.class) {
            if (f84334a == null) {
                f84334a = new C41170fp7(null);
            }
            c31746Ao7 = (C31746Ao7) f84334a.m98291b(abstractC50054uo7);
        }
        return c31746Ao7;
    }

    /* renamed from: b */
    public static synchronized C31746Ao7 m37436b(String str) {
        C31746Ao7 m37437a;
        synchronized (C41763gp7.class) {
            m37437a = m37437a(AbstractC50054uo7.m9708d(str).mo11746c());
        }
        return m37437a;
    }
}
