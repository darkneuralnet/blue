package p000;

import co.bird.android.model.persistence.ScrapOrderView;
import co.bird.android.model.persistence.nestedstructures.OrderItemViewDetail;
import co.bird.android.model.wire.WireOrderItemViewDetail;
import co.bird.android.model.wire.WireScrapOrderView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireScrapOrderView;", "Lco/bird/android/model/persistence/ScrapOrderView;", C17296a.f69688o, "Lco/bird/android/model/wire/WireOrderItemViewDetail;", "Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;", "b", "co.bird.android.repository.scrap-order-view"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderViewConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderViewConversion.kt\nco/bird/android/repository/scraporderview/converters/ScrapOrderViewConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 ScrapOrderViewConversion.kt\nco/bird/android/repository/scraporderview/converters/ScrapOrderViewConversionKt\n*L\n13#1:28\n13#1:29,3\n*E\n"})
/* renamed from: fp5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41168fp5 {
    /* renamed from: a */
    public static final ScrapOrderView m40788a(WireScrapOrderView wireScrapOrderView) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireScrapOrderView, "<this>");
        String orderId = wireScrapOrderView.getOrderId();
        String containerOrderId = wireScrapOrderView.getContainerOrderId();
        List<WireOrderItemViewDetail> details = wireScrapOrderView.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireOrderItemViewDetail wireOrderItemViewDetail : details) {
            arrayList.add(m40787b(wireOrderItemViewDetail));
        }
        return new ScrapOrderView(orderId, containerOrderId, arrayList, wireScrapOrderView.getQuantity(), wireScrapOrderView.getBolUploaded(), wireScrapOrderView.getBolStatusText(), C47311qB0.m17961f(wireScrapOrderView.getBolStatusColor()));
    }

    /* renamed from: b */
    public static final OrderItemViewDetail m40787b(WireOrderItemViewDetail wireOrderItemViewDetail) {
        Intrinsics.checkNotNullParameter(wireOrderItemViewDetail, "<this>");
        return new OrderItemViewDetail(wireOrderItemViewDetail.getDetail(), wireOrderItemViewDetail.getColor());
    }
}
