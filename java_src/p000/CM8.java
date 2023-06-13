package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: CM8 */
/* loaded from: classes6.dex */
public final class CM8 {

    /* renamed from: a */
    public static final Object f4004a;

    /* renamed from: b */
    public static final Method f4005b;

    /* renamed from: c */
    public static final Method f4006c;

    static {
        Method m112288c;
        Object m112289b = m112289b();
        f4004a = m112289b;
        Method method = null;
        if (m112289b == null) {
            m112288c = null;
        } else {
            m112288c = m112288c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f4005b = m112288c;
        if (m112289b != null) {
            method = m112287d(m112289b);
        }
        f4006c = method;
    }

    /* renamed from: a */
    public static void m112290a(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                return;
            }
            throw ((Error) th);
        }
        throw ((RuntimeException) th);
    }

    /* renamed from: b */
    public static Object m112289b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m112288c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m112287d(Object obj) {
        try {
            Method m112288c = m112288c("getStackTraceDepth", Throwable.class);
            if (m112288c == null) {
                return null;
            }
            m112288c.invoke(obj, new Throwable());
            return m112288c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
