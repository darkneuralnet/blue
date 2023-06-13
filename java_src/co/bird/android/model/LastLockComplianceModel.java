package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/LastLockComplianceModel;", "Landroid/os/Parcelable;", "rideId", "", "warnNotCompliant", "", "showCompliant", "lockFormFactor", "(Ljava/lang/String;ZZLjava/lang/String;)V", "getLockFormFactor", "()Ljava/lang/String;", "getRideId", "getShowCompliant", "()Z", "getWarnNotCompliant", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LastLockComplianceModel implements Parcelable {
    public static final Parcelable.Creator<LastLockComplianceModel> CREATOR = new Creator();
    @JsonProperty("lock_form_factor")
    @InterfaceC41208ft5("lock_form_factor")
    private final String lockFormFactor;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;
    @JsonProperty("show_compliant")
    @InterfaceC41208ft5("show_compliant")
    private final boolean showCompliant;
    @JsonProperty("warn_not_compliant")
    @InterfaceC41208ft5("warn_not_compliant")
    private final boolean warnNotCompliant;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<LastLockComplianceModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastLockComplianceModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LastLockComplianceModel(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastLockComplianceModel[] newArray(int i) {
            return new LastLockComplianceModel[i];
        }
    }

    public LastLockComplianceModel() {
        this(null, false, false, null, 15, null);
    }

    public static /* synthetic */ LastLockComplianceModel copy$default(LastLockComplianceModel lastLockComplianceModel, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lastLockComplianceModel.rideId;
        }
        if ((i & 2) != 0) {
            z = lastLockComplianceModel.warnNotCompliant;
        }
        if ((i & 4) != 0) {
            z2 = lastLockComplianceModel.showCompliant;
        }
        if ((i & 8) != 0) {
            str2 = lastLockComplianceModel.lockFormFactor;
        }
        return lastLockComplianceModel.copy(str, z, z2, str2);
    }

    public final String component1() {
        return this.rideId;
    }

    public final boolean component2() {
        return this.warnNotCompliant;
    }

    public final boolean component3() {
        return this.showCompliant;
    }

    public final String component4() {
        return this.lockFormFactor;
    }

    public final LastLockComplianceModel copy(String str, boolean z, boolean z2, String lockFormFactor) {
        Intrinsics.checkNotNullParameter(lockFormFactor, "lockFormFactor");
        return new LastLockComplianceModel(str, z, z2, lockFormFactor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LastLockComplianceModel) {
            LastLockComplianceModel lastLockComplianceModel = (LastLockComplianceModel) obj;
            return Intrinsics.areEqual(this.rideId, lastLockComplianceModel.rideId) && this.warnNotCompliant == lastLockComplianceModel.warnNotCompliant && this.showCompliant == lastLockComplianceModel.showCompliant && Intrinsics.areEqual(this.lockFormFactor, lastLockComplianceModel.lockFormFactor);
        }
        return false;
    }

    public final String getLockFormFactor() {
        return this.lockFormFactor;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final boolean getShowCompliant() {
        return this.showCompliant;
    }

    public final boolean getWarnNotCompliant() {
        return this.warnNotCompliant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.rideId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.warnNotCompliant;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.showCompliant;
        return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.lockFormFactor.hashCode();
    }

    public String toString() {
        String str = this.rideId;
        boolean z = this.warnNotCompliant;
        boolean z2 = this.showCompliant;
        String str2 = this.lockFormFactor;
        return "LastLockComplianceModel(rideId=" + str + ", warnNotCompliant=" + z + ", showCompliant=" + z2 + ", lockFormFactor=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.rideId);
        out.writeInt(this.warnNotCompliant ? 1 : 0);
        out.writeInt(this.showCompliant ? 1 : 0);
        out.writeString(this.lockFormFactor);
    }

    public LastLockComplianceModel(String str, boolean z, boolean z2, String lockFormFactor) {
        Intrinsics.checkNotNullParameter(lockFormFactor, "lockFormFactor");
        this.rideId = str;
        this.warnNotCompliant = z;
        this.showCompliant = z2;
        this.lockFormFactor = lockFormFactor;
    }

    public /* synthetic */ LastLockComplianceModel(String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "cable" : str2);
    }
}
