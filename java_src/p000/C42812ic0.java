package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* renamed from: ic0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42812ic0 {

    /* renamed from: b */
    public static final C42812ic0 f87521b = new C23290a().m33756d(0).m33758b();

    /* renamed from: c */
    public static final C42812ic0 f87522c = new C23290a().m33756d(1).m33758b();

    /* renamed from: a */
    public LinkedHashSet<InterfaceC33026Gb0> f87523a;

    public C42812ic0(LinkedHashSet<InterfaceC33026Gb0> linkedHashSet) {
        this.f87523a = linkedHashSet;
    }

    /* renamed from: a */
    public LinkedHashSet<InterfaceC34196Lb0> m33764a(LinkedHashSet<InterfaceC34196Lb0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC34196Lb0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo23505b());
        }
        List<InterfaceC33728Jb0> m33763b = m33763b(arrayList);
        LinkedHashSet<InterfaceC34196Lb0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<InterfaceC34196Lb0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC34196Lb0 next = it2.next();
            if (m33763b.contains(next.mo23505b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: b */
    public List<InterfaceC33728Jb0> m33763b(List<InterfaceC33728Jb0> list) {
        List<InterfaceC33728Jb0> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC33026Gb0> it = this.f87523a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().mo26747a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public LinkedHashSet<InterfaceC33026Gb0> m33762c() {
        return this.f87523a;
    }

    /* renamed from: d */
    public Integer m33761d() {
        Iterator<InterfaceC33026Gb0> it = this.f87523a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC33026Gb0 next = it.next();
            if (next instanceof C44733lq2) {
                Integer valueOf = Integer.valueOf(((C44733lq2) next).m26746b());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: e */
    public InterfaceC34196Lb0 m33760e(LinkedHashSet<InterfaceC34196Lb0> linkedHashSet) {
        Iterator<InterfaceC34196Lb0> it = m33764a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    /* renamed from: ic0$a */
    /* loaded from: classes.dex */
    public static final class C23290a {

        /* renamed from: a */
        public final LinkedHashSet<InterfaceC33026Gb0> f87524a;

        public C23290a() {
            this.f87524a = new LinkedHashSet<>();
        }

        /* renamed from: c */
        public static C23290a m33757c(C42812ic0 c42812ic0) {
            return new C23290a(c42812ic0.m33762c());
        }

        /* renamed from: a */
        public C23290a m33759a(InterfaceC33026Gb0 interfaceC33026Gb0) {
            this.f87524a.add(interfaceC33026Gb0);
            return this;
        }

        /* renamed from: b */
        public C42812ic0 m33758b() {
            return new C42812ic0(this.f87524a);
        }

        /* renamed from: d */
        public C23290a m33756d(int i) {
            boolean z;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "The specified lens facing is invalid.");
            this.f87524a.add(new C44733lq2(i));
            return this;
        }

        public C23290a(LinkedHashSet<InterfaceC33026Gb0> linkedHashSet) {
            this.f87524a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
