package com.stripe.android.paymentsheet.paymentdatacollection;

import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.p049ui.core.forms.ConvertToFormValuesMapKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, m28432d2 = {"getInitialValuesMap", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FormArgumentsKt {
    public static final Map<IdentifierSpec, String> getInitialValuesMap(FormArguments formArguments) {
        Map<IdentifierSpec, String> emptyMap;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Map mapOf;
        Map<IdentifierSpec, String> plus;
        PaymentSheet.Address address;
        PaymentSheet.Address address2;
        PaymentSheet.Address address3;
        PaymentSheet.Address address4;
        PaymentSheet.Address address5;
        PaymentSheet.Address address6;
        Intrinsics.checkNotNullParameter(formArguments, "<this>");
        PaymentMethodCreateParams initialPaymentMethodCreateParams = formArguments.getInitialPaymentMethodCreateParams();
        if (initialPaymentMethodCreateParams == null || (emptyMap = ConvertToFormValuesMapKt.convertToFormValuesMap(initialPaymentMethodCreateParams.toParamMap())) == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        Pair[] pairArr = new Pair[9];
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        IdentifierSpec name = companion.getName();
        PaymentSheet.BillingDetails billingDetails = formArguments.getBillingDetails();
        String str9 = null;
        if (billingDetails != null) {
            str = billingDetails.getName();
        } else {
            str = null;
        }
        pairArr[0] = TuplesKt.m28425to(name, str);
        IdentifierSpec email = companion.getEmail();
        PaymentSheet.BillingDetails billingDetails2 = formArguments.getBillingDetails();
        if (billingDetails2 != null) {
            str2 = billingDetails2.getEmail();
        } else {
            str2 = null;
        }
        pairArr[1] = TuplesKt.m28425to(email, str2);
        IdentifierSpec phone = companion.getPhone();
        PaymentSheet.BillingDetails billingDetails3 = formArguments.getBillingDetails();
        if (billingDetails3 != null) {
            str3 = billingDetails3.getPhone();
        } else {
            str3 = null;
        }
        pairArr[2] = TuplesKt.m28425to(phone, str3);
        IdentifierSpec line1 = companion.getLine1();
        PaymentSheet.BillingDetails billingDetails4 = formArguments.getBillingDetails();
        if (billingDetails4 != null && (address6 = billingDetails4.getAddress()) != null) {
            str4 = address6.getLine1();
        } else {
            str4 = null;
        }
        pairArr[3] = TuplesKt.m28425to(line1, str4);
        IdentifierSpec line2 = companion.getLine2();
        PaymentSheet.BillingDetails billingDetails5 = formArguments.getBillingDetails();
        if (billingDetails5 != null && (address5 = billingDetails5.getAddress()) != null) {
            str5 = address5.getLine2();
        } else {
            str5 = null;
        }
        pairArr[4] = TuplesKt.m28425to(line2, str5);
        IdentifierSpec city = companion.getCity();
        PaymentSheet.BillingDetails billingDetails6 = formArguments.getBillingDetails();
        if (billingDetails6 != null && (address4 = billingDetails6.getAddress()) != null) {
            str6 = address4.getCity();
        } else {
            str6 = null;
        }
        pairArr[5] = TuplesKt.m28425to(city, str6);
        IdentifierSpec state = companion.getState();
        PaymentSheet.BillingDetails billingDetails7 = formArguments.getBillingDetails();
        if (billingDetails7 != null && (address3 = billingDetails7.getAddress()) != null) {
            str7 = address3.getState();
        } else {
            str7 = null;
        }
        pairArr[6] = TuplesKt.m28425to(state, str7);
        IdentifierSpec country = companion.getCountry();
        PaymentSheet.BillingDetails billingDetails8 = formArguments.getBillingDetails();
        if (billingDetails8 != null && (address2 = billingDetails8.getAddress()) != null) {
            str8 = address2.getCountry();
        } else {
            str8 = null;
        }
        pairArr[7] = TuplesKt.m28425to(country, str8);
        IdentifierSpec postalCode = companion.getPostalCode();
        PaymentSheet.BillingDetails billingDetails9 = formArguments.getBillingDetails();
        if (billingDetails9 != null && (address = billingDetails9.getAddress()) != null) {
            str9 = address.getPostalCode();
        }
        pairArr[8] = TuplesKt.m28425to(postalCode, str9);
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        plus = MapsKt__MapsKt.plus(mapOf, emptyMap);
        return plus;
    }
}
