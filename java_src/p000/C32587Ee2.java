package p000;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ee2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32587Ee2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f7910a;

    /* renamed from: b */
    public final TextView f7911b;

    /* renamed from: c */
    public final Switch f7912c;

    /* renamed from: d */
    public final TextView f7913d;

    public C32587Ee2(ConstraintLayout constraintLayout, TextView textView, Switch r3, TextView textView2) {
        this.f7910a = constraintLayout;
        this.f7911b = textView;
        this.f7912c = r3;
        this.f7913d = textView2;
    }

    /* renamed from: a */
    public static C32587Ee2 m108616a(View view) {
        int i = C34956Oh4.autoReloadTitle;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34956Oh4.autoReloadToggle;
            Switch r2 = (Switch) C34328Lp6.m96312a(view, i);
            if (r2 != null) {
                i = C34956Oh4.disclaimerText;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C32587Ee2((ConstraintLayout) view, textView, r2, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f7910a;
    }
}
