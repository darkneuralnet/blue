package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireOperatorOptionFilter;
import co.bird.android.model.wire.WireOperatorToggleFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/response/OperatorFiltersResponse;", "", "multiSelectFilters", "", "Lco/bird/android/model/wire/WireOperatorOptionFilter;", "rangeFilters", "toggleFilters", "Lco/bird/android/model/wire/WireOperatorToggleFilter;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMultiSelectFilters", "()Ljava/util/List;", "getRangeFilters", "getToggleFilters", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorFiltersResponse {
    @JsonProperty("multi_select_filters")
    @InterfaceC41208ft5("multi_select_filters")
    private final List<WireOperatorOptionFilter> multiSelectFilters;
    @JsonProperty("range_filters")
    @InterfaceC41208ft5("range_filters")
    private final List<WireOperatorOptionFilter> rangeFilters;
    @JsonProperty("toggle_filters")
    @InterfaceC41208ft5("toggle_filters")
    private final List<WireOperatorToggleFilter> toggleFilters;

    public OperatorFiltersResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperatorFiltersResponse copy$default(OperatorFiltersResponse operatorFiltersResponse, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = operatorFiltersResponse.multiSelectFilters;
        }
        if ((i & 2) != 0) {
            list2 = operatorFiltersResponse.rangeFilters;
        }
        if ((i & 4) != 0) {
            list3 = operatorFiltersResponse.toggleFilters;
        }
        return operatorFiltersResponse.copy(list, list2, list3);
    }

    public final List<WireOperatorOptionFilter> component1() {
        return this.multiSelectFilters;
    }

    public final List<WireOperatorOptionFilter> component2() {
        return this.rangeFilters;
    }

    public final List<WireOperatorToggleFilter> component3() {
        return this.toggleFilters;
    }

    public final OperatorFiltersResponse copy(List<WireOperatorOptionFilter> multiSelectFilters, List<WireOperatorOptionFilter> rangeFilters, List<WireOperatorToggleFilter> toggleFilters) {
        Intrinsics.checkNotNullParameter(multiSelectFilters, "multiSelectFilters");
        Intrinsics.checkNotNullParameter(rangeFilters, "rangeFilters");
        Intrinsics.checkNotNullParameter(toggleFilters, "toggleFilters");
        return new OperatorFiltersResponse(multiSelectFilters, rangeFilters, toggleFilters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorFiltersResponse) {
            OperatorFiltersResponse operatorFiltersResponse = (OperatorFiltersResponse) obj;
            return Intrinsics.areEqual(this.multiSelectFilters, operatorFiltersResponse.multiSelectFilters) && Intrinsics.areEqual(this.rangeFilters, operatorFiltersResponse.rangeFilters) && Intrinsics.areEqual(this.toggleFilters, operatorFiltersResponse.toggleFilters);
        }
        return false;
    }

    public final List<WireOperatorOptionFilter> getMultiSelectFilters() {
        return this.multiSelectFilters;
    }

    public final List<WireOperatorOptionFilter> getRangeFilters() {
        return this.rangeFilters;
    }

    public final List<WireOperatorToggleFilter> getToggleFilters() {
        return this.toggleFilters;
    }

    public int hashCode() {
        return (((this.multiSelectFilters.hashCode() * 31) + this.rangeFilters.hashCode()) * 31) + this.toggleFilters.hashCode();
    }

    public String toString() {
        List<WireOperatorOptionFilter> list = this.multiSelectFilters;
        List<WireOperatorOptionFilter> list2 = this.rangeFilters;
        List<WireOperatorToggleFilter> list3 = this.toggleFilters;
        return "OperatorFiltersResponse(multiSelectFilters=" + list + ", rangeFilters=" + list2 + ", toggleFilters=" + list3 + ")";
    }

    public OperatorFiltersResponse(List<WireOperatorOptionFilter> multiSelectFilters, List<WireOperatorOptionFilter> rangeFilters, List<WireOperatorToggleFilter> toggleFilters) {
        Intrinsics.checkNotNullParameter(multiSelectFilters, "multiSelectFilters");
        Intrinsics.checkNotNullParameter(rangeFilters, "rangeFilters");
        Intrinsics.checkNotNullParameter(toggleFilters, "toggleFilters");
        this.multiSelectFilters = multiSelectFilters;
        this.rangeFilters = rangeFilters;
        this.toggleFilters = toggleFilters;
    }

    public /* synthetic */ OperatorFiltersResponse(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
