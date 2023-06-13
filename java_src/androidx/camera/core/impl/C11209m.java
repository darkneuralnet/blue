package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.InterfaceC11197f;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
/* renamed from: androidx.camera.core.impl.m */
/* loaded from: classes.dex */
public final class C11209m extends C11210n implements InterfaceC11208l {

    /* renamed from: H */
    public static final InterfaceC11197f.EnumC11200c f52636H = InterfaceC11197f.EnumC11200c.OPTIONAL;

    public C11209m(TreeMap<InterfaceC11197f.AbstractC11198a<?>, Map<InterfaceC11197f.EnumC11200c, Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: V */
    public static C11209m m69372V() {
        return new C11209m(new TreeMap(C11210n.f52637F));
    }

    /* renamed from: W */
    public static C11209m m69371W(InterfaceC11197f interfaceC11197f) {
        TreeMap treeMap = new TreeMap(C11210n.f52637F);
        for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : interfaceC11197f.mo69357g()) {
            Set<InterfaceC11197f.EnumC11200c> mo69361c = interfaceC11197f.mo69361c(abstractC11198a);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC11197f.EnumC11200c enumC11200c : mo69361c) {
                arrayMap.put(enumC11200c, interfaceC11197f.mo69358f(abstractC11198a, enumC11200c));
            }
            treeMap.put(abstractC11198a, arrayMap);
        }
        return new C11209m(treeMap);
    }

    @Override // androidx.camera.core.impl.InterfaceC11208l
    /* renamed from: C */
    public <ValueT> void mo69373C(InterfaceC11197f.AbstractC11198a<ValueT> abstractC11198a, ValueT valuet) {
        mo69369n(abstractC11198a, f52636H, valuet);
    }

    /* renamed from: X */
    public <ValueT> ValueT m69370X(InterfaceC11197f.AbstractC11198a<ValueT> abstractC11198a) {
        return (ValueT) this.f52639E.remove(abstractC11198a);
    }

    @Override // androidx.camera.core.impl.InterfaceC11208l
    /* renamed from: n */
    public <ValueT> void mo69369n(InterfaceC11197f.AbstractC11198a<ValueT> abstractC11198a, InterfaceC11197f.EnumC11200c enumC11200c, ValueT valuet) {
        Map<InterfaceC11197f.EnumC11200c, Object> map = this.f52639E.get(abstractC11198a);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f52639E.put(abstractC11198a, arrayMap);
            arrayMap.put(enumC11200c, valuet);
            return;
        }
        InterfaceC11197f.EnumC11200c enumC11200c2 = (InterfaceC11197f.EnumC11200c) Collections.min(map.keySet());
        if (!Objects.equals(map.get(enumC11200c2), valuet) && InterfaceC11197f.m69422H(enumC11200c2, enumC11200c)) {
            throw new IllegalArgumentException("Option values conflicts: " + abstractC11198a.mo69418c() + ", existing value (" + enumC11200c2 + ")=" + map.get(enumC11200c2) + ", conflicting (" + enumC11200c + ")=" + valuet);
        }
        map.put(enumC11200c, valuet);
    }
}
