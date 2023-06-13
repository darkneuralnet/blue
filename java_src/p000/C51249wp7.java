package p000;
/* renamed from: wp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51249wp7 {
    /* renamed from: a */
    public static int m6276a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: b */
    public static int m6275b(Object obj) {
        return m6276a(obj == null ? 0 : obj.hashCode());
    }
}
