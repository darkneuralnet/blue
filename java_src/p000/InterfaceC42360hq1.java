package p000;

import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000f"}, m28432d2 = {"Lhq1;", "LbI4;", "", "fleetId", "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lio/reactivex/c;", "u", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FleetReport;", "k0", "", "x1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hq1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC42360hq1 extends InterfaceC38466bI4 {
    /* renamed from: k0 */
    Observable<FleetReport> mo29850k0(String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage);

    /* renamed from: u */
    AbstractC23461c mo29849u(String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage);

    /* renamed from: x1 */
    Observable<List<FleetReportPeriod>> mo29848x1(String str, FleetReportPage fleetReportPage);
}
