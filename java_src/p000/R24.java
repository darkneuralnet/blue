package p000;

import android.util.SparseArray;
import java.util.HashMap;
/* renamed from: R24 */
/* loaded from: classes5.dex */
public final class R24 {

    /* renamed from: a */
    public static SparseArray<N24> f31419a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<N24, Integer> f31420b;

    static {
        HashMap<N24, Integer> hashMap = new HashMap<>();
        f31420b = hashMap;
        hashMap.put(N24.DEFAULT, 0);
        f31420b.put(N24.VERY_LOW, 1);
        f31420b.put(N24.HIGHEST, 2);
        for (N24 n24 : f31420b.keySet()) {
            f31419a.append(f31420b.get(n24).intValue(), n24);
        }
    }

    /* renamed from: a */
    public static int m87395a(N24 n24) {
        Integer num = f31420b.get(n24);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + n24);
    }

    /* renamed from: b */
    public static N24 m87394b(int i) {
        N24 n24 = f31419a.get(i);
        if (n24 != null) {
            return n24;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
