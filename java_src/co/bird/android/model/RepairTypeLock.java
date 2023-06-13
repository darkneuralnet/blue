package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/RepairTypeLock;", "Landroid/os/Parcelable;", "repairType", "Lco/bird/android/model/RepairType;", "locked", "", "(Lco/bird/android/model/RepairType;Z)V", "getLocked", "()Z", "getRepairType", "()Lco/bird/android/model/RepairType;", "component1", "component2", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairTypeLock implements Parcelable {
    public static final Parcelable.Creator<RepairTypeLock> CREATOR = new Creator();
    private final boolean locked;
    private final RepairType repairType;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RepairTypeLock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairTypeLock createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RepairTypeLock(RepairType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairTypeLock[] newArray(int i) {
            return new RepairTypeLock[i];
        }
    }

    public RepairTypeLock(RepairType repairType, boolean z) {
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        this.repairType = repairType;
        this.locked = z;
    }

    public static /* synthetic */ RepairTypeLock copy$default(RepairTypeLock repairTypeLock, RepairType repairType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            repairType = repairTypeLock.repairType;
        }
        if ((i & 2) != 0) {
            z = repairTypeLock.locked;
        }
        return repairTypeLock.copy(repairType, z);
    }

    public final RepairType component1() {
        return this.repairType;
    }

    public final boolean component2() {
        return this.locked;
    }

    public final RepairTypeLock copy(RepairType repairType, boolean z) {
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        return new RepairTypeLock(repairType, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairTypeLock) {
            RepairTypeLock repairTypeLock = (RepairTypeLock) obj;
            return Intrinsics.areEqual(this.repairType, repairTypeLock.repairType) && this.locked == repairTypeLock.locked;
        }
        return false;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final RepairType getRepairType() {
        return this.repairType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.repairType.hashCode() * 31;
        boolean z = this.locked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        RepairType repairType = this.repairType;
        boolean z = this.locked;
        return "RepairTypeLock(repairType=" + repairType + ", locked=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.repairType.writeToParcel(out, i);
        out.writeInt(this.locked ? 1 : 0);
    }

    public /* synthetic */ RepairTypeLock(RepairType repairType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(repairType, (i & 2) != 0 ? false : z);
    }
}
