package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;", "", "id", "", "options", "Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;)V", "getId", "()Ljava/lang/String;", "getOptions", "()Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorMapMultiSelectFilter {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66696id;
    @JsonProperty("options")
    @InterfaceC41208ft5("options")
    private final MultiSelectFilterOption options;

    public OperatorMapMultiSelectFilter(String id, MultiSelectFilterOption options) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f66696id = id;
        this.options = options;
    }

    public static /* synthetic */ OperatorMapMultiSelectFilter copy$default(OperatorMapMultiSelectFilter operatorMapMultiSelectFilter, String str, MultiSelectFilterOption multiSelectFilterOption, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorMapMultiSelectFilter.f66696id;
        }
        if ((i & 2) != 0) {
            multiSelectFilterOption = operatorMapMultiSelectFilter.options;
        }
        return operatorMapMultiSelectFilter.copy(str, multiSelectFilterOption);
    }

    public final String component1() {
        return this.f66696id;
    }

    public final MultiSelectFilterOption component2() {
        return this.options;
    }

    public final OperatorMapMultiSelectFilter copy(String id, MultiSelectFilterOption options) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OperatorMapMultiSelectFilter(id, options);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorMapMultiSelectFilter) {
            OperatorMapMultiSelectFilter operatorMapMultiSelectFilter = (OperatorMapMultiSelectFilter) obj;
            return Intrinsics.areEqual(this.f66696id, operatorMapMultiSelectFilter.f66696id) && Intrinsics.areEqual(this.options, operatorMapMultiSelectFilter.options);
        }
        return false;
    }

    public final String getId() {
        return this.f66696id;
    }

    public final MultiSelectFilterOption getOptions() {
        return this.options;
    }

    public int hashCode() {
        return (this.f66696id.hashCode() * 31) + this.options.hashCode();
    }

    public String toString() {
        String str = this.f66696id;
        MultiSelectFilterOption multiSelectFilterOption = this.options;
        return "OperatorMapMultiSelectFilter(id=" + str + ", options=" + multiSelectFilterOption + ")";
    }

    public /* synthetic */ OperatorMapMultiSelectFilter(String str, MultiSelectFilterOption multiSelectFilterOption, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, multiSelectFilterOption);
    }
}
