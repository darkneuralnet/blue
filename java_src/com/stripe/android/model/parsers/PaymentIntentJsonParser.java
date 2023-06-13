package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.LuxePostConfirmActionRepository;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000b\f\rB\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent;", "luxePostConfirmActionRepository", "Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "(Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V", "getLuxePostConfirmActionRepository", "()Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ErrorJsonParser", "ShippingJsonParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentIntentJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentIntentJsonParser.kt\ncom/stripe/android/model/parsers/PaymentIntentJsonParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1#2:206\n1549#3:207\n1620#3,3:208\n*S KotlinDebug\n*F\n+ 1 PaymentIntentJsonParser.kt\ncom/stripe/android/model/parsers/PaymentIntentJsonParser\n*L\n91#1:207\n91#1:208,3\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentIntentJsonParser implements ModelJsonParser<PaymentIntent> {
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CANCELED_AT = "canceled_at";
    @Deprecated
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @Deprecated
    private static final String FIELD_CAPTURE_METHOD = "capture_method";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CONFIRMATION_METHOD = "confirmation_method";
    @Deprecated
    private static final String FIELD_COUNTRY_CODE = "country_code";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST_PAYMENT_ERROR = "last_payment_error";
    @Deprecated
    private static final String FIELD_LINK_FUNDING_SOURCES = "link_funding_sources";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_NEXT_ACTION = "next_action";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD = "payment_method";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @Deprecated
    private static final String FIELD_RECEIPT_EMAIL = "receipt_email";
    @Deprecated
    private static final String FIELD_SETUP_FUTURE_USAGE = "setup_future_usage";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    @Deprecated
    private static final String OBJECT_TYPE = "payment_intent";
    private final LuxePostConfirmActionRepository luxePostConfirmActionRepository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CANCELED_AT", "FIELD_CANCELLATION_REASON", "FIELD_CAPTURE_METHOD", "FIELD_CLIENT_SECRET", "FIELD_CONFIRMATION_METHOD", "FIELD_COUNTRY_CODE", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_PAYMENT_ERROR", "FIELD_LINK_FUNDING_SOURCES", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_OPTIONS", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_RECEIPT_EMAIL", "FIELD_SETUP_FUTURE_USAGE", "FIELD_SHIPPING", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "OBJECT_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ErrorJsonParser implements ModelJsonParser<PaymentIntent.Error> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CHARGE = "charge";
        @Deprecated
        private static final String FIELD_CODE = "code";
        @Deprecated
        private static final String FIELD_DECLINE_CODE = "decline_code";
        @Deprecated
        private static final String FIELD_DOC_URL = "doc_url";
        @Deprecated
        private static final String FIELD_MESSAGE = "message";
        @Deprecated
        private static final String FIELD_PARAM = "param";
        @Deprecated
        private static final String FIELD_PAYMENT_METHOD = "payment_method";
        @Deprecated
        private static final String FIELD_TYPE = "type";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ErrorJsonParser$Companion;", "", "()V", "FIELD_CHARGE", "", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentIntent.Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = StripeJsonUtils.optString(json, FIELD_CHARGE);
            String optString2 = StripeJsonUtils.optString(json, "code");
            String optString3 = StripeJsonUtils.optString(json, FIELD_DECLINE_CODE);
            String optString4 = StripeJsonUtils.optString(json, FIELD_DOC_URL);
            String optString5 = StripeJsonUtils.optString(json, FIELD_MESSAGE);
            String optString6 = StripeJsonUtils.optString(json, FIELD_PARAM);
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            return new PaymentIntent.Error(optString, optString2, optString3, optString4, optString5, optString6, optJSONObject != null ? new PaymentMethodJsonParser().parse(optJSONObject) : null, PaymentIntent.Error.Type.Companion.fromCode(StripeJsonUtils.optString(json, "type")));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ShippingJsonParser implements ModelJsonParser<PaymentIntent.Shipping> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_CARRIER = "carrier";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";
        @Deprecated
        private static final String FIELD_TRACKING_NUMBER = "tracking_number";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/parsers/PaymentIntentJsonParser$ShippingJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public PaymentIntent.Shipping parse(JSONObject json) {
            Address address;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject == null || (address = new AddressJsonParser().parse(optJSONObject)) == null) {
                address = new Address(null, null, null, null, null, null, 63, null);
            }
            return new PaymentIntent.Shipping(address, StripeJsonUtils.optString(json, FIELD_CARRIER), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"), StripeJsonUtils.optString(json, FIELD_TRACKING_NUMBER));
        }
    }

    public PaymentIntentJsonParser() {
        this(null, 1, null);
    }

    public final LuxePostConfirmActionRepository getLuxePostConfirmActionRepository() {
        return this.luxePostConfirmActionRepository;
    }

    public PaymentIntentJsonParser(LuxePostConfirmActionRepository luxePostConfirmActionRepository) {
        Intrinsics.checkNotNullParameter(luxePostConfirmActionRepository, "luxePostConfirmActionRepository");
        this.luxePostConfirmActionRepository = luxePostConfirmActionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c A[LOOP:0: B:53:0x0166->B:55:0x016c, LOOP_END] */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentIntent parse(JSONObject json) {
        String str;
        JSONObject optJSONObject;
        StripeIntent.NextActionData nextActionData;
        int collectionSizeOrDefault;
        StripeIntent.NextActionData parse;
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(OBJECT_TYPE, StripeJsonUtils.optString(json, FIELD_OBJECT))) {
            String optString = StripeJsonUtils.optString(json, "id");
            ModelJsonParser.Companion companion = ModelJsonParser.Companion;
            List<String> jsonArrayToList = companion.jsonArrayToList(json.optJSONArray(FIELD_PAYMENT_METHOD_TYPES));
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Long optLong = stripeJsonUtils.optLong(json, FIELD_AMOUNT);
            long optLong2 = json.optLong(FIELD_CANCELED_AT);
            PaymentIntent.CancellationReason fromCode = PaymentIntent.CancellationReason.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_CANCELLATION_REASON));
            PaymentIntent.CaptureMethod fromCode2 = PaymentIntent.CaptureMethod.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_CAPTURE_METHOD));
            String optString2 = StripeJsonUtils.optString(json, "client_secret");
            PaymentIntent.ConfirmationMethod fromCode3 = PaymentIntent.ConfirmationMethod.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_CONFIRMATION_METHOD));
            long optLong3 = json.optLong("created");
            String optCurrency = StripeJsonUtils.optCurrency(json, FIELD_CURRENCY);
            String optString3 = StripeJsonUtils.optString(json, FIELD_DESCRIPTION);
            boolean optBoolean = stripeJsonUtils.optBoolean(json, FIELD_LIVEMODE);
            JSONObject optJSONObject2 = json.optJSONObject("payment_method");
            PaymentMethod parse2 = optJSONObject2 != null ? new PaymentMethodJsonParser().parse(optJSONObject2) : null;
            String optString4 = StripeJsonUtils.optString(json, "payment_method");
            if (!(parse2 == null)) {
                optString4 = null;
            }
            if (optString4 == null) {
                if (parse2 != null) {
                    optString4 = parse2.f75358id;
                } else {
                    str = null;
                    String optString5 = StripeJsonUtils.optString(json, FIELD_RECEIPT_EMAIL);
                    StripeIntent.Status fromCode$payments_core_release = StripeIntent.Status.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, FIELD_STATUS));
                    JSONObject optJSONObject3 = json.optJSONObject(FIELD_PAYMENT_METHOD_OPTIONS);
                    String jSONObject = optJSONObject3 == null ? optJSONObject3.toString() : null;
                    StripeIntent.Usage fromCode$payments_core_release2 = StripeIntent.Usage.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "setup_future_usage"));
                    JSONObject optJSONObject4 = json.optJSONObject(FIELD_LAST_PAYMENT_ERROR);
                    PaymentIntent.Error parse3 = optJSONObject4 == null ? new ErrorJsonParser().parse(optJSONObject4) : null;
                    JSONObject optJSONObject5 = json.optJSONObject(FIELD_SHIPPING);
                    PaymentIntent.Shipping parse4 = optJSONObject5 == null ? new ShippingJsonParser().parse(optJSONObject5) : null;
                    optJSONObject = json.optJSONObject(FIELD_NEXT_ACTION);
                    if (optJSONObject == null) {
                        LuxePostConfirmActionRepository.Result action$payments_core_release = this.luxePostConfirmActionRepository.getAction$payments_core_release(parse2 != null ? parse2.code : null, fromCode$payments_core_release, json);
                        if (action$payments_core_release instanceof LuxePostConfirmActionRepository.Result.Action) {
                            parse = ((LuxePostConfirmActionRepository.Result.Action) action$payments_core_release).getPostConfirmAction();
                        } else if (action$payments_core_release instanceof LuxePostConfirmActionRepository.Result.NoAction) {
                            parse = null;
                        } else if (!(action$payments_core_release instanceof LuxePostConfirmActionRepository.Result.NotSupported)) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            parse = new NextActionDataParser().parse(optJSONObject);
                        }
                        nextActionData = parse;
                    } else {
                        nextActionData = null;
                    }
                    List<String> jsonArrayToList2 = companion.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
                    List<String> jsonArrayToList3 = companion.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArrayToList3, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (String str2 : jsonArrayToList3) {
                        String lowerCase = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        arrayList.add(lowerCase);
                    }
                    return new PaymentIntent(optString, jsonArrayToList, optLong, optLong2, fromCode, fromCode2, optString2, fromCode3, StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE), optLong3, optCurrency, optString3, optBoolean, parse2, str, optString5, fromCode$payments_core_release, fromCode$payments_core_release2, parse3, parse4, jsonArrayToList2, arrayList, nextActionData, jSONObject);
                }
            }
            str = optString4;
            String optString52 = StripeJsonUtils.optString(json, FIELD_RECEIPT_EMAIL);
            StripeIntent.Status fromCode$payments_core_release3 = StripeIntent.Status.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, FIELD_STATUS));
            JSONObject optJSONObject32 = json.optJSONObject(FIELD_PAYMENT_METHOD_OPTIONS);
            if (optJSONObject32 == null) {
            }
            StripeIntent.Usage fromCode$payments_core_release22 = StripeIntent.Usage.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "setup_future_usage"));
            JSONObject optJSONObject42 = json.optJSONObject(FIELD_LAST_PAYMENT_ERROR);
            if (optJSONObject42 == null) {
            }
            JSONObject optJSONObject52 = json.optJSONObject(FIELD_SHIPPING);
            if (optJSONObject52 == null) {
            }
            optJSONObject = json.optJSONObject(FIELD_NEXT_ACTION);
            if (optJSONObject == null) {
            }
            List<String> jsonArrayToList22 = companion.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
            List<String> jsonArrayToList32 = companion.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArrayToList32, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            while (r1.hasNext()) {
            }
            return new PaymentIntent(optString, jsonArrayToList, optLong, optLong2, fromCode, fromCode2, optString2, fromCode3, StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE), optLong3, optCurrency, optString3, optBoolean, parse2, str, optString52, fromCode$payments_core_release3, fromCode$payments_core_release22, parse3, parse4, jsonArrayToList22, arrayList2, nextActionData, jSONObject);
        }
        return null;
    }

    public /* synthetic */ PaymentIntentJsonParser(LuxePostConfirmActionRepository luxePostConfirmActionRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LuxePostConfirmActionRepository.Companion.getInstance() : luxePostConfirmActionRepository);
    }
}
