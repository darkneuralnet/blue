package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Gd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33046Gd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f12180a;

    /* renamed from: b */
    public final TextView f12181b;

    /* renamed from: c */
    public final ImageView f12182c;

    /* renamed from: d */
    public final TextView f12183d;

    public C33046Gd2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f12180a = constraintLayout;
        this.f12181b = textView;
        this.f12182c = imageView;
        this.f12183d = textView2;
    }

    /* renamed from: a */
    public static C33046Gd2 m104945a(View view) {
        int i = C32616Eh4.caption;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32616Eh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C32616Eh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C33046Gd2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f12180a;
    }
}
