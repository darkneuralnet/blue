package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.InterfaceC11197f;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* renamed from: androidx.camera.core.impl.n */
/* loaded from: classes.dex */
public class C11210n implements InterfaceC11197f {

    /* renamed from: F */
    public static final Comparator<InterfaceC11197f.AbstractC11198a<?>> f52637F;

    /* renamed from: G */
    public static final C11210n f52638G;

    /* renamed from: E */
    public final TreeMap<InterfaceC11197f.AbstractC11198a<?>, Map<InterfaceC11197f.EnumC11200c, Object>> f52639E;

    static {
        Comparator<InterfaceC11197f.AbstractC11198a<?>> comparator = new Comparator() { // from class: ty3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m69365U;
                m69365U = C11210n.m69365U((InterfaceC11197f.AbstractC11198a) obj, (InterfaceC11197f.AbstractC11198a) obj2);
                return m69365U;
            }
        };
        f52637F = comparator;
        f52638G = new C11210n(new TreeMap(comparator));
    }

    public C11210n(TreeMap<InterfaceC11197f.AbstractC11198a<?>, Map<InterfaceC11197f.EnumC11200c, Object>> treeMap) {
        this.f52639E = treeMap;
    }

    /* renamed from: S */
    public static C11210n m69367S() {
        return f52638G;
    }

    /* renamed from: T */
    public static C11210n m69366T(InterfaceC11197f interfaceC11197f) {
        if (C11210n.class.equals(interfaceC11197f.getClass())) {
            return (C11210n) interfaceC11197f;
        }
        TreeMap treeMap = new TreeMap(f52637F);
        for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : interfaceC11197f.mo69357g()) {
            Set<InterfaceC11197f.EnumC11200c> mo69361c = interfaceC11197f.mo69361c(abstractC11198a);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC11197f.EnumC11200c enumC11200c : mo69361c) {
                arrayMap.put(enumC11200c, interfaceC11197f.mo69358f(abstractC11198a, enumC11200c));
            }
            treeMap.put(abstractC11198a, arrayMap);
        }
        return new C11210n(treeMap);
    }

    /* renamed from: U */
    public static /* synthetic */ int m69365U(InterfaceC11197f.AbstractC11198a abstractC11198a, InterfaceC11197f.AbstractC11198a abstractC11198a2) {
        return abstractC11198a.mo69418c().compareTo(abstractC11198a2.mo69418c());
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: a */
    public <ValueT> ValueT mo69363a(InterfaceC11197f.AbstractC11198a<ValueT> abstractC11198a) {
        Map<InterfaceC11197f.EnumC11200c, Object> map = this.f52639E.get(abstractC11198a);
        if (map != null) {
            return (ValueT) map.get((InterfaceC11197f.EnumC11200c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC11198a);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo69362b(String str, InterfaceC11197f.InterfaceC11199b interfaceC11199b) {
        for (Map.Entry<InterfaceC11197f.AbstractC11198a<?>, Map<InterfaceC11197f.EnumC11200c, Object>> entry : this.f52639E.tailMap(InterfaceC11197f.AbstractC11198a.m69420a(str, Void.class)).entrySet()) {
            if (!entry.getKey().mo69418c().startsWith(str) || !interfaceC11199b.mo25218a(entry.getKey())) {
                return;
            }
            while (r0.hasNext()) {
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: c */
    public Set<InterfaceC11197f.EnumC11200c> mo69361c(InterfaceC11197f.AbstractC11198a<?> abstractC11198a) {
        Map<InterfaceC11197f.EnumC11200c, Object> map = this.f52639E.get(abstractC11198a);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: d */
    public <ValueT> ValueT mo69360d(InterfaceC11197f.AbstractC11198a<ValueT> abstractC11198a, ValueT valuet) {
        try {
            return (ValueT) mo69363a(abstractC11198a);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: e */
    public boolean mo69359e(InterfaceC11197f.AbstractC11198a<?> abstractC11198a) {
        return this.f52639E.containsKey(abstractC11198a);
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: f */
    public <ValueT> ValueT mo69358f(InterfaceC11197f.AbstractC11198a<ValueT> abstractC11198a, InterfaceC11197f.EnumC11200c enumC11200c) {
        Map<InterfaceC11197f.EnumC11200c, Object> map = this.f52639E.get(abstractC11198a);
        if (map != null) {
            if (map.containsKey(enumC11200c)) {
                return (ValueT) map.get(enumC11200c);
            }
            throw new IllegalArgumentException("Option does not exist: " + abstractC11198a + " with priority=" + enumC11200c);
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC11198a);
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: g */
    public Set<InterfaceC11197f.AbstractC11198a<?>> mo69357g() {
        return Collections.unmodifiableSet(this.f52639E.keySet());
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f
    /* renamed from: h */
    public InterfaceC11197f.EnumC11200c mo69356h(InterfaceC11197f.AbstractC11198a<?> abstractC11198a) {
        Map<InterfaceC11197f.EnumC11200c, Object> map = this.f52639E.get(abstractC11198a);
        if (map != null) {
            return (InterfaceC11197f.EnumC11200c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC11198a);
    }
}
