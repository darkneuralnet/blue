package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.RepairFlow;
import co.bird.android.model.RepairFlowStatus;
import co.bird.api.request.InspectionUpdateRequestBody;
import co.bird.api.request.RepairUpdateRequestBody;
import co.bird.api.request.VehicleIdRequestBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\n\u001a\u00020\u000eH'J\u0012\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\u0010H'¨\u0006\u0013"}, m28432d2 = {"Lqn6;", "", "", "vehicleId", "Lio/reactivex/F;", "Lco/bird/android/model/RepairFlowStatus;", C17296a.f69688o, "Lco/bird/android/model/InspectionFlow;", "c", "Lco/bird/api/request/InspectionUpdateRequestBody;", "body", "f", "Lco/bird/android/model/RepairFlow;", "b", "Lco/bird/api/request/RepairUpdateRequestBody;", "e", "Lco/bird/api/request/VehicleIdRequestBody;", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qn6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47672qn6 {
    @NA1("repair-flow/status")
    /* renamed from: a */
    AbstractC23442F<RepairFlowStatus> m17051a(@InterfaceC37017Xc4("vehicle_id") String str);

    @NA1("repair-flow/by-vehicle-id")
    /* renamed from: b */
    AbstractC23442F<RepairFlow> m17050b(@InterfaceC37017Xc4("vehicle_id") String str);

    @NA1("inspection-flow/by-vehicle-id")
    /* renamed from: c */
    AbstractC23442F<InspectionFlow> m17049c(@InterfaceC37017Xc4("vehicle_id") String str);

    @AD3("repair-flow/finish")
    /* renamed from: d */
    AbstractC23461c m17048d(@InterfaceC6404PY VehicleIdRequestBody vehicleIdRequestBody);

    @AD3("repair-flow/update")
    /* renamed from: e */
    AbstractC23442F<RepairFlow> m17047e(@InterfaceC6404PY RepairUpdateRequestBody repairUpdateRequestBody);

    @AD3("inspection-flow/update")
    /* renamed from: f */
    AbstractC23442F<InspectionFlow> m17046f(@InterfaceC6404PY InspectionUpdateRequestBody inspectionUpdateRequestBody);
}
