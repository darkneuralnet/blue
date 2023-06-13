package p000;

import java.util.ArrayList;
import java.util.List;
import p000.AbstractC26856oB;
import p000.C31834Ay5;
/* renamed from: xa6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51691xa6 implements InterfaceC36752Vz0, AbstractC26856oB.InterfaceC26858b {

    /* renamed from: a */
    public final String f117829a;

    /* renamed from: b */
    public final boolean f117830b;

    /* renamed from: c */
    public final List<AbstractC26856oB.InterfaceC26858b> f117831c = new ArrayList();

    /* renamed from: d */
    public final C31834Ay5.EnumC0364a f117832d;

    /* renamed from: e */
    public final AbstractC26856oB<?, Float> f117833e;

    /* renamed from: f */
    public final AbstractC26856oB<?, Float> f117834f;

    /* renamed from: g */
    public final AbstractC26856oB<?, Float> f117835g;

    public C51691xa6(AbstractC27525qB abstractC27525qB, C31834Ay5 c31834Ay5) {
        this.f117829a = c31834Ay5.m114813c();
        this.f117830b = c31834Ay5.m114809g();
        this.f117832d = c31834Ay5.m114810f();
        AbstractC26856oB<Float, Float> mo951a = c31834Ay5.m114811e().mo951a();
        this.f117833e = mo951a;
        AbstractC26856oB<Float, Float> mo951a2 = c31834Ay5.m114814b().mo951a();
        this.f117834f = mo951a2;
        AbstractC26856oB<Float, Float> mo951a3 = c31834Ay5.m114812d().mo951a();
        this.f117835g = mo951a3;
        abstractC27525qB.m17981i(mo951a);
        abstractC27525qB.m17981i(mo951a2);
        abstractC27525qB.m17981i(mo951a3);
        mo951a.m21665a(this);
        mo951a2.m21665a(this);
        mo951a3.m21665a(this);
    }

    /* renamed from: b */
    public void m4991b(AbstractC26856oB.InterfaceC26858b interfaceC26858b) {
        this.f117831c.add(interfaceC26858b);
    }

    /* renamed from: c */
    public AbstractC26856oB<?, Float> m4990c() {
        return this.f117834f;
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        for (int i = 0; i < this.f117831c.size(); i++) {
            this.f117831c.get(i).mo4989e();
        }
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
    }

    /* renamed from: h */
    public AbstractC26856oB<?, Float> m4987h() {
        return this.f117835g;
    }

    /* renamed from: i */
    public AbstractC26856oB<?, Float> m4986i() {
        return this.f117833e;
    }

    /* renamed from: j */
    public C31834Ay5.EnumC0364a m4985j() {
        return this.f117832d;
    }

    /* renamed from: k */
    public boolean m4984k() {
        return this.f117830b;
    }
}
