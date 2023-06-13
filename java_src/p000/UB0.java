package p000;

import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.api.response.VehicleInventoryScanResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LUB0;", "LTB0;", "", "", "vehicleIds", "Lco/bird/android/model/constant/VehicleInventoryAction;", "action", "", "validateOnly", "Lio/reactivex/F;", "Lco/bird/api/response/VehicleInventoryScanResponse;", "t0", "LWB0;", C17296a.f69688o, "LWB0;", "coreInventoryRepo", "<init>", "(LWB0;)V", "co.bird.android.manager.core-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UB0 */
/* loaded from: classes4.dex */
public final class UB0 implements TB0 {

    /* renamed from: a */
    public final WB0 f36935a;

    public UB0(WB0 coreInventoryRepo) {
        Intrinsics.checkNotNullParameter(coreInventoryRepo, "coreInventoryRepo");
        this.f36935a = coreInventoryRepo;
    }

    @Override // p000.TB0
    /* renamed from: t0 */
    public AbstractC23442F<VehicleInventoryScanResponse> mo81892t0(List<String> vehicleIds, VehicleInventoryAction action, boolean z) {
        Intrinsics.checkNotNullParameter(vehicleIds, "vehicleIds");
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f36935a.mo77245t0(vehicleIds, action, z);
    }
}
