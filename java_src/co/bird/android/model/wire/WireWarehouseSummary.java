package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseSummary;", "Lco/bird/android/model/wire/WireWarehouseFlightSheetSection;", "idx", "", "title", "", "count", "(ILjava/lang/String;I)V", "getCount", "()I", "getIdx", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireWarehouseSummary implements WireWarehouseFlightSheetSection {
    @JsonProperty("count")
    @InterfaceC41208ft5("count")
    private final int count;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireWarehouseSummary() {
        this(0, null, 0, 7, null);
    }

    public static /* synthetic */ WireWarehouseSummary copy$default(WireWarehouseSummary wireWarehouseSummary, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wireWarehouseSummary.idx;
        }
        if ((i3 & 2) != 0) {
            str = wireWarehouseSummary.title;
        }
        if ((i3 & 4) != 0) {
            i2 = wireWarehouseSummary.count;
        }
        return wireWarehouseSummary.copy(i, str, i2);
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

    public final WireWarehouseSummary copy(int i, String title, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireWarehouseSummary(i, title, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireWarehouseSummary) {
            WireWarehouseSummary wireWarehouseSummary = (WireWarehouseSummary) obj;
            return this.idx == wireWarehouseSummary.idx && Intrinsics.areEqual(this.title, wireWarehouseSummary.title) && this.count == wireWarehouseSummary.count;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    @Override // co.bird.android.model.wire.WireWarehouseFlightSheetSection
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
        return "WireWarehouseSummary(idx=" + i + ", title=" + str + ", count=" + i2 + ")";
    }

    public WireWarehouseSummary(int i, String title, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.idx = i;
        this.title = title;
        this.count = i2;
    }

    public /* synthetic */ WireWarehouseSummary(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
