package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "", "successfulScannedItems", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "failedScannedItems", "Lco/bird/android/model/wire/WireFailedScannedItem;", "(Ljava/util/List;Ljava/util/List;)V", "getFailedScannedItems", "()Ljava/util/List;", "getSuccessfulScannedItems", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSkuScannedItems {
    @JsonProperty("failure_scans")
    @InterfaceC41208ft5("failure_scans")
    private final List<WireFailedScannedItem> failedScannedItems;
    @JsonProperty("success_scans")
    @InterfaceC41208ft5("success_scans")
    private final List<WireSuccessfulScannedItem> successfulScannedItems;

    public WireSkuScannedItems() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireSkuScannedItems copy$default(WireSkuScannedItems wireSkuScannedItems, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wireSkuScannedItems.successfulScannedItems;
        }
        if ((i & 2) != 0) {
            list2 = wireSkuScannedItems.failedScannedItems;
        }
        return wireSkuScannedItems.copy(list, list2);
    }

    public final List<WireSuccessfulScannedItem> component1() {
        return this.successfulScannedItems;
    }

    public final List<WireFailedScannedItem> component2() {
        return this.failedScannedItems;
    }

    public final WireSkuScannedItems copy(List<WireSuccessfulScannedItem> successfulScannedItems, List<WireFailedScannedItem> failedScannedItems) {
        Intrinsics.checkNotNullParameter(successfulScannedItems, "successfulScannedItems");
        Intrinsics.checkNotNullParameter(failedScannedItems, "failedScannedItems");
        return new WireSkuScannedItems(successfulScannedItems, failedScannedItems);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSkuScannedItems) {
            WireSkuScannedItems wireSkuScannedItems = (WireSkuScannedItems) obj;
            return Intrinsics.areEqual(this.successfulScannedItems, wireSkuScannedItems.successfulScannedItems) && Intrinsics.areEqual(this.failedScannedItems, wireSkuScannedItems.failedScannedItems);
        }
        return false;
    }

    public final List<WireFailedScannedItem> getFailedScannedItems() {
        return this.failedScannedItems;
    }

    public final List<WireSuccessfulScannedItem> getSuccessfulScannedItems() {
        return this.successfulScannedItems;
    }

    public int hashCode() {
        return (this.successfulScannedItems.hashCode() * 31) + this.failedScannedItems.hashCode();
    }

    public String toString() {
        List<WireSuccessfulScannedItem> list = this.successfulScannedItems;
        List<WireFailedScannedItem> list2 = this.failedScannedItems;
        return "WireSkuScannedItems(successfulScannedItems=" + list + ", failedScannedItems=" + list2 + ")";
    }

    public WireSkuScannedItems(List<WireSuccessfulScannedItem> successfulScannedItems, List<WireFailedScannedItem> failedScannedItems) {
        Intrinsics.checkNotNullParameter(successfulScannedItems, "successfulScannedItems");
        Intrinsics.checkNotNullParameter(failedScannedItems, "failedScannedItems");
        this.successfulScannedItems = successfulScannedItems;
        this.failedScannedItems = failedScannedItems;
    }

    public /* synthetic */ WireSkuScannedItems(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
