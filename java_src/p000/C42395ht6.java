package p000;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ht6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42395ht6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f86066a;

    /* renamed from: b */
    public final CheckBox f86067b;

    /* renamed from: c */
    public final TextView f86068c;

    public C42395ht6(ConstraintLayout constraintLayout, CheckBox checkBox, TextView textView) {
        this.f86066a = constraintLayout;
        this.f86067b = checkBox;
        this.f86068c = textView;
    }

    /* renamed from: a */
    public static C42395ht6 m35620a(View view) {
        int i = C38115ai4.checkbox;
        CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
        if (checkBox != null) {
            i = C38115ai4.repair;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C42395ht6((ConstraintLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f86066a;
    }
}
