package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.NearbyBirdViewModel;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lx13;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsAdapterDiff.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,24:1\n18#2:25\n18#2:30\n18#2:35\n9#3,4:26\n9#3,4:31\n9#3,4:36\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsAdapterDiff.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapterDiff\n*L\n12#1:25\n18#1:30\n19#1:35\n12#1:26,4\n18#1:31,4\n19#1:36,4\n*E\n"})
/* renamed from: x13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51364x13 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        Vehicle vehicle;
        WireBird bird;
        String code;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        if (adapterItem.m105817b() != C39311cj4.item_nearby_bird) {
            return "";
        }
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof NearbyBirdViewModel)) {
            m105816c = null;
        }
        NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) m105816c;
        if (nearbyBirdViewModel == null || (vehicle = nearbyBirdViewModel.getVehicle()) == null || (bird = vehicle.getBird()) == null || (code = bird.getCode()) == null) {
            return "";
        }
        return code;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Integer num;
        Vehicle vehicle;
        Vehicle vehicle2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Integer num2 = null;
        if (!(m105816c instanceof NearbyBirdViewModel)) {
            m105816c = null;
        }
        NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) m105816c;
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof NearbyBirdViewModel)) {
            m105816c2 = null;
        }
        NearbyBirdViewModel nearbyBirdViewModel2 = (NearbyBirdViewModel) m105816c2;
        if (nearbyBirdViewModel != null && (vehicle2 = nearbyBirdViewModel.getVehicle()) != null) {
            num = vehicle2.getRssi();
        } else {
            num = null;
        }
        if (nearbyBirdViewModel2 != null && (vehicle = nearbyBirdViewModel2.getVehicle()) != null) {
            num2 = vehicle.getRssi();
        }
        return !Intrinsics.areEqual(num, num2);
    }
}
