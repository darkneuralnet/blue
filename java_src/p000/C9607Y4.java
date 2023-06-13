package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Y4 */
/* loaded from: classes4.dex */
public final class C9607Y4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f44493a;

    /* renamed from: b */
    public final RecyclerView f44494b;

    public C9607Y4(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f44493a = frameLayout;
        this.f44494b = recyclerView;
    }

    /* renamed from: a */
    public static C9607Y4 m75786a(View view) {
        int i = C51176wi4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C9607Y4((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9607Y4 m75784c(LayoutInflater layoutInflater) {
        return m75783d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9607Y4 m75783d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C43489jk4.activity_quality_control_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m75786a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f44493a;
    }
}
