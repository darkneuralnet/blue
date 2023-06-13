package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RepairSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/RepairCompletedEventBody;", "", "sessionId", "", "workOrderId", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/RepairSource;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/RepairSource;)V", "getSessionId", "()Ljava/lang/String;", "getSource", "()Lco/bird/android/model/RepairSource;", "getWorkOrderId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairCompletedEventBody {
    @JsonProperty(AnalyticsFields.SESSION_ID)
    @InterfaceC41208ft5(AnalyticsFields.SESSION_ID)
    private final String sessionId;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final RepairSource source;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    public RepairCompletedEventBody(String sessionId, String workOrderId, RepairSource repairSource) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        this.sessionId = sessionId;
        this.workOrderId = workOrderId;
        this.source = repairSource;
    }

    public static /* synthetic */ RepairCompletedEventBody copy$default(RepairCompletedEventBody repairCompletedEventBody, String str, String str2, RepairSource repairSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairCompletedEventBody.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = repairCompletedEventBody.workOrderId;
        }
        if ((i & 4) != 0) {
            repairSource = repairCompletedEventBody.source;
        }
        return repairCompletedEventBody.copy(str, str2, repairSource);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.workOrderId;
    }

    public final RepairSource component3() {
        return this.source;
    }

    public final RepairCompletedEventBody copy(String sessionId, String workOrderId, RepairSource repairSource) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        return new RepairCompletedEventBody(sessionId, workOrderId, repairSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairCompletedEventBody) {
            RepairCompletedEventBody repairCompletedEventBody = (RepairCompletedEventBody) obj;
            return Intrinsics.areEqual(this.sessionId, repairCompletedEventBody.sessionId) && Intrinsics.areEqual(this.workOrderId, repairCompletedEventBody.workOrderId) && this.source == repairCompletedEventBody.source;
        }
        return false;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final RepairSource getSource() {
        return this.source;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        int hashCode = ((this.sessionId.hashCode() * 31) + this.workOrderId.hashCode()) * 31;
        RepairSource repairSource = this.source;
        return hashCode + (repairSource == null ? 0 : repairSource.hashCode());
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.workOrderId;
        RepairSource repairSource = this.source;
        return "RepairCompletedEventBody(sessionId=" + str + ", workOrderId=" + str2 + ", source=" + repairSource + ")";
    }

    public /* synthetic */ RepairCompletedEventBody(String str, String str2, RepairSource repairSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : repairSource);
    }
}
