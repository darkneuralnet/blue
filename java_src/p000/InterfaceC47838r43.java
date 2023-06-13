package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireFlagNestReason;
import co.bird.android.model.wire.WireNest;
import co.bird.android.model.wire.WireNestClaim;
import co.bird.api.request.FlagNestRequest;
import co.bird.api.request.NestClaimRequest;
import co.bird.api.request.NestFavoriteRequest;
import co.bird.api.request.NestSuggestionRequest;
import co.bird.api.request.ReleaseNestClaimRequest;
import co.bird.api.request.UnflagNestRequest;
import co.bird.api.response.ClaimedNestResponse;
import co.bird.api.response.NestSuggestionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0012\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u000bH'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'J\u0012\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0014H'J\u0012\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0016H'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\b\u001a\u00020\u0018H'J\u0012\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u001bH'J\u0012\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¨\u0006\u001e"}, m28432d2 = {"Lr43;", "", "", "id", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireNest;", C17296a.f69688o, "Lco/bird/api/request/NestClaimRequest;", "body", "Lco/bird/android/model/wire/WireNestClaim;", "b", "Lco/bird/api/request/ReleaseNestClaimRequest;", "Lio/reactivex/c;", "h", "Lco/bird/api/response/ClaimedNestResponse;", "i", "nestId", "", "Lco/bird/android/model/wire/WireFlagNestReason;", "c", "Lco/bird/api/request/FlagNestRequest;", "e", "Lco/bird/api/request/UnflagNestRequest;", "f", "Lco/bird/api/request/NestSuggestionRequest;", "Lco/bird/api/response/NestSuggestionResponse;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/NestFavoriteRequest;", "j", "g", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47838r43 {
    @NA1("api/v1/external/nest")
    /* renamed from: a */
    AbstractC23442F<WireNest> m16542a(@InterfaceC37017Xc4("id") String str);

    @AD3("api/v1/external/nest-claims/claim")
    /* renamed from: b */
    AbstractC23442F<WireNestClaim> m16541b(@InterfaceC6404PY NestClaimRequest nestClaimRequest);

    @NA1("/api/v1/external/nest/flag-reasons")
    /* renamed from: c */
    AbstractC23442F<List<WireFlagNestReason>> m16540c(@InterfaceC37017Xc4("nest_id") String str);

    @AD3("/api/v1/external/nest/suggest")
    /* renamed from: d */
    AbstractC23442F<NestSuggestionResponse> m16539d(@InterfaceC6404PY NestSuggestionRequest nestSuggestionRequest);

    @AD3("/api/v1/external/nest/flag-nest")
    /* renamed from: e */
    AbstractC23461c m16538e(@InterfaceC6404PY FlagNestRequest flagNestRequest);

    @AD3("/api/v1/external/nest/unflag-nest")
    /* renamed from: f */
    AbstractC23461c m16537f(@InterfaceC6404PY UnflagNestRequest unflagNestRequest);

    @KF0("/api/v1/external/nest/favorite")
    /* renamed from: g */
    AbstractC23461c m16536g(@InterfaceC37017Xc4("nest_id") String str);

    @AD3("api/v1/external/nest-claims/unclaim")
    /* renamed from: h */
    AbstractC23461c m16535h(@InterfaceC6404PY ReleaseNestClaimRequest releaseNestClaimRequest);

    @NA1("api/v1/external/nest-claims")
    /* renamed from: i */
    AbstractC23442F<ClaimedNestResponse> m16534i();

    @CD3("/api/v1/external/nest/favorite")
    /* renamed from: j */
    AbstractC23461c m16533j(@InterfaceC6404PY NestFavoriteRequest nestFavoriteRequest);
}
