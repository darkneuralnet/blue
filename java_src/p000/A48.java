package p000;

import android.util.Log;
import java.lang.reflect.Method;
/* renamed from: A48 */
/* loaded from: classes6.dex */
public final class A48 {

    /* renamed from: a */
    public static final Method f103a;

    /* renamed from: b */
    public static final Method f104b;

    /* renamed from: c */
    public static final Method f105c;

    /* renamed from: d */
    public static final Method f106d;

    static {
        Method method;
        Method method2;
        Method method3;
        Class<?> cls;
        try {
            cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
        } catch (Exception e) {
            e = e;
            method = null;
            method2 = null;
        } catch (Throwable th) {
            th = th;
            method = null;
            method2 = null;
        }
        try {
            method2 = cls.getMethod("getInt", String.class, Integer.TYPE);
        } catch (Exception e2) {
            e = e2;
            method2 = null;
            method3 = method2;
            e.printStackTrace();
            f103a = method;
            f104b = method2;
            f105c = method3;
            f106d = null;
        } catch (Throwable th2) {
            th = th2;
            method2 = null;
            method3 = method2;
            f103a = method;
            f104b = method2;
            f105c = method3;
            f106d = null;
            throw th;
        }
        try {
            method3 = cls.getMethod("getLong", String.class, Long.TYPE);
            try {
                try {
                    Method method4 = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
                    f103a = method;
                    f104b = method2;
                    f105c = method3;
                    f106d = method4;
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    f103a = method;
                    f104b = method2;
                    f105c = method3;
                    f106d = null;
                }
            } catch (Throwable th3) {
                th = th3;
                f103a = method;
                f104b = method2;
                f105c = method3;
                f106d = null;
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            method3 = null;
        } catch (Throwable th4) {
            th = th4;
            method3 = null;
            f103a = method;
            f104b = method2;
            f105c = method3;
            f106d = null;
            throw th;
        }
    }

    /* renamed from: a */
    public static String m116148a(String str, String str2) {
        try {
            return (String) f103a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
            return "false";
        }
    }
}
