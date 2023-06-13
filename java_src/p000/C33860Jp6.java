package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: Jp6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33860Jp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f18301a;

    /* renamed from: b */
    public final ImageView f18302b;

    /* renamed from: c */
    public final TextView f18303c;

    /* renamed from: d */
    public final TextView f18304d;

    public C33860Jp6(View view, ImageView imageView, TextView textView, TextView textView2) {
        this.f18301a = view;
        this.f18302b = imageView;
        this.f18303c = textView;
        this.f18304d = textView2;
    }

    /* renamed from: a */
    public static C33860Jp6 m99647a(View view) {
        int i = C36585Vg4.beginnerModeIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36585Vg4.beginnerModeSubtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.beginnerModeTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C33860Jp6(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C33860Jp6 m99646b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.view_beginner_mode_top, viewGroup);
            return m99647a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f18301a;
    }
}
