package p000;
/* renamed from: XZ8 */
/* loaded from: classes5.dex */
public final class XZ8 {

    /* renamed from: a */
    public static XZ8 f43418a;

    private XZ8() {
    }

    /* renamed from: a */
    public static synchronized XZ8 m76851a() {
        XZ8 xz8;
        synchronized (XZ8.class) {
            if (f43418a == null) {
                f43418a = new XZ8();
            }
            xz8 = f43418a;
        }
        return xz8;
    }
}
