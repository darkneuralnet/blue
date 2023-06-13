package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: jc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43407jc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f93017a;

    /* renamed from: b */
    public final TextView f93018b;

    /* renamed from: c */
    public final TextView f93019c;

    public C43407jc2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f93017a = linearLayout;
        this.f93018b = textView;
        this.f93019c = textView2;
    }

    /* renamed from: a */
    public static C43407jc2 m30204a(View view) {
        int i = C33318Hh4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C33318Hh4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C43407jc2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f93017a;
    }
}
