package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/response/WireBirdActionPairResponse;", "", "bird", "Lco/bird/android/model/wire/WireBird;", "requiredPartKinds", "", "Lco/bird/android/model/constant/PartKind;", "timeRemainingSeconds", "", "(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getRequiredPartKinds", "()Ljava/util/List;", "getTimeRemainingSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)Lco/bird/api/response/WireBirdActionPairResponse;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdActionPairResponse {
    @JsonProperty("bird")
    @InterfaceC41208ft5("bird")
    private final WireBird bird;
    @JsonProperty("required_part_kinds")
    @InterfaceC41208ft5("required_part_kinds")
    private final List<PartKind> requiredPartKinds;
    @JsonProperty("time_remaining_seconds")
    @InterfaceC41208ft5("time_remaining_seconds")
    private final Integer timeRemainingSeconds;

    public WireBirdActionPairResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireBirdActionPairResponse copy$default(WireBirdActionPairResponse wireBirdActionPairResponse, WireBird wireBird, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = wireBirdActionPairResponse.bird;
        }
        if ((i & 2) != 0) {
            list = wireBirdActionPairResponse.requiredPartKinds;
        }
        if ((i & 4) != 0) {
            num = wireBirdActionPairResponse.timeRemainingSeconds;
        }
        return wireBirdActionPairResponse.copy(wireBird, list, num);
    }

    public final WireBird component1() {
        return this.bird;
    }

    public final List<PartKind> component2() {
        return this.requiredPartKinds;
    }

    public final Integer component3() {
        return this.timeRemainingSeconds;
    }

    public final WireBirdActionPairResponse copy(WireBird wireBird, List<? extends PartKind> list, Integer num) {
        return new WireBirdActionPairResponse(wireBird, list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdActionPairResponse) {
            WireBirdActionPairResponse wireBirdActionPairResponse = (WireBirdActionPairResponse) obj;
            return Intrinsics.areEqual(this.bird, wireBirdActionPairResponse.bird) && Intrinsics.areEqual(this.requiredPartKinds, wireBirdActionPairResponse.requiredPartKinds) && Intrinsics.areEqual(this.timeRemainingSeconds, wireBirdActionPairResponse.timeRemainingSeconds);
        }
        return false;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final List<PartKind> getRequiredPartKinds() {
        return this.requiredPartKinds;
    }

    public final Integer getTimeRemainingSeconds() {
        return this.timeRemainingSeconds;
    }

    public int hashCode() {
        WireBird wireBird = this.bird;
        int hashCode = (wireBird == null ? 0 : wireBird.hashCode()) * 31;
        List<PartKind> list = this.requiredPartKinds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.timeRemainingSeconds;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        WireBird wireBird = this.bird;
        List<PartKind> list = this.requiredPartKinds;
        Integer num = this.timeRemainingSeconds;
        return "WireBirdActionPairResponse(bird=" + wireBird + ", requiredPartKinds=" + list + ", timeRemainingSeconds=" + num + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireBirdActionPairResponse(WireBird wireBird, List<? extends PartKind> list, Integer num) {
        this.bird = wireBird;
        this.requiredPartKinds = list;
        this.timeRemainingSeconds = num;
    }

    public /* synthetic */ WireBirdActionPairResponse(WireBird wireBird, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireBird, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
