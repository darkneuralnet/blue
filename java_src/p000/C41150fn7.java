package p000;
/* renamed from: fn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41150fn7 {
    /* renamed from: a */
    public static void m40817a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String obj3 = obj.toString();
            throw new NullPointerException("null value in entry: " + obj3 + "=null");
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
