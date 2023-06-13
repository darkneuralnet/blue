package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: PZ */
/* loaded from: classes3.dex */
public final class C6408PZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f28687a;

    /* renamed from: b */
    public final ImageView f28688b;

    /* renamed from: c */
    public final FrameLayout f28689c;

    /* renamed from: d */
    public final RecyclerView f28690d;

    public C6408PZ(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f28687a = linearLayout;
        this.f28688b = imageView;
        this.f28689c = frameLayout;
        this.f28690d = recyclerView;
    }

    /* renamed from: a */
    public static C6408PZ m90116a(View view) {
        int i = C45248mi4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.arrowContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C45248mi4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C6408PZ((LinearLayout) view, imageView, frameLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6408PZ m90114c(LayoutInflater layoutInflater) {
        return m90113d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6408PZ m90113d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37548Zj4.bottom_sheet_flight_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90116a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f28687a;
    }
}
