package p000;

import android.view.MenuItem;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J#\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u00100\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u00102\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u00104\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u00105\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH&J=\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010<\u001a\u00020\u0007H&¢\u0006\u0004\b?\u0010@¨\u0006A"}, m28432d2 = {"LM03;", "LZ03;", "LaM5;", "LS74;", "Lio/reactivex/Observable;", "Landroid/view/MenuItem;", "Oe", "", "B8", "visible", "", "R4", "gj", "D1", "qf", "Qf", "ka", "lg", "Nf", "X7", "Va", "f0", "t9", "g5", "M7", "Ud", "L4", "", "count", "taskLimit", "Ti", "(ILjava/lang/Integer;)V", "Zh", "k4", "mf", C9107Wc.f41393c, "V6", "Sg", "Ya", "Hi", "y9", "G3", "Bj", "s5", "Md", "ch", "Wh", "O5", "Yb", "X8", "ob", "fj", "fk", "wl", "jh", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "instructionsStringRes", "showCodeInput", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "Q7", "(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Integer;Z)Lio/reactivex/F;", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: M03 */
/* loaded from: classes2.dex */
public interface M03 extends Z03, InterfaceC37910aM5, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M03$a */
    /* loaded from: classes2.dex */
    public static final class C5147a {
        public static /* synthetic */ AbstractC23442F operatorScanForBird$default(M03 m03, ScanMode scanMode, ScanIntention scanIntention, Integer num, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    num = null;
                }
                if ((i & 8) != 0) {
                    z = true;
                }
                return m03.mo84483Q7(scanMode, scanIntention, num, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: operatorScanForBird");
        }

        public static /* synthetic */ void setTaskListCount$default(M03 m03, int i, Integer num, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTaskListCount");
            }
            if ((i2 & 2) != 0) {
                num = null;
            }
            m03.mo84479Ti(i, num);
        }
    }

    /* renamed from: B8 */
    Observable<Boolean> mo84494B8();

    /* renamed from: Bj */
    void mo84493Bj(boolean z);

    /* renamed from: D1 */
    void mo84492D1(boolean z);

    /* renamed from: G3 */
    void mo84491G3(boolean z);

    /* renamed from: Hi */
    void mo84490Hi(boolean z);

    /* renamed from: L4 */
    void mo84489L4(boolean z);

    /* renamed from: M7 */
    void mo84488M7(boolean z);

    /* renamed from: Md */
    void mo84487Md(boolean z);

    /* renamed from: Nf */
    void mo84486Nf(boolean z);

    /* renamed from: O5 */
    void mo84485O5(boolean z);

    /* renamed from: Oe */
    Observable<MenuItem> mo84484Oe();

    /* renamed from: Q7 */
    AbstractC23442F<WireBird> mo84483Q7(ScanMode scanMode, ScanIntention scanIntention, Integer num, boolean z);

    /* renamed from: Qf */
    void mo84482Qf(boolean z);

    /* renamed from: R4 */
    void mo84481R4(boolean z);

    /* renamed from: Sg */
    void mo84480Sg(boolean z);

    /* renamed from: Ti */
    void mo84479Ti(int i, Integer num);

    /* renamed from: Ud */
    void mo84478Ud(boolean z);

    /* renamed from: V6 */
    void mo84477V6(boolean z);

    /* renamed from: Va */
    void mo84476Va(boolean z);

    /* renamed from: Wc */
    void mo84475Wc(boolean z);

    /* renamed from: Wh */
    void mo84474Wh(boolean z);

    /* renamed from: X7 */
    void mo84473X7(boolean z);

    /* renamed from: X8 */
    void mo84472X8(boolean z);

    /* renamed from: Ya */
    void mo84471Ya(boolean z);

    /* renamed from: Yb */
    void mo84470Yb(boolean z);

    /* renamed from: Zh */
    void mo84468Zh(boolean z);

    /* renamed from: ch */
    void mo84464ch(boolean z);

    /* renamed from: f0 */
    void mo84462f0(boolean z);

    /* renamed from: fj */
    void mo84461fj(boolean z);

    /* renamed from: fk */
    void mo84460fk(boolean z);

    /* renamed from: g5 */
    void mo84459g5(boolean z);

    /* renamed from: gj */
    void mo84458gj(boolean z);

    /* renamed from: jh */
    void mo84457jh(int i);

    /* renamed from: k4 */
    void mo84456k4(boolean z);

    /* renamed from: ka */
    void mo84455ka(boolean z);

    /* renamed from: lg */
    void mo84454lg(boolean z);

    /* renamed from: mf */
    void mo84453mf(boolean z);

    /* renamed from: ob */
    void mo84452ob(boolean z);

    /* renamed from: qf */
    void mo84451qf(boolean z);

    /* renamed from: s5 */
    void mo84450s5(boolean z);

    /* renamed from: t9 */
    void mo84449t9(boolean z);

    /* renamed from: wl */
    void mo84448wl(boolean z);

    /* renamed from: y9 */
    void mo84447y9(boolean z);
}
