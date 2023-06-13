package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\u0016\u0010\u0007\u001a\u00020\b*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¨\u0006\f"}, m28432d2 = {"toElementsSessionParam", "Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "Lcom/stripe/android/model/StripeIntent$Usage;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "toElementsSessionParams", "Lcom/stripe/android/model/ElementsSessionParams;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ElementsSessionRepositoryKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentSheet.IntentConfiguration.SetupFutureUse.values().length];
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.OnSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.OffSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentSheet.IntentConfiguration.CaptureMethod.values().length];
            try {
                iArr2[PaymentSheet.IntentConfiguration.CaptureMethod.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PaymentSheet.IntentConfiguration.CaptureMethod.Manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final DeferredIntentParams.Mode toElementsSessionParam(PaymentSheet.IntentConfiguration.Mode mode) {
        if (mode instanceof PaymentSheet.IntentConfiguration.Mode.Payment) {
            PaymentSheet.IntentConfiguration.Mode.Payment payment = (PaymentSheet.IntentConfiguration.Mode.Payment) mode;
            return new DeferredIntentParams.Mode.Payment(payment.getAmount(), payment.getCurrency());
        } else if (mode instanceof PaymentSheet.IntentConfiguration.Mode.Setup) {
            return new DeferredIntentParams.Mode.Setup(((PaymentSheet.IntentConfiguration.Mode.Setup) mode).getCurrency());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final ElementsSessionParams toElementsSessionParams(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration) {
        StripeIntent.Usage usage;
        DeferredIntentParams.CaptureMethod captureMethod;
        String str;
        Set set;
        PaymentSheet.CustomerConfiguration customer;
        Intrinsics.checkNotNullParameter(initializationMode, "<this>");
        if (initializationMode instanceof PaymentSheet.InitializationMode.PaymentIntent) {
            return new ElementsSessionParams.PaymentIntentType(((PaymentSheet.InitializationMode.PaymentIntent) initializationMode).getClientSecret(), null, 2, null);
        }
        if (initializationMode instanceof PaymentSheet.InitializationMode.SetupIntent) {
            return new ElementsSessionParams.SetupIntentType(((PaymentSheet.InitializationMode.SetupIntent) initializationMode).getClientSecret(), null, 2, null);
        }
        if (initializationMode instanceof PaymentSheet.InitializationMode.DeferredIntent) {
            PaymentSheet.InitializationMode.DeferredIntent deferredIntent = (PaymentSheet.InitializationMode.DeferredIntent) initializationMode;
            DeferredIntentParams.Mode elementsSessionParam = toElementsSessionParam(deferredIntent.getIntentConfiguration().getMode());
            PaymentSheet.IntentConfiguration.SetupFutureUse setupFutureUse$paymentsheet_release = deferredIntent.getIntentConfiguration().getSetupFutureUse$paymentsheet_release();
            if (setupFutureUse$paymentsheet_release != null) {
                usage = toElementsSessionParam(setupFutureUse$paymentsheet_release);
            } else {
                usage = null;
            }
            PaymentSheet.IntentConfiguration.CaptureMethod captureMethod$paymentsheet_release = deferredIntent.getIntentConfiguration().getCaptureMethod$paymentsheet_release();
            if (captureMethod$paymentsheet_release != null) {
                captureMethod = toElementsSessionParam(captureMethod$paymentsheet_release);
            } else {
                captureMethod = null;
            }
            if (configuration != null && (customer = configuration.getCustomer()) != null) {
                str = customer.getId();
            } else {
                str = null;
            }
            set = CollectionsKt___CollectionsKt.toSet(deferredIntent.getIntentConfiguration().getPaymentMethodTypes());
            return new ElementsSessionParams.DeferredIntentType(null, new DeferredIntentParams(elementsSessionParam, usage, captureMethod, str, null, set, 16, null), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final StripeIntent.Usage toElementsSessionParam(PaymentSheet.IntentConfiguration.SetupFutureUse setupFutureUse) {
        int i = WhenMappings.$EnumSwitchMapping$0[setupFutureUse.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return StripeIntent.Usage.OffSession;
            }
            throw new NoWhenBranchMatchedException();
        }
        return StripeIntent.Usage.OnSession;
    }

    private static final DeferredIntentParams.CaptureMethod toElementsSessionParam(PaymentSheet.IntentConfiguration.CaptureMethod captureMethod) {
        int i = WhenMappings.$EnumSwitchMapping$1[captureMethod.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return DeferredIntentParams.CaptureMethod.Manual;
            }
            throw new NoWhenBranchMatchedException();
        }
        return DeferredIntentParams.CaptureMethod.Automatic;
    }
}
