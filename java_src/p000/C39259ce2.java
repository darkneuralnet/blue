package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ce2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39259ce2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f61011a;

    /* renamed from: b */
    public final TextView f61012b;

    /* renamed from: c */
    public final TextView f61013c;

    public C39259ce2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f61011a = constraintLayout;
        this.f61012b = textView;
        this.f61013c = textView2;
    }

    /* renamed from: a */
    public static C39259ce2 m61103a(View view) {
        int i = C36585Vg4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C39259ce2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f61011a;
    }
}
