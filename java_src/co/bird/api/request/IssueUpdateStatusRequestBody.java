package co.bird.api.request;

import co.bird.android.model.IssueStatus;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.IssueStatusReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/IssueUpdateStatusRequestBody;", "", "issueId", "", "status", "Lco/bird/android/model/IssueStatus;", "reason", "Lco/bird/android/model/constant/IssueStatusReason;", "(Ljava/lang/String;Lco/bird/android/model/IssueStatus;Lco/bird/android/model/constant/IssueStatusReason;)V", "getIssueId", "()Ljava/lang/String;", "getReason", "()Lco/bird/android/model/constant/IssueStatusReason;", "getStatus", "()Lco/bird/android/model/IssueStatus;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IssueUpdateStatusRequestBody {
    @JsonProperty("issue_id")
    @InterfaceC41208ft5("issue_id")
    private final String issueId;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final IssueStatusReason reason;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final IssueStatus status;

    public IssueUpdateStatusRequestBody(String issueId, IssueStatus status, IssueStatusReason issueStatusReason) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.issueId = issueId;
        this.status = status;
        this.reason = issueStatusReason;
    }

    public static /* synthetic */ IssueUpdateStatusRequestBody copy$default(IssueUpdateStatusRequestBody issueUpdateStatusRequestBody, String str, IssueStatus issueStatus, IssueStatusReason issueStatusReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = issueUpdateStatusRequestBody.issueId;
        }
        if ((i & 2) != 0) {
            issueStatus = issueUpdateStatusRequestBody.status;
        }
        if ((i & 4) != 0) {
            issueStatusReason = issueUpdateStatusRequestBody.reason;
        }
        return issueUpdateStatusRequestBody.copy(str, issueStatus, issueStatusReason);
    }

    public final String component1() {
        return this.issueId;
    }

    public final IssueStatus component2() {
        return this.status;
    }

    public final IssueStatusReason component3() {
        return this.reason;
    }

    public final IssueUpdateStatusRequestBody copy(String issueId, IssueStatus status, IssueStatusReason issueStatusReason) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new IssueUpdateStatusRequestBody(issueId, status, issueStatusReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IssueUpdateStatusRequestBody) {
            IssueUpdateStatusRequestBody issueUpdateStatusRequestBody = (IssueUpdateStatusRequestBody) obj;
            return Intrinsics.areEqual(this.issueId, issueUpdateStatusRequestBody.issueId) && this.status == issueUpdateStatusRequestBody.status && this.reason == issueUpdateStatusRequestBody.reason;
        }
        return false;
    }

    public final String getIssueId() {
        return this.issueId;
    }

    public final IssueStatusReason getReason() {
        return this.reason;
    }

    public final IssueStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((this.issueId.hashCode() * 31) + this.status.hashCode()) * 31;
        IssueStatusReason issueStatusReason = this.reason;
        return hashCode + (issueStatusReason == null ? 0 : issueStatusReason.hashCode());
    }

    public String toString() {
        String str = this.issueId;
        IssueStatus issueStatus = this.status;
        IssueStatusReason issueStatusReason = this.reason;
        return "IssueUpdateStatusRequestBody(issueId=" + str + ", status=" + issueStatus + ", reason=" + issueStatusReason + ")";
    }
}
