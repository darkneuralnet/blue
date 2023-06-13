package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;", "", "label", "", "detail", "(Ljava/lang/String;Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetDetail {
    @JsonProperty("detail")
    @InterfaceC41208ft5("detail")
    private final String detail;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;

    public FlightSheetDetail() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FlightSheetDetail copy$default(FlightSheetDetail flightSheetDetail, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightSheetDetail.label;
        }
        if ((i & 2) != 0) {
            str2 = flightSheetDetail.detail;
        }
        return flightSheetDetail.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.detail;
    }

    public final FlightSheetDetail copy(String label, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new FlightSheetDetail(label, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetDetail) {
            FlightSheetDetail flightSheetDetail = (FlightSheetDetail) obj;
            return Intrinsics.areEqual(this.label, flightSheetDetail.label) && Intrinsics.areEqual(this.detail, flightSheetDetail.detail);
        }
        return false;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        String str = this.detail;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.label;
        String str2 = this.detail;
        return "FlightSheetDetail(label=" + str + ", detail=" + str2 + ")";
    }

    public FlightSheetDetail(String label, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.detail = str;
    }

    public /* synthetic */ FlightSheetDetail(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
