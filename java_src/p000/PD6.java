package p000;

import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J,\u0010\u000e\u001a\u00020\b2\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0002¨\u0006\u0011"}, m28432d2 = {"LPD6;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "", "Lco/bird/android/model/Issue;", "old", "new", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionAdapterDiff.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n18#2:45\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n18#2:73\n18#2:85\n9#3,4:46\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n9#3,4:74\n9#3,4:86\n1549#4:70\n1620#4,2:71\n1622#4:78\n1620#4,3:79\n1549#4:82\n1620#4,2:83\n1622#4:90\n1549#4:91\n1620#4,3:92\n1549#4:95\n1620#4,3:96\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionAdapterDiff.kt\nco/bird/android/feature/workorders/inspection/adapters/WorkOrderInspectionAdapterDiff\n*L\n14#1:45\n23#1:50\n24#1:55\n28#1:60\n29#1:65\n31#1:73\n32#1:85\n14#1:46,4\n23#1:51,4\n24#1:56,4\n28#1:61,4\n29#1:66,4\n31#1:74,4\n32#1:86,4\n31#1:70\n31#1:71,2\n31#1:78\n31#1:79,3\n32#1:82\n32#1:83,2\n32#1:90\n32#1:91\n32#1:92,3\n41#1:95\n41#1:96,3\n*E\n"})
/* renamed from: PD6 */
/* loaded from: classes3.dex */
public final class PD6 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        Issue issue;
        String issueTypeId;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C37080Xj4.item_inspection_issue_type) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair == null || (issue = (Issue) pair.getFirst()) == null || (issueTypeId = issue.getIssueTypeId()) == null) {
                return "";
            }
            return issueTypeId;
        } else if (m105817b != C45268mk4.item_button_matte_black) {
            return "";
        } else {
            return "Complete";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        ArrayList arrayList;
        ArrayList arrayList2;
        IssueStatus issueStatus;
        Issue m103699g;
        Issue m103699g2;
        C3023H6 m103698h;
        List<C2637G6> m104408e;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Issue issue;
        C3023H6 m103698h2;
        List<C2637G6> m104408e2;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        Issue issue2;
        Boolean bool;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        int m105817b = oldItem.m105817b();
        Object obj = null;
        if (m105817b == C45268mk4.item_button_matte_black) {
            Object m105816c = oldItem.m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof Pair)) {
                m105816c2 = null;
            }
            Pair pair2 = (Pair) m105816c2;
            if (pair != null) {
                bool = (Boolean) pair.getSecond();
            } else {
                bool = null;
            }
            if (pair2 != null) {
                obj = (Boolean) pair2.getSecond();
            }
            if (!Intrinsics.areEqual(bool, obj)) {
                return true;
            }
        } else if (m105817b == C37080Xj4.item_inspection_issue_type) {
            Object m105816c3 = oldItem.m105816c();
            if (!(m105816c3 instanceof C33253Ha2)) {
                m105816c3 = null;
            }
            C33253Ha2 c33253Ha2 = (C33253Ha2) m105816c3;
            Object m105816c4 = newItem.m105816c();
            if (!(m105816c4 instanceof C33253Ha2)) {
                m105816c4 = null;
            }
            C33253Ha2 c33253Ha22 = (C33253Ha2) m105816c4;
            if (c33253Ha2 != null && (m103698h2 = c33253Ha2.m103698h()) != null && (m104408e2 = m103698h2.m104408e()) != null) {
                List<C2637G6> list = m104408e2;
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList<Pair> arrayList3 = new ArrayList(collectionSizeOrDefault3);
                for (C2637G6 c2637g6 : list) {
                    Object m105816c5 = c2637g6.m105816c();
                    if (!(m105816c5 instanceof Pair)) {
                        m105816c5 = null;
                    }
                    arrayList3.add((Pair) m105816c5);
                }
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                arrayList = new ArrayList(collectionSizeOrDefault4);
                for (Pair pair3 : arrayList3) {
                    if (pair3 != null) {
                        issue2 = (Issue) pair3.getFirst();
                    } else {
                        issue2 = null;
                    }
                    arrayList.add(issue2);
                }
            } else {
                arrayList = null;
            }
            if (c33253Ha22 != null && (m103698h = c33253Ha22.m103698h()) != null && (m104408e = m103698h.m104408e()) != null) {
                List<C2637G6> list2 = m104408e;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList<Pair> arrayList4 = new ArrayList(collectionSizeOrDefault);
                for (C2637G6 c2637g62 : list2) {
                    Object m105816c6 = c2637g62.m105816c();
                    if (!(m105816c6 instanceof Pair)) {
                        m105816c6 = null;
                    }
                    arrayList4.add((Pair) m105816c6);
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (Pair pair4 : arrayList4) {
                    if (pair4 != null) {
                        issue = (Issue) pair4.getFirst();
                    } else {
                        issue = null;
                    }
                    arrayList2.add(issue);
                }
            } else {
                arrayList2 = null;
            }
            if (c33253Ha2 != null && (m103699g2 = c33253Ha2.m103699g()) != null) {
                issueStatus = m103699g2.getStatus();
            } else {
                issueStatus = null;
            }
            if (c33253Ha22 != null && (m103699g = c33253Ha22.m103699g()) != null) {
                obj = m103699g.getStatus();
            }
            if (issueStatus != obj || !m90565d(arrayList, arrayList2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m90565d(List<Issue> list, List<Issue> list2) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        IssueStatus issueStatus;
        int collectionSizeOrDefault2;
        IssueStatus issueStatus2;
        ArrayList arrayList2 = null;
        if (list != null) {
            List<Issue> list3 = list;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            arrayList = new ArrayList(collectionSizeOrDefault2);
            for (Issue issue : list3) {
                if (issue != null) {
                    issueStatus2 = issue.getStatus();
                } else {
                    issueStatus2 = null;
                }
                arrayList.add(issueStatus2);
            }
        } else {
            arrayList = null;
        }
        if (list2 != null) {
            List<Issue> list4 = list2;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (Issue issue2 : list4) {
                if (issue2 != null) {
                    issueStatus = issue2.getStatus();
                } else {
                    issueStatus = null;
                }
                arrayList3.add(issueStatus);
            }
            arrayList2 = arrayList3;
        }
        return Intrinsics.areEqual(arrayList, arrayList2);
    }
}
