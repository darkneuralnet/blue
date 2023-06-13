package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: R4 */
/* loaded from: classes3.dex */
public final class C7060R4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f31464a;

    /* renamed from: b */
    public final Button f31465b;

    /* renamed from: c */
    public final RecyclerView f31466c;

    public C7060R4(ConstraintLayout constraintLayout, Button button, RecyclerView recyclerView) {
        this.f31464a = constraintLayout;
        this.f31465b = button;
        this.f31466c = recyclerView;
    }

    /* renamed from: a */
    public static C7060R4 m87360a(View view) {
        int i = C34722Nh4.helpButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C34722Nh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C7060R4((ConstraintLayout) view, button, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7060R4 m87358c(LayoutInflater layoutInflater) {
        return m87357d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7060R4 m87357d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31698Aj4.activity_private_birds_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87360a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f31464a;
    }
}
