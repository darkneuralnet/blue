package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
/* renamed from: Zw */
/* loaded from: classes6.dex */
public final class C10433Zw implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f49493a;

    /* renamed from: b */
    public final FrameLayout f49494b;

    /* renamed from: c */
    public final AppCompatImageView f49495c;

    /* renamed from: d */
    public final RadiusLayout f49496d;

    /* renamed from: e */
    public final FrameLayout f49497e;

    /* renamed from: f */
    public final VectorTextView f49498f;

    /* renamed from: g */
    public final FrameLayout f49499g;

    public C10433Zw(FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatImageView appCompatImageView, RadiusLayout radiusLayout, FrameLayout frameLayout3, VectorTextView vectorTextView, FrameLayout frameLayout4) {
        this.f49493a = frameLayout;
        this.f49494b = frameLayout2;
        this.f49495c = appCompatImageView;
        this.f49496d = radiusLayout;
        this.f49497e = frameLayout3;
        this.f49498f = vectorTextView;
        this.f49499g = frameLayout4;
    }

    /* renamed from: a */
    public static C10433Zw m72294a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C34263Li4.balloon_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
        if (appCompatImageView != null) {
            i = C34263Li4.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) C34328Lp6.m96312a(view, i);
            if (radiusLayout != null) {
                i = C34263Li4.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) C34328Lp6.m96312a(view, i);
                if (frameLayout2 != null) {
                    i = C34263Li4.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) C34328Lp6.m96312a(view, i);
                    if (vectorTextView != null) {
                        i = C34263Li4.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) C34328Lp6.m96312a(view, i);
                        if (frameLayout3 != null) {
                            return new C10433Zw(frameLayout, frameLayout, appCompatImageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10433Zw m72292c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C51789xk4.balloon_layout_body, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m72294a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f49493a;
    }
}
