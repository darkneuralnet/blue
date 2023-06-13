package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* renamed from: Ow1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35088Ow1 {

    /* renamed from: a */
    public final C49364tf0 f27592a;

    @FunctionalInterface
    /* renamed from: Ow1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6207a {
        /* renamed from: a */
        void mo91177a(DX5 dx5);
    }

    public C35088Ow1(C36099Te4 c36099Te4) {
        this.f27592a = (C49364tf0) c36099Te4.m83238b(C49364tf0.class);
    }

    /* renamed from: a */
    public final void m91181a(Set<DX5> set) {
        for (DX5 dx5 : set) {
            dx5.mo100284c().mo88420o(dx5);
        }
    }

    /* renamed from: b */
    public final void m91180b(Set<DX5> set) {
        for (DX5 dx5 : set) {
            dx5.mo100284c().mo15594p(dx5);
        }
    }

    /* renamed from: c */
    public void m91179c(DX5 dx5, List<DX5> list, List<DX5> list2, InterfaceC6207a interfaceC6207a) {
        DX5 next;
        DX5 next2;
        if (m91178d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<DX5> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != dx5) {
                linkedHashSet.add(next2);
            }
            m91180b(linkedHashSet);
        }
        interfaceC6207a.mo91177a(dx5);
        if (m91178d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<DX5> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != dx5) {
                linkedHashSet2.add(next);
            }
            m91181a(linkedHashSet2);
        }
    }

    /* renamed from: d */
    public boolean m91178d() {
        return this.f27592a != null;
    }
}
