package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: b00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38290b00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f56768a;

    /* renamed from: b */
    public final Button f56769b;

    /* renamed from: c */
    public final Button f56770c;

    /* renamed from: d */
    public final TextView f56771d;

    /* renamed from: e */
    public final TextView f56772e;

    public C38290b00(ConstraintLayout constraintLayout, Button button, Button button2, TextView textView, TextView textView2) {
        this.f56768a = constraintLayout;
        this.f56769b = button;
        this.f56770c = button2;
        this.f56771d = textView;
        this.f56772e = textView2;
    }

    /* renamed from: a */
    public static C38290b00 m65140a(View view) {
        int i = C35658Rh4.cancel;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C35658Rh4.confirm;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C35658Rh4.instruction;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C35658Rh4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C38290b00((ConstraintLayout) view, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C38290b00 m65138c(LayoutInflater layoutInflater) {
        return m65137d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C38290b00 m65137d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.bottom_sheet_part_swap, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m65140a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f56768a;
    }
}
