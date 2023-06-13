package p000;

import co.bird.android.model.Vehicle;
import co.bird.api.request.BLEScanTrigger;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
@Deprecated(message = "Do not use this manager any more. Implement scan() in RxBleVehicleManager", replaceWith = @ReplaceWith(expression = "RxBleVehicleManager", imports = {}))
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\u000b"}, m28432d2 = {"Llp2;", "", "Lco/bird/api/request/BLEScanTrigger;", "bleTrigger", "Lio/reactivex/k;", "Lco/bird/android/model/Vehicle;", "b", "vehicle", "Lio/reactivex/Observable;", "", C17296a.f69688o, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lp2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC44723lp2 {
    /* renamed from: a */
    Observable<Boolean> mo11727a(Vehicle vehicle);

    /* renamed from: b */
    AbstractC24490k<Vehicle> mo11726b(BLEScanTrigger bLEScanTrigger);
}
