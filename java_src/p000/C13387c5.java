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
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: c5 */
/* loaded from: classes3.dex */
public final class C13387c5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f60038a;

    /* renamed from: b */
    public final CardView f60039b;

    /* renamed from: c */
    public final TextView f60040c;

    /* renamed from: d */
    public final Button f60041d;

    /* renamed from: e */
    public final LottieAnimationView f60042e;

    /* renamed from: f */
    public final LinearProgressIndicator f60043f;

    /* renamed from: g */
    public final Button f60044g;

    /* renamed from: h */
    public final ScrollView f60045h;

    /* renamed from: i */
    public final TextView f60046i;

    public C13387c5(ConstraintLayout constraintLayout, CardView cardView, TextView textView, Button button, LottieAnimationView lottieAnimationView, LinearProgressIndicator linearProgressIndicator, Button button2, ScrollView scrollView, TextView textView2) {
        this.f60038a = constraintLayout;
        this.f60039b = cardView;
        this.f60040c = textView;
        this.f60041d = button;
        this.f60042e = lottieAnimationView;
        this.f60043f = linearProgressIndicator;
        this.f60044g = button2;
        this.f60045h = scrollView;
        this.f60046i = textView2;
    }

    /* renamed from: a */
    public static C13387c5 m61953a(View view) {
        int i = C37530Zh4.ctaContainer;
        CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
        if (cardView != null) {
            i = C37530Zh4.descriptionText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C37530Zh4.helpButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C37530Zh4.lottie;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                    if (lottieAnimationView != null) {
                        i = C37530Zh4.progressBar;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                        if (linearProgressIndicator != null) {
                            i = C37530Zh4.requestRefundButton;
                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                            if (button2 != null) {
                                i = C37530Zh4.scrollableContent;
                                ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                if (scrollView != null) {
                                    i = C37530Zh4.titleText;
                                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView2 != null) {
                                        return new C13387c5((ConstraintLayout) view, cardView, textView, button, lottieAnimationView, linearProgressIndicator, button2, scrollView, textView2);
                                    }
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
    public static C13387c5 m61951c(LayoutInflater layoutInflater) {
        return m61950d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C13387c5 m61950d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34506Mj4.activity_refund_account_balance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m61953a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f60038a;
    }
}
