package p000;

import android.os.Build;
import android.util.Log;
/* renamed from: Rx2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35800Rx2 {
    private C35800Rx2() {
    }

    /* renamed from: a */
    public static String m86173a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    /* renamed from: b */
    public static void m86172b(String str, String str2, Object obj) {
        String m86169e = m86169e(str);
        if (Log.isLoggable(m86169e, 3)) {
            Log.d(m86169e, String.format(str2, obj));
        }
    }

    /* renamed from: c */
    public static void m86171c(String str, String str2, Object... objArr) {
        String m86169e = m86169e(str);
        if (Log.isLoggable(m86169e, 3)) {
            Log.d(m86169e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m86170d(String str, String str2, Throwable th) {
        String m86169e = m86169e(str);
        if (Log.isLoggable(m86169e, 6)) {
            Log.e(m86169e, str2, th);
        }
    }

    /* renamed from: e */
    public static String m86169e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m86173a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m86168f(String str, String str2, Object obj) {
        String m86169e = m86169e(str);
        if (Log.isLoggable(m86169e, 4)) {
            Log.i(m86169e, String.format(str2, obj));
        }
    }

    /* renamed from: g */
    public static void m86167g(String str, String str2, Object obj) {
        String m86169e = m86169e(str);
        if (Log.isLoggable(m86169e, 5)) {
            Log.w(m86169e, String.format(str2, obj));
        }
    }
}
