package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: fb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41025fb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f80344a;

    /* renamed from: b */
    public final ImageView f80345b;

    /* renamed from: c */
    public final TextView f80346c;

    public C41025fb2(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f80344a = linearLayout;
        this.f80345b = imageView;
        this.f80346c = textView;
    }

    /* renamed from: a */
    public static C41025fb2 m41152a(View view) {
        int i = C41087fh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C41087fh4.status;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C41025fb2((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f80344a;
    }
}
