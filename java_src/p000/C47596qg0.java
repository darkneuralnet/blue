package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* renamed from: qg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47596qg0 implements InterfaceC49374tg0 {
    @Override // p000.InterfaceC49374tg0
    /* renamed from: a */
    public void mo11949a(InterfaceC48781sg0 interfaceC48781sg0) {
        mo11947c(interfaceC48781sg0, mo11936n(interfaceC48781sg0));
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: b */
    public float mo11948b(InterfaceC48781sg0 interfaceC48781sg0) {
        return interfaceC48781sg0.mo13853f().getElevation();
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: c */
    public void mo11947c(InterfaceC48781sg0 interfaceC48781sg0, float f) {
        m17256p(interfaceC48781sg0).m76806g(f, interfaceC48781sg0.mo13857b(), interfaceC48781sg0.mo13854e());
        mo11943g(interfaceC48781sg0);
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: d */
    public void mo11946d(InterfaceC48781sg0 interfaceC48781sg0, float f) {
        m17256p(interfaceC48781sg0).m76805h(f);
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: e */
    public float mo11945e(InterfaceC48781sg0 interfaceC48781sg0) {
        return mo11939k(interfaceC48781sg0) * 2.0f;
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: f */
    public void mo11944f(InterfaceC48781sg0 interfaceC48781sg0) {
        mo11947c(interfaceC48781sg0, mo11936n(interfaceC48781sg0));
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: g */
    public void mo11943g(InterfaceC48781sg0 interfaceC48781sg0) {
        if (!interfaceC48781sg0.mo13857b()) {
            interfaceC48781sg0.mo13858a(0, 0, 0, 0);
            return;
        }
        float mo11936n = mo11936n(interfaceC48781sg0);
        float mo11939k = mo11939k(interfaceC48781sg0);
        int ceil = (int) Math.ceil(C37243Yb5.m74828a(mo11936n, mo11939k, interfaceC48781sg0.mo13854e()));
        int ceil2 = (int) Math.ceil(C37243Yb5.m74827b(mo11936n, mo11939k, interfaceC48781sg0.mo13854e()));
        interfaceC48781sg0.mo13858a(ceil, ceil2, ceil, ceil2);
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: h */
    public float mo11942h(InterfaceC48781sg0 interfaceC48781sg0) {
        return mo11939k(interfaceC48781sg0) * 2.0f;
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: i */
    public void mo11941i(InterfaceC48781sg0 interfaceC48781sg0, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC48781sg0.mo13856c(new C37009Xb5(colorStateList, f));
        View mo13853f = interfaceC48781sg0.mo13853f();
        mo13853f.setClipToOutline(true);
        mo13853f.setElevation(f2);
        mo11947c(interfaceC48781sg0, f3);
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: j */
    public void mo11940j(InterfaceC48781sg0 interfaceC48781sg0, ColorStateList colorStateList) {
        m17256p(interfaceC48781sg0).m76807f(colorStateList);
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: k */
    public float mo11939k(InterfaceC48781sg0 interfaceC48781sg0) {
        return m17256p(interfaceC48781sg0).m76809d();
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: l */
    public ColorStateList mo11938l(InterfaceC48781sg0 interfaceC48781sg0) {
        return m17256p(interfaceC48781sg0).m76811b();
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: m */
    public void mo11937m(InterfaceC48781sg0 interfaceC48781sg0, float f) {
        interfaceC48781sg0.mo13853f().setElevation(f);
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: n */
    public float mo11936n(InterfaceC48781sg0 interfaceC48781sg0) {
        return m17256p(interfaceC48781sg0).m76810c();
    }

    @Override // p000.InterfaceC49374tg0
    /* renamed from: o */
    public void mo11935o() {
    }

    /* renamed from: p */
    public final C37009Xb5 m17256p(InterfaceC48781sg0 interfaceC48781sg0) {
        return (C37009Xb5) interfaceC48781sg0.mo13855d();
    }
}
