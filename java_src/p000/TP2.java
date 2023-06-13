package p000;
/* renamed from: TP2 */
/* loaded from: classes6.dex */
public enum TP2 {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: b */
    public final int f35426b;

    TP2(int i) {
        this.f35426b = i;
    }

    /* renamed from: a */
    public static boolean m83671a(int i) {
        return (i & NO_CACHE.f35426b) == 0;
    }

    /* renamed from: b */
    public static boolean m83670b(int i) {
        return (i & NO_STORE.f35426b) == 0;
    }
}
