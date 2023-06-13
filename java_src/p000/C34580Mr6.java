package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: Mr6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34580Mr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f23683a;

    /* renamed from: b */
    public final ImageView f23684b;

    /* renamed from: c */
    public final ImageView f23685c;

    /* renamed from: d */
    public final TextView f23686d;

    public C34580Mr6(View view, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f23683a = view;
        this.f23684b = imageView;
        this.f23685c = imageView2;
        this.f23686d = textView;
    }

    /* renamed from: a */
    public static C34580Mr6 m94674a(View view) {
        int i = C45238mh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45238mh4.operatorIcon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C45238mh4.operatorName;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C34580Mr6(view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f23683a;
    }
}
