package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: x3 */
/* loaded from: classes3.dex */
public final class C30028x3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f117038a;

    /* renamed from: b */
    public final Button f117039b;

    /* renamed from: c */
    public final CardView f117040c;

    /* renamed from: d */
    public final TextView f117041d;

    /* renamed from: e */
    public final Button f117042e;

    /* renamed from: f */
    public final LottieAnimationView f117043f;

    /* renamed from: g */
    public final ScrollView f117044g;

    /* renamed from: h */
    public final TextView f117045h;

    public C30028x3(ConstraintLayout constraintLayout, Button button, CardView cardView, TextView textView, Button button2, LottieAnimationView lottieAnimationView, ScrollView scrollView, TextView textView2) {
        this.f117038a = constraintLayout;
        this.f117039b = button;
        this.f117040c = cardView;
        this.f117041d = textView;
        this.f117042e = button2;
        this.f117043f = lottieAnimationView;
        this.f117044g = scrollView;
        this.f117045h = textView2;
    }

    /* renamed from: a */
    public static C30028x3 m5901a(View view) {
        int i = C37530Zh4.claimCreditButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C37530Zh4.ctaContainer;
            CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
            if (cardView != null) {
                i = C37530Zh4.descriptionText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C37530Zh4.helpButton;
                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                    if (button2 != null) {
                        i = C37530Zh4.lottie;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                        if (lottieAnimationView != null) {
                            i = C37530Zh4.scrollableContent;
                            ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                            if (scrollView != null) {
                                i = C37530Zh4.titleText;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    return new C30028x3((ConstraintLayout) view, button, cardView, textView, button2, lottieAnimationView, scrollView, textView2);
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
    public static C30028x3 m5899c(LayoutInflater layoutInflater) {
        return m5898d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30028x3 m5898d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34506Mj4.activity_dispute_charge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m5901a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f117038a;
    }
}
