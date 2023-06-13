package com.stripe.android.p049ui.core.address;

import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0007¨\u0006\u0005"}, m28432d2 = {"toConfirmPaymentIntentShipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.address.AddressUtilKt */
/* loaded from: classes7.dex */
public final class AddressUtilKt {
    public static final ConfirmPaymentIntentParams.Shipping toConfirmPaymentIntentShipping(Map<IdentifierSpec, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        String str = map.get(companion.getName());
        if (str == null) {
            str = "";
        }
        return new ConfirmPaymentIntentParams.Shipping(new Address.Builder().setLine1(map.get(companion.getLine1())).setLine2(map.get(companion.getLine2())).setCity(map.get(companion.getCity())).setState(map.get(companion.getState())).setCountry(map.get(companion.getCountry())).setPostalCode(map.get(companion.getPostalCode())).build(), str, null, map.get(companion.getPhone()), null, 20, null);
    }
}
