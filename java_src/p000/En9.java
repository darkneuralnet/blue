package p000;
/* renamed from: En9 */
/* loaded from: classes5.dex */
public final class En9 {

    /* renamed from: a */
    public static En9 f8136a;

    private En9() {
    }

    /* renamed from: a */
    public static synchronized En9 m108355a() {
        En9 en9;
        synchronized (En9.class) {
            if (f8136a == null) {
                f8136a = new En9();
            }
            en9 = f8136a;
        }
        return en9;
    }
}
