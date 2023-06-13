package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0016JH\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ElementsSession;", "params", "Lcom/stripe/android/model/ElementsSessionParams;", "apiKey", "", "timeProvider", "Lkotlin/Function0;", "", "(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "parse", "json", "Lorg/json/JSONObject;", "parseStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "elementsSessionId", "paymentMethodPreference", "orderedPaymentMethodTypes", "Lorg/json/JSONArray;", "unactivatedPaymentMethodTypes", "", "linkFundingSources", "countryCode", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nElementsSessionJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementsSessionJsonParser.kt\ncom/stripe/android/model/parsers/ElementsSessionJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1549#2:139\n1620#2,3:140\n*S KotlinDebug\n*F\n+ 1 ElementsSessionJsonParser.kt\ncom/stripe/android/model/parsers/ElementsSessionJsonParser\n*L\n34#1:139\n34#1:140,3\n*E\n"})
/* loaded from: classes7.dex */
public final class ElementsSessionJsonParser implements ModelJsonParser<ElementsSession> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_COUNTRY_CODE = "country_code";
    @Deprecated
    private static final String FIELD_ELEMENTS_SESSION_ID = "session_id";
    @Deprecated
    private static final String FIELD_LINK_FUNDING_SOURCES = "link_funding_sources";
    @Deprecated
    private static final String FIELD_LINK_SETTINGS = "link_settings";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_ORDERED_PAYMENT_METHOD_TYPES = "ordered_payment_method_types";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_PREFERENCE = "payment_method_preference";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_SPECS = "payment_method_specs";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @Deprecated
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    private final String apiKey;
    private final ElementsSessionParams params;
    private final Function0<Long> timeProvider;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.model.parsers.ElementsSessionJsonParser$1 */
    /* loaded from: classes7.dex */
    public static final class C190911 extends Lambda implements Function0<Long> {
        public static final C190911 INSTANCE = new C190911();

        public C190911() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;", "", "()V", "FIELD_COUNTRY_CODE", "", "FIELD_ELEMENTS_SESSION_ID", "FIELD_LINK_FUNDING_SOURCES", "FIELD_LINK_SETTINGS", "FIELD_OBJECT", "FIELD_ORDERED_PAYMENT_METHOD_TYPES", "FIELD_PAYMENT_METHOD_PREFERENCE", "FIELD_PAYMENT_METHOD_SPECS", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ElementsSessionJsonParser(ElementsSessionParams params, String apiKey, Function0<Long> timeProvider) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.params = params;
        this.apiKey = apiKey;
        this.timeProvider = timeProvider;
    }

    private final StripeIntent parseStripeIntent(String str, JSONObject jSONObject, JSONArray jSONArray, List<String> list, JSONArray jSONArray2, String str2) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject(this.params.getType());
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONArray != null) {
            jSONObject2.put(FIELD_PAYMENT_METHOD_TYPES, jSONArray);
        }
        jSONObject2.put(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES, list);
        jSONObject2.put(FIELD_LINK_FUNDING_SOURCES, jSONArray2);
        jSONObject2.put(FIELD_COUNTRY_CODE, str2);
        ElementsSessionParams elementsSessionParams = this.params;
        if (elementsSessionParams instanceof ElementsSessionParams.PaymentIntentType) {
            return new PaymentIntentJsonParser(null, 1, null).parse(jSONObject2);
        }
        if (elementsSessionParams instanceof ElementsSessionParams.SetupIntentType) {
            return new SetupIntentJsonParser().parse(jSONObject2);
        }
        if (elementsSessionParams instanceof ElementsSessionParams.DeferredIntentType) {
            DeferredIntentParams.Mode mode = ((ElementsSessionParams.DeferredIntentType) elementsSessionParams).getDeferredIntentParams().getMode();
            if (mode instanceof DeferredIntentParams.Mode.Payment) {
                return new DeferredPaymentIntentJsonParser(str, ((ElementsSessionParams.DeferredIntentType) this.params).getDeferredIntentParams(), this.apiKey, this.timeProvider).parse(jSONObject2);
            }
            if (mode instanceof DeferredIntentParams.Mode.Setup) {
                return new DeferredSetupIntentJsonParser(str, ((ElementsSessionParams.DeferredIntentType) this.params).getDeferredIntentParams(), this.apiKey, this.timeProvider).parse(jSONObject2);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ElementsSession parse(JSONObject json) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(json, "json");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        JSONObject mapToJsonObject = stripeJsonUtils.mapToJsonObject(stripeJsonUtils.optMap(json, FIELD_PAYMENT_METHOD_PREFERENCE));
        String optString = StripeJsonUtils.optString(mapToJsonObject, FIELD_OBJECT);
        if (mapToJsonObject == null || !Intrinsics.areEqual(FIELD_PAYMENT_METHOD_PREFERENCE, optString)) {
            return null;
        }
        String countryCode = mapToJsonObject.optString(FIELD_COUNTRY_CODE);
        List<String> jsonArrayToList = ModelJsonParser.Companion.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArrayToList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : jsonArrayToList) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(lowerCase);
        }
        JSONArray optJSONArray = json.optJSONArray(FIELD_PAYMENT_METHOD_SPECS);
        String jSONArray = optJSONArray != null ? optJSONArray.toString() : null;
        JSONObject optJSONObject = json.optJSONObject(FIELD_LINK_SETTINGS);
        JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray(FIELD_LINK_FUNDING_SOURCES) : null;
        JSONArray optJSONArray3 = mapToJsonObject.optJSONArray(FIELD_ORDERED_PAYMENT_METHOD_TYPES);
        String optString2 = json.optString("session_id");
        Intrinsics.checkNotNullExpressionValue(countryCode, "countryCode");
        StripeIntent parseStripeIntent = parseStripeIntent(optString2, mapToJsonObject, optJSONArray3, arrayList, optJSONArray2, countryCode);
        if (parseStripeIntent != null) {
            return new ElementsSession(new ElementsSession.LinkSettings(ModelJsonParser.Companion.jsonArrayToList(optJSONArray2)), jSONArray, parseStripeIntent);
        }
        return null;
    }

    public /* synthetic */ ElementsSessionJsonParser(ElementsSessionParams elementsSessionParams, String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(elementsSessionParams, str, (i & 4) != 0 ? C190911.INSTANCE : function0);
    }
}
