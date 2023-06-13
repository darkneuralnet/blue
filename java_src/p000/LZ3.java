package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.persistence.FleetStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LLZ3;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPredictionAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionAdapterDiff.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/PredictionAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,19:1\n18#2:20\n9#3,4:21\n*S KotlinDebug\n*F\n+ 1 PredictionAdapterDiff.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/PredictionAdapterDiff\n*L\n12#1:20\n12#1:21,4\n*E\n"})
/* renamed from: LZ3 */
/* loaded from: classes3.dex */
public final class LZ3 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String predictionId;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        if (adapterItem.m105817b() != C38125aj4.item_fleet_status_prediction) {
            return "";
        }
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof FleetStatus)) {
            m105816c = null;
        }
        FleetStatus fleetStatus = (FleetStatus) m105816c;
        if (fleetStatus == null || (predictionId = fleetStatus.getPredictionId()) == null) {
            return "";
        }
        return predictionId;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }
}
