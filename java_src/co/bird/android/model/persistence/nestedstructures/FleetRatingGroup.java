package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetRatingGroup;", "", "title", "", "count", "", "birdIds", "", "(Ljava/lang/String;ILjava/util/List;)V", "getBirdIds", "()Ljava/util/List;", "getCount", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetRatingGroup {
    @JsonProperty("bird_ids")
    @InterfaceC41208ft5("bird_ids")
    private final List<String> birdIds;
    @JsonProperty("count")
    @InterfaceC41208ft5("count")
    private final int count;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public FleetRatingGroup(String title, int i, List<String> birdIds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.title = title;
        this.count = i;
        this.birdIds = birdIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FleetRatingGroup copy$default(FleetRatingGroup fleetRatingGroup, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fleetRatingGroup.title;
        }
        if ((i2 & 2) != 0) {
            i = fleetRatingGroup.count;
        }
        if ((i2 & 4) != 0) {
            list = fleetRatingGroup.birdIds;
        }
        return fleetRatingGroup.copy(str, i, list);
    }

    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.count;
    }

    public final List<String> component3() {
        return this.birdIds;
    }

    public final FleetRatingGroup copy(String title, int i, List<String> birdIds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return new FleetRatingGroup(title, i, birdIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetRatingGroup) {
            FleetRatingGroup fleetRatingGroup = (FleetRatingGroup) obj;
            return Intrinsics.areEqual(this.title, fleetRatingGroup.title) && this.count == fleetRatingGroup.count && Intrinsics.areEqual(this.birdIds, fleetRatingGroup.birdIds);
        }
        return false;
    }

    public final List<String> getBirdIds() {
        return this.birdIds;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + this.birdIds.hashCode();
    }

    public String toString() {
        String str = this.title;
        int i = this.count;
        List<String> list = this.birdIds;
        return "FleetRatingGroup(title=" + str + ", count=" + i + ", birdIds=" + list + ")";
    }

    public /* synthetic */ FleetRatingGroup(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
