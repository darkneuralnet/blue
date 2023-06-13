package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* renamed from: Cf */
/* loaded from: classes.dex */
public class C1112Cf {
    private C1112Cf() {
    }

    /* renamed from: a */
    public static void m111928a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public static void m111927b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    public static void m111926c(Animator animator) {
        animator.resume();
    }
}
