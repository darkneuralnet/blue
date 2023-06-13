package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: kc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44000kc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f94635a;

    /* renamed from: b */
    public final TextView f94636b;

    public C44000kc2(ConstraintLayout constraintLayout, TextView textView) {
        this.f94635a = constraintLayout;
        this.f94636b = textView;
    }

    /* renamed from: a */
    public static C44000kc2 m28795a(View view) {
        int i = C38115ai4.title;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C44000kc2((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f94635a;
    }
}
