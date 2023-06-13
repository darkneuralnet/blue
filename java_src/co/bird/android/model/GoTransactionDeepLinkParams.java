package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/GoTransactionDeepLinkParams;", "Lco/bird/android/model/ParceableGoDeepLinkParams;", "rideId", "", "receiptId", "(Ljava/lang/String;Ljava/lang/String;)V", "getReceiptId", "()Ljava/lang/String;", "getRideId", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GoTransactionDeepLinkParams implements ParceableGoDeepLinkParams {
    public static final Parcelable.Creator<GoTransactionDeepLinkParams> CREATOR = new Creator();
    private final String receiptId;
    private final String rideId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<GoTransactionDeepLinkParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoTransactionDeepLinkParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoTransactionDeepLinkParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoTransactionDeepLinkParams[] newArray(int i) {
            return new GoTransactionDeepLinkParams[i];
        }
    }

    public GoTransactionDeepLinkParams() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ GoTransactionDeepLinkParams copy$default(GoTransactionDeepLinkParams goTransactionDeepLinkParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goTransactionDeepLinkParams.rideId;
        }
        if ((i & 2) != 0) {
            str2 = goTransactionDeepLinkParams.receiptId;
        }
        return goTransactionDeepLinkParams.copy(str, str2);
    }

    public final String component1() {
        return this.rideId;
    }

    public final String component2() {
        return this.receiptId;
    }

    public final GoTransactionDeepLinkParams copy(String str, String str2) {
        return new GoTransactionDeepLinkParams(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GoTransactionDeepLinkParams) {
            GoTransactionDeepLinkParams goTransactionDeepLinkParams = (GoTransactionDeepLinkParams) obj;
            return Intrinsics.areEqual(this.rideId, goTransactionDeepLinkParams.rideId) && Intrinsics.areEqual(this.receiptId, goTransactionDeepLinkParams.receiptId);
        }
        return false;
    }

    public final String getReceiptId() {
        return this.receiptId;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public int hashCode() {
        String str = this.rideId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.receiptId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.rideId;
        String str2 = this.receiptId;
        return "GoTransactionDeepLinkParams(rideId=" + str + ", receiptId=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.rideId);
        out.writeString(this.receiptId);
    }

    public GoTransactionDeepLinkParams(String str, String str2) {
        this.rideId = str;
        this.receiptId = str2;
    }

    public /* synthetic */ GoTransactionDeepLinkParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
