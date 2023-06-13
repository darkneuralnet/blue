package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: NC2 */
/* loaded from: classes2.dex */
public final class NC2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f24273a;

    /* renamed from: b */
    public final EditText f24274b;

    public NC2(ConstraintLayout constraintLayout, EditText editText) {
        this.f24273a = constraintLayout;
        this.f24274b = editText;
    }

    /* renamed from: a */
    public static NC2 m94200a(View view) {
        int i = C36585Vg4.notes_et;
        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
        if (editText != null) {
            return new NC2((ConstraintLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static NC2 m94198c(LayoutInflater layoutInflater) {
        return m94197d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static NC2 m94197d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.longterm_setup_notes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94200a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f24273a;
    }
}
