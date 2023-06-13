package co.bird.android.model.extension;

import co.bird.android.model.Issue;
import co.bird.android.model.IssueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, m28432d2 = {"toIssueType", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/Issue;", "updateIssue", "updatedIssue", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIssue+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Issue+.kt\nco/bird/android/model/extension/Issue_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1549#2:34\n1620#2,3:35\n223#2,2:38\n*S KotlinDebug\n*F\n+ 1 Issue+.kt\nco/bird/android/model/extension/Issue_Kt\n*L\n11#1:34\n11#1:35,3\n24#1:38,2\n*E\n"})
/* loaded from: classes4.dex */
public final class Issue_Kt {
    public static final IssueType toIssueType(Issue issue) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(issue, "<this>");
        String issueTypeId = issue.getIssueTypeId();
        String display = issue.getDisplay();
        String description = issue.getDescription();
        List<Issue> subtypes = issue.getSubtypes();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Issue issue2 : subtypes) {
            arrayList.add(toIssueType(issue2));
        }
        return new IssueType(issueTypeId, null, display, description, null, null, null, arrayList, null, 370, null);
    }

    public static final Issue updateIssue(Issue issue, Issue updatedIssue) {
        List<Issue> mutableList;
        Issue copy;
        Intrinsics.checkNotNullParameter(issue, "<this>");
        Intrinsics.checkNotNullParameter(updatedIssue, "updatedIssue");
        if (Intrinsics.areEqual(issue.getIssueTypeId(), updatedIssue.getIssueTypeId())) {
            return updatedIssue;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) issue.getSubtypes());
        for (Issue issue2 : mutableList) {
            if (Intrinsics.areEqual(issue2.getIssueTypeId(), updatedIssue.getIssueTypeId())) {
                int indexOf = mutableList.indexOf(issue2);
                mutableList.remove(issue2);
                mutableList.add(indexOf, updatedIssue);
                copy = issue.copy((r37 & 1) != 0 ? issue.f66598id : null, (r37 & 2) != 0 ? issue.workOrderId : null, (r37 & 4) != 0 ? issue.issueTypeId : null, (r37 & 8) != 0 ? issue.display : null, (r37 & 16) != 0 ? issue.description : null, (r37 & 32) != 0 ? issue.status : null, (r37 & 64) != 0 ? issue.statusDisplay : null, (r37 & 128) != 0 ? issue.statusColor : null, (r37 & 256) != 0 ? issue.statusReasonDisplay : null, (r37 & 512) != 0 ? issue.source : null, (r37 & 1024) != 0 ? issue.sourceDisplay : null, (r37 & 2048) != 0 ? issue.createdBy : null, (r37 & 4096) != 0 ? issue.createdAt : null, (r37 & 8192) != 0 ? issue.updatedAt : null, (r37 & 16384) != 0 ? issue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue.assetId : null, (r37 & 65536) != 0 ? issue.subtypes : mutableList, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue.statusReason : null);
                return copy;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
