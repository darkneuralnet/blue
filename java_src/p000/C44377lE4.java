package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.Repair;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.wire.WireQuickLink;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJB\u0010\u0013\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002J6\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LlE4;", "", "Lco/bird/android/model/RepairCategory;", "category", "", "Lco/bird/android/model/RepairIssue;", "issues", "", "", "selectedRepairs", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepair;", "nonRepairs", "Lco/bird/android/model/wire/WireQuickLink;", "trainingGuide", "LH6;", C17296a.f69688o, "issue", "b", "c", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3IssueConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueConverter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1549#2:143\n1620#2,3:144\n1549#2:149\n1620#2,3:150\n1549#2:153\n1620#2,2:154\n1549#2:156\n1620#2,2:157\n288#2,2:159\n1622#2:161\n1622#2:162\n1747#2,3:163\n1549#2:166\n1620#2,2:167\n1549#2:169\n1620#2,2:170\n288#2,2:172\n1622#2:174\n1622#2:175\n37#3,2:147\n1#4:176\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueConverter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueConverter\n*L\n30#1:143\n30#1:144,3\n50#1:149\n50#1:150,3\n59#1:153\n59#1:154,2\n61#1:156\n61#1:157,2\n62#1:159,2\n61#1:161\n59#1:162\n76#1:163,3\n118#1:166\n118#1:167,2\n120#1:169\n120#1:170,2\n121#1:172,2\n120#1:174\n118#1:175\n30#1:147,2\n*E\n"})
/* renamed from: lE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44377lE4 {

    /* renamed from: a */
    public final Context f95755a;

    public C44377lE4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f95755a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m27642a(RepairCategory repairCategory, List<RepairIssue> issues, Set<String> selectedRepairs, Map<String, Optional<NonRepair>> nonRepairs, WireQuickLink wireQuickLink) {
        int collectionSizeOrDefault;
        C3023H6 c3023h6;
        List<C3023H6> listOfNotNull;
        List<C3023H6> listOfNotNull2;
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        Intrinsics.checkNotNullParameter(nonRepairs, "nonRepairs");
        List<RepairIssue> list = issues;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RepairIssue repairIssue : list) {
            arrayList.add(m27641b(repairCategory, repairIssue, selectedRepairs, nonRepairs));
        }
        C3023H6[] c3023h6Arr = (C3023H6[]) arrayList.toArray(new C3023H6[0]);
        if (wireQuickLink != null) {
            c3023h6 = m27640c(wireQuickLink, repairCategory, nonRepairs);
        } else {
            c3023h6 = null;
        }
        if (repairCategory != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(c3023h6);
            spreadBuilder.addSpread(c3023h6Arr);
            listOfNotNull2 = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
            return listOfNotNull2;
        }
        SpreadBuilder spreadBuilder2 = new SpreadBuilder(2);
        spreadBuilder2.addSpread(c3023h6Arr);
        spreadBuilder2.add(c3023h6);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder2.toArray(new C3023H6[spreadBuilder2.size()]));
        return listOfNotNull;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01dd, code lost:
        if ((r1 != null ? r1.m59035e() : null) != null) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3023H6 m27641b(RepairCategory repairCategory, RepairIssue repairIssue, Set<String> set, Map<String, Optional<NonRepair>> map) {
        int collectionSizeOrDefault;
        List mutableList;
        int collectionSizeOrDefault2;
        Drawable drawable;
        List mutableList2;
        List listOf;
        Object[] objArr;
        Object[] objArr2;
        NonRepair m59035e;
        ColorStateList m94300d;
        int m94301c;
        List mutableListOf;
        int collectionSizeOrDefault3;
        NonRepair copy;
        NonRepair m59035e2;
        String str;
        NonRepair m59035e3;
        List<NonRepairReason> reasons;
        Object obj;
        NonRepair m59035e4;
        C2637G6 c2637g6 = new C2637G6(null, C32634Ej4.item_repair_v3_repair_instructions, false, 4, null);
        List<Repair> repairs = repairIssue.getRepairs();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(repairs, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = repairs.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Repair repair = (Repair) it.next();
            boolean contains = set.contains(repair.getId());
            if ((set.contains(repair.getId()) && repair.getPartKind() != null) || !repair.getMutable()) {
                z = false;
            }
            arrayList.add(new C2637G6(new IF4(repair, contains, z), C32634Ej4.item_repair_v3, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        List<NonRepair> nonRepairs = repairIssue.getNonRepairs();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(nonRepairs, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator<T> it2 = nonRepairs.iterator();
        while (true) {
            drawable = null;
            r12 = null;
            String str2 = null;
            drawable = null;
            if (!it2.hasNext()) {
                break;
            }
            NonRepair nonRepair = (NonRepair) it2.next();
            Optional<NonRepair> optional = map.get(repairIssue.getId());
            boolean areEqual = Intrinsics.areEqual((optional == null || (m59035e4 = optional.m59035e()) == null) ? null : m59035e4.getStatus(), nonRepair.getStatus());
            List<NonRepairReason> reasons2 = nonRepair.getReasons();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(reasons2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
            for (NonRepairReason nonRepairReason : reasons2) {
                String reason = nonRepairReason.getReason();
                Optional<NonRepair> optional2 = map.get(repairIssue.getId());
                if (optional2 != null && (m59035e3 = optional2.m59035e()) != null && (reasons = m59035e3.getReasons()) != null) {
                    Iterator<T> it3 = reasons.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        if (((NonRepairReason) obj).getSelected()) {
                            break;
                        }
                    }
                    NonRepairReason nonRepairReason2 = (NonRepairReason) obj;
                    if (nonRepairReason2 != null) {
                        str = nonRepairReason2.getReason();
                        arrayList3.add(NonRepairReason.copy$default(nonRepairReason, null, null, Intrinsics.areEqual(reason, str), false, null, 27, null));
                    }
                }
                str = null;
                arrayList3.add(NonRepairReason.copy$default(nonRepairReason, null, null, Intrinsics.areEqual(reason, str), false, null, 27, null));
            }
            Optional<NonRepair> optional3 = map.get(repairIssue.getId());
            if (optional3 != null && (m59035e2 = optional3.m59035e()) != null) {
                str2 = m59035e2.getNotes();
            }
            copy = nonRepair.copy((r18 & 1) != 0 ? nonRepair.display : null, (r18 & 2) != 0 ? nonRepair.description : null, (r18 & 4) != 0 ? nonRepair.status : null, (r18 & 8) != 0 ? nonRepair.allowRepairs : false, (r18 & 16) != 0 ? nonRepair.selected : areEqual, (r18 & 32) != 0 ? nonRepair.notes : str2, (r18 & 64) != 0 ? nonRepair.reasons : arrayList3, (r18 & 128) != 0 ? nonRepair.notificationOnly : false);
            arrayList2.add(new C2637G6(copy, C32634Ej4.item_repair_v3_issue_non_repair, false, 4, null));
        }
        mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{new C3023H6(mutableList, c2637g6, null, 4, null), new C3023H6(mutableList2, null, null, 6, null)});
        List<Repair> repairs2 = repairIssue.getRepairs();
        if (!(repairs2 instanceof Collection) || !repairs2.isEmpty()) {
            for (Repair repair2 : repairs2) {
                if (set.contains(repair2.getId())) {
                    objArr = 1;
                    break;
                }
            }
        }
        objArr = null;
        if (objArr != null) {
            Optional<NonRepair> optional4 = map.get(repairIssue.getId());
        }
        Optional<NonRepair> optional5 = map.get(repairIssue.getId());
        if (((optional5 == null || (m59035e = optional5.m59035e()) == null || m59035e.getAllowRepairs()) ? null : 1) == null) {
            objArr2 = null;
            if (objArr2 == null) {
                Drawable m94299e = NA0.m94299e(this.f95755a, C48193rg4.ic_check);
                if (m94299e != null) {
                    C42529i71.m34432a(m94299e, NA0.m94301c(this.f95755a, C32364Df4.birdGreen));
                    drawable = m94299e;
                }
                m94300d = NA0.m94300d(this.f95755a, C32364Df4.passedIssueGreen);
                m94301c = NA0.m94301c(this.f95755a, C32364Df4.birdGreen);
            } else if (repairCategory == null) {
                drawable = NA0.m94299e(this.f95755a, C48193rg4.ic_issue_triangle);
                m94300d = NA0.m94300d(this.f95755a, C32364Df4.failedIssueRed);
                m94301c = NA0.m94301c(this.f95755a, C32364Df4.birdRed);
            } else {
                m94300d = NA0.m94300d(this.f95755a, C32364Df4.birdLightGray);
                m94301c = NA0.m94301c(this.f95755a, C32364Df4.birdNewRoad);
            }
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new DA4(repairIssue, listOf, drawable, m94300d, m94301c), C32634Ej4.item_repair_v3_issue, false, 4, null));
            return new C3023H6(mutableListOf, null, null, 6, null);
        }
        objArr2 = 1;
        if (objArr2 == null) {
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new DA4(repairIssue, listOf, drawable, m94300d, m94301c), C32634Ej4.item_repair_v3_issue, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: c */
    public final C3023H6 m27640c(WireQuickLink wireQuickLink, RepairCategory repairCategory, Map<String, Optional<NonRepair>> map) {
        List mutableListOf;
        int collectionSizeOrDefault;
        List mutableList;
        String str;
        int collectionSizeOrDefault2;
        String str2;
        NonRepair copy;
        NonRepair m59035e;
        String str3;
        NonRepair m59035e2;
        List<NonRepairReason> reasons;
        Object obj;
        NonRepair m59035e3;
        C3023H6 c3023h6 = null;
        if (repairCategory != null && map != null) {
            List<NonRepair> nonRepairs = repairCategory.getNonRepairs();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(nonRepairs, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (NonRepair nonRepair : nonRepairs) {
                Optional<NonRepair> optional = map.get(repairCategory.getId());
                if (optional != null && (m59035e3 = optional.m59035e()) != null) {
                    str = m59035e3.getStatus();
                } else {
                    str = null;
                }
                boolean areEqual = Intrinsics.areEqual(str, nonRepair.getStatus());
                List<NonRepairReason> reasons2 = nonRepair.getReasons();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(reasons2, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (NonRepairReason nonRepairReason : reasons2) {
                    String reason = nonRepairReason.getReason();
                    Optional<NonRepair> optional2 = map.get(repairCategory.getId());
                    if (optional2 != null && (m59035e2 = optional2.m59035e()) != null && (reasons = m59035e2.getReasons()) != null) {
                        Iterator<T> it = reasons.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((NonRepairReason) obj).getSelected()) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        NonRepairReason nonRepairReason2 = (NonRepairReason) obj;
                        if (nonRepairReason2 != null) {
                            str3 = nonRepairReason2.getReason();
                            arrayList2.add(NonRepairReason.copy$default(nonRepairReason, null, null, Intrinsics.areEqual(reason, str3), false, null, 27, null));
                        }
                    }
                    str3 = null;
                    arrayList2.add(NonRepairReason.copy$default(nonRepairReason, null, null, Intrinsics.areEqual(reason, str3), false, null, 27, null));
                }
                Optional<NonRepair> optional3 = map.get(repairCategory.getId());
                if (optional3 != null && (m59035e = optional3.m59035e()) != null) {
                    str2 = m59035e.getNotes();
                } else {
                    str2 = null;
                }
                copy = nonRepair.copy((r18 & 1) != 0 ? nonRepair.display : null, (r18 & 2) != 0 ? nonRepair.description : null, (r18 & 4) != 0 ? nonRepair.status : null, (r18 & 8) != 0 ? nonRepair.allowRepairs : false, (r18 & 16) != 0 ? nonRepair.selected : areEqual, (r18 & 32) != 0 ? nonRepair.notes : str2, (r18 & 64) != 0 ? nonRepair.reasons : arrayList2, (r18 & 128) != 0 ? nonRepair.notificationOnly : false);
                arrayList.add(new C2637G6(copy, C32634Ej4.item_repair_v3_issue_non_repair, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            c3023h6 = new C3023H6(mutableList, null, null, 6, null);
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C46082o66(wireQuickLink, repairCategory, c3023h6), C32634Ej4.item_repair_training_guide, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
