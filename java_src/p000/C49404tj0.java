package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: tj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49404tj0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f110937a;

    /* renamed from: b */
    public final TextView f110938b;

    public C49404tj0(TextView textView, TextView textView2) {
        this.f110937a = textView;
        this.f110938b = textView2;
    }

    /* renamed from: a */
    public static C49404tj0 m11848a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C49404tj0(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C49404tj0 m11846c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_transaction_item_headers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m11848a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f110937a;
    }
}
