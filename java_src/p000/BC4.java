package p000;

import co.bird.android.model.IssueType;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016¨\u0006\u000e"}, m28432d2 = {"LBC4;", "LzC4;", "", "Lco/bird/android/model/IssueType;", "issueTypes", "Lco/bird/android/model/RepairType;", "repairTypes", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairTypes", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSearchConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchConverter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,2:45\n223#2,2:47\n1747#2,3:49\n288#2,2:52\n288#2,2:54\n1622#2:56\n*S KotlinDebug\n*F\n+ 1 RepairSearchConverter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchConverterImpl\n*L\n22#1:44\n22#1:45,2\n25#1:47,2\n26#1:49,3\n27#1:52,2\n30#1:54,2\n22#1:56\n*E\n"})
/* renamed from: BC4 */
/* loaded from: classes3.dex */
public final class BC4 implements InterfaceC52659zC4 {
    /* renamed from: c */
    public static final List m114217c(List repairTypes, List issueTypes, List selectedRepairTypes) {
        int collectionSizeOrDefault;
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        String str;
        RepairType copy;
        boolean z3;
        RepairType repairType;
        Intrinsics.checkNotNullParameter(repairTypes, "$repairTypes");
        Intrinsics.checkNotNullParameter(issueTypes, "$issueTypes");
        Intrinsics.checkNotNullParameter(selectedRepairTypes, "$selectedRepairTypes");
        List<RepairType> list = repairTypes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RepairType repairType2 : list) {
            Iterator it = issueTypes.iterator();
            while (it.hasNext()) {
                IssueType issueType = (IssueType) it.next();
                if (Intrinsics.areEqual(issueType.getId(), repairType2.getIssueTypeId())) {
                    List<RepairTypeLock> list2 = selectedRepairTypes;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (RepairTypeLock repairTypeLock : list2) {
                            if (Intrinsics.areEqual(repairTypeLock.getRepairType().getId(), repairType2.getId())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (Intrinsics.areEqual(((RepairTypeLock) obj).getRepairType().getId(), repairType2.getId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    RepairTypeLock repairTypeLock2 = (RepairTypeLock) obj;
                    if (repairTypeLock2 != null && repairTypeLock2.getLocked()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    HF4 hf4 = new HF4(repairType2, issueType, z, !z2);
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (Intrinsics.areEqual(((RepairTypeLock) obj2).component1().getId(), repairType2.getId())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    RepairTypeLock repairTypeLock3 = (RepairTypeLock) obj2;
                    C2637G6 c2637g6 = new C2637G6(hf4, C32634Ej4.item_checkable_repair_item, false, 4, null);
                    if (repairTypeLock3 != null && (repairType = repairTypeLock3.getRepairType()) != null) {
                        str = repairType.getNotes();
                    } else {
                        str = null;
                    }
                    copy = repairType2.copy((r22 & 1) != 0 ? repairType2.f66624id : null, (r22 & 2) != 0 ? repairType2.issueTypeId : null, (r22 & 4) != 0 ? repairType2.display : null, (r22 & 8) != 0 ? repairType2.description : null, (r22 & 16) != 0 ? repairType2.requireNotes : false, (r22 & 32) != 0 ? repairType2.repairScopes : null, (r22 & 64) != 0 ? repairType2.assetId : null, (r22 & 128) != 0 ? repairType2.partKind : null, (r22 & 256) != 0 ? repairType2.idToolDisplay : null, (r22 & 512) != 0 ? repairType2.notes : str);
                    C3023H6 c3023h6 = new C3023H6(new ArrayList(), c2637g6, new C2637G6(copy, C32634Ej4.item_repair_text_box, false, 4, null));
                    if (hf4.mo3250a() && hf4.m104097e().getRequireNotes()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c3023h6.m104406g(z3);
                    arrayList.add(c3023h6);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return arrayList;
    }

    @Override // p000.InterfaceC52659zC4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo1672a(final List<IssueType> issueTypes, final List<RepairType> repairTypes, final List<RepairTypeLock> selectedRepairTypes) {
        Intrinsics.checkNotNullParameter(issueTypes, "issueTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(selectedRepairTypes, "selectedRepairTypes");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: AC4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m114217c;
                m114217c = BC4.m114217c(repairTypes, issueTypes, selectedRepairTypes);
                return m114217c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      rep…Schedulers.computation())");
        return m33142Y;
    }
}
