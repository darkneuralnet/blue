package p000;

import android.os.Build;
import android.util.Log;
/* renamed from: Jx2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33928Jx2 {

    /* renamed from: a */
    public static int f18835a = 3;

    private C33928Jx2() {
    }

    /* renamed from: a */
    public static void m99533a(String str, String str2) {
        String m99523k = m99523k(str);
        if (m99526h(m99523k, 3)) {
            Log.d(m99523k, str2);
        }
    }

    /* renamed from: b */
    public static void m99532b(String str, String str2, Throwable th) {
        String m99523k = m99523k(str);
        if (m99526h(m99523k, 3)) {
            Log.d(m99523k, str2, th);
        }
    }

    /* renamed from: c */
    public static void m99531c(String str, String str2) {
        String m99523k = m99523k(str);
        if (m99526h(m99523k, 6)) {
            Log.e(m99523k, str2);
        }
    }

    /* renamed from: d */
    public static void m99530d(String str, String str2, Throwable th) {
        String m99523k = m99523k(str);
        if (m99526h(m99523k, 6)) {
            Log.e(m99523k, str2, th);
        }
    }

    /* renamed from: e */
    public static void m99529e(String str, String str2) {
        String m99523k = m99523k(str);
        if (m99526h(m99523k, 4)) {
            Log.i(m99523k, str2);
        }
    }

    /* renamed from: f */
    public static boolean m99528f(String str) {
        return m99526h(m99523k(str), 3);
    }

    /* renamed from: g */
    public static boolean m99527g(String str) {
        return m99526h(m99523k(str), 4);
    }

    /* renamed from: h */
    public static boolean m99526h(String str, int i) {
        return f18835a <= i || Log.isLoggable(str, i);
    }

    /* renamed from: i */
    public static void m99525i() {
        f18835a = 3;
    }

    /* renamed from: j */
    public static void m99524j(int i) {
        f18835a = i;
    }

    /* renamed from: k */
    public static String m99523k(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    /* renamed from: l */
    public static void m99522l(String str, String str2) {
        String m99523k = m99523k(str);
        if (m99526h(m99523k, 5)) {
            Log.w(m99523k, str2);
        }
    }

    /* renamed from: m */
    public static void m99521m(String str, String str2, Throwable th) {
        String m99523k = m99523k(str);
        if (m99526h(m99523k, 5)) {
            Log.w(m99523k, str2, th);
        }
    }
}
