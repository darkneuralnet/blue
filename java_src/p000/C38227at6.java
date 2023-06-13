package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: at6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38227at6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f56489a;

    /* renamed from: b */
    public final ImageView f56490b;

    /* renamed from: c */
    public final RelativeLayout f56491c;

    /* renamed from: d */
    public final TextView f56492d;

    public C38227at6(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView) {
        this.f56489a = relativeLayout;
        this.f56490b = imageView;
        this.f56491c = relativeLayout2;
        this.f56492d = textView;
    }

    /* renamed from: a */
    public static C38227at6 m65323a(View view) {
        int i = C52955zi4.brandIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = C52955zi4.releaseLocationBarBody;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i2);
            if (textView != null) {
                return new C38227at6(relativeLayout, imageView, relativeLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f56489a;
    }
}
