package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.widget.DrawableView;
import com.adyen.checkout.card.CardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardInputWidget;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;
/* renamed from: O2 */
/* loaded from: classes2.dex */
public final class C5816O2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f25541a;

    /* renamed from: b */
    public final CardView f25542b;

    /* renamed from: c */
    public final DrawableView f25543c;

    /* renamed from: d */
    public final TextInputEditText f25544d;

    /* renamed from: e */
    public final TextInputLayout f25545e;

    /* renamed from: f */
    public final TextInputEditText f25546f;

    /* renamed from: g */
    public final TextInputLayout f25547g;

    /* renamed from: h */
    public final LinearProgressIndicator f25548h;

    /* renamed from: i */
    public final TextView f25549i;

    /* renamed from: j */
    public final RelativeLayout f25550j;

    /* renamed from: k */
    public final CardInputWidget f25551k;

    /* renamed from: l */
    public final CardMultilineWidget f25552l;

    /* renamed from: m */
    public final ShippingInfoWidget f25553m;

    public C5816O2(LinearLayout linearLayout, CardView cardView, DrawableView drawableView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, LinearProgressIndicator linearProgressIndicator, TextView textView, RelativeLayout relativeLayout, CardInputWidget cardInputWidget, CardMultilineWidget cardMultilineWidget, ShippingInfoWidget shippingInfoWidget) {
        this.f25541a = linearLayout;
        this.f25542b = cardView;
        this.f25543c = drawableView;
        this.f25544d = textInputEditText;
        this.f25545e = textInputLayout;
        this.f25546f = textInputEditText2;
        this.f25547g = textInputLayout2;
        this.f25548h = linearProgressIndicator;
        this.f25549i = textView;
        this.f25550j = relativeLayout;
        this.f25551k = cardInputWidget;
        this.f25552l = cardMultilineWidget;
        this.f25553m = shippingInfoWidget;
    }

    /* renamed from: a */
    public static C5816O2 m92990a(View view) {
        int i = C36585Vg4.adyenCardView;
        CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
        if (cardView != null) {
            i = C36585Vg4.cardImage;
            DrawableView drawableView = (DrawableView) C34328Lp6.m96312a(view, i);
            if (drawableView != null) {
                i = C36585Vg4.dobEditText;
                TextInputEditText textInputEditText = (TextInputEditText) C34328Lp6.m96312a(view, i);
                if (textInputEditText != null) {
                    i = C36585Vg4.dobTextInputLayout;
                    TextInputLayout textInputLayout = (TextInputLayout) C34328Lp6.m96312a(view, i);
                    if (textInputLayout != null) {
                        i = C36585Vg4.passwordEditText;
                        TextInputEditText textInputEditText2 = (TextInputEditText) C34328Lp6.m96312a(view, i);
                        if (textInputEditText2 != null) {
                            i = C36585Vg4.passwordTextInputLayout;
                            TextInputLayout textInputLayout2 = (TextInputLayout) C34328Lp6.m96312a(view, i);
                            if (textInputLayout2 != null) {
                                i = C36585Vg4.progressBar;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                if (linearProgressIndicator != null) {
                                    i = C36585Vg4.scanCard;
                                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView != null) {
                                        i = C36585Vg4.scanCardRow;
                                        RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
                                        if (relativeLayout != null) {
                                            i = C36585Vg4.stripeCardInput;
                                            CardInputWidget cardInputWidget = (CardInputWidget) C34328Lp6.m96312a(view, i);
                                            if (cardInputWidget != null) {
                                                i = C36585Vg4.stripeCardZipInput;
                                                CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) C34328Lp6.m96312a(view, i);
                                                if (cardMultilineWidget != null) {
                                                    i = C36585Vg4.stripeFullAddress;
                                                    ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) C34328Lp6.m96312a(view, i);
                                                    if (shippingInfoWidget != null) {
                                                        return new C5816O2((LinearLayout) view, cardView, drawableView, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, linearProgressIndicator, textView, relativeLayout, cardInputWidget, cardMultilineWidget, shippingInfoWidget);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C5816O2 m92988c(LayoutInflater layoutInflater) {
        return m92987d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5816O2 m92987d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_add_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92990a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f25541a;
    }
}
