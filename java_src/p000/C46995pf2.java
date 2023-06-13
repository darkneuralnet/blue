package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: pf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46995pf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f103891a;

    /* renamed from: b */
    public final LottieAnimationView f103892b;

    /* renamed from: c */
    public final View f103893c;

    /* renamed from: d */
    public final TextView f103894d;

    /* renamed from: e */
    public final TextView f103895e;

    /* renamed from: f */
    public final TextView f103896f;

    public C46995pf2(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, View view, TextView textView, TextView textView2, TextView textView3) {
        this.f103891a = linearLayout;
        this.f103892b = lottieAnimationView;
        this.f103893c = view;
        this.f103894d = textView;
        this.f103895e = textView2;
        this.f103896f = textView3;
    }

    /* renamed from: a */
    public static C46995pf2 m19010a(View view) {
        View m96312a;
        int i = C36126Th4.banner;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null && (m96312a = C34328Lp6.m96312a(view, (i = C36126Th4.divider))) != null) {
            i = C36126Th4.price;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36126Th4.subtitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36126Th4.title;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C46995pf2((LinearLayout) view, lottieAnimationView, m96312a, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f103891a;
    }
}
