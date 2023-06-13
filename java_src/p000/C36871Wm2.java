package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: Wm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36871Wm2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f42096a;

    /* renamed from: b */
    public final ImageView f42097b;

    /* renamed from: c */
    public final TextView f42098c;

    public C36871Wm2(View view, ImageView imageView, TextView textView) {
        this.f42096a = view;
        this.f42097b = imageView;
        this.f42098c = textView;
    }

    /* renamed from: a */
    public static C36871Wm2 m77836a(View view) {
        int i = C33318Hh4.directions;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C33318Hh4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C36871Wm2(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f42096a;
    }
}
