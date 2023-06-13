package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: sj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48811sj0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f109152a;

    /* renamed from: b */
    public final TextView f109153b;

    public C48811sj0(TextView textView, TextView textView2) {
        this.f109152a = textView;
        this.f109153b = textView2;
    }

    /* renamed from: a */
    public static C48811sj0 m13781a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C48811sj0(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C48811sj0 m13779c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_transaction_item_body_line, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m13781a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f109152a;
    }
}
