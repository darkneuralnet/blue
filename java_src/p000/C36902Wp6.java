package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: Wp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36902Wp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f42160a;

    /* renamed from: b */
    public final RelativeLayout f42161b;

    /* renamed from: c */
    public final ImageView f42162c;

    /* renamed from: d */
    public final TextView f42163d;

    /* renamed from: e */
    public final TextView f42164e;

    public C36902Wp6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.f42160a = relativeLayout;
        this.f42161b = relativeLayout2;
        this.f42162c = imageView;
        this.f42163d = textView;
        this.f42164e = textView2;
    }

    /* renamed from: a */
    public static C36902Wp6 m77821a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = C52955zi4.image;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.subtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C36902Wp6(relativeLayout, relativeLayout, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C36902Wp6 m77819c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_charger_looking_for_rider_mode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m77821a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f42160a;
    }
}
