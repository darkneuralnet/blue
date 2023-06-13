package p000;

import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH&J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\nH&J\u001c\u0010\u0014\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0007H&J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u001a\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\nH&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J\u001a\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e0\u001bH&J\u0012\u0010#\u001a\u00020\u00052\b\b\u0001\u0010\"\u001a\u00020\u0007H&J\u0012\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\nH&J\b\u0010'\u001a\u00020\u0005H&J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020 H&J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H&J\u0012\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010/H&J\u0010\u00102\u001a\u00020\u00052\u0006\u0010(\u001a\u00020 H&J\u0010\u00103\u001a\u00020\u00052\u0006\u0010(\u001a\u00020 H&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH&J\b\u00106\u001a\u00020\u0005H&J\u0016\u00109\u001a\u00020\u00052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000507H&¨\u0006:"}, m28432d2 = {"LF75;", "Lh56;", "LaM5;", "Lco/bird/android/model/wire/WireRideDetail;", "detail", "", "ni", "", "title", "setTitle", "", "t", "subtitle", AbstractC26684u0.f100690q, "animation", "Y8", "finalCost", "vh", "url", "fallback", "E8", "strikeThroughCost", "Oa", Entry.TYPE_TEXT, C8706Vc.f39333b, "y2", "tl", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireRide;", "Xf", "Lkotlin/Pair;", "", "", "Bc", "imageRes", "k6", "imageUrl", "Lio/reactivex/c;", "Bl", "tk", "show", "n5", "", "amountSaved", "Ljava/util/Currency;", "currency", "z2", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "progress", "N2", "pb", "i0", "m9", "Wk", "D", "Lkotlin/Function0;", "action", "X2", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: F75 */
/* loaded from: classes3.dex */
public interface F75 extends InterfaceC41921h56, InterfaceC37910aM5 {
    /* renamed from: Bc */
    Observable<Pair<Float, Boolean>> mo95767Bc();

    /* renamed from: Bl */
    AbstractC23461c mo95766Bl(String str);

    /* renamed from: D */
    void mo95765D();

    /* renamed from: E8 */
    void mo95764E8(String str, int i);

    /* renamed from: N2 */
    void mo95763N2(WireFrequentFlyerView wireFrequentFlyerView);

    /* renamed from: Oa */
    void mo95762Oa(String str);

    /* renamed from: Vc */
    void mo95761Vc(String str);

    /* renamed from: Wk */
    Observable<Unit> mo95760Wk();

    /* renamed from: X2 */
    void mo95759X2(Function0<Unit> function0);

    /* renamed from: Xf */
    Observable<WireRide> mo95758Xf();

    /* renamed from: Y8 */
    void mo95757Y8(String str);

    /* renamed from: i0 */
    void mo95756i0(boolean z);

    /* renamed from: k6 */
    void mo95753k6(int i);

    /* renamed from: m9 */
    Observable<Unit> mo95750m9();

    /* renamed from: n5 */
    void mo95748n5(boolean z);

    /* renamed from: ni */
    void mo95747ni(WireRideDetail wireRideDetail);

    /* renamed from: pb */
    void mo95744pb(boolean z);

    void setTitle(int i);

    /* renamed from: t */
    void mo95739t(String str);

    /* renamed from: tk */
    void mo95738tk();

    /* renamed from: tl */
    void mo95737tl(String str);

    /* renamed from: u0 */
    void mo95735u0(String str);

    /* renamed from: vh */
    void mo95733vh(String str);

    /* renamed from: y2 */
    void mo95731y2(String str);

    /* renamed from: z2 */
    void mo95730z2(long j, Currency currency);
}
