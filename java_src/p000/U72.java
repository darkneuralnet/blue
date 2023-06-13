package p000;

import co.bird.api.request.InventoryCountAdjustBinsRequestBody;
import co.bird.api.request.InventoryCountAdjustExcessQuantityRequestBody;
import co.bird.api.response.WireInventoryCount;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¨\u0006\n"}, m28432d2 = {"LU72;", "", "Lco/bird/api/request/InventoryCountAdjustBinsRequestBody;", "body", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/WireInventoryCount;", "b", "Lco/bird/api/request/InventoryCountAdjustExcessQuantityRequestBody;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U72 */
/* loaded from: classes4.dex */
public interface U72 {
    @CD3("inventory-counts/adjust-excess-quantity")
    /* renamed from: a */
    AbstractC23442F<HM4<WireInventoryCount>> m81944a(@InterfaceC6404PY InventoryCountAdjustExcessQuantityRequestBody inventoryCountAdjustExcessQuantityRequestBody);

    @CD3("inventory-counts/adjust-bins")
    /* renamed from: b */
    AbstractC23442F<HM4<WireInventoryCount>> m81943b(@InterfaceC6404PY InventoryCountAdjustBinsRequestBody inventoryCountAdjustBinsRequestBody);
}
