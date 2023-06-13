package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: yf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52330yf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f119943a;

    /* renamed from: b */
    public final TextView f119944b;

    /* renamed from: c */
    public final TextView f119945c;

    public C52330yf2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f119943a = linearLayout;
        this.f119944b = textView;
        this.f119945c = textView2;
    }

    /* renamed from: a */
    public static C52330yf2 m3012a(View view) {
        int i = C39912di4.detail;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.view;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C52330yf2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C52330yf2 m3010c(LayoutInflater layoutInflater) {
        return m3009d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C52330yf2 m3009d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.item_scrap_order_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m3012a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f119943a;
    }
}
