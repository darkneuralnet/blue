package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RepairSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/RepairStartedEventBody;", "", "time", "Lorg/joda/time/DateTime;", "workOrderId", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/RepairSource;", "(Lorg/joda/time/DateTime;Ljava/lang/String;Lco/bird/android/model/RepairSource;)V", "getSource", "()Lco/bird/android/model/RepairSource;", "getTime", "()Lorg/joda/time/DateTime;", "getWorkOrderId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairStartedEventBody {
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final RepairSource source;
    @JsonProperty("time")
    @InterfaceC41208ft5("time")
    private final DateTime time;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    public RepairStartedEventBody(DateTime dateTime, String workOrderId, RepairSource repairSource) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        this.time = dateTime;
        this.workOrderId = workOrderId;
        this.source = repairSource;
    }

    public static /* synthetic */ RepairStartedEventBody copy$default(RepairStartedEventBody repairStartedEventBody, DateTime dateTime, String str, RepairSource repairSource, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTime = repairStartedEventBody.time;
        }
        if ((i & 2) != 0) {
            str = repairStartedEventBody.workOrderId;
        }
        if ((i & 4) != 0) {
            repairSource = repairStartedEventBody.source;
        }
        return repairStartedEventBody.copy(dateTime, str, repairSource);
    }

    public final DateTime component1() {
        return this.time;
    }

    public final String component2() {
        return this.workOrderId;
    }

    public final RepairSource component3() {
        return this.source;
    }

    public final RepairStartedEventBody copy(DateTime dateTime, String workOrderId, RepairSource repairSource) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        return new RepairStartedEventBody(dateTime, workOrderId, repairSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairStartedEventBody) {
            RepairStartedEventBody repairStartedEventBody = (RepairStartedEventBody) obj;
            return Intrinsics.areEqual(this.time, repairStartedEventBody.time) && Intrinsics.areEqual(this.workOrderId, repairStartedEventBody.workOrderId) && this.source == repairStartedEventBody.source;
        }
        return false;
    }

    public final RepairSource getSource() {
        return this.source;
    }

    public final DateTime getTime() {
        return this.time;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        DateTime dateTime = this.time;
        int hashCode = (((dateTime == null ? 0 : dateTime.hashCode()) * 31) + this.workOrderId.hashCode()) * 31;
        RepairSource repairSource = this.source;
        return hashCode + (repairSource != null ? repairSource.hashCode() : 0);
    }

    public String toString() {
        DateTime dateTime = this.time;
        String str = this.workOrderId;
        RepairSource repairSource = this.source;
        return "RepairStartedEventBody(time=" + dateTime + ", workOrderId=" + str + ", source=" + repairSource + ")";
    }

    public /* synthetic */ RepairStartedEventBody(DateTime dateTime, String str, RepairSource repairSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dateTime, str, (i & 4) != 0 ? null : repairSource);
    }
}
