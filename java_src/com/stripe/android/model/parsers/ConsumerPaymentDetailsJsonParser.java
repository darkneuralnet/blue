package com.stripe.android.model.parsers;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.CvcCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "()V", "cardBrandFix", "", "original", "parse", "json", "Lorg/json/JSONObject;", "parseBillingAddress", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "parsePaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nConsumerPaymentDetailsJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerPaymentDetailsJsonParser.kt\ncom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n1603#2,9:107\n1855#2:116\n1856#2:118\n1612#2:119\n1#3:117\n1#3:120\n*S KotlinDebug\n*F\n+ 1 ConsumerPaymentDetailsJsonParser.kt\ncom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser\n*L\n17#1:103\n17#1:104,3\n18#1:107,9\n18#1:116\n18#1:118\n18#1:119\n18#1:117\n*E\n"})
/* loaded from: classes7.dex */
public final class ConsumerPaymentDetailsJsonParser implements ModelJsonParser<ConsumerPaymentDetails> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ADDRESS_COUNTRY_CODE = "country_code";
    @Deprecated
    private static final String FIELD_ADDRESS_POSTAL_CODE = "postal_code";
    @Deprecated
    private static final String FIELD_BANK_ACCOUNT_BANK_ICON_CODE = "bank_icon_code";
    @Deprecated
    private static final String FIELD_BANK_ACCOUNT_BANK_NAME = "bank_name";
    @Deprecated
    private static final String FIELD_BANK_ACCOUNT_DETAILS = "bank_account_details";
    @Deprecated
    private static final String FIELD_BANK_ACCOUNT_LAST_4 = "last4";
    @Deprecated
    private static final String FIELD_BILLING_ADDRESS = "billing_address";
    @Deprecated
    private static final String FIELD_CARD_BRAND = "brand";
    @Deprecated
    private static final String FIELD_CARD_CHECKS = "checks";
    @Deprecated
    private static final String FIELD_CARD_CVC_CHECK = "cvc_check";
    @Deprecated
    private static final String FIELD_CARD_DETAILS = "card_details";
    @Deprecated
    private static final String FIELD_CARD_EXPIRY_MONTH = "exp_month";
    @Deprecated
    private static final String FIELD_CARD_EXPIRY_YEAR = "exp_year";
    @Deprecated
    private static final String FIELD_CARD_LAST_4 = "last4";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_IS_DEFAULT = "is_default";
    @Deprecated
    private static final String FIELD_PAYMENT_DETAILS = "redacted_payment_details";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser$Companion;", "", "()V", "FIELD_ADDRESS_COUNTRY_CODE", "", "FIELD_ADDRESS_POSTAL_CODE", "FIELD_BANK_ACCOUNT_BANK_ICON_CODE", "FIELD_BANK_ACCOUNT_BANK_NAME", "FIELD_BANK_ACCOUNT_DETAILS", "FIELD_BANK_ACCOUNT_LAST_4", "FIELD_BILLING_ADDRESS", "FIELD_CARD_BRAND", "FIELD_CARD_CHECKS", "FIELD_CARD_CVC_CHECK", "FIELD_CARD_DETAILS", "FIELD_CARD_EXPIRY_MONTH", "FIELD_CARD_EXPIRY_YEAR", "FIELD_CARD_LAST_4", "FIELD_ID", "FIELD_IS_DEFAULT", "FIELD_PAYMENT_DETAILS", "FIELD_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final String cardBrandFix(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (Intrinsics.areEqual(lowerCase, "american_express")) {
            return "amex";
        }
        if (Intrinsics.areEqual(lowerCase, "diners_club")) {
            return "diners";
        }
        return lowerCase;
    }

    private final ConsumerPaymentDetails.BillingAddress parseBillingAddress(JSONObject jSONObject) {
        CountryCode countryCode;
        JSONObject jSONObject2 = jSONObject.getJSONObject(FIELD_BILLING_ADDRESS);
        String optString = StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_COUNTRY_CODE);
        if (optString != null) {
            countryCode = new CountryCode(optString);
        } else {
            countryCode = null;
        }
        return new ConsumerPaymentDetails.BillingAddress(countryCode, StripeJsonUtils.optString(jSONObject2, FIELD_ADDRESS_POSTAL_CODE));
    }

    private final ConsumerPaymentDetails.PaymentDetails parsePaymentDetails(JSONObject jSONObject) {
        String optString = StripeJsonUtils.optString(jSONObject, "type");
        if (optString == null) {
            return null;
        }
        String lowerCase = optString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (Intrinsics.areEqual(lowerCase, "card")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(FIELD_CARD_DETAILS);
            JSONObject jSONObject3 = jSONObject2.getJSONObject(FIELD_CARD_CHECKS);
            String string = jSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(FIELD_ID)");
            boolean z = jSONObject.getBoolean(FIELD_IS_DEFAULT);
            int i = jSONObject2.getInt(FIELD_CARD_EXPIRY_YEAR);
            int i2 = jSONObject2.getInt(FIELD_CARD_EXPIRY_MONTH);
            CardBrand.Companion companion = CardBrand.Companion;
            String string2 = jSONObject2.getString("brand");
            Intrinsics.checkNotNullExpressionValue(string2, "cardDetails.getString(FIELD_CARD_BRAND)");
            CardBrand fromCode = companion.fromCode(cardBrandFix(string2));
            String string3 = jSONObject2.getString("last4");
            Intrinsics.checkNotNullExpressionValue(string3, "cardDetails.getString(FIELD_CARD_LAST_4)");
            return new ConsumerPaymentDetails.Card(string, z, i, i2, fromCode, string3, CvcCheck.Companion.fromCode(jSONObject3.getString(FIELD_CARD_CVC_CHECK)), parseBillingAddress(jSONObject));
        } else if (!Intrinsics.areEqual(lowerCase, ConsumerPaymentDetails.BankAccount.type)) {
            return null;
        } else {
            JSONObject jSONObject4 = jSONObject.getJSONObject(FIELD_BANK_ACCOUNT_DETAILS);
            String string4 = jSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string4, "json.getString(FIELD_ID)");
            boolean z2 = jSONObject.getBoolean(FIELD_IS_DEFAULT);
            String optString2 = StripeJsonUtils.optString(jSONObject4, FIELD_BANK_ACCOUNT_BANK_ICON_CODE);
            String string5 = jSONObject4.getString(FIELD_BANK_ACCOUNT_BANK_NAME);
            Intrinsics.checkNotNullExpressionValue(string5, "bankAccountDetails.getSt…D_BANK_ACCOUNT_BANK_NAME)");
            String string6 = jSONObject4.getString("last4");
            Intrinsics.checkNotNullExpressionValue(string6, "bankAccountDetails.getSt…IELD_BANK_ACCOUNT_LAST_4)");
            return new ConsumerPaymentDetails.BankAccount(string4, z2, optString2, string5, string6);
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerPaymentDetails parse(JSONObject json) {
        List emptyList;
        ConsumerPaymentDetails.PaymentDetails parsePaymentDetails;
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray optJSONArray = json.optJSONArray(FIELD_PAYMENT_DETAILS);
        if (optJSONArray != null) {
            until = RangesKt___RangesKt.until(0, optJSONArray.length());
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList<JSONObject> arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((IntIterator) it).nextInt()));
            }
            emptyList = new ArrayList();
            for (JSONObject it2 : arrayList) {
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                ConsumerPaymentDetails.PaymentDetails parsePaymentDetails2 = parsePaymentDetails(it2);
                if (parsePaymentDetails2 != null) {
                    emptyList.add(parsePaymentDetails2);
                }
            }
        } else {
            JSONObject optJSONObject = json.optJSONObject(FIELD_PAYMENT_DETAILS);
            emptyList = (optJSONObject == null || (parsePaymentDetails = parsePaymentDetails(optJSONObject)) == null) ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(parsePaymentDetails);
        }
        return new ConsumerPaymentDetails(emptyList);
    }
}
