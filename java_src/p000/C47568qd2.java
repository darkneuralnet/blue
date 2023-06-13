package p000;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: qd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47568qd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LottieAnimationView f105514a;

    /* renamed from: b */
    public final LottieAnimationView f105515b;

    public C47568qd2(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
        this.f105514a = lottieAnimationView;
        this.f105515b = lottieAnimationView2;
    }

    /* renamed from: a */
    public static C47568qd2 m17317a(View view) {
        if (view != null) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
            return new C47568qd2(lottieAnimationView, lottieAnimationView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LottieAnimationView getRoot() {
        return this.f105514a;
    }
}
