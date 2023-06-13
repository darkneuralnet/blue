package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: Te2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36097Te2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f35817a;

    /* renamed from: b */
    public final LottieAnimationView f35818b;

    /* renamed from: c */
    public final TextView f35819c;

    public C36097Te2(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, TextView textView) {
        this.f35817a = constraintLayout;
        this.f35818b = lottieAnimationView;
        this.f35819c = textView;
    }

    /* renamed from: a */
    public static C36097Te2 m83241a(View view) {
        int i = C43459jh4.image;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C43459jh4.note;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C36097Te2((ConstraintLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f35817a;
    }
}
