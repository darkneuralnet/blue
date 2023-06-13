package p000;

import android.util.LruCache;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BlePayloadEncryptor;
import co.bird.android.model.BleScannedVehicle;
import co.bird.android.model.Command;
import co.bird.android.model.GattUuid;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LockKind;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.VehicleSpeedMode;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.polidea.rxandroidble2.exceptions.BleAdapterDisabledException;
import com.polidea.rxandroidble2.exceptions.BleAlreadyConnectedException;
import com.polidea.rxandroidble2.exceptions.BleCharacteristicNotFoundException;
import com.polidea.rxandroidble2.exceptions.BleConflictingNotificationAlreadySetException;
import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException;
import com.polidea.rxandroidble2.exceptions.BleGattCharacteristicException;
import com.polidea.rxandroidble2.exceptions.BleGattException;
import com.polidea.rxandroidble2.exceptions.BleScanException;
import com.polidea.rxandroidble2.exceptions.BleServiceNotFoundException;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37261Yd5;
import p000.InterfaceC31654Ae5;
import p000.InterfaceC44023ke5;
@Metadata(m28433d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u0001AB'\u0012\u0006\u0010U\u001a\u00020S\u0012\u0006\u0010X\u001a\u00020V\u0012\u0006\u0010[\u001a\u00020Y\u0012\u0006\u0010^\u001a\u00020\\¢\u0006\u0004\bc\u0010dJ9\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J7\u0010\u001c\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00020\u0017H\u0002J\u001c\u0010!\u001a\u00020\u0002*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0003H\u0002J$\u0010\"\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150$2\u0006\u0010#\u001a\u00020\u001dH\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150&H\u0016J,\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u00100\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u00101\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0018\u00104\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001d2\u0006\u00103\u001a\u00020+H\u0016J\u0010\u00105\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u00106\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u00107\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u00108\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u00109\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u0010:\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0016J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0016J\u0010\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\tH\u0016J\u0018\u0010E\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\rH\u0016J\u0018\u0010H\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020FH\u0016J$\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0$0$2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020IH\u0016J\u001e\u0010N\u001a\b\u0012\u0004\u0012\u00020+0M2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020+H\u0016J\u0018\u0010P\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u0003H\u0016J\u0018\u0010R\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020+H\u0016R\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010]R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010`R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020+0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010`¨\u0006e"}, m28432d2 = {"LYd5;", "Lrd5;", "Lio/reactivex/c;", "", "enabled", "LKY;", "bluetoothWakeStarted", "LbE5;", "sleepStarted", "", "firmwareVersion", "t0", "(Lio/reactivex/c;ZLKY;LbE5;Ljava/lang/Integer;)Lio/reactivex/c;", "", "exceptionType", "", "y0", "(ZLKY;LbE5;Ljava/lang/Integer;Ljava/lang/String;)V", "", "error", "j0", "Lco/bird/android/model/VehicleConnection;", "serialNumber", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "token", "action", "J0", "Lco/bird/android/model/VehicleDescriptor;", "Lco/bird/android/model/LockKind;", "lockKind", "locking", "N0", "q0", "vehicleDescriptor", "Lio/reactivex/Observable;", DateTokenConverter.CONVERTER_KEY, "", "c", "descriptor", "h", "l", "", "p", "v", "u", "o", "g", "t", "b", "command", "m", "z", "q", "e", "w", "y", "k", "", "scanTime", "Ljava/util/concurrent/TimeUnit;", "scanTimeUnit", "Lio/reactivex/k;", "LTk5;", C17296a.f69688o, "minRssi", "i", "passcode", "x", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "n", "Lfd3;", "mode", "j", MessageExtension.FIELD_DATA, "Lio/reactivex/F;", "s", "lightsOn", "r", "byteArray", "f", "LAe5;", "LAe5;", "rxBleVehicleManager", "LkJ;", "LkJ;", "birdBluetoothApiManager", "LEa;", "LEa;", "analyticsManager", "LaM;", "LaM;", "birdManager", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "vehicleConnectionCache", "vehicleTokenCache", "<init>", "(LAe5;LkJ;LEa;LaM;)V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRxBleBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxBleBirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/vehicle/RxBleBirdBluetoothManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
/* renamed from: Yd5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37261Yd5 implements InterfaceC48164rd5 {

    /* renamed from: g */
    public static final C9835a f46100g = new C9835a(null);

    /* renamed from: a */
    public final InterfaceC31654Ae5 f46101a;

    /* renamed from: b */
    public final InterfaceC25136kJ f46102b;

    /* renamed from: c */
    public final InterfaceC1880Ea f46103c;

    /* renamed from: d */
    public final InterfaceC10636aM f46104d;

    /* renamed from: e */
    public final LruCache<VehicleDescriptor, VehicleConnection> f46105e;

    /* renamed from: f */
    public final LruCache<VehicleDescriptor, byte[]> f46106f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRxBleBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxBleBirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/vehicle/RxBleBirdBluetoothManagerImpl$toggleLights$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
    /* renamed from: Yd5$A */
    /* loaded from: classes4.dex */
    public static final class C9829A extends Lambda implements Function1<VehicleConnection, Unit> {

        /* renamed from: h */
        public final /* synthetic */ VehicleDescriptor f46108h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9829A(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f46108h = vehicleDescriptor;
        }

        /* renamed from: a */
        public final void m74703a(VehicleConnection it) {
            byte[] bArr = (byte[]) C37261Yd5.this.f46106f.get(this.f46108h);
            if (bArr != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                it.setCurrentSessionToken(bArr);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VehicleConnection vehicleConnection) {
            m74703a(vehicleConnection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$B */
    /* loaded from: classes4.dex */
    public static final class C9830B extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ boolean f46109g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9830B(boolean z) {
            super(1);
            this.f46109g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toggleLights(this.f46109g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$C */
    /* loaded from: classes4.dex */
    public static final class C9831C extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ LockKind f46110g;

        /* renamed from: h */
        public final /* synthetic */ boolean f46111h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9831C(LockKind lockKind, boolean z) {
            super(1);
            this.f46110g = lockKind;
            this.f46111h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.unlock(this.f46110g, this.f46111h, "");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yd5$D */
    /* loaded from: classes4.dex */
    public static final class C9832D extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C9832D f46112g = new C9832D();

        public C9832D() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$E */
    /* loaded from: classes4.dex */
    public static final class C9833E extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f46114h;

        /* renamed from: i */
        public final /* synthetic */ LockKind f46115i;

        /* renamed from: j */
        public final /* synthetic */ boolean f46116j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9833E(String str, LockKind lockKind, boolean z) {
            super(1);
            this.f46114h = str;
            this.f46115i = lockKind;
            this.f46116j = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37261Yd5.this.m74713q0(it, this.f46114h, this.f46115i, this.f46116j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$F */
    /* loaded from: classes4.dex */
    public static final class C9834F extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ byte[] f46117g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9834F(byte[] bArr) {
            super(1);
            this.f46117g = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.writeRaw(this.f46117g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LYd5$a;", "", "", "STREAM_DISPOSED_EXCEPTION_TYPE", "Ljava/lang/String;", "", "VEHICLE_RENTAL_MODE_BLAST_DURATION_SECONDS", "J", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$a */
    /* loaded from: classes4.dex */
    public static final class C9835a {
        public /* synthetic */ C9835a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9835a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$b */
    /* loaded from: classes4.dex */
    public static final class C9836b extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9836b f46118g = new C9836b();

        public C9836b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.alarm("");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yd5$c */
    /* loaded from: classes4.dex */
    public static final class C9837c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C9837c f46119g = new C9837c();

        public C9837c() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yd5$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C9838d extends FunctionReferenceImpl implements Function1<String, AbstractC23461c> {
        public C9838d(Object obj) {
            super(1, obj, VehicleConnection.class, "alarm", "alarm(Ljava/lang/String;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((VehicleConnection) this.receiver).alarm(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "newConnection", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$e */
    /* loaded from: classes4.dex */
    public static final class C9839e extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f46121h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yd5$e$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C9840a extends FunctionReferenceImpl implements Function1<String, AbstractC23461c> {
            public C9840a(Object obj) {
                super(1, obj, VehicleConnection.class, "alarm", "alarm(Ljava/lang/String;)Lio/reactivex/Completable;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC23461c invoke(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((VehicleConnection) this.receiver).alarm(p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9839e(String str) {
            super(1);
            this.f46121h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection newConnection) {
            Intrinsics.checkNotNullParameter(newConnection, "newConnection");
            return C37261Yd5.this.m74754J0(newConnection, this.f46121h, new C9840a(newConnection));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BleScannedVehicle;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/VehicleConnection;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$f */
    /* loaded from: classes4.dex */
    public static final class C9841f extends Lambda implements Function1<BleScannedVehicle, InterfaceC23434B<? extends VehicleConnection>> {

        /* renamed from: g */
        public static final C9841f f46122g = new C9841f();

        public C9841f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends VehicleConnection> invoke(BleScannedVehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.connect();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "kotlin.jvm.PlatformType", "_connection", "", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$g */
    /* loaded from: classes4.dex */
    public static final class C9842g extends Lambda implements Function1<VehicleConnection, Unit> {

        /* renamed from: h */
        public final /* synthetic */ VehicleDescriptor f46124h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9842g(VehicleDescriptor vehicleDescriptor) {
            super(1);
            this.f46124h = vehicleDescriptor;
        }

        /* renamed from: a */
        public final void m74693a(VehicleConnection vehicleConnection) {
            C37261Yd5.this.f46105e.put(this.f46124h, vehicleConnection);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VehicleConnection vehicleConnection) {
            m74693a(vehicleConnection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BleScannedVehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BleScannedVehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$h */
    /* loaded from: classes4.dex */
    public static final class C9843h extends Lambda implements Function1<BleScannedVehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<Integer> f46125g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9843h(Ref.ObjectRef<Integer> objectRef) {
            super(1);
            this.f46125g = objectRef;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Integer] */
        /* renamed from: a */
        public final void m74692a(BleScannedVehicle bleScannedVehicle) {
            this.f46125g.element = Integer.valueOf(bleScannedVehicle.getVersion());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BleScannedVehicle bleScannedVehicle) {
            m74692a(bleScannedVehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BleScannedVehicle;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/VehicleConnection;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$i */
    /* loaded from: classes4.dex */
    public static final class C9844i extends Lambda implements Function1<BleScannedVehicle, InterfaceC23434B<? extends VehicleConnection>> {

        /* renamed from: g */
        public static final C9844i f46126g = new C9844i();

        public C9844i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends VehicleConnection> invoke(BleScannedVehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.connect();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$j */
    /* loaded from: classes4.dex */
    public static final class C9845j extends Lambda implements Function1<VehicleConnection, InterfaceC23447K<? extends VehicleConnection>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f46127g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9845j(boolean z) {
            super(1);
            this.f46127g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends VehicleConnection> invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.deepSleep(this.f46127g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$k */
    /* loaded from: classes4.dex */
    public static final class C9846k extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9846k f46128g = new C9846k();

        public C9846k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.firmwareInquiry();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "token", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$l */
    /* loaded from: classes4.dex */
    public static final class C9847l extends Lambda implements Function1<String, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ VehicleConnection f46129g;

        /* renamed from: h */
        public final /* synthetic */ LockKind f46130h;

        /* renamed from: i */
        public final /* synthetic */ boolean f46131i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yd5$l$a */
        /* loaded from: classes4.dex */
        public static final class C9848a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C9848a f46132g = new C9848a();

            public C9848a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9847l(VehicleConnection vehicleConnection, LockKind lockKind, boolean z) {
            super(1);
            this.f46129g = vehicleConnection;
            this.f46130h = lockKind;
            this.f46131i = z;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            AbstractC23461c m33065U = this.f46129g.unlock(this.f46130h, this.f46131i, token).m33065U(3L);
            final C9848a c9848a = C9848a.f46132g;
            return m33065U.m33084B(new InterfaceC23484g() { // from class: Zd5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37261Yd5.C9847l.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$m */
    /* loaded from: classes4.dex */
    public static final class C9849m extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9849m f46133g = new C9849m();

        public C9849m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.initiateChallenge();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRxBleBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxBleBirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/vehicle/RxBleBirdBluetoothManagerImpl$logDeepSleepEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
    /* renamed from: Yd5$n */
    /* loaded from: classes4.dex */
    public static final class C9850n extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C4464KY f46134g;

        /* renamed from: h */
        public final /* synthetic */ C38431bE5 f46135h;

        /* renamed from: i */
        public final /* synthetic */ boolean f46136i;

        /* renamed from: j */
        public final /* synthetic */ C37261Yd5 f46137j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9850n(C4464KY c4464ky, C38431bE5 c38431bE5, boolean z, C37261Yd5 c37261Yd5) {
            super(1);
            this.f46134g = c4464ky;
            this.f46135h = c38431bE5;
            this.f46136i = z;
            this.f46137j = c37261Yd5;
        }

        /* renamed from: a */
        public final void m74685a(InterfaceC23465c interfaceC23465c) {
            C4464KY c4464ky = this.f46134g;
            if (c4464ky != null) {
                boolean z = this.f46136i;
                C37261Yd5 c37261Yd5 = this.f46137j;
                if (!z) {
                    c37261Yd5.f46103c.mo55905y(c4464ky);
                }
            }
            C38431bE5 c38431bE5 = this.f46135h;
            if (c38431bE5 != null) {
                boolean z2 = this.f46136i;
                C37261Yd5 c37261Yd52 = this.f46137j;
                if (z2) {
                    c37261Yd52.f46103c.mo55905y(c38431bE5);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m74685a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yd5$o */
    /* loaded from: classes4.dex */
    public static final class C9851o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f46139h;

        /* renamed from: i */
        public final /* synthetic */ C4464KY f46140i;

        /* renamed from: j */
        public final /* synthetic */ C38431bE5 f46141j;

        /* renamed from: k */
        public final /* synthetic */ Integer f46142k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9851o(boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, Integer num) {
            super(1);
            this.f46139h = z;
            this.f46140i = c4464ky;
            this.f46141j = c38431bE5;
            this.f46142k = num;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C37261Yd5 c37261Yd5 = C37261Yd5.this;
            boolean z = this.f46139h;
            C4464KY c4464ky = this.f46140i;
            C38431bE5 c38431bE5 = this.f46141j;
            Integer num = this.f46142k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37261Yd5.m74705y0(z, c4464ky, c38431bE5, num, c37261Yd5.m74720j0(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$p */
    /* loaded from: classes4.dex */
    public static final class C9852p extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9852p f46143g = new C9852p();

        public C9852p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.refreshStatus();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$q */
    /* loaded from: classes4.dex */
    public static final class C9853q extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9853q f46144g = new C9853q();

        public C9853q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.requestToken();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$r */
    /* loaded from: classes4.dex */
    public static final class C9854r extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9854r f46145g = new C9854r();

        public C9854r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.resetServiceIndicator();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$s */
    /* loaded from: classes4.dex */
    public static final class C9855s extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9855s f46146g = new C9855s();

        public C9855s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.resetTotalOdometer();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$t */
    /* loaded from: classes4.dex */
    public static final class C9856t extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public static final C9856t f46147g = new C9856t();

        public C9856t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.resetTripOdometer();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$u */
    /* loaded from: classes4.dex */
    public static final class C9857u extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ byte[] f46148g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9857u(byte[] bArr) {
            super(1);
            this.f46148g = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.sendOTAUpdateCommand(this.f46148g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$v */
    /* loaded from: classes4.dex */
    public static final class C9858v extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ String f46149g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9858v(String str) {
            super(1);
            this.f46149g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.sendPasscode(this.f46149g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lna4;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(LTk5;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$w */
    /* loaded from: classes4.dex */
    public static final class C9859w extends Lambda implements Function1<C36154Tk5, InterfaceC45761na4<? extends C36154Tk5>> {

        /* renamed from: g */
        public final /* synthetic */ int f46150g;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lke5;", "connection", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yd5$w$a */
        /* loaded from: classes4.dex */
        public static final class C9860a extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends byte[]>> {

            /* renamed from: g */
            public static final C9860a f46151g = new C9860a();

            public C9860a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends byte[]> invoke(InterfaceC44023ke5 connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                return connection.mo27056c(GattUuid.COMMAND.getUuid(), Command.RENTAL_MODE.getData());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lna4;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "([B)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yd5$w$b */
        /* loaded from: classes4.dex */
        public static final class C9861b extends Lambda implements Function1<byte[], InterfaceC45761na4<? extends C36154Tk5>> {

            /* renamed from: g */
            public final /* synthetic */ C36154Tk5 f46152g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9861b(C36154Tk5 c36154Tk5) {
                super(1);
                this.f46152g = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC45761na4<? extends C36154Tk5> invoke(byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24490k.m32123o0(this.f46152g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)LTk5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yd5$w$c */
        /* loaded from: classes4.dex */
        public static final class C9862c extends Lambda implements Function1<Throwable, C36154Tk5> {

            /* renamed from: g */
            public final /* synthetic */ C36154Tk5 f46153g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9862c(C36154Tk5 c36154Tk5) {
                super(1);
                this.f46153g = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36154Tk5 invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f46153g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9859w(int i) {
            super(1);
            this.f46150g = i;
        }

        /* renamed from: e */
        public static final InterfaceC45761na4 m74673e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC45761na4) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final C36154Tk5 m74672f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C36154Tk5) tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC45761na4<? extends C36154Tk5> invoke(C36154Tk5 scanResult) {
            boolean z;
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            if (C36388Uk5.m80946E(scanResult) && scanResult.m83015b() >= this.f46150g) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return AbstractC24490k.m32123o0(scanResult);
            }
            AbstractC24490k<InterfaceC44023ke5> flowable = scanResult.m83016a().mo17282c(false, new K46(3L, TimeUnit.SECONDS)).toFlowable(EnumC23460b.LATEST);
            final C9860a c9860a = C9860a.f46151g;
            AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: ae5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C37261Yd5.C9859w.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C9861b c9861b = new C9861b(scanResult);
            AbstractC24490k m32167W = m32149f0.m32167W(new InterfaceC23492o() { // from class: be5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC45761na4 m74673e;
                    m74673e = C37261Yd5.C9859w.m74673e(Function1.this, obj);
                    return m74673e;
                }
            });
            final C9862c c9862c = new C9862c(scanResult);
            return m32167W.m32208B0(new InterfaceC23492o() { // from class: ce5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C36154Tk5 m74672f;
                    m74672f = C37261Yd5.C9859w.m74672f(Function1.this, obj);
                    return m74672f;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$x */
    /* loaded from: classes4.dex */
    public static final class C9863x extends Lambda implements Function1<VehicleConnection, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ VehicleSpeedMode f46154g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9863x(VehicleSpeedMode vehicleSpeedMode) {
            super(1);
            this.f46154g = vehicleSpeedMode;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.setSpeedMode(this.f46154g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lio/reactivex/B;", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$y */
    /* loaded from: classes4.dex */
    public static final class C9864y extends Lambda implements Function1<VehicleConnection, InterfaceC23434B<? extends Observable<byte[]>>> {

        /* renamed from: g */
        public final /* synthetic */ EnumC41046fd3 f46155g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9864y(EnumC41046fd3 enumC41046fd3) {
            super(1);
            this.f46155g = enumC41046fd3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Observable<byte[]>> invoke(VehicleConnection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.subscribeToNotifications(this.f46155g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "token", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd5$z */
    /* loaded from: classes4.dex */
    public static final class C9865z extends Lambda implements Function1<String, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ Function1<String, AbstractC23461c> f46156g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9865z(Function1<? super String, ? extends AbstractC23461c> function1) {
            super(1);
            this.f46156g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return this.f46156g.invoke(token);
        }
    }

    public C37261Yd5(InterfaceC31654Ae5 rxBleVehicleManager, InterfaceC25136kJ birdBluetoothApiManager, InterfaceC1880Ea analyticsManager, InterfaceC10636aM birdManager) {
        Intrinsics.checkNotNullParameter(rxBleVehicleManager, "rxBleVehicleManager");
        Intrinsics.checkNotNullParameter(birdBluetoothApiManager, "birdBluetoothApiManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        this.f46101a = rxBleVehicleManager;
        this.f46102b = birdBluetoothApiManager;
        this.f46103c = analyticsManager;
        this.f46104d = birdManager;
        this.f46105e = new LruCache<>(5);
        this.f46106f = new LruCache<>(5);
    }

    /* renamed from: A0 */
    public static final InterfaceC23496h m74772A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final InterfaceC23496h m74770B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final InterfaceC23496h m74768C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final InterfaceC23496h m74766D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final InterfaceC23496h m74764E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final InterfaceC23496h m74762F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final InterfaceC45761na4 m74760G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final InterfaceC23496h m74758H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final InterfaceC23434B m74756I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final InterfaceC23496h m74752K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m74750L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final InterfaceC23496h m74748M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final InterfaceC23496h m74744O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m74742P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final InterfaceC23496h m74740Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final InterfaceC23496h m74738R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23496h m74723g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m74722h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC23496h m74721i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final InterfaceC23434B m74719k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m74718l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m74717m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final InterfaceC23434B m74716n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final InterfaceC23447K m74715o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23496h m74714p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final InterfaceC23496h m74712r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final InterfaceC23496h m74711s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m74709u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m74708v0(C37261Yd5 this$0, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m74705y0(z, c4464ky, c38431bE5, num, "abandoned");
    }

    /* renamed from: w0 */
    public static final void m74707w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m74706x0(boolean z, C38431bE5 c38431bE5, C4464KY c4464ky, C37261Yd5 this$0, Integer num) {
        C4464KY m98792a;
        C38431bE5 m64783a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            if (c38431bE5 != null) {
                InterfaceC1880Ea interfaceC1880Ea = this$0.f46103c;
                m64783a = c38431bE5.m64783a((r24 & 1) != 0 ? c38431bE5.f57120a : null, (r24 & 2) != 0 ? c38431bE5.f57121b : null, (r24 & 4) != 0 ? c38431bE5.f57122c : null, (r24 & 8) != 0 ? c38431bE5.f57123d : null, (r24 & 16) != 0 ? c38431bE5.f57124e : null, (r24 & 32) != 0 ? c38431bE5.f57125f : null, (r24 & 64) != 0 ? c38431bE5.f57126g : null, (r24 & 128) != 0 ? c38431bE5.f57127h : null, (r24 & 256) != 0 ? c38431bE5.f57128i : null, (r24 & 512) != 0 ? c38431bE5.f57129j : null, (r24 & 1024) != 0 ? c38431bE5.f57130k : num);
                interfaceC1880Ea.mo55905y(C39024cE5.toSleepEndedEvent$default(m64783a, true, null, 2, null));
            }
        } else if (c4464ky != null) {
            InterfaceC1880Ea interfaceC1880Ea2 = this$0.f46103c;
            m98792a = c4464ky.m98792a((r24 & 1) != 0 ? c4464ky.f19728a : null, (r24 & 2) != 0 ? c4464ky.f19729b : null, (r24 & 4) != 0 ? c4464ky.f19730c : null, (r24 & 8) != 0 ? c4464ky.f19731d : null, (r24 & 16) != 0 ? c4464ky.f19732e : null, (r24 & 32) != 0 ? c4464ky.f19733f : null, (r24 & 64) != 0 ? c4464ky.f19734g : null, (r24 & 128) != 0 ? c4464ky.f19735h : null, (r24 & 256) != 0 ? c4464ky.f19736i : null, (r24 & 512) != 0 ? c4464ky.f19737j : num, (r24 & 1024) != 0 ? c4464ky.f19738k : null);
            interfaceC1880Ea2.mo55905y(C5024LY.toBluetoothWakeEndedEvent$default(m98792a, true, null, 2, null));
        }
    }

    /* renamed from: z0 */
    public static final InterfaceC23496h m74704z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public final AbstractC23461c m74754J0(VehicleConnection vehicleConnection, String str, Function1<? super String, ? extends AbstractC23461c> function1) {
        Observable<String> mo21390Y = this.f46102b.mo21390Y(str, 0);
        final C9865z c9865z = new C9865z(function1);
        AbstractC23461c flatMapCompletable = mo21390Y.flatMapCompletable(new InterfaceC23492o() { // from class: Od5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74752K0;
                m74752K0 = C37261Yd5.m74752K0(Function1.this, obj);
                return m74752K0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "action: (token: String) …    action(token)\n      }");
        return flatMapCompletable;
    }

    /* renamed from: N0 */
    public final AbstractC23461c m74746N0(VehicleDescriptor vehicleDescriptor, LockKind lockKind, boolean z) {
        AbstractC23461c m33084B;
        AbstractC23461c unlock;
        AbstractC23461c flatMapCompletable;
        String serialNumber = vehicleDescriptor.getSerialNumber();
        if (!Intrinsics.areEqual(vehicleDescriptor.getModel(), Bird_Kt.MODEL_BIRD_FLEX) && !Intrinsics.areEqual(vehicleDescriptor.getModel(), Bird_Kt.MODEL_BIRD_BIKE_PAIRABLE) && !Intrinsics.areEqual(vehicleDescriptor.getModel(), Bird_Kt.MODEL_BIRD_B4)) {
            if (serialNumber != null) {
                VehicleConnection vehicleConnection = this.f46105e.get(vehicleDescriptor);
                if (vehicleConnection == null || (flatMapCompletable = m74713q0(vehicleConnection, serialNumber, lockKind, z)) == null) {
                    Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
                    final C9833E c9833e = new C9833E(serialNumber, lockKind, z);
                    flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Wd5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h m74740Q0;
                            m74740Q0 = C37261Yd5.m74740Q0(Function1.this, obj);
                            return m74740Q0;
                        }
                    });
                }
                Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "{\n        vehicleConnect…      }\n        }\n      }");
                return flatMapCompletable;
            }
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalStateException("Bird does not have serial number."));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(IllegalStateExcept…ot have serial number.\"))");
            return m33080F;
        }
        VehicleConnection vehicleConnection2 = this.f46105e.get(vehicleDescriptor);
        if (vehicleConnection2 != null && (unlock = vehicleConnection2.unlock(lockKind, z, "")) != null) {
            m33084B = unlock;
        } else {
            Observable<VehicleConnection> mo15682d2 = mo15682d(vehicleDescriptor);
            final C9831C c9831c = new C9831C(lockKind, z);
            AbstractC23461c m33065U = mo15682d2.flatMapCompletable(new InterfaceC23492o() { // from class: Ud5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m74744O0;
                    m74744O0 = C37261Yd5.m74744O0(Function1.this, obj);
                    return m74744O0;
                }
            }).m33065U(3L);
            final C9832D c9832d = C9832D.f46112g;
            m33084B = m33065U.m33084B(new InterfaceC23484g() { // from class: Vd5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37261Yd5.m74742P0(Function1.this, obj);
                }
            });
        }
        Intrinsics.checkNotNullExpressionValue(m33084B, "{\n        vehicleConnect… { Timber.e(it) }\n      }");
        return m33084B;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: a */
    public AbstractC24490k<C36154Tk5> mo15685a(long j, TimeUnit scanTimeUnit) {
        Intrinsics.checkNotNullParameter(scanTimeUnit, "scanTimeUnit");
        return this.f46101a.mo106812a(j, scanTimeUnit);
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: b */
    public AbstractC23461c mo15684b(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9849m c9849m = C9849m.f46133g;
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Qd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74711s0;
                m74711s0 = C37261Yd5.m74711s0(Function1.this, obj);
                return m74711s0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "connect(vehicleDescripto… it.initiateChallenge() }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: c */
    public List<VehicleConnection> mo15683c() {
        List<VehicleConnection> list;
        list = CollectionsKt___CollectionsKt.toList(this.f46105e.snapshot().values());
        return list;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: d */
    public Observable<VehicleConnection> mo15682d(VehicleDescriptor vehicleDescriptor) {
        InterfaceC44023ke5.EnumC25197a enumC25197a;
        InterfaceC45802ne5 rxBleDevice;
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        VehicleConnection vehicleConnection = this.f46105e.get(vehicleDescriptor);
        if (vehicleConnection != null && (rxBleDevice = vehicleConnection.getRxBleDevice()) != null) {
            enumC25197a = rxBleDevice.mo17283b();
        } else {
            enumC25197a = null;
        }
        if (enumC25197a == InterfaceC44023ke5.EnumC25197a.CONNECTED) {
            Observable<VehicleConnection> just = Observable.just(vehicleConnection);
            Intrinsics.checkNotNullExpressionValue(just, "{\n      Observable.just(connection)\n    }");
            return just;
        }
        AbstractC23442F scan$default = InterfaceC31654Ae5.C0167a.scan$default(this.f46101a, vehicleDescriptor, false, 2, null);
        final C9841f c9841f = C9841f.f46122g;
        Observable m33162D = scan$default.m33162D(new InterfaceC23492o() { // from class: Sd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m74719k0;
                m74719k0 = C37261Yd5.m74719k0(Function1.this, obj);
                return m74719k0;
            }
        });
        final C9842g c9842g = new C9842g(vehicleDescriptor);
        Observable<VehicleConnection> doOnNext = m33162D.doOnNext(new InterfaceC23484g() { // from class: Td5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37261Yd5.m74718l0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun connect(veh…tion)\n        }\n    }\n  }");
        return doOnNext;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: e */
    public AbstractC23461c mo15681e(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        return m74746N0(vehicleDescriptor, LockKind.BATTERY, false);
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: f */
    public AbstractC23461c mo15680f(VehicleDescriptor vehicleDescriptor, byte[] byteArray) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9834F c9834f = new C9834F(byteArray);
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Xd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74738R0;
                m74738R0 = C37261Yd5.m74738R0(Function1.this, obj);
                return m74738R0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "byteArray: ByteArray): C… it.writeRaw(byteArray) }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: g */
    public AbstractC23461c mo15679g(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9854r c9854r = C9854r.f46145g;
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Gd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74770B0;
                m74770B0 = C37261Yd5.m74770B0(Function1.this, obj);
                return m74770B0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "connect(vehicleDescripto…resetServiceIndicator() }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: h */
    public AbstractC23461c mo15678h(VehicleDescriptor descriptor, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC23461c abstractC23461c = null;
        AbstractC23442F scan$default = InterfaceC31654Ae5.C0167a.scan$default(this.f46101a, descriptor, false, 2, null);
        final C9843h c9843h = new C9843h(objectRef);
        AbstractC23442F m33122l = scan$default.m33101w(new InterfaceC23484g() { // from class: xd5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37261Yd5.m74717m0(Function1.this, obj);
            }
        }).m33122l(100L, TimeUnit.MILLISECONDS);
        final C9844i c9844i = C9844i.f46126g;
        Observable m33162D = m33122l.m33162D(new InterfaceC23492o() { // from class: yd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m74716n0;
                m74716n0 = C37261Yd5.m74716n0(Function1.this, obj);
                return m74716n0;
            }
        });
        final C9845j c9845j = new C9845j(z);
        AbstractC23461c m33159G = m33162D.flatMapSingle(new InterfaceC23492o() { // from class: zd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74715o0;
                m74715o0 = C37261Yd5.m74715o0(Function1.this, obj);
                return m74715o0;
            }
        }).firstOrError().m33159G();
        if (z) {
            String birdId = descriptor.getBirdId();
            if (birdId != null) {
                abstractC23461c = this.f46104d.mo71572m1(birdId);
            }
        } else {
            String birdId2 = descriptor.getBirdId();
            if (birdId2 != null) {
                abstractC23461c = this.f46104d.mo71578d1(birdId2);
            }
        }
        AbstractC23461c m33049i = m33159G.m33049i(abstractC23461c);
        Intrinsics.checkNotNullExpressionValue(m33049i, "enabled: Boolean, blueto…dAwake)\n        }\n      )");
        return m74710t0(m33049i, z, c4464ky, c38431bE5, (Integer) objectRef.element);
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: i */
    public AbstractC23461c mo15677i(int i) {
        InterfaceC31654Ae5 interfaceC31654Ae5 = this.f46101a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC24490k<C36154Tk5> mo106812a = interfaceC31654Ae5.mo106812a(30L, timeUnit);
        final C9859w c9859w = new C9859w(i);
        AbstractC23461c m33062Y = AbstractC23461c.m33077I(mo106812a.m32167W(new InterfaceC23492o() { // from class: Rd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m74760G0;
                m74760G0 = C37261Yd5.m74760G0(Function1.this, obj);
                return m74760G0;
            }
        })).m33062Y(AbstractC23461c.m33057c0(30L, timeUnit));
        Intrinsics.checkNotNullExpressionValue(m33062Y, "fromPublisher(vehicleAct…CONDS, TimeUnit.SECONDS))");
        return m33062Y;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: j */
    public Observable<Observable<byte[]>> mo15676j(VehicleDescriptor vehicleDescriptor, EnumC41046fd3 mode) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9864y c9864y = new C9864y(mode);
        Observable flatMap = mo15682d.flatMap(new InterfaceC23492o() { // from class: Ad5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m74756I0;
                m74756I0 = C37261Yd5.m74756I0(Function1.this, obj);
                return m74756I0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "mode: NotificationSetupM…beToNotifications(mode) }");
        return flatMap;
    }

    /* renamed from: j0 */
    public final String m74720j0(Throwable th) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (th instanceof TimeoutException) {
            z = true;
        } else {
            z = th instanceof BleGattCallbackTimeoutException;
        }
        if (z) {
            return "timed_out";
        }
        if (th instanceof RetrofitException) {
            return "network_failure";
        }
        if (th instanceof BleServiceNotFoundException) {
            z2 = true;
        } else {
            z2 = th instanceof BleCharacteristicNotFoundException;
        }
        if (z2) {
            return "invalid_peripheral";
        }
        if (th instanceof BleAdapterDisabledException) {
            return "bluetooth_unavailable";
        }
        if (!(th instanceof BleAlreadyConnectedException)) {
            z3 = th instanceof BleConflictingNotificationAlreadySetException;
        }
        if (z3) {
            return "already_connected";
        }
        if (th instanceof BleDisconnectedException) {
            return "cancelled";
        }
        if (th instanceof BleScanException) {
            return "scan_failure";
        }
        if (th instanceof BleGattCharacteristicException) {
            return "request_write_failure";
        }
        if (th instanceof BleGattException) {
            return "other_ble_gatt_exception";
        }
        if (th instanceof BleException) {
            return "other_ble_exception";
        }
        return LegacyRepairType.OTHER_KEY;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: k */
    public AbstractC23461c mo15675k(VehicleDescriptor vehicleDescriptor) {
        AbstractC23461c flatMapCompletable;
        AbstractC23461c m74754J0;
        AbstractC23461c m33084B;
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        String serialNumber = vehicleDescriptor.getSerialNumber();
        VehicleConnection vehicleConnection = this.f46105e.get(vehicleDescriptor);
        if (Intrinsics.areEqual(vehicleDescriptor.getModel(), Bird_Kt.MODEL_BIRD_FLEX)) {
            if (vehicleConnection == null || (m33084B = vehicleConnection.alarm("")) == null) {
                Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
                final C9836b c9836b = C9836b.f46118g;
                AbstractC23461c m33065U = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: ud5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m74723g0;
                        m74723g0 = C37261Yd5.m74723g0(Function1.this, obj);
                        return m74723g0;
                    }
                }).m33065U(3L);
                final C9837c c9837c = C9837c.f46119g;
                m33084B = m33065U.m33084B(new InterfaceC23484g() { // from class: vd5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C37261Yd5.m74722h0(Function1.this, obj);
                    }
                });
            }
            Intrinsics.checkNotNullExpressionValue(m33084B, "{\n        cachedConnecti… { Timber.e(it) }\n      }");
            return m33084B;
        } else if (serialNumber != null) {
            if (vehicleConnection != null && (m74754J0 = m74754J0(vehicleConnection, serialNumber, new C9838d(vehicleConnection))) != null) {
                flatMapCompletable = m74754J0;
            } else {
                Observable<VehicleConnection> mo15682d2 = mo15682d(vehicleDescriptor);
                final C9839e c9839e = new C9839e(serialNumber);
                flatMapCompletable = mo15682d2.flatMapCompletable(new InterfaceC23492o() { // from class: wd5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m74721i0;
                        m74721i0 = C37261Yd5.m74721i0(Function1.this, obj);
                        return m74721i0;
                    }
                });
            }
            Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "{\n        cachedConnecti…      }\n        }\n      }");
            return flatMapCompletable;
        } else {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalStateException("Bird does not have serial number."));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(IllegalStateExcept…ot have serial number.\"))");
            return m33080F;
        }
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: l */
    public AbstractC23461c mo15674l(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9853q c9853q = C9853q.f46144g;
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Md5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74772A0;
                m74772A0 = C37261Yd5.m74772A0(Function1.this, obj);
                return m74772A0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "connect(vehicleDescripto…ble { it.requestToken() }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: m */
    public AbstractC23461c mo15673m(VehicleDescriptor vehicleDescriptor, byte[] command) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(command, "command");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9857u c9857u = new C9857u(command);
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: sd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74764E0;
                m74764E0 = C37261Yd5.m74764E0(Function1.this, obj);
                return m74764E0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "command: ByteArray): Com…AUpdateCommand(command) }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: n */
    public AbstractC23461c mo15672n(VehicleDescriptor vehicleDescriptor, VehicleSpeedMode speedMode) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(speedMode, "speedMode");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9863x c9863x = new C9863x(speedMode);
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Pd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74758H0;
                m74758H0 = C37261Yd5.m74758H0(Function1.this, obj);
                return m74758H0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "speedMode: VehicleSpeedM…setSpeedMode(speedMode) }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: o */
    public AbstractC23461c mo15671o(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9855s c9855s = C9855s.f46146g;
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Id5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74768C0;
                m74768C0 = C37261Yd5.m74768C0(Function1.this, obj);
                return m74768C0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "connect(vehicleDescripto…it.resetTotalOdometer() }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: p */
    public void mo15670p(VehicleDescriptor vehicleDescriptor, byte[] token) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(token, "token");
        VehicleConnection vehicleConnection = this.f46105e.get(vehicleDescriptor);
        if (vehicleConnection != null) {
            vehicleConnection.setCurrentSessionToken(token);
        }
        this.f46106f.put(vehicleDescriptor, token);
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: q */
    public AbstractC23461c mo15669q(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        return m74746N0(vehicleDescriptor, LockKind.PCM, false);
    }

    /* renamed from: q0 */
    public final AbstractC23461c m74713q0(VehicleConnection vehicleConnection, String str, LockKind lockKind, boolean z) {
        Observable<String> mo21390Y = this.f46102b.mo21390Y(str, 0);
        final C9847l c9847l = new C9847l(vehicleConnection, lockKind, z);
        AbstractC23461c flatMapCompletable = mo21390Y.flatMapCompletable(new InterfaceC23492o() { // from class: Dd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74712r0;
                m74712r0 = C37261Yd5.m74712r0(Function1.this, obj);
                return m74712r0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "VehicleConnection.getTok… { Timber.e(it) }\n      }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: r */
    public AbstractC23461c mo15668r(VehicleDescriptor vehicleDescriptor, boolean z) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9829A c9829a = new C9829A(vehicleDescriptor);
        Observable<VehicleConnection> doOnNext = mo15682d.doOnNext(new InterfaceC23484g() { // from class: Jd5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37261Yd5.m74750L0(Function1.this, obj);
            }
        });
        final C9830B c9830b = new C9830B(z);
        AbstractC23461c flatMapCompletable = doOnNext.flatMapCompletable(new InterfaceC23492o() { // from class: Kd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74748M0;
                m74748M0 = C37261Yd5.m74748M0(Function1.this, obj);
                return m74748M0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun toggleLight…gleLights(lightsOn) }\n  }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: s */
    public AbstractC23442F<byte[]> mo15667s(VehicleDescriptor vehicleDescriptor, byte[] data) {
        BlePayloadEncryptor bluetoothEncryptor;
        AbstractC23442F<byte[]> decrypt;
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        VehicleConnection vehicleConnection = this.f46105e.get(vehicleDescriptor);
        if (vehicleConnection == null || (bluetoothEncryptor = vehicleConnection.getBluetoothEncryptor()) == null || (decrypt = bluetoothEncryptor.decrypt(data, vehicleDescriptor.getMacAddress())) == null) {
            AbstractC23442F<byte[]> m33158H = AbstractC23442F.m33158H(data);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(data)");
            return m33158H;
        }
        return decrypt;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: t */
    public AbstractC23461c mo15666t(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9846k c9846k = C9846k.f46128g;
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: td5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74714p0;
                m74714p0 = C37261Yd5.m74714p0(Function1.this, obj);
                return m74714p0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "connect(vehicleDescripto… { it.firmwareInquiry() }");
        return flatMapCompletable;
    }

    /* renamed from: t0 */
    public final AbstractC23461c m74710t0(AbstractC23461c abstractC23461c, final boolean z, final C4464KY c4464ky, final C38431bE5 c38431bE5, final Integer num) {
        final C9850n c9850n = new C9850n(c4464ky, c38431bE5, z, this);
        AbstractC23461c m33029z = abstractC23461c.m33081E(new InterfaceC23484g() { // from class: Bd5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37261Yd5.m74707w0(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: Cd5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C37261Yd5.m74706x0(z, c38431bE5, c4464ky, this, num);
            }
        });
        final C9851o c9851o = new C9851o(z, c4464ky, c38431bE5, num);
        AbstractC23461c m33085A = m33029z.m33084B(new InterfaceC23484g() { // from class: Ed5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37261Yd5.m74709u0(Function1.this, obj);
            }
        }).m33085A(new InterfaceC23478a() { // from class: Fd5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C37261Yd5.m74708v0(C37261Yd5.this, z, c4464ky, c38431bE5, num);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33085A, "private fun Completable.…CEPTION_TYPE)\n      }\n  }");
        return m33085A;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: u */
    public AbstractC23461c mo15665u(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9856t c9856t = C9856t.f46147g;
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Ld5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74766D0;
                m74766D0 = C37261Yd5.m74766D0(Function1.this, obj);
                return m74766D0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "connect(vehicleDescripto… it.resetTripOdometer() }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: v */
    public AbstractC23461c mo15664v(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9852p c9852p = C9852p.f46143g;
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Hd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74704z0;
                m74704z0 = C37261Yd5.m74704z0(Function1.this, obj);
                return m74704z0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "connect(vehicleDescripto…le { it.refreshStatus() }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: w */
    public AbstractC23461c mo15663w(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        return m74746N0(vehicleDescriptor, LockKind.CABLE, false);
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: x */
    public AbstractC23461c mo15662x(VehicleDescriptor vehicleDescriptor, String passcode) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        Observable<VehicleConnection> mo15682d = mo15682d(vehicleDescriptor);
        final C9858v c9858v = new C9858v(passcode);
        AbstractC23461c flatMapCompletable = mo15682d.flatMapCompletable(new InterfaceC23492o() { // from class: Nd5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74762F0;
                m74762F0 = C37261Yd5.m74762F0(Function1.this, obj);
                return m74762F0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "passcode: String): Compl….sendPasscode(passcode) }");
        return flatMapCompletable;
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: y */
    public AbstractC23461c mo15661y(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        return m74746N0(vehicleDescriptor, LockKind.BASKET_HELMET, false);
    }

    /* renamed from: y0 */
    public final void m74705y0(boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, Integer num, String str) {
        C4464KY m98792a;
        C38431bE5 m64783a;
        if (z) {
            if (c38431bE5 != null) {
                InterfaceC1880Ea interfaceC1880Ea = this.f46103c;
                m64783a = c38431bE5.m64783a((r24 & 1) != 0 ? c38431bE5.f57120a : null, (r24 & 2) != 0 ? c38431bE5.f57121b : null, (r24 & 4) != 0 ? c38431bE5.f57122c : null, (r24 & 8) != 0 ? c38431bE5.f57123d : null, (r24 & 16) != 0 ? c38431bE5.f57124e : null, (r24 & 32) != 0 ? c38431bE5.f57125f : null, (r24 & 64) != 0 ? c38431bE5.f57126g : null, (r24 & 128) != 0 ? c38431bE5.f57127h : null, (r24 & 256) != 0 ? c38431bE5.f57128i : null, (r24 & 512) != 0 ? c38431bE5.f57129j : null, (r24 & 1024) != 0 ? c38431bE5.f57130k : num);
                interfaceC1880Ea.mo55905y(C39024cE5.m61649a(m64783a, false, str));
            }
        } else if (c4464ky != null) {
            InterfaceC1880Ea interfaceC1880Ea2 = this.f46103c;
            m98792a = c4464ky.m98792a((r24 & 1) != 0 ? c4464ky.f19728a : null, (r24 & 2) != 0 ? c4464ky.f19729b : null, (r24 & 4) != 0 ? c4464ky.f19730c : null, (r24 & 8) != 0 ? c4464ky.f19731d : null, (r24 & 16) != 0 ? c4464ky.f19732e : null, (r24 & 32) != 0 ? c4464ky.f19733f : null, (r24 & 64) != 0 ? c4464ky.f19734g : null, (r24 & 128) != 0 ? c4464ky.f19735h : null, (r24 & 256) != 0 ? c4464ky.f19736i : null, (r24 & 512) != 0 ? c4464ky.f19737j : num, (r24 & 1024) != 0 ? c4464ky.f19738k : null);
            interfaceC1880Ea2.mo55905y(C5024LY.m96660a(m98792a, false, str));
        }
    }

    @Override // p000.InterfaceC48164rd5
    /* renamed from: z */
    public AbstractC23461c mo15660z(VehicleDescriptor vehicleDescriptor) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "vehicleDescriptor");
        return m74746N0(vehicleDescriptor, LockKind.PCM, true);
    }
}
