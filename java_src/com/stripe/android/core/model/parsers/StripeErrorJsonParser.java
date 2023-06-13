package com.stripe.android.core.model.parsers;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.model.StripeJsonUtils;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/core/StripeError;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class StripeErrorJsonParser implements ModelJsonParser<StripeError> {
    public static final Companion Companion = new Companion(null);
    private static final String FIELD_CHARGE = "charge";
    private static final String FIELD_CODE = "code";
    private static final String FIELD_DECLINE_CODE = "decline_code";
    private static final String FIELD_DOC_URL = "doc_url";
    private static final String FIELD_ERROR = "error";
    private static final String FIELD_EXTRA_FIELDS = "extra_fields";
    private static final String FIELD_MESSAGE = "message";
    private static final String FIELD_PARAM = "param";
    private static final String FIELD_TYPE = "type";
    public static final String MALFORMED_RESPONSE_MESSAGE = "An improperly formatted error response was found.";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser$Companion;", "", "()V", "FIELD_CHARGE", "", "FIELD_CODE", "FIELD_DECLINE_CODE", "FIELD_DOC_URL", "FIELD_ERROR", "FIELD_EXTRA_FIELDS", "FIELD_MESSAGE", "FIELD_PARAM", "FIELD_TYPE", "MALFORMED_RESPONSE_MESSAGE", "getMALFORMED_RESPONSE_MESSAGE$stripe_core_release$annotations", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMALFORMED_RESPONSE_MESSAGE$stripe_core_release$annotations() {
        }

        private Companion() {
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeError parse(JSONObject json) {
        StripeError m116783constructorimpl;
        Map map;
        Sequence asSequence;
        Sequence map2;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = json.getJSONObject(FIELD_ERROR);
            String optString = StripeJsonUtils.optString(jSONObject, FIELD_CHARGE);
            String optString2 = StripeJsonUtils.optString(jSONObject, "code");
            String optString3 = StripeJsonUtils.optString(jSONObject, FIELD_DECLINE_CODE);
            String optString4 = StripeJsonUtils.optString(jSONObject, FIELD_MESSAGE);
            String optString5 = StripeJsonUtils.optString(jSONObject, FIELD_PARAM);
            String optString6 = StripeJsonUtils.optString(jSONObject, "type");
            String optString7 = StripeJsonUtils.optString(jSONObject, FIELD_DOC_URL);
            JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_EXTRA_FIELDS);
            if (optJSONObject != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(FIELD_EXTRA_FIELDS)");
                Iterator<String> keys = optJSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "extraFieldsJson.keys()");
                asSequence = SequencesKt__SequencesKt.asSequence(keys);
                map2 = SequencesKt___SequencesKt.map(asSequence, new StripeErrorJsonParser$parse$1$1$1$1(optJSONObject));
                map = MapsKt__MapsKt.toMap(map2);
            } else {
                map = null;
            }
            m116783constructorimpl = Result.m116783constructorimpl(new StripeError(optString6, optString4, optString2, optString5, optString3, optString, optString7, map));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        StripeError stripeError = new StripeError(null, MALFORMED_RESPONSE_MESSAGE, null, null, null, null, null, null, 253, null);
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = stripeError;
        }
        return (StripeError) m116783constructorimpl;
    }
}
