package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
/* renamed from: Cj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32162Cj0 extends AbstractC46621p12<ObjectAnimator> {

    /* renamed from: l */
    public static final int[] f4534l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    public static final int[] f4535m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    public static final int[] f4536n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    public static final Property<C32162Cj0, Float> f4537o = new C1142c(Float.class, "animationFraction");

    /* renamed from: p */
    public static final Property<C32162Cj0, Float> f4538p = new C1143d(Float.class, "completeEndFraction");

    /* renamed from: d */
    public ObjectAnimator f4539d;

    /* renamed from: e */
    public ObjectAnimator f4540e;

    /* renamed from: f */
    public final C34269Lj1 f4541f;

    /* renamed from: g */
    public final AbstractC30476yC f4542g;

    /* renamed from: h */
    public int f4543h;

    /* renamed from: i */
    public float f4544i;

    /* renamed from: j */
    public float f4545j;

    /* renamed from: k */
    public AbstractC27016oe f4546k;

    /* renamed from: Cj0$a */
    /* loaded from: classes6.dex */
    public class C1140a extends AnimatorListenerAdapter {
        public C1140a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C32162Cj0 c32162Cj0 = C32162Cj0.this;
            c32162Cj0.f4543h = (c32162Cj0.f4543h + 4) % C32162Cj0.this.f4542g.f118949c.length;
        }
    }

    /* renamed from: Cj0$b */
    /* loaded from: classes6.dex */
    public class C1141b extends AnimatorListenerAdapter {
        public C1141b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C32162Cj0.this.mo20155a();
            C32162Cj0 c32162Cj0 = C32162Cj0.this;
            AbstractC27016oe abstractC27016oe = c32162Cj0.f4546k;
            if (abstractC27016oe != null) {
                abstractC27016oe.onAnimationEnd(c32162Cj0.f102949a);
            }
        }
    }

    /* renamed from: Cj0$c */
    /* loaded from: classes6.dex */
    public class C1142c extends Property<C32162Cj0, Float> {
        public C1142c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C32162Cj0 c32162Cj0) {
            return Float.valueOf(c32162Cj0.m111805o());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C32162Cj0 c32162Cj0, Float f) {
            c32162Cj0.m111800t(f.floatValue());
        }
    }

    /* renamed from: Cj0$d */
    /* loaded from: classes6.dex */
    public class C1143d extends Property<C32162Cj0, Float> {
        public C1143d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C32162Cj0 c32162Cj0) {
            return Float.valueOf(c32162Cj0.m111804p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C32162Cj0 c32162Cj0, Float f) {
            c32162Cj0.m111799u(f.floatValue());
        }
    }

    public C32162Cj0(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f4543h = 0;
        this.f4546k = null;
        this.f4542g = circularProgressIndicatorSpec;
        this.f4541f = new C34269Lj1();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: a */
    public void mo20155a() {
        ObjectAnimator objectAnimator = this.f4539d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: c */
    public void mo20153c() {
        m111801s();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: d */
    public void mo20152d(AbstractC27016oe abstractC27016oe) {
        this.f4546k = abstractC27016oe;
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: f */
    public void mo20150f() {
        ObjectAnimator objectAnimator = this.f4540e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f102949a.isVisible()) {
                this.f4540e.start();
            } else {
                mo20155a();
            }
        }
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: g */
    public void mo20149g() {
        m111803q();
        m111801s();
        this.f4539d.start();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: h */
    public void mo20148h() {
        this.f4546k = null;
    }

    /* renamed from: o */
    public final float m111805o() {
        return this.f4544i;
    }

    /* renamed from: p */
    public final float m111804p() {
        return this.f4545j;
    }

    /* renamed from: q */
    public final void m111803q() {
        if (this.f4539d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f4537o, 0.0f, 1.0f);
            this.f4539d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f4539d.setInterpolator(null);
            this.f4539d.setRepeatCount(-1);
            this.f4539d.addListener(new C1140a());
        }
        if (this.f4540e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f4538p, 0.0f, 1.0f);
            this.f4540e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f4540e.setInterpolator(this.f4541f);
            this.f4540e.addListener(new C1141b());
        }
    }

    /* renamed from: r */
    public final void m111802r(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float m20154b = m20154b(i, f4536n[i2], 333);
            if (m20154b >= 0.0f && m20154b <= 1.0f) {
                int i3 = i2 + this.f4543h;
                int[] iArr = this.f4542g.f118949c;
                int length = i3 % iArr.length;
                this.f102951c[0] = C25240ko.m28439b().evaluate(this.f4541f.getInterpolation(m20154b), Integer.valueOf(HM2.m103955a(iArr[length], this.f102949a.getAlpha())), Integer.valueOf(HM2.m103955a(this.f4542g.f118949c[(length + 1) % iArr.length], this.f102949a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* renamed from: s */
    public void m111801s() {
        this.f4543h = 0;
        this.f102951c[0] = HM2.m103955a(this.f4542g.f118949c[0], this.f102949a.getAlpha());
        this.f4545j = 0.0f;
    }

    /* renamed from: t */
    public void m111800t(float f) {
        this.f4544i = f;
        int i = (int) (f * 5400.0f);
        m111798v(i);
        m111802r(i);
        this.f102949a.invalidateSelf();
    }

    /* renamed from: u */
    public final void m111799u(float f) {
        this.f4545j = f;
    }

    /* renamed from: v */
    public final void m111798v(int i) {
        float[] fArr = this.f102950b;
        float f = this.f4544i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float m20154b = m20154b(i, f4534l[i2], 667);
            float[] fArr2 = this.f102950b;
            fArr2[1] = fArr2[1] + (this.f4541f.getInterpolation(m20154b) * 250.0f);
            float m20154b2 = m20154b(i, f4535m[i2], 667);
            float[] fArr3 = this.f102950b;
            fArr3[0] = fArr3[0] + (this.f4541f.getInterpolation(m20154b2) * 250.0f);
        }
        float[] fArr4 = this.f102950b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f4545j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }
}
