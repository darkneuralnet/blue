package com.stripe.android;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;", "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "clientSecret", "", "shipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V", "create", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nConfirmStripeIntentParamsFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmStripeIntentParamsFactory.kt\ncom/stripe/android/ConfirmPaymentIntentParamsFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes6.dex */
public final class ConfirmPaymentIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmPaymentIntentParams> {
    private final String clientSecret;
    private final ConfirmPaymentIntentParams.Shipping shipping;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentIntentParamsFactory(String clientSecret, ConfirmPaymentIntentParams.Shipping shipping) {
        super(null);
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.shipping = shipping;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmPaymentIntentParams create(PaymentMethod paymentMethod) {
        PaymentMethodOptionsParams card;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
        String str = paymentMethod.f75358id;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = this.clientSecret;
        PaymentMethod.Type type = paymentMethod.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        boolean z = true;
        if (i != 1) {
            card = i != 2 ? null : new PaymentMethodOptionsParams.USBankAccount(ConfirmPaymentIntentParams.SetupFutureUsage.OffSession);
        } else {
            card = new PaymentMethodOptionsParams.Card(null, null, ConfirmPaymentIntentParams.SetupFutureUsage.Blank, 3, null);
        }
        MandateDataParams mandateDataParams = new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT());
        PaymentMethod.Type type2 = paymentMethod.type;
        if (type2 == null || !type2.requiresMandate) {
            z = false;
        }
        if (!z) {
            mandateDataParams = null;
        }
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodId$default(companion, str2, str3, null, card, null, mandateDataParams, null, this.shipping, 84, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmPaymentIntentParams create(PaymentMethodCreateParams createParams, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        PaymentMethodOptionsParams card;
        PaymentMethodOptionsParams uSBankAccount;
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
        String str = this.clientSecret;
        String typeCode = createParams.getTypeCode();
        if (Intrinsics.areEqual(typeCode, PaymentMethod.Type.Card.code)) {
            uSBankAccount = new PaymentMethodOptionsParams.Card(null, null, setupFutureUsage, 3, null);
        } else if (Intrinsics.areEqual(typeCode, PaymentMethod.Type.USBankAccount.code)) {
            uSBankAccount = new PaymentMethodOptionsParams.USBankAccount(setupFutureUsage);
        } else {
            card = Intrinsics.areEqual(typeCode, PaymentMethod.Type.Link.code) ? null : new PaymentMethodOptionsParams.Card(null, null, null, 3, null);
            return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(companion, createParams, str, null, null, null, null, this.shipping, card, 60, null);
        }
        card = uSBankAccount;
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(companion, createParams, str, null, null, null, null, this.shipping, card, 60, null);
    }
}
