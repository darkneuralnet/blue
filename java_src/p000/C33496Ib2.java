package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ib2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33496Ib2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f15924a;

    /* renamed from: b */
    public final TextView f15925b;

    /* renamed from: c */
    public final ImageView f15926c;

    /* renamed from: d */
    public final TextView f15927d;

    /* renamed from: e */
    public final TextView f15928e;

    public C33496Ib2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.f15924a = constraintLayout;
        this.f15925b = textView;
        this.f15926c = imageView;
        this.f15927d = textView2;
        this.f15928e = textView3;
    }

    /* renamed from: a */
    public static C33496Ib2 m101897a(View view) {
        int i = C34722Nh4.firmwareVersionText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34722Nh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C34722Nh4.label;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34722Nh4.updateLabel;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C33496Ib2((ConstraintLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f15924a;
    }
}
