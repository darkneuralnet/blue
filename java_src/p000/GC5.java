package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
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
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, m28432d2 = {"LGC5;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "scannedItems", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuOrderVehiclesConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesConverter.kt\nco/bird/android/feature/transferorder/sku/vehicles/adapters/SkuOrderVehiclesConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1549#2:40\n1620#2,3:41\n*S KotlinDebug\n*F\n+ 1 SkuOrderVehiclesConverter.kt\nco/bird/android/feature/transferorder/sku/vehicles/adapters/SkuOrderVehiclesConverter\n*L\n19#1:40\n19#1:41,3\n*E\n"})
/* renamed from: GC5 */
/* loaded from: classes3.dex */
public final class GC5 {

    /* renamed from: a */
    public final Context f11136a;

    public GC5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11136a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m105648a(WireSkuOrder skuOrder, List<WireSuccessfulScannedItem> scannedItems) {
        int collectionSizeOrDefault;
        List mutableList;
        String str;
        List<C3023H6> listOf;
        WireTransferOrder transferOrder;
        Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        List<WireSuccessfulScannedItem> list = scannedItems;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireSuccessfulScannedItem wireSuccessfulScannedItem : list) {
            arrayList.add(new C2637G6(wireSuccessfulScannedItem, C35442Qj4.item_scrap_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        Context context = this.f11136a;
        int i = C45871nl4.scrap_order_vehicles_transfer_order_id;
        Object[] objArr = new Object[1];
        WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
            str = transferOrder.getId();
        } else {
            str = null;
        }
        objArr[0] = str;
        String string = context.getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…eItem?.transferOrder?.id)");
        int size = scannedItems.size();
        int quantity = skuOrder.getQuantity();
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(new C40575ep5(string, size + "/" + quantity), C35442Qj4.item_scrap_vehicles_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
