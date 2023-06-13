package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: c3 */
/* loaded from: classes3.dex */
public final class C13382c3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f60004a;

    /* renamed from: b */
    public final LottieAnimationView f60005b;

    /* renamed from: c */
    public final ConstraintLayout f60006c;

    /* renamed from: d */
    public final Button f60007d;

    /* renamed from: e */
    public final LottieAnimationView f60008e;

    /* renamed from: f */
    public final TextView f60009f;

    /* renamed from: g */
    public final LinearProgressIndicator f60010g;

    /* renamed from: h */
    public final LottieAnimationView f60011h;

    public C13382c3(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout2, Button button, LottieAnimationView lottieAnimationView2, TextView textView, LinearProgressIndicator linearProgressIndicator, LottieAnimationView lottieAnimationView3) {
        this.f60004a = constraintLayout;
        this.f60005b = lottieAnimationView;
        this.f60006c = constraintLayout2;
        this.f60007d = button;
        this.f60008e = lottieAnimationView2;
        this.f60009f = textView;
        this.f60010g = linearProgressIndicator;
        this.f60011h = lottieAnimationView3;
    }

    /* renamed from: a */
    public static C13382c3 m61995a(View view) {
        int i = C38698bh4.bottomImage;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C38698bh4.buttonContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout != null) {
                i = C38698bh4.done;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C38698bh4.heroImage;
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                    if (lottieAnimationView2 != null) {
                        i = C38698bh4.heroMessage;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C38698bh4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C38698bh4.topImage;
                                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                                if (lottieAnimationView3 != null) {
                                    return new C13382c3((ConstraintLayout) view, lottieAnimationView, constraintLayout, button, lottieAnimationView2, textView, linearProgressIndicator, lottieAnimationView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C13382c3 m61993c(LayoutInflater layoutInflater) {
        return m61992d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C13382c3 m61992d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C47640qk4.activity_bird_plus_purchased, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m61995a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f60004a;
    }
}
