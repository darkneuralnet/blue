package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.LineStroke;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\fHÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReportLineChartLine;", "", "values", "", "", "color", "Lco/bird/android/model/wire/WireThemedColors;", "stroke", "Lco/bird/android/model/constant/LineStroke;", "label", "", "nullValueIndexes", "", "(Ljava/util/List;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/LineStroke;Ljava/lang/String;Ljava/util/List;)V", "getColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getLabel", "()Ljava/lang/String;", "getNullValueIndexes", "()Ljava/util/List;", "getStroke", "()Lco/bird/android/model/constant/LineStroke;", "getValues", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetReportLineChartLine {
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final WireThemedColors color;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("null_value_indexes")
    @InterfaceC41208ft5("null_value_indexes")
    private final List<Integer> nullValueIndexes;
    @JsonProperty("stroke")
    @InterfaceC41208ft5("stroke")
    private final LineStroke stroke;
    @JsonProperty("values")
    @InterfaceC41208ft5("values")
    private final List<Double> values;

    public WireFleetReportLineChartLine() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireFleetReportLineChartLine copy$default(WireFleetReportLineChartLine wireFleetReportLineChartLine, List list, WireThemedColors wireThemedColors, LineStroke lineStroke, String str, List list2, int i, Object obj) {
        List<Double> list3 = list;
        if ((i & 1) != 0) {
            list3 = wireFleetReportLineChartLine.values;
        }
        if ((i & 2) != 0) {
            wireThemedColors = wireFleetReportLineChartLine.color;
        }
        WireThemedColors wireThemedColors2 = wireThemedColors;
        if ((i & 4) != 0) {
            lineStroke = wireFleetReportLineChartLine.stroke;
        }
        LineStroke lineStroke2 = lineStroke;
        if ((i & 8) != 0) {
            str = wireFleetReportLineChartLine.label;
        }
        String str2 = str;
        List<Integer> list4 = list2;
        if ((i & 16) != 0) {
            list4 = wireFleetReportLineChartLine.nullValueIndexes;
        }
        return wireFleetReportLineChartLine.copy(list3, wireThemedColors2, lineStroke2, str2, list4);
    }

    public final List<Double> component1() {
        return this.values;
    }

    public final WireThemedColors component2() {
        return this.color;
    }

    public final LineStroke component3() {
        return this.stroke;
    }

    public final String component4() {
        return this.label;
    }

    public final List<Integer> component5() {
        return this.nullValueIndexes;
    }

    public final WireFleetReportLineChartLine copy(List<Double> values, WireThemedColors color, LineStroke stroke, String label, List<Integer> nullValueIndexes) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(nullValueIndexes, "nullValueIndexes");
        return new WireFleetReportLineChartLine(values, color, stroke, label, nullValueIndexes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetReportLineChartLine) {
            WireFleetReportLineChartLine wireFleetReportLineChartLine = (WireFleetReportLineChartLine) obj;
            return Intrinsics.areEqual(this.values, wireFleetReportLineChartLine.values) && Intrinsics.areEqual(this.color, wireFleetReportLineChartLine.color) && this.stroke == wireFleetReportLineChartLine.stroke && Intrinsics.areEqual(this.label, wireFleetReportLineChartLine.label) && Intrinsics.areEqual(this.nullValueIndexes, wireFleetReportLineChartLine.nullValueIndexes);
        }
        return false;
    }

    public final WireThemedColors getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<Integer> getNullValueIndexes() {
        return this.nullValueIndexes;
    }

    public final LineStroke getStroke() {
        return this.stroke;
    }

    public final List<Double> getValues() {
        return this.values;
    }

    public int hashCode() {
        return (((((((this.values.hashCode() * 31) + this.color.hashCode()) * 31) + this.stroke.hashCode()) * 31) + this.label.hashCode()) * 31) + this.nullValueIndexes.hashCode();
    }

    public String toString() {
        List<Double> list = this.values;
        WireThemedColors wireThemedColors = this.color;
        LineStroke lineStroke = this.stroke;
        String str = this.label;
        List<Integer> list2 = this.nullValueIndexes;
        return "WireFleetReportLineChartLine(values=" + list + ", color=" + wireThemedColors + ", stroke=" + lineStroke + ", label=" + str + ", nullValueIndexes=" + list2 + ")";
    }

    public WireFleetReportLineChartLine(List<Double> values, WireThemedColors color, LineStroke stroke, String label, List<Integer> nullValueIndexes) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(nullValueIndexes, "nullValueIndexes");
        this.values = values;
        this.color = color;
        this.stroke = stroke;
        this.label = label;
        this.nullValueIndexes = nullValueIndexes;
    }

    public /* synthetic */ WireFleetReportLineChartLine(List list, WireThemedColors wireThemedColors, LineStroke lineStroke, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, (i & 4) != 0 ? LineStroke.UNKNOWN : lineStroke, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
