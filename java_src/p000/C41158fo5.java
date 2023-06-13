package p000;

import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.constant.ScrapRequestReviewStatus;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.ScrapCompleteRequestBody;
import co.bird.api.request.VehicleScrapRequestCreateRequest;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J<\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lfo5;", "Leo5;", "", "birdId", "Lco/bird/android/model/constant/ScrapRequestReviewStatus;", "status", "Lio/reactivex/F;", "LHM4;", "", "Lco/bird/android/model/VehicleScrapRequest;", C17296a.f69688o, "Lco/bird/android/model/wire/WireBird;", "bird", "imageAssetIds", "Lco/bird/android/model/constant/ScrapRequestReason;", "requestReason", "requestDetails", "c", "Lio/reactivex/c;", "b", "Lgn5;", "Lgn5;", "scrapClient", "<init>", "(Lgn5;)V", "co.bird.android.manager.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fo5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41158fo5 implements InterfaceC40565eo5 {

    /* renamed from: a */
    public final InterfaceC41741gn5 f80737a;

    public C41158fo5(InterfaceC41741gn5 scrapClient) {
        Intrinsics.checkNotNullParameter(scrapClient, "scrapClient");
        this.f80737a = scrapClient;
    }

    @Override // p000.InterfaceC40565eo5
    /* renamed from: a */
    public AbstractC23442F<HM4<List<VehicleScrapRequest>>> mo40801a(String birdId, ScrapRequestReviewStatus scrapRequestReviewStatus) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<List<VehicleScrapRequest>>> m33142Y = this.f80737a.m37479a(birdId, scrapRequestReviewStatus).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "scrapClient.getScrapRequ…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC40565eo5
    /* renamed from: b */
    public AbstractC23461c mo40800b(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f80737a.m37478b(new ScrapCompleteRequestBody(birdId)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "scrapClient.completeScra…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC40565eo5
    /* renamed from: c */
    public AbstractC23442F<HM4<VehicleScrapRequest>> mo40799c(WireBird bird, List<String> imageAssetIds, ScrapRequestReason requestReason, String str) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(imageAssetIds, "imageAssetIds");
        Intrinsics.checkNotNullParameter(requestReason, "requestReason");
        AbstractC23442F<HM4<VehicleScrapRequest>> m33142Y = this.f80737a.m37477c(new VehicleScrapRequestCreateRequest(bird.getId(), imageAssetIds, requestReason, str, null, 16, null)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "scrapClient.createScrapR…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
