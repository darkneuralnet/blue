package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.RepairCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LVE4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3OverviewAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewAdapterDiff.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n18#2:38\n18#2:43\n9#3,4:39\n9#3,4:44\n1#4:48\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewAdapterDiff.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewAdapterDiff\n*L\n16#1:38\n25#1:43\n16#1:39,4\n25#1:44,4\n*E\n"})
/* renamed from: VE4 */
/* loaded from: classes3.dex */
public final class VE4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        RepairCategory m101430e;
        String display;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C45268mk4.item_vehicle_servicing_vehicle_info) {
            return "vehicle_info";
        }
        if (m105817b == C32634Ej4.item_repair_category) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof C33705Iy4)) {
                m105816c = null;
            }
            C33705Iy4 c33705Iy4 = (C33705Iy4) m105816c;
            if (c33705Iy4 != null && (m101430e = c33705Iy4.m101430e()) != null && (display = m101430e.getDisplay()) != null) {
                return display;
            }
        } else if (m105817b == C32634Ej4.item_quick_links_section) {
            return "quick_links";
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        C33705Iy4 c33705Iy4;
        String str;
        RepairCategory m101430e;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        boolean z = m105816c instanceof C33705Iy4;
        if (!z) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        C3023H6 c3023h6 = null;
        if (!(m105816c2 instanceof C33705Iy4)) {
            m105816c2 = null;
        }
        C33705Iy4 c33705Iy42 = (C33705Iy4) m105816c2;
        if (z) {
            c33705Iy4 = (C33705Iy4) m105816c;
        } else {
            c33705Iy4 = null;
        }
        if (c33705Iy4 != null) {
            RepairCategory m101434a = c33705Iy4.m101434a();
            C3023H6 m101433b = c33705Iy4.m101433b();
            boolean m101432c = c33705Iy4.m101432c();
            String description = m101434a.getDescription();
            if (c33705Iy42 != null && (m101430e = c33705Iy42.m101430e()) != null) {
                str = m101430e.getDescription();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(description, str)) {
                if (c33705Iy42 != null) {
                    c3023h6 = c33705Iy42.m101429f();
                }
                if (Intrinsics.areEqual(m101433b, c3023h6) && m101432c == c33705Iy42.m101428g()) {
                    return false;
                }
            }
        }
        return true;
    }
}
