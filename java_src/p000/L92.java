package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.SkuOrderStatus;
import co.bird.android.model.wire.WireFailedScannedItem;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuVehicle;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LL92;", "", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "successfulScans", "", "checkedIn", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "Lio/reactivex/F;", "LH6;", "e", "Lco/bird/android/model/wire/WireFailedScannedItem;", "failedScans", "c", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryScanningDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningDetailsConverter.kt\nco/bird/android/feature/transferorder/sku/scanner/details/adapters/InventoryScanningDetailsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1549#2:87\n1620#2,2:88\n1622#2:91\n1360#2:92\n1446#2,5:93\n1603#2,9:98\n1855#2:107\n1856#2:109\n1612#2:110\n1549#2:111\n1620#2,3:112\n1549#2:115\n1620#2,3:116\n1#3:90\n1#3:108\n*S KotlinDebug\n*F\n+ 1 InventoryScanningDetailsConverter.kt\nco/bird/android/feature/transferorder/sku/scanner/details/adapters/InventoryScanningDetailsConverter\n*L\n39#1:87\n39#1:88,2\n39#1:91\n56#1:92\n56#1:93,5\n57#1:98,9\n57#1:107\n57#1:109\n57#1:110\n58#1:111\n58#1:112,3\n70#1:115\n70#1:116,3\n57#1:108\n*E\n"})
/* renamed from: L92 */
/* loaded from: classes3.dex */
public final class L92 {

    /* renamed from: a */
    public final Context f20812a;

    public L92(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20812a = context;
    }

    /* renamed from: d */
    public static final List m97652d(List failedScans, L92 this$0) {
        int collectionSizeOrDefault;
        List mutableList;
        int collectionSizeOrDefault2;
        List listOf;
        Intrinsics.checkNotNullParameter(failedScans, "$failedScans");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<WireFailedScannedItem> list = failedScans;
        ArrayList<String> arrayList = new ArrayList();
        for (WireFailedScannedItem wireFailedScannedItem : list) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, wireFailedScannedItem.getScanIdentifiers());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (WireFailedScannedItem wireFailedScannedItem2 : list) {
            String serialNumber = wireFailedScannedItem2.getSerialNumber();
            if (serialNumber != null) {
                arrayList2.add(serialNumber);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (String str : arrayList) {
            String string = this$0.f20812a.getString(C45871nl4.inventory_scanning_unidentified_label);
            int m94301c = NA0.m94301c(this$0.f20812a, C32364Df4.birdRed);
            Drawable drawable = this$0.f20812a.getDrawable(C48193rg4.ic_filled_missing);
            int m94301c2 = NA0.m94301c(this$0.f20812a, C32364Df4.errorRed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.inven…nning_unidentified_label)");
            arrayList3.add(new C2637G6(new G92(str, string, drawable, null, null, false, Integer.valueOf(m94301c2), m94301c, true, 24, null), C42303hk4.item_inventory_scan, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
        for (String str2 : arrayList2) {
            String string2 = this$0.f20812a.getString(C45871nl4.inventory_scanning_unidentified_label);
            int m94301c3 = NA0.m94301c(this$0.f20812a, C32364Df4.birdRed);
            Drawable drawable2 = this$0.f20812a.getDrawable(C48193rg4.ic_filled_missing);
            int m94301c4 = NA0.m94301c(this$0.f20812a, C32364Df4.errorRed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.inven…nning_unidentified_label)");
            arrayList4.add(new C2637G6(new G92(str2, string2, drawable2, null, null, false, Integer.valueOf(m94301c4), m94301c3, false, 24, null), C42303hk4.item_inventory_scan, false, 4, null));
        }
        mutableList.addAll(arrayList4);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: f */
    public static final List m97650f(boolean z, WireSkuOrder skuOrder, List successfulScans, L92 this$0) {
        int i;
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        List listOf2;
        Drawable drawable;
        BirdModel fromString;
        Intrinsics.checkNotNullParameter(skuOrder, "$skuOrder");
        Intrinsics.checkNotNullParameter(successfulScans, "$successfulScans");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            i = C45871nl4.transfer_order_status_checked_in;
        } else if (skuOrder.getStatus() != SkuOrderStatus.IN_TRANSIT && skuOrder.getStatus() != SkuOrderStatus.CHECKED_IN && skuOrder.getStatus() != SkuOrderStatus.READY_FOR_PROCESSING) {
            i = C45871nl4.sku_scanned_added_label;
        } else {
            i = C45871nl4.transfer_order_status_in_transit;
        }
        List<WireSuccessfulScannedItem> list = successfulScans;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireSuccessfulScannedItem wireSuccessfulScannedItem : list) {
            String itemDisplayName = wireSuccessfulScannedItem.getItemDisplayName();
            if (itemDisplayName == null) {
                itemDisplayName = wireSuccessfulScannedItem.getId();
            }
            String str = itemDisplayName;
            listOf2 = CollectionsKt__CollectionsJVMKt.listOf(wireSuccessfulScannedItem);
            String string = this$0.f20812a.getString(i);
            int m94301c = NA0.m94301c(this$0.f20812a, C32364Df4.primaryText);
            WireSkuVehicle bird = wireSuccessfulScannedItem.getBird();
            if (bird != null && (fromString = BirdModel.Companion.fromString(bird.getModel())) != null) {
                drawable = C6327PM.m90445a(fromString, this$0.f20812a);
            } else {
                drawable = null;
            }
            Intrinsics.checkNotNullExpressionValue(string, "getString(label)");
            arrayList.add(new C2637G6(new G92(str, string, drawable, listOf2, null, false, null, m94301c, false, 368, null), C42303hk4.item_inventory_scan, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: c */
    public final AbstractC23442F<List<C3023H6>> m97653c(final List<WireFailedScannedItem> failedScans) {
        Intrinsics.checkNotNullParameter(failedScans, "failedScans");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: K92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m97652d;
                m97652d = L92.m97652d(failedScans, this);
                return m97652d;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…anIdentifierItems))\n    }");
        return m33161E;
    }

    /* renamed from: e */
    public final AbstractC23442F<List<C3023H6>> m97651e(final List<WireSuccessfulScannedItem> successfulScans, final boolean z, final WireSkuOrder skuOrder) {
        Intrinsics.checkNotNullParameter(successfulScans, "successfulScans");
        Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: J92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m97650f;
                m97650f = L92.m97650f(z, skuOrder, successfulScans, this);
                return m97650f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…ableList()\n      ))\n    }");
        return m33161E;
    }
}
