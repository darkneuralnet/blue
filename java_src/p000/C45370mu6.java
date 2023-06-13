package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: mu6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45370mu6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f99015a;

    /* renamed from: b */
    public final TextView f99016b;

    /* renamed from: c */
    public final TextView f99017c;

    /* renamed from: d */
    public final ImageView f99018d;

    public C45370mu6(FrameLayout frameLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.f99015a = frameLayout;
        this.f99016b = textView;
        this.f99017c = textView2;
        this.f99018d = imageView;
    }

    /* renamed from: a */
    public static C45370mu6 m24720a(View view) {
        int i = C41097fi4.name;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C41097fi4.pricing;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C41097fi4.vehicle;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    return new C45370mu6((FrameLayout) view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f99015a;
    }
}
