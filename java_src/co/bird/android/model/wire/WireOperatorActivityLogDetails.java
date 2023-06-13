package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "", "isOnDuty", "", "formattedDate", "", "startedAt", "Lorg/joda/time/DateTime;", "endedAt", "totalActivities", "", "shiftAverage", "tasksPerHour", "", "Lco/bird/android/model/wire/WireTaskEntry;", "summary", "Lco/bird/android/model/wire/WireSummaryItem;", "(ZLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;IILjava/util/List;Ljava/util/List;)V", "getEndedAt", "()Lorg/joda/time/DateTime;", "getFormattedDate", "()Ljava/lang/String;", "()Z", "getShiftAverage", "()I", "getStartedAt", "getSummary", "()Ljava/util/List;", "getTasksPerHour", "getTotalActivities", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "Companion", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorActivityLogDetails {
    public static final Companion Companion = new Companion(null);
    private static final WireOperatorActivityLogDetails EMPTY = new WireOperatorActivityLogDetails(false, null, null, null, 0, 0, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    @JsonProperty("ended_at")
    @InterfaceC41208ft5("ended_at")
    private final DateTime endedAt;
    @JsonProperty("formatted_date")
    @InterfaceC41208ft5("formatted_date")
    private final String formattedDate;
    @JsonProperty("is_on_duty")
    @JsonAlias({"on_duty"})
    @InterfaceC41208ft5(alternate = {"on_duty"}, value = "is_on_duty")
    private final boolean isOnDuty;
    @JsonProperty("shift_average")
    @InterfaceC41208ft5("shift_average")
    private final int shiftAverage;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("summary")
    @InterfaceC41208ft5("summary")
    private final List<WireSummaryItem> summary;
    @JsonProperty("tasks_per_hour")
    @InterfaceC41208ft5("tasks_per_hour")
    private final List<WireTaskEntry> tasksPerHour;
    @JsonProperty("total_activities")
    @InterfaceC41208ft5("total_activities")
    private final int totalActivities;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorActivityLogDetails$Companion;", "", "()V", "EMPTY", "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "getEMPTY", "()Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WireOperatorActivityLogDetails getEMPTY() {
            return WireOperatorActivityLogDetails.EMPTY;
        }

        private Companion() {
        }
    }

    public WireOperatorActivityLogDetails() {
        this(false, null, null, null, 0, 0, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final boolean component1() {
        return this.isOnDuty;
    }

    public final String component2() {
        return this.formattedDate;
    }

    public final DateTime component3() {
        return this.startedAt;
    }

    public final DateTime component4() {
        return this.endedAt;
    }

    public final int component5() {
        return this.totalActivities;
    }

    public final int component6() {
        return this.shiftAverage;
    }

    public final List<WireTaskEntry> component7() {
        return this.tasksPerHour;
    }

    public final List<WireSummaryItem> component8() {
        return this.summary;
    }

    public final WireOperatorActivityLogDetails copy(boolean z, String formattedDate, DateTime dateTime, DateTime dateTime2, int i, int i2, List<WireTaskEntry> tasksPerHour, List<WireSummaryItem> summary) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        Intrinsics.checkNotNullParameter(tasksPerHour, "tasksPerHour");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new WireOperatorActivityLogDetails(z, formattedDate, dateTime, dateTime2, i, i2, tasksPerHour, summary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorActivityLogDetails) {
            WireOperatorActivityLogDetails wireOperatorActivityLogDetails = (WireOperatorActivityLogDetails) obj;
            return this.isOnDuty == wireOperatorActivityLogDetails.isOnDuty && Intrinsics.areEqual(this.formattedDate, wireOperatorActivityLogDetails.formattedDate) && Intrinsics.areEqual(this.startedAt, wireOperatorActivityLogDetails.startedAt) && Intrinsics.areEqual(this.endedAt, wireOperatorActivityLogDetails.endedAt) && this.totalActivities == wireOperatorActivityLogDetails.totalActivities && this.shiftAverage == wireOperatorActivityLogDetails.shiftAverage && Intrinsics.areEqual(this.tasksPerHour, wireOperatorActivityLogDetails.tasksPerHour) && Intrinsics.areEqual(this.summary, wireOperatorActivityLogDetails.summary);
        }
        return false;
    }

    public final DateTime getEndedAt() {
        return this.endedAt;
    }

    public final String getFormattedDate() {
        return this.formattedDate;
    }

    public final int getShiftAverage() {
        return this.shiftAverage;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final List<WireSummaryItem> getSummary() {
        return this.summary;
    }

    public final List<WireTaskEntry> getTasksPerHour() {
        return this.tasksPerHour;
    }

    public final int getTotalActivities() {
        return this.totalActivities;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.isOnDuty;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.formattedDate.hashCode()) * 31;
        DateTime dateTime = this.startedAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.endedAt;
        return ((((((((hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31) + Integer.hashCode(this.totalActivities)) * 31) + Integer.hashCode(this.shiftAverage)) * 31) + this.tasksPerHour.hashCode()) * 31) + this.summary.hashCode();
    }

    public final boolean isOnDuty() {
        return this.isOnDuty;
    }

    public String toString() {
        boolean z = this.isOnDuty;
        String str = this.formattedDate;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.endedAt;
        int i = this.totalActivities;
        int i2 = this.shiftAverage;
        List<WireTaskEntry> list = this.tasksPerHour;
        List<WireSummaryItem> list2 = this.summary;
        return "WireOperatorActivityLogDetails(isOnDuty=" + z + ", formattedDate=" + str + ", startedAt=" + dateTime + ", endedAt=" + dateTime2 + ", totalActivities=" + i + ", shiftAverage=" + i2 + ", tasksPerHour=" + list + ", summary=" + list2 + ")";
    }

    public WireOperatorActivityLogDetails(boolean z, String formattedDate, DateTime dateTime, DateTime dateTime2, int i, int i2, List<WireTaskEntry> tasksPerHour, List<WireSummaryItem> summary) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        Intrinsics.checkNotNullParameter(tasksPerHour, "tasksPerHour");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.isOnDuty = z;
        this.formattedDate = formattedDate;
        this.startedAt = dateTime;
        this.endedAt = dateTime2;
        this.totalActivities = i;
        this.shiftAverage = i2;
        this.tasksPerHour = tasksPerHour;
        this.summary = summary;
    }

    public /* synthetic */ WireOperatorActivityLogDetails(boolean z, String str, DateTime dateTime, DateTime dateTime2, int i, int i2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : dateTime, (i3 & 8) == 0 ? dateTime2 : null, (i3 & 16) != 0 ? 0 : i, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
