package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: sf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48773sf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f109080a;

    /* renamed from: b */
    public final TextView f109081b;

    /* renamed from: c */
    public final ImageView f109082c;

    /* renamed from: d */
    public final TextView f109083d;

    /* renamed from: e */
    public final TextView f109084e;

    /* renamed from: f */
    public final ConstraintLayout f109085f;

    public C48773sf2(CardView cardView, TextView textView, ImageView imageView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout) {
        this.f109080a = cardView;
        this.f109081b = textView;
        this.f109082c = imageView;
        this.f109083d = textView2;
        this.f109084e = textView3;
        this.f109085f = constraintLayout;
    }

    /* renamed from: a */
    public static C48773sf2 m13861a(View view) {
        int i = C37062Xh4.cardCTA;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C37062Xh4.cardIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C37062Xh4.cardSubtitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C37062Xh4.cardTitle;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C37062Xh4.mainContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                        if (constraintLayout != null) {
                            return new C48773sf2((CardView) view, textView, imageView, textView2, textView3, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f109080a;
    }
}
