package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: Np6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34796Np6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f25229a;

    /* renamed from: b */
    public final LottieAnimationView f25230b;

    /* renamed from: c */
    public final Barrier f25231c;

    /* renamed from: d */
    public final TextView f25232d;

    /* renamed from: e */
    public final TextView f25233e;

    public C34796Np6(View view, LottieAnimationView lottieAnimationView, Barrier barrier, TextView textView, TextView textView2) {
        this.f25229a = view;
        this.f25230b = lottieAnimationView;
        this.f25231c = barrier;
        this.f25232d = textView;
        this.f25233e = textView2;
    }

    /* renamed from: a */
    public static C34796Np6 m93344a(View view) {
        int i = C38698bh4.icon;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C38698bh4.startBarrier;
            Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier != null) {
                i = C38698bh4.subtitle;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C38698bh4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C34796Np6(view, lottieAnimationView, barrier, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C34796Np6 m93343b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C47640qk4.view_bird_plus_banner, viewGroup);
            return m93344a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f25229a;
    }
}
