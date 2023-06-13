package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: qe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47578qe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f105551a;

    /* renamed from: b */
    public final LottieAnimationView f105552b;

    /* renamed from: c */
    public final TextView f105553c;

    public C47578qe2(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, TextView textView) {
        this.f105551a = constraintLayout;
        this.f105552b = lottieAnimationView;
        this.f105553c = textView;
    }

    /* renamed from: a */
    public static C47578qe2 m17287a(View view) {
        int i = C43459jh4.image;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C43459jh4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C47578qe2((ConstraintLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f105551a;
    }
}
