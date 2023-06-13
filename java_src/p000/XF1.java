package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.persistence.HardCountEntity;
import co.bird.android.model.persistence.HardCountScan;
import co.bird.api.request.HardCountCreateRequest;
import co.bird.api.response.HardCountResponse;
import co.bird.api.response.HardCountScanResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J:\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0012\u001a\u00020\u0011H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J$\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\u00062\u0006\u0010\u0017\u001a\u00020\u0016H&J \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00180\u001e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002H&J$\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H&J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013H&J \u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H&J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010)\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&J$\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0002H&J\u0016\u0010-\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H&J\b\u0010.\u001a\u00020\u0011H&J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0013H&¨\u00061"}, m28432d2 = {"LXF1;", "", "", "hardCountSessionId", "Lio/reactivex/c;", C17296a.f69688o, "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/HardCountResponse;", DateTokenConverter.CONVERTER_KEY, "hardCountId", "scanIdentifier", "", "rawScan", "previousScanIdentifier", "Lco/bird/api/response/HardCountScanResponse;", "o", "", "h", "Lio/reactivex/Observable;", "Lco/bird/android/model/HardCountStatus;", "n", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "identifierCategory", "", "Lco/bird/api/request/HardCountCreateRequest;", "f", "Lco/bird/android/model/persistence/HardCountEntity;", "q", "sessionId", "Lio/reactivex/k;", "Lco/bird/android/model/persistence/HardCountScan;", "j", "hardCountCreateRequest", "Lco/bird/android/model/constant/InventoryScanningError;", "scanErrorCode", "r", "p", "c", "response", "e", "rawString", "m", "g", "b", "k", "i", "", "l", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XF1 */
/* loaded from: classes2.dex */
public interface XF1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XF1$a */
    /* loaded from: classes2.dex */
    public static final class C9394a {
        public static /* synthetic */ AbstractC23461c cacheHardCountRequests$default(XF1 xf1, HardCountCreateRequest hardCountCreateRequest, InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory, InventoryScanningError inventoryScanningError, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    inventoryScanningError = null;
                }
                return xf1.mo21445r(hardCountCreateRequest, inventoryScanningIdentifierCategory, inventoryScanningError);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cacheHardCountRequests");
        }

        public static /* synthetic */ AbstractC24490k cachedHardCountSuccessfulScans$default(XF1 xf1, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return xf1.mo21453j(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cachedHardCountSuccessfulScans");
        }

        public static /* synthetic */ AbstractC23442F hardCountScanBird$default(XF1 xf1, String str, String str2, boolean z, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return xf1.mo21448o(str, str2, z, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hardCountScanBird");
        }

        public static /* synthetic */ AbstractC23442F scanRawVehicleIdentifier$default(XF1 xf1, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return xf1.mo21450m(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scanRawVehicleIdentifier");
        }
    }

    /* renamed from: a */
    AbstractC23461c mo21471a(String str);

    /* renamed from: b */
    void mo21469b(String str);

    /* renamed from: c */
    Observable<HardCountScan> mo21467c();

    /* renamed from: d */
    AbstractC23442F<HM4<HardCountResponse>> mo21465d();

    /* renamed from: e */
    String mo21463e(String str, HM4<HardCountScanResponse> hm4);

    /* renamed from: f */
    AbstractC23442F<List<HardCountCreateRequest>> mo21461f(InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory, String str);

    /* renamed from: g */
    Observable<List<HardCountCreateRequest>> mo21459g(InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory, String str);

    /* renamed from: h */
    void mo21457h();

    /* renamed from: i */
    void mo21455i();

    /* renamed from: j */
    AbstractC24490k<List<HardCountScan>> mo21453j(String str);

    /* renamed from: k */
    boolean mo21452k(HM4<HardCountScanResponse> hm4);

    /* renamed from: l */
    Observable<Integer> mo21451l();

    /* renamed from: m */
    AbstractC23442F<HM4<HardCountScanResponse>> mo21450m(String str, String str2);

    /* renamed from: n */
    Observable<HardCountStatus> mo21449n();

    /* renamed from: o */
    AbstractC23442F<HM4<HardCountScanResponse>> mo21448o(String str, String str2, boolean z, String str3);

    /* renamed from: p */
    AbstractC23461c mo21447p(String str);

    /* renamed from: q */
    AbstractC23442F<List<HardCountEntity>> mo21446q(InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory);

    /* renamed from: r */
    AbstractC23461c mo21445r(HardCountCreateRequest hardCountCreateRequest, InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory, InventoryScanningError inventoryScanningError);
}
