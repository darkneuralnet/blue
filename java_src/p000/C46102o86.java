package p000;

import co.bird.android.model.wire.WireTransferOrderFilter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, m28432d2 = {"Lo86;", "", "", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "filters", "selected", "LH6;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderLandingFiltersConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingFiltersConverter.kt\nco/bird/android/feature/transferorder/landing/filters/adapters/TransferOrderLandingFiltersConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1549#2:22\n1620#2,3:23\n1#3:26\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingFiltersConverter.kt\nco/bird/android/feature/transferorder/landing/filters/adapters/TransferOrderLandingFiltersConverter\n*L\n11#1:22\n11#1:23,3\n*E\n"})
/* renamed from: o86  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46102o86 {
    /* renamed from: a */
    public final List<C3023H6> m21725a(List<WireTransferOrderFilter> filters, List<WireTransferOrderFilter> selected) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selected, "selected");
        List<WireTransferOrderFilter> list = filters;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireTransferOrderFilter wireTransferOrderFilter : list) {
            arrayList.add(new C2637G6(TuplesKt.m28425to(wireTransferOrderFilter, Boolean.valueOf(selected.contains(wireTransferOrderFilter))), C35442Qj4.item_order_item_filter, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }
}
