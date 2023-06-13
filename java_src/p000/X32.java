package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.InspectionFlow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LX32;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3AdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3AdapterDiff.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3AdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,40:1\n18#2:41\n18#2:46\n18#2:51\n9#3,4:42\n9#3,4:47\n9#3,4:52\n*S KotlinDebug\n*F\n+ 1 InspectionV3AdapterDiff.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3AdapterDiff\n*L\n16#1:41\n25#1:46\n30#1:51\n16#1:42,4\n25#1:47,4\n30#1:52,4\n*E\n"})
/* renamed from: X32 */
/* loaded from: classes3.dex */
public final class X32 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String m89002f;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C45268mk4.item_vehicle_servicing_vehicle_info) {
            return "Vehicle Info";
        }
        if (m105817b == C37080Xj4.item_inspection_instructions) {
            return "Instructions";
        }
        if (m105817b == C37080Xj4.item_inspection_category) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof Q32)) {
                m105816c = null;
            }
            Q32 q32 = (Q32) m105816c;
            if (q32 != null && (m89002f = q32.m89002f()) != null) {
                return m89002f;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Boolean bool = null;
        if (m105816c instanceof InspectionFlow) {
            Object m105816c2 = newItem.m105816c();
            if (m105816c2 instanceof InspectionFlow) {
                bool = m105816c2;
            }
            InspectionFlow inspectionFlow = (InspectionFlow) bool;
            if (inspectionFlow != null && ((InspectionFlow) m105816c).getBatteryLevel() == inspectionFlow.getBatteryLevel()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || !Intrinsics.areEqual(((InspectionFlow) m105816c).getMarker(), inspectionFlow.getMarker())) {
                return true;
            }
        } else if (m105816c instanceof Q32) {
            Object m105816c3 = newItem.m105816c();
            if (!(m105816c3 instanceof Q32)) {
                m105816c3 = null;
            }
            Q32 q32 = (Q32) m105816c3;
            Q32 q322 = (Q32) m105816c;
            Boolean m88999i = q322.m88999i();
            if (q32 != null) {
                bool = q32.m88999i();
            }
            if (!Intrinsics.areEqual(m88999i, bool)) {
                return true;
            }
            if (q32 != null && q322.m89003e() == q32.m89003e()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !Intrinsics.areEqual(q322.m88998j(), q32.m88998j())) {
                return true;
            }
        }
        return false;
    }
}
