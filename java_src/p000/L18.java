package p000;

import java.io.Serializable;
/* renamed from: L18 */
/* loaded from: classes5.dex */
public final class L18 {
    /* renamed from: a */
    public static <T> G08<T> m97917a(G08<T> g08) {
        if (!(g08 instanceof C42476i18) && !(g08 instanceof T08)) {
            if (g08 instanceof Serializable) {
                return new T08(g08);
            }
            return new C42476i18(g08);
        }
        return g08;
    }

    /* renamed from: b */
    public static <T> G08<T> m97916b(T t) {
        return new C51369x18(t);
    }
}
