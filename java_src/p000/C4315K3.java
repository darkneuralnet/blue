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
/* renamed from: K3 */
/* loaded from: classes3.dex */
public final class C4315K3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f18975a;

    /* renamed from: b */
    public final CardView f18976b;

    /* renamed from: c */
    public final TextView f18977c;

    /* renamed from: d */
    public final Button f18978d;

    /* renamed from: e */
    public final LottieAnimationView f18979e;

    /* renamed from: f */
    public final TextView f18980f;

    /* renamed from: g */
    public final Button f18981g;

    /* renamed from: h */
    public final Button f18982h;

    /* renamed from: i */
    public final ScrollView f18983i;

    /* renamed from: j */
    public final TextView f18984j;

    public C4315K3(ConstraintLayout constraintLayout, CardView cardView, TextView textView, Button button, LottieAnimationView lottieAnimationView, TextView textView2, Button button2, Button button3, ScrollView scrollView, TextView textView3) {
        this.f18975a = constraintLayout;
        this.f18976b = cardView;
        this.f18977c = textView;
        this.f18978d = button;
        this.f18979e = lottieAnimationView;
        this.f18980f = textView2;
        this.f18981g = button2;
        this.f18982h = button3;
        this.f18983i = scrollView;
        this.f18984j = textView3;
    }

    /* renamed from: a */
    public static C4315K3 m99311a(View view) {
        int i = C50573vh4.ctaContainer;
        CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
        if (cardView != null) {
            i = C50573vh4.descriptionText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C50573vh4.haveOwnHelmetButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C50573vh4.lottie;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                    if (lottieAnimationView != null) {
                        i = C50573vh4.mandatoryDescriptionText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C50573vh4.rentButton;
                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                            if (button2 != null) {
                                i = C50573vh4.reportMissingButton;
                                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                if (button3 != null) {
                                    i = C50573vh4.scrollableContent;
                                    ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                    if (scrollView != null) {
                                        i = C50573vh4.titleText;
                                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView3 != null) {
                                            return new C4315K3((ConstraintLayout) view, cardView, textView, button, lottieAnimationView, textView2, button2, button3, scrollView, textView3);
                                        }
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
    public static C4315K3 m99309c(LayoutInflater layoutInflater) {
        return m99308d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4315K3 m99308d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42886ij4.activity_helmet_lease_prompt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m99311a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f18975a;
    }
}
