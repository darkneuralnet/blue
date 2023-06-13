package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: Ue2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36331Ue2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f37711a;

    /* renamed from: b */
    public final TextView f37712b;

    /* renamed from: c */
    public final TextView f37713c;

    public C36331Ue2(View view, TextView textView, TextView textView2) {
        this.f37711a = view;
        this.f37712b = textView;
        this.f37713c = textView2;
    }

    /* renamed from: a */
    public static C36331Ue2 m81216a(View view) {
        int i = C36585Vg4.lineItemAmount;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.lineItemName;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C36331Ue2(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C36331Ue2 m81215b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.item_receipt, viewGroup);
            return m81216a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f37711a;
    }
}
