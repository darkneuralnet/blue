package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: Be2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31885Be2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f2622a;

    /* renamed from: b */
    public final View f2623b;

    /* renamed from: c */
    public final LottieAnimationView f2624c;

    /* renamed from: d */
    public final TextView f2625d;

    /* renamed from: e */
    public final TextView f2626e;

    public C31885Be2(LinearLayout linearLayout, View view, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2) {
        this.f2622a = linearLayout;
        this.f2623b = view;
        this.f2624c = lottieAnimationView;
        this.f2625d = textView;
        this.f2626e = textView2;
    }

    /* renamed from: a */
    public static C31885Be2 m113745a(View view) {
        int i = C36585Vg4.divider;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C36585Vg4.lottieAnimation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
            if (lottieAnimationView != null) {
                i = C36585Vg4.subtitle;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36585Vg4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C31885Be2((LinearLayout) view, m96312a, lottieAnimationView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C31885Be2 m113743c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.item_physical_lock_tutorial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113745a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f2622a;
    }
}
