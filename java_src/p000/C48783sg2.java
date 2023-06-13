package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: sg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48783sg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f109094a;

    /* renamed from: b */
    public final TextView f109095b;

    /* renamed from: c */
    public final TextView f109096c;

    /* renamed from: d */
    public final TextView f109097d;

    public C48783sg2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f109094a = constraintLayout;
        this.f109095b = textView;
        this.f109096c = textView2;
        this.f109097d = textView3;
    }

    /* renamed from: a */
    public static C48783sg2 m13852a(View view) {
        int i = C37053Xg4.issue;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C37053Xg4.source;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C37053Xg4.status;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C48783sg2((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f109094a;
    }
}
