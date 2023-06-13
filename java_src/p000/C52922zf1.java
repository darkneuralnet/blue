package p000;
/* renamed from: zf1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52922zf1 {
    /* renamed from: a */
    public static String m615a(String str) {
        if (m614b(str)) {
            return "https://api-m.paypal.com/v1/";
        }
        if (m612d(str)) {
            return "https://api-m.sandbox.paypal.com/v1/";
        }
        if (m613c(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m614b(String str) {
        return str.equals("live");
    }

    /* renamed from: c */
    public static boolean m613c(String str) {
        return str.equals("mock");
    }

    /* renamed from: d */
    public static boolean m612d(String str) {
        return str.equals("sandbox");
    }
}
