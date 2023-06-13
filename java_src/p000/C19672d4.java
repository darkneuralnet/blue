package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: d4 */
/* loaded from: classes3.dex */
public final class C19672d4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f76090a;

    /* renamed from: b */
    public final Button f76091b;

    /* renamed from: c */
    public final RecyclerView f76092c;

    public C19672d4(LinearLayout linearLayout, Button button, RecyclerView recyclerView) {
        this.f76090a = linearLayout;
        this.f76091b = button;
        this.f76092c = recyclerView;
    }

    /* renamed from: a */
    public static C19672d4 m44654a(View view) {
        int i = C44062ki4.add;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C44062ki4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C19672d4((LinearLayout) view, button, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C19672d4 m44652c(LayoutInflater layoutInflater) {
        return m44651d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C19672d4 m44651d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37080Xj4.activity_legacy_work_order_issues, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44654a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f76090a;
    }
}
