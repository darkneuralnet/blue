package p000;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: SM4 */
/* loaded from: classes6.dex */
public final class SM4 implements InterfaceC35051Os0 {

    /* renamed from: a */
    public final Set<C52292yb4<?>> f33546a;

    /* renamed from: b */
    public final Set<C52292yb4<?>> f33547b;

    /* renamed from: c */
    public final Set<C52292yb4<?>> f33548c;

    /* renamed from: d */
    public final Set<C52292yb4<?>> f33549d;

    /* renamed from: e */
    public final Set<C52292yb4<?>> f33550e;

    /* renamed from: f */
    public final Set<Class<?>> f33551f;

    /* renamed from: g */
    public final InterfaceC35051Os0 f33552g;

    /* renamed from: SM4$a */
    /* loaded from: classes6.dex */
    public static class C7405a implements InterfaceC46354oa4 {

        /* renamed from: a */
        public final Set<Class<?>> f33553a;

        /* renamed from: b */
        public final InterfaceC46354oa4 f33554b;

        public C7405a(Set<Class<?>> set, InterfaceC46354oa4 interfaceC46354oa4) {
            this.f33553a = set;
            this.f33554b = interfaceC46354oa4;
        }
    }

    public SM4(C32711Es0<?> c32711Es0, InterfaceC35051Os0 interfaceC35051Os0) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C43645k01 c43645k01 : c32711Es0.m108307g()) {
            if (c43645k01.m29489e()) {
                if (c43645k01.m29487g()) {
                    hashSet4.add(c43645k01.m29491c());
                } else {
                    hashSet.add(c43645k01.m29491c());
                }
            } else if (c43645k01.m29490d()) {
                hashSet3.add(c43645k01.m29491c());
            } else if (c43645k01.m29487g()) {
                hashSet5.add(c43645k01.m29491c());
            } else {
                hashSet2.add(c43645k01.m29491c());
            }
        }
        if (!c32711Es0.m108303k().isEmpty()) {
            hashSet.add(C52292yb4.m3202b(InterfaceC46354oa4.class));
        }
        this.f33546a = Collections.unmodifiableSet(hashSet);
        this.f33547b = Collections.unmodifiableSet(hashSet2);
        this.f33548c = Collections.unmodifiableSet(hashSet3);
        this.f33549d = Collections.unmodifiableSet(hashSet4);
        this.f33550e = Collections.unmodifiableSet(hashSet5);
        this.f33551f = c32711Es0.m108303k();
        this.f33552g = interfaceC35051Os0;
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: a */
    public <T> X94<Set<T>> mo42454a(C52292yb4<T> c52292yb4) {
        if (this.f33550e.contains(c52292yb4)) {
            return this.f33552g.mo42454a(c52292yb4);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c52292yb4));
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: c */
    public <T> T mo85623c(C52292yb4<T> c52292yb4) {
        if (this.f33546a.contains(c52292yb4)) {
            return (T) this.f33552g.mo85623c(c52292yb4);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", c52292yb4));
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: d */
    public <T> X94<T> mo85622d(Class<T> cls) {
        return mo42452f(C52292yb4.m3202b(cls));
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: e */
    public <T> InterfaceC41597gZ0<T> mo42453e(C52292yb4<T> c52292yb4) {
        if (this.f33548c.contains(c52292yb4)) {
            return this.f33552g.mo42453e(c52292yb4);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c52292yb4));
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: f */
    public <T> X94<T> mo42452f(C52292yb4<T> c52292yb4) {
        if (this.f33547b.contains(c52292yb4)) {
            return this.f33552g.mo42452f(c52292yb4);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", c52292yb4));
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: g */
    public <T> Set<T> mo85621g(C52292yb4<T> c52292yb4) {
        if (this.f33549d.contains(c52292yb4)) {
            return this.f33552g.mo85621g(c52292yb4);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", c52292yb4));
    }

    @Override // p000.InterfaceC35051Os0
    public <T> T get(Class<T> cls) {
        if (this.f33546a.contains(C52292yb4.m3202b(cls))) {
            T t = (T) this.f33552g.get(cls);
            if (!cls.equals(InterfaceC46354oa4.class)) {
                return t;
            }
            return (T) new C7405a(this.f33551f, (InterfaceC46354oa4) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: h */
    public <T> InterfaceC41597gZ0<T> mo85620h(Class<T> cls) {
        return mo42453e(C52292yb4.m3202b(cls));
    }
}
