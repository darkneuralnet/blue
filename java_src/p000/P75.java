package p000;

import android.view.View;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.RideStatusEndButton;
import co.bird.android.model.RideStatusLockButton;
import co.bird.android.model.RideStatusManageRidesButton;
import co.bird.android.model.RideStatusScanAfterReserveButton;
import co.bird.android.model.RideStatusUnlockButton;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.ScanButtonShape;
import co.bird.android.model.constant.ScanButtonStyle;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.configs.WarningPresentationKind;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
@Metadata(m28433d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0006H&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\u0011\u001a\u00020\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH&J\b\u0010\u0012\u001a\u00020\u0006H&J\b\u0010\u0013\u001a\u00020\u0003H&J2\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0\u0017H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u001c\u0010!\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H&J\u0016\u0010,\u001a\u00020\u00032\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&J\b\u0010.\u001a\u00020-H&J-\u00103\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00101\u001a\u0004\u0018\u00010\u00142\b\u00102\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b3\u00104J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u000305H&J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u000305H&J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u000305H&J\u001a\u0010:\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u0006H&J\u001a\u0010;\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u0006H&J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000305H&J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000305H&JO\u0010D\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\u0010B\u001a\u0004\u0018\u00010/2\b\u0010C\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0014H&J\u0010\u0010H\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0014H&J\u0010\u0010I\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0014H&J\u001e\u0010J\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&J\u001e\u0010K\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&J\u001e\u0010L\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&J\u0010\u0010N\u001a\u00020\u00032\u0006\u0010M\u001a\u00020/H&J\u0010\u0010O\u001a\u00020\u00032\u0006\u0010M\u001a\u00020/H&J\u0010\u0010P\u001a\u00020\u00032\u0006\u0010M\u001a\u00020/H&J\u0010\u0010S\u001a\u00020\u00032\u0006\u0010R\u001a\u00020QH&J\u0012\u0010U\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020\u0006H&J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000305H&J\u0014\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0W05H&J\u0010\u0010[\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020XH&J\u0018\u0010`\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H&J\u0010\u0010a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000305H&J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000305H&J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020)0(H&J\b\u0010e\u001a\u00020\u0003H&J\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020f05H&J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020h05H&J\u000e\u0010k\u001a\b\u0012\u0004\u0012\u00020j05H&J\u000e\u0010m\u001a\b\u0012\u0004\u0012\u00020l05H&J\u000e\u0010o\u001a\b\u0012\u0004\u0012\u00020n05H&J\u000e\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000305H&R\u001c\u0010u\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010t¨\u0006v"}, m28432d2 = {"LP75;", "LAB1;", "LS74;", "", "vg", "Sb", "", "zd", "show", "R7", "La75;", "rideStatus", "Qd", "sf", "Q2", "Lkotlin/Function0;", "onDismiss", "H5", "c4", "n7", "", "dialogTitle", "dialogContent", "", "", "options", "Gg", "Z9", "U1", "de", "M6", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "purpose", "kc", "Ce", "Xi", "LQM4;", "alertDialog", "Lco/bird/android/model/wire/configs/WarningPresentationKind;", "presentationKind", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Ck", "onPrimary", "N0", "Lio/reactivex/c;", "V7", "", "iconRes", "titleText", "bodyText", "vk", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/c;", "Lio/reactivex/Observable;", "Kb", "O7", "Fa", "showPhysicalLockCopy", "ad", "Sd", "F", AbstractC3831J1.f16564d, "Q", "title", "message", "onSecondary", "fee", "currency", "k1", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;)V", "duration", "Cg", "E2", "k5", "X6", "Pi", "n3", "minutes", "od", "Jc", "Zc", "LYz1;", "status", "Y1", "animated", "Bi", "W9", "Lco/bird/android/buava/Optional;", "Landroid/view/View;", "di", "bottomSheet", "yk", "Lco/bird/android/model/constant/ScanButtonStyle;", "scanButtonStyle", "Lco/bird/android/model/constant/ScanButtonShape;", "scanButtonShape", "ic", "Ff", "ra", "b3", "Ci", "Xa", "Lco/bird/android/model/RideStatusUnlockButton;", "Ok", "Lco/bird/android/model/RideStatusLockButton;", "uh", "Lco/bird/android/model/RideStatusEndButton;", "o9", "Lco/bird/android/model/RideStatusManageRidesButton;", "mi", "Lco/bird/android/model/RideStatusScanAfterReserveButton;", Bird_Kt.MODEL_BIRD_B4, "Zg", "getShowGroupRide", "()Z", "Z8", "(Z)V", "showGroupRide", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: P75 */
/* loaded from: classes2.dex */
public interface P75 extends AB1, S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: P75$a */
    /* loaded from: classes2.dex */
    public static final class C6268a {
        public static /* synthetic */ void hideFrequentFlyerStatus$default(P75 p75, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideFrequentFlyerStatus");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            p75.mo75663Bi(z);
        }

        public static /* synthetic */ void locationPermissionBanner$default(P75 p75, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: locationPermissionBanner");
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            p75.mo75632Sd(z, z2);
        }

        public static /* synthetic */ void locationServicesBanner$default(P75 p75, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: locationServicesBanner");
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            p75.mo75616ad(z, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showHowToRideDialog$default(P75 p75, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHowToRideDialog");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            p75.mo75647H5(function0);
        }

        public static /* synthetic */ void showPhysicalLockButton$default(P75 p75, boolean z, PhysicalLockPurpose physicalLockPurpose, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPhysicalLockButton");
            }
            if ((i & 2) != 0) {
                physicalLockPurpose = PhysicalLockPurpose.LOCK_TO;
            }
            p75.mo75605kc(z, physicalLockPurpose);
        }

        public static /* synthetic */ void showRideButton$default(P75 p75, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRideButton");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            p75.mo75634R7(z);
        }
    }

    /* renamed from: Bi */
    void mo75663Bi(boolean z);

    /* renamed from: Ce */
    void mo75661Ce();

    /* renamed from: Cg */
    void mo75660Cg(String str);

    /* renamed from: Ci */
    AbstractC23442F<DialogResponse> mo75659Ci();

    /* renamed from: Ck */
    AbstractC23442F<DialogResponse> mo75658Ck(QM4 qm4, WarningPresentationKind warningPresentationKind);

    /* renamed from: E2 */
    void mo75655E2(String str);

    /* renamed from: F */
    Observable<Unit> mo75653F();

    /* renamed from: Fa */
    Observable<Unit> mo75652Fa();

    /* renamed from: Ff */
    void mo75651Ff(boolean z);

    /* renamed from: Gg */
    void mo75649Gg(String str, String str2, Map<CharSequence, Function0<Unit>> map);

    /* renamed from: H5 */
    void mo75647H5(Function0<Unit> function0);

    /* renamed from: J1 */
    void mo75645J1(boolean z);

    /* renamed from: Jc */
    void mo75644Jc(int i);

    /* renamed from: Kb */
    Observable<Unit> mo75643Kb();

    /* renamed from: M6 */
    void mo75642M6(boolean z);

    /* renamed from: N0 */
    void mo75641N0(Function0<Unit> function0);

    /* renamed from: O7 */
    Observable<Unit> mo75640O7();

    /* renamed from: Ok */
    Observable<RideStatusUnlockButton> mo75639Ok();

    /* renamed from: Pi */
    void mo75638Pi(String str, Function0<Unit> function0);

    /* renamed from: Q */
    Observable<Unit> mo75637Q();

    /* renamed from: Q2 */
    void mo75636Q2(C37772a75 c37772a75);

    /* renamed from: Qd */
    void mo75635Qd(C37772a75 c37772a75);

    /* renamed from: R7 */
    void mo75634R7(boolean z);

    /* renamed from: Sb */
    void mo75633Sb();

    /* renamed from: Sd */
    void mo75632Sd(boolean z, boolean z2);

    /* renamed from: U1 */
    void mo75631U1();

    /* renamed from: V7 */
    AbstractC23461c mo75630V7();

    /* renamed from: W9 */
    Observable<Unit> mo75629W9();

    /* renamed from: X6 */
    void mo75627X6(String str, Function0<Unit> function0);

    /* renamed from: Xa */
    void mo75626Xa();

    /* renamed from: Xi */
    void mo75625Xi(boolean z);

    /* renamed from: Y1 */
    void mo75623Y1(C37455Yz1 c37455Yz1);

    /* renamed from: Z8 */
    void mo75621Z8(boolean z);

    /* renamed from: Z9 */
    void mo75620Z9();

    /* renamed from: Zc */
    void mo75619Zc(int i);

    /* renamed from: Zg */
    Observable<Unit> mo75618Zg();

    /* renamed from: ad */
    void mo75616ad(boolean z, boolean z2);

    /* renamed from: b3 */
    Observable<Unit> mo75615b3();

    /* renamed from: b4 */
    Observable<RideStatusScanAfterReserveButton> mo75614b4();

    /* renamed from: c4 */
    boolean mo75613c4();

    /* renamed from: de */
    void mo75612de(boolean z);

    /* renamed from: di */
    Observable<Optional<View>> mo75611di();

    /* renamed from: ic */
    void mo75610ic(ScanButtonStyle scanButtonStyle, ScanButtonShape scanButtonShape);

    /* renamed from: k1 */
    void mo75607k1(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Integer num, String str3);

    /* renamed from: k5 */
    void mo75606k5(String str);

    /* renamed from: kc */
    void mo75605kc(boolean z, PhysicalLockPurpose physicalLockPurpose);

    /* renamed from: mi */
    Observable<RideStatusManageRidesButton> mo75602mi();

    /* renamed from: n3 */
    void mo75600n3(String str, Function0<Unit> function0);

    /* renamed from: n7 */
    void mo75599n7();

    /* renamed from: o9 */
    Observable<RideStatusEndButton> mo75597o9();

    /* renamed from: od */
    void mo75596od(int i);

    /* renamed from: ra */
    Observable<Unit> mo75592ra();

    /* renamed from: sf */
    boolean mo75590sf();

    /* renamed from: uh */
    Observable<RideStatusLockButton> mo75587uh();

    /* renamed from: vg */
    void mo75585vg();

    /* renamed from: vk */
    AbstractC23461c mo75584vk(Integer num, String str, String str2);

    /* renamed from: yk */
    void mo75580yk(View view);

    /* renamed from: zd */
    boolean mo75578zd();
}
