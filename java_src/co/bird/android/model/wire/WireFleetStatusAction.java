package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FleetStatusActionKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetStatusAction;", "", "kind", "Lco/bird/android/model/constant/FleetStatusActionKind;", "mapAction", "Lco/bird/android/model/wire/WireFleetStatusMapAction;", "listAction", "Lco/bird/android/model/wire/WireFleetStatusListAction;", "metadata", "", "", "(Lco/bird/android/model/constant/FleetStatusActionKind;Lco/bird/android/model/wire/WireFleetStatusMapAction;Lco/bird/android/model/wire/WireFleetStatusListAction;Ljava/util/Map;)V", "getKind", "()Lco/bird/android/model/constant/FleetStatusActionKind;", "getListAction", "()Lco/bird/android/model/wire/WireFleetStatusListAction;", "getMapAction", "()Lco/bird/android/model/wire/WireFleetStatusMapAction;", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetStatusAction {
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final FleetStatusActionKind kind;
    @JsonProperty("list_action")
    @InterfaceC41208ft5("list_action")
    private final WireFleetStatusListAction listAction;
    @JsonProperty("map_action")
    @InterfaceC41208ft5("map_action")
    private final WireFleetStatusMapAction mapAction;
    @JsonProperty("metadata")
    @InterfaceC41208ft5("metadata")
    private final Map<String, String> metadata;

    public WireFleetStatusAction() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFleetStatusAction copy$default(WireFleetStatusAction wireFleetStatusAction, FleetStatusActionKind fleetStatusActionKind, WireFleetStatusMapAction wireFleetStatusMapAction, WireFleetStatusListAction wireFleetStatusListAction, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            fleetStatusActionKind = wireFleetStatusAction.kind;
        }
        if ((i & 2) != 0) {
            wireFleetStatusMapAction = wireFleetStatusAction.mapAction;
        }
        if ((i & 4) != 0) {
            wireFleetStatusListAction = wireFleetStatusAction.listAction;
        }
        if ((i & 8) != 0) {
            map = wireFleetStatusAction.metadata;
        }
        return wireFleetStatusAction.copy(fleetStatusActionKind, wireFleetStatusMapAction, wireFleetStatusListAction, map);
    }

    public final FleetStatusActionKind component1() {
        return this.kind;
    }

    public final WireFleetStatusMapAction component2() {
        return this.mapAction;
    }

    public final WireFleetStatusListAction component3() {
        return this.listAction;
    }

    public final Map<String, String> component4() {
        return this.metadata;
    }

    public final WireFleetStatusAction copy(FleetStatusActionKind kind, WireFleetStatusMapAction wireFleetStatusMapAction, WireFleetStatusListAction wireFleetStatusListAction, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new WireFleetStatusAction(kind, wireFleetStatusMapAction, wireFleetStatusListAction, metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetStatusAction) {
            WireFleetStatusAction wireFleetStatusAction = (WireFleetStatusAction) obj;
            return this.kind == wireFleetStatusAction.kind && Intrinsics.areEqual(this.mapAction, wireFleetStatusAction.mapAction) && Intrinsics.areEqual(this.listAction, wireFleetStatusAction.listAction) && Intrinsics.areEqual(this.metadata, wireFleetStatusAction.metadata);
        }
        return false;
    }

    public final FleetStatusActionKind getKind() {
        return this.kind;
    }

    public final WireFleetStatusListAction getListAction() {
        return this.listAction;
    }

    public final WireFleetStatusMapAction getMapAction() {
        return this.mapAction;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = this.kind.hashCode() * 31;
        WireFleetStatusMapAction wireFleetStatusMapAction = this.mapAction;
        int hashCode2 = (hashCode + (wireFleetStatusMapAction == null ? 0 : wireFleetStatusMapAction.hashCode())) * 31;
        WireFleetStatusListAction wireFleetStatusListAction = this.listAction;
        return ((hashCode2 + (wireFleetStatusListAction != null ? wireFleetStatusListAction.hashCode() : 0)) * 31) + this.metadata.hashCode();
    }

    public String toString() {
        FleetStatusActionKind fleetStatusActionKind = this.kind;
        WireFleetStatusMapAction wireFleetStatusMapAction = this.mapAction;
        WireFleetStatusListAction wireFleetStatusListAction = this.listAction;
        Map<String, String> map = this.metadata;
        return "WireFleetStatusAction(kind=" + fleetStatusActionKind + ", mapAction=" + wireFleetStatusMapAction + ", listAction=" + wireFleetStatusListAction + ", metadata=" + map + ")";
    }

    public WireFleetStatusAction(FleetStatusActionKind kind, WireFleetStatusMapAction wireFleetStatusMapAction, WireFleetStatusListAction wireFleetStatusListAction, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.kind = kind;
        this.mapAction = wireFleetStatusMapAction;
        this.listAction = wireFleetStatusListAction;
        this.metadata = metadata;
    }

    public /* synthetic */ WireFleetStatusAction(FleetStatusActionKind fleetStatusActionKind, WireFleetStatusMapAction wireFleetStatusMapAction, WireFleetStatusListAction wireFleetStatusListAction, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FleetStatusActionKind.UNKNOWN : fleetStatusActionKind, (i & 2) != 0 ? null : wireFleetStatusMapAction, (i & 4) != 0 ? null : wireFleetStatusListAction, (i & 8) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
