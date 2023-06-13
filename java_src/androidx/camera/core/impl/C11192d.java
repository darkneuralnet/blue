package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.InterfaceC11197f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: androidx.camera.core.impl.d */
/* loaded from: classes.dex */
public final class C11192d {

    /* renamed from: i */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52582i = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f52583j = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    public final List<DeferrableSurface> f52584a;

    /* renamed from: b */
    public final InterfaceC11197f f52585b;

    /* renamed from: c */
    public final int f52586c;

    /* renamed from: d */
    public final Range<Integer> f52587d;

    /* renamed from: e */
    public final List<AbstractC46943pa0> f52588e;

    /* renamed from: f */
    public final boolean f52589f;

    /* renamed from: g */
    public final C51672xY5 f52590g;

    /* renamed from: h */
    public final InterfaceC51685xa0 f52591h;

    /* renamed from: androidx.camera.core.impl.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11194b {
        /* renamed from: a */
        void mo33844a(InterfaceC11225s<?> interfaceC11225s, C11193a c11193a);
    }

    public C11192d(List<DeferrableSurface> list, InterfaceC11197f interfaceC11197f, int i, Range<Integer> range, List<AbstractC46943pa0> list2, boolean z, C51672xY5 c51672xY5, InterfaceC51685xa0 interfaceC51685xa0) {
        this.f52584a = list;
        this.f52585b = interfaceC11197f;
        this.f52586c = i;
        this.f52587d = range;
        this.f52588e = Collections.unmodifiableList(list2);
        this.f52589f = z;
        this.f52590g = c51672xY5;
        this.f52591h = interfaceC51685xa0;
    }

    /* renamed from: a */
    public static C11192d m69452a() {
        return new C11193a().m69436h();
    }

    /* renamed from: b */
    public List<AbstractC46943pa0> m69451b() {
        return this.f52588e;
    }

    /* renamed from: c */
    public InterfaceC51685xa0 m69450c() {
        return this.f52591h;
    }

    /* renamed from: d */
    public Range<Integer> m69449d() {
        return this.f52587d;
    }

    /* renamed from: e */
    public InterfaceC11197f m69448e() {
        return this.f52585b;
    }

    /* renamed from: f */
    public List<DeferrableSurface> m69447f() {
        return Collections.unmodifiableList(this.f52584a);
    }

    /* renamed from: g */
    public C51672xY5 m69446g() {
        return this.f52590g;
    }

    /* renamed from: h */
    public int m69445h() {
        return this.f52586c;
    }

    /* renamed from: i */
    public boolean m69444i() {
        return this.f52589f;
    }

    /* renamed from: androidx.camera.core.impl.d$a */
    /* loaded from: classes.dex */
    public static final class C11193a {

        /* renamed from: a */
        public final Set<DeferrableSurface> f52592a;

        /* renamed from: b */
        public InterfaceC11208l f52593b;

        /* renamed from: c */
        public int f52594c;

        /* renamed from: d */
        public Range<Integer> f52595d;

        /* renamed from: e */
        public List<AbstractC46943pa0> f52596e;

        /* renamed from: f */
        public boolean f52597f;

        /* renamed from: g */
        public JX2 f52598g;

        /* renamed from: h */
        public InterfaceC51685xa0 f52599h;

        public C11193a() {
            this.f52592a = new HashSet();
            this.f52593b = C11209m.m69372V();
            this.f52594c = -1;
            this.f52595d = BR5.f2318a;
            this.f52596e = new ArrayList();
            this.f52597f = false;
            this.f52598g = JX2.m100301f();
        }

        /* renamed from: j */
        public static C11193a m69434j(InterfaceC11225s<?> interfaceC11225s) {
            InterfaceC11194b m69271o = interfaceC11225s.m69271o(null);
            if (m69271o != null) {
                C11193a c11193a = new C11193a();
                m69271o.mo33844a(interfaceC11225s, c11193a);
                return c11193a;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC11225s.m86619q(interfaceC11225s.toString()));
        }

        /* renamed from: k */
        public static C11193a m69433k(C11192d c11192d) {
            return new C11193a(c11192d);
        }

        /* renamed from: a */
        public void m69443a(Collection<AbstractC46943pa0> collection) {
            for (AbstractC46943pa0 abstractC46943pa0 : collection) {
                m69441c(abstractC46943pa0);
            }
        }

        /* renamed from: b */
        public void m69442b(C51672xY5 c51672xY5) {
            this.f52598g.m100302e(c51672xY5);
        }

        /* renamed from: c */
        public void m69441c(AbstractC46943pa0 abstractC46943pa0) {
            if (this.f52596e.contains(abstractC46943pa0)) {
                return;
            }
            this.f52596e.add(abstractC46943pa0);
        }

        /* renamed from: d */
        public <T> void m69440d(InterfaceC11197f.AbstractC11198a<T> abstractC11198a, T t) {
            this.f52593b.mo69373C(abstractC11198a, t);
        }

        /* renamed from: e */
        public void m69439e(InterfaceC11197f interfaceC11197f) {
            for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : interfaceC11197f.mo69357g()) {
                Object mo69360d = this.f52593b.mo69360d(abstractC11198a, null);
                Object mo69363a = interfaceC11197f.mo69363a(abstractC11198a);
                if (mo69360d instanceof YW2) {
                    ((YW2) mo69360d).m74950a(((YW2) mo69363a).m74948c());
                } else {
                    if (mo69363a instanceof YW2) {
                        mo69363a = ((YW2) mo69363a).clone();
                    }
                    this.f52593b.mo69369n(abstractC11198a, interfaceC11197f.mo69356h(abstractC11198a), mo69363a);
                }
            }
        }

        /* renamed from: f */
        public void m69438f(DeferrableSurface deferrableSurface) {
            this.f52592a.add(deferrableSurface);
        }

        /* renamed from: g */
        public void m69437g(String str, Object obj) {
            this.f52598g.m100299h(str, obj);
        }

        /* renamed from: h */
        public C11192d m69436h() {
            return new C11192d(new ArrayList(this.f52592a), C11210n.m69366T(this.f52593b), this.f52594c, this.f52595d, this.f52596e, this.f52597f, C51672xY5.m5017b(this.f52598g), this.f52599h);
        }

        /* renamed from: i */
        public void m69435i() {
            this.f52592a.clear();
        }

        /* renamed from: l */
        public Range<Integer> m69432l() {
            return this.f52595d;
        }

        /* renamed from: m */
        public Set<DeferrableSurface> m69431m() {
            return this.f52592a;
        }

        /* renamed from: n */
        public int m69430n() {
            return this.f52594c;
        }

        /* renamed from: o */
        public boolean m69429o(AbstractC46943pa0 abstractC46943pa0) {
            return this.f52596e.remove(abstractC46943pa0);
        }

        /* renamed from: p */
        public void m69428p(InterfaceC51685xa0 interfaceC51685xa0) {
            this.f52599h = interfaceC51685xa0;
        }

        /* renamed from: q */
        public void m69427q(Range<Integer> range) {
            this.f52595d = range;
        }

        /* renamed from: r */
        public void m69426r(InterfaceC11197f interfaceC11197f) {
            this.f52593b = C11209m.m69371W(interfaceC11197f);
        }

        /* renamed from: s */
        public void m69425s(int i) {
            this.f52594c = i;
        }

        /* renamed from: t */
        public void m69424t(boolean z) {
            this.f52597f = z;
        }

        public C11193a(C11192d c11192d) {
            HashSet hashSet = new HashSet();
            this.f52592a = hashSet;
            this.f52593b = C11209m.m69372V();
            this.f52594c = -1;
            this.f52595d = BR5.f2318a;
            this.f52596e = new ArrayList();
            this.f52597f = false;
            this.f52598g = JX2.m100301f();
            hashSet.addAll(c11192d.f52584a);
            this.f52593b = C11209m.m69371W(c11192d.f52585b);
            this.f52594c = c11192d.f52586c;
            this.f52595d = c11192d.f52587d;
            this.f52596e.addAll(c11192d.m69451b());
            this.f52597f = c11192d.m69444i();
            this.f52598g = JX2.m100300g(c11192d.m69446g());
        }
    }
}
