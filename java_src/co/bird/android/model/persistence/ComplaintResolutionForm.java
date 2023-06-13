package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ComplaintActionTakenRequiredField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolutionForm;", "", "actionTakenRequiredFields", "", "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "noActionTakenRequiredFields", "issueOptions", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "actionTakenOptions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getActionTakenOptions", "()Ljava/util/List;", "getActionTakenRequiredFields", "getIssueOptions", "getNoActionTakenRequiredFields", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ComplaintResolutionForm {
    private final List<ComplaintIssueOption> actionTakenOptions;
    private final List<ComplaintActionTakenRequiredField> actionTakenRequiredFields;
    private final List<ComplaintIssueOption> issueOptions;
    private final List<ComplaintActionTakenRequiredField> noActionTakenRequiredFields;

    public ComplaintResolutionForm() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComplaintResolutionForm copy$default(ComplaintResolutionForm complaintResolutionForm, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = complaintResolutionForm.actionTakenRequiredFields;
        }
        if ((i & 2) != 0) {
            list2 = complaintResolutionForm.noActionTakenRequiredFields;
        }
        if ((i & 4) != 0) {
            list3 = complaintResolutionForm.issueOptions;
        }
        if ((i & 8) != 0) {
            list4 = complaintResolutionForm.actionTakenOptions;
        }
        return complaintResolutionForm.copy(list, list2, list3, list4);
    }

    public final List<ComplaintActionTakenRequiredField> component1() {
        return this.actionTakenRequiredFields;
    }

    public final List<ComplaintActionTakenRequiredField> component2() {
        return this.noActionTakenRequiredFields;
    }

    public final List<ComplaintIssueOption> component3() {
        return this.issueOptions;
    }

    public final List<ComplaintIssueOption> component4() {
        return this.actionTakenOptions;
    }

    public final ComplaintResolutionForm copy(List<ComplaintActionTakenRequiredField> actionTakenRequiredFields, List<ComplaintActionTakenRequiredField> noActionTakenRequiredFields, List<ComplaintIssueOption> issueOptions, List<ComplaintIssueOption> actionTakenOptions) {
        Intrinsics.checkNotNullParameter(actionTakenRequiredFields, "actionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(noActionTakenRequiredFields, "noActionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(issueOptions, "issueOptions");
        Intrinsics.checkNotNullParameter(actionTakenOptions, "actionTakenOptions");
        return new ComplaintResolutionForm(actionTakenRequiredFields, noActionTakenRequiredFields, issueOptions, actionTakenOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplaintResolutionForm) {
            ComplaintResolutionForm complaintResolutionForm = (ComplaintResolutionForm) obj;
            return Intrinsics.areEqual(this.actionTakenRequiredFields, complaintResolutionForm.actionTakenRequiredFields) && Intrinsics.areEqual(this.noActionTakenRequiredFields, complaintResolutionForm.noActionTakenRequiredFields) && Intrinsics.areEqual(this.issueOptions, complaintResolutionForm.issueOptions) && Intrinsics.areEqual(this.actionTakenOptions, complaintResolutionForm.actionTakenOptions);
        }
        return false;
    }

    public final List<ComplaintIssueOption> getActionTakenOptions() {
        return this.actionTakenOptions;
    }

    public final List<ComplaintActionTakenRequiredField> getActionTakenRequiredFields() {
        return this.actionTakenRequiredFields;
    }

    public final List<ComplaintIssueOption> getIssueOptions() {
        return this.issueOptions;
    }

    public final List<ComplaintActionTakenRequiredField> getNoActionTakenRequiredFields() {
        return this.noActionTakenRequiredFields;
    }

    public int hashCode() {
        return (((((this.actionTakenRequiredFields.hashCode() * 31) + this.noActionTakenRequiredFields.hashCode()) * 31) + this.issueOptions.hashCode()) * 31) + this.actionTakenOptions.hashCode();
    }

    public String toString() {
        List<ComplaintActionTakenRequiredField> list = this.actionTakenRequiredFields;
        List<ComplaintActionTakenRequiredField> list2 = this.noActionTakenRequiredFields;
        List<ComplaintIssueOption> list3 = this.issueOptions;
        List<ComplaintIssueOption> list4 = this.actionTakenOptions;
        return "ComplaintResolutionForm(actionTakenRequiredFields=" + list + ", noActionTakenRequiredFields=" + list2 + ", issueOptions=" + list3 + ", actionTakenOptions=" + list4 + ")";
    }

    public ComplaintResolutionForm(List<ComplaintActionTakenRequiredField> actionTakenRequiredFields, List<ComplaintActionTakenRequiredField> noActionTakenRequiredFields, List<ComplaintIssueOption> issueOptions, List<ComplaintIssueOption> actionTakenOptions) {
        Intrinsics.checkNotNullParameter(actionTakenRequiredFields, "actionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(noActionTakenRequiredFields, "noActionTakenRequiredFields");
        Intrinsics.checkNotNullParameter(issueOptions, "issueOptions");
        Intrinsics.checkNotNullParameter(actionTakenOptions, "actionTakenOptions");
        this.actionTakenRequiredFields = actionTakenRequiredFields;
        this.noActionTakenRequiredFields = noActionTakenRequiredFields;
        this.issueOptions = issueOptions;
        this.actionTakenOptions = actionTakenOptions;
    }

    public /* synthetic */ ComplaintResolutionForm(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4);
    }
}
