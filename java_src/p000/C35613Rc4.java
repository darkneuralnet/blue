package p000;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.C33567Ij1;
import p000.InterfaceC44592lc1;
/* renamed from: Rc4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35613Rc4 {

    /* renamed from: a */
    public final List<C52885zb4> f32307a;

    /* renamed from: b */
    public final C33567Ij1 f32308b;

    public C35613Rc4(List<C52885zb4> list, C33567Ij1 c33567Ij1) {
        boolean z;
        if (list.isEmpty() && c33567Ij1 == C33567Ij1.f16116a) {
            z = false;
        } else {
            z = true;
        }
        HZ3.m103736b(z, "No preferred quality and fallback strategy.");
        this.f32307a = Collections.unmodifiableList(new ArrayList(list));
        this.f32308b = c33567Ij1;
    }

    /* renamed from: b */
    public static void m86558b(C52885zb4 c52885zb4) {
        boolean m1059a = C52885zb4.m1059a(c52885zb4);
        HZ3.m103736b(m1059a, "Invalid quality: " + c52885zb4);
    }

    /* renamed from: c */
    public static void m86557c(List<C52885zb4> list) {
        for (C52885zb4 c52885zb4 : list) {
            boolean m1059a = C52885zb4.m1059a(c52885zb4);
            HZ3.m103736b(m1059a, "qualities contain invalid quality: " + c52885zb4);
        }
    }

    /* renamed from: d */
    public static C35613Rc4 m86556d(C52885zb4 c52885zb4, C33567Ij1 c33567Ij1) {
        HZ3.m103730h(c52885zb4, "quality cannot be null");
        HZ3.m103730h(c33567Ij1, "fallbackStrategy cannot be null");
        m86558b(c52885zb4);
        return new C35613Rc4(Collections.singletonList(c52885zb4), c33567Ij1);
    }

    /* renamed from: e */
    public static C35613Rc4 m86555e(List<C52885zb4> list, C33567Ij1 c33567Ij1) {
        HZ3.m103730h(list, "qualities cannot be null");
        HZ3.m103730h(c33567Ij1, "fallbackStrategy cannot be null");
        HZ3.m103736b(!list.isEmpty(), "qualities cannot be empty");
        m86557c(list);
        return new C35613Rc4(list, c33567Ij1);
    }

    /* renamed from: g */
    public static Size m86553g(AbstractC52434yp6 abstractC52434yp6) {
        InterfaceC44592lc1.AbstractC25739c mo2519h = abstractC52434yp6.mo2519h();
        return new Size(mo2519h.mo4511k(), mo2519h.mo4514h());
    }

    /* renamed from: h */
    public static Map<C52885zb4, Size> m86552h(InterfaceC33728Jb0 interfaceC33728Jb0) {
        C34553Mo6 m94775d = C34553Mo6.m94775d(interfaceC33728Jb0);
        HashMap hashMap = new HashMap();
        for (C52885zb4 c52885zb4 : m94775d.m94772g()) {
            AbstractC52434yp6 m94773f = m94775d.m94773f(c52885zb4);
            Objects.requireNonNull(m94773f);
            hashMap.put(c52885zb4, m86553g(m94773f));
        }
        return hashMap;
    }

    /* renamed from: i */
    public static List<C52885zb4> m86551i(InterfaceC33728Jb0 interfaceC33728Jb0) {
        return C34553Mo6.m94775d(interfaceC33728Jb0).m94772g();
    }

    /* renamed from: a */
    public final void m86559a(List<C52885zb4> list, Set<C52885zb4> set) {
        C52885zb4 mo101748c;
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        C33928Jx2.m99533a("QualitySelector", "Select quality by fallbackStrategy = " + this.f32308b);
        C33567Ij1 c33567Ij1 = this.f32308b;
        if (c33567Ij1 == C33567Ij1.f16116a) {
            return;
        }
        HZ3.m103728j(c33567Ij1 instanceof C33567Ij1.AbstractC3746b, "Currently only support type RuleStrategy");
        C33567Ij1.AbstractC3746b abstractC3746b = (C33567Ij1.AbstractC3746b) this.f32308b;
        List<C52885zb4> m1058b = C52885zb4.m1058b();
        boolean z = false;
        if (abstractC3746b.mo101748c() == C52885zb4.f121579f) {
            mo101748c = m1058b.get(0);
        } else if (abstractC3746b.mo101748c() == C52885zb4.f121578e) {
            mo101748c = m1058b.get(m1058b.size() - 1);
        } else {
            mo101748c = abstractC3746b.mo101748c();
        }
        int indexOf = m1058b.indexOf(mo101748c);
        if (indexOf != -1) {
            z = true;
        }
        HZ3.m103729i(z);
        ArrayList arrayList = new ArrayList();
        for (int i = indexOf - 1; i >= 0; i--) {
            C52885zb4 c52885zb4 = m1058b.get(i);
            if (list.contains(c52885zb4)) {
                arrayList.add(c52885zb4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = indexOf + 1; i2 < m1058b.size(); i2++) {
            C52885zb4 c52885zb42 = m1058b.get(i2);
            if (list.contains(c52885zb42)) {
                arrayList2.add(c52885zb42);
            }
        }
        C33928Jx2.m99533a("QualitySelector", "sizeSortedQualities = " + m1058b + ", fallback quality = " + mo101748c + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int mo101747d = abstractC3746b.mo101747d();
        if (mo101747d != 0) {
            if (mo101747d != 1) {
                if (mo101747d != 2) {
                    if (mo101747d != 3) {
                        if (mo101747d == 4) {
                            set.addAll(arrayList2);
                            return;
                        }
                        throw new AssertionError("Unhandled fallback strategy: " + this.f32308b);
                    }
                    set.addAll(arrayList2);
                    set.addAll(arrayList);
                    return;
                }
                set.addAll(arrayList);
                return;
            }
            set.addAll(arrayList);
            set.addAll(arrayList2);
        }
    }

    /* renamed from: f */
    public List<C52885zb4> m86554f(InterfaceC33728Jb0 interfaceC33728Jb0) {
        List<C52885zb4> m94772g = C34553Mo6.m94775d(interfaceC33728Jb0).m94772g();
        if (m94772g.isEmpty()) {
            C33928Jx2.m99522l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        C33928Jx2.m99533a("QualitySelector", "supportedQualities = " + m94772g);
        Set<C52885zb4> linkedHashSet = new LinkedHashSet<>();
        Iterator<C52885zb4> it = this.f32307a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C52885zb4 next = it.next();
            if (next == C52885zb4.f121579f) {
                linkedHashSet.addAll(m94772g);
                break;
            } else if (next == C52885zb4.f121578e) {
                ArrayList arrayList = new ArrayList(m94772g);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            } else if (m94772g.contains(next)) {
                linkedHashSet.add(next);
            } else {
                C33928Jx2.m99522l("QualitySelector", "quality is not supported and will be ignored: " + next);
            }
        }
        m86559a(m94772g, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f32307a + ", fallbackStrategy=" + this.f32308b + "}";
    }
}
