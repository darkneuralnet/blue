package p000;

import co.bird.api.request.InventoryCountAdjustBinsRequestBody;
import co.bird.api.request.InventoryCountAdjustExcessQuantityRequestBody;
import co.bird.api.response.WarehouseInventory;
import co.bird.api.response.WireInventoryCount;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J4\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LJ82;", "LI82;", "", "warehouseId", "sku", "Lio/reactivex/F;", "Lco/bird/api/response/WarehouseInventory;", C17296a.f69688o, "", "binAdjustmentAmount", "userId", "LHM4;", "Lco/bird/api/response/WireInventoryCount;", "c", "excessQuantityAdjustmentAmount", "b", "LRy6;", "LRy6;", "warehouseInventoryClient", "LU72;", "LU72;", "inventoryCountClient", "<init>", "(LRy6;LU72;)V", "inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: J82 */
/* loaded from: classes4.dex */
public final class J82 implements I82 {

    /* renamed from: a */
    public final InterfaceC35813Ry6 f16881a;

    /* renamed from: b */
    public final U72 f16882b;

    public J82(InterfaceC35813Ry6 warehouseInventoryClient, U72 inventoryCountClient) {
        Intrinsics.checkNotNullParameter(warehouseInventoryClient, "warehouseInventoryClient");
        Intrinsics.checkNotNullParameter(inventoryCountClient, "inventoryCountClient");
        this.f16881a = warehouseInventoryClient;
        this.f16882b = inventoryCountClient;
    }

    @Override // p000.I82
    /* renamed from: a */
    public AbstractC23442F<WarehouseInventory> mo101099a(String warehouseId, String sku) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        AbstractC23442F<WarehouseInventory> m33142Y = this.f16881a.m86153a(warehouseId, sku).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "warehouseInventoryClient…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.I82
    /* renamed from: b */
    public AbstractC23442F<HM4<WireInventoryCount>> mo101098b(String sku, int i) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return this.f16882b.m81944a(new InventoryCountAdjustExcessQuantityRequestBody(sku, i));
    }

    @Override // p000.I82
    /* renamed from: c */
    public AbstractC23442F<HM4<WireInventoryCount>> mo101097c(String warehouseId, String sku, int i, String userId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return this.f16882b.m81943b(new InventoryCountAdjustBinsRequestBody(warehouseId, sku, i, userId));
    }
}
