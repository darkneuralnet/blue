package p000;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: Pe2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35161Pe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f28787a;

    /* renamed from: b */
    public final CheckBox f28788b;

    /* renamed from: c */
    public final TextView f28789c;

    public C35161Pe2(RelativeLayout relativeLayout, CheckBox checkBox, TextView textView) {
        this.f28787a = relativeLayout;
        this.f28788b = checkBox;
        this.f28789c = textView;
    }

    /* renamed from: a */
    public static C35161Pe2 m90045a(View view) {
        int i = C36585Vg4.checkbox;
        CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
        if (checkBox != null) {
            i = C36585Vg4.text;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C35161Pe2((RelativeLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f28787a;
    }
}
