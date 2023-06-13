package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
/* renamed from: PD1 */
/* loaded from: classes2.dex */
public class PD1 extends AbstractC28243sE {

    /* renamed from: A */
    public final AbstractC26856oB<PointF, PointF> f28124A;

    /* renamed from: B */
    public C32168Cj6 f28125B;

    /* renamed from: r */
    public final String f28126r;

    /* renamed from: s */
    public final boolean f28127s;

    /* renamed from: t */
    public final C46602oz2<LinearGradient> f28128t;

    /* renamed from: u */
    public final C46602oz2<RadialGradient> f28129u;

    /* renamed from: v */
    public final RectF f28130v;

    /* renamed from: w */
    public final RD1 f28131w;

    /* renamed from: x */
    public final int f28132x;

    /* renamed from: y */
    public final AbstractC26856oB<HD1, HD1> f28133y;

    /* renamed from: z */
    public final AbstractC26856oB<PointF, PointF> f28134z;

    public PD1(RD2 rd2, AbstractC27525qB abstractC27525qB, OD1 od1) {
        super(rd2, abstractC27525qB, od1.m92623b().m2185b(), od1.m92618g().m2183b(), od1.m92616i(), od1.m92614k(), od1.m92612m(), od1.m92617h(), od1.m92622c());
        this.f28128t = new C46602oz2<>();
        this.f28129u = new C46602oz2<>();
        this.f28130v = new RectF();
        this.f28126r = od1.m92615j();
        this.f28131w = od1.m92619f();
        this.f28127s = od1.m92611n();
        this.f28132x = (int) (rd2.m87126I().m16220d() / 32.0f);
        AbstractC26856oB<HD1, HD1> mo951a = od1.m92620e().mo951a();
        this.f28133y = mo951a;
        mo951a.m21665a(this);
        abstractC27525qB.m17981i(mo951a);
        AbstractC26856oB<PointF, PointF> mo951a2 = od1.m92613l().mo951a();
        this.f28134z = mo951a2;
        mo951a2.m21665a(this);
        abstractC27525qB.m17981i(mo951a2);
        AbstractC26856oB<PointF, PointF> mo951a3 = od1.m92621d().mo951a();
        this.f28124A = mo951a3;
        mo951a3.m21665a(this);
        abstractC27525qB.m17981i(mo951a3);
    }

    @Override // p000.AbstractC28243sE, p000.InterfaceC46680p71
    /* renamed from: d */
    public void mo14522d(Canvas canvas, Matrix matrix, int i) {
        Shader m90566m;
        if (this.f28127s) {
            return;
        }
        mo3375a(this.f28130v, matrix, false);
        if (this.f28131w == RD1.LINEAR) {
            m90566m = m90567l();
        } else {
            m90566m = m90566m();
        }
        m90566m.setLocalMatrix(matrix);
        this.f108471i.setShader(m90566m);
        super.mo14522d(canvas, matrix, i);
    }

    @Override // p000.InterfaceC36752Vz0
    public String getName() {
        return this.f28126r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC28243sE, p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        super.mo3374h(t, c41410gE2);
        if (t == InterfaceC37835aE2.f50108L) {
            C32168Cj6 c32168Cj6 = this.f28125B;
            if (c32168Cj6 != null) {
                this.f108468f.m17989G(c32168Cj6);
            }
            if (c41410gE2 == null) {
                this.f28125B = null;
                return;
            }
            C32168Cj6 c32168Cj62 = new C32168Cj6(c41410gE2);
            this.f28125B = c32168Cj62;
            c32168Cj62.m21665a(this);
            this.f108468f.m17981i(this.f28125B);
        }
    }

    /* renamed from: j */
    public final int[] m90569j(int[] iArr) {
        C32168Cj6 c32168Cj6 = this.f28125B;
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

    /* renamed from: k */
    public final int m90568k() {
        int i;
        int round = Math.round(this.f28134z.m21660f() * this.f28132x);
        int round2 = Math.round(this.f28124A.m21660f() * this.f28132x);
        int round3 = Math.round(this.f28133y.m21660f() * this.f28132x);
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

    /* renamed from: l */
    public final LinearGradient m90567l() {
        long m90568k = m90568k();
        LinearGradient m20196h = this.f28128t.m20196h(m90568k);
        if (m20196h != null) {
            return m20196h;
        }
        PointF mo21658h = this.f28134z.mo21658h();
        PointF mo21658h2 = this.f28124A.mo21658h();
        HD1 mo21658h3 = this.f28133y.mo21658h();
        LinearGradient linearGradient = new LinearGradient(mo21658h.x, mo21658h.y, mo21658h2.x, mo21658h2.y, m90569j(mo21658h3.m104171c()), mo21658h3.m104170d(), Shader.TileMode.CLAMP);
        this.f28128t.m20191n(m90568k, linearGradient);
        return linearGradient;
    }

    /* renamed from: m */
    public final RadialGradient m90566m() {
        float f;
        float f2;
        long m90568k = m90568k();
        RadialGradient m20196h = this.f28129u.m20196h(m90568k);
        if (m20196h != null) {
            return m20196h;
        }
        PointF mo21658h = this.f28134z.mo21658h();
        PointF mo21658h2 = this.f28124A.mo21658h();
        HD1 mo21658h3 = this.f28133y.mo21658h();
        int[] m90569j = m90569j(mo21658h3.m104171c());
        float[] m104170d = mo21658h3.m104170d();
        RadialGradient radialGradient = new RadialGradient(mo21658h.x, mo21658h.y, (float) Math.hypot(mo21658h2.x - f, mo21658h2.y - f2), m90569j, m104170d, Shader.TileMode.CLAMP);
        this.f28129u.m20191n(m90568k, radialGradient);
        return radialGradient;
    }
}
