package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: se2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48763se2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f109060a;

    /* renamed from: b */
    public final LottieAnimationView f109061b;

    /* renamed from: c */
    public final TextView f109062c;

    /* renamed from: d */
    public final TextView f109063d;

    public C48763se2(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2) {
        this.f109060a = constraintLayout;
        this.f109061b = lottieAnimationView;
        this.f109062c = textView;
        this.f109063d = textView2;
    }

    /* renamed from: a */
    public static C48763se2 m13915a(View view) {
        int i = C43459jh4.image;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C43459jh4.message;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C43459jh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C48763se2((ConstraintLayout) view, lottieAnimationView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f109060a;
    }
}
