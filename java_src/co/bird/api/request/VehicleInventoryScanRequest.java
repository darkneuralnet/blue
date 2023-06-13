package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.VehicleInventoryAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/VehicleInventoryScanRequest;", "", "vehicleIdentifiers", "", "", "action", "Lco/bird/android/model/constant/VehicleInventoryAction;", "validateOnly", "", "(Ljava/util/List;Lco/bird/android/model/constant/VehicleInventoryAction;Z)V", "getAction", "()Lco/bird/android/model/constant/VehicleInventoryAction;", "getValidateOnly", "()Z", "getVehicleIdentifiers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehicleInventoryScanRequest {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final VehicleInventoryAction action;
    @JsonProperty("validate_only")
    @InterfaceC41208ft5("validate_only")
    private final boolean validateOnly;
    @JsonProperty("vehicle_identifiers")
    @InterfaceC41208ft5("vehicle_identifiers")
    private final List<String> vehicleIdentifiers;

    public VehicleInventoryScanRequest(List<String> vehicleIdentifiers, VehicleInventoryAction action, boolean z) {
        Intrinsics.checkNotNullParameter(vehicleIdentifiers, "vehicleIdentifiers");
        Intrinsics.checkNotNullParameter(action, "action");
        this.vehicleIdentifiers = vehicleIdentifiers;
        this.action = action;
        this.validateOnly = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VehicleInventoryScanRequest copy$default(VehicleInventoryScanRequest vehicleInventoryScanRequest, List list, VehicleInventoryAction vehicleInventoryAction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = vehicleInventoryScanRequest.vehicleIdentifiers;
        }
        if ((i & 2) != 0) {
            vehicleInventoryAction = vehicleInventoryScanRequest.action;
        }
        if ((i & 4) != 0) {
            z = vehicleInventoryScanRequest.validateOnly;
        }
        return vehicleInventoryScanRequest.copy(list, vehicleInventoryAction, z);
    }

    public final List<String> component1() {
        return this.vehicleIdentifiers;
    }

    public final VehicleInventoryAction component2() {
        return this.action;
    }

    public final boolean component3() {
        return this.validateOnly;
    }

    public final VehicleInventoryScanRequest copy(List<String> vehicleIdentifiers, VehicleInventoryAction action, boolean z) {
        Intrinsics.checkNotNullParameter(vehicleIdentifiers, "vehicleIdentifiers");
        Intrinsics.checkNotNullParameter(action, "action");
        return new VehicleInventoryScanRequest(vehicleIdentifiers, action, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleInventoryScanRequest) {
            VehicleInventoryScanRequest vehicleInventoryScanRequest = (VehicleInventoryScanRequest) obj;
            return Intrinsics.areEqual(this.vehicleIdentifiers, vehicleInventoryScanRequest.vehicleIdentifiers) && this.action == vehicleInventoryScanRequest.action && this.validateOnly == vehicleInventoryScanRequest.validateOnly;
        }
        return false;
    }

    public final VehicleInventoryAction getAction() {
        return this.action;
    }

    public final boolean getValidateOnly() {
        return this.validateOnly;
    }

    public final List<String> getVehicleIdentifiers() {
        return this.vehicleIdentifiers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.vehicleIdentifiers.hashCode() * 31) + this.action.hashCode()) * 31;
        boolean z = this.validateOnly;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        List<String> list = this.vehicleIdentifiers;
        VehicleInventoryAction vehicleInventoryAction = this.action;
        boolean z = this.validateOnly;
        return "VehicleInventoryScanRequest(vehicleIdentifiers=" + list + ", action=" + vehicleInventoryAction + ", validateOnly=" + z + ")";
    }
}
