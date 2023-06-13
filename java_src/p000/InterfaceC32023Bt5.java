package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Warehouse;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.api.request.ServiceCenterEventBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'J.\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00030\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0007H'¨\u0006\u0015"}, m28432d2 = {"LBt5;", "", "Lio/reactivex/F;", "LHM4;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "e", "", "birdId", "b", "Lco/bird/api/request/ServiceCenterEventBody;", "body", "", "c", "", "latitude", "longitude", "Lco/bird/android/model/Warehouse;", DateTokenConverter.CONVERTER_KEY, "warehouseId", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Bt5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC32023Bt5 {
    @NA1("warehouse/{warehouseId}")
    /* renamed from: a */
    AbstractC23442F<HM4<Warehouse>> m113403a(@InterfaceC39678dJ3("warehouseId") String str);

    @NA1("service-center/status-for-bird")
    /* renamed from: b */
    AbstractC23442F<HM4<WireServiceCenterStatus>> m113402b(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("service-center/event")
    /* renamed from: c */
    AbstractC23442F<HM4<Unit>> m113401c(@InterfaceC6404PY ServiceCenterEventBody serviceCenterEventBody);

    @NA1("service-center/nearby-warehouses")
    /* renamed from: d */
    AbstractC23442F<HM4<List<Warehouse>>> m113400d(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2);

    @NA1("service-center/statuses")
    /* renamed from: e */
    AbstractC23442F<HM4<List<WireServiceCenterStatus>>> m113399e();
}
