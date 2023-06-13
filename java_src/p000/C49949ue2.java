package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
/* renamed from: ue2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49949ue2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f112696a;

    /* renamed from: b */
    public final ImageView f112697b;

    /* renamed from: c */
    public final TextView f112698c;

    /* renamed from: d */
    public final ImageView f112699d;

    /* renamed from: e */
    public final View f112700e;

    public C49949ue2(CardView cardView, ImageView imageView, TextView textView, ImageView imageView2, View view) {
        this.f112696a = cardView;
        this.f112697b = imageView;
        this.f112698c = textView;
        this.f112699d = imageView2;
        this.f112700e = view;
    }

    /* renamed from: a */
    public static C49949ue2 m9928a(View view) {
        View m96312a;
        int i = C34488Mh4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34488Mh4.headerText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34488Mh4.qrCode;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C34488Mh4.scanAnotherPartContainer))) != null) {
                    return new C49949ue2((CardView) view, imageView, textView, imageView2, m96312a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f112696a;
    }
}
