package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Vehicle;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.BLEScanTrigger;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23450a;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http2.Settings;
import p000.C52323ye5;
import p000.InterfaceC5225MD;
@Deprecated(message = "Do not use this manager any more. Implement scan() in RxBleVehicleManagerImpl", replaceWith = @ReplaceWith(expression = "RxBleVehicleManagerImpl", imports = {}))
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001\nB)\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00050\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, m28432d2 = {"Ltp2;", "Llp2;", "Lco/bird/api/request/BLEScanTrigger;", "bleTrigger", "Lio/reactivex/k;", "Lco/bird/android/model/Vehicle;", "b", "vehicle", "Lio/reactivex/Observable;", "", C17296a.f69688o, "LTk5;", "p", "", "msg", "", "r", "LMD;", "LMD;", "baseBluetoothManager", "Lsm6;", "Lsm6;", "vehicleManager", "LaY;", "c", "LaY;", "scheduler", "LKn6;", DateTokenConverter.CONVERTER_KEY, "LKn6;", "vehicleTrackerManager", "Ljava/util/concurrent/ConcurrentHashMap;", "Lco/bird/android/model/wire/WireBird;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "vehicles", "<init>", "(LMD;Lsm6;LaY;LKn6;)V", "f", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tp2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49466tp2 implements InterfaceC44723lp2 {

    /* renamed from: f */
    public static final C28823a f111067f = new C28823a(null);

    /* renamed from: a */
    public final InterfaceC5225MD f111068a;

    /* renamed from: b */
    public final InterfaceC48847sm6 f111069b;

    /* renamed from: c */
    public final InterfaceC10732aY f111070c;

    /* renamed from: d */
    public final InterfaceC34076Kn6 f111071d;

    /* renamed from: e */
    public final ConcurrentHashMap<WireBird, Vehicle> f111072e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Ltp2$a;", "", "", "BUFFER_CAPACITY", "J", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tp2$a */
    /* loaded from: classes4.dex */
    public static final class C28823a {
        public /* synthetic */ C28823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28823a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tp2$b */
    /* loaded from: classes4.dex */
    public static final class C28824b extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f111074h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28824b(Vehicle vehicle) {
            super(1);
            this.f111074h = vehicle;
        }

        /* renamed from: a */
        public final void m11709a(InterfaceC23465c interfaceC23465c) {
            C49466tp2.this.m11710r("disconnect...");
            C49466tp2.this.f111071d.mo96352b(this.f111074h.getBird());
            C49466tp2.this.m11710r("disconnect: vehicle found, so disconnect");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m11709a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tp2$c */
    /* loaded from: classes4.dex */
    public static final class C28825c extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f111076h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28825c(Vehicle vehicle) {
            super(1);
            this.f111076h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C49466tp2.this.f111072e.remove(this.f111076h.getBird());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tp2$d */
    /* loaded from: classes4.dex */
    public static final class C28826d extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f111078h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28826d(Vehicle vehicle) {
            super(1);
            this.f111078h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C49466tp2 c49466tp2 = C49466tp2.this;
            String serialNumber = this.f111078h.getBird().getSerialNumber();
            c49466tp2.m11710r("disconnect error: " + it + " + " + serialNumber);
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lco/bird/android/model/Vehicle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tp2$e */
    /* loaded from: classes4.dex */
    public static final class C28827e extends Lambda implements Function1<C36154Tk5, Vehicle> {

        /* renamed from: g */
        public static final C28827e f111079g = new C28827e();

        public C28827e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Vehicle invoke(C36154Tk5 scanResult) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            if (C12325bE.m64815a(scanResult)) {
                ZN1 m64812d = C12325bE.m64812d(scanResult);
                Intrinsics.checkNotNull(m64812d);
                BluetoothDevice device = scanResult.m83016a().mo17281d();
                WireBird wireBird = new WireBird(null, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -1, -1, 3, null);
                int m73232d = m64812d.m73232d();
                String m73233c = m64812d.m73233c();
                InterfaceC45802ne5 m83016a = scanResult.m83016a();
                String valueOf = String.valueOf((m64812d.m73234b() & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (m64812d.m73235a() << 16));
                Intrinsics.checkNotNullExpressionValue(device, "device");
                return new Vehicle(device, wireBird, 0, 0, false, null, false, false, m83016a, Integer.valueOf(m73232d), valueOf, m73233c, null, null, null, null, null, 127228, null);
            } else if (C36388Uk5.m80946E(scanResult)) {
                BluetoothDevice device2 = scanResult.m83016a().mo17281d();
                VehicleDescriptor m80926Y = C36388Uk5.m80926Y(scanResult);
                String serialNumber = m80926Y.getSerialNumber();
                if (serialNumber == null) {
                    str2 = "";
                } else {
                    str2 = serialNumber;
                }
                WireBird wireBird2 = new WireBird(null, null, null, 0, null, 0, null, null, null, str2, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, m80926Y.getImei(), null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -513, -33, 3, null);
                int m83015b = scanResult.m83015b();
                InterfaceC45802ne5 m83016a2 = scanResult.m83016a();
                String serialNumber2 = m80926Y.getSerialNumber();
                String imei = m80926Y.getImei();
                Intrinsics.checkNotNullExpressionValue(device2, "device");
                Vehicle vehicle = new Vehicle(device2, wireBird2, 0, 0, false, null, false, false, m83016a2, Integer.valueOf(m83015b), null, null, imei, serialNumber2, null, null, null, 118012, null);
                C7798TK.m83811a(vehicle, scanResult.m83014c().mo106631a());
                return vehicle;
            } else {
                BluetoothDevice device3 = scanResult.m83016a().mo17281d();
                VehicleDescriptor m80926Y2 = C36388Uk5.m80926Y(scanResult);
                int m83015b2 = scanResult.m83015b();
                InterfaceC45802ne5 m83016a3 = scanResult.m83016a();
                String serialNumber3 = m80926Y2.getSerialNumber();
                if (serialNumber3 == null) {
                    str = "";
                } else {
                    str = serialNumber3;
                }
                WireBird wireBird3 = new WireBird(null, null, null, 0, null, 0, null, null, null, str, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, m80926Y2.getImei(), null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -513, -33, 3, null);
                String serialNumber4 = m80926Y2.getSerialNumber();
                String imei2 = m80926Y2.getImei();
                Intrinsics.checkNotNullExpressionValue(device3, "device");
                return new Vehicle(device3, wireBird3, -1, 0, false, null, false, false, m83016a3, Integer.valueOf(m83015b2), null, null, imei2, serialNumber4, null, null, null, 118008, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tp2$f */
    /* loaded from: classes4.dex */
    public static final class C28828f extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public static final C28828f f111080g = new C28828f();

        public C28828f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!C36388Uk5.m80946E(it) && !C36388Uk5.m80900y(it) && !C12325bE.m64815a(it)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C49466tp2(InterfaceC5225MD baseBluetoothManager, InterfaceC48847sm6 vehicleManager, InterfaceC10732aY scheduler, InterfaceC34076Kn6 vehicleTrackerManager) {
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(vehicleManager, "vehicleManager");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(vehicleTrackerManager, "vehicleTrackerManager");
        this.f111068a = baseBluetoothManager;
        this.f111069b = vehicleManager;
        this.f111070c = scheduler;
        this.f111071d = vehicleTrackerManager;
        C52323ye5.m3115n(new C52323ye5.InterfaceC30647c() { // from class: mp2
            @Override // p000.C52323ye5.InterfaceC30647c
            /* renamed from: a */
            public final void mo3108a(int i, String str, String str2) {
                C49466tp2.m11718j(i, str, str2);
            }
        });
        this.f111072e = new ConcurrentHashMap<>();
    }

    /* renamed from: j */
    public static final void m11718j(int i, String str, String str2) {
        C41318g46.m40153k(str).mo7217u(i, str2, new Object[0]);
    }

    /* renamed from: k */
    public static final void m11717k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m11716l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final Boolean m11715m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final Vehicle m11714n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Vehicle) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m11713o() {
    }

    /* renamed from: q */
    public static final boolean m11711q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // p000.InterfaceC44723lp2
    /* renamed from: a */
    public Observable<Boolean> mo11727a(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Boolean> mo13697a = this.f111069b.mo13697a(vehicle);
        final C28824b c28824b = new C28824b(vehicle);
        Observable<Boolean> m33123k0 = mo13697a.m33102v(new InterfaceC23484g() { // from class: qp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49466tp2.m11717k(Function1.this, obj);
            }
        }).m33123k0();
        final C28825c c28825c = new C28825c(vehicle);
        Observable<Boolean> observeOn = m33123k0.doOnNext(new InterfaceC23484g() { // from class: rp2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49466tp2.m11716l(Function1.this, obj);
            }
        }).subscribeOn(this.f111070c.mo44187a()).observeOn(C23454a.m33087a());
        final C28826d c28826d = new C28826d(vehicle);
        Observable<Boolean> onErrorReturn = observeOn.onErrorReturn(new InterfaceC23492o() { // from class: sp2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m11715m;
                m11715m = C49466tp2.m11715m(Function1.this, obj);
                return m11715m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "override fun disconnect(…\n        true\n      }\n  }");
        return onErrorReturn;
    }

    @Override // p000.InterfaceC44723lp2
    /* renamed from: b */
    public AbstractC24490k<Vehicle> mo11726b(BLEScanTrigger bLEScanTrigger) {
        Observable<C36154Tk5> m11712p = m11712p(bLEScanTrigger);
        final C28827e c28827e = C28827e.f111079g;
        AbstractC24490k<Vehicle> m32163Y0 = m11712p.map(new InterfaceC23492o() { // from class: np2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Vehicle m11714n;
                m11714n = C49466tp2.m11714n(Function1.this, obj);
                return m11714n;
            }
        }).toFlowable(EnumC23460b.BUFFER).m32100w0(256L, new InterfaceC23478a() { // from class: op2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49466tp2.m11713o();
            }
        }, EnumC23450a.DROP_LATEST).m32163Y0(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32163Y0, "scanBirds(bleTrigger)\n  …scribeOn(Schedulers.io())");
        return m32163Y0;
    }

    /* renamed from: p */
    public final Observable<C36154Tk5> m11712p(BLEScanTrigger bLEScanTrigger) {
        String str;
        InterfaceC5225MD interfaceC5225MD = this.f111068a;
        if (bLEScanTrigger != null) {
            str = bLEScanTrigger.name();
        } else {
            str = null;
        }
        Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(interfaceC5225MD, 2, false, str, 2, null);
        final C28828f c28828f = C28828f.f111080g;
        Observable<C36154Tk5> filter = scanBleDevices$default.filter(new InterfaceC23494q() { // from class: pp2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m11711q;
                m11711q = C49466tp2.m11711q(Function1.this, obj);
                return m11711q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "baseBluetoothManager.sca…|| it.isIBeacon()\n      }");
        return filter;
    }

    /* renamed from: r */
    public final void m11710r(String str) {
        String name = Thread.currentThread().getName();
        C41318g46.m40151m("Thread: " + name + ": " + str, new Object[0]);
    }
}
