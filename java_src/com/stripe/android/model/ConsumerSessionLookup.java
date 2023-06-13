package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerSessionLookup;", "Lcom/stripe/android/core/model/StripeModel;", "exists", "", "consumerSession", "Lcom/stripe/android/model/ConsumerSession;", "errorMessage", "", "(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V", "getConsumerSession", "()Lcom/stripe/android/model/ConsumerSession;", "getErrorMessage", "()Ljava/lang/String;", "getExists", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsumerSessionLookup implements StripeModel {
    public static final Parcelable.Creator<ConsumerSessionLookup> CREATOR = new Creator();
    private final ConsumerSession consumerSession;
    private final String errorMessage;
    private final boolean exists;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ConsumerSessionLookup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionLookup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsumerSessionLookup(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSessionLookup[] newArray(int i) {
            return new ConsumerSessionLookup[i];
        }
    }

    public ConsumerSessionLookup(boolean z, ConsumerSession consumerSession, String str) {
        this.exists = z;
        this.consumerSession = consumerSession;
        this.errorMessage = str;
    }

    public static /* synthetic */ ConsumerSessionLookup copy$default(ConsumerSessionLookup consumerSessionLookup, boolean z, ConsumerSession consumerSession, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = consumerSessionLookup.exists;
        }
        if ((i & 2) != 0) {
            consumerSession = consumerSessionLookup.consumerSession;
        }
        if ((i & 4) != 0) {
            str = consumerSessionLookup.errorMessage;
        }
        return consumerSessionLookup.copy(z, consumerSession, str);
    }

    public final boolean component1() {
        return this.exists;
    }

    public final ConsumerSession component2() {
        return this.consumerSession;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final ConsumerSessionLookup copy(boolean z, ConsumerSession consumerSession, String str) {
        return new ConsumerSessionLookup(z, consumerSession, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsumerSessionLookup) {
            ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) obj;
            return this.exists == consumerSessionLookup.exists && Intrinsics.areEqual(this.consumerSession, consumerSessionLookup.consumerSession) && Intrinsics.areEqual(this.errorMessage, consumerSessionLookup.errorMessage);
        }
        return false;
    }

    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getExists() {
        return this.exists;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        boolean z = this.exists;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ConsumerSession consumerSession = this.consumerSession;
        int hashCode = (i + (consumerSession == null ? 0 : consumerSession.hashCode())) * 31;
        String str = this.errorMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.exists;
        ConsumerSession consumerSession = this.consumerSession;
        String str = this.errorMessage;
        return "ConsumerSessionLookup(exists=" + z + ", consumerSession=" + consumerSession + ", errorMessage=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.exists ? 1 : 0);
        ConsumerSession consumerSession = this.consumerSession;
        if (consumerSession == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            consumerSession.writeToParcel(out, i);
        }
        out.writeString(this.errorMessage);
    }
}
