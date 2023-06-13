package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.request.AddPaymentRequest;
import co.bird.api.request.ConfigureAutoReloadRequest;
import co.bird.api.request.PreloadAndMaybeConfigureAutoReloadRequest;
import co.bird.api.response.DownloadRideReceiptResponse;
import co.bird.api.response.PreloadAndMaybeConfigureAutoReloadResponse;
import co.bird.api.response.ReceiptDetailResponse;
import co.bird.api.response.ReloadConfigResponse;
import co.bird.api.response.SavedPaymentMethodResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'J\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0007H'J\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0007H'J\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0007H'¨\u0006\u001c"}, m28432d2 = {"LML3;", "", "Lco/bird/api/request/AddPaymentRequest;", "body", "Lio/reactivex/F;", "Lco/bird/api/response/SavedPaymentMethodResponse;", "g", "", "userId", "h", "paymentMethodId", DateTokenConverter.CONVERTER_KEY, "f", "Lco/bird/api/request/PreloadAndMaybeConfigureAutoReloadRequest;", "LHM4;", "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "i", "Lco/bird/api/request/ConfigureAutoReloadRequest;", "Lio/reactivex/c;", "b", "currency", "Lco/bird/api/response/ReloadConfigResponse;", "e", "receiptId", "Lco/bird/api/response/ReceiptDetailResponse;", "c", "Lco/bird/api/response/DownloadRideReceiptResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ML3 */
/* loaded from: classes4.dex */
public interface ML3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ML3$a */
    /* loaded from: classes4.dex */
    public static final class C5273a {
        public static /* synthetic */ AbstractC23442F getReceiptDetail$default(ML3 ml3, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return ml3.m95431c(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReceiptDetail");
        }

        public static /* synthetic */ AbstractC23442F getReceiptInvoice$default(ML3 ml3, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return ml3.m95433a(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReceiptInvoice");
        }

        public static /* synthetic */ AbstractC23442F getReloadOptions$default(ML3 ml3, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return ml3.m95429e(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReloadOptions");
        }
    }

    @NA1("v1/payment/receipt/invoice-by-receipt-id")
    /* renamed from: a */
    AbstractC23442F<DownloadRideReceiptResponse> m95433a(@InterfaceC37017Xc4("receipt_id") String str);

    @AD3("v1/payment/charge/configure-auto-reload")
    /* renamed from: b */
    AbstractC23461c m95432b(@InterfaceC6404PY ConfigureAutoReloadRequest configureAutoReloadRequest);

    @NA1("v1/payment/receipt/detail")
    /* renamed from: c */
    AbstractC23442F<ReceiptDetailResponse> m95431c(@InterfaceC37017Xc4("receipt_id") String str);

    @KF0("v3/payment-method/remove")
    /* renamed from: d */
    AbstractC23442F<SavedPaymentMethodResponse> m95430d(@InterfaceC37017Xc4("user_id") String str, @InterfaceC37017Xc4("payment_method_id") String str2);

    @NA1("v1/payment/charge/reload-config")
    /* renamed from: e */
    AbstractC23442F<ReloadConfigResponse> m95429e(@InterfaceC37017Xc4("currency") String str);

    @CD3("v3/payment-method/set-default")
    /* renamed from: f */
    AbstractC23442F<SavedPaymentMethodResponse> m95428f(@InterfaceC37017Xc4("user_id") String str, @InterfaceC37017Xc4("payment_method_id") String str2);

    @AD3("v3/payment-method/add")
    /* renamed from: g */
    AbstractC23442F<SavedPaymentMethodResponse> m95427g(@InterfaceC6404PY AddPaymentRequest addPaymentRequest);

    @NA1("v3/payment-method/list")
    /* renamed from: h */
    AbstractC23442F<SavedPaymentMethodResponse> m95426h(@InterfaceC37017Xc4("user_id") String str);

    @AD3("v1/payment/charge/preload-and-maybe-configure-auto-reload")
    /* renamed from: i */
    AbstractC23442F<HM4<PreloadAndMaybeConfigureAutoReloadResponse>> m95425i(@InterfaceC6404PY PreloadAndMaybeConfigureAutoReloadRequest preloadAndMaybeConfigureAutoReloadRequest);
}
