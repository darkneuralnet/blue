package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
/* renamed from: Hr2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33406Hr2 extends AbstractC46621p12<ObjectAnimator> {

    /* renamed from: j */
    public static final Property<C33406Hr2, Float> f13944j = new C3237b(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f13945d;

    /* renamed from: e */
    public C34269Lj1 f13946e;

    /* renamed from: f */
    public final AbstractC30476yC f13947f;

    /* renamed from: g */
    public int f13948g;

    /* renamed from: h */
    public boolean f13949h;

    /* renamed from: i */
    public float f13950i;

    /* renamed from: Hr2$a */
    /* loaded from: classes6.dex */
    public class C3236a extends AnimatorListenerAdapter {
        public C3236a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C33406Hr2 c33406Hr2 = C33406Hr2.this;
            c33406Hr2.f13948g = (c33406Hr2.f13948g + 1) % C33406Hr2.this.f13947f.f118949c.length;
            C33406Hr2.this.f13949h = true;
        }
    }

    /* renamed from: Hr2$b */
    /* loaded from: classes6.dex */
    public class C3237b extends Property<C33406Hr2, Float> {
        public C3237b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C33406Hr2 c33406Hr2) {
            return Float.valueOf(c33406Hr2.m103385n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C33406Hr2 c33406Hr2, Float f) {
            c33406Hr2.m103381r(f.floatValue());
        }
    }

    public C33406Hr2(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f13948g = 1;
        this.f13947f = linearProgressIndicatorSpec;
        this.f13946e = new C34269Lj1();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: a */
    public void mo20155a() {
        ObjectAnimator objectAnimator = this.f13945d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: c */
    public void mo20153c() {
        m103382q();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: d */
    public void mo20152d(AbstractC27016oe abstractC27016oe) {
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: f */
    public void mo20150f() {
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: g */
    public void mo20149g() {
        m103384o();
        m103382q();
        this.f13945d.start();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: h */
    public void mo20148h() {
    }

    /* renamed from: n */
    public final float m103385n() {
        return this.f13950i;
    }

    /* renamed from: o */
    public final void m103384o() {
        if (this.f13945d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13944j, 0.0f, 1.0f);
            this.f13945d = ofFloat;
            ofFloat.setDuration(333L);
            this.f13945d.setInterpolator(null);
            this.f13945d.setRepeatCount(-1);
            this.f13945d.addListener(new C3236a());
        }
    }

    /* renamed from: p */
    public final void m103383p() {
        if (this.f13949h && this.f102950b[3] < 1.0f) {
            int[] iArr = this.f102951c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = HM2.m103955a(this.f13947f.f118949c[this.f13948g], this.f102949a.getAlpha());
            this.f13949h = false;
        }
    }

    /* renamed from: q */
    public void m103382q() {
        this.f13949h = true;
        this.f13948g = 1;
        Arrays.fill(this.f102951c, HM2.m103955a(this.f13947f.f118949c[0], this.f102949a.getAlpha()));
    }

    /* renamed from: r */
    public void m103381r(float f) {
        this.f13950i = f;
        m103380s((int) (f * 333.0f));
        m103383p();
        this.f102949a.invalidateSelf();
    }

    /* renamed from: s */
    public final void m103380s(int i) {
        this.f102950b[0] = 0.0f;
        float m20154b = m20154b(i, 0, 667);
        float[] fArr = this.f102950b;
        float interpolation = this.f13946e.getInterpolation(m20154b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f102950b;
        float interpolation2 = this.f13946e.getInterpolation(m20154b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f102950b[5] = 1.0f;
    }
}
