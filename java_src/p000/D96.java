package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
/* renamed from: D96 */
/* loaded from: classes5.dex */
public class D96 {

    /* renamed from: c */
    public C32951Fs6 f5304c;

    /* renamed from: a */
    public Matrix f5302a = new Matrix();

    /* renamed from: b */
    public Matrix f5303b = new Matrix();

    /* renamed from: d */
    public float[] f5305d = new float[1];

    /* renamed from: e */
    public float[] f5306e = new float[1];

    /* renamed from: f */
    public float[] f5307f = new float[1];

    /* renamed from: g */
    public float[] f5308g = new float[1];

    /* renamed from: h */
    public Matrix f5309h = new Matrix();

    /* renamed from: i */
    public float[] f5310i = new float[2];

    /* renamed from: j */
    public Matrix f5311j = new Matrix();

    /* renamed from: k */
    public Matrix f5312k = new Matrix();

    public D96(C32951Fs6 c32951Fs6) {
        this.f5304c = c32951Fs6;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: a */
    public float[] m110837a(InterfaceC41499gO1 interfaceC41499gO1, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) * 2;
        if (this.f5306e.length != i3) {
            this.f5306e = new float[i3];
        }
        float[] fArr = this.f5306e;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? mo21237h = interfaceC41499gO1.mo21237h((i4 / 2) + i);
            if (mo21237h != 0) {
                fArr[i4] = mo21237h.mo51930g();
                fArr[i4 + 1] = mo21237h.mo51938c() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        m110832f().mapPoints(fArr);
        return fArr;
    }

    /* renamed from: b */
    public float[] m110836b(InterfaceC43278jO1 interfaceC43278jO1, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.f5308g.length != i3) {
            this.f5308g = new float[i3];
        }
        float[] fArr = this.f5308g;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            CandleEntry candleEntry = (CandleEntry) interfaceC43278jO1.mo21237h((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.mo51930g();
                fArr[i4 + 1] = candleEntry.m51936i() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        m110832f().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: c */
    public float[] m110835c(MO1 mo1, float f, float f2, int i, int i2) {
        int i3 = (((int) ((i2 - i) * f)) + 1) * 2;
        if (this.f5307f.length != i3) {
            this.f5307f = new float[i3];
        }
        float[] fArr = this.f5307f;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? mo21237h = mo1.mo21237h((i4 / 2) + i);
            if (mo21237h != 0) {
                fArr[i4] = mo21237h.mo51930g();
                fArr[i4 + 1] = mo21237h.mo51938c() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        m110832f().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: d */
    public float[] m110834d(InterfaceC40322eP1 interfaceC40322eP1, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.f5305d.length != i3) {
            this.f5305d = new float[i3];
        }
        float[] fArr = this.f5305d;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? mo21237h = interfaceC40322eP1.mo21237h((i4 / 2) + i);
            if (mo21237h != 0) {
                fArr[i4] = mo21237h.mo51930g();
                fArr[i4 + 1] = mo21237h.mo51938c() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        m110832f().mapPoints(fArr);
        return fArr;
    }

    /* renamed from: e */
    public OE2 m110833e(float f, float f2) {
        float[] fArr = this.f5310i;
        fArr[0] = f;
        fArr[1] = f2;
        m110827k(fArr);
        float[] fArr2 = this.f5310i;
        return OE2.m92598b(fArr2[0], fArr2[1]);
    }

    /* renamed from: f */
    public Matrix m110832f() {
        this.f5311j.set(this.f5302a);
        this.f5311j.postConcat(this.f5304c.f10373a);
        this.f5311j.postConcat(this.f5303b);
        return this.f5311j;
    }

    /* renamed from: g */
    public OE2 m110831g(float f, float f2) {
        OE2 m92598b = OE2.m92598b(0.0d, 0.0d);
        m110830h(f, f2, m92598b);
        return m92598b;
    }

    /* renamed from: h */
    public void m110830h(float f, float f2, OE2 oe2) {
        float[] fArr = this.f5310i;
        fArr[0] = f;
        fArr[1] = f2;
        m110828j(fArr);
        float[] fArr2 = this.f5310i;
        oe2.f26254c = fArr2[0];
        oe2.f26255d = fArr2[1];
    }

    /* renamed from: i */
    public void m110829i(Path path) {
        path.transform(this.f5302a);
        path.transform(this.f5304c.m106371p());
        path.transform(this.f5303b);
    }

    /* renamed from: j */
    public void m110828j(float[] fArr) {
        Matrix matrix = this.f5309h;
        matrix.reset();
        this.f5303b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f5304c.m106371p().invert(matrix);
        matrix.mapPoints(fArr);
        this.f5302a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    /* renamed from: k */
    public void m110827k(float[] fArr) {
        this.f5302a.mapPoints(fArr);
        this.f5304c.m106371p().mapPoints(fArr);
        this.f5303b.mapPoints(fArr);
    }

    /* renamed from: l */
    public void mo109333l(boolean z) {
        this.f5303b.reset();
        if (!z) {
            this.f5303b.postTranslate(this.f5304c.m106401G(), this.f5304c.m106375l() - this.f5304c.m106402F());
            return;
        }
        this.f5303b.setTranslate(this.f5304c.m106401G(), -this.f5304c.m106399I());
        this.f5303b.postScale(1.0f, -1.0f);
    }

    /* renamed from: m */
    public void m110826m(float f, float f2, float f3, float f4) {
        float m106376k = this.f5304c.m106376k() / f2;
        float m106380g = this.f5304c.m106380g() / f3;
        if (Float.isInfinite(m106376k)) {
            m106376k = 0.0f;
        }
        if (Float.isInfinite(m106380g)) {
            m106380g = 0.0f;
        }
        this.f5302a.reset();
        this.f5302a.postTranslate(-f, -f4);
        this.f5302a.postScale(m106376k, -m106380g);
    }

    /* renamed from: n */
    public void m110825n(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.f5302a.mapRect(rectF);
        this.f5304c.m106371p().mapRect(rectF);
        this.f5303b.mapRect(rectF);
    }

    /* renamed from: o */
    public void m110824o(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.f5302a.mapRect(rectF);
        this.f5304c.m106371p().mapRect(rectF);
        this.f5303b.mapRect(rectF);
    }

    /* renamed from: p */
    public void m110823p(RectF rectF) {
        this.f5302a.mapRect(rectF);
        this.f5304c.m106371p().mapRect(rectF);
        this.f5303b.mapRect(rectF);
    }
}
