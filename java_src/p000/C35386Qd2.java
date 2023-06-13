package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Qd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35386Qd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f30596a;

    /* renamed from: b */
    public final ImageView f30597b;

    /* renamed from: c */
    public final TextView f30598c;

    /* renamed from: d */
    public final TextView f30599d;

    /* renamed from: e */
    public final TextView f30600e;

    public C35386Qd2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f30596a = constraintLayout;
        this.f30597b = imageView;
        this.f30598c = textView;
        this.f30599d = textView2;
        this.f30600e = textView3;
    }

    /* renamed from: a */
    public static C35386Qd2 m88306a(View view) {
        int i = C39912di4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C39912di4.date;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C39912di4.details;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C39912di4.time;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C35386Qd2((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f30596a;
    }
}
