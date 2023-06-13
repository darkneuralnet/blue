package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: hy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42440hy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f86235a;

    /* renamed from: b */
    public final RecyclerView f86236b;

    public C42440hy1(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f86235a = frameLayout;
        this.f86236b = recyclerView;
    }

    /* renamed from: a */
    public static C42440hy1 m35442a(View view) {
        int i = C45831nh4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C42440hy1((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C42440hy1 m35440c(LayoutInflater layoutInflater) {
        return m35439d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C42440hy1 m35439d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38125aj4.fragment_fleets_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m35442a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f86235a;
    }
}
