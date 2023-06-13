package co.bird.android.model;

import co.bird.android.model.constant.PaymentGatewayKind;
import co.bird.android.model.constant.PaymentMethodDetails;
import com.stripe.android.model.Card;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.TokenizationMethod;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a&\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\u0002H\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\u0004¢\u0006\u0002\u0010\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r\u001a\f\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u000f¨\u0006\u0010"}, m28432d2 = {"isGooglePay", "", "Lcom/stripe/android/model/Card;", "isOneOf", "T", "items", "", "(Ljava/lang/Object;Ljava/util/List;)Z", "toBirdPayment", "Lco/bird/android/model/BirdPayment;", "Lco/bird/android/model/constant/PaymentMethodDetails;", "Lcom/stripe/android/model/PaymentMethod;", "methodType", "Lco/bird/android/model/constant/PaymentMethod;", "toBirdPaymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBirdPayment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayment.kt\nco/bird/android/model/BirdPaymentKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1747#2,3:104\n*S KotlinDebug\n*F\n+ 1 BirdPayment.kt\nco/bird/android/model/BirdPaymentKt\n*L\n58#1:104,3\n*E\n"})
/* loaded from: classes4.dex */
public final class BirdPaymentKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Bancontact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.PayPal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.Eps.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.Type.Giropay.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.Type.Ideal.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentMethod.Type.P24.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentMethod.Type.Sofort.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isGooglePay(Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        if (card.getTokenizationMethod() == TokenizationMethod.GooglePay) {
            return true;
        }
        return false;
    }

    public static final <T> boolean isOneOf(T t, List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List<? extends T> list = items;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (T t2 : list) {
            if (Intrinsics.areEqual(t2, t)) {
                return true;
            }
        }
        return false;
    }

    public static final BirdPayment toBirdPayment(PaymentMethodDetails paymentMethodDetails) {
        Intrinsics.checkNotNullParameter(paymentMethodDetails, "<this>");
        return new BirdPayment(paymentMethodDetails.getId(), paymentMethodDetails.getBrand(), paymentMethodDetails.getDefault(), paymentMethodDetails.getGatewayKind(), paymentMethodDetails.getLastCardNumbers(), paymentMethodDetails.getExpMonth(), paymentMethodDetails.getExpYear(), null, null, paymentMethodDetails.getEmail(), 3, paymentMethodDetails.getType(), 384, null);
    }

    public static final co.bird.android.model.constant.PaymentMethod toBirdPaymentMethodType(PaymentMethod.Type type) {
        int i;
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        switch (i) {
            case 1:
                return co.bird.android.model.constant.PaymentMethod.BANCONTACT;
            case 2:
                return co.bird.android.model.constant.PaymentMethod.CARD;
            case 3:
                return co.bird.android.model.constant.PaymentMethod.PAYPAL;
            case 4:
                return co.bird.android.model.constant.PaymentMethod.EPS;
            case 5:
                return co.bird.android.model.constant.PaymentMethod.FPX;
            case 6:
                return co.bird.android.model.constant.PaymentMethod.GIROPAY;
            case 7:
                return co.bird.android.model.constant.PaymentMethod.IDEAL;
            case 8:
                return co.bird.android.model.constant.PaymentMethod.P24;
            case 9:
                return co.bird.android.model.constant.PaymentMethod.SOFORT;
            default:
                return co.bird.android.model.constant.PaymentMethod.UNKNOWN;
        }
    }

    public static final BirdPayment toBirdPayment(PaymentMethod paymentMethod, co.bird.android.model.constant.PaymentMethod paymentMethod2) {
        co.bird.android.model.constant.PaymentMethod paymentMethod3;
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        String str = paymentMethod.f75358id;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        PaymentGatewayKind paymentGatewayKind = PaymentGatewayKind.STRIPE;
        PaymentMethod.Card card = paymentMethod.card;
        String str3 = card != null ? card.last4 : null;
        String valueOf = String.valueOf(card != null ? card.expiryMonth : null);
        PaymentMethod.Card card2 = paymentMethod.card;
        String valueOf2 = String.valueOf(card2 != null ? card2.expiryYear : null);
        if (paymentMethod2 == null) {
            PaymentMethod.Type type = paymentMethod.type;
            co.bird.android.model.constant.PaymentMethod birdPaymentMethodType = type != null ? toBirdPaymentMethodType(type) : null;
            if (birdPaymentMethodType == null) {
                birdPaymentMethodType = co.bird.android.model.constant.PaymentMethod.UNKNOWN;
            }
            paymentMethod3 = birdPaymentMethodType;
        } else {
            paymentMethod3 = paymentMethod2;
        }
        return new BirdPayment(str2, null, false, paymentGatewayKind, str3, valueOf, valueOf2, null, paymentMethod, null, null, paymentMethod3, 1670, null);
    }
}
