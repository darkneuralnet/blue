package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000.AbstractC26856oB;
/* renamed from: Al1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C31713Al1 implements InterfaceC46680p71, AbstractC26856oB.InterfaceC26858b, InterfaceC32407Dk2 {

    /* renamed from: a */
    public final Path f1026a;

    /* renamed from: b */
    public final Paint f1027b;

    /* renamed from: c */
    public final AbstractC27525qB f1028c;

    /* renamed from: d */
    public final String f1029d;

    /* renamed from: e */
    public final boolean f1030e;

    /* renamed from: f */
    public final List<InterfaceC42049hJ3> f1031f;

    /* renamed from: g */
    public final AbstractC26856oB<Integer, Integer> f1032g;

    /* renamed from: h */
    public final AbstractC26856oB<Integer, Integer> f1033h;

    /* renamed from: i */
    public AbstractC26856oB<ColorFilter, ColorFilter> f1034i;

    /* renamed from: j */
    public final RD2 f1035j;

    /* renamed from: k */
    public AbstractC26856oB<Float, Float> f1036k;

    /* renamed from: l */
    public float f1037l;

    /* renamed from: m */
    public W71 f1038m;

    public C31713Al1(RD2 rd2, AbstractC27525qB abstractC27525qB, C46595oy5 c46595oy5) {
        Path path = new Path();
        this.f1026a = path;
        this.f1027b = new C35224Pl2(1);
        this.f1031f = new ArrayList();
        this.f1028c = abstractC27525qB;
        this.f1029d = c46595oy5.m20205d();
        this.f1030e = c46595oy5.m20203f();
        this.f1035j = rd2;
        if (abstractC27525qB.mo11136v() != null) {
            AbstractC26856oB<Float, Float> mo951a = abstractC27525qB.mo11136v().m95175a().mo951a();
            this.f1036k = mo951a;
            mo951a.m21665a(this);
            abstractC27525qB.m17981i(this.f1036k);
        }
        if (abstractC27525qB.mo11135x() != null) {
            this.f1038m = new W71(this, abstractC27525qB, abstractC27525qB.mo11135x());
        }
        if (c46595oy5.m20207b() != null && c46595oy5.m20204e() != null) {
            path.setFillType(c46595oy5.m20206c());
            AbstractC26856oB<Integer, Integer> mo951a2 = c46595oy5.m20207b().mo951a();
            this.f1032g = mo951a2;
            mo951a2.m21665a(this);
            abstractC27525qB.m17981i(mo951a2);
            AbstractC26856oB<Integer, Integer> mo951a3 = c46595oy5.m20204e().mo951a();
            this.f1033h = mo951a3;
            mo951a3.m21665a(this);
            abstractC27525qB.m17981i(mo951a3);
            return;
        }
        this.f1032g = null;
        this.f1033h = null;
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        this.f1026a.reset();
        for (int i = 0; i < this.f1031f.size(); i++) {
            this.f1026a.addPath(this.f1031f.get(i).getPath(), matrix);
        }
        this.f1026a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, this);
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        if (this.f1030e) {
            return;
        }
        C32416Dl2.m109978a("FillContent#draw");
        this.f1027b.setColor((C48077rU2.m15917c((int) ((((i / 255.0f) * this.f1033h.mo21658h().intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((C49434tm0) this.f1032g).m11802p() & 16777215));
        AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f1034i;
        if (abstractC26856oB != null) {
            this.f1027b.setColorFilter(abstractC26856oB.mo21658h());
        }
        AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f1036k;
        if (abstractC26856oB2 != null) {
            float floatValue = abstractC26856oB2.mo21658h().floatValue();
            if (floatValue == 0.0f) {
                this.f1027b.setMaskFilter(null);
            } else if (floatValue != this.f1037l) {
                this.f1027b.setMaskFilter(this.f1028c.m17969w(floatValue));
            }
            this.f1037l = floatValue;
        }
        W71 w71 = this.f1038m;
        if (w71 != null) {
            w71.m78813a(this.f1027b);
        }
        this.f1026a.reset();
        for (int i2 = 0; i2 < this.f1031f.size(); i2++) {
            this.f1026a.addPath(this.f1031f.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.f1026a, this.f1027b);
        C32416Dl2.m109977b("FillContent#draw");
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        this.f1035j.invalidateSelf();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list2.get(i);
            if (interfaceC36752Vz0 instanceof InterfaceC42049hJ3) {
                this.f1031f.add((InterfaceC42049hJ3) interfaceC36752Vz0);
            }
        }
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f1029d;
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        W71 w71;
        W71 w712;
        W71 w713;
        W71 w714;
        W71 w715;
        if (t == InterfaceC37835aE2.f50112a) {
            this.f1032g.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50115d) {
            this.f1033h.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50107K) {
            AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f1034i;
            if (abstractC26856oB != null) {
                this.f1028c.m17989G(abstractC26856oB);
            }
            if (c41410gE2 == null) {
                this.f1034i = null;
                return;
            }
            C32168Cj6 c32168Cj6 = new C32168Cj6(c41410gE2);
            this.f1034i = c32168Cj6;
            c32168Cj6.m21665a(this);
            this.f1028c.m17981i(this.f1034i);
        } else if (t == InterfaceC37835aE2.f50121j) {
            AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f1036k;
            if (abstractC26856oB2 != null) {
                abstractC26856oB2.m21653n(c41410gE2);
                return;
            }
            C32168Cj6 c32168Cj62 = new C32168Cj6(c41410gE2);
            this.f1036k = c32168Cj62;
            c32168Cj62.m21665a(this);
            this.f1028c.m17981i(this.f1036k);
        } else if (t == InterfaceC37835aE2.f50116e && (w715 = this.f1038m) != null) {
            w715.m78812b(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50103G && (w714 = this.f1038m) != null) {
            w714.m78809f(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50104H && (w713 = this.f1038m) != null) {
            w713.m78811c(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50105I && (w712 = this.f1038m) != null) {
            w712.m78810d(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50106J && (w71 = this.f1038m) != null) {
            w71.m78808g(c41410gE2);
        }
    }
}
