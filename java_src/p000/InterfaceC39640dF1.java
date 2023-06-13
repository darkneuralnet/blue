package p000;

import co.bird.api.request.HardCountCreateRequest;
import co.bird.api.response.HardCountResponse;
import co.bird.api.response.HardCountScanResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¨\u0006\f"}, m28432d2 = {"LdF1;", "", "", "warehouseId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/HardCountResponse;", "b", "Lco/bird/api/request/HardCountCreateRequest;", "body", "Lco/bird/api/response/HardCountScanResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dF1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC39640dF1 {
    @AD3("/v1/hard-count/scan")
    /* renamed from: a */
    AbstractC23442F<HM4<HardCountScanResponse>> m44481a(@InterfaceC6404PY HardCountCreateRequest hardCountCreateRequest);

    @NA1("/v1/hard-count/active-by-warehouse-id")
    /* renamed from: b */
    AbstractC23442F<HM4<HardCountResponse>> m44480b(@InterfaceC37017Xc4("warehouse_id") String str);
}
