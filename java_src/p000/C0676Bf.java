package p000;

import android.animation.Animator;
/* renamed from: Bf */
/* loaded from: classes6.dex */
public class C0676Bf {

    /* renamed from: a */
    public Animator f2635a;

    /* renamed from: a */
    public void m113736a() {
        Animator animator = this.f2635a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void m113735b() {
        this.f2635a = null;
    }

    /* renamed from: c */
    public void m113734c(Animator animator) {
        m113736a();
        this.f2635a = animator;
    }
}
