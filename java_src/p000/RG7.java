package p000;
/* renamed from: RG7 */
/* loaded from: classes5.dex */
public final class RG7 {
    /* renamed from: a */
    public static int m86996a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
