package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/persistence/PendingScanEntity;", "", "id", "", "hardCountId", "", "scanIdentifier", "previousScanIdentifier", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHardCountId", "()Ljava/lang/String;", "getId", "()I", "getPreviousScanIdentifier", "getScanIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PendingScanEntity {
    private final String hardCountId;

    /* renamed from: id */
    private final int f66685id;
    private final String previousScanIdentifier;
    private final String scanIdentifier;

    public PendingScanEntity(int i, String hardCountId, String scanIdentifier, String str) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        this.f66685id = i;
        this.hardCountId = hardCountId;
        this.scanIdentifier = scanIdentifier;
        this.previousScanIdentifier = str;
    }

    public static /* synthetic */ PendingScanEntity copy$default(PendingScanEntity pendingScanEntity, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pendingScanEntity.f66685id;
        }
        if ((i2 & 2) != 0) {
            str = pendingScanEntity.hardCountId;
        }
        if ((i2 & 4) != 0) {
            str2 = pendingScanEntity.scanIdentifier;
        }
        if ((i2 & 8) != 0) {
            str3 = pendingScanEntity.previousScanIdentifier;
        }
        return pendingScanEntity.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.f66685id;
    }

    public final String component2() {
        return this.hardCountId;
    }

    public final String component3() {
        return this.scanIdentifier;
    }

    public final String component4() {
        return this.previousScanIdentifier;
    }

    public final PendingScanEntity copy(int i, String hardCountId, String scanIdentifier, String str) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        return new PendingScanEntity(i, hardCountId, scanIdentifier, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PendingScanEntity) {
            PendingScanEntity pendingScanEntity = (PendingScanEntity) obj;
            return this.f66685id == pendingScanEntity.f66685id && Intrinsics.areEqual(this.hardCountId, pendingScanEntity.hardCountId) && Intrinsics.areEqual(this.scanIdentifier, pendingScanEntity.scanIdentifier) && Intrinsics.areEqual(this.previousScanIdentifier, pendingScanEntity.previousScanIdentifier);
        }
        return false;
    }

    public final String getHardCountId() {
        return this.hardCountId;
    }

    public final int getId() {
        return this.f66685id;
    }

    public final String getPreviousScanIdentifier() {
        return this.previousScanIdentifier;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f66685id) * 31) + this.hardCountId.hashCode()) * 31) + this.scanIdentifier.hashCode()) * 31;
        String str = this.previousScanIdentifier;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.f66685id;
        String str = this.hardCountId;
        String str2 = this.scanIdentifier;
        String str3 = this.previousScanIdentifier;
        return "PendingScanEntity(id=" + i + ", hardCountId=" + str + ", scanIdentifier=" + str2 + ", previousScanIdentifier=" + str3 + ")";
    }

    public /* synthetic */ PendingScanEntity(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, (i2 & 8) != 0 ? null : str3);
    }
}
