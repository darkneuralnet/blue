package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import co.bird.android.widget.EditTextBox;
/* renamed from: Gf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33064Gf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f12217a;

    /* renamed from: b */
    public final EditTextBox f12218b;

    /* renamed from: c */
    public final RadioButton f12219c;

    public C33064Gf2(LinearLayout linearLayout, EditTextBox editTextBox, RadioButton radioButton) {
        this.f12217a = linearLayout;
        this.f12218b = editTextBox;
        this.f12219c = radioButton;
    }

    /* renamed from: a */
    public static C33064Gf2 m104931a(View view) {
        int i = C38115ai4.notes;
        EditTextBox editTextBox = (EditTextBox) C34328Lp6.m96312a(view, i);
        if (editTextBox != null) {
            i = C38115ai4.statusName;
            RadioButton radioButton = (RadioButton) C34328Lp6.m96312a(view, i);
            if (radioButton != null) {
                return new C33064Gf2((LinearLayout) view, editTextBox, radioButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f12217a;
    }
}
