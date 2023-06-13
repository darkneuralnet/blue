package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/RuntimeErrorEvent;", "Landroid/os/Parcelable;", "throwable", "", "(Ljava/lang/Throwable;)V", "errorData", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "errorCode", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class RuntimeErrorEvent implements Parcelable {
    public static final Parcelable.Creator<RuntimeErrorEvent> CREATOR = new Creator();
    private final String errorCode;
    private final String errorMessage;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<RuntimeErrorEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RuntimeErrorEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RuntimeErrorEvent(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RuntimeErrorEvent[] newArray(int i) {
            return new RuntimeErrorEvent[i];
        }
    }

    public RuntimeErrorEvent(String errorCode, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ RuntimeErrorEvent copy$default(RuntimeErrorEvent runtimeErrorEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runtimeErrorEvent.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = runtimeErrorEvent.errorMessage;
        }
        return runtimeErrorEvent.copy(str, str2);
    }

    public final String component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final RuntimeErrorEvent copy(String errorCode, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new RuntimeErrorEvent(errorCode, errorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RuntimeErrorEvent) {
            RuntimeErrorEvent runtimeErrorEvent = (RuntimeErrorEvent) obj;
            return Intrinsics.areEqual(this.errorCode, runtimeErrorEvent.errorCode) && Intrinsics.areEqual(this.errorMessage, runtimeErrorEvent.errorMessage);
        }
        return false;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return (this.errorCode.hashCode() * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "RuntimeErrorEvent(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.errorCode);
        out.writeString(this.errorMessage);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RuntimeErrorEvent(Throwable throwable) {
        this(r0, r3 == null ? "" : r3);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String simpleName = throwable.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "throwable.javaClass.simpleName");
        String message = throwable.getMessage();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RuntimeErrorEvent(ErrorData errorData) {
        this(errorData.getErrorCode(), errorData.getErrorDetail());
        Intrinsics.checkNotNullParameter(errorData, "errorData");
    }
}
