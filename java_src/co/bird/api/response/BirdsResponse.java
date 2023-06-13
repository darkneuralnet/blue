package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/response/BirdsResponse;", "", "birds", "", "Lco/bird/android/model/wire/WireBird;", "cellIds", "", "", "reachedResponseLimit", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "getBirds", "()Ljava/util/List;", "getCellIds", "getReachedResponseLimit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lco/bird/api/response/BirdsResponse;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdsResponse {
    @JsonProperty("birds")
    @InterfaceC41208ft5("birds")
    private final List<WireBird> birds;
    @JsonProperty("cell_ids")
    @InterfaceC41208ft5("cell_ids")
    private final List<String> cellIds;
    @JsonProperty("reached_response_limit")
    @InterfaceC41208ft5("reached_response_limit")
    private final Boolean reachedResponseLimit;

    public BirdsResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BirdsResponse copy$default(BirdsResponse birdsResponse, List list, List list2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = birdsResponse.birds;
        }
        if ((i & 2) != 0) {
            list2 = birdsResponse.cellIds;
        }
        if ((i & 4) != 0) {
            bool = birdsResponse.reachedResponseLimit;
        }
        return birdsResponse.copy(list, list2, bool);
    }

    public final List<WireBird> component1() {
        return this.birds;
    }

    public final List<String> component2() {
        return this.cellIds;
    }

    public final Boolean component3() {
        return this.reachedResponseLimit;
    }

    public final BirdsResponse copy(List<WireBird> birds, List<String> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        return new BirdsResponse(birds, list, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdsResponse) {
            BirdsResponse birdsResponse = (BirdsResponse) obj;
            return Intrinsics.areEqual(this.birds, birdsResponse.birds) && Intrinsics.areEqual(this.cellIds, birdsResponse.cellIds) && Intrinsics.areEqual(this.reachedResponseLimit, birdsResponse.reachedResponseLimit);
        }
        return false;
    }

    public final List<WireBird> getBirds() {
        return this.birds;
    }

    public final List<String> getCellIds() {
        return this.cellIds;
    }

    public final Boolean getReachedResponseLimit() {
        return this.reachedResponseLimit;
    }

    public int hashCode() {
        int hashCode = this.birds.hashCode() * 31;
        List<String> list = this.cellIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.reachedResponseLimit;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        List<WireBird> list = this.birds;
        List<String> list2 = this.cellIds;
        Boolean bool = this.reachedResponseLimit;
        return "BirdsResponse(birds=" + list + ", cellIds=" + list2 + ", reachedResponseLimit=" + bool + ")";
    }

    public BirdsResponse(List<WireBird> birds, List<String> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        this.birds = birds;
        this.cellIds = list;
        this.reachedResponseLimit = bool;
    }

    public /* synthetic */ BirdsResponse(List list, List list2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : bool);
    }
}
