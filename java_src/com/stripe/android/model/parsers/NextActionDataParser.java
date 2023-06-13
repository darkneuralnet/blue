package com.stripe.android.model.parsers;

import android.net.Uri;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.MicrodepositType;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChat;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "parse", "json", "Lorg/json/JSONObject;", "AlipayRedirectParser", "BlikAuthorizeParser", "CashAppRedirectParser", "Companion", "DisplayOxxoDetailsJsonParser", "RedirectToUrlParser", "SdkDataJsonParser", "UpiAwaitNotificationParser", "VerifyWithMicrodepositsParser", "WeChatPayRedirectParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class NextActionDataParser implements ModelJsonParser<StripeIntent.NextActionData> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_NEXT_ACTION_TYPE = "type";

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AlipayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.AlipayRedirect> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        public static final String FIELD_NATIVE_DATA = "native_data";
        @Deprecated
        public static final String FIELD_RETURN_URL = "return_url";
        @Deprecated
        public static final String FIELD_URL = "url";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser$Companion;", "", "()V", "FIELD_NATIVE_DATA", "", "FIELD_RETURN_URL", "FIELD_URL", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.AlipayRedirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String string = json.getString(FIELD_NATIVE_DATA);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(FIELD_NATIVE_DATA)");
            String string2 = json.getString("url");
            Intrinsics.checkNotNullExpressionValue(string2, "json.getString(FIELD_URL)");
            return new StripeIntent.NextActionData.AlipayRedirect(string, string2, StripeJsonUtils.optString(json, "return_url"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BlikAuthorizeParser implements ModelJsonParser<StripeIntent.NextActionData.BlikAuthorize> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.BlikAuthorize parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return StripeIntent.NextActionData.BlikAuthorize.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CashAppRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.CashAppRedirect> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.CashAppRedirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString("mobile_auth_url");
            Intrinsics.checkNotNullExpressionValue(optString, "json.optString(\"mobile_auth_url\")");
            return new StripeIntent.NextActionData.CashAppRedirect(optString);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;", "", "()V", "FIELD_NEXT_ACTION_TYPE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DisplayOxxoDetailsJsonParser implements ModelJsonParser<StripeIntent.NextActionData.DisplayOxxoDetails> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_EXPIRES_AFTER = "expires_after";
        @Deprecated
        private static final String FIELD_HOSTED_VOUCHER_URL = "hosted_voucher_url";
        @Deprecated
        private static final String FIELD_NUMBER = "number";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser$Companion;", "", "()V", "FIELD_EXPIRES_AFTER", "", "FIELD_HOSTED_VOUCHER_URL", "FIELD_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.DisplayOxxoDetails parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new StripeIntent.NextActionData.DisplayOxxoDetails(json.optInt(FIELD_EXPIRES_AFTER), StripeJsonUtils.optString(json, FIELD_NUMBER), StripeJsonUtils.optString(json, FIELD_HOSTED_VOUCHER_URL));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class RedirectToUrlParser implements ModelJsonParser<StripeIntent.NextActionData.RedirectToUrl> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        public static final String FIELD_RETURN_URL = "return_url";
        @Deprecated
        public static final String FIELD_URL = "url";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser$Companion;", "", "()V", "FIELD_RETURN_URL", "", "FIELD_URL", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.RedirectToUrl parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            if (json.has("url")) {
                Uri parse = Uri.parse(json.getString("url"));
                Intrinsics.checkNotNullExpressionValue(parse, "parse(json.getString(FIELD_URL))");
                return new StripeIntent.NextActionData.RedirectToUrl(parse, json.optString("return_url"));
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseDirectoryServerEncryption", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNextActionDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NextActionDataParser.kt\ncom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n1789#2,3:241\n*S KotlinDebug\n*F\n+ 1 NextActionDataParser.kt\ncom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser\n*L\n119#1:241,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class SdkDataJsonParser implements ModelJsonParser<StripeIntent.NextActionData.SdkData> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CERTIFICATE = "certificate";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_ENCRYPTION = "directory_server_encryption";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_ID = "directory_server_id";
        @Deprecated
        private static final String FIELD_DIRECTORY_SERVER_NAME = "directory_server_name";
        @Deprecated
        private static final String FIELD_KEY_ID = "key_id";
        @Deprecated
        private static final String FIELD_PUBLISHABLE_KEY = "publishable_key";
        @Deprecated
        private static final String FIELD_ROOT_CAS = "root_certificate_authorities";
        @Deprecated
        private static final String FIELD_SERVER_TRANSACTION_ID = "server_transaction_id";
        @Deprecated
        private static final String FIELD_STRIPE_JS = "stripe_js";
        @Deprecated
        private static final String FIELD_THREE_D_SECURE_2_INTENT = "three_d_secure_2_intent";
        @Deprecated
        private static final String FIELD_THREE_D_SECURE_2_SOURCE = "three_d_secure_2_source";
        @Deprecated
        private static final String FIELD_TYPE = "type";
        @Deprecated
        private static final String TYPE_3DS1 = "three_d_secure_redirect";
        @Deprecated
        private static final String TYPE_3DS2 = "stripe_3ds2_fingerprint";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser$Companion;", "", "()V", "FIELD_CERTIFICATE", "", "FIELD_DIRECTORY_SERVER_ENCRYPTION", "FIELD_DIRECTORY_SERVER_ID", "FIELD_DIRECTORY_SERVER_NAME", "FIELD_KEY_ID", "FIELD_PUBLISHABLE_KEY", "FIELD_ROOT_CAS", "FIELD_SERVER_TRANSACTION_ID", "FIELD_STRIPE_JS", "FIELD_THREE_D_SECURE_2_INTENT", "FIELD_THREE_D_SECURE_2_SOURCE", "FIELD_TYPE", "TYPE_3DS1", "TYPE_3DS2", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r1 != null) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption parseDirectoryServerEncryption(JSONObject jSONObject) {
            List emptyList;
            List jsonArrayToList = StripeJsonUtils.INSTANCE.jsonArrayToList(jSONObject.optJSONArray(FIELD_ROOT_CAS));
            if (jsonArrayToList != null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                for (Object obj : jsonArrayToList) {
                    if (obj instanceof String) {
                        emptyList = CollectionsKt___CollectionsKt.plus((Collection<? extends Object>) emptyList, obj);
                    }
                }
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            String optString = jSONObject.optString(FIELD_DIRECTORY_SERVER_ID);
            Intrinsics.checkNotNullExpressionValue(optString, "json.optString(FIELD_DIRECTORY_SERVER_ID)");
            String optString2 = jSONObject.optString(FIELD_CERTIFICATE);
            Intrinsics.checkNotNullExpressionValue(optString2, "json.optString(FIELD_CERTIFICATE)");
            return new StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption(optString, optString2, emptyList, jSONObject.optString(FIELD_KEY_ID));
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.SdkData parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = StripeJsonUtils.optString(json, "type");
            if (Intrinsics.areEqual(optString, TYPE_3DS1)) {
                String optString2 = json.optString(FIELD_STRIPE_JS);
                Intrinsics.checkNotNullExpressionValue(optString2, "json.optString(FIELD_STRIPE_JS)");
                return new StripeIntent.NextActionData.SdkData.Use3DS1(optString2);
            } else if (Intrinsics.areEqual(optString, TYPE_3DS2)) {
                String optString3 = json.optString(FIELD_THREE_D_SECURE_2_SOURCE);
                Intrinsics.checkNotNullExpressionValue(optString3, "json.optString(FIELD_THREE_D_SECURE_2_SOURCE)");
                String optString4 = json.optString(FIELD_DIRECTORY_SERVER_NAME);
                Intrinsics.checkNotNullExpressionValue(optString4, "json.optString(FIELD_DIRECTORY_SERVER_NAME)");
                String optString5 = json.optString(FIELD_SERVER_TRANSACTION_ID);
                Intrinsics.checkNotNullExpressionValue(optString5, "json.optString(FIELD_SERVER_TRANSACTION_ID)");
                JSONObject optJSONObject = json.optJSONObject(FIELD_DIRECTORY_SERVER_ENCRYPTION);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                return new StripeIntent.NextActionData.SdkData.Use3DS2(optString3, optString4, optString5, parseDirectoryServerEncryption(optJSONObject), StripeJsonUtils.optString(json, FIELD_THREE_D_SECURE_2_INTENT), StripeJsonUtils.optString(json, "publishable_key"));
            } else {
                return null;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;", "()V", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class UpiAwaitNotificationParser implements ModelJsonParser<StripeIntent.NextActionData.UpiAwaitNotification> {
        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.UpiAwaitNotification parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return StripeIntent.NextActionData.UpiAwaitNotification.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseMicrodepositType", "Lcom/stripe/android/model/MicrodepositType;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class VerifyWithMicrodepositsParser implements ModelJsonParser<StripeIntent.NextActionData.VerifyWithMicrodeposits> {
        @Deprecated
        private static final String ARRIVAL_DATE = "arrival_date";
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String HOSTED_VERIFICATION_URL = "hosted_verification_url";
        @Deprecated
        private static final String MICRODEPOSIT_TYPE = "microdeposit_type";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser$Companion;", "", "()V", "ARRIVAL_DATE", "", "HOSTED_VERIFICATION_URL", "MICRODEPOSIT_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        private final MicrodepositType parseMicrodepositType(JSONObject jSONObject) {
            MicrodepositType microdepositType;
            MicrodepositType[] values = MicrodepositType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    microdepositType = values[i];
                    if (Intrinsics.areEqual(microdepositType.getValue(), jSONObject.optString(MICRODEPOSIT_TYPE))) {
                        break;
                    }
                    i++;
                } else {
                    microdepositType = null;
                    break;
                }
            }
            if (microdepositType == null) {
                return MicrodepositType.UNKNOWN;
            }
            return microdepositType;
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.VerifyWithMicrodeposits parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            long optLong = json.optLong(ARRIVAL_DATE);
            String optString = json.optString(HOSTED_VERIFICATION_URL);
            Intrinsics.checkNotNullExpressionValue(optString, "json.optString(HOSTED_VERIFICATION_URL)");
            return new StripeIntent.NextActionData.VerifyWithMicrodeposits(optLong, optString, parseMicrodepositType(json));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class WeChatPayRedirectParser implements ModelJsonParser<StripeIntent.NextActionData.WeChatPayRedirect> {
        @Deprecated
        private static final String APP_ID = "app_id";
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String NONCE_STR = "nonce_str";
        @Deprecated
        private static final String PACKAGE = "package";
        @Deprecated
        private static final String PARTNER_ID = "partner_id";
        @Deprecated
        private static final String PREPAY_ID = "prepay_id";
        @Deprecated
        private static final String SIGN = "sign";
        @Deprecated
        private static final String TIMESTAMP = "timestamp";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser$Companion;", "", "()V", "APP_ID", "", "NONCE_STR", "PACKAGE", "PARTNER_ID", "PREPAY_ID", "SIGN", "TIMESTAMP", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public StripeIntent.NextActionData.WeChatPayRedirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new StripeIntent.NextActionData.WeChatPayRedirect(new WeChat(null, json.optString("app_id"), json.optString(NONCE_STR), json.optString(PACKAGE), json.optString(PARTNER_ID), json.optString(PREPAY_ID), json.optString(SIGN), json.optString("timestamp"), null, 257, null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public StripeIntent.NextActionData parse(JSONObject json) {
        ModelJsonParser displayOxxoDetailsJsonParser;
        Intrinsics.checkNotNullParameter(json, "json");
        StripeIntent.NextActionType fromCode$payments_core_release = StripeIntent.NextActionType.Companion.fromCode$payments_core_release(json.optString("type"));
        switch (fromCode$payments_core_release == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromCode$payments_core_release.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                displayOxxoDetailsJsonParser = new DisplayOxxoDetailsJsonParser();
                break;
            case 2:
                displayOxxoDetailsJsonParser = new RedirectToUrlParser();
                break;
            case 3:
                displayOxxoDetailsJsonParser = new SdkDataJsonParser();
                break;
            case 4:
                displayOxxoDetailsJsonParser = new AlipayRedirectParser();
                break;
            case 5:
                displayOxxoDetailsJsonParser = new BlikAuthorizeParser();
                break;
            case 6:
                displayOxxoDetailsJsonParser = new WeChatPayRedirectParser();
                break;
            case 7:
                displayOxxoDetailsJsonParser = new VerifyWithMicrodepositsParser();
                break;
            case 8:
                displayOxxoDetailsJsonParser = new UpiAwaitNotificationParser();
                break;
            case 9:
                displayOxxoDetailsJsonParser = new CashAppRedirectParser();
                break;
        }
        JSONObject optJSONObject = json.optJSONObject(fromCode$payments_core_release.getCode());
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return (StripeIntent.NextActionData) displayOxxoDetailsJsonParser.parse(optJSONObject);
    }
}
