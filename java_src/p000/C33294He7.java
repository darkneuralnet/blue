package p000;
/* renamed from: He7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33294He7 {
    /* renamed from: a */
    public static byte m103579a(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    /* renamed from: b */
    public static Boolean m103578b(byte b) {
        if (b != 0) {
            if (b != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
