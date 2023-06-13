package p000;
/* renamed from: S31 */
/* loaded from: classes8.dex */
public class S31 {
    /* renamed from: a */
    public static C5448N m86058a(String str) {
        if (str.equals("SHA-256")) {
            return InterfaceC42183hY2.f85404c;
        }
        if (str.equals("SHA-512")) {
            return InterfaceC42183hY2.f85408e;
        }
        if (str.equals("SHAKE128")) {
            return InterfaceC42183hY2.f85424m;
        }
        if (str.equals("SHAKE256")) {
            return InterfaceC42183hY2.f85426n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
