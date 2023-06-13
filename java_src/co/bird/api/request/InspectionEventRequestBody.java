package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/InspectionEventRequestBody;", "", "startTime", "Lorg/joda/time/DateTime;", "workOrderId", "", "(Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getStartTime", "()Lorg/joda/time/DateTime;", "getWorkOrderId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InspectionEventRequestBody {
    @JsonProperty("start_time")
    @InterfaceC41208ft5("start_time")
    private final DateTime startTime;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    public InspectionEventRequestBody(DateTime startTime, String workOrderId) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        this.startTime = startTime;
        this.workOrderId = workOrderId;
    }

    public static /* synthetic */ InspectionEventRequestBody copy$default(InspectionEventRequestBody inspectionEventRequestBody, DateTime dateTime, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = inspectionEventRequestBody.startTime;
        }
        if ((i & 2) != 0) {
            str = inspectionEventRequestBody.workOrderId;
        }
        return inspectionEventRequestBody.copy(dateTime, str);
    }

    public final DateTime component1() {
        return this.startTime;
    }

    public final String component2() {
        return this.workOrderId;
    }

    public final InspectionEventRequestBody copy(DateTime startTime, String workOrderId) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        return new InspectionEventRequestBody(startTime, workOrderId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectionEventRequestBody) {
            InspectionEventRequestBody inspectionEventRequestBody = (InspectionEventRequestBody) obj;
            return Intrinsics.areEqual(this.startTime, inspectionEventRequestBody.startTime) && Intrinsics.areEqual(this.workOrderId, inspectionEventRequestBody.workOrderId);
        }
        return false;
    }

    public final DateTime getStartTime() {
        return this.startTime;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        return (this.startTime.hashCode() * 31) + this.workOrderId.hashCode();
    }

    public String toString() {
        DateTime dateTime = this.startTime;
        String str = this.workOrderId;
        return "InspectionEventRequestBody(startTime=" + dateTime + ", workOrderId=" + str + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InspectionEventRequestBody(DateTime dateTime, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTime, str);
        if ((i & 1) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
