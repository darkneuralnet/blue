package com.stripe.android.uicore.elements;

import com.stripe.android.core.model.Country;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "country", "Lcom/stripe/android/core/model/Country;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PhoneNumberController$countryConfig$2 extends Lambda implements Function1<Country, String> {
    public static final PhoneNumberController$countryConfig$2 INSTANCE = new PhoneNumberController$countryConfig$2();

    public PhoneNumberController$countryConfig$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Country country) {
        List listOfNotNull;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(country, "country");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{CountryConfig.Companion.countryCodeToEmoji$stripe_ui_core_release(country.getCode().getValue()), country.getName(), PhoneNumberFormatter.Companion.prefixForCountry$stripe_ui_core_release(country.getCode().getValue())});
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOfNotNull, " ", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }
}
