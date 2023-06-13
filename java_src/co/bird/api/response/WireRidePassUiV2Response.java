package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireRidePassView;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/response/WireRidePassUiV2Response;", "", "available", "", "Lco/bird/android/model/wire/WireRidePassView;", "active", "ineligible", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getActive", "()Ljava/util/List;", "getAvailable", "getIneligible", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRidePassUiV2Response {
    @JsonProperty("active")
    @InterfaceC41208ft5("active")
    private final List<WireRidePassView> active;
    @JsonProperty("available")
    @InterfaceC41208ft5("available")
    private final List<WireRidePassView> available;
    @JsonProperty("ineligible")
    @InterfaceC41208ft5("ineligible")
    private final List<WireRidePassView> ineligible;

    public WireRidePassUiV2Response() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireRidePassUiV2Response copy$default(WireRidePassUiV2Response wireRidePassUiV2Response, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wireRidePassUiV2Response.available;
        }
        if ((i & 2) != 0) {
            list2 = wireRidePassUiV2Response.active;
        }
        if ((i & 4) != 0) {
            list3 = wireRidePassUiV2Response.ineligible;
        }
        return wireRidePassUiV2Response.copy(list, list2, list3);
    }

    public final List<WireRidePassView> component1() {
        return this.available;
    }

    public final List<WireRidePassView> component2() {
        return this.active;
    }

    public final List<WireRidePassView> component3() {
        return this.ineligible;
    }

    public final WireRidePassUiV2Response copy(List<WireRidePassView> available, List<WireRidePassView> active, List<WireRidePassView> ineligible) {
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(active, "active");
        Intrinsics.checkNotNullParameter(ineligible, "ineligible");
        return new WireRidePassUiV2Response(available, active, ineligible);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRidePassUiV2Response) {
            WireRidePassUiV2Response wireRidePassUiV2Response = (WireRidePassUiV2Response) obj;
            return Intrinsics.areEqual(this.available, wireRidePassUiV2Response.available) && Intrinsics.areEqual(this.active, wireRidePassUiV2Response.active) && Intrinsics.areEqual(this.ineligible, wireRidePassUiV2Response.ineligible);
        }
        return false;
    }

    public final List<WireRidePassView> getActive() {
        return this.active;
    }

    public final List<WireRidePassView> getAvailable() {
        return this.available;
    }

    public final List<WireRidePassView> getIneligible() {
        return this.ineligible;
    }

    public int hashCode() {
        return (((this.available.hashCode() * 31) + this.active.hashCode()) * 31) + this.ineligible.hashCode();
    }

    public String toString() {
        List<WireRidePassView> list = this.available;
        List<WireRidePassView> list2 = this.active;
        List<WireRidePassView> list3 = this.ineligible;
        return "WireRidePassUiV2Response(available=" + list + ", active=" + list2 + ", ineligible=" + list3 + ")";
    }

    public WireRidePassUiV2Response(List<WireRidePassView> available, List<WireRidePassView> active, List<WireRidePassView> ineligible) {
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(active, "active");
        Intrinsics.checkNotNullParameter(ineligible, "ineligible");
        this.available = available;
        this.active = active;
        this.ineligible = ineligible;
    }

    public /* synthetic */ WireRidePassUiV2Response(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
