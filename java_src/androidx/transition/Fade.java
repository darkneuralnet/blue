package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    /* loaded from: classes.dex */
    public class C12027a extends C12054b {

        /* renamed from: a */
        public final /* synthetic */ View f55884a;

        public C12027a(View view) {
            this.f55884a = view;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            C37172Xt6.m76164h(this.f55884a, 1.0f);
            C37172Xt6.m76171a(this.f55884a);
            transition.mo65854h0(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    /* loaded from: classes.dex */
    public static class C12028b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f55886a;

        /* renamed from: b */
        public boolean f55887b = false;

        public C12028b(View view) {
            this.f55886a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C37172Xt6.m76164h(this.f55886a, 1.0f);
            if (this.f55887b) {
                this.f55886a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C38790bq6.m62512V(this.f55886a) && this.f55886a.getLayerType() == 0) {
                this.f55887b = true;
                this.f55886a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        m65830J0(i);
    }

    /* renamed from: L0 */
    public static float m65915L0(N96 n96, float f) {
        Float f2;
        if (n96 != null && (f2 = (Float) n96.f24199a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // androidx.transition.Visibility
    /* renamed from: G0 */
    public Animator mo65833G0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        float f = 0.0f;
        float m65915L0 = m65915L0(n96, 0.0f);
        if (m65915L0 != 1.0f) {
            f = m65915L0;
        }
        return m65916K0(view, f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: I0 */
    public Animator mo65831I0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        C37172Xt6.m76167e(view);
        return m65916K0(view, m65915L0(n96, 1.0f), 0.0f);
    }

    /* renamed from: K0 */
    public final Animator m65916K0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C37172Xt6.m76164h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C37172Xt6.f44158b, f2);
        ofFloat.addListener(new C12028b(view));
        mo65857d(new C12027a(view));
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        super.mo65826n(n96);
        n96.f24199a.put("android:fade:transitionAlpha", Float.valueOf(C37172Xt6.m76169c(n96.f24200b)));
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33752f);
        m65830J0(C33266Hb6.m103669g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, m65836B0()));
        obtainStyledAttributes.recycle();
    }
}
