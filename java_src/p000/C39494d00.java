package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: d00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39494d00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f75944a;

    /* renamed from: b */
    public final Button f75945b;

    /* renamed from: c */
    public final ConstraintLayout f75946c;

    /* renamed from: d */
    public final Button f75947d;

    /* renamed from: e */
    public final Button f75948e;

    /* renamed from: f */
    public final Button f75949f;

    /* renamed from: g */
    public final TextView f75950g;

    public C39494d00(LinearLayout linearLayout, Button button, ConstraintLayout constraintLayout, Button button2, Button button3, Button button4, TextView textView) {
        this.f75944a = linearLayout;
        this.f75945b = button;
        this.f75946c = constraintLayout;
        this.f75947d = button2;
        this.f75948e = button3;
        this.f75949f = button4;
        this.f75950g = textView;
    }

    /* renamed from: a */
    public static C39494d00 m44749a(View view) {
        int i = C39912di4.accept;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout != null) {
                i = C39912di4.rejectOperator;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C39912di4.rejectServiceCenter;
                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                    if (button3 != null) {
                        i = C39912di4.testRide;
                        Button button4 = (Button) C34328Lp6.m96312a(view, i);
                        if (button4 != null) {
                            i = C39912di4.title;
                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView != null) {
                                return new C39494d00((LinearLayout) view, button, constraintLayout, button2, button3, button4, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C39494d00 m44747c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.bottom_sheet_receive_acceptance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44749a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f75944a;
    }
}
