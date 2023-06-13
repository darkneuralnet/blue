package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/RepairTypeAssetManifestItem;", "Lco/bird/android/model/AssetManifestItem;", "repairTypeId", "", "assetId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getRepairTypeId", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairTypeAssetManifestItem implements AssetManifestItem {
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("repair_type_id")
    @InterfaceC41208ft5("repair_type_id")
    private final String repairTypeId;

    public RepairTypeAssetManifestItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RepairTypeAssetManifestItem copy$default(RepairTypeAssetManifestItem repairTypeAssetManifestItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairTypeAssetManifestItem.repairTypeId;
        }
        if ((i & 2) != 0) {
            str2 = repairTypeAssetManifestItem.assetId;
        }
        return repairTypeAssetManifestItem.copy(str, str2);
    }

    public final String component1() {
        return this.repairTypeId;
    }

    public final String component2() {
        return this.assetId;
    }

    public final RepairTypeAssetManifestItem copy(String repairTypeId, String str) {
        Intrinsics.checkNotNullParameter(repairTypeId, "repairTypeId");
        return new RepairTypeAssetManifestItem(repairTypeId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairTypeAssetManifestItem) {
            RepairTypeAssetManifestItem repairTypeAssetManifestItem = (RepairTypeAssetManifestItem) obj;
            return Intrinsics.areEqual(this.repairTypeId, repairTypeAssetManifestItem.repairTypeId) && Intrinsics.areEqual(this.assetId, repairTypeAssetManifestItem.assetId);
        }
        return false;
    }

    @Override // co.bird.android.model.AssetManifestItem
    public String getAssetId() {
        return this.assetId;
    }

    public final String getRepairTypeId() {
        return this.repairTypeId;
    }

    public int hashCode() {
        int hashCode = this.repairTypeId.hashCode() * 31;
        String str = this.assetId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.repairTypeId;
        String str2 = this.assetId;
        return "RepairTypeAssetManifestItem(repairTypeId=" + str + ", assetId=" + str2 + ")";
    }

    public RepairTypeAssetManifestItem(String repairTypeId, String str) {
        Intrinsics.checkNotNullParameter(repairTypeId, "repairTypeId");
        this.repairTypeId = repairTypeId;
        this.assetId = str;
    }

    public /* synthetic */ RepairTypeAssetManifestItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
