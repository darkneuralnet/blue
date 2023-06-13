package p000;

import android.os.Looper;
/* renamed from: zd */
/* loaded from: classes6.dex */
public class C31060zd {

    /* renamed from: a */
    public static final boolean f121642a = m1008a();

    /* renamed from: b */
    public static final boolean f121643b = m1003f();

    /* renamed from: c */
    public static boolean f121644c = false;

    /* renamed from: a */
    public static boolean m1008a() {
        try {
            Class.forName("android.app.Activity");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m1007b() {
        DZ3.m110171f(m1004e(), "Sceneform requires Android N or later");
    }

    /* renamed from: c */
    public static void m1006c() {
        boolean z;
        if (m1005d() && !m1002g()) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            DZ3.m110171f(z, "Must be called from the UI thread.");
        }
    }

    /* renamed from: d */
    public static boolean m1005d() {
        return f121642a;
    }

    /* renamed from: e */
    public static boolean m1004e() {
        return m1002g() || f121643b;
    }

    /* renamed from: f */
    public static boolean m1003f() {
        m1005d();
        return true;
    }

    /* renamed from: g */
    public static boolean m1002g() {
        return f121644c;
    }
}
