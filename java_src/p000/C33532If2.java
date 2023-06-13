package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: If2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33532If2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f15994a;

    /* renamed from: b */
    public final ImageView f15995b;

    /* renamed from: c */
    public final TextView f15996c;

    public C33532If2(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f15994a = linearLayout;
        this.f15995b = imageView;
        this.f15996c = textView;
    }

    /* renamed from: a */
    public static C33532If2 m101829a(View view) {
        int i = C51769xi4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C51769xi4.status;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C33532If2((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f15994a;
    }
}
