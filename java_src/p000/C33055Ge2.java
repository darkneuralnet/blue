package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.payment.views.SupportedPaymentBrandsView;
/* renamed from: Ge2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33055Ge2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f12197a;

    /* renamed from: b */
    public final ConstraintLayout f12198b;

    /* renamed from: c */
    public final CardView f12199c;

    /* renamed from: d */
    public final TextView f12200d;

    /* renamed from: e */
    public final ImageView f12201e;

    /* renamed from: f */
    public final TextView f12202f;

    /* renamed from: g */
    public final SupportedPaymentBrandsView f12203g;

    /* renamed from: h */
    public final TextView f12204h;

    public C33055Ge2(CardView cardView, ConstraintLayout constraintLayout, CardView cardView2, TextView textView, ImageView imageView, TextView textView2, SupportedPaymentBrandsView supportedPaymentBrandsView, TextView textView3) {
        this.f12197a = cardView;
        this.f12198b = constraintLayout;
        this.f12199c = cardView2;
        this.f12200d = textView;
        this.f12201e = imageView;
        this.f12202f = textView2;
        this.f12203g = supportedPaymentBrandsView;
        this.f12204h = textView3;
    }

    /* renamed from: a */
    public static C33055Ge2 m104940a(View view) {
        int i = C34956Oh4.contentContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
        if (constraintLayout != null) {
            CardView cardView = (CardView) view;
            i = C34956Oh4.promoText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34956Oh4.selectedIndicator;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C34956Oh4.subtitle;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C34956Oh4.supportedBrands;
                        SupportedPaymentBrandsView supportedPaymentBrandsView = (SupportedPaymentBrandsView) C34328Lp6.m96312a(view, i);
                        if (supportedPaymentBrandsView != null) {
                            i = C34956Oh4.title;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                return new C33055Ge2(cardView, constraintLayout, cardView, textView, imageView, textView2, supportedPaymentBrandsView, textView3);
                            }
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
        return this.f12197a;
    }
}
