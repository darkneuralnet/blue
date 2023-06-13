package co.bird.api.request;

import co.bird.android.model.IssueFlow;
import co.bird.android.model.IssueKind;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/request/ProgrammaticIssueBody;", "", "flowType", "Lco/bird/android/model/IssueFlow;", "issueKind", "Lco/bird/android/model/IssueKind;", "errorMessage", "", "birdId", "(Lco/bird/android/model/IssueFlow;Lco/bird/android/model/IssueKind;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getErrorMessage", "getFlowType", "()Lco/bird/android/model/IssueFlow;", "getIssueKind", "()Lco/bird/android/model/IssueKind;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ProgrammaticIssueBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("error_message")
    @InterfaceC41208ft5("error_message")
    private final String errorMessage;
    @JsonProperty("flow_type")
    @InterfaceC41208ft5("flow_type")
    private final IssueFlow flowType;
    @JsonProperty("issue_kind")
    @InterfaceC41208ft5("issue_kind")
    private final IssueKind issueKind;

    public ProgrammaticIssueBody(IssueFlow flowType, IssueKind issueKind, String errorMessage, String birdId) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(issueKind, "issueKind");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.flowType = flowType;
        this.issueKind = issueKind;
        this.errorMessage = errorMessage;
        this.birdId = birdId;
    }

    public static /* synthetic */ ProgrammaticIssueBody copy$default(ProgrammaticIssueBody programmaticIssueBody, IssueFlow issueFlow, IssueKind issueKind, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            issueFlow = programmaticIssueBody.flowType;
        }
        if ((i & 2) != 0) {
            issueKind = programmaticIssueBody.issueKind;
        }
        if ((i & 4) != 0) {
            str = programmaticIssueBody.errorMessage;
        }
        if ((i & 8) != 0) {
            str2 = programmaticIssueBody.birdId;
        }
        return programmaticIssueBody.copy(issueFlow, issueKind, str, str2);
    }

    public final IssueFlow component1() {
        return this.flowType;
    }

    public final IssueKind component2() {
        return this.issueKind;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final String component4() {
        return this.birdId;
    }

    public final ProgrammaticIssueBody copy(IssueFlow flowType, IssueKind issueKind, String errorMessage, String birdId) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(issueKind, "issueKind");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new ProgrammaticIssueBody(flowType, issueKind, errorMessage, birdId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProgrammaticIssueBody) {
            ProgrammaticIssueBody programmaticIssueBody = (ProgrammaticIssueBody) obj;
            return this.flowType == programmaticIssueBody.flowType && this.issueKind == programmaticIssueBody.issueKind && Intrinsics.areEqual(this.errorMessage, programmaticIssueBody.errorMessage) && Intrinsics.areEqual(this.birdId, programmaticIssueBody.birdId);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final IssueFlow getFlowType() {
        return this.flowType;
    }

    public final IssueKind getIssueKind() {
        return this.issueKind;
    }

    public int hashCode() {
        return (((((this.flowType.hashCode() * 31) + this.issueKind.hashCode()) * 31) + this.errorMessage.hashCode()) * 31) + this.birdId.hashCode();
    }

    public String toString() {
        IssueFlow issueFlow = this.flowType;
        IssueKind issueKind = this.issueKind;
        String str = this.errorMessage;
        String str2 = this.birdId;
        return "ProgrammaticIssueBody(flowType=" + issueFlow + ", issueKind=" + issueKind + ", errorMessage=" + str + ", birdId=" + str2 + ")";
    }
}
