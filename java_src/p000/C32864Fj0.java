package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.KotlinVersion;
/* renamed from: Fj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32864Fj0 extends Drawable implements Animatable {

    /* renamed from: h */
    public static final Interpolator f9996h = new LinearInterpolator();

    /* renamed from: i */
    public static final Interpolator f9997i = new C34269Lj1();

    /* renamed from: j */
    public static final int[] f9998j = {-16777216};

    /* renamed from: b */
    public final C2416c f9999b;

    /* renamed from: c */
    public float f10000c;

    /* renamed from: d */
    public Resources f10001d;

    /* renamed from: e */
    public Animator f10002e;

    /* renamed from: f */
    public float f10003f;

    /* renamed from: g */
    public boolean f10004g;

    /* renamed from: Fj0$a */
    /* loaded from: classes.dex */
    public class C2414a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C2416c f10005a;

        public C2414a(C2416c c2416c) {
            this.f10005a = c2416c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C32864Fj0.this.m106674n(floatValue, this.f10005a);
            C32864Fj0.this.m106686b(floatValue, this.f10005a, false);
            C32864Fj0.this.invalidateSelf();
        }
    }

    /* renamed from: Fj0$b */
    /* loaded from: classes.dex */
    public class C2415b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C2416c f10007a;

        public C2415b(C2416c c2416c) {
            this.f10007a = c2416c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C32864Fj0.this.m106686b(1.0f, this.f10007a, true);
            this.f10007a.m106673A();
            this.f10007a.m106661l();
            C32864Fj0 c32864Fj0 = C32864Fj0.this;
            if (c32864Fj0.f10004g) {
                c32864Fj0.f10004g = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f10007a.m106649x(false);
                return;
            }
            c32864Fj0.f10003f += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C32864Fj0.this.f10003f = 0.0f;
        }
    }

    /* renamed from: Fj0$c */
    /* loaded from: classes.dex */
    public static class C2416c {

        /* renamed from: a */
        public final RectF f10009a = new RectF();

        /* renamed from: b */
        public final Paint f10010b;

        /* renamed from: c */
        public final Paint f10011c;

        /* renamed from: d */
        public final Paint f10012d;

        /* renamed from: e */
        public float f10013e;

        /* renamed from: f */
        public float f10014f;

        /* renamed from: g */
        public float f10015g;

        /* renamed from: h */
        public float f10016h;

        /* renamed from: i */
        public int[] f10017i;

        /* renamed from: j */
        public int f10018j;

        /* renamed from: k */
        public float f10019k;

        /* renamed from: l */
        public float f10020l;

        /* renamed from: m */
        public float f10021m;

        /* renamed from: n */
        public boolean f10022n;

        /* renamed from: o */
        public Path f10023o;

        /* renamed from: p */
        public float f10024p;

        /* renamed from: q */
        public float f10025q;

        /* renamed from: r */
        public int f10026r;

        /* renamed from: s */
        public int f10027s;

        /* renamed from: t */
        public int f10028t;

        /* renamed from: u */
        public int f10029u;

        public C2416c() {
            Paint paint = new Paint();
            this.f10010b = paint;
            Paint paint2 = new Paint();
            this.f10011c = paint2;
            Paint paint3 = new Paint();
            this.f10012d = paint3;
            this.f10013e = 0.0f;
            this.f10014f = 0.0f;
            this.f10015g = 0.0f;
            this.f10016h = 5.0f;
            this.f10024p = 1.0f;
            this.f10028t = KotlinVersion.MAX_COMPONENT_VALUE;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void m106673A() {
            this.f10019k = this.f10013e;
            this.f10020l = this.f10014f;
            this.f10021m = this.f10015g;
        }

        /* renamed from: a */
        public void m106672a(Canvas canvas, Rect rect) {
            RectF rectF = this.f10009a;
            float f = this.f10025q;
            float f2 = (this.f10016h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f10026r * this.f10024p) / 2.0f, this.f10016h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f10013e;
            float f4 = this.f10015g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f10014f + f4) * 360.0f) - f5;
            this.f10010b.setColor(this.f10029u);
            this.f10010b.setAlpha(this.f10028t);
            float f7 = this.f10016h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f10012d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f10010b);
            m106671b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        public void m106671b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f10022n) {
                Path path = this.f10023o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f10023o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f10023o.moveTo(0.0f, 0.0f);
                this.f10023o.lineTo(this.f10026r * this.f10024p, 0.0f);
                Path path3 = this.f10023o;
                float f3 = this.f10024p;
                path3.lineTo((this.f10026r * f3) / 2.0f, this.f10027s * f3);
                this.f10023o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f10026r * this.f10024p) / 2.0f), rectF.centerY() + (this.f10016h / 2.0f));
                this.f10023o.close();
                this.f10011c.setColor(this.f10029u);
                this.f10011c.setAlpha(this.f10028t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f10023o, this.f10011c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int m106670c() {
            return this.f10028t;
        }

        /* renamed from: d */
        public float m106669d() {
            return this.f10014f;
        }

        /* renamed from: e */
        public int m106668e() {
            return this.f10017i[m106667f()];
        }

        /* renamed from: f */
        public int m106667f() {
            return (this.f10018j + 1) % this.f10017i.length;
        }

        /* renamed from: g */
        public float m106666g() {
            return this.f10013e;
        }

        /* renamed from: h */
        public int m106665h() {
            return this.f10017i[this.f10018j];
        }

        /* renamed from: i */
        public float m106664i() {
            return this.f10020l;
        }

        /* renamed from: j */
        public float m106663j() {
            return this.f10021m;
        }

        /* renamed from: k */
        public float m106662k() {
            return this.f10019k;
        }

        /* renamed from: l */
        public void m106661l() {
            m106653t(m106667f());
        }

        /* renamed from: m */
        public void m106660m() {
            this.f10019k = 0.0f;
            this.f10020l = 0.0f;
            this.f10021m = 0.0f;
            m106648y(0.0f);
            m106651v(0.0f);
            m106650w(0.0f);
        }

        /* renamed from: n */
        public void m106659n(int i) {
            this.f10028t = i;
        }

        /* renamed from: o */
        public void m106658o(float f, float f2) {
            this.f10026r = (int) f;
            this.f10027s = (int) f2;
        }

        /* renamed from: p */
        public void m106657p(float f) {
            if (f != this.f10024p) {
                this.f10024p = f;
            }
        }

        /* renamed from: q */
        public void m106656q(float f) {
            this.f10025q = f;
        }

        /* renamed from: r */
        public void m106655r(int i) {
            this.f10029u = i;
        }

        /* renamed from: s */
        public void m106654s(ColorFilter colorFilter) {
            this.f10010b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        public void m106653t(int i) {
            this.f10018j = i;
            this.f10029u = this.f10017i[i];
        }

        /* renamed from: u */
        public void m106652u(int[] iArr) {
            this.f10017i = iArr;
            m106653t(0);
        }

        /* renamed from: v */
        public void m106651v(float f) {
            this.f10014f = f;
        }

        /* renamed from: w */
        public void m106650w(float f) {
            this.f10015g = f;
        }

        /* renamed from: x */
        public void m106649x(boolean z) {
            if (this.f10022n != z) {
                this.f10022n = z;
            }
        }

        /* renamed from: y */
        public void m106648y(float f) {
            this.f10013e = f;
        }

        /* renamed from: z */
        public void m106647z(float f) {
            this.f10016h = f;
            this.f10010b.setStrokeWidth(f);
        }
    }

    public C32864Fj0(Context context) {
        this.f10001d = ((Context) HZ3.m103731g(context)).getResources();
        C2416c c2416c = new C2416c();
        this.f9999b = c2416c;
        c2416c.m106652u(f9998j);
        m106677k(2.5f);
        m106675m();
    }

    /* renamed from: a */
    public final void m106687a(float f, C2416c c2416c) {
        m106674n(f, c2416c);
        c2416c.m106648y(c2416c.m106662k() + (((c2416c.m106664i() - 0.01f) - c2416c.m106662k()) * f));
        c2416c.m106651v(c2416c.m106664i());
        c2416c.m106650w(c2416c.m106663j() + ((((float) (Math.floor(c2416c.m106663j() / 0.8f) + 1.0d)) - c2416c.m106663j()) * f));
    }

    /* renamed from: b */
    public void m106686b(float f, C2416c c2416c, boolean z) {
        float interpolation;
        float f2;
        if (this.f10004g) {
            m106687a(f, c2416c);
        } else if (f != 1.0f || z) {
            float m106663j = c2416c.m106663j();
            if (f < 0.5f) {
                interpolation = c2416c.m106662k();
                f2 = (f9997i.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m106662k = c2416c.m106662k() + 0.79f;
                interpolation = m106662k - (((1.0f - f9997i.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = m106662k;
            }
            c2416c.m106648y(interpolation);
            c2416c.m106651v(f2);
            c2416c.m106650w(m106663j + (0.20999998f * f));
            m106680h((f + this.f10003f) * 216.0f);
        }
    }

    /* renamed from: c */
    public final int m106685c(float f, int i, int i2) {
        int i3 = (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i4 = (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i5 = (i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        return ((i3 + ((int) ((((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) - i6))));
    }

    /* renamed from: d */
    public void m106684d(boolean z) {
        this.f9999b.m106649x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f10000c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f9999b.m106672a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m106683e(float f) {
        this.f9999b.m106657p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m106682f(int... iArr) {
        this.f9999b.m106652u(iArr);
        this.f9999b.m106653t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m106681g(float f) {
        this.f9999b.m106650w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9999b.m106670c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void m106680h(float f) {
        this.f10000c = f;
    }

    /* renamed from: i */
    public final void m106679i(float f, float f2, float f3, float f4) {
        C2416c c2416c = this.f9999b;
        float f5 = this.f10001d.getDisplayMetrics().density;
        c2416c.m106647z(f2 * f5);
        c2416c.m106656q(f * f5);
        c2416c.m106653t(0);
        c2416c.m106658o(f3 * f5, f4 * f5);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f10002e.isRunning();
    }

    /* renamed from: j */
    public void m106678j(float f, float f2) {
        this.f9999b.m106648y(f);
        this.f9999b.m106651v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m106677k(float f) {
        this.f9999b.m106647z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m106676l(int i) {
        if (i == 0) {
            m106679i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m106679i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: m */
    public final void m106675m() {
        C2416c c2416c = this.f9999b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C2414a(c2416c));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f9996h);
        ofFloat.addListener(new C2415b(c2416c));
        this.f10002e = ofFloat;
    }

    /* renamed from: n */
    public void m106674n(float f, C2416c c2416c) {
        if (f > 0.75f) {
            c2416c.m106655r(m106685c((f - 0.75f) / 0.25f, c2416c.m106665h(), c2416c.m106668e()));
        } else {
            c2416c.m106655r(c2416c.m106665h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f9999b.m106659n(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9999b.m106654s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f10002e.cancel();
        this.f9999b.m106673A();
        if (this.f9999b.m106669d() != this.f9999b.m106666g()) {
            this.f10004g = true;
            this.f10002e.setDuration(666L);
            this.f10002e.start();
            return;
        }
        this.f9999b.m106653t(0);
        this.f9999b.m106660m();
        this.f10002e.setDuration(1332L);
        this.f10002e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f10002e.cancel();
        m106680h(0.0f);
        this.f9999b.m106649x(false);
        this.f9999b.m106653t(0);
        this.f9999b.m106660m();
        invalidateSelf();
    }
}
