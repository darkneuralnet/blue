package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;
/* renamed from: androidx.transition.e */
/* loaded from: classes.dex */
public class C12060e {

    /* renamed from: androidx.transition.e$a */
    /* loaded from: classes.dex */
    public static class C12061a extends AnimatorListenerAdapter implements Transition.InterfaceC12043f {

        /* renamed from: a */
        public final View f56000a;

        /* renamed from: b */
        public final View f56001b;

        /* renamed from: c */
        public final int f56002c;

        /* renamed from: d */
        public final int f56003d;

        /* renamed from: e */
        public int[] f56004e;

        /* renamed from: f */
        public float f56005f;

        /* renamed from: g */
        public float f56006g;

        /* renamed from: h */
        public final float f56007h;

        /* renamed from: i */
        public final float f56008i;

        public C12061a(View view, View view2, int i, int i2, float f, float f2) {
            this.f56001b = view;
            this.f56000a = view2;
            this.f56002c = i - Math.round(view.getTranslationX());
            this.f56003d = i2 - Math.round(view.getTranslationY());
            this.f56007h = f;
            this.f56008i = f2;
            int i3 = C36351Ug4.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f56004e = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f56004e == null) {
                this.f56004e = new int[2];
            }
            this.f56004e[0] = Math.round(this.f56002c + this.f56001b.getTranslationX());
            this.f56004e[1] = Math.round(this.f56003d + this.f56001b.getTranslationY());
            this.f56000a.setTag(C36351Ug4.transition_position, this.f56004e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f56005f = this.f56001b.getTranslationX();
            this.f56006g = this.f56001b.getTranslationY();
            this.f56001b.setTranslationX(this.f56007h);
            this.f56001b.setTranslationY(this.f56008i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f56001b.setTranslationX(this.f56005f);
            this.f56001b.setTranslationY(this.f56006g);
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            this.f56001b.setTranslationX(this.f56007h);
            this.f56001b.setTranslationY(this.f56008i);
            transition.mo65854h0(this);
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionStart(Transition transition) {
        }
    }

    private C12060e() {
    }

    /* renamed from: a */
    public static Animator m65792a(View view, N96 n96, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) n96.f24200b.getTag(C36351Ug4.transition_position);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        C12061a c12061a = new C12061a(view, n96.f24200b, round, round2, translationX, translationY);
        transition.mo65857d(c12061a);
        ofPropertyValuesHolder.addListener(c12061a);
        C1112Cf.m111928a(ofPropertyValuesHolder, c12061a);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
