package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\r"}, m28432d2 = {"Lw7;", "Lu7;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "Lco/bird/android/model/LegacyRepairType;", "repairTypes", "checkedRepairTypes", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddRepairConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairConverter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1549#2:65\n1620#2,3:66\n1549#2:69\n1620#2,3:70\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 AddRepairConverter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairConverterImpl\n*L\n43#1:65\n43#1:66,3\n46#1:69\n46#1:70,3\n48#1:73\n48#1:74,3\n*E\n"})
/* renamed from: w7 */
/* loaded from: classes3.dex */
public final class C29782w7 implements InterfaceC29058u7 {
    /* renamed from: c */
    public static final List m7393c(WireBird bird, List checkedRepairTypes, List repairTypes) {
        int collectionSizeOrDefault;
        Set set;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        List mutableList;
        List listOf;
        C2637G6 c2637g6;
        Intrinsics.checkNotNullParameter(bird, "$bird");
        Intrinsics.checkNotNullParameter(checkedRepairTypes, "$checkedRepairTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "$repairTypes");
        C2637G6 c2637g62 = new C2637G6(bird, C34740Nj4.view_repair_logger_search, false, 4, null);
        List<LegacyRepairType> list = checkedRepairTypes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (LegacyRepairType legacyRepairType : list) {
            arrayList.add(legacyRepairType.getKey());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        List<LegacyRepairType> list2 = repairTypes;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList<SD4> arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (LegacyRepairType legacyRepairType2 : list2) {
            arrayList2.add(new SD4(legacyRepairType2, set.contains(legacyRepairType2.getKey())));
        }
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (SD4 sd4 : arrayList2) {
            if (sd4.m85828b() == null) {
                c2637g6 = new C2637G6(sd4, C34740Nj4.view_repair_logger_add_repair, false, 4, null);
            } else {
                c2637g6 = new C2637G6(sd4, C34740Nj4.view_repair_logger_add_sub_repair, false, 4, null);
            }
            arrayList3.add(c2637g6);
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, c2637g62, null, 4, null));
        return listOf;
    }

    @Override // p000.InterfaceC29058u7
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo7395a(final WireBird bird, final List<LegacyRepairType> repairTypes, final List<LegacyRepairType> checkedRepairTypes) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(checkedRepairTypes, "checkedRepairTypes");
        AbstractC23442F<List<C3023H6>> m33152N = AbstractC23442F.m33161E(new Callable() { // from class: v7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m7393c;
                m7393c = C29782w7.m7393c(WireBird.this, checkedRepairTypes, repairTypes);
                return m7393c;
            }
        }).m33142Y(C24542a.m31934a()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "fromCallable {\n      val…dSchedulers.mainThread())");
        return m33152N;
    }
}
