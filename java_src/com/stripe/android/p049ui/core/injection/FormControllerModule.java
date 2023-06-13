package com.stripe.android.p049ui.core.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.IdentifierSpec;
import dagger.Module;
import dagger.Provides;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jj\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\u0018\b\u0001\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/ui/core/injection/FormControllerModule;", "", "()V", "provideTransformSpecToElements", "Lcom/stripe/android/ui/core/forms/TransformSpecToElements;", "addressRepository", "Lcom/stripe/android/uicore/address/AddressRepository;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "merchantName", "", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", NamedConstantsKt.SHIPPING_VALUES, "viewOnlyFields", "", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@Module
/* renamed from: com.stripe.android.ui.core.injection.FormControllerModule */
/* loaded from: classes7.dex */
public final class FormControllerModule {
    public static final int $stable = 0;
    public static final FormControllerModule INSTANCE = new FormControllerModule();

    private FormControllerModule() {
    }

    @Provides
    public final TransformSpecToElements provideTransformSpecToElements(AddressRepository addressRepository, Context context, String merchantName, StripeIntent stripeIntent, Map<IdentifierSpec, String> initialValues, Map<IdentifierSpec, String> map, Set<IdentifierSpec> viewOnlyFields) {
        PaymentIntent paymentIntent;
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(viewOnlyFields, "viewOnlyFields");
        if (stripeIntent instanceof PaymentIntent) {
            paymentIntent = (PaymentIntent) stripeIntent;
        } else {
            paymentIntent = null;
        }
        if (paymentIntent != null) {
            Long amount = paymentIntent.getAmount();
            String currency = paymentIntent.getCurrency();
            if (amount != null && currency != null) {
                new Amount(amount.longValue(), currency);
            }
        }
        return new TransformSpecToElements(addressRepository, initialValues, map, null, false, merchantName, context, viewOnlyFields);
    }
}
