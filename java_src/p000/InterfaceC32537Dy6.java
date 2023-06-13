package p000;

import co.bird.android.model.Warehouse;
import co.bird.api.response.WarehouseValidationResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004H'¨\u0006\n"}, m28432d2 = {"LDy6;", "", "", "warehouseId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/Warehouse;", C17296a.f69688o, "Lco/bird/api/response/WarehouseValidationResponse;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC32537Dy6 {
    @NA1("warehouse/by-id")
    /* renamed from: a */
    AbstractC23442F<HM4<Warehouse>> m109563a(@InterfaceC37017Xc4("warehouse_id") String str);

    @NA1("warehouse/validate-user-location")
    /* renamed from: b */
    AbstractC23442F<HM4<WarehouseValidationResponse>> m109562b();
}
