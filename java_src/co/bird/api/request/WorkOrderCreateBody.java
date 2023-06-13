package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.WorkOrderCreateSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/WorkOrderCreateBody;", "", "birdId", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/WorkOrderCreateSource;", "(Ljava/lang/String;Lco/bird/android/model/WorkOrderCreateSource;)V", "getBirdId", "()Ljava/lang/String;", "getSource", "()Lco/bird/android/model/WorkOrderCreateSource;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WorkOrderCreateBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final WorkOrderCreateSource source;

    public WorkOrderCreateBody(String str, WorkOrderCreateSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.birdId = str;
        this.source = source;
    }

    public static /* synthetic */ WorkOrderCreateBody copy$default(WorkOrderCreateBody workOrderCreateBody, String str, WorkOrderCreateSource workOrderCreateSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workOrderCreateBody.birdId;
        }
        if ((i & 2) != 0) {
            workOrderCreateSource = workOrderCreateBody.source;
        }
        return workOrderCreateBody.copy(str, workOrderCreateSource);
    }

    public final String component1() {
        return this.birdId;
    }

    public final WorkOrderCreateSource component2() {
        return this.source;
    }

    public final WorkOrderCreateBody copy(String str, WorkOrderCreateSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new WorkOrderCreateBody(str, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkOrderCreateBody) {
            WorkOrderCreateBody workOrderCreateBody = (WorkOrderCreateBody) obj;
            return Intrinsics.areEqual(this.birdId, workOrderCreateBody.birdId) && this.source == workOrderCreateBody.source;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final WorkOrderCreateSource getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.birdId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        WorkOrderCreateSource workOrderCreateSource = this.source;
        return "WorkOrderCreateBody(birdId=" + str + ", source=" + workOrderCreateSource + ")";
    }

    public /* synthetic */ WorkOrderCreateBody(String str, WorkOrderCreateSource workOrderCreateSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, workOrderCreateSource);
    }
}
