package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
/* renamed from: nb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45769nb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final MaterialCardView f100166a;

    /* renamed from: b */
    public final ImageView f100167b;

    /* renamed from: c */
    public final ImageView f100168c;

    /* renamed from: d */
    public final TextView f100169d;

    public C45769nb2(MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f100166a = materialCardView;
        this.f100167b = imageView;
        this.f100168c = imageView2;
        this.f100169d = textView;
    }

    /* renamed from: a */
    public static C45769nb2 m23488a(View view) {
        int i = C42866ih4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C42866ih4.icon;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C42866ih4.label;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C45769nb2((MaterialCardView) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public MaterialCardView getRoot() {
        return this.f100166a;
    }
}
