package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/response/InventoryStatusResponse;", "", "incompleteInventory", "", "Lco/bird/api/response/WireInventory;", "outOfStock", "runningLow", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getIncompleteInventory", "()Ljava/util/List;", "getOutOfStock", "getRunningLow", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InventoryStatusResponse {
    @JsonProperty("incomplete_inventory")
    @InterfaceC41208ft5("incomplete_inventory")
    private final List<WireInventory> incompleteInventory;
    @JsonProperty("out_of_stock")
    @InterfaceC41208ft5("out_of_stock")
    private final List<WireInventory> outOfStock;
    @JsonProperty("running_low")
    @InterfaceC41208ft5("running_low")
    private final List<WireInventory> runningLow;

    public InventoryStatusResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InventoryStatusResponse copy$default(InventoryStatusResponse inventoryStatusResponse, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inventoryStatusResponse.incompleteInventory;
        }
        if ((i & 2) != 0) {
            list2 = inventoryStatusResponse.outOfStock;
        }
        if ((i & 4) != 0) {
            list3 = inventoryStatusResponse.runningLow;
        }
        return inventoryStatusResponse.copy(list, list2, list3);
    }

    public final List<WireInventory> component1() {
        return this.incompleteInventory;
    }

    public final List<WireInventory> component2() {
        return this.outOfStock;
    }

    public final List<WireInventory> component3() {
        return this.runningLow;
    }

    public final InventoryStatusResponse copy(List<WireInventory> incompleteInventory, List<WireInventory> outOfStock, List<WireInventory> runningLow) {
        Intrinsics.checkNotNullParameter(incompleteInventory, "incompleteInventory");
        Intrinsics.checkNotNullParameter(outOfStock, "outOfStock");
        Intrinsics.checkNotNullParameter(runningLow, "runningLow");
        return new InventoryStatusResponse(incompleteInventory, outOfStock, runningLow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InventoryStatusResponse) {
            InventoryStatusResponse inventoryStatusResponse = (InventoryStatusResponse) obj;
            return Intrinsics.areEqual(this.incompleteInventory, inventoryStatusResponse.incompleteInventory) && Intrinsics.areEqual(this.outOfStock, inventoryStatusResponse.outOfStock) && Intrinsics.areEqual(this.runningLow, inventoryStatusResponse.runningLow);
        }
        return false;
    }

    public final List<WireInventory> getIncompleteInventory() {
        return this.incompleteInventory;
    }

    public final List<WireInventory> getOutOfStock() {
        return this.outOfStock;
    }

    public final List<WireInventory> getRunningLow() {
        return this.runningLow;
    }

    public int hashCode() {
        return (((this.incompleteInventory.hashCode() * 31) + this.outOfStock.hashCode()) * 31) + this.runningLow.hashCode();
    }

    public String toString() {
        List<WireInventory> list = this.incompleteInventory;
        List<WireInventory> list2 = this.outOfStock;
        List<WireInventory> list3 = this.runningLow;
        return "InventoryStatusResponse(incompleteInventory=" + list + ", outOfStock=" + list2 + ", runningLow=" + list3 + ")";
    }

    public InventoryStatusResponse(List<WireInventory> incompleteInventory, List<WireInventory> outOfStock, List<WireInventory> runningLow) {
        Intrinsics.checkNotNullParameter(incompleteInventory, "incompleteInventory");
        Intrinsics.checkNotNullParameter(outOfStock, "outOfStock");
        Intrinsics.checkNotNullParameter(runningLow, "runningLow");
        this.incompleteInventory = incompleteInventory;
        this.outOfStock = outOfStock;
        this.runningLow = runningLow;
    }

    public /* synthetic */ InventoryStatusResponse(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
