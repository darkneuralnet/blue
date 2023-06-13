package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import okhttp3.HttpUrl;
/* renamed from: Qi6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35435Qi6 {

    /* renamed from: a */
    public static Boolean f30783a;

    /* renamed from: a */
    public static void m88158a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m88157b(Context context) {
        Boolean bool = f30783a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f30783a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C10776ad m71007e = C10776ad.m71007e();
            m71007e.m71011a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static int m88156c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static String m88155d(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse != null) {
            return parse.newBuilder().username("").password("").query(null).fragment(null).toString();
        }
        return str;
    }

    /* renamed from: e */
    public static String m88154e(String str, int i) {
        int lastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            return str.substring(0, i);
        }
        if (parse.encodedPath().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, i - 1)) >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return str.substring(0, i);
    }
}
