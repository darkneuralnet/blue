package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: jg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43447jg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f93123a;

    /* renamed from: b */
    public final TextView f93124b;

    /* renamed from: c */
    public final ImageView f93125c;

    /* renamed from: d */
    public final TextView f93126d;

    public C43447jg2(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f93123a = linearLayout;
        this.f93124b = textView;
        this.f93125c = imageView;
        this.f93126d = textView2;
    }

    /* renamed from: a */
    public static C43447jg2 m30123a(View view) {
        int i = C42876ii4.count;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C42876ii4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C42876ii4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C43447jg2((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f93123a;
    }
}
