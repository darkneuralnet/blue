package p000;

import co.bird.android.model.PastWorkOrderButton;
import co.bird.android.model.UpdateServiceProgressButton;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"LSk6;", "LrA;", "LG6;", "adapterItem", "", "b", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleDetailsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapterDiff.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,26:1\n18#2:27\n18#2:32\n9#3,4:28\n9#3,4:33\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapterDiff.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapterDiff\n*L\n17#1:27\n20#1:32\n17#1:28,4\n20#1:33,4\n*E\n"})
/* renamed from: Sk6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35921Sk6 extends AbstractC27859rA {
    @Override // p000.AbstractC27859rA, p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        WireBird bird;
        String id;
        PastWorkOrderButton m64690b;
        WorkOrder workOrder;
        String id2;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C45851nj4.item_vehicle_summary) {
            return "info";
        }
        if (m105817b == C36369Ui4.item_command_center_service_center) {
            return "service";
        }
        C38474bJ3 c38474bJ3 = null;
        if (m105817b == C36369Ui4.item_command_center_past_work_order) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof C38474bJ3) {
                c38474bJ3 = m105816c;
            }
            C38474bJ3 c38474bJ32 = c38474bJ3;
            if (c38474bJ32 != null && (m64690b = c38474bJ32.m64690b()) != null && (workOrder = m64690b.getWorkOrder()) != null && (id2 = workOrder.getId()) != null) {
                return id2;
            }
        } else if (m105817b == C36369Ui4.item_button_drop_down_brand_outline) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof UpdateServiceProgressButton) {
                c38474bJ3 = m105816c2;
            }
            UpdateServiceProgressButton updateServiceProgressButton = c38474bJ3;
            if (updateServiceProgressButton != null && (bird = updateServiceProgressButton.getBird()) != null && (id = bird.getId()) != null) {
                return id;
            }
        } else {
            return super.mo29b(adapterItem);
        }
        return "";
    }
}
