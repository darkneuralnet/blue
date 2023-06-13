package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: oe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46392oe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f102255a;

    /* renamed from: b */
    public final ImageView f102256b;

    /* renamed from: c */
    public final TextView f102257c;

    /* renamed from: d */
    public final TextView f102258d;

    /* renamed from: e */
    public final TextView f102259e;

    /* renamed from: f */
    public final ImageView f102260f;

    public C46392oe2(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2) {
        this.f102255a = linearLayout;
        this.f102256b = imageView;
        this.f102257c = textView;
        this.f102258d = textView2;
        this.f102259e = textView3;
        this.f102260f = imageView2;
    }

    /* renamed from: a */
    public static C46392oe2 m20717a(View view) {
        int i = C34722Nh4.badge;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34722Nh4.battery;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34722Nh4.birdCode;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34722Nh4.lastLocatedTime;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C34722Nh4.rightArrow;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            return new C46392oe2((LinearLayout) view, imageView, textView, textView2, textView3, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f102255a;
    }
}
