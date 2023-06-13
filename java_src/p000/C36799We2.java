package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: We2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36799We2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f41457a;

    /* renamed from: b */
    public final SwitchCompat f41458b;

    /* renamed from: c */
    public final TextView f41459c;

    public C36799We2(ConstraintLayout constraintLayout, SwitchCompat switchCompat, TextView textView) {
        this.f41457a = constraintLayout;
        this.f41458b = switchCompat;
        this.f41459c = textView;
    }

    /* renamed from: a */
    public static C36799We2 m78056a(View view) {
        int i = C35424Qh4.lock;
        SwitchCompat switchCompat = (SwitchCompat) C34328Lp6.m96312a(view, i);
        if (switchCompat != null) {
            i = C35424Qh4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C36799We2((ConstraintLayout) view, switchCompat, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f41457a;
    }
}
