package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.model.wire.WireFlagNestReason;
import co.bird.android.model.wire.WireNest;
import co.bird.android.model.wire.WireNestClaim;
import co.bird.api.response.NestSuggestionResponse;
import co.bird.api.response.OperatorMapNestResponse;
import co.bird.api.response.ReleaseResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\u0004H&J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J3\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&J@\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H&JS\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b&\u0010'JD\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0002H&J\u001e\u00101\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H&J\u0010\u00102\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u00063"}, m28432d2 = {"Ls43;", "", "", "nestId", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireNest;", "k", "Landroid/location/Location;", "location", "Lco/bird/api/response/OperatorMapNestResponse;", "e", "Lco/bird/android/model/wire/WireNestClaim;", DateTokenConverter.CONVERTER_KEY, "nestClaimId", "Lio/reactivex/c;", "m", "", "h", "Lco/bird/android/model/wire/WireFlagNestReason;", "l", "reason", "comment", "", "suggestedCapacity", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/c;", "j", "sessionId", "warehouseId", "scanIdentifier", "previousBirdIds", "Lco/bird/android/model/wire/ReleaseValidationResult;", "f", "", "lock", "birdIds", "assetId", "Lco/bird/api/response/ReleaseResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lio/reactivex/F;", "", "latitude", "longitude", "name", "notes", "capacity", "Lco/bird/api/response/NestSuggestionResponse;", "c", "partnerIds", "i", C17296a.f69688o, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: s43  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC48430s43 {
    /* renamed from: a */
    AbstractC23461c mo10900a(String str);

    /* renamed from: b */
    AbstractC23461c mo10899b(String str, String str2, String str3, Integer num);

    /* renamed from: c */
    AbstractC23442F<NestSuggestionResponse> mo10898c(double d, double d2, String str, String str2, int i, String str3);

    /* renamed from: d */
    AbstractC23442F<WireNestClaim> mo10897d(String str);

    /* renamed from: e */
    AbstractC23442F<OperatorMapNestResponse> mo10896e(Location location);

    /* renamed from: f */
    AbstractC23442F<ReleaseValidationResult> mo10895f(String str, String str2, String str3, String str4, List<String> list);

    /* renamed from: g */
    AbstractC23442F<ReleaseResponse> mo10894g(String str, String str2, String str3, Boolean bool, List<String> list, String str4);

    /* renamed from: h */
    AbstractC23442F<List<WireNestClaim>> mo10893h();

    /* renamed from: i */
    AbstractC23461c mo10892i(String str, List<String> list);

    /* renamed from: j */
    AbstractC23461c mo10891j(String str);

    /* renamed from: k */
    AbstractC23442F<WireNest> mo10890k(String str);

    /* renamed from: l */
    AbstractC23442F<List<WireFlagNestReason>> mo10889l(String str);

    /* renamed from: m */
    AbstractC23461c mo10888m(String str);
}
