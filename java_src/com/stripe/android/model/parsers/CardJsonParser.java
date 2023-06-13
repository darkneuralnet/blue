package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.TokenizationMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Card;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardJsonParser.kt\ncom/stripe/android/model/parsers/CardJsonParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
/* loaded from: classes7.dex */
public final class CardJsonParser implements ModelJsonParser<Card> {
    public static final Companion Companion = new Companion(null);
    private static final String FIELD_ADDRESS_CITY = "address_city";
    private static final String FIELD_ADDRESS_COUNTRY = "address_country";
    private static final String FIELD_ADDRESS_LINE1 = "address_line1";
    private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final String FIELD_ADDRESS_LINE2 = "address_line2";
    private static final String FIELD_ADDRESS_STATE = "address_state";
    private static final String FIELD_ADDRESS_ZIP = "address_zip";
    private static final String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final String FIELD_BRAND = "brand";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_CURRENCY = "currency";
    private static final String FIELD_CUSTOMER = "customer";
    private static final String FIELD_CVC_CHECK = "cvc_check";
    private static final String FIELD_EXP_MONTH = "exp_month";
    private static final String FIELD_EXP_YEAR = "exp_year";
    private static final String FIELD_FINGERPRINT = "fingerprint";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_ID = "id";
    private static final String FIELD_LAST4 = "last4";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_TOKENIZATION_METHOD = "tokenization_method";
    public static final String VALUE_CARD = "card";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/CardJsonParser$Companion;", "", "()V", "FIELD_ADDRESS_CITY", "", "FIELD_ADDRESS_COUNTRY", "FIELD_ADDRESS_LINE1", "FIELD_ADDRESS_LINE1_CHECK", "FIELD_ADDRESS_LINE2", "FIELD_ADDRESS_STATE", "FIELD_ADDRESS_ZIP", "FIELD_ADDRESS_ZIP_CHECK", "FIELD_BRAND", "FIELD_COUNTRY", "FIELD_CURRENCY", "FIELD_CUSTOMER", "FIELD_CVC_CHECK", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_ID", "FIELD_LAST4", "FIELD_NAME", "FIELD_OBJECT", "FIELD_TOKENIZATION_METHOD", "VALUE_CARD", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Card parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual("card", json.optString(FIELD_OBJECT))) {
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Integer optInteger = stripeJsonUtils.optInteger(json, FIELD_EXP_MONTH);
            Integer valueOf = Integer.valueOf(optInteger != null ? optInteger.intValue() : -1);
            int intValue = valueOf.intValue();
            Integer num = !(intValue < 1 || intValue > 12) ? valueOf : null;
            Integer optInteger2 = stripeJsonUtils.optInteger(json, FIELD_EXP_YEAR);
            Integer valueOf2 = Integer.valueOf(optInteger2 != null ? optInteger2.intValue() : -1);
            Integer num2 = !(valueOf2.intValue() < 0) ? valueOf2 : null;
            String optString = StripeJsonUtils.optString(json, FIELD_ADDRESS_CITY);
            String optString2 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1);
            String optString3 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK);
            String optString4 = StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE2);
            String optString5 = StripeJsonUtils.optString(json, FIELD_ADDRESS_COUNTRY);
            return new Card(num, num2, StripeJsonUtils.optString(json, "name"), optString2, optString3, optString4, optString, StripeJsonUtils.optString(json, FIELD_ADDRESS_STATE), StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP), StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP_CHECK), optString5, StripeJsonUtils.optString(json, FIELD_LAST4), Card.Companion.getCardBrand(StripeJsonUtils.optString(json, "brand")), CardFunding.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_FUNDING)), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), stripeJsonUtils.optCountryCode(json, "country"), StripeJsonUtils.optCurrency(json, FIELD_CURRENCY), StripeJsonUtils.optString(json, "customer"), StripeJsonUtils.optString(json, FIELD_CVC_CHECK), StripeJsonUtils.optString(json, "id"), TokenizationMethod.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_TOKENIZATION_METHOD)));
        }
        return null;
    }
}
