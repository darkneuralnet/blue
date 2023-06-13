package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: P4 */
/* loaded from: classes3.dex */
public final class C6236P4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f27836a;

    /* renamed from: b */
    public final Button f27837b;

    /* renamed from: c */
    public final View f27838c;

    /* renamed from: d */
    public final TextView f27839d;

    /* renamed from: e */
    public final TextView f27840e;

    /* renamed from: f */
    public final TextView f27841f;

    /* renamed from: g */
    public final TextView f27842g;

    /* renamed from: h */
    public final LottieAnimationView f27843h;

    /* renamed from: i */
    public final ScrollView f27844i;

    public C6236P4(ConstraintLayout constraintLayout, Button button, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, LottieAnimationView lottieAnimationView, ScrollView scrollView) {
        this.f27836a = constraintLayout;
        this.f27837b = button;
        this.f27838c = view;
        this.f27839d = textView;
        this.f27840e = textView2;
        this.f27841f = textView3;
        this.f27842g = textView4;
        this.f27843h = lottieAnimationView;
        this.f27844i = scrollView;
    }

    /* renamed from: a */
    public static C6236P4 m91029a(View view) {
        View m96312a;
        int i = C34956Oh4.continueButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null && (m96312a = C34328Lp6.m96312a(view, (i = C34956Oh4.footerView))) != null) {
            i = C34956Oh4.infoText0;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34956Oh4.infoText1;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34956Oh4.infoText2;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C34956Oh4.infoText3;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null) {
                            i = C34956Oh4.lottieView;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
                            if (lottieAnimationView != null) {
                                i = C34956Oh4.scrollView;
                                ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                if (scrollView != null) {
                                    return new C6236P4((ConstraintLayout) view, button, m96312a, textView, textView2, textView3, textView4, lottieAnimationView, scrollView);
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
    public static C6236P4 m91027c(LayoutInflater layoutInflater) {
        return m91026d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6236P4 m91026d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.activity_preload_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m91029a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f27836a;
    }
}
