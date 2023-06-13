package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: ut6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50103ut6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f113165a;

    /* renamed from: b */
    public final ImageView f113166b;

    /* renamed from: c */
    public final TextView f113167c;

    public C50103ut6(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.f113165a = relativeLayout;
        this.f113166b = imageView;
        this.f113167c = textView;
    }

    /* renamed from: a */
    public static C50103ut6 m9589a(View view) {
        int i = C36126Th4.parkedRiders;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36126Th4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C50103ut6((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f113165a;
    }
}
