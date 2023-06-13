package p000;

import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
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
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LdD4;", "LbD4;", "", "Lco/bird/android/model/RepairType;", "repairTypes", "Lco/bird/android/model/RepairTypeLock;", "previouslySelectedRepairTypes", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSelectionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionConverter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1549#2:39\n1620#2,2:40\n288#2,2:42\n1747#2,3:44\n1622#2:47\n*S KotlinDebug\n*F\n+ 1 RepairSelectionConverter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionConverterImpl\n*L\n22#1:39\n22#1:40,2\n23#1:42,2\n28#1:44,3\n22#1:47\n*E\n"})
/* renamed from: dD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39625dD4 implements InterfaceC38421bD4 {
    /* renamed from: c */
    public static final List m44522c(List repairTypes, List previouslySelectedRepairTypes) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(repairTypes, "$repairTypes");
        Intrinsics.checkNotNullParameter(previouslySelectedRepairTypes, "$previouslySelectedRepairTypes");
        List<RepairType> list = repairTypes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RepairType repairType : list) {
            List list2 = previouslySelectedRepairTypes;
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((RepairTypeLock) obj).component1().getId(), repairType.getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RepairTypeLock repairTypeLock = (RepairTypeLock) obj;
            boolean z2 = false;
            if (repairTypeLock != null) {
                z = repairTypeLock.getLocked();
            } else {
                z = false;
            }
            boolean z3 = !z;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.areEqual(((RepairTypeLock) it2.next()).component1().getId(), repairType.getId())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(new C2637G6(new C50287vC4(repairType, z2, z3), C32634Ej4.item_checkable_repair_item, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    @Override // p000.InterfaceC38421bD4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo44524a(final List<RepairType> repairTypes, final List<RepairTypeLock> previouslySelectedRepairTypes) {
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(previouslySelectedRepairTypes, "previouslySelectedRepairTypes");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: cD4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m44522c;
                m44522c = C39625dD4.m44522c(repairTypes, previouslySelectedRepairTypes);
                return m44522c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
