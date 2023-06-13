package p000;

import java.util.Map;
/* renamed from: HH7 */
/* loaded from: classes5.dex */
public final class HH7 {
    /* renamed from: a */
    public static Object m104060a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m104059b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
