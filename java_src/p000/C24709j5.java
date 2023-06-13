package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: j5 */
/* loaded from: classes3.dex */
public final class C24709j5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f92115a;

    /* renamed from: b */
    public final Button f92116b;

    /* renamed from: c */
    public final FrameLayout f92117c;

    /* renamed from: d */
    public final RecyclerView f92118d;

    public C24709j5(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f92115a = constraintLayout;
        this.f92116b = button;
        this.f92117c = frameLayout;
        this.f92118d = recyclerView;
    }

    /* renamed from: a */
    public static C24709j5 m31154a(View view) {
        int i = C35658Rh4.addButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C35658Rh4.addContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C35658Rh4.repairListRecyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C24709j5((ConstraintLayout) view, button, frameLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C24709j5 m31152c(LayoutInflater layoutInflater) {
        return m31151d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C24709j5 m31151d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_repair_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m31154a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92115a;
    }
}
