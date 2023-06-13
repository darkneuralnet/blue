package p000;

import android.view.Menu;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.AreaBottomSheetButton;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.VehicleCommand;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC36924Ws1;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\r\u001a\u00020\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\tH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\tH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fH&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u001a\u001a\u00020\nH&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\nH&J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\fH&J\u0018\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\fH&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\tH&J\u0010\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H&J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH&J\u0010\u0010-\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH&J\u0019\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b/\u00100J\b\u00101\u001a\u00020\nH&J\u0010\u00102\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH&J\u0010\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203H&J3\u00109\u001a\u00020\n2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b9\u0010:¨\u0006;"}, m28432d2 = {"LCw3;", "LH31;", "LS74;", "LWs1;", "LWs3;", "LPk3;", "Lpo3;", "Lqx3;", "Lfy3;", "Lio/reactivex/Observable;", "", "xg", "", "Tg", "e1", "fd", "i5", "w3", "visible", "re", "", "numFilters", "Z2", "enabled", "wh", "P6", "Wb", "lk", "ik", "show", "Wi", "Lco/bird/android/model/ParkingNest;", "parkingNest", "", "distance", "p9", "tj", "L7", "E7", "Lco/bird/android/model/AreaBottomSheetButton;", "o2", "LRm;", RequestHeadersFactory.MODEL, "n4", "e7", "ok", "minutesSince", "H6", "(Ljava/lang/Integer;)V", "v8", "kh", "Landroid/view/Menu;", "menu", "Z0", "showManualRefresh", "showNotificationCenter", "notificationCount", "xa", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cw3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC32282Cw3 extends H31, S74, InterfaceC36924Ws1, InterfaceC36926Ws3, InterfaceC35216Pk3, InterfaceC47086po3, InterfaceC47769qx3, InterfaceC41256fy3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cw3$a */
    /* loaded from: classes2.dex */
    public static final class C1261a {
        /* renamed from: a */
        public static void m111265a(InterfaceC32282Cw3 interfaceC32282Cw3) {
            InterfaceC36924Ws1.C9191a.m77774a(interfaceC32282Cw3);
        }

        /* renamed from: b */
        public static Observable<VehicleCommand> m111264b(InterfaceC32282Cw3 interfaceC32282Cw3) {
            return InterfaceC36924Ws1.C9191a.m77772c(interfaceC32282Cw3);
        }

        /* renamed from: c */
        public static void m111263c(InterfaceC32282Cw3 interfaceC32282Cw3, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC36924Ws1.C9191a.m77771d(interfaceC32282Cw3, command);
        }

        public static /* synthetic */ void configureMenu$default(InterfaceC32282Cw3 interfaceC32282Cw3, Boolean bool, Boolean bool2, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureMenu");
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            if ((i & 2) != 0) {
                bool2 = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            interfaceC32282Cw3.mo89300xa(bool, bool2, num);
        }

        /* renamed from: d */
        public static void m111262d(InterfaceC32282Cw3 interfaceC32282Cw3, Collection<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            InterfaceC36924Ws1.C9191a.m77770e(interfaceC32282Cw3, sections);
        }

        /* renamed from: e */
        public static AbstractC24507p<Integer> m111261e(InterfaceC32282Cw3 interfaceC32282Cw3, List<AlarmOption> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return InterfaceC36924Ws1.C9191a.m77769f(interfaceC32282Cw3, options);
        }

        /* renamed from: f */
        public static void m111260f(InterfaceC32282Cw3 interfaceC32282Cw3, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC36924Ws1.C9191a.m77768g(interfaceC32282Cw3, command);
        }

        /* renamed from: g */
        public static void m111259g(InterfaceC32282Cw3 interfaceC32282Cw3, VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            InterfaceC36924Ws1.C9191a.m77767h(interfaceC32282Cw3, command);
        }
    }

    /* renamed from: E7 */
    Observable<Unit> mo89360E7();

    /* renamed from: H6 */
    void mo89359H6(Integer num);

    /* renamed from: L7 */
    void mo89357L7(boolean z);

    /* renamed from: P6 */
    Observable<Unit> mo89354P6();

    /* renamed from: Tg */
    boolean mo89349Tg();

    /* renamed from: Wb */
    void mo89344Wb();

    /* renamed from: Wi */
    void mo89343Wi(boolean z);

    /* renamed from: Z0 */
    void mo89339Z0(Menu menu);

    /* renamed from: Z2 */
    void mo89338Z2(int i);

    /* renamed from: e1 */
    Observable<Unit> mo89330e1();

    /* renamed from: e7 */
    void mo89329e7(boolean z);

    /* renamed from: fd */
    Observable<Boolean> mo89327fd();

    /* renamed from: i5 */
    Observable<Boolean> mo89321i5();

    /* renamed from: ik */
    void mo89320ik();

    /* renamed from: kh */
    void mo89316kh(boolean z);

    /* renamed from: lk */
    void mo89314lk();

    /* renamed from: n4 */
    void mo89311n4(InterfaceC7269Rm interfaceC7269Rm);

    /* renamed from: o2 */
    Observable<AreaBottomSheetButton> mo89309o2();

    /* renamed from: ok */
    void mo89308ok(boolean z);

    /* renamed from: p9 */
    void mo89307p9(ParkingNest parkingNest, float f);

    /* renamed from: re */
    void mo89306re(boolean z);

    /* renamed from: tj */
    Observable<Unit> mo89304tj();

    /* renamed from: v8 */
    void mo89303v8();

    /* renamed from: w3 */
    Observable<Unit> mo89302w3();

    /* renamed from: wh */
    void mo89301wh(boolean z);

    /* renamed from: xa */
    void mo89300xa(Boolean bool, Boolean bool2, Integer num);

    /* renamed from: xg */
    Observable<Unit> mo89299xg();
}
