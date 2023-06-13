package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.response.Action;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Token;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002FGBC\b\u0001\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b=\u0010>B)\b\u0017\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b=\u0010BB\u001f\b\u0010\u0012\u0006\u0010@\u001a\u00020?\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;¢\u0006\u0004\b=\u0010CB1\b\u0011\u0012\u0006\u0010@\u001a\u00020?\u0012\u000e\b\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030D\u0012\u000e\b\u0001\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b=\u0010EJH\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J!\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ'\u0010!\u001a\u00020\u00112\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b%\u0010#J\u001d\u0010(\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b'\u0010#J\u001b\u0010,\u001a\u00020\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b-\u0010+JK\u00101\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b/\u00100R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u0006H"}, m28432d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "", "", "productUsageTokens", "sourceType", "Lcom/stripe/android/model/Token$Type;", "tokenType", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "threeDS2UiType", "", "", "additionalParams", "createTokenTypeParam", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "event", "uiTypeCode", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "create3ds2Challenge$payments_core_release", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "create3ds2Challenge", "createTokenCreation$payments_core_release", "(Ljava/util/Set;Lcom/stripe/android/model/Token$Type;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createTokenCreation", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "createPaymentMethodCreation$payments_core_release", "(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createPaymentMethodCreation", "createSourceCreation$payments_core_release", "createSourceCreation", "createAddSource$payments_core_release", "(Ljava/util/Set;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createAddSource", "createDeleteSource$payments_core_release", "(Ljava/util/Set;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createDeleteSource", "createAttachPaymentMethod$payments_core_release", "createAttachPaymentMethod", "createDetachPaymentMethod$payments_core_release", "createDetachPaymentMethod", Action.PAYMENT_METHOD_TYPE, "createPaymentIntentConfirmation$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createPaymentIntentConfirmation", "createSetupIntentConfirmation$payments_core_release", "createSetupIntentConfirmation", "createRequest$payments_core_release", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;)Lcom/stripe/android/core/networking/AnalyticsRequest;", "createRequest", "defaultProductUsageTokens", "Ljava/util/Set;", "getDefaultProductUsageTokens$payments_core_release", "()Ljava/util/Set;", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/content/pm/PackageInfo;", "packageInfo", "packageName", "LY94;", "publishableKeyProvider", "<init>", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;LY94;Ljava/util/Set;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "publishableKey", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V", "(Landroid/content/Context;LY94;)V", "Lkotlin/Function0;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "Companion", "ThreeDS2UiType", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentAnalyticsRequestFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAnalyticsRequestFactory.kt\ncom/stripe/android/networking/PaymentAnalyticsRequestFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentAnalyticsRequestFactory extends AnalyticsRequestFactory {
    public static final String FIELD_3DS2_UI_TYPE = "3ds2_ui_type";
    public static final String FIELD_PRODUCT_USAGE = "product_usage";
    public static final String FIELD_SOURCE_TYPE = "source_type";
    public static final String FIELD_TOKEN_TYPE = "token_type";
    private final Set<String> defaultProductUsageTokens;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.networking.PaymentAnalyticsRequestFactory$1 */
    /* loaded from: classes7.dex */
    public static final class C190921 extends Lambda implements Function0<String> {
        final /* synthetic */ String $publishableKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190921(String str) {
            super(0);
            this.$publishableKey = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$publishableKey;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$Companion;", "", "()V", "FIELD_3DS2_UI_TYPE", "", "FIELD_PRODUCT_USAGE", "FIELD_SOURCE_TYPE", "FIELD_TOKEN_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "typeName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "None", "Text", "SingleSelect", "MultiSelect", "Oob", "Html", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum ThreeDS2UiType {
        None(null, "none"),
        Text("01", Entry.TYPE_TEXT),
        SingleSelect("02", "single_select"),
        MultiSelect("03", "multi_select"),
        Oob("04", "oob"),
        Html("05", "html");
        
        public static final Companion Companion = new Companion(null);
        private final String code;
        private final String typeName;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;", "", "()V", "fromUiTypeCode", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "uiTypeCode", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPaymentAnalyticsRequestFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAnalyticsRequestFactory.kt\ncom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,258:1\n1282#2,2:259\n*S KotlinDebug\n*F\n+ 1 PaymentAnalyticsRequestFactory.kt\ncom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion\n*L\n245#1:259,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ThreeDS2UiType fromUiTypeCode(String str) {
                ThreeDS2UiType threeDS2UiType;
                ThreeDS2UiType[] values = ThreeDS2UiType.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        threeDS2UiType = values[i];
                        if (Intrinsics.areEqual(threeDS2UiType.code, str)) {
                            break;
                        }
                        i++;
                    } else {
                        threeDS2UiType = null;
                        break;
                    }
                }
                if (threeDS2UiType == null) {
                    return ThreeDS2UiType.None;
                }
                return threeDS2UiType;
            }

            private Companion() {
            }
        }

        ThreeDS2UiType(String str, String str2) {
            this.code = str;
            this.typeName = str2;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.typeName;
        }
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Y94 y94, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, y94, (i & 16) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    private final Map<String, Object> additionalParams(Set<String> set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType) {
        Set plus;
        Map map;
        Map map2;
        Map plus2;
        Map plus3;
        Map<String, Object> plus4;
        List list;
        plus = SetsKt___SetsKt.plus((Set) this.defaultProductUsageTokens, (Iterable) set);
        Map map3 = null;
        if (plus.isEmpty()) {
            plus = null;
        }
        if (plus != null) {
            list = CollectionsKt___CollectionsKt.toList(plus);
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(FIELD_PRODUCT_USAGE, list));
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        if (str != null) {
            map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(FIELD_SOURCE_TYPE, str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(map, map2);
        plus3 = MapsKt__MapsKt.plus(plus2, createTokenTypeParam(str, type));
        if (threeDS2UiType != null) {
            map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(FIELD_3DS2_UI_TYPE, threeDS2UiType.toString()));
        }
        if (map3 == null) {
            map3 = MapsKt__MapsKt.emptyMap();
        }
        plus4 = MapsKt__MapsKt.plus(plus3, map3);
        return plus4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map additionalParams$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType, int i, Object obj) {
        if ((i & 1) != 0) {
            set = SetsKt__SetsKt.emptySet();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            type = null;
        }
        if ((i & 8) != 0) {
            threeDS2UiType = null;
        }
        return paymentAnalyticsRequestFactory.additionalParams(set, str, type, threeDS2UiType);
    }

    public static /* synthetic */ AnalyticsRequest createAddSource$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set set, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = SetsKt__SetsKt.emptySet();
        }
        return paymentAnalyticsRequestFactory.createAddSource$payments_core_release(set, str);
    }

    public static /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return paymentAnalyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(str);
    }

    public static /* synthetic */ AnalyticsRequest createRequest$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, PaymentAnalyticsEvent paymentAnalyticsEvent, Set set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType, int i, Object obj) {
        String str2;
        Token.Type type2;
        ThreeDS2UiType threeDS2UiType2;
        if ((i & 2) != 0) {
            set = SetsKt__SetsKt.emptySet();
        }
        Set set2 = set;
        if ((i & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 8) != 0) {
            type2 = null;
        } else {
            type2 = type;
        }
        if ((i & 16) != 0) {
            threeDS2UiType2 = null;
        } else {
            threeDS2UiType2 = threeDS2UiType;
        }
        return paymentAnalyticsRequestFactory.createRequest$payments_core_release(paymentAnalyticsEvent, set2, str2, type2, threeDS2UiType2);
    }

    public static /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = SetsKt__SetsKt.emptySet();
        }
        return paymentAnalyticsRequestFactory.createSourceCreation$payments_core_release(str, set);
    }

    private final Map<String, String> createTokenTypeParam(String str, Token.Type type) {
        String str2;
        Map<String, String> emptyMap;
        if (type != null) {
            str2 = type.getCode();
        } else if (str == null) {
            str2 = "unknown";
        } else {
            str2 = null;
        }
        Map<String, String> mapOf = str2 != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(FIELD_TOKEN_TYPE, str2)) : null;
        if (mapOf == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        return mapOf;
    }

    public static /* synthetic */ Map createTokenTypeParam$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, Token.Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            type = null;
        }
        return paymentAnalyticsRequestFactory.createTokenTypeParam(str, type);
    }

    public final /* synthetic */ AnalyticsRequest create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent event, String str) {
        Intrinsics.checkNotNullParameter(event, "event");
        return createRequest$payments_core_release$default(this, event, null, null, null, ThreeDS2UiType.Companion.fromUiTypeCode(str), 14, null);
    }

    public final /* synthetic */ AnalyticsRequest createAddSource$payments_core_release(Set productUsageTokens, String sourceType) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerAddSource, productUsageTokens, sourceType, null, null, 24, null);
    }

    public final /* synthetic */ AnalyticsRequest createAttachPaymentMethod$payments_core_release(Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerAttachPaymentMethod, productUsageTokens, null, null, null, 28, null);
    }

    public final /* synthetic */ AnalyticsRequest createDeleteSource$payments_core_release(Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerDeleteSource, productUsageTokens, null, null, null, 28, null);
    }

    public final /* synthetic */ AnalyticsRequest createDetachPaymentMethod$payments_core_release(Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerDetachPaymentMethod, productUsageTokens, null, null, null, 28, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release(String str) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentIntentConfirm, null, str, null, null, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentMethodCreation$payments_core_release(String str, Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentMethodCreate, productUsageTokens, str, null, null, 24, null);
    }

    public final /* synthetic */ AnalyticsRequest createRequest$payments_core_release(PaymentAnalyticsEvent event, Set productUsageTokens, String str, Token.Type type, ThreeDS2UiType threeDS2UiType) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest(event, additionalParams(productUsageTokens, str, type, threeDS2UiType));
    }

    public final /* synthetic */ AnalyticsRequest createSetupIntentConfirmation$payments_core_release(String str) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.SetupIntentConfirm, null, str, null, null, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release(String sourceType, Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.SourceCreate, productUsageTokens, sourceType, null, null, 24, null);
    }

    public final /* synthetic */ AnalyticsRequest createTokenCreation$payments_core_release(Set productUsageTokens, Token.Type tokenType) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.TokenCreate, productUsageTokens, null, tokenType, null, 20, null);
    }

    public final Set<String> getDefaultProductUsageTokens$payments_core_release() {
        return this.defaultProductUsageTokens;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Y94<String> publishableKeyProvider, Set<String> defaultProductUsageTokens) {
        super(packageManager, packageInfo, packageName, publishableKeyProvider);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.defaultProductUsageTokens = defaultProductUsageTokens;
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(Context context, String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(Context context, String publishableKey, Set<String> defaultProductUsageTokens) {
        this(context, new C190921(publishableKey), defaultProductUsageTokens);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentAnalyticsRequestFactory(Context context, Y94<String> publishableKeyProvider) {
        this(r2, r3, r8, publishableKeyProvider, r6);
        Set emptySet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        PackageInfo packageInfo = contextUtils.getPackageInfo(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
        packageName = packageName == null ? "" : packageName;
        emptySet = SetsKt__SetsKt.emptySet();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentAnalyticsRequestFactory(Context context, final Function0<String> publishableKeyProvider, Set<String> defaultProductUsageTokens) {
        this(r2, r3, r8 == null ? "" : r8, new Y94() { // from class: zL3
            @Override // p000.Y94
            public final Object get() {
                String _init_$lambda$0;
                _init_$lambda$0 = PaymentAnalyticsRequestFactory._init_$lambda$0(Function0.this);
                return _init_$lambda$0;
            }
        }, defaultProductUsageTokens);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        PackageInfo packageInfo = contextUtils.getPackageInfo(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
    }
}
