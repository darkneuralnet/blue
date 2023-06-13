package co.bird.android.model;

import co.bird.android.model.constant.PaymentGatewayKind;
import co.bird.android.model.constant.PaymentMethod;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.model.wallets.Wallet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010-\u001a\u00020\u0014HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0098\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0012HÖ\u0001J\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0006J\u0006\u0010=\u001a\u00020\u0006J\u0006\u0010>\u001a\u00020\u0006J\u0006\u0010?\u001a\u00020\u0006J\u0006\u0010@\u001a\u00020\u0006J\b\u0010A\u001a\u00020\u0003H\u0016J\b\u0010B\u001a\u0004\u0018\u00010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006C"}, m28432d2 = {"Lco/bird/android/model/BirdPayment;", "", "id", "", AccountRangeJsonParser.FIELD_BRAND, "defaultPaymentMethod", "", "gatewayKind", "Lco/bird/android/model/constant/PaymentGatewayKind;", "lastCardNumbers", "expiryMonth", "expiryYear", "stripeCard", "Lcom/stripe/android/model/Card;", "stripePaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paypalEmail", "paymentMethodVersion", "", "methodType", "Lco/bird/android/model/constant/PaymentMethod;", "(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)V", "getBrand", "()Ljava/lang/String;", "getDefaultPaymentMethod", "()Z", "getExpiryMonth", "getExpiryYear", "getGatewayKind", "()Lco/bird/android/model/constant/PaymentGatewayKind;", "getId", "getLastCardNumbers", "getMethodType", "()Lco/bird/android/model/constant/PaymentMethod;", "getPaymentMethodVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaypalEmail", "getStripeCard", "()Lcom/stripe/android/model/Card;", "getStripePaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;)Lco/bird/android/model/BirdPayment;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "isAdyen", "isEmpty", "isGooglePay", "isPaypal", "isStripeCard", "isStripePaymentMethod", "toString", "vendor", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPayment {
    private final String brand;
    private final boolean defaultPaymentMethod;
    private final String expiryMonth;
    private final String expiryYear;
    private final PaymentGatewayKind gatewayKind;

    /* renamed from: id */
    private final String f66574id;
    private final String lastCardNumbers;
    private final PaymentMethod methodType;
    private final Integer paymentMethodVersion;
    private final String paypalEmail;
    private final Card stripeCard;
    private final com.stripe.android.model.PaymentMethod stripePaymentMethod;

    public BirdPayment(String id, String str, boolean z, PaymentGatewayKind paymentGatewayKind, String str2, String str3, String str4, Card card, com.stripe.android.model.PaymentMethod paymentMethod, String str5, Integer num, PaymentMethod methodType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(methodType, "methodType");
        this.f66574id = id;
        this.brand = str;
        this.defaultPaymentMethod = z;
        this.gatewayKind = paymentGatewayKind;
        this.lastCardNumbers = str2;
        this.expiryMonth = str3;
        this.expiryYear = str4;
        this.stripeCard = card;
        this.stripePaymentMethod = paymentMethod;
        this.paypalEmail = str5;
        this.paymentMethodVersion = num;
        this.methodType = methodType;
    }

    public final String component1() {
        return this.f66574id;
    }

    public final String component10() {
        return this.paypalEmail;
    }

    public final Integer component11() {
        return this.paymentMethodVersion;
    }

    public final PaymentMethod component12() {
        return this.methodType;
    }

    public final String component2() {
        return this.brand;
    }

    public final boolean component3() {
        return this.defaultPaymentMethod;
    }

    public final PaymentGatewayKind component4() {
        return this.gatewayKind;
    }

    public final String component5() {
        return this.lastCardNumbers;
    }

    public final String component6() {
        return this.expiryMonth;
    }

    public final String component7() {
        return this.expiryYear;
    }

    public final Card component8() {
        return this.stripeCard;
    }

    public final com.stripe.android.model.PaymentMethod component9() {
        return this.stripePaymentMethod;
    }

    public final BirdPayment copy(String id, String str, boolean z, PaymentGatewayKind paymentGatewayKind, String str2, String str3, String str4, Card card, com.stripe.android.model.PaymentMethod paymentMethod, String str5, Integer num, PaymentMethod methodType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(methodType, "methodType");
        return new BirdPayment(id, str, z, paymentGatewayKind, str2, str3, str4, card, paymentMethod, str5, num, methodType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPayment) {
            BirdPayment birdPayment = (BirdPayment) obj;
            return Intrinsics.areEqual(this.f66574id, birdPayment.f66574id) && Intrinsics.areEqual(this.brand, birdPayment.brand) && this.defaultPaymentMethod == birdPayment.defaultPaymentMethod && this.gatewayKind == birdPayment.gatewayKind && Intrinsics.areEqual(this.lastCardNumbers, birdPayment.lastCardNumbers) && Intrinsics.areEqual(this.expiryMonth, birdPayment.expiryMonth) && Intrinsics.areEqual(this.expiryYear, birdPayment.expiryYear) && Intrinsics.areEqual(this.stripeCard, birdPayment.stripeCard) && Intrinsics.areEqual(this.stripePaymentMethod, birdPayment.stripePaymentMethod) && Intrinsics.areEqual(this.paypalEmail, birdPayment.paypalEmail) && Intrinsics.areEqual(this.paymentMethodVersion, birdPayment.paymentMethodVersion) && this.methodType == birdPayment.methodType;
        }
        return false;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final boolean getDefaultPaymentMethod() {
        return this.defaultPaymentMethod;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final PaymentGatewayKind getGatewayKind() {
        return this.gatewayKind;
    }

    public final String getId() {
        return this.f66574id;
    }

    public final String getLastCardNumbers() {
        return this.lastCardNumbers;
    }

    public final PaymentMethod getMethodType() {
        return this.methodType;
    }

    public final Integer getPaymentMethodVersion() {
        return this.paymentMethodVersion;
    }

    public final String getPaypalEmail() {
        return this.paypalEmail;
    }

    public final Card getStripeCard() {
        return this.stripeCard;
    }

    public final com.stripe.android.model.PaymentMethod getStripePaymentMethod() {
        return this.stripePaymentMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66574id.hashCode() * 31;
        String str = this.brand;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.defaultPaymentMethod;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        PaymentGatewayKind paymentGatewayKind = this.gatewayKind;
        int hashCode3 = (i2 + (paymentGatewayKind == null ? 0 : paymentGatewayKind.hashCode())) * 31;
        String str2 = this.lastCardNumbers;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiryMonth;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiryYear;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Card card = this.stripeCard;
        int hashCode7 = (hashCode6 + (card == null ? 0 : card.hashCode())) * 31;
        com.stripe.android.model.PaymentMethod paymentMethod = this.stripePaymentMethod;
        int hashCode8 = (hashCode7 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str5 = this.paypalEmail;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.paymentMethodVersion;
        return ((hashCode9 + (num != null ? num.hashCode() : 0)) * 31) + this.methodType.hashCode();
    }

    public final boolean isAdyen() {
        return this.gatewayKind == PaymentGatewayKind.ADYEN;
    }

    public final boolean isEmpty() {
        return this.stripeCard == null && this.stripePaymentMethod == null && this.paypalEmail == null && this.gatewayKind != PaymentGatewayKind.ADYEN;
    }

    public final boolean isGooglePay() {
        Wallet wallet;
        Card card = this.stripeCard;
        if (card == null || !BirdPaymentKt.isGooglePay(card)) {
            com.stripe.android.model.PaymentMethod paymentMethod = this.stripePaymentMethod;
            if (paymentMethod != null) {
                PaymentMethod.Card card2 = paymentMethod.card;
                if (card2 != null) {
                    wallet = card2.wallet;
                } else {
                    wallet = null;
                }
                if (wallet instanceof Wallet.GooglePayWallet) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isPaypal() {
        return this.paypalEmail != null || this.gatewayKind == PaymentGatewayKind.BRAINTREE;
    }

    public final boolean isStripeCard() {
        return this.stripeCard != null;
    }

    public final boolean isStripePaymentMethod() {
        return this.stripePaymentMethod != null;
    }

    public String toString() {
        CardBrand brand;
        String code;
        if (isGooglePay()) {
            return "google_pay";
        }
        if (isPaypal()) {
            return "pay_pal";
        }
        if (isStripeCard()) {
            Card card = this.stripeCard;
            if (card == null || (brand = card.getBrand()) == null || (code = brand.getCode()) == null) {
                return "credit_card";
            }
            return code;
        }
        return "none";
    }

    public final String vendor() {
        if (!isStripeCard() && !isStripePaymentMethod() && !isGooglePay()) {
            if (isPaypal()) {
                return "braintree";
            }
            return null;
        }
        return "stripe";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BirdPayment(String str, String str2, boolean z, PaymentGatewayKind paymentGatewayKind, String str3, String str4, String str5, Card card, com.stripe.android.model.PaymentMethod paymentMethod, String str6, Integer num, co.bird.android.model.constant.PaymentMethod paymentMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : paymentGatewayKind, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : card, (i & 256) != 0 ? null : paymentMethod, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num, paymentMethod2);
        String str7;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
        }
    }
}
