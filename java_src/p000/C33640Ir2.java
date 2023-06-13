package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
/* renamed from: Ir2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33640Ir2 extends AbstractC46621p12<ObjectAnimator> {

    /* renamed from: l */
    public static final int[] f16323l = {533, 567, 850, 750};

    /* renamed from: m */
    public static final int[] f16324m = {1267, 1000, 333, 0};

    /* renamed from: n */
    public static final Property<C33640Ir2, Float> f16325n = new C3786c(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f16326d;

    /* renamed from: e */
    public ObjectAnimator f16327e;

    /* renamed from: f */
    public final Interpolator[] f16328f;

    /* renamed from: g */
    public final AbstractC30476yC f16329g;

    /* renamed from: h */
    public int f16330h;

    /* renamed from: i */
    public boolean f16331i;

    /* renamed from: j */
    public float f16332j;

    /* renamed from: k */
    public AbstractC27016oe f16333k;

    /* renamed from: Ir2$a */
    /* loaded from: classes6.dex */
    public class C3784a extends AnimatorListenerAdapter {
        public C3784a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C33640Ir2 c33640Ir2 = C33640Ir2.this;
            c33640Ir2.f16330h = (c33640Ir2.f16330h + 1) % C33640Ir2.this.f16329g.f118949c.length;
            C33640Ir2.this.f16331i = true;
        }
    }

    /* renamed from: Ir2$b */
    /* loaded from: classes6.dex */
    public class C3785b extends AnimatorListenerAdapter {
        public C3785b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C33640Ir2.this.mo20155a();
            C33640Ir2 c33640Ir2 = C33640Ir2.this;
            AbstractC27016oe abstractC27016oe = c33640Ir2.f16333k;
            if (abstractC27016oe != null) {
                abstractC27016oe.onAnimationEnd(c33640Ir2.f102949a);
            }
        }
    }

    /* renamed from: Ir2$c */
    /* loaded from: classes6.dex */
    public class C3786c extends Property<C33640Ir2, Float> {
        public C3786c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C33640Ir2 c33640Ir2) {
            return Float.valueOf(c33640Ir2.m101589n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C33640Ir2 c33640Ir2, Float f) {
            c33640Ir2.m101585r(f.floatValue());
        }
    }

    public C33640Ir2(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f16330h = 0;
        this.f16333k = null;
        this.f16329g = linearProgressIndicatorSpec;
        this.f16328f = new Interpolator[]{C27968rf.m15613a(context, C38085af4.linear_indeterminate_line1_head_interpolator), C27968rf.m15613a(context, C38085af4.linear_indeterminate_line1_tail_interpolator), C27968rf.m15613a(context, C38085af4.linear_indeterminate_line2_head_interpolator), C27968rf.m15613a(context, C38085af4.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: a */
    public void mo20155a() {
        ObjectAnimator objectAnimator = this.f16326d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: c */
    public void mo20153c() {
        m101586q();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: d */
    public void mo20152d(AbstractC27016oe abstractC27016oe) {
        this.f16333k = abstractC27016oe;
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: f */
    public void mo20150f() {
        ObjectAnimator objectAnimator = this.f16327e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo20155a();
            if (this.f102949a.isVisible()) {
                this.f16327e.setFloatValues(this.f16332j, 1.0f);
                this.f16327e.setDuration((1.0f - this.f16332j) * 1800.0f);
                this.f16327e.start();
            }
        }
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: g */
    public void mo20149g() {
        m101588o();
        m101586q();
        this.f16326d.start();
    }

    @Override // p000.AbstractC46621p12
    /* renamed from: h */
    public void mo20148h() {
        this.f16333k = null;
    }

    /* renamed from: n */
    public final float m101589n() {
        return this.f16332j;
    }

    /* renamed from: o */
    public final void m101588o() {
        if (this.f16326d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f16325n, 0.0f, 1.0f);
            this.f16326d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f16326d.setInterpolator(null);
            this.f16326d.setRepeatCount(-1);
            this.f16326d.addListener(new C3784a());
        }
        if (this.f16327e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f16325n, 1.0f);
            this.f16327e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f16327e.setInterpolator(null);
            this.f16327e.addListener(new C3785b());
        }
    }

    /* renamed from: p */
    public final void m101587p() {
        if (this.f16331i) {
            Arrays.fill(this.f102951c, HM2.m103955a(this.f16329g.f118949c[this.f16330h], this.f102949a.getAlpha()));
            this.f16331i = false;
        }
    }

    /* renamed from: q */
    public void m101586q() {
        this.f16330h = 0;
        int m103955a = HM2.m103955a(this.f16329g.f118949c[0], this.f102949a.getAlpha());
        int[] iArr = this.f102951c;
        iArr[0] = m103955a;
        iArr[1] = m103955a;
    }

    /* renamed from: r */
    public void m101585r(float f) {
        this.f16332j = f;
        m101584s((int) (f * 1800.0f));
        m101587p();
        this.f102949a.invalidateSelf();
    }

    /* renamed from: s */
    public final void m101584s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f102950b[i2] = Math.max(0.0f, Math.min(1.0f, this.f16328f[i2].getInterpolation(m20154b(i, f16324m[i2], f16323l[i2]))));
        }
    }
}
