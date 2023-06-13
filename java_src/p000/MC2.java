package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: MC2 */
/* loaded from: classes2.dex */
public final class MC2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f22796a;

    /* renamed from: b */
    public final CircularProgressIndicator f22797b;

    public MC2(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.f22796a = frameLayout;
        this.f22797b = circularProgressIndicator;
    }

    /* renamed from: a */
    public static MC2 m95596a(View view) {
        int i = C36585Vg4.progressBar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
        if (circularProgressIndicator != null) {
            return new MC2((FrameLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static MC2 m95594c(LayoutInflater layoutInflater) {
        return m95593d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static MC2 m95593d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.longterm_setup_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m95596a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f22796a;
    }
}
