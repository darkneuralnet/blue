package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Hy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33468Hy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f14251a;

    /* renamed from: b */
    public final Button f14252b;

    /* renamed from: c */
    public final ConstraintLayout f14253c;

    /* renamed from: d */
    public final Button f14254d;

    /* renamed from: e */
    public final RecyclerView f14255e;

    public C33468Hy1(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, Button button2, RecyclerView recyclerView) {
        this.f14251a = constraintLayout;
        this.f14252b = button;
        this.f14253c = constraintLayout2;
        this.f14254d = button2;
        this.f14255e = recyclerView;
    }

    /* renamed from: a */
    public static C33468Hy1 m103151a(View view) {
        int i = C44062ki4.cancelButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C44062ki4.proceedButton;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C44062ki4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C33468Hy1(constraintLayout, button, constraintLayout, button2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C33468Hy1 m103149c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37080Xj4.fragment_work_order_uncheck_confirmation_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m103151a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f14251a;
    }
}
