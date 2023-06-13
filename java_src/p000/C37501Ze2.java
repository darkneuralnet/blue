package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
/* renamed from: Ze2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37501Ze2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f48864a;

    /* renamed from: b */
    public final Guideline f48865b;

    /* renamed from: c */
    public final TextView f48866c;

    /* renamed from: d */
    public final TextView f48867d;

    /* renamed from: e */
    public final TextView f48868e;

    /* renamed from: f */
    public final TextView f48869f;

    public C37501Ze2(ConstraintLayout constraintLayout, Guideline guideline, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f48864a = constraintLayout;
        this.f48865b = guideline;
        this.f48866c = textView;
        this.f48867d = textView2;
        this.f48868e = textView3;
        this.f48869f = textView4;
    }

    /* renamed from: a */
    public static C37501Ze2 m72829a(View view) {
        int i = C36585Vg4.margin_start;
        Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
        if (guideline != null) {
            i = C36585Vg4.recurrancePeriod;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.vehicleName;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36585Vg4.vehiclePlanCost;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C36585Vg4.vehicleSpecs;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null) {
                            return new C37501Ze2((ConstraintLayout) view, guideline, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f48864a;
    }
}
