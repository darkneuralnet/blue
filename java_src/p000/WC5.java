package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.wire.WireFailedScannedItem;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSkuScannedItemsKt;
import co.bird.android.model.wire.WireSkuVehicle;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J(\u0010\r\u001a\u0004\u0018\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u0004\u0018\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\u0011\u001a\u0004\u0018\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LWC5;", "", "Lco/bird/android/model/wire/WireSkuScannedItems;", "skuScannedItems", "", "outbound", "usedCondition", "Lio/reactivex/F;", "", "LH6;", "b", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "scannedItems", DateTokenConverter.CONVERTER_KEY, "g", "Lco/bird/android/model/wire/WireFailedScannedItem;", "unidentifiedVehicles", "e", "lastScan", "f", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuScannerConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuScannerConverter.kt\nco/bird/android/feature/transferorder/sku/scanner/adapters/SkuScannerConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1477#2:152\n1502#2,3:153\n1505#2,3:163\n1477#2:177\n1502#2,3:178\n1505#2,3:188\n1360#2:202\n1446#2,5:203\n1963#2,14:208\n361#3,7:156\n515#3:166\n500#3,6:167\n361#3,7:181\n515#3:191\n500#3,6:192\n125#4:173\n152#4,3:174\n125#4:198\n152#4,3:199\n1#5:222\n*S KotlinDebug\n*F\n+ 1 SkuScannerConverter.kt\nco/bird/android/feature/transferorder/sku/scanner/adapters/SkuScannerConverter\n*L\n59#1:152\n59#1:153,3\n59#1:163,3\n87#1:177\n87#1:178,3\n87#1:188,3\n119#1:202\n119#1:203,5\n42#1:208,14\n59#1:156,7\n60#1:166\n60#1:167,6\n87#1:181,7\n88#1:191\n88#1:192,6\n61#1:173\n61#1:174,3\n89#1:198\n89#1:199,3\n*E\n"})
/* renamed from: WC5 */
/* loaded from: classes3.dex */
public final class WC5 {

    /* renamed from: a */
    public final Context f40569a;

    public WC5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40569a = context;
    }

    /* renamed from: c */
    public static final List m78712c(WireSkuScannedItems skuScannedItems, boolean z, WC5 this$0, boolean z2) {
        List<WireSuccessfulScannedItem> inboundScans;
        Object next;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(skuScannedItems, "$skuScannedItems");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<WireSuccessfulScannedItem> successfulScannedItems = skuScannedItems.getSuccessfulScannedItems();
        List<WireFailedScannedItem> failedScannedItems = skuScannedItems.getFailedScannedItems();
        if (z) {
            inboundScans = successfulScannedItems;
        } else {
            inboundScans = WireSkuScannedItemsKt.inboundScans(successfulScannedItems);
        }
        Iterator<T> it = inboundScans.iterator();
        C3023H6 c3023h6 = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                DateTime updatedAt = ((WireSuccessfulScannedItem) next).getUpdatedAt();
                do {
                    Object next2 = it.next();
                    DateTime updatedAt2 = ((WireSuccessfulScannedItem) next2).getUpdatedAt();
                    if (updatedAt.compareTo(updatedAt2) < 0) {
                        next = next2;
                        updatedAt = updatedAt2;
                    }
                } while (it.hasNext());
            }
        }
        WireSuccessfulScannedItem wireSuccessfulScannedItem = (WireSuccessfulScannedItem) next;
        C3023H6[] c3023h6Arr = new C3023H6[4];
        if (wireSuccessfulScannedItem != null) {
            c3023h6 = this$0.m78709f(wireSuccessfulScannedItem);
        }
        c3023h6Arr[0] = c3023h6;
        c3023h6Arr[1] = this$0.m78710e(failedScannedItems, z);
        c3023h6Arr[2] = this$0.m78711d(skuScannedItems.getSuccessfulScannedItems(), z, z2);
        c3023h6Arr[3] = this$0.m78708g(successfulScannedItems, z, z2);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c3023h6Arr);
        return listOfNotNull;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m78713b(final WireSkuScannedItems skuScannedItems, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(skuScannedItems, "skuScannedItems");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: VC5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m78712c;
                m78712c = WC5.m78712c(WireSkuScannedItems.this, z, this, z2);
                return m78712c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…Condition),\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m78711d(List<WireSuccessfulScannedItem> list, boolean z, boolean z2) {
        List mutableList;
        Object first;
        String str;
        int i;
        Drawable drawable;
        List<WireSuccessfulScannedItem> inboundScans = WireSkuScannedItemsKt.inboundScans(list);
        if (z || inboundScans.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : inboundScans) {
            String itemDisplayCaption = ((WireSuccessfulScannedItem) obj).getItemDisplayCaption();
            Object obj2 = linkedHashMap.get(itemDisplayCaption);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(itemDisplayCaption, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (true ^ ((List) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            BirdModel.Companion companion = BirdModel.Companion;
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list2);
            WireSkuVehicle bird = ((WireSuccessfulScannedItem) first).getBird();
            if (bird != null) {
                str = bird.getModel();
            } else {
                str = null;
            }
            BirdModel fromString = companion.fromString(str);
            if (z2) {
                i = C45871nl4.sku_scanned_used_condition;
            } else {
                i = C45871nl4.sku_scanned_new_condition;
            }
            String string = this.f40569a.getResources().getString(i, str2);
            String string2 = this.f40569a.getResources().getString(C45871nl4.hard_count_model_scanned, Integer.valueOf(list2.size()));
            int m94301c = NA0.m94301c(this.f40569a, C32364Df4.primaryText);
            if (fromString != null) {
                drawable = C6327PM.m90445a(fromString, this.f40569a);
            } else {
                drawable = null;
            }
            Intrinsics.checkNotNullExpressionValue(string, "getString(groupStringRes, display)");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.hard_…anned, birdsByModel.size)");
            arrayList.add(new C2637G6(new G92(string, string2, drawable, list2, null, false, null, m94301c, false, 368, null), C42303hk4.item_inventory_scan, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(this.f40569a.getString(C45871nl4.sku_scan_details_inbound_items_header), C42303hk4.item_model_header, false, 4, null), null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m78710e(List<WireFailedScannedItem> list, boolean z) {
        List mutableListOf;
        if (!list.isEmpty() && z) {
            C2637G6 c2637g6 = new C2637G6(this.f40569a.getString(C45871nl4.hard_count_failed_scans), C42303hk4.item_model_header, false, 4, null);
            ArrayList arrayList = new ArrayList();
            for (WireFailedScannedItem wireFailedScannedItem : list) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, wireFailedScannedItem.getScanIdentifiers());
            }
            String string = this.f40569a.getString(C45871nl4.hard_count_unidentifiable_scans);
            String string2 = this.f40569a.getResources().getString(C45871nl4.hard_count_unidentifiable_scan_format, Integer.valueOf(list.size()));
            Drawable m94299e = NA0.m94299e(this.f40569a, C48193rg4.ic_filled_missing);
            Context context = this.f40569a;
            int i = C32364Df4.errorRed;
            int m94301c = NA0.m94301c(context, i);
            String name = InventoryScanningIdentifierCategory.UNIDENTIFIABLE.name();
            int m94301c2 = NA0.m94301c(this.f40569a, i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.hard_…unt_unidentifiable_scans)");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.hard_…nidentifiedVehicles.size)");
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new G92(string, string2, m94299e, arrayList, name, false, Integer.valueOf(m94301c2), m94301c, false, 288, null), C42303hk4.item_group, false, 4, null));
            return new C3023H6(mutableListOf, c2637g6, null, 4, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.graphics.drawable.Drawable] */
    /* renamed from: f */
    public final C3023H6 m78709f(WireSuccessfulScannedItem wireSuccessfulScannedItem) {
        String str;
        int i;
        List mutableListOf;
        Object obj = null;
        if (wireSuccessfulScannedItem.getBird() == null) {
            return null;
        }
        BirdModel.Companion companion = BirdModel.Companion;
        WireSkuVehicle bird = wireSuccessfulScannedItem.getBird();
        if (bird != null) {
            str = bird.getModel();
        } else {
            str = null;
        }
        BirdModel fromString = companion.fromString(str);
        String itemDisplayName = wireSuccessfulScannedItem.getItemDisplayName();
        if (itemDisplayName != null) {
            String string = this.f40569a.getResources().getString(C45871nl4.hard_count_last_successful_uploads_format, C45101mT0.f98056a.m25569b(wireSuccessfulScannedItem.getUpdatedAt()));
            int m94301c = NA0.m94301c(this.f40569a, C32364Df4.primaryText);
            if (fromString != null) {
                obj = C6327PM.m90445a(fromString, this.f40569a);
            }
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.hard_…uploads_format, scanTime)");
            i = 1;
            obj = new G92(itemDisplayName, string, obj, null, null, false, null, m94301c, false, 376, null);
        } else {
            i = 1;
        }
        C2637G6[] c2637g6Arr = new C2637G6[i];
        c2637g6Arr[0] = new C2637G6(obj, C42303hk4.item_last_successful_scan, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: g */
    public final C3023H6 m78708g(List<WireSuccessfulScannedItem> list, boolean z, boolean z2) {
        List<WireSuccessfulScannedItem> inboundMissingItems;
        List mutableList;
        Object first;
        String str;
        int i;
        int i2;
        Drawable drawable;
        if (z) {
            inboundMissingItems = list;
        } else {
            inboundMissingItems = WireSkuScannedItemsKt.inboundMissingItems(list);
        }
        if (inboundMissingItems.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : inboundMissingItems) {
            String itemDisplayCaption = ((WireSuccessfulScannedItem) obj).getItemDisplayCaption();
            Object obj2 = linkedHashMap.get(itemDisplayCaption);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(itemDisplayCaption, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (true ^ ((List) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            BirdModel.Companion companion = BirdModel.Companion;
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list2);
            WireSkuVehicle bird = ((WireSuccessfulScannedItem) first).getBird();
            if (bird != null) {
                str = bird.getModel();
            } else {
                str = null;
            }
            BirdModel fromString = companion.fromString(str);
            if (z) {
                i = C45871nl4.hard_count_model_scanned;
            } else {
                i = C45871nl4.sku_order_items_in_transit_label;
            }
            if (z2) {
                i2 = C45871nl4.sku_scanned_used_condition;
            } else {
                i2 = C45871nl4.sku_scanned_new_condition;
            }
            String string = this.f40569a.getResources().getString(i2, str2);
            String string2 = this.f40569a.getResources().getString(i, Integer.valueOf(list2.size()));
            int m94301c = NA0.m94301c(this.f40569a, C32364Df4.primaryText);
            if (fromString != null) {
                drawable = C6327PM.m90445a(fromString, this.f40569a);
            } else {
                drawable = null;
            }
            Intrinsics.checkNotNullExpressionValue(string, "getString(groupStringRes, display)");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(label, birdsByModel.size)");
            arrayList.add(new C2637G6(new G92(string, string2, drawable, list2, null, false, null, m94301c, false, 368, null), C42303hk4.item_inventory_scan, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(this.f40569a.getString(C45871nl4.hard_count_vehicle_models_header), C42303hk4.item_model_header, false, 4, null), null, 4, null);
    }
}
