package co.bird.android.model.itemlease;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.itemlease.p022enum.ItemLeaseAssetPurpose;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/itemlease/ItemLeaseAsset;", "Landroid/os/Parcelable;", "id", "", "leaseId", "assetId", "createdAt", "Lorg/joda/time/DateTime;", "purpose", "Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;)V", "getAssetId", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getLeaseId", "getPurpose", "()Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLeaseAsset implements Parcelable {
    public static final Parcelable.Creator<ItemLeaseAsset> CREATOR = new Creator();
    private final String assetId;
    private final DateTime createdAt;

    /* renamed from: id */
    private final String f66660id;
    private final String leaseId;
    private final ItemLeaseAssetPurpose purpose;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ItemLeaseAsset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseAsset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ItemLeaseAsset(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), ItemLeaseAssetPurpose.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseAsset[] newArray(int i) {
            return new ItemLeaseAsset[i];
        }
    }

    public ItemLeaseAsset(String id, String leaseId, String assetId, DateTime dateTime, ItemLeaseAssetPurpose purpose) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.f66660id = id;
        this.leaseId = leaseId;
        this.assetId = assetId;
        this.createdAt = dateTime;
        this.purpose = purpose;
    }

    public static /* synthetic */ ItemLeaseAsset copy$default(ItemLeaseAsset itemLeaseAsset, String str, String str2, String str3, DateTime dateTime, ItemLeaseAssetPurpose itemLeaseAssetPurpose, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemLeaseAsset.f66660id;
        }
        if ((i & 2) != 0) {
            str2 = itemLeaseAsset.leaseId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = itemLeaseAsset.assetId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            dateTime = itemLeaseAsset.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            itemLeaseAssetPurpose = itemLeaseAsset.purpose;
        }
        return itemLeaseAsset.copy(str, str4, str5, dateTime2, itemLeaseAssetPurpose);
    }

    public final String component1() {
        return this.f66660id;
    }

    public final String component2() {
        return this.leaseId;
    }

    public final String component3() {
        return this.assetId;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final ItemLeaseAssetPurpose component5() {
        return this.purpose;
    }

    public final ItemLeaseAsset copy(String id, String leaseId, String assetId, DateTime dateTime, ItemLeaseAssetPurpose purpose) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return new ItemLeaseAsset(id, leaseId, assetId, dateTime, purpose);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ItemLeaseAsset) {
            ItemLeaseAsset itemLeaseAsset = (ItemLeaseAsset) obj;
            return Intrinsics.areEqual(this.f66660id, itemLeaseAsset.f66660id) && Intrinsics.areEqual(this.leaseId, itemLeaseAsset.leaseId) && Intrinsics.areEqual(this.assetId, itemLeaseAsset.assetId) && Intrinsics.areEqual(this.createdAt, itemLeaseAsset.createdAt) && this.purpose == itemLeaseAsset.purpose;
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66660id;
    }

    public final String getLeaseId() {
        return this.leaseId;
    }

    public final ItemLeaseAssetPurpose getPurpose() {
        return this.purpose;
    }

    public int hashCode() {
        int hashCode = ((((this.f66660id.hashCode() * 31) + this.leaseId.hashCode()) * 31) + this.assetId.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        return ((hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.purpose.hashCode();
    }

    public String toString() {
        String str = this.f66660id;
        String str2 = this.leaseId;
        String str3 = this.assetId;
        DateTime dateTime = this.createdAt;
        ItemLeaseAssetPurpose itemLeaseAssetPurpose = this.purpose;
        return "ItemLeaseAsset(id=" + str + ", leaseId=" + str2 + ", assetId=" + str3 + ", createdAt=" + dateTime + ", purpose=" + itemLeaseAssetPurpose + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66660id);
        out.writeString(this.leaseId);
        out.writeString(this.assetId);
        out.writeSerializable(this.createdAt);
        this.purpose.writeToParcel(out, i);
    }

    public /* synthetic */ ItemLeaseAsset(String str, String str2, String str3, DateTime dateTime, ItemLeaseAssetPurpose itemLeaseAssetPurpose, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : dateTime, itemLeaseAssetPurpose);
    }
}
