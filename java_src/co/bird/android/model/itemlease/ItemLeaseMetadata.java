package co.bird.android.model.itemlease;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLeaseMetadata;", "Landroid/os/Parcelable;", "helmet", "", "physicalLockSticker", "(Ljava/lang/String;Ljava/lang/String;)V", "getHelmet", "()Ljava/lang/String;", "getPhysicalLockSticker", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLeaseMetadata implements Parcelable {
    public static final Parcelable.Creator<ItemLeaseMetadata> CREATOR = new Creator();
    private final String helmet;
    private final String physicalLockSticker;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ItemLeaseMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ItemLeaseMetadata(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseMetadata[] newArray(int i) {
            return new ItemLeaseMetadata[i];
        }
    }

    public ItemLeaseMetadata() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ItemLeaseMetadata copy$default(ItemLeaseMetadata itemLeaseMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemLeaseMetadata.helmet;
        }
        if ((i & 2) != 0) {
            str2 = itemLeaseMetadata.physicalLockSticker;
        }
        return itemLeaseMetadata.copy(str, str2);
    }

    public final String component1() {
        return this.helmet;
    }

    public final String component2() {
        return this.physicalLockSticker;
    }

    public final ItemLeaseMetadata copy(String str, String str2) {
        return new ItemLeaseMetadata(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ItemLeaseMetadata) {
            ItemLeaseMetadata itemLeaseMetadata = (ItemLeaseMetadata) obj;
            return Intrinsics.areEqual(this.helmet, itemLeaseMetadata.helmet) && Intrinsics.areEqual(this.physicalLockSticker, itemLeaseMetadata.physicalLockSticker);
        }
        return false;
    }

    public final String getHelmet() {
        return this.helmet;
    }

    public final String getPhysicalLockSticker() {
        return this.physicalLockSticker;
    }

    public int hashCode() {
        String str = this.helmet;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.physicalLockSticker;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.helmet;
        String str2 = this.physicalLockSticker;
        return "ItemLeaseMetadata(helmet=" + str + ", physicalLockSticker=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.helmet);
        out.writeString(this.physicalLockSticker);
    }

    public ItemLeaseMetadata(String str, String str2) {
        this.helmet = str;
        this.physicalLockSticker = str2;
    }

    public /* synthetic */ ItemLeaseMetadata(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
