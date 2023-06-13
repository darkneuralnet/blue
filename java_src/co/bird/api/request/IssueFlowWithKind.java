package co.bird.api.request;

import co.bird.android.model.IssueFlow;
import co.bird.android.model.IssueKind;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/request/IssueFlowWithKind;", "", "flow", "Lco/bird/android/model/IssueFlow;", "issueKinds", "", "Lco/bird/android/model/IssueKind;", "(Lco/bird/android/model/IssueFlow;Ljava/util/List;)V", "getFlow", "()Lco/bird/android/model/IssueFlow;", "getIssueKinds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IssueFlowWithKind {
    @JsonProperty("flow")
    @InterfaceC41208ft5("flow")
    private final IssueFlow flow;
    @JsonProperty("issue_kinds")
    @InterfaceC41208ft5("issue_kinds")
    private final List<IssueKind> issueKinds;

    /* JADX WARN: Multi-variable type inference failed */
    public IssueFlowWithKind(IssueFlow flow, List<? extends IssueKind> issueKinds) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(issueKinds, "issueKinds");
        this.flow = flow;
        this.issueKinds = issueKinds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IssueFlowWithKind copy$default(IssueFlowWithKind issueFlowWithKind, IssueFlow issueFlow, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            issueFlow = issueFlowWithKind.flow;
        }
        if ((i & 2) != 0) {
            list = issueFlowWithKind.issueKinds;
        }
        return issueFlowWithKind.copy(issueFlow, list);
    }

    public final IssueFlow component1() {
        return this.flow;
    }

    public final List<IssueKind> component2() {
        return this.issueKinds;
    }

    public final IssueFlowWithKind copy(IssueFlow flow, List<? extends IssueKind> issueKinds) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(issueKinds, "issueKinds");
        return new IssueFlowWithKind(flow, issueKinds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IssueFlowWithKind) {
            IssueFlowWithKind issueFlowWithKind = (IssueFlowWithKind) obj;
            return this.flow == issueFlowWithKind.flow && Intrinsics.areEqual(this.issueKinds, issueFlowWithKind.issueKinds);
        }
        return false;
    }

    public final IssueFlow getFlow() {
        return this.flow;
    }

    public final List<IssueKind> getIssueKinds() {
        return this.issueKinds;
    }

    public int hashCode() {
        return (this.flow.hashCode() * 31) + this.issueKinds.hashCode();
    }

    public String toString() {
        IssueFlow issueFlow = this.flow;
        List<IssueKind> list = this.issueKinds;
        return "IssueFlowWithKind(flow=" + issueFlow + ", issueKinds=" + list + ")";
    }
}
