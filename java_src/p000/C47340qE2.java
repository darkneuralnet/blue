package p000;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* renamed from: qE2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47340qE2 implements InterfaceC28820to {

    /* renamed from: a */
    public final C44374lE1<C27556a, Object> f104949a;

    /* renamed from: b */
    public final C27557b f104950b;

    /* renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f104951c;

    /* renamed from: d */
    public final Map<Class<?>, InterfaceC26222mo<?>> f104952d;

    /* renamed from: e */
    public final int f104953e;

    /* renamed from: f */
    public int f104954f;

    /* renamed from: qE2$a */
    /* loaded from: classes5.dex */
    public static final class C27556a implements InterfaceC38016aY3 {

        /* renamed from: a */
        public final C27557b f104955a;

        /* renamed from: b */
        public int f104956b;

        /* renamed from: c */
        public Class<?> f104957c;

        public C27556a(C27557b c27557b) {
            this.f104955a = c27557b;
        }

        @Override // p000.InterfaceC38016aY3
        /* renamed from: a */
        public void mo1681a() {
            this.f104955a.m24226c(this);
        }

        /* renamed from: b */
        public void m17862b(int i, Class<?> cls) {
            this.f104956b = i;
            this.f104957c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C27556a)) {
                return false;
            }
            C27556a c27556a = (C27556a) obj;
            if (this.f104956b != c27556a.f104956b || this.f104957c != c27556a.f104957c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f104956b * 31;
            Class<?> cls = this.f104957c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f104956b + "array=" + this.f104957c + CoreConstants.CURLY_RIGHT;
        }
    }

    /* renamed from: qE2$b */
    /* loaded from: classes5.dex */
    public static final class C27557b extends AbstractC26421nB<C27556a> {
        @Override // p000.AbstractC26421nB
        /* renamed from: d */
        public C27556a mo1679a() {
            return new C27556a(this);
        }

        /* renamed from: e */
        public C27556a m17860e(int i, Class<?> cls) {
            C27556a m24227b = m24227b();
            m24227b.m17862b(i, cls);
            return m24227b;
        }
    }

    public C47340qE2() {
        this.f104949a = new C44374lE1<>();
        this.f104950b = new C27557b();
        this.f104951c = new HashMap();
        this.f104952d = new HashMap();
        this.f104953e = 4194304;
    }

    @Override // p000.InterfaceC28820to
    /* renamed from: a */
    public synchronized void mo11763a(int i) {
        try {
            if (i >= 40) {
                mo11762b();
            } else if (i >= 20 || i == 15) {
                m17871h(this.f104953e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC28820to
    /* renamed from: b */
    public synchronized void mo11762b() {
        m17871h(0);
    }

    @Override // p000.InterfaceC28820to
    /* renamed from: c */
    public synchronized <T> T mo11761c(int i, Class<T> cls) {
        C27556a m17860e;
        Integer ceilingKey = m17866m(cls).ceilingKey(Integer.valueOf(i));
        if (m17863p(i, ceilingKey)) {
            m17860e = this.f104950b.m17860e(ceilingKey.intValue(), cls);
        } else {
            m17860e = this.f104950b.m17860e(i, cls);
        }
        return (T) m17867l(m17860e, cls);
    }

    @Override // p000.InterfaceC28820to
    /* renamed from: d */
    public synchronized <T> T mo11760d(int i, Class<T> cls) {
        return (T) m17867l(this.f104950b.m17860e(i, cls), cls);
    }

    @Override // p000.InterfaceC28820to
    @Deprecated
    /* renamed from: e */
    public <T> void mo11759e(T t, Class<T> cls) {
        put(t);
    }

    /* renamed from: f */
    public final void m17873f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m17866m = m17866m(cls);
        Integer num = m17866m.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                m17866m.remove(Integer.valueOf(i));
                return;
            } else {
                m17866m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: g */
    public final void m17872g() {
        m17871h(this.f104953e);
    }

    /* renamed from: h */
    public final void m17871h(int i) {
        while (this.f104954f > i) {
            Object m27650f = this.f104949a.m27650f();
            C52865zZ3.m1111d(m27650f);
            InterfaceC26222mo m17870i = m17870i(m27650f);
            this.f104954f -= m17870i.mo24990e(m27650f) * m17870i.mo24989f();
            m17873f(m17870i.mo24990e(m27650f), m27650f.getClass());
            if (Log.isLoggable(m17870i.mo24991d(), 2)) {
                Log.v(m17870i.mo24991d(), "evicted: " + m17870i.mo24990e(m27650f));
            }
        }
    }

    /* renamed from: i */
    public final <T> InterfaceC26222mo<T> m17870i(T t) {
        return m17869j(t.getClass());
    }

    /* renamed from: j */
    public final <T> InterfaceC26222mo<T> m17869j(Class<T> cls) {
        L52 l52 = (InterfaceC26222mo<T>) this.f104952d.get(cls);
        if (l52 == null) {
            if (cls.equals(int[].class)) {
                l52 = new L52();
            } else if (cls.equals(byte[].class)) {
                l52 = new C44900m70();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f104952d.put(cls, l52);
        }
        return l52;
    }

    /* renamed from: k */
    public final <T> T m17868k(C27556a c27556a) {
        return (T) this.f104949a.m27655a(c27556a);
    }

    /* renamed from: l */
    public final <T> T m17867l(C27556a c27556a, Class<T> cls) {
        InterfaceC26222mo<T> m17869j = m17869j(cls);
        T t = (T) m17868k(c27556a);
        if (t != null) {
            this.f104954f -= m17869j.mo24990e(t) * m17869j.mo24989f();
            m17873f(m17869j.mo24990e(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(m17869j.mo24991d(), 2)) {
                Log.v(m17869j.mo24991d(), "Allocated " + c27556a.f104956b + " bytes");
            }
            return m17869j.newArray(c27556a.f104956b);
        }
        return t;
    }

    /* renamed from: m */
    public final NavigableMap<Integer, Integer> m17866m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f104951c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f104951c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    /* renamed from: n */
    public final boolean m17865n() {
        int i = this.f104954f;
        return i == 0 || this.f104953e / i >= 2;
    }

    /* renamed from: o */
    public final boolean m17864o(int i) {
        return i <= this.f104953e / 2;
    }

    /* renamed from: p */
    public final boolean m17863p(int i, Integer num) {
        return num != null && (m17865n() || num.intValue() <= i * 8);
    }

    @Override // p000.InterfaceC28820to
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        InterfaceC26222mo<T> m17869j = m17869j(cls);
        int mo24990e = m17869j.mo24990e(t);
        int mo24989f = m17869j.mo24989f() * mo24990e;
        if (!m17864o(mo24989f)) {
            return;
        }
        C27556a m17860e = this.f104950b.m17860e(mo24990e, cls);
        this.f104949a.m27652d(m17860e, t);
        NavigableMap<Integer, Integer> m17866m = m17866m(cls);
        Integer num = m17866m.get(Integer.valueOf(m17860e.f104956b));
        Integer valueOf = Integer.valueOf(m17860e.f104956b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        m17866m.put(valueOf, Integer.valueOf(i));
        this.f104954f += mo24989f;
        m17872g();
    }

    public C47340qE2(int i) {
        this.f104949a = new C44374lE1<>();
        this.f104950b = new C27557b();
        this.f104951c = new HashMap();
        this.f104952d = new HashMap();
        this.f104953e = i;
    }
}
