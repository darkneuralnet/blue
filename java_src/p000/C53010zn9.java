package p000;
/* renamed from: zn9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53010zn9 {

    /* renamed from: a */
    public static C49453tn9 f122248a;

    /* renamed from: a */
    public static synchronized C45293mm9 m422a(Ok9 ok9) {
        C45293mm9 c45293mm9;
        synchronized (C53010zn9.class) {
            if (f122248a == null) {
                f122248a = new C49453tn9(null);
            }
            c45293mm9 = (C45293mm9) f122248a.m98291b(ok9);
        }
        return c45293mm9;
    }

    /* renamed from: b */
    public static synchronized C45293mm9 m421b(String str) {
        C45293mm9 m422a;
        synchronized (C53010zn9.class) {
            m422a = m422a(Ok9.m91558d(str).mo40911c());
        }
        return m422a;
    }
}
