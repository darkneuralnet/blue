package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a&\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¨\u0006\t"}, m28432d2 = {"toConfirmPaymentIntentShipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "toIdentifierMap", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "billingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddressDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressDetails.kt\ncom/stripe/android/paymentsheet/addresselement/AddressDetailsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressDetailsKt {
    public static final ConfirmPaymentIntentParams.Shipping toConfirmPaymentIntentShipping(AddressDetails addressDetails) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(addressDetails, "<this>");
        String name = addressDetails.getName();
        if (name == null) {
            name = "";
        }
        String str6 = name;
        Address.Builder builder = new Address.Builder();
        PaymentSheet.Address address = addressDetails.getAddress();
        String str7 = null;
        if (address != null) {
            str = address.getLine1();
        } else {
            str = null;
        }
        Address.Builder line1 = builder.setLine1(str);
        PaymentSheet.Address address2 = addressDetails.getAddress();
        if (address2 != null) {
            str2 = address2.getLine2();
        } else {
            str2 = null;
        }
        Address.Builder line2 = line1.setLine2(str2);
        PaymentSheet.Address address3 = addressDetails.getAddress();
        if (address3 != null) {
            str3 = address3.getCity();
        } else {
            str3 = null;
        }
        Address.Builder city = line2.setCity(str3);
        PaymentSheet.Address address4 = addressDetails.getAddress();
        if (address4 != null) {
            str4 = address4.getState();
        } else {
            str4 = null;
        }
        Address.Builder state = city.setState(str4);
        PaymentSheet.Address address5 = addressDetails.getAddress();
        if (address5 != null) {
            str5 = address5.getCountry();
        } else {
            str5 = null;
        }
        Address.Builder country = state.setCountry(str5);
        PaymentSheet.Address address6 = addressDetails.getAddress();
        if (address6 != null) {
            str7 = address6.getPostalCode();
        }
        return new ConfirmPaymentIntentParams.Shipping(country.setPostalCode(str7).build(), str6, null, addressDetails.getPhoneNumber(), null, 20, null);
    }

    public static final Map<IdentifierSpec, String> toIdentifierMap(AddressDetails addressDetails, PaymentSheet.BillingDetails billingDetails) {
        Map<IdentifierSpec, String> emptyMap;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Map mapOf;
        String str7;
        Map mapOf2;
        Map<IdentifierSpec, String> plus;
        Intrinsics.checkNotNullParameter(addressDetails, "<this>");
        if (billingDetails == null) {
            Pair[] pairArr = new Pair[8];
            IdentifierSpec.Companion companion = IdentifierSpec.Companion;
            boolean z = false;
            pairArr[0] = TuplesKt.m28425to(companion.getName(), addressDetails.getName());
            IdentifierSpec line1 = companion.getLine1();
            PaymentSheet.Address address = addressDetails.getAddress();
            Map map = null;
            if (address != null) {
                str = address.getLine1();
            } else {
                str = null;
            }
            pairArr[1] = TuplesKt.m28425to(line1, str);
            IdentifierSpec line2 = companion.getLine2();
            PaymentSheet.Address address2 = addressDetails.getAddress();
            if (address2 != null) {
                str2 = address2.getLine2();
            } else {
                str2 = null;
            }
            pairArr[2] = TuplesKt.m28425to(line2, str2);
            IdentifierSpec city = companion.getCity();
            PaymentSheet.Address address3 = addressDetails.getAddress();
            if (address3 != null) {
                str3 = address3.getCity();
            } else {
                str3 = null;
            }
            pairArr[3] = TuplesKt.m28425to(city, str3);
            IdentifierSpec state = companion.getState();
            PaymentSheet.Address address4 = addressDetails.getAddress();
            if (address4 != null) {
                str4 = address4.getState();
            } else {
                str4 = null;
            }
            pairArr[4] = TuplesKt.m28425to(state, str4);
            IdentifierSpec postalCode = companion.getPostalCode();
            PaymentSheet.Address address5 = addressDetails.getAddress();
            if (address5 != null) {
                str5 = address5.getPostalCode();
            } else {
                str5 = null;
            }
            pairArr[5] = TuplesKt.m28425to(postalCode, str5);
            IdentifierSpec country = companion.getCountry();
            PaymentSheet.Address address6 = addressDetails.getAddress();
            if (address6 != null) {
                str6 = address6.getCountry();
            } else {
                str6 = null;
            }
            pairArr[6] = TuplesKt.m28425to(country, str6);
            pairArr[7] = TuplesKt.m28425to(companion.getPhone(), addressDetails.getPhoneNumber());
            mapOf = MapsKt__MapsKt.mapOf(pairArr);
            IdentifierSpec sameAsShipping = companion.getSameAsShipping();
            Boolean isCheckboxSelected = addressDetails.isCheckboxSelected();
            if (isCheckboxSelected != null) {
                str7 = isCheckboxSelected.toString();
            } else {
                str7 = null;
            }
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(sameAsShipping, str7));
            if (addressDetails.isCheckboxSelected() != null) {
                z = true;
            }
            if (z) {
                map = mapOf2;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(mapOf, map);
            return plus;
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        return emptyMap;
    }

    public static /* synthetic */ Map toIdentifierMap$default(AddressDetails addressDetails, PaymentSheet.BillingDetails billingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            billingDetails = null;
        }
        return toIdentifierMap(addressDetails, billingDetails);
    }
}
