package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;
/* renamed from: Bg1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31902Bg1 {

    /* renamed from: s */
    public static volatile C31902Bg1 f2653s;

    /* renamed from: t */
    public static final C32370Dg1 f2654t = new C32370Dg1();

    /* renamed from: u */
    public static final Map<Class<?>, List<Class<?>>> f2655u = new HashMap();

    /* renamed from: a */
    public final Map<Class<?>, CopyOnWriteArrayList<C46885pT5>> f2656a;

    /* renamed from: b */
    public final Map<Object, List<Class<?>>> f2657b;

    /* renamed from: c */
    public final Map<Class<?>, Object> f2658c;

    /* renamed from: d */
    public final ThreadLocal<C0684c> f2659d;

    /* renamed from: e */
    public final InterfaceC37862aH2 f2660e;

    /* renamed from: f */
    public final JY3 f2661f;

    /* renamed from: g */
    public final RunnableC19644cw f2662g;

    /* renamed from: h */
    public final RunnableC25027jp f2663h;

    /* renamed from: i */
    public final C45699nT5 f2664i;

    /* renamed from: j */
    public final ExecutorService f2665j;

    /* renamed from: k */
    public final boolean f2666k;

    /* renamed from: l */
    public final boolean f2667l;

    /* renamed from: m */
    public final boolean f2668m;

    /* renamed from: n */
    public final boolean f2669n;

    /* renamed from: o */
    public final boolean f2670o;

    /* renamed from: p */
    public final boolean f2671p;

    /* renamed from: q */
    public final int f2672q;

    /* renamed from: r */
    public final InterfaceC52510yx2 f2673r;

    /* renamed from: Bg1$a */
    /* loaded from: classes8.dex */
    public class C0682a extends ThreadLocal<C0684c> {
        public C0682a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C0684c initialValue() {
            return new C0684c();
        }
    }

    /* renamed from: Bg1$b */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C0683b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2675a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f2675a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2675a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2675a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2675a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2675a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: Bg1$c */
    /* loaded from: classes8.dex */
    public static final class C0684c {

        /* renamed from: a */
        public final List<Object> f2676a = new ArrayList();

        /* renamed from: b */
        public boolean f2677b;

        /* renamed from: c */
        public boolean f2678c;

        /* renamed from: d */
        public C46885pT5 f2679d;

        /* renamed from: e */
        public Object f2680e;

        /* renamed from: f */
        public boolean f2681f;
    }

    public C31902Bg1() {
        this(f2654t);
    }

    /* renamed from: a */
    public static void m113710a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m113710a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: c */
    public static C31902Bg1 m113708c() {
        if (f2653s == null) {
            synchronized (C31902Bg1.class) {
                if (f2653s == null) {
                    f2653s = new C31902Bg1();
                }
            }
        }
        return f2653s;
    }

    /* renamed from: k */
    public static List<Class<?>> m113700k(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f2655u;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m113710a(list, cls2.getInterfaces());
                }
                f2655u.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: b */
    public final void m113709b(C46885pT5 c46885pT5, Object obj) {
        if (obj != null) {
            m113696o(c46885pT5, obj, m113702i());
        }
    }

    /* renamed from: d */
    public ExecutorService m113707d() {
        return this.f2665j;
    }

    /* renamed from: e */
    public InterfaceC52510yx2 m113706e() {
        return this.f2673r;
    }

    /* renamed from: f */
    public final void m113705f(C46885pT5 c46885pT5, Object obj, Throwable th) {
        if (obj instanceof C43327jT5) {
            if (this.f2667l) {
                InterfaceC52510yx2 interfaceC52510yx2 = this.f2673r;
                Level level = Level.SEVERE;
                interfaceC52510yx2.mo2218b(level, "SubscriberExceptionEvent subscriber " + c46885pT5.f103735a.getClass() + " threw an exception", th);
                C43327jT5 c43327jT5 = (C43327jT5) obj;
                InterfaceC52510yx2 interfaceC52510yx22 = this.f2673r;
                interfaceC52510yx22.mo2218b(level, "Initial event " + c43327jT5.f92763c + " caused exception in " + c43327jT5.f92764d, c43327jT5.f92762b);
            }
        } else if (!this.f2666k) {
            if (this.f2667l) {
                InterfaceC52510yx2 interfaceC52510yx23 = this.f2673r;
                Level level2 = Level.SEVERE;
                interfaceC52510yx23.mo2218b(level2, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + c46885pT5.f103735a.getClass(), th);
            }
            if (this.f2669n) {
                m113699l(new C43327jT5(this, th, obj, c46885pT5.f103735a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    /* renamed from: g */
    public void m113704g(C40333eQ3 c40333eQ3) {
        Object obj = c40333eQ3.f78385a;
        C46885pT5 c46885pT5 = c40333eQ3.f78386b;
        C40333eQ3.m42886b(c40333eQ3);
        if (c46885pT5.f103737c) {
            m113703h(c46885pT5, obj);
        }
    }

    /* renamed from: h */
    public void m113703h(C46885pT5 c46885pT5, Object obj) {
        try {
            c46885pT5.f103736b.f98074a.invoke(c46885pT5.f103735a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            m113705f(c46885pT5, obj, e2.getCause());
        }
    }

    /* renamed from: i */
    public final boolean m113702i() {
        InterfaceC37862aH2 interfaceC37862aH2 = this.f2660e;
        if (interfaceC37862aH2 != null) {
            return interfaceC37862aH2.mo71710a();
        }
        return true;
    }

    /* renamed from: j */
    public synchronized boolean m113701j(Object obj) {
        return this.f2657b.containsKey(obj);
    }

    /* renamed from: l */
    public void m113699l(Object obj) {
        C0684c c0684c = this.f2659d.get();
        List<Object> list = c0684c.f2676a;
        list.add(obj);
        if (!c0684c.f2677b) {
            c0684c.f2678c = m113702i();
            c0684c.f2677b = true;
            if (c0684c.f2681f) {
                throw new EventBusException("Internal error. Abort state was not reset");
            }
            while (true) {
                try {
                    if (!list.isEmpty()) {
                        m113698m(list.remove(0), c0684c);
                    } else {
                        return;
                    }
                } finally {
                    c0684c.f2677b = false;
                    c0684c.f2678c = false;
                }
            }
        }
    }

    /* renamed from: m */
    public final void m113698m(Object obj, C0684c c0684c) throws Error {
        boolean m113697n;
        Class<?> cls = obj.getClass();
        if (this.f2671p) {
            List<Class<?>> m113700k = m113700k(cls);
            int size = m113700k.size();
            m113697n = false;
            for (int i = 0; i < size; i++) {
                m113697n |= m113697n(obj, c0684c, m113700k.get(i));
            }
        } else {
            m113697n = m113697n(obj, c0684c, cls);
        }
        if (!m113697n) {
            if (this.f2668m) {
                this.f2673r.mo2219a(Level.FINE, "No subscribers registered for event " + cls);
            }
            if (this.f2670o && cls != B83.class && cls != C43327jT5.class) {
                m113699l(new B83(this, obj));
            }
        }
    }

    /* renamed from: n */
    public final boolean m113697n(Object obj, C0684c c0684c, Class<?> cls) {
        CopyOnWriteArrayList<C46885pT5> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f2656a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<C46885pT5> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C46885pT5 next = it.next();
            c0684c.f2680e = obj;
            c0684c.f2679d = next;
            try {
                m113696o(next, obj, c0684c.f2678c);
                if (c0684c.f2681f) {
                    return true;
                }
            } finally {
                c0684c.f2680e = null;
                c0684c.f2679d = null;
                c0684c.f2681f = false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public final void m113696o(C46885pT5 c46885pT5, Object obj, boolean z) {
        int i = C0683b.f2675a[c46885pT5.f103736b.f98075b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.f2663h.mo29884a(c46885pT5, obj);
                            return;
                        }
                        throw new IllegalStateException("Unknown thread mode: " + c46885pT5.f103736b.f98075b);
                    } else if (z) {
                        this.f2662g.mo29884a(c46885pT5, obj);
                        return;
                    } else {
                        m113703h(c46885pT5, obj);
                        return;
                    }
                }
                JY3 jy3 = this.f2661f;
                if (jy3 != null) {
                    jy3.mo29884a(c46885pT5, obj);
                    return;
                } else {
                    m113703h(c46885pT5, obj);
                    return;
                }
            } else if (z) {
                m113703h(c46885pT5, obj);
                return;
            } else {
                this.f2661f.mo29884a(c46885pT5, obj);
                return;
            }
        }
        m113703h(c46885pT5, obj);
    }

    /* renamed from: p */
    public void m113695p(Object obj) {
        List<C45106mT5> m23637a = this.f2664i.m23637a(obj.getClass());
        synchronized (this) {
            for (C45106mT5 c45106mT5 : m23637a) {
                m113694q(obj, c45106mT5);
            }
        }
    }

    /* renamed from: q */
    public final void m113694q(Object obj, C45106mT5 c45106mT5) {
        Class<?> cls = c45106mT5.f98076c;
        C46885pT5 c46885pT5 = new C46885pT5(obj, c45106mT5);
        CopyOnWriteArrayList<C46885pT5> copyOnWriteArrayList = this.f2656a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f2656a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c46885pT5)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || c45106mT5.f98077d > copyOnWriteArrayList.get(i).f103736b.f98077d) {
                copyOnWriteArrayList.add(i, c46885pT5);
                break;
            }
        }
        List<Class<?>> list = this.f2657b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f2657b.put(obj, list);
        }
        list.add(cls);
        if (c45106mT5.f98078e) {
            if (this.f2671p) {
                for (Map.Entry<Class<?>, Object> entry : this.f2658c.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey())) {
                        m113709b(c46885pT5, entry.getValue());
                    }
                }
                return;
            }
            m113709b(c46885pT5, this.f2658c.get(cls));
        }
    }

    /* renamed from: r */
    public synchronized void m113693r(Object obj) {
        List<Class<?>> list = this.f2657b.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                m113692s(obj, cls);
            }
            this.f2657b.remove(obj);
        } else {
            InterfaceC52510yx2 interfaceC52510yx2 = this.f2673r;
            Level level = Level.WARNING;
            interfaceC52510yx2.mo2219a(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    /* renamed from: s */
    public final void m113692s(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<C46885pT5> copyOnWriteArrayList = this.f2656a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                C46885pT5 c46885pT5 = copyOnWriteArrayList.get(i);
                if (c46885pT5.f103735a == obj) {
                    c46885pT5.f103737c = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f2672q + ", eventInheritance=" + this.f2671p + "]";
    }

    public C31902Bg1(C32370Dg1 c32370Dg1) {
        this.f2659d = new C0682a();
        this.f2673r = c32370Dg1.m110015b();
        this.f2656a = new HashMap();
        this.f2657b = new HashMap();
        this.f2658c = new ConcurrentHashMap();
        InterfaceC37862aH2 m110014c = c32370Dg1.m110014c();
        this.f2660e = m110014c;
        this.f2661f = m110014c != null ? m110014c.mo71709b(this) : null;
        this.f2662g = new RunnableC19644cw(this);
        this.f2663h = new RunnableC25027jp(this);
        List<InterfaceC44513lT5> list = c32370Dg1.f6177j;
        this.f2672q = list != null ? list.size() : 0;
        this.f2664i = new C45699nT5(c32370Dg1.f6177j, c32370Dg1.f6175h, c32370Dg1.f6174g);
        this.f2667l = c32370Dg1.f6168a;
        this.f2668m = c32370Dg1.f6169b;
        this.f2669n = c32370Dg1.f6170c;
        this.f2670o = c32370Dg1.f6171d;
        this.f2666k = c32370Dg1.f6172e;
        this.f2671p = c32370Dg1.f6173f;
        this.f2665j = c32370Dg1.f6176i;
    }
}
