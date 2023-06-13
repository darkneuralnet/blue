package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "Landroid/os/Parcelable;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "errorMessage", "Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;)V", "getErrorMessage", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ProtocolErrorEvent implements Parcelable {
    public static final Parcelable.Creator<ProtocolErrorEvent> CREATOR = new Creator();
    private final ErrorMessage errorMessage;
    private final SdkTransactionId sdkTransactionId;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ProtocolErrorEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolErrorEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProtocolErrorEvent(parcel.readInt() == 0 ? null : SdkTransactionId.CREATOR.createFromParcel(parcel), ErrorMessage.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolErrorEvent[] newArray(int i) {
            return new ProtocolErrorEvent[i];
        }
    }

    public ProtocolErrorEvent(SdkTransactionId sdkTransactionId, ErrorMessage errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.sdkTransactionId = sdkTransactionId;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ ProtocolErrorEvent copy$default(ProtocolErrorEvent protocolErrorEvent, SdkTransactionId sdkTransactionId, ErrorMessage errorMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkTransactionId = protocolErrorEvent.sdkTransactionId;
        }
        if ((i & 2) != 0) {
            errorMessage = protocolErrorEvent.errorMessage;
        }
        return protocolErrorEvent.copy(sdkTransactionId, errorMessage);
    }

    public final SdkTransactionId component1() {
        return this.sdkTransactionId;
    }

    public final ErrorMessage component2() {
        return this.errorMessage;
    }

    public final ProtocolErrorEvent copy(SdkTransactionId sdkTransactionId, ErrorMessage errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new ProtocolErrorEvent(sdkTransactionId, errorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProtocolErrorEvent) {
            ProtocolErrorEvent protocolErrorEvent = (ProtocolErrorEvent) obj;
            return Intrinsics.areEqual(this.sdkTransactionId, protocolErrorEvent.sdkTransactionId) && Intrinsics.areEqual(this.errorMessage, protocolErrorEvent.errorMessage);
        }
        return false;
    }

    public final ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        return ((sdkTransactionId == null ? 0 : sdkTransactionId.hashCode()) * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "ProtocolErrorEvent(sdkTransactionId=" + this.sdkTransactionId + ", errorMessage=" + this.errorMessage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sdkTransactionId.writeToParcel(out, i);
        }
        this.errorMessage.writeToParcel(out, i);
    }
}
