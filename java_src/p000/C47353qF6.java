package p000;

import co.bird.android.model.IssueType;
import co.bird.android.model.IssueTypeLock;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, m28432d2 = {"LqF6;", "LoF6;", "", "category", "", "Lco/bird/android/model/IssueType;", "categoryIssues", "Lco/bird/android/model/IssueTypeLock;", "selectedIssues", "", "hideIssueDetails", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderIssuesConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesConverter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssuesConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,2:45\n288#2,2:47\n1747#2,3:49\n1747#2,3:52\n1622#2:55\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesConverter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssuesConverterImpl\n*L\n21#1:44\n21#1:45,2\n23#1:47,2\n24#1:49,3\n28#1:52,3\n21#1:55\n*E\n"})
/* renamed from: qF6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47353qF6 implements InterfaceC46167oF6 {
    /* renamed from: c */
    public static final List m17732c(List categoryIssues, List selectedIssues, boolean z, String category) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(categoryIssues, "$categoryIssues");
        Intrinsics.checkNotNullParameter(selectedIssues, "$selectedIssues");
        Intrinsics.checkNotNullParameter(category, "$category");
        List<IssueType> list = categoryIssues;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IssueType issueType : list) {
            List<IssueTypeLock> list2 = selectedIssues;
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((IssueTypeLock) obj).component1().getId(), issueType.getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            IssueTypeLock issueTypeLock = (IssueTypeLock) obj;
            boolean z6 = false;
            if (issueTypeLock != null) {
                z2 = issueTypeLock.getLocked();
            } else {
                z2 = false;
            }
            boolean z7 = list2 instanceof Collection;
            if (!z7 || !list2.isEmpty()) {
                for (IssueTypeLock issueTypeLock2 : list2) {
                    if (issueTypeLock2.getIssueType().isNoIssue() && Intrinsics.areEqual(issueTypeLock2.getIssueType().getCategory(), category)) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
            if ((!z4 && !z2) || issueType.isNoIssue()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z7 || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.areEqual(((IssueTypeLock) it2.next()).component1().getId(), issueType.getId())) {
                            z6 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(new C2637G6(new C32785Fa2(issueType, z, z5, z6), C37080Xj4.item_checkable_work_order_item, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    @Override // p000.InterfaceC46167oF6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo17734a(final String category, final List<IssueType> categoryIssues, final List<IssueTypeLock> selectedIssues, final boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(categoryIssues, "categoryIssues");
        Intrinsics.checkNotNullParameter(selectedIssues, "selectedIssues");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: pF6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m17732c;
                m17732c = C47353qF6.m17732c(categoryIssues, selectedIssues, z, category);
                return m17732c;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
