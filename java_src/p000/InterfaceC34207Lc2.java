package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireLeaseObjectResponse;
import co.bird.api.request.WireItemLeaseStartRequest;
import co.bird.api.request.WireLeaseAssetRequest;
import co.bird.api.request.WireLeaseItemAvailabilityRequest;
import co.bird.api.request.WireLeaseReturnRequest;
import co.bird.api.response.PagedCollection;
import co.bird.api.response.WireItemLeaseStartResponse;
import co.bird.api.response.WireLeaseAssetResponse;
import co.bird.api.response.WireLeaseItemAvailabilityResponse;
import co.bird.api.response.WireLeaseReturnResponse;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0004H'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¨\u0006\u0013"}, m28432d2 = {"LLc2;", "", "Lco/bird/api/request/WireItemLeaseStartRequest;", "request", "Lio/reactivex/F;", "Lco/bird/api/response/WireItemLeaseStartResponse;", "e", "Lco/bird/api/request/WireLeaseAssetRequest;", "Lco/bird/api/response/WireLeaseAssetResponse;", "f", "Lco/bird/api/request/WireLeaseReturnRequest;", "Lco/bird/api/response/WireLeaseReturnResponse;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/response/PagedCollection;", "Lco/bird/android/model/wire/WireLeaseObjectResponse;", "b", "Lco/bird/api/request/WireLeaseItemAvailabilityRequest;", "Lco/bird/api/response/WireLeaseItemAvailabilityResponse;", "c", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC34207Lc2 {
    @NA1("api/v1/itemlease/active-leases")
    /* renamed from: b */
    AbstractC23442F<PagedCollection<WireLeaseObjectResponse>> m96591b();

    @AD3("api/v1/itemlease/item-availability")
    /* renamed from: c */
    AbstractC23442F<WireLeaseItemAvailabilityResponse> m96590c(@InterfaceC6404PY WireLeaseItemAvailabilityRequest wireLeaseItemAvailabilityRequest);

    @AD3("api/v1/itemlease/lease/return")
    /* renamed from: d */
    AbstractC23442F<WireLeaseReturnResponse> m96589d(@InterfaceC6404PY WireLeaseReturnRequest wireLeaseReturnRequest);

    @AD3("api/v1/itemlease/lease/start")
    /* renamed from: e */
    AbstractC23442F<WireItemLeaseStartResponse> m96588e(@InterfaceC6404PY WireItemLeaseStartRequest wireItemLeaseStartRequest);

    @AD3("api/v1/itemlease/lease/asset")
    /* renamed from: f */
    AbstractC23442F<WireLeaseAssetResponse> m96587f(@InterfaceC6404PY WireLeaseAssetRequest wireLeaseAssetRequest);
}
