package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "", "multiSelectFilters", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;", "rangeSelectFilters", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;", "toggleFilters", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMultiSelectFilters", "()Ljava/util/List;", "getRangeSelectFilters", "getToggleFilters", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorMapFilterBundle {
    @JsonProperty("multi_select_filters")
    @InterfaceC41208ft5("multi_select_filters")
    private final List<OperatorMapMultiSelectFilter> multiSelectFilters;
    @JsonProperty("range_select_filters")
    @InterfaceC41208ft5("range_select_filters")
    private final List<OperatorMapRangeSelectFilter> rangeSelectFilters;
    @JsonProperty("toggle_filters")
    @InterfaceC41208ft5("toggle_filters")
    private final List<String> toggleFilters;

    public OperatorMapFilterBundle() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperatorMapFilterBundle copy$default(OperatorMapFilterBundle operatorMapFilterBundle, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = operatorMapFilterBundle.multiSelectFilters;
        }
        if ((i & 2) != 0) {
            list2 = operatorMapFilterBundle.rangeSelectFilters;
        }
        if ((i & 4) != 0) {
            list3 = operatorMapFilterBundle.toggleFilters;
        }
        return operatorMapFilterBundle.copy(list, list2, list3);
    }

    public final List<OperatorMapMultiSelectFilter> component1() {
        return this.multiSelectFilters;
    }

    public final List<OperatorMapRangeSelectFilter> component2() {
        return this.rangeSelectFilters;
    }

    public final List<String> component3() {
        return this.toggleFilters;
    }

    public final OperatorMapFilterBundle copy(List<OperatorMapMultiSelectFilter> multiSelectFilters, List<OperatorMapRangeSelectFilter> rangeSelectFilters, List<String> toggleFilters) {
        Intrinsics.checkNotNullParameter(multiSelectFilters, "multiSelectFilters");
        Intrinsics.checkNotNullParameter(rangeSelectFilters, "rangeSelectFilters");
        Intrinsics.checkNotNullParameter(toggleFilters, "toggleFilters");
        return new OperatorMapFilterBundle(multiSelectFilters, rangeSelectFilters, toggleFilters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorMapFilterBundle) {
            OperatorMapFilterBundle operatorMapFilterBundle = (OperatorMapFilterBundle) obj;
            return Intrinsics.areEqual(this.multiSelectFilters, operatorMapFilterBundle.multiSelectFilters) && Intrinsics.areEqual(this.rangeSelectFilters, operatorMapFilterBundle.rangeSelectFilters) && Intrinsics.areEqual(this.toggleFilters, operatorMapFilterBundle.toggleFilters);
        }
        return false;
    }

    public final List<OperatorMapMultiSelectFilter> getMultiSelectFilters() {
        return this.multiSelectFilters;
    }

    public final List<OperatorMapRangeSelectFilter> getRangeSelectFilters() {
        return this.rangeSelectFilters;
    }

    public final List<String> getToggleFilters() {
        return this.toggleFilters;
    }

    public int hashCode() {
        return (((this.multiSelectFilters.hashCode() * 31) + this.rangeSelectFilters.hashCode()) * 31) + this.toggleFilters.hashCode();
    }

    public String toString() {
        List<OperatorMapMultiSelectFilter> list = this.multiSelectFilters;
        List<OperatorMapRangeSelectFilter> list2 = this.rangeSelectFilters;
        List<String> list3 = this.toggleFilters;
        return "OperatorMapFilterBundle(multiSelectFilters=" + list + ", rangeSelectFilters=" + list2 + ", toggleFilters=" + list3 + ")";
    }

    public OperatorMapFilterBundle(List<OperatorMapMultiSelectFilter> multiSelectFilters, List<OperatorMapRangeSelectFilter> rangeSelectFilters, List<String> toggleFilters) {
        Intrinsics.checkNotNullParameter(multiSelectFilters, "multiSelectFilters");
        Intrinsics.checkNotNullParameter(rangeSelectFilters, "rangeSelectFilters");
        Intrinsics.checkNotNullParameter(toggleFilters, "toggleFilters");
        this.multiSelectFilters = multiSelectFilters;
        this.rangeSelectFilters = rangeSelectFilters;
        this.toggleFilters = toggleFilters;
    }

    public /* synthetic */ OperatorMapFilterBundle(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
