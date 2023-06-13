package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
/* renamed from: Ta2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36061Ta2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final MaterialCardView f35702a;

    /* renamed from: b */
    public final TextView f35703b;

    /* renamed from: c */
    public final ImageView f35704c;

    /* renamed from: d */
    public final TextView f35705d;

    public C36061Ta2(MaterialCardView materialCardView, TextView textView, ImageView imageView, TextView textView2) {
        this.f35702a = materialCardView;
        this.f35703b = textView;
        this.f35704c = imageView;
        this.f35705d = textView2;
    }

    /* renamed from: a */
    public static C36061Ta2 m83384a(View view) {
        int i = C38698bh4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C38698bh4.chevron;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C38698bh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C36061Ta2((MaterialCardView) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public MaterialCardView getRoot() {
        return this.f35702a;
    }
}
