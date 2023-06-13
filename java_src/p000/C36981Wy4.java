package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.constant.IssueStatusReason;
import co.bird.android.model.extension.IssueStatus_Kt;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LWy4;", "LUy4;", "Lco/bird/android/model/Issue;", "supertype", "", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairs", "Lco/bird/android/model/RepairType;", "repairTypes", "", "", "originalStatuses", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSubtypesConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesConverter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n766#2:118\n857#2,2:119\n1549#2:121\n1620#2,2:122\n766#2:124\n857#2,2:125\n766#2:127\n857#2,2:128\n1549#2:130\n1620#2,2:131\n288#2,2:133\n1622#2:135\n1747#2,3:136\n1549#2:139\n1620#2,3:140\n1549#2:143\n1620#2,3:144\n1622#2:147\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesConverter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesConverterImpl\n*L\n31#1:118\n31#1:119,2\n34#1:121\n34#1:122,2\n35#1:124\n35#1:125,2\n36#1:127\n36#1:128,2\n42#1:130\n42#1:131,2\n43#1:133,2\n42#1:135\n68#1:136,3\n96#1:139\n96#1:140,3\n97#1:143\n97#1:144,3\n34#1:147\n*E\n"})
/* renamed from: Wy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36981Wy4 implements InterfaceC36513Uy4 {

    /* renamed from: a */
    public final Context f42423a;

    public C36981Wy4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42423a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027c A[LOOP:6: B:101:0x0276->B:103:0x027c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029f A[LOOP:7: B:105:0x0299->B:107:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m77593c(Issue supertype, List list, List list2, Map map, C36981Wy4 this$0) {
        boolean z;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        IssueStatusReason issueStatusReason;
        List mutableList;
        boolean z2;
        boolean z3;
        IssueStatus issueStatus;
        IssueStatus issueStatus2;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        List minus;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean isBlank;
        List selectedRepairs = list;
        List repairTypes = list2;
        Map originalStatuses = map;
        Intrinsics.checkNotNullParameter(supertype, "$supertype");
        Intrinsics.checkNotNullParameter(selectedRepairs, "$selectedRepairs");
        Intrinsics.checkNotNullParameter(repairTypes, "$repairTypes");
        Intrinsics.checkNotNullParameter(originalStatuses, "$originalStatuses");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<Issue> arrayList = new ArrayList<>();
        Iterator<T> it = supertype.getSubtypes().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            ?? next = it.next();
            isBlank = StringsKt__StringsJVMKt.isBlank(((Issue) next).getId());
            if (true ^ isBlank) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = supertype.getSubtypes();
        }
        List<Issue> list3 = arrayList;
        int i = 10;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Issue issue = (Issue) it2.next();
            List<RepairTypeLock> list4 = selectedRepairs;
            ArrayList<RepairTypeLock> arrayList3 = new ArrayList();
            for (Object obj : list4) {
                if (Intrinsics.areEqual(((RepairTypeLock) obj).component1().getIssueTypeId(), issue.getIssueTypeId())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList<RepairType> arrayList4 = new ArrayList();
            for (Object obj2 : repairTypes) {
                if (Intrinsics.areEqual(((RepairType) obj2).getIssueTypeId(), issue.getIssueTypeId())) {
                    arrayList4.add(obj2);
                }
            }
            C2637G6 c2637g6 = new C2637G6(TuplesKt.m28425to(issue, Boolean.valueOf((issue.getStatus() == IssueStatus.ABANDONED || !(IssueStatus_Kt.isPassedStatus(issue.getStatus()) || (arrayList3.isEmpty() ^ z))) ? false : z)), C32634Ej4.item_repair_v2_subtype, false, 4, null);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, i);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
            Iterator it3 = arrayList4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                RepairType repairType = (RepairType) it3.next();
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    if (Intrinsics.areEqual(((RepairTypeLock) next2).component1().getId(), repairType.getId())) {
                        issueStatusReason = next2;
                        break;
                    }
                }
                RepairTypeLock repairTypeLock = (RepairTypeLock) issueStatusReason;
                boolean z7 = repairTypeLock != null;
                if (issue.getStatus() == IssueStatus.DISPUTED) {
                    z6 = false;
                    z4 = true;
                } else {
                    if (repairTypeLock != null) {
                        z4 = true;
                        if (repairTypeLock.getLocked()) {
                            z5 = true;
                            z6 = z5 ? z4 : false;
                        }
                    } else {
                        z4 = true;
                    }
                    z5 = false;
                    if (z5) {
                    }
                }
                arrayList5.add(new C2637G6(new TD4(repairType, z7, z6, z4), C32634Ej4.item_repair_v2_subtype_repair_type, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList5);
            Issue issue2 = (Issue) originalStatuses.get(issue.getIssueTypeId());
            boolean isEmpty = arrayList3.isEmpty();
            IssueStatus issueStatus3 = IssueStatus.DISPUTED;
            IssueStatus status = issue2 != null ? issue2.getStatus() : null;
            IssueStatusReason statusReason = issue2 != null ? issue2.getStatusReason() : null;
            Context context = this$0.f42423a;
            Iterator it5 = it2;
            String string = context.getString(C45871nl4.general_dot_item, context.getString(C45871nl4.repair_no_repair_needed));
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…repair_no_repair_needed))");
            ArrayList arrayList6 = arrayList2;
            mutableList.add(new C2637G6(new C52280ya2(issue, issueStatus3, status, statusReason, isEmpty, string), C32634Ej4.item_repair_v2_subtype_status, false, 4, null));
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (RepairTypeLock repairTypeLock2 : list4) {
                    RepairType component1 = repairTypeLock2.component1();
                    boolean component2 = repairTypeLock2.component2();
                    if (!Intrinsics.areEqual(component1.getIssueTypeId(), issue.getIssueTypeId()) || component2) {
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
            if (z3) {
                issueStatus = IssueStatus.RESOLVED;
            } else if ((issue2 != null ? issue2.getStatus() : null) != IssueStatus.CANT_REPAIR) {
                IssueStatus status2 = issue2 != null ? issue2.getStatus() : null;
                issueStatusReason = issue2 != null ? issue2.getStatusReason() : null;
                issueStatus2 = status2;
                IssueStatusReason issueStatusReason2 = issueStatusReason;
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault3);
                for (RepairType repairType2 : arrayList4) {
                    arrayList7.add(repairType2.getId());
                }
                i = 10;
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault4);
                for (RepairTypeLock repairTypeLock3 : arrayList3) {
                    arrayList8.add(repairTypeLock3.component1().getId());
                }
                minus = CollectionsKt___CollectionsKt.minus((Iterable) arrayList7, (Iterable) arrayList8);
                boolean isEmpty2 = minus.isEmpty();
                IssueStatus issueStatus4 = IssueStatus.CANT_REPAIR;
                Context context2 = this$0.f42423a;
                z = true;
                String string2 = context2.getString(C45871nl4.general_dot_item, context2.getString(C45871nl4.repair_cant_repair));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.gener…ring.repair_cant_repair))");
                mutableList.add(new C2637G6(new C52280ya2(issue, issueStatus4, issueStatus2, issueStatusReason2, !isEmpty2, string2), C32634Ej4.item_repair_v2_subtype_status, false, 4, null));
                arrayList6.add(new C3023H6(mutableList, c2637g6, null, 4, null));
                repairTypes = list2;
                originalStatuses = map;
                arrayList2 = arrayList6;
                it2 = it5;
                selectedRepairs = list;
            } else {
                issueStatus = IssueStatus.OPEN;
            }
            issueStatus2 = issueStatus;
            IssueStatusReason issueStatusReason22 = issueStatusReason;
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
            ArrayList arrayList72 = new ArrayList(collectionSizeOrDefault3);
            while (r2.hasNext()) {
            }
            i = 10;
            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
            ArrayList arrayList82 = new ArrayList(collectionSizeOrDefault4);
            while (r4.hasNext()) {
            }
            minus = CollectionsKt___CollectionsKt.minus((Iterable) arrayList72, (Iterable) arrayList82);
            boolean isEmpty22 = minus.isEmpty();
            IssueStatus issueStatus42 = IssueStatus.CANT_REPAIR;
            Context context22 = this$0.f42423a;
            z = true;
            String string22 = context22.getString(C45871nl4.general_dot_item, context22.getString(C45871nl4.repair_cant_repair));
            Intrinsics.checkNotNullExpressionValue(string22, "getString(L.string.gener…ring.repair_cant_repair))");
            mutableList.add(new C2637G6(new C52280ya2(issue, issueStatus42, issueStatus2, issueStatusReason22, !isEmpty22, string22), C32634Ej4.item_repair_v2_subtype_status, false, 4, null));
            arrayList6.add(new C3023H6(mutableList, c2637g6, null, 4, null));
            repairTypes = list2;
            originalStatuses = map;
            arrayList2 = arrayList6;
            it2 = it5;
            selectedRepairs = list;
        }
        return arrayList2;
    }

    @Override // p000.InterfaceC36513Uy4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo77595a(final Issue supertype, final List<RepairTypeLock> selectedRepairs, final List<RepairType> repairTypes, final Map<String, Issue> originalStatuses) {
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(originalStatuses, "originalStatuses");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Vy4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m77593c;
                m77593c = C36981Wy4.m77593c(Issue.this, selectedRepairs, repairTypes, originalStatuses, this);
                return m77593c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      // …Schedulers.computation())");
        return m33142Y;
    }
}
