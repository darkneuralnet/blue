package p000;

import co.bird.android.model.wire.WireBird;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0004H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\tH&J\b\u0010\u0017\u001a\u00020\u0004H&J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H&J\b\u0010\u001c\u001a\u00020\u0004H&J\u0012\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0012H&J\u001c\u0010 \u001a\u00020\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u0012H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H&J\b\u0010%\u001a\u00020\u0004H&J\b\u0010&\u001a\u00020\u0004H&J\u0012\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'H&¨\u0006*"}, m28432d2 = {"Lhm5;", "", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "tc", "Lak5;", "sk", "c2", "Lio/reactivex/Observable;", "zc", "", "length", "d2", C9916Yi.f46302c, "gk", "sa", "z1", "", "i", "n0", "LXK;", "W3", "jl", "Lco/bird/android/model/wire/WireBird;", "bird", "isHourly", "ec", "u5", "show", "w9", "copy", "Qa", "Vg", "", "tolerance", "d6", "n1", "a1", "Lfm5;", "resultHandler", "l5", "core-basemvp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hm5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC42324hm5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hm5$a */
    /* loaded from: classes2.dex */
    public static final class C22721a {
        public static /* synthetic */ void initCodeEditor$default(InterfaceC42324hm5 interfaceC42324hm5, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initCodeEditor");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            interfaceC42324hm5.mo7476tc(str);
        }

        public static /* synthetic */ boolean showCodeEntryTooltip$default(InterfaceC42324hm5 interfaceC42324hm5, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return interfaceC42324hm5.mo7502Qa(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCodeEntryTooltip");
        }

        public static /* synthetic */ void showInfoText$default(InterfaceC42324hm5 interfaceC42324hm5, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showInfoText");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            interfaceC42324hm5.mo7474w9(z);
        }
    }

    /* renamed from: Qa */
    boolean mo7502Qa(String str, boolean z);

    /* renamed from: Vg */
    Observable<Unit> mo7499Vg();

    /* renamed from: W3 */
    Observable<C9400XK> mo7497W3();

    /* renamed from: Yi */
    void mo7496Yi();

    /* renamed from: a1 */
    void mo7495a1();

    /* renamed from: c2 */
    void mo7493c2();

    /* renamed from: d2 */
    void mo7492d2(int i);

    /* renamed from: d6 */
    void mo7491d6(float f);

    /* renamed from: ec */
    void mo7488ec(WireBird wireBird, boolean z);

    /* renamed from: gk */
    void mo7486gk();

    /* renamed from: i */
    boolean mo7485i();

    /* renamed from: jl */
    void mo7482jl();

    /* renamed from: l5 */
    void mo7481l5(InterfaceC41138fm5 interfaceC41138fm5);

    /* renamed from: n0 */
    void mo7480n0();

    /* renamed from: n1 */
    void mo7479n1();

    /* renamed from: sa */
    Observable<Unit> mo7478sa();

    /* renamed from: sk */
    EnumC38136ak5 mo7477sk();

    /* renamed from: tc */
    void mo7476tc(String str);

    /* renamed from: u5 */
    void mo7475u5();

    /* renamed from: w9 */
    void mo7474w9(boolean z);

    /* renamed from: z1 */
    Observable<Unit> mo7472z1();

    /* renamed from: zc */
    Observable<String> mo7471zc();
}
