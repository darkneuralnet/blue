package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* renamed from: yP5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52184yP5 {

    /* renamed from: a */
    public final ArrayList<C30590b> f119488a = new ArrayList<>();

    /* renamed from: b */
    public C30590b f119489b = null;

    /* renamed from: c */
    public ValueAnimator f119490c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f119491d = new C30589a();

    /* renamed from: yP5$a */
    /* loaded from: classes6.dex */
    public class C30589a extends AnimatorListenerAdapter {
        public C30589a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C52184yP5 c52184yP5 = C52184yP5.this;
            if (c52184yP5.f119490c == animator) {
                c52184yP5.f119490c = null;
            }
        }
    }

    /* renamed from: yP5$b */
    /* loaded from: classes6.dex */
    public static class C30590b {

        /* renamed from: a */
        public final int[] f119493a;

        /* renamed from: b */
        public final ValueAnimator f119494b;

        public C30590b(int[] iArr, ValueAnimator valueAnimator) {
            this.f119493a = iArr;
            this.f119494b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m3523a(int[] iArr, ValueAnimator valueAnimator) {
        C30590b c30590b = new C30590b(iArr, valueAnimator);
        valueAnimator.addListener(this.f119491d);
        this.f119488a.add(c30590b);
    }
}
