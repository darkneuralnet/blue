package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: q4 */
/* loaded from: classes2.dex */
public final class C27482q4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f104618a;

    /* renamed from: b */
    public final PhotoView f104619b;

    /* renamed from: c */
    public final CircularProgressIndicator f104620c;

    public C27482q4(FrameLayout frameLayout, PhotoView photoView, CircularProgressIndicator circularProgressIndicator) {
        this.f104618a = frameLayout;
        this.f104619b = photoView;
        this.f104620c = circularProgressIndicator;
    }

    /* renamed from: a */
    public static C27482q4 m18244a(View view) {
        int i = C36585Vg4.photoView;
        PhotoView photoView = (PhotoView) C34328Lp6.m96312a(view, i);
        if (photoView != null) {
            i = C36585Vg4.progressBar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
            if (circularProgressIndicator != null) {
                return new C27482q4((FrameLayout) view, photoView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27482q4 m18242c(LayoutInflater layoutInflater) {
        return m18241d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27482q4 m18241d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_nest_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m18244a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f104618a;
    }
}
