package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
/* renamed from: g71  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC41343g71 extends Drawable implements Animatable {

    /* renamed from: p */
    public static final Property<AbstractC41343g71, Float> f81624p = new C20757c(Float.class, "growFraction");

    /* renamed from: b */
    public final Context f81625b;

    /* renamed from: c */
    public final AbstractC30476yC f81626c;

    /* renamed from: e */
    public ValueAnimator f81628e;

    /* renamed from: f */
    public ValueAnimator f81629f;

    /* renamed from: g */
    public boolean f81630g;

    /* renamed from: h */
    public boolean f81631h;

    /* renamed from: i */
    public float f81632i;

    /* renamed from: j */
    public List<AbstractC27016oe> f81633j;

    /* renamed from: k */
    public AbstractC27016oe f81634k;

    /* renamed from: l */
    public boolean f81635l;

    /* renamed from: m */
    public float f81636m;

    /* renamed from: o */
    public int f81638o;

    /* renamed from: n */
    public final Paint f81637n = new Paint();

    /* renamed from: d */
    public C30653yf f81627d = new C30653yf();

    /* renamed from: g71$a */
    /* loaded from: classes6.dex */
    public class C20755a extends AnimatorListenerAdapter {
        public C20755a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC41343g71.this.m40001f();
        }
    }

    /* renamed from: g71$b */
    /* loaded from: classes6.dex */
    public class C20756b extends AnimatorListenerAdapter {
        public C20756b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC41343g71.super.setVisible(false, false);
            AbstractC41343g71.this.m40002e();
        }
    }

    /* renamed from: g71$c */
    /* loaded from: classes6.dex */
    public class C20757c extends Property<AbstractC41343g71, Float> {
        public C20757c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(AbstractC41343g71 abstractC41343g71) {
            return Float.valueOf(abstractC41343g71.m39999h());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(AbstractC41343g71 abstractC41343g71, Float f) {
            abstractC41343g71.m39997n(f.floatValue());
        }
    }

    public AbstractC41343g71(Context context, AbstractC30476yC abstractC30476yC) {
        this.f81625b = context;
        this.f81626c = abstractC30476yC;
        setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: d */
    public final void m40003d(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f81635l;
        this.f81635l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f81635l = z;
    }

    /* renamed from: e */
    public final void m40002e() {
        AbstractC27016oe abstractC27016oe = this.f81634k;
        if (abstractC27016oe != null) {
            abstractC27016oe.onAnimationEnd(this);
        }
        List<AbstractC27016oe> list = this.f81633j;
        if (list != null && !this.f81635l) {
            for (AbstractC27016oe abstractC27016oe2 : list) {
                abstractC27016oe2.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: f */
    public final void m40001f() {
        AbstractC27016oe abstractC27016oe = this.f81634k;
        if (abstractC27016oe != null) {
            abstractC27016oe.onAnimationStart(this);
        }
        List<AbstractC27016oe> list = this.f81633j;
        if (list != null && !this.f81635l) {
            for (AbstractC27016oe abstractC27016oe2 : list) {
                abstractC27016oe2.onAnimationStart(this);
            }
        }
    }

    /* renamed from: g */
    public final void m40000g(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f81635l;
        this.f81635l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f81635l = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f81638o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float m39999h() {
        if (!this.f81626c.m3858b() && !this.f81626c.m3859a()) {
            return 1.0f;
        }
        if (!this.f81631h && !this.f81630g) {
            return this.f81636m;
        }
        return this.f81632i;
    }

    /* renamed from: i */
    public boolean mo18320i() {
        return mo18316q(false, false, false);
    }

    public boolean isRunning() {
        return mo18318k() || mo18319j();
    }

    /* renamed from: j */
    public boolean mo18319j() {
        ValueAnimator valueAnimator = this.f81629f;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f81631h;
    }

    /* renamed from: k */
    public boolean mo18318k() {
        ValueAnimator valueAnimator = this.f81628e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f81630g;
    }

    /* renamed from: l */
    public final void m39998l() {
        if (this.f81628e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f81624p, 0.0f, 1.0f);
            this.f81628e = ofFloat;
            ofFloat.setDuration(500L);
            this.f81628e.setInterpolator(C27325pf.f103880b);
            m39995p(this.f81628e);
        }
        if (this.f81629f == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f81624p, 1.0f, 0.0f);
            this.f81629f = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f81629f.setInterpolator(C27325pf.f103880b);
            m39996o(this.f81629f);
        }
    }

    /* renamed from: m */
    public void mo18317m(AbstractC27016oe abstractC27016oe) {
        if (this.f81633j == null) {
            this.f81633j = new ArrayList();
        }
        if (!this.f81633j.contains(abstractC27016oe)) {
            this.f81633j.add(abstractC27016oe);
        }
    }

    /* renamed from: n */
    public void m39997n(float f) {
        if (this.f81636m != f) {
            this.f81636m = f;
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void m39996o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f81629f;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f81629f = valueAnimator;
        valueAnimator.addListener(new C20756b());
    }

    /* renamed from: p */
    public final void m39995p(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f81628e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f81628e = valueAnimator;
        valueAnimator.addListener(new C20755a());
    }

    /* renamed from: q */
    public boolean mo18316q(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float m3038a = this.f81627d.m3038a(this.f81625b.getContentResolver());
        if (z3 && m3038a > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return mo18315r(z, z2, z4);
    }

    /* renamed from: r */
    public boolean mo18315r(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z4;
        boolean m3859a;
        m39998l();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f81628e;
        } else {
            valueAnimator = this.f81629f;
        }
        if (z) {
            valueAnimator2 = this.f81629f;
        } else {
            valueAnimator2 = this.f81628e;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                m40003d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m40000g(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z && !super.setVisible(z, false)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z) {
                m3859a = this.f81626c.m3858b();
            } else {
                m3859a = this.f81626c.m3859a();
            }
            if (!m3859a) {
                m40000g(valueAnimator);
                return z4;
            }
            if (!z2 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z4;
        }
    }

    /* renamed from: s */
    public boolean mo18314s(AbstractC27016oe abstractC27016oe) {
        List<AbstractC27016oe> list = this.f81633j;
        if (list != null && list.contains(abstractC27016oe)) {
            this.f81633j.remove(abstractC27016oe);
            if (this.f81633j.isEmpty()) {
                this.f81633j = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f81638o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f81637n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return mo18316q(z, z2, true);
    }

    public void start() {
        mo18315r(true, true, false);
    }

    public void stop() {
        mo18315r(false, true, false);
    }
}
