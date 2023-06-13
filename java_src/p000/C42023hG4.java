package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p000.AbstractC26856oB;
/* renamed from: hG4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42023hG4 implements InterfaceC46680p71, InterfaceC42049hJ3, InterfaceC37834aE1, AbstractC26856oB.InterfaceC26858b, InterfaceC32407Dk2 {

    /* renamed from: a */
    public final Matrix f84927a = new Matrix();

    /* renamed from: b */
    public final Path f84928b = new Path();

    /* renamed from: c */
    public final RD2 f84929c;

    /* renamed from: d */
    public final AbstractC27525qB f84930d;

    /* renamed from: e */
    public final String f84931e;

    /* renamed from: f */
    public final boolean f84932f;

    /* renamed from: g */
    public final AbstractC26856oB<Float, Float> f84933g;

    /* renamed from: h */
    public final AbstractC26856oB<Float, Float> f84934h;

    /* renamed from: i */
    public final C44926m96 f84935i;

    /* renamed from: j */
    public C43151jA0 f84936j;

    public C42023hG4(RD2 rd2, AbstractC27525qB abstractC27525qB, C41430gG4 c41430gG4) {
        this.f84929c = rd2;
        this.f84930d = abstractC27525qB;
        this.f84931e = c41430gG4.m39775c();
        this.f84932f = c41430gG4.m39772f();
        AbstractC26856oB<Float, Float> mo951a = c41430gG4.m39776b().mo951a();
        this.f84933g = mo951a;
        abstractC27525qB.m17981i(mo951a);
        mo951a.m21665a(this);
        AbstractC26856oB<Float, Float> mo951a2 = c41430gG4.m39774d().mo951a();
        this.f84934h = mo951a2;
        abstractC27525qB.m17981i(mo951a2);
        mo951a2.m21665a(this);
        C44926m96 m108628b = c41430gG4.m39773e().m108628b();
        this.f84935i = m108628b;
        m108628b.m26237a(abstractC27525qB);
        m108628b.m26236b(this);
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        this.f84936j.mo3375a(rectF, matrix, z);
    }

    @Override // p000.InterfaceC37834aE1
    /* renamed from: b */
    public void mo28931b(ListIterator<InterfaceC36752Vz0> listIterator) {
        if (this.f84936j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f84936j = new C43151jA0(this.f84929c, this.f84930d, "Repeater", this.f84932f, arrayList, null);
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, this);
        for (int i2 = 0; i2 < this.f84936j.m31049j().size(); i2++) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = this.f84936j.m31049j().get(i2);
            if (interfaceC36752Vz0 instanceof InterfaceC32407Dk2) {
                C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, (InterfaceC32407Dk2) interfaceC36752Vz0);
            }
        }
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f84933g.mo21658h().floatValue();
        float floatValue2 = this.f84934h.mo21658h().floatValue();
        float floatValue3 = this.f84935i.m26229i().mo21658h().floatValue() / 100.0f;
        float floatValue4 = this.f84935i.m26233e().mo21658h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f84927a.set(matrix);
            float f = i2;
            this.f84927a.preConcat(this.f84935i.m26231g(f + floatValue2));
            this.f84936j.mo14522d(canvas, this.f84927a, (int) (i * C48077rU2.m15911i(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        this.f84929c.invalidateSelf();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        this.f84936j.mo4988f(list, list2);
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f84931e;
    }

    @Override // p000.InterfaceC42049hJ3
    public Path getPath() {
        Path path = this.f84936j.getPath();
        this.f84928b.reset();
        float floatValue = this.f84933g.mo21658h().floatValue();
        float floatValue2 = this.f84934h.mo21658h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f84927a.set(this.f84935i.m26231g(i + floatValue2));
            this.f84928b.addPath(path, this.f84927a);
        }
        return this.f84928b;
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        if (this.f84935i.m26235c(t, c41410gE2)) {
            return;
        }
        if (t == InterfaceC37835aE2.f50132u) {
            this.f84933g.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50133v) {
            this.f84934h.m21653n(c41410gE2);
        }
    }
}
