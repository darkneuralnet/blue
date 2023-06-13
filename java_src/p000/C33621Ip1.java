package p000;

import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LIp1;", "LHp1;", "", "fleetId", "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lio/reactivex/c;", "u", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FleetReport;", "k0", "", "l0", "Lhq1;", C17296a.f69688o, "Lhq1;", "repo", "<init>", "(Lhq1;)V", "co.bird.android.manager.fleet-report"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ip1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33621Ip1 implements InterfaceC33387Hp1 {

    /* renamed from: a */
    public final InterfaceC42360hq1 f16255a;

    public C33621Ip1(InterfaceC42360hq1 repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f16255a = repo;
    }

    @Override // p000.InterfaceC33387Hp1
    /* renamed from: k0 */
    public Observable<FleetReport> mo101659k0(String fleetId, FleetReportPeriod period, FleetReportPage fleetReportPage) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(period, "period");
        Observable<FleetReport> subscribeOn = this.f16255a.mo29850k0(fleetId, period, fleetReportPage).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamFleetReport(\n…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC33387Hp1
    /* renamed from: l0 */
    public Observable<List<FleetReportPeriod>> mo101658l0(String fleetId, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        Observable<List<FleetReportPeriod>> subscribeOn = this.f16255a.mo29848x1(fleetId, page).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamFleetReportPe…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC33387Hp1
    /* renamed from: u */
    public AbstractC23461c mo101657u(String fleetId, FleetReportPeriod fleetReportPeriod, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        AbstractC23461c m33063X = this.f16255a.mo29849u(fleetId, fleetReportPeriod, page).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchFleetReport(\n …scribeOn(Schedulers.io())");
        return m33063X;
    }
}
