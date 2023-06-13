package androidx.camera.core.impl;

import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.C11222r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: androidx.camera.core.impl.r */
/* loaded from: classes.dex */
public final class C11222r {

    /* renamed from: a */
    public final String f52662a;

    /* renamed from: b */
    public final Map<String, C11224b> f52663b = new LinkedHashMap();

    /* renamed from: androidx.camera.core.impl.r$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11223a {
        /* renamed from: a */
        boolean mo69284a(C11224b c11224b);
    }

    /* renamed from: androidx.camera.core.impl.r$b */
    /* loaded from: classes.dex */
    public static final class C11224b {

        /* renamed from: a */
        public final C11213q f52664a;

        /* renamed from: b */
        public final InterfaceC11225s<?> f52665b;

        /* renamed from: c */
        public boolean f52666c = false;

        /* renamed from: d */
        public boolean f52667d = false;

        public C11224b(C11213q c11213q, InterfaceC11225s<?> interfaceC11225s) {
            this.f52664a = c11213q;
            this.f52665b = interfaceC11225s;
        }

        /* renamed from: a */
        public boolean m69283a() {
            return this.f52667d;
        }

        /* renamed from: b */
        public boolean m69282b() {
            return this.f52666c;
        }

        /* renamed from: c */
        public C11213q m69281c() {
            return this.f52664a;
        }

        /* renamed from: d */
        public InterfaceC11225s<?> m69280d() {
            return this.f52665b;
        }

        /* renamed from: e */
        public void m69279e(boolean z) {
            this.f52667d = z;
        }

        /* renamed from: f */
        public void m69278f(boolean z) {
            this.f52666c = z;
        }
    }

    public C11222r(String str) {
        this.f52662a = str;
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m69293m(C11224b c11224b) {
        return c11224b.m69283a() && c11224b.m69282b();
    }

    /* renamed from: d */
    public C11213q.C11221g m69302d() {
        C11213q.C11221g c11221g = new C11213q.C11221g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C11224b> entry : this.f52663b.entrySet()) {
            C11224b value = entry.getValue();
            if (value.m69283a() && value.m69282b()) {
                c11221g.m69312a(value.m69281c());
                arrayList.add(entry.getKey());
            }
        }
        C33928Jx2.m99533a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f52662a);
        return c11221g;
    }

    /* renamed from: e */
    public Collection<C11213q> m69301e() {
        return Collections.unmodifiableCollection(m69296j(new InterfaceC11223a() { // from class: Uf6
            @Override // androidx.camera.core.impl.C11222r.InterfaceC11223a
            /* renamed from: a */
            public final boolean mo69284a(C11222r.C11224b c11224b) {
                boolean m69293m;
                m69293m = C11222r.m69293m(c11224b);
                return m69293m;
            }
        }));
    }

    /* renamed from: f */
    public C11213q.C11221g m69300f() {
        C11213q.C11221g c11221g = new C11213q.C11221g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C11224b> entry : this.f52663b.entrySet()) {
            C11224b value = entry.getValue();
            if (value.m69282b()) {
                c11221g.m69312a(value.m69281c());
                arrayList.add(entry.getKey());
            }
        }
        C33928Jx2.m99533a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f52662a);
        return c11221g;
    }

    /* renamed from: g */
    public Collection<C11213q> m69299g() {
        return Collections.unmodifiableCollection(m69296j(new InterfaceC11223a() { // from class: Sf6
            @Override // androidx.camera.core.impl.C11222r.InterfaceC11223a
            /* renamed from: a */
            public final boolean mo69284a(C11222r.C11224b c11224b) {
                boolean m69282b;
                m69282b = c11224b.m69282b();
                return m69282b;
            }
        }));
    }

    /* renamed from: h */
    public Collection<InterfaceC11225s<?>> m69298h() {
        return Collections.unmodifiableCollection(m69295k(new InterfaceC11223a() { // from class: Tf6
            @Override // androidx.camera.core.impl.C11222r.InterfaceC11223a
            /* renamed from: a */
            public final boolean mo69284a(C11222r.C11224b c11224b) {
                boolean m69282b;
                m69282b = c11224b.m69282b();
                return m69282b;
            }
        }));
    }

    /* renamed from: i */
    public final C11224b m69297i(String str, C11213q c11213q, InterfaceC11225s<?> interfaceC11225s) {
        C11224b c11224b = this.f52663b.get(str);
        if (c11224b == null) {
            C11224b c11224b2 = new C11224b(c11213q, interfaceC11225s);
            this.f52663b.put(str, c11224b2);
            return c11224b2;
        }
        return c11224b;
    }

    /* renamed from: j */
    public final Collection<C11213q> m69296j(InterfaceC11223a interfaceC11223a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C11224b> entry : this.f52663b.entrySet()) {
            if (interfaceC11223a == null || interfaceC11223a.mo69284a(entry.getValue())) {
                arrayList.add(entry.getValue().m69281c());
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public final Collection<InterfaceC11225s<?>> m69295k(InterfaceC11223a interfaceC11223a) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C11224b> entry : this.f52663b.entrySet()) {
            if (interfaceC11223a == null || interfaceC11223a.mo69284a(entry.getValue())) {
                arrayList.add(entry.getValue().m69280d());
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public boolean m69294l(String str) {
        if (!this.f52663b.containsKey(str)) {
            return false;
        }
        return this.f52663b.get(str).m69282b();
    }

    /* renamed from: p */
    public void m69290p(String str) {
        this.f52663b.remove(str);
    }

    /* renamed from: q */
    public void m69289q(String str, C11213q c11213q, InterfaceC11225s<?> interfaceC11225s) {
        m69297i(str, c11213q, interfaceC11225s).m69279e(true);
    }

    /* renamed from: r */
    public void m69288r(String str, C11213q c11213q, InterfaceC11225s<?> interfaceC11225s) {
        m69297i(str, c11213q, interfaceC11225s).m69278f(true);
    }

    /* renamed from: s */
    public void m69287s(String str) {
        if (!this.f52663b.containsKey(str)) {
            return;
        }
        C11224b c11224b = this.f52663b.get(str);
        c11224b.m69278f(false);
        if (!c11224b.m69283a()) {
            this.f52663b.remove(str);
        }
    }

    /* renamed from: t */
    public void m69286t(String str) {
        if (!this.f52663b.containsKey(str)) {
            return;
        }
        C11224b c11224b = this.f52663b.get(str);
        c11224b.m69279e(false);
        if (!c11224b.m69282b()) {
            this.f52663b.remove(str);
        }
    }

    /* renamed from: u */
    public void m69285u(String str, C11213q c11213q, InterfaceC11225s<?> interfaceC11225s) {
        if (!this.f52663b.containsKey(str)) {
            return;
        }
        C11224b c11224b = new C11224b(c11213q, interfaceC11225s);
        C11224b c11224b2 = this.f52663b.get(str);
        c11224b.m69278f(c11224b2.m69282b());
        c11224b.m69279e(c11224b2.m69283a());
        this.f52663b.put(str, c11224b);
    }
}
