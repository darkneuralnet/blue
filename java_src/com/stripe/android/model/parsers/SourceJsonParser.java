package com.stripe.android.model.parsers;

import android.os.Parcelable;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrder;
import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.WeChat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source;", "()V", "parse", "json", "Lorg/json/JSONObject;", "CodeVerificationJsonParser", "Companion", "KlarnaJsonParser", "OwnerJsonParser", "ReceiverJsonParser", "RedirectJsonParser", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SourceJsonParser implements ModelJsonParser<Source> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String FIELD_CODE_VERIFICATION = "code_verification";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_FLOW = "flow";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_KLARNA = "klarna";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_OWNER = "owner";
    @Deprecated
    private static final String FIELD_RECEIVER = "receiver";
    @Deprecated
    private static final String FIELD_REDIRECT = "redirect";
    @Deprecated
    private static final String FIELD_SOURCE_ORDER = "source_order";
    @Deprecated
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @Deprecated
    private static final String FIELD_STATUS = "status";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_USAGE = "usage";
    @Deprecated
    private static final String FIELD_WECHAT = "wechat";
    @Deprecated
    private static final Set<String> MODELED_TYPES;
    @Deprecated
    private static final String VALUE_CARD = "card";
    @Deprecated
    private static final String VALUE_SOURCE = "source";

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$CodeVerification;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CodeVerificationJsonParser implements ModelJsonParser<Source.CodeVerification> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ATTEMPTS_REMAINING = "attempts_remaining";
        @Deprecated
        private static final String FIELD_STATUS = "status";
        @Deprecated
        private static final int INVALID_ATTEMPTS_REMAINING = -1;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser$Companion;", "", "()V", "FIELD_ATTEMPTS_REMAINING", "", "FIELD_STATUS", "INVALID_ATTEMPTS_REMAINING", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.CodeVerification parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.CodeVerification(json.optInt(FIELD_ATTEMPTS_REMAINING, -1), Source.CodeVerification.Status.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_STATUS)));
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J.\u0010\"\u001a\u0004\u0018\u0001H#\"\n\b\u0000\u0010#\u0018\u0001*\u00020$2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010%\u001a\u00020\u0004H\u0082\b¢\u0006\u0002\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;", "", "()V", "FIELD_AMOUNT", "", "FIELD_CLIENT_SECRET", "FIELD_CODE_VERIFICATION", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_FLOW", "FIELD_ID", "FIELD_KLARNA", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_OWNER", "FIELD_RECEIVER", "FIELD_REDIRECT", "FIELD_SOURCE_ORDER", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_STATUS", "FIELD_TYPE", "FIELD_USAGE", "FIELD_WECHAT", "MODELED_TYPES", "", "VALUE_CARD", "VALUE_SOURCE", "asSourceType", "sourceType", "fromCardJson", "Lcom/stripe/android/model/Source;", "jsonObject", "Lorg/json/JSONObject;", "fromSourceJson", "optStripeJsonModel", "T", "Lcom/stripe/android/core/model/StripeModel;", "key", "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeModel;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSourceJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceJsonParser.kt\ncom/stripe/android/model/parsers/SourceJsonParser$Companion\n*L\n1#1,317:1\n252#1,41:318\n252#1,41:359\n252#1,41:400\n252#1,41:441\n252#1,41:482\n*S KotlinDebug\n*F\n+ 1 SourceJsonParser.kt\ncom/stripe/android/model/parsers/SourceJsonParser$Companion\n*L\n201#1:318,41\n210#1:359,41\n218#1:400,41\n219#1:441,41\n220#1:482,41\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String asSourceType(String str) {
            String str2;
            if (str == null) {
                return "unknown";
            }
            switch (str.hashCode()) {
                case -1920743119:
                    str2 = "bancontact";
                    if (!str.equals("bancontact")) {
                        return "unknown";
                    }
                    break;
                case -1414960566:
                    str2 = "alipay";
                    if (!str.equals("alipay")) {
                        return "unknown";
                    }
                    break;
                case -1128905083:
                    str2 = "klarna";
                    if (!str.equals("klarna")) {
                        return "unknown";
                    }
                    break;
                case -896955097:
                    str2 = "sofort";
                    if (!str.equals("sofort")) {
                        return "unknown";
                    }
                    break;
                case -825238221:
                    str2 = "three_d_secure";
                    if (!str.equals("three_d_secure")) {
                        return "unknown";
                    }
                    break;
                case -791770330:
                    str2 = "wechat";
                    if (!str.equals("wechat")) {
                        return "unknown";
                    }
                    break;
                case -284840886:
                    str.equals("unknown");
                    return "unknown";
                case 100648:
                    str2 = "eps";
                    if (!str.equals("eps")) {
                        return "unknown";
                    }
                    break;
                case 109234:
                    str2 = "p24";
                    if (!str.equals("p24")) {
                        return "unknown";
                    }
                    break;
                case 3046160:
                    str2 = "card";
                    if (!str.equals("card")) {
                        return "unknown";
                    }
                    break;
                case 38358441:
                    str2 = "giropay";
                    if (!str.equals("giropay")) {
                        return "unknown";
                    }
                    break;
                case 100048981:
                    str2 = "ideal";
                    if (!str.equals("ideal")) {
                        return "unknown";
                    }
                    break;
                case 1251821346:
                    str2 = "multibanco";
                    if (!str.equals("multibanco")) {
                        return "unknown";
                    }
                    break;
                case 1636477296:
                    str2 = "sepa_debit";
                    if (!str.equals("sepa_debit")) {
                        return "unknown";
                    }
                    break;
                default:
                    return "unknown";
            }
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Source fromCardJson(JSONObject jSONObject) {
            return new Source(StripeJsonUtils.optString(jSONObject, "id"), null, null, null, null, null, null, null, null, null, null, null, null, new SourceCardDataJsonParser().parse(jSONObject), "card", "card", null, null, null, null, null, 2039806, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final Source fromSourceJson(JSONObject jSONObject) {
            SourceTypeModel sourceTypeModel;
            Source.CodeVerification codeVerification;
            Source.CodeVerification codeVerification2;
            Source.Owner owner;
            Source.Owner owner2;
            Source.Receiver receiver;
            Source.Receiver receiver2;
            Source.Redirect redirect;
            Source.Redirect redirect2;
            WeChat weChat;
            Source.Klarna klarna;
            Parcelable parcelable;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4;
            JSONObject optJSONObject5;
            SourceTypeModel sourceTypeModel2;
            JSONObject optJSONObject6;
            String optString = StripeJsonUtils.optString(jSONObject, "type");
            if (optString == null) {
                optString = "unknown";
            }
            String asSourceType = asSourceType(optString);
            StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
            Map jsonObjectToMap = stripeJsonUtils.jsonObjectToMap(jSONObject.optJSONObject(optString));
            if (SourceJsonParser.MODELED_TYPES.contains(optString)) {
                if (jSONObject.has(optString)) {
                    switch (optString.hashCode()) {
                        case -808719889:
                            if (optString.equals(SourceJsonParser.FIELD_RECEIVER) && (optJSONObject = jSONObject.optJSONObject(SourceJsonParser.FIELD_RECEIVER)) != null) {
                                Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(FIELD_RECEIVER)");
                                parcelable = new ReceiverJsonParser().parse(optJSONObject);
                                break;
                            }
                            parcelable = null;
                            break;
                        case -776144932:
                            if (optString.equals("redirect") && (optJSONObject2 = jSONObject.optJSONObject("redirect")) != null) {
                                Intrinsics.checkNotNullExpressionValue(optJSONObject2, "optJSONObject(FIELD_REDIRECT)");
                                parcelable = new RedirectJsonParser().parse(optJSONObject2);
                                break;
                            }
                            parcelable = null;
                            break;
                        case 3046160:
                            if (optString.equals("card") && (optJSONObject3 = jSONObject.optJSONObject("card")) != null) {
                                Intrinsics.checkNotNullExpressionValue(optJSONObject3, "optJSONObject(Source.SourceType.CARD)");
                                parcelable = new SourceCardDataJsonParser().parse(optJSONObject3);
                                break;
                            }
                            parcelable = null;
                            break;
                        case 106164915:
                            if (optString.equals(SourceJsonParser.FIELD_OWNER) && (optJSONObject4 = jSONObject.optJSONObject(SourceJsonParser.FIELD_OWNER)) != null) {
                                Intrinsics.checkNotNullExpressionValue(optJSONObject4, "optJSONObject(FIELD_OWNER)");
                                parcelable = new OwnerJsonParser().parse(optJSONObject4);
                                break;
                            }
                            parcelable = null;
                            break;
                        case 1615551277:
                            if (optString.equals(SourceJsonParser.FIELD_CODE_VERIFICATION) && (optJSONObject5 = jSONObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION)) != null) {
                                Intrinsics.checkNotNullExpressionValue(optJSONObject5, "optJSONObject(FIELD_CODE_VERIFICATION)");
                                parcelable = new CodeVerificationJsonParser().parse(optJSONObject5);
                                break;
                            }
                            parcelable = null;
                            break;
                        case 1636477296:
                            if (optString.equals("sepa_debit") && (optJSONObject6 = jSONObject.optJSONObject("sepa_debit")) != null) {
                                Intrinsics.checkNotNullExpressionValue(optJSONObject6, "optJSONObject(Source.SourceType.SEPA_DEBIT)");
                                parcelable = new SourceSepaDebitDataJsonParser().parse(optJSONObject6);
                                break;
                            }
                            parcelable = null;
                            break;
                        default:
                            parcelable = null;
                            break;
                    }
                    if (!(parcelable instanceof SourceTypeModel)) {
                        parcelable = null;
                    }
                    sourceTypeModel2 = (SourceTypeModel) parcelable;
                } else {
                    sourceTypeModel2 = null;
                }
                sourceTypeModel = sourceTypeModel2;
            } else {
                sourceTypeModel = null;
            }
            String optString2 = StripeJsonUtils.optString(jSONObject, "id");
            Long optLong = stripeJsonUtils.optLong(jSONObject, SourceJsonParser.FIELD_AMOUNT);
            String optString3 = StripeJsonUtils.optString(jSONObject, "client_secret");
            if (jSONObject.has(SourceJsonParser.FIELD_CODE_VERIFICATION)) {
                JSONObject optJSONObject7 = jSONObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION);
                if (optJSONObject7 != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONObject7, "optJSONObject(FIELD_CODE_VERIFICATION)");
                    codeVerification = new CodeVerificationJsonParser().parse(optJSONObject7);
                } else {
                    codeVerification = null;
                }
                if (!(codeVerification instanceof Source.CodeVerification)) {
                    codeVerification = null;
                }
                codeVerification2 = codeVerification;
            } else {
                codeVerification2 = null;
            }
            Long optLong2 = stripeJsonUtils.optLong(jSONObject, "created");
            String optString4 = StripeJsonUtils.optString(jSONObject, SourceJsonParser.FIELD_CURRENCY);
            Source.Flow fromCode = Source.Flow.Companion.fromCode(StripeJsonUtils.optString(jSONObject, SourceJsonParser.FIELD_FLOW));
            boolean optBoolean = jSONObject.optBoolean(SourceJsonParser.FIELD_LIVEMODE);
            if (jSONObject.has(SourceJsonParser.FIELD_OWNER)) {
                JSONObject optJSONObject8 = jSONObject.optJSONObject(SourceJsonParser.FIELD_OWNER);
                if (optJSONObject8 != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONObject8, "optJSONObject(FIELD_OWNER)");
                    owner = new OwnerJsonParser().parse(optJSONObject8);
                } else {
                    owner = null;
                }
                if (!(owner instanceof Source.Owner)) {
                    owner = null;
                }
                owner2 = owner;
            } else {
                owner2 = null;
            }
            if (jSONObject.has(SourceJsonParser.FIELD_RECEIVER)) {
                JSONObject optJSONObject9 = jSONObject.optJSONObject(SourceJsonParser.FIELD_RECEIVER);
                if (optJSONObject9 != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONObject9, "optJSONObject(FIELD_RECEIVER)");
                    receiver = new ReceiverJsonParser().parse(optJSONObject9);
                } else {
                    receiver = null;
                }
                if (!(receiver instanceof Source.Receiver)) {
                    receiver = null;
                }
                receiver2 = receiver;
            } else {
                receiver2 = null;
            }
            if (jSONObject.has("redirect")) {
                JSONObject optJSONObject10 = jSONObject.optJSONObject("redirect");
                if (optJSONObject10 != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONObject10, "optJSONObject(FIELD_REDIRECT)");
                    redirect = new RedirectJsonParser().parse(optJSONObject10);
                } else {
                    redirect = null;
                }
                if (!(redirect instanceof Source.Redirect)) {
                    redirect = null;
                }
                redirect2 = redirect;
            } else {
                redirect2 = null;
            }
            JSONObject optJSONObject11 = jSONObject.optJSONObject(SourceJsonParser.FIELD_SOURCE_ORDER);
            SourceOrder parse = optJSONObject11 != null ? new SourceOrderJsonParser().parse(optJSONObject11) : null;
            String optString5 = StripeJsonUtils.optString(jSONObject, SourceJsonParser.FIELD_STATEMENT_DESCRIPTOR);
            Source.Status fromCode2 = Source.Status.Companion.fromCode(StripeJsonUtils.optString(jSONObject, SourceJsonParser.FIELD_STATUS));
            Source.Usage fromCode3 = Source.Usage.Companion.fromCode(StripeJsonUtils.optString(jSONObject, "usage"));
            if (Intrinsics.areEqual("wechat", asSourceType)) {
                WeChatJsonParser weChatJsonParser = new WeChatJsonParser();
                JSONObject optJSONObject12 = jSONObject.optJSONObject("wechat");
                if (optJSONObject12 == null) {
                    optJSONObject12 = new JSONObject();
                }
                weChat = weChatJsonParser.parse(optJSONObject12);
            } else {
                weChat = null;
            }
            if (Intrinsics.areEqual("klarna", asSourceType)) {
                KlarnaJsonParser klarnaJsonParser = new KlarnaJsonParser();
                JSONObject optJSONObject13 = jSONObject.optJSONObject("klarna");
                if (optJSONObject13 == null) {
                    optJSONObject13 = new JSONObject();
                }
                klarna = klarnaJsonParser.parse(optJSONObject13);
            } else {
                klarna = null;
            }
            return new Source(optString2, optLong, optString3, codeVerification2, optLong2, optString4, fromCode, Boolean.valueOf(optBoolean), owner2, receiver2, redirect2, fromCode2, jsonObjectToMap, sourceTypeModel, asSourceType, optString, fromCode3, weChat, klarna, parse, optString5);
        }

        private final /* synthetic */ <T extends StripeModel> T optStripeJsonModel(JSONObject jSONObject, String str) {
            JSONObject optJSONObject;
            T parse;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            JSONObject optJSONObject4;
            JSONObject optJSONObject5;
            JSONObject optJSONObject6;
            T t = null;
            if (!jSONObject.has(str)) {
                return null;
            }
            switch (str.hashCode()) {
                case -808719889:
                    if (str.equals(SourceJsonParser.FIELD_RECEIVER) && (optJSONObject = jSONObject.optJSONObject(SourceJsonParser.FIELD_RECEIVER)) != null) {
                        parse = new ReceiverJsonParser().parse(optJSONObject);
                        t = parse;
                        break;
                    }
                    break;
                case -776144932:
                    if (str.equals("redirect") && (optJSONObject2 = jSONObject.optJSONObject("redirect")) != null) {
                        parse = new RedirectJsonParser().parse(optJSONObject2);
                        t = parse;
                        break;
                    }
                    break;
                case 3046160:
                    if (str.equals("card") && (optJSONObject3 = jSONObject.optJSONObject("card")) != null) {
                        parse = new SourceCardDataJsonParser().parse(optJSONObject3);
                        t = parse;
                        break;
                    }
                    break;
                case 106164915:
                    if (str.equals(SourceJsonParser.FIELD_OWNER) && (optJSONObject4 = jSONObject.optJSONObject(SourceJsonParser.FIELD_OWNER)) != null) {
                        parse = new OwnerJsonParser().parse(optJSONObject4);
                        t = parse;
                        break;
                    }
                    break;
                case 1615551277:
                    if (str.equals(SourceJsonParser.FIELD_CODE_VERIFICATION) && (optJSONObject5 = jSONObject.optJSONObject(SourceJsonParser.FIELD_CODE_VERIFICATION)) != null) {
                        parse = new CodeVerificationJsonParser().parse(optJSONObject5);
                        t = parse;
                        break;
                    }
                    break;
                case 1636477296:
                    if (str.equals("sepa_debit") && (optJSONObject6 = jSONObject.optJSONObject("sepa_debit")) != null) {
                        parse = new SourceSepaDebitDataJsonParser().parse(optJSONObject6);
                        t = parse;
                        break;
                    }
                    break;
            }
            Intrinsics.reifiedOperationMarker(2, "T");
            return t;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Klarna;", "()V", "parse", "json", "Lorg/json/JSONObject;", "parseSet", "", "", "key", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class KlarnaJsonParser implements ModelJsonParser<Source.Klarna> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_CLIENT_TOKEN = "client_token";
        @Deprecated
        private static final String FIELD_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
        @Deprecated
        private static final String FIELD_FIRST_NAME = "first_name";
        @Deprecated
        private static final String FIELD_LAST_NAME = "last_name";
        @Deprecated
        private static final String FIELD_PAYMENT_METHOD_CATEGORIES = "payment_method_categories";
        @Deprecated
        private static final String FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE = "pay_later_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_LATER_ASSET_URLS_STANDARD = "pay_later_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_LATER_NAME = "pay_later_name";
        @Deprecated
        private static final String FIELD_PAY_LATER_REDIRECT_URL = "pay_later_redirect_url";
        @Deprecated
        private static final String FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE = "pay_now_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_NOW_ASSET_URLS_STANDARD = "pay_now_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_NOW_NAME = "pay_now_name";
        @Deprecated
        private static final String FIELD_PAY_NOW_REDIRECT_URL = "pay_now_redirect_url";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE = "pay_over_time_asset_urls_descriptive";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD = "pay_over_time_asset_urls_standard";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_NAME = "pay_over_time_name";
        @Deprecated
        private static final String FIELD_PAY_OVER_TIME_REDIRECT_URL = "pay_over_time_redirect_url";
        @Deprecated
        private static final String FIELD_PURCHASE_COUNTRY = "purchase_country";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser$Companion;", "", "()V", "FIELD_CLIENT_TOKEN", "", "FIELD_CUSTOM_PAYMENT_METHODS", "FIELD_FIRST_NAME", "FIELD_LAST_NAME", "FIELD_PAYMENT_METHOD_CATEGORIES", "FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_LATER_ASSET_URLS_STANDARD", "FIELD_PAY_LATER_NAME", "FIELD_PAY_LATER_REDIRECT_URL", "FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_NOW_ASSET_URLS_STANDARD", "FIELD_PAY_NOW_NAME", "FIELD_PAY_NOW_REDIRECT_URL", "FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD", "FIELD_PAY_OVER_TIME_NAME", "FIELD_PAY_OVER_TIME_REDIRECT_URL", "FIELD_PURCHASE_COUNTRY", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
            r7 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r0, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Set<String> parseSet(JSONObject jSONObject, String str) {
            Set<String> emptySet;
            List split$default;
            String optString = StripeJsonUtils.optString(jSONObject, str);
            Set<String> set = (optString == null || split$default == null) ? null : CollectionsKt___CollectionsKt.toSet(split$default);
            if (set == null) {
                emptySet = SetsKt__SetsKt.emptySet();
                return emptySet;
            }
            return set;
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Klarna parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.Klarna(StripeJsonUtils.optString(json, FIELD_FIRST_NAME), StripeJsonUtils.optString(json, FIELD_LAST_NAME), StripeJsonUtils.optString(json, FIELD_PURCHASE_COUNTRY), StripeJsonUtils.optString(json, FIELD_CLIENT_TOKEN), StripeJsonUtils.optString(json, FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_NOW_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_NOW_NAME), StripeJsonUtils.optString(json, FIELD_PAY_NOW_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_LATER_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_LATER_NAME), StripeJsonUtils.optString(json, FIELD_PAY_LATER_REDIRECT_URL), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_NAME), StripeJsonUtils.optString(json, FIELD_PAY_OVER_TIME_REDIRECT_URL), parseSet(json, FIELD_PAYMENT_METHOD_CATEGORIES), parseSet(json, FIELD_CUSTOM_PAYMENT_METHODS));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Owner;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class OwnerJsonParser implements ModelJsonParser<Source.Owner> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_EMAIL = "email";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";
        @Deprecated
        private static final String FIELD_VERIFIED_ADDRESS = "verified_address";
        @Deprecated
        private static final String FIELD_VERIFIED_EMAIL = "verified_email";
        @Deprecated
        private static final String FIELD_VERIFIED_NAME = "verified_name";
        @Deprecated
        private static final String FIELD_VERIFIED_PHONE = "verified_phone";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "FIELD_VERIFIED_ADDRESS", "FIELD_VERIFIED_EMAIL", "FIELD_VERIFIED_NAME", "FIELD_VERIFIED_PHONE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Owner parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            Address parse = optJSONObject != null ? new AddressJsonParser().parse(optJSONObject) : null;
            String optString = StripeJsonUtils.optString(json, "email");
            String optString2 = StripeJsonUtils.optString(json, "name");
            String optString3 = StripeJsonUtils.optString(json, "phone");
            JSONObject optJSONObject2 = json.optJSONObject(FIELD_VERIFIED_ADDRESS);
            return new Source.Owner(parse, optString, optString2, optString3, optJSONObject2 != null ? new AddressJsonParser().parse(optJSONObject2) : null, StripeJsonUtils.optString(json, FIELD_VERIFIED_EMAIL), StripeJsonUtils.optString(json, FIELD_VERIFIED_NAME), StripeJsonUtils.optString(json, FIELD_VERIFIED_PHONE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Receiver;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ReceiverJsonParser implements ModelJsonParser<Source.Receiver> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_AMOUNT_CHARGED = "amount_charged";
        @Deprecated
        private static final String FIELD_AMOUNT_RECEIVED = "amount_received";
        @Deprecated
        private static final String FIELD_AMOUNT_RETURNED = "amount_returned";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_AMOUNT_CHARGED", "FIELD_AMOUNT_RECEIVED", "FIELD_AMOUNT_RETURNED", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Receiver parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.Receiver(StripeJsonUtils.optString(json, "address"), json.optLong(FIELD_AMOUNT_CHARGED), json.optLong(FIELD_AMOUNT_RECEIVED), json.optLong(FIELD_AMOUNT_RETURNED));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Source$Redirect;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class RedirectJsonParser implements ModelJsonParser<Source.Redirect> {
        public static final Companion Companion = new Companion(null);
        private static final String FIELD_RETURN_URL = "return_url";
        private static final String FIELD_STATUS = "status";
        private static final String FIELD_URL = "url";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser$Companion;", "", "()V", "FIELD_RETURN_URL", "", "FIELD_STATUS", "FIELD_URL", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public Source.Redirect parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Source.Redirect(StripeJsonUtils.optString(json, "return_url"), Source.Redirect.Status.Companion.fromCode(StripeJsonUtils.optString(json, FIELD_STATUS)), StripeJsonUtils.optString(json, "url"));
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"card", "sepa_debit"});
        MODELED_TYPES = of;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Source parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String optString = json.optString(FIELD_OBJECT);
        if (Intrinsics.areEqual(optString, "card")) {
            return Companion.fromCardJson(json);
        }
        if (Intrinsics.areEqual(optString, "source")) {
            return Companion.fromSourceJson(json);
        }
        return null;
    }
}
