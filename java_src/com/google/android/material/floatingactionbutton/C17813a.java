package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes6.dex */
public class C17813a {

    /* renamed from: D */
    public static final TimeInterpolator f72886D = C27325pf.f103881c;

    /* renamed from: E */
    public static final int f72887E = C49961uf4.motionDurationLong2;

    /* renamed from: F */
    public static final int f72888F = C49961uf4.motionEasingEmphasizedInterpolator;

    /* renamed from: G */
    public static final int f72889G = C49961uf4.motionDurationMedium1;

    /* renamed from: H */
    public static final int f72890H = C49961uf4.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: I */
    public static final int[] f72891I = {16842919, 16842910};

    /* renamed from: J */
    public static final int[] f72892J = {16843623, 16842908, 16842910};

    /* renamed from: K */
    public static final int[] f72893K = {16842908, 16842910};

    /* renamed from: L */
    public static final int[] f72894L = {16843623, 16842910};

    /* renamed from: M */
    public static final int[] f72895M = {16842910};

    /* renamed from: N */
    public static final int[] f72896N = new int[0];

    /* renamed from: C */
    public ViewTreeObserver.OnPreDrawListener f72899C;

    /* renamed from: a */
    public C43037iy5 f72900a;

    /* renamed from: b */
    public PM2 f72901b;

    /* renamed from: c */
    public Drawable f72902c;

    /* renamed from: d */
    public C13592cZ f72903d;

    /* renamed from: e */
    public Drawable f72904e;

    /* renamed from: f */
    public boolean f72905f;

    /* renamed from: h */
    public float f72907h;

    /* renamed from: i */
    public float f72908i;

    /* renamed from: j */
    public float f72909j;

    /* renamed from: k */
    public int f72910k;

    /* renamed from: l */
    public final C52184yP5 f72911l;

    /* renamed from: m */
    public Animator f72912m;

    /* renamed from: n */
    public YV2 f72913n;

    /* renamed from: o */
    public YV2 f72914o;

    /* renamed from: p */
    public float f72915p;

    /* renamed from: r */
    public int f72917r;

    /* renamed from: t */
    public ArrayList<Animator.AnimatorListener> f72919t;

    /* renamed from: u */
    public ArrayList<Animator.AnimatorListener> f72920u;

    /* renamed from: v */
    public ArrayList<InterfaceC17823j> f72921v;

    /* renamed from: w */
    public final FloatingActionButton f72922w;

    /* renamed from: x */
    public final InterfaceC36505Ux5 f72923x;

    /* renamed from: g */
    public boolean f72906g = true;

    /* renamed from: q */
    public float f72916q = 1.0f;

    /* renamed from: s */
    public int f72918s = 0;

    /* renamed from: y */
    public final Rect f72924y = new Rect();

    /* renamed from: z */
    public final RectF f72925z = new RectF();

    /* renamed from: A */
    public final RectF f72897A = new RectF();

    /* renamed from: B */
    public final Matrix f72898B = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes6.dex */
    public class C17814a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f72926a;

        /* renamed from: b */
        public final /* synthetic */ boolean f72927b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC17824k f72928c;

        public C17814a(boolean z, InterfaceC17824k interfaceC17824k) {
            this.f72927b = z;
            this.f72928c = interfaceC17824k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f72926a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            C17813a.this.f72918s = 0;
            C17813a.this.f72912m = null;
            if (!this.f72926a) {
                FloatingActionButton floatingActionButton = C17813a.this.f72922w;
                boolean z = this.f72927b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.m49391d(i, z);
                InterfaceC17824k interfaceC17824k = this.f72928c;
                if (interfaceC17824k != null) {
                    interfaceC17824k.mo49446b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C17813a.this.f72922w.m49391d(0, this.f72927b);
            C17813a.this.f72918s = 1;
            C17813a.this.f72912m = animator;
            this.f72926a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes6.dex */
    public class C17815b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f72930a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC17824k f72931b;

        public C17815b(boolean z, InterfaceC17824k interfaceC17824k) {
            this.f72930a = z;
            this.f72931b = interfaceC17824k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C17813a.this.f72918s = 0;
            C17813a.this.f72912m = null;
            InterfaceC17824k interfaceC17824k = this.f72931b;
            if (interfaceC17824k != null) {
                interfaceC17824k.mo49447a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C17813a.this.f72922w.m49391d(0, this.f72930a);
            C17813a.this.f72918s = 2;
            C17813a.this.f72912m = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: classes6.dex */
    public class C17816c extends C44456lN2 {
        public C17816c() {
        }

        @Override // p000.C44456lN2, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C17813a.this.f72916q = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: classes6.dex */
    public class C17817d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f72934a;

        /* renamed from: b */
        public final /* synthetic */ float f72935b;

        /* renamed from: c */
        public final /* synthetic */ float f72936c;

        /* renamed from: d */
        public final /* synthetic */ float f72937d;

        /* renamed from: e */
        public final /* synthetic */ float f72938e;

        /* renamed from: f */
        public final /* synthetic */ float f72939f;

        /* renamed from: g */
        public final /* synthetic */ float f72940g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f72941h;

        public C17817d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f72934a = f;
            this.f72935b = f2;
            this.f72936c = f3;
            this.f72937d = f4;
            this.f72938e = f5;
            this.f72939f = f6;
            this.f72940g = f7;
            this.f72941h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C17813a.this.f72922w.setAlpha(C27325pf.m19014b(this.f72934a, this.f72935b, 0.0f, 0.2f, floatValue));
            C17813a.this.f72922w.setScaleX(C27325pf.m19015a(this.f72936c, this.f72937d, floatValue));
            C17813a.this.f72922w.setScaleY(C27325pf.m19015a(this.f72938e, this.f72937d, floatValue));
            C17813a.this.f72916q = C27325pf.m19015a(this.f72939f, this.f72940g, floatValue);
            C17813a.this.m49464h(C27325pf.m19015a(this.f72939f, this.f72940g, floatValue), this.f72941h);
            C17813a.this.f72922w.setImageMatrix(this.f72941h);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: classes6.dex */
    public class C17818e implements TypeEvaluator<Float> {

        /* renamed from: a */
        public FloatEvaluator f72943a = new FloatEvaluator();

        public C17818e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f72943a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: classes6.dex */
    public class ViewTreeObserver$OnPreDrawListenerC17819f implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC17819f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C17813a.this.m49494D();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: classes6.dex */
    public class C17820g extends AbstractC17826m {
        public C17820g() {
            super(C17813a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C17813a.AbstractC17826m
        /* renamed from: a */
        public float mo49445a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: classes6.dex */
    public class C17821h extends AbstractC17826m {
        public C17821h() {
            super(C17813a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C17813a.AbstractC17826m
        /* renamed from: a */
        public float mo49445a() {
            C17813a c17813a = C17813a.this;
            return c17813a.f72907h + c17813a.f72908i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: classes6.dex */
    public class C17822i extends AbstractC17826m {
        public C17822i() {
            super(C17813a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C17813a.AbstractC17826m
        /* renamed from: a */
        public float mo49445a() {
            C17813a c17813a = C17813a.this;
            return c17813a.f72907h + c17813a.f72909j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    /* loaded from: classes6.dex */
    public interface InterfaceC17823j {
        /* renamed from: a */
        void mo49449a();

        /* renamed from: b */
        void mo49448b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    /* loaded from: classes6.dex */
    public interface InterfaceC17824k {
        /* renamed from: a */
        void mo49447a();

        /* renamed from: b */
        void mo49446b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    /* loaded from: classes6.dex */
    public class C17825l extends AbstractC17826m {
        public C17825l() {
            super(C17813a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C17813a.AbstractC17826m
        /* renamed from: a */
        public float mo49445a() {
            return C17813a.this.f72907h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$m */
    /* loaded from: classes6.dex */
    public abstract class AbstractC17826m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f72950a;

        /* renamed from: b */
        public float f72951b;

        /* renamed from: c */
        public float f72952c;

        public AbstractC17826m() {
        }

        /* renamed from: a */
        public abstract float mo49445a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C17813a.this.m49470c0((int) this.f72952c);
            this.f72950a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float m90380w;
            if (!this.f72950a) {
                PM2 pm2 = C17813a.this.f72901b;
                if (pm2 == null) {
                    m90380w = 0.0f;
                } else {
                    m90380w = pm2.m90380w();
                }
                this.f72951b = m90380w;
                this.f72952c = mo49445a();
                this.f72950a = true;
            }
            C17813a c17813a = C17813a.this;
            float f = this.f72951b;
            c17813a.m49470c0((int) (f + ((this.f72952c - f) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ AbstractC17826m(C17813a c17813a, C17814a c17814a) {
            this();
        }
    }

    public C17813a(FloatingActionButton floatingActionButton, InterfaceC36505Ux5 interfaceC36505Ux5) {
        this.f72922w = floatingActionButton;
        this.f72923x = interfaceC36505Ux5;
        C52184yP5 c52184yP5 = new C52184yP5();
        this.f72911l = c52184yP5;
        c52184yP5.m3523a(f72891I, m49461k(new C17822i()));
        c52184yP5.m3523a(f72892J, m49461k(new C17821h()));
        c52184yP5.m3523a(f72893K, m49461k(new C17821h()));
        c52184yP5.m3523a(f72894L, m49461k(new C17821h()));
        c52184yP5.m3523a(f72895M, m49461k(new C17825l()));
        c52184yP5.m3523a(f72896N, m49461k(new C17820g()));
        this.f72915p = floatingActionButton.getRotation();
    }

    /* renamed from: A */
    public void mo7802A(int[] iArr) {
        throw null;
    }

    /* renamed from: B */
    public void mo7801B(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: C */
    public void m49495C(Rect rect) {
        HZ3.m103730h(this.f72904e, "Didn't initialize content background");
        if (mo7798V()) {
            this.f72923x.mo49497b(new InsetDrawable(this.f72904e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f72923x.mo49497b(this.f72904e);
    }

    /* renamed from: D */
    public void m49494D() {
        float rotation = this.f72922w.getRotation();
        if (this.f72915p != rotation) {
            this.f72915p = rotation;
            mo7797Z();
        }
    }

    /* renamed from: E */
    public void m49493E() {
        ArrayList<InterfaceC17823j> arrayList = this.f72921v;
        if (arrayList != null) {
            Iterator<InterfaceC17823j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo49449a();
            }
        }
    }

    /* renamed from: F */
    public void m49492F() {
        ArrayList<InterfaceC17823j> arrayList = this.f72921v;
        if (arrayList != null) {
            Iterator<InterfaceC17823j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo49448b();
            }
        }
    }

    /* renamed from: G */
    public boolean mo7800G() {
        throw null;
    }

    /* renamed from: H */
    public void m49491H(ColorStateList colorStateList) {
        PM2 pm2 = this.f72901b;
        if (pm2 != null) {
            pm2.setTintList(colorStateList);
        }
        C13592cZ c13592cZ = this.f72903d;
        if (c13592cZ != null) {
            c13592cZ.m61219c(colorStateList);
        }
    }

    /* renamed from: I */
    public void m49490I(PorterDuff.Mode mode) {
        PM2 pm2 = this.f72901b;
        if (pm2 != null) {
            pm2.setTintMode(mode);
        }
    }

    /* renamed from: J */
    public final void m49489J(float f) {
        if (this.f72907h != f) {
            this.f72907h = f;
            mo7801B(f, this.f72908i, this.f72909j);
        }
    }

    /* renamed from: K */
    public void m49488K(boolean z) {
        this.f72905f = z;
    }

    /* renamed from: L */
    public final void m49487L(YV2 yv2) {
        this.f72914o = yv2;
    }

    /* renamed from: M */
    public final void m49486M(float f) {
        if (this.f72908i != f) {
            this.f72908i = f;
            mo7801B(this.f72907h, f, this.f72909j);
        }
    }

    /* renamed from: N */
    public final void m49485N(float f) {
        this.f72916q = f;
        Matrix matrix = this.f72898B;
        m49464h(f, matrix);
        this.f72922w.setImageMatrix(matrix);
    }

    /* renamed from: O */
    public final void m49484O(int i) {
        if (this.f72917r != i) {
            this.f72917r = i;
            m49474a0();
        }
    }

    /* renamed from: P */
    public void m49483P(int i) {
        this.f72910k = i;
    }

    /* renamed from: Q */
    public final void m49482Q(float f) {
        if (this.f72909j != f) {
            this.f72909j = f;
            mo7801B(this.f72907h, this.f72908i, f);
        }
    }

    /* renamed from: R */
    public void mo7799R(ColorStateList colorStateList) {
        Drawable drawable = this.f72902c;
        if (drawable != null) {
            P61.m90837o(drawable, C52886zb5.m1051d(colorStateList));
        }
    }

    /* renamed from: S */
    public void m49481S(boolean z) {
        this.f72906g = z;
        m49472b0();
    }

    /* renamed from: T */
    public final void m49480T(C43037iy5 c43037iy5) {
        this.f72900a = c43037iy5;
        PM2 pm2 = this.f72901b;
        if (pm2 != null) {
            pm2.setShapeAppearanceModel(c43037iy5);
        }
        Drawable drawable = this.f72902c;
        if (drawable instanceof InterfaceC32302Cy5) {
            ((InterfaceC32302Cy5) drawable).setShapeAppearanceModel(c43037iy5);
        }
        C13592cZ c13592cZ = this.f72903d;
        if (c13592cZ != null) {
            c13592cZ.m61216f(c43037iy5);
        }
    }

    /* renamed from: U */
    public final void m49479U(YV2 yv2) {
        this.f72913n = yv2;
    }

    /* renamed from: V */
    public boolean mo7798V() {
        throw null;
    }

    /* renamed from: W */
    public final boolean m49478W() {
        return C38790bq6.m62504Z(this.f72922w) && !this.f72922w.isInEditMode();
    }

    /* renamed from: X */
    public final boolean m49477X() {
        return !this.f72905f || this.f72922w.m49517r() >= this.f72910k;
    }

    /* renamed from: Y */
    public void m49476Y(InterfaceC17824k interfaceC17824k, boolean z) {
        boolean z2;
        AnimatorSet m49462j;
        float f;
        float f2;
        if (m49453v()) {
            return;
        }
        Animator animator = this.f72912m;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f72913n == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m49478W()) {
            if (this.f72922w.getVisibility() != 0) {
                float f3 = 0.0f;
                this.f72922w.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.f72922w;
                if (z2) {
                    f = 0.4f;
                } else {
                    f = 0.0f;
                }
                floatingActionButton.setScaleY(f);
                FloatingActionButton floatingActionButton2 = this.f72922w;
                if (z2) {
                    f2 = 0.4f;
                } else {
                    f2 = 0.0f;
                }
                floatingActionButton2.setScaleX(f2);
                if (z2) {
                    f3 = 0.4f;
                }
                m49485N(f3);
            }
            YV2 yv2 = this.f72913n;
            if (yv2 != null) {
                m49462j = m49463i(yv2, 1.0f, 1.0f, 1.0f);
            } else {
                m49462j = m49462j(1.0f, 1.0f, 1.0f, f72887E, f72888F);
            }
            m49462j.addListener(new C17815b(z, interfaceC17824k));
            ArrayList<Animator.AnimatorListener> arrayList = this.f72919t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m49462j.addListener(it.next());
                }
            }
            m49462j.start();
            return;
        }
        this.f72922w.m49391d(0, z);
        this.f72922w.setAlpha(1.0f);
        this.f72922w.setScaleY(1.0f);
        this.f72922w.setScaleX(1.0f);
        m49485N(1.0f);
        if (interfaceC17824k != null) {
            interfaceC17824k.mo49447a();
        }
    }

    /* renamed from: Z */
    public void mo7797Z() {
        throw null;
    }

    /* renamed from: a0 */
    public final void m49474a0() {
        m49485N(this.f72916q);
    }

    /* renamed from: b0 */
    public final void m49472b0() {
        Rect rect = this.f72924y;
        mo7791p(rect);
        m49495C(rect);
        this.f72923x.mo49498a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: c0 */
    public void m49470c0(float f) {
        PM2 pm2 = this.f72901b;
        if (pm2 != null) {
            pm2.m90417Z(f);
        }
    }

    /* renamed from: d0 */
    public final void m49468d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C17818e());
    }

    /* renamed from: e */
    public void m49467e(Animator.AnimatorListener animatorListener) {
        if (this.f72920u == null) {
            this.f72920u = new ArrayList<>();
        }
        this.f72920u.add(animatorListener);
    }

    /* renamed from: f */
    public void m49466f(Animator.AnimatorListener animatorListener) {
        if (this.f72919t == null) {
            this.f72919t = new ArrayList<>();
        }
        this.f72919t.add(animatorListener);
    }

    /* renamed from: g */
    public void m49465g(InterfaceC17823j interfaceC17823j) {
        if (this.f72921v == null) {
            this.f72921v = new ArrayList<>();
        }
        this.f72921v.add(interfaceC17823j);
    }

    /* renamed from: h */
    public final void m49464h(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f72922w.getDrawable();
        if (drawable != null && this.f72917r != 0) {
            RectF rectF = this.f72925z;
            RectF rectF2 = this.f72897A;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i = this.f72917r;
            rectF2.set(0.0f, 0.0f, i, i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f72917r;
            matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
        }
    }

    /* renamed from: i */
    public final AnimatorSet m49463i(YV2 yv2, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f72922w, View.ALPHA, f);
        yv2.m74978h("opacity").m73011a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f72922w, View.SCALE_X, f2);
        yv2.m74978h("scale").m73011a(ofFloat2);
        m49468d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f72922w, View.SCALE_Y, f2);
        yv2.m74978h("scale").m73011a(ofFloat3);
        m49468d0(ofFloat3);
        arrayList.add(ofFloat3);
        m49464h(f3, this.f72898B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f72922w, new DX1(), new C17816c(), new Matrix(this.f72898B));
        yv2.m74978h("iconScale").m73011a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0168Af.m115414a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: j */
    public final AnimatorSet m49462j(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C17817d(this.f72922w.getAlpha(), f, this.f72922w.getScaleX(), f2, this.f72922w.getScaleY(), this.f72916q, f3, new Matrix(this.f72898B)));
        arrayList.add(ofFloat);
        C0168Af.m115414a(animatorSet, arrayList);
        animatorSet.setDuration(C37997aW2.m71261f(this.f72922w.getContext(), i, this.f72922w.getContext().getResources().getInteger(C35667Ri4.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C37997aW2.m71260g(this.f72922w.getContext(), i2, C27325pf.f103880b));
        return animatorSet;
    }

    /* renamed from: k */
    public final ValueAnimator m49461k(AbstractC17826m abstractC17826m) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f72886D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC17826m);
        valueAnimator.addUpdateListener(abstractC17826m);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: l */
    public float mo7792l() {
        throw null;
    }

    /* renamed from: m */
    public boolean m49460m() {
        return this.f72905f;
    }

    /* renamed from: n */
    public final YV2 m49459n() {
        return this.f72914o;
    }

    /* renamed from: o */
    public final ViewTreeObserver.OnPreDrawListener m49458o() {
        if (this.f72899C == null) {
            this.f72899C = new ViewTreeObserver$OnPreDrawListenerC17819f();
        }
        return this.f72899C;
    }

    /* renamed from: p */
    public void mo7791p(Rect rect) {
        int i;
        float f;
        if (this.f72905f) {
            i = (this.f72910k - this.f72922w.m49517r()) / 2;
        } else {
            i = 0;
        }
        if (this.f72906g) {
            f = mo7792l() + this.f72909j;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil(f));
        int max2 = Math.max(i, (int) Math.ceil(f * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: q */
    public final C43037iy5 m49457q() {
        return this.f72900a;
    }

    /* renamed from: r */
    public final YV2 m49456r() {
        return this.f72913n;
    }

    /* renamed from: s */
    public void m49455s(InterfaceC17824k interfaceC17824k, boolean z) {
        int i;
        AnimatorSet m49462j;
        if (m49454u()) {
            return;
        }
        Animator animator = this.f72912m;
        if (animator != null) {
            animator.cancel();
        }
        if (m49478W()) {
            YV2 yv2 = this.f72914o;
            if (yv2 != null) {
                m49462j = m49463i(yv2, 0.0f, 0.0f, 0.0f);
            } else {
                m49462j = m49462j(0.0f, 0.4f, 0.4f, f72889G, f72890H);
            }
            m49462j.addListener(new C17814a(z, interfaceC17824k));
            ArrayList<Animator.AnimatorListener> arrayList = this.f72920u;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m49462j.addListener(it.next());
                }
            }
            m49462j.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.f72922w;
        if (z) {
            i = 8;
        } else {
            i = 4;
        }
        floatingActionButton.m49391d(i, z);
        if (interfaceC17824k != null) {
            interfaceC17824k.mo49446b();
        }
    }

    /* renamed from: t */
    public void mo7790t(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    /* renamed from: u */
    public boolean m49454u() {
        if (this.f72922w.getVisibility() == 0) {
            if (this.f72918s != 1) {
                return false;
            }
            return true;
        } else if (this.f72918s == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: v */
    public boolean m49453v() {
        if (this.f72922w.getVisibility() != 0) {
            if (this.f72918s != 2) {
                return false;
            }
            return true;
        } else if (this.f72918s == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: w */
    public void mo7789w() {
        throw null;
    }

    /* renamed from: x */
    public void m49452x() {
        PM2 pm2 = this.f72901b;
        if (pm2 != null) {
            QM2.m88638f(this.f72922w, pm2);
        }
        if (mo7800G()) {
            this.f72922w.getViewTreeObserver().addOnPreDrawListener(m49458o());
        }
    }

    /* renamed from: y */
    public void mo7788y() {
        throw null;
    }

    /* renamed from: z */
    public void m49451z() {
        ViewTreeObserver viewTreeObserver = this.f72922w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f72899C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f72899C = null;
        }
    }
}
