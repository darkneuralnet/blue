package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Yd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37258Yd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f46096a;

    /* renamed from: b */
    public final TextView f46097b;

    /* renamed from: c */
    public final TextView f46098c;

    public C37258Yd2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f46096a = linearLayout;
        this.f46097b = textView;
        this.f46098c = textView2;
    }

    /* renamed from: a */
    public static C37258Yd2 m74782a(View view) {
        int i = C39912di4.location;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.navigate;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C37258Yd2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f46096a;
    }
}
