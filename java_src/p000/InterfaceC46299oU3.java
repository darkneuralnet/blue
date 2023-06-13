package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireMerchantAction;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H&J\u001c\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00160\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0013R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0013R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0013R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0013R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b050\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0013R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b050\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0013¨\u0006:"}, m28432d2 = {"LoU3;", "", "", "siteId", "", "z0", "F0", "B0", "Lco/bird/android/model/wire/WireMerchantAction;", "action", "M0", "Lio/reactivex/Observable;", "b", "id", "G0", "uriString", "title", "y0", "E0", "()Lio/reactivex/Observable;", "toolbarTitle", "getTitle", "", "LXT3;", "O0", "images", "", "H0", "descriptionVisible", "getDescription", "description", "D0", "addressVisible", "getAddress", PaymentMethod.BillingDetails.PARAM_ADDRESS, "I0", "hoursVisible", "getHours", "hours", "L0", "phoneVisible", "x0", PaymentMethod.BillingDetails.PARAM_PHONE, "Lne3;", C17296a.f69688o, "offers", "K0", "attemptCall", "Lco/bird/android/model/wire/WireMerchantSite;", "A0", "merchantSite", "N0", "listActionButtons", "Lco/bird/android/buava/Optional;", "C0", "footerPrimaryActionButton", "J0", "footerSecondaryActionButton", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oU3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC46299oU3 {
    /* renamed from: A0 */
    Observable<WireMerchantSite> mo21010A0();

    /* renamed from: B0 */
    void mo21009B0();

    /* renamed from: C0 */
    Observable<Optional<WireMerchantAction>> mo21008C0();

    /* renamed from: D0 */
    Observable<Boolean> mo21007D0();

    /* renamed from: E0 */
    Observable<String> mo21006E0();

    /* renamed from: F0 */
    void mo21005F0();

    /* renamed from: G0 */
    void mo21004G0(String str);

    /* renamed from: H0 */
    Observable<Boolean> mo21003H0();

    /* renamed from: I0 */
    Observable<Boolean> mo21002I0();

    /* renamed from: J0 */
    Observable<Optional<WireMerchantAction>> mo21001J0();

    /* renamed from: K0 */
    Observable<String> mo21000K0();

    /* renamed from: L0 */
    Observable<Boolean> mo20999L0();

    /* renamed from: M0 */
    void mo20998M0(WireMerchantAction wireMerchantAction);

    /* renamed from: N0 */
    Observable<List<WireMerchantAction>> mo20997N0();

    /* renamed from: O0 */
    Observable<List<XT3>> mo20996O0();

    /* renamed from: a */
    Observable<List<C45800ne3>> mo20995a();

    /* renamed from: b */
    Observable<WireMerchantAction> mo20994b();

    Observable<String> getAddress();

    Observable<String> getDescription();

    Observable<String> getHours();

    Observable<String> getTitle();

    /* renamed from: x0 */
    Observable<String> mo20993x0();

    /* renamed from: y0 */
    void mo20992y0(String str, String str2);

    /* renamed from: z0 */
    void mo20991z0(String str);
}
