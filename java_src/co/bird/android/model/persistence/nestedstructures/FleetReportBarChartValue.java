package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartValue;", "", "label", "", "value", "", "color", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "(Ljava/lang/String;Ljava/lang/Double;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getLabel", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartValue;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetReportBarChartValue {
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final ThemedColors color;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final Double value;

    public FleetReportBarChartValue(String label, Double d, ThemedColors color) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(color, "color");
        this.label = label;
        this.value = d;
        this.color = color;
    }

    public static /* synthetic */ FleetReportBarChartValue copy$default(FleetReportBarChartValue fleetReportBarChartValue, String str, Double d, ThemedColors themedColors, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fleetReportBarChartValue.label;
        }
        if ((i & 2) != 0) {
            d = fleetReportBarChartValue.value;
        }
        if ((i & 4) != 0) {
            themedColors = fleetReportBarChartValue.color;
        }
        return fleetReportBarChartValue.copy(str, d, themedColors);
    }

    public final String component1() {
        return this.label;
    }

    public final Double component2() {
        return this.value;
    }

    public final ThemedColors component3() {
        return this.color;
    }

    public final FleetReportBarChartValue copy(String label, Double d, ThemedColors color) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(color, "color");
        return new FleetReportBarChartValue(label, d, color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetReportBarChartValue) {
            FleetReportBarChartValue fleetReportBarChartValue = (FleetReportBarChartValue) obj;
            return Intrinsics.areEqual(this.label, fleetReportBarChartValue.label) && Intrinsics.areEqual((Object) this.value, (Object) fleetReportBarChartValue.value) && Intrinsics.areEqual(this.color, fleetReportBarChartValue.color);
        }
        return false;
    }

    public final ThemedColors getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        Double d = this.value;
        return ((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.color.hashCode();
    }

    public String toString() {
        String str = this.label;
        Double d = this.value;
        ThemedColors themedColors = this.color;
        return "FleetReportBarChartValue(label=" + str + ", value=" + d + ", color=" + themedColors + ")";
    }

    public /* synthetic */ FleetReportBarChartValue(String str, Double d, ThemedColors themedColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, (i & 4) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors);
    }
}
