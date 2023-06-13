package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: jt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43581jt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f93508a;

    /* renamed from: b */
    public final EditText f93509b;

    /* renamed from: c */
    public final TextView f93510c;

    /* renamed from: d */
    public final Space f93511d;

    public C43581jt6(ConstraintLayout constraintLayout, EditText editText, TextView textView, Space space) {
        this.f93508a = constraintLayout;
        this.f93509b = editText;
        this.f93510c = textView;
        this.f93511d = space;
    }

    /* renamed from: a */
    public static C43581jt6 m29777a(View view) {
        int i = C38115ai4.otherDescription;
        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
        if (editText != null) {
            i = C38115ai4.repair;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C38115ai4.space;
                Space space = (Space) C34328Lp6.m96312a(view, i);
                if (space != null) {
                    return new C43581jt6((ConstraintLayout) view, editText, textView, space);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f93508a;
    }
}
