package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "Landroid/os/Parcelable;", "deviceData", "", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkAppId", "sdkReferenceNumber", "sdkEphemeralPublicKey", ChallengeRequestData.FIELD_MESSAGE_VERSION, "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceData", "()Ljava/lang/String;", "getMessageVersion", "getSdkAppId", "getSdkEphemeralPublicKey", "getSdkReferenceNumber", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AuthenticationRequestParameters implements Parcelable {
    public static final Parcelable.Creator<AuthenticationRequestParameters> CREATOR = new Creator();
    private final String deviceData;
    private final String messageVersion;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final SdkTransactionId sdkTransactionId;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AuthenticationRequestParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationRequestParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthenticationRequestParameters(parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationRequestParameters[] newArray(int i) {
            return new AuthenticationRequestParameters[i];
        }
    }

    public AuthenticationRequestParameters(String deviceData, SdkTransactionId sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.deviceData = deviceData;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
    }

    public static /* synthetic */ AuthenticationRequestParameters copy$default(AuthenticationRequestParameters authenticationRequestParameters, String str, SdkTransactionId sdkTransactionId, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authenticationRequestParameters.deviceData;
        }
        if ((i & 2) != 0) {
            sdkTransactionId = authenticationRequestParameters.sdkTransactionId;
        }
        SdkTransactionId sdkTransactionId2 = sdkTransactionId;
        if ((i & 4) != 0) {
            str2 = authenticationRequestParameters.sdkAppId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = authenticationRequestParameters.sdkReferenceNumber;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = authenticationRequestParameters.sdkEphemeralPublicKey;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = authenticationRequestParameters.messageVersion;
        }
        return authenticationRequestParameters.copy(str, sdkTransactionId2, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.deviceData;
    }

    public final SdkTransactionId component2() {
        return this.sdkTransactionId;
    }

    public final String component3() {
        return this.sdkAppId;
    }

    public final String component4() {
        return this.sdkReferenceNumber;
    }

    public final String component5() {
        return this.sdkEphemeralPublicKey;
    }

    public final String component6() {
        return this.messageVersion;
    }

    public final AuthenticationRequestParameters copy(String deviceData, SdkTransactionId sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        return new AuthenticationRequestParameters(deviceData, sdkTransactionId, sdkAppId, sdkReferenceNumber, sdkEphemeralPublicKey, messageVersion);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationRequestParameters) {
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) obj;
            return Intrinsics.areEqual(this.deviceData, authenticationRequestParameters.deviceData) && Intrinsics.areEqual(this.sdkTransactionId, authenticationRequestParameters.sdkTransactionId) && Intrinsics.areEqual(this.sdkAppId, authenticationRequestParameters.sdkAppId) && Intrinsics.areEqual(this.sdkReferenceNumber, authenticationRequestParameters.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, authenticationRequestParameters.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.messageVersion, authenticationRequestParameters.messageVersion);
        }
        return false;
    }

    public final String getDeviceData() {
        return this.deviceData;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getSdkAppId() {
        return this.sdkAppId;
    }

    public final String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    public final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        return (((((((((this.deviceData.hashCode() * 31) + this.sdkTransactionId.hashCode()) * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode();
    }

    public String toString() {
        return "AuthenticationRequestParameters(deviceData=" + this.deviceData + ", sdkTransactionId=" + this.sdkTransactionId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.deviceData);
        this.sdkTransactionId.writeToParcel(out, i);
        out.writeString(this.sdkAppId);
        out.writeString(this.sdkReferenceNumber);
        out.writeString(this.sdkEphemeralPublicKey);
        out.writeString(this.messageVersion);
    }
}
