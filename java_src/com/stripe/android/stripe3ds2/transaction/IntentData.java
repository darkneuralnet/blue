package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "Landroid/os/Parcelable;", "clientSecret", "", "sourceId", "publishableKey", "accountId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getClientSecret", "getPublishableKey", "getSourceId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class IntentData implements Parcelable {
    private final String accountId;
    private final String clientSecret;
    private final String publishableKey;
    private final String sourceId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IntentData> CREATOR = new Creator();
    private static final IntentData EMPTY = new IntentData("", "", "", null);

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/IntentData$Companion;", "", "()V", "EMPTY", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getEMPTY", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntentData getEMPTY() {
            return IntentData.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<IntentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentData[] newArray(int i) {
            return new IntentData[i];
        }
    }

    public IntentData(String clientSecret, String sourceId, String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.clientSecret = clientSecret;
        this.sourceId = sourceId;
        this.publishableKey = publishableKey;
        this.accountId = str;
    }

    public static /* synthetic */ IntentData copy$default(IntentData intentData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intentData.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = intentData.sourceId;
        }
        if ((i & 4) != 0) {
            str3 = intentData.publishableKey;
        }
        if ((i & 8) != 0) {
            str4 = intentData.accountId;
        }
        return intentData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.sourceId;
    }

    public final String component3() {
        return this.publishableKey;
    }

    public final String component4() {
        return this.accountId;
    }

    public final IntentData copy(String clientSecret, String sourceId, String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        return new IntentData(clientSecret, sourceId, publishableKey, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntentData) {
            IntentData intentData = (IntentData) obj;
            return Intrinsics.areEqual(this.clientSecret, intentData.clientSecret) && Intrinsics.areEqual(this.sourceId, intentData.sourceId) && Intrinsics.areEqual(this.publishableKey, intentData.publishableKey) && Intrinsics.areEqual(this.accountId, intentData.accountId);
        }
        return false;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        int hashCode = ((((this.clientSecret.hashCode() * 31) + this.sourceId.hashCode()) * 31) + this.publishableKey.hashCode()) * 31;
        String str = this.accountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.clientSecret + ", sourceId=" + this.sourceId + ", publishableKey=" + this.publishableKey + ", accountId=" + this.accountId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.sourceId);
        out.writeString(this.publishableKey);
        out.writeString(this.accountId);
    }

    public /* synthetic */ IntentData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
