package p000;

import java.util.Map;
/* renamed from: LR7 */
/* loaded from: classes5.dex */
public final class LR7 {
    /* renamed from: a */
    public static Object m96936a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m96935b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
