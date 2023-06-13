package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.widget.CountdownView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: t3 */
/* loaded from: classes2.dex */
public final class C28512t3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f109764a;

    /* renamed from: b */
    public final LottieAnimationView f109765b;

    /* renamed from: c */
    public final Button f109766c;

    /* renamed from: d */
    public final CountdownView f109767d;

    /* renamed from: e */
    public final TextView f109768e;

    /* renamed from: f */
    public final TextView f109769f;

    /* renamed from: g */
    public final LinearProgressIndicator f109770g;

    /* renamed from: h */
    public final Button f109771h;

    public C28512t3(RelativeLayout relativeLayout, LottieAnimationView lottieAnimationView, Button button, CountdownView countdownView, TextView textView, TextView textView2, LinearProgressIndicator linearProgressIndicator, Button button2) {
        this.f109764a = relativeLayout;
        this.f109765b = lottieAnimationView;
        this.f109766c = button;
        this.f109767d = countdownView;
        this.f109768e = textView;
        this.f109769f = textView2;
        this.f109770g = linearProgressIndicator;
        this.f109771h = button2;
    }

    /* renamed from: a */
    public static C28512t3 m13197a(View view) {
        int i = C36585Vg4.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C36585Vg4.claim;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36585Vg4.countDown;
                CountdownView countdownView = (CountdownView) C34328Lp6.m96312a(view, i);
                if (countdownView != null) {
                    i = C36585Vg4.dealBody;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C36585Vg4.dealTitle;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C36585Vg4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C36585Vg4.reject;
                                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                if (button2 != null) {
                                    return new C28512t3((RelativeLayout) view, lottieAnimationView, button, countdownView, textView, textView2, linearProgressIndicator, button2);
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
    public static C28512t3 m13195c(LayoutInflater layoutInflater) {
        return m13194d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C28512t3 m13194d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_deal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m13197a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f109764a;
    }
}
