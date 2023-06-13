package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
/* renamed from: Xp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37136Xp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f44043a;

    /* renamed from: b */
    public final CheckBox f44044b;

    /* renamed from: c */
    public final TextView f44045c;

    /* renamed from: d */
    public final TextView f44046d;

    public C37136Xp6(View view, CheckBox checkBox, TextView textView, TextView textView2) {
        this.f44043a = view;
        this.f44044b = checkBox;
        this.f44045c = textView;
        this.f44046d = textView2;
    }

    /* renamed from: a */
    public static C37136Xp6 m76230a(View view) {
        int i = C52955zi4.check;
        CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
        if (checkBox != null) {
            i = C52955zi4.details;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C37136Xp6(view, checkBox, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C37136Xp6 m76229b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_checkable_item, viewGroup);
            return m76230a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f44043a;
    }
}
