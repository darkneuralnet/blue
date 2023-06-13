package com.google.p034ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.r */
/* loaded from: classes6.dex */
public final class C18010r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InstallActivity f73828a;

    public C18010r(InstallActivity installActivity) {
        this.f73828a = installActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f73828a.showSpinner();
    }
}
