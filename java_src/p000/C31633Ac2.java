package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ac2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31633Ac2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f860a;

    /* renamed from: b */
    public final TextView f861b;

    /* renamed from: c */
    public final TextView f862c;

    /* renamed from: d */
    public final TextView f863d;

    public C31633Ac2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f860a = constraintLayout;
        this.f861b = textView;
        this.f862c = textView2;
        this.f863d = textView3;
    }

    /* renamed from: a */
    public static C31633Ac2 m115442a(View view) {
        int i = C44062ki4.issue;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C44062ki4.source;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C44062ki4.status;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C31633Ac2((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f860a;
    }
}
