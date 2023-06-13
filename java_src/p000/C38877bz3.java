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
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lbz3;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "LPC5;", "scannedItems", "", "successIds", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutboundScanConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanConverter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1549#2:90\n1620#2,3:91\n1747#2,3:94\n*S KotlinDebug\n*F\n+ 1 OutboundScanConverter.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanConverter\n*L\n36#1:90\n36#1:91,3\n59#1:94,3\n*E\n"})
/* renamed from: bz3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38877bz3 {

    /* renamed from: b */
    public static final C13358a f59845b = new C13358a(null);

    /* renamed from: c */
    public static final Set<TransferOrderDemandSource> f59846c;

    /* renamed from: a */
    public final Context f59847a;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lbz3$a;", "", "", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "FM_OUTBOUND_SOURCES", "Ljava/util/Set;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bz3$a */
    /* loaded from: classes3.dex */
    public static final class C13358a {
        public /* synthetic */ C13358a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13358a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bz3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13359b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferOrderDemandSource.values().length];
            try {
                iArr[TransferOrderDemandSource.BIRD_ALLOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_TO_FM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_PICK_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_LONGTAIL_DELIVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferOrderDemandSource.SC_TO_3PL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_DROP_OFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_DROP_OFF_3PL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_LONGTAIL_RETURN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransferOrderDemandSource.FM_LONGTAIL_RETURN_3PL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransferOrderDemandSource.SCRAP_REMOVAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Set<TransferOrderDemandSource> of;
        of = SetsKt__SetsKt.setOf((Object[]) new TransferOrderDemandSource[]{TransferOrderDemandSource.FM_DROP_OFF, TransferOrderDemandSource.FM_DROP_OFF_3PL});
        f59846c = of;
    }

    public C38877bz3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59847a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m62057a(WireSkuOrder skuOrder, List<PC5> scannedItems, List<String> successIds) {
        int collectionSizeOrDefault;
        List mutableList;
        TransferOrderDemandSource transferOrderDemandSource;
        boolean contains;
        int i;
        List<C3023H6> listOf;
        boolean contains2;
        WireTransferOrder transferOrder;
        boolean contains3;
        Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        Intrinsics.checkNotNullParameter(successIds, "successIds");
        List<PC5> list = scannedItems;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (PC5 pc5 : list) {
            contains3 = CollectionsKt___CollectionsKt.contains(successIds, pc5.m90585e());
            arrayList.add(new C2637G6(TuplesKt.m28425to(pc5, Boolean.valueOf(contains3)), C45268mk4.item_scan_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        boolean z = false;
        String string = this.f59847a.getString(C45871nl4.sku_order_items_expected, Integer.valueOf(scannedItems.size()), Integer.valueOf(skuOrder.getQuantity()));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …Order.quantity,\n        )");
        SpannableString m25592n = C45097mS5.m25592n(string, String.valueOf(scannedItems.size()), new ForegroundColorSpan(NA0.m94301c(this.f59847a, C32364Df4.primaryText)));
        WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
        String str = null;
        if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
            transferOrderDemandSource = transferOrder.getDemandSource();
        } else {
            transferOrderDemandSource = null;
        }
        contains = CollectionsKt___CollectionsKt.contains(f59846c, transferOrderDemandSource);
        if (contains) {
            List<PC5> list2 = scannedItems;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (PC5 pc52 : list2) {
                    contains2 = CollectionsKt___CollectionsKt.contains(successIds, pc52.m90585e());
                    if (!contains2) {
                        z = true;
                        break;
                    }
                }
            }
        } else if (scannedItems.size() > successIds.size()) {
            z = true;
            break;
        } else {
            z = true;
            break;
        }
        if (transferOrderDemandSource == null) {
            i = -1;
        } else {
            i = C13359b.$EnumSwitchMapping$0[transferOrderDemandSource.ordinal()];
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                str = this.f59847a.getString(C45871nl4.transfer_order_complete_checkout_button);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                str = this.f59847a.getString(C45871nl4.transfer_order_complete_return_button);
                break;
            case 10:
                str = this.f59847a.getString(C45871nl4.scrap_order_complete_scrap_label);
                break;
        }
        if (transferOrderDemandSource == null) {
            transferOrderDemandSource = TransferOrderDemandSource.UNKNOWN;
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(new C39488cz3(m25592n, str, z, transferOrderDemandSource), C35442Qj4.item_outbound_scan_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
