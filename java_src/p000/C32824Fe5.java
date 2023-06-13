package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BdBleScannedVehicle;
import co.bird.android.model.BirdAirBleScannedVehicle;
import co.bird.android.model.BirdBikeBleScannedVehicle;
import co.bird.android.model.BirdBleScannedVehicle;
import co.bird.android.model.BirdFlexBleScannedVehicle;
import co.bird.android.model.BleScannedVehicle;
import co.bird.android.model.HJPayloadEncryptor;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.EnergyMode;
import co.bird.api.request.BLEScanTrigger;
import co.bird.api.request.WireBluetoothDecryptionRequest;
import co.bird.api.request.WireBluetoothEncryptionRequest;
import co.bird.api.response.WireBluetoothDecryptionResponse;
import co.bird.api.response.WireBluetoothEncryptionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C32824Fe5;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0001$\u0018\u0000 ,2\u00020\u0001:\u0001\bB!\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, m28432d2 = {"LFe5;", "LAe5;", "", "scanTime", "Ljava/util/concurrent/TimeUnit;", "scanTimeUnit", "Lio/reactivex/k;", "LTk5;", C17296a.f69688o, "Lco/bird/android/model/VehicleDescriptor;", "vehicleDescriptor", "", "checkCache", "Lio/reactivex/F;", "Lco/bird/android/model/BleScannedVehicle;", "b", "Lco/bird/api/request/BLEScanTrigger;", "bleTrigger", "Lio/reactivex/Observable;", "l", "scanResult", "h", "LMD;", "LMD;", "baseBluetoothManager", "LaY;", "LaY;", "scheduler", "LhX;", "c", "LhX;", "bluetoothEncryptionClient", "Ljava/util/concurrent/ConcurrentHashMap;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/ConcurrentHashMap;", "vehicles", "Fe5$b$a", "e", "Lkotlin/Lazy;", "g", "()LFe5$b$a;", "hongjiEncryptor", "<init>", "(LMD;LaY;LhX;)V", "f", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fe5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32824Fe5 implements InterfaceC31654Ae5 {

    /* renamed from: f */
    public static final C2383a f9884f = new C2383a(null);

    /* renamed from: a */
    public final InterfaceC5225MD f9885a;

    /* renamed from: b */
    public final InterfaceC10732aY f9886b;

    /* renamed from: c */
    public final InterfaceC22675hX f9887c;

    /* renamed from: d */
    public final ConcurrentHashMap<VehicleDescriptor, BleScannedVehicle> f9888d;

    /* renamed from: e */
    public final Lazy f9889e;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LFe5$a;", "", "", "BLE_SCAN_TIMEOUT", "J", "", "HONGJI_ENCRYPTOR_DEVICE_TYPE", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fe5$a */
    /* loaded from: classes4.dex */
    public static final class C2383a {
        public /* synthetic */ C2383a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2383a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0007\n\u0002\b\u0003*\u0001\u0000\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Fe5$b$a", "b", "()LFe5$b$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fe5$b */
    /* loaded from: classes4.dex */
    public static final class C2384b extends Lambda implements Function0<C2385a> {

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\t"}, m28432d2 = {"Fe5$b$a", "Lco/bird/android/model/HJPayloadEncryptor;", "", "payload", "", "macAddress", "Lio/reactivex/F;", "encrypt", "decrypt", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Fe5$b$a */
        /* loaded from: classes4.dex */
        public static final class C2385a implements HJPayloadEncryptor {

            /* renamed from: a */
            public final /* synthetic */ C32824Fe5 f9891a;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireBluetoothDecryptionResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireBluetoothDecryptionResponse;)[B"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Fe5$b$a$a */
            /* loaded from: classes4.dex */
            public static final class C2386a extends Lambda implements Function1<WireBluetoothDecryptionResponse, byte[]> {

                /* renamed from: g */
                public static final C2386a f9892g = new C2386a();

                public C2386a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final byte[] invoke(WireBluetoothDecryptionResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return C45097mS5.m25604b(it.getDecryptedPayloadBase64(), 2);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireBluetoothEncryptionResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireBluetoothEncryptionResponse;)[B"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Fe5$b$a$b */
            /* loaded from: classes4.dex */
            public static final class C2387b extends Lambda implements Function1<WireBluetoothEncryptionResponse, byte[]> {

                /* renamed from: g */
                public static final C2387b f9893g = new C2387b();

                public C2387b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final byte[] invoke(WireBluetoothEncryptionResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return C45097mS5.m25604b(it.getEncryptedPayloadBase64(), 2);
                }
            }

            public C2385a(C32824Fe5 c32824Fe5) {
                this.f9891a = c32824Fe5;
            }

            /* renamed from: c */
            public static final byte[] m106795c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (byte[]) tmp0.invoke(obj);
            }

            /* renamed from: d */
            public static final byte[] m106794d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (byte[]) tmp0.invoke(obj);
            }

            @Override // co.bird.android.model.BlePayloadEncryptor
            public AbstractC23442F<byte[]> decrypt(byte[] payload, String str) {
                Intrinsics.checkNotNullParameter(payload, "payload");
                AbstractC23442F<WireBluetoothDecryptionResponse> m36249a = this.f9891a.f9887c.m36249a(new WireBluetoothDecryptionRequest("bird_bike_hj", C45097mS5.m25602d(payload, 2), str));
                final C2386a c2386a = C2386a.f9892g;
                AbstractC23442F m33157I = m36249a.m33157I(new InterfaceC23492o() { // from class: He5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        byte[] m106795c;
                        m106795c = C32824Fe5.C2384b.C2385a.m106795c(Function1.this, obj);
                        return m106795c;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "bluetoothEncryptionClien…flags = Base64.NO_WRAP) }");
                return m33157I;
            }

            @Override // co.bird.android.model.BlePayloadEncryptor
            public AbstractC23442F<byte[]> encrypt(byte[] payload, String str) {
                Intrinsics.checkNotNullParameter(payload, "payload");
                String m103785e = C3157HY.m103785e(payload);
                String m25602d = C45097mS5.m25602d(payload, 10);
                C41318g46.m40163a("hongi bike encryptor raw = " + m103785e + ", base64 payload = " + m25602d, new Object[0]);
                AbstractC23442F<WireBluetoothEncryptionResponse> m36248b = this.f9891a.f9887c.m36248b(new WireBluetoothEncryptionRequest("bird_bike_hj", C45097mS5.m25602d(payload, 2), str));
                final C2387b c2387b = C2387b.f9893g;
                AbstractC23442F m33157I = m36248b.m33157I(new InterfaceC23492o() { // from class: Ge5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        byte[] m106794d;
                        m106794d = C32824Fe5.C2384b.C2385a.m106794d(Function1.this, obj);
                        return m106794d;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "bluetoothEncryptionClien…flags = Base64.NO_WRAP) }");
                return m33157I;
            }
        }

        public C2384b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C2385a invoke() {
            return new C2385a(C32824Fe5.this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fe5$c */
    /* loaded from: classes4.dex */
    public static final class C2388c extends Lambda implements Function1<C36154Tk5, InterfaceC23434B<? extends C36154Tk5>> {

        /* renamed from: g */
        public final /* synthetic */ VehicleDescriptor f9894g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2388c(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f9894g = vehicleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends C36154Tk5> invoke(C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            if (Intrinsics.areEqual(C36388Uk5.m80926Y(scanResult), this.f9894g)) {
                return Observable.just(scanResult);
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lco/bird/android/model/BleScannedVehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lco/bird/android/model/BleScannedVehicle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fe5$d */
    /* loaded from: classes4.dex */
    public static final class C2389d extends Lambda implements Function1<C36154Tk5, BleScannedVehicle> {

        /* renamed from: h */
        public final /* synthetic */ VehicleDescriptor f9896h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2389d(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f9896h = vehicleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BleScannedVehicle invoke(C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            BleScannedVehicle m106805h = C32824Fe5.this.m106805h(this.f9896h, scanResult);
            C32824Fe5.this.f9888d.put(this.f9896h, m106805h);
            return m106805h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fe5$e */
    /* loaded from: classes4.dex */
    public static final class C2390e extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public static final C2390e f9897g = new C2390e();

        public C2390e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!C36388Uk5.m80946E(it) && !C36388Uk5.m80900y(it) && !C36388Uk5.m80950A(it) && !C36388Uk5.m80948C(it) && !C36388Uk5.m80944G(it)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C32824Fe5(InterfaceC5225MD baseBluetoothManager, InterfaceC10732aY scheduler, InterfaceC22675hX bluetoothEncryptionClient) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(bluetoothEncryptionClient, "bluetoothEncryptionClient");
        this.f9885a = baseBluetoothManager;
        this.f9886b = scheduler;
        this.f9887c = bluetoothEncryptionClient;
        this.f9888d = new ConcurrentHashMap<>();
        lazy = LazyKt__LazyJVMKt.lazy(new C2384b());
        this.f9889e = lazy;
    }

    /* renamed from: i */
    public static final BleScannedVehicle m106804i(boolean z, C32824Fe5 this$0, VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "$vehicleDescriptor");
        if (z) {
            return this$0.f9888d.get(vehicleDescriptor);
        }
        return null;
    }

    /* renamed from: j */
    public static final InterfaceC23434B m106803j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final BleScannedVehicle m106802k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BleScannedVehicle) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static /* synthetic */ Observable m106800m(C32824Fe5 c32824Fe5, BLEScanTrigger bLEScanTrigger, int i, Object obj) {
        if ((i & 1) != 0) {
            bLEScanTrigger = null;
        }
        return c32824Fe5.m106801l(bLEScanTrigger);
    }

    /* renamed from: n */
    public static final boolean m106799n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // p000.InterfaceC31654Ae5
    /* renamed from: a */
    public AbstractC24490k<C36154Tk5> mo106812a(long j, TimeUnit scanTimeUnit) {
        Intrinsics.checkNotNullParameter(scanTimeUnit, "scanTimeUnit");
        AbstractC24490k<C36154Tk5> flowable = InterfaceC5225MD.C5226a.scanBleDevices$default(this.f9885a, 2, false, null, 6, null).takeUntil(Observable.timer(j, scanTimeUnit)).toFlowable(EnumC23460b.BUFFER);
        Intrinsics.checkNotNullExpressionValue(flowable, "baseBluetoothManager.sca…kpressureStrategy.BUFFER)");
        return flowable;
    }

    @Override // p000.InterfaceC31654Ae5
    /* renamed from: b */
    public AbstractC23442F<BleScannedVehicle> mo106811b(final VehicleDescriptor vehicleDescriptor, final boolean z) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        AbstractC24507p m32071D = AbstractC24507p.m32071D(new Callable() { // from class: Be5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BleScannedVehicle m106804i;
                m106804i = C32824Fe5.m106804i(z, this, vehicleDescriptor);
                return m106804i;
            }
        });
        Observable m106800m = m106800m(this, null, 1, null);
        final C2388c c2388c = new C2388c(vehicleDescriptor);
        AbstractC23442F firstOrError = m106800m.flatMap(new InterfaceC23492o() { // from class: Ce5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m106803j;
                m106803j = C32824Fe5.m106803j(Function1.this, obj);
                return m106803j;
            }
        }).firstOrError();
        final C2389d c2389d = new C2389d(vehicleDescriptor);
        AbstractC23442F<BleScannedVehicle> m33138b0 = m32071D.m32053W(firstOrError.m33157I(new InterfaceC23492o() { // from class: De5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BleScannedVehicle m106802k;
                m106802k = C32824Fe5.m106802k(Function1.this, obj);
                return m106802k;
            }
        })).m33138b0(10L, TimeUnit.SECONDS, this.f9886b.mo44187a());
        Intrinsics.checkNotNullExpressionValue(m33138b0, "override fun scan(vehicl…ONDS, scheduler.main)\n  }");
        return m33138b0;
    }

    /* renamed from: g */
    public final C2384b.C2385a m106806g() {
        return (C2384b.C2385a) this.f9889e.getValue();
    }

    /* renamed from: h */
    public final BleScannedVehicle m106805h(VehicleDescriptor vehicleDescriptor, C36154Tk5 c36154Tk5) {
        byte b;
        int i;
        EnergyMode energyMode = EnergyMode.NORMAL;
        byte b2 = -1;
        if (C36388Uk5.m80946E(c36154Tk5)) {
            List<C20674g> m42297d = C20165f.m42298c().m42297d(c36154Tk5.m83014c().mo106631a());
            Intrinsics.checkNotNullExpressionValue(m42297d, "getInstance().parse(scanResult.scanRecord.bytes)");
            short s = -1;
            i = 0;
            for (C20674g c20674g : m42297d) {
                if (c20674g instanceof C19649d) {
                    ByteBuffer order = ByteBuffer.wrap(((C19649d) c20674g).m40379a()).order(ByteOrder.LITTLE_ENDIAN);
                    s = order.getShort();
                    b2 = order.get();
                    EnergyMode m113750a = C31875Bd1.m113750a(vehicleDescriptor, order.get());
                    i = C3157HY.m103787c(order.getInt());
                    energyMode = m113750a;
                }
            }
            b = b2;
            b2 = s;
        } else {
            b = -1;
            i = 0;
        }
        if (C36388Uk5.m80944G(c36154Tk5)) {
            C41318g46.m40163a("detected bird flex scan result: " + c36154Tk5, new Object[0]);
            InterfaceC45802ne5 bleDevice = c36154Tk5.m83016a();
            BluetoothDevice bluetoothDevice = c36154Tk5.m83016a().mo17281d();
            int m83015b = c36154Tk5.m83015b();
            InterfaceC32176Ck5 scanRecord = c36154Tk5.m83014c();
            Intrinsics.checkNotNullExpressionValue(bleDevice, "bleDevice");
            Intrinsics.checkNotNullExpressionValue(bluetoothDevice, "bluetoothDevice");
            Integer valueOf = Integer.valueOf(m83015b);
            Intrinsics.checkNotNullExpressionValue(scanRecord, "scanRecord");
            return new BirdFlexBleScannedVehicle(bleDevice, bluetoothDevice, b2, b, i, energyMode, valueOf, null, scanRecord);
        } else if (C36388Uk5.m80900y(c36154Tk5)) {
            InterfaceC45802ne5 bleDevice2 = c36154Tk5.m83016a();
            BluetoothDevice bluetoothDevice2 = c36154Tk5.m83016a().mo17281d();
            int m83015b2 = c36154Tk5.m83015b();
            String imei = C36388Uk5.m80926Y(c36154Tk5).getImei();
            InterfaceC32176Ck5 scanRecord2 = c36154Tk5.m83014c();
            Intrinsics.checkNotNullExpressionValue(bleDevice2, "bleDevice");
            Intrinsics.checkNotNullExpressionValue(bluetoothDevice2, "bluetoothDevice");
            Integer valueOf2 = Integer.valueOf(m83015b2);
            Intrinsics.checkNotNullExpressionValue(scanRecord2, "scanRecord");
            return new BdBleScannedVehicle(bleDevice2, bluetoothDevice2, b2, b, i, energyMode, valueOf2, imei, scanRecord2);
        } else if (C36388Uk5.m80950A(c36154Tk5)) {
            InterfaceC45802ne5 bleDevice3 = c36154Tk5.m83016a();
            BluetoothDevice bluetoothDevice3 = c36154Tk5.m83016a().mo17281d();
            int m83015b3 = c36154Tk5.m83015b();
            InterfaceC32176Ck5 scanRecord3 = c36154Tk5.m83014c();
            Intrinsics.checkNotNullExpressionValue(bleDevice3, "bleDevice");
            Intrinsics.checkNotNullExpressionValue(bluetoothDevice3, "bluetoothDevice");
            Integer valueOf3 = Integer.valueOf(m83015b3);
            Intrinsics.checkNotNullExpressionValue(scanRecord3, "scanRecord");
            return new BirdAirBleScannedVehicle(bleDevice3, bluetoothDevice3, b2, b, i, energyMode, valueOf3, null, scanRecord3);
        } else if (C36388Uk5.m80948C(c36154Tk5)) {
            C41318g46.m40163a("detected bird bike scan result: " + c36154Tk5, new Object[0]);
            C2384b.C2385a m106806g = m106806g();
            InterfaceC45802ne5 bleDevice4 = c36154Tk5.m83016a();
            BluetoothDevice bluetoothDevice4 = c36154Tk5.m83016a().mo17281d();
            int m83015b4 = c36154Tk5.m83015b();
            InterfaceC32176Ck5 scanRecord4 = c36154Tk5.m83014c();
            boolean m80938M = C36388Uk5.m80938M(c36154Tk5);
            Intrinsics.checkNotNullExpressionValue(bleDevice4, "bleDevice");
            Intrinsics.checkNotNullExpressionValue(bluetoothDevice4, "bluetoothDevice");
            Integer valueOf4 = Integer.valueOf(m83015b4);
            Intrinsics.checkNotNullExpressionValue(scanRecord4, "scanRecord");
            return new BirdBikeBleScannedVehicle(m106806g, bleDevice4, bluetoothDevice4, b2, b, i, energyMode, valueOf4, null, scanRecord4, m80938M);
        } else {
            InterfaceC45802ne5 bleDevice5 = c36154Tk5.m83016a();
            BluetoothDevice bluetoothDevice5 = c36154Tk5.m83016a().mo17281d();
            int m83015b5 = c36154Tk5.m83015b();
            InterfaceC32176Ck5 scanRecord5 = c36154Tk5.m83014c();
            Intrinsics.checkNotNullExpressionValue(bleDevice5, "bleDevice");
            Intrinsics.checkNotNullExpressionValue(bluetoothDevice5, "bluetoothDevice");
            Integer valueOf5 = Integer.valueOf(m83015b5);
            Intrinsics.checkNotNullExpressionValue(scanRecord5, "scanRecord");
            return new BirdBleScannedVehicle(bleDevice5, bluetoothDevice5, b2, b, i, energyMode, valueOf5, null, scanRecord5);
        }
    }

    /* renamed from: l */
    public final Observable<C36154Tk5> m106801l(BLEScanTrigger bLEScanTrigger) {
        String str;
        InterfaceC5225MD interfaceC5225MD = this.f9885a;
        if (bLEScanTrigger != null) {
            str = bLEScanTrigger.name();
        } else {
            str = null;
        }
        Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(interfaceC5225MD, 2, false, str, 2, null);
        final C2390e c2390e = C2390e.f9897g;
        Observable<C36154Tk5> filter = scanBleDevices$default.filter(new InterfaceC23494q() { // from class: Ee5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m106799n;
                m106799n = C32824Fe5.m106799n(Function1.this, obj);
                return m106799n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "baseBluetoothManager.sca…| it.isBirdFlex()\n      }");
        return filter;
    }
}
