package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006("}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "Landroid/os/Parcelable;", "threeDsServerTransactionId", "", "acsTransactionId", "acsRefNumber", "acsSignedContent", "threeDSRequestorAppURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsRefNumber", "()Ljava/lang/String;", "setAcsRefNumber", "(Ljava/lang/String;)V", "getAcsSignedContent", "setAcsSignedContent", "getAcsTransactionId", "setAcsTransactionId", "getThreeDSRequestorAppURL", "setThreeDSRequestorAppURL", "getThreeDsServerTransactionId", "setThreeDsServerTransactionId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeParameters implements Parcelable {
    public static final Parcelable.Creator<ChallengeParameters> CREATOR = new Creator();
    private String acsRefNumber;
    private String acsSignedContent;
    private String acsTransactionId;
    private String threeDSRequestorAppURL;
    private String threeDsServerTransactionId;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeParameters[] newArray(int i) {
            return new ChallengeParameters[i];
        }
    }

    public ChallengeParameters() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ChallengeParameters copy$default(ChallengeParameters challengeParameters, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeParameters.threeDsServerTransactionId;
        }
        if ((i & 2) != 0) {
            str2 = challengeParameters.acsTransactionId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = challengeParameters.acsRefNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = challengeParameters.acsSignedContent;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = challengeParameters.threeDSRequestorAppURL;
        }
        return challengeParameters.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.threeDsServerTransactionId;
    }

    public final String component2() {
        return this.acsTransactionId;
    }

    public final String component3() {
        return this.acsRefNumber;
    }

    public final String component4() {
        return this.acsSignedContent;
    }

    public final String component5() {
        return this.threeDSRequestorAppURL;
    }

    public final ChallengeParameters copy(String str, String str2, String str3, String str4, String str5) {
        return new ChallengeParameters(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeParameters) {
            ChallengeParameters challengeParameters = (ChallengeParameters) obj;
            return Intrinsics.areEqual(this.threeDsServerTransactionId, challengeParameters.threeDsServerTransactionId) && Intrinsics.areEqual(this.acsTransactionId, challengeParameters.acsTransactionId) && Intrinsics.areEqual(this.acsRefNumber, challengeParameters.acsRefNumber) && Intrinsics.areEqual(this.acsSignedContent, challengeParameters.acsSignedContent) && Intrinsics.areEqual(this.threeDSRequestorAppURL, challengeParameters.threeDSRequestorAppURL);
        }
        return false;
    }

    public final String getAcsRefNumber() {
        return this.acsRefNumber;
    }

    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    public final String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    public int hashCode() {
        String str = this.threeDsServerTransactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransactionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acsRefNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acsSignedContent;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDSRequestorAppURL;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAcsRefNumber(String str) {
        this.acsRefNumber = str;
    }

    public final void setAcsSignedContent(String str) {
        this.acsSignedContent = str;
    }

    public final void setAcsTransactionId(String str) {
        this.acsTransactionId = str;
    }

    public final void setThreeDSRequestorAppURL(String str) {
        this.threeDSRequestorAppURL = str;
    }

    public final void setThreeDsServerTransactionId(String str) {
        this.threeDsServerTransactionId = str;
    }

    public String toString() {
        return "ChallengeParameters(threeDsServerTransactionId=" + this.threeDsServerTransactionId + ", acsTransactionId=" + this.acsTransactionId + ", acsRefNumber=" + this.acsRefNumber + ", acsSignedContent=" + this.acsSignedContent + ", threeDSRequestorAppURL=" + this.threeDSRequestorAppURL + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.threeDsServerTransactionId);
        out.writeString(this.acsTransactionId);
        out.writeString(this.acsRefNumber);
        out.writeString(this.acsSignedContent);
        out.writeString(this.threeDSRequestorAppURL);
    }

    public ChallengeParameters(String str, String str2, String str3, String str4, String str5) {
        this.threeDsServerTransactionId = str;
        this.acsTransactionId = str2;
        this.acsRefNumber = str3;
        this.acsSignedContent = str4;
        this.threeDSRequestorAppURL = str5;
    }

    public /* synthetic */ ChallengeParameters(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
