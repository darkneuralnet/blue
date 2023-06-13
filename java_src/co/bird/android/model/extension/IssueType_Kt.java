package co.bird.android.model.extension;

import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.QCInspection;
import co.bird.android.model.constant.IssueStatusReason;
import co.bird.android.model.constant.QCKind;
import co.bird.android.model.constant.QCStatus;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aP\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0010¨\u0006\u0011"}, m28432d2 = {"toIssue", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/IssueType;", "id", "", "status", "Lco/bird/android/model/IssueStatus;", "statusDisplay", "statusReason", "Lco/bird/android/model/constant/IssueStatusReason;", "statusReasonDisplay", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/IssueCreateSource;", "toQCInspection", "Lco/bird/android/model/QCInspection;", "workOrderId", "Lco/bird/android/model/constant/QCStatus;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIssueType+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueType+.kt\nco/bird/android/model/extension/IssueType_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1549#2:49\n1620#2,3:50\n*S KotlinDebug\n*F\n+ 1 IssueType+.kt\nco/bird/android/model/extension/IssueType_Kt\n*L\n44#1:49\n44#1:50,3\n*E\n"})
/* loaded from: classes4.dex */
public final class IssueType_Kt {
    public static final Issue toIssue(IssueType issueType, String id, IssueStatus issueStatus, String str, IssueStatusReason issueStatusReason, String str2, IssueCreateSource issueCreateSource) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(issueType, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        String id2 = issueType.getId();
        String display = issueType.getDisplay();
        String description = issueType.getDescription();
        String parentId = issueType.getParentId();
        String assetId = issueType.getAssetId();
        List<IssueType> subtypes = issueType.getSubtypes();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IssueType issueType2 : subtypes) {
            arrayList.add(toIssue$default(issueType2, null, null, null, null, null, null, 63, null));
        }
        return new Issue(id, null, id2, display, description, issueStatus, str, null, str2, issueCreateSource, null, null, null, null, parentId, assetId, arrayList, issueType.getWireCampaign(), issueStatusReason, 15490, null);
    }

    public static /* synthetic */ Issue toIssue$default(IssueType issueType, String str, IssueStatus issueStatus, String str2, IssueStatusReason issueStatusReason, String str3, IssueCreateSource issueCreateSource, int i, Object obj) {
        IssueStatus issueStatus2;
        String str4;
        IssueStatusReason issueStatusReason2;
        String str5;
        if ((i & 1) != 0) {
            str = "";
        }
        IssueCreateSource issueCreateSource2 = null;
        if ((i & 2) != 0) {
            issueStatus2 = null;
        } else {
            issueStatus2 = issueStatus;
        }
        if ((i & 4) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            issueStatusReason2 = null;
        } else {
            issueStatusReason2 = issueStatusReason;
        }
        if ((i & 16) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 32) == 0) {
            issueCreateSource2 = issueCreateSource;
        }
        return toIssue(issueType, str, issueStatus2, str4, issueStatusReason2, str5, issueCreateSource2);
    }

    public static final QCInspection toQCInspection(IssueType issueType, String workOrderId, QCStatus status) {
        Intrinsics.checkNotNullParameter(issueType, "<this>");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(status, "status");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return new QCInspection(uuid, issueType.getDisplay(), null, workOrderId, issueType.getId(), null, QCKind.ISSUE, status, null, 292, null);
    }

    public static /* synthetic */ QCInspection toQCInspection$default(IssueType issueType, String str, QCStatus qCStatus, int i, Object obj) {
        if ((i & 2) != 0) {
            qCStatus = QCStatus.OPEN;
        }
        return toQCInspection(issueType, str, qCStatus);
    }
}
