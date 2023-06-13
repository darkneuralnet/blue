package co.bird.api.request;

import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/IssueCreateMultipleBody;", "", "workOrderId", "", "issueTypeIds", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/IssueCreateSource;", "(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/IssueCreateSource;)V", "getIssueTypeIds", "()Ljava/util/List;", "getSource", "()Lco/bird/android/model/IssueCreateSource;", "getWorkOrderId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IssueCreateMultipleBody {
    @JsonProperty("issue_type_ids")
    @InterfaceC41208ft5("issue_type_ids")
    private final List<String> issueTypeIds;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final IssueCreateSource source;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    public IssueCreateMultipleBody(String str, List<String> issueTypeIds, IssueCreateSource source) {
        Intrinsics.checkNotNullParameter(issueTypeIds, "issueTypeIds");
        Intrinsics.checkNotNullParameter(source, "source");
        this.workOrderId = str;
        this.issueTypeIds = issueTypeIds;
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IssueCreateMultipleBody copy$default(IssueCreateMultipleBody issueCreateMultipleBody, String str, List list, IssueCreateSource issueCreateSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = issueCreateMultipleBody.workOrderId;
        }
        if ((i & 2) != 0) {
            list = issueCreateMultipleBody.issueTypeIds;
        }
        if ((i & 4) != 0) {
            issueCreateSource = issueCreateMultipleBody.source;
        }
        return issueCreateMultipleBody.copy(str, list, issueCreateSource);
    }

    public final String component1() {
        return this.workOrderId;
    }

    public final List<String> component2() {
        return this.issueTypeIds;
    }

    public final IssueCreateSource component3() {
        return this.source;
    }

    public final IssueCreateMultipleBody copy(String str, List<String> issueTypeIds, IssueCreateSource source) {
        Intrinsics.checkNotNullParameter(issueTypeIds, "issueTypeIds");
        Intrinsics.checkNotNullParameter(source, "source");
        return new IssueCreateMultipleBody(str, issueTypeIds, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IssueCreateMultipleBody) {
            IssueCreateMultipleBody issueCreateMultipleBody = (IssueCreateMultipleBody) obj;
            return Intrinsics.areEqual(this.workOrderId, issueCreateMultipleBody.workOrderId) && Intrinsics.areEqual(this.issueTypeIds, issueCreateMultipleBody.issueTypeIds) && this.source == issueCreateMultipleBody.source;
        }
        return false;
    }

    public final List<String> getIssueTypeIds() {
        return this.issueTypeIds;
    }

    public final IssueCreateSource getSource() {
        return this.source;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        String str = this.workOrderId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.issueTypeIds.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        String str = this.workOrderId;
        List<String> list = this.issueTypeIds;
        IssueCreateSource issueCreateSource = this.source;
        return "IssueCreateMultipleBody(workOrderId=" + str + ", issueTypeIds=" + list + ", source=" + issueCreateSource + ")";
    }

    public /* synthetic */ IssueCreateMultipleBody(String str, List list, IssueCreateSource issueCreateSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, list, issueCreateSource);
    }
}
