package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FleetReportPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetReportPeriod;", "", "startDate", "Lorg/joda/time/DateTime;", "endDate", "granularity", "", "fleetId", "page", "Lco/bird/android/model/constant/FleetReportPage;", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)V", "getEndDate", "()Lorg/joda/time/DateTime;", "getFleetId", "()Ljava/lang/String;", "getGranularity", "getPage", "()Lco/bird/android/model/constant/FleetReportPage;", "getStartDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetReportPeriod {
    private final DateTime endDate;
    private final String fleetId;
    private final String granularity;
    private final FleetReportPage page;
    private final DateTime startDate;

    public FleetReportPeriod(DateTime startDate, DateTime endDate, String granularity, String fleetId, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(granularity, "granularity");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        this.startDate = startDate;
        this.endDate = endDate;
        this.granularity = granularity;
        this.fleetId = fleetId;
        this.page = page;
    }

    public static /* synthetic */ FleetReportPeriod copy$default(FleetReportPeriod fleetReportPeriod, DateTime dateTime, DateTime dateTime2, String str, String str2, FleetReportPage fleetReportPage, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = fleetReportPeriod.startDate;
        }
        if ((i & 2) != 0) {
            dateTime2 = fleetReportPeriod.endDate;
        }
        DateTime dateTime3 = dateTime2;
        if ((i & 4) != 0) {
            str = fleetReportPeriod.granularity;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = fleetReportPeriod.fleetId;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            fleetReportPage = fleetReportPeriod.page;
        }
        return fleetReportPeriod.copy(dateTime, dateTime3, str3, str4, fleetReportPage);
    }

    public final DateTime component1() {
        return this.startDate;
    }

    public final DateTime component2() {
        return this.endDate;
    }

    public final String component3() {
        return this.granularity;
    }

    public final String component4() {
        return this.fleetId;
    }

    public final FleetReportPage component5() {
        return this.page;
    }

    public final FleetReportPeriod copy(DateTime startDate, DateTime endDate, String granularity, String fleetId, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(granularity, "granularity");
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        return new FleetReportPeriod(startDate, endDate, granularity, fleetId, page);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetReportPeriod) {
            FleetReportPeriod fleetReportPeriod = (FleetReportPeriod) obj;
            return Intrinsics.areEqual(this.startDate, fleetReportPeriod.startDate) && Intrinsics.areEqual(this.endDate, fleetReportPeriod.endDate) && Intrinsics.areEqual(this.granularity, fleetReportPeriod.granularity) && Intrinsics.areEqual(this.fleetId, fleetReportPeriod.fleetId) && this.page == fleetReportPeriod.page;
        }
        return false;
    }

    public final DateTime getEndDate() {
        return this.endDate;
    }

    public final String getFleetId() {
        return this.fleetId;
    }

    public final String getGranularity() {
        return this.granularity;
    }

    public final FleetReportPage getPage() {
        return this.page;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return (((((((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31) + this.granularity.hashCode()) * 31) + this.fleetId.hashCode()) * 31) + this.page.hashCode();
    }

    public String toString() {
        DateTime dateTime = this.startDate;
        DateTime dateTime2 = this.endDate;
        String str = this.granularity;
        String str2 = this.fleetId;
        FleetReportPage fleetReportPage = this.page;
        return "FleetReportPeriod(startDate=" + dateTime + ", endDate=" + dateTime2 + ", granularity=" + str + ", fleetId=" + str2 + ", page=" + fleetReportPage + ")";
    }
}
