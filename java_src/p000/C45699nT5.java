package p000;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import org.greenrobot.eventbus.EventBusException;
/* renamed from: nT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45699nT5 {

    /* renamed from: d */
    public static final Map<Class<?>, List<C45106mT5>> f100014d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final C26525a[] f100015e = new C26525a[4];

    /* renamed from: a */
    public List<InterfaceC44513lT5> f100016a;

    /* renamed from: b */
    public final boolean f100017b;

    /* renamed from: c */
    public final boolean f100018c;

    /* renamed from: nT5$a */
    /* loaded from: classes8.dex */
    public static class C26525a {

        /* renamed from: a */
        public final List<C45106mT5> f100019a = new ArrayList();

        /* renamed from: b */
        public final Map<Class, Object> f100020b = new HashMap();

        /* renamed from: c */
        public final Map<String, Class> f100021c = new HashMap();

        /* renamed from: d */
        public final StringBuilder f100022d = new StringBuilder(128);

        /* renamed from: e */
        public Class<?> f100023e;

        /* renamed from: f */
        public Class<?> f100024f;

        /* renamed from: g */
        public boolean f100025g;

        /* renamed from: a */
        public boolean m23630a(Method method, Class<?> cls) {
            Object put = this.f100020b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m23629b((Method) put, cls)) {
                    this.f100020b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m23629b(method, cls);
        }

        /* renamed from: b */
        public final boolean m23629b(Method method, Class<?> cls) {
            this.f100022d.setLength(0);
            this.f100022d.append(method.getName());
            StringBuilder sb = this.f100022d;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String sb2 = this.f100022d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f100021c.put(sb2, declaringClass);
            if (put != null && !put.isAssignableFrom(declaringClass)) {
                this.f100021c.put(sb2, put);
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public void m23628c(Class<?> cls) {
            this.f100024f = cls;
            this.f100023e = cls;
            this.f100025g = false;
        }

        /* renamed from: d */
        public void m23627d() {
            if (this.f100025g) {
                this.f100024f = null;
                return;
            }
            Class<? super Object> superclass = this.f100024f.getSuperclass();
            this.f100024f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f100024f = null;
            }
        }

        /* renamed from: e */
        public void m23626e() {
            this.f100019a.clear();
            this.f100020b.clear();
            this.f100021c.clear();
            this.f100022d.setLength(0);
            this.f100023e = null;
            this.f100024f = null;
            this.f100025g = false;
        }
    }

    public C45699nT5(List<InterfaceC44513lT5> list, boolean z, boolean z2) {
        this.f100016a = list;
        this.f100017b = z;
        this.f100018c = z2;
    }

    /* renamed from: a */
    public List<C45106mT5> m23637a(Class<?> cls) {
        List<C45106mT5> m23636b;
        Map<Class<?>, List<C45106mT5>> map = f100014d;
        List<C45106mT5> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.f100018c) {
            m23636b = m23635c(cls);
        } else {
            m23636b = m23636b(cls);
        }
        if (!m23636b.isEmpty()) {
            map.put(cls, m23636b);
            return m23636b;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    /* renamed from: b */
    public final List<C45106mT5> m23636b(Class<?> cls) {
        C26525a m23631g = m23631g();
        m23631g.m23628c(cls);
        while (m23631g.f100024f != null) {
            m23632f(m23631g);
            m23634d(m23631g);
            m23631g.m23627d();
        }
        return m23633e(m23631g);
    }

    /* renamed from: c */
    public final List<C45106mT5> m23635c(Class<?> cls) {
        C26525a m23631g = m23631g();
        m23631g.m23628c(cls);
        while (m23631g.f100024f != null) {
            m23634d(m23631g);
            m23631g.m23627d();
        }
        return m23633e(m23631g);
    }

    /* renamed from: d */
    public final void m23634d(C26525a c26525a) {
        Method[] methods;
        try {
            methods = c26525a.f100024f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = c26525a.f100024f.getMethods();
            c26525a.f100025g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    InterfaceC40955fT5 interfaceC40955fT5 = (InterfaceC40955fT5) method.getAnnotation(InterfaceC40955fT5.class);
                    if (interfaceC40955fT5 != null) {
                        Class<?> cls = parameterTypes[0];
                        if (c26525a.m23630a(method, cls)) {
                            c26525a.f100019a.add(new C45106mT5(method, cls, interfaceC40955fT5.threadMode(), interfaceC40955fT5.priority(), interfaceC40955fT5.sticky()));
                        }
                    }
                } else if (this.f100017b && method.isAnnotationPresent(InterfaceC40955fT5.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + InstructionFileId.DOT + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f100017b && method.isAnnotationPresent(InterfaceC40955fT5.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + InstructionFileId.DOT + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    /* renamed from: e */
    public final List<C45106mT5> m23633e(C26525a c26525a) {
        ArrayList arrayList = new ArrayList(c26525a.f100019a);
        c26525a.m23626e();
        synchronized (f100015e) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                C26525a[] c26525aArr = f100015e;
                if (c26525aArr[i] == null) {
                    c26525aArr[i] = c26525a;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final InterfaceC43920kT5 m23632f(C26525a c26525a) {
        c26525a.getClass();
        List<InterfaceC44513lT5> list = this.f100016a;
        if (list != null) {
            for (InterfaceC44513lT5 interfaceC44513lT5 : list) {
                interfaceC44513lT5.m27254a(c26525a.f100024f);
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    public final C26525a m23631g() {
        synchronized (f100015e) {
            for (int i = 0; i < 4; i++) {
                C26525a[] c26525aArr = f100015e;
                C26525a c26525a = c26525aArr[i];
                if (c26525a != null) {
                    c26525aArr[i] = null;
                    return c26525a;
                }
            }
            return new C26525a();
        }
    }
}
