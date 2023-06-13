package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.SetupIntent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "elementsSessionId", "", "params", "Lcom/stripe/android/model/DeferredIntentParams;", "apiKey", "timeProvider", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDeferredSetupIntentJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredSetupIntentJsonParser.kt\ncom/stripe/android/model/parsers/DeferredSetupIntentJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1549#2:58\n1620#2,3:59\n*S KotlinDebug\n*F\n+ 1 DeferredSetupIntentJsonParser.kt\ncom/stripe/android/model/parsers/DeferredSetupIntentJsonParser\n*L\n28#1:58\n28#1:59,3\n*E\n"})
/* loaded from: classes7.dex */
public final class DeferredSetupIntentJsonParser implements ModelJsonParser<SetupIntent> {
    @Deprecated
    private static final String FIELD_COUNTRY_CODE = "country_code";
    @Deprecated
    private static final String FIELD_LINK_FUNDING_SOURCES = "link_funding_sources";
    @Deprecated
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    @Deprecated
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    private final String apiKey;
    private final String elementsSessionId;
    private final DeferredIntentParams params;
    private final Function0<Long> timeProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser$Companion;", "", "()V", "FIELD_COUNTRY_CODE", "", "FIELD_LINK_FUNDING_SOURCES", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeferredSetupIntentJsonParser(String str, DeferredIntentParams params, String apiKey, Function0<Long> timeProvider) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.elementsSessionId = str;
        this.params = params;
        this.apiKey = apiKey;
        this.timeProvider = timeProvider;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SetupIntent parse(JSONObject json) {
        int collectionSizeOrDefault;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(json, "json");
        ModelJsonParser.Companion companion = ModelJsonParser.Companion;
        List<String> jsonArrayToList = companion.jsonArrayToList(json.optJSONArray(FIELD_PAYMENT_METHOD_TYPES));
        List<String> jsonArrayToList2 = companion.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
        List<String> jsonArrayToList3 = companion.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArrayToList3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : jsonArrayToList3) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(lowerCase);
        }
        String optString = StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE);
        String str2 = this.elementsSessionId;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) this.apiKey, (CharSequence) "live", false, 2, (Object) null);
        return new SetupIntent(str2, null, this.timeProvider.invoke().longValue(), optString, null, null, contains$default, null, null, jsonArrayToList, null, this.params.getSetupFutureUsage(), null, jsonArrayToList2, arrayList, null, 4224, null);
    }
}
