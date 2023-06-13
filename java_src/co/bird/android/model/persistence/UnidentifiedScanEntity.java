package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.InventoryScanningError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/persistence/UnidentifiedScanEntity;", "", "id", "", "hardCountId", "", "scanIdentifier", "scanErrorCode", "Lco/bird/android/model/constant/InventoryScanningError;", "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/InventoryScanningError;)V", "getHardCountId", "()Ljava/lang/String;", "getId", "()I", "getScanErrorCode", "()Lco/bird/android/model/constant/InventoryScanningError;", "getScanIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UnidentifiedScanEntity {
    private final String hardCountId;

    /* renamed from: id */
    private final int f66691id;
    private final InventoryScanningError scanErrorCode;
    private final String scanIdentifier;

    public UnidentifiedScanEntity(int i, String hardCountId, String scanIdentifier, InventoryScanningError scanErrorCode) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(scanErrorCode, "scanErrorCode");
        this.f66691id = i;
        this.hardCountId = hardCountId;
        this.scanIdentifier = scanIdentifier;
        this.scanErrorCode = scanErrorCode;
    }

    public static /* synthetic */ UnidentifiedScanEntity copy$default(UnidentifiedScanEntity unidentifiedScanEntity, int i, String str, String str2, InventoryScanningError inventoryScanningError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unidentifiedScanEntity.f66691id;
        }
        if ((i2 & 2) != 0) {
            str = unidentifiedScanEntity.hardCountId;
        }
        if ((i2 & 4) != 0) {
            str2 = unidentifiedScanEntity.scanIdentifier;
        }
        if ((i2 & 8) != 0) {
            inventoryScanningError = unidentifiedScanEntity.scanErrorCode;
        }
        return unidentifiedScanEntity.copy(i, str, str2, inventoryScanningError);
    }

    public final int component1() {
        return this.f66691id;
    }

    public final String component2() {
        return this.hardCountId;
    }

    public final String component3() {
        return this.scanIdentifier;
    }

    public final InventoryScanningError component4() {
        return this.scanErrorCode;
    }

    public final UnidentifiedScanEntity copy(int i, String hardCountId, String scanIdentifier, InventoryScanningError scanErrorCode) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(scanErrorCode, "scanErrorCode");
        return new UnidentifiedScanEntity(i, hardCountId, scanIdentifier, scanErrorCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnidentifiedScanEntity) {
            UnidentifiedScanEntity unidentifiedScanEntity = (UnidentifiedScanEntity) obj;
            return this.f66691id == unidentifiedScanEntity.f66691id && Intrinsics.areEqual(this.hardCountId, unidentifiedScanEntity.hardCountId) && Intrinsics.areEqual(this.scanIdentifier, unidentifiedScanEntity.scanIdentifier) && this.scanErrorCode == unidentifiedScanEntity.scanErrorCode;
        }
        return false;
    }

    public final String getHardCountId() {
        return this.hardCountId;
    }

    public final int getId() {
        return this.f66691id;
    }

    public final InventoryScanningError getScanErrorCode() {
        return this.scanErrorCode;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f66691id) * 31) + this.hardCountId.hashCode()) * 31) + this.scanIdentifier.hashCode()) * 31) + this.scanErrorCode.hashCode();
    }

    public String toString() {
        int i = this.f66691id;
        String str = this.hardCountId;
        String str2 = this.scanIdentifier;
        InventoryScanningError inventoryScanningError = this.scanErrorCode;
        return "UnidentifiedScanEntity(id=" + i + ", hardCountId=" + str + ", scanIdentifier=" + str2 + ", scanErrorCode=" + inventoryScanningError + ")";
    }

    public /* synthetic */ UnidentifiedScanEntity(int i, String str, String str2, InventoryScanningError inventoryScanningError, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, inventoryScanningError);
    }
}
