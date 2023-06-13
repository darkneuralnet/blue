package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BulkScanPurpose;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/BulkScanPurposeBird;", "", "birdId", "", "purpose", "Lco/bird/android/model/constant/BulkScanPurpose;", "(Ljava/lang/String;Lco/bird/android/model/constant/BulkScanPurpose;)V", "getBirdId", "()Ljava/lang/String;", "getPurpose", "()Lco/bird/android/model/constant/BulkScanPurpose;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BulkScanPurposeBird {
    private final String birdId;
    private final BulkScanPurpose purpose;

    public BulkScanPurposeBird(String birdId, BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.birdId = birdId;
        this.purpose = purpose;
    }

    public static /* synthetic */ BulkScanPurposeBird copy$default(BulkScanPurposeBird bulkScanPurposeBird, String str, BulkScanPurpose bulkScanPurpose, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bulkScanPurposeBird.birdId;
        }
        if ((i & 2) != 0) {
            bulkScanPurpose = bulkScanPurposeBird.purpose;
        }
        return bulkScanPurposeBird.copy(str, bulkScanPurpose);
    }

    public final String component1() {
        return this.birdId;
    }

    public final BulkScanPurpose component2() {
        return this.purpose;
    }

    public final BulkScanPurposeBird copy(String birdId, BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return new BulkScanPurposeBird(birdId, purpose);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BulkScanPurposeBird) {
            BulkScanPurposeBird bulkScanPurposeBird = (BulkScanPurposeBird) obj;
            return Intrinsics.areEqual(this.birdId, bulkScanPurposeBird.birdId) && this.purpose == bulkScanPurposeBird.purpose;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final BulkScanPurpose getPurpose() {
        return this.purpose;
    }

    public int hashCode() {
        return (this.birdId.hashCode() * 31) + this.purpose.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        BulkScanPurpose bulkScanPurpose = this.purpose;
        return "BulkScanPurposeBird(birdId=" + str + ", purpose=" + bulkScanPurpose + ")";
    }
}
