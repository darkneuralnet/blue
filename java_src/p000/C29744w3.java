package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: w3 */
/* loaded from: classes3.dex */
public final class C29744w3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f115199a;

    /* renamed from: b */
    public final LinearProgressIndicator f115200b;

    /* renamed from: c */
    public final RecyclerView f115201c;

    public C29744w3(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f115199a = constraintLayout;
        this.f115200b = linearProgressIndicator;
        this.f115201c = recyclerView;
    }

    /* renamed from: a */
    public static C29744w3 m7541a(View view) {
        int i = C35658Rh4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C35658Rh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C29744w3((ConstraintLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C29744w3 m7539c(LayoutInflater layoutInflater) {
        return m7538d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29744w3 m7538d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_diagnostics, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m7541a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f115199a;
    }
}
