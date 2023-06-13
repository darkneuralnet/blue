package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001c\u001a\u00020\fHÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÂ\u0003Je\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u001f\u001a\u00020\fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0&H\u0016J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\fHÖ\u0001R\u0014\u0010\u000f\u001a\u00020\u00108AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "sourceId", "", "sdkAppId", Stripe3ds2AuthParams.FIELD_SDK_REFERENCE_NUMBER, "sdkTransactionId", "deviceData", "sdkEphemeralPublicKey", "messageVersion", "maxTimeout", "", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "appParams", "Lorg/json/JSONObject;", "getAppParams$payments_core_release", "()Lorg/json/JSONObject;", Stripe3ds2AuthParams.FIELD_DEVICE_RENDER_OPTIONS, "getDeviceRenderOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Stripe3ds2AuthParams implements StripeParamsModel, Parcelable {
    public static final String FIELD_APP = "app";
    private static final String FIELD_DEVICE_RENDER_OPTIONS = "deviceRenderOptions";
    public static final String FIELD_FALLBACK_RETURN_URL = "fallback_return_url";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_APP_ID = "sdkAppID";
    private static final String FIELD_SDK_ENC_DATA = "sdkEncData";
    private static final String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private static final String FIELD_SDK_INTERFACE = "sdkInterface";
    private static final String FIELD_SDK_MAX_TIMEOUT = "sdkMaxTimeout";
    private static final String FIELD_SDK_REFERENCE_NUMBER = "sdkReferenceNumber";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SDK_UI_TYPE = "sdkUiType";
    public static final String FIELD_SOURCE = "source";
    private final String deviceData;
    private final int maxTimeout;
    private final String messageVersion;
    private final String returnUrl;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final String sdkTransactionId;
    private final String sourceId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Stripe3ds2AuthParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams$Companion;", "", "()V", "FIELD_APP", "", "FIELD_DEVICE_RENDER_OPTIONS", "FIELD_FALLBACK_RETURN_URL", "FIELD_MESSAGE_VERSION", "FIELD_SDK_APP_ID", "FIELD_SDK_ENC_DATA", "FIELD_SDK_EPHEM_PUB_KEY", "FIELD_SDK_INTERFACE", "FIELD_SDK_MAX_TIMEOUT", "FIELD_SDK_REFERENCE_NUMBER", "FIELD_SDK_TRANS_ID", "FIELD_SDK_UI_TYPE", "FIELD_SOURCE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public static final class Creator implements Parcelable.Creator<Stripe3ds2AuthParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2AuthParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams[] newArray(int i) {
            return new Stripe3ds2AuthParams[i];
        }
    }

    public Stripe3ds2AuthParams(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i, String str) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.sourceId = sourceId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkTransactionId = sdkTransactionId;
        this.deviceData = deviceData;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
        this.maxTimeout = i;
        this.returnUrl = str;
    }

    private final String component1() {
        return this.sourceId;
    }

    private final String component2() {
        return this.sdkAppId;
    }

    private final String component3() {
        return this.sdkReferenceNumber;
    }

    private final String component4() {
        return this.sdkTransactionId;
    }

    private final String component5() {
        return this.deviceData;
    }

    private final String component6() {
        return this.sdkEphemeralPublicKey;
    }

    private final String component7() {
        return this.messageVersion;
    }

    private final int component8() {
        return this.maxTimeout;
    }

    private final String component9() {
        return this.returnUrl;
    }

    private final JSONObject getDeviceRenderOptions() {
        JSONObject m116783constructorimpl;
        List listOf;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject put = new JSONObject().put(FIELD_SDK_INTERFACE, "03");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"01", "02", "03", "04", "05"});
            m116783constructorimpl = Result.m116783constructorimpl(put.put(FIELD_SDK_UI_TYPE, new JSONArray((Collection) listOf)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = jSONObject;
        }
        return (JSONObject) m116783constructorimpl;
    }

    public final Stripe3ds2AuthParams copy(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i, String str) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        return new Stripe3ds2AuthParams(sourceId, sdkAppId, sdkReferenceNumber, sdkTransactionId, deviceData, sdkEphemeralPublicKey, messageVersion, i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Stripe3ds2AuthParams) {
            Stripe3ds2AuthParams stripe3ds2AuthParams = (Stripe3ds2AuthParams) obj;
            return Intrinsics.areEqual(this.sourceId, stripe3ds2AuthParams.sourceId) && Intrinsics.areEqual(this.sdkAppId, stripe3ds2AuthParams.sdkAppId) && Intrinsics.areEqual(this.sdkReferenceNumber, stripe3ds2AuthParams.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkTransactionId, stripe3ds2AuthParams.sdkTransactionId) && Intrinsics.areEqual(this.deviceData, stripe3ds2AuthParams.deviceData) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, stripe3ds2AuthParams.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.messageVersion, stripe3ds2AuthParams.messageVersion) && this.maxTimeout == stripe3ds2AuthParams.maxTimeout && Intrinsics.areEqual(this.returnUrl, stripe3ds2AuthParams.returnUrl);
        }
        return false;
    }

    public final /* synthetic */ JSONObject getAppParams$payments_core_release() {
        JSONObject m116783constructorimpl;
        String padStart;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject put = new JSONObject().put(FIELD_SDK_APP_ID, this.sdkAppId).put("sdkTransID", this.sdkTransactionId).put(FIELD_SDK_ENC_DATA, this.deviceData).put("sdkEphemPubKey", new JSONObject(this.sdkEphemeralPublicKey));
            padStart = StringsKt__StringsKt.padStart(String.valueOf(this.maxTimeout), 2, '0');
            m116783constructorimpl = Result.m116783constructorimpl(put.put(FIELD_SDK_MAX_TIMEOUT, padStart).put(FIELD_SDK_REFERENCE_NUMBER, this.sdkReferenceNumber).put("messageVersion", this.messageVersion).put(FIELD_DEVICE_RENDER_OPTIONS, getDeviceRenderOptions()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = jSONObject;
        }
        return (JSONObject) m116783constructorimpl;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.sourceId.hashCode() * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkTransactionId.hashCode()) * 31) + this.deviceData.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode()) * 31) + Integer.hashCode(this.maxTimeout)) * 31;
        String str = this.returnUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapOf;
        Map map;
        Map<String, Object> plus;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(FIELD_SOURCE, this.sourceId), TuplesKt.m28425to(FIELD_APP, getAppParams$payments_core_release().toString()));
        String str = this.returnUrl;
        if (str != null) {
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(FIELD_FALLBACK_RETURN_URL, str));
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, map);
        return plus;
    }

    public String toString() {
        String str = this.sourceId;
        String str2 = this.sdkAppId;
        String str3 = this.sdkReferenceNumber;
        String str4 = this.sdkTransactionId;
        String str5 = this.deviceData;
        String str6 = this.sdkEphemeralPublicKey;
        String str7 = this.messageVersion;
        int i = this.maxTimeout;
        String str8 = this.returnUrl;
        return "Stripe3ds2AuthParams(sourceId=" + str + ", sdkAppId=" + str2 + ", sdkReferenceNumber=" + str3 + ", sdkTransactionId=" + str4 + ", deviceData=" + str5 + ", sdkEphemeralPublicKey=" + str6 + ", messageVersion=" + str7 + ", maxTimeout=" + i + ", returnUrl=" + str8 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.sourceId);
        out.writeString(this.sdkAppId);
        out.writeString(this.sdkReferenceNumber);
        out.writeString(this.sdkTransactionId);
        out.writeString(this.deviceData);
        out.writeString(this.sdkEphemeralPublicKey);
        out.writeString(this.messageVersion);
        out.writeInt(this.maxTimeout);
        out.writeString(this.returnUrl);
    }
}
