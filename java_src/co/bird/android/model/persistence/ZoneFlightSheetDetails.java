package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ZoneDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneStatus;
import co.bird.android.model.persistence.nestedstructures.ZoneSummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "", "zoneId", "", "zoneSummary", "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;", "zoneStatus", "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;", "detailSections", "", "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;)V", "getDetailSections", "()Ljava/util/List;", "getZoneId", "()Ljava/lang/String;", "getZoneStatus", "()Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;", "getZoneSummary", "()Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneFlightSheetDetails {
    private final List<ZoneDetails> detailSections;
    private final String zoneId;
    private final ZoneStatus zoneStatus;
    private final ZoneSummary zoneSummary;

    public ZoneFlightSheetDetails(String zoneId, ZoneSummary zoneSummary, ZoneStatus zoneStatus, List<ZoneDetails> detailSections) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneSummary, "zoneSummary");
        Intrinsics.checkNotNullParameter(zoneStatus, "zoneStatus");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        this.zoneId = zoneId;
        this.zoneSummary = zoneSummary;
        this.zoneStatus = zoneStatus;
        this.detailSections = detailSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneFlightSheetDetails copy$default(ZoneFlightSheetDetails zoneFlightSheetDetails, String str, ZoneSummary zoneSummary, ZoneStatus zoneStatus, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneFlightSheetDetails.zoneId;
        }
        if ((i & 2) != 0) {
            zoneSummary = zoneFlightSheetDetails.zoneSummary;
        }
        if ((i & 4) != 0) {
            zoneStatus = zoneFlightSheetDetails.zoneStatus;
        }
        if ((i & 8) != 0) {
            list = zoneFlightSheetDetails.detailSections;
        }
        return zoneFlightSheetDetails.copy(str, zoneSummary, zoneStatus, list);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final ZoneSummary component2() {
        return this.zoneSummary;
    }

    public final ZoneStatus component3() {
        return this.zoneStatus;
    }

    public final List<ZoneDetails> component4() {
        return this.detailSections;
    }

    public final ZoneFlightSheetDetails copy(String zoneId, ZoneSummary zoneSummary, ZoneStatus zoneStatus, List<ZoneDetails> detailSections) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(zoneSummary, "zoneSummary");
        Intrinsics.checkNotNullParameter(zoneStatus, "zoneStatus");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        return new ZoneFlightSheetDetails(zoneId, zoneSummary, zoneStatus, detailSections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneFlightSheetDetails) {
            ZoneFlightSheetDetails zoneFlightSheetDetails = (ZoneFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.zoneId, zoneFlightSheetDetails.zoneId) && Intrinsics.areEqual(this.zoneSummary, zoneFlightSheetDetails.zoneSummary) && Intrinsics.areEqual(this.zoneStatus, zoneFlightSheetDetails.zoneStatus) && Intrinsics.areEqual(this.detailSections, zoneFlightSheetDetails.detailSections);
        }
        return false;
    }

    public final List<ZoneDetails> getDetailSections() {
        return this.detailSections;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public final ZoneStatus getZoneStatus() {
        return this.zoneStatus;
    }

    public final ZoneSummary getZoneSummary() {
        return this.zoneSummary;
    }

    public int hashCode() {
        return (((((this.zoneId.hashCode() * 31) + this.zoneSummary.hashCode()) * 31) + this.zoneStatus.hashCode()) * 31) + this.detailSections.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        ZoneSummary zoneSummary = this.zoneSummary;
        ZoneStatus zoneStatus = this.zoneStatus;
        List<ZoneDetails> list = this.detailSections;
        return "ZoneFlightSheetDetails(zoneId=" + str + ", zoneSummary=" + zoneSummary + ", zoneStatus=" + zoneStatus + ", detailSections=" + list + ")";
    }
}
