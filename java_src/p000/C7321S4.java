package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: S4 */
/* loaded from: classes3.dex */
public final class C7321S4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f33098a;

    /* renamed from: b */
    public final View f33099b;

    /* renamed from: c */
    public final Button f33100c;

    /* renamed from: d */
    public final RecyclerView f33101d;

    public C7321S4(ConstraintLayout constraintLayout, View view, Button button, RecyclerView recyclerView) {
        this.f33098a = constraintLayout;
        this.f33099b = view;
        this.f33100c = button;
        this.f33101d = recyclerView;
    }

    /* renamed from: a */
    public static C7321S4 m86049a(View view) {
        int i = C39912di4.footerDivider;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C39912di4.processContainerOrderButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C39912di4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C7321S4((ConstraintLayout) view, m96312a, button, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7321S4 m86047c(LayoutInflater layoutInflater) {
        return m86046d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7321S4 m86046d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_process_container_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86049a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f33098a;
    }
}
