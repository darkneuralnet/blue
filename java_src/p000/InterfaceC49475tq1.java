package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireFleetList;
import co.bird.api.request.BirdsByRatingBody;
import co.bird.api.response.FleetStatusListResponse;
import co.bird.api.response.FleetStatusPredictionResponse;
import co.bird.api.response.FleetStatusResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0005H'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¨\u0006\u0011"}, m28432d2 = {"Ltq1;", "", "Lio/reactivex/F;", "Lco/bird/api/response/FleetStatusListResponse;", "c", "", "fleetId", "Lco/bird/api/response/FleetStatusResponse;", C17296a.f69688o, "Lco/bird/api/response/FleetStatusPredictionResponse;", DateTokenConverter.CONVERTER_KEY, "substate", "Lco/bird/android/model/wire/WireFleetList;", "b", "Lco/bird/api/request/BirdsByRatingBody;", "body", "e", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49475tq1 {
    @NA1("fleet-status/current")
    /* renamed from: a */
    AbstractC23442F<FleetStatusResponse> m11696a(@InterfaceC37017Xc4("fleet_id") String str);

    @NA1("fleet-status/v2/birds/by-substate")
    /* renamed from: b */
    AbstractC23442F<WireFleetList> m11695b(@InterfaceC37017Xc4("fleet_id") String str, @InterfaceC37017Xc4("substate") String str2);

    @NA1("fleet-status")
    /* renamed from: c */
    AbstractC23442F<FleetStatusListResponse> m11694c();

    @NA1("fleet-status/predictions")
    /* renamed from: d */
    AbstractC23442F<FleetStatusPredictionResponse> m11693d(@InterfaceC37017Xc4("fleet_id") String str);

    @AD3("fleet-status/birds/by-rating")
    /* renamed from: e */
    AbstractC23442F<WireFleetList> m11692e(@InterfaceC6404PY BirdsByRatingBody birdsByRatingBody);
}
