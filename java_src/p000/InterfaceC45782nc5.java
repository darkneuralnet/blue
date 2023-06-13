package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireHydratedRoute;
import co.bird.android.model.wire.WireRoute;
import co.bird.api.request.BirdRouteInspectionPassedRequestBody;
import co.bird.api.request.BirdRouteUpdateRequestBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J.\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'J$\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\u0011H'¨\u0006\u0013"}, m28432d2 = {"Lnc5;", "", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireRoute;", "c", "Lco/bird/android/model/constant/ServiceCenterRoute;", "currentRoute", "", C17296a.f69688o, "Lco/bird/api/request/BirdRouteUpdateRequestBody;", "body", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireHydratedRoute;", "b", "Lco/bird/api/request/BirdRouteInspectionPassedRequestBody;", "e", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nc5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC45782nc5 {
    @NA1("routing/options")
    /* renamed from: a */
    AbstractC23442F<HM4<List<WireRoute>>> m23432a(@InterfaceC37017Xc4("bird_id") String str, @InterfaceC37017Xc4("current_route") ServiceCenterRoute serviceCenterRoute);

    @NA1("routing/timeline")
    /* renamed from: b */
    AbstractC23442F<HM4<List<WireHydratedRoute>>> m23431b(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("routing/current-route")
    /* renamed from: c */
    AbstractC23442F<HM4<WireRoute>> m23430c(@InterfaceC37017Xc4("bird_id") String str);

    @CD3("routing/route-bird")
    /* renamed from: d */
    AbstractC23442F<HM4<WireRoute>> m23429d(@InterfaceC6404PY BirdRouteUpdateRequestBody birdRouteUpdateRequestBody);

    @CD3("routing/route-inspection-passed-bird")
    /* renamed from: e */
    AbstractC23442F<HM4<WireRoute>> m23428e(@InterfaceC6404PY BirdRouteInspectionPassedRequestBody birdRouteInspectionPassedRequestBody);
}
