package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.model.Address;
import com.stripe.android.paymentsheet.p047ui.BillingAddressView;
import com.stripe.android.view.PostalCodeValidator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "newCountryCode", "Lcom/stripe/android/core/model/CountryCode;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView$newCountryCodeCallback$1 */
/* loaded from: classes7.dex */
public final class BillingAddressView$newCountryCodeCallback$1 extends Lambda implements Function1<CountryCode, Unit> {
    final /* synthetic */ BillingAddressView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingAddressView$newCountryCodeCallback$1(BillingAddressView billingAddressView) {
        super(1);
        this.this$0 = billingAddressView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CountryCode countryCode) {
        invoke2(countryCode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CountryCode newCountryCode) {
        C49882uX2 c49882uX2;
        Address createAddress;
        PostalCodeValidator postalCodeValidator;
        String value;
        Locale locale;
        Intrinsics.checkNotNullParameter(newCountryCode, "newCountryCode");
        this.this$0.updateStateView(newCountryCode);
        this.this$0.updatePostalCodeView(newCountryCode);
        c49882uX2 = this.this$0._address;
        createAddress = this.this$0.createAddress();
        c49882uX2.setValue(createAddress);
        postalCodeValidator = this.this$0.postalCodeValidator;
        BillingAddressView billingAddressView = this.this$0;
        value = billingAddressView.getValue(billingAddressView.getPostalCodeView$paymentsheet_release());
        if (value == null) {
            value = "";
        }
        boolean isValid = postalCodeValidator.isValid(value, newCountryCode.getValue());
        BillingAddressView billingAddressView2 = this.this$0;
        BillingAddressView.PostalCodeViewListener postalCodeViewListener$paymentsheet_release = billingAddressView2.getPostalCodeViewListener$paymentsheet_release();
        if (postalCodeViewListener$paymentsheet_release != null) {
            CountryUtils countryUtils = CountryUtils.INSTANCE;
            locale = billingAddressView2.getLocale();
            postalCodeViewListener$paymentsheet_release.onCountryChanged(countryUtils.getCountryByCode(newCountryCode, locale), isValid);
        }
        billingAddressView2.getPostalCodeView$paymentsheet_release().setShouldShowError(!isValid);
    }
}
