package p000;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import androidx.core.app.NotificationManagerCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.constant.Permission;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.InterfaceC49820uQ3;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R)\u0010/\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00060\u00060)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u00101R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00101R\u0014\u00106\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0014\u0010:\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00101R\u0014\u0010;\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u00101R\u0016\u0010?\u001a\u0004\u0018\u00010<8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, m28432d2 = {"LAQ3;", "LuQ3;", "Lco/bird/android/model/constant/Permission;", "permission", "Lco/bird/android/model/PermissionStatus;", "j", "", "r", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/pm/PackageManager;", "b", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/bluetooth/BluetoothAdapter;", "c", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Landroid/location/LocationManager;", DateTokenConverter.CONVERTER_KEY, "Landroid/location/LocationManager;", "locationManager", "Landroidx/core/app/NotificationManagerCompat;", "e", "Landroidx/core/app/NotificationManagerCompat;", "notificationManagerCompat", "Lgl;", "f", "Lgl;", "preferences", "Landroid/net/ConnectivityManager;", "g", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "La94;", "h", "Ljava/util/Map;", "mutablePermissionsGranted", "LZ84;", "kotlin.jvm.PlatformType", "i", "Lkotlin/Lazy;", "getFineLocationGrantedObservable", "()LZ84;", "fineLocationGrantedObservable", "n", "()Z", "fineLocationPermissionGranted", "accessWifiStatePermissionGranted", "locationEnabled", "k", "hasCamera", "m", "cameraPermissionGranted", "l", "bluetoothEnabled", "notificationsEnabled", "LuQ3$a;", "o", "()LuQ3$a;", "dataSaverState", "<init>", "(Landroid/content/Context;Landroid/content/pm/PackageManager;Landroid/bluetooth/BluetoothAdapter;Landroid/location/LocationManager;Landroidx/core/app/NotificationManagerCompat;Lgl;Landroid/net/ConnectivityManager;)V", "permission_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPermissionDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionDelegateImpl.kt\nco/bird/android/library/permission/PermissionDelegateImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,147:1\n13579#2,2:148\n180#3:150\n*S KotlinDebug\n*F\n+ 1 PermissionDelegateImpl.kt\nco/bird/android/library/permission/PermissionDelegateImpl\n*L\n45#1:148,2\n68#1:150\n*E\n"})
/* renamed from: AQ3 */
/* loaded from: classes3.dex */
public final class AQ3 implements InterfaceC49820uQ3 {

    /* renamed from: a */
    public final Context f499a;

    /* renamed from: b */
    public final PackageManager f500b;

    /* renamed from: c */
    public final BluetoothAdapter f501c;

    /* renamed from: d */
    public final LocationManager f502d;

    /* renamed from: e */
    public final NotificationManagerCompat f503e;

    /* renamed from: f */
    public final C22454gl f504f;

    /* renamed from: g */
    public final ConnectivityManager f505g;

    /* renamed from: h */
    public final Map<Permission, C37791a94<Boolean>> f506h;

    /* renamed from: i */
    public final Lazy f507i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/constant/Permission;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AQ3$a */
    /* loaded from: classes3.dex */
    public static final class C0085a extends Lambda implements Function1<Long, InterfaceC23434B<? extends Permission>> {

        /* renamed from: g */
        public static final C0085a f508g = new C0085a();

        public C0085a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Permission> invoke(Long it) {
            Iterable asIterable;
            Intrinsics.checkNotNullParameter(it, "it");
            asIterable = ArraysKt___ArraysKt.asIterable(Permission.values());
            return Observable.fromIterable(asIterable);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/Permission;", "permissionKind", "Lio/reactivex/B;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/constant/Permission;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AQ3$b */
    /* loaded from: classes3.dex */
    public static final class C0086b extends Lambda implements Function1<Permission, InterfaceC23434B<? extends Pair<? extends Permission, ? extends Boolean>>> {
        public C0086b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Pair<Permission, Boolean>> invoke(Permission permissionKind) {
            boolean z;
            Intrinsics.checkNotNullParameter(permissionKind, "permissionKind");
            if (NA0.m94303a(AQ3.this.f499a, permissionKind.getPermission()) == 0) {
                z = true;
            } else {
                z = false;
            }
            return Observable.just(TuplesKt.m28425to(permissionKind, Boolean.valueOf(z)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/constant/Permission;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AQ3$c */
    /* loaded from: classes3.dex */
    public static final class C0087c extends Lambda implements Function1<Pair<? extends Permission, ? extends Boolean>, Boolean> {
        public C0087c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends Permission, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = pair.component2().booleanValue();
            C37791a94 c37791a94 = (C37791a94) AQ3.this.f506h.get(pair.component1());
            boolean z = false;
            if (c37791a94 != null && ((Boolean) c37791a94.getValue()).booleanValue() == booleanValue) {
                z = true;
            }
            return Boolean.valueOf(!z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Permission, ? extends Boolean> pair) {
            return invoke2((Pair<? extends Permission, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/constant/Permission;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AQ3$d */
    /* loaded from: classes3.dex */
    public static final class C0088d extends Lambda implements Function1<Pair<? extends Permission, ? extends Boolean>, Unit> {
        public C0088d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Permission, ? extends Boolean> pair) {
            invoke2((Pair<? extends Permission, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Permission, Boolean> pair) {
            boolean booleanValue = pair.component2().booleanValue();
            C37791a94 c37791a94 = (C37791a94) AQ3.this.f506h.get(pair.component1());
            if (c37791a94 != null) {
                c37791a94.accept(Boolean.valueOf(booleanValue));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AQ3$e */
    /* loaded from: classes3.dex */
    public static final class C0089e extends Lambda implements Function0<Z84<Boolean>> {
        public C0089e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Boolean> invoke() {
            Z84.C10119a c10119a = Z84.f47888d;
            Object obj = AQ3.this.f506h.get(Permission.ACCESS_FINE_LOCATION);
            Intrinsics.checkNotNull(obj);
            return c10119a.m73663b((Observable) obj);
        }
    }

    public AQ3(Context context, PackageManager packageManager, BluetoothAdapter bluetoothAdapter, LocationManager locationManager, NotificationManagerCompat notificationManagerCompat, C22454gl preferences, ConnectivityManager connectivityManager) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(notificationManagerCompat, "notificationManagerCompat");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.f499a = context;
        this.f500b = packageManager;
        this.f501c = bluetoothAdapter;
        this.f502d = locationManager;
        this.f503e = notificationManagerCompat;
        this.f504f = preferences;
        this.f505g = connectivityManager;
        this.f506h = new LinkedHashMap();
        for (Permission permission : Permission.values()) {
            this.f506h.put(permission, C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.FALSE, null, 2, null));
        }
        Observable<Long> interval = Observable.interval(0L, 3000L, TimeUnit.MILLISECONDS);
        final C0085a c0085a = C0085a.f508g;
        Observable<R> flatMap = interval.flatMap(new InterfaceC23492o() { // from class: wQ3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m115804g;
                m115804g = AQ3.m115804g(Function1.this, obj);
                return m115804g;
            }
        });
        final C0086b c0086b = new C0086b();
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: xQ3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m115803i;
                m115803i = AQ3.m115803i(Function1.this, obj);
                return m115803i;
            }
        });
        final C0087c c0087c = new C0087c();
        Observable subscribeOn = flatMap2.filter(new InterfaceC23494q() { // from class: yQ3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m115802p;
                m115802p = AQ3.m115802p(Function1.this, obj);
                return m115802p;
            }
        }).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "interval(0, 3000L, TimeU…scribeOn(Schedulers.io())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0088d c0088d = new C0088d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: zQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AQ3.m115801q(Function1.this, obj);
            }
        });
        lazy = LazyKt__LazyJVMKt.lazy(new C0089e());
        this.f507i = lazy;
    }

    /* renamed from: g */
    public static final InterfaceC23434B m115804g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final InterfaceC23434B m115803i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final boolean m115802p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q */
    public static final void m115801q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: d */
    public boolean mo10339d() {
        return this.f503e.areNotificationsEnabled();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: f */
    public boolean mo10338f() {
        return m115800r(Permission.ACCESS_WIFI_STATE);
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: h */
    public boolean mo10337h() {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT >= 28) {
            isLocationEnabled = this.f502d.isLocationEnabled();
            return isLocationEnabled;
        } else if (Settings.Secure.getInt(this.f499a.getContentResolver(), "location_mode", 0) == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: j */
    public PermissionStatus mo10336j(Permission permission) {
        boolean z;
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (NA0.m94303a(this.f499a, permission.getPermission()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return PermissionStatus.GRANTED;
        }
        if (this.f504f.m37654Z0(permission)) {
            return PermissionStatus.NEVER_ASK_AGAIN;
        }
        return PermissionStatus.DENIED;
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: k */
    public boolean mo10335k() {
        return this.f500b.hasSystemFeature("android.hardware.camera");
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: l */
    public boolean mo10334l() {
        BluetoothAdapter bluetoothAdapter = this.f501c;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return true;
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: m */
    public boolean mo10333m() {
        return m115800r(Permission.CAMERA);
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: n */
    public boolean mo10332n() {
        return m115800r(Permission.ACCESS_FINE_LOCATION);
    }

    @Override // p000.InterfaceC49820uQ3
    @SuppressLint({"MissingPermission"})
    /* renamed from: o */
    public InterfaceC49820uQ3.EnumC29192a mo10331o() {
        int restrictBackgroundStatus = this.f505g.getRestrictBackgroundStatus();
        if (restrictBackgroundStatus != 1) {
            if (restrictBackgroundStatus != 2) {
                if (restrictBackgroundStatus != 3) {
                    return null;
                }
                return InterfaceC49820uQ3.EnumC29192a.ENABLED;
            }
            return InterfaceC49820uQ3.EnumC29192a.WHITELISTED;
        }
        return InterfaceC49820uQ3.EnumC29192a.DISABLED;
    }

    /* renamed from: r */
    public final boolean m115800r(Permission permission) {
        if (NA0.m94303a(this.f499a, permission.getPermission()) == 0) {
            return true;
        }
        return false;
    }
}
