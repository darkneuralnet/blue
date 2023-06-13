package p000;
/* renamed from: wh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51164wh2 {

    /* renamed from: a */
    public static final int f116360a = m6484a();

    private C51164wh2() {
    }

    /* renamed from: a */
    public static int m6484a() {
        return m6482c(System.getProperty("java.version"));
    }

    /* renamed from: b */
    public static int m6483b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m6482c(String str) {
        int m6480e = m6480e(str);
        if (m6480e == -1) {
            m6480e = m6483b(str);
        }
        if (m6480e == -1) {
            return 6;
        }
        return m6480e;
    }

    /* renamed from: d */
    public static boolean m6481d() {
        return f116360a >= 9;
    }

    /* renamed from: e */
    public static int m6480e(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
