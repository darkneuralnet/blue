package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.InterfaceC44592lc1;
/* renamed from: yp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52434yp6 implements InterfaceC44592lc1 {
    /* renamed from: e */
    public static AbstractC52434yp6 m2522e(int i, int i2, List<InterfaceC44592lc1.AbstractC25737a> list, List<InterfaceC44592lc1.AbstractC25739c> list2) {
        InterfaceC44592lc1.AbstractC25737a abstractC25737a;
        HZ3.m103736b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        InterfaceC44592lc1.AbstractC25739c abstractC25739c = list2.get(0);
        if (!list.isEmpty()) {
            abstractC25737a = list.get(0);
        } else {
            abstractC25737a = null;
        }
        return new C28960tu(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), abstractC25737a, abstractC25739c);
    }

    /* renamed from: f */
    public static AbstractC52434yp6 m2521f(InterfaceC44592lc1 interfaceC44592lc1) {
        return m2522e(interfaceC44592lc1.mo6191c(), interfaceC44592lc1.mo6193a(), interfaceC44592lc1.mo6192b(), interfaceC44592lc1.mo6190d());
    }

    /* renamed from: g */
    public abstract InterfaceC44592lc1.AbstractC25737a mo2520g();

    /* renamed from: h */
    public abstract InterfaceC44592lc1.AbstractC25739c mo2519h();
}
