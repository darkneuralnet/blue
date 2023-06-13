package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: Fu0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC32963Fu0 {

    /* renamed from: A */
    public float f10459A;

    /* renamed from: B */
    public float f10460B;

    /* renamed from: C */
    public float f10461C;

    /* renamed from: D */
    public float f10462D;

    /* renamed from: E */
    public int f10463E;

    /* renamed from: F */
    public boolean f10464F;

    /* renamed from: G */
    public boolean f10465G;

    /* renamed from: H */
    public boolean f10466H;

    /* renamed from: I */
    public VelocityTracker f10467I;

    /* renamed from: J */
    public float f10468J;

    /* renamed from: K */
    public float f10469K;

    /* renamed from: L */
    public float f10470L;

    /* renamed from: M */
    public float f10471M;

    /* renamed from: N */
    public float f10472N;

    /* renamed from: O */
    public float f10473O;

    /* renamed from: a */
    public final Matrix f10474a = new Matrix();

    /* renamed from: b */
    public final Paint f10475b = new Paint(1);

    /* renamed from: c */
    public final float[] f10476c = new float[2];

    /* renamed from: d */
    public Rect f10477d;

    /* renamed from: e */
    public long f10478e;

    /* renamed from: f */
    public float f10479f;

    /* renamed from: g */
    public float f10480g;

    /* renamed from: h */
    public float f10481h;

    /* renamed from: i */
    public float f10482i;

    /* renamed from: j */
    public float f10483j;

    /* renamed from: k */
    public float f10484k;

    /* renamed from: l */
    public Float f10485l;

    /* renamed from: m */
    public Float f10486m;

    /* renamed from: n */
    public Long f10487n;

    /* renamed from: o */
    public Long f10488o;

    /* renamed from: p */
    public float f10489p;

    /* renamed from: q */
    public float f10490q;

    /* renamed from: r */
    public float f10491r;

    /* renamed from: s */
    public Float f10492s;

    /* renamed from: t */
    public Long f10493t;

    /* renamed from: u */
    public long f10494u;

    /* renamed from: v */
    public Interpolator f10495v;

    /* renamed from: w */
    public float f10496w;

    /* renamed from: x */
    public float f10497x;

    /* renamed from: y */
    public float f10498y;

    /* renamed from: z */
    public float f10499z;

    /* renamed from: b */
    public static long m106277b(float f, float f2, float f3, Long l, Float f4, int i, int i2) {
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i3 != 0) {
            if (i3 > 0) {
                i = i2;
            }
            if (l != null && l.longValue() >= 0) {
                double longValue = ((((i - f) - (f2 * ((float) l.longValue()))) - (((f3 * 0.5d) * l.longValue()) * l.longValue())) + (f4.floatValue() * ((float) l.longValue()))) / f4.floatValue();
                if (longValue <= 0.0d) {
                    return LongCompanionObject.MAX_VALUE;
                }
                return (long) longValue;
            }
            float f5 = 2.0f * f3;
            double sqrt = Math.sqrt(((i * f5) - (f5 * f)) + (f2 * f2));
            double d = f2;
            double d2 = f3;
            double d3 = ((-sqrt) - d) / d2;
            if (d3 > 0.0d) {
                return (long) d3;
            }
            double d4 = (sqrt - d) / d2;
            if (d4 <= 0.0d) {
                return LongCompanionObject.MAX_VALUE;
            }
            return (long) d4;
        }
        if (l != null) {
            f2 = f4.floatValue();
        }
        int i4 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i4 > 0) {
            i = i2;
        }
        if (i4 == 0) {
            return LongCompanionObject.MAX_VALUE;
        }
        double d5 = (i - f) / f2;
        if (d5 <= 0.0d) {
            return LongCompanionObject.MAX_VALUE;
        }
        return (long) d5;
    }

    /* renamed from: d */
    public static Long m106275d(Float f, float f2, float f3) {
        if (f != null) {
            long j = 0;
            if (f3 != 0.0f) {
                long floatValue = (f.floatValue() - f2) / f3;
                if (floatValue > 0) {
                    j = floatValue;
                }
                return Long.valueOf(j);
            } else if (f.floatValue() < f2) {
                return 0L;
            }
        }
        return null;
    }

    /* renamed from: A */
    public void m106283A(float f) {
        this.f10491r = f;
    }

    /* renamed from: B */
    public void m106282B(long j) {
        this.f10494u = j;
    }

    /* renamed from: C */
    public void m106281C(Float f) {
        this.f10492s = f;
    }

    /* renamed from: D */
    public void m106280D(Float f) {
        this.f10485l = f;
    }

    /* renamed from: E */
    public void m106279E(Float f) {
        this.f10486m = f;
    }

    /* renamed from: a */
    public boolean m106278a(long j) {
        boolean z;
        if (this.f10478e == -1) {
            this.f10478e = j;
        }
        long j2 = j - this.f10478e;
        boolean z2 = false;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.f10464F = z;
        if (z && !this.f10465G) {
            m106276c(this.f10476c, j2, this.f10479f, this.f10481h, this.f10483j, this.f10487n, this.f10485l);
            float[] fArr = this.f10476c;
            this.f10498y = fArr[0];
            this.f10460B = fArr[1];
            m106276c(fArr, j2, this.f10480g, this.f10482i, this.f10484k, this.f10488o, this.f10486m);
            float[] fArr2 = this.f10476c;
            this.f10499z = fArr2[0];
            this.f10461C = fArr2[1];
            m106276c(fArr2, j2, this.f10489p, this.f10490q, this.f10491r, this.f10493t, this.f10492s);
            float[] fArr3 = this.f10476c;
            this.f10459A = fArr3[0];
            this.f10462D = fArr3[1];
            Interpolator interpolator = this.f10495v;
            if (interpolator != null) {
                this.f10463E = (int) (interpolator.getInterpolation(((float) j2) / this.f10496w) * 255.0f);
            } else {
                this.f10463E = KotlinVersion.MAX_COMPONENT_VALUE;
            }
            if (!this.f10466H && ((float) j2) >= this.f10496w) {
                z2 = true;
            }
            this.f10465G = z2;
            this.f10497x = Math.min(1.0f, ((float) j2) / this.f10496w);
        }
        return !this.f10465G;
    }

    /* renamed from: c */
    public final void m106276c(float[] fArr, long j, float f, float f2, float f3, Long l, Float f4) {
        float f5 = (float) j;
        fArr[1] = (f3 * f5) + f2;
        if (l != null && j >= l.longValue()) {
            fArr[0] = f + (f2 * ((float) l.longValue())) + (f3 * 0.5f * ((float) l.longValue()) * ((float) l.longValue())) + (((float) (j - l.longValue())) * f4.floatValue());
        } else {
            fArr[0] = f + (f2 * f5) + (f3 * 0.5f * f5 * f5);
        }
    }

    /* renamed from: e */
    public void m106274e(Paint paint) {
        paint.setAlpha(this.f10463E);
    }

    /* renamed from: f */
    public final boolean m106273f(float f, float f2) {
        float f3 = this.f10498y;
        if (f3 <= f && f <= f3 + mo93873k()) {
            float f4 = this.f10499z;
            if (f4 <= f2 && f2 <= f4 + mo93874j()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void m106272g(Canvas canvas) {
        if (this.f10466H) {
            this.f10460B = this.f10470L;
            this.f10461C = this.f10471M;
            m106271h(canvas, this.f10468J + this.f10472N, this.f10469K + this.f10473O, this.f10459A, this.f10497x);
        } else if (this.f10464F && !this.f10465G) {
            m106271h(canvas, this.f10498y, this.f10499z, this.f10459A, this.f10497x);
        }
    }

    /* renamed from: h */
    public final void m106271h(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.save();
        canvas.clipRect(this.f10477d);
        this.f10474a.reset();
        this.f10475b.setAlpha(this.f10463E);
        mo93875i(canvas, this.f10474a, this.f10475b, f, f2, f3, f4);
        canvas.restore();
    }

    /* renamed from: i */
    public abstract void mo93875i(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4);

    /* renamed from: j */
    public abstract int mo93874j();

    /* renamed from: k */
    public abstract int mo93873k();

    /* renamed from: l */
    public boolean m106270l(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (m106273f(x, y)) {
            this.f10466H = true;
            this.f10468J = x;
            this.f10469K = y;
            this.f10472N = this.f10498y - x;
            this.f10473O = this.f10499z - y;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f10467I = obtain;
            obtain.addMovement(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void m106269m(MotionEvent motionEvent) {
        this.f10468J = motionEvent.getX();
        this.f10469K = motionEvent.getY();
        this.f10467I.addMovement(motionEvent);
        this.f10467I.computeCurrentVelocity(1);
        this.f10470L = this.f10467I.getXVelocity();
        this.f10471M = this.f10467I.getYVelocity();
    }

    /* renamed from: n */
    public void m106268n(MotionEvent motionEvent) {
        this.f10467I.addMovement(motionEvent);
        this.f10467I.computeCurrentVelocity(1);
        this.f10478e = -1L;
        this.f10479f = motionEvent.getX() + this.f10472N;
        this.f10480g = motionEvent.getY() + this.f10473O;
        this.f10481h = this.f10467I.getXVelocity();
        this.f10482i = this.f10467I.getYVelocity();
        this.f10489p = this.f10459A;
        this.f10467I.recycle();
        this.f10467I = null;
        m106267o(this.f10477d);
        this.f10466H = false;
    }

    /* renamed from: o */
    public void m106267o(Rect rect) {
        float f;
        this.f10477d = rect;
        this.f10487n = m106275d(this.f10485l, this.f10481h, this.f10483j);
        this.f10488o = m106275d(this.f10486m, this.f10482i, this.f10484k);
        this.f10493t = m106275d(this.f10492s, this.f10490q, this.f10491r);
        long j = this.f10494u;
        if (j >= 0) {
            f = (float) j;
        } else {
            f = 9.223372E18f;
        }
        this.f10496w = f;
        this.f10496w = Math.min((float) m106277b(this.f10479f, this.f10481h, this.f10483j, this.f10487n, this.f10485l, rect.left - mo93873k(), rect.right), this.f10496w);
        this.f10496w = Math.min((float) m106277b(this.f10480g, this.f10482i, this.f10484k, this.f10488o, this.f10486m, rect.top - mo93874j(), rect.bottom), this.f10496w);
        m106274e(this.f10475b);
    }

    /* renamed from: p */
    public void m106266p() {
        this.f10478e = 0L;
        this.f10480g = 0.0f;
        this.f10479f = 0.0f;
        this.f10482i = 0.0f;
        this.f10481h = 0.0f;
        this.f10484k = 0.0f;
        this.f10483j = 0.0f;
        this.f10486m = null;
        this.f10485l = null;
        this.f10488o = null;
        this.f10487n = null;
        this.f10489p = 0.0f;
        this.f10490q = 0.0f;
        this.f10491r = 0.0f;
        this.f10492s = null;
        this.f10493t = null;
        this.f10494u = 0L;
        this.f10496w = 0.0f;
        this.f10497x = 0.0f;
        this.f10495v = null;
        this.f10499z = 0.0f;
        this.f10498y = 0.0f;
        this.f10461C = 0.0f;
        this.f10460B = 0.0f;
        this.f10459A = 0.0f;
        this.f10463E = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f10464F = false;
        this.f10465G = false;
    }

    /* renamed from: q */
    public void m106265q(float f) {
        this.f10483j = f;
    }

    /* renamed from: r */
    public void m106264r(float f) {
        this.f10484k = f;
    }

    /* renamed from: s */
    public void m106263s(Interpolator interpolator) {
        this.f10495v = interpolator;
    }

    /* renamed from: t */
    public void m106262t(long j) {
        this.f10478e = j;
    }

    /* renamed from: u */
    public void m106261u(float f) {
        this.f10489p = f;
    }

    /* renamed from: v */
    public void m106260v(float f) {
        this.f10490q = f;
    }

    /* renamed from: w */
    public void m106259w(float f) {
        this.f10481h = f;
    }

    /* renamed from: x */
    public void m106258x(float f) {
        this.f10482i = f;
    }

    /* renamed from: y */
    public void m106257y(float f) {
        this.f10479f = f;
    }

    /* renamed from: z */
    public void m106256z(float f) {
        this.f10480g = f;
    }
}
