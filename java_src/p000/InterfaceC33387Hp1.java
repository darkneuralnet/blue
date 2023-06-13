package p000;

import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000f"}, m28432d2 = {"LHp1;", "", "", "fleetId", "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lio/reactivex/c;", "u", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FleetReport;", "k0", "", "l0", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hp1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC33387Hp1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hp1$a */
    /* loaded from: classes2.dex */
    public static final class C3233a {
        public static /* synthetic */ AbstractC23461c fetchFleetReport$default(InterfaceC33387Hp1 interfaceC33387Hp1, String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    fleetReportPeriod = null;
                }
                if ((i & 4) != 0) {
                    fleetReportPage = FleetReportPage.CORE;
                }
                return interfaceC33387Hp1.mo101657u(str, fleetReportPeriod, fleetReportPage);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFleetReport");
        }
    }

    /* renamed from: k0 */
    Observable<FleetReport> mo101659k0(String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage);

    /* renamed from: l0 */
    Observable<List<FleetReportPeriod>> mo101658l0(String str, FleetReportPage fleetReportPage);

    /* renamed from: u */
    AbstractC23461c mo101657u(String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage);
}
