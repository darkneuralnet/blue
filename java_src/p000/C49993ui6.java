package p000;

import java.io.PrintStream;
/* renamed from: ui6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49993ui6 {

    /* renamed from: a */
    public static C29284b f112792a = null;

    /* renamed from: b */
    public static boolean f112793b = false;

    /* renamed from: ui6$b */
    /* loaded from: classes8.dex */
    public static final class C29284b extends SecurityManager {
        private C29284b() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private C49993ui6() {
    }

    /* renamed from: a */
    public static Class<?> m9854a() {
        int i;
        C29284b m9853b = m9853b();
        if (m9853b == null) {
            return null;
        }
        Class<?>[] classContext = m9853b.getClassContext();
        String name = C49993ui6.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    /* renamed from: b */
    public static C29284b m9853b() {
        C29284b c29284b = f112792a;
        if (c29284b != null) {
            return c29284b;
        }
        if (f112793b) {
            return null;
        }
        C29284b m9850e = m9850e();
        f112792a = m9850e;
        f112793b = true;
        return m9850e;
    }

    /* renamed from: c */
    public static final void m9852c(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    /* renamed from: d */
    public static final void m9851d(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: e */
    public static C29284b m9850e() {
        try {
            return new C29284b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m9849f(String str) {
        String m9848g = m9848g(str);
        if (m9848g == null) {
            return false;
        }
        return m9848g.equalsIgnoreCase("true");
    }

    /* renamed from: g */
    public static String m9848g(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("null input");
    }
}
