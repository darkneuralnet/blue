package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.InterfaceC17744c;
/* renamed from: com.google.android.material.circularreveal.a */
/* loaded from: classes6.dex */
public final class C17740a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    /* loaded from: classes6.dex */
    public class C17741a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC17744c f72614a;

        public C17741a(InterfaceC17744c interfaceC17744c) {
            this.f72614a = interfaceC17744c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f72614a.mo49779a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f72614a.mo49775e();
        }
    }

    private C17740a() {
    }

    /* renamed from: a */
    public static Animator m49804a(InterfaceC17744c interfaceC17744c, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC17744c, (Property<InterfaceC17744c, V>) InterfaceC17744c.C17747c.f72627a, (TypeEvaluator) InterfaceC17744c.C17746b.f72625b, (Object[]) new InterfaceC17744c.C17749e[]{new InterfaceC17744c.C17749e(f, f2, f3)});
        InterfaceC17744c.C17749e mo49776d = interfaceC17744c.mo49776d();
        if (mo49776d != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC17744c, (int) f, (int) f2, mo49776d.f72631c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m49803b(InterfaceC17744c interfaceC17744c) {
        return new C17741a(interfaceC17744c);
    }
}
