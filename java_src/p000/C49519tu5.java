package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireServiceCenterStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Ltu5;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServiceProgressUpdateAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressUpdateAdapterDiff.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,30:1\n18#2:31\n18#2:36\n18#2:41\n9#3,4:32\n9#3,4:37\n9#3,4:42\n*S KotlinDebug\n*F\n+ 1 ServiceProgressUpdateAdapterDiff.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateAdapterDiff\n*L\n17#1:31\n24#1:36\n25#1:41\n17#1:32,4\n24#1:37,4\n25#1:42,4\n*E\n"})
/* renamed from: tu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49519tu5 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        WireServiceCenterStatus wireServiceCenterStatus;
        ServiceCenterStatus status;
        String name;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C34740Nj4.item_vehicle_summary) {
            return "info";
        }
        if (m105817b == C45268mk4.item_button_secondary) {
            return "command_center";
        }
        if (m105817b == C45268mk4.view_list_header) {
            return "header";
        }
        if (m105817b == C34740Nj4.item_service_center_status) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null && (wireServiceCenterStatus = (WireServiceCenterStatus) pair.getFirst()) != null && (status = wireServiceCenterStatus.getStatus()) != null && (name = status.name()) != null) {
                return name;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Boolean bool2 = null;
        if (!(m105816c instanceof Pair)) {
            m105816c = null;
        }
        Pair pair = (Pair) m105816c;
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof Pair)) {
            m105816c2 = null;
        }
        Pair pair2 = (Pair) m105816c2;
        if (pair != null) {
            bool = (Boolean) pair.getSecond();
        } else {
            bool = null;
        }
        if (pair2 != null) {
            bool2 = (Boolean) pair2.getSecond();
        }
        return !Intrinsics.areEqual(bool, bool2);
    }
}
