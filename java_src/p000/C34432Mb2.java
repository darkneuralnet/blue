package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Mb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34432Mb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f23266a;

    /* renamed from: b */
    public final TextView f23267b;

    /* renamed from: c */
    public final ImageView f23268c;

    /* renamed from: d */
    public final TextView f23269d;

    public C34432Mb2(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f23266a = linearLayout;
        this.f23267b = textView;
        this.f23268c = imageView;
        this.f23269d = textView2;
    }

    /* renamed from: a */
    public static C34432Mb2 m95149a(View view) {
        int i = C45831nh4.sort;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C45831nh4.sort_icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C45831nh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C34432Mb2((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f23266a;
    }
}
