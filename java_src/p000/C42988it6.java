package p000;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: it6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42988it6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f91655a;

    /* renamed from: b */
    public final CheckBox f91656b;

    /* renamed from: c */
    public final TextView f91657c;

    /* renamed from: d */
    public final TextView f91658d;

    public C42988it6(ConstraintLayout constraintLayout, CheckBox checkBox, TextView textView, TextView textView2) {
        this.f91655a = constraintLayout;
        this.f91656b = checkBox;
        this.f91657c = textView;
        this.f91658d = textView2;
    }

    /* renamed from: a */
    public static C42988it6 m31674a(View view) {
        int i = C38115ai4.checkbox;
        CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
        if (checkBox != null) {
            i = C38115ai4.repair;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C38115ai4.subtype;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C42988it6((ConstraintLayout) view, checkBox, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91655a;
    }
}
