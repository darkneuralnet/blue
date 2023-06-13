package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.LruCache;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideState;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.request.BluetoothTrackBody;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.C0122AY;
import p000.InterfaceC25136kJ;
import p000.InterfaceC40001dr4;
@Metadata(m28433d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\r*\u0001[\b\u0007\u0018\u0000 e2\u00020\u0001:\u0001fBW\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020!\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010<\u001a\u00020:\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J(\u0010\u0017\u001a\u00020\u000e*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016R\u001a\u0010 \u001a\u00020\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010I\u001a\u00020E8\u0016X\u0096D¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b'\u0010HR\u001a\u0010K\u001a\u00020E8\u0016X\u0096D¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\b+\u0010HR\u001a\u0010P\u001a\u00020\f8\u0014X\u0094D¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR.\u0010X\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 U*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00140\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R!\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00150\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b3\u0010a¨\u0006g"}, m28432d2 = {"LAY;", "Lqx1;", "Lk66;", "trackedBird", "Lio/reactivex/c;", "R", "Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/Vehicle$ConnectionState;", "G", "", "msg", "", "Q", "Lco/bird/android/model/wire/WireBird;", "bird", "N", "Lio/reactivex/subjects/a;", "", "", "track", "d0", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "isDebug", "n", "Landroid/content/Context;", "g", "Landroid/content/Context;", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "h", "Landroid/content/Intent;", "()Landroid/content/Intent;", "intent", "LKn6;", "i", "LKn6;", "tracker", "Lsm6;", "j", "Lsm6;", "vehicleManager", "Ldr4;", "k", "Ldr4;", "locationManager", "LkJ;", "l", "LkJ;", "birdBluetoothApiManager", "LTq4;", "m", "LTq4;", "reactiveConfig", "LEg1;", "LEg1;", "bus", "LEa;", "o", "LEa;", "analyticsManager", "LYR4;", "p", "LYR4;", "rideManager", "", "q", "I", "()I", "notificationId", "r", "notificationPriority", "s", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "channelId", "Lio/reactivex/E;", "t", "Lio/reactivex/E;", "scheduler", "kotlin.jvm.PlatformType", "u", "Lio/reactivex/subjects/a;", "currentlyTracked", "v", "Lcom/uber/autodispose/ScopeProvider;", "AY$g", "w", "LAY$g;", "rideCache", "x", "Lkotlin/Lazy;", "()Lio/reactivex/Observable;", "shouldForeground", "<init>", "(Landroid/content/Context;Landroid/content/Intent;LKn6;Lsm6;Ldr4;LkJ;LTq4;LEg1;LEa;LYR4;)V", "y", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBluetoothTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothTrackerServicePlugin.kt\nco/bird/android/app/feature/bluetooth/service/BluetoothTrackerServicePlugin\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n237#2:277\n1#3:278\n37#4,2:279\n819#5:281\n847#5,2:282\n*S KotlinDebug\n*F\n+ 1 BluetoothTrackerServicePlugin.kt\nco/bird/android/app/feature/bluetooth/service/BluetoothTrackerServicePlugin\n*L\n115#1:277\n270#1:279,2\n272#1:281\n272#1:282,2\n*E\n"})
/* renamed from: AY */
/* loaded from: classes2.dex */
public final class C0122AY extends AbstractC47767qx1 {

    /* renamed from: y */
    public static final C0123a f692y = new C0123a(null);

    /* renamed from: z */
    public static final int f693z = 8;

    /* renamed from: g */
    public final Context f694g;

    /* renamed from: h */
    public final Intent f695h;

    /* renamed from: i */
    public final InterfaceC34076Kn6 f696i;

    /* renamed from: j */
    public final InterfaceC48847sm6 f697j;

    /* renamed from: k */
    public final InterfaceC40001dr4 f698k;

    /* renamed from: l */
    public final InterfaceC25136kJ f699l;

    /* renamed from: m */
    public final C36207Tq4 f700m;

    /* renamed from: n */
    public final InterfaceC32604Eg1 f701n;

    /* renamed from: o */
    public final InterfaceC1880Ea f702o;

    /* renamed from: p */
    public final YR4 f703p;

    /* renamed from: q */
    public final int f704q;

    /* renamed from: r */
    public final int f705r;

    /* renamed from: s */
    public final String f706s;

    /* renamed from: t */
    public final AbstractC23437E f707t;

    /* renamed from: u */
    public final C24552a<List<WireBird>> f708u;

    /* renamed from: v */
    public ScopeProvider f709v;

    /* renamed from: w */
    public final C0130g f710w;

    /* renamed from: x */
    public final Lazy f711x;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LAY$a;", "", "", "BACKGROUND_CHANNEL_ID", "Ljava/lang/String;", "", "ES_MAX_SPEED_METERS_PER_HOUR", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: AY$a */
    /* loaded from: classes2.dex */
    public static final class C0123a {
        public /* synthetic */ C0123a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0123a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "f", "s", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$b */
    /* loaded from: classes2.dex */
    public static final class C0124b extends Lambda implements Function2<Vehicle, Vehicle, Boolean> {

        /* renamed from: g */
        public static final C0124b f712g = new C0124b();

        public C0124b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Vehicle f, Vehicle s) {
            boolean z;
            Intrinsics.checkNotNullParameter(f, "f");
            Intrinsics.checkNotNullParameter(s, "s");
            if (f.getLocked() == s.getLocked() && f.getEnergyMode() == s.getEnergyMode() && f.getBattery() == s.getBattery()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "updatedVehicle", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/Vehicle$ConnectionState;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$c */
    /* loaded from: classes2.dex */
    public static final class C0125c extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Pair<? extends Vehicle.ConnectionState, ? extends Vehicle>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle$ConnectionState;", "connectionState", "Lkotlin/Pair;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle$ConnectionState;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: AY$c$a */
        /* loaded from: classes2.dex */
        public static final class C0126a extends Lambda implements Function1<Vehicle.ConnectionState, Pair<? extends Vehicle.ConnectionState, ? extends Vehicle>> {

            /* renamed from: g */
            public final /* synthetic */ Vehicle f714g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0126a(Vehicle vehicle) {
                super(1);
                this.f714g = vehicle;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Vehicle.ConnectionState, Vehicle> invoke(Vehicle.ConnectionState connectionState) {
                Intrinsics.checkNotNullParameter(connectionState, "connectionState");
                return TuplesKt.m28425to(connectionState, this.f714g);
            }
        }

        public C0125c() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<Vehicle.ConnectionState, Vehicle>> invoke(Vehicle updatedVehicle) {
            Intrinsics.checkNotNullParameter(updatedVehicle, "updatedVehicle");
            Observable<Vehicle.ConnectionState> onErrorReturnItem = C0122AY.this.f697j.mo13693e(updatedVehicle).onErrorReturnItem(Vehicle.ConnectionState.CLOSED);
            final C0126a c0126a = new C0126a(updatedVehicle);
            return onErrorReturnItem.map(new InterfaceC23492o() { // from class: BY
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C0122AY.C0125c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Vehicle$ConnectionState;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AY$d */
    /* loaded from: classes2.dex */
    public static final class C0127d extends Lambda implements Function1<Pair<? extends Vehicle.ConnectionState, ? extends Vehicle>, Unit> {
        public C0127d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Vehicle.ConnectionState, ? extends Vehicle> pair) {
            invoke2((Pair<? extends Vehicle.ConnectionState, Vehicle>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Vehicle.ConnectionState, Vehicle> pair) {
            Vehicle.ConnectionState component1 = pair.component1();
            Vehicle vehicle = pair.component2();
            C0122AY c0122ay = C0122AY.this;
            String serialNumber = vehicle.getBird().getSerialNumber();
            c0122ay.m115637Q("track locked: " + serialNumber + ", state=" + component1);
            if (component1 == Vehicle.ConnectionState.CONNECTED) {
                InterfaceC32604Eg1 interfaceC32604Eg1 = C0122AY.this.f701n;
                Intrinsics.checkNotNullExpressionValue(vehicle, "vehicle");
                interfaceC32604Eg1.mo104915c(new C32879Fk6(vehicle));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lm66;", "trackingOperation", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lm66;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$f */
    /* loaded from: classes2.dex */
    public static final class C0129f extends Lambda implements Function1<AbstractC44896m66, InterfaceC23496h> {
        public C0129f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(AbstractC44896m66 trackingOperation) {
            Intrinsics.checkNotNullParameter(trackingOperation, "trackingOperation");
            if (trackingOperation instanceof C43884kP5) {
                return C0122AY.this.m115636R(((C43884kP5) trackingOperation).m29015b());
            }
            if (trackingOperation instanceof WQ5) {
                return C0122AY.this.m115640N(((WQ5) trackingOperation).m78477b());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, m28432d2 = {"AY$g", "Landroid/util/LruCache;", "", "Lco/bird/android/model/wire/WireRide;", "birdId", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBluetoothTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothTrackerServicePlugin.kt\nco/bird/android/app/feature/bluetooth/service/BluetoothTrackerServicePlugin$rideCache$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
    /* renamed from: AY$g */
    /* loaded from: classes2.dex */
    public static final class C0130g extends LruCache<String, WireRide> {
        public C0130g() {
            super(5);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public WireRide create(String str) {
            RideState mo75031q1;
            if (str == null || (mo75031q1 = C0122AY.this.f703p.mo75031q1(str)) == null) {
                return null;
            }
            return mo75031q1.getRide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$h */
    /* loaded from: classes2.dex */
    public static final class C0131h extends Lambda implements Function0<Observable<Boolean>> {
        public C0131h() {
            super(0);
        }

        /* renamed from: c */
        public static final Boolean m115603c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            List emptyList;
            C24523e c24523e = C24523e.f91168a;
            Z84<List<C43710k66>> mo96348f = C0122AY.this.f696i.mo96348f();
            C24552a c24552a = C0122AY.this.f708u;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            Object startWith = c24552a.startWith((C24552a) emptyList);
            Intrinsics.checkNotNullExpressionValue(startWith, "currentlyTracked.startWith(emptyList<WireBird>())");
            Observable m31956a = c24523e.m31956a(mo96348f, startWith);
            final C0132a c0132a = C0132a.f720g;
            return m31956a.map(new InterfaceC23492o() { // from class: CY
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m115603c;
                    m115603c = C0122AY.C0131h.m115603c(Function1.this, obj);
                    return m115603c;
                }
            });
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062,\u0010\u0005\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lk66;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: AY$h$a */
        /* loaded from: classes2.dex */
        public static final class C0132a extends Lambda implements Function1<Pair<? extends List<? extends C43710k66>, ? extends List<? extends WireBird>>, Boolean> {

            /* renamed from: g */
            public static final C0132a f720g = new C0132a();

            public C0132a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Pair<? extends List<C43710k66>, ? extends List<WireBird>> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                List<WireBird> currentlyTracked = pair.component2();
                boolean z = true;
                if (!(!pair.component1().isEmpty())) {
                    Intrinsics.checkNotNullExpressionValue(currentlyTracked, "currentlyTracked");
                    if (!(!currentlyTracked.isEmpty())) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends C43710k66>, ? extends List<? extends WireBird>> pair) {
                return invoke2((Pair<? extends List<C43710k66>, ? extends List<WireBird>>) pair);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AY$i */
    /* loaded from: classes2.dex */
    public static final class C0133i extends Lambda implements Function1<Location, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f722h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0133i(WireBird wireBird) {
            super(1);
            this.f722h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            InterfaceC25136kJ interfaceC25136kJ = C0122AY.this.f699l;
            String serialNumber = this.f722h.getSerialNumber();
            String model = this.f722h.getModel();
            Intrinsics.checkNotNullExpressionValue(location, "location");
            InterfaceC25136kJ.C25137a.trackBird$default(interfaceC25136kJ, serialNumber, model, null, null, location, 12, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$j */
    /* loaded from: classes2.dex */
    public static final class C0134j extends Lambda implements Function1<Config, Long> {

        /* renamed from: g */
        public static final C0134j f723g = new C0134j();

        public C0134j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Long invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Long.valueOf(it.getInRideTracksIntervalMs());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000 \u0005*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Vehicle$ConnectionState;", "Lco/bird/android/model/Vehicle;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$k */
    /* loaded from: classes2.dex */
    public static final class C0135k extends Lambda implements Function1<Pair<? extends Vehicle.ConnectionState, ? extends Vehicle>, Optional<Pair<? extends Vehicle.ConnectionState, ? extends Vehicle>>> {

        /* renamed from: g */
        public static final C0135k f724g = new C0135k();

        public C0135k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Pair<Vehicle.ConnectionState, Vehicle>> invoke(Pair<? extends Vehicle.ConnectionState, Vehicle> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59032c(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00072F\u0010\u0006\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u00120\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0000 \u0002*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle$ConnectionState;", "Lco/bird/android/model/Vehicle;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Landroid/location/Location;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$l */
    /* loaded from: classes2.dex */
    public static final class C0136l extends Lambda implements Function1<Pair<? extends Long, ? extends Optional<Pair<? extends Vehicle.ConnectionState, ? extends Vehicle>>>, InterfaceC23434B<? extends Location>> {
        public C0136l() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Location> invoke2(Pair<Long, Optional<Pair<Vehicle.ConnectionState, Vehicle>>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Long intervalMs = pair.component1();
            InterfaceC40001dr4 interfaceC40001dr4 = C0122AY.this.f698k;
            Intrinsics.checkNotNullExpressionValue(intervalMs, "intervalMs");
            return InterfaceC40001dr4.C19874a.locationUpdates$default(interfaceC40001dr4, intervalMs.longValue(), false, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Location> invoke(Pair<? extends Long, ? extends Optional<Pair<? extends Vehicle.ConnectionState, ? extends Vehicle>>> pair) {
            return invoke2((Pair<Long, Optional<Pair<Vehicle.ConnectionState, Vehicle>>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AY$m */
    /* loaded from: classes2.dex */
    public static final class C0137m extends Lambda implements Function1<Pair<? extends Location, ? extends Optional<Vehicle>>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Vehicle f726g;

        /* renamed from: h */
        public final /* synthetic */ C0122AY f727h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0137m(Vehicle vehicle, C0122AY c0122ay) {
            super(1);
            this.f726g = vehicle;
            this.f727h = c0122ay;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends Location, Optional<Vehicle>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C0122AY.m115625c0(this.f726g, this.f727h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Location, ? extends Optional<Vehicle>> pair) {
            return invoke2((Pair<? extends Location, Optional<Vehicle>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aª\u0001\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*$\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000 \u0002*T\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*$\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/request/BluetoothTrackBody;", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$n */
    /* loaded from: classes2.dex */
    public static final class C0138n extends Lambda implements Function1<Pair<? extends Location, ? extends Optional<Vehicle>>, InterfaceC23447K<? extends Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f729h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/BluetoothTrackBody;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/request/BluetoothTrackBody;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: AY$n$a */
        /* loaded from: classes2.dex */
        public static final class C0139a extends Lambda implements Function1<BluetoothTrackBody, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C0122AY f730g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f731h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0139a(C0122AY c0122ay, WireBird wireBird) {
                super(1);
                this.f730g = c0122ay;
                this.f731h = wireBird;
            }

            /* renamed from: a */
            public final void m115596a(BluetoothTrackBody bluetoothTrackBody) {
                C0122AY c0122ay = this.f730g;
                c0122ay.m115624d0(c0122ay.f708u, this.f731h, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BluetoothTrackBody bluetoothTrackBody) {
                m115596a(bluetoothTrackBody);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aJ\u0012\u0004\u0012\u00020\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*$\u0012\u0004\u0012\u00020\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/request/BluetoothTrackBody;", "it", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/BluetoothTrackBody;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: AY$n$b */
        /* loaded from: classes2.dex */
        public static final class C0140b extends Lambda implements Function1<BluetoothTrackBody, Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<Vehicle> f732g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0140b(Optional<Vehicle> optional) {
                super(1);
                this.f732g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<BluetoothTrackBody, Optional<Vehicle>> invoke(BluetoothTrackBody it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f732g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0138n(WireBird wireBird) {
            super(1);
            this.f729h = wireBird;
        }

        /* renamed from: d */
        public static final Pair m115597d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<BluetoothTrackBody, Optional<Vehicle>>> invoke(Pair<? extends Location, Optional<Vehicle>> pair) {
            Integer num;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Location location = pair.component1();
            Optional<Vehicle> component2 = pair.component2();
            C0122AY.this.m115637Q("track: " + this.f729h.getSerialNumber());
            InterfaceC25136kJ interfaceC25136kJ = C0122AY.this.f699l;
            String serialNumber = this.f729h.getSerialNumber();
            String model = this.f729h.getModel();
            Vehicle m59035e = component2.m59035e();
            Integer num2 = null;
            if (m59035e != null) {
                num = m59035e.getBatteryForTracking();
            } else {
                num = null;
            }
            Vehicle m59035e2 = component2.m59035e();
            if (m59035e2 != null) {
                num2 = m59035e2.getDistanceForTracking();
            }
            Intrinsics.checkNotNullExpressionValue(location, "location");
            AbstractC23442F<BluetoothTrackBody> m33152N = interfaceC25136kJ.mo21382p1(serialNumber, model, num, num2, location).m33152N(C0122AY.this.f707t);
            final C0139a c0139a = new C0139a(C0122AY.this, this.f729h);
            AbstractC23442F<BluetoothTrackBody> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: DY
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C0122AY.C0138n.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C0140b c0140b = new C0140b(component2);
            return m33101w.m33157I(new InterfaceC23492o() { // from class: EY
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m115597d;
                    m115597d = C0122AY.C0138n.m115597d(Function1.this, obj);
                    return m115597d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/api/request/BluetoothTrackBody;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AY$o */
    /* loaded from: classes2.dex */
    public static final class C0141o extends Lambda implements Function1<Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<Integer> f733g;

        /* renamed from: h */
        public final /* synthetic */ Ref.IntRef f734h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0141o(Ref.ObjectRef<Integer> objectRef, Ref.IntRef intRef) {
            super(1);
            this.f733g = objectRef;
            this.f734h = intRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>> pair) {
            invoke2((Pair<BluetoothTrackBody, Optional<Vehicle>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BluetoothTrackBody, Optional<Vehicle>> pair) {
            if (Intrinsics.areEqual(pair.component1().getMaxSpeed(), this.f733g.element)) {
                return;
            }
            this.f734h.element = 0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "updatedVehicle", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$r */
    /* loaded from: classes2.dex */
    public static final class C0145r extends Lambda implements Function1<Vehicle, Optional<Vehicle>> {

        /* renamed from: g */
        public static final C0145r f746g = new C0145r();

        public C0145r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Vehicle> invoke(Vehicle updatedVehicle) {
            Intrinsics.checkNotNullParameter(updatedVehicle, "updatedVehicle");
            return Optional.f63040c.m59032c(updatedVehicle);
        }
    }

    public C0122AY(Context context, Intent intent, InterfaceC34076Kn6 tracker, InterfaceC48847sm6 vehicleManager, InterfaceC40001dr4 locationManager, InterfaceC25136kJ birdBluetoothApiManager, C36207Tq4 reactiveConfig, InterfaceC32604Eg1 bus, InterfaceC1880Ea analyticsManager, YR4 rideManager) {
        List emptyList;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(vehicleManager, "vehicleManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(birdBluetoothApiManager, "birdBluetoothApiManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(bus, "bus");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        this.f694g = context;
        this.f695h = intent;
        this.f696i = tracker;
        this.f697j = vehicleManager;
        this.f698k = locationManager;
        this.f699l = birdBluetoothApiManager;
        this.f700m = reactiveConfig;
        this.f701n = bus;
        this.f702o = analyticsManager;
        this.f703p = rideManager;
        this.f704q = -1;
        this.f706s = "background_channel";
        AbstractC23437E m31933b = C24542a.m31933b(Executors.newSingleThreadExecutor());
        Intrinsics.checkNotNullExpressionValue(m31933b, "from(Executors.newSingleThreadExecutor())");
        this.f707t = m31933b;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<WireBird>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<WireBird>>(emptyList())");
        this.f708u = m31921g;
        this.f710w = new C0130g();
        lazy = LazyKt__LazyJVMKt.lazy(new C0131h());
        this.f711x = lazy;
    }

    /* renamed from: H */
    public static final boolean m115646H(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: I */
    public static final void m115645I(C0122AY this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m115637Q("dispose --->>>[lock tracking]");
    }

    /* renamed from: J */
    public static final InterfaceC23434B m115644J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m115643K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23434B m115642L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23496h m115641M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m115639O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m115638P(C0122AY this$0, WireBird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        this$0.m115624d0(this$0.f708u, bird, false);
    }

    /* renamed from: S */
    public static final InterfaceC23447K m115635S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m115634T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final boolean m115633U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: V */
    public static final InterfaceC23496h m115632V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m115631W(C0122AY this$0, WireBird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        this$0.m115624d0(this$0.f708u, bird, false);
    }

    /* renamed from: X */
    public static final Optional m115630X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final Long m115629Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Long) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final Optional m115628Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23434B m115627a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final boolean m115626b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: c0 */
    public static final boolean m115625c0(Vehicle vehicle, C0122AY c0122ay) {
        if (vehicle == null) {
            return false;
        }
        if ((!WireBirdKt.shouldSubmitTrackEventsWhenConnected(vehicle.getBird(), C36441Uq4.m80769c(c0122ay.f700m, vehicle.getBird())) || c0122ay.f697j.mo13694d(vehicle) != Vehicle.ConnectionState.CONNECTED || !c0122ay.f696i.mo96350d(vehicle)) && !WireBirdKt.birdModel(vehicle.getBird()).isScanOnly()) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final Observable<Pair<Vehicle.ConnectionState, Vehicle>> m115647G(Vehicle vehicle) {
        Observable<Vehicle> mo13682p = this.f697j.mo13682p(vehicle);
        final C0124b c0124b = C0124b.f712g;
        Observable<Vehicle> doOnDispose = mo13682p.distinctUntilChanged(new InterfaceC23481d() { // from class: nY
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m115646H;
                m115646H = C0122AY.m115646H(Function2.this, obj, obj2);
                return m115646H;
            }
        }).subscribeOn(C24542a.m31932c()).doOnDispose(new InterfaceC23478a() { // from class: oY
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C0122AY.m115645I(C0122AY.this);
            }
        });
        final C0125c c0125c = new C0125c();
        Observable<R> flatMap = doOnDispose.flatMap(new InterfaceC23492o() { // from class: pY
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m115644J;
                m115644J = C0122AY.m115644J(Function1.this, obj);
                return m115644J;
            }
        });
        final C0127d c0127d = new C0127d();
        Observable<Pair<Vehicle.ConnectionState, Vehicle>> doOnNext = flatMap.doOnNext(new InterfaceC23484g() { // from class: qY
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C0122AY.m115643K(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun forwardVehic…e))\n        }\n      }\n  }");
        return doOnNext;
    }

    /* renamed from: N */
    public final AbstractC23461c m115640N(final WireBird wireBird) {
        AbstractC24507p firstElement = InterfaceC40001dr4.C19874a.frequentLocationUpdates$default(this.f698k, false, 1, null).firstElement();
        final C0133i c0133i = new C0133i(wireBird);
        AbstractC23461c m32069F = firstElement.m32026s(new InterfaceC23484g() { // from class: lY
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C0122AY.m115639O(Function1.this, obj);
            }
        }).m32032m(new InterfaceC23478a() { // from class: mY
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C0122AY.m115638P(C0122AY.this, wireBird);
            }
        }).m32069F();
        Intrinsics.checkNotNullExpressionValue(m32069F, "private fun stop(bird: W…     .ignoreElement()\n  }");
        return m32069F;
    }

    /* renamed from: Q */
    public final void m115637Q(String str) {
        String name = Thread.currentThread().getName();
        C41318g46.m40151m("Thread: " + name + ": " + str, new Object[0]);
    }

    /* renamed from: R */
    public final AbstractC23461c m115636R(C43710k66 c43710k66) {
        WireBird wireBird;
        Vehicle vehicle;
        Observable vehicleObservable;
        Observable observable;
        WireBird m29287a = c43710k66.m29287a();
        BluetoothDevice m29286b = c43710k66.m29286b();
        Observable observable2 = null;
        if (m29286b != null) {
            wireBird = m29287a;
            vehicle = new Vehicle(m29286b, m29287a, 0, 0, false, null, false, false, null, null, null, null, null, null, null, null, null, 131068, null);
        } else {
            wireBird = m29287a;
            vehicle = null;
        }
        if (vehicle != null) {
            Observable<Vehicle> mo13682p = this.f697j.mo13682p(vehicle);
            final C0145r c0145r = C0145r.f746g;
            vehicleObservable = mo13682p.map(new InterfaceC23492o() { // from class: sY
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m115630X;
                    m115630X = C0122AY.m115630X(Function1.this, obj);
                    return m115630X;
                }
            });
        } else {
            vehicleObservable = Observable.just(Optional.f63040c.m59034a());
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.IntRef intRef = new Ref.IntRef();
        C24523e c24523e = C24523e.f91168a;
        Z84<Config> m82623f8 = this.f700m.m82623f8();
        final C0134j c0134j = C0134j.f723g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: tY
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Long m115629Y;
                m115629Y = C0122AY.m115629Y(Function1.this, obj);
                return m115629Y;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        if (vehicle != null) {
            Observable<Pair<Vehicle.ConnectionState, Vehicle>> m115647G = m115647G(vehicle);
            final C0135k c0135k = C0135k.f724g;
            observable2 = m115647G.map(new InterfaceC23492o() { // from class: uY
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m115628Z;
                    m115628Z = C0122AY.m115628Z(Function1.this, obj);
                    return m115628Z;
                }
            });
        }
        if (observable2 == null) {
            observable = Observable.just(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(observable, "just(Optional.absent())");
        } else {
            observable = observable2;
        }
        Observable observeOn = c24523e.m31956a(distinctUntilChanged, observable).subscribeOn(C24542a.m31932c()).observeOn(C24542a.m31932c());
        final C0136l c0136l = new C0136l();
        Observable switchMap = observeOn.switchMap(new InterfaceC23492o() { // from class: vY
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m115627a0;
                m115627a0 = C0122AY.m115627a0(Function1.this, obj);
                return m115627a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "private fun trackBird(tr…rack = false)\n      }\n  }");
        Intrinsics.checkNotNullExpressionValue(vehicleObservable, "vehicleObservable");
        Observable m31950a = C24527f.m31950a(switchMap, vehicleObservable);
        final C0137m c0137m = new C0137m(vehicle, this);
        AbstractC24490k m32111s0 = m31950a.takeWhile(new InterfaceC23494q() { // from class: wY
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m115626b0;
                m115626b0 = C0122AY.m115626b0(Function1.this, obj);
                return m115626b0;
            }
        }).toFlowable(EnumC23460b.LATEST).m32111s0(C24542a.m31932c());
        final WireBird wireBird2 = wireBird;
        final C0138n c0138n = new C0138n(wireBird2);
        AbstractC24490k m32146g0 = m32111s0.m32146g0(new InterfaceC23492o() { // from class: xY
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115635S;
                m115635S = C0122AY.m115635S(Function1.this, obj);
                return m115635S;
            }
        }, false, 1);
        final C0141o c0141o = new C0141o(objectRef, intRef);
        AbstractC24490k m32191K = m32146g0.m32191K(new InterfaceC23484g() { // from class: yY
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C0122AY.m115634T(Function1.this, obj);
            }
        });
        final C0142p c0142p = new C0142p(intRef);
        AbstractC24490k m32095y0 = m32191K.m32175S(new InterfaceC23494q() { // from class: zY
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m115633U;
                m115633U = C0122AY.m115633U(Function1.this, obj);
                return m115633U;
            }
        }).m32095y0();
        final C0143q c0143q = new C0143q(wireBird2, this, objectRef, intRef);
        AbstractC23461c m32160a0 = m32095y0.m32160a0(new InterfaceC23492o() { // from class: jY
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m115632V;
                m115632V = C0122AY.m115632V(Function1.this, obj);
                return m115632V;
            }
        }, false, 1);
        Intrinsics.checkNotNullExpressionValue(m32160a0, "private fun trackBird(tr…rack = false)\n      }\n  }");
        AbstractC23461c m33030y = C37279Yf5.m74563c0(m32160a0, 3).m33070P(this.f707t).m33030y(new InterfaceC23478a() { // from class: kY
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C0122AY.m115631W(C0122AY.this, wireBird2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33030y, "private fun trackBird(tr…rack = false)\n      }\n  }");
        return m33030y;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: c */
    public String mo16760c() {
        return this.f706s;
    }

    /* renamed from: d0 */
    public final void m115624d0(C24552a<List<WireBird>> c24552a, WireBird wireBird, boolean z) {
        List<WireBird> listOf;
        List<WireBird> value = c24552a.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        if (z) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(value.toArray(new WireBird[0]));
            spreadBuilder.add(wireBird);
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new WireBird[spreadBuilder.size()]));
            c24552a.onNext(listOf);
            return;
        }
        List<WireBird> arrayList = new ArrayList<>();
        for (Object obj : value) {
            if (!wireBird.isSame((WireBird) obj)) {
                arrayList.add(obj);
            }
        }
        c24552a.onNext(arrayList);
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: g */
    public Context mo16756g() {
        return this.f694g;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: h */
    public Intent mo16755h() {
        return this.f695h;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: i */
    public int mo16754i() {
        return this.f704q;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: j */
    public int mo16753j() {
        return this.f705r;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: l */
    public Observable<Boolean> mo16751l() {
        Object value = this.f711x.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-shouldForeground>(...)");
        return (Observable) value;
    }

    @Override // p000.AbstractC47767qx1
    /* renamed from: n */
    public void mo16749n(ScopeProvider scopeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        super.mo16749n(scopeProvider, z);
        this.f709v = scopeProvider;
        Observable<List<C43710k66>> subscribeOn = this.f696i.mo96348f().subscribeOn(this.f707t);
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "tracker.trackedBirds // …  .subscribeOn(scheduler)");
        Observable m31950a = C24527f.m31950a(subscribeOn, this.f708u);
        final C0128e c0128e = C0128e.f716g;
        Observable switchMap = m31950a.switchMap(new InterfaceC23492o() { // from class: iY
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m115642L;
                m115642L = C0122AY.m115642L(Function1.this, obj);
                return m115642L;
            }
        });
        final C0129f c0129f = new C0129f();
        AbstractC23461c flatMapCompletable = switchMap.flatMapCompletable(new InterfaceC23492o() { // from class: rY
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m115641M;
                m115641M = C0122AY.m115641M(Function1.this, obj);
                return m115641M;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onCreate(sc…r)\n      .subscribe()\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/api/request/BluetoothTrackBody;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AY$p */
    /* loaded from: classes2.dex */
    public static final class C0142p extends Lambda implements Function1<Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>>, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ Ref.IntRef f736h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0142p(Ref.IntRef intRef) {
            super(1);
            this.f736h = intRef;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<BluetoothTrackBody, Optional<Vehicle>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BluetoothTrackBody component1 = pair.component1();
            Optional<Vehicle> component2 = pair.component2();
            return Boolean.valueOf(component2.m59037c() && WireBirdKt.shouldUpdateMaxSpeedOverBT(component2.m59038b().getBird(), C36441Uq4.m80769c(C0122AY.this.f700m, component2.m59038b().getBird())) && component1.getMaxSpeed() != null && this.f736h.element < C0122AY.this.f700m.m82623f8().m73665a().getBtMaxSpeedCommandSpam());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>> pair) {
            return invoke2((Pair<BluetoothTrackBody, Optional<Vehicle>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/api/request/BluetoothTrackBody;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AY$q */
    /* loaded from: classes2.dex */
    public static final class C0143q extends Lambda implements Function1<Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f737g;

        /* renamed from: h */
        public final /* synthetic */ C0122AY f738h;

        /* renamed from: i */
        public final /* synthetic */ Ref.ObjectRef<Integer> f739i;

        /* renamed from: j */
        public final /* synthetic */ Ref.IntRef f740j;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: AY$q$a */
        /* loaded from: classes2.dex */
        public static final class C0144a extends Lambda implements Function1<Vehicle, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Ref.ObjectRef<Integer> f741g;

            /* renamed from: h */
            public final /* synthetic */ int f742h;

            /* renamed from: i */
            public final /* synthetic */ Ref.IntRef f743i;

            /* renamed from: j */
            public final /* synthetic */ C0122AY f744j;

            /* renamed from: k */
            public final /* synthetic */ WireBird f745k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0144a(Ref.ObjectRef<Integer> objectRef, int i, Ref.IntRef intRef, C0122AY c0122ay, WireBird wireBird) {
                super(1);
                this.f741g = objectRef;
                this.f742h = i;
                this.f743i = intRef;
                this.f744j = c0122ay;
                this.f745k = wireBird;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Integer] */
            /* renamed from: a */
            public final void m115593a(Vehicle vehicle) {
                String str;
                Boolean bool;
                this.f741g.element = Integer.valueOf(this.f742h);
                this.f743i.element++;
                WireRide wireRide = this.f744j.f710w.get(this.f745k.getId());
                InterfaceC1880Ea interfaceC1880Ea = this.f744j.f702o;
                String id = vehicle.getBird().getId();
                String model = vehicle.getBird().getModel();
                if (model == null) {
                    if (wireRide != null) {
                        model = wireRide.getVehicleModel();
                    } else {
                        model = null;
                    }
                    if (model == null) {
                        model = "unknown";
                    }
                }
                String str2 = model;
                if (wireRide != null) {
                    str = wireRide.getId();
                } else {
                    str = null;
                }
                if (wireRide != null) {
                    bool = Boolean.valueOf(wireRide.isPrimaryRide());
                } else {
                    bool = null;
                }
                interfaceC1880Ea.mo55905y(new C20063eY(null, null, null, id, str2, str, bool, this.f742h, "client_track", 7, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
                m115593a(vehicle);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0143q(WireBird wireBird, C0122AY c0122ay, Ref.ObjectRef<Integer> objectRef, Ref.IntRef intRef) {
            super(1);
            this.f737g = wireBird;
            this.f738h = c0122ay;
            this.f739i = objectRef;
            this.f740j = intRef;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<BluetoothTrackBody, Optional<Vehicle>> pair) {
            int intValue;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BluetoothTrackBody component1 = pair.component1();
            Optional<Vehicle> component2 = pair.component2();
            if (WireBirdKt.isEsModel(this.f737g)) {
                Integer maxSpeed = component1.getMaxSpeed();
                Intrinsics.checkNotNull(maxSpeed);
                intValue = Math.min(maxSpeed.intValue(), 24000);
            } else {
                Integer maxSpeed2 = component1.getMaxSpeed();
                Intrinsics.checkNotNull(maxSpeed2);
                intValue = maxSpeed2.intValue();
            }
            int i = intValue;
            InterfaceC48847sm6 interfaceC48847sm6 = this.f738h.f697j;
            Vehicle m59038b = component2.m59038b();
            Intrinsics.checkNotNullExpressionValue(m59038b, "vehicle.get()");
            Vehicle vehicle = m59038b;
            Integer ecuType = component1.getEcuType();
            AbstractC23442F<Vehicle> mo13691g = interfaceC48847sm6.mo13691g(vehicle, ecuType != null ? ecuType.intValue() : 0, i);
            final C0144a c0144a = new C0144a(this.f739i, i, this.f740j, this.f738h, this.f737g);
            return mo13691g.m33101w(new InterfaceC23484g() { // from class: FY
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C0122AY.C0143q.invoke$lambda$0(Function1.this, obj);
                }
            }).m33159G().m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends BluetoothTrackBody, ? extends Optional<Vehicle>> pair) {
            return invoke2((Pair<BluetoothTrackBody, Optional<Vehicle>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lk66;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lm66;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBluetoothTrackerServicePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothTrackerServicePlugin.kt\nco/bird/android/app/feature/bluetooth/service/BluetoothTrackerServicePlugin$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,276:1\n1549#2:277\n1620#2,3:278\n1549#2:281\n1620#2,3:282\n1549#2:285\n1620#2,2:286\n223#2,2:288\n1622#2:290\n766#2:293\n857#2,2:294\n1549#2:296\n1620#2,3:297\n37#3,2:291\n37#3,2:300\n*S KotlinDebug\n*F\n+ 1 BluetoothTrackerServicePlugin.kt\nco/bird/android/app/feature/bluetooth/service/BluetoothTrackerServicePlugin$onCreate$1\n*L\n93#1:277\n93#1:278,3\n94#1:281\n94#1:282,3\n102#1:285\n102#1:286,2\n102#1:288,2\n102#1:290\n103#1:293\n103#1:294,2\n104#1:296\n104#1:297,3\n102#1:291,2\n105#1:300,2\n*E\n"})
    /* renamed from: AY$e */
    /* loaded from: classes2.dex */
    public static final class C0128e extends Lambda implements Function1<Pair<? extends List<? extends C43710k66>, ? extends List<? extends WireBird>>, InterfaceC23434B<? extends AbstractC44896m66>> {

        /* renamed from: g */
        public static final C0128e f716g = new C0128e();

        public C0128e() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
            r5.add(new p000.WQ5(r8));
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23434B<? extends AbstractC44896m66> invoke2(Pair<? extends List<C43710k66>, ? extends List<WireBird>> pair) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List minus;
            List minus2;
            int collectionSizeOrDefault3;
            int collectionSizeOrDefault4;
            List listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<C43710k66> trackedBirds = pair.component1();
            List<WireBird> currentlyTrackedBirds = pair.component2();
            Intrinsics.checkNotNullExpressionValue(trackedBirds, "trackedBirds");
            List<C43710k66> list = trackedBirds;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (C43710k66 c43710k66 : list) {
                arrayList.add(c43710k66.m29284d().getId());
            }
            Intrinsics.checkNotNullExpressionValue(currentlyTrackedBirds, "currentlyTrackedBirds");
            List<WireBird> list2 = currentlyTrackedBirds;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireBird wireBird : list2) {
                arrayList2.add(wireBird.getId());
            }
            minus = CollectionsKt___CollectionsKt.minus((Iterable) arrayList2, (Iterable) arrayList);
            minus2 = CollectionsKt___CollectionsKt.minus((Iterable) arrayList, (Iterable) arrayList2);
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            List<String> list3 = minus;
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
            for (String str : list3) {
                for (WireBird wireBird2 : list2) {
                    if (Intrinsics.areEqual(wireBird2.getId(), str)) {
                        break;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            spreadBuilder.addSpread(arrayList3.toArray(new WQ5[0]));
            ArrayList<C43710k66> arrayList4 = new ArrayList();
            for (Object obj : list) {
                if (minus2.contains(((C43710k66) obj).m29284d().getId())) {
                    arrayList4.add(obj);
                }
            }
            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault4);
            for (C43710k66 c43710k662 : arrayList4) {
                arrayList5.add(new C43884kP5(c43710k662));
            }
            spreadBuilder.addSpread(arrayList5.toArray(new C43884kP5[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new AbstractC44896m66[spreadBuilder.size()]));
            return Observable.fromIterable(listOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends AbstractC44896m66> invoke(Pair<? extends List<? extends C43710k66>, ? extends List<? extends WireBird>> pair) {
            return invoke2((Pair<? extends List<C43710k66>, ? extends List<WireBird>>) pair);
        }
    }
}
