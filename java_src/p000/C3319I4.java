package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: I4 */
/* loaded from: classes2.dex */
public final class C3319I4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f14422a;

    /* renamed from: b */
    public final ConstraintLayout f14423b;

    /* renamed from: c */
    public final Button f14424c;

    /* renamed from: d */
    public final LottieAnimationView f14425d;

    /* renamed from: e */
    public final Button f14426e;

    /* renamed from: f */
    public final LinearLayout f14427f;

    /* renamed from: g */
    public final TextView f14428g;

    /* renamed from: h */
    public final TextView f14429h;

    /* renamed from: i */
    public final TextView f14430i;

    public C3319I4(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, LottieAnimationView lottieAnimationView, Button button2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f14422a = constraintLayout;
        this.f14423b = constraintLayout2;
        this.f14424c = button;
        this.f14425d = lottieAnimationView;
        this.f14426e = button2;
        this.f14427f = linearLayout;
        this.f14428g = textView;
        this.f14429h = textView2;
        this.f14430i = textView3;
    }

    /* renamed from: a */
    public static C3319I4 m103009a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C36585Vg4.parkingLearnMoreButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.parkingLottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
            if (lottieAnimationView != null) {
                i = C36585Vg4.parkingNextButton;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C36585Vg4.parkingNextButtonContainer;
                    LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                    if (linearLayout != null) {
                        i = C36585Vg4.parkingRulesBody;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C36585Vg4.parkingRulesNoLongerCharged;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                i = C36585Vg4.parkingRulesTitle;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    return new C3319I4(constraintLayout, constraintLayout, button, lottieAnimationView, button2, linearLayout, textView, textView2, textView3);
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
    public static C3319I4 m103007c(LayoutInflater layoutInflater) {
        return m103006d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3319I4 m103006d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_parking_rules, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m103009a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f14422a;
    }
}
