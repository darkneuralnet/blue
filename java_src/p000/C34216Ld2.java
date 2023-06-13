package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ld2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34216Ld2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f21818a;

    /* renamed from: b */
    public final TextView f21819b;

    /* renamed from: c */
    public final FrameLayout f21820c;

    /* renamed from: d */
    public final TextView f21821d;

    /* renamed from: e */
    public final TextView f21822e;

    public C34216Ld2(ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3) {
        this.f21818a = constraintLayout;
        this.f21819b = textView;
        this.f21820c = frameLayout;
        this.f21821d = textView2;
        this.f21822e = textView3;
    }

    /* renamed from: a */
    public static C34216Ld2 m96538a(View view) {
        int i = C32850Fh4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32850Fh4.icon;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C32850Fh4.time;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C32850Fh4.title;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C34216Ld2((ConstraintLayout) view, textView, frameLayout, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f21818a;
    }
}
