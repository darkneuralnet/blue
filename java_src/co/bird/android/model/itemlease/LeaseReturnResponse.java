package co.bird.android.model.itemlease;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseReturnResponse;", "", "lease", "Lco/bird/android/model/itemlease/ItemLease;", "(Lco/bird/android/model/itemlease/ItemLease;)V", "getLease", "()Lco/bird/android/model/itemlease/ItemLease;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LeaseReturnResponse {
    private final ItemLease lease;

    public LeaseReturnResponse(ItemLease lease) {
        Intrinsics.checkNotNullParameter(lease, "lease");
        this.lease = lease;
    }

    public static /* synthetic */ LeaseReturnResponse copy$default(LeaseReturnResponse leaseReturnResponse, ItemLease itemLease, int i, Object obj) {
        if ((i & 1) != 0) {
            itemLease = leaseReturnResponse.lease;
        }
        return leaseReturnResponse.copy(itemLease);
    }

    public final ItemLease component1() {
        return this.lease;
    }

    public final LeaseReturnResponse copy(ItemLease lease) {
        Intrinsics.checkNotNullParameter(lease, "lease");
        return new LeaseReturnResponse(lease);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeaseReturnResponse) && Intrinsics.areEqual(this.lease, ((LeaseReturnResponse) obj).lease);
    }

    public final ItemLease getLease() {
        return this.lease;
    }

    public int hashCode() {
        return this.lease.hashCode();
    }

    public String toString() {
        ItemLease itemLease = this.lease;
        return "LeaseReturnResponse(lease=" + itemLease + ")";
    }
}
