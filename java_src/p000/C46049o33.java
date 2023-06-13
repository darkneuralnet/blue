package p000;

import co.bird.android.model.wire.WireFlagNestReason;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lo33;", "", "", "Lco/bird/android/model/wire/WireFlagNestReason;", "reasons", "selectedReason", "", "comment", "", "suggestedCapacity", "LH6;", C17296a.f69688o, "(Ljava/util/List;Lco/bird/android/model/wire/WireFlagNestReason;Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/List;", "<init>", "()V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlaggingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingConverter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,63:1\n1549#2:64\n1620#2,3:65\n37#3,2:68\n*S KotlinDebug\n*F\n+ 1 NestFlaggingConverter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingConverter\n*L\n18#1:64\n18#1:65,3\n59#1:68,2\n*E\n"})
/* renamed from: o33  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46049o33 {
    /* renamed from: a */
    public final List<C3023H6> m21922a(List<WireFlagNestReason> reasons, WireFlagNestReason wireFlagNestReason, String str, Integer num) {
        int collectionSizeOrDefault;
        List flatten;
        List mutableList;
        List mutableListOf;
        List<C3023H6> listOf;
        String str2;
        List mutableListOf2;
        String str3;
        C2637G6 c2637g6;
        List listOfNotNull;
        Integer num2;
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        List<WireFlagNestReason> list = reasons;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFlagNestReason wireFlagNestReason2 : list) {
            C2637G6[] c2637g6Arr = new C2637G6[1];
            String code = wireFlagNestReason2.getCode();
            if (wireFlagNestReason != null) {
                str2 = wireFlagNestReason.getCode();
            } else {
                str2 = null;
            }
            c2637g6Arr[0] = new C2637G6(TuplesKt.m28425to(wireFlagNestReason2, Boolean.valueOf(Intrinsics.areEqual(code, str2))), C47630qj4.item_flag_reason, false, 4, null);
            mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
            if (wireFlagNestReason != null) {
                str3 = wireFlagNestReason.getCode();
            } else {
                str3 = null;
            }
            if (Intrinsics.areEqual(str3, wireFlagNestReason2.getCode())) {
                if (wireFlagNestReason2.getRequiresComment()) {
                    c2637g6 = new C2637G6(str, C47630qj4.item_flag_comment, false, 4, null);
                } else if (Intrinsics.areEqual(wireFlagNestReason2.getCode(), WireFlagNestReason.INCORRECT_NEST_SIZE_CODE)) {
                    if (num == null) {
                        num2 = wireFlagNestReason2.getCurrentNestSize();
                    } else {
                        num2 = num;
                    }
                    c2637g6 = new C2637G6(TuplesKt.m28425to(num2, wireFlagNestReason2.getMaxAllowedNestSize()), C45268mk4.item_nest_size, false, 4, null);
                }
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(new C3023H6(mutableListOf2, null, c2637g6, 2, null));
                arrayList.add(listOfNotNull);
            }
            c2637g6 = null;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(new C3023H6(mutableListOf2, null, c2637g6, 2, null));
            arrayList.add(listOfNotNull);
        }
        flatten = CollectionsKt__IterablesKt.flatten(arrayList);
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) flatten);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C47630qj4.item_flag_header, false, 4, null));
        C3023H6 c3023h6 = new C3023H6(mutableListOf, null, null, 6, null);
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c3023h6);
        spreadBuilder.addSpread(mutableList.toArray(new C3023H6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOf;
    }
}
