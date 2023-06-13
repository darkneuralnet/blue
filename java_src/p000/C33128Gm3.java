package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: Gm3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33128Gm3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f12403a;

    /* renamed from: b */
    public final TextView f12404b;

    /* renamed from: c */
    public final ImageView f12405c;

    /* renamed from: d */
    public final TextView f12406d;

    public C33128Gm3(View view, TextView textView, ImageView imageView, TextView textView2) {
        this.f12403a = view;
        this.f12404b = textView;
        this.f12405c = imageView;
        this.f12406d = textView2;
    }

    /* renamed from: a */
    public static C33128Gm3 m104764a(View view) {
        int i = C52955zi4.filterCount;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.filterIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C52955zi4.filterLabel;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C33128Gm3(view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f12403a;
    }
}
