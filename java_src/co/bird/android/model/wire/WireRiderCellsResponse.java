package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderCellsResponse;", "", "cells", "", "", "Lco/bird/android/model/wire/WireRiderCellByType;", "(Ljava/util/Map;)V", "getCells", "()Ljava/util/Map;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderCellsResponse {
    @JsonProperty("cells")
    @InterfaceC41208ft5("cells")
    private final Map<String, WireRiderCellByType> cells;

    public WireRiderCellsResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireRiderCellsResponse copy$default(WireRiderCellsResponse wireRiderCellsResponse, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = wireRiderCellsResponse.cells;
        }
        return wireRiderCellsResponse.copy(map);
    }

    public final Map<String, WireRiderCellByType> component1() {
        return this.cells;
    }

    public final WireRiderCellsResponse copy(Map<String, WireRiderCellByType> map) {
        return new WireRiderCellsResponse(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireRiderCellsResponse) && Intrinsics.areEqual(this.cells, ((WireRiderCellsResponse) obj).cells);
    }

    public final Map<String, WireRiderCellByType> getCells() {
        return this.cells;
    }

    public int hashCode() {
        Map<String, WireRiderCellByType> map = this.cells;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        Map<String, WireRiderCellByType> map = this.cells;
        return "WireRiderCellsResponse(cells=" + map + ")";
    }

    public WireRiderCellsResponse(Map<String, WireRiderCellByType> map) {
        this.cells = map;
    }

    public /* synthetic */ WireRiderCellsResponse(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
