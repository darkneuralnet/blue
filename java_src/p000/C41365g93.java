package p000;

import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\r"}, m28432d2 = {"Lg93;", "", "Lco/bird/android/model/NonRepair;", "nonRepair", "Lco/bird/android/model/NonRepairReason;", "selectedNonRepairReason", "", "notes", "", "LH6;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNonRepairConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairConverter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 NonRepairConverter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairConverter\n*L\n15#1:29\n15#1:30,3\n*E\n"})
/* renamed from: g93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41365g93 {
    /* renamed from: a */
    public final List<C3023H6> m39965a(NonRepair nonRepair, NonRepairReason nonRepairReason, String str) {
        int collectionSizeOrDefault;
        List mutableList;
        boolean z;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
        C2637G6 c2637g6 = new C2637G6(nonRepair, C32634Ej4.item_non_repair, false, 4, null);
        List<NonRepairReason> reasons = nonRepair.getReasons();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(reasons, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (NonRepairReason nonRepairReason2 : reasons) {
            arrayList.add(new C2637G6(NonRepairReason.copy$default(nonRepairReason2, null, null, Intrinsics.areEqual(nonRepairReason2, nonRepairReason), false, null, 27, null), C32634Ej4.item_non_repair_reason, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, c2637g6, new C2637G6(str, C32634Ej4.item_non_repair_notes, false, 4, null));
        if (nonRepairReason != null) {
            z = nonRepairReason.getAllowNote();
        } else {
            z = false;
        }
        c3023h6.m104406g(z);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
        return listOf;
    }
}
