package p000;
/* renamed from: J73 */
/* loaded from: classes6.dex */
public enum J73 {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: b */
    public final int f16870b;

    J73(int i) {
        this.f16870b = i;
    }

    /* renamed from: a */
    public static boolean m101118a(int i) {
        return (i & OFFLINE.f16870b) != 0;
    }

    /* renamed from: b */
    public static boolean m101117b(int i) {
        return (i & NO_CACHE.f16870b) == 0;
    }

    /* renamed from: c */
    public static boolean m101116c(int i) {
        return (i & NO_STORE.f16870b) == 0;
    }
}
