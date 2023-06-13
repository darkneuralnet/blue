package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R(\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0005\u001e\u001f !\"¨\u0006#"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", "LIx5;", "Lco/bird/android/model/constant/VehicleInventoryAction;", "getAction", "()Lco/bird/android/model/constant/VehicleInventoryAction;", "action", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "l", "()Ljava/util/List;", "vehicleScans", "f", "()Z", "processEnabled", "", C17296a.f69688o, "()Ljava/lang/String;", "warehouse", "", "m", "()I", "loadingCount", "b", "unprocessedCount", "", "getError", "()Ljava/lang/Throwable;", "error", "Lco/bird/android/feature/coreinventory/scan/AlertDisabledEmpty;", "Lco/bird/android/feature/coreinventory/scan/AlertDisabledError;", "Lco/bird/android/feature/coreinventory/scan/ConfirmExit;", "Lco/bird/android/feature/coreinventory/scan/ConfirmProcessing;", "Lco/bird/android/feature/coreinventory/scan/UpdateUi;", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public interface CoreInventoryScanState extends InterfaceC33697Ix5 {
    /* renamed from: a */
    String mo58262a();

    /* renamed from: b */
    int mo58261b();

    /* renamed from: f */
    boolean mo58260f();

    VehicleInventoryAction getAction();

    Throwable getError();

    /* renamed from: l */
    List<Pair<WireVehicleInventoryScan, Boolean>> mo58259l();

    /* renamed from: m */
    int mo58258m();
}
