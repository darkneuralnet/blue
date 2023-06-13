package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import co.bird.android.model.persistence.ScrapOrderView;
import co.bird.android.model.persistence.SkuOrder;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import co.bird.android.model.wire.WireTransferOrderFilter;
import co.bird.api.response.BulkScanItemResponse;
import co.bird.api.response.ServiceCenterOrderViewResponse;
import co.bird.api.response.TestRideResponse;
import co.bird.api.response.TransferOrderVehicleViewResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\bH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0014\u001a\u00020\u0006H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0016\u001a\u00020\u0006H&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0016\u001a\u00020\u0006H&J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0006H&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\u0006\u0010\u001f\u001a\u00020\u0006H&JN\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000fH&J>\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000fH&JL\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\u001a\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060-0\u00052\u0006\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000fH&J,\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u00100\u001a\u00020\u000fH&J$\u00104\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000602H&J\u001e\u00107\u001a\b\u0012\u0004\u0012\u0002060\b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H&J\u001c\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00050\b2\u0006\u0010\u001f\u001a\u00020\u0006H&J\u0014\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\bH&J\b\u0010<\u001a\u00020\u001dH&J\u0014\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00050=H&J\u001c\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00050=2\u0006\u0010@\u001a\u00020\u0006H&J\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020A0=2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010E\u001a\u00020DH&J\b\u0010G\u001a\u00020\u001dH&J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020H0=H&J\u0010\u0010J\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0006H&J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020K0=2\u0006\u0010\u0016\u001a\u00020\u0006H&J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\b2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H&J\b\u0010P\u001a\u00020\u001dH&J\u0014\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00050=H&¨\u0006S"}, m28432d2 = {"LO86;", "", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "", "statusFilters", "Lio/reactivex/F;", "Lco/bird/api/response/ServiceCenterOrderViewResponse;", "e", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "c", "Lco/bird/android/model/wire/WireSkuOrder;", "wireSkuOrder", "", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireContainerOrder;", "wireContainerOrder", "m", "containerOrderId", "g", "skuOrderId", "h", "Lco/bird/android/model/wire/WireSkuScannedItems;", "w", "s", "q", "itemId", "Lio/reactivex/c;", "l", "transferOrderId", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", C17296a.f69688o, "outbound", "scanIdentifier", "serviceCenterScan", "previousScanIdentifier", "validateOnly", "force", "Lco/bird/android/model/wire/WireSkuScanItem;", "u", "scanIdentifiers", "Lco/bird/api/response/BulkScanItemResponse;", "p", "Lkotlin/Pair;", "o", "bolPhotoUrls", "inbound", "k", "", "missingItemIdsAndReason", "i", "birdId", "Lco/bird/api/response/TestRideResponse;", "v", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "t", "Lco/bird/android/model/wire/WireItemScrapReason;", "O", "f", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "d0", "section", "Lco/bird/android/model/persistence/OperatorOrderView;", "p0", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "W", "m0", "", "M", "n", "Lco/bird/android/model/persistence/SkuOrder;", "D0", "reason", "Lco/bird/android/model/wire/WireTransferOrder;", "b", "r", "Lco/bird/android/model/persistence/ScrapOrderView;", "j", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O86 */
/* loaded from: classes2.dex */
public interface O86 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O86$a */
    /* loaded from: classes2.dex */
    public static final class C5908a {
        public static /* synthetic */ AbstractC23442F bulkScanSkusForScrapOrder$default(O86 o86, boolean z, String str, List list, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    z3 = false;
                }
                return o86.mo80288o(z, str, list, z2, z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bulkScanSkusForScrapOrder");
        }

        public static /* synthetic */ AbstractC23442F bulkScanSkusForSkuOrder$default(O86 o86, boolean z, String str, List list, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    z3 = false;
                }
                return o86.mo80287p(z, str, list, z2, z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bulkScanSkusForSkuOrder");
        }

        public static /* synthetic */ AbstractC23442F scanSkuForSkuOrder$default(O86 o86, boolean z, String str, String str2, boolean z2, String str3, boolean z3, boolean z4, int i, Object obj) {
            if (obj == null) {
                return o86.mo80281u(z, str, str2, z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scanSkuForSkuOrder");
        }
    }

    /* renamed from: D0 */
    Observable<SkuOrder> mo80313D0(String str);

    /* renamed from: M */
    Observable<Integer> mo80307M();

    /* renamed from: O */
    AbstractC23442F<List<WireItemScrapReason>> mo80306O();

    /* renamed from: W */
    Observable<OperatorOrderView> mo80305W(String str, OperatorOrderViewType operatorOrderViewType);

    /* renamed from: a */
    AbstractC23442F<TransferOrderVehicleViewResponse> mo80304a(String str);

    /* renamed from: b */
    AbstractC23442F<WireTransferOrder> mo80303b(String str, String str2);

    /* renamed from: c */
    AbstractC23442F<List<WireTransferOrderFilter>> mo80302c();

    /* renamed from: d */
    boolean mo80301d(WireSkuOrder wireSkuOrder);

    /* renamed from: d0 */
    Observable<List<OperatorOrderViewSection>> mo80300d0();

    /* renamed from: e */
    AbstractC23442F<ServiceCenterOrderViewResponse> mo80299e(DateTime dateTime, DateTime dateTime2, List<String> list);

    /* renamed from: f */
    AbstractC23461c mo80298f();

    /* renamed from: g */
    AbstractC23442F<WireContainerOrder> mo80297g(String str);

    /* renamed from: h */
    AbstractC23442F<WireSkuOrder> mo80296h(String str);

    /* renamed from: i */
    AbstractC23461c mo80295i(String str, Map<String, String> map);

    /* renamed from: j */
    Observable<List<ScrapOrderView>> mo80294j();

    /* renamed from: k */
    AbstractC23442F<WireContainerOrder> mo80293k(String str, List<String> list, boolean z);

    /* renamed from: l */
    AbstractC23461c mo80292l(String str);

    /* renamed from: m */
    boolean mo80291m(WireContainerOrder wireContainerOrder);

    /* renamed from: m0 */
    AbstractC23461c mo80290m0();

    /* renamed from: n */
    AbstractC23461c mo80289n(String str);

    /* renamed from: o */
    AbstractC23442F<BulkScanItemResponse> mo80288o(boolean z, String str, List<Pair<String, String>> list, boolean z2, boolean z3);

    /* renamed from: p */
    AbstractC23442F<BulkScanItemResponse> mo80287p(boolean z, String str, List<String> list, boolean z2, boolean z3);

    /* renamed from: p0 */
    Observable<List<OperatorOrderView>> mo80286p0(String str);

    /* renamed from: q */
    boolean mo80285q(WireSkuOrder wireSkuOrder);

    /* renamed from: r */
    AbstractC23461c mo80284r();

    /* renamed from: s */
    boolean mo80283s(WireContainerOrder wireContainerOrder);

    /* renamed from: t */
    AbstractC23442F<List<WireTransferOrderClosedIncompleteReason>> mo80282t(String str);

    /* renamed from: u */
    AbstractC23442F<WireSkuScanItem> mo80281u(boolean z, String str, String str2, boolean z2, String str3, boolean z3, boolean z4);

    /* renamed from: v */
    AbstractC23442F<TestRideResponse> mo80280v(String str, String str2);

    /* renamed from: w */
    AbstractC23442F<WireSkuScannedItems> mo80279w(String str);
}
