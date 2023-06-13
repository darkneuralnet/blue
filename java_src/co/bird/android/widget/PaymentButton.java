package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.model.wallets.Wallet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u0013¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0013J$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010%\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001e¨\u00061"}, m28432d2 = {"Lco/bird/android/widget/PaymentButton;", "Landroid/widget/RelativeLayout;", "", "setDefaultFromPaymentLanding", "", "isGooglePay", "", AccountRangeJsonParser.FIELD_BRAND, "last4CardNumber", "setAdyenCard", "Lcom/stripe/android/model/Card;", "card", "setStripeCard", "Lcom/stripe/android/model/PaymentMethod;", "method", "setStripePaymentMethod", "email", "setPaypal", C17296a.f69688o, "", "message", "b", "show", "c", "drawableId", "setEndIcon", "Lcom/stripe/android/model/CardBrand;", "last4", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "Landroid/widget/TextView;", "textView", "subtitleView", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "iconView", "e", "rightArrowView", "f", "endIconView", "g", "endLabelView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PaymentButton extends RelativeLayout {

    /* renamed from: b */
    public final TextView f67449b;

    /* renamed from: c */
    public final TextView f67450c;

    /* renamed from: d */
    public final ImageView f67451d;

    /* renamed from: e */
    public final ImageView f67452e;

    /* renamed from: f */
    public final ImageView f67453f;

    /* renamed from: g */
    public final TextView f67454g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m54507a() {
        C49520tu6.m11239l(this.f67450c);
    }

    /* renamed from: b */
    public final void m54506b(int i) {
        this.f67449b.setText(getContext().getResources().getString(i));
        C49520tu6.show$default(this.f67451d, false, 0, 2, null);
    }

    /* renamed from: c */
    public final void m54505c(boolean z) {
        if (z) {
            setEndIcon(0);
        }
        C49520tu6.show$default(this.f67452e, z, 0, 2, null);
    }

    /* renamed from: d */
    public final void m54504d(boolean z, CardBrand cardBrand, String str) {
        String string;
        int m4898a;
        TextView textView = this.f67449b;
        if (z) {
            string = getContext().getString(C45871nl4.credit_card_google_pay_short_name);
        } else {
            string = getContext().getString(C45871nl4.credit_card_short_name, cardBrand, str);
        }
        textView.setText(string);
        C49520tu6.m11239l(this.f67450c);
        C49520tu6.show$default(this.f67451d, true, 0, 2, null);
        ImageView imageView = this.f67451d;
        if (z) {
            m4898a = C48193rg4.ic_google_pay_mark_800_gray;
        } else {
            if (cardBrand == null) {
                cardBrand = CardBrand.Unknown;
            }
            m4898a = C51735xf0.m4898a(cardBrand);
        }
        imageView.setImageResource(m4898a);
    }

    public final void setAdyenCard(boolean z, String brand, String last4CardNumber) {
        String capitalize;
        String string;
        int m4897b;
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(last4CardNumber, "last4CardNumber");
        capitalize = StringsKt__StringsJVMKt.capitalize(brand);
        TextView textView = this.f67449b;
        if (z) {
            string = getContext().getString(C45871nl4.credit_card_google_pay_short_name);
        } else {
            string = getContext().getString(C45871nl4.credit_card_short_name, capitalize, last4CardNumber);
        }
        textView.setText(string);
        C49520tu6.m11239l(this.f67450c);
        C49520tu6.show$default(this.f67451d, true, 0, 2, null);
        ImageView imageView = this.f67451d;
        if (z) {
            m4897b = C48193rg4.ic_google_pay_mark_800_gray;
        } else {
            m4897b = C51735xf0.m4897b(brand);
        }
        imageView.setImageResource(m4897b);
    }

    public final void setDefaultFromPaymentLanding() {
        C49520tu6.m11233r(this.f67454g);
        this.f67454g.setText(getContext().getString(C45871nl4.change_default));
        C49520tu6.m11233r(this.f67452e);
    }

    public final void setEndIcon(int i) {
        boolean z;
        ImageView imageView = this.f67453f;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(imageView, z, 0, 2, null);
        if (i != 0) {
            m54505c(false);
            this.f67453f.setImageDrawable(C29611vi.m8248b(getContext(), i));
        }
    }

    public final void setPaypal(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f67449b.setText(C45871nl4.payment_paypal);
        this.f67451d.setImageResource(C48193rg4.ic_paypal);
        this.f67450c.setText(email);
        C49520tu6.m11233r(this.f67449b);
        C49520tu6.m11233r(this.f67451d);
        C49520tu6.m11233r(this.f67450c);
    }

    public final void setStripeCard(Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        m54504d(ES5.m108973b(card), card.getBrand(), card.getLast4());
    }

    public final void setStripePaymentMethod(PaymentMethod method) {
        Wallet wallet;
        CardBrand cardBrand;
        Intrinsics.checkNotNullParameter(method, "method");
        PaymentMethod.Card card = method.card;
        String str = null;
        if (card != null) {
            wallet = card.wallet;
        } else {
            wallet = null;
        }
        boolean z = wallet instanceof Wallet.GooglePayWallet;
        if (card != null) {
            cardBrand = card.brand;
        } else {
            cardBrand = null;
        }
        if (card != null) {
            str = card.last4;
        }
        m54504d(z, cardBrand, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PaymentButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(C45268mk4.view_payment_button, this);
        TextView textView = (TextView) C49520tu6.m11243h(this, C52955zi4.text);
        this.f67449b = textView;
        this.f67450c = (TextView) C49520tu6.m11243h(this, C52955zi4.subtitle);
        ImageView imageView = (ImageView) C49520tu6.m11243h(this, C52955zi4.icon);
        this.f67451d = imageView;
        this.f67452e = (ImageView) C49520tu6.m11243h(this, C52955zi4.rightArrow);
        this.f67453f = (ImageView) C49520tu6.m11243h(this, C52955zi4.endIcon);
        this.f67454g = (TextView) C49520tu6.m11243h(this, C52955zi4.endLabel);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C34056Kl4.PaymentButton);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.PaymentButton)");
        try {
            int resourceId = obtainStyledAttributes.getResourceId(C34056Kl4.PaymentButton_paymentIcon, -1);
            if (resourceId != -1) {
                imageView.setImageDrawable(NA0.m94299e(context, resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(C34056Kl4.PaymentButton_paymentEndIcon, -1);
            if (resourceId2 != -1) {
                setEndIcon(resourceId2);
            }
            m54505c(obtainStyledAttributes.getBoolean(C34056Kl4.PaymentButton_paymentShowNextArrow, false));
            textView.setText(obtainStyledAttributes.getText(C34056Kl4.PaymentButton_paymentText));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
