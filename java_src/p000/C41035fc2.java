package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: fc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41035fc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f80354a;

    /* renamed from: b */
    public final ImageView f80355b;

    /* renamed from: c */
    public final TextView f80356c;

    /* renamed from: d */
    public final TextView f80357d;

    public C41035fc2(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f80354a = relativeLayout;
        this.f80355b = imageView;
        this.f80356c = textView;
        this.f80357d = textView2;
    }

    /* renamed from: a */
    public static C41035fc2 m41118a(View view) {
        int i = C47610qh4.badge;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C47610qh4.description;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C47610qh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C41035fc2((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f80354a;
    }
}
