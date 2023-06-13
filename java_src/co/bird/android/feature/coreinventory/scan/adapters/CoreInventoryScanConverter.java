package co.bird.android.feature.coreinventory.scan.adapters;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u00042\u0006\u0010\t\u001a\u00020\u0007R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter;", "", "Lco/bird/android/model/constant/VehicleInventoryAction;", "action", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "vehicleScans", "processEnabled", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreInventoryScanConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanConverter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1549#2:70\n1620#2,3:71\n2624#2,3:74\n1747#2,3:77\n1774#2,4:80\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanConverter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanConverter\n*L\n24#1:70\n24#1:71,3\n44#1:74,3\n45#1:77,3\n49#1:80,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanConverter {

    /* renamed from: a */
    public final Context f63901a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VehicleInventoryAction.values().length];
            try {
                iArr[VehicleInventoryAction.CHECK_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VehicleInventoryAction.CHECK_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VehicleInventoryAction.DROP_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VehicleInventoryAction.PICK_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CoreInventoryScanConverter(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63901a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C3023H6> m58252a(VehicleInventoryAction action, List<Pair<WireVehicleInventoryScan, Boolean>> vehicleScans, boolean z) {
        int collectionSizeOrDefault;
        List mutableList;
        String string;
        boolean z2;
        Iterator<T> it;
        int i;
        String str;
        List<C3023H6> listOf;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(vehicleScans, "vehicleScans");
        List<Pair<WireVehicleInventoryScan, Boolean>> list = vehicleScans;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C2637G6((Pair) it2.next(), C45268mk4.item_scan_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        int size = mutableList.size();
        int i2 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        string = "";
                    } else {
                        string = this.f63901a.getString(C45871nl4.core_inventory_pickup_label_uppercase);
                    }
                } else {
                    string = this.f63901a.getString(C45871nl4.core_inventory_dropoff_label_uppercase);
                }
            } else {
                string = this.f63901a.getString(C45871nl4.core_inventory_check_in_label_uppercase);
            }
        } else {
            string = this.f63901a.getString(C45871nl4.core_inventory_checkout_label_uppercase);
        }
        Intrinsics.checkNotNullExpressionValue(string, "when (action) {\n        …     else -> \"\"\n        }");
        if (z) {
            boolean z6 = list instanceof Collection;
            if (!z6 || !list.isEmpty()) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.areEqual((Boolean) ((Pair) it3.next()).component2(), Boolean.FALSE)) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                if (!z6 || !list.isEmpty()) {
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (((Boolean) ((Pair) it4.next()).component2()) == null) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                if (z5) {
                    z2 = true;
                    if (!(list instanceof Collection) && list.isEmpty()) {
                        i = 0;
                    } else {
                        it = list.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual((Boolean) ((Pair) it.next()).component2(), Boolean.FALSE) && (i = i + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    if (i == 0) {
                        if (i != 1) {
                            str = this.f63901a.getString(C45871nl4.core_inventory_scan_error_format_multiple, Integer.valueOf(i));
                        } else {
                            str = this.f63901a.getString(C45871nl4.core_inventory_scan_error_format_single);
                        }
                    } else {
                        str = null;
                    }
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(new C43762kC0(size, str, string, z2), C37071Xi4.item_core_inventory_scan_header, false, 4, null), null, 4, null));
                    return listOf;
                }
            }
        }
        z2 = false;
        if (!(list instanceof Collection)) {
        }
        it = list.iterator();
        i = 0;
        while (it.hasNext()) {
        }
        if (i == 0) {
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(new C43762kC0(size, str, string, z2), C37071Xi4.item_core_inventory_scan_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
