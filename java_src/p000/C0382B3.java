package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: B3 */
/* loaded from: classes3.dex */
public final class C0382B3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f1563a;

    /* renamed from: b */
    public final FrameLayout f1564b;

    /* renamed from: c */
    public final LinearProgressIndicator f1565c;

    public C0382B3(FrameLayout frameLayout, FrameLayout frameLayout2, LinearProgressIndicator linearProgressIndicator) {
        this.f1563a = frameLayout;
        this.f1564b = frameLayout2;
        this.f1565c = linearProgressIndicator;
    }

    /* renamed from: a */
    public static C0382B3 m114775a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C45831nh4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            return new C0382B3(frameLayout, frameLayout, linearProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0382B3 m114773c(LayoutInflater layoutInflater) {
        return m114772d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C0382B3 m114772d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38125aj4.activity_fleet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114775a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f1563a;
    }
}
