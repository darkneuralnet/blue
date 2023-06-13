package p000;

import android.annotation.SuppressLint;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Zone;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m28432d2 = {"LtN1;", "LxC;", "LqN1;", "", C17296a.f69688o, "Landroid/location/Location;", "location", "z", "(Landroid/location/Location;)V", "LuN1;", "c", "LuN1;", "ui", "Ldr4;", DateTokenConverter.CONVERTER_KEY, "Ldr4;", "locationManager", "LTq4;", "e", "LTq4;", "reactiveConfig", "Llh6;", "f", "Llh6;", "userManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LuN1;Ldr4;LTq4;Llh6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHowToRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HowToRidePresenter.kt\nco/bird/android/app/feature/howtoride/HowToRidePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,53:1\n199#2:54\n180#2:55\n*S KotlinDebug\n*F\n+ 1 HowToRidePresenter.kt\nco/bird/android/app/feature/howtoride/HowToRidePresenterImpl\n*L\n38#1:54\n47#1:55\n*E\n"})
/* renamed from: tN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49198tN1 extends C30060xC implements InterfaceC47420qN1 {

    /* renamed from: c */
    public final InterfaceC49791uN1 f110340c;

    /* renamed from: d */
    public final InterfaceC40001dr4 f110341d;

    /* renamed from: e */
    public final C36207Tq4 f110342e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f110343f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Zone;", "kotlin.jvm.PlatformType", "zone", "", C17296a.f69688o, "(Lco/bird/android/model/Zone;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tN1$a */
    /* loaded from: classes2.dex */
    public static final class C28684a extends Lambda implements Function1<Zone, Unit> {
        public C28684a() {
            super(1);
        }

        /* renamed from: a */
        public final void m12483a(Zone zone) {
            C49198tN1.this.f110340c.mo8768m3(zone.getRules());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Zone zone) {
            m12483a(zone);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tN1$b */
    /* loaded from: classes2.dex */
    public static final class C28685b extends Lambda implements Function1<Location, Unit> {
        public C28685b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            C49198tN1 c49198tN1 = C49198tN1.this;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            c49198tN1.m12484z(location);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49198tN1(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC49791uN1 ui, InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.f110340c = ui;
        this.f110341d = locationManager;
        this.f110342e = reactiveConfig;
        this.f110343f = userManager;
    }

    /* renamed from: A */
    public static final void m12489A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m12488B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47420qN1
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public void mo12487a() {
        Config value = this.f110342e.m82623f8().getValue();
        this.f110340c.mo8770A6(value.getRideConfig().getBasePrice(), value.getRideConfig().getMinutePrice(), C45097mS5.m25591o(value.getRideConfig().getCurrency()));
        AbstractC23442F<Location> m33152N = this.f110341d.mo43627e(true).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "locationManager\n      .r…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28685b c28685b = new C28685b();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: rN1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49198tN1.m12488B(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public final void m12484z(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Object m33094as = this.f110343f.mo26975M(location).m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28684a c28684a = new C28684a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: sN1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49198tN1.m12489A(Function1.this, obj);
            }
        });
    }
}
