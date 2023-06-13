package p000;
/* renamed from: lo9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44720lo9 {

    /* renamed from: a */
    public static C41755go9 f96766a;

    /* renamed from: a */
    public static synchronized C40559en9 m26788a(AbstractC43514jm9 abstractC43514jm9) {
        C40559en9 c40559en9;
        synchronized (C44720lo9.class) {
            if (f96766a == null) {
                f96766a = new C41755go9(null);
            }
            c40559en9 = (C40559en9) f96766a.m98291b(abstractC43514jm9);
        }
        return c40559en9;
    }

    /* renamed from: b */
    public static synchronized C40559en9 m26787b(String str) {
        C40559en9 m26788a;
        synchronized (C44720lo9.class) {
            m26788a = m26788a(AbstractC43514jm9.m29937d(str).mo43721c());
        }
        return m26788a;
    }
}
