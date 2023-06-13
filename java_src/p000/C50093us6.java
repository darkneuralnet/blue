package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: us6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50093us6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f113123a;

    /* renamed from: b */
    public final FrameLayout f113124b;

    /* renamed from: c */
    public final ImageView f113125c;

    /* renamed from: d */
    public final ImageView f113126d;

    /* renamed from: e */
    public final LinearLayout f113127e;

    /* renamed from: f */
    public final TextView f113128f;

    public C50093us6(View view, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView) {
        this.f113123a = view;
        this.f113124b = frameLayout;
        this.f113125c = imageView;
        this.f113126d = imageView2;
        this.f113127e = linearLayout;
        this.f113128f = textView;
    }

    /* renamed from: a */
    public static C50093us6 m9621a(View view) {
        int i = C36585Vg4.checkContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C36585Vg4.checkIconGray;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C36585Vg4.checkIconGreen;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C36585Vg4.optionsContainer;
                    LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                    if (linearLayout != null) {
                        i = C36585Vg4.title;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            return new C50093us6(view, frameLayout, imageView, imageView2, linearLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C50093us6 m9620b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.view_options, viewGroup);
            return m9621a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f113123a;
    }
}
