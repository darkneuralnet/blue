package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Jf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33766Jf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f17977a;

    /* renamed from: b */
    public final EditText f17978b;

    /* renamed from: c */
    public final View f17979c;

    /* renamed from: d */
    public final TextView f17980d;

    /* renamed from: e */
    public final TextView f17981e;

    public C33766Jf2(ConstraintLayout constraintLayout, EditText editText, View view, TextView textView, TextView textView2) {
        this.f17977a = constraintLayout;
        this.f17978b = editText;
        this.f17979c = view;
        this.f17980d = textView;
        this.f17981e = textView2;
    }

    /* renamed from: a */
    public static C33766Jf2 m100050a(View view) {
        View m96312a;
        int i = C39301ci4.detail;
        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
        if (editText != null && (m96312a = C34328Lp6.m96312a(view, (i = C39301ci4.editTextUnderline))) != null) {
            i = C39301ci4.optionalLabel;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C39301ci4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C33766Jf2((ConstraintLayout) view, editText, m96312a, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f17977a;
    }
}
