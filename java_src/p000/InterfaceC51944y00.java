package p000;

import co.bird.api.request.DesignatedBountyRequest;
import co.bird.api.request.IdsRequest;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¨\u0006\t"}, m28432d2 = {"Ly00;", "", "Lco/bird/api/request/IdsRequest;", "body", "Lio/reactivex/c;", "c", C17296a.f69688o, "Lco/bird/api/request/DesignatedBountyRequest;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y00  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC51944y00 {
    @AD3("bounties/v2/external/cancel-designated-bounties")
    /* renamed from: a */
    AbstractC23461c m4252a(@InterfaceC6404PY IdsRequest idsRequest);

    @AD3("bounties/v2/external/re-accept-designated-bounty")
    /* renamed from: b */
    AbstractC23461c m4251b(@InterfaceC6404PY DesignatedBountyRequest designatedBountyRequest);

    @AD3("bounties/v2/external/accept-designated-bounties")
    /* renamed from: c */
    AbstractC23461c m4250c(@InterfaceC6404PY IdsRequest idsRequest);
}
