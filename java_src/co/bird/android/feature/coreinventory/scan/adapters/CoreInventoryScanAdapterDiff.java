package co.bird.android.feature.coreinventory.scan.adapters;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapterDiff;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreInventoryScanAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanAdapterDiff.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,36:1\n18#2:37\n18#2:42\n18#2:47\n9#3,4:38\n9#3,4:43\n9#3,4:48\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanAdapterDiff.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapterDiff\n*L\n15#1:37\n25#1:42\n29#1:47\n15#1:38,4\n25#1:43,4\n29#1:48,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanAdapterDiff implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        WireVehicleInventoryScan wireVehicleInventoryScan;
        String scanIdentifier;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C45268mk4.item_scan_vehicle) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair == null || (wireVehicleInventoryScan = (WireVehicleInventoryScan) pair.getFirst()) == null || (scanIdentifier = wireVehicleInventoryScan.getScanIdentifier()) == null) {
                return "";
            }
            return scanIdentifier;
        } else if (m105817b != C37071Xi4.item_core_inventory_scan_header) {
            return "";
        } else {
            return "header";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Object obj = null;
        if (m105816c instanceof Pair) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof Pair)) {
                m105816c2 = null;
            }
            Pair pair = (Pair) m105816c2;
            Object second = ((Pair) m105816c).getSecond();
            if (pair != null) {
                obj = (Boolean) pair.getSecond();
            }
            if (!Intrinsics.areEqual(second, obj)) {
                return true;
            }
        } else if (m105816c instanceof C43762kC0) {
            Object m105816c3 = newItem.m105816c();
            if (m105816c3 instanceof C43762kC0) {
                obj = m105816c3;
            }
            if (!Intrinsics.areEqual(m105816c, (C43762kC0) obj)) {
                return true;
            }
        }
        return false;
    }
}
