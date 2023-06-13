package p000;

import android.net.Uri;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\n\u0010\r\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\nH&J\b\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0018\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0012\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\u001c\u0010#\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\nH&J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0019H&J\b\u0010&\u001a\u00020\u0019H&J\b\u0010'\u001a\u00020\nH&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH&J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH&J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH&J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH&J\u0010\u00100\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH&J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\nH&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\u0010\u00106\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u00107\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\nH&J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\nH&J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\b\u0010?\u001a\u00020\u0005H&J\u0010\u0010@\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&J\b\u0010D\u001a\u00020\u0005H&J\b\u0010E\u001a\u00020\u0005H&J\b\u0010F\u001a\u00020\u0005H&J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH&¨\u0006H"}, m28432d2 = {"Lex5;", "LAB1;", "LS74;", "Lco/bird/android/model/User;", "user", "", "Ic", "Landroid/net/Uri;", "uri", "Nk", "", "url", "jk", "getName", "eb", "x0", "error", "Tk", "n0", "version", "f3", "Luf1;", "environment", "Ab", "qk", "", "show", "bk", "Lco/bird/android/model/Warehouse;", "warehouse", "Ld", "Lio/reactivex/Observable;", "dd", "qc", "agreement", "h1", "checked", "Xb", "X0", "E0", "H3", "Hl", "c6", "m4", "Wf", "W0", "D3", "Fg", "k3", "pj", "i3", PaymentMethodOptionsParams.Blik.PARAM_CODE, "F6", "ab", "db", "C3", "w4", "Gb", "mode", "X9", "label", "bh", "uk", "xc", "s8", "H7", "Hf", "R9", "z9", "T5", "v2", "Dj", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ex5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC40655ex5 extends AB1, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ex5$a */
    /* loaded from: classes2.dex */
    public static final class C20152a {
        public static /* synthetic */ void showOptInCheckBox$default(InterfaceC40655ex5 interfaceC40655ex5, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showOptInCheckBox");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC40655ex5.mo29620h1(z, str);
        }
    }

    /* renamed from: Ab */
    void mo29659Ab(EnumC49958uf1 enumC49958uf1);

    /* renamed from: C3 */
    void mo29658C3(boolean z);

    /* renamed from: D3 */
    void mo29657D3(boolean z);

    /* renamed from: Dj */
    Observable<Unit> mo29656Dj();

    /* renamed from: E0 */
    String mo29655E0();

    /* renamed from: F6 */
    void mo29654F6(String str);

    /* renamed from: Fg */
    Observable<String> mo29653Fg();

    /* renamed from: Gb */
    Observable<Unit> mo29652Gb();

    /* renamed from: H3 */
    Observable<String> mo29651H3();

    /* renamed from: H7 */
    Observable<Unit> mo29650H7();

    /* renamed from: Hf */
    void mo29649Hf(boolean z);

    /* renamed from: Hl */
    void mo29648Hl(boolean z);

    /* renamed from: Ic */
    void mo29647Ic(User user);

    /* renamed from: Ld */
    void mo29646Ld(Warehouse warehouse);

    /* renamed from: Nk */
    void mo29645Nk(Uri uri);

    /* renamed from: R9 */
    Observable<Unit> mo29642R9();

    /* renamed from: T5 */
    void mo29639T5();

    /* renamed from: Tk */
    void mo29638Tk(String str);

    /* renamed from: W0 */
    Observable<String> mo29634W0();

    /* renamed from: Wf */
    Observable<String> mo29633Wf();

    /* renamed from: X0 */
    boolean mo29631X0();

    /* renamed from: X9 */
    void mo29630X9(String str);

    /* renamed from: Xb */
    void mo29629Xb(boolean z);

    /* renamed from: ab */
    Observable<Unit> mo29628ab();

    /* renamed from: bh */
    void mo29627bh(String str);

    /* renamed from: bk */
    void mo29626bk(boolean z);

    /* renamed from: c6 */
    void mo29625c6(boolean z);

    /* renamed from: db */
    void mo29624db(boolean z);

    /* renamed from: dd */
    Observable<Unit> mo29623dd();

    /* renamed from: eb */
    String mo29622eb();

    /* renamed from: f3 */
    void mo29621f3(String str);

    String getName();

    /* renamed from: h1 */
    void mo29620h1(boolean z, String str);

    /* renamed from: i3 */
    Observable<Boolean> mo29619i3();

    /* renamed from: jk */
    void mo29618jk(String str);

    /* renamed from: k3 */
    void mo29617k3(boolean z);

    /* renamed from: m4 */
    Observable<Unit> mo29616m4();

    /* renamed from: n0 */
    void mo29615n0();

    /* renamed from: pj */
    Observable<Boolean> mo29614pj();

    /* renamed from: qc */
    Observable<Unit> mo29613qc();

    /* renamed from: qk */
    void mo29612qk();

    /* renamed from: s8 */
    void mo29611s8(boolean z);

    /* renamed from: uk */
    void mo29610uk(boolean z);

    /* renamed from: v2 */
    void mo29609v2();

    /* renamed from: w4 */
    Observable<Unit> mo29608w4();

    /* renamed from: x0 */
    String mo29607x0();

    /* renamed from: xc */
    void mo29606xc();

    /* renamed from: z9 */
    void mo29605z9();
}
