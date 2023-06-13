package p000;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: Kx2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34162Kx2 {

    /* renamed from: a */
    public static volatile int f20444a;

    /* renamed from: b */
    public static final C49256tT5 f20445b = new C49256tT5();

    /* renamed from: c */
    public static final C43369jY2 f20446c = new C43369jY2();

    /* renamed from: d */
    public static boolean f20447d = C49993ui6.m9849f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    public static final String[] f20448e = {"1.6", "1.7"};

    /* renamed from: f */
    public static String f20449f = "org/slf4j/impl/StaticLoggerBinder.class";

    private C34162Kx2() {
    }

    /* renamed from: a */
    public static final void m98070a() {
        Set<URL> set;
        try {
            if (!m98059l()) {
                set = m98065f();
                m98052s(set);
            } else {
                set = null;
            }
            C41521gQ5.m39488c();
            f20444a = 3;
            m98053r(set);
            m98064g();
            m98055p();
            f20445b.m12296a();
        } catch (Exception e) {
            m98066e(e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            if (m98058m(e2.getMessage())) {
                f20444a = 4;
                C49993ui6.m9852c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C49993ui6.m9852c("Defaulting to no-operation (NOP) logger implementation");
                C49993ui6.m9852c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m98066e(e2);
            throw e2;
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f20444a = 2;
                C49993ui6.m9852c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C49993ui6.m9852c("Your binding is version 1.5.5 or earlier.");
                C49993ui6.m9852c("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    /* renamed from: b */
    public static void m98069b(C49849uT5 c49849uT5, int i) {
        if (c49849uT5.m10243a().m14164c()) {
            m98068c(i);
        } else if (!c49849uT5.m10243a().m14163d()) {
            m98067d();
        }
    }

    /* renamed from: c */
    public static void m98068c(int i) {
        C49993ui6.m9852c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C49993ui6.m9852c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C49993ui6.m9852c("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: d */
    public static void m98067d() {
        C49993ui6.m9852c("The following set of substitute loggers may have been accessed");
        C49993ui6.m9852c("during the initialization phase. Logging calls during this");
        C49993ui6.m9852c("phase were not honored. However, subsequent logging calls to these");
        C49993ui6.m9852c("loggers will work as normally expected.");
        C49993ui6.m9852c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: e */
    public static void m98066e(Throwable th) {
        f20444a = 2;
        C49993ui6.m9851d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: f */
    public static Set<URL> m98065f() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C34162Kx2.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(f20449f);
            } else {
                resources = classLoader.getResources(f20449f);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e) {
            C49993ui6.m9851d("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    public static void m98064g() {
        C49256tT5 c49256tT5 = f20445b;
        synchronized (c49256tT5) {
            c49256tT5.m12293d();
            for (C48663sT5 c48663sT5 : c49256tT5.m12294c()) {
                c48663sT5.m14160g(m98061j(c48663sT5.getName()));
            }
        }
    }

    /* renamed from: h */
    public static PO1 m98063h() {
        if (f20444a == 0) {
            synchronized (C34162Kx2.class) {
                if (f20444a == 0) {
                    f20444a = 1;
                    m98056o();
                }
            }
        }
        int i = f20444a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return f20446c;
                    }
                    throw new IllegalStateException("Unreachable code");
                }
                return C41521gQ5.m39488c().m39490a();
            }
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        return f20445b;
    }

    /* renamed from: i */
    public static InterfaceC53103zx2 m98062i(Class<?> cls) {
        Class<?> m9854a;
        InterfaceC53103zx2 m98061j = m98061j(cls.getName());
        if (f20447d && (m9854a = C49993ui6.m9854a()) != null && m98057n(cls, m9854a)) {
            C49993ui6.m9852c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", m98061j.getName(), m9854a.getName()));
            C49993ui6.m9852c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return m98061j;
    }

    /* renamed from: j */
    public static InterfaceC53103zx2 m98061j(String str) {
        return m98063h().getLogger(str);
    }

    /* renamed from: k */
    public static boolean m98060k(Set<URL> set) {
        return set.size() > 1;
    }

    /* renamed from: l */
    public static boolean m98059l() {
        String m9848g = C49993ui6.m9848g("java.vendor.url");
        if (m9848g == null) {
            return false;
        }
        return m9848g.toLowerCase().contains("android");
    }

    /* renamed from: m */
    public static boolean m98058m(String str) {
        if (str == null) {
            return false;
        }
        if (!str.contains("org/slf4j/impl/StaticLoggerBinder") && !str.contains("org.slf4j.impl.StaticLoggerBinder")) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m98057n(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: o */
    public static final void m98056o() {
        m98070a();
        if (f20444a == 3) {
            m98051t();
        }
    }

    /* renamed from: p */
    public static void m98055p() {
        LinkedBlockingQueue<C49849uT5> m12295b = f20445b.m12295b();
        int size = m12295b.size();
        ArrayList<C49849uT5> arrayList = new ArrayList(128);
        int i = 0;
        while (m12295b.drainTo(arrayList, 128) != 0) {
            for (C49849uT5 c49849uT5 : arrayList) {
                m98054q(c49849uT5);
                int i2 = i + 1;
                if (i == 0) {
                    m98069b(c49849uT5, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: q */
    public static void m98054q(C49849uT5 c49849uT5) {
        if (c49849uT5 == null) {
            return;
        }
        C48663sT5 m10243a = c49849uT5.m10243a();
        String name = m10243a.getName();
        if (!m10243a.m14162e()) {
            if (!m10243a.m14163d()) {
                if (m10243a.m14164c()) {
                    m10243a.m14161f(c49849uT5);
                    return;
                } else {
                    C49993ui6.m9852c(name);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Delegate logger cannot be null at this state.");
    }

    /* renamed from: r */
    public static void m98053r(Set<URL> set) {
        if (set != null && m98060k(set)) {
            C49993ui6.m9852c("Actual binding is of type [" + C41521gQ5.m39488c().m39489b() + "]");
        }
    }

    /* renamed from: s */
    public static void m98052s(Set<URL> set) {
        if (m98060k(set)) {
            C49993ui6.m9852c("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C49993ui6.m9852c("Found binding in [" + it.next() + "]");
            }
            C49993ui6.m9852c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: t */
    public static final void m98051t() {
        try {
            String str = C41521gQ5.f82149d;
            boolean z = false;
            for (String str2 : f20448e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (!z) {
                C49993ui6.m9852c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f20448e).toString());
                C49993ui6.m9852c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C49993ui6.m9851d("Unexpected problem occured during version sanity check", th);
        }
    }
}
