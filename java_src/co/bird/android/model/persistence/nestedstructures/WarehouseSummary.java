package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;", "Lco/bird/android/model/persistence/nestedstructures/WarehouseFlightSheetSection;", "idx", "", "title", "", "count", "(ILjava/lang/String;I)V", "getCount", "()I", "getIdx", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WarehouseSummary implements WarehouseFlightSheetSection {
    @JsonProperty("count")
    @InterfaceC41208ft5("count")
    private final int count;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WarehouseSummary(int i, String title, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.idx = i;
        this.title = title;
        this.count = i2;
    }

    public static /* synthetic */ WarehouseSummary copy$default(WarehouseSummary warehouseSummary, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = warehouseSummary.idx;
        }
        if ((i3 & 2) != 0) {
            str = warehouseSummary.title;
        }
        if ((i3 & 4) != 0) {
            i2 = warehouseSummary.count;
        }
        return warehouseSummary.copy(i, str, i2);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.count;
    }

    public final WarehouseSummary copy(int i, String title, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new WarehouseSummary(i, title, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WarehouseSummary) {
            WarehouseSummary warehouseSummary = (WarehouseSummary) obj;
            return this.idx == warehouseSummary.idx && Intrinsics.areEqual(this.title, warehouseSummary.title) && this.count == warehouseSummary.count;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.WarehouseFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        int i2 = this.count;
        return "WarehouseSummary(idx=" + i + ", title=" + str + ", count=" + i2 + ")";
    }
}
