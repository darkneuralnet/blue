package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J'\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderCell;", "", "cellIds", "", "", "strategy", "(Ljava/util/List;Ljava/lang/String;)V", "getCellIds", "()Ljava/util/List;", "getStrategy", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderCell {
    @JsonProperty("cell_ids")
    @InterfaceC41208ft5("cell_ids")
    private final List<String> cellIds;
    @JsonProperty("strategy")
    @InterfaceC41208ft5("strategy")
    private final String strategy;

    public WireRiderCell() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireRiderCell copy$default(WireRiderCell wireRiderCell, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wireRiderCell.cellIds;
        }
        if ((i & 2) != 0) {
            str = wireRiderCell.strategy;
        }
        return wireRiderCell.copy(list, str);
    }

    public final List<String> component1() {
        return this.cellIds;
    }

    public final String component2() {
        return this.strategy;
    }

    public final WireRiderCell copy(List<String> list, String str) {
        return new WireRiderCell(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderCell) {
            WireRiderCell wireRiderCell = (WireRiderCell) obj;
            return Intrinsics.areEqual(this.cellIds, wireRiderCell.cellIds) && Intrinsics.areEqual(this.strategy, wireRiderCell.strategy);
        }
        return false;
    }

    public final List<String> getCellIds() {
        return this.cellIds;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        List<String> list = this.cellIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.strategy;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.cellIds;
        String str = this.strategy;
        return "WireRiderCell(cellIds=" + list + ", strategy=" + str + ")";
    }

    public WireRiderCell(List<String> list, String str) {
        this.cellIds = list;
        this.strategy = str;
    }

    public /* synthetic */ WireRiderCell(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
