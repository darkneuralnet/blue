package p000;

import android.content.Context;
import android.text.Spannable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireFleet;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuOrderKt;
import co.bird.android.model.wire.WireSkuScannedItemsKt;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.android.model.wire.WireWarehouse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LlC5;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "wireSkuOrder", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "scannedItems", "", "outbound", "allowSkuScanning", "Lio/reactivex/F;", "LH6;", "b", "i", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuOrderDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderDetailsConverter.kt\nco/bird/android/feature/transferorder/sku/adapters/SkuOrderDetailsConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
/* renamed from: lC5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44360lC5 {

    /* renamed from: a */
    public final Context f95713a;

    public C44360lC5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f95713a = context;
    }

    /* renamed from: c */
    public static final List m27678c(C44360lC5 this$0, WireSkuOrder wireSkuOrder, List scannedItems, boolean z, boolean z2) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(wireSkuOrder, "$wireSkuOrder");
        Intrinsics.checkNotNullParameter(scannedItems, "$scannedItems");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m27672i(wireSkuOrder), this$0.m27677d(wireSkuOrder, scannedItems, z, z2), this$0.m27676e(wireSkuOrder), this$0.m27675f(wireSkuOrder, z), this$0.m27673h(wireSkuOrder), this$0.m27674g(wireSkuOrder)});
        return listOfNotNull;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m27679b(final WireSkuOrder wireSkuOrder, final List<WireSuccessfulScannedItem> scannedItems, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(wireSkuOrder, "wireSkuOrder");
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: kC5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m27678c;
                m27678c = C44360lC5.m27678c(C44360lC5.this, wireSkuOrder, scannedItems, z, z2);
                return m27678c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…eSkuOrder),\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m27677d(WireSkuOrder wireSkuOrder, List<WireSuccessfulScannedItem> list, boolean z, boolean z2) {
        int size;
        Integer valueOf;
        C2637G6 c2637g6;
        C2637G6 c2637g62;
        C2637G6 c2637g63;
        C2637G6 c2637g64;
        int i;
        List listOfNotNull;
        String commodityType;
        WireWarehouse destinationWarehouse;
        String name;
        WireWarehouse originWarehouse;
        String name2;
        WireFleet destinationFleet;
        String name3;
        WireFleet originFleet;
        String name4;
        String string = this.f95713a.getString(C45871nl4.sku_order_basic_info_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_order_basic_info_header)");
        C2637G6 c2637g65 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        if (z) {
            size = list.size();
        } else {
            size = WireSkuScannedItemsKt.inboundScans(list).size();
        }
        boolean z3 = true;
        boolean z4 = size == wireSkuOrder.getQuantity();
        if (z2 && z && !z4) {
            valueOf = Integer.valueOf(C45871nl4.sku_order_start_adding_label);
        } else {
            valueOf = (!z2 || z || z4) ? null : Integer.valueOf(C45871nl4.sku_order_start_scanning_label);
        }
        WireTransferOrderLineItem transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem();
        WireTransferOrder transferOrder = transferOrderLineItem != null ? transferOrderLineItem.getTransferOrder() : null;
        C2637G6[] c2637g6Arr = new C2637G6[9];
        if (transferOrderLineItem == null || (originFleet = transferOrderLineItem.getOriginFleet()) == null || (name4 = originFleet.getName()) == null) {
            c2637g6 = null;
        } else {
            int i2 = C35442Qj4.item_header_value;
            String string2 = this.f95713a.getString(C45871nl4.sku_order_origin_fleet_label);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…order_origin_fleet_label)");
            c2637g6 = new C2637G6(new C50079ur2(string2, name4), i2, false, 4, null);
        }
        c2637g6Arr[0] = c2637g6;
        if (transferOrderLineItem == null || (destinationFleet = transferOrderLineItem.getDestinationFleet()) == null || (name3 = destinationFleet.getName()) == null) {
            c2637g62 = null;
        } else {
            int i3 = C35442Qj4.item_header_value;
            String string3 = this.f95713a.getString(C45871nl4.sku_order_destination_fleet_label);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…_destination_fleet_label)");
            c2637g62 = new C2637G6(new C50079ur2(string3, name3), i3, false, 4, null);
        }
        c2637g6Arr[1] = c2637g62;
        if (transferOrder == null || (originWarehouse = transferOrder.getOriginWarehouse()) == null || (name2 = originWarehouse.getName()) == null) {
            c2637g63 = null;
        } else {
            int i4 = C35442Qj4.item_header_value;
            String string4 = this.f95713a.getString(C45871nl4.sku_order_origin_warehouse_label);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…r_origin_warehouse_label)");
            c2637g63 = new C2637G6(new C50079ur2(string4, name2), i4, false, 4, null);
        }
        c2637g6Arr[2] = c2637g63;
        if (transferOrder == null || (destinationWarehouse = transferOrder.getDestinationWarehouse()) == null || (name = destinationWarehouse.getName()) == null) {
            c2637g64 = null;
        } else {
            int i5 = C35442Qj4.item_header_value;
            String string5 = this.f95713a.getString(C45871nl4.sku_order_destination_warehouse_label);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.stri…tination_warehouse_label)");
            c2637g64 = new C2637G6(new C50079ur2(string5, name), i5, false, 4, null);
        }
        c2637g6Arr[3] = c2637g64;
        int i6 = C35442Qj4.item_header_value;
        String string6 = this.f95713a.getString(C45871nl4.sku_order_commodity_type_label);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.stri…der_commodity_type_label)");
        WireTransferOrderLineItem transferOrderLineItem2 = wireSkuOrder.getTransferOrderLineItem();
        c2637g6Arr[4] = new C2637G6(new C50079ur2(string6, (transferOrderLineItem2 == null || (commodityType = transferOrderLineItem2.getCommodityType()) == null || (r10 = C45097mS5.m25601e(commodityType)) == null) ? "" : ""), i6, false, 4, null);
        String string7 = this.f95713a.getString(C45871nl4.sku_order_commodity_label);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(L.stri…ku_order_commodity_label)");
        WireTransferOrderLineItem transferOrderLineItem3 = wireSkuOrder.getTransferOrderLineItem();
        c2637g6Arr[5] = new C2637G6(new C50079ur2(string7, (transferOrderLineItem3 == null || (r10 = WireSkuOrderKt.commodity(transferOrderLineItem3)) == null) ? "" : ""), i6, false, 4, null);
        String string8 = this.f95713a.getString(C45871nl4.sku_order_condition_label);
        Intrinsics.checkNotNullExpressionValue(string8, "context.getString(L.stri…ku_order_condition_label)");
        Context context = this.f95713a;
        WireTransferOrderLineItem transferOrderLineItem4 = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem4 == null || !transferOrderLineItem4.getUsedCondition()) {
            z3 = false;
        }
        if (z3) {
            i = C45871nl4.sku_order_condition_used;
        } else {
            i = C45871nl4.sku_order_condition_new;
        }
        String string9 = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string9, "context.getString(if (wi…ondition_new\n          })");
        c2637g6Arr[6] = new C2637G6(new C50079ur2(string8, string9), i6, false, 4, null);
        int i7 = C35442Qj4.item_header_spannable_status_cta;
        String string10 = this.f95713a.getString(C45871nl4.sku_order_quantity_header);
        Spannable m9049g = C50274vB0.m9049g(size, wireSkuOrder.getQuantity(), this.f95713a);
        String string11 = valueOf != null ? this.f95713a.getString(valueOf.intValue()) : null;
        Intrinsics.checkNotNullExpressionValue(string10, "getString(L.string.sku_order_quantity_header)");
        c2637g6Arr[7] = new C2637G6(new HH1(string11, string10, m9049g), i7, false, 4, null);
        c2637g6Arr[8] = new C2637G6(wireSkuOrder.getId(), C35442Qj4.item_vehicles_in_order, false, 4, null);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c2637g6Arr);
        return new C3023H6(C50274vB0.m9043m(listOfNotNull), c2637g65, null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m27676e(WireSkuOrder wireSkuOrder) {
        C2637G6 c2637g6;
        List listOfNotNull;
        String string = this.f95713a.getString(C45871nl4.sku_order_packing_info_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…rder_packing_info_header)");
        C2637G6 c2637g62 = new C2637G6(new C36626Vl0(string, true, true, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        C2637G6[] c2637g6Arr = new C2637G6[2];
        String packingType = WireSkuOrderKt.packingType(wireSkuOrder);
        C2637G6 c2637g63 = null;
        if (packingType != null) {
            int i = C35442Qj4.item_header_value;
            String string2 = this.f95713a.getString(C45871nl4.sku_order_package_type_label);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…order_package_type_label)");
            c2637g6 = new C2637G6(new C50079ur2(string2, packingType), i, false, 4, null);
        } else {
            c2637g6 = null;
        }
        c2637g6Arr[0] = c2637g6;
        Integer packagingQuantity = wireSkuOrder.getPackagingQuantity();
        if (packagingQuantity != null) {
            int intValue = packagingQuantity.intValue();
            int i2 = C35442Qj4.item_header_value;
            String string3 = this.f95713a.getString(C45871nl4.sku_order_package_quantity_label);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…r_package_quantity_label)");
            c2637g63 = new C2637G6(new C50079ur2(string3, String.valueOf(intValue)), i2, false, 4, null);
        }
        c2637g6Arr[1] = c2637g63;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c2637g6Arr);
        return new C3023H6(C50274vB0.m9043m(C50274vB0.m9044l(listOfNotNull)), c2637g62, null, 4, null);
    }

    /* renamed from: f */
    public final C3023H6 m27675f(WireSkuOrder wireSkuOrder, boolean z) {
        WireContainerOrder containerOrder = wireSkuOrder.getContainerOrder();
        if (containerOrder != null) {
            return C50274vB0.m9051e(containerOrder, this.f95713a, z, true);
        }
        return null;
    }

    /* renamed from: g */
    public final C3023H6 m27674g(WireSkuOrder wireSkuOrder) {
        List listOfNotNull;
        WireTransferOrder transferOrder;
        WireTransferOrderLineItem transferOrderLineItem;
        String string = this.f95713a.getString(C45871nl4.sku_order_purpose_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…sku_order_purpose_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, true, true, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        WireTransferOrderLineItem transferOrderLineItem2 = wireSkuOrder.getTransferOrderLineItem();
        C2637G6 c2637g62 = null;
        if (transferOrderLineItem2 != null && (transferOrder = transferOrderLineItem2.getTransferOrder()) != null && (transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem()) != null) {
            c2637g62 = C50274vB0.m9045k(transferOrderLineItem, this.f95713a, transferOrder);
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(c2637g62);
        return new C3023H6(C50274vB0.m9043m(C50274vB0.m9044l(listOfNotNull)), c2637g6, null, 4, null);
    }

    /* renamed from: h */
    public final C3023H6 m27673h(WireSkuOrder wireSkuOrder) {
        List listOfNotNull;
        String string = this.f95713a.getString(C45871nl4.sku_order_details_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…sku_order_details_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, true, true, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        WireContainerOrder containerOrder = wireSkuOrder.getContainerOrder();
        C2637G6 c2637g62 = null;
        if (containerOrder != null) {
            c2637g62 = C50274vB0.generateStatusItem$default(containerOrder, this.f95713a, null, 2, null);
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(c2637g62);
        return new C3023H6(C50274vB0.m9043m(C50274vB0.m9044l(listOfNotNull)), c2637g6, null, 4, null);
    }

    /* renamed from: i */
    public final C3023H6 m27672i(WireSkuOrder wireSkuOrder) {
        List mutableListOf;
        String string = this.f95713a.getString(C45871nl4.sku_order_status_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri….sku_order_status_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new HQ5(DC5.m110690a(wireSkuOrder.getStatus(), this.f95713a), C40788fB0.m41776f(this.f95713a, DC5.m110689b(wireSkuOrder.getStatus())), null, 4, null), C35442Qj4.item_sku_order_status, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }
}
