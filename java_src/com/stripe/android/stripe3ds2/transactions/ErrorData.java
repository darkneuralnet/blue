package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000289Bm\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jy\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\r\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b1J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020)HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006:"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Landroid/os/Parcelable;", "serverTransId", "", "acsTransId", "dsTransId", ErrorData.FIELD_ERROR_CODE, ErrorData.FIELD_ERROR_COMPONENT, "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", ErrorData.FIELD_ERROR_DESCRIPTION, ErrorData.FIELD_ERROR_DETAIL, ErrorData.FIELD_ERROR_MESSAGE_TYPE, "messageVersion", "sdkTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "getAcsTransId", "()Ljava/lang/String;", "getDsTransId", "getErrorCode", "getErrorComponent", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "getErrorDescription", "getErrorDetail", "getErrorMessageType", "getMessageVersion", "getSdkTransId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getServerTransId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "ErrorComponent", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ErrorData implements Parcelable {
    private static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_DS_TRANS_ID = "dsTransID";
    private static final String FIELD_ERROR_CODE = "errorCode";
    private static final String FIELD_ERROR_COMPONENT = "errorComponent";
    private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
    private static final String FIELD_ERROR_DETAIL = "errorDetail";
    private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String MESSAGE_TYPE = "Erro";
    private final String acsTransId;
    private final String dsTransId;
    private final String errorCode;
    private final ErrorComponent errorComponent;
    private final String errorDescription;
    private final String errorDetail;
    private final String errorMessageType;
    private final String messageVersion;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ErrorData> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$Companion;", "", "()V", "FIELD_3DS_SERVER_TRANS_ID", "", "FIELD_ACS_TRANS_ID", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "MESSAGE_TYPE", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "payload", "Lorg/json/JSONObject;", "fromJson$3ds2sdk_release", "isErrorMessage", "", "isErrorMessage$3ds2sdk_release", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorData fromJson$3ds2sdk_release(JSONObject payload) {
            SdkTransactionId sdkTransactionId;
            Intrinsics.checkNotNullParameter(payload, "payload");
            String optString = payload.optString("threeDSServerTransID");
            String optString2 = payload.optString("acsTransID");
            String optString3 = payload.optString(ErrorData.FIELD_DS_TRANS_ID);
            String optString4 = payload.optString(ErrorData.FIELD_ERROR_CODE);
            Intrinsics.checkNotNullExpressionValue(optString4, "payload.optString(FIELD_ERROR_CODE)");
            ErrorComponent fromCode = ErrorComponent.Companion.fromCode(payload.optString(ErrorData.FIELD_ERROR_COMPONENT));
            String optString5 = payload.optString(ErrorData.FIELD_ERROR_DESCRIPTION);
            Intrinsics.checkNotNullExpressionValue(optString5, "payload.optString(FIELD_ERROR_DESCRIPTION)");
            String optString6 = payload.optString(ErrorData.FIELD_ERROR_DETAIL);
            Intrinsics.checkNotNullExpressionValue(optString6, "payload.optString(FIELD_ERROR_DETAIL)");
            String optString7 = payload.optString(ErrorData.FIELD_ERROR_MESSAGE_TYPE);
            String optString8 = payload.optString("messageVersion");
            Intrinsics.checkNotNullExpressionValue(optString8, "payload.optString(FIELD_MESSAGE_VERSION)");
            String optString9 = payload.optString("sdkTransID");
            if (optString9 != null) {
                sdkTransactionId = new SdkTransactionId(optString9);
            } else {
                sdkTransactionId = null;
            }
            return new ErrorData(optString, optString2, optString3, optString4, fromCode, optString5, optString6, optString7, optString8, sdkTransactionId);
        }

        public final boolean isErrorMessage$3ds2sdk_release(JSONObject payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return Intrinsics.areEqual(ErrorData.MESSAGE_TYPE, payload.optString("messageType"));
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ErrorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ErrorData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ErrorComponent.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SdkTransactionId.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData[] newArray(int i) {
            return new ErrorData[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ThreeDsSdk", "ThreeDsServer", "DirectoryServer", "Acs", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum ErrorComponent {
        ThreeDsSdk(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE),
        ThreeDsServer("S"),
        DirectoryServer("D"),
        Acs("A");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorComponent fromCode(String str) {
                ErrorComponent[] values;
                for (ErrorComponent errorComponent : ErrorComponent.values()) {
                    if (Intrinsics.areEqual(errorComponent.getCode(), str)) {
                        return errorComponent;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        ErrorComponent(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public ErrorData(String str, String str2, String str3, String errorCode, ErrorComponent errorComponent, String errorDescription, String errorDetail, String str4, String messageVersion, SdkTransactionId sdkTransactionId) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(errorDetail, "errorDetail");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.serverTransId = str;
        this.acsTransId = str2;
        this.dsTransId = str3;
        this.errorCode = errorCode;
        this.errorComponent = errorComponent;
        this.errorDescription = errorDescription;
        this.errorDetail = errorDetail;
        this.errorMessageType = str4;
        this.messageVersion = messageVersion;
        this.sdkTransId = sdkTransactionId;
    }

    public final String component1() {
        return this.serverTransId;
    }

    public final SdkTransactionId component10() {
        return this.sdkTransId;
    }

    public final String component2() {
        return this.acsTransId;
    }

    public final String component3() {
        return this.dsTransId;
    }

    public final String component4() {
        return this.errorCode;
    }

    public final ErrorComponent component5() {
        return this.errorComponent;
    }

    public final String component6() {
        return this.errorDescription;
    }

    public final String component7() {
        return this.errorDetail;
    }

    public final String component8() {
        return this.errorMessageType;
    }

    public final String component9() {
        return this.messageVersion;
    }

    public final ErrorData copy(String str, String str2, String str3, String errorCode, ErrorComponent errorComponent, String errorDescription, String errorDetail, String str4, String messageVersion, SdkTransactionId sdkTransactionId) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(errorDetail, "errorDetail");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        return new ErrorData(str, str2, str3, errorCode, errorComponent, errorDescription, errorDetail, str4, messageVersion, sdkTransactionId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorData) {
            ErrorData errorData = (ErrorData) obj;
            return Intrinsics.areEqual(this.serverTransId, errorData.serverTransId) && Intrinsics.areEqual(this.acsTransId, errorData.acsTransId) && Intrinsics.areEqual(this.dsTransId, errorData.dsTransId) && Intrinsics.areEqual(this.errorCode, errorData.errorCode) && this.errorComponent == errorData.errorComponent && Intrinsics.areEqual(this.errorDescription, errorData.errorDescription) && Intrinsics.areEqual(this.errorDetail, errorData.errorDetail) && Intrinsics.areEqual(this.errorMessageType, errorData.errorMessageType) && Intrinsics.areEqual(this.messageVersion, errorData.messageVersion) && Intrinsics.areEqual(this.sdkTransId, errorData.sdkTransId);
        }
        return false;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getDsTransId() {
        return this.dsTransId;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final ErrorComponent getErrorComponent() {
        return this.errorComponent;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorDetail() {
        return this.errorDetail;
    }

    public final String getErrorMessageType() {
        return this.errorMessageType;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public int hashCode() {
        String str = this.serverTransId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dsTransId;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.errorCode.hashCode()) * 31;
        ErrorComponent errorComponent = this.errorComponent;
        int hashCode4 = (((((hashCode3 + (errorComponent == null ? 0 : errorComponent.hashCode())) * 31) + this.errorDescription.hashCode()) * 31) + this.errorDetail.hashCode()) * 31;
        String str4 = this.errorMessageType;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        return hashCode5 + (sdkTransactionId != null ? sdkTransactionId.hashCode() : 0);
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject json = new JSONObject().put("messageType", MESSAGE_TYPE).put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId).put(FIELD_ERROR_CODE, this.errorCode).put(FIELD_ERROR_DESCRIPTION, this.errorDescription).put(FIELD_ERROR_DETAIL, this.errorDetail);
        String str = this.serverTransId;
        if (str != null) {
            json.put("threeDSServerTransID", str);
        }
        String str2 = this.acsTransId;
        if (str2 != null) {
            json.put("acsTransID", str2);
        }
        String str3 = this.dsTransId;
        if (str3 != null) {
            json.put(FIELD_DS_TRANS_ID, str3);
        }
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent != null) {
            json.put(FIELD_ERROR_COMPONENT, errorComponent.getCode());
        }
        String str4 = this.errorMessageType;
        if (str4 != null) {
            json.put(FIELD_ERROR_MESSAGE_TYPE, str4);
        }
        Intrinsics.checkNotNullExpressionValue(json, "json");
        return json;
    }

    public String toString() {
        return "ErrorData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", dsTransId=" + this.dsTransId + ", errorCode=" + this.errorCode + ", errorComponent=" + this.errorComponent + ", errorDescription=" + this.errorDescription + ", errorDetail=" + this.errorDetail + ", errorMessageType=" + this.errorMessageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.serverTransId);
        out.writeString(this.acsTransId);
        out.writeString(this.dsTransId);
        out.writeString(this.errorCode);
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(errorComponent.name());
        }
        out.writeString(this.errorDescription);
        out.writeString(this.errorDetail);
        out.writeString(this.errorMessageType);
        out.writeString(this.messageVersion);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        if (sdkTransactionId == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        sdkTransactionId.writeToParcel(out, i);
    }

    public /* synthetic */ ErrorData(String str, String str2, String str3, String str4, ErrorComponent errorComponent, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : errorComponent, str5, str6, (i & 128) != 0 ? null : str7, str8, sdkTransactionId);
    }
}
