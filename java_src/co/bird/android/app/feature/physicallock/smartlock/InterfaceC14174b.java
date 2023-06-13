package co.bird.android.app.feature.physicallock.smartlock;

import co.bird.android.app.feature.physicallock.smartlock.C14176c;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J5\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010,\u001a\u00020\u0004H&J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\rH&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u00060"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/b;", "LaM5;", "LH31;", "Lio/reactivex/Observable;", "", "V0", "", "titleRes", "Lio/reactivex/p;", "Lco/bird/android/app/feature/physicallock/smartlock/c$b;", "dg", "labelRes", "e4", "", "visible", "P0", "O", "", Entry.TYPE_TEXT, "gf", "O0", "H1", "h4", "jg", "c1", "V", "A1", "g0", "s0", "w", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "instructionsStringRes", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "t7", "(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Integer;)Lio/reactivex/F;", "H0", "K1", "J0", "W", "N", "r", "enabled", "a0", "e0", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.physicallock.smartlock.b */
/* loaded from: classes2.dex */
public interface InterfaceC14174b extends InterfaceC37910aM5, H31 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.b$a */
    /* loaded from: classes2.dex */
    public static final class C14175a {
        public static /* synthetic */ AbstractC23442F operatorScanForBird$default(InterfaceC14174b interfaceC14174b, ScanMode scanMode, ScanIntention scanIntention, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    scanIntention = null;
                }
                if ((i & 4) != 0) {
                    num = null;
                }
                return interfaceC14174b.mo59677t7(scanMode, scanIntention, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: operatorScanForBird");
        }
    }

    /* renamed from: A1 */
    void mo59700A1(boolean z);

    /* renamed from: H0 */
    void mo59699H0(boolean z);

    /* renamed from: H1 */
    void mo59698H1(boolean z);

    /* renamed from: J0 */
    Observable<Unit> mo59697J0();

    /* renamed from: K1 */
    Observable<Unit> mo59696K1();

    /* renamed from: N */
    void mo59695N(boolean z);

    /* renamed from: O */
    void mo59694O(boolean z);

    /* renamed from: O0 */
    void mo59693O0(boolean z);

    /* renamed from: P0 */
    void mo59692P0(boolean z);

    /* renamed from: V */
    Observable<Unit> mo59691V();

    /* renamed from: V0 */
    Observable<Unit> mo59690V0();

    /* renamed from: W */
    void mo59689W(boolean z);

    /* renamed from: a0 */
    void mo59688a0(boolean z);

    /* renamed from: c1 */
    void mo59687c1(boolean z);

    /* renamed from: dg */
    AbstractC24507p<C14176c.EnumC14178b> mo59686dg(int i);

    /* renamed from: e0 */
    Observable<Unit> mo59685e0();

    /* renamed from: e4 */
    void mo59684e4(int i);

    /* renamed from: g0 */
    void mo59683g0(boolean z);

    /* renamed from: gf */
    void mo59682gf(String str);

    /* renamed from: h4 */
    void mo59681h4(boolean z);

    /* renamed from: jg */
    Observable<Unit> mo59680jg();

    /* renamed from: r */
    void mo59679r();

    /* renamed from: s0 */
    void mo59678s0(boolean z);

    /* renamed from: t7 */
    AbstractC23442F<WireBird> mo59677t7(ScanMode scanMode, ScanIntention scanIntention, Integer num);

    /* renamed from: w */
    Observable<Unit> mo59676w();
}
