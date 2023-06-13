package p000;

import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH'J\b\u0010\u0010\u001a\u00020\u0005H'¨\u0006\u0013"}, m28432d2 = {"Lzp1;", "", "", "Lco/bird/android/model/persistence/FleetReport;", "reports", "Lio/reactivex/c;", "c", "([Lco/bird/android/model/persistence/FleetReport;)Lio/reactivex/c;", "", "fleetId", "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lio/reactivex/Observable;", "b", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.fleet-report.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC53022zp1 {
    public static /* synthetic */ Observable fleetReport$default(AbstractC53022zp1 abstractC53022zp1, String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                fleetReportPage = null;
            }
            return abstractC53022zp1.mo401b(str, fleetReportPeriod, fleetReportPage);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fleetReport");
    }

    /* renamed from: a */
    public abstract AbstractC23461c mo402a();

    /* renamed from: b */
    public abstract Observable<FleetReport> mo401b(String str, FleetReportPeriod fleetReportPeriod, FleetReportPage fleetReportPage);

    /* renamed from: c */
    public abstract AbstractC23461c mo400c(FleetReport... fleetReportArr);
}
