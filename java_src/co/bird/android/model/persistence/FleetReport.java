package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FleetReportPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetReport;", "", "period", "Lco/bird/android/model/persistence/FleetReportPeriod;", "subheading", "", "scoreboards", "", "Lco/bird/android/model/persistence/FleetTargetScoreboard;", "sections", "Lco/bird/android/model/persistence/FleetReportSection;", "fleetId", "page", "Lco/bird/android/model/constant/FleetReportPage;", "(Lco/bird/android/model/persistence/FleetReportPeriod;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)V", "getFleetId", "()Ljava/lang/String;", "getPage", "()Lco/bird/android/model/constant/FleetReportPage;", "getPeriod", "()Lco/bird/android/model/persistence/FleetReportPeriod;", "getScoreboards", "()Ljava/util/List;", "getSections", "getSubheading", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetReport {
    private final String fleetId;
    private final FleetReportPage page;
    private final FleetReportPeriod period;
    private final List<FleetTargetScoreboard> scoreboards;
    private final List<FleetReportSection> sections;
    private final String subheading;

    public FleetReport(FleetReportPeriod period, String str, List<FleetTargetScoreboard> scoreboards, List<FleetReportSection> sections, String fleetId, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(scoreboards, "scoreboards");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        this.period = period;
        this.subheading = str;
        this.scoreboards = scoreboards;
        this.sections = sections;
        this.fleetId = fleetId;
        this.page = page;
    }

    public static /* synthetic */ FleetReport copy$default(FleetReport fleetReport, FleetReportPeriod fleetReportPeriod, String str, List list, List list2, String str2, FleetReportPage fleetReportPage, int i, Object obj) {
        if ((i & 1) != 0) {
            fleetReportPeriod = fleetReport.period;
        }
        if ((i & 2) != 0) {
            str = fleetReport.subheading;
        }
        String str3 = str;
        List<FleetTargetScoreboard> list3 = list;
        if ((i & 4) != 0) {
            list3 = fleetReport.scoreboards;
        }
        List list4 = list3;
        List<FleetReportSection> list5 = list2;
        if ((i & 8) != 0) {
            list5 = fleetReport.sections;
        }
        List list6 = list5;
        if ((i & 16) != 0) {
            str2 = fleetReport.fleetId;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            fleetReportPage = fleetReport.page;
        }
        return fleetReport.copy(fleetReportPeriod, str3, list4, list6, str4, fleetReportPage);
    }

    public final FleetReportPeriod component1() {
        return this.period;
    }

    public final String component2() {
        return this.subheading;
    }

    public final List<FleetTargetScoreboard> component3() {
        return this.scoreboards;
    }

    public final List<FleetReportSection> component4() {
        return this.sections;
    }

    public final String component5() {
        return this.fleetId;
    }

    public final FleetReportPage component6() {
        return this.page;
    }

    public final FleetReport copy(FleetReportPeriod period, String str, List<FleetTargetScoreboard> scoreboards, List<FleetReportSection> sections, String fleetId, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(scoreboards, "scoreboards");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        return new FleetReport(period, str, scoreboards, sections, fleetId, page);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetReport) {
            FleetReport fleetReport = (FleetReport) obj;
            return Intrinsics.areEqual(this.period, fleetReport.period) && Intrinsics.areEqual(this.subheading, fleetReport.subheading) && Intrinsics.areEqual(this.scoreboards, fleetReport.scoreboards) && Intrinsics.areEqual(this.sections, fleetReport.sections) && Intrinsics.areEqual(this.fleetId, fleetReport.fleetId) && this.page == fleetReport.page;
        }
        return false;
    }

    public final String getFleetId() {
        return this.fleetId;
    }

    public final FleetReportPage getPage() {
        return this.page;
    }

    public final FleetReportPeriod getPeriod() {
        return this.period;
    }

    public final List<FleetTargetScoreboard> getScoreboards() {
        return this.scoreboards;
    }

    public final List<FleetReportSection> getSections() {
        return this.sections;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public int hashCode() {
        int hashCode = this.period.hashCode() * 31;
        String str = this.subheading;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.scoreboards.hashCode()) * 31) + this.sections.hashCode()) * 31) + this.fleetId.hashCode()) * 31) + this.page.hashCode();
    }

    public String toString() {
        FleetReportPeriod fleetReportPeriod = this.period;
        String str = this.subheading;
        List<FleetTargetScoreboard> list = this.scoreboards;
        List<FleetReportSection> list2 = this.sections;
        String str2 = this.fleetId;
        FleetReportPage fleetReportPage = this.page;
        return "FleetReport(period=" + fleetReportPeriod + ", subheading=" + str + ", scoreboards=" + list + ", sections=" + list2 + ", fleetId=" + str2 + ", page=" + fleetReportPage + ")";
    }
}
