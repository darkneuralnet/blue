package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
/* renamed from: e00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40086e00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f77527a;

    /* renamed from: b */
    public final Button f77528b;

    /* renamed from: c */
    public final Button f77529c;

    public C40086e00(LinearLayout linearLayout, Button button, Button button2) {
        this.f77527a = linearLayout;
        this.f77528b = button;
        this.f77529c = button2;
    }

    /* renamed from: a */
    public static C40086e00 m43415a(View view) {
        int i = C35658Rh4.addMoreRepairs;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C35658Rh4.confirm;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                return new C40086e00((LinearLayout) view, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C40086e00 m43413c(LayoutInflater layoutInflater) {
        return m43412d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C40086e00 m43412d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.bottom_sheet_repair_v3_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43415a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f77527a;
    }
}
