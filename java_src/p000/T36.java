package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: T36 */
/* loaded from: classes6.dex */
public final class T36 {

    /* renamed from: a */
    public static final Object f34716a;

    /* renamed from: b */
    public static final Method f34717b;

    /* renamed from: c */
    public static final Method f34718c;

    static {
        Method m84392a;
        Object m84391b = m84391b();
        f34716a = m84391b;
        Method method = null;
        if (m84391b == null) {
            m84392a = null;
        } else {
            m84392a = m84392a();
        }
        f34717b = m84392a;
        if (m84391b != null) {
            method = m84389d(m84391b);
        }
        f34718c = method;
    }

    private T36() {
    }

    /* renamed from: a */
    public static Method m84392a() {
        return m84390c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    public static Object m84391b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m84390c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m84389d(Object obj) {
        try {
            Method m84390c = m84390c("getStackTraceDepth", Throwable.class);
            if (m84390c == null) {
                return null;
            }
            m84390c.invoke(obj, new Throwable());
            return m84390c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: e */
    public static RuntimeException m84388e(Throwable th) {
        m84387f(th);
        throw new RuntimeException(th);
    }

    /* renamed from: f */
    public static void m84387f(Throwable th) {
        EZ3.m108801n(th);
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                return;
            }
            throw ((Error) th);
        }
        throw ((RuntimeException) th);
    }
}
