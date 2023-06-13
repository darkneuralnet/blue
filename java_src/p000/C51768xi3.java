package p000;

import android.content.Context;
import android.text.SpannableString;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.SkuOrderStatus;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.persistence.SkuOrder;
import co.bird.android.model.persistence.nestedstructures.TransferOrder;
import co.bird.android.model.wire.WireSkuScannedItemsKt;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u001c\u0010\u000e\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002J\f\u0010\u0011\u001a\u00020\f*\u00020\u0002H\u0002J&\u0010\u0012\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\u0014\u0010\u0013\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\u0014\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"Lxi3;", "", "Lco/bird/android/model/persistence/SkuOrder;", "skuOrder", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "scannedItems", "Lio/reactivex/F;", "LH6;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "statusLayoutId", "g", "", "h", "i", DateTokenConverter.CONVERTER_KEY, "e", "f", C17296a.f69688o, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xi3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51768xi3 {

    /* renamed from: a */
    public final Context f118006a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xi3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30274a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkuOrderStatus.values().length];
            try {
                iArr[SkuOrderStatus.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkuOrderStatus.IN_TRANSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SkuOrderStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SkuOrderStatus.PROCESSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SkuOrderStatus.PROCESSED_WITH_OSD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SkuOrderStatus.READY_FOR_PICKUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SkuOrderStatus.READY_FOR_PROCESSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SkuOrderStatus.RETURN_TO_SENDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SkuOrderStatus.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SkuOrderStatus.RECEIVED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SkuOrderStatus.RECEIVED_WITH_OSD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SkuOrderStatus.COMPLETED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SkuOrderStatus.CHECKED_IN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C51768xi3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f118006a = context;
    }

    /* renamed from: c */
    public static final List m4810c(C51768xi3 this$0, SkuOrder skuOrder, List list) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(skuOrder, "$skuOrder");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m4806g(skuOrder, this$0.f118006a, C35442Qj4.item_operator_allocation_status), this$0.m4809d(skuOrder, this$0.f118006a, list), this$0.m4808e(skuOrder, this$0.f118006a), this$0.m4807f(skuOrder, this$0.f118006a)});
        return listOfNotNull;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC23442F convert$default(C51768xi3 c51768xi3, SkuOrder skuOrder, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return c51768xi3.m4811b(skuOrder, list);
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m4811b(final SkuOrder skuOrder, final List<WireSuccessfulScannedItem> list) {
        Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: wi3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m4810c;
                m4810c = C51768xi3.m4810c(C51768xi3.this, skuOrder, list);
                return m4810c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…n(context),\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m4809d(SkuOrder skuOrder, Context context, List<WireSuccessfulScannedItem> list) {
        int i;
        int quantity;
        List<WireSuccessfulScannedItem> inboundScans;
        List listOfNotNull;
        TransferOrder transferOrder = skuOrder.getTransferOrderLineItem().getTransferOrder();
        String string = context.getString(C45871nl4.sku_order_basic_info_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_order_basic_info_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        C2637G6[] c2637g6Arr = new C2637G6[6];
        int i2 = C35442Qj4.item_header_value;
        String string2 = context.getString(C45871nl4.sku_order_origin_warehouse_label);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…r_origin_warehouse_label)");
        c2637g6Arr[0] = new C2637G6(new C50079ur2(string2, transferOrder.getOriginWarehouse().getName()), i2, false, 4, null);
        String string3 = context.getString(C45871nl4.sku_order_destination_warehouse_label);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…tination_warehouse_label)");
        c2637g6Arr[1] = new C2637G6(new C50079ur2(string3, transferOrder.getDestinationWarehouse().getName()), i2, false, 4, null);
        String string4 = context.getString(C45871nl4.sku_order_commodity_type_label);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…der_commodity_type_label)");
        c2637g6Arr[2] = new C2637G6(new C50079ur2(string4, C45097mS5.m25601e(skuOrder.getTransferOrderLineItem().getCommodityType())), i2, false, 4, null);
        String string5 = context.getString(C45871nl4.sku_order_commodity_label);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…ku_order_commodity_label)");
        String str = skuOrder.getTransferOrderLineItem().getCommodities().get(skuOrder.getTransferOrderLineItem().getCommodity());
        if (str == null) {
            str = skuOrder.getTransferOrderLineItem().getCommodity();
        }
        c2637g6Arr[3] = new C2637G6(new C50079ur2(string5, str), i2, false, 4, null);
        String string6 = context.getString(C45871nl4.sku_order_condition_label);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…ku_order_condition_label)");
        if (skuOrder.getTransferOrderLineItem().getUsedCondition()) {
            i = C45871nl4.sku_order_condition_used;
        } else {
            i = C45871nl4.sku_order_condition_new;
        }
        String string7 = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(\n     …          }\n            )");
        c2637g6Arr[4] = new C2637G6(new C50079ur2(string6, string7), i2, false, 4, null);
        String string8 = context.getString(C45871nl4.sku_order_quantity_header);
        Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.stri…ku_order_quantity_header)");
        if (skuOrder.getTransferOrderLineItem().getTransferOrder().getDemandSource() == TransferOrderDemandSource.FM_PICK_UP) {
            if (list != null) {
                quantity = list.size();
            } else {
                quantity = skuOrder.getQuantity();
            }
        } else if (list != null && (inboundScans = WireSkuScannedItemsKt.inboundScans(list)) != null) {
            quantity = inboundScans.size();
        } else {
            quantity = skuOrder.getQuantity();
        }
        c2637g6Arr[5] = new C2637G6(new C50079ur2(string8, C50274vB0.m9049g(quantity, skuOrder.getQuantity(), context)), i2, false, 4, null);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c2637g6Arr);
        return new C3023H6(C50274vB0.m9043m(listOfNotNull), c2637g6, null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m4808e(SkuOrder skuOrder, Context context) {
        Triple triple;
        List listOfNotNull;
        if (skuOrder.getTransferOrderLineItem().getTransferOrder().getDemandSource() == TransferOrderDemandSource.FM_PICK_UP) {
            triple = new Triple(Integer.valueOf(C45871nl4.container_order_pickup_header), Integer.valueOf(C45871nl4.container_order_target_eta_pickup), skuOrder.getTransferOrderLineItem().getTransferOrder().getTargetDeliveryDate());
        } else {
            triple = new Triple(Integer.valueOf(C45871nl4.container_order_arrival_header), Integer.valueOf(C45871nl4.container_order_target_eta_delivery), skuOrder.getTransferOrderLineItem().getTransferOrder().getTargetDeliveryDate());
        }
        int intValue = ((Number) triple.component1()).intValue();
        int intValue2 = ((Number) triple.component2()).intValue();
        String string = context.getString(intValue);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(headerTextRes)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, true, false, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        int i = C35442Qj4.item_header_value;
        String string2 = context.getString(intValue2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(targetTextRes)");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(new C2637G6(new C50079ur2(string2, new SpannableString(C50274vB0.m9055a((DateTime) triple.component3()))), i, false, 4, null));
        return new C3023H6(C50274vB0.m9043m(listOfNotNull), c2637g6, null, 4, null);
    }

    /* renamed from: f */
    public final C3023H6 m4807f(SkuOrder skuOrder, Context context) {
        List listOfNotNull;
        String string = context.getString(C45871nl4.sku_order_purpose_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…sku_order_purpose_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, true, false, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        int i = C35442Qj4.item_header_value;
        String string2 = context.getString(C45871nl4.transfer_order_reason_title);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…nsfer_order_reason_title)");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(new C2637G6(new C50079ur2(string2, skuOrder.getTransferOrderLineItem().getTransferOrder().getReason().name()), i, false, 4, null));
        return new C3023H6(C50274vB0.m9043m(listOfNotNull), c2637g6, null, 4, null);
    }

    /* renamed from: g */
    public final C3023H6 m4806g(SkuOrder skuOrder, Context context, int i) {
        List mutableListOf;
        String string = context.getString(C45871nl4.transfer_order_details_status_header);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…er_details_status_header)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        String string2 = context.getString(m4804i(skuOrder));
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(localizedLabelForStatus())");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new HQ5(string2, C40788fB0.m41776f(context, DC5.m110689b(skuOrder.getStatus())), null, 4, null), i, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }

    /* renamed from: h */
    public final boolean m4805h(SkuOrder skuOrder) {
        if (skuOrder.getTransferOrderLineItem().getTransferOrder().getDemandSource() == TransferOrderDemandSource.FM_DROP_OFF && skuOrder.getStatus() == SkuOrderStatus.READY_FOR_PICKUP) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final int m4804i(SkuOrder skuOrder) {
        if (m4805h(skuOrder)) {
            return C45871nl4.transfer_order_status_ready_for_checkin;
        }
        switch (C30274a.$EnumSwitchMapping$0[skuOrder.getStatus().ordinal()]) {
            case 1:
                return C45871nl4.canceled;
            case 2:
                return C45871nl4.transfer_order_status_in_transit;
            case 3:
                return C45871nl4.pending;
            case 4:
                return C45871nl4.status_processed;
            case 5:
                return C45871nl4.status_processed_with_osd;
            case 6:
                return C45871nl4.ready_for_pickup;
            case 7:
                return C45871nl4.status_ready_for_processing;
            case 8:
                return C45871nl4.return_to_sender;
            case 9:
                return C45871nl4.bird_action_unknown;
            case 10:
                return C45871nl4.received;
            case 11:
                return C45871nl4.received_with_osd;
            case 12:
                return C45871nl4.completed;
            case 13:
                return C45871nl4.transfer_order_status_checked_in;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
