package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;", "", "actionTakenRequiredFields", "", "Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;", "noActionTakenRequiredFields", "issueOptions", "Lco/bird/android/model/wire/WireComplaintIssueOption;", "actionTakenOptions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getActionTakenOptions", "()Ljava/util/List;", "getActionTakenRequiredFields", "getIssueOptions", "getNoActionTakenRequiredFields", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireComplaintResolutionFormResponse {
    @JsonProperty("action_taken_options")
    @InterfaceC41208ft5("action_taken_options")
    private final List<WireComplaintIssueOption> actionTakenOptions;
    @JsonProperty("action_taken_fields")
    @InterfaceC41208ft5("action_taken_fields")
    private final List<WireComplaintActionTakenRequiredField> actionTakenRequiredFields;
    @JsonProperty("issue_options")
    @InterfaceC41208ft5("issue_options")
    private final List<WireComplaintIssueOption> issueOptions;
    @JsonProperty("no_action_taken_fields")
    @InterfaceC41208ft5("no_action_taken_fields")
    private final List<WireComplaintActionTakenRequiredField> noActionTakenRequiredFields;

    public WireComplaintResolutionFormResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireComplaintResolutionFormResponse copy$default(WireComplaintResolutionFormResponse wireComplaintResolutionFormResponse, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wireComplaintResolutionFormResponse.actionTakenRequiredFields;
        }
        if ((i & 2) != 0) {
            list2 = wireComplaintResolutionFormResponse.noActionTakenRequiredFields;
        }
        if ((i & 4) != 0) {
            list3 = wireComplaintResolutionFormResponse.issueOptions;
        }
        if ((i & 8) != 0) {
            list4 = wireComplaintResolutionFormResponse.actionTakenOptions;
        }
        return wireComplaintResolutionFormResponse.copy(list, list2, list3, list4);
    }

    public final List<WireComplaintActionTakenRequiredField> component1() {
        return this.actionTakenRequiredFields;
    }

    public final List<WireComplaintActionTakenRequiredField> component2() {
        return this.noActionTakenRequiredFields;
    }

    public final List<WireComplaintIssueOption> component3() {
        return this.issueOptions;
    }

    public final List<WireComplaintIssueOption> component4() {
        return this.actionTakenOptions;
    }

    public final WireComplaintResolutionFormResponse copy(List<WireComplaintActionTakenRequiredField> actionTakenRequiredFields, List<WireComplaintActionTakenRequiredField> noActionTakenRequiredFields, List<WireComplaintIssueOption> issueOptions, List<WireComplaintIssueOption> actionTakenOptions) {
        Intrinsics.checkNotNullParameter(actionTakenRequiredFields, "actionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(noActionTakenRequiredFields, "noActionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(issueOptions, "issueOptions");
        Intrinsics.checkNotNullParameter(actionTakenOptions, "actionTakenOptions");
        return new WireComplaintResolutionFormResponse(actionTakenRequiredFields, noActionTakenRequiredFields, issueOptions, actionTakenOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireComplaintResolutionFormResponse) {
            WireComplaintResolutionFormResponse wireComplaintResolutionFormResponse = (WireComplaintResolutionFormResponse) obj;
            return Intrinsics.areEqual(this.actionTakenRequiredFields, wireComplaintResolutionFormResponse.actionTakenRequiredFields) && Intrinsics.areEqual(this.noActionTakenRequiredFields, wireComplaintResolutionFormResponse.noActionTakenRequiredFields) && Intrinsics.areEqual(this.issueOptions, wireComplaintResolutionFormResponse.issueOptions) && Intrinsics.areEqual(this.actionTakenOptions, wireComplaintResolutionFormResponse.actionTakenOptions);
        }
        return false;
    }

    public final List<WireComplaintIssueOption> getActionTakenOptions() {
        return this.actionTakenOptions;
    }

    public final List<WireComplaintActionTakenRequiredField> getActionTakenRequiredFields() {
        return this.actionTakenRequiredFields;
    }

    public final List<WireComplaintIssueOption> getIssueOptions() {
        return this.issueOptions;
    }

    public final List<WireComplaintActionTakenRequiredField> getNoActionTakenRequiredFields() {
        return this.noActionTakenRequiredFields;
    }

    public int hashCode() {
        return (((((this.actionTakenRequiredFields.hashCode() * 31) + this.noActionTakenRequiredFields.hashCode()) * 31) + this.issueOptions.hashCode()) * 31) + this.actionTakenOptions.hashCode();
    }

    public String toString() {
        List<WireComplaintActionTakenRequiredField> list = this.actionTakenRequiredFields;
        List<WireComplaintActionTakenRequiredField> list2 = this.noActionTakenRequiredFields;
        List<WireComplaintIssueOption> list3 = this.issueOptions;
        List<WireComplaintIssueOption> list4 = this.actionTakenOptions;
        return "WireComplaintResolutionFormResponse(actionTakenRequiredFields=" + list + ", noActionTakenRequiredFields=" + list2 + ", issueOptions=" + list3 + ", actionTakenOptions=" + list4 + ")";
    }

    public WireComplaintResolutionFormResponse(List<WireComplaintActionTakenRequiredField> actionTakenRequiredFields, List<WireComplaintActionTakenRequiredField> noActionTakenRequiredFields, List<WireComplaintIssueOption> issueOptions, List<WireComplaintIssueOption> actionTakenOptions) {
        Intrinsics.checkNotNullParameter(actionTakenRequiredFields, "actionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(noActionTakenRequiredFields, "noActionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(issueOptions, "issueOptions");
        Intrinsics.checkNotNullParameter(actionTakenOptions, "actionTakenOptions");
        this.actionTakenRequiredFields = actionTakenRequiredFields;
        this.noActionTakenRequiredFields = noActionTakenRequiredFields;
        this.issueOptions = issueOptions;
        this.actionTakenOptions = actionTakenOptions;
    }

    public /* synthetic */ WireComplaintResolutionFormResponse(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4);
    }
}
