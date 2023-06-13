package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "ErrorJsonParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSetupIntentJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntentJsonParser.kt\ncom/stripe/android/model/parsers/SetupIntentJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1549#2:110\n1620#2,3:111\n*S KotlinDebug\n*F\n+ 1 SetupIntentJsonParser.kt\ncom/stripe/android/model/parsers/SetupIntentJsonParser\n*L\n31#1:110\n31#1:111,3\n*E\n"})
/* loaded from: classes7.dex */
public final class SetupIntentJsonParser implements ModelJsonParser<SetupIntent> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CANCELLATION_REASON = "cancellation_reason";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_COUNTRY_CODE = "country_code";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LAST_SETUP_ERROR = "last_setup_error";
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
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    @Deprecated
    private static final String FIELD_USAGE = "usage";
    @Deprecated
    private static final String VALUE_SETUP_INTENT = "setup_intent";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$Companion;", "", "()V", "FIELD_CANCELLATION_REASON", "", "FIELD_CLIENT_SECRET", "FIELD_COUNTRY_CODE", "FIELD_CREATED", "FIELD_DESCRIPTION", "FIELD_ID", "FIELD_LAST_SETUP_ERROR", "FIELD_LINK_FUNDING_SOURCES", "FIELD_LIVEMODE", "FIELD_NEXT_ACTION", "FIELD_OBJECT", "FIELD_PAYMENT_METHOD", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_STATUS", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "FIELD_USAGE", "VALUE_SETUP_INTENT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent$Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ErrorJsonParser implements ModelJsonParser<SetupIntent.Error> {
        private static final Companion Companion = new Companion(null);
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

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SetupIntentJsonParser$ErrorJsonParser$Companion;", "", "()V", "FIELD_CODE", "", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_PAYMENT_METHOD", "FIELD_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SetupIntent.Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = StripeJsonUtils.optString(json, "code");
            String optString2 = StripeJsonUtils.optString(json, FIELD_DECLINE_CODE);
            String optString3 = StripeJsonUtils.optString(json, FIELD_DOC_URL);
            String optString4 = StripeJsonUtils.optString(json, FIELD_MESSAGE);
            String optString5 = StripeJsonUtils.optString(json, FIELD_PARAM);
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            return new SetupIntent.Error(optString, optString2, optString3, optString4, optString5, optJSONObject != null ? new PaymentMethodJsonParser().parse(optJSONObject) : null, SetupIntent.Error.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[LOOP:0: B:22:0x0069->B:24:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SetupIntent parse(JSONObject json) {
        String str;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(VALUE_SETUP_INTENT, StripeJsonUtils.optString(json, FIELD_OBJECT))) {
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            PaymentMethod parse = optJSONObject != null ? new PaymentMethodJsonParser().parse(optJSONObject) : null;
            String optString = StripeJsonUtils.optString(json, "payment_method");
            if (!(parse == null)) {
                optString = null;
            }
            if (optString == null) {
                if (parse != null) {
                    optString = parse.f75358id;
                } else {
                    str = null;
                    ModelJsonParser.Companion companion = ModelJsonParser.Companion;
                    List<String> jsonArrayToList = companion.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
                    List<String> jsonArrayToList2 = companion.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArrayToList2, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (String str2 : jsonArrayToList2) {
                        String lowerCase = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        arrayList.add(lowerCase);
                    }
                    String optString2 = StripeJsonUtils.optString(json, "id");
                    long optLong = json.optLong("created");
                    String optString3 = StripeJsonUtils.optString(json, "client_secret");
                    SetupIntent.CancellationReason fromCode$payments_core_release = SetupIntent.CancellationReason.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, FIELD_CANCELLATION_REASON));
                    String optString4 = StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE);
                    String optString5 = StripeJsonUtils.optString(json, FIELD_DESCRIPTION);
                    boolean optBoolean = json.optBoolean(FIELD_LIVEMODE);
                    List<String> jsonArrayToList3 = ModelJsonParser.Companion.jsonArrayToList(json.optJSONArray(FIELD_PAYMENT_METHOD_TYPES));
                    StripeIntent.Status fromCode$payments_core_release2 = StripeIntent.Status.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, FIELD_STATUS));
                    StripeIntent.Usage fromCode$payments_core_release3 = StripeIntent.Usage.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "usage"));
                    JSONObject optJSONObject2 = json.optJSONObject(FIELD_LAST_SETUP_ERROR);
                    SetupIntent.Error parse2 = optJSONObject2 == null ? new ErrorJsonParser().parse(optJSONObject2) : null;
                    JSONObject optJSONObject3 = json.optJSONObject(FIELD_NEXT_ACTION);
                    return new SetupIntent(optString2, fromCode$payments_core_release, optLong, optString4, optString3, optString5, optBoolean, parse, str, jsonArrayToList3, fromCode$payments_core_release2, fromCode$payments_core_release3, parse2, jsonArrayToList, arrayList, optJSONObject3 != null ? new NextActionDataParser().parse(optJSONObject3) : null);
                }
            }
            str = optString;
            ModelJsonParser.Companion companion2 = ModelJsonParser.Companion;
            List<String> jsonArrayToList4 = companion2.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
            List<String> jsonArrayToList22 = companion2.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArrayToList22, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            while (r1.hasNext()) {
            }
            String optString22 = StripeJsonUtils.optString(json, "id");
            long optLong2 = json.optLong("created");
            String optString32 = StripeJsonUtils.optString(json, "client_secret");
            SetupIntent.CancellationReason fromCode$payments_core_release4 = SetupIntent.CancellationReason.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, FIELD_CANCELLATION_REASON));
            String optString42 = StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE);
            String optString52 = StripeJsonUtils.optString(json, FIELD_DESCRIPTION);
            boolean optBoolean2 = json.optBoolean(FIELD_LIVEMODE);
            List<String> jsonArrayToList32 = ModelJsonParser.Companion.jsonArrayToList(json.optJSONArray(FIELD_PAYMENT_METHOD_TYPES));
            StripeIntent.Status fromCode$payments_core_release22 = StripeIntent.Status.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, FIELD_STATUS));
            StripeIntent.Usage fromCode$payments_core_release32 = StripeIntent.Usage.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "usage"));
            JSONObject optJSONObject22 = json.optJSONObject(FIELD_LAST_SETUP_ERROR);
            if (optJSONObject22 == null) {
            }
            JSONObject optJSONObject32 = json.optJSONObject(FIELD_NEXT_ACTION);
            return new SetupIntent(optString22, fromCode$payments_core_release4, optLong2, optString42, optString32, optString52, optBoolean2, parse, str, jsonArrayToList32, fromCode$payments_core_release22, fromCode$payments_core_release32, parse2, jsonArrayToList4, arrayList2, optJSONObject32 != null ? new NextActionDataParser().parse(optJSONObject32) : null);
        }
        return null;
    }
}
