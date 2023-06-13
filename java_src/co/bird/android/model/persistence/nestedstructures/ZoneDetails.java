package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;", "Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetSection;", "idx", "", "title", "", "details", "", "Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;", "(ILjava/lang/String;Ljava/util/List;)V", "getDetails", "()Ljava/util/List;", "getIdx", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneDetails implements ZoneFlightSheetSection {
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<ZoneDetail> details;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public ZoneDetails(int i, String title, List<ZoneDetail> details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.title = title;
        this.details = details;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneDetails copy$default(ZoneDetails zoneDetails, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = zoneDetails.idx;
        }
        if ((i2 & 2) != 0) {
            str = zoneDetails.title;
        }
        if ((i2 & 4) != 0) {
            list = zoneDetails.details;
        }
        return zoneDetails.copy(i, str, list);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final List<ZoneDetail> component3() {
        return this.details;
    }

    public final ZoneDetails copy(int i, String title, List<ZoneDetail> details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new ZoneDetails(i, title, details);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneDetails) {
            ZoneDetails zoneDetails = (ZoneDetails) obj;
            return this.idx == zoneDetails.idx && Intrinsics.areEqual(this.title, zoneDetails.title) && Intrinsics.areEqual(this.details, zoneDetails.details);
        }
        return false;
    }

    public final List<ZoneDetail> getDetails() {
        return this.details;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.ZoneFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + this.details.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        List<ZoneDetail> list = this.details;
        return "ZoneDetails(idx=" + i + ", title=" + str + ", details=" + list + ")";
    }
}