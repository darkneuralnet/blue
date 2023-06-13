package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
/* renamed from: p5 */
/* loaded from: classes2.dex */
public final class C27138p5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f103112a;

    /* renamed from: b */
    public final EditText f103113b;

    /* renamed from: c */
    public final Button f103114c;

    public C27138p5(RelativeLayout relativeLayout, EditText editText, Button button) {
        this.f103112a = relativeLayout;
        this.f103113b = editText;
        this.f103114c = button;
    }

    /* renamed from: a */
    public static C27138p5 m19986a(View view) {
        int i = C36585Vg4.feedback;
        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
        if (editText != null) {
            i = C36585Vg4.submitButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                return new C27138p5((RelativeLayout) view, editText, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27138p5 m19984c(LayoutInflater layoutInflater) {
        return m19983d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27138p5 m19983d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_report_fraud_write_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19986a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f103112a;
    }
}
