package p000;

import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¨\u0006\f"}, m28432d2 = {"Lw93;", "", "Lco/bird/android/model/NonRepair;", "nonRepair", "Lco/bird/android/model/NonRepairReason;", "selectedReason", "selectedSubreason", "", "LH6;", C17296a.f69688o, "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNonRepairSurveyConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyConverter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,48:1\n1360#2:49\n1446#2,2:50\n1559#2:52\n1590#2,4:53\n1448#2,3:59\n37#3,2:57\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyConverter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyConverter\n*L\n16#1:49\n16#1:50,2\n23#1:52\n23#1:53,4\n16#1:59,3\n34#1:57,2\n*E\n"})
/* renamed from: w93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50851w93 {
    /* renamed from: a */
    public final List<C3023H6> m7350a(NonRepair nonRepair, NonRepairReason nonRepairReason, NonRepairReason nonRepairReason2) {
        List mutableList;
        List<C3023H6> listOf;
        String str;
        Collection emptyList;
        List listOf2;
        int collectionSizeOrDefault;
        boolean z;
        Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
        ArrayList arrayList = new ArrayList();
        for (NonRepairReason nonRepairReason3 : nonRepair.getReasons()) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            String reason = nonRepairReason3.getReason();
            if (nonRepairReason != null) {
                str = nonRepairReason.getReason();
            } else {
                str = null;
            }
            spreadBuilder.add(new C2637G6(TuplesKt.m28425to(nonRepairReason3, Boolean.valueOf(Intrinsics.areEqual(reason, str))), C32634Ej4.item_non_repair_survey_reason, false, 4, null));
            if (Intrinsics.areEqual(nonRepairReason3, nonRepairReason)) {
                List<NonRepairReason> subreasons = nonRepairReason3.getSubreasons();
                if (subreasons != null) {
                    List<NonRepairReason> list = subreasons;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    emptyList = new ArrayList(collectionSizeOrDefault);
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        NonRepairReason nonRepairReason4 = (NonRepairReason) obj;
                        if (nonRepairReason2 != null) {
                            z = Intrinsics.areEqual(nonRepairReason4.getReason(), nonRepairReason2.getReason());
                        } else if (Intrinsics.areEqual(nonRepairReason3, nonRepairReason) && i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        emptyList.add(new C2637G6(TuplesKt.m28425to(nonRepairReason4, Boolean.valueOf(z)), C32634Ej4.item_non_repair_survey_subreason, false, 4, null));
                        i = i2;
                    }
                } else {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            spreadBuilder.addSpread(emptyList.toArray(new C2637G6[0]));
            listOf2 = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf2);
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(nonRepair, C32634Ej4.item_non_repair_survey_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
