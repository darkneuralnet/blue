package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000.AbstractC26856oB;
/* renamed from: MD1 */
/* loaded from: classes2.dex */
public class MD1 implements InterfaceC46680p71, AbstractC26856oB.InterfaceC26858b, InterfaceC32407Dk2 {

    /* renamed from: a */
    public final String f22818a;

    /* renamed from: b */
    public final boolean f22819b;

    /* renamed from: c */
    public final AbstractC27525qB f22820c;

    /* renamed from: d */
    public final C46602oz2<LinearGradient> f22821d = new C46602oz2<>();

    /* renamed from: e */
    public final C46602oz2<RadialGradient> f22822e = new C46602oz2<>();

    /* renamed from: f */
    public final Path f22823f;

    /* renamed from: g */
    public final Paint f22824g;

    /* renamed from: h */
    public final RectF f22825h;

    /* renamed from: i */
    public final List<InterfaceC42049hJ3> f22826i;

    /* renamed from: j */
    public final RD1 f22827j;

    /* renamed from: k */
    public final AbstractC26856oB<HD1, HD1> f22828k;

    /* renamed from: l */
    public final AbstractC26856oB<Integer, Integer> f22829l;

    /* renamed from: m */
    public final AbstractC26856oB<PointF, PointF> f22830m;

    /* renamed from: n */
    public final AbstractC26856oB<PointF, PointF> f22831n;

    /* renamed from: o */
    public AbstractC26856oB<ColorFilter, ColorFilter> f22832o;

    /* renamed from: p */
    public C32168Cj6 f22833p;

    /* renamed from: q */
    public final RD2 f22834q;

    /* renamed from: r */
    public final int f22835r;

    /* renamed from: s */
    public AbstractC26856oB<Float, Float> f22836s;

    /* renamed from: t */
    public float f22837t;

    /* renamed from: u */
    public W71 f22838u;

    public MD1(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB, LD1 ld1) {
        Path path = new Path();
        this.f22823f = path;
        this.f22824g = new C35224Pl2(1);
        this.f22825h = new RectF();
        this.f22826i = new ArrayList();
        this.f22837t = 0.0f;
        this.f22820c = abstractC27525qB;
        this.f22818a = ld1.m97523f();
        this.f22819b = ld1.m97520i();
        this.f22834q = rd2;
        this.f22827j = ld1.m97524e();
        path.setFillType(ld1.m97526c());
        this.f22835r = (int) (c47924rD2.m16220d() / 32.0f);
        AbstractC26856oB<HD1, HD1> mo951a = ld1.m97525d().mo951a();
        this.f22828k = mo951a;
        mo951a.m21665a(this);
        abstractC27525qB.m17981i(mo951a);
        AbstractC26856oB<Integer, Integer> mo951a2 = ld1.m97522g().mo951a();
        this.f22829l = mo951a2;
        mo951a2.m21665a(this);
        abstractC27525qB.m17981i(mo951a2);
        AbstractC26856oB<PointF, PointF> mo951a3 = ld1.m97521h().mo951a();
        this.f22830m = mo951a3;
        mo951a3.m21665a(this);
        abstractC27525qB.m17981i(mo951a3);
        AbstractC26856oB<PointF, PointF> mo951a4 = ld1.m97527b().mo951a();
        this.f22831n = mo951a4;
        mo951a4.m21665a(this);
        abstractC27525qB.m17981i(mo951a4);
        if (abstractC27525qB.mo11136v() != null) {
            AbstractC26856oB<Float, Float> mo951a5 = abstractC27525qB.mo11136v().m95175a().mo951a();
            this.f22836s = mo951a5;
            mo951a5.m21665a(this);
            abstractC27525qB.m17981i(this.f22836s);
        }
        if (abstractC27525qB.mo11135x() != null) {
            this.f22838u = new W71(this, abstractC27525qB, abstractC27525qB.mo11135x());
        }
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        this.f22823f.reset();
        for (int i = 0; i < this.f22826i.size(); i++) {
            this.f22823f.addPath(this.f22826i.get(i).getPath(), matrix);
        }
        this.f22823f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: b */
    public final int[] m95570b(int[] iArr) {
        C32168Cj6 c32168Cj6 = this.f22833p;
        if (c32168Cj6 != null) {
            Integer[] numArr = (Integer[]) c32168Cj6.mo21658h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // p000.InterfaceC32173Ck2
    /* renamed from: c */
    public void mo14523c(C31939Bk2 c31939Bk2, int i, List<C31939Bk2> list, C31939Bk2 c31939Bk22) {
        C48077rU2.m15909k(c31939Bk2, i, list, c31939Bk22, this);
    }

    @Override // p000.InterfaceC46680p71
    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        Shader m95567k;
        if (this.f22819b) {
            return;
        }
        C32416Dl2.m109978a("GradientFillContent#draw");
        this.f22823f.reset();
        for (int i2 = 0; i2 < this.f22826i.size(); i2++) {
            this.f22823f.addPath(this.f22826i.get(i2).getPath(), matrix);
        }
        this.f22823f.computeBounds(this.f22825h, false);
        if (this.f22827j == RD1.LINEAR) {
            m95567k = m95568j();
        } else {
            m95567k = m95567k();
        }
        m95567k.setLocalMatrix(matrix);
        this.f22824g.setShader(m95567k);
        AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f22832o;
        if (abstractC26856oB != null) {
            this.f22824g.setColorFilter(abstractC26856oB.mo21658h());
        }
        AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f22836s;
        if (abstractC26856oB2 != null) {
            float floatValue = abstractC26856oB2.mo21658h().floatValue();
            if (floatValue == 0.0f) {
                this.f22824g.setMaskFilter(null);
            } else if (floatValue != this.f22837t) {
                this.f22824g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f22837t = floatValue;
        }
        W71 w71 = this.f22838u;
        if (w71 != null) {
            w71.m78813a(this.f22824g);
        }
        this.f22824g.setAlpha(C48077rU2.m15917c((int) ((((i / 255.0f) * this.f22829l.mo21658h().intValue()) / 100.0f) * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        canvas.drawPath(this.f22823f, this.f22824g);
        C32416Dl2.m109977b("GradientFillContent#draw");
    }

    @Override // p000.AbstractC26856oB.InterfaceC26858b
    /* renamed from: e */
    public void mo4989e() {
        this.f22834q.invalidateSelf();
    }

    @Override // p000.InterfaceC36752Vz0
    /* renamed from: f */
    public void mo4988f(List<InterfaceC36752Vz0> list, List<InterfaceC36752Vz0> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC36752Vz0 interfaceC36752Vz0 = list2.get(i);
            if (interfaceC36752Vz0 instanceof InterfaceC42049hJ3) {
                this.f22826i.add((InterfaceC42049hJ3) interfaceC36752Vz0);
            }
        }
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f22818a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        W71 w71;
        W71 w712;
        W71 w713;
        W71 w714;
        W71 w715;
        if (t == InterfaceC37835aE2.f50115d) {
            this.f22829l.m21653n(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50107K) {
            AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f22832o;
            if (abstractC26856oB != null) {
                this.f22820c.m17989G(abstractC26856oB);
            }
            if (c41410gE2 == null) {
                this.f22832o = null;
                return;
            }
            C32168Cj6 c32168Cj6 = new C32168Cj6(c41410gE2);
            this.f22832o = c32168Cj6;
            c32168Cj6.m21665a(this);
            this.f22820c.m17981i(this.f22832o);
        } else if (t == InterfaceC37835aE2.f50108L) {
            C32168Cj6 c32168Cj62 = this.f22833p;
            if (c32168Cj62 != null) {
                this.f22820c.m17989G(c32168Cj62);
            }
            if (c41410gE2 == null) {
                this.f22833p = null;
                return;
            }
            this.f22821d.m20200d();
            this.f22822e.m20200d();
            C32168Cj6 c32168Cj63 = new C32168Cj6(c41410gE2);
            this.f22833p = c32168Cj63;
            c32168Cj63.m21665a(this);
            this.f22820c.m17981i(this.f22833p);
        } else if (t == InterfaceC37835aE2.f50121j) {
            AbstractC26856oB<Float, Float> abstractC26856oB2 = this.f22836s;
            if (abstractC26856oB2 != null) {
                abstractC26856oB2.m21653n(c41410gE2);
                return;
            }
            C32168Cj6 c32168Cj64 = new C32168Cj6(c41410gE2);
            this.f22836s = c32168Cj64;
            c32168Cj64.m21665a(this);
            this.f22820c.m17981i(this.f22836s);
        } else if (t == InterfaceC37835aE2.f50116e && (w715 = this.f22838u) != null) {
            w715.m78812b(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50103G && (w714 = this.f22838u) != null) {
            w714.m78809f(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50104H && (w713 = this.f22838u) != null) {
            w713.m78811c(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50105I && (w712 = this.f22838u) != null) {
            w712.m78810d(c41410gE2);
        } else if (t == InterfaceC37835aE2.f50106J && (w71 = this.f22838u) != null) {
            w71.m78808g(c41410gE2);
        }
    }

    /* renamed from: i */
    public final int m95569i() {
        int i;
        int round = Math.round(this.f22830m.m21660f() * this.f22835r);
        int round2 = Math.round(this.f22831n.m21660f() * this.f22835r);
        int round3 = Math.round(this.f22828k.m21660f() * this.f22835r);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: j */
    public final LinearGradient m95568j() {
        long m95569i = m95569i();
        LinearGradient m20196h = this.f22821d.m20196h(m95569i);
        if (m20196h != null) {
            return m20196h;
        }
        PointF mo21658h = this.f22830m.mo21658h();
        PointF mo21658h2 = this.f22831n.mo21658h();
        HD1 mo21658h3 = this.f22828k.mo21658h();
        LinearGradient linearGradient = new LinearGradient(mo21658h.x, mo21658h.y, mo21658h2.x, mo21658h2.y, m95570b(mo21658h3.m104171c()), mo21658h3.m104170d(), Shader.TileMode.CLAMP);
        this.f22821d.m20191n(m95569i, linearGradient);
        return linearGradient;
    }

    /* renamed from: k */
    public final RadialGradient m95567k() {
        long m95569i = m95569i();
        RadialGradient m20196h = this.f22822e.m20196h(m95569i);
        if (m20196h != null) {
            return m20196h;
        }
        PointF mo21658h = this.f22830m.mo21658h();
        PointF mo21658h2 = this.f22831n.mo21658h();
        HD1 mo21658h3 = this.f22828k.mo21658h();
        int[] m95570b = m95570b(mo21658h3.m104171c());
        float[] m104170d = mo21658h3.m104170d();
        float f = mo21658h.x;
        float f2 = mo21658h.y;
        float hypot = (float) Math.hypot(mo21658h2.x - f, mo21658h2.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot, m95570b, m104170d, Shader.TileMode.CLAMP);
        this.f22822e.m20191n(m95569i, radialGradient);
        return radialGradient;
    }
}
