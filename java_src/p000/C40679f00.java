package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: f00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40679f00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f79258a;

    /* renamed from: b */
    public final LinearLayout f79259b;

    /* renamed from: c */
    public final Button f79260c;

    /* renamed from: d */
    public final FrameLayout f79261d;

    /* renamed from: e */
    public final C37445Yy0 f79262e;

    /* renamed from: f */
    public final LinearProgressIndicator f79263f;

    /* renamed from: g */
    public final ImageView f79264g;

    /* renamed from: h */
    public final FrameLayout f79265h;

    /* renamed from: i */
    public final RecyclerView f79266i;

    public C40679f00(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, Button button, FrameLayout frameLayout, C37445Yy0 c37445Yy0, LinearProgressIndicator linearProgressIndicator, ImageView imageView, FrameLayout frameLayout2, RecyclerView recyclerView) {
        this.f79258a = coordinatorLayout;
        this.f79259b = linearLayout;
        this.f79260c = button;
        this.f79261d = frameLayout;
        this.f79262e = c37445Yy0;
        this.f79263f = linearProgressIndicator;
        this.f79264g = imageView;
        this.f79265h = frameLayout2;
        this.f79266i = recyclerView;
    }

    /* renamed from: a */
    public static C40679f00 m42293a(View view) {
        View m96312a;
        int i = C42283hi4.bottomSheet;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C42283hi4.button;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C42283hi4.buttonContainer;
                FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                if (frameLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C42283hi4.constraintLayout))) != null) {
                    C37445Yy0 m73948a = C37445Yy0.m73948a(m96312a);
                    i = C42283hi4.progressBar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (linearProgressIndicator != null) {
                        i = C42283hi4.pullArrow;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C42283hi4.pullArrowContainer;
                            FrameLayout frameLayout2 = (FrameLayout) C34328Lp6.m96312a(view, i);
                            if (frameLayout2 != null) {
                                i = C42283hi4.recyclerView;
                                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                if (recyclerView != null) {
                                    return new C40679f00((CoordinatorLayout) view, linearLayout, button, frameLayout, m73948a, linearProgressIndicator, imageView, frameLayout2, recyclerView);
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
    public static C40679f00 m42291c(LayoutInflater layoutInflater) {
        return m42290d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C40679f00 m42290d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36144Tj4.bottom_sheet_scan_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m42293a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f79258a;
    }
}
