package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireCapture;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lco/bird/api/response/BulkCaptureResponse;", "", "captures", "", "Lco/bird/android/model/wire/WireCapture;", "(Ljava/util/List;)V", "getCaptures", "()Ljava/util/List;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BulkCaptureResponse {
    @JsonProperty("captures")
    @InterfaceC41208ft5("captures")
    private final List<WireCapture> captures;

    public BulkCaptureResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulkCaptureResponse copy$default(BulkCaptureResponse bulkCaptureResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bulkCaptureResponse.captures;
        }
        return bulkCaptureResponse.copy(list);
    }

    public final List<WireCapture> component1() {
        return this.captures;
    }

    public final BulkCaptureResponse copy(List<WireCapture> captures) {
        Intrinsics.checkNotNullParameter(captures, "captures");
        return new BulkCaptureResponse(captures);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BulkCaptureResponse) && Intrinsics.areEqual(this.captures, ((BulkCaptureResponse) obj).captures);
    }

    public final List<WireCapture> getCaptures() {
        return this.captures;
    }

    public int hashCode() {
        return this.captures.hashCode();
    }

    public String toString() {
        List<WireCapture> list = this.captures;
        return "BulkCaptureResponse(captures=" + list + ")";
    }

    public BulkCaptureResponse(List<WireCapture> captures) {
        Intrinsics.checkNotNullParameter(captures, "captures");
        this.captures = captures;
    }

    public /* synthetic */ BulkCaptureResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
