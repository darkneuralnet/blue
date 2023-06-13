package p000;
/* renamed from: IV8 */
/* loaded from: classes5.dex */
public final class IV8 {
    /* renamed from: a */
    public static Object m101967a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
