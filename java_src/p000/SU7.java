package p000;

import java.util.Map;
/* renamed from: SU7 */
/* loaded from: classes5.dex */
public final class SU7 {
    /* renamed from: a */
    public static Object m85345a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m85344b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
