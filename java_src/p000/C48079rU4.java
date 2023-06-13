package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideMapState;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R'\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R'\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010+R'\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b-\u0010+R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b1\u0010+R!\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b!\u0010+R(\u00107\u001a\u0004\u0018\u00010 2\b\u00103\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b\u001d\u00106R(\u0010<\u001a\u0004\u0018\u00010$2\b\u00108\u001a\u0004\u0018\u00010$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u00109\"\u0004\b:\u0010;¨\u0006A"}, m28432d2 = {"LrU4;", "LpU4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "k", "b", "", "birds", "m", "Lco/bird/android/model/RideMapState;", "rideMapState", "c", "expectedRideMapState", "o", "Lco/bird/android/model/RideUpdateState;", "rideUpdateState", "j", "", "focused", C17296a.f69688o, "e", "reset", "La94;", "Lco/bird/android/buava/Optional;", "La94;", "mutableCurrentBird", "mutableCurrentBirds", "mutableFocusedBird", DateTokenConverter.CONVERTER_KEY, "mutableRideMapState", "mutableRideStatusUpdating", "Landroid/location/Location;", "f", "Landroid/location/Location;", "mapLocation", "", "g", "Ljava/lang/Double;", "mapRadius", "LZ84;", "h", "Lkotlin/Lazy;", "()LZ84;", "currentBird", "i", "getCurrentBirds", "currentBirds", "focusedBird", "l", "rideStatusUpdating", "location", "p", "()Landroid/location/Location;", "(Landroid/location/Location;)V", "riderMapLocation", "value", "()Ljava/lang/Double;", "n", "(Ljava/lang/Double;)V", "riderMapRadius", "LRh6;", "userStream", "<init>", "(LRh6;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideMapStateManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideMapStateManagerImpl.kt\nco/bird/android/manager/ride/RideMapStateManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,101:1\n180#2:102\n*S KotlinDebug\n*F\n+ 1 RideMapStateManagerImpl.kt\nco/bird/android/manager/ride/RideMapStateManagerImpl\n*L\n31#1:102\n*E\n"})
/* renamed from: rU4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48079rU4 implements InterfaceC46893pU4 {

    /* renamed from: a */
    public final C37791a94<Optional<WireBird>> f107128a;

    /* renamed from: b */
    public final C37791a94<List<WireBird>> f107129b;

    /* renamed from: c */
    public final C37791a94<Optional<WireBird>> f107130c;

    /* renamed from: d */
    public final C37791a94<RideMapState> f107131d;

    /* renamed from: e */
    public final C37791a94<RideUpdateState> f107132e;

    /* renamed from: f */
    public Location f107133f;

    /* renamed from: g */
    public Double f107134g;

    /* renamed from: h */
    public final Lazy f107135h;

    /* renamed from: i */
    public final Lazy f107136i;

    /* renamed from: j */
    public final Lazy f107137j;

    /* renamed from: k */
    public final Lazy f107138k;

    /* renamed from: l */
    public final Lazy f107139l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rU4$a */
    /* loaded from: classes4.dex */
    public static final class C27927a extends Lambda implements Function1<User, Unit> {
        public C27927a() {
            super(1);
        }

        /* renamed from: a */
        public final void m15890a(User user) {
            C48079rU4.this.reset();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m15890a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rU4$b */
    /* loaded from: classes4.dex */
    public static final class C27928b extends Lambda implements Function0<Z84<Optional<WireBird>>> {
        public C27928b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireBird>> invoke() {
            return Z84.f47888d.m73663b(C48079rU4.this.f107128a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rU4$c */
    /* loaded from: classes4.dex */
    public static final class C27929c extends Lambda implements Function0<Z84<List<? extends WireBird>>> {
        public C27929c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireBird>> invoke2() {
            return Z84.f47888d.m73663b(C48079rU4.this.f107129b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rU4$d */
    /* loaded from: classes4.dex */
    public static final class C27930d extends Lambda implements Function0<Z84<Optional<WireBird>>> {
        public C27930d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireBird>> invoke() {
            return Z84.f47888d.m73663b(C48079rU4.this.f107130c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Lco/bird/android/model/RideMapState;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rU4$e */
    /* loaded from: classes4.dex */
    public static final class C27931e extends Lambda implements Function0<Z84<RideMapState>> {
        public C27931e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<RideMapState> invoke() {
            return Z84.f47888d.m73663b(C48079rU4.this.f107131d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Lco/bird/android/model/RideUpdateState;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rU4$f */
    /* loaded from: classes4.dex */
    public static final class C27932f extends Lambda implements Function0<Z84<RideUpdateState>> {
        public C27932f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<RideUpdateState> invoke() {
            return Z84.f47888d.m73663b(C48079rU4.this.f107132e);
        }
    }

    public C48079rU4(InterfaceC35660Rh6 userStream) {
        List emptyList;
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f107128a = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f107129b = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        this.f107130c = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f107131d = C37791a94.C10586a.create$default(c10586a, RideMapState.NONE, null, 2, null);
        this.f107132e = C37791a94.C10586a.create$default(c10586a, RideUpdateState.NONE, null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27927a c27927a = new C27927a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qU4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48079rU4.m15891r(Function1.this, obj);
            }
        });
        lazy = LazyKt__LazyJVMKt.lazy(new C27928b());
        this.f107135h = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C27929c());
        this.f107136i = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C27930d());
        this.f107137j = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C27931e());
        this.f107138k = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C27932f());
        this.f107139l = lazy5;
    }

    /* renamed from: r */
    public static final void m15891r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: a */
    public void mo15908a(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (z) {
            this.f107130c.accept(Optional.f63040c.m59032c(bird));
            return;
        }
        WireBird m59035e = mo15900i().m73665a().m59035e();
        boolean z2 = false;
        if (m59035e != null && m59035e.isSame(bird)) {
            z2 = true;
        }
        if (z2) {
            mo15904e();
        }
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: b */
    public void mo15907b() {
        this.f107128a.m71836j();
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: c */
    public void mo15906c(RideMapState rideMapState) {
        Intrinsics.checkNotNullParameter(rideMapState, "rideMapState");
        this.f107131d.accept(rideMapState);
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: d */
    public void mo15905d(Location location) {
        this.f107133f = location;
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: e */
    public void mo15904e() {
        this.f107130c.m71836j();
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: f */
    public Z84<RideUpdateState> mo15903f() {
        return (Z84) this.f107139l.getValue();
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: g */
    public Z84<Optional<WireBird>> mo15902g() {
        return (Z84) this.f107135h.getValue();
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: h */
    public Double mo15901h() {
        return this.f107134g;
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: i */
    public Z84<Optional<WireBird>> mo15900i() {
        return (Z84) this.f107137j.getValue();
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: j */
    public void mo15899j(RideUpdateState rideUpdateState) {
        Intrinsics.checkNotNullParameter(rideUpdateState, "rideUpdateState");
        String phaseString = rideUpdateState.toPhaseString();
        C41318g46.m40163a("setting ridestatusupdate state to " + phaseString, new Object[0]);
        this.f107132e.accept(rideUpdateState);
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: k */
    public void mo15898k(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f107128a.accept(Optional.f63040c.m59032c(bird));
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: l */
    public Z84<RideMapState> mo15897l() {
        return (Z84) this.f107138k.getValue();
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: m */
    public void mo15896m(List<WireBird> birds) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        this.f107129b.accept(birds);
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: n */
    public void mo15895n(Double d) {
        this.f107134g = d;
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: o */
    public void mo15894o(RideMapState expectedRideMapState) {
        Intrinsics.checkNotNullParameter(expectedRideMapState, "expectedRideMapState");
        if (mo15897l().m73665a() == expectedRideMapState) {
            this.f107131d.m71836j();
        }
    }

    @Override // p000.InterfaceC46893pU4
    /* renamed from: p */
    public Location mo15893p() {
        return this.f107133f;
    }

    @Override // p000.InterfaceC46893pU4
    public void reset() {
        this.f107128a.m71836j();
        this.f107129b.m71836j();
        this.f107131d.m71836j();
        this.f107130c.m71836j();
        this.f107132e.m71836j();
        mo15905d(null);
        mo15895n(null);
    }
}
