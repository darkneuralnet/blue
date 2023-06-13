package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import io.card.payment.CreditCard;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lio/card/payment/CreditCard;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: JE0 */
/* loaded from: classes2.dex */
public final class JE0 {
    /* renamed from: a */
    public static final PaymentMethodCreateParams m100942a(CreditCard creditCard) {
        Intrinsics.checkNotNullParameter(creditCard, "<this>");
        String cardNumber = creditCard.cardNumber;
        Intrinsics.checkNotNullExpressionValue(cardNumber, "cardNumber");
        return PaymentMethodCreateParams.Companion.createCard(new CardParams(cardNumber, creditCard.expiryMonth, creditCard.expiryYear, creditCard.cvv, creditCard.cardholderName, new Address(null, null, null, null, creditCard.postalCode, null, 47, null), (String) null, (Map) null, 192, (DefaultConstructorMarker) null));
    }
}
