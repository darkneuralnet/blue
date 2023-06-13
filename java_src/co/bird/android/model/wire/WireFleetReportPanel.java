package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReportPanel;", "", "title", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "color", "Lco/bird/android/model/wire/WireThemedColors;", "info", "actualValue", "actualValueMessage", "targetValue", "chart", "Lco/bird/android/model/wire/WireFleetReportChart;", "(Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFleetReportChart;)V", "getActualValue", "()Ljava/lang/String;", "getActualValueMessage", "getChart", "()Lco/bird/android/model/wire/WireFleetReportChart;", "getColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getInfo", "getTargetValue", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetReportPanel {
    @JsonProperty("actual_value")
    @InterfaceC41208ft5("actual_value")
    private final String actualValue;
    @JsonProperty("actual_value_message")
    @InterfaceC41208ft5("actual_value_message")
    private final String actualValueMessage;
    @JsonProperty("chart")
    @InterfaceC41208ft5("chart")
    private final WireFleetReportChart chart;
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final WireThemedColors color;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("info")
    @InterfaceC41208ft5("info")
    private final String info;
    @JsonProperty("target_value")
    @InterfaceC41208ft5("target_value")
    private final String targetValue;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFleetReportPanel(String title, ClientIcon icon, WireThemedColors color, String str, String str2, String str3, String str4, WireFleetReportChart chart) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.title = title;
        this.icon = icon;
        this.color = color;
        this.info = str;
        this.actualValue = str2;
        this.actualValueMessage = str3;
        this.targetValue = str4;
        this.chart = chart;
    }

    public final String component1() {
        return this.title;
    }

    public final ClientIcon component2() {
        return this.icon;
    }

    public final WireThemedColors component3() {
        return this.color;
    }

    public final String component4() {
        return this.info;
    }

    public final String component5() {
        return this.actualValue;
    }

    public final String component6() {
        return this.actualValueMessage;
    }

    public final String component7() {
        return this.targetValue;
    }

    public final WireFleetReportChart component8() {
        return this.chart;
    }

    public final WireFleetReportPanel copy(String title, ClientIcon icon, WireThemedColors color, String str, String str2, String str3, String str4, WireFleetReportChart chart) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(chart, "chart");
        return new WireFleetReportPanel(title, icon, color, str, str2, str3, str4, chart);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetReportPanel) {
            WireFleetReportPanel wireFleetReportPanel = (WireFleetReportPanel) obj;
            return Intrinsics.areEqual(this.title, wireFleetReportPanel.title) && this.icon == wireFleetReportPanel.icon && Intrinsics.areEqual(this.color, wireFleetReportPanel.color) && Intrinsics.areEqual(this.info, wireFleetReportPanel.info) && Intrinsics.areEqual(this.actualValue, wireFleetReportPanel.actualValue) && Intrinsics.areEqual(this.actualValueMessage, wireFleetReportPanel.actualValueMessage) && Intrinsics.areEqual(this.targetValue, wireFleetReportPanel.targetValue) && Intrinsics.areEqual(this.chart, wireFleetReportPanel.chart);
        }
        return false;
    }

    public final String getActualValue() {
        return this.actualValue;
    }

    public final String getActualValueMessage() {
        return this.actualValueMessage;
    }

    public final WireFleetReportChart getChart() {
        return this.chart;
    }

    public final WireThemedColors getColor() {
        return this.color;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getTargetValue() {
        return this.targetValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.icon.hashCode()) * 31) + this.color.hashCode()) * 31;
        String str = this.info;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actualValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actualValueMessage;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetValue;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.chart.hashCode();
    }

    public String toString() {
        String str = this.title;
        ClientIcon clientIcon = this.icon;
        WireThemedColors wireThemedColors = this.color;
        String str2 = this.info;
        String str3 = this.actualValue;
        String str4 = this.actualValueMessage;
        String str5 = this.targetValue;
        WireFleetReportChart wireFleetReportChart = this.chart;
        return "WireFleetReportPanel(title=" + str + ", icon=" + clientIcon + ", color=" + wireThemedColors + ", info=" + str2 + ", actualValue=" + str3 + ", actualValueMessage=" + str4 + ", targetValue=" + str5 + ", chart=" + wireFleetReportChart + ")";
    }

    public /* synthetic */ WireFleetReportPanel(String str, ClientIcon clientIcon, WireThemedColors wireThemedColors, String str2, String str3, String str4, String str5, WireFleetReportChart wireFleetReportChart, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 4) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors, str2, str3, str4, str5, wireFleetReportChart);
    }
}
