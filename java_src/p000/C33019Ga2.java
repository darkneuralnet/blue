package p000;

import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.constant.IssueStatusReason;
import co.bird.android.model.extension.IssueType_Kt;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0007"}, m28432d2 = {"", "Lco/bird/android/model/IssueType;", "", "", "Lco/bird/android/model/Issue;", "existingIssues", C17296a.f69688o, "repair_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIssueType+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueType+.kt\nco/bird/android/feature/repair/extensions/IssueType_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1549#2:45\n1620#2,2:46\n1549#2:48\n1620#2,3:49\n1622#2:52\n*S KotlinDebug\n*F\n+ 1 IssueType+.kt\nco/bird/android/feature/repair/extensions/IssueType_Kt\n*L\n17#1:45\n17#1:46,2\n29#1:48\n29#1:49,3\n17#1:52\n*E\n"})
/* renamed from: Ga2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33019Ga2 {
    /* renamed from: a */
    public static final List<Issue> m104999a(List<IssueType> list, Map<String, Issue> existingIssues) {
        int collectionSizeOrDefault;
        IssueStatus issueStatus;
        String str;
        IssueStatusReason issueStatusReason;
        String str2;
        IssueCreateSource issueCreateSource;
        int collectionSizeOrDefault2;
        Issue copy;
        String id;
        IssueStatus issueStatus2;
        String str3;
        IssueStatusReason issueStatusReason2;
        String str4;
        IssueCreateSource issueCreateSource2;
        Issue copy2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(existingIssues, "existingIssues");
        List<IssueType> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IssueType issueType : list2) {
            Issue issue = existingIssues.get(issueType.getId());
            String str5 = (issue == null || (str5 = issue.getId()) == null) ? "" : "";
            if (issue != null) {
                issueStatus = issue.getStatus();
            } else {
                issueStatus = null;
            }
            if (issue != null) {
                str = issue.getStatusDisplay();
            } else {
                str = null;
            }
            if (issue != null) {
                issueStatusReason = issue.getStatusReason();
            } else {
                issueStatusReason = null;
            }
            if (issue != null) {
                str2 = issue.getStatusReasonDisplay();
            } else {
                str2 = null;
            }
            if (issue != null) {
                issueCreateSource = issue.getSource();
            } else {
                issueCreateSource = null;
            }
            Issue issue2 = IssueType_Kt.toIssue(issueType, str5, issueStatus, str, issueStatusReason, str2, issueCreateSource);
            List<Issue> subtypes = issue2.getSubtypes();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (Issue issue3 : subtypes) {
                Issue issue4 = existingIssues.get(issue3.getIssueTypeId());
                if (issue4 == null || (id = issue4.getId()) == null) {
                    id = issue3.getId();
                }
                String str6 = id;
                if (issue4 != null) {
                    issueStatus2 = issue4.getStatus();
                } else {
                    issueStatus2 = null;
                }
                if (issue4 != null) {
                    str3 = issue4.getStatusDisplay();
                } else {
                    str3 = null;
                }
                if (issue4 != null) {
                    issueStatusReason2 = issue4.getStatusReason();
                } else {
                    issueStatusReason2 = null;
                }
                if (issue4 != null) {
                    str4 = issue4.getStatusReasonDisplay();
                } else {
                    str4 = null;
                }
                if (issue4 != null) {
                    issueCreateSource2 = issue4.getSource();
                } else {
                    issueCreateSource2 = null;
                }
                copy2 = issue3.copy((r37 & 1) != 0 ? issue3.f66598id : str6, (r37 & 2) != 0 ? issue3.workOrderId : null, (r37 & 4) != 0 ? issue3.issueTypeId : null, (r37 & 8) != 0 ? issue3.display : null, (r37 & 16) != 0 ? issue3.description : null, (r37 & 32) != 0 ? issue3.status : issueStatus2, (r37 & 64) != 0 ? issue3.statusDisplay : str3, (r37 & 128) != 0 ? issue3.statusColor : null, (r37 & 256) != 0 ? issue3.statusReasonDisplay : str4, (r37 & 512) != 0 ? issue3.source : issueCreateSource2, (r37 & 1024) != 0 ? issue3.sourceDisplay : null, (r37 & 2048) != 0 ? issue3.createdBy : null, (r37 & 4096) != 0 ? issue3.createdAt : null, (r37 & 8192) != 0 ? issue3.updatedAt : null, (r37 & 16384) != 0 ? issue3.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue3.assetId : null, (r37 & 65536) != 0 ? issue3.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue3.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue3.statusReason : issueStatusReason2);
                arrayList2.add(copy2);
            }
            copy = issue2.copy((r37 & 1) != 0 ? issue2.f66598id : null, (r37 & 2) != 0 ? issue2.workOrderId : null, (r37 & 4) != 0 ? issue2.issueTypeId : null, (r37 & 8) != 0 ? issue2.display : null, (r37 & 16) != 0 ? issue2.description : null, (r37 & 32) != 0 ? issue2.status : null, (r37 & 64) != 0 ? issue2.statusDisplay : null, (r37 & 128) != 0 ? issue2.statusColor : null, (r37 & 256) != 0 ? issue2.statusReasonDisplay : null, (r37 & 512) != 0 ? issue2.source : null, (r37 & 1024) != 0 ? issue2.sourceDisplay : null, (r37 & 2048) != 0 ? issue2.createdBy : null, (r37 & 4096) != 0 ? issue2.createdAt : null, (r37 & 8192) != 0 ? issue2.updatedAt : null, (r37 & 16384) != 0 ? issue2.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue2.assetId : null, (r37 & 65536) != 0 ? issue2.subtypes : arrayList2, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue2.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue2.statusReason : null);
            arrayList.add(copy);
        }
        return arrayList;
    }
}
