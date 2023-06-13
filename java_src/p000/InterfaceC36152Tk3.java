package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdScan;
import co.bird.android.model.OperatorRideHistoryItem;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBountyFlightSheetDetails;
import co.bird.android.model.wire.WireFlightSheetDetails;
import co.bird.android.model.wire.WireNestFlightSheetDetails;
import co.bird.android.model.wire.WireOperatorActivityLogDetails;
import co.bird.android.model.wire.WireWarehouseFlightSheetDetails;
import co.bird.android.model.wire.WireZoneFlightSheetDetails;
import co.bird.api.request.BirdIdBody;
import co.bird.api.request.HibernationStatusRequest;
import co.bird.api.request.OperatorBatchActionRequest;
import co.bird.api.request.OperatorBirdActionRequest;
import co.bird.api.request.OperatorMapRequest;
import co.bird.api.request.OperatorMapWarehouseRequest;
import co.bird.api.request.OperatorUpdateLocationBody;
import co.bird.api.request.ScanBody;
import co.bird.api.request.ZoneDataRequest;
import co.bird.api.request.ZoneRegionRequest;
import co.bird.api.response.HibernationStatusResponse;
import co.bird.api.response.OperatorAttributesResponse;
import co.bird.api.response.OperatorBatchActionResponse;
import co.bird.api.response.OperatorBatchStatusResponse;
import co.bird.api.response.OperatorBirdResponse;
import co.bird.api.response.OperatorFiltersResponse;
import co.bird.api.response.OperatorMapDemandInsightResponse;
import co.bird.api.response.OperatorMapNestResponse;
import co.bird.api.response.OperatorMapResponse;
import co.bird.api.response.OperatorMapWarehouseResponse;
import co.bird.api.response.OperatorTaskResponse;
import co.bird.api.response.PagedCollection;
import co.bird.api.response.WireRatingHistoryResponse;
import co.bird.api.response.ZoneDataResponse;
import co.bird.api.response.ZoneRegionResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\t\u001a\u00020\fH'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\t\u001a\u00020\u000fH'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\t\u001a\u00020\u0012H'J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u0015H'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004H'J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H'J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004H'J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0004H'J,\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0002H'J\u001e\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020&H'J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\b\b\u0001\u0010)\u001a\u00020\u0002H'JC\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u00050\u00042\b\b\u0001\u0010,\u001a\u00020\u00022\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010-H'¢\u0006\u0004\b2\u00103J\u001e\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00050\u00042\b\b\u0001\u0010\t\u001a\u000204H'J\u001e\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u00042\b\b\u0001\u00108\u001a\u000207H'J\u001e\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00050\u00042\b\b\u0001\u00108\u001a\u00020;H'J\"\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010>\u001a\u00020\u0002H'J\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00042\b\b\u0001\u0010A\u001a\u00020\u0002H'J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00042\b\b\u0001\u0010D\u001a\u00020\u0002H'J\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00042\b\b\u0001\u0010G\u001a\u00020\u0002H'J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00042\b\b\u0001\u0010J\u001a\u00020\u0002H'J\"\u0010P\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020N0Mj\u0002`O0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u00042\b\b\u0001\u0010\t\u001a\u00020QH'J\u0018\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\b\u0010X\u001a\u00020WH'J\u0012\u0010Z\u001a\u00020W2\b\b\u0001\u0010\t\u001a\u00020YH'¨\u0006["}, m28432d2 = {"LTk3;", "", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "b", "Lco/bird/api/request/OperatorMapRequest;", "body", "Lco/bird/api/response/OperatorMapResponse;", "z", "Lco/bird/api/request/ZoneDataRequest;", "Lco/bird/api/response/ZoneDataResponse;", "n", "Lco/bird/api/request/ZoneRegionRequest;", "Lco/bird/api/response/ZoneRegionResponse;", "o", "Lco/bird/api/request/OperatorMapWarehouseRequest;", "Lco/bird/api/response/OperatorMapWarehouseResponse;", "w", "", "latitude", "longitude", "Lco/bird/api/response/OperatorMapNestResponse;", "i", "Lco/bird/api/response/OperatorAttributesResponse;", "k", "Lco/bird/api/response/OperatorTaskResponse;", "g", "Lco/bird/api/response/OperatorMapDemandInsightResponse;", "s", "Lco/bird/api/response/OperatorFiltersResponse;", "j", "shiftId", "date", "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "p", "Lco/bird/api/request/OperatorBatchActionRequest;", "Lco/bird/api/response/OperatorBatchActionResponse;", "r", "batchId", "Lco/bird/api/response/OperatorBatchStatusResponse;", DateTokenConverter.CONVERTER_KEY, "search", "", "offset", "limit", "", "Lco/bird/android/model/wire/WireBatch;", "c", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/F;", "Lco/bird/api/request/OperatorBirdActionRequest;", "Lco/bird/api/response/OperatorBirdResponse;", "h", "Lco/bird/api/request/ScanBody;", "request", "Lco/bird/android/model/BirdScan;", "q", "Lco/bird/api/request/OperatorUpdateLocationBody;", "", "t", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireFlightSheetDetails;", "u", "nestId", "Lco/bird/android/model/wire/WireNestFlightSheetDetails;", "A", "bountyId", "Lco/bird/android/model/wire/WireBountyFlightSheetDetails;", "B", "warehouseId", "Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;", "f", "zoneId", "Lco/bird/android/model/wire/WireZoneFlightSheetDetails;", "e", "Lco/bird/api/response/PagedCollection;", "Lco/bird/android/model/OperatorRideHistoryItem;", "Lco/bird/api/response/OperatorRideHistoryResponse;", "m", "Lco/bird/api/request/HibernationStatusRequest;", "Lco/bird/api/response/HibernationStatusResponse;", "x", "Lio/reactivex/p;", "Lco/bird/api/response/WireRatingHistoryResponse;", "y", "Lio/reactivex/c;", "l", "Lco/bird/api/request/BirdIdBody;", "v", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tk3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC36152Tk3 {
    @NA1("operator/nest-flight-sheet-detail")
    /* renamed from: A */
    AbstractC23442F<WireNestFlightSheetDetails> m83043A(@InterfaceC37017Xc4("nest_id") String str);

    @NA1("operator/bounty-flight-sheet-detail")
    /* renamed from: B */
    AbstractC23442F<WireBountyFlightSheetDetails> m83042B(@InterfaceC37017Xc4("bounty_id") String str);

    @NA1("operator/bird")
    /* renamed from: b */
    AbstractC23442F<HM4<WireBird>> m83041b(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("operator/batch/search")
    /* renamed from: c */
    AbstractC23442F<HM4<List<WireBatch>>> m83040c(@InterfaceC37017Xc4("search") String str, @InterfaceC37017Xc4("offset") Integer num, @InterfaceC37017Xc4("limit") Integer num2);

    @NA1("operator/batch/status")
    /* renamed from: d */
    AbstractC23442F<OperatorBatchStatusResponse> m83039d(@InterfaceC37017Xc4("batch_id") String str);

    @NA1("operator/zone-flight-sheet-detail")
    /* renamed from: e */
    AbstractC23442F<WireZoneFlightSheetDetails> m83038e(@InterfaceC37017Xc4("zone_id") String str);

    @NA1("operator/warehouse-flight-sheet-detail")
    /* renamed from: f */
    AbstractC23442F<WireWarehouseFlightSheetDetails> m83037f(@InterfaceC37017Xc4("warehouse_id") String str);

    @NA1("operator/tasks")
    /* renamed from: g */
    AbstractC23442F<OperatorTaskResponse> m83036g();

    @AD3("operator/bird/action")
    /* renamed from: h */
    AbstractC23442F<HM4<OperatorBirdResponse>> m83035h(@InterfaceC6404PY OperatorBirdActionRequest operatorBirdActionRequest);

    @NA1("operator/map/invalid-nest-areas")
    /* renamed from: i */
    AbstractC23442F<OperatorMapNestResponse> m83034i(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2);

    @NA1("operator/map/filters")
    /* renamed from: j */
    AbstractC23442F<OperatorFiltersResponse> m83033j();

    @NA1("operator/attributes")
    /* renamed from: k */
    AbstractC23442F<OperatorAttributesResponse> m83032k();

    @AD3("operator/track")
    /* renamed from: l */
    AbstractC23461c m83031l();

    @NA1("operator/ride-history")
    /* renamed from: m */
    AbstractC23442F<PagedCollection<OperatorRideHistoryItem>> m83030m(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("operator/map/zone-data")
    /* renamed from: n */
    AbstractC23442F<ZoneDataResponse> m83029n(@InterfaceC6404PY ZoneDataRequest zoneDataRequest);

    @AD3("operator/map/zone-regions")
    /* renamed from: o */
    AbstractC23442F<ZoneRegionResponse> m83028o(@InterfaceC6404PY ZoneRegionRequest zoneRegionRequest);

    @NA1("operator/activity/summary")
    /* renamed from: p */
    AbstractC23442F<HM4<WireOperatorActivityLogDetails>> m83027p(@InterfaceC37017Xc4("shift_id") String str, @InterfaceC37017Xc4("date") String str2);

    @AD3("operator/bird/scan")
    /* renamed from: q */
    AbstractC23442F<HM4<BirdScan>> m83026q(@InterfaceC6404PY ScanBody scanBody);

    @AD3("operator/batch/action")
    /* renamed from: r */
    AbstractC23442F<HM4<OperatorBatchActionResponse>> m83025r(@InterfaceC6404PY OperatorBatchActionRequest operatorBatchActionRequest);

    @NA1("operator/map/demand-insight")
    /* renamed from: s */
    AbstractC23442F<OperatorMapDemandInsightResponse> m83024s();

    @AD3("operator/bird/update-location")
    /* renamed from: t */
    AbstractC23442F<HM4<Boolean>> m83023t(@InterfaceC6404PY OperatorUpdateLocationBody operatorUpdateLocationBody);

    @NA1("operator/v2/flight-sheet-detail")
    /* renamed from: u */
    AbstractC23442F<WireFlightSheetDetails> m83022u(@InterfaceC37017Xc4("bird_id") String str, @InterfaceC37017Xc4("context") String str2);

    @AD3("operator/v1/mark-for-inspection")
    /* renamed from: v */
    AbstractC23461c m83021v(@InterfaceC6404PY BirdIdBody birdIdBody);

    @AD3("operator/map/warehouses")
    /* renamed from: w */
    AbstractC23442F<OperatorMapWarehouseResponse> m83020w(@InterfaceC6404PY OperatorMapWarehouseRequest operatorMapWarehouseRequest);

    @AD3("operator/hibernation/status")
    /* renamed from: x */
    AbstractC23442F<HibernationStatusResponse> m83019x(@InterfaceC6404PY HibernationStatusRequest hibernationStatusRequest);

    @NA1("operator/rating-history")
    /* renamed from: y */
    AbstractC24507p<WireRatingHistoryResponse> m83018y(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("operator/map")
    /* renamed from: z */
    AbstractC23442F<OperatorMapResponse> m83017z(@InterfaceC6404PY OperatorMapRequest operatorMapRequest);
}
