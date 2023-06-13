package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: Wx4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36972Wx4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f42408a;

    /* renamed from: b */
    public final ImageView f42409b;

    /* renamed from: c */
    public final TextView f42410c;

    /* renamed from: d */
    public final TextView f42411d;

    public C36972Wx4(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f42408a = relativeLayout;
        this.f42409b = imageView;
        this.f42410c = textView;
        this.f42411d = textView2;
    }

    /* renamed from: a */
    public static C36972Wx4 m77604a(View view) {
        int i = C36585Vg4.calendar;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36585Vg4.period;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.periodPrice;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C36972Wx4((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f42408a;
    }
}
