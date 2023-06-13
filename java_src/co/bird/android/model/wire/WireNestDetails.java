package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestDetails;", "Lco/bird/android/model/wire/WireNestFlightSheetSection;", "idx", "", "details", "", "Lco/bird/android/model/wire/WireFormattedFlightSheetDetail;", "(ILjava/util/List;)V", "getDetails", "()Ljava/util/List;", "getIdx", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestDetails implements WireNestFlightSheetSection {
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<WireFormattedFlightSheetDetail> details;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;

    public WireNestDetails(int i, List<WireFormattedFlightSheetDetail> details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.idx = i;
        this.details = details;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireNestDetails copy$default(WireNestDetails wireNestDetails, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireNestDetails.idx;
        }
        if ((i2 & 2) != 0) {
            list = wireNestDetails.details;
        }
        return wireNestDetails.copy(i, list);
    }

    public final int component1() {
        return this.idx;
    }

    public final List<WireFormattedFlightSheetDetail> component2() {
        return this.details;
    }

    public final WireNestDetails copy(int i, List<WireFormattedFlightSheetDetail> details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new WireNestDetails(i, details);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestDetails) {
            WireNestDetails wireNestDetails = (WireNestDetails) obj;
            return this.idx == wireNestDetails.idx && Intrinsics.areEqual(this.details, wireNestDetails.details);
        }
        return false;
    }

    public final List<WireFormattedFlightSheetDetail> getDetails() {
        return this.details;
    }

    @Override // co.bird.android.model.wire.WireNestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public int hashCode() {
        return (Integer.hashCode(this.idx) * 31) + this.details.hashCode();
    }

    public String toString() {
        int i = this.idx;
        List<WireFormattedFlightSheetDetail> list = this.details;
        return "WireNestDetails(idx=" + i + ", details=" + list + ")";
    }

    public /* synthetic */ WireNestDetails(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
