package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: zb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52883zb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f121571a;

    /* renamed from: b */
    public final TextView f121572b;

    /* renamed from: c */
    public final TextView f121573c;

    public C52883zb2(View view, TextView textView, TextView textView2) {
        this.f121571a = view;
        this.f121572b = textView;
        this.f121573c = textView2;
    }

    /* renamed from: a */
    public static C52883zb2 m1062a(View view) {
        int i = C36585Vg4.contactName;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.contactNumber;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C52883zb2(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C52883zb2 m1061b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.item_contact, viewGroup);
            return m1062a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f121571a;
    }
}
