package p000;

import java.util.LinkedHashMap;
/* renamed from: OH0 */
/* loaded from: classes7.dex */
public final class OH0 {
    private OH0() {
    }

    /* renamed from: a */
    public static int m92579a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m92578b(int i) {
        return new LinkedHashMap<>(m92579a(i));
    }
}
