package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u001c\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;", "Lco/bird/android/vehiclescanner/common/mrp/a;", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/VehicleInventoryAction;", "K1", "", "c1", "I2", "b8", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "A1", "Lkotlin/Pair;", "", "V", "z1", "W", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public interface CoreInventoryScanRenderer extends InterfaceC16428a<CoreInventoryScanState> {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static void m58263a(CoreInventoryScanRenderer coreInventoryScanRenderer, CoreInventoryScanState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            InterfaceC16428a.C16429a.m54813a(coreInventoryScanRenderer, state);
        }
    }

    /* renamed from: A1 */
    Observable<WireVehicleInventoryScan> mo58271A1();

    /* renamed from: I2 */
    Observable<Unit> mo58270I2();

    /* renamed from: K1 */
    Observable<VehicleInventoryAction> mo58269K1();

    /* renamed from: V */
    Observable<Pair<WireVehicleInventoryScan, Boolean>> mo58268V();

    /* renamed from: W */
    Observable<Unit> mo58267W();

    /* renamed from: b8 */
    Observable<Unit> mo58266b8();

    /* renamed from: c1 */
    Observable<Unit> mo58265c1();

    /* renamed from: z1 */
    Observable<Unit> mo58264z1();
}
