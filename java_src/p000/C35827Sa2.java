package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Sa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35827Sa2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f33928a;

    /* renamed from: b */
    public final ImageView f33929b;

    /* renamed from: c */
    public final TextView f33930c;

    /* renamed from: d */
    public final TextView f33931d;

    /* renamed from: e */
    public final TextView f33932e;

    public C35827Sa2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f33928a = constraintLayout;
        this.f33929b = imageView;
        this.f33930c = textView;
        this.f33931d = textView2;
        this.f33932e = textView3;
    }

    /* renamed from: a */
    public static C35827Sa2 m85221a(View view) {
        int i = C34722Nh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34722Nh4.label;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34722Nh4.nicknameText;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34722Nh4.renameLabel;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C35827Sa2((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f33928a;
    }
}
