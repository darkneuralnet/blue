package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: kt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44174kt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f95160a;

    /* renamed from: b */
    public final View f95161b;

    /* renamed from: c */
    public final TextView f95162c;

    /* renamed from: d */
    public final TextView f95163d;

    /* renamed from: e */
    public final EditText f95164e;

    public C44174kt6(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, EditText editText) {
        this.f95160a = constraintLayout;
        this.f95161b = view;
        this.f95162c = textView;
        this.f95163d = textView2;
        this.f95164e = editText;
    }

    /* renamed from: a */
    public static C44174kt6 m28231a(View view) {
        int i = C38115ai4.divider;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C38115ai4.model;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C38115ai4.modelLabel;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C38115ai4.search;
                    EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                    if (editText != null) {
                        return new C44174kt6((ConstraintLayout) view, m96312a, textView, textView2, editText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f95160a;
    }
}
