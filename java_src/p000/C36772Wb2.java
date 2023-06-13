package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Wb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36772Wb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f41378a;

    /* renamed from: b */
    public final ImageView f41379b;

    /* renamed from: c */
    public final TextView f41380c;

    public C36772Wb2(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f41378a = linearLayout;
        this.f41379b = imageView;
        this.f41380c = textView;
    }

    /* renamed from: a */
    public static C36772Wb2 m78162a(View view) {
        int i = C45248mi4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C36772Wb2((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f41378a;
    }
}
