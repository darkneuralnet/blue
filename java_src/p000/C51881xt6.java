package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: xt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51881xt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f118309a;

    /* renamed from: b */
    public final ImageView f118310b;

    /* renamed from: c */
    public final TextView f118311c;

    /* renamed from: d */
    public final TextView f118312d;

    public C51881xt6(View view, ImageView imageView, TextView textView, TextView textView2) {
        this.f118309a = view;
        this.f118310b = imageView;
        this.f118311c = textView;
        this.f118312d = textView2;
    }

    /* renamed from: a */
    public static C51881xt6 m4504a(View view) {
        int i = C37521Zg4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C37521Zg4.instructionDescriptionText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C37521Zg4.instructionTitleText;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C51881xt6(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C51881xt6 m4503b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36378Uj4.view_scan_resolution, viewGroup);
            return m4504a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f118309a;
    }
}
