package p000;
/* renamed from: eH7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40256eH7 {
    /* renamed from: a */
    public static int m43054a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
