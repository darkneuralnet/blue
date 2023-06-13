package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireHydratedRoute;
import co.bird.android.model.wire.WireRoute;
import co.bird.api.request.BirdRouteInspectionPassedRequestBody;
import co.bird.api.request.BirdRouteUpdateRequestBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Luc5;", "Ltc5;", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireRoute;", "c", "Lco/bird/android/model/constant/ServiceCenterRoute;", "currentRoute", "", C17296a.f69688o, "route", "e", "Lco/bird/android/model/wire/WireHydratedRoute;", "b", DateTokenConverter.CONVERTER_KEY, "Lnc5;", "Lnc5;", "routingClient", "<init>", "(Lnc5;)V", "co.bird.android.manager.routing"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uc5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49932uc5 implements InterfaceC49339tc5 {

    /* renamed from: a */
    public final InterfaceC45782nc5 f112667a;

    public C49932uc5(InterfaceC45782nc5 routingClient) {
        Intrinsics.checkNotNullParameter(routingClient, "routingClient");
        this.f112667a = routingClient;
    }

    @Override // p000.InterfaceC49339tc5
    /* renamed from: a */
    public AbstractC23442F<HM4<List<WireRoute>>> mo9967a(String birdId, ServiceCenterRoute currentRoute) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(currentRoute, "currentRoute");
        AbstractC23442F<HM4<List<WireRoute>>> m33142Y = this.f112667a.m23432a(birdId, currentRoute).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "routingClient.routeOptio…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC49339tc5
    /* renamed from: b */
    public AbstractC23442F<HM4<List<WireHydratedRoute>>> mo9966b(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<List<WireHydratedRoute>>> m33142Y = this.f112667a.m23431b(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "routingClient.timelineFo…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC49339tc5
    /* renamed from: c */
    public AbstractC23442F<HM4<WireRoute>> mo9965c(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<WireRoute>> m33142Y = this.f112667a.m23430c(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "routingClient.currentRou…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC49339tc5
    /* renamed from: d */
    public AbstractC23442F<HM4<WireRoute>> mo9964d(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<WireRoute>> m33142Y = this.f112667a.m23428e(new BirdRouteInspectionPassedRequestBody(birdId)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "routingClient.routeInspe…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC49339tc5
    /* renamed from: e */
    public AbstractC23442F<HM4<WireRoute>> mo9963e(String birdId, ServiceCenterRoute route) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(route, "route");
        AbstractC23442F<HM4<WireRoute>> m33142Y = this.f112667a.m23429d(new BirdRouteUpdateRequestBody(birdId, route)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "routingClient.routeBird(…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
