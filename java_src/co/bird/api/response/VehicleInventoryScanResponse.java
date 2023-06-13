package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/response/VehicleInventoryScanResponse;", "", "success", "", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "failure", "(Ljava/util/List;Ljava/util/List;)V", "getFailure", "()Ljava/util/List;", "getSuccess", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehicleInventoryScanResponse {
    @JsonProperty("failure")
    @InterfaceC41208ft5("failure")
    private final List<WireVehicleInventoryScan> failure;
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final List<WireVehicleInventoryScan> success;

    public VehicleInventoryScanResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VehicleInventoryScanResponse copy$default(VehicleInventoryScanResponse vehicleInventoryScanResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = vehicleInventoryScanResponse.success;
        }
        if ((i & 2) != 0) {
            list2 = vehicleInventoryScanResponse.failure;
        }
        return vehicleInventoryScanResponse.copy(list, list2);
    }

    public final List<WireVehicleInventoryScan> component1() {
        return this.success;
    }

    public final List<WireVehicleInventoryScan> component2() {
        return this.failure;
    }

    public final VehicleInventoryScanResponse copy(List<WireVehicleInventoryScan> success, List<WireVehicleInventoryScan> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        return new VehicleInventoryScanResponse(success, failure);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleInventoryScanResponse) {
            VehicleInventoryScanResponse vehicleInventoryScanResponse = (VehicleInventoryScanResponse) obj;
            return Intrinsics.areEqual(this.success, vehicleInventoryScanResponse.success) && Intrinsics.areEqual(this.failure, vehicleInventoryScanResponse.failure);
        }
        return false;
    }

    public final List<WireVehicleInventoryScan> getFailure() {
        return this.failure;
    }

    public final List<WireVehicleInventoryScan> getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (this.success.hashCode() * 31) + this.failure.hashCode();
    }

    public String toString() {
        List<WireVehicleInventoryScan> list = this.success;
        List<WireVehicleInventoryScan> list2 = this.failure;
        return "VehicleInventoryScanResponse(success=" + list + ", failure=" + list2 + ")";
    }

    public VehicleInventoryScanResponse(List<WireVehicleInventoryScan> success, List<WireVehicleInventoryScan> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.success = success;
        this.failure = failure;
    }

    public /* synthetic */ VehicleInventoryScanResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
