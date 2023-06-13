package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: y3 */
/* loaded from: classes3.dex */
public final class C30410y3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f118647a;

    /* renamed from: b */
    public final EditText f118648b;

    /* renamed from: c */
    public final TextView f118649c;

    /* renamed from: d */
    public final TextView f118650d;

    public C30410y3(LinearLayout linearLayout, EditText editText, TextView textView, TextView textView2) {
        this.f118647a = linearLayout;
        this.f118648b = editText;
        this.f118649c = textView;
        this.f118650d = textView2;
    }

    /* renamed from: a */
    public static C30410y3 m4223a(View view) {
        int i = C42283hi4.code;
        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
        if (editText != null) {
            i = C42283hi4.instructions;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C42283hi4.label;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C30410y3((LinearLayout) view, editText, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C30410y3 m4221c(LayoutInflater layoutInflater) {
        return m4220d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30410y3 m4220d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36144Tj4.activity_enter_vehicle_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m4223a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f118647a;
    }
}
