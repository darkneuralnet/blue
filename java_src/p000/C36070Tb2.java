package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Tb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36070Tb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f35715a;

    /* renamed from: b */
    public final ImageView f35716b;

    /* renamed from: c */
    public final ImageView f35717c;

    /* renamed from: d */
    public final TextView f35718d;

    public C36070Tb2(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f35715a = linearLayout;
        this.f35716b = imageView;
        this.f35717c = imageView2;
        this.f35718d = textView;
    }

    /* renamed from: a */
    public static C36070Tb2 m83361a(View view) {
        int i = C45831nh4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.icon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C45831nh4.title;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C36070Tb2((LinearLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f35715a;
    }
}
