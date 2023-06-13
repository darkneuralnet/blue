package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.RideStartTimeConstraint;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LX55;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "LYR4;", C17296a.f69688o, "LYR4;", "rideManager", "Lb65;", "b", "Lb65;", "ui", "<init>", "(LYR4;Lb65;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStartInBadAreaBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartInBadAreaBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/RideStartInBadAreaBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,33:1\n180#2:34\n*S KotlinDebug\n*F\n+ 1 RideStartInBadAreaBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/RideStartInBadAreaBannerPresenterImpl\n*L\n24#1:34\n*E\n"})
/* renamed from: X55 */
/* loaded from: classes2.dex */
public final class X55 implements FlightBanner {

    /* renamed from: a */
    public final YR4 f42634a;

    /* renamed from: b */
    public final InterfaceC38355b65 f42635b;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideStartTimeConstraint;", "kotlin.jvm.PlatformType", "timeConstraint", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: X55$a */
    /* loaded from: classes2.dex */
    public static final class C9295a extends Lambda implements Function1<Optional<RideStartTimeConstraint>, Unit> {
        public C9295a() {
            super(1);
        }

        /* renamed from: a */
        public final void m77416a(Optional<RideStartTimeConstraint> optional) {
            Integer num;
            RideStartTimeConstraint m59035e = optional.m59035e();
            if (m59035e != null) {
                num = Integer.valueOf(m59035e.secondsRemaining());
            } else {
                num = null;
            }
            if (num != null) {
                X55 x55 = X55.this;
                x55.f42635b.mo61929Z6(num.intValue());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<RideStartTimeConstraint> optional) {
            m77416a(optional);
            return Unit.INSTANCE;
        }
    }

    public X55(YR4 rideManager, InterfaceC38355b65 ui) {
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f42634a = rideManager;
        this.f42635b = ui;
    }

    /* renamed from: b */
    public static final void m77417b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Object m33094as = this.f42634a.mo75065F().m33094as(AutoDispose.m45239a(this.f42635b.scope()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9295a c9295a = new C9295a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: W55
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                X55.m77417b(Function1.this, obj);
            }
        });
    }
}
