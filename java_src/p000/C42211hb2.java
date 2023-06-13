package p000;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: hb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42211hb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f85502a;

    /* renamed from: b */
    public final CheckBox f85503b;

    /* renamed from: c */
    public final TextView f85504c;

    public C42211hb2(RelativeLayout relativeLayout, CheckBox checkBox, TextView textView) {
        this.f85502a = relativeLayout;
        this.f85503b = checkBox;
        this.f85504c = textView;
    }

    /* renamed from: a */
    public static C42211hb2 m36171a(View view) {
        int i = C41680gh4.checkbox;
        CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
        if (checkBox != null) {
            i = C41680gh4.text;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C42211hb2((RelativeLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f85502a;
    }
}
