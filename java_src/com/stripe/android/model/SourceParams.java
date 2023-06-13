package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.Address;
import com.stripe.android.model.KlarnaSourceParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrderParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;
import p000.RE3;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b;\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0006lmnopqB¹\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b¢\u0006\u0002\u0010\u001cJ\t\u0010L\u001a\u00020\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\t\u0010P\u001a\u00020\u0019HÂ\u0003J\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bHÀ\u0003¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\bTJ\u0010\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012HÆ\u0003JÂ\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bHÆ\u0001¢\u0006\u0002\u0010]J\t\u0010^\u001a\u00020_HÖ\u0001J\u0013\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010c\u001a\u00020_HÖ\u0001J\u001e\u0010d\u001a\u00020\u00002\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u0015J\u0014\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0\u0015H\u0016J\t\u0010f\u001a\u00020\u0004HÖ\u0001J\u0019\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020_HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010#0\u00158F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010)\"\u0004\b8\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010)\"\u0004\b>\u0010+R\u0017\u0010?\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\bB\u0010)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006r"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "typeRaw", "", "typeData", "Lcom/stripe/android/model/SourceParams$TypeData;", SourceParams.PARAM_AMOUNT, "", SourceParams.PARAM_CURRENCY, SourceParams.PARAM_OWNER, "Lcom/stripe/android/model/SourceParams$OwnerParams;", "usage", "Lcom/stripe/android/model/Source$Usage;", "returnUrl", SourceParams.PARAM_FLOW, "Lcom/stripe/android/model/SourceParams$Flow;", "sourceOrder", "Lcom/stripe/android/model/SourceOrderParams;", SourceParams.PARAM_TOKEN, SourceParams.PARAM_METADATA, "", "weChatParams", "Lcom/stripe/android/model/SourceParams$WeChatParams;", "apiParams", "Lcom/stripe/android/model/SourceParams$ApiParams;", "attribution", "", "(Ljava/lang/String;Lcom/stripe/android/model/SourceParams$TypeData;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$OwnerParams;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$Flow;Lcom/stripe/android/model/SourceOrderParams;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/SourceParams$WeChatParams;Lcom/stripe/android/model/SourceParams$ApiParams;Ljava/util/Set;)V", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "apiParameterMap", "", "getApiParameterMap", "()Ljava/util/Map;", "getAttribution$payments_core_release", "()Ljava/util/Set;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getFlow", "()Lcom/stripe/android/model/SourceParams$Flow;", "setFlow", "(Lcom/stripe/android/model/SourceParams$Flow;)V", "getMetadata", "setMetadata", "(Ljava/util/Map;)V", "getOwner", "()Lcom/stripe/android/model/SourceParams$OwnerParams;", "setOwner", "(Lcom/stripe/android/model/SourceParams$OwnerParams;)V", "getReturnUrl", "setReturnUrl", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrderParams;", "setSourceOrder", "(Lcom/stripe/android/model/SourceOrderParams;)V", "getToken", "setToken", "type", "getType$annotations", "()V", "getType", "getTypeData$payments_core_release", "()Lcom/stripe/android/model/SourceParams$TypeData;", "setTypeData$payments_core_release", "(Lcom/stripe/android/model/SourceParams$TypeData;)V", "getTypeRaw", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "setUsage", "(Lcom/stripe/android/model/Source$Usage;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component14$payments_core_release", "component2", "component2$payments_core_release", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/SourceParams$TypeData;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$OwnerParams;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$Flow;Lcom/stripe/android/model/SourceOrderParams;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/SourceParams$WeChatParams;Lcom/stripe/android/model/SourceParams$ApiParams;Ljava/util/Set;)Lcom/stripe/android/model/SourceParams;", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "setApiParameterMap", "toParamMap", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ApiParams", "Companion", "Flow", "OwnerParams", "TypeData", "WeChatParams", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SourceParams implements StripeParamsModel, Parcelable {
    private static final String PARAM_AMOUNT = "amount";
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_CURRENCY = "currency";
    private static final String PARAM_FLOW = "flow";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_OWNER = "owner";
    private static final String PARAM_REDIRECT = "redirect";
    private static final String PARAM_RETURN_URL = "return_url";
    private static final String PARAM_SOURCE_ORDER = "source_order";
    private static final String PARAM_TOKEN = "token";
    private static final String PARAM_TYPE = "type";
    private static final String PARAM_USAGE = "usage";
    private static final String PARAM_WECHAT = "wechat";
    private Long amount;
    private ApiParams apiParams;
    private final Set<String> attribution;
    private String currency;
    private Flow flow;
    private Map<String, String> metadata;
    private OwnerParams owner;
    private String returnUrl;
    private SourceOrderParams sourceOrder;
    private String token;
    private TypeData typeData;
    private final String typeRaw;
    private Source.Usage usage;
    private WeChatParams weChatParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SourceParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams;", "Landroid/os/Parcelable;", "value", "", "", "", "(Ljava/util/Map;)V", "getValue", "()Ljava/util/Map;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ApiParams implements Parcelable {
        private final Map<String, Object> value;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ApiParams> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams$Companion;", "LRE3;", "Lcom/stripe/android/model/SourceParams$ApiParams;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "write", "create", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class Companion implements RE3<ApiParams> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: newArray */
            public ApiParams[] m116577newArray(int i) {
                return (ApiParams[]) RE3.C7102a.m87008a(this, i);
            }

            private Companion() {
            }

            /* renamed from: create */
            public ApiParams m116576create(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                String readString = parcel.readString();
                Map jsonObjectToMap = stripeJsonUtils.jsonObjectToMap(readString != null ? new JSONObject(readString) : null);
                if (jsonObjectToMap == null) {
                    jsonObjectToMap = MapsKt__MapsKt.emptyMap();
                }
                return new ApiParams(jsonObjectToMap);
            }

            public void write(ApiParams apiParams, Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(apiParams, "<this>");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                JSONObject mapToJsonObject = StripeJsonUtils.INSTANCE.mapToJsonObject(apiParams.getValue());
                parcel.writeString(mapToJsonObject != null ? mapToJsonObject.toString() : null);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ApiParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ApiParams.Companion.m116576create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams[] newArray(int i) {
                return new ApiParams[i];
            }
        }

        public ApiParams() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiParams copy$default(ApiParams apiParams, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = apiParams.value;
            }
            return apiParams.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.value;
        }

        public final ApiParams copy(Map<String, ? extends Object> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ApiParams(value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiParams) && Intrinsics.areEqual(this.value, ((ApiParams) obj).value);
        }

        public final Map<String, Object> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            Map<String, Object> map = this.value;
            return "ApiParams(value=" + map + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Companion.write(this, out, i);
        }

        public ApiParams(Map<String, ? extends Object> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public /* synthetic */ ApiParams(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map);
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J:\u0010\u0017\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J:\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0004H\u0007J.\u0010%\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J.\u0010&\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J<\u0010'\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010)\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+H\u0007J\u0018\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0007J\"\u0010/\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J4\u00100\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u001e\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004022\b\b\u0001\u00103\u001a\u00020\u0004H\u0007J<\u00104\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\b\b\u0001\u00109\u001a\u00020\u0004H\u0007JL\u00104\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0004H\u0007J0\u0010:\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u00109\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0004H\u0007J*\u0010=\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004H\u0007J\u0010\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0004H\u0007J.\u0010A\u001a\u00020\u00122\b\b\u0001\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006C"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$Companion;", "", "()V", "PARAM_AMOUNT", "", "PARAM_CLIENT_SECRET", "PARAM_CURRENCY", "PARAM_FLOW", "PARAM_METADATA", "PARAM_OWNER", "PARAM_REDIRECT", "PARAM_RETURN_URL", "PARAM_SOURCE_ORDER", "PARAM_TOKEN", "PARAM_TYPE", "PARAM_USAGE", "PARAM_WECHAT", "createAlipayReusableParams", "Lcom/stripe/android/model/SourceParams;", SourceParams.PARAM_CURRENCY, "name", "email", "returnUrl", "createAlipaySingleUseParams", SourceParams.PARAM_AMOUNT, "", "createBancontactParams", "statementDescriptor", "preferredLanguage", "createCardParams", "cardParams", "Lcom/stripe/android/model/CardParams;", "createCardParamsFromGooglePay", "googlePayPaymentData", "Lorg/json/JSONObject;", "createCustomParams", "type", "createEPSParams", "createGiropayParams", "createIdealParams", "bank", "createKlarna", "klarnaParams", "Lcom/stripe/android/model/KlarnaSourceParams;", "createMasterpassParams", "transactionId", "cartId", "createMultibancoParams", "createP24Params", "createRetrieveSourceParams", "", "clientSecret", "createSepaDebitParams", "iban", "addressLine1", "city", "postalCode", "country", "createSofortParams", "createSourceFromTokenParams", "tokenId", "createThreeDSecureParams", "cardId", "createVisaCheckoutParams", "callId", "createWeChatPayParams", "weChatAppId", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSourceParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceParams.kt\ncom/stripe/android/model/SourceParams$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1160:1\n2976#2,5:1161\n1549#2:1166\n1620#2,3:1167\n*S KotlinDebug\n*F\n+ 1 SourceParams.kt\ncom/stripe/android/model/SourceParams$Companion\n*L\n444#1:1161,5\n446#1:1166\n446#1:1167,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KlarnaSourceParams.LineItem.Type.values().length];
                try {
                    iArr[KlarnaSourceParams.LineItem.Type.Sku.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[KlarnaSourceParams.LineItem.Type.Tax.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[KlarnaSourceParams.LineItem.Type.Shipping.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SourceParams createAlipayReusableParams$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return companion.createAlipayReusableParams(str, str2, str3, str4);
        }

        public static /* synthetic */ SourceParams createEPSParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createEPSParams(j, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createGiropayParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createGiropayParams(j, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createSofortParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createSofortParams(j, str, str2, str3);
        }

        public static /* synthetic */ SourceParams createWeChatPayParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createWeChatPayParams(j, str, str2, str3);
        }

        @JvmStatic
        public final SourceParams createAlipayReusableParams(String currency, String str, String str2, String returnUrl) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new SourceParams("alipay", null, null, currency, new OwnerParams(null, str2, str, null, 9, null), Source.Usage.Reusable, returnUrl, null, null, null, null, null, null, null, 16262, null);
        }

        @JvmStatic
        public final SourceParams createAlipaySingleUseParams(long j, String currency, String str, String str2, String returnUrl) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new SourceParams("alipay", null, Long.valueOf(j), currency, new OwnerParams(null, str2, str, null, 9, null), null, returnUrl, null, null, null, null, null, null, null, 16290, null);
        }

        @JvmStatic
        public final SourceParams createBancontactParams(long j, String name, String returnUrl, String str, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new SourceParams("bancontact", new TypeData.Bancontact(str, str2), Long.valueOf(j), Source.EURO, new OwnerParams(null, null, name, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        @JvmStatic
        public final SourceParams createCardParams(CardParams cardParams) {
            Intrinsics.checkNotNullParameter(cardParams, "cardParams");
            return new SourceParams("card", new TypeData.Card(cardParams.getNumber$payments_core_release(), Integer.valueOf(cardParams.getExpMonth$payments_core_release()), Integer.valueOf(cardParams.getExpYear$payments_core_release()), cardParams.getCvc$payments_core_release()), null, null, new OwnerParams(cardParams.getAddress(), null, cardParams.getName(), null, 10, null), null, null, null, null, null, cardParams.getMetadata(), null, null, cardParams.getAttribution(), 7148, null);
        }

        @JvmStatic
        public final SourceParams createCardParamsFromGooglePay(JSONObject googlePayPaymentData) throws JSONException {
            String str;
            Set ofNotNull;
            Card card;
            TokenizationMethod tokenizationMethod;
            Intrinsics.checkNotNullParameter(googlePayPaymentData, "googlePayPaymentData");
            GooglePayResult fromJson = GooglePayResult.Companion.fromJson(googlePayPaymentData);
            Token token = fromJson.getToken();
            String str2 = null;
            if (token != null) {
                str = token.getId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str3 = str;
            if (token != null && (card = token.getCard()) != null && (tokenizationMethod = card.getTokenizationMethod()) != null) {
                str2 = tokenizationMethod.toString();
            }
            ofNotNull = SetsKt__SetsKt.setOfNotNull(str2);
            return new SourceParams("card", null, null, null, new OwnerParams(fromJson.getAddress(), fromJson.getEmail(), fromJson.getName(), fromJson.getPhoneNumber()), null, null, null, null, str3, null, null, null, ofNotNull, 7662, null);
        }

        @JvmStatic
        public final SourceParams createCustomParams(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new SourceParams(type, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
        }

        @JvmStatic
        public final SourceParams createEPSParams(long j, String name, String returnUrl, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new SourceParams("eps", new TypeData.Eps(str), Long.valueOf(j), Source.EURO, new OwnerParams(null, null, name, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        @JvmStatic
        public final SourceParams createGiropayParams(long j, String name, String returnUrl, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new SourceParams("giropay", new TypeData.Giropay(str), Long.valueOf(j), Source.EURO, new OwnerParams(null, null, name, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        @JvmStatic
        public final SourceParams createIdealParams(long j, String str, String returnUrl, String str2, String str3) {
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new SourceParams("ideal", new TypeData.Ideal(str2, str3), Long.valueOf(j), Source.EURO, new OwnerParams(null, null, str, null, 11, null), null, returnUrl, null, null, null, null, null, null, null, 16288, null);
        }

        @JvmStatic
        public final SourceParams createKlarna(String returnUrl, String currency, KlarnaSourceParams klarnaParams) {
            int collectionSizeOrDefault;
            SourceOrderParams.Item.Type type;
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(klarnaParams, "klarnaParams");
            int i = 0;
            for (KlarnaSourceParams.LineItem lineItem : klarnaParams.getLineItems()) {
                i += lineItem.getTotalAmount();
            }
            List<KlarnaSourceParams.LineItem> lineItems = klarnaParams.getLineItems();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(lineItems, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (KlarnaSourceParams.LineItem lineItem2 : lineItems) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[lineItem2.getItemType().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            type = SourceOrderParams.Item.Type.Shipping;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        type = SourceOrderParams.Item.Type.Tax;
                    }
                } else {
                    type = SourceOrderParams.Item.Type.Sku;
                }
                arrayList.add(new SourceOrderParams.Item(type, Integer.valueOf(lineItem2.getTotalAmount()), currency, lineItem2.getItemDescription(), null, lineItem2.getQuantity(), 16, null));
            }
            SourceOrderParams sourceOrderParams = new SourceOrderParams(arrayList, null, 2, null);
            Flow flow = Flow.Redirect;
            return new SourceParams("klarna", null, Long.valueOf(i), currency, new OwnerParams(klarnaParams.getBillingAddress(), klarnaParams.getBillingEmail(), null, klarnaParams.getBillingPhone(), 4, null), null, returnUrl, flow, sourceOrderParams, null, null, null, new ApiParams(klarnaParams.toParamMap()), null, 11810, null);
        }

        @JvmStatic
        public final SourceParams createMasterpassParams(String transactionId, String cartId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(cartId, "cartId");
            return new SourceParams("card", new TypeData.Masterpass(transactionId, cartId), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
        }

        @JvmStatic
        public final SourceParams createMultibancoParams(long j, String returnUrl, String email) {
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(email, "email");
            return new SourceParams("multibanco", null, Long.valueOf(j), Source.EURO, new OwnerParams(null, email, null, null, 13, null), null, returnUrl, null, null, null, null, null, null, null, 16290, null);
        }

        @JvmStatic
        public final SourceParams createP24Params(long j, String currency, String str, String email, String returnUrl) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            return new SourceParams("p24", null, Long.valueOf(j), currency, new OwnerParams(null, email, str, null, 9, null), null, returnUrl, null, null, null, null, null, null, null, 16290, null);
        }

        @JvmStatic
        public final Map<String, String> createRetrieveSourceParams(String clientSecret) {
            Map<String, String> mapOf;
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("client_secret", clientSecret));
            return mapOf;
        }

        @JvmStatic
        public final SourceParams createSepaDebitParams(String name, String iban, String str, String city, String postalCode, String country) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(iban, "iban");
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(postalCode, "postalCode");
            Intrinsics.checkNotNullParameter(country, "country");
            return createSepaDebitParams(name, iban, null, str, city, postalCode, country);
        }

        @JvmStatic
        public final SourceParams createSofortParams(long j, String returnUrl, String country, String str) {
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(country, "country");
            return new SourceParams("sofort", new TypeData.Sofort(country, str), Long.valueOf(j), Source.EURO, null, null, returnUrl, null, null, null, null, null, null, null, 16304, null);
        }

        @JvmStatic
        public final SourceParams createSourceFromTokenParams(String tokenId) {
            Intrinsics.checkNotNullParameter(tokenId, "tokenId");
            return new SourceParams("card", null, null, null, null, null, null, null, null, tokenId, null, null, null, null, 15870, null);
        }

        @JvmStatic
        public final SourceParams createThreeDSecureParams(long j, String currency, String returnUrl, String cardId) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return new SourceParams("three_d_secure", new TypeData.ThreeDSecure(cardId), Long.valueOf(j), currency, null, null, returnUrl, null, null, null, null, null, null, null, 16304, null);
        }

        @JvmStatic
        public final SourceParams createVisaCheckoutParams(String callId) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            return new SourceParams("card", new TypeData.VisaCheckout(callId), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
        }

        @JvmStatic
        public final SourceParams createWeChatPayParams(long j, String currency, String weChatAppId, String str) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(weChatAppId, "weChatAppId");
            return new SourceParams("wechat", null, Long.valueOf(j), currency, null, null, null, null, null, null, null, new WeChatParams(weChatAppId, str), null, null, 14322, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final SourceParams createSepaDebitParams(String name, String iban, String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(iban, "iban");
            return new SourceParams("sepa_debit", new TypeData.SepaDebit(iban), null, Source.EURO, new OwnerParams(new Address.Builder().setLine1(str2).setCity(str3).setPostalCode(str4).setCountry(str5).build(), str, name, null, 8, null), null, null, null, null, null, null, null, null, null, 16356, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<SourceParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            TypeData typeData = (TypeData) parcel.readParcelable(SourceParams.class.getClassLoader());
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            OwnerParams createFromParcel = parcel.readInt() == 0 ? null : OwnerParams.CREATOR.createFromParcel(parcel);
            Source.Usage valueOf2 = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            Flow valueOf3 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            SourceOrderParams createFromParcel2 = parcel.readInt() == 0 ? null : SourceOrderParams.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            WeChatParams createFromParcel3 = parcel.readInt() == 0 ? null : WeChatParams.CREATOR.createFromParcel(parcel);
            ApiParams createFromParcel4 = ApiParams.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                linkedHashSet.add(parcel.readString());
                i2++;
                readInt2 = readInt2;
            }
            return new SourceParams(readString, typeData, valueOf, readString2, createFromParcel, valueOf2, readString3, valueOf3, createFromParcel2, readString4, linkedHashMap, createFromParcel3, createFromParcel4, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams[] newArray(int i) {
            return new SourceParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$Flow;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Redirect", "Receiver", "CodeVerification", "None", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Flow {
        Redirect("redirect"),
        Receiver("receiver"),
        CodeVerification("code_verification"),
        None("none");
        
        private final String code;

        Flow(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B7\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001dJ9\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0'H\u0016J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020 HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress$payments_core_release", "()Lcom/stripe/android/model/Address;", "setAddress$payments_core_release", "(Lcom/stripe/android/model/Address;)V", "getEmail$payments_core_release", "()Ljava/lang/String;", "setEmail$payments_core_release", "(Ljava/lang/String;)V", "getName$payments_core_release", "setName$payments_core_release", "getPhone$payments_core_release", "setPhone$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class OwnerParams implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_EMAIL = "email";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        private Address address;
        private String email;
        private String name;
        private String phone;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<OwnerParams> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<OwnerParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OwnerParams(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams[] newArray(int i) {
                return new OwnerParams[i];
            }
        }

        @JvmOverloads
        public OwnerParams() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ OwnerParams copy$default(OwnerParams ownerParams, Address address, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = ownerParams.address;
            }
            if ((i & 2) != 0) {
                str = ownerParams.email;
            }
            if ((i & 4) != 0) {
                str2 = ownerParams.name;
            }
            if ((i & 8) != 0) {
                str3 = ownerParams.phone;
            }
            return ownerParams.copy(address, str, str2, str3);
        }

        public final Address component1$payments_core_release() {
            return this.address;
        }

        public final String component2$payments_core_release() {
            return this.email;
        }

        public final String component3$payments_core_release() {
            return this.name;
        }

        public final String component4$payments_core_release() {
            return this.phone;
        }

        public final OwnerParams copy(Address address, String str, String str2, String str3) {
            return new OwnerParams(address, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OwnerParams) {
                OwnerParams ownerParams = (OwnerParams) obj;
                return Intrinsics.areEqual(this.address, ownerParams.address) && Intrinsics.areEqual(this.email, ownerParams.email) && Intrinsics.areEqual(this.name, ownerParams.name) && Intrinsics.areEqual(this.phone, ownerParams.phone);
            }
            return false;
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final String getEmail$payments_core_release() {
            return this.email;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setAddress$payments_core_release(Address address) {
            this.address = address;
        }

        public final void setEmail$payments_core_release(String str) {
            this.email = str;
        }

        public final void setName$payments_core_release(String str) {
            this.name = str;
        }

        public final void setPhone$payments_core_release(String str) {
            this.phone = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map emptyMap;
            Map map;
            Map plus;
            Map map2;
            Map plus2;
            Map map3;
            Map plus3;
            Map<String, Object> plus4;
            emptyMap = MapsKt__MapsKt.emptyMap();
            Address address = this.address;
            Map map4 = null;
            if (address != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("address", address.toParamMap()));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(emptyMap, map);
            String str = this.email;
            if (str != null) {
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("email", str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            plus2 = MapsKt__MapsKt.plus(plus, map2);
            String str2 = this.name;
            if (str2 != null) {
                map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus3 = MapsKt__MapsKt.plus(plus2, map3);
            String str3 = this.phone;
            if (str3 != null) {
                map4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("phone", str3));
            }
            if (map4 == null) {
                map4 = MapsKt__MapsKt.emptyMap();
            }
            plus4 = MapsKt__MapsKt.plus(plus3, map4);
            return plus4;
        }

        public String toString() {
            Address address = this.address;
            String str = this.email;
            String str2 = this.name;
            String str3 = this.phone;
            return "OwnerParams(address=" + address + ", email=" + str + ", name=" + str2 + ", phone=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            out.writeString(this.phone);
        }

        @JvmOverloads
        public OwnerParams(Address address) {
            this(address, null, null, null, 14, null);
        }

        @JvmOverloads
        public OwnerParams(Address address, String str) {
            this(address, str, null, null, 12, null);
        }

        @JvmOverloads
        public OwnerParams(Address address, String str, String str2) {
            this(address, str, str2, null, 8, null);
        }

        @JvmOverloads
        public OwnerParams(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ OwnerParams(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    @Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000e0\u000eR&\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\n\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData;", "Landroid/os/Parcelable;", "()V", "params", "", "Lkotlin/Pair;", "", "", "getParams", "()Ljava/util/List;", "type", "getType", "()Ljava/lang/String;", "createParams", "", "Bancontact", "Card", "Eps", "Giropay", "Ideal", "Masterpass", "SepaDebit", "Sofort", "ThreeDSecure", "VisaCheckout", "Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;", "Lcom/stripe/android/model/SourceParams$TypeData$Card;", "Lcom/stripe/android/model/SourceParams$TypeData$Eps;", "Lcom/stripe/android/model/SourceParams$TypeData$Giropay;", "Lcom/stripe/android/model/SourceParams$TypeData$Ideal;", "Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;", "Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;", "Lcom/stripe/android/model/SourceParams$TypeData$Sofort;", "Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;", "Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSourceParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceParams.kt\ncom/stripe/android/model/SourceParams$TypeData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1160:1\n1789#2,2:1161\n1791#2:1164\n1#3:1163\n*S KotlinDebug\n*F\n+ 1 SourceParams.kt\ncom/stripe/android/model/SourceParams$TypeData\n*L\n945#1:1161,2\n945#1:1164\n*E\n"})
    /* loaded from: classes7.dex */
    public static abstract class TypeData implements Parcelable {

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R(\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "preferredLanguage", "(Ljava/lang/String;Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getPreferredLanguage", "()Ljava/lang/String;", "setPreferredLanguage", "(Ljava/lang/String;)V", "getStatementDescriptor", "setStatementDescriptor", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Bancontact extends TypeData {
            @Deprecated
            private static final String PARAM_PREFERRED_LANGUAGE = "preferred_language";
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String preferredLanguage;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Bancontact> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Bancontact$Companion;", "", "()V", "PARAM_PREFERRED_LANGUAGE", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Bancontact> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Bancontact createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Bancontact(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Bancontact[] newArray(int i) {
                    return new Bancontact[i];
                }
            }

            public Bancontact() {
                this(null, null, 3, null);
            }

            public static /* synthetic */ Bancontact copy$default(Bancontact bancontact, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bancontact.statementDescriptor;
                }
                if ((i & 2) != 0) {
                    str2 = bancontact.preferredLanguage;
                }
                return bancontact.copy(str, str2);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final String component2() {
                return this.preferredLanguage;
            }

            public final Bancontact copy(String str, String str2) {
                return new Bancontact(str, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Bancontact) {
                    Bancontact bancontact = (Bancontact) obj;
                    return Intrinsics.areEqual(this.statementDescriptor, bancontact.statementDescriptor) && Intrinsics.areEqual(this.preferredLanguage, bancontact.preferredLanguage);
                }
                return false;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                List<Pair<String, String>> listOf;
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor), TuplesKt.m28425to(PARAM_PREFERRED_LANGUAGE, this.preferredLanguage)});
                return listOf;
            }

            public final String getPreferredLanguage() {
                return this.preferredLanguage;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "bancontact";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.preferredLanguage;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setPreferredLanguage(String str) {
                this.preferredLanguage = str;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                String str = this.statementDescriptor;
                String str2 = this.preferredLanguage;
                return "Bancontact(statementDescriptor=" + str + ", preferredLanguage=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.statementDescriptor);
                out.writeString(this.preferredLanguage);
            }

            public /* synthetic */ Bancontact(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public Bancontact(String str, String str2) {
                super(null);
                this.statementDescriptor = str;
                this.preferredLanguage = str2;
            }
        }

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR(\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\n¨\u0006*"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Card;", "Lcom/stripe/android/model/SourceParams$TypeData;", Card.PARAM_NUMBER, "", "expMonth", "", "expYear", Card.PARAM_CVC, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCvc", "()Ljava/lang/String;", "getExpMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpYear", "getNumber", "params", "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams$TypeData$Card;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Card extends TypeData {
            public static final int $stable = 0;
            @Deprecated
            private static final String PARAM_CVC = "cvc";
            @Deprecated
            private static final String PARAM_EXP_MONTH = "exp_month";
            @Deprecated
            private static final String PARAM_EXP_YEAR = "exp_year";
            @Deprecated
            private static final String PARAM_NUMBER = "number";
            private final String cvc;
            private final Integer expMonth;
            private final Integer expYear;
            private final String number;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Card> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Card$Companion;", "", "()V", "PARAM_CVC", "", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Card> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Card(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card[] newArray(int i) {
                    return new Card[i];
                }
            }

            public /* synthetic */ Card(String str, Integer num, Integer num2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, num, num2, (i & 8) != 0 ? null : str2);
            }

            public static /* synthetic */ Card copy$default(Card card, String str, Integer num, Integer num2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = card.number;
                }
                if ((i & 2) != 0) {
                    num = card.expMonth;
                }
                if ((i & 4) != 0) {
                    num2 = card.expYear;
                }
                if ((i & 8) != 0) {
                    str2 = card.cvc;
                }
                return card.copy(str, num, num2, str2);
            }

            public final String component1() {
                return this.number;
            }

            public final Integer component2() {
                return this.expMonth;
            }

            public final Integer component3() {
                return this.expYear;
            }

            public final String component4() {
                return this.cvc;
            }

            public final Card copy(String str, Integer num, Integer num2, String str2) {
                return new Card(str, num, num2, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Card) {
                    Card card = (Card) obj;
                    return Intrinsics.areEqual(this.number, card.number) && Intrinsics.areEqual(this.expMonth, card.expMonth) && Intrinsics.areEqual(this.expYear, card.expYear) && Intrinsics.areEqual(this.cvc, card.cvc);
                }
                return false;
            }

            public final String getCvc() {
                return this.cvc;
            }

            public final Integer getExpMonth() {
                return this.expMonth;
            }

            public final Integer getExpYear() {
                return this.expYear;
            }

            public final String getNumber() {
                return this.number;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, Object>> getParams() {
                List<Pair<String, Object>> listOf;
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_NUMBER, this.number), TuplesKt.m28425to(PARAM_EXP_MONTH, this.expMonth), TuplesKt.m28425to(PARAM_EXP_YEAR, this.expYear), TuplesKt.m28425to(PARAM_CVC, this.cvc)});
                return listOf;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            public int hashCode() {
                String str = this.number;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.expMonth;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.expYear;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str2 = this.cvc;
                return hashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                String str = this.number;
                Integer num = this.expMonth;
                Integer num2 = this.expYear;
                String str2 = this.cvc;
                return "Card(number=" + str + ", expMonth=" + num + ", expYear=" + num2 + ", cvc=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.number);
                Integer num = this.expMonth;
                if (num == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num.intValue());
                }
                Integer num2 = this.expYear;
                if (num2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num2.intValue());
                }
                out.writeString(this.cvc);
            }

            public Card(String str, Integer num, Integer num2, String str2) {
                super(null);
                this.number = str;
                this.expMonth = num;
                this.expYear = num2;
                this.cvc = str2;
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R(\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Eps;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Eps extends TypeData {
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Eps> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Eps$Companion;", "", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Eps> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Eps createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Eps(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Eps[] newArray(int i) {
                    return new Eps[i];
                }
            }

            public Eps() {
                this(null, 1, null);
            }

            public static /* synthetic */ Eps copy$default(Eps eps, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eps.statementDescriptor;
                }
                return eps.copy(str);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final Eps copy(String str) {
                return new Eps(str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Eps) && Intrinsics.areEqual(this.statementDescriptor, ((Eps) obj).statementDescriptor);
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                List<Pair<String, String>> listOf;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor));
                return listOf;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "eps";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                String str = this.statementDescriptor;
                return "Eps(statementDescriptor=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.statementDescriptor);
            }

            public /* synthetic */ Eps(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public Eps(String str) {
                super(null);
                this.statementDescriptor = str;
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R(\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Giropay;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Giropay extends TypeData {
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Giropay> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Giropay$Companion;", "", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Giropay> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Giropay createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Giropay(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Giropay[] newArray(int i) {
                    return new Giropay[i];
                }
            }

            public Giropay() {
                this(null, 1, null);
            }

            public static /* synthetic */ Giropay copy$default(Giropay giropay, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = giropay.statementDescriptor;
                }
                return giropay.copy(str);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final Giropay copy(String str) {
                return new Giropay(str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Giropay) && Intrinsics.areEqual(this.statementDescriptor, ((Giropay) obj).statementDescriptor);
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                List<Pair<String, String>> listOf;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor));
                return listOf;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "giropay";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                String str = this.statementDescriptor;
                return "Giropay(statementDescriptor=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.statementDescriptor);
            }

            public /* synthetic */ Giropay(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public Giropay(String str) {
                super(null);
                this.statementDescriptor = str;
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Ideal;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", Ideal.PARAM_BANK, "(Ljava/lang/String;Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "setBank", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "setStatementDescriptor", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Ideal extends TypeData {
            @Deprecated
            private static final String PARAM_BANK = "bank";
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String bank;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Ideal> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Ideal$Companion;", "", "()V", "PARAM_BANK", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Ideal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ideal createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Ideal(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ideal[] newArray(int i) {
                    return new Ideal[i];
                }
            }

            public Ideal() {
                this(null, null, 3, null);
            }

            public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ideal.statementDescriptor;
                }
                if ((i & 2) != 0) {
                    str2 = ideal.bank;
                }
                return ideal.copy(str, str2);
            }

            public final String component1() {
                return this.statementDescriptor;
            }

            public final String component2() {
                return this.bank;
            }

            public final Ideal copy(String str, String str2) {
                return new Ideal(str, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Ideal) {
                    Ideal ideal = (Ideal) obj;
                    return Intrinsics.areEqual(this.statementDescriptor, ideal.statementDescriptor) && Intrinsics.areEqual(this.bank, ideal.bank);
                }
                return false;
            }

            public final String getBank() {
                return this.bank;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                List<Pair<String, String>> listOf;
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor), TuplesKt.m28425to(PARAM_BANK, this.bank)});
                return listOf;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "ideal";
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.bank;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setBank(String str) {
                this.bank = str;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                String str = this.statementDescriptor;
                String str2 = this.bank;
                return "Ideal(statementDescriptor=" + str + ", bank=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.statementDescriptor);
                out.writeString(this.bank);
            }

            public /* synthetic */ Ideal(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public Ideal(String str, String str2) {
                super(null);
                this.statementDescriptor = str;
                this.bank = str2;
            }
        }

        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r0\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;", "Lcom/stripe/android/model/SourceParams$TypeData;", "transactionId", "", "cartId", "(Ljava/lang/String;Ljava/lang/String;)V", "getCartId", "()Ljava/lang/String;", "setCartId", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "getTransactionId", "setTransactionId", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Masterpass extends TypeData {
            @Deprecated
            private static final String PARAM_CART_ID = "cart_id";
            @Deprecated
            private static final String PARAM_MASTERPASS = "masterpass";
            @Deprecated
            private static final String PARAM_TRANSACTION_ID = "transaction_id";
            private String cartId;
            private String transactionId;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Masterpass> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Masterpass$Companion;", "", "()V", "PARAM_CART_ID", "", "PARAM_MASTERPASS", "PARAM_TRANSACTION_ID", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Masterpass> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Masterpass createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Masterpass(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Masterpass[] newArray(int i) {
                    return new Masterpass[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Masterpass(String transactionId, String cartId) {
                super(null);
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(cartId, "cartId");
                this.transactionId = transactionId;
                this.cartId = cartId;
            }

            public static /* synthetic */ Masterpass copy$default(Masterpass masterpass, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = masterpass.transactionId;
                }
                if ((i & 2) != 0) {
                    str2 = masterpass.cartId;
                }
                return masterpass.copy(str, str2);
            }

            public final String component1() {
                return this.transactionId;
            }

            public final String component2() {
                return this.cartId;
            }

            public final Masterpass copy(String transactionId, String cartId) {
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(cartId, "cartId");
                return new Masterpass(transactionId, cartId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Masterpass) {
                    Masterpass masterpass = (Masterpass) obj;
                    return Intrinsics.areEqual(this.transactionId, masterpass.transactionId) && Intrinsics.areEqual(this.cartId, masterpass.cartId);
                }
                return false;
            }

            public final String getCartId() {
                return this.cartId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, Map<String, String>>> getParams() {
                Map mapOf;
                List<Pair<String, Map<String, String>>> listOf;
                mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_TRANSACTION_ID, this.transactionId), TuplesKt.m28425to(PARAM_CART_ID, this.cartId));
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(PARAM_MASTERPASS, mapOf));
                return listOf;
            }

            public final String getTransactionId() {
                return this.transactionId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            public int hashCode() {
                return (this.transactionId.hashCode() * 31) + this.cartId.hashCode();
            }

            public final void setCartId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.cartId = str;
            }

            public final void setTransactionId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.transactionId = str;
            }

            public String toString() {
                String str = this.transactionId;
                String str2 = this.cartId;
                return "Masterpass(transactionId=" + str + ", cartId=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.transactionId);
                out.writeString(this.cartId);
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R(\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;", "Lcom/stripe/android/model/SourceParams$TypeData;", SepaDebit.PARAM_IBAN, "", "(Ljava/lang/String;)V", "getIban", "()Ljava/lang/String;", "setIban", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class SepaDebit extends TypeData {
            @Deprecated
            private static final String PARAM_IBAN = "iban";
            private String iban;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit$Companion;", "", "()V", "PARAM_IBAN", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<SepaDebit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SepaDebit createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SepaDebit(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SepaDebit[] newArray(int i) {
                    return new SepaDebit[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SepaDebit(String iban) {
                super(null);
                Intrinsics.checkNotNullParameter(iban, "iban");
                this.iban = iban;
            }

            public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sepaDebit.iban;
                }
                return sepaDebit.copy(str);
            }

            public final String component1() {
                return this.iban;
            }

            public final SepaDebit copy(String iban) {
                Intrinsics.checkNotNullParameter(iban, "iban");
                return new SepaDebit(iban);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SepaDebit) && Intrinsics.areEqual(this.iban, ((SepaDebit) obj).iban);
            }

            public final String getIban() {
                return this.iban;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                List<Pair<String, String>> listOf;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(PARAM_IBAN, this.iban));
                return listOf;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "sepa_debit";
            }

            public int hashCode() {
                return this.iban.hashCode();
            }

            public final void setIban(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.iban = str;
            }

            public String toString() {
                String str = this.iban;
                return "SepaDebit(iban=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.iban);
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Sofort;", "Lcom/stripe/android/model/SourceParams$TypeData;", "country", "", "statementDescriptor", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "getStatementDescriptor", "setStatementDescriptor", "type", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Sofort extends TypeData {
            @Deprecated
            private static final String PARAM_COUNTRY = "country";
            @Deprecated
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String country;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<Sofort> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Sofort$Companion;", "", "()V", "PARAM_COUNTRY", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Sofort> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sofort createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Sofort(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sofort[] newArray(int i) {
                    return new Sofort[i];
                }
            }

            public /* synthetic */ Sofort(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sofort.country;
                }
                if ((i & 2) != 0) {
                    str2 = sofort.statementDescriptor;
                }
                return sofort.copy(str, str2);
            }

            public final String component1() {
                return this.country;
            }

            public final String component2() {
                return this.statementDescriptor;
            }

            public final Sofort copy(String country, String str) {
                Intrinsics.checkNotNullParameter(country, "country");
                return new Sofort(country, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Sofort) {
                    Sofort sofort = (Sofort) obj;
                    return Intrinsics.areEqual(this.country, sofort.country) && Intrinsics.areEqual(this.statementDescriptor, sofort.statementDescriptor);
                }
                return false;
            }

            public final String getCountry() {
                return this.country;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                List<Pair<String, String>> listOf;
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to("country", this.country), TuplesKt.m28425to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor)});
                return listOf;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "sofort";
            }

            public int hashCode() {
                int hashCode = this.country.hashCode() * 31;
                String str = this.statementDescriptor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final void setCountry(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.country = str;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public String toString() {
                String str = this.country;
                String str2 = this.statementDescriptor;
                return "Sofort(country=" + str + ", statementDescriptor=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.country);
                out.writeString(this.statementDescriptor);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sofort(String country, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(country, "country");
                this.country = country;
                this.statementDescriptor = str;
            }
        }

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R(\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;", "Lcom/stripe/android/model/SourceParams$TypeData;", "cardId", "", "(Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "setCardId", "params", "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ThreeDSecure extends TypeData {
            @Deprecated
            private static final String PARAM_CARD = "card";
            private String cardId;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<ThreeDSecure> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure$Companion;", "", "()V", "PARAM_CARD", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<ThreeDSecure> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecure createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ThreeDSecure(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecure[] newArray(int i) {
                    return new ThreeDSecure[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThreeDSecure(String cardId) {
                super(null);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.cardId = cardId;
            }

            public static /* synthetic */ ThreeDSecure copy$default(ThreeDSecure threeDSecure, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = threeDSecure.cardId;
                }
                return threeDSecure.copy(str);
            }

            public final String component1() {
                return this.cardId;
            }

            public final ThreeDSecure copy(String cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return new ThreeDSecure(cardId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThreeDSecure) && Intrinsics.areEqual(this.cardId, ((ThreeDSecure) obj).cardId);
            }

            public final String getCardId() {
                return this.cardId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                List<Pair<String, String>> listOf;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to("card", this.cardId));
                return listOf;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "three_d_secure";
            }

            public int hashCode() {
                return this.cardId.hashCode();
            }

            public final void setCardId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.cardId = str;
            }

            public String toString() {
                String str = this.cardId;
                return "ThreeDSecure(cardId=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.cardId);
            }
        }

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R(\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;", "Lcom/stripe/android/model/SourceParams$TypeData;", "callId", "", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "setCallId", "params", "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "type", "getType", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class VisaCheckout extends TypeData {
            @Deprecated
            private static final String PARAM_CALL_ID = "callid";
            @Deprecated
            private static final String PARAM_VISA_CHECKOUT = "visa_checkout";
            private String callId;
            private static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            public static final Parcelable.Creator<VisaCheckout> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout$Companion;", "", "()V", "PARAM_CALL_ID", "", "PARAM_VISA_CHECKOUT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<VisaCheckout> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VisaCheckout createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VisaCheckout(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VisaCheckout[] newArray(int i) {
                    return new VisaCheckout[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VisaCheckout(String callId) {
                super(null);
                Intrinsics.checkNotNullParameter(callId, "callId");
                this.callId = callId;
            }

            public static /* synthetic */ VisaCheckout copy$default(VisaCheckout visaCheckout, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = visaCheckout.callId;
                }
                return visaCheckout.copy(str);
            }

            public final String component1() {
                return this.callId;
            }

            public final VisaCheckout copy(String callId) {
                Intrinsics.checkNotNullParameter(callId, "callId");
                return new VisaCheckout(callId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VisaCheckout) && Intrinsics.areEqual(this.callId, ((VisaCheckout) obj).callId);
            }

            public final String getCallId() {
                return this.callId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, Object>> getParams() {
                Map mapOf;
                List<Pair<String, Object>> listOf;
                mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CALL_ID, this.callId));
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(PARAM_VISA_CHECKOUT, mapOf));
                return listOf;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            public int hashCode() {
                return this.callId.hashCode();
            }

            public final void setCallId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.callId = str;
            }

            public String toString() {
                String str = this.callId;
                return "VisaCheckout(callId=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.callId);
            }
        }

        public /* synthetic */ TypeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, Map<String, Object>> createParams() {
            Map emptyMap;
            Map<String, Map<String, Object>> map;
            Map<String, Map<String, Object>> emptyMap2;
            emptyMap = MapsKt__MapsKt.emptyMap();
            Iterator<T> it = getParams().iterator();
            while (true) {
                map = null;
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                Object component2 = pair.component2();
                if (component2 != null) {
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, component2));
                }
                if (map == null) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
            }
            if (!(!emptyMap.isEmpty())) {
                emptyMap = null;
            }
            if (emptyMap != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(getType(), emptyMap));
            }
            if (map == null) {
                emptyMap2 = MapsKt__MapsKt.emptyMap();
                return emptyMap2;
            }
            return map;
        }

        public abstract List<Pair<String, Object>> getParams();

        public abstract String getType();

        private TypeData() {
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bHÖ\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "appId", "", "statementDescriptor", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class WeChatParams implements StripeParamsModel, Parcelable {
        private static final String PARAM_APPID = "appid";
        private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
        private final String appId;
        private final String statementDescriptor;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<WeChatParams> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams$Companion;", "", "()V", "PARAM_APPID", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<WeChatParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WeChatParams(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams[] newArray(int i) {
                return new WeChatParams[i];
            }
        }

        public WeChatParams() {
            this(null, null, 3, null);
        }

        private final String component1() {
            return this.appId;
        }

        private final String component2() {
            return this.statementDescriptor;
        }

        public static /* synthetic */ WeChatParams copy$default(WeChatParams weChatParams, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = weChatParams.appId;
            }
            if ((i & 2) != 0) {
                str2 = weChatParams.statementDescriptor;
            }
            return weChatParams.copy(str, str2);
        }

        public final WeChatParams copy(String str, String str2) {
            return new WeChatParams(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof WeChatParams) {
                WeChatParams weChatParams = (WeChatParams) obj;
                return Intrinsics.areEqual(this.appId, weChatParams.appId) && Intrinsics.areEqual(this.statementDescriptor, weChatParams.statementDescriptor);
            }
            return false;
        }

        public int hashCode() {
            String str = this.appId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.statementDescriptor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map emptyMap;
            Map map;
            Map plus;
            Map<String, Object> plus2;
            emptyMap = MapsKt__MapsKt.emptyMap();
            String str = this.appId;
            Map map2 = null;
            if (str != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_APPID, str));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(emptyMap, map);
            String str2 = this.statementDescriptor;
            if (str2 != null) {
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_STATEMENT_DESCRIPTOR, str2));
            }
            if (map2 == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            plus2 = MapsKt__MapsKt.plus(plus, map2);
            return plus2;
        }

        public String toString() {
            String str = this.appId;
            String str2 = this.statementDescriptor;
            return "WeChatParams(appId=" + str + ", statementDescriptor=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.appId);
            out.writeString(this.statementDescriptor);
        }

        public WeChatParams(String str, String str2) {
            this.appId = str;
            this.statementDescriptor = str2;
        }

        public /* synthetic */ WeChatParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    public SourceParams(String typeRaw, TypeData typeData, Long l, String str, OwnerParams ownerParams, Source.Usage usage, String str2, Flow flow, SourceOrderParams sourceOrderParams, String str3, Map<String, String> map, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        this.typeRaw = typeRaw;
        this.typeData = typeData;
        this.amount = l;
        this.currency = str;
        this.owner = ownerParams;
        this.usage = usage;
        this.returnUrl = str2;
        this.flow = flow;
        this.sourceOrder = sourceOrderParams;
        this.token = str3;
        this.metadata = map;
        this.weChatParams = weChatParams;
        this.apiParams = apiParams;
        this.attribution = attribution;
    }

    private final WeChatParams component12() {
        return this.weChatParams;
    }

    private final ApiParams component13() {
        return this.apiParams;
    }

    @JvmStatic
    public static final SourceParams createAlipayReusableParams(String str, String str2, String str3, String str4) {
        return Companion.createAlipayReusableParams(str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createAlipaySingleUseParams(long j, String str, String str2, String str3, String str4) {
        return Companion.createAlipaySingleUseParams(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createBancontactParams(long j, String str, String str2, String str3, String str4) {
        return Companion.createBancontactParams(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createCardParams(CardParams cardParams) {
        return Companion.createCardParams(cardParams);
    }

    @JvmStatic
    public static final SourceParams createCardParamsFromGooglePay(JSONObject jSONObject) throws JSONException {
        return Companion.createCardParamsFromGooglePay(jSONObject);
    }

    @JvmStatic
    public static final SourceParams createCustomParams(String str) {
        return Companion.createCustomParams(str);
    }

    @JvmStatic
    public static final SourceParams createEPSParams(long j, String str, String str2, String str3) {
        return Companion.createEPSParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createGiropayParams(long j, String str, String str2, String str3) {
        return Companion.createGiropayParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createIdealParams(long j, String str, String str2, String str3, String str4) {
        return Companion.createIdealParams(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createKlarna(String str, String str2, KlarnaSourceParams klarnaSourceParams) {
        return Companion.createKlarna(str, str2, klarnaSourceParams);
    }

    @JvmStatic
    public static final SourceParams createMasterpassParams(String str, String str2) {
        return Companion.createMasterpassParams(str, str2);
    }

    @JvmStatic
    public static final SourceParams createMultibancoParams(long j, String str, String str2) {
        return Companion.createMultibancoParams(j, str, str2);
    }

    @JvmStatic
    public static final SourceParams createP24Params(long j, String str, String str2, String str3, String str4) {
        return Companion.createP24Params(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final Map<String, String> createRetrieveSourceParams(String str) {
        return Companion.createRetrieveSourceParams(str);
    }

    @JvmStatic
    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6) {
        return Companion.createSepaDebitParams(str, str2, str3, str4, str5, str6);
    }

    @JvmStatic
    public static final SourceParams createSofortParams(long j, String str, String str2, String str3) {
        return Companion.createSofortParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createSourceFromTokenParams(String str) {
        return Companion.createSourceFromTokenParams(str);
    }

    @JvmStatic
    public static final SourceParams createThreeDSecureParams(long j, String str, String str2, String str3) {
        return Companion.createThreeDSecureParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createVisaCheckoutParams(String str) {
        return Companion.createVisaCheckoutParams(str);
    }

    @JvmStatic
    public static final SourceParams createWeChatPayParams(long j, String str, String str2, String str3) {
        return Companion.createWeChatPayParams(j, str, str2, str3);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public final String component1() {
        return this.typeRaw;
    }

    public final String component10() {
        return this.token;
    }

    public final Map<String, String> component11() {
        return this.metadata;
    }

    public final Set<String> component14$payments_core_release() {
        return this.attribution;
    }

    public final TypeData component2$payments_core_release() {
        return this.typeData;
    }

    public final Long component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final OwnerParams component5() {
        return this.owner;
    }

    public final Source.Usage component6() {
        return this.usage;
    }

    public final String component7() {
        return this.returnUrl;
    }

    public final Flow component8() {
        return this.flow;
    }

    public final SourceOrderParams component9() {
        return this.sourceOrder;
    }

    public final SourceParams copy(String typeRaw, TypeData typeData, Long l, String str, OwnerParams ownerParams, Source.Usage usage, String str2, Flow flow, SourceOrderParams sourceOrderParams, String str3, Map<String, String> map, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        return new SourceParams(typeRaw, typeData, l, str, ownerParams, usage, str2, flow, sourceOrderParams, str3, map, weChatParams, apiParams, attribution);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceParams) {
            SourceParams sourceParams = (SourceParams) obj;
            return Intrinsics.areEqual(this.typeRaw, sourceParams.typeRaw) && Intrinsics.areEqual(this.typeData, sourceParams.typeData) && Intrinsics.areEqual(this.amount, sourceParams.amount) && Intrinsics.areEqual(this.currency, sourceParams.currency) && Intrinsics.areEqual(this.owner, sourceParams.owner) && this.usage == sourceParams.usage && Intrinsics.areEqual(this.returnUrl, sourceParams.returnUrl) && this.flow == sourceParams.flow && Intrinsics.areEqual(this.sourceOrder, sourceParams.sourceOrder) && Intrinsics.areEqual(this.token, sourceParams.token) && Intrinsics.areEqual(this.metadata, sourceParams.metadata) && Intrinsics.areEqual(this.weChatParams, sourceParams.weChatParams) && Intrinsics.areEqual(this.apiParams, sourceParams.apiParams) && Intrinsics.areEqual(this.attribution, sourceParams.attribution);
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final Map<String, Object> getApiParameterMap() {
        return this.apiParams.getValue();
    }

    public final Set<String> getAttribution$payments_core_release() {
        return this.attribution;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final OwnerParams getOwner() {
        return this.owner;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final SourceOrderParams getSourceOrder() {
        return this.sourceOrder;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getType() {
        return Source.Companion.asSourceType(this.typeRaw);
    }

    public final TypeData getTypeData$payments_core_release() {
        return this.typeData;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final Source.Usage getUsage() {
        return this.usage;
    }

    public int hashCode() {
        int hashCode = this.typeRaw.hashCode() * 31;
        TypeData typeData = this.typeData;
        int hashCode2 = (hashCode + (typeData == null ? 0 : typeData.hashCode())) * 31;
        Long l = this.amount;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.currency;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OwnerParams ownerParams = this.owner;
        int hashCode5 = (hashCode4 + (ownerParams == null ? 0 : ownerParams.hashCode())) * 31;
        Source.Usage usage = this.usage;
        int hashCode6 = (hashCode5 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.returnUrl;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Flow flow = this.flow;
        int hashCode8 = (hashCode7 + (flow == null ? 0 : flow.hashCode())) * 31;
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        int hashCode9 = (hashCode8 + (sourceOrderParams == null ? 0 : sourceOrderParams.hashCode())) * 31;
        String str3 = this.token;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        WeChatParams weChatParams = this.weChatParams;
        return ((((hashCode11 + (weChatParams != null ? weChatParams.hashCode() : 0)) * 31) + this.apiParams.hashCode()) * 31) + this.attribution.hashCode();
    }

    public final void setAmount(Long l) {
        this.amount = l;
    }

    public final SourceParams setApiParameterMap(Map<String, ? extends Object> map) {
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        this.apiParams = new ApiParams(map);
        return this;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setFlow(Flow flow) {
        this.flow = flow;
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setOwner(OwnerParams ownerParams) {
        this.owner = ownerParams;
    }

    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final void setSourceOrder(SourceOrderParams sourceOrderParams) {
        this.sourceOrder = sourceOrderParams;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setTypeData$payments_core_release(TypeData typeData) {
        this.typeData = typeData;
    }

    public final void setUsage(Source.Usage usage) {
        this.usage = usage;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapOf;
        Map plus;
        Map plus2;
        Map plus3;
        Map plus4;
        Map plus5;
        Map plus6;
        Map plus7;
        Map map;
        Map plus8;
        Map plus9;
        Map plus10;
        Map plus11;
        Map<String, Object> plus12;
        Map mapOf2;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("type", this.typeRaw));
        Map<String, Object> value = this.apiParams.getValue();
        if (!(!value.isEmpty())) {
            value = null;
        }
        Map mapOf3 = value != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(this.typeRaw, value)) : null;
        if (mapOf3 == null) {
            mapOf3 = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, mapOf3);
        TypeData typeData = this.typeData;
        Map<String, Map<String, Object>> createParams = typeData != null ? typeData.createParams() : null;
        if (createParams == null) {
            createParams = MapsKt__MapsKt.emptyMap();
        }
        plus2 = MapsKt__MapsKt.plus(plus, createParams);
        Long l = this.amount;
        Map mapOf4 = l != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_AMOUNT, Long.valueOf(l.longValue()))) : null;
        if (mapOf4 == null) {
            mapOf4 = MapsKt__MapsKt.emptyMap();
        }
        plus3 = MapsKt__MapsKt.plus(plus2, mapOf4);
        String str = this.currency;
        Map mapOf5 = str != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CURRENCY, str)) : null;
        if (mapOf5 == null) {
            mapOf5 = MapsKt__MapsKt.emptyMap();
        }
        plus4 = MapsKt__MapsKt.plus(plus3, mapOf5);
        Flow flow = this.flow;
        Map mapOf6 = flow != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_FLOW, flow.getCode$payments_core_release())) : null;
        if (mapOf6 == null) {
            mapOf6 = MapsKt__MapsKt.emptyMap();
        }
        plus5 = MapsKt__MapsKt.plus(plus4, mapOf6);
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        Map mapOf7 = sourceOrderParams != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_SOURCE_ORDER, sourceOrderParams.toParamMap())) : null;
        if (mapOf7 == null) {
            mapOf7 = MapsKt__MapsKt.emptyMap();
        }
        plus6 = MapsKt__MapsKt.plus(plus5, mapOf7);
        OwnerParams ownerParams = this.owner;
        Map mapOf8 = ownerParams != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_OWNER, ownerParams.toParamMap())) : null;
        if (mapOf8 == null) {
            mapOf8 = MapsKt__MapsKt.emptyMap();
        }
        plus7 = MapsKt__MapsKt.plus(plus6, mapOf8);
        String str2 = this.returnUrl;
        if (str2 != null) {
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("return_url", str2));
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("redirect", mapOf2));
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus8 = MapsKt__MapsKt.plus(plus7, map);
        Map<String, String> map2 = this.metadata;
        Map mapOf9 = map2 != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_METADATA, map2)) : null;
        if (mapOf9 == null) {
            mapOf9 = MapsKt__MapsKt.emptyMap();
        }
        plus9 = MapsKt__MapsKt.plus(plus8, mapOf9);
        String str3 = this.token;
        Map mapOf10 = str3 != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_TOKEN, str3)) : null;
        if (mapOf10 == null) {
            mapOf10 = MapsKt__MapsKt.emptyMap();
        }
        plus10 = MapsKt__MapsKt.plus(plus9, mapOf10);
        Source.Usage usage = this.usage;
        Map mapOf11 = usage != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("usage", usage.getCode$payments_core_release())) : null;
        if (mapOf11 == null) {
            mapOf11 = MapsKt__MapsKt.emptyMap();
        }
        plus11 = MapsKt__MapsKt.plus(plus10, mapOf11);
        WeChatParams weChatParams = this.weChatParams;
        Map mapOf12 = weChatParams != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("wechat", weChatParams.toParamMap())) : null;
        if (mapOf12 == null) {
            mapOf12 = MapsKt__MapsKt.emptyMap();
        }
        plus12 = MapsKt__MapsKt.plus(plus11, mapOf12);
        return plus12;
    }

    public String toString() {
        String str = this.typeRaw;
        TypeData typeData = this.typeData;
        Long l = this.amount;
        String str2 = this.currency;
        OwnerParams ownerParams = this.owner;
        Source.Usage usage = this.usage;
        String str3 = this.returnUrl;
        Flow flow = this.flow;
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        String str4 = this.token;
        Map<String, String> map = this.metadata;
        WeChatParams weChatParams = this.weChatParams;
        ApiParams apiParams = this.apiParams;
        Set<String> set = this.attribution;
        return "SourceParams(typeRaw=" + str + ", typeData=" + typeData + ", amount=" + l + ", currency=" + str2 + ", owner=" + ownerParams + ", usage=" + usage + ", returnUrl=" + str3 + ", flow=" + flow + ", sourceOrder=" + sourceOrderParams + ", token=" + str4 + ", metadata=" + map + ", weChatParams=" + weChatParams + ", apiParams=" + apiParams + ", attribution=" + set + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.typeRaw);
        out.writeParcelable(this.typeData, i);
        Long l = this.amount;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        out.writeString(this.currency);
        OwnerParams ownerParams = this.owner;
        if (ownerParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ownerParams.writeToParcel(out, i);
        }
        Source.Usage usage = this.usage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        out.writeString(this.returnUrl);
        Flow flow = this.flow;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        if (sourceOrderParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sourceOrderParams.writeToParcel(out, i);
        }
        out.writeString(this.token);
        Map<String, String> map = this.metadata;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        WeChatParams weChatParams = this.weChatParams;
        if (weChatParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            weChatParams.writeToParcel(out, i);
        }
        this.apiParams.writeToParcel(out, i);
        Set<String> set = this.attribution;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
    }

    @JvmStatic
    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return Companion.createSepaDebitParams(str, str2, str3, str4, str5, str6, str7);
    }

    public /* synthetic */ SourceParams(String str, TypeData typeData, Long l, String str2, OwnerParams ownerParams, Source.Usage usage, String str3, Flow flow, SourceOrderParams sourceOrderParams, String str4, Map map, WeChatParams weChatParams, ApiParams apiParams, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : typeData, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : ownerParams, (i & 32) != 0 ? null : usage, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : flow, (i & 256) != 0 ? null : sourceOrderParams, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : map, (i & 2048) != 0 ? null : weChatParams, (i & 4096) != 0 ? new ApiParams(null, 1, null) : apiParams, (i & 8192) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }
}
