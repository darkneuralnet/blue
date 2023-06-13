package p000;

import co.bird.android.model.wire.WireRiderCellsRequest;
import co.bird.android.model.wire.WireRiderCellsResponse;
import co.bird.android.model.wire.WireRiderZoneCellsRequest;
import co.bird.android.model.wire.WireRiderZoneCellsResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¨\u0006\n"}, m28432d2 = {"LDB1;", "", "Lco/bird/android/model/wire/WireRiderCellsRequest;", "request", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireRiderCellsResponse;", C17296a.f69688o, "Lco/bird/android/model/wire/WireRiderZoneCellsRequest;", "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DB1 */
/* loaded from: classes4.dex */
public interface DB1 {
    @AD3("map/rider-cells")
    /* renamed from: a */
    AbstractC23442F<WireRiderCellsResponse> m110792a(@InterfaceC6404PY WireRiderCellsRequest wireRiderCellsRequest);

    @AD3("map/rider-zones-for-cells")
    /* renamed from: b */
    AbstractC23442F<WireRiderZoneCellsResponse> m110791b(@InterfaceC6404PY WireRiderZoneCellsRequest wireRiderZoneCellsRequest);
}
