package p000;
/* renamed from: ni9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45846ni9 {

    /* renamed from: a */
    public static C41102fi9 f100390a;

    /* renamed from: a */
    public static synchronized C41675gg9 m23278a(AbstractC45223mf9 abstractC45223mf9) {
        C41675gg9 c41675gg9;
        synchronized (C45846ni9.class) {
            if (f100390a == null) {
                f100390a = new C41102fi9(null);
            }
            c41675gg9 = (C41675gg9) f100390a.m98291b(abstractC45223mf9);
        }
        return c41675gg9;
    }

    /* renamed from: b */
    public static synchronized C41675gg9 m23277b(String str) {
        C41675gg9 m23278a;
        synchronized (C45846ni9.class) {
            m23278a = m23278a(AbstractC45223mf9.m25200d("common").mo42639c());
        }
        return m23278a;
    }
}
