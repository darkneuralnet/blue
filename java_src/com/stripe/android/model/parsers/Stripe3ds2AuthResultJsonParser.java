package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AresJsonParser", "Companion", "MessageExtensionJsonParser", "ThreeDS2ErrorJsonParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Stripe3ds2AuthResultJsonParser implements ModelJsonParser<Stripe3ds2AuthResult> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ARES = "ares";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CREQ = "creq";
    @Deprecated
    private static final String FIELD_ERROR = "error";
    @Deprecated
    private static final String FIELD_FALLBACK_REDIRECT_URL = "fallback_redirect_url";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_SOURCE = "source";
    @Deprecated
    private static final String FIELD_STATE = "state";

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AresJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.Ares> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACS_CHALLENGE_MANDATED = "acsChallengeMandated";
        @Deprecated
        private static final String FIELD_ACS_SIGNED_CONTENT = "acsSignedContent";
        @Deprecated
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        @Deprecated
        private static final String FIELD_ACS_URL = "acsURL";
        @Deprecated
        private static final String FIELD_AUTHENTICATION_TYPE = "authenticationType";
        @Deprecated
        private static final String FIELD_CARDHOLDER_INFO = "cardholderInfo";
        @Deprecated
        private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
        @Deprecated
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        @Deprecated
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        @Deprecated
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        @Deprecated
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";
        @Deprecated
        private static final String FIELD_TRANS_STATUS = "transStatus";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$AresJsonParser$Companion;", "", "()V", "FIELD_ACS_CHALLENGE_MANDATED", "", "FIELD_ACS_SIGNED_CONTENT", "FIELD_ACS_TRANS_ID", "FIELD_ACS_URL", "FIELD_AUTHENTICATION_TYPE", "FIELD_CARDHOLDER_INFO", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "FIELD_TRANS_STATUS", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.Ares parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = StripeJsonUtils.optString(json, "threeDSServerTransID");
            String optString2 = StripeJsonUtils.optString(json, FIELD_ACS_CHALLENGE_MANDATED);
            String optString3 = StripeJsonUtils.optString(json, FIELD_ACS_SIGNED_CONTENT);
            String string = json.getString("acsTransID");
            String optString4 = StripeJsonUtils.optString(json, "acsURL");
            String optString5 = StripeJsonUtils.optString(json, FIELD_AUTHENTICATION_TYPE);
            String optString6 = StripeJsonUtils.optString(json, FIELD_CARDHOLDER_INFO);
            String string2 = json.getString("messageType");
            String string3 = json.getString("messageVersion");
            String optString7 = StripeJsonUtils.optString(json, "sdkTransID");
            String optString8 = StripeJsonUtils.optString(json, FIELD_TRANS_STATUS);
            JSONArray optJSONArray = json.optJSONArray(FIELD_MESSAGE_EXTENSION);
            return new Stripe3ds2AuthResult.Ares(optString, optString2, optString3, string, optString4, optString5, optString6, optJSONArray != null ? new MessageExtensionJsonParser().parse(optJSONArray) : null, string2, string3, optString7, optString8);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$Companion;", "", "()V", "FIELD_ARES", "", "FIELD_CREATED", "FIELD_CREQ", "FIELD_ERROR", "FIELD_FALLBACK_REDIRECT_URL", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_SOURCE", "FIELD_STATE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "()V", "parse", "", "jsonArray", "Lorg/json/JSONArray;", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nStripe3ds2AuthResultJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stripe3ds2AuthResultJsonParser.kt\ncom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1603#2,9:145\n1855#2:154\n1856#2:156\n1612#2:157\n1549#2:158\n1620#2,3:159\n1549#2:162\n1620#2,3:163\n1549#2:166\n1620#2,3:167\n1789#2,3:170\n1#3:155\n*S KotlinDebug\n*F\n+ 1 Stripe3ds2AuthResultJsonParser.kt\ncom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser\n*L\n68#1:145,9\n68#1:154\n68#1:156\n68#1:157\n69#1:158\n69#1:159,3\n77#1:162\n77#1:163,3\n78#1:166\n78#1:167,3\n79#1:170,3\n68#1:155\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class MessageExtensionJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.MessageExtension> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
        @Deprecated
        private static final String FIELD_DATA = "data";
        @Deprecated
        private static final String FIELD_ID = "id";
        @Deprecated
        private static final String FIELD_NAME = "name";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$MessageExtensionJsonParser$Companion;", "", "()V", "FIELD_CRITICALITY_INDICATOR", "", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public final List<Stripe3ds2AuthResult.MessageExtension> parse(JSONArray jsonArray) {
            IntRange until;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            until = RangesKt___RangesKt.until(0, jsonArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList();
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jsonArray.optJSONObject(((IntIterator) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (JSONObject jSONObject : arrayList) {
                arrayList2.add(parse(jSONObject));
            }
            return arrayList2;
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.MessageExtension parse(JSONObject json) {
            Map emptyMap;
            Map map;
            IntRange until;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Map mapOf;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("data");
            if (optJSONObject != null) {
                JSONArray names = optJSONObject.names();
                if (names == null) {
                    names = new JSONArray();
                }
                until = RangesKt___RangesKt.until(0, names.length());
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                ArrayList<String> arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    arrayList.add(names.getString(((IntIterator) it).nextInt()));
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList<Map> arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (String str : arrayList) {
                    mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, optJSONObject.getString(str)));
                    arrayList2.add(mapOf);
                }
                emptyMap = MapsKt__MapsKt.emptyMap();
                for (Map map2 : arrayList2) {
                    emptyMap = MapsKt__MapsKt.plus(emptyMap, map2);
                }
            } else {
                emptyMap = MapsKt__MapsKt.emptyMap();
            }
            String optString = StripeJsonUtils.optString(json, "name");
            boolean optBoolean = json.optBoolean("criticalityIndicator");
            String optString2 = StripeJsonUtils.optString(json, "id");
            map = MapsKt__MapsKt.toMap(emptyMap);
            return new Stripe3ds2AuthResult.MessageExtension(optString, optBoolean, optString2, map);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ThreeDS2ErrorJsonParser implements ModelJsonParser<Stripe3ds2AuthResult.ThreeDS2Error> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ACS_TRANS_ID = "acsTransID";
        @Deprecated
        private static final String FIELD_DS_TRANS_ID = "dsTransID";
        @Deprecated
        private static final String FIELD_ERROR_CODE = "errorCode";
        @Deprecated
        private static final String FIELD_ERROR_COMPONENT = "errorComponent";
        @Deprecated
        private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
        @Deprecated
        private static final String FIELD_ERROR_DETAIL = "errorDetail";
        @Deprecated
        private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
        @Deprecated
        private static final String FIELD_MESSAGE_TYPE = "messageType";
        @Deprecated
        private static final String FIELD_MESSAGE_VERSION = "messageVersion";
        @Deprecated
        private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
        @Deprecated
        private static final String FIELD_THREE_DS_SERVER_TRANS_ID = "threeDSServerTransID";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/Stripe3ds2AuthResultJsonParser$ThreeDS2ErrorJsonParser$Companion;", "", "()V", "FIELD_ACS_TRANS_ID", "", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Stripe3ds2AuthResult.ThreeDS2Error parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Stripe3ds2AuthResult.ThreeDS2Error(json.getString("threeDSServerTransID"), StripeJsonUtils.optString(json, "acsTransID"), StripeJsonUtils.optString(json, FIELD_DS_TRANS_ID), json.getString(FIELD_ERROR_CODE), json.getString(FIELD_ERROR_COMPONENT), json.getString(FIELD_ERROR_DESCRIPTION), json.getString(FIELD_ERROR_DETAIL), StripeJsonUtils.optString(json, FIELD_ERROR_MESSAGE_TYPE), json.getString("messageType"), json.getString("messageVersion"), StripeJsonUtils.optString(json, "sdkTransID"));
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Stripe3ds2AuthResult parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        long j = json.getLong("created");
        boolean z = json.getBoolean(FIELD_LIVEMODE);
        String string2 = json.getString("source");
        String optString = json.optString("state");
        JSONObject optJSONObject = json.optJSONObject(FIELD_ARES);
        Stripe3ds2AuthResult.Ares parse = optJSONObject != null ? new AresJsonParser().parse(optJSONObject) : null;
        JSONObject optJSONObject2 = json.optJSONObject(FIELD_ERROR);
        return new Stripe3ds2AuthResult(string, parse, Long.valueOf(j), string2, optString, z, optJSONObject2 != null ? new ThreeDS2ErrorJsonParser().parse(optJSONObject2) : null, StripeJsonUtils.optString(json, FIELD_FALLBACK_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_CREQ));
    }
}
