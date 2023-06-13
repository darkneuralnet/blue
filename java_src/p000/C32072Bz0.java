package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireContainerOrderKt;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuOrderKt;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LBz0;", "", "Lco/bird/android/model/wire/WireContainerOrder;", "wireContainerOrder", "", "allowUpdateStatus", "outbound", "Lio/reactivex/F;", "", "LH6;", "b", "h", "g", DateTokenConverter.CONVERTER_KEY, "f", "e", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContainerOrderDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContainerOrderDetailsConverter.kt\nco/bird/android/feature/transferorder/container/adapters/ContainerOrderDetailsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1726#2,3:203\n1855#2:206\n1856#2:208\n1603#2,9:209\n1855#2:218\n1856#2:220\n1612#2:221\n1#3:207\n1#3:219\n*S KotlinDebug\n*F\n+ 1 ContainerOrderDetailsConverter.kt\nco/bird/android/feature/transferorder/container/adapters/ContainerOrderDetailsConverter\n*L\n52#1:203,3\n172#1:206\n172#1:208\n175#1:209,9\n175#1:218\n175#1:220\n175#1:221\n175#1:219\n*E\n"})
/* renamed from: Bz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32072Bz0 {

    /* renamed from: a */
    public final Context f3189a;

    public C32072Bz0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3189a = context;
    }

    /* renamed from: c */
    public static final List m113158c(C32072Bz0 this$0, WireContainerOrder wireContainerOrder, boolean z, boolean z2) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(wireContainerOrder, "$wireContainerOrder");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m113153h(wireContainerOrder, z, z2), this$0.m113154g(wireContainerOrder), C50274vB0.m9051e(wireContainerOrder, this$0.f3189a, z2, true), this$0.m113157d(wireContainerOrder), this$0.m113155f(wireContainerOrder), this$0.m113156e(wireContainerOrder)});
        return listOfNotNull;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m113159b(final WireContainerOrder wireContainerOrder, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(wireContainerOrder, "wireContainerOrder");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Az0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m113158c;
                m113158c = C32072Bz0.m113158c(C32072Bz0.this, wireContainerOrder, z, z2);
                return m113158c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…inerOrder),\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m113157d(WireContainerOrder wireContainerOrder) {
        C2637G6 c2637g6;
        C2637G6 c2637g62;
        C2637G6 c2637g63;
        C2637G6 c2637g64;
        C2637G6 c2637g65;
        List listOfNotNull;
        String string = this.f3189a.getString(C45871nl4.container_order_carrier_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ner_order_carrier_header)");
        C2637G6 c2637g66 = new C2637G6(new C36626Vl0(string, true, true, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        C2637G6[] c2637g6Arr = new C2637G6[7];
        String shippingCarrierName = wireContainerOrder.getShippingCarrierName();
        if (shippingCarrierName == null) {
            shippingCarrierName = WireContainerOrderKt.carrierName(wireContainerOrder);
        }
        C2637G6 c2637g67 = null;
        if (shippingCarrierName != null) {
            int i = C35442Qj4.item_header_value;
            String string2 = this.f3189a.getString(C45871nl4.container_order_carrier_name_label);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…order_carrier_name_label)");
            c2637g6 = new C2637G6(new C50079ur2(string2, shippingCarrierName), i, false, 4, null);
        } else {
            c2637g6 = null;
        }
        c2637g6Arr[0] = c2637g6;
        String trackingId = wireContainerOrder.getTrackingId();
        if (trackingId != null) {
            int i2 = C35442Qj4.item_header_value;
            String string3 = this.f3189a.getString(C45871nl4.container_order_tracking_id_label);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…_order_tracking_id_label)");
            c2637g62 = new C2637G6(new C50079ur2(string3, trackingId), i2, false, 4, null);
        } else {
            c2637g62 = null;
        }
        c2637g6Arr[1] = c2637g62;
        String containerType = WireContainerOrderKt.containerType(wireContainerOrder);
        if (containerType != null) {
            int i3 = C35442Qj4.item_header_value;
            String string4 = this.f3189a.getString(C45871nl4.container_order_container_type_label);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…der_container_type_label)");
            c2637g63 = new C2637G6(new C50079ur2(string4, containerType), i3, false, 4, null);
        } else {
            c2637g63 = null;
        }
        c2637g6Arr[2] = c2637g63;
        String carrierPOCName = wireContainerOrder.getCarrierPOCName();
        if (carrierPOCName != null) {
            int i4 = C35442Qj4.item_header_value;
            String string5 = this.f3189a.getString(C45871nl4.container_order_carrier_poc_label);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.stri…_order_carrier_poc_label)");
            c2637g64 = new C2637G6(new C50079ur2(string5, carrierPOCName), i4, false, 4, null);
        } else {
            c2637g64 = null;
        }
        c2637g6Arr[3] = c2637g64;
        String carrierPOCPhone = wireContainerOrder.getCarrierPOCPhone();
        if (carrierPOCPhone != null) {
            int i5 = C35442Qj4.item_header_value;
            String string6 = this.f3189a.getString(C45871nl4.container_order_carrier_poc_number_label);
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(L.stri…carrier_poc_number_label)");
            c2637g65 = new C2637G6(new C50079ur2(string6, carrierPOCPhone), i5, false, 4, null);
        } else {
            c2637g65 = null;
        }
        c2637g6Arr[4] = c2637g65;
        int i6 = C35442Qj4.item_header_value;
        String string7 = this.f3189a.getString(C45871nl4.container_order_container_id_label);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(L.stri…order_container_id_label)");
        c2637g6Arr[5] = new C2637G6(new C50079ur2(string7, wireContainerOrder.getId()), i6, false, 4, null);
        String notes = wireContainerOrder.getNotes();
        if (notes != null) {
            String string8 = this.f3189a.getString(C45871nl4.container_order_notes_label);
            Intrinsics.checkNotNullExpressionValue(string8, "context.getString(L.stri…tainer_order_notes_label)");
            c2637g67 = new C2637G6(new C50079ur2(string8, notes), i6, false, 4, null);
        }
        c2637g6Arr[6] = c2637g67;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c2637g6Arr);
        return new C3023H6(C50274vB0.m9043m(C50274vB0.m9044l(listOfNotNull)), c2637g66, null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m113156e(WireContainerOrder wireContainerOrder) {
        List mutableListOf;
        String string = this.f3189a.getString(C45871nl4.container_order_details_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ner_order_details_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, true, true, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(C50274vB0.m9053c(wireContainerOrder, this.f3189a), C50274vB0.m9054b(wireContainerOrder, this.f3189a));
        return new C3023H6(C50274vB0.m9044l(mutableListOf), c2637g6, null, 4, null);
    }

    /* renamed from: f */
    public final C3023H6 m113155f(WireContainerOrder wireContainerOrder) {
        C2637G6 c2637g6;
        String string = this.f3189a.getString(C45871nl4.container_order_purpose_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ner_order_purpose_header)");
        C2637G6 c2637g62 = new C2637G6(new C36626Vl0(string, true, true, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        LinkedHashSet<WireTransferOrderLineItem> linkedHashSet = new LinkedHashSet();
        for (WireSkuOrder wireSkuOrder : wireContainerOrder.getSkuOrders()) {
            WireTransferOrderLineItem transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem();
            if (transferOrderLineItem != null) {
                linkedHashSet.add(transferOrderLineItem);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (WireTransferOrderLineItem wireTransferOrderLineItem : linkedHashSet) {
            WireTransferOrder transferOrder = wireTransferOrderLineItem.getTransferOrder();
            if (transferOrder != null) {
                c2637g6 = C50274vB0.m9045k(wireTransferOrderLineItem, this.f3189a, transferOrder);
            } else {
                c2637g6 = null;
            }
            if (c2637g6 != null) {
                arrayList.add(c2637g6);
            }
        }
        return new C3023H6(C50274vB0.m9043m(C50274vB0.m9044l(arrayList)), c2637g62, null, 4, null);
    }

    /* renamed from: g */
    public final C3023H6 m113154g(WireContainerOrder wireContainerOrder) {
        String string = this.f3189a.getString(C45871nl4.container_order_sku_order_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…r_order_sku_order_header)");
        return new C3023H6(C50274vB0.m9043m(C50274vB0.m9047i(wireContainerOrder.getSkuOrders(), this.f3189a, wireContainerOrder)), new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C35442Qj4.item_container_order_details_header, false, 4, null), null, 4, null);
    }

    /* renamed from: h */
    public final C3023H6 m113153h(WireContainerOrder wireContainerOrder, boolean z, boolean z2) {
        Integer num;
        List mutableListOf;
        boolean z3;
        String string = this.f3189a.getString(C45871nl4.container_order_status_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…iner_order_status_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        if (z && !z2) {
            List<WireSkuOrder> skuOrders = wireContainerOrder.getSkuOrders();
            if (!(skuOrders instanceof Collection) || !skuOrders.isEmpty()) {
                for (WireSkuOrder wireSkuOrder : skuOrders) {
                    if (!WireSkuOrderKt.receivedInDestination(wireSkuOrder)) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                num = Integer.valueOf(C45871nl4.container_order_process_action);
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(C50274vB0.m9046j(wireContainerOrder, this.f3189a, num));
                return new C3023H6(mutableListOf, c2637g6, null, 4, null);
            }
        }
        if (z) {
            num = Integer.valueOf(C45871nl4.container_order_change_status);
        } else {
            num = null;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(C50274vB0.m9046j(wireContainerOrder, this.f3189a, num));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }
}
