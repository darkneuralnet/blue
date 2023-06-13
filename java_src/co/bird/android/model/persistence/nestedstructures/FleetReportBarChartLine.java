package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.TargetDirection;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;", "", "value", "", "color", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "fillDirection", "Lco/bird/android/model/constant/TargetDirection;", "(DLco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/TargetDirection;)V", "getColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getFillDirection", "()Lco/bird/android/model/constant/TargetDirection;", "getValue", "()D", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetReportBarChartLine {
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final ThemedColors color;
    @JsonProperty("fill_direction")
    @InterfaceC41208ft5("fill_direction")
    private final TargetDirection fillDirection;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final double value;

    public FleetReportBarChartLine(double d, ThemedColors color, TargetDirection targetDirection) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.value = d;
        this.color = color;
        this.fillDirection = targetDirection;
    }

    public static /* synthetic */ FleetReportBarChartLine copy$default(FleetReportBarChartLine fleetReportBarChartLine, double d, ThemedColors themedColors, TargetDirection targetDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fleetReportBarChartLine.value;
        }
        if ((i & 2) != 0) {
            themedColors = fleetReportBarChartLine.color;
        }
        if ((i & 4) != 0) {
            targetDirection = fleetReportBarChartLine.fillDirection;
        }
        return fleetReportBarChartLine.copy(d, themedColors, targetDirection);
    }

    public final double component1() {
        return this.value;
    }

    public final ThemedColors component2() {
        return this.color;
    }

    public final TargetDirection component3() {
        return this.fillDirection;
    }

    public final FleetReportBarChartLine copy(double d, ThemedColors color, TargetDirection targetDirection) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new FleetReportBarChartLine(d, color, targetDirection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetReportBarChartLine) {
            FleetReportBarChartLine fleetReportBarChartLine = (FleetReportBarChartLine) obj;
            return Double.compare(this.value, fleetReportBarChartLine.value) == 0 && Intrinsics.areEqual(this.color, fleetReportBarChartLine.color) && this.fillDirection == fleetReportBarChartLine.fillDirection;
        }
        return false;
    }

    public final ThemedColors getColor() {
        return this.color;
    }

    public final TargetDirection getFillDirection() {
        return this.fillDirection;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((Double.hashCode(this.value) * 31) + this.color.hashCode()) * 31;
        TargetDirection targetDirection = this.fillDirection;
        return hashCode + (targetDirection == null ? 0 : targetDirection.hashCode());
    }

    public String toString() {
        double d = this.value;
        ThemedColors themedColors = this.color;
        TargetDirection targetDirection = this.fillDirection;
        return "FleetReportBarChartLine(value=" + d + ", color=" + themedColors + ", fillDirection=" + targetDirection + ")";
    }

    public /* synthetic */ FleetReportBarChartLine(double d, ThemedColors themedColors, TargetDirection targetDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors, targetDirection);
    }
}
