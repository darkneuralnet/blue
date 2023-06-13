package p000;

import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.constant.ScrapRequestReviewStatus;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J<\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0014"}, m28432d2 = {"Leo5;", "", "", "birdId", "Lco/bird/android/model/constant/ScrapRequestReviewStatus;", "status", "Lio/reactivex/F;", "LHM4;", "", "Lco/bird/android/model/VehicleScrapRequest;", C17296a.f69688o, "Lco/bird/android/model/wire/WireBird;", "bird", "imageAssetIds", "Lco/bird/android/model/constant/ScrapRequestReason;", "requestReason", "requestDetails", "c", "Lio/reactivex/c;", "b", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eo5 */
/* loaded from: classes2.dex */
public interface InterfaceC40565eo5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eo5$a */
    /* loaded from: classes2.dex */
    public static final class C20105a {
        public static /* synthetic */ AbstractC23442F getScrapRequestsForBird$default(InterfaceC40565eo5 interfaceC40565eo5, String str, ScrapRequestReviewStatus scrapRequestReviewStatus, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    scrapRequestReviewStatus = null;
                }
                return interfaceC40565eo5.mo40801a(str, scrapRequestReviewStatus);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getScrapRequestsForBird");
        }
    }

    /* renamed from: a */
    AbstractC23442F<HM4<List<VehicleScrapRequest>>> mo40801a(String str, ScrapRequestReviewStatus scrapRequestReviewStatus);

    /* renamed from: b */
    AbstractC23461c mo40800b(String str);

    /* renamed from: c */
    AbstractC23442F<HM4<VehicleScrapRequest>> mo40799c(WireBird wireBird, List<String> list, ScrapRequestReason scrapRequestReason, String str);
}
