package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Nf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34702Nf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f24955a;

    /* renamed from: b */
    public final ImageView f24956b;

    /* renamed from: c */
    public final TextView f24957c;

    /* renamed from: d */
    public final TextView f24958d;

    /* renamed from: e */
    public final Switch f24959e;

    public C34702Nf2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, Switch r5) {
        this.f24955a = constraintLayout;
        this.f24956b = imageView;
        this.f24957c = textView;
        this.f24958d = textView2;
        this.f24959e = r5;
    }

    /* renamed from: a */
    public static C34702Nf2 m93592a(View view) {
        int i = C34722Nh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34722Nh4.label;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34722Nh4.status;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34722Nh4.tamperSwitch;
                    Switch r7 = (Switch) C34328Lp6.m96312a(view, i);
                    if (r7 != null) {
                        return new C34702Nf2((ConstraintLayout) view, imageView, textView, textView2, r7);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f24955a;
    }
}
