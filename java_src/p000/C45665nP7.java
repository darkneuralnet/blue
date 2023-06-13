package p000;

import java.util.Map;
/* renamed from: nP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45665nP7 {
    /* renamed from: a */
    public static Object m23829a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m23828b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
