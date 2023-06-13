package p000;

import android.content.Context;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.wire.WireBirdTrack;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideTransaction;
import co.bird.android.model.wire.WireRideTransactionItem;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH&J(\u0010\u0019\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\bH&J\u001e\u0010\u001d\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u001c\u001a\u00020\u0016H&J&\u0010!\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010 \u001a\u0004\u0018\u00010\u0016H&J\u0014\u0010#\u001a\u00020\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016H&J\u0012\u0010$\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H&J\u0012\u0010(\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&J\u0019\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)H&¢\u0006\u0004\b+\u0010,J\u0012\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010-H&J\u0010\u00100\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u00101\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\b\u00102\u001a\u00020\u0006H&J\b\u00103\u001a\u00020\u0006H&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u000604H&J\u001c\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u0001062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u000604H&J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000604H&J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000604H&J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000604H&J\b\u0010>\u001a\u00020=H&¨\u0006?"}, m28432d2 = {"LsQ4;", "LS74;", "LH31;", "LaM5;", "Lco/bird/android/model/wire/WireRideDetail;", "detail", "", "m5", "", "show", "i0", "", "distance", "B7", "Lco/bird/android/model/wire/WireRide;", "ride", "useBilledMinutes", "hideTime", "vl", "", "Lco/bird/android/model/wire/WireBirdTrack;", "tracks", "", "vehicleModel", "displayPartnerName", "Dl", "Lco/bird/android/model/wire/WireRideTransactionItem;", "lineItems", "receiptCurrency", "xh", "birdNumber", "thirdPartyName", "thirdPartyNumber", "Fk", "status", "N7", "Vh", "", "resId", "Th", "g6", "", "rating", "bg", "(Ljava/lang/Float;)V", "Lco/bird/android/model/wire/WireRideTransaction;", "transaction", "A3", "oj", "Q8", "e6", "Gd", "Lio/reactivex/Observable;", "ed", "Lco/bird/android/model/MobilePartner;", "partner", "Re", "I3", "u6", "rj", "Cj", "Landroid/content/Context;", "getContext", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sQ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC48635sQ4 extends S74, H31, InterfaceC37910aM5 {
    /* renamed from: A3 */
    void mo8730A3(WireRideTransaction wireRideTransaction);

    /* renamed from: B7 */
    void mo8729B7(double d);

    /* renamed from: Cj */
    Observable<Unit> mo8728Cj();

    /* renamed from: Dl */
    void mo8726Dl(List<WireBirdTrack> list, String str, boolean z);

    /* renamed from: Fk */
    void mo8725Fk(String str, String str2, String str3);

    /* renamed from: Gd */
    void mo8724Gd();

    /* renamed from: I3 */
    Observable<Unit> mo8723I3();

    /* renamed from: N7 */
    void mo8722N7(String str);

    /* renamed from: Q8 */
    void mo8720Q8(boolean z);

    /* renamed from: Re */
    void mo8718Re(MobilePartner mobilePartner, String str);

    /* renamed from: Th */
    void mo8715Th(int i);

    /* renamed from: Vh */
    void mo8714Vh(boolean z);

    /* renamed from: bg */
    void mo8713bg(Float f);

    /* renamed from: e6 */
    void mo8712e6();

    /* renamed from: ed */
    Observable<Unit> mo8711ed();

    /* renamed from: g6 */
    void mo8710g6(boolean z);

    Context getContext();

    /* renamed from: i0 */
    void mo8709i0(boolean z);

    /* renamed from: m5 */
    void mo8708m5(WireRideDetail wireRideDetail);

    /* renamed from: oj */
    void mo8707oj(boolean z);

    /* renamed from: rj */
    Observable<Unit> mo8706rj();

    /* renamed from: u6 */
    Observable<Unit> mo8705u6();

    /* renamed from: vl */
    void mo8704vl(WireRide wireRide, boolean z, boolean z2);

    /* renamed from: xh */
    void mo8703xh(List<WireRideTransactionItem> list, String str);
}
