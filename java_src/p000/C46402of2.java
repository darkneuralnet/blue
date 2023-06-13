package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: of2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46402of2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f102280a;

    /* renamed from: b */
    public final View f102281b;

    /* renamed from: c */
    public final TextView f102282c;

    public C46402of2(LinearLayout linearLayout, View view, TextView textView) {
        this.f102280a = linearLayout;
        this.f102281b = view;
        this.f102282c = textView;
    }

    /* renamed from: a */
    public static C46402of2 m20685a(View view) {
        int i = C36126Th4.divider;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C36126Th4.footer;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C46402of2((LinearLayout) view, m96312a, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f102280a;
    }
}
