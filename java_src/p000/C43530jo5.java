package p000;

import co.bird.android.model.persistence.ScrapOrderView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\r"}, m28432d2 = {"Ljo5;", "", "", "Lco/bird/android/model/persistence/ScrapOrderView;", "scrapOrders", "", "scannedCount", "LH6;", C17296a.f69688o, "c", "b", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderOverviewConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderOverviewConverter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1549#3:38\n1620#3,3:39\n*S KotlinDebug\n*F\n+ 1 ScrapOrderOverviewConverter.kt\nco/bird/android/feature/transferorder/scrap/overview/adapters/ScrapOrderOverviewConverter\n*L\n26#1:38\n26#1:39,3\n*E\n"})
/* renamed from: jo5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43530jo5 {
    /* renamed from: a */
    public final List<C3023H6> m29896a(List<ScrapOrderView> scrapOrders, int i) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(scrapOrders, "scrapOrders");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m29894c(i), m29895b(scrapOrders)});
        return listOfNotNull;
    }

    /* renamed from: b */
    public final C3023H6 m29895b(List<ScrapOrderView> list) {
        int collectionSizeOrDefault;
        List mutableList;
        List<ScrapOrderView> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ScrapOrderView scrapOrderView : list2) {
            arrayList.add(new C2637G6(scrapOrderView, C35442Qj4.item_scrap_order_details, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: c */
    public final C3023H6 m29894c(int i) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(Integer.valueOf(i), C35442Qj4.item_scrap_order_overview_vehicle_count, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
