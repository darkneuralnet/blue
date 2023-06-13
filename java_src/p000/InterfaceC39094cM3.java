package p000;

import co.bird.android.model.wire.WireMerchantSite;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H&J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&J*\u0010 \u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H&¨\u0006!"}, m28432d2 = {"LcM3;", "LaM5;", "Lio/reactivex/Observable;", "", "Nd", "", "toColor", "W1", "", "isNewPayment", "L8", "zf", "Ed", "show", "tg", "M8", "", "transactionAmount", "amountBilled", "Wd", "tip", "Kc", "date", "time", "e8", "Lco/bird/android/model/wire/WireMerchantSite;", "merchantSite", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Pj", "va", "amountOff", "amountPaidByBird", "r4", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cM3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39094cM3 extends InterfaceC37910aM5 {
    /* renamed from: Ed */
    Observable<Unit> mo39594Ed();

    /* renamed from: Kc */
    void mo39593Kc(String str);

    /* renamed from: L8 */
    void mo39592L8(boolean z);

    /* renamed from: M8 */
    Observable<Unit> mo39591M8();

    /* renamed from: Nd */
    Observable<Unit> mo39590Nd();

    /* renamed from: Pj */
    void mo39589Pj(WireMerchantSite wireMerchantSite, String str);

    /* renamed from: W1 */
    void mo39582W1(int i);

    /* renamed from: Wd */
    void mo39581Wd(String str, String str2);

    /* renamed from: e8 */
    void mo39580e8(String str, String str2);

    /* renamed from: r4 */
    void mo39579r4(String str, String str2, String str3, String str4);

    /* renamed from: tg */
    void mo39578tg(boolean z);

    /* renamed from: va */
    void mo39577va(boolean z);

    /* renamed from: zf */
    Observable<Unit> mo39576zf();
}
