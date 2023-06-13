package p000;

import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.extension.Issue_Kt;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000H\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0003H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/Issue;", "", C17296a.f69688o, "Lco/bird/android/model/IssueStatus;", "", "b", "subtype", "c", "repair_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,403:1\n37#2,2:404\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterKt\n*L\n384#1:404,2\n*E\n"})
/* renamed from: Ez4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32778Ez4 {
    /* renamed from: a */
    public static final Set<Issue> m108157a(Issue issue) {
        Set<Issue> of;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(issue);
        spreadBuilder.addSpread(issue.getSubtypes().toArray(new Issue[0]));
        of = SetsKt__SetsKt.setOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
        return of;
    }

    /* renamed from: b */
    public static final boolean m108156b(IssueStatus issueStatus) {
        return issueStatus == IssueStatus.CANT_REPAIR || issueStatus == IssueStatus.ABANDONED;
    }

    /* renamed from: c */
    public static final Issue m108155c(Issue issue, Issue issue2) {
        Issue copy;
        Issue copy2;
        IssueStatus issueStatus = IssueStatus.RESOLVED;
        copy = issue2.copy((r37 & 1) != 0 ? issue2.f66598id : null, (r37 & 2) != 0 ? issue2.workOrderId : null, (r37 & 4) != 0 ? issue2.issueTypeId : null, (r37 & 8) != 0 ? issue2.display : null, (r37 & 16) != 0 ? issue2.description : null, (r37 & 32) != 0 ? issue2.status : issueStatus, (r37 & 64) != 0 ? issue2.statusDisplay : null, (r37 & 128) != 0 ? issue2.statusColor : null, (r37 & 256) != 0 ? issue2.statusReasonDisplay : null, (r37 & 512) != 0 ? issue2.source : null, (r37 & 1024) != 0 ? issue2.sourceDisplay : null, (r37 & 2048) != 0 ? issue2.createdBy : null, (r37 & 4096) != 0 ? issue2.createdAt : null, (r37 & 8192) != 0 ? issue2.updatedAt : null, (r37 & 16384) != 0 ? issue2.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue2.assetId : null, (r37 & 65536) != 0 ? issue2.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue2.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue2.statusReason : null);
        Issue updateIssue = Issue_Kt.updateIssue(issue, copy);
        if (updateIssue.getStatus() != null) {
            copy2 = updateIssue.copy((r37 & 1) != 0 ? updateIssue.f66598id : null, (r37 & 2) != 0 ? updateIssue.workOrderId : null, (r37 & 4) != 0 ? updateIssue.issueTypeId : null, (r37 & 8) != 0 ? updateIssue.display : null, (r37 & 16) != 0 ? updateIssue.description : null, (r37 & 32) != 0 ? updateIssue.status : issueStatus, (r37 & 64) != 0 ? updateIssue.statusDisplay : null, (r37 & 128) != 0 ? updateIssue.statusColor : null, (r37 & 256) != 0 ? updateIssue.statusReasonDisplay : null, (r37 & 512) != 0 ? updateIssue.source : null, (r37 & 1024) != 0 ? updateIssue.sourceDisplay : null, (r37 & 2048) != 0 ? updateIssue.createdBy : null, (r37 & 4096) != 0 ? updateIssue.createdAt : null, (r37 & 8192) != 0 ? updateIssue.updatedAt : null, (r37 & 16384) != 0 ? updateIssue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? updateIssue.assetId : null, (r37 & 65536) != 0 ? updateIssue.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? updateIssue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? updateIssue.statusReason : null);
            return copy2;
        }
        return updateIssue;
    }
}
