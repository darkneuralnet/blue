package p000;

import co.bird.api.request.CappedZoneReservationCancelRequest;
import co.bird.api.response.ZoneAssignmentsResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\t"}, m28432d2 = {"LFu4;", "", "Lio/reactivex/F;", "Lco/bird/api/response/ZoneAssignmentsResponse;", C17296a.f69688o, "Lco/bird/api/request/CappedZoneReservationCancelRequest;", "body", "Lio/reactivex/c;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fu4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC32967Fu4 {
    @NA1("/api/v1/external/zone-assignment/effective-zone-assignments")
    /* renamed from: a */
    AbstractC23442F<ZoneAssignmentsResponse> m106254a();

    @AD3("/api/v1/capped-zone-reservation/cancel")
    /* renamed from: b */
    AbstractC23461c m106253b(@InterfaceC6404PY CappedZoneReservationCancelRequest cappedZoneReservationCancelRequest);
}
