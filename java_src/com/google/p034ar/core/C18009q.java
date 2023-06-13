package com.google.p034ar.core;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.q */
/* loaded from: classes6.dex */
public final class C18009q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ int f73824a;

    /* renamed from: b */
    final /* synthetic */ int f73825b;

    /* renamed from: c */
    final /* synthetic */ int f73826c;

    /* renamed from: d */
    final /* synthetic */ InstallActivity f73827d;

    public C18009q(InstallActivity installActivity, int i, int i2, int i3) {
        this.f73827d = installActivity;
        this.f73824a = i;
        this.f73825b = i2;
        this.f73826c = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = this.f73825b * valueAnimator.getAnimatedFraction();
        this.f73827d.getWindow().setLayout((int) ((this.f73824a * animatedFraction) + animatedFraction2), (int) ((this.f73826c * animatedFraction) + animatedFraction2));
        this.f73827d.getWindow().getDecorView().refreshDrawableState();
    }
}
