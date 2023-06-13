package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.InventoryScanningError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/persistence/HardCountEntity;", "", "id", "", "hardCountId", "", "scanIdentifier", "identifierCategory", "previousScanIdentifier", "scanErrorCode", "Lco/bird/android/model/constant/InventoryScanningError;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/InventoryScanningError;)V", "getHardCountId", "()Ljava/lang/String;", "getId", "()I", "getIdentifierCategory", "getPreviousScanIdentifier", "getScanErrorCode", "()Lco/bird/android/model/constant/InventoryScanningError;", "getScanIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class HardCountEntity {
    private final String hardCountId;

    /* renamed from: id */
    private final int f66678id;
    private final String identifierCategory;
    private final String previousScanIdentifier;
    private final InventoryScanningError scanErrorCode;
    private final String scanIdentifier;

    public HardCountEntity(int i, String hardCountId, String scanIdentifier, String identifierCategory, String str, InventoryScanningError inventoryScanningError) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(identifierCategory, "identifierCategory");
        this.f66678id = i;
        this.hardCountId = hardCountId;
        this.scanIdentifier = scanIdentifier;
        this.identifierCategory = identifierCategory;
        this.previousScanIdentifier = str;
        this.scanErrorCode = inventoryScanningError;
    }

    public static /* synthetic */ HardCountEntity copy$default(HardCountEntity hardCountEntity, int i, String str, String str2, String str3, String str4, InventoryScanningError inventoryScanningError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hardCountEntity.f66678id;
        }
        if ((i2 & 2) != 0) {
            str = hardCountEntity.hardCountId;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = hardCountEntity.scanIdentifier;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = hardCountEntity.identifierCategory;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = hardCountEntity.previousScanIdentifier;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            inventoryScanningError = hardCountEntity.scanErrorCode;
        }
        return hardCountEntity.copy(i, str5, str6, str7, str8, inventoryScanningError);
    }

    public final int component1() {
        return this.f66678id;
    }

    public final String component2() {
        return this.hardCountId;
    }

    public final String component3() {
        return this.scanIdentifier;
    }

    public final String component4() {
        return this.identifierCategory;
    }

    public final String component5() {
        return this.previousScanIdentifier;
    }

    public final InventoryScanningError component6() {
        return this.scanErrorCode;
    }

    public final HardCountEntity copy(int i, String hardCountId, String scanIdentifier, String identifierCategory, String str, InventoryScanningError inventoryScanningError) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(identifierCategory, "identifierCategory");
        return new HardCountEntity(i, hardCountId, scanIdentifier, identifierCategory, str, inventoryScanningError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HardCountEntity) {
            HardCountEntity hardCountEntity = (HardCountEntity) obj;
            return this.f66678id == hardCountEntity.f66678id && Intrinsics.areEqual(this.hardCountId, hardCountEntity.hardCountId) && Intrinsics.areEqual(this.scanIdentifier, hardCountEntity.scanIdentifier) && Intrinsics.areEqual(this.identifierCategory, hardCountEntity.identifierCategory) && Intrinsics.areEqual(this.previousScanIdentifier, hardCountEntity.previousScanIdentifier) && this.scanErrorCode == hardCountEntity.scanErrorCode;
        }
        return false;
    }

    public final String getHardCountId() {
        return this.hardCountId;
    }

    public final int getId() {
        return this.f66678id;
    }

    public final String getIdentifierCategory() {
        return this.identifierCategory;
    }

    public final String getPreviousScanIdentifier() {
        return this.previousScanIdentifier;
    }

    public final InventoryScanningError getScanErrorCode() {
        return this.scanErrorCode;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f66678id) * 31) + this.hardCountId.hashCode()) * 31) + this.scanIdentifier.hashCode()) * 31) + this.identifierCategory.hashCode()) * 31;
        String str = this.previousScanIdentifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        InventoryScanningError inventoryScanningError = this.scanErrorCode;
        return hashCode2 + (inventoryScanningError != null ? inventoryScanningError.hashCode() : 0);
    }

    public String toString() {
        int i = this.f66678id;
        String str = this.hardCountId;
        String str2 = this.scanIdentifier;
        String str3 = this.identifierCategory;
        String str4 = this.previousScanIdentifier;
        InventoryScanningError inventoryScanningError = this.scanErrorCode;
        return "HardCountEntity(id=" + i + ", hardCountId=" + str + ", scanIdentifier=" + str2 + ", identifierCategory=" + str3 + ", previousScanIdentifier=" + str4 + ", scanErrorCode=" + inventoryScanningError + ")";
    }

    public /* synthetic */ HardCountEntity(int i, String str, String str2, String str3, String str4, InventoryScanningError inventoryScanningError, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : inventoryScanningError);
    }
}
