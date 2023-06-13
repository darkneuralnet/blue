package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: nf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45809nf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f100284a;

    /* renamed from: b */
    public final TextView f100285b;

    /* renamed from: c */
    public final ImageView f100286c;

    public C45809nf2(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.f100284a = linearLayout;
        this.f100285b = textView;
        this.f100286c = imageView;
    }

    /* renamed from: a */
    public static C45809nf2 m23345a(View view) {
        int i = C36126Th4.benefit;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36126Th4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                return new C45809nf2((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f100284a;
    }
}
