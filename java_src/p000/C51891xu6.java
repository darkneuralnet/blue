package p000;

import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.C11236l;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.InterfaceC34196Lb0;
import p000.YV5;
/* renamed from: xu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51891xu6 implements InterfaceC34196Lb0 {

    /* renamed from: b */
    public final Set<AbstractC11253p> f118321b;

    /* renamed from: e */
    public final InterfaceC36578Vf6 f118324e;

    /* renamed from: f */
    public final InterfaceC34196Lb0 f118325f;

    /* renamed from: c */
    public final Map<AbstractC11253p, MV5> f118322c = new HashMap();

    /* renamed from: d */
    public final Map<AbstractC11253p, Boolean> f118323d = new HashMap();

    /* renamed from: g */
    public final AbstractC46943pa0 f118326g = m4457r();

    /* renamed from: xu6$a */
    /* loaded from: classes.dex */
    public class C30339a extends AbstractC46943pa0 {
        public C30339a() {
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: b */
        public void mo4448b(InterfaceC51685xa0 interfaceC51685xa0) {
            super.mo4448b(interfaceC51685xa0);
            for (AbstractC11253p abstractC11253p : C51891xu6.this.f118321b) {
                C51891xu6.m4471D(interfaceC51685xa0, abstractC11253p.m69050r());
            }
        }
    }

    public C51891xu6(InterfaceC34196Lb0 interfaceC34196Lb0, Set<AbstractC11253p> set, InterfaceC36578Vf6 interfaceC36578Vf6) {
        this.f118325f = interfaceC34196Lb0;
        this.f118324e = interfaceC36578Vf6;
        this.f118321b = set;
        for (AbstractC11253p abstractC11253p : set) {
            this.f118323d.put(abstractC11253p, Boolean.FALSE);
        }
    }

    /* renamed from: D */
    public static void m4471D(InterfaceC51685xa0 interfaceC51685xa0, C11213q c11213q) {
        for (AbstractC46943pa0 abstractC46943pa0 : c11213q.m69349g()) {
            abstractC46943pa0.mo4448b(new C52484yu6(c11213q.m69348h().m69446g(), interfaceC51685xa0));
        }
    }

    /* renamed from: t */
    public static DeferrableSurface m4455t(AbstractC11253p abstractC11253p) {
        boolean z;
        List<DeferrableSurface> m69447f = abstractC11253p.m69050r().m69348h().m69447f();
        if (m69447f.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103729i(z);
        if (m69447f.size() == 1) {
            return m69447f.get(0);
        }
        return null;
    }

    /* renamed from: w */
    public static int m4452w(Set<InterfaceC11225s<?>> set) {
        int i = 0;
        for (InterfaceC11225s<?> interfaceC11225s : set) {
            i = Math.max(i, interfaceC11225s.m69275L());
        }
        return i;
    }

    /* renamed from: A */
    public void m4474A(InterfaceC11208l interfaceC11208l) {
        HashSet hashSet = new HashSet();
        for (AbstractC11253p abstractC11253p : this.f118321b) {
            hashSet.add(abstractC11253p.m69044z(this.f118325f.mo4467d(), null, abstractC11253p.mo3483j(true, this.f118324e)));
        }
        interfaceC11208l.mo69373C(InterfaceC11206k.f52635u, LL4.m97040a(new ArrayList(this.f118325f.mo4467d().mo98715l(34)), C46705p96.m19865j(this.f118325f.mo4462k().mo16394h()), hashSet));
        interfaceC11208l.mo69373C(InterfaceC11225s.f52676z, Integer.valueOf(m4452w(hashSet)));
    }

    /* renamed from: B */
    public void m4473B() {
        for (AbstractC11253p abstractC11253p : this.f118321b) {
            abstractC11253p.mo3495I();
        }
    }

    /* renamed from: C */
    public void m4472C() {
        for (AbstractC11253p abstractC11253p : this.f118321b) {
            abstractC11253p.mo3494J();
        }
    }

    /* renamed from: E */
    public void m4470E(Map<AbstractC11253p, MV5> map) {
        this.f118322c.clear();
        this.f118322c.putAll(map);
        for (Map.Entry<AbstractC11253p, MV5> entry : this.f118322c.entrySet()) {
            AbstractC11253p key = entry.getKey();
            MV5 value = entry.getValue();
            key.mo69070Q(value.m95260n());
            key.m69067T(value.m95254t());
            key.m69077D();
        }
    }

    /* renamed from: F */
    public void m4469F() {
        for (AbstractC11253p abstractC11253p : this.f118321b) {
            abstractC11253p.m69069R(this);
        }
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: c */
    public void mo4468c(AbstractC11253p abstractC11253p) {
        O36.m92961a();
        if (!m4449z(abstractC11253p)) {
            return;
        }
        MV5 m4450y = m4450y(abstractC11253p);
        DeferrableSurface m4455t = m4455t(abstractC11253p);
        if (m4455t != null) {
            m4456s(m4450y, m4455t);
        } else {
            m4450y.m95262l();
        }
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: d */
    public InterfaceC33962Kb0 mo4467d() {
        return this.f118325f.mo4467d();
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: g */
    public void mo4466g(AbstractC11253p abstractC11253p) {
        O36.m92961a();
        if (m4449z(abstractC11253p)) {
            return;
        }
        this.f118323d.put(abstractC11253p, Boolean.TRUE);
        DeferrableSurface m4455t = m4455t(abstractC11253p);
        if (m4455t != null) {
            m4456s(m4450y(abstractC11253p), m4455t);
        }
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: h */
    public void mo4465h(AbstractC11253p abstractC11253p) {
        DeferrableSurface m4455t;
        O36.m92961a();
        MV5 m4450y = m4450y(abstractC11253p);
        m4450y.m95251w();
        if (m4449z(abstractC11253p) && (m4455t = m4455t(abstractC11253p)) != null) {
            m4456s(m4450y, m4455t);
        }
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: i */
    public void mo4464i(AbstractC11253p abstractC11253p) {
        O36.m92961a();
        if (!m4449z(abstractC11253p)) {
            return;
        }
        this.f118323d.put(abstractC11253p, Boolean.FALSE);
        m4450y(abstractC11253p).m95262l();
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: j */
    public InterfaceC37493Zd3<InterfaceC34196Lb0.EnumC5034a> mo4463j() {
        return this.f118325f.mo4463j();
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: k */
    public CameraControlInternal mo4462k() {
        return this.f118325f.mo4462k();
    }

    /* renamed from: m */
    public void m4461m() {
        for (AbstractC11253p abstractC11253p : this.f118321b) {
            abstractC11253p.m69065b(this, null, abstractC11253p.mo3483j(true, this.f118324e));
        }
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: o */
    public void mo4460o(Collection<AbstractC11253p> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: p */
    public void mo4459p(Collection<AbstractC11253p> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: q */
    public boolean mo4458q() {
        return false;
    }

    /* renamed from: r */
    public AbstractC46943pa0 m4457r() {
        return new C30339a();
    }

    /* renamed from: s */
    public final void m4456s(MV5 mv5, DeferrableSurface deferrableSurface) {
        mv5.m95251w();
        try {
            mv5.m95275C(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: u */
    public Set<AbstractC11253p> m4454u() {
        return this.f118321b;
    }

    /* renamed from: v */
    public Map<AbstractC11253p, YV5.AbstractC9796d> m4453v(MV5 mv5) {
        int i;
        HashMap hashMap = new HashMap();
        for (AbstractC11253p abstractC11253p : this.f118321b) {
            if (abstractC11253p instanceof C11236l) {
                i = 1;
            } else {
                i = 2;
            }
            hashMap.put(abstractC11253p, YV5.AbstractC9796d.m74953h(i, 34, mv5.m95260n(), C46705p96.m19865j(mv5.m95260n()), 0, abstractC11253p.m69045y(this)));
        }
        return hashMap;
    }

    /* renamed from: x */
    public AbstractC46943pa0 m4451x() {
        return this.f118326g;
    }

    /* renamed from: y */
    public final MV5 m4450y(AbstractC11253p abstractC11253p) {
        MV5 mv5 = this.f118322c.get(abstractC11253p);
        Objects.requireNonNull(mv5);
        return mv5;
    }

    /* renamed from: z */
    public final boolean m4449z(AbstractC11253p abstractC11253p) {
        Boolean bool = this.f118323d.get(abstractC11253p);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }
}
