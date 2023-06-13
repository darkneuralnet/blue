package p000;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lw02;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "LPC5;", "scannedItems", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInboundScanConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanConverter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1549#2:66\n1620#2,3:67\n1774#2,4:70\n1747#2,3:74\n*S KotlinDebug\n*F\n+ 1 InboundScanConverter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanConverter\n*L\n33#1:66\n33#1:67,3\n42#1:70,4\n56#1:74,3\n*E\n"})
/* renamed from: w02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50760w02 {

    /* renamed from: b */
    public static final C29734a f115143b = new C29734a(null);

    /* renamed from: c */
    public static final Set<TransferOrderDemandSource> f115144c;

    /* renamed from: a */
    public final Context f115145a;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lw02$a;", "", "", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "ACCEPTABLE_SOURCES", "Ljava/util/Set;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: w02$a */
    /* loaded from: classes3.dex */
    public static final class C29734a {
        public /* synthetic */ C29734a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29734a() {
        }
    }

    static {
        Set<TransferOrderDemandSource> of;
        of = SetsKt__SetsKt.setOf((Object[]) new TransferOrderDemandSource[]{TransferOrderDemandSource.FM_LONGTAIL_DELIVERY, TransferOrderDemandSource.FM_LONGTAIL_DELIVERY_3PL});
        f115144c = of;
    }

    public C50760w02(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f115145a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m7573a(WireSkuOrder skuOrder, List<PC5> scannedItems) {
        int collectionSizeOrDefault;
        List mutableList;
        TransferOrderDemandSource transferOrderDemandSource;
        boolean contains;
        int i;
        boolean z;
        boolean z2;
        List<C3023H6> listOf;
        WireTransferOrder transferOrder;
        Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        List<PC5> list = scannedItems;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (PC5 pc5 : list) {
            arrayList.add(new C2637G6(pc5, C45268mk4.item_scan_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        Set<TransferOrderDemandSource> set = f115144c;
        WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
            transferOrderDemandSource = transferOrder.getDemandSource();
        } else {
            transferOrderDemandSource = null;
        }
        contains = CollectionsKt___CollectionsKt.contains(set, transferOrderDemandSource);
        boolean z3 = list instanceof Collection;
        boolean z4 = true;
        if (z3 && list.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (PC5 pc52 : list) {
                if (pc52.m90583g() == EnumC43500jl5.RECEIVED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        String string = this.f115145a.getString(C45871nl4.sku_order_items_expected, Integer.valueOf(i), Integer.valueOf(skuOrder.getQuantity()));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …Order.quantity,\n        )");
        SpannableString m25592n = C45097mS5.m25592n(string, String.valueOf(i), new ForegroundColorSpan(NA0.m94301c(this.f115145a, C32364Df4.primaryText)));
        if (!z3 || !list.isEmpty()) {
            for (PC5 pc53 : list) {
                if (pc53.m90583g() == EnumC43500jl5.PENDING_CONFIRMATION) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
        }
        z4 = false;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(new C51353x02(m25592n, contains, z4), C35442Qj4.item_inbound_scan_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
