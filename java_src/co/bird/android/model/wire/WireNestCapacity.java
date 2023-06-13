package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestCapacity;", "Lco/bird/android/model/wire/WireNestFlightSheetSection;", "idx", "", "capacity", "recommendations", "", "Lco/bird/android/model/wire/WireNestCapacityRecommendation;", "(IILjava/util/List;)V", "getCapacity", "()I", "getIdx", "getRecommendations", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestCapacity implements WireNestFlightSheetSection {
    @JsonProperty("capacity")
    @InterfaceC41208ft5("capacity")
    private final int capacity;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("recommendations")
    @InterfaceC41208ft5("recommendations")
    private final List<WireNestCapacityRecommendation> recommendations;

    public WireNestCapacity(int i, int i2, List<WireNestCapacityRecommendation> recommendations) {
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        this.idx = i;
        this.capacity = i2;
        this.recommendations = recommendations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireNestCapacity copy$default(WireNestCapacity wireNestCapacity, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wireNestCapacity.idx;
        }
        if ((i3 & 2) != 0) {
            i2 = wireNestCapacity.capacity;
        }
        if ((i3 & 4) != 0) {
            list = wireNestCapacity.recommendations;
        }
        return wireNestCapacity.copy(i, i2, list);
    }

    public final int component1() {
        return this.idx;
    }

    public final int component2() {
        return this.capacity;
    }

    public final List<WireNestCapacityRecommendation> component3() {
        return this.recommendations;
    }

    public final WireNestCapacity copy(int i, int i2, List<WireNestCapacityRecommendation> recommendations) {
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        return new WireNestCapacity(i, i2, recommendations);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestCapacity) {
            WireNestCapacity wireNestCapacity = (WireNestCapacity) obj;
            return this.idx == wireNestCapacity.idx && this.capacity == wireNestCapacity.capacity && Intrinsics.areEqual(this.recommendations, wireNestCapacity.recommendations);
        }
        return false;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // co.bird.android.model.wire.WireNestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final List<WireNestCapacityRecommendation> getRecommendations() {
        return this.recommendations;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.idx) * 31) + Integer.hashCode(this.capacity)) * 31) + this.recommendations.hashCode();
    }

    public String toString() {
        int i = this.idx;
        int i2 = this.capacity;
        List<WireNestCapacityRecommendation> list = this.recommendations;
        return "WireNestCapacity(idx=" + i + ", capacity=" + i2 + ", recommendations=" + list + ")";
    }

    public /* synthetic */ WireNestCapacity(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
