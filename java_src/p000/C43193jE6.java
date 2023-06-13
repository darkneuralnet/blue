package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.CampaignPriority;
import co.bird.android.model.extension.IssueStatus_Kt;
import co.bird.android.model.wire.WireServiceCenterCampaign;
import co.bird.android.model.wire.WireServiceCenterCampaignPriority;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J*\u0010\u000b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J*\u0010\f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J \u0010\u000e\u001a\u00020\r*\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LjE6;", "LgE6;", "", "Lco/bird/android/model/Issue;", "issues", "", "", "existingIssues", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "e", DateTokenConverter.CONVERTER_KEY, "", "f", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionConverter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1549#2:114\n1620#2,2:115\n1549#2:117\n1620#2,3:118\n1622#2:124\n1360#2:126\n1446#2,2:127\n1448#2,3:131\n1747#2,3:134\n1726#2,3:137\n2624#2,2:140\n1726#2,3:142\n2626#2:145\n37#3,2:121\n37#3,2:129\n603#4:123\n1#5:125\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionConverter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionConverterImpl\n*L\n38#1:114\n38#1:115,2\n39#1:117\n39#1:118,3\n38#1:124\n79#1:126\n79#1:127,2\n79#1:131,3\n80#1:134,3\n86#1:137,3\n87#1:140,2\n89#1:142,3\n87#1:145\n51#1:121,2\n79#1:129,2\n58#1:123\n*E\n"})
/* renamed from: jE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43193jE6 implements InterfaceC41414gE6 {

    /* renamed from: a */
    public final Context f92322a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/Issue;", "issue", "", C17296a.f69688o, "(Lco/bird/android/model/Issue;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jE6$a */
    /* loaded from: classes3.dex */
    public static final class C24747a extends Lambda implements Function1<Issue, Boolean> {

        /* renamed from: g */
        public static final C24747a f92323g = new C24747a();

        public C24747a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Issue issue) {
            boolean z;
            Intrinsics.checkNotNullParameter(issue, "issue");
            boolean z2 = false;
            if (issue.getSource() == IssueCreateSource.CAMPAIGN && issue.getWireCampaign() != null) {
                IssueStatus status = issue.getStatus();
                if (status != null && IssueStatus_Kt.isFailedStatus(status)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WorkOrderInspectionConverter.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionConverterImpl\n*L\n1#1,328:1\n58#2:329\n*E\n"})
    /* renamed from: jE6$b */
    /* loaded from: classes3.dex */
    public static final class C24748b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            CampaignPriority campaignPriority;
            int compareValues;
            WireServiceCenterCampaignPriority wirePriority;
            WireServiceCenterCampaignPriority wirePriority2;
            WireServiceCenterCampaign wireCampaign = ((Issue) t).getWireCampaign();
            CampaignPriority campaignPriority2 = null;
            if (wireCampaign != null && (wirePriority2 = wireCampaign.getWirePriority()) != null) {
                campaignPriority = wirePriority2.getPriority();
            } else {
                campaignPriority = null;
            }
            WireServiceCenterCampaign wireCampaign2 = ((Issue) t2).getWireCampaign();
            if (wireCampaign2 != null && (wirePriority = wireCampaign2.getWirePriority()) != null) {
                campaignPriority2 = wirePriority.getPriority();
            }
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(campaignPriority, campaignPriority2);
            return compareValues;
        }
    }

    public C43193jE6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f92322a = context;
    }

    /* renamed from: c */
    public static final List m30960c(C43193jE6 this$0, List issues, Map existingIssues) {
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(issues, "$issues");
        Intrinsics.checkNotNullParameter(existingIssues, "$existingIssues");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{this$0.m30958e(issues, existingIssues), this$0.m30959d(issues, existingIssues)});
        return listOf;
    }

    @Override // p000.InterfaceC41414gE6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo30962a(final List<Issue> issues, final Map<String, Issue> existingIssues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(existingIssues, "existingIssues");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: iE6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m30960c;
                m30960c = C43193jE6.m30960c(C43193jE6.this, issues, existingIssues);
                return m30960c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lis…Schedulers.computation())");
        return m33142Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x011a A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3023H6 m30959d(List<Issue> list, Map<String, Issue> map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        List mutableListOf;
        List listOf;
        List<Issue> list2 = list;
        ArrayList<Issue> arrayList = new ArrayList();
        for (Issue issue : list2) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(issue);
            spreadBuilder.addSpread(issue.getSubtypes().toArray(new Issue[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
        }
        if (!arrayList.isEmpty()) {
            for (Issue issue2 : arrayList) {
                Issue issue3 = map.get(issue2.getIssueTypeId());
                if (issue3 != null && issue2.getStatus() != issue3.getStatus()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && (issue2.getStatus() != IssueStatus.OPEN || map.containsKey(issue2.getIssueTypeId()))) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (!arrayList.isEmpty()) {
            for (Issue issue4 : arrayList) {
                if (issue4.getSource() == null) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (!z4) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        if (z3 || z5) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Issue issue5 : list2) {
                    if (issue5.getStatus() == null) {
                        List<Issue> subtypes = issue5.getSubtypes();
                        if (!(subtypes instanceof Collection) || !subtypes.isEmpty()) {
                            for (Issue issue6 : subtypes) {
                                if (issue6.getStatus() == null) {
                                    z8 = true;
                                    continue;
                                } else {
                                    z8 = false;
                                    continue;
                                }
                                if (!z8) {
                                    z9 = false;
                                    break;
                                }
                            }
                        }
                        z9 = true;
                        if (z9) {
                            z6 = true;
                            continue;
                            if (z6) {
                                z7 = false;
                                break;
                            }
                        }
                    }
                    z6 = false;
                    continue;
                    if (z6) {
                    }
                }
            }
            z7 = true;
            if (z7) {
                z10 = true;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(TuplesKt.m28425to(this.f92322a.getString(C45871nl4.work_order_inspection_complete), Boolean.valueOf(z10)), C45268mk4.item_button_matte_black, false, 4, null));
                return new C3023H6(mutableListOf, null, null, 6, null);
            }
        }
        z10 = false;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(TuplesKt.m28425to(this.f92322a.getString(C45871nl4.work_order_inspection_complete), Boolean.valueOf(z10)), C45268mk4.item_button_matte_black, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m30958e(List<Issue> list, Map<String, Issue> map) {
        int collectionSizeOrDefault;
        List mutableList;
        int collectionSizeOrDefault2;
        List mutableList2;
        List listOf;
        Sequence asSequence;
        Sequence filter;
        Sequence sortedWith;
        Object firstOrNull;
        WireServiceCenterCampaign wireServiceCenterCampaign;
        List<Issue> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : list2) {
            List<Issue> subtypes = issue.getSubtypes();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (Issue issue2 : subtypes) {
                arrayList2.add(new C2637G6(TuplesKt.m28425to(issue2, Boolean.valueOf(m30957f(issue2, map))), C37080Xj4.item_inspection_issue_subtype, false, 4, null));
            }
            mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            C3023H6 c3023h6 = new C3023H6(mutableList2, null, null, 6, null);
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(issue);
            spreadBuilder.addSpread(issue.getSubtypes().toArray(new Issue[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
            asSequence = CollectionsKt___CollectionsKt.asSequence(listOf);
            filter = SequencesKt___SequencesKt.filter(asSequence, C24747a.f92323g);
            sortedWith = SequencesKt___SequencesKt.sortedWith(filter, new C24748b());
            firstOrNull = SequencesKt___SequencesKt.firstOrNull(sortedWith);
            Issue issue3 = (Issue) firstOrNull;
            if (issue3 != null) {
                wireServiceCenterCampaign = issue3.getWireCampaign();
            } else {
                wireServiceCenterCampaign = null;
            }
            arrayList.add(new C2637G6(new C33253Ha2(issue, m30957f(issue, map), c3023h6, wireServiceCenterCampaign), C37080Xj4.item_inspection_issue_type, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: f */
    public final boolean m30957f(Issue issue, Map<String, Issue> map) {
        IssueCreateSource issueCreateSource;
        boolean z;
        Issue issue2 = map.get(issue.getIssueTypeId());
        IssueStatus issueStatus = null;
        if (issue2 != null) {
            issueCreateSource = issue2.getSource();
        } else {
            issueCreateSource = null;
        }
        WireServiceCenterCampaign wireCampaign = issue.getWireCampaign();
        if (wireCampaign != null) {
            z = !wireCampaign.getWirePriority().getPriority().canPassFailIssue();
        } else {
            z = false;
        }
        IssueStatus status = issue.getStatus();
        if (issue2 != null) {
            issueStatus = issue2.getStatus();
        }
        if (status == issueStatus && issue.getStatus() == IssueStatus.OPEN && issueCreateSource != null && !C42794ia2.m33794a(issueCreateSource) && z) {
            return true;
        }
        return false;
    }
}
