package p000;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: HF0 */
/* loaded from: classes6.dex */
public class HF0 {

    /* renamed from: HF0$b */
    /* loaded from: classes6.dex */
    public static class C3110b {

        /* renamed from: a */
        public final C32711Es0<?> f13140a;

        /* renamed from: b */
        public final Set<C3110b> f13141b = new HashSet();

        /* renamed from: c */
        public final Set<C3110b> f13142c = new HashSet();

        public C3110b(C32711Es0<?> c32711Es0) {
            this.f13140a = c32711Es0;
        }

        /* renamed from: a */
        public void m104105a(C3110b c3110b) {
            this.f13141b.add(c3110b);
        }

        /* renamed from: b */
        public void m104104b(C3110b c3110b) {
            this.f13142c.add(c3110b);
        }

        /* renamed from: c */
        public C32711Es0<?> m104103c() {
            return this.f13140a;
        }

        /* renamed from: d */
        public Set<C3110b> m104102d() {
            return this.f13141b;
        }

        /* renamed from: e */
        public boolean m104101e() {
            return this.f13141b.isEmpty();
        }

        /* renamed from: f */
        public boolean m104100f() {
            return this.f13142c.isEmpty();
        }

        /* renamed from: g */
        public void m104099g(C3110b c3110b) {
            this.f13142c.remove(c3110b);
        }
    }

    /* renamed from: HF0$c */
    /* loaded from: classes6.dex */
    public static class C3111c {

        /* renamed from: a */
        public final C52292yb4<?> f13143a;

        /* renamed from: b */
        public final boolean f13144b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C3111c)) {
                return false;
            }
            C3111c c3111c = (C3111c) obj;
            if (!c3111c.f13143a.equals(this.f13143a) || c3111c.f13144b != this.f13144b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f13143a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f13144b).hashCode();
        }

        public C3111c(C52292yb4<?> c52292yb4, boolean z) {
            this.f13143a = c52292yb4;
            this.f13144b = z;
        }
    }

    /* renamed from: a */
    public static void m104108a(List<C32711Es0<?>> list) {
        Set<C3110b> m104106c = m104106c(list);
        Set<C3110b> m104107b = m104107b(m104106c);
        int i = 0;
        while (!m104107b.isEmpty()) {
            C3110b next = m104107b.iterator().next();
            m104107b.remove(next);
            i++;
            for (C3110b c3110b : next.m104102d()) {
                c3110b.m104099g(next);
                if (c3110b.m104100f()) {
                    m104107b.add(c3110b);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C3110b c3110b2 : m104106c) {
            if (!c3110b2.m104100f() && !c3110b2.m104101e()) {
                arrayList.add(c3110b2.m104103c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    /* renamed from: b */
    public static Set<C3110b> m104107b(Set<C3110b> set) {
        HashSet hashSet = new HashSet();
        for (C3110b c3110b : set) {
            if (c3110b.m104100f()) {
                hashSet.add(c3110b);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<C3110b> m104106c(List<C32711Es0<?>> list) {
        Set<C3110b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C32711Es0<?> c32711Es0 : list) {
            C3110b c3110b = new C3110b(c32711Es0);
            for (C52292yb4<? super Object> c52292yb4 : c32711Es0.m108304j()) {
                C3111c c3111c = new C3111c(c52292yb4, !c32711Es0.m108298p());
                if (!hashMap.containsKey(c3111c)) {
                    hashMap.put(c3111c, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c3111c);
                if (!set2.isEmpty() && !c3111c.f13144b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c52292yb4));
                }
                set2.add(c3110b);
            }
        }
        for (Set<C3110b> set3 : hashMap.values()) {
            for (C3110b c3110b2 : set3) {
                for (C43645k01 c43645k01 : c3110b2.m104103c().m108307g()) {
                    if (c43645k01.m29489e() && (set = (Set) hashMap.get(new C3111c(c43645k01.m29491c(), c43645k01.m29487g()))) != null) {
                        for (C3110b c3110b3 : set) {
                            c3110b2.m104105a(c3110b3);
                            c3110b3.m104104b(c3110b2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
