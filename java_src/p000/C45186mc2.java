package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: mc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45186mc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f98441a;

    /* renamed from: b */
    public final TextView f98442b;

    /* renamed from: c */
    public final TextView f98443c;

    public C45186mc2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f98441a = constraintLayout;
        this.f98442b = textView;
        this.f98443c = textView2;
    }

    /* renamed from: a */
    public static C45186mc2 m25314a(View view) {
        int i = C39912di4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.headerText;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C45186mc2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f98441a;
    }
}
