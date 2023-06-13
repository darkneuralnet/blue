package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC26856oB;
/* renamed from: jA0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43151jA0 implements InterfaceC46680p71, InterfaceC42049hJ3, AbstractC26856oB.InterfaceC26858b, InterfaceC32173Ck2 {

    /* renamed from: a */
    public final Paint f92237a;

    /* renamed from: b */
    public final RectF f92238b;

    /* renamed from: c */
    public final Matrix f92239c;

    /* renamed from: d */
    public final Path f92240d;

    /* renamed from: e */
    public final RectF f92241e;

    /* renamed from: f */
    public final String f92242f;

    /* renamed from: g */
    public final boolean f92243g;

    /* renamed from: h */
    public final List<InterfaceC36752Vz0> f92244h;

    /* renamed from: i */
    public final RD2 f92245i;

    /* renamed from: j */
    public List<InterfaceC42049hJ3> f92246j;

    /* renamed from: k */
    public C44926m96 f92247k;

    public C43151jA0(RD2 rd2, AbstractC27525qB abstractC27525qB, C47781qy5 c47781qy5, C47924rD2 c47924rD2) {
        this(rd2, abstractC27525qB, c47781qy5.m16713c(), c47781qy5.m16712d(), m31051b(rd2, c47924rD2, abstractC27525qB, c47781qy5.m16714b()), m31050i(c47781qy5.m16714b()));
    }

    /* renamed from: b */
    public static List<InterfaceC36752Vz0> m31051b(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB, List<InterfaceC52637zA0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC36752Vz0 mo483a = list.get(i).mo483a(rd2, c47924rD2, abstractC27525qB);
            if (mo483a != null) {
                arrayList.add(mo483a);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static C1920Ee m31050i(List<InterfaceC52637zA0> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC52637zA0 interfaceC52637zA0 = list.get(i);
            if (interfaceC52637zA0 instanceof C1920Ee) {
                return (C1920Ee) interfaceC52637zA0;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        this.f92239c.set(matrix);
        C44926m96 c44926m96 = this.f92247k;
        if (c44926m96 != null) {
            this.f92239c.preConcat(c44926m96.m26232f());
        }
        this.f92241e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f92244h.size() - 1; size >= 0; size--) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = this.f92244h.get(size);
            if (interfaceC36752Vz0 instanceof InterfaceC46680p71) {
                ((InterfaceC46680p71) interfaceC36752Vz0).mo3375a(this.f92241e, this.f92239c, z);
                rectF.union(this.f92241e);
            }
        }
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        if (!c31939Bk2.m113543g(getName(), i) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            c31939Bk22 = c31939Bk22.m113549a(getName());
            if (c31939Bk2.m113547c(getName(), i)) {
                list.add(c31939Bk22.m113541i(this));
            }
        }
        if (c31939Bk2.m113542h(getName(), i)) {
            int m113545e = i + c31939Bk2.m113545e(getName(), i);
            for (int i2 = 0; i2 < this.f92244h.size(); i2++) {
                InterfaceC36752Vz0 interfaceC36752Vz0 = this.f92244h.get(i2);
                if (interfaceC36752Vz0 instanceof InterfaceC32173Ck2) {
                    ((InterfaceC32173Ck2) interfaceC36752Vz0).mo14523c(c31939Bk2, m113545e, list, c31939Bk22);
                }
            }
        }
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int intValue;
        if (this.f92243g) {
            return;
        }
        this.f92239c.set(matrix);
        C44926m96 c44926m96 = this.f92247k;
        if (c44926m96 != null) {
            this.f92239c.preConcat(c44926m96.m26232f());
            if (this.f92247k.m26230h() == null) {
                intValue = 100;
            } else {
                intValue = this.f92247k.m26230h().mo21658h().intValue();
            }
            i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
        }
        if (this.f92245i.m87083c0() && m31046m() && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f92238b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo3375a(this.f92238b, this.f92239c, true);
            this.f92237a.setAlpha(i);
            C33095Gi6.m104859m(canvas, this.f92238b, this.f92237a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f92244h.size() - 1; size >= 0; size--) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = this.f92244h.get(size);
            if (interfaceC36752Vz0 instanceof InterfaceC46680p71) {
                ((InterfaceC46680p71) interfaceC36752Vz0).mo14522d(canvas, this.f92239c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        this.f92245i.invalidateSelf();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f92244h.size());
        arrayList.addAll(list);
        for (int size = this.f92244h.size() - 1; size >= 0; size--) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = this.f92244h.get(size);
            interfaceC36752Vz0.mo4988f(arrayList, this.f92244h.subList(0, size));
            arrayList.add(interfaceC36752Vz0);
        }
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f92242f;
    }

    @Override // p000.InterfaceC42049hJ3
    public Path getPath() {
        this.f92239c.reset();
        C44926m96 c44926m96 = this.f92247k;
        if (c44926m96 != null) {
            this.f92239c.set(c44926m96.m26232f());
        }
        this.f92240d.reset();
        if (this.f92243g) {
            return this.f92240d;
        }
        for (int size = this.f92244h.size() - 1; size >= 0; size--) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = this.f92244h.get(size);
            if (interfaceC36752Vz0 instanceof InterfaceC42049hJ3) {
                this.f92240d.addPath(((InterfaceC42049hJ3) interfaceC36752Vz0).getPath(), this.f92239c);
            }
        }
        return this.f92240d;
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        C44926m96 c44926m96 = this.f92247k;
        if (c44926m96 != null) {
            c44926m96.m26235c(t, c41410gE2);
        }
    }

    /* renamed from: j */
    public List<InterfaceC36752Vz0> m31049j() {
        return this.f92244h;
    }

    /* renamed from: k */
    public List<InterfaceC42049hJ3> m31048k() {
        if (this.f92246j == null) {
            this.f92246j = new ArrayList();
            for (int i = 0; i < this.f92244h.size(); i++) {
                InterfaceC36752Vz0 interfaceC36752Vz0 = this.f92244h.get(i);
                if (interfaceC36752Vz0 instanceof InterfaceC42049hJ3) {
                    this.f92246j.add((InterfaceC42049hJ3) interfaceC36752Vz0);
                }
            }
        }
        return this.f92246j;
    }

    /* renamed from: l */
    public Matrix m31047l() {
        C44926m96 c44926m96 = this.f92247k;
        if (c44926m96 != null) {
            return c44926m96.m26232f();
        }
        this.f92239c.reset();
        return this.f92239c;
    }

    /* renamed from: m */
    public final boolean m31046m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f92244h.size(); i2++) {
            if ((this.f92244h.get(i2) instanceof InterfaceC46680p71) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public C43151jA0(RD2 rd2, AbstractC27525qB abstractC27525qB, String str, boolean z, List<InterfaceC36752Vz0> list, C1920Ee c1920Ee) {
        this.f92237a = new C35224Pl2();
        this.f92238b = new RectF();
        this.f92239c = new Matrix();
        this.f92240d = new Path();
        this.f92241e = new RectF();
        this.f92242f = str;
        this.f92245i = rd2;
        this.f92243g = z;
        this.f92244h = list;
        if (c1920Ee != null) {
            C44926m96 m108628b = c1920Ee.m108628b();
            this.f92247k = m108628b;
            m108628b.m26237a(abstractC27525qB);
            this.f92247k.m26236b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list.get(size);
            if (interfaceC36752Vz0 instanceof InterfaceC37834aE1) {
                arrayList.add((InterfaceC37834aE1) interfaceC36752Vz0);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC37834aE1) arrayList.get(size2)).mo28931b(list.listIterator(list.size()));
        }
    }
}
