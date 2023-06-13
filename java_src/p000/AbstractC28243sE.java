package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000.AbstractC26856oB;
import p000.C31834Ay5;
/* renamed from: sE */
/* loaded from: classes2.dex */
public abstract class AbstractC28243sE implements AbstractC26856oB.InterfaceC26858b, InterfaceC32407Dk2, InterfaceC46680p71 {

    /* renamed from: e */
    public final RD2 f108467e;

    /* renamed from: f */
    public final AbstractC27525qB f108468f;

    /* renamed from: h */
    public final float[] f108470h;

    /* renamed from: i */
    public final Paint f108471i;

    /* renamed from: j */
    public final AbstractC26856oB<?, Float> f108472j;

    /* renamed from: k */
    public final AbstractC26856oB<?, Integer> f108473k;

    /* renamed from: l */
    public final List<AbstractC26856oB<?, Float>> f108474l;

    /* renamed from: m */
    public final AbstractC26856oB<?, Float> f108475m;

    /* renamed from: n */
    public AbstractC26856oB<ColorFilter, ColorFilter> f108476n;

    /* renamed from: o */
    public AbstractC26856oB<Float, Float> f108477o;

    /* renamed from: p */
    public float f108478p;

    /* renamed from: q */
    public W71 f108479q;

    /* renamed from: a */
    public final PathMeasure f108463a = new PathMeasure();

    /* renamed from: b */
    public final Path f108464b = new Path();

    /* renamed from: c */
    public final Path f108465c = new Path();

    /* renamed from: d */
    public final RectF f108466d = new RectF();

    /* renamed from: g */
    public final List<C28245b> f108469g = new ArrayList();

    /* renamed from: sE$b */
    /* loaded from: classes2.dex */
    public static final class C28245b {

        /* renamed from: a */
        public final List<InterfaceC42049hJ3> f108480a;

        /* renamed from: b */
        public final C51691xa6 f108481b;

        public C28245b(C51691xa6 c51691xa6) {
            this.f108480a = new ArrayList();
            this.f108481b = c51691xa6;
        }
    }

    public AbstractC28243sE(RD2 rd2, AbstractC27525qB abstractC27525qB, Paint.Cap cap, Paint.Join join, float f, C28363se c28363se, C27640qe c27640qe, List<C27640qe> list, C27640qe c27640qe2) {
        C35224Pl2 c35224Pl2 = new C35224Pl2(1);
        this.f108471i = c35224Pl2;
        this.f108478p = 0.0f;
        this.f108467e = rd2;
        this.f108468f = abstractC27525qB;
        c35224Pl2.setStyle(Paint.Style.STROKE);
        c35224Pl2.setStrokeCap(cap);
        c35224Pl2.setStrokeJoin(join);
        c35224Pl2.setStrokeMiter(f);
        this.f108473k = c28363se.mo951a();
        this.f108472j = c27640qe.mo951a();
        if (c27640qe2 == null) {
            this.f108475m = null;
        } else {
            this.f108475m = c27640qe2.mo951a();
        }
        this.f108474l = new ArrayList(list.size());
        this.f108470h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f108474l.add(list.get(i).mo951a());
        }
        abstractC27525qB.m17981i(this.f108473k);
        abstractC27525qB.m17981i(this.f108472j);
        for (int i2 = 0; i2 < this.f108474l.size(); i2++) {
            abstractC27525qB.m17981i(this.f108474l.get(i2));
        }
        AbstractC26856oB<?, Float> abstractC26856oB = this.f108475m;
        if (abstractC26856oB != null) {
            abstractC27525qB.m17981i(abstractC26856oB);
        }
        this.f108473k.m21665a(this);
        this.f108472j.m21665a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f108474l.get(i3).m21665a(this);
        }
        AbstractC26856oB<?, Float> abstractC26856oB2 = this.f108475m;
        if (abstractC26856oB2 != null) {
            abstractC26856oB2.m21665a(this);
        }
        if (abstractC27525qB.mo11136v() != null) {
            AbstractC26856oB<Float, Float> mo951a = abstractC27525qB.mo11136v().m95175a().mo951a();
            this.f108477o = mo951a;
            mo951a.m21665a(this);
            abstractC27525qB.m17981i(this.f108477o);
        }
        if (abstractC27525qB.mo11135x() != null) {
            this.f108479q = new W71(this, abstractC27525qB, abstractC27525qB.mo11135x());
        }
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        C32416Dl2.m109978a("StrokeContent#getBounds");
        this.f108464b.reset();
        for (int i = 0; i < this.f108469g.size(); i++) {
            C28245b c28245b = this.f108469g.get(i);
            for (int i2 = 0; i2 < c28245b.f108480a.size(); i2++) {
                this.f108464b.addPath(((InterfaceC42049hJ3) c28245b.f108480a.get(i2)).getPath(), matrix);
            }
        }
        this.f108464b.computeBounds(this.f108466d, false);
        float m20303p = ((C46551ou1) this.f108472j).m20303p();
        RectF rectF2 = this.f108466d;
        float f = m20303p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f108466d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C32416Dl2.m109977b("StrokeContent#getBounds");
    }

    /* renamed from: b */
    public final void m14524b(Matrix matrix) {
        float floatValue;
        C32416Dl2.m109978a("StrokeContent#applyDashPattern");
        if (this.f108474l.isEmpty()) {
            C32416Dl2.m109977b("StrokeContent#applyDashPattern");
            return;
        }
        float m104865g = C33095Gi6.m104865g(matrix);
        for (int i = 0; i < this.f108474l.size(); i++) {
            this.f108470h[i] = this.f108474l.get(i).mo21658h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f108470h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f108470h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f108470h;
            fArr3[i] = fArr3[i] * m104865g;
        }
        AbstractC26856oB<?, Float> abstractC26856oB = this.f108475m;
        if (abstractC26856oB == null) {
            floatValue = 0.0f;
        } else {
            floatValue = m104865g * abstractC26856oB.mo21658h().floatValue();
        }
        this.f108471i.setPathEffect(new DashPathEffect(this.f108470h, floatValue));
        C32416Dl2.m109977b("StrokeContent#applyDashPattern");
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, this);
    }

    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        C32416Dl2.m109978a("StrokeContent#draw");
        if (C33095Gi6.m104864h(matrix)) {
            C32416Dl2.m109977b("StrokeContent#draw");
            return;
        }
        this.f108471i.setAlpha(C48077rU2.m15917c((int) ((((i / 255.0f) * ((N52) this.f108473k).m94386p()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        this.f108471i.setStrokeWidth(((C46551ou1) this.f108472j).m20303p() * C33095Gi6.m104865g(matrix));
        if (this.f108471i.getStrokeWidth() <= 0.0f) {
            C32416Dl2.m109977b("StrokeContent#draw");
            return;
        }
        m14524b(matrix);
        AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f108476n;
        if (abstractC26856oB != null) {
            this.f108471i.setColorFilter(abstractC26856oB.mo21658h());
        }
        AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f108477o;
        if (abstractC26856oB2 != null) {
            float floatValue = abstractC26856oB2.mo21658h().floatValue();
            if (floatValue == 0.0f) {
                this.f108471i.setMaskFilter(null);
            } else if (floatValue != this.f108478p) {
                this.f108471i.setMaskFilter(this.f108468f.m17969w(floatValue));
            }
            this.f108478p = floatValue;
        }
        W71 w71 = this.f108479q;
        if (w71 != null) {
            w71.m78813a(this.f108471i);
        }
        for (int i2 = 0; i2 < this.f108469g.size(); i2++) {
            C28245b c28245b = this.f108469g.get(i2);
            if (c28245b.f108481b != null) {
                m14521i(canvas, c28245b, matrix);
            } else {
                C32416Dl2.m109978a("StrokeContent#buildPath");
                this.f108464b.reset();
                for (int size = c28245b.f108480a.size() - 1; size >= 0; size--) {
                    this.f108464b.addPath(((InterfaceC42049hJ3) c28245b.f108480a.get(size)).getPath(), matrix);
                }
                C32416Dl2.m109977b("StrokeContent#buildPath");
                C32416Dl2.m109978a("StrokeContent#drawPath");
                canvas.drawPath(this.f108464b, this.f108471i);
                C32416Dl2.m109977b("StrokeContent#drawPath");
            }
        }
        C32416Dl2.m109977b("StrokeContent#draw");
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        this.f108467e.invalidateSelf();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        C51691xa6 c51691xa6 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list.get(size);
            if (interfaceC36752Vz0 instanceof C51691xa6) {
                C51691xa6 c51691xa62 = (C51691xa6) interfaceC36752Vz0;
                if (c51691xa62.m4985j() == C31834Ay5.EnumC0364a.INDIVIDUALLY) {
                    c51691xa6 = c51691xa62;
                }
            }
        }
        if (c51691xa6 != null) {
            c51691xa6.m4991b(this);
        }
        C28245b c28245b = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC36752Vz0 interfaceC36752Vz02 = list2.get(size2);
            if (interfaceC36752Vz02 instanceof C51691xa6) {
                C51691xa6 c51691xa63 = (C51691xa6) interfaceC36752Vz02;
                if (c51691xa63.m4985j() == C31834Ay5.EnumC0364a.INDIVIDUALLY) {
                    if (c28245b != null) {
                        this.f108469g.add(c28245b);
                    }
                    c28245b = new C28245b(c51691xa63);
                    c51691xa63.m4991b(this);
                }
            }
            if (interfaceC36752Vz02 instanceof InterfaceC42049hJ3) {
                if (c28245b == null) {
                    c28245b = new C28245b(c51691xa6);
                }
                c28245b.f108480a.add((InterfaceC42049hJ3) interfaceC36752Vz02);
            }
        }
        if (c28245b != null) {
            this.f108469g.add(c28245b);
        }
    }

    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        W71 w71;
        W71 w712;
        W71 w713;
        W71 w714;
        W71 w715;
        if (t == InterfaceC37835aE2.f50115d) {
            this.f108473k.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50130s) {
            this.f108472j.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50107K) {
            AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f108476n;
            if (abstractC26856oB != null) {
                this.f108468f.m17989G(abstractC26856oB);
            }
            if (c41410gE2 == null) {
                this.f108476n = null;
                return;
            }
            C32168Cj6 c32168Cj6 = new C32168Cj6(c41410gE2);
            this.f108476n = c32168Cj6;
            c32168Cj6.m21665a(this);
            this.f108468f.m17981i(this.f108476n);
        } else if (t == InterfaceC37835aE2.f50121j) {
            AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f108477o;
            if (abstractC26856oB2 != null) {
                abstractC26856oB2.m21653n(c41410gE2);
                return;
            }
            C32168Cj6 c32168Cj62 = new C32168Cj6(c41410gE2);
            this.f108477o = c32168Cj62;
            c32168Cj62.m21665a(this);
            this.f108468f.m17981i(this.f108477o);
        } else if (t == InterfaceC37835aE2.f50116e && (w715 = this.f108479q) != null) {
            w715.m78812b(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50103G && (w714 = this.f108479q) != null) {
            w714.m78809f(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50104H && (w713 = this.f108479q) != null) {
            w713.m78811c(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50105I && (w712 = this.f108479q) != null) {
            w712.m78810d(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50106J && (w71 = this.f108479q) != null) {
            w71.m78808g(c41410gE2);
        }
    }

    /* renamed from: i */
    public final void m14521i(Canvas canvas, C28245b c28245b, Matrix matrix) {
        float f;
        float f2;
        float f3;
        C32416Dl2.m109978a("StrokeContent#applyTrimPath");
        if (c28245b.f108481b == null) {
            C32416Dl2.m109977b("StrokeContent#applyTrimPath");
            return;
        }
        this.f108464b.reset();
        for (int size = c28245b.f108480a.size() - 1; size >= 0; size--) {
            this.f108464b.addPath(((InterfaceC42049hJ3) c28245b.f108480a.get(size)).getPath(), matrix);
        }
        float floatValue = c28245b.f108481b.m4986i().mo21658h().floatValue() / 100.0f;
        float floatValue2 = c28245b.f108481b.m4990c().mo21658h().floatValue() / 100.0f;
        float floatValue3 = c28245b.f108481b.m4987h().mo21658h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f108464b, this.f108471i);
            C32416Dl2.m109977b("StrokeContent#applyTrimPath");
            return;
        }
        this.f108463a.setPath(this.f108464b, false);
        float length = this.f108463a.getLength();
        while (this.f108463a.nextContour()) {
            length += this.f108463a.getLength();
        }
        float f4 = floatValue3 * length;
        float f5 = (floatValue * length) + f4;
        float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
        float f6 = 0.0f;
        for (int size2 = c28245b.f108480a.size() - 1; size2 >= 0; size2--) {
            this.f108465c.set(((InterfaceC42049hJ3) c28245b.f108480a.get(size2)).getPath());
            this.f108465c.transform(matrix);
            this.f108463a.setPath(this.f108465c, false);
            float length2 = this.f108463a.getLength();
            if (min > length) {
                float f7 = min - length;
                if (f7 < f6 + length2 && f6 < f7) {
                    if (f5 > length) {
                        f3 = (f5 - length) / length2;
                    } else {
                        f3 = 0.0f;
                    }
                    C33095Gi6.m104871a(this.f108465c, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f108465c, this.f108471i);
                    f6 += length2;
                }
            }
            float f8 = f6 + length2;
            if (f8 >= f5 && f6 <= min) {
                if (f8 <= min && f5 < f6) {
                    canvas.drawPath(this.f108465c, this.f108471i);
                } else {
                    if (f5 < f6) {
                        f = 0.0f;
                    } else {
                        f = (f5 - f6) / length2;
                    }
                    if (min > f8) {
                        f2 = 1.0f;
                    } else {
                        f2 = (min - f6) / length2;
                    }
                    C33095Gi6.m104871a(this.f108465c, f, f2, 0.0f);
                    canvas.drawPath(this.f108465c, this.f108471i);
                }
            }
            f6 += length2;
        }
        C32416Dl2.m109977b("StrokeContent#applyTrimPath");
    }
}
