package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.payment.views.SupportedPaymentBrandsView;
/* renamed from: He2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33289He2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f13680a;

    /* renamed from: b */
    public final ConstraintLayout f13681b;

    /* renamed from: c */
    public final CardView f13682c;

    /* renamed from: d */
    public final ImageView f13683d;

    /* renamed from: e */
    public final TextView f13684e;

    /* renamed from: f */
    public final SupportedPaymentBrandsView f13685f;

    /* renamed from: g */
    public final TextView f13686g;

    public C33289He2(CardView cardView, ConstraintLayout constraintLayout, CardView cardView2, ImageView imageView, TextView textView, SupportedPaymentBrandsView supportedPaymentBrandsView, TextView textView2) {
        this.f13680a = cardView;
        this.f13681b = constraintLayout;
        this.f13682c = cardView2;
        this.f13683d = imageView;
        this.f13684e = textView;
        this.f13685f = supportedPaymentBrandsView;
        this.f13686g = textView2;
    }

    /* renamed from: a */
    public static C33289He2 m103619a(View view) {
        int i = C34956Oh4.contentContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
        if (constraintLayout != null) {
            CardView cardView = (CardView) view;
            i = C34956Oh4.selectedIndicator;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C34956Oh4.subtitle;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C34956Oh4.supportedBrands;
                    SupportedPaymentBrandsView supportedPaymentBrandsView = (SupportedPaymentBrandsView) C34328Lp6.m96312a(view, i);
                    if (supportedPaymentBrandsView != null) {
                        i = C34956Oh4.title;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C33289He2(cardView, constraintLayout, cardView, imageView, textView, supportedPaymentBrandsView, textView2);
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
        return this.f13680a;
    }
}
