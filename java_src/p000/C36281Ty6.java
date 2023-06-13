package p000;

import co.bird.android.model.Warehouse;
import co.bird.api.response.WarehouseValidationResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LTy6;", "LSy6;", "", "warehouseId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/Warehouse;", C17296a.f69688o, "Lco/bird/api/response/WarehouseValidationResponse;", "b", "LDy6;", "LDy6;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(LDy6;)V", "warehouse_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ty6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36281Ty6 implements InterfaceC36047Sy6 {

    /* renamed from: a */
    public final InterfaceC32537Dy6 f36569a;

    public C36281Ty6(InterfaceC32537Dy6 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f36569a = client;
    }

    @Override // p000.InterfaceC36047Sy6
    /* renamed from: a */
    public AbstractC23442F<HM4<Warehouse>> mo82208a(String warehouseId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        AbstractC23442F<HM4<Warehouse>> m33142Y = this.f36569a.m109563a(warehouseId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getWarehouseById(…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC36047Sy6
    /* renamed from: b */
    public AbstractC23442F<HM4<WarehouseValidationResponse>> mo82207b() {
        AbstractC23442F<HM4<WarehouseValidationResponse>> m33142Y = this.f36569a.m109562b().m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.validateWarehouse…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
