package p000;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: re2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48171re2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f107365a;

    /* renamed from: b */
    public final LottieAnimationView f107366b;

    /* renamed from: c */
    public final TextView f107367c;

    /* renamed from: d */
    public final RecyclerView f107368d;

    public C48171re2(RelativeLayout relativeLayout, LottieAnimationView lottieAnimationView, TextView textView, RecyclerView recyclerView) {
        this.f107365a = relativeLayout;
        this.f107366b = lottieAnimationView;
        this.f107367c = textView;
        this.f107368d = recyclerView;
    }

    /* renamed from: a */
    public static C48171re2 m15653a(View view) {
        int i = C43459jh4.image;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C43459jh4.question;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C43459jh4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C48171re2((RelativeLayout) view, lottieAnimationView, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f107365a;
    }
}
