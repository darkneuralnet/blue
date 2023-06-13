package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: d6 */
/* loaded from: classes3.dex */
public final class C19674d6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f76116a;

    /* renamed from: b */
    public final View f76117b;

    /* renamed from: c */
    public final RecyclerView f76118c;

    /* renamed from: d */
    public final Button f76119d;

    public C19674d6(ConstraintLayout constraintLayout, View view, RecyclerView recyclerView, Button button) {
        this.f76116a = constraintLayout;
        this.f76117b = view;
        this.f76118c = recyclerView;
        this.f76119d = button;
    }

    /* renamed from: a */
    public static C19674d6 m44613a(View view) {
        int i = C39912di4.footerDivider;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C39912di4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C39912di4.submitReport;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    return new C19674d6((ConstraintLayout) view, m96312a, recyclerView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C19674d6 m44611c(LayoutInflater layoutInflater) {
        return m44610d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C19674d6 m44610d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_sku_investigation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44613a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f76116a;
    }
}
