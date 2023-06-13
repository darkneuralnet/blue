package p000;

import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet;
import co.bird.android.widget.ControlButton;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.H31;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LTH3;", "LxE;", "LRH3;", "Lio/reactivex/Observable;", "", "Ki", "", "show", "ng", "Y2", "N8", "", "incentive", "Ljava/util/Currency;", "currency", "Ga", "", "ve", "Lco/bird/android/widget/ControlButton;", "b", "Lco/bird/android/widget/ControlButton;", "rideButton", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "parkingPill", DateTokenConverter.CONVERTER_KEY, "parkingAnnoucementPill", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "e", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "rideStatusBottomSheet", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/ControlButton;Landroid/widget/TextView;Landroid/widget/TextView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TH3 */
/* loaded from: classes2.dex */
public final class TH3 extends AbstractC30071xE implements RH3 {

    /* renamed from: b */
    public final ControlButton f35166b;

    /* renamed from: c */
    public final TextView f35167c;

    /* renamed from: d */
    public final TextView f35168d;

    /* renamed from: e */
    public final RideStatusBottomSheet f35169e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH3$a */
    /* loaded from: classes2.dex */
    public static final class C7748a extends Lambda implements Function1<Unit, Integer> {
        public C7748a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(TH3.this.f35166b.getVisibility());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH3$b */
    /* loaded from: classes2.dex */
    public static final class C7749b extends Lambda implements Function0<Unit> {
        public C7749b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TH3.this.dismissDialog();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TH3(BaseActivity activity, ControlButton rideButton, TextView parkingPill, TextView parkingAnnoucementPill) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rideButton, "rideButton");
        Intrinsics.checkNotNullParameter(parkingPill, "parkingPill");
        Intrinsics.checkNotNullParameter(parkingAnnoucementPill, "parkingAnnoucementPill");
        this.f35166b = rideButton;
        this.f35167c = parkingPill;
        this.f35168d = parkingAnnoucementPill;
        this.f35169e = (RideStatusBottomSheet) C40788fB0.m41758x(activity, C36585Vg4.rideStatusBottomSheet);
    }

    /* renamed from: Ql */
    public static final Integer m83976Ql(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    @Override // p000.RH3
    /* renamed from: Ga */
    public void mo83980Ga(long j, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        String m4408d = C51916xx1.f118396a.m4408d(j, currency, EnumC36501Ux1.SHOW_IF_NON_ZERO);
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_parking_nest_intro, (Integer) null, (Integer) null, false, false, false, (Integer) null, Integer.valueOf(C36585Vg4.body), (CharSequence) null, (CharSequence) getActivity().getString(C45871nl4.parking_nest_dialog_body, m4408d), C36585Vg4.primaryButton, (Integer) null, (String) null, (String) null, (Function0) new C7749b(), (Function0) null, (Function0) null, (Function0) null, false, 506238, (Object) null);
    }

    @Override // p000.RH3
    /* renamed from: Ki */
    public Observable<Unit> mo83979Ki() {
        return C44626lf5.clicksThrottle$default(this.f35167c, 0L, 1, null);
    }

    @Override // p000.RH3
    /* renamed from: N8 */
    public Observable<Unit> mo83978N8() {
        return C44626lf5.clicksThrottle$default(this.f35168d, 0L, 1, null);
    }

    @Override // p000.RH3
    /* renamed from: Y2 */
    public void mo83975Y2(boolean z) {
        C49520tu6.show$default(this.f35168d, z, 0, 2, null);
    }

    @Override // p000.RH3
    /* renamed from: ng */
    public void mo83974ng(boolean z) {
        C49520tu6.show$default(this.f35167c, z, 0, 2, null);
    }

    @Override // p000.RH3
    /* renamed from: ve */
    public Observable<Integer> mo83973ve() {
        Observable<Unit> m25212c = C45219mf5.m25212c(this.f35166b);
        final C7748a c7748a = new C7748a();
        Observable<Integer> distinctUntilChanged = m25212c.map(new InterfaceC23492o() { // from class: SH3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m83976Ql;
                m83976Ql = TH3.m83976Ql(Function1.this, obj);
                return m83976Ql;
            }
        }).startWith((Observable<R>) Integer.valueOf(this.f35166b.getVisibility())).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "override fun observeRide…istinctUntilChanged()\n  }");
        return distinctUntilChanged;
    }
}
