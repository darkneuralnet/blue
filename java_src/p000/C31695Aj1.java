package p000;

import android.animation.ValueAnimator;
import android.view.View;
/* renamed from: Aj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31695Aj1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final View f982a;

    /* renamed from: b */
    public final View f983b;

    /* renamed from: c */
    public final float[] f984c = new float[2];

    public C31695Aj1(View view, View view2) {
        this.f982a = view;
        this.f983b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C31929Bj1.m113644a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f984c);
        View view = this.f982a;
        if (view != null) {
            view.setAlpha(this.f984c[0]);
        }
        View view2 = this.f983b;
        if (view2 != null) {
            view2.setAlpha(this.f984c[1]);
        }
    }
}
