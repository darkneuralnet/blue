package co.bird.android.app.feature.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.ParcelUuid;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.bluetooth.BluetoothDiscoveryReceiver;
import co.bird.android.model.wire.WireLocation;
import co.bird.api.request.BLEScanTrigger;
import co.bird.api.request.BleDeviceBody;
import co.bird.api.request.BleScan;
import co.bird.api.request.BleScanReportBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u00104J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101¨\u00065"}, m28432d2 = {"Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "h", "i", "LhY;", C17296a.f69688o, "LhY;", "e", "()LhY;", "setBluetoothTraceClient", "(LhY;)V", "bluetoothTraceClient", "Ldr4;", "b", "Ldr4;", "f", "()Ldr4;", "setLocationManager", "(Ldr4;)V", "locationManager", "Lgl;", "c", "Lgl;", "g", "()Lgl;", "setPreference", "(Lgl;)V", "preference", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "getReactiveConfig", "()LTq4;", "setReactiveConfig", "(LTq4;)V", "reactiveConfig", "", "Lco/bird/api/request/BleDeviceBody;", "Ljava/util/List;", "btDevices", "Lco/bird/api/request/BleScan;", "btDevicesWithTimestamp", "Lio/reactivex/disposables/c;", "Lio/reactivex/disposables/c;", "disposable", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBluetoothDiscoveryReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothDiscoveryReceiver.kt\nco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,97:1\n11335#2:98\n11670#2,3:99\n*S KotlinDebug\n*F\n+ 1 BluetoothDiscoveryReceiver.kt\nco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver\n*L\n63#1:98\n63#1:99,3\n*E\n"})
/* loaded from: classes2.dex */
public final class BluetoothDiscoveryReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public InterfaceC22677hY f61319a;

    /* renamed from: b */
    public InterfaceC40001dr4 f61320b;

    /* renamed from: c */
    public C22454gl f61321c;

    /* renamed from: d */
    public C36207Tq4 f61322d;

    /* renamed from: e */
    public final List<BleDeviceBody> f61323e = new ArrayList();

    /* renamed from: f */
    public final List<BleScan> f61324f = new ArrayList();

    /* renamed from: g */
    public final InterfaceC23465c f61325g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.bluetooth.BluetoothDiscoveryReceiver$a */
    /* loaded from: classes2.dex */
    public static final class C13691a extends Lambda implements Function1<Location, Unit> {

        /* renamed from: g */
        public static final C13691a f61326g = new C13691a();

        public C13691a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.bluetooth.BluetoothDiscoveryReceiver$b */
    /* loaded from: classes2.dex */
    public static final class C13692b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C13692b f61327g = new C13692b();

        public C13692b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    public BluetoothDiscoveryReceiver() {
        H22.f12748a.mo24076S2(this);
        Observable<Location> mo43619m = m60790f().mo43619m(false);
        final C13691a c13691a = C13691a.f61326g;
        InterfaceC23484g<? super Location> interfaceC23484g = new InterfaceC23484g() { // from class: dX
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BluetoothDiscoveryReceiver.m60793c(Function1.this, obj);
            }
        };
        final C13692b c13692b = C13692b.f61327g;
        InterfaceC23465c subscribe = mo43619m.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: eX
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BluetoothDiscoveryReceiver.m60792d(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "locationManager.frequent…    Timber.e(it)\n      })");
        this.f61325g = subscribe;
    }

    /* renamed from: c */
    public static final void m60793c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public static final void m60792d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final InterfaceC22677hY m60791e() {
        InterfaceC22677hY interfaceC22677hY = this.f61319a;
        if (interfaceC22677hY != null) {
            return interfaceC22677hY;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bluetoothTraceClient");
        return null;
    }

    /* renamed from: f */
    public final InterfaceC40001dr4 m60790f() {
        InterfaceC40001dr4 interfaceC40001dr4 = this.f61320b;
        if (interfaceC40001dr4 != null) {
            return interfaceC40001dr4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationManager");
        return null;
    }

    /* renamed from: g */
    public final C22454gl m60789g() {
        C22454gl c22454gl = this.f61321c;
        if (c22454gl != null) {
            return c22454gl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preference");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* renamed from: h */
    public final void m60788h(Intent intent) {
        BluetoothDevice bluetoothDevice;
        String str;
        String str2;
        ParcelUuid[] parcelUuidArr;
        ArrayList arrayList;
        ?? emptyList;
        ArrayList arrayList2 = null;
        if (intent != null) {
            bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        } else {
            bluetoothDevice = null;
        }
        short s = ShortCompanionObject.MIN_VALUE;
        if (intent != null) {
            s = intent.getShortExtra("android.bluetooth.device.extra.RSSI", ShortCompanionObject.MIN_VALUE);
        }
        short s2 = s;
        if (bluetoothDevice != null) {
            str = bluetoothDevice.getName();
        } else {
            str = null;
        }
        if (bluetoothDevice != null) {
            str2 = bluetoothDevice.getAddress();
        } else {
            str2 = null;
        }
        if (bluetoothDevice != null) {
            parcelUuidArr = bluetoothDevice.getUuids();
        } else {
            parcelUuidArr = null;
        }
        if (parcelUuidArr != null) {
            arrayList2 = new ArrayList(parcelUuidArr.length);
            for (ParcelUuid parcelUuid : parcelUuidArr) {
                arrayList2.add(parcelUuid.getUuid());
            }
        }
        if (str != null) {
            if (arrayList2 == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                arrayList = emptyList;
            } else {
                arrayList = arrayList2;
            }
            WireLocation m37667W = m60789g().m37667W();
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            this.f61324f.add(new BleScan(s2, str, now, arrayList, null, str2, m37667W, 16, null));
        }
    }

    /* renamed from: i */
    public final void m60787i(Context context) {
        m60791e().m36222a(new BleScanReportBody(this.f61324f, BLEScanTrigger.REMOTE_NOTIFICATION.name())).m33159G().m33069Q().m33063X(C24542a.m31932c()).subscribe();
        if (context != null) {
            try {
                context.unregisterReceiver(this);
            } catch (Exception e) {
                C41318g46.m40159e(e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        boolean areEqual = Intrinsics.areEqual(str, "android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        boolean areEqual2 = Intrinsics.areEqual(str, "android.bluetooth.device.action.FOUND");
        if (areEqual) {
            m60787i(context);
        } else if (areEqual2) {
            m60788h(intent);
        }
        this.f61325g.dispose();
    }
}
