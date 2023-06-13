package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReport;", "", "period", "Lco/bird/android/model/wire/WireFleetReportPeriod;", "subheading", "", "periodOptions", "", "scoreboards", "Lco/bird/android/model/wire/WireFleetTargetScoreboard;", "sections", "Lco/bird/android/model/wire/WireFleetReportSection;", "(Lco/bird/android/model/wire/WireFleetReportPeriod;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPeriod", "()Lco/bird/android/model/wire/WireFleetReportPeriod;", "getPeriodOptions", "()Ljava/util/List;", "getScoreboards", "getSections", "getSubheading", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetReport {
    @JsonProperty("period")
    @InterfaceC41208ft5("period")
    private final WireFleetReportPeriod period;
    @JsonProperty("period_options")
    @InterfaceC41208ft5("period_options")
    private final List<WireFleetReportPeriod> periodOptions;
    @JsonProperty("scoreboards")
    @InterfaceC41208ft5("scoreboards")
    private final List<WireFleetTargetScoreboard> scoreboards;
    @JsonProperty("sections")
    @InterfaceC41208ft5("sections")
    private final List<WireFleetReportSection> sections;
    @JsonProperty("subheading")
    @InterfaceC41208ft5("subheading")
    private final String subheading;

    public WireFleetReport(WireFleetReportPeriod period, String str, List<WireFleetReportPeriod> periodOptions, List<WireFleetTargetScoreboard> scoreboards, List<WireFleetReportSection> sections) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(periodOptions, "periodOptions");
        Intrinsics.checkNotNullParameter(scoreboards, "scoreboards");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.period = period;
        this.subheading = str;
        this.periodOptions = periodOptions;
        this.scoreboards = scoreboards;
        this.sections = sections;
    }

    public static /* synthetic */ WireFleetReport copy$default(WireFleetReport wireFleetReport, WireFleetReportPeriod wireFleetReportPeriod, String str, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            wireFleetReportPeriod = wireFleetReport.period;
        }
        if ((i & 2) != 0) {
            str = wireFleetReport.subheading;
        }
        String str2 = str;
        List<WireFleetReportPeriod> list4 = list;
        if ((i & 4) != 0) {
            list4 = wireFleetReport.periodOptions;
        }
        List list5 = list4;
        List<WireFleetTargetScoreboard> list6 = list2;
        if ((i & 8) != 0) {
            list6 = wireFleetReport.scoreboards;
        }
        List list7 = list6;
        List<WireFleetReportSection> list8 = list3;
        if ((i & 16) != 0) {
            list8 = wireFleetReport.sections;
        }
        return wireFleetReport.copy(wireFleetReportPeriod, str2, list5, list7, list8);
    }

    public final WireFleetReportPeriod component1() {
        return this.period;
    }

    public final String component2() {
        return this.subheading;
    }

    public final List<WireFleetReportPeriod> component3() {
        return this.periodOptions;
    }

    public final List<WireFleetTargetScoreboard> component4() {
        return this.scoreboards;
    }

    public final List<WireFleetReportSection> component5() {
        return this.sections;
    }

    public final WireFleetReport copy(WireFleetReportPeriod period, String str, List<WireFleetReportPeriod> periodOptions, List<WireFleetTargetScoreboard> scoreboards, List<WireFleetReportSection> sections) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(periodOptions, "periodOptions");
        Intrinsics.checkNotNullParameter(scoreboards, "scoreboards");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new WireFleetReport(period, str, periodOptions, scoreboards, sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetReport) {
            WireFleetReport wireFleetReport = (WireFleetReport) obj;
            return Intrinsics.areEqual(this.period, wireFleetReport.period) && Intrinsics.areEqual(this.subheading, wireFleetReport.subheading) && Intrinsics.areEqual(this.periodOptions, wireFleetReport.periodOptions) && Intrinsics.areEqual(this.scoreboards, wireFleetReport.scoreboards) && Intrinsics.areEqual(this.sections, wireFleetReport.sections);
        }
        return false;
    }

    public final WireFleetReportPeriod getPeriod() {
        return this.period;
    }

    public final List<WireFleetReportPeriod> getPeriodOptions() {
        return this.periodOptions;
    }

    public final List<WireFleetTargetScoreboard> getScoreboards() {
        return this.scoreboards;
    }

    public final List<WireFleetReportSection> getSections() {
        return this.sections;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public int hashCode() {
        int hashCode = this.period.hashCode() * 31;
        String str = this.subheading;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.periodOptions.hashCode()) * 31) + this.scoreboards.hashCode()) * 31) + this.sections.hashCode();
    }

    public String toString() {
        WireFleetReportPeriod wireFleetReportPeriod = this.period;
        String str = this.subheading;
        List<WireFleetReportPeriod> list = this.periodOptions;
        List<WireFleetTargetScoreboard> list2 = this.scoreboards;
        List<WireFleetReportSection> list3 = this.sections;
        return "WireFleetReport(period=" + wireFleetReportPeriod + ", subheading=" + str + ", periodOptions=" + list + ", scoreboards=" + list2 + ", sections=" + list3 + ")";
    }
}
