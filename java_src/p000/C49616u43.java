package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.model.wire.WireFlagNestReason;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireNest;
import co.bird.android.model.wire.WireNestClaim;
import co.bird.api.request.FlagNestRequest;
import co.bird.api.request.NestClaimRequest;
import co.bird.api.request.NestFavoriteRequest;
import co.bird.api.request.NestItemScanRequest;
import co.bird.api.request.NestReleaseRequest;
import co.bird.api.request.NestSuggestionRequest;
import co.bird.api.request.ReleaseNestClaimRequest;
import co.bird.api.request.UnflagNestRequest;
import co.bird.api.response.ClaimedNestResponse;
import co.bird.api.response.NestSuggestionResponse;
import co.bird.api.response.OperatorMapNestResponse;
import co.bird.api.response.ReleaseResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010;\u001a\u000209¢\u0006\u0004\b<\u0010=J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\u0004H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J3\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J@\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016JS\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b&\u0010'JD\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u00101\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\u0010\u00102\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010:¨\u0006>"}, m28432d2 = {"Lu43;", "Ls43;", "", "nestId", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireNest;", "k", "Landroid/location/Location;", "location", "Lco/bird/api/response/OperatorMapNestResponse;", "e", "Lco/bird/android/model/wire/WireNestClaim;", DateTokenConverter.CONVERTER_KEY, "nestClaimId", "Lio/reactivex/c;", "m", "", "h", "Lco/bird/android/model/wire/WireFlagNestReason;", "l", "reason", "comment", "", "suggestedCapacity", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/c;", "j", "sessionId", "warehouseId", "scanIdentifier", "previousBirdIds", "Lco/bird/android/model/wire/ReleaseValidationResult;", "f", "", "lock", "birdIds", "assetId", "Lco/bird/api/response/ReleaseResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lio/reactivex/F;", "", "latitude", "longitude", "name", "notes", "capacity", "Lco/bird/api/response/NestSuggestionResponse;", "c", "partnerIds", "i", C17296a.f69688o, "LTk3;", "LTk3;", "operatorClient", "Lr43;", "Lr43;", "nestClient", "Lw43;", "Lw43;", "nestReleaseClient", "<init>", "(LTk3;Lr43;Lw43;)V", "nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49616u43 implements InterfaceC48430s43 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f111680a;

    /* renamed from: b */
    public final InterfaceC47838r43 f111681b;

    /* renamed from: c */
    public final InterfaceC50801w43 f111682c;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/ClaimedNestResponse;", "response", "", "Lco/bird/android/model/wire/WireNestClaim;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ClaimedNestResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u43$a */
    /* loaded from: classes4.dex */
    public static final class C29049a extends Lambda implements Function1<ClaimedNestResponse, List<? extends WireNestClaim>> {

        /* renamed from: g */
        public static final C29049a f111683g = new C29049a();

        public C29049a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireNestClaim> invoke(ClaimedNestResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.getActiveClaims();
        }
    }

    public C49616u43(InterfaceC36152Tk3 operatorClient, InterfaceC47838r43 nestClient, InterfaceC50801w43 nestReleaseClient) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(nestClient, "nestClient");
        Intrinsics.checkNotNullParameter(nestReleaseClient, "nestReleaseClient");
        this.f111680a = operatorClient;
        this.f111681b = nestClient;
        this.f111682c = nestReleaseClient;
    }

    /* renamed from: o */
    public static final List m10886o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: a */
    public AbstractC23461c mo10900a(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        AbstractC23461c m33063X = this.f111681b.m16536g(nestId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "nestClient.deleteNestFav…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: b */
    public AbstractC23461c mo10899b(String nestId, String reason, String str, Integer num) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        AbstractC23461c m33063X = this.f111681b.m16538e(new FlagNestRequest(nestId, reason, str, num)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "nestClient.flagNest(\n   …scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: c */
    public AbstractC23442F<NestSuggestionResponse> mo10898c(double d, double d2, String str, String str2, int i, String str3) {
        return this.f111681b.m16539d(new NestSuggestionRequest(new WireLocation(d, d2, null, null, null, null, false, null, null, 508, null), str, str2, i, str3));
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: d */
    public AbstractC23442F<WireNestClaim> mo10897d(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        AbstractC23442F<WireNestClaim> m33142Y = this.f111681b.m16541b(new NestClaimRequest(nestId)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "nestClient.claimNest(\n  …scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: e */
    public AbstractC23442F<OperatorMapNestResponse> mo10896e(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<OperatorMapNestResponse> m33142Y = this.f111680a.m83034i(location.getLatitude(), location.getLongitude()).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.invalidNe…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: f */
    public AbstractC23442F<ReleaseValidationResult> mo10895f(String sessionId, String str, String str2, String scanIdentifier, List<String> previousBirdIds) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(previousBirdIds, "previousBirdIds");
        AbstractC23442F<ReleaseValidationResult> m33142Y = this.f111682c.m7468b(new NestItemScanRequest(sessionId, str, str2, scanIdentifier, previousBirdIds)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "nestReleaseClient.valida…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: g */
    public AbstractC23442F<ReleaseResponse> mo10894g(String sessionId, String str, String str2, Boolean bool, List<String> birdIds, String str3) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23442F<ReleaseResponse> m33142Y = this.f111682c.m7469a(new NestReleaseRequest(sessionId, str, str2, bool, birdIds, str3)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "nestReleaseClient.releas…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: h */
    public AbstractC23442F<List<WireNestClaim>> mo10893h() {
        AbstractC23442F<ClaimedNestResponse> m16534i = this.f111681b.m16534i();
        final C29049a c29049a = C29049a.f111683g;
        AbstractC23442F<List<WireNestClaim>> m33142Y = m16534i.m33157I(new InterfaceC23492o() { // from class: t43
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m10886o;
                m10886o = C49616u43.m10886o(Function1.this, obj);
                return m10886o;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "nestClient.nestClaims()\n…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: i */
    public AbstractC23461c mo10892i(String nestId, List<String> partnerIds) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(partnerIds, "partnerIds");
        AbstractC23461c m33063X = this.f111681b.m16533j(new NestFavoriteRequest(nestId, partnerIds)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "nestClient.favoriteNest(…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: j */
    public AbstractC23461c mo10891j(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        AbstractC23461c m33063X = this.f111681b.m16537f(new UnflagNestRequest(nestId)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "nestClient.unflagNest(\n …scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: k */
    public AbstractC23442F<WireNest> mo10890k(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        AbstractC23442F<WireNest> m33142Y = this.f111681b.m16542a(nestId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "nestClient.nestById(nest…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: l */
    public AbstractC23442F<List<WireFlagNestReason>> mo10889l(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        AbstractC23442F<List<WireFlagNestReason>> m33142Y = this.f111681b.m16540c(nestId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "nestClient.flagNestReaso…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48430s43
    /* renamed from: m */
    public AbstractC23461c mo10888m(String nestClaimId) {
        Intrinsics.checkNotNullParameter(nestClaimId, "nestClaimId");
        AbstractC23461c m33063X = this.f111681b.m16535h(new ReleaseNestClaimRequest(nestClaimId)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "nestClient.unclaimNest(\n…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
