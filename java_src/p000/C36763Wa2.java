package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Wa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36763Wa2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f41313a;

    /* renamed from: b */
    public final TextView f41314b;

    /* renamed from: c */
    public final ImageView f41315c;

    public C36763Wa2(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.f41313a = linearLayout;
        this.f41314b = textView;
        this.f41315c = imageView;
    }

    /* renamed from: a */
    public static C36763Wa2 m78170a(View view) {
        int i = C38698bh4.benefit;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C38698bh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                return new C36763Wa2((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f41313a;
    }
}
