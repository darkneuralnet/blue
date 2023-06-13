package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: Xa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36997Xa2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f43422a;

    /* renamed from: b */
    public final LottieAnimationView f43423b;

    /* renamed from: c */
    public final TextView f43424c;

    public C36997Xa2(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, TextView textView) {
        this.f43422a = constraintLayout;
        this.f43423b = lottieAnimationView;
        this.f43424c = textView;
    }

    /* renamed from: a */
    public static C36997Xa2 m76847a(View view) {
        int i = C38698bh4.heroImage;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C38698bh4.heroMessage;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C36997Xa2((ConstraintLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f43422a;
    }
}
