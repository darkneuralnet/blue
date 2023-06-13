package p000;
/* renamed from: p39  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46648p39 {

    /* renamed from: a */
    public static T29 f103083a;

    /* renamed from: a */
    public static synchronized C48999t19 m20004a(AbstractC51360x09 abstractC51360x09) {
        C48999t19 c48999t19;
        synchronized (C46648p39.class) {
            if (f103083a == null) {
                f103083a = new T29(null);
            }
            c48999t19 = (C48999t19) f103083a.m98291b(abstractC51360x09);
        }
        return c48999t19;
    }

    /* renamed from: b */
    public static synchronized C48999t19 m20003b(String str) {
        C48999t19 m20004a;
        synchronized (C46648p39.class) {
            m20004a = m20004a(AbstractC51360x09.m5984d("vision-common").mo21993c());
        }
        return m20004a;
    }
}
