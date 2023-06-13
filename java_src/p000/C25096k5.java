package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: k5 */
/* loaded from: classes3.dex */
public final class C25096k5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f93865a;

    /* renamed from: b */
    public final Button f93866b;

    /* renamed from: c */
    public final RecyclerView f93867c;

    public C25096k5(LinearLayout linearLayout, Button button, RecyclerView recyclerView) {
        this.f93865a = linearLayout;
        this.f93866b = button;
        this.f93867c = recyclerView;
    }

    /* renamed from: a */
    public static C25096k5 m29352a(View view) {
        int i = C35658Rh4.confirm;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C35658Rh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C25096k5((LinearLayout) view, button, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C25096k5 m29350c(LayoutInflater layoutInflater) {
        return m29349d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25096k5 m29349d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_repair_v3_issue, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m29352a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f93865a;
    }
}
