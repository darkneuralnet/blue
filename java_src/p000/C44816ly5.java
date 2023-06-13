package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC26856oB;
import p000.C31834Ay5;
/* renamed from: ly5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44816ly5 implements InterfaceC42049hJ3, AbstractC26856oB.InterfaceC26858b {

    /* renamed from: b */
    public final String f97025b;

    /* renamed from: c */
    public final boolean f97026c;

    /* renamed from: d */
    public final RD2 f97027d;

    /* renamed from: e */
    public final C48966sy5 f97028e;

    /* renamed from: f */
    public boolean f97029f;

    /* renamed from: a */
    public final Path f97024a = new Path();

    /* renamed from: g */
    public final C50107uu0 f97030g = new C50107uu0();

    public C44816ly5(RD2 rd2, AbstractC27525qB abstractC27525qB, C51337wy5 c51337wy5) {
        this.f97025b = c51337wy5.m6020b();
        this.f97026c = c51337wy5.m6018d();
        this.f97027d = rd2;
        C48966sy5 mo951a = c51337wy5.m6019c().mo951a();
        this.f97028e = mo951a;
        abstractC27525qB.m17981i(mo951a);
        mo951a.m21665a(this);
    }

    /* renamed from: b */
    public final void m26587b() {
        this.f97029f = false;
        this.f97027d.invalidateSelf();
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        m26587b();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list.get(i);
            if (interfaceC36752Vz0 instanceof C51691xa6) {
                C51691xa6 c51691xa6 = (C51691xa6) interfaceC36752Vz0;
                if (c51691xa6.m4985j() == C31834Ay5.EnumC0364a.SIMULTANEOUSLY) {
                    this.f97030g.m9539a(c51691xa6);
                    c51691xa6.m4991b(this);
                }
            }
            if (interfaceC36752Vz0 instanceof InterfaceC50152uy5) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((InterfaceC50152uy5) interfaceC36752Vz0);
            }
        }
        this.f97028e.m13295q(arrayList);
    }

    @Override // p000.InterfaceC42049hJ3
    public Path getPath() {
        if (this.f97029f) {
            return this.f97024a;
        }
        this.f97024a.reset();
        if (this.f97026c) {
            this.f97029f = true;
            return this.f97024a;
        }
        Path mo21658h = this.f97028e.mo21658h();
        if (mo21658h == null) {
            return this.f97024a;
        }
        this.f97024a.set(mo21658h);
        this.f97024a.setFillType(Path.FillType.EVEN_ODD);
        this.f97030g.m9538b(this.f97024a);
        this.f97029f = true;
        return this.f97024a;
    }
}
