package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireArea;
import co.bird.android.model.wire.WireBounty;
import co.bird.android.model.wire.WireNestMarker;
import co.bird.android.model.wire.WireOperatorBirdMapMarker;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JI\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/response/OperatorMapResponse;", "", "birds", "", "Lco/bird/android/model/wire/WireOperatorBirdMapMarker;", "areas", "Lco/bird/android/model/wire/WireArea;", "bounties", "Lco/bird/android/model/wire/WireBounty;", "nests", "", "Lco/bird/android/model/wire/WireNestMarker;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAreas", "()Ljava/util/List;", "getBirds", "getBounties", "getNests", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorMapResponse {
    @JsonProperty("areas")
    @InterfaceC41208ft5("areas")
    private final List<WireArea> areas;
    @JsonProperty("birds")
    @InterfaceC41208ft5("birds")
    private final List<WireOperatorBirdMapMarker> birds;
    @JsonProperty("bounties")
    @InterfaceC41208ft5("bounties")
    private final List<WireBounty> bounties;
    @JsonProperty("nests")
    @InterfaceC41208ft5("nests")
    private final List<WireNestMarker> nests;

    public OperatorMapResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperatorMapResponse copy$default(OperatorMapResponse operatorMapResponse, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = operatorMapResponse.birds;
        }
        if ((i & 2) != 0) {
            list2 = operatorMapResponse.areas;
        }
        if ((i & 4) != 0) {
            list3 = operatorMapResponse.bounties;
        }
        if ((i & 8) != 0) {
            list4 = operatorMapResponse.nests;
        }
        return operatorMapResponse.copy(list, list2, list3, list4);
    }

    public final List<WireOperatorBirdMapMarker> component1() {
        return this.birds;
    }

    public final List<WireArea> component2() {
        return this.areas;
    }

    public final List<WireBounty> component3() {
        return this.bounties;
    }

    public final List<WireNestMarker> component4() {
        return this.nests;
    }

    public final OperatorMapResponse copy(List<WireOperatorBirdMapMarker> birds, List<WireArea> areas, List<WireBounty> bounties, List<WireNestMarker> nests) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        Intrinsics.checkNotNullParameter(areas, "areas");
        Intrinsics.checkNotNullParameter(bounties, "bounties");
        Intrinsics.checkNotNullParameter(nests, "nests");
        return new OperatorMapResponse(birds, areas, bounties, nests);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorMapResponse) {
            OperatorMapResponse operatorMapResponse = (OperatorMapResponse) obj;
            return Intrinsics.areEqual(this.birds, operatorMapResponse.birds) && Intrinsics.areEqual(this.areas, operatorMapResponse.areas) && Intrinsics.areEqual(this.bounties, operatorMapResponse.bounties) && Intrinsics.areEqual(this.nests, operatorMapResponse.nests);
        }
        return false;
    }

    public final List<WireArea> getAreas() {
        return this.areas;
    }

    public final List<WireOperatorBirdMapMarker> getBirds() {
        return this.birds;
    }

    public final List<WireBounty> getBounties() {
        return this.bounties;
    }

    public final List<WireNestMarker> getNests() {
        return this.nests;
    }

    public int hashCode() {
        return (((((this.birds.hashCode() * 31) + this.areas.hashCode()) * 31) + this.bounties.hashCode()) * 31) + this.nests.hashCode();
    }

    public String toString() {
        List<WireOperatorBirdMapMarker> list = this.birds;
        List<WireArea> list2 = this.areas;
        List<WireBounty> list3 = this.bounties;
        List<WireNestMarker> list4 = this.nests;
        return "OperatorMapResponse(birds=" + list + ", areas=" + list2 + ", bounties=" + list3 + ", nests=" + list4 + ")";
    }

    public OperatorMapResponse(List<WireOperatorBirdMapMarker> birds, List<WireArea> areas, List<WireBounty> bounties, List<WireNestMarker> nests) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        Intrinsics.checkNotNullParameter(areas, "areas");
        Intrinsics.checkNotNullParameter(bounties, "bounties");
        Intrinsics.checkNotNullParameter(nests, "nests");
        this.birds = birds;
        this.areas = areas;
        this.bounties = bounties;
        this.nests = nests;
    }

    public /* synthetic */ OperatorMapResponse(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new ArrayList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4);
    }
}
