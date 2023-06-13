package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.C17813a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
/* renamed from: vu1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50700vu1 extends C17813a {

    /* renamed from: O */
    public StateListAnimator f114874O;

    /* renamed from: vu1$a */
    /* loaded from: classes6.dex */
    public static class C29698a extends PM2 {
        public C29698a(C43037iy5 c43037iy5) {
            super(c43037iy5);
        }

        @Override // p000.PM2, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C50700vu1(FloatingActionButton floatingActionButton, InterfaceC36505Ux5 interfaceC36505Ux5) {
        super(floatingActionButton, interfaceC36505Ux5);
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: A */
    public void mo7802A(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: B */
    public void mo7801B(float f, float f2, float f3) {
        if (this.f72922w.getStateListAnimator() == this.f114874O) {
            StateListAnimator m7795f0 = m7795f0(f, f2, f3);
            this.f114874O = m7795f0;
            this.f72922w.setStateListAnimator(m7795f0);
        }
        if (mo7798V()) {
            m49472b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: G */
    public boolean mo7800G() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: R */
    public void mo7799R(ColorStateList colorStateList) {
        Drawable drawable = this.f72902c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C52886zb5.m1051d(colorStateList));
        } else {
            super.mo7799R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: V */
    public boolean mo7798V() {
        return this.f72923x.mo49496c() || !m49477X();
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: Z */
    public void mo7797Z() {
    }

    /* renamed from: e0 */
    public C13592cZ m7796e0(int i, ColorStateList colorStateList) {
        Context context = this.f72922w.getContext();
        C13592cZ c13592cZ = new C13592cZ((C43037iy5) HZ3.m103731g(this.f72900a));
        c13592cZ.m61217e(NA0.m94301c(context, C33768Jf4.design_fab_stroke_top_outer_color), NA0.m94301c(context, C33768Jf4.design_fab_stroke_top_inner_color), NA0.m94301c(context, C33768Jf4.design_fab_stroke_end_inner_color), NA0.m94301c(context, C33768Jf4.design_fab_stroke_end_outer_color));
        c13592cZ.m61218d(i);
        c13592cZ.m61219c(colorStateList);
        return c13592cZ;
    }

    /* renamed from: f0 */
    public final StateListAnimator m7795f0(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C17813a.f72891I, m7794g0(f, f3));
        stateListAnimator.addState(C17813a.f72892J, m7794g0(f, f2));
        stateListAnimator.addState(C17813a.f72893K, m7794g0(f, f2));
        stateListAnimator.addState(C17813a.f72894L, m7794g0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f72922w, "elevation", f).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f72922w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f72922w, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C17813a.f72886D);
        stateListAnimator.addState(C17813a.f72895M, animatorSet);
        stateListAnimator.addState(C17813a.f72896N, m7794g0(0.0f, 0.0f));
        return stateListAnimator;
    }

    /* renamed from: g0 */
    public final Animator m7794g0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f72922w, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f72922w, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C17813a.f72886D);
        return animatorSet;
    }

    /* renamed from: h0 */
    public PM2 m7793h0() {
        return new C29698a((C43037iy5) HZ3.m103731g(this.f72900a));
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: l */
    public float mo7792l() {
        return this.f72922w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: p */
    public void mo7791p(Rect rect) {
        if (this.f72923x.mo49496c()) {
            super.mo7791p(rect);
        } else if (!m49477X()) {
            int m49517r = (this.f72910k - this.f72922w.m49517r()) / 2;
            rect.set(m49517r, m49517r, m49517r, m49517r);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: t */
    public void mo7790t(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        PM2 m7793h0 = m7793h0();
        this.f72901b = m7793h0;
        m7793h0.setTintList(colorStateList);
        if (mode != null) {
            this.f72901b.setTintMode(mode);
        }
        this.f72901b.m90427P(this.f72922w.getContext());
        if (i > 0) {
            this.f72903d = m7796e0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) HZ3.m103731g(this.f72903d), (Drawable) HZ3.m103731g(this.f72901b)});
        } else {
            this.f72903d = null;
            drawable = this.f72901b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C52886zb5.m1051d(colorStateList2), drawable, null);
        this.f72902c = rippleDrawable;
        this.f72904e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: w */
    public void mo7789w() {
    }

    @Override // com.google.android.material.floatingactionbutton.C17813a
    /* renamed from: y */
    public void mo7788y() {
        m49472b0();
    }
}
