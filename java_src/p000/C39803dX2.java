package p000;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
/* renamed from: dX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39803dX2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final InterfaceC19781a f76746a;

    /* renamed from: b */
    public final View[] f76747b;

    /* renamed from: dX2$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC19781a {
        /* renamed from: a */
        void mo44189a(ValueAnimator valueAnimator, View view);
    }

    @SuppressLint({"LambdaLast"})
    public C39803dX2(InterfaceC19781a interfaceC19781a, View... viewArr) {
        this.f76746a = interfaceC19781a;
        this.f76747b = viewArr;
    }

    /* renamed from: e */
    public static C39803dX2 m44197e(View... viewArr) {
        return new C39803dX2(new InterfaceC19781a() { // from class: cX2
            @Override // p000.C39803dX2.InterfaceC19781a
            /* renamed from: a */
            public final void mo44189a(ValueAnimator valueAnimator, View view) {
                C39803dX2.m44195g(valueAnimator, view);
            }
        }, viewArr);
    }

    /* renamed from: f */
    public static C39803dX2 m44196f(View... viewArr) {
        return new C39803dX2(new InterfaceC19781a() { // from class: ZW2
            @Override // p000.C39803dX2.InterfaceC19781a
            /* renamed from: a */
            public final void mo44189a(ValueAnimator valueAnimator, View view) {
                C39803dX2.m44194h(valueAnimator, view);
            }
        }, viewArr);
    }

    /* renamed from: g */
    public static void m44195g(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: h */
    public static void m44194h(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    /* renamed from: i */
    public static void m44193i(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: j */
    public static void m44192j(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: k */
    public static C39803dX2 m44191k(View... viewArr) {
        return new C39803dX2(new InterfaceC19781a() { // from class: aX2
            @Override // p000.C39803dX2.InterfaceC19781a
            /* renamed from: a */
            public final void mo44189a(ValueAnimator valueAnimator, View view) {
                C39803dX2.m44193i(valueAnimator, view);
            }
        }, viewArr);
    }

    /* renamed from: l */
    public static C39803dX2 m44190l(View... viewArr) {
        return new C39803dX2(new InterfaceC19781a() { // from class: bX2
            @Override // p000.C39803dX2.InterfaceC19781a
            /* renamed from: a */
            public final void mo44189a(ValueAnimator valueAnimator, View view) {
                C39803dX2.m44192j(valueAnimator, view);
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f76747b) {
            this.f76746a.mo44189a(valueAnimator, view);
        }
    }
}
