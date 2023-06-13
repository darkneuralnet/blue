package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: l5 */
/* loaded from: classes3.dex */
public final class C25596l5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f95449a;

    /* renamed from: b */
    public final LinearLayout f95450b;

    /* renamed from: c */
    public final Button f95451c;

    /* renamed from: d */
    public final LinearProgressIndicator f95452d;

    /* renamed from: e */
    public final RecyclerView f95453e;

    public C25596l5(ConstraintLayout constraintLayout, LinearLayout linearLayout, Button button, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f95449a = constraintLayout;
        this.f95450b = linearLayout;
        this.f95451c = button;
        this.f95452d = linearProgressIndicator;
        this.f95453e = recyclerView;
    }

    /* renamed from: a */
    public static C25596l5 m27950a(View view) {
        int i = C35658Rh4.buttonContainer;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C35658Rh4.certify;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C35658Rh4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C35658Rh4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        return new C25596l5((ConstraintLayout) view, linearLayout, button, linearProgressIndicator, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C25596l5 m27948c(LayoutInflater layoutInflater) {
        return m27947d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25596l5 m27947d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_repair_v3_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m27950a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f95449a;
    }
}
