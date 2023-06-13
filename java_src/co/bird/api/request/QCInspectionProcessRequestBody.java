package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/QCInspectionProcessRequestBody;", "", "workOrderId", "", "inspections", "", "Lco/bird/android/model/QCInspection;", "autoCheckResults", "Lco/bird/android/model/QCAutoCheck;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAutoCheckResults", "()Ljava/util/List;", "getInspections", "getWorkOrderId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QCInspectionProcessRequestBody {
    @JsonProperty("auto_check_results")
    @InterfaceC41208ft5("auto_check_results")
    private final List<QCAutoCheck> autoCheckResults;
    @JsonProperty("inspections")
    @InterfaceC41208ft5("inspections")
    private final List<QCInspection> inspections;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    public QCInspectionProcessRequestBody(String workOrderId, List<QCInspection> inspections, List<QCAutoCheck> autoCheckResults) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(inspections, "inspections");
        Intrinsics.checkNotNullParameter(autoCheckResults, "autoCheckResults");
        this.workOrderId = workOrderId;
        this.inspections = inspections;
        this.autoCheckResults = autoCheckResults;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QCInspectionProcessRequestBody copy$default(QCInspectionProcessRequestBody qCInspectionProcessRequestBody, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qCInspectionProcessRequestBody.workOrderId;
        }
        if ((i & 2) != 0) {
            list = qCInspectionProcessRequestBody.inspections;
        }
        if ((i & 4) != 0) {
            list2 = qCInspectionProcessRequestBody.autoCheckResults;
        }
        return qCInspectionProcessRequestBody.copy(str, list, list2);
    }

    public final String component1() {
        return this.workOrderId;
    }

    public final List<QCInspection> component2() {
        return this.inspections;
    }

    public final List<QCAutoCheck> component3() {
        return this.autoCheckResults;
    }

    public final QCInspectionProcessRequestBody copy(String workOrderId, List<QCInspection> inspections, List<QCAutoCheck> autoCheckResults) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(inspections, "inspections");
        Intrinsics.checkNotNullParameter(autoCheckResults, "autoCheckResults");
        return new QCInspectionProcessRequestBody(workOrderId, inspections, autoCheckResults);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QCInspectionProcessRequestBody) {
            QCInspectionProcessRequestBody qCInspectionProcessRequestBody = (QCInspectionProcessRequestBody) obj;
            return Intrinsics.areEqual(this.workOrderId, qCInspectionProcessRequestBody.workOrderId) && Intrinsics.areEqual(this.inspections, qCInspectionProcessRequestBody.inspections) && Intrinsics.areEqual(this.autoCheckResults, qCInspectionProcessRequestBody.autoCheckResults);
        }
        return false;
    }

    public final List<QCAutoCheck> getAutoCheckResults() {
        return this.autoCheckResults;
    }

    public final List<QCInspection> getInspections() {
        return this.inspections;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        return (((this.workOrderId.hashCode() * 31) + this.inspections.hashCode()) * 31) + this.autoCheckResults.hashCode();
    }

    public String toString() {
        String str = this.workOrderId;
        List<QCInspection> list = this.inspections;
        List<QCAutoCheck> list2 = this.autoCheckResults;
        return "QCInspectionProcessRequestBody(workOrderId=" + str + ", inspections=" + list + ", autoCheckResults=" + list2 + ")";
    }
}
