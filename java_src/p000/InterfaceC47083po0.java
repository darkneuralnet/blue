package p000;

import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J.\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H&¨\u0006\u0018"}, m28432d2 = {"Lpo0;", "LaM5;", "LH31;", "LS74;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/ServiceCenterStatus;", "status", "", "yj", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lco/bird/android/model/VehicleScrapRequest;", "scrapRequest", "ek", "", "visible", "Oj", "Lio/reactivex/Observable;", "Lco/bird/android/model/CommandCenterButton;", "oh", "C0", "Lio/reactivex/F;", "K", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: po0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47083po0 extends InterfaceC37910aM5, H31, S74 {
    /* renamed from: C0 */
    Observable<Unit> mo13654C0();

    /* renamed from: K */
    AbstractC23442F<Unit> mo13653K();

    /* renamed from: Oj */
    void mo13652Oj(boolean z);

    /* renamed from: ek */
    void mo13644ek(WireBird wireBird, ServiceCenterStatus serviceCenterStatus, WorkOrder workOrder, VehicleScrapRequest vehicleScrapRequest);

    /* renamed from: oh */
    Observable<CommandCenterButton> mo13643oh();

    /* renamed from: yj */
    void mo13642yj(WireBird wireBird, ServiceCenterStatus serviceCenterStatus);
}
