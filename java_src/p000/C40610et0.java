package p000;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p000.C40610et0;
/* renamed from: et0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40610et0 implements InterfaceC35051Os0, InterfaceC36689Vs0 {

    /* renamed from: h */
    public static final X94<Set<Object>> f79053h = new X94() { // from class: bt0
        @Override // p000.X94
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    public final Map<C32711Es0<?>, X94<?>> f79054a;

    /* renamed from: b */
    public final Map<C52292yb4<?>, X94<?>> f79055b;

    /* renamed from: c */
    public final Map<C52292yb4<?>, C34549Mo2<?>> f79056c;

    /* renamed from: d */
    public final List<X94<ComponentRegistrar>> f79057d;

    /* renamed from: e */
    public final C32136Cg1 f79058e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f79059f;

    /* renamed from: g */
    public final InterfaceC37625Zs0 f79060g;

    /* renamed from: et0$b */
    /* loaded from: classes6.dex */
    public static final class C20131b {

        /* renamed from: a */
        public final Executor f79061a;

        /* renamed from: b */
        public final List<X94<ComponentRegistrar>> f79062b = new ArrayList();

        /* renamed from: c */
        public final List<C32711Es0<?>> f79063c = new ArrayList();

        /* renamed from: d */
        public InterfaceC37625Zs0 f79064d = InterfaceC37625Zs0.f49421a;

        public C20131b(Executor executor) {
            this.f79061a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m42431f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public C20131b m42435b(C32711Es0<?> c32711Es0) {
            this.f79063c.add(c32711Es0);
            return this;
        }

        /* renamed from: c */
        public C20131b m42434c(final ComponentRegistrar componentRegistrar) {
            this.f79062b.add(new X94() { // from class: ft0
                @Override // p000.X94
                public final Object get() {
                    ComponentRegistrar m42431f;
                    m42431f = C40610et0.C20131b.m42431f(ComponentRegistrar.this);
                    return m42431f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public C20131b m42433d(Collection<X94<ComponentRegistrar>> collection) {
            this.f79062b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C40610et0 m42432e() {
            return new C40610et0(this.f79061a, this.f79062b, this.f79063c, this.f79064d);
        }

        /* renamed from: g */
        public C20131b m42430g(InterfaceC37625Zs0 interfaceC37625Zs0) {
            this.f79064d = interfaceC37625Zs0;
            return this;
        }
    }

    /* renamed from: l */
    public static C20131b m42448l(Executor executor) {
        return new C20131b(executor);
    }

    /* renamed from: p */
    public static <T> List<T> m42444p(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m42443q(C32711Es0 c32711Es0) {
        return c32711Es0.m108306h().mo1631a(new SM4(c32711Es0, this));
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: a */
    public synchronized <T> X94<Set<T>> mo42454a(C52292yb4<T> c52292yb4) {
        C34549Mo2<?> c34549Mo2 = this.f79056c.get(c52292yb4);
        if (c34549Mo2 != null) {
            return c34549Mo2;
        }
        return (X94<Set<T>>) f79053h;
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: e */
    public <T> InterfaceC41597gZ0<T> mo42453e(C52292yb4<T> c52292yb4) {
        X94<T> mo42452f = mo42452f(c52292yb4);
        if (mo42452f == null) {
            return C47779qy3.m16720e();
        }
        if (mo42452f instanceof C47779qy3) {
            return (C47779qy3) mo42452f;
        }
        return C47779qy3.m16716i(mo42452f);
    }

    @Override // p000.InterfaceC35051Os0
    /* renamed from: f */
    public synchronized <T> X94<T> mo42452f(C52292yb4<T> c52292yb4) {
        FZ3.m106945c(c52292yb4, "Null interface requested.");
        return (X94<T>) this.f79055b.get(c52292yb4);
    }

    /* renamed from: m */
    public final void m42447m(List<C32711Es0<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<X94<ComponentRegistrar>> it = this.f79057d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f79060g.mo72381a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f79054a.isEmpty()) {
                HF0.m104108a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f79054a.keySet());
                arrayList2.addAll(list);
                HF0.m104108a(arrayList2);
            }
            for (final C32711Es0<?> c32711Es0 : list) {
                this.f79054a.put(c32711Es0, new C37339Ym2(new X94() { // from class: at0
                    @Override // p000.X94
                    public final Object get() {
                        Object m42443q;
                        m42443q = C40610et0.this.m42443q(c32711Es0);
                        return m42443q;
                    }
                }));
            }
            arrayList.addAll(m42438v(list));
            arrayList.addAll(m42437w());
            m42439u();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m42440t();
    }

    /* renamed from: n */
    public final void m42446n(Map<C32711Es0<?>, X94<?>> map, boolean z) {
        for (Map.Entry<C32711Es0<?>, X94<?>> entry : map.entrySet()) {
            C32711Es0<?> key = entry.getKey();
            X94<?> value = entry.getValue();
            if (key.m108300n() || (key.m108299o() && z)) {
                value.get();
            }
        }
        this.f79058e.m111904e();
    }

    /* renamed from: o */
    public void m42445o(boolean z) {
        HashMap hashMap;
        if (!C42482i24.m35337a(this.f79059f, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f79054a);
        }
        m42446n(hashMap, z);
    }

    /* renamed from: t */
    public final void m42440t() {
        Boolean bool = this.f79059f.get();
        if (bool != null) {
            m42446n(this.f79054a, bool.booleanValue());
        }
    }

    /* renamed from: u */
    public final void m42439u() {
        for (C32711Es0<?> c32711Es0 : this.f79054a.keySet()) {
            for (C43645k01 c43645k01 : c32711Es0.m108307g()) {
                if (c43645k01.m29487g() && !this.f79056c.containsKey(c43645k01.m29491c())) {
                    this.f79056c.put(c43645k01.m29491c(), C34549Mo2.m94782b(Collections.emptySet()));
                } else if (this.f79055b.containsKey(c43645k01.m29491c())) {
                    continue;
                } else if (!c43645k01.m29488f()) {
                    if (!c43645k01.m29487g()) {
                        this.f79055b.put(c43645k01.m29491c(), C47779qy3.m16720e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c32711Es0, c43645k01.m29491c()));
                }
            }
        }
    }

    /* renamed from: v */
    public final List<Runnable> m42438v(List<C32711Es0<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C32711Es0<?> c32711Es0 : list) {
            if (c32711Es0.m108298p()) {
                final X94<?> x94 = this.f79054a.get(c32711Es0);
                for (C52292yb4<? super Object> c52292yb4 : c32711Es0.m108304j()) {
                    if (!this.f79055b.containsKey(c52292yb4)) {
                        this.f79055b.put(c52292yb4, x94);
                    } else {
                        final C47779qy3 c47779qy3 = (C47779qy3) this.f79055b.get(c52292yb4);
                        arrayList.add(new Runnable() { // from class: ct0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C47779qy3.this.m16715j(x94);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public final List<Runnable> m42437w() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C32711Es0<?>, X94<?>> entry : this.f79054a.entrySet()) {
            C32711Es0<?> key = entry.getKey();
            if (!key.m108298p()) {
                X94<?> value = entry.getValue();
                for (C52292yb4<? super Object> c52292yb4 : key.m108304j()) {
                    if (!hashMap.containsKey(c52292yb4)) {
                        hashMap.put(c52292yb4, new HashSet());
                    }
                    ((Set) hashMap.get(c52292yb4)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f79056c.containsKey(entry2.getKey())) {
                this.f79056c.put((C52292yb4) entry2.getKey(), C34549Mo2.m94782b((Collection) entry2.getValue()));
            } else {
                final C34549Mo2<?> c34549Mo2 = this.f79056c.get(entry2.getKey());
                for (final X94 x94 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: dt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C34549Mo2.this.m94783a(x94);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    public C40610et0(Executor executor, Iterable<X94<ComponentRegistrar>> iterable, Collection<C32711Es0<?>> collection, InterfaceC37625Zs0 interfaceC37625Zs0) {
        this.f79054a = new HashMap();
        this.f79055b = new HashMap();
        this.f79056c = new HashMap();
        this.f79059f = new AtomicReference<>();
        C32136Cg1 c32136Cg1 = new C32136Cg1(executor);
        this.f79058e = c32136Cg1;
        this.f79060g = interfaceC37625Zs0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C32711Es0.m108295s(c32136Cg1, C32136Cg1.class, InterfaceC42734iT5.class, InterfaceC46354oa4.class));
        arrayList.add(C32711Es0.m108295s(this, InterfaceC36689Vs0.class, new Class[0]));
        for (C32711Es0<?> c32711Es0 : collection) {
            if (c32711Es0 != null) {
                arrayList.add(c32711Es0);
            }
        }
        this.f79057d = m42444p(iterable);
        m42447m(arrayList);
    }
}
