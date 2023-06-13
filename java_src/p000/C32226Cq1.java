package p000;

import co.bird.android.model.persistence.FleetList;
import co.bird.android.model.persistence.FleetListSection;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.FleetStatus;
import co.bird.android.model.persistence.FleetStatusSummary;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J,\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"LCq1;", "LBq1;", "Lio/reactivex/c;", "w0", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/FleetStatusSummary;", "x0", "", "fleetId", "v0", "y0", "", "includePredictions", "Lco/bird/android/model/persistence/FleetStatus;", "k", "list", AbstractC26684u0.f100690q, "Lco/bird/android/model/persistence/FleetList;", "J", "Lco/bird/android/model/persistence/FleetListSection;", "q0", "section", "Lco/bird/android/model/persistence/FleetListVehicle;", "H", "birdIds", "z", "c", "Ler1;", C17296a.f69688o, "Ler1;", "repo", "<init>", "(Ler1;)V", "co.bird.android.manager.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32226Cq1 implements InterfaceC31992Bq1 {

    /* renamed from: a */
    public final InterfaceC40591er1 f4799a;

    public C32226Cq1(InterfaceC40591er1 repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f4799a = repo;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: H */
    public Observable<List<FleetListVehicle>> mo111432H(String fleetId, String list, String section) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(section, "section");
        Observable<List<FleetListVehicle>> subscribeOn = this.f4799a.mo22325H(fleetId, list, section).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamFleetListVehi…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: J */
    public Observable<FleetList> mo111431J(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Observable<FleetList> subscribeOn = this.f4799a.mo22324J(fleetId, list).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamFleetList(fle…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: c */
    public Observable<List<FleetListVehicle>> mo111430c(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        Observable<List<FleetListVehicle>> subscribeOn = this.f4799a.mo22305c(birdIds).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamVehiclesForRa…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: k */
    public Observable<List<FleetStatus>> mo111429k(String fleetId, boolean z) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Observable<List<FleetStatus>> subscribeOn = this.f4799a.mo22303k(fleetId, z).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamFleetStatusBy…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: q0 */
    public Observable<List<FleetListSection>> mo111428q0(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Observable<List<FleetListSection>> subscribeOn = this.f4799a.mo22302q0(fleetId, list).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamFleetListSect…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: u0 */
    public AbstractC23461c mo111427u0(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        AbstractC23461c m33063X = this.f4799a.mo22301u0(fleetId, list).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchFleetList(flee…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: v0 */
    public AbstractC23461c mo111426v0(String fleetId) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        AbstractC23461c m33063X = this.f4799a.mo22327A1(fleetId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchFleetStatusByI…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: w0 */
    public AbstractC23461c mo111425w0() {
        AbstractC23461c m33063X = this.f4799a.mo22304i1().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchFleetStatusSum…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: x0 */
    public Observable<List<FleetStatusSummary>> mo111424x0() {
        Observable<List<FleetStatusSummary>> subscribeOn = this.f4799a.mo22319N0().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamFleetStatusSu…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: y0 */
    public AbstractC23461c mo111423y0(String fleetId) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        AbstractC23461c m33063X = this.f4799a.mo22326D1(fleetId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchFleetStatusPre…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC31992Bq1
    /* renamed from: z */
    public AbstractC23461c mo111422z(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23461c m33063X = this.f4799a.mo22300z(birdIds).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchVehiclesForRat…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
