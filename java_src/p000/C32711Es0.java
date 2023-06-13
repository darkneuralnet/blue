package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: Es0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32711Es0<T> {

    /* renamed from: a */
    public final String f8216a;

    /* renamed from: b */
    public final Set<C52292yb4<? super T>> f8217b;

    /* renamed from: c */
    public final Set<C43645k01> f8218c;

    /* renamed from: d */
    public final int f8219d;

    /* renamed from: e */
    public final int f8220e;

    /* renamed from: f */
    public final InterfaceC36455Us0<T> f8221f;

    /* renamed from: g */
    public final Set<Class<?>> f8222g;

    /* renamed from: c */
    public static <T> C2006b<T> m108311c(C52292yb4<T> c52292yb4) {
        return new C2006b<>(c52292yb4, new C52292yb4[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C2006b<T> m108310d(C52292yb4<T> c52292yb4, C52292yb4<? super T>... c52292yb4Arr) {
        return new C2006b<>(c52292yb4, c52292yb4Arr);
    }

    /* renamed from: e */
    public static <T> C2006b<T> m108309e(Class<T> cls) {
        return new C2006b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: f */
    public static <T> C2006b<T> m108308f(Class<T> cls, Class<? super T>... clsArr) {
        return new C2006b<>(cls, clsArr);
    }

    /* renamed from: l */
    public static <T> C32711Es0<T> m108302l(final T t, Class<T> cls) {
        return m108301m(cls).m108288f(new InterfaceC36455Us0() { // from class: Ds0
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                Object m108297q;
                m108297q = C32711Es0.m108297q(t, interfaceC35051Os0);
                return m108297q;
            }
        }).m108290d();
    }

    /* renamed from: m */
    public static <T> C2006b<T> m108301m(Class<T> cls) {
        return m108309e(cls).m108287g();
    }

    /* renamed from: q */
    public static /* synthetic */ Object m108297q(Object obj, InterfaceC35051Os0 interfaceC35051Os0) {
        return obj;
    }

    /* renamed from: r */
    public static /* synthetic */ Object m108296r(Object obj, InterfaceC35051Os0 interfaceC35051Os0) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: s */
    public static <T> C32711Es0<T> m108295s(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return m108308f(cls, clsArr).m108288f(new InterfaceC36455Us0() { // from class: Cs0
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                Object m108296r;
                m108296r = C32711Es0.m108296r(t, interfaceC35051Os0);
                return m108296r;
            }
        }).m108290d();
    }

    /* renamed from: g */
    public Set<C43645k01> m108307g() {
        return this.f8218c;
    }

    /* renamed from: h */
    public InterfaceC36455Us0<T> m108306h() {
        return this.f8221f;
    }

    /* renamed from: i */
    public String m108305i() {
        return this.f8216a;
    }

    /* renamed from: j */
    public Set<C52292yb4<? super T>> m108304j() {
        return this.f8217b;
    }

    /* renamed from: k */
    public Set<Class<?>> m108303k() {
        return this.f8222g;
    }

    /* renamed from: n */
    public boolean m108300n() {
        return this.f8219d == 1;
    }

    /* renamed from: o */
    public boolean m108299o() {
        return this.f8219d == 2;
    }

    /* renamed from: p */
    public boolean m108298p() {
        return this.f8220e == 0;
    }

    /* renamed from: t */
    public C32711Es0<T> m108294t(InterfaceC36455Us0<T> interfaceC36455Us0) {
        return new C32711Es0<>(this.f8216a, this.f8217b, this.f8218c, this.f8219d, this.f8220e, interfaceC36455Us0, this.f8222g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f8217b.toArray()) + ">{" + this.f8219d + ", type=" + this.f8220e + ", deps=" + Arrays.toString(this.f8218c.toArray()) + "}";
    }

    /* renamed from: Es0$b */
    /* loaded from: classes6.dex */
    public static class C2006b<T> {

        /* renamed from: a */
        public String f8223a;

        /* renamed from: b */
        public final Set<C52292yb4<? super T>> f8224b;

        /* renamed from: c */
        public final Set<C43645k01> f8225c;

        /* renamed from: d */
        public int f8226d;

        /* renamed from: e */
        public int f8227e;

        /* renamed from: f */
        public InterfaceC36455Us0<T> f8228f;

        /* renamed from: g */
        public final Set<Class<?>> f8229g;

        /* renamed from: b */
        public C2006b<T> m108292b(C43645k01 c43645k01) {
            FZ3.m106945c(c43645k01, "Null dependency");
            m108284j(c43645k01.m29491c());
            this.f8225c.add(c43645k01);
            return this;
        }

        /* renamed from: c */
        public C2006b<T> m108291c() {
            return m108285i(1);
        }

        /* renamed from: d */
        public C32711Es0<T> m108290d() {
            boolean z;
            if (this.f8228f != null) {
                z = true;
            } else {
                z = false;
            }
            FZ3.m106944d(z, "Missing required property: factory.");
            return new C32711Es0<>(this.f8223a, new HashSet(this.f8224b), new HashSet(this.f8225c), this.f8226d, this.f8227e, this.f8228f, this.f8229g);
        }

        /* renamed from: e */
        public C2006b<T> m108289e() {
            return m108285i(2);
        }

        /* renamed from: f */
        public C2006b<T> m108288f(InterfaceC36455Us0<T> interfaceC36455Us0) {
            this.f8228f = (InterfaceC36455Us0) FZ3.m106945c(interfaceC36455Us0, "Null factory");
            return this;
        }

        /* renamed from: g */
        public final C2006b<T> m108287g() {
            this.f8227e = 1;
            return this;
        }

        /* renamed from: h */
        public C2006b<T> m108286h(String str) {
            this.f8223a = str;
            return this;
        }

        /* renamed from: i */
        public final C2006b<T> m108285i(int i) {
            boolean z;
            if (this.f8226d == 0) {
                z = true;
            } else {
                z = false;
            }
            FZ3.m106944d(z, "Instantiation type has already been set.");
            this.f8226d = i;
            return this;
        }

        /* renamed from: j */
        public final void m108284j(C52292yb4<?> c52292yb4) {
            FZ3.m106947a(!this.f8224b.contains(c52292yb4), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public C2006b(Class<T> cls, Class<? super T>... clsArr) {
            this.f8223a = null;
            HashSet hashSet = new HashSet();
            this.f8224b = hashSet;
            this.f8225c = new HashSet();
            this.f8226d = 0;
            this.f8227e = 0;
            this.f8229g = new HashSet();
            FZ3.m106945c(cls, "Null interface");
            hashSet.add(C52292yb4.m3202b(cls));
            for (Class<? super T> cls2 : clsArr) {
                FZ3.m106945c(cls2, "Null interface");
                this.f8224b.add(C52292yb4.m3202b(cls2));
            }
        }

        @SafeVarargs
        public C2006b(C52292yb4<T> c52292yb4, C52292yb4<? super T>... c52292yb4Arr) {
            this.f8223a = null;
            HashSet hashSet = new HashSet();
            this.f8224b = hashSet;
            this.f8225c = new HashSet();
            this.f8226d = 0;
            this.f8227e = 0;
            this.f8229g = new HashSet();
            FZ3.m106945c(c52292yb4, "Null interface");
            hashSet.add(c52292yb4);
            for (C52292yb4<? super T> c52292yb42 : c52292yb4Arr) {
                FZ3.m106945c(c52292yb42, "Null interface");
            }
            Collections.addAll(this.f8224b, c52292yb4Arr);
        }
    }

    public C32711Es0(String str, Set<C52292yb4<? super T>> set, Set<C43645k01> set2, int i, int i2, InterfaceC36455Us0<T> interfaceC36455Us0, Set<Class<?>> set3) {
        this.f8216a = str;
        this.f8217b = Collections.unmodifiableSet(set);
        this.f8218c = Collections.unmodifiableSet(set2);
        this.f8219d = i;
        this.f8220e = i2;
        this.f8221f = interfaceC36455Us0;
        this.f8222g = Collections.unmodifiableSet(set3);
    }
}
