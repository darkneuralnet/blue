package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: Dt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32492Dt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f6467a;

    /* renamed from: b */
    public final RelativeLayout f6468b;

    /* renamed from: c */
    public final ImageView f6469c;

    /* renamed from: d */
    public final TextView f6470d;

    /* renamed from: e */
    public final TextView f6471e;

    public C32492Dt6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.f6467a = relativeLayout;
        this.f6468b = relativeLayout2;
        this.f6469c = imageView;
        this.f6470d = textView;
        this.f6471e = textView2;
    }

    /* renamed from: a */
    public static C32492Dt6 m109802a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = C50583vi4.bannerImage;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C50583vi4.bannerSubtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C50583vi4.bannerTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C32492Dt6(relativeLayout, relativeLayout, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f6467a;
    }
}
