package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.ConsumerSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ConsumerSession;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseVerificationSession", "Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nConsumerSessionJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerSessionJsonParser.kt\ncom/stripe/android/model/parsers/ConsumerSessionJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1549#2:57\n1620#2,3:58\n1603#2,9:61\n1855#2:70\n1856#2:72\n1612#2:73\n1#3:71\n*S KotlinDebug\n*F\n+ 1 ConsumerSessionJsonParser.kt\ncom/stripe/android/model/parsers/ConsumerSessionJsonParser\n*L\n18#1:57\n18#1:58,3\n19#1:61,9\n19#1:70\n19#1:72\n19#1:73\n19#1:71\n*E\n"})
/* loaded from: classes7.dex */
public final class ConsumerSessionJsonParser implements ModelJsonParser<ConsumerSession> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION = "consumer_session";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_AUTH_SESSION_SECRET = "auth_session_client_secret";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_EMAIL = "email_address";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_PHONE = "redacted_phone_number";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS = "verification_sessions";
    @Deprecated
    private static final String FIELD_PUBLISHABLE_KEY = "publishable_key";
    @Deprecated
    private static final String FIELD_VERIFICATION_SESSION_STATE = "state";
    @Deprecated
    private static final String FIELD_VERIFICATION_SESSION_TYPE = "type";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/model/parsers/ConsumerSessionJsonParser$Companion;", "", "()V", "FIELD_CONSUMER_SESSION", "", "FIELD_CONSUMER_SESSION_AUTH_SESSION_SECRET", "FIELD_CONSUMER_SESSION_EMAIL", "FIELD_CONSUMER_SESSION_PHONE", "FIELD_CONSUMER_SESSION_SECRET", "FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS", "FIELD_PUBLISHABLE_KEY", "FIELD_VERIFICATION_SESSION_STATE", "FIELD_VERIFICATION_SESSION_TYPE", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ConsumerSession.VerificationSession parseVerificationSession(JSONObject jSONObject) {
        ConsumerSession.VerificationSession.SessionType.Companion companion = ConsumerSession.VerificationSession.SessionType.Companion;
        String string = jSONObject.getString("type");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(FIELD_VERIFICATION_SESSION_TYPE)");
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ConsumerSession.VerificationSession.SessionType fromValue = companion.fromValue(lowerCase);
        ConsumerSession.VerificationSession.SessionState.Companion companion2 = ConsumerSession.VerificationSession.SessionState.Companion;
        String string2 = jSONObject.getString("state");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(FIELD_VERIFICATION_SESSION_STATE)");
        String lowerCase2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return new ConsumerSession.VerificationSession(fromValue, companion2.fromValue(lowerCase2));
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerSession parse(JSONObject json) {
        List emptyList;
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject optJSONObject = json.optJSONObject(FIELD_CONSUMER_SESSION);
        if (optJSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray(FIELD_CONSUMER_SESSION_VERIFICATION_SESSIONS);
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
                ConsumerSession.VerificationSession parseVerificationSession = parseVerificationSession(it2);
                if (parseVerificationSession != null) {
                    emptyList.add(parseVerificationSession);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        String string = optJSONObject.getString("client_secret");
        Intrinsics.checkNotNullExpressionValue(string, "consumerSessionJson.getS…_CONSUMER_SESSION_SECRET)");
        String string2 = optJSONObject.getString(FIELD_CONSUMER_SESSION_EMAIL);
        Intrinsics.checkNotNullExpressionValue(string2, "consumerSessionJson.getS…D_CONSUMER_SESSION_EMAIL)");
        String string3 = optJSONObject.getString(FIELD_CONSUMER_SESSION_PHONE);
        Intrinsics.checkNotNullExpressionValue(string3, "consumerSessionJson.getS…D_CONSUMER_SESSION_PHONE)");
        return new ConsumerSession(string, string2, string3, emptyList, StripeJsonUtils.optString(json, FIELD_CONSUMER_SESSION_AUTH_SESSION_SECRET), StripeJsonUtils.optString(json, "publishable_key"));
    }
}
