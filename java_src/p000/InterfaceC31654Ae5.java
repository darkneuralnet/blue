package p000;

import co.bird.android.model.BleScannedVehicle;
import co.bird.android.model.VehicleDescriptor;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¨\u0006\u0010"}, m28432d2 = {"LAe5;", "", "", "scanTime", "Ljava/util/concurrent/TimeUnit;", "scanTimeUnit", "Lio/reactivex/k;", "LTk5;", C17296a.f69688o, "Lco/bird/android/model/VehicleDescriptor;", "vehicleDescriptor", "", "checkCache", "Lio/reactivex/F;", "Lco/bird/android/model/BleScannedVehicle;", "b", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ae5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC31654Ae5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ae5$a */
    /* loaded from: classes2.dex */
    public static final class C0167a {
        public static /* synthetic */ AbstractC23442F scan$default(InterfaceC31654Ae5 interfaceC31654Ae5, VehicleDescriptor vehicleDescriptor, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC31654Ae5.mo106811b(vehicleDescriptor, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scan");
        }
    }

    /* renamed from: a */
    AbstractC24490k<C36154Tk5> mo106812a(long j, TimeUnit timeUnit);

    /* renamed from: b */
    AbstractC23442F<BleScannedVehicle> mo106811b(VehicleDescriptor vehicleDescriptor, boolean z);
}
