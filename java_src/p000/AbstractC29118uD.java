package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0004J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004J\b\u0010\u000e\u001a\u00020\tH\u0004J\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\u000fH\u0002J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"LuD;", "LtA;", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "issueRepairs", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairs", "LH6;", "t", "", Entry.TYPE_TEXT, "s", "r", "Lco/bird/android/model/IssueStatus;", "u", "", "v", "(Lco/bird/android/model/IssueStatus;)Ljava/lang/Integer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseRepairOverviewConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepairOverviewConverter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1549#2:76\n1620#2,2:77\n766#2:79\n857#2,2:80\n1549#2:82\n1620#2,3:83\n1622#2:86\n*S KotlinDebug\n*F\n+ 1 BaseRepairOverviewConverter.kt\nco/bird/android/feature/repair/v1/base/adapters/BaseRepairOverviewConverter\n*L\n23#1:76\n23#1:77,2\n30#1:79\n30#1:80,2\n31#1:82\n31#1:83,3\n23#1:86\n*E\n"})
/* renamed from: uD */
/* loaded from: classes3.dex */
public abstract class AbstractC29118uD extends AbstractC28540tA {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uD$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29119a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IssueStatus.values().length];
            try {
                iArr[IssueStatus.RESOLVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueStatus.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueStatus.DISPUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IssueStatus.FAILED_QC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC29118uD(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: r */
    public final C3023H6 m10607r() {
        return new C3023H6(new ArrayList(), new C2637G6(new C28529t7(m12962m().getString(C45871nl4.field_repair_add_repairs)), C45268mk4.item_button_secondary, false, 4, null), null, 4, null);
    }

    /* renamed from: s */
    public final C3023H6 m10606s(String str) {
        return new C3023H6(new ArrayList(), new C2637G6(new C39347cn0(str), C45268mk4.item_button_secondary, false, 4, null), null, 4, null);
    }

    /* renamed from: t */
    public final List<C3023H6> m10605t(Map<Issue, ? extends List<RepairType>> issueRepairs, List<RepairTypeLock> selectedRepairs) {
        int collectionSizeOrDefault;
        String str;
        Integer num;
        Issue copy;
        int collectionSizeOrDefault2;
        List mutableList;
        Intrinsics.checkNotNullParameter(issueRepairs, "issueRepairs");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        Set<Issue> keySet = issueRepairs.keySet();
        int i = 10;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : keySet) {
            String sourceDisplay = issue.getSourceDisplay();
            if (sourceDisplay == null) {
                sourceDisplay = m12962m().getString(C45871nl4.field_repair_source_operator);
                Intrinsics.checkNotNullExpressionValue(sourceDisplay, "context.getString(L.stri…d_repair_source_operator)");
            }
            String str2 = sourceDisplay;
            IssueStatus status = issue.getStatus();
            if (status != null) {
                str = m10604u(status);
            } else {
                str = null;
            }
            IssueStatus status2 = issue.getStatus();
            if (status2 != null) {
                num = m10603v(status2);
            } else {
                num = null;
            }
            copy = issue.copy((r37 & 1) != 0 ? issue.f66598id : null, (r37 & 2) != 0 ? issue.workOrderId : null, (r37 & 4) != 0 ? issue.issueTypeId : null, (r37 & 8) != 0 ? issue.display : null, (r37 & 16) != 0 ? issue.description : null, (r37 & 32) != 0 ? issue.status : null, (r37 & 64) != 0 ? issue.statusDisplay : str, (r37 & 128) != 0 ? issue.statusColor : num, (r37 & 256) != 0 ? issue.statusReasonDisplay : null, (r37 & 512) != 0 ? issue.source : null, (r37 & 1024) != 0 ? issue.sourceDisplay : str2, (r37 & 2048) != 0 ? issue.createdBy : null, (r37 & 4096) != 0 ? issue.createdAt : null, (r37 & 8192) != 0 ? issue.updatedAt : null, (r37 & 16384) != 0 ? issue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue.assetId : null, (r37 & 65536) != 0 ? issue.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue.statusReason : null);
            C2637G6 c2637g6 = new C2637G6(copy, C32634Ej4.item_repair_status, false, 4, null);
            ArrayList<RepairTypeLock> arrayList2 = new ArrayList();
            for (Object obj : selectedRepairs) {
                if (Intrinsics.areEqual(((RepairTypeLock) obj).component1().getIssueTypeId(), issue.getIssueTypeId())) {
                    arrayList2.add(obj);
                }
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, i);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (RepairTypeLock repairTypeLock : arrayList2) {
                arrayList3.add(new C2637G6(repairTypeLock.getRepairType(), C32634Ej4.item_issue_repair, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
            arrayList.add(new C3023H6(mutableList, c2637g6, new C2637G6(TuplesKt.m28425to(issue, m12962m().getString(C45871nl4.work_order_repair_summary_repair_count, Integer.valueOf(arrayList2.size()))), C32634Ej4.item_dropdown_repair_button, false, 4, null)));
            i = 10;
        }
        return arrayList;
    }

    /* renamed from: u */
    public final String m10604u(IssueStatus issueStatus) {
        int i = C29119a.$EnumSwitchMapping$0[issueStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return m12962m().getString(C45871nl4.issue_status_failed_qc);
                }
                return m12962m().getString(C45871nl4.issue_status_no_repair_title);
            }
            return m12962m().getString(C45871nl4.field_repair_status_open);
        }
        return m12962m().getString(C45871nl4.field_repair_status_resolved);
    }

    /* renamed from: v */
    public final Integer m10603v(IssueStatus issueStatus) {
        int i = C29119a.$EnumSwitchMapping$0[issueStatus.ordinal()];
        if (i != 1) {
            if (i != 4) {
                return Integer.valueOf(NA0.m94301c(m12962m(), C32364Df4.birdNewRoad));
            }
            return Integer.valueOf(NA0.m94301c(m12962m(), C32364Df4.errorRed));
        }
        return Integer.valueOf(NA0.m94301c(m12962m(), C32364Df4.mint));
    }
}
