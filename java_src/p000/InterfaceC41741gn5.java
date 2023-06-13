package p000;

import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.constant.ScrapRequestReviewStatus;
import co.bird.api.request.ScrapCompleteRequestBody;
import co.bird.api.request.VehicleScrapRequestCreateRequest;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J0\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nH'J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¨\u0006\u0011"}, m28432d2 = {"Lgn5;", "", "Lco/bird/api/request/VehicleScrapRequestCreateRequest;", "body", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/VehicleScrapRequest;", "c", "", "birdId", "Lco/bird/android/model/constant/ScrapRequestReviewStatus;", "status", "", C17296a.f69688o, "Lco/bird/api/request/ScrapCompleteRequestBody;", "Lio/reactivex/c;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gn5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC41741gn5 {
    @NA1("scrap-requests/by-bird-id")
    /* renamed from: a */
    AbstractC23442F<HM4<List<VehicleScrapRequest>>> m37479a(@InterfaceC37017Xc4("bird_id") String str, @InterfaceC37017Xc4("status") ScrapRequestReviewStatus scrapRequestReviewStatus);

    @AD3("scrap-requests/log-complete")
    /* renamed from: b */
    AbstractC23461c m37478b(@InterfaceC6404PY ScrapCompleteRequestBody scrapCompleteRequestBody);

    @AD3("scrap-requests/create")
    /* renamed from: c */
    AbstractC23442F<HM4<VehicleScrapRequest>> m37477c(@InterfaceC6404PY VehicleScrapRequestCreateRequest vehicleScrapRequestCreateRequest);
}
