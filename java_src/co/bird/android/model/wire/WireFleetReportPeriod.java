package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReportPeriod;", "", "startDate", "Lorg/joda/time/DateTime;", "endDate", "granularity", "", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getEndDate", "()Lorg/joda/time/DateTime;", "getGranularity", "()Ljava/lang/String;", "getStartDate", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFleetReportPeriod {
    @JsonProperty("end_date")
    @InterfaceC41208ft5("end_date")
    private final DateTime endDate;
    @JsonProperty("granularity")
    @InterfaceC41208ft5("granularity")
    private final String granularity;
    @JsonProperty("start_date")
    @InterfaceC41208ft5("start_date")
    private final DateTime startDate;

    public WireFleetReportPeriod() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireFleetReportPeriod copy$default(WireFleetReportPeriod wireFleetReportPeriod, DateTime dateTime, DateTime dateTime2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = wireFleetReportPeriod.startDate;
        }
        if ((i & 2) != 0) {
            dateTime2 = wireFleetReportPeriod.endDate;
        }
        if ((i & 4) != 0) {
            str = wireFleetReportPeriod.granularity;
        }
        return wireFleetReportPeriod.copy(dateTime, dateTime2, str);
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

    public final WireFleetReportPeriod copy(DateTime startDate, DateTime endDate, String granularity) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(granularity, "granularity");
        return new WireFleetReportPeriod(startDate, endDate, granularity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFleetReportPeriod) {
            WireFleetReportPeriod wireFleetReportPeriod = (WireFleetReportPeriod) obj;
            return Intrinsics.areEqual(this.startDate, wireFleetReportPeriod.startDate) && Intrinsics.areEqual(this.endDate, wireFleetReportPeriod.endDate) && Intrinsics.areEqual(this.granularity, wireFleetReportPeriod.granularity);
        }
        return false;
    }

    public final DateTime getEndDate() {
        return this.endDate;
    }

    public final String getGranularity() {
        return this.granularity;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return (((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31) + this.granularity.hashCode();
    }

    public String toString() {
        DateTime dateTime = this.startDate;
        DateTime dateTime2 = this.endDate;
        String str = this.granularity;
        return "WireFleetReportPeriod(startDate=" + dateTime + ", endDate=" + dateTime2 + ", granularity=" + str + ")";
    }

    public WireFleetReportPeriod(DateTime startDate, DateTime endDate, String granularity) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(granularity, "granularity");
        this.startDate = startDate;
        this.endDate = endDate;
        this.granularity = granularity;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireFleetReportPeriod(DateTime dateTime, DateTime dateTime2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTime, dateTime2, (i & 4) != 0 ? "" : str);
        if ((i & 1) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        if ((i & 2) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
