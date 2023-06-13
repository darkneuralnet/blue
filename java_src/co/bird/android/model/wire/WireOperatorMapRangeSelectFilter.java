package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FilterLogicToggleOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorMapRangeSelectFilter;", "", "id", "", "options", "Lco/bird/android/model/wire/WireRangeSelectFilterOption;", "logicOperator", "Lco/bird/android/model/constant/FilterLogicToggleOption;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireRangeSelectFilterOption;Lco/bird/android/model/constant/FilterLogicToggleOption;)V", "getId", "()Ljava/lang/String;", "getLogicOperator", "()Lco/bird/android/model/constant/FilterLogicToggleOption;", "getOptions", "()Lco/bird/android/model/wire/WireRangeSelectFilterOption;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorMapRangeSelectFilter {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66746id;
    @JsonProperty("logic_operator")
    @InterfaceC41208ft5("logic_operator")
    private final FilterLogicToggleOption logicOperator;
    @JsonProperty("options")
    @InterfaceC41208ft5("options")
    private final WireRangeSelectFilterOption options;

    public WireOperatorMapRangeSelectFilter(String id, WireRangeSelectFilterOption options, FilterLogicToggleOption filterLogicToggleOption) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f66746id = id;
        this.options = options;
        this.logicOperator = filterLogicToggleOption;
    }

    public static /* synthetic */ WireOperatorMapRangeSelectFilter copy$default(WireOperatorMapRangeSelectFilter wireOperatorMapRangeSelectFilter, String str, WireRangeSelectFilterOption wireRangeSelectFilterOption, FilterLogicToggleOption filterLogicToggleOption, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireOperatorMapRangeSelectFilter.f66746id;
        }
        if ((i & 2) != 0) {
            wireRangeSelectFilterOption = wireOperatorMapRangeSelectFilter.options;
        }
        if ((i & 4) != 0) {
            filterLogicToggleOption = wireOperatorMapRangeSelectFilter.logicOperator;
        }
        return wireOperatorMapRangeSelectFilter.copy(str, wireRangeSelectFilterOption, filterLogicToggleOption);
    }

    public final String component1() {
        return this.f66746id;
    }

    public final WireRangeSelectFilterOption component2() {
        return this.options;
    }

    public final FilterLogicToggleOption component3() {
        return this.logicOperator;
    }

    public final WireOperatorMapRangeSelectFilter copy(String id, WireRangeSelectFilterOption options, FilterLogicToggleOption filterLogicToggleOption) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        return new WireOperatorMapRangeSelectFilter(id, options, filterLogicToggleOption);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorMapRangeSelectFilter) {
            WireOperatorMapRangeSelectFilter wireOperatorMapRangeSelectFilter = (WireOperatorMapRangeSelectFilter) obj;
            return Intrinsics.areEqual(this.f66746id, wireOperatorMapRangeSelectFilter.f66746id) && Intrinsics.areEqual(this.options, wireOperatorMapRangeSelectFilter.options) && this.logicOperator == wireOperatorMapRangeSelectFilter.logicOperator;
        }
        return false;
    }

    public final String getId() {
        return this.f66746id;
    }

    public final FilterLogicToggleOption getLogicOperator() {
        return this.logicOperator;
    }

    public final WireRangeSelectFilterOption getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = ((this.f66746id.hashCode() * 31) + this.options.hashCode()) * 31;
        FilterLogicToggleOption filterLogicToggleOption = this.logicOperator;
        return hashCode + (filterLogicToggleOption == null ? 0 : filterLogicToggleOption.hashCode());
    }

    public String toString() {
        String str = this.f66746id;
        WireRangeSelectFilterOption wireRangeSelectFilterOption = this.options;
        FilterLogicToggleOption filterLogicToggleOption = this.logicOperator;
        return "WireOperatorMapRangeSelectFilter(id=" + str + ", options=" + wireRangeSelectFilterOption + ", logicOperator=" + filterLogicToggleOption + ")";
    }

    public /* synthetic */ WireOperatorMapRangeSelectFilter(String str, WireRangeSelectFilterOption wireRangeSelectFilterOption, FilterLogicToggleOption filterLogicToggleOption, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, wireRangeSelectFilterOption, (i & 4) != 0 ? null : filterLogicToggleOption);
    }
}
