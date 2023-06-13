package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: x4 */
/* loaded from: classes3.dex */
public final class C30031x4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f117060a;

    /* renamed from: b */
    public final FrameLayout f117061b;

    /* renamed from: c */
    public final LinearProgressIndicator f117062c;

    public C30031x4(FrameLayout frameLayout, FrameLayout frameLayout2, LinearProgressIndicator linearProgressIndicator) {
        this.f117060a = frameLayout;
        this.f117061b = frameLayout2;
        this.f117062c = linearProgressIndicator;
    }

    /* renamed from: a */
    public static C30031x4 m5885a(View view) {
        int i = C39912di4.container;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C39912di4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                return new C30031x4((FrameLayout) view, frameLayout, linearProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C30031x4 m5883c(LayoutInflater layoutInflater) {
        return m5882d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30031x4 m5882d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_operator_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m5885a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f117060a;
    }
}
