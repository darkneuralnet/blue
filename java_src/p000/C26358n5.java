package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: n5 */
/* loaded from: classes2.dex */
public final class C26358n5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f99313a;

    /* renamed from: b */
    public final EditText f99314b;

    /* renamed from: c */
    public final TextView f99315c;

    /* renamed from: d */
    public final EditText f99316d;

    /* renamed from: e */
    public final Button f99317e;

    public C26358n5(LinearLayout linearLayout, EditText editText, TextView textView, EditText editText2, Button button) {
        this.f99313a = linearLayout;
        this.f99314b = editText;
        this.f99315c = textView;
        this.f99316d = editText2;
        this.f99317e = button;
    }

    /* renamed from: a */
    public static C26358n5 m24488a(View view) {
        int i = C36585Vg4.enterCombination;
        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
        if (editText != null) {
            i = C36585Vg4.lockType;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.reEnterCombination;
                EditText editText2 = (EditText) C34328Lp6.m96312a(view, i);
                if (editText2 != null) {
                    i = C36585Vg4.saveButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C26358n5((LinearLayout) view, editText, textView, editText2, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C26358n5 m24486c(LayoutInflater layoutInflater) {
        return m24485d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C26358n5 m24485d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_replace_physical_lock, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m24488a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f99313a;
    }
}
