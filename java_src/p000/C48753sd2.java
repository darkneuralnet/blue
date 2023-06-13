package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: sd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48753sd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f109052a;

    /* renamed from: b */
    public final TextView f109053b;

    /* renamed from: c */
    public final ImageView f109054c;

    public C48753sd2(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.f109052a = linearLayout;
        this.f109053b = textView;
        this.f109054c = imageView;
    }

    /* renamed from: a */
    public static C48753sd2 m13936a(View view) {
        int i = C31680Ah4.count;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C31680Ah4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                return new C48753sd2((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f109052a;
    }
}
