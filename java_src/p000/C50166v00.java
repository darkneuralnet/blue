package p000;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: v00  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50166v00 {

    /* renamed from: a */
    public WB1 f113294a;

    /* renamed from: b */
    public C38409bC1 f113295b;

    /* renamed from: c */
    public InterfaceC49573u00 f113296c;

    /* renamed from: d */
    public Map f113297d;

    public C50166v00(WB1 wb1) {
        this(wb1, InterfaceC49573u00.f111458a);
    }

    /* renamed from: f */
    public static WB1 m9399f(WB1 wb1, InterfaceC49573u00 interfaceC49573u00) {
        return new C50166v00(wb1, interfaceC49573u00).m9400e();
    }

    /* renamed from: h */
    public static boolean m9397h(WB1 wb1, InterfaceC49573u00 interfaceC49573u00) {
        int mo77244F;
        if (wb1.mo77226r0() || (mo77244F = wb1.mo77244F()) == 0) {
            return false;
        }
        if (mo77244F != 1) {
            return true;
        }
        return !m9399f(wb1, interfaceC49573u00).mo77226r0();
    }

    /* renamed from: a */
    public final void m9404a(C52053yB0 c52053yB0) {
        C47329qD0 c47329qD0 = (C47329qD0) this.f113297d.get(c52053yB0);
        if (c47329qD0 == null) {
            c47329qD0 = new C47329qD0();
            this.f113297d.put(c52053yB0, c47329qD0);
        }
        c47329qD0.f104919a++;
    }

    /* renamed from: b */
    public final WB1 m9403b(C32002Br2 c32002Br2) {
        if (this.f113294a.mo77226r0()) {
            return m9398g();
        }
        if (c32002Br2.mo98233T0()) {
            if (this.f113296c.mo11111a(2)) {
                return c32002Br2.m113437R0();
            }
            return this.f113295b.m64842m();
        }
        return this.f113295b.m64840o(new FW3[]{c32002Br2.m113437R0(), c32002Br2.m113439O0()});
    }

    /* renamed from: c */
    public final WB1 m9402c(DW2 dw2) {
        if (this.f113294a.mo77226r0()) {
            return m9398g();
        }
        C52053yB0[] m9401d = m9401d(dw2);
        if (m9401d.length == 1) {
            return this.f113295b.m64835t(m9401d[0]);
        }
        return this.f113295b.m64839p(m9401d);
    }

    /* renamed from: d */
    public final C52053yB0[] m9401d(DW2 dw2) {
        ArrayList arrayList = new ArrayList();
        this.f113297d = new TreeMap();
        for (int i = 0; i < dw2.mo77232f0(); i++) {
            C32002Br2 c32002Br2 = (C32002Br2) dw2.mo77236d0(i);
            if (c32002Br2.mo77231g0() != 0) {
                m9404a(c32002Br2.m113441L0(0));
                m9404a(c32002Br2.m113441L0(c32002Br2.mo77231g0() - 1));
            }
        }
        for (Map.Entry entry : this.f113297d.entrySet()) {
            if (this.f113296c.mo11111a(((C47329qD0) entry.getValue()).f104919a)) {
                arrayList.add(entry.getKey());
            }
        }
        return BB0.m114277i(arrayList);
    }

    /* renamed from: e */
    public WB1 m9400e() {
        WB1 wb1 = this.f113294a;
        if (wb1 instanceof C32002Br2) {
            return m9403b((C32002Br2) wb1);
        }
        if (wb1 instanceof DW2) {
            return m9402c((DW2) wb1);
        }
        return wb1.mo77241N();
    }

    /* renamed from: g */
    public final VW2 m9398g() {
        return this.f113295b.m64842m();
    }

    public C50166v00(WB1 wb1, InterfaceC49573u00 interfaceC49573u00) {
        this.f113294a = wb1;
        this.f113295b = wb1.m78758c0();
        this.f113296c = interfaceC49573u00;
    }
}
