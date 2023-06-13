package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.wire.WireCoupon;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u001c\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fH&J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H&J0\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\tH&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\rH&J\u0014\u0010 \u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\tH&J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\tH&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%H&J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\tH&J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H&J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\tH&J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060%H&J\u0012\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020\rH&J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060%H&J\u0010\u00104\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060%H&J\u0010\u00106\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060%H&J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060%H&J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060%H&J\u0010\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060%H&¨\u0006="}, m28432d2 = {"LCP3;", "LS74;", "LaM5;", "LH31;", "Lco/bird/android/model/BirdPayment;", "payment", "", "L2", "aa", "", "show", "w7", "Lkotlin/Function1;", "", "callback", "o4", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/wire/WireCoupon;", "coupon", "hf", "", "balance", "Ljava/util/Currency;", "currency", "couponV2", "", "freeRides", "preloadV2Enabled", "uf", "pricing", "kl", "charge", "Y7", "showAutoPay", "pg", "showGooglePay", "y", "Lio/reactivex/Observable;", "J", "activated", "S7", "LCP3$a;", TransferTable.COLUMN_STATE, "U4", "permissionGranted", "B0", "F", "token", "LG10;", "R", "S", "A", "s4", "Uj", "F5", "pa", "J6", "fb", "s7", "Zb", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CP3 */
/* loaded from: classes2.dex */
public interface CP3 extends S74, InterfaceC37910aM5, H31 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"LCP3$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: CP3$a */
    /* loaded from: classes2.dex */
    public enum EnumC1023a {
        LOADING,
        LOADED_SHOW_CONTENT,
        LOADED_HIDE_CONTENT
    }

    /* renamed from: A */
    Observable<Unit> mo110530A();

    /* renamed from: B0 */
    void mo110529B0(boolean z);

    /* renamed from: F */
    Observable<Unit> mo110528F();

    /* renamed from: F5 */
    void mo110527F5(boolean z);

    /* renamed from: J */
    Observable<Unit> mo110526J();

    /* renamed from: J6 */
    Observable<Unit> mo110525J6();

    /* renamed from: L2 */
    void mo110524L2(BirdPayment birdPayment);

    /* renamed from: R */
    G10 mo110521R(String str);

    /* renamed from: S */
    void mo110519S(boolean z);

    /* renamed from: S7 */
    void mo110518S7(boolean z);

    /* renamed from: U4 */
    void mo110515U4(EnumC1023a enumC1023a);

    /* renamed from: Uj */
    Observable<Unit> mo110514Uj();

    /* renamed from: Y7 */
    void mo110513Y7(String str);

    /* renamed from: Zb */
    Observable<Unit> mo110512Zb();

    /* renamed from: aa */
    void mo110511aa();

    /* renamed from: fb */
    Observable<Unit> mo110510fb();

    /* renamed from: hf */
    void mo110509hf(String str, WireCoupon wireCoupon);

    /* renamed from: kl */
    void mo110508kl(String str);

    /* renamed from: o4 */
    void mo110507o4(Function1<? super String, Unit> function1);

    /* renamed from: pa */
    Observable<Unit> mo110506pa();

    /* renamed from: pg */
    void mo110505pg(boolean z);

    /* renamed from: s4 */
    void mo110504s4(boolean z);

    /* renamed from: s7 */
    void mo110503s7(boolean z);

    /* renamed from: uf */
    void mo110502uf(long j, Currency currency, boolean z, int i, boolean z2);

    /* renamed from: w7 */
    void mo110501w7(boolean z);

    /* renamed from: y */
    void mo110500y(boolean z);
}
