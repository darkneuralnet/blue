package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneData;", "", "zoneId", "", "overlay", "Lco/bird/android/model/wire/WireZoneOverlay;", "annotation", "Lco/bird/android/model/wire/WireZoneAnnotation;", "selectability", "Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V", "getAnnotation", "()Lco/bird/android/model/wire/WireZoneAnnotation;", "getOverlay", "()Lco/bird/android/model/wire/WireZoneOverlay;", "getSelectability", "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "getZoneId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneData {
    @JsonProperty("annotation")
    @InterfaceC41208ft5("annotation")
    private final WireZoneAnnotation annotation;
    @JsonProperty("overlay")
    @InterfaceC41208ft5("overlay")
    private final WireZoneOverlay overlay;
    @JsonProperty("selectability")
    @InterfaceC41208ft5("selectability")
    private final OperatorMapZoneSelectability selectability;
    @JsonProperty("zone_id")
    @InterfaceC41208ft5("zone_id")
    private final String zoneId;

    public WireZoneData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireZoneData copy$default(WireZoneData wireZoneData, String str, WireZoneOverlay wireZoneOverlay, WireZoneAnnotation wireZoneAnnotation, OperatorMapZoneSelectability operatorMapZoneSelectability, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireZoneData.zoneId;
        }
        if ((i & 2) != 0) {
            wireZoneOverlay = wireZoneData.overlay;
        }
        if ((i & 4) != 0) {
            wireZoneAnnotation = wireZoneData.annotation;
        }
        if ((i & 8) != 0) {
            operatorMapZoneSelectability = wireZoneData.selectability;
        }
        return wireZoneData.copy(str, wireZoneOverlay, wireZoneAnnotation, operatorMapZoneSelectability);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final WireZoneOverlay component2() {
        return this.overlay;
    }

    public final WireZoneAnnotation component3() {
        return this.annotation;
    }

    public final OperatorMapZoneSelectability component4() {
        return this.selectability;
    }

    public final WireZoneData copy(String zoneId, WireZoneOverlay overlay, WireZoneAnnotation wireZoneAnnotation, OperatorMapZoneSelectability selectability) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        return new WireZoneData(zoneId, overlay, wireZoneAnnotation, selectability);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneData) {
            WireZoneData wireZoneData = (WireZoneData) obj;
            return Intrinsics.areEqual(this.zoneId, wireZoneData.zoneId) && Intrinsics.areEqual(this.overlay, wireZoneData.overlay) && Intrinsics.areEqual(this.annotation, wireZoneData.annotation) && this.selectability == wireZoneData.selectability;
        }
        return false;
    }

    public final WireZoneAnnotation getAnnotation() {
        return this.annotation;
    }

    public final WireZoneOverlay getOverlay() {
        return this.overlay;
    }

    public final OperatorMapZoneSelectability getSelectability() {
        return this.selectability;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        int hashCode = ((this.zoneId.hashCode() * 31) + this.overlay.hashCode()) * 31;
        WireZoneAnnotation wireZoneAnnotation = this.annotation;
        return ((hashCode + (wireZoneAnnotation == null ? 0 : wireZoneAnnotation.hashCode())) * 31) + this.selectability.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        WireZoneOverlay wireZoneOverlay = this.overlay;
        WireZoneAnnotation wireZoneAnnotation = this.annotation;
        OperatorMapZoneSelectability operatorMapZoneSelectability = this.selectability;
        return "WireZoneData(zoneId=" + str + ", overlay=" + wireZoneOverlay + ", annotation=" + wireZoneAnnotation + ", selectability=" + operatorMapZoneSelectability + ")";
    }

    public WireZoneData(String zoneId, WireZoneOverlay overlay, WireZoneAnnotation wireZoneAnnotation, OperatorMapZoneSelectability selectability) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        this.zoneId = zoneId;
        this.overlay = overlay;
        this.annotation = wireZoneAnnotation;
        this.selectability = selectability;
    }

    public /* synthetic */ WireZoneData(String str, WireZoneOverlay wireZoneOverlay, WireZoneAnnotation wireZoneAnnotation, OperatorMapZoneSelectability operatorMapZoneSelectability, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new WireZoneOverlay(null, null, 3, null) : wireZoneOverlay, (i & 4) != 0 ? null : wireZoneAnnotation, (i & 8) != 0 ? OperatorMapZoneSelectability.UNKNOWN : operatorMapZoneSelectability);
    }
}
