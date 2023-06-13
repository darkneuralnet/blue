package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "Landroid/os/Parcelable;", "transactionId", "", "errorCode", "errorDescription", "errorDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorDescription", "getErrorDetails", "getTransactionId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ErrorMessage implements Parcelable {
    public static final Parcelable.Creator<ErrorMessage> CREATOR = new Creator();
    private final String errorCode;
    private final String errorDescription;
    private final String errorDetails;
    private final String transactionId;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ErrorMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ErrorMessage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorMessage[] newArray(int i) {
            return new ErrorMessage[i];
        }
    }

    public ErrorMessage(String transactionId, String errorCode, String errorDescription, String errorDetails) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
        this.transactionId = transactionId;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.errorDetails = errorDetails;
    }

    public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorMessage.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = errorMessage.errorCode;
        }
        if ((i & 4) != 0) {
            str3 = errorMessage.errorDescription;
        }
        if ((i & 8) != 0) {
            str4 = errorMessage.errorDetails;
        }
        return errorMessage.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.transactionId;
    }

    public final String component2() {
        return this.errorCode;
    }

    public final String component3() {
        return this.errorDescription;
    }

    public final String component4() {
        return this.errorDetails;
    }

    public final ErrorMessage copy(String transactionId, String errorCode, String errorDescription, String errorDetails) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
        return new ErrorMessage(transactionId, errorCode, errorDescription, errorDetails);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorMessage) {
            ErrorMessage errorMessage = (ErrorMessage) obj;
            return Intrinsics.areEqual(this.transactionId, errorMessage.transactionId) && Intrinsics.areEqual(this.errorCode, errorMessage.errorCode) && Intrinsics.areEqual(this.errorDescription, errorMessage.errorDescription) && Intrinsics.areEqual(this.errorDetails, errorMessage.errorDetails);
        }
        return false;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorDetails() {
        return this.errorDetails;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return (((((this.transactionId.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.errorDescription.hashCode()) * 31) + this.errorDetails.hashCode();
    }

    public String toString() {
        return "ErrorMessage(transactionId=" + this.transactionId + ", errorCode=" + this.errorCode + ", errorDescription=" + this.errorDescription + ", errorDetails=" + this.errorDetails + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.transactionId);
        out.writeString(this.errorCode);
        out.writeString(this.errorDescription);
        out.writeString(this.errorDetails);
    }
}
