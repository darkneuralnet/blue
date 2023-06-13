package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.wallets.Wallet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AuBecsDebitJsonParser", "BacsDebitJsonParser", "BillingDetails", "CardJsonParser", "Companion", "FpxJsonParser", "IdealJsonParser", "NetbankingJsonParser", "SepaDebitJsonParser", "SofortJsonParser", "USBankAccountJsonParser", "UpiJsonParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodJsonParser implements ModelJsonParser<PaymentMethod> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_BILLING_DETAILS = "billing_details";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CUSTOMER = "customer";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AuBecsDebitJsonParser implements ModelJsonParser<PaymentMethod.AuBecsDebit> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BSB_NUMBER = "bsb_number";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$AuBecsDebitJsonParser$Companion;", "", "()V", "FIELD_BSB_NUMBER", "", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.AuBecsDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.AuBecsDebit(StripeJsonUtils.optString(json, FIELD_BSB_NUMBER), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BacsDebitJsonParser implements ModelJsonParser<PaymentMethod.BacsDebit> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_SORT_CODE = "sort_code";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BacsDebitJsonParser$Companion;", "", "()V", "FIELD_FINGERPRINT", "", "FIELD_LAST4", "FIELD_SORT_CODE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BacsDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.BacsDebit(StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4), StripeJsonUtils.optString(json, FIELD_SORT_CODE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BillingDetails implements ModelJsonParser<PaymentMethod.BillingDetails> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_EMAIL = "email";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$BillingDetails$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.BillingDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            return new PaymentMethod.BillingDetails(optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null, StripeJsonUtils.optString(json, "email"), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card;", "()V", "parse", "json", "Lorg/json/JSONObject;", "ChecksJsonParser", "Companion", "NetworksJsonParser", "ThreeDSecureUsageJsonParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CardJsonParser implements ModelJsonParser<PaymentMethod.Card> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BRAND = "brand";
        @Deprecated
        private static final String FIELD_CHECKS = "checks";
        @Deprecated
        private static final String FIELD_COUNTRY = "country";
        @Deprecated
        private static final String FIELD_EXP_MONTH = "exp_month";
        @Deprecated
        private static final String FIELD_EXP_YEAR = "exp_year";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_FUNDING = "funding";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_NETWORKS = "networks";
        @Deprecated
        private static final String FIELD_THREE_D_SECURE_USAGE = "three_d_secure_usage";
        @Deprecated
        private static final String FIELD_WALLET = "wallet";

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ChecksJsonParser implements ModelJsonParser<PaymentMethod.Card.Checks> {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
            @Deprecated
            private static final String FIELD_ADDRESS_POSTAL_CODE_CHECK = "address_postal_code_check";
            @Deprecated
            private static final String FIELD_CVC_CHECK = "cvc_check";

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ChecksJsonParser$Companion;", "", "()V", "FIELD_ADDRESS_LINE1_CHECK", "", "FIELD_ADDRESS_POSTAL_CODE_CHECK", "FIELD_CVC_CHECK", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Checks parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                return new PaymentMethod.Card.Checks(StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK), StripeJsonUtils.optString(json, FIELD_ADDRESS_POSTAL_CODE_CHECK), StripeJsonUtils.optString(json, FIELD_CVC_CHECK));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$Companion;", "", "()V", "FIELD_BRAND", "", "FIELD_CHECKS", "FIELD_COUNTRY", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_LAST4", "FIELD_NETWORKS", "FIELD_THREE_D_SECURE_USAGE", "FIELD_WALLET", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentMethodJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodJsonParser.kt\ncom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1549#2:382\n1620#2,3:383\n*S KotlinDebug\n*F\n+ 1 PaymentMethodJsonParser.kt\ncom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser\n*L\n181#1:382\n181#1:383,3\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class NetworksJsonParser implements ModelJsonParser<PaymentMethod.Card.Networks> {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String FIELD_AVAIABLE = "available";
            @Deprecated
            private static final String FIELD_PREFERRED = "preferred";
            @Deprecated
            private static final String FIELD_SELECTION_MANDATORY = "selection_mandatory";

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$NetworksJsonParser$Companion;", "", "()V", "FIELD_AVAIABLE", "", "FIELD_PREFERRED", "FIELD_SELECTION_MANDATORY", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.Networks parse(JSONObject json) {
                int collectionSizeOrDefault;
                Set set;
                Intrinsics.checkNotNullParameter(json, "json");
                List jsonArrayToList = StripeJsonUtils.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_AVAIABLE));
                if (jsonArrayToList == null) {
                    jsonArrayToList = CollectionsKt__CollectionsKt.emptyList();
                }
                List<Object> list = jsonArrayToList;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Object obj : list) {
                    arrayList.add(obj.toString());
                }
                set = CollectionsKt___CollectionsKt.toSet(arrayList);
                return new PaymentMethod.Card.Networks(set, StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_SELECTION_MANDATORY), StripeJsonUtils.optString(json, FIELD_PREFERRED));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ThreeDSecureUsageJsonParser implements ModelJsonParser<PaymentMethod.Card.ThreeDSecureUsage> {
            private static final Companion Companion = new Companion(null);
            @Deprecated
            private static final String FIELD_IS_SUPPORTED = "supported";

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$CardJsonParser$ThreeDSecureUsageJsonParser$Companion;", "", "()V", "FIELD_IS_SUPPORTED", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Override // com.stripe.android.core.model.parsers.ModelJsonParser
            public PaymentMethod.Card.ThreeDSecureUsage parse(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                return new PaymentMethod.Card.ThreeDSecureUsage(StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_IS_SUPPORTED));
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Card parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            CardBrand fromCode = CardBrand.Companion.fromCode(StripeJsonUtils.optString(json, "brand"));
            JSONObject optJSONObject = json.optJSONObject(FIELD_CHECKS);
            PaymentMethod.Card.Checks parse = optJSONObject != null ? new ChecksJsonParser().parse(optJSONObject) : null;
            String optString = StripeJsonUtils.optString(json, "country");
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Integer optInteger = stripeJsonUtils.optInteger(json, FIELD_EXP_MONTH);
            Integer optInteger2 = stripeJsonUtils.optInteger(json, FIELD_EXP_YEAR);
            String optString2 = StripeJsonUtils.optString(json, FIELD_FINGERPRINT);
            String optString3 = StripeJsonUtils.optString(json, FIELD_FUNDING);
            String optString4 = StripeJsonUtils.optString(json, FIELD_LAST4);
            JSONObject optJSONObject2 = json.optJSONObject(FIELD_THREE_D_SECURE_USAGE);
            PaymentMethod.Card.ThreeDSecureUsage parse2 = optJSONObject2 != null ? new ThreeDSecureUsageJsonParser().parse(optJSONObject2) : null;
            JSONObject optJSONObject3 = json.optJSONObject(FIELD_WALLET);
            Wallet parse3 = optJSONObject3 != null ? new WalletJsonParser().parse(optJSONObject3) : null;
            JSONObject optJSONObject4 = json.optJSONObject(FIELD_NETWORKS);
            return new PaymentMethod.Card(fromCode, parse, optString, optInteger, optInteger2, optString2, optString3, optString4, parse2, parse3, optJSONObject4 != null ? new NetworksJsonParser().parse(optJSONObject4) : null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$Companion;", "", "()V", "FIELD_BILLING_DETAILS", "", "FIELD_CREATED", "FIELD_CUSTOMER", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class FpxJsonParser implements ModelJsonParser<PaymentMethod.Fpx> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @Deprecated
        private static final String FIELD_BANK = "bank";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$FpxJsonParser$Companion;", "", "()V", "FIELD_ACCOUNT_HOLDER_TYPE", "", "FIELD_BANK", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Fpx parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Fpx(StripeJsonUtils.optString(json, FIELD_BANK), StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_TYPE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class IdealJsonParser implements ModelJsonParser<PaymentMethod.Ideal> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BANK = "bank";
        @Deprecated
        private static final String FIELD_BIC = "bic";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$IdealJsonParser$Companion;", "", "()V", "FIELD_BANK", "", "FIELD_BIC", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Ideal parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Ideal(StripeJsonUtils.optString(json, FIELD_BANK), StripeJsonUtils.optString(json, FIELD_BIC));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class NetbankingJsonParser implements ModelJsonParser<PaymentMethod.Netbanking> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BANK = "bank";

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$NetbankingJsonParser$Companion;", "", "()V", "FIELD_BANK", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Netbanking parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Netbanking(StripeJsonUtils.optString(json, FIELD_BANK));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SepaDebitJsonParser implements ModelJsonParser<PaymentMethod.SepaDebit> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_BANK_CODE = "bank_code";
        @Deprecated
        private static final String FIELD_BRANCH_CODE = "branch_code";
        @Deprecated
        private static final String FIELD_COUNTRY = "country";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SepaDebitJsonParser$Companion;", "", "()V", "FIELD_BANK_CODE", "", "FIELD_BRANCH_CODE", "FIELD_COUNTRY", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.SepaDebit parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.SepaDebit(StripeJsonUtils.optString(json, FIELD_BANK_CODE), StripeJsonUtils.optString(json, FIELD_BRANCH_CODE), StripeJsonUtils.optString(json, "country"), StripeJsonUtils.optString(json, FIELD_FINGERPRINT), StripeJsonUtils.optString(json, FIELD_LAST4));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SofortJsonParser implements ModelJsonParser<PaymentMethod.Sofort> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_COUNTRY = "country";

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$SofortJsonParser$Companion;", "", "()V", "FIELD_COUNTRY", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Sofort parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Sofort(StripeJsonUtils.optString(json, "country"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentMethodJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodJsonParser.kt\ncom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1549#2:382\n1620#2,3:383\n*S KotlinDebug\n*F\n+ 1 PaymentMethodJsonParser.kt\ncom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser\n*L\n273#1:382\n273#1:383,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class USBankAccountJsonParser implements ModelJsonParser<PaymentMethod.USBankAccount> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @Deprecated
        private static final String FIELD_ACCOUNT_TYPE = "account_type";
        @Deprecated
        private static final String FIELD_BANK_NAME = "bank_name";
        @Deprecated
        private static final String FIELD_FINGERPRINT = "fingerprint";
        @Deprecated
        private static final String FIELD_LAST4 = "last4";
        @Deprecated
        private static final String FIELD_LINKED_ACCOUNT = "linked_account";
        @Deprecated
        private static final String FIELD_NETWORKS = "networks";
        @Deprecated
        private static final String FIELD_NETWORKS_PREFERRED = "preferred";
        @Deprecated
        private static final String FIELD_NETWORKS_SUPPORTED = "supported";
        @Deprecated
        private static final String FIELD_ROUTING_NUMBER = "routing_number";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$USBankAccountJsonParser$Companion;", "", "()V", "FIELD_ACCOUNT_HOLDER_TYPE", "", "FIELD_ACCOUNT_TYPE", "FIELD_BANK_NAME", "FIELD_FINGERPRINT", "FIELD_LAST4", "FIELD_LINKED_ACCOUNT", "FIELD_NETWORKS", "FIELD_NETWORKS_PREFERRED", "FIELD_NETWORKS_SUPPORTED", "FIELD_ROUTING_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.USBankAccount parse(JSONObject json) {
            PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(json, "json");
            PaymentMethod.USBankAccount.USBankAccountHolderType[] values = PaymentMethod.USBankAccount.USBankAccountHolderType.values();
            int length = values.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                uSBankNetworks = null;
                if (i2 >= length) {
                    uSBankAccountHolderType = null;
                    break;
                }
                uSBankAccountHolderType = values[i2];
                if (Intrinsics.areEqual(StripeJsonUtils.optString(json, FIELD_ACCOUNT_HOLDER_TYPE), uSBankAccountHolderType.getValue())) {
                    break;
                }
                i2++;
            }
            if (uSBankAccountHolderType == null) {
                uSBankAccountHolderType = PaymentMethod.USBankAccount.USBankAccountHolderType.UNKNOWN;
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType2 = uSBankAccountHolderType;
            PaymentMethod.USBankAccount.USBankAccountType[] values2 = PaymentMethod.USBankAccount.USBankAccountType.values();
            int length2 = values2.length;
            while (true) {
                if (i >= length2) {
                    uSBankAccountType = null;
                    break;
                }
                uSBankAccountType = values2[i];
                if (Intrinsics.areEqual(StripeJsonUtils.optString(json, FIELD_ACCOUNT_TYPE), uSBankAccountType.getValue())) {
                    break;
                }
                i++;
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType2 = uSBankAccountType == null ? PaymentMethod.USBankAccount.USBankAccountType.UNKNOWN : uSBankAccountType;
            String optString = StripeJsonUtils.optString(json, FIELD_BANK_NAME);
            String optString2 = StripeJsonUtils.optString(json, FIELD_FINGERPRINT);
            String optString3 = StripeJsonUtils.optString(json, FIELD_LAST4);
            String optString4 = StripeJsonUtils.optString(json, "linked_account");
            if (json.has(FIELD_NETWORKS)) {
                String optString5 = StripeJsonUtils.optString(json.optJSONObject(FIELD_NETWORKS), FIELD_NETWORKS_PREFERRED);
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                JSONObject optJSONObject = json.optJSONObject(FIELD_NETWORKS);
                List jsonArrayToList = stripeJsonUtils.jsonArrayToList(optJSONObject != null ? optJSONObject.getJSONArray(FIELD_NETWORKS_SUPPORTED) : null);
                if (jsonArrayToList == null) {
                    jsonArrayToList = CollectionsKt__CollectionsKt.emptyList();
                }
                List<Object> list = jsonArrayToList;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Object obj : list) {
                    arrayList.add(obj.toString());
                }
                uSBankNetworks = new PaymentMethod.USBankAccount.USBankNetworks(optString5, arrayList);
            }
            return new PaymentMethod.USBankAccount(uSBankAccountHolderType2, uSBankAccountType2, optString, optString2, optString3, optString4, uSBankNetworks, StripeJsonUtils.optString(json, FIELD_ROUTING_NUMBER));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class UpiJsonParser implements ModelJsonParser<PaymentMethod.Upi> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_VPA = "vpa";

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentMethodJsonParser$UpiJsonParser$Companion;", "", "()V", "FIELD_VPA", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentMethod.Upi parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new PaymentMethod.Upi(StripeJsonUtils.optString(json, FIELD_VPA));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.CardPresent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.Ideal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.Type.BacsDebit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentMethod.Type.Sofort.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentMethod.Type.Upi.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentMethod.Type.Netbanking.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentMethod parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String optString = StripeJsonUtils.optString(json, "type");
        PaymentMethod.Type fromCode = PaymentMethod.Type.Companion.fromCode(optString);
        PaymentMethod.Builder created = new PaymentMethod.Builder().setId(StripeJsonUtils.optString(json, "id")).setType(fromCode).setCode(optString).setCreated(StripeJsonUtils.INSTANCE.optLong(json, "created"));
        JSONObject optJSONObject = json.optJSONObject(FIELD_BILLING_DETAILS);
        PaymentMethod.Builder liveMode = created.setBillingDetails(optJSONObject != null ? new BillingDetails().parse(optJSONObject) : null).setCustomerId(StripeJsonUtils.optString(json, "customer")).setLiveMode(json.optBoolean(FIELD_LIVEMODE));
        switch (fromCode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromCode.ordinal()]) {
            case 1:
                JSONObject optJSONObject2 = json.optJSONObject(fromCode.code);
                liveMode.setCard(optJSONObject2 != null ? new CardJsonParser().parse(optJSONObject2) : null);
                break;
            case 2:
                liveMode.setCardPresent(PaymentMethod.CardPresent.Companion.getEMPTY$payments_core_release());
                break;
            case 3:
                JSONObject optJSONObject3 = json.optJSONObject(fromCode.code);
                liveMode.setIdeal(optJSONObject3 != null ? new IdealJsonParser().parse(optJSONObject3) : null);
                break;
            case 4:
                JSONObject optJSONObject4 = json.optJSONObject(fromCode.code);
                liveMode.setFpx(optJSONObject4 != null ? new FpxJsonParser().parse(optJSONObject4) : null);
                break;
            case 5:
                JSONObject optJSONObject5 = json.optJSONObject(fromCode.code);
                liveMode.setSepaDebit(optJSONObject5 != null ? new SepaDebitJsonParser().parse(optJSONObject5) : null);
                break;
            case 6:
                JSONObject optJSONObject6 = json.optJSONObject(fromCode.code);
                liveMode.setAuBecsDebit(optJSONObject6 != null ? new AuBecsDebitJsonParser().parse(optJSONObject6) : null);
                break;
            case 7:
                JSONObject optJSONObject7 = json.optJSONObject(fromCode.code);
                liveMode.setBacsDebit(optJSONObject7 != null ? new BacsDebitJsonParser().parse(optJSONObject7) : null);
                break;
            case 8:
                JSONObject optJSONObject8 = json.optJSONObject(fromCode.code);
                liveMode.setSofort(optJSONObject8 != null ? new SofortJsonParser().parse(optJSONObject8) : null);
                break;
            case 9:
                JSONObject optJSONObject9 = json.optJSONObject(fromCode.code);
                liveMode.setUpi(optJSONObject9 != null ? new UpiJsonParser().parse(optJSONObject9) : null);
                break;
            case 10:
                JSONObject optJSONObject10 = json.optJSONObject(fromCode.code);
                liveMode.setNetbanking(optJSONObject10 != null ? new NetbankingJsonParser().parse(optJSONObject10) : null);
                break;
            case 11:
                JSONObject optJSONObject11 = json.optJSONObject(fromCode.code);
                liveMode.setUSBankAccount(optJSONObject11 != null ? new USBankAccountJsonParser().parse(optJSONObject11) : null);
                break;
        }
        return liveMode.build();
    }
}
