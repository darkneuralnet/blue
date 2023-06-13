package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: Va2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36529Va2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f39253a;

    /* renamed from: b */
    public final LottieAnimationView f39254b;

    /* renamed from: c */
    public final TextView f39255c;

    /* renamed from: d */
    public final AppCompatButton f39256d;

    public C36529Va2(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, TextView textView, AppCompatButton appCompatButton) {
        this.f39253a = constraintLayout;
        this.f39254b = lottieAnimationView;
        this.f39255c = textView;
        this.f39256d = appCompatButton;
    }

    /* renamed from: a */
    public static C36529Va2 m79737a(View view) {
        int i = C38698bh4.heroImage;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C38698bh4.heroMessage;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C38698bh4.heroPillLabel;
                AppCompatButton appCompatButton = (AppCompatButton) C34328Lp6.m96312a(view, i);
                if (appCompatButton != null) {
                    return new C36529Va2((ConstraintLayout) view, lottieAnimationView, textView, appCompatButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f39253a;
    }
}
