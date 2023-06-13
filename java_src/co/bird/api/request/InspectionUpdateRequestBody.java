package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/InspectionUpdateRequestBody;", "", "vehicleId", "", "selectedCategories", "", "selectedIssues", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getSelectedCategories", "()Ljava/util/List;", "getSelectedIssues", "getVehicleId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InspectionUpdateRequestBody {
    @JsonProperty("selected_categories")
    @InterfaceC41208ft5("selected_categories")
    private final List<String> selectedCategories;
    @JsonProperty("selected_issues")
    @InterfaceC41208ft5("selected_issues")
    private final List<String> selectedIssues;
    @JsonProperty("vehicle_id")
    @InterfaceC41208ft5("vehicle_id")
    private final String vehicleId;

    public InspectionUpdateRequestBody(String vehicleId, List<String> selectedCategories, List<String> selectedIssues) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedIssues, "selectedIssues");
        this.vehicleId = vehicleId;
        this.selectedCategories = selectedCategories;
        this.selectedIssues = selectedIssues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InspectionUpdateRequestBody copy$default(InspectionUpdateRequestBody inspectionUpdateRequestBody, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inspectionUpdateRequestBody.vehicleId;
        }
        if ((i & 2) != 0) {
            list = inspectionUpdateRequestBody.selectedCategories;
        }
        if ((i & 4) != 0) {
            list2 = inspectionUpdateRequestBody.selectedIssues;
        }
        return inspectionUpdateRequestBody.copy(str, list, list2);
    }

    public final String component1() {
        return this.vehicleId;
    }

    public final List<String> component2() {
        return this.selectedCategories;
    }

    public final List<String> component3() {
        return this.selectedIssues;
    }

    public final InspectionUpdateRequestBody copy(String vehicleId, List<String> selectedCategories, List<String> selectedIssues) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedIssues, "selectedIssues");
        return new InspectionUpdateRequestBody(vehicleId, selectedCategories, selectedIssues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectionUpdateRequestBody) {
            InspectionUpdateRequestBody inspectionUpdateRequestBody = (InspectionUpdateRequestBody) obj;
            return Intrinsics.areEqual(this.vehicleId, inspectionUpdateRequestBody.vehicleId) && Intrinsics.areEqual(this.selectedCategories, inspectionUpdateRequestBody.selectedCategories) && Intrinsics.areEqual(this.selectedIssues, inspectionUpdateRequestBody.selectedIssues);
        }
        return false;
    }

    public final List<String> getSelectedCategories() {
        return this.selectedCategories;
    }

    public final List<String> getSelectedIssues() {
        return this.selectedIssues;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    public int hashCode() {
        return (((this.vehicleId.hashCode() * 31) + this.selectedCategories.hashCode()) * 31) + this.selectedIssues.hashCode();
    }

    public String toString() {
        String str = this.vehicleId;
        List<String> list = this.selectedCategories;
        List<String> list2 = this.selectedIssues;
        return "InspectionUpdateRequestBody(vehicleId=" + str + ", selectedCategories=" + list + ", selectedIssues=" + list2 + ")";
    }
}
