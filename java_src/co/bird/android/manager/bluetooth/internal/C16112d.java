package co.bird.android.manager.bluetooth.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.bluetooth.internal.C16112d;
import co.bird.android.manager.bluetooth.internal.VehicleException;
import co.bird.android.model.AlarmType;
import co.bird.android.model.Command;
import co.bird.android.model.GattUuid;
import co.bird.android.model.Vehicle;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010H\u001a\u00020F\u0012\u0006\u0010K\u001a\u00020I¢\u0006\u0004\bj\u0010kJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001b\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ1\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0018\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\fH\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u001dH\u0016J&\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0016J\u0019\u00104\u001a\u0004\u0018\u00010\b2\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b4\u00105J;\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u00107\u001a\u0002062\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b<\u0010=J/\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u00103\u001a\u0002022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020\u0006H\u0016J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010C\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010MR\u001c\u0010R\u001a\n P*\u0004\u0018\u00010O0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010TR\"\u0010X\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u00020\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010WR.\u0010[\u001a\u001c\u0012\u0004\u0012\u000202\u0012\u0012\u0012\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u00020\u00020V0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR.\u0010\\\u001a\u001c\u0012\u0004\u0012\u000202\u0012\u0012\u0012\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u00020\u00020V0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010ZR\u0016\u0010^\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010]R$\u0010_\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u00060\u00060V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010WR\"\u0010b\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u00060\u00060`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010fR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010h¨\u0006l"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/d;", "Lsm6;", "Lco/bird/android/model/Vehicle;", "vehicle", "", "msg", "", "G0", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "r0", "(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)V", "", "status", "s0", "(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;I)V", "t0", "Landroid/bluetooth/BluetoothGatt;", "gatt", "Lio/reactivex/H;", "emitter", "v0", "(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;ILio/reactivex/H;)V", "newState", AbstractC26684u0.f100690q, "Lio/reactivex/Observable;", "p", "Lio/reactivex/F;", "i", "", C17296a.f69688o, "s", "b", "o", "lightOn", "c", "q", "minutes", "n", "f", "r", "j", "Lco/bird/android/model/AlarmType;", "type", "h", "enabled", "m", "ecuType", "maxSpeed", "g", "Lco/bird/android/model/GattUuid;", "uuid", "d0", "(Lco/bird/android/model/GattUuid;)Landroid/bluetooth/BluetoothGattCharacteristic;", "Lco/bird/android/model/Command;", "command", "", MessageExtension.FIELD_DATA, "", "retryCount", "J0", "(Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;J)Lio/reactivex/F;", "y0", "(Lco/bird/android/model/GattUuid;Lco/bird/android/model/Vehicle;J)Lio/reactivex/F;", "release", "Lco/bird/android/model/Vehicle$ConnectionState;", "e", DateTokenConverter.CONVERTER_KEY, "k", "l", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LaY;", "LaY;", "scheduler", "Landroid/bluetooth/BluetoothManager;", "Landroid/bluetooth/BluetoothManager;", "manager", "Landroid/bluetooth/BluetoothAdapter;", "kotlin.jvm.PlatformType", "Landroid/bluetooth/BluetoothAdapter;", "adapter", "Landroid/bluetooth/BluetoothGattService;", "Landroid/bluetooth/BluetoothGattService;", "birdService", "Lio/reactivex/subjects/a;", "Lio/reactivex/subjects/a;", "vehicleSubject", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "gattSubjects", "notificationSubjects", "Z", "connecting", "disconnectingSubject", "Lio/reactivex/subjects/d;", "Lio/reactivex/subjects/d;", "disconnectedSubject", "", "Ljava/lang/Object;", "lock", "Landroid/bluetooth/BluetoothGatt;", "Ljava/util/concurrent/Semaphore;", "Ljava/util/concurrent/Semaphore;", "bluetoothLock", "<init>", "(Landroid/content/Context;LaY;)V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/VehicleManagerImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ThreadSafeUtility.kt\nco/bird/android/manager/bluetooth/internal/ThreadSafeUtilityKt\n*L\n1#1,550:1\n8676#2,2:551\n9358#2,4:553\n8676#2,2:557\n9358#2,4:559\n288#3,2:563\n288#3,2:565\n288#3,2:572\n35#4,5:567\n*S KotlinDebug\n*F\n+ 1 VehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/VehicleManagerImpl\n*L\n61#1:551,2\n61#1:553,4\n64#1:557,2\n64#1:559,4\n136#1:563,2\n431#1:565,2\n530#1:572,2\n507#1:567,5\n*E\n"})
/* renamed from: co.bird.android.manager.bluetooth.internal.d */
/* loaded from: classes4.dex */
public final class C16112d implements InterfaceC48847sm6 {

    /* renamed from: o */
    public static final C16113a f66283o = new C16113a(null);

    /* renamed from: p */
    public static final UUID f66284p = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: a */
    public final Context f66285a;

    /* renamed from: b */
    public final InterfaceC10732aY f66286b;

    /* renamed from: c */
    public final BluetoothManager f66287c;

    /* renamed from: d */
    public final BluetoothAdapter f66288d;

    /* renamed from: e */
    public BluetoothGattService f66289e;

    /* renamed from: f */
    public final C24552a<Vehicle> f66290f;

    /* renamed from: g */
    public final ConcurrentHashMap<GattUuid, C24552a<Vehicle>> f66291g;

    /* renamed from: h */
    public final ConcurrentHashMap<GattUuid, C24552a<Vehicle>> f66292h;

    /* renamed from: i */
    public volatile boolean f66293i;

    /* renamed from: j */
    public C24552a<Unit> f66294j;

    /* renamed from: k */
    public final C24558d<Unit> f66295k;

    /* renamed from: l */
    public final Object f66296l;

    /* renamed from: m */
    public BluetoothGatt f66297m;

    /* renamed from: n */
    public final Semaphore f66298n;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/d$a;", "", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "NOTIFY_UUID", "Ljava/util/UUID;", C17296a.f69688o, "()Ljava/util/UUID;", "", "DELAY_DISCONNECT_MILLIS", "I", "DELAY_READ_MILLIS", "DELAY_WRITE_MILLIS", "", "RETRY_READ_ATTEMPTS", "J", "RETRY_WRITE_ATTEMPTS", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$a */
    /* loaded from: classes4.dex */
    public static final class C16113a {
        public /* synthetic */ C16113a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UUID m55746a() {
            return C16112d.f66284p;
        }

        private C16113a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16114b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GattUuid.values().length];
            try {
                iArr[GattUuid.AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GattUuid.LOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlarmType.values().length];
            try {
                iArr2[AlarmType.CHIRP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AlarmType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlarmType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Command;", "command", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Command;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$c */
    /* loaded from: classes4.dex */
    public static final class C16115c extends Lambda implements Function1<Command, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66300h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16115c(Vehicle vehicle) {
            super(1);
            this.f66300h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Command command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return C16112d.write$bluetooth_release$default(C16112d.this, command, null, this.f66300h, 0L, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$d */
    /* loaded from: classes4.dex */
    public static final class C16116d extends Lambda implements Function1<byte[], InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66302h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16116d(Vehicle vehicle) {
            super(1);
            this.f66302h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Vehicle> invoke(byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.write$bluetooth_release$default(C16112d.this, Command.AUTH, it, this.f66302h, 0L, 8, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$e */
    /* loaded from: classes4.dex */
    public static final class C16117e extends Lambda implements Function1<Vehicle, Vehicle> {

        /* renamed from: g */
        public final /* synthetic */ Vehicle f66303g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16117e(Vehicle vehicle) {
            super(1);
            this.f66303g = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Vehicle invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getAuthenticated()) {
                return this.f66303g;
            }
            throw new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, it.toString(), 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/Vehicle;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$f */
    /* loaded from: classes4.dex */
    public static final class C16118f extends Lambda implements Function1<InterfaceC23444H<Vehicle>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66305h;

        @Metadata(m28433d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, m28432d2 = {"co/bird/android/manager/bluetooth/internal/d$f$a", "Landroid/bluetooth/BluetoothGattCallback;", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", "status", "newState", "", "onConnectionStateChange", "onServicesDiscovered", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "onCharacteristicRead", "onCharacteristicChanged", "onCharacteristicWrite", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.bluetooth.internal.d$f$a */
        /* loaded from: classes4.dex */
        public static final class C16119a extends BluetoothGattCallback {

            /* renamed from: a */
            public final /* synthetic */ C16112d f66306a;

            /* renamed from: b */
            public final /* synthetic */ Vehicle f66307b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC23444H<Vehicle> f66308c;

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.manager.bluetooth.internal.d$f$a$a */
            /* loaded from: classes4.dex */
            public static final class C16120a extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C16112d f66309g;

                /* renamed from: h */
                public final /* synthetic */ Vehicle f66310h;

                /* renamed from: i */
                public final /* synthetic */ BluetoothGattCharacteristic f66311i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16120a(C16112d c16112d, Vehicle vehicle, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                    super(0);
                    this.f66309g = c16112d;
                    this.f66310h = vehicle;
                    this.f66311i = bluetoothGattCharacteristic;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f66309g.m55762r0(this.f66310h, this.f66311i);
                }
            }

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.manager.bluetooth.internal.d$f$a$b */
            /* loaded from: classes4.dex */
            public static final class C16121b extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C16112d f66312g;

                /* renamed from: h */
                public final /* synthetic */ Vehicle f66313h;

                /* renamed from: i */
                public final /* synthetic */ BluetoothGattCharacteristic f66314i;

                /* renamed from: j */
                public final /* synthetic */ int f66315j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16121b(C16112d c16112d, Vehicle vehicle, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                    super(0);
                    this.f66312g = c16112d;
                    this.f66313h = vehicle;
                    this.f66314i = bluetoothGattCharacteristic;
                    this.f66315j = i;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f66312g.m55761s0(this.f66313h, this.f66314i, this.f66315j);
                }
            }

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.manager.bluetooth.internal.d$f$a$c */
            /* loaded from: classes4.dex */
            public static final class C16122c extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C16112d f66316g;

                /* renamed from: h */
                public final /* synthetic */ Vehicle f66317h;

                /* renamed from: i */
                public final /* synthetic */ BluetoothGattCharacteristic f66318i;

                /* renamed from: j */
                public final /* synthetic */ int f66319j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16122c(C16112d c16112d, Vehicle vehicle, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                    super(0);
                    this.f66316g = c16112d;
                    this.f66317h = vehicle;
                    this.f66318i = bluetoothGattCharacteristic;
                    this.f66319j = i;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f66316g.m55759t0(this.f66317h, this.f66318i, this.f66319j);
                }
            }

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.manager.bluetooth.internal.d$f$a$d */
            /* loaded from: classes4.dex */
            public static final class C16123d extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C16112d f66320g;

                /* renamed from: h */
                public final /* synthetic */ Vehicle f66321h;

                /* renamed from: i */
                public final /* synthetic */ BluetoothGatt f66322i;

                /* renamed from: j */
                public final /* synthetic */ int f66323j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC23444H<Vehicle> f66324k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16123d(C16112d c16112d, Vehicle vehicle, BluetoothGatt bluetoothGatt, int i, InterfaceC23444H<Vehicle> interfaceC23444H) {
                    super(0);
                    this.f66320g = c16112d;
                    this.f66321h = vehicle;
                    this.f66322i = bluetoothGatt;
                    this.f66323j = i;
                    this.f66324k = interfaceC23444H;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f66320g.m55757u0(this.f66321h, this.f66322i, this.f66323j, this.f66324k);
                }
            }

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.manager.bluetooth.internal.d$f$a$e */
            /* loaded from: classes4.dex */
            public static final class C16124e extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C16112d f66325g;

                /* renamed from: h */
                public final /* synthetic */ Vehicle f66326h;

                /* renamed from: i */
                public final /* synthetic */ BluetoothGatt f66327i;

                /* renamed from: j */
                public final /* synthetic */ int f66328j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC23444H<Vehicle> f66329k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16124e(C16112d c16112d, Vehicle vehicle, BluetoothGatt bluetoothGatt, int i, InterfaceC23444H<Vehicle> interfaceC23444H) {
                    super(0);
                    this.f66325g = c16112d;
                    this.f66326h = vehicle;
                    this.f66327i = bluetoothGatt;
                    this.f66328j = i;
                    this.f66329k = interfaceC23444H;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f66325g.m55755v0(this.f66326h, this.f66327i, this.f66328j, this.f66329k);
                }
            }

            public C16119a(C16112d c16112d, Vehicle vehicle, InterfaceC23444H<Vehicle> interfaceC23444H) {
                this.f66306a = c16112d;
                this.f66307b = vehicle;
                this.f66308c = interfaceC23444H;
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                this.f66306a.f66286b.mo44186b(new C16120a(this.f66306a, this.f66307b, characteristic));
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int i) {
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                this.f66306a.f66286b.mo44186b(new C16121b(this.f66306a, this.f66307b, characteristic, i));
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int i) {
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                this.f66306a.f66286b.mo44186b(new C16122c(this.f66306a, this.f66307b, characteristic, i));
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt gatt, int i, int i2) {
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                this.f66306a.f66286b.mo44186b(new C16123d(this.f66306a, this.f66307b, gatt, i2, this.f66308c));
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt gatt, int i) {
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                this.f66306a.f66286b.mo44186b(new C16124e(this.f66306a, this.f66307b, gatt, i, this.f66308c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16118f(Vehicle vehicle) {
            super(1);
            this.f66305h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Vehicle> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<Vehicle> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C16112d.this.m55804G0(this.f66305h, "connect");
            if (C16112d.this.f66294j.m31919i()) {
                emitter.onError(new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, null, 6, null));
                return;
            }
            BluetoothDevice remoteDevice = C16112d.this.f66288d.getRemoteDevice(this.f66305h.getDevice().getAddress());
            if (remoteDevice == null) {
                emitter.onError(new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, null, 6, null));
                return;
            }
            C16119a c16119a = new C16119a(C16112d.this, this.f66305h, emitter);
            C16112d.this.f66293i = true;
            Object obj = C16112d.this.f66296l;
            C16112d c16112d = C16112d.this;
            synchronized (obj) {
                c16112d.f66297m = remoteDevice.connectGatt(c16112d.f66285a, false, c16119a);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$g */
    /* loaded from: classes4.dex */
    public static final class C16125g extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66331h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16125g(Vehicle vehicle) {
            super(1);
            this.f66331h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Vehicle> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.write$bluetooth_release$default(C16112d.this, Command.DISCONNECT, null, this.f66331h, 0L, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$h */
    /* loaded from: classes4.dex */
    public static final class C16126h extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Boolean>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66333h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16126h(Vehicle vehicle) {
            super(1);
            this.f66333h = vehicle;
        }

        /* renamed from: c */
        public static final Boolean m55741c(C16112d this$0, Vehicle vehicle) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
            synchronized (this$0.f66296l) {
                BluetoothGatt bluetoothGatt = this$0.f66297m;
                if (bluetoothGatt != null) {
                    this$0.m55804G0(vehicle, "disconnect: gatt.disconnect()");
                    bluetoothGatt.disconnect();
                    C3157HY.m103788b(500);
                    bluetoothGatt.close();
                    this$0.m55804G0(vehicle, "disconnect: gatt.close()");
                }
                this$0.f66297m = null;
                bool = Boolean.TRUE;
            }
            return bool;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Boolean> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final C16112d c16112d = C16112d.this;
            final Vehicle vehicle = this.f66333h;
            return AbstractC23442F.m33161E(new Callable() { // from class: Ym6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean m55741c;
                    m55741c = C16112d.C16126h.m55741c(C16112d.this, vehicle);
                    return m55741c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Command;", "command", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Command;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$i */
    /* loaded from: classes4.dex */
    public static final class C16127i extends Lambda implements Function1<Command, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66335h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16127i(Vehicle vehicle) {
            super(1);
            this.f66335h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Command command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return C16112d.write$bluetooth_release$default(C16112d.this, command, null, this.f66335h, 0L, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Command;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$j */
    /* loaded from: classes4.dex */
    public static final class C16128j extends Lambda implements Function1<Pair<? extends Command, ? extends byte[]>, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66337h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16128j(Vehicle vehicle) {
            super(1);
            this.f66337h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Pair<? extends Command, byte[]> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C16112d.write$bluetooth_release$default(C16112d.this, pair.component1(), pair.component2(), this.f66337h, 0L, 8, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$k */
    /* loaded from: classes4.dex */
    public static final class C16129k extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66339h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16129k(Vehicle vehicle) {
            super(1);
            this.f66339h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.read$bluetooth_release$default(C16112d.this, GattUuid.LOCK, this.f66339h, 0L, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$l */
    /* loaded from: classes4.dex */
    public static final class C16130l extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66341h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16130l(Vehicle vehicle) {
            super(1);
            this.f66341h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.read$bluetooth_release$default(C16112d.this, GattUuid.ENERGY_MODE, this.f66341h, 0L, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Command;", "command", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Command;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$m */
    /* loaded from: classes4.dex */
    public static final class C16131m extends Lambda implements Function1<Command, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66343h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16131m(Vehicle vehicle) {
            super(1);
            this.f66343h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Command command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return C16112d.write$bluetooth_release$default(C16112d.this, command, null, this.f66343h, 0L, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$n */
    /* loaded from: classes4.dex */
    public static final class C16132n extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66345h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16132n(Vehicle vehicle) {
            super(1);
            this.f66345h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Vehicle> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.write$bluetooth_release$default(C16112d.this, Command.LOCK, null, this.f66345h, 0L, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$o */
    /* loaded from: classes4.dex */
    public static final class C16133o extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC23444H<Vehicle> f66346g;

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66347h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16133o(InterfaceC23444H<Vehicle> interfaceC23444H, Vehicle vehicle) {
            super(1);
            this.f66346g = interfaceC23444H;
            this.f66347h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            Vehicle copy;
            InterfaceC23444H<Vehicle> interfaceC23444H = this.f66346g;
            copy = r2.copy((r35 & 1) != 0 ? r2.device : null, (r35 & 2) != 0 ? r2.bird : null, (r35 & 4) != 0 ? r2.battery : 0, (r35 & 8) != 0 ? r2.distance : 0, (r35 & 16) != 0 ? r2.locked : false, (r35 & 32) != 0 ? r2.energyMode : null, (r35 & 64) != 0 ? r2.authenticated : false, (r35 & 128) != 0 ? r2.connected : true, (r35 & 256) != 0 ? r2.rxDevice : null, (r35 & 512) != 0 ? r2.rssi : null, (r35 & 1024) != 0 ? r2.beaconHash : null, (r35 & 2048) != 0 ? r2.proximityUUID : null, (r35 & 4096) != 0 ? r2.imei : null, (r35 & 8192) != 0 ? r2.serialNumber : null, (r35 & 16384) != 0 ? r2.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.fault : null, (r35 & 65536) != 0 ? this.f66347h.vehicleVersion : null);
            interfaceC23444H.onSuccess(copy);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$p */
    /* loaded from: classes4.dex */
    public static final class C16134p extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ GattUuid f66349h;

        /* renamed from: i */
        public final /* synthetic */ Vehicle f66350i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16134p(GattUuid gattUuid, Vehicle vehicle) {
            super(1);
            this.f66349h = gattUuid;
            this.f66350i = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Boolean result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.booleanValue()) {
                C24552a c24552a = (C24552a) C16112d.this.f66291g.get(this.f66349h);
                if (c24552a != null) {
                    return c24552a.singleOrError();
                }
                return null;
            }
            C16112d c16112d = C16112d.this;
            Vehicle vehicle = this.f66350i;
            GattUuid gattUuid = this.f66349h;
            c16112d.m55804G0(vehicle, "read: " + gattUuid + " failed, retry...");
            VehicleException.EnumC16097a enumC16097a = VehicleException.EnumC16097a.READ;
            GattUuid gattUuid2 = this.f66349h;
            return AbstractC23442F.m33100x(new VehicleException(enumC16097a, null, "Failed to read " + gattUuid2, 2, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$q */
    /* loaded from: classes4.dex */
    public static final class C16135q extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66352h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16135q(Vehicle vehicle) {
            super(1);
            this.f66352h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.read$bluetooth_release$default(C16112d.this, GattUuid.ICCID, this.f66352h, 0L, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$r */
    /* loaded from: classes4.dex */
    public static final class C16136r extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66354h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16136r(Vehicle vehicle) {
            super(1);
            this.f66354h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.read$bluetooth_release$default(C16112d.this, GattUuid.STM, this.f66354h, 0L, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$s */
    /* loaded from: classes4.dex */
    public static final class C16137s extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66356h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16137s(Vehicle vehicle) {
            super(1);
            this.f66356h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16112d.read$bluetooth_release$default(C16112d.this, GattUuid.FAULT, this.f66356h, 0L, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Command;", "command", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Command;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$t */
    /* loaded from: classes4.dex */
    public static final class C16138t extends Lambda implements Function1<Command, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66358h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16138t(Vehicle vehicle) {
            super(1);
            this.f66358h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Command command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return C16112d.write$bluetooth_release$default(C16112d.this, command, null, this.f66358h, 0L, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Command;", "command", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Command;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$u */
    /* loaded from: classes4.dex */
    public static final class C16139u extends Lambda implements Function1<Command, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66360h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16139u(Vehicle vehicle) {
            super(1);
            this.f66360h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Command command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return C16112d.write$bluetooth_release$default(C16112d.this, command, null, this.f66360h, 0L, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.d$v */
    /* loaded from: classes4.dex */
    public static final class C16140v extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: g */
        public final /* synthetic */ Command f66361g;

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66362h;

        /* renamed from: i */
        public final /* synthetic */ C16112d f66363i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.manager.bluetooth.internal.d$v$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C16141a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Command.values().length];
                try {
                    iArr[Command.AUTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Command.LOCK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Command.UNLOCK_LIGHT_OFF.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Command.UNLOCK_LIGHT_ON.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Command.LIGHT_ON.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Command.LIGHT_OFF.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Command.ALARM_CHIRP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Command.ALARM_SHORT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Command.ALARM_LONG.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Command.DEEP_SLEEP_ON.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Command.DEEP_SLEEP_OFF.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Command.MAX_SPEED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Command.RENTAL_MODE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Command.RETAIL_MODE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Command.SOFT_RESET.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Command.FLASH_LIGHTS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16140v(Command command, Vehicle vehicle, C16112d c16112d) {
            super(1);
            this.f66361g = command;
            this.f66362h = vehicle;
            this.f66363i = c16112d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Boolean result) {
            Observable error;
            Intrinsics.checkNotNullParameter(result, "result");
            if (this.f66361g == Command.DISCONNECT) {
                error = Observable.just(this.f66362h);
            } else if (result.booleanValue()) {
                switch (C16141a.$EnumSwitchMapping$0[this.f66361g.ordinal()]) {
                    case 1:
                        Object obj = this.f66363i.f66292h.get(GattUuid.AUTH);
                        Intrinsics.checkNotNull(obj);
                        error = (Observable) obj;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        Object obj2 = this.f66363i.f66292h.get(GattUuid.LOCK);
                        Intrinsics.checkNotNull(obj2);
                        error = (Observable) obj2;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        error = Observable.just(this.f66362h);
                        break;
                    default:
                        error = Observable.error(new Throwable("Unknown bluetooth command."));
                        break;
                }
            } else {
                C16112d c16112d = this.f66363i;
                Vehicle vehicle = this.f66362h;
                Command command = this.f66361g;
                c16112d.m55804G0(vehicle, "write: " + command + " failed, retry...");
                VehicleException.EnumC16097a enumC16097a = VehicleException.EnumC16097a.WRITE;
                Command command2 = this.f66361g;
                error = Observable.error(new VehicleException(enumC16097a, null, "Failed to write " + command2, 2, null));
            }
            Intrinsics.checkNotNullExpressionValue(error, "if (command == Command.D…ite $command\"))\n        }");
            return error.singleOrError();
        }
    }

    public C16112d(Context context, InterfaceC10732aY scheduler) {
        int mapCapacity;
        int coerceAtLeast;
        int mapCapacity2;
        int coerceAtLeast2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f66285a = context;
        this.f66286b = scheduler;
        Object systemService = context.getSystemService("bluetooth");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothManager bluetoothManager = (BluetoothManager) systemService;
        this.f66287c = bluetoothManager;
        this.f66288d = bluetoothManager.getAdapter();
        C24552a<Vehicle> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Vehicle>()");
        this.f66290f = m31922e;
        GattUuid[] values = GattUuid.Companion.getValues();
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (GattUuid gattUuid : values) {
            Pair pair = new Pair(gattUuid, C24552a.m31922e());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.f66291g = C3157HY.m103786d(linkedHashMap);
        GattUuid[] values2 = GattUuid.Companion.getValues();
        mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(values2.length);
        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(mapCapacity2, 16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(coerceAtLeast2);
        for (GattUuid gattUuid2 : values2) {
            Pair pair2 = new Pair(gattUuid2, C24552a.m31922e());
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        this.f66292h = C3157HY.m103786d(linkedHashMap2);
        C24552a<Unit> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Unit>()");
        this.f66294j = m31922e2;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f66295k = m31902e;
        this.f66296l = new Object();
        this.f66298n = new Semaphore(1);
    }

    /* renamed from: A0 */
    public static final InterfaceC23447K m55816A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final InterfaceC23447K m55814B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final InterfaceC23447K m55812C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final InterfaceC23447K m55810D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final Command m55808E0() {
        return Command.SOFT_RESET;
    }

    /* renamed from: F0 */
    public static final InterfaceC23447K m55806F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final Command m55802H0(Vehicle vehicle, C16112d this$0, boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (vehicle.getAuthenticated()) {
            this$0.f66292h.put(GattUuid.LOCK, C24552a.m31922e());
            if (z) {
                return Command.UNLOCK_LIGHT_ON;
            }
            return Command.UNLOCK_LIGHT_OFF;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: I0 */
    public static final InterfaceC23447K m55800I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final Boolean m55796K0(C16112d this$0, Vehicle vehicle, Command command, byte[] bArr) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        Intrinsics.checkNotNullParameter(command, "$command");
        this$0.m55804G0(vehicle, "write: " + command);
        C3157HY.m103788b(100);
        synchronized (this$0.f66296l) {
            BluetoothGattCharacteristic m55776d0 = this$0.m55776d0(GattUuid.COMMAND);
            BluetoothGatt bluetoothGatt = this$0.f66297m;
            if (bluetoothGatt != null) {
                Intrinsics.checkNotNull(m55776d0);
                bool = Boolean.valueOf(C16109b.m55821c(bluetoothGatt, m55776d0, command, bArr));
            } else {
                bool = null;
            }
        }
        return bool;
    }

    /* renamed from: L0 */
    public static final InterfaceC23447K m55794L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final Command m55781Y(AlarmType type) {
        Intrinsics.checkNotNullParameter(type, "$type");
        int i = C16114b.$EnumSwitchMapping$1[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Command.ALARM_LONG;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Command.ALARM_SHORT;
        }
        return Command.ALARM_CHIRP;
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m55780Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final byte[] m55779a0(C16112d this$0, Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        if (!this$0.f66294j.m31919i()) {
            this$0.f66292h.put(GattUuid.AUTH, C24552a.m31922e());
            String token = vehicle.getBird().getToken();
            Intrinsics.checkNotNull(token);
            return Base64.decode(token, 0);
        }
        throw new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, null, 6, null);
    }

    /* renamed from: b0 */
    public static final InterfaceC23447K m55778b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final Vehicle m55777c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Vehicle) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final Unit m55775e0(C16112d this$0, Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        this$0.f66293i = false;
        this$0.m55804G0(vehicle, "disconnect");
        C24552a<Unit> c24552a = this$0.f66294j;
        Unit unit = Unit.INSTANCE;
        c24552a.onNext(unit);
        return unit;
    }

    /* renamed from: f0 */
    public static final InterfaceC23447K m55774f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23447K m55773g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final Command m55772h0(boolean z) {
        if (z) {
            return Command.DEEP_SLEEP_ON;
        }
        return Command.DEEP_SLEEP_OFF;
    }

    /* renamed from: i0 */
    public static final InterfaceC23447K m55771i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final Pair m55770j0(Vehicle vehicle, int i) {
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        if (vehicle.getAuthenticated()) {
            return TuplesKt.m28425to(Command.FLASH_LIGHTS, new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i});
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: k0 */
    public static final InterfaceC23447K m55769k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final InterfaceC23447K m55768l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final InterfaceC23447K m55767m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final Command m55766n0(Vehicle vehicle, boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        if (vehicle.getAuthenticated()) {
            if (z) {
                return Command.LIGHT_ON;
            }
            return Command.LIGHT_OFF;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: o0 */
    public static final InterfaceC23447K m55765o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final Unit m55764p0(Vehicle vehicle, C16112d this$0) {
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (vehicle.getAuthenticated()) {
            this$0.f66292h.put(GattUuid.LOCK, C24552a.m31922e());
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: q0 */
    public static final InterfaceC23447K m55763q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    public static /* synthetic */ AbstractC23442F read$bluetooth_release$default(C16112d c16112d, GattUuid gattUuid, Vehicle vehicle, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 3;
        }
        return c16112d.m55749y0(gattUuid, vehicle, j);
    }

    /* renamed from: w0 */
    public static final Unit m55753w0(C16112d this$0, Vehicle this_onServicesDiscovered, BluetoothGatt gatt, BluetoothGattService service) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_onServicesDiscovered, "$this_onServicesDiscovered");
        Intrinsics.checkNotNullParameter(gatt, "$gatt");
        Intrinsics.checkNotNullParameter(service, "$service");
        this$0.m55804G0(this_onServicesDiscovered, "onDiscovered");
        synchronized (this$0.f66296l) {
            C16109b.m55823a(gatt, service);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AbstractC23442F write$bluetooth_release$default(C16112d c16112d, Command command, byte[] bArr, Vehicle vehicle, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        byte[] bArr2 = bArr;
        if ((i & 8) != 0) {
            j = 3;
        }
        return c16112d.m55798J0(command, bArr2, vehicle, j);
    }

    /* renamed from: x0 */
    public static final void m55751x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final Boolean m55747z0(C16112d this$0, Vehicle vehicle, GattUuid uuid) {
        Boolean valueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        Intrinsics.checkNotNullParameter(uuid, "$uuid");
        this$0.m55804G0(vehicle, "read: " + uuid);
        this$0.f66291g.put(uuid, C24552a.m31922e());
        C3157HY.m103788b(100);
        BluetoothGattCharacteristic m55776d0 = this$0.m55776d0(uuid);
        synchronized (this$0.f66296l) {
            BluetoothGatt bluetoothGatt = this$0.f66297m;
            boolean z = false;
            if (bluetoothGatt != null && bluetoothGatt.readCharacteristic(m55776d0)) {
                z = true;
            }
            valueOf = Boolean.valueOf(z);
        }
        return valueOf;
    }

    /* renamed from: G0 */
    public final void m55804G0(Vehicle vehicle, String str) {
        String serialNumber = vehicle.getBird().getSerialNumber();
        String name = Thread.currentThread().getName();
        C41318g46.m40151m(serialNumber + ": " + str + ", on thread=" + name, new Object[0]);
    }

    /* renamed from: J0 */
    public final AbstractC23442F<Vehicle> m55798J0(final Command command, final byte[] bArr, final Vehicle vehicle, long j) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33152N = AbstractC23442F.m33161E(new Callable() { // from class: Bm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean m55796K0;
                m55796K0 = C16112d.m55796K0(C16112d.this, vehicle, command, bArr);
                return m55796K0;
            }
        }).m33142Y(this.f66286b.mo44187a()).m33152N(this.f66286b.mo44187a());
        final C16140v c16140v = new C16140v(command, vehicle, this);
        AbstractC23442F<Vehicle> m33146T = m33152N.m33165A(new InterfaceC23492o() { // from class: Cm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55794L0;
                m55794L0 = C16112d.m55794L0(Function1.this, obj);
                return m55794L0;
            }
        }).m33146T(j);
        Intrinsics.checkNotNullExpressionValue(m33146T, "internal fun write(comma…   .retry(retryCount)\n  }");
        return m33146T;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: a */
    public AbstractC23442F<Boolean> mo13697a(final Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Dm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m55775e0;
                m55775e0 = C16112d.m55775e0(C16112d.this, vehicle);
                return m55775e0;
            }
        });
        final C16125g c16125g = new C16125g(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Fm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55774f0;
                m55774f0 = C16112d.m55774f0(Function1.this, obj);
                return m55774f0;
            }
        });
        final C16126h c16126h = new C16126h(vehicle);
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: Gm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55773g0;
                m55773g0 = C16112d.m55773g0(Function1.this, obj);
                return m55773g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A2, "override fun disconnect(…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A2, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: b */
    public AbstractC23442F<Vehicle> mo13696b(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        return K36.m99283f(read$bluetooth_release$default(this, GattUuid.DISTANCE, vehicle, 0L, 4, null), this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: c */
    public AbstractC23442F<Vehicle> mo13695c(final Vehicle vehicle, final boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Um6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Command m55802H0;
                m55802H0 = C16112d.m55802H0(Vehicle.this, this, z);
                return m55802H0;
            }
        });
        final C16139u c16139u = new C16139u(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Vm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55800I0;
                m55800I0 = C16112d.m55800I0(Function1.this, obj);
                return m55800I0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun unlock(vehi…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: d */
    public Vehicle.ConnectionState mo13694d(Vehicle vehicle) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        if (this.f66294j.m31919i()) {
            return Vehicle.ConnectionState.CLOSED;
        }
        List<BluetoothDevice> connectedDevices = this.f66287c.getConnectedDevices(7);
        Intrinsics.checkNotNullExpressionValue(connectedDevices, "manager\n      .getConnec…es(BluetoothProfile.GATT)");
        Iterator<T> it = connectedDevices.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((BluetoothDevice) obj).getAddress(), vehicle.getDevice().getAddress())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Vehicle.ConnectionState.CONNECTED;
        }
        return Vehicle.ConnectionState.DISCONNECTED;
    }

    /* renamed from: d0 */
    public final BluetoothGattCharacteristic m55776d0(GattUuid uuid) {
        List<BluetoothGattCharacteristic> characteristics;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        BluetoothGattService bluetoothGattService = this.f66289e;
        Object obj = null;
        if (bluetoothGattService == null || (characteristics = bluetoothGattService.getCharacteristics()) == null) {
            return null;
        }
        Iterator<T> it = characteristics.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((BluetoothGattCharacteristic) next).getUuid(), uuid.getUuid())) {
                obj = next;
                break;
            }
        }
        return (BluetoothGattCharacteristic) obj;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: e */
    public Observable<Vehicle.ConnectionState> mo13693e(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Vehicle.ConnectionState> just = Observable.just(mo13694d(vehicle));
        Intrinsics.checkNotNullExpressionValue(just, "just(getConnectionState(vehicle))");
        return just;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: f */
    public AbstractC23442F<Vehicle> mo13692f(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Wm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Command m55808E0;
                m55808E0 = C16112d.m55808E0();
                return m55808E0;
            }
        });
        final C16138t c16138t = new C16138t(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Xm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55806F0;
                m55806F0 = C16112d.m55806F0(Function1.this, obj);
                return m55806F0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun softReset(v…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: g */
    public AbstractC23442F<Vehicle> mo13691g(Vehicle vehicle, int i, int i2) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        return K36.m99283f(write$bluetooth_release$default(this, Command.MAX_SPEED, new byte[]{(byte) i2, (byte) (i2 >> 8)}, vehicle, 0L, 8, null), this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: h */
    public AbstractC23442F<Vehicle> mo13690h(Vehicle vehicle, final AlarmType type) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(type, "type");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Mm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Command m55781Y;
                m55781Y = C16112d.m55781Y(AlarmType.this);
                return m55781Y;
            }
        });
        final C16115c c16115c = new C16115c(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Nm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55780Z;
                m55780Z = C16112d.m55780Z(Function1.this, obj);
                return m55780Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun alarm(vehic…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: i */
    public AbstractC23442F<Vehicle> mo13689i(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        return K36.m99283f(C45832nh5.m23305k(new C16118f(vehicle)), this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: j */
    public AbstractC23442F<Vehicle> mo13688j(final Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Jm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m55779a0;
                m55779a0 = C16112d.m55779a0(C16112d.this, vehicle);
                return m55779a0;
            }
        });
        final C16116d c16116d = new C16116d(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Km6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55778b0;
                m55778b0 = C16112d.m55778b0(Function1.this, obj);
                return m55778b0;
            }
        });
        final C16117e c16117e = new C16117e(vehicle);
        AbstractC23442F m33157I = m33165A.m33157I(new InterfaceC23492o() { // from class: Lm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Vehicle m55777c0;
                m55777c0 = C16112d.m55777c0(Function1.this, obj);
                return m55777c0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun authenticat…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33157I, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: k */
    public Observable<Unit> mo13687k(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Unit> hide = this.f66294j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "disconnectingSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: l */
    public Observable<Unit> mo13686l(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Unit> hide = this.f66295k.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "disconnectedSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: m */
    public AbstractC23442F<Vehicle> mo13685m(Vehicle vehicle, final boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Pm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Command m55772h0;
                m55772h0 = C16112d.m55772h0(z);
                return m55772h0;
            }
        });
        final C16127i c16127i = new C16127i(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Rm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55771i0;
                m55771i0 = C16112d.m55771i0(Function1.this, obj);
                return m55771i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun enableDeepS…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: n */
    public AbstractC23442F<Vehicle> mo13684n(final Vehicle vehicle, final int i) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Om6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Pair m55770j0;
                m55770j0 = C16112d.m55770j0(Vehicle.this, i);
                return m55770j0;
            }
        });
        final C16128j c16128j = new C16128j(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Qm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55769k0;
                m55769k0 = C16112d.m55769k0(Function1.this, obj);
                return m55769k0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun flashLights…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: o */
    public AbstractC23442F<Vehicle> mo13683o(final Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: tm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m55764p0;
                m55764p0 = C16112d.m55764p0(Vehicle.this, this);
                return m55764p0;
            }
        });
        final C16132n c16132n = new C16132n(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Em6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55763q0;
                m55763q0 = C16112d.m55763q0(Function1.this, obj);
                return m55763q0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun lock(vehicl…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: p */
    public Observable<Vehicle> mo13682p(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Vehicle> hide = this.f66290f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: q */
    public AbstractC23442F<Vehicle> mo13681q(final Vehicle vehicle, final boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Hm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Command m55766n0;
                m55766n0 = C16112d.m55766n0(Vehicle.this, z);
                return m55766n0;
            }
        });
        final C16131m c16131m = new C16131m(vehicle);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: Im6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55765o0;
                m55765o0 = C16112d.m55765o0(Function1.this, obj);
                return m55765o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun lights(vehi…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66298n);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: r */
    public AbstractC23442F<Vehicle> mo13680r(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F read$bluetooth_release$default = read$bluetooth_release$default(this, GattUuid.IMEI, vehicle, 0L, 4, null);
        final C16135q c16135q = new C16135q(vehicle);
        AbstractC23442F m33165A = read$bluetooth_release$default.m33165A(new InterfaceC23492o() { // from class: wm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55814B0;
                m55814B0 = C16112d.m55814B0(Function1.this, obj);
                return m55814B0;
            }
        });
        final C16136r c16136r = new C16136r(vehicle);
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: xm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55812C0;
                m55812C0 = C16112d.m55812C0(Function1.this, obj);
                return m55812C0;
            }
        });
        final C16137s c16137s = new C16137s(vehicle);
        AbstractC23442F m33165A3 = m33165A2.m33165A(new InterfaceC23492o() { // from class: ym6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55810D0;
                m55810D0 = C16112d.m55810D0(Function1.this, obj);
                return m55810D0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A3, "override fun readNetwork…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A3, this.f66298n);
    }

    /* renamed from: r0 */
    public final void m55762r0(Vehicle vehicle, BluetoothGattCharacteristic characteristic) {
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        boolean m93405b = C34778Nn6.m93405b(vehicle, characteristic);
        m55804G0(vehicle, "onChanged: " + m93405b);
        this.f66290f.onNext(vehicle);
        GattUuid from = GattUuid.Companion.from(characteristic);
        if (from != null) {
            m55804G0(vehicle, "onChanged, bluetooth characteristic changed gatt: " + from);
            C24552a<Vehicle> c24552a = this.f66292h.get(from);
            if (c24552a != null) {
                c24552a.onNext(vehicle);
            }
            C24552a<Vehicle> c24552a2 = this.f66292h.get(from);
            if (c24552a2 != null) {
                c24552a2.onComplete();
            }
        }
    }

    @Override // p000.InterfaceC48847sm6
    public void release() {
        Semaphore semaphore = this.f66298n;
        semaphore.acquire();
        try {
            this.f66294j.onNext(Unit.INSTANCE);
            synchronized (this.f66296l) {
                try {
                    BluetoothGatt bluetoothGatt = this.f66297m;
                    if (bluetoothGatt != null) {
                        bluetoothGatt.disconnect();
                    }
                    BluetoothGatt bluetoothGatt2 = this.f66297m;
                    if (bluetoothGatt2 != null) {
                        bluetoothGatt2.close();
                    }
                } catch (Exception e) {
                    C41318g46.m40159e(e);
                    Unit unit = Unit.INSTANCE;
                }
            }
        } finally {
            semaphore.release();
        }
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: s */
    public AbstractC23442F<Vehicle> mo13679s(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F read$bluetooth_release$default = read$bluetooth_release$default(this, GattUuid.DISTANCE, vehicle, 0L, 4, null);
        final C16129k c16129k = new C16129k(vehicle);
        AbstractC23442F m33165A = read$bluetooth_release$default.m33165A(new InterfaceC23492o() { // from class: zm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55768l0;
                m55768l0 = C16112d.m55768l0(Function1.this, obj);
                return m55768l0;
            }
        });
        final C16130l c16130l = new C16130l(vehicle);
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: Am6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55767m0;
                m55767m0 = C16112d.m55767m0(Function1.this, obj);
                return m55767m0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A2, "override fun get(vehicle…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A2, this.f66298n);
    }

    /* renamed from: s0 */
    public final void m55761s0(Vehicle vehicle, BluetoothGattCharacteristic characteristic, int i) {
        int i2;
        VehicleException vehicleException;
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        GattUuid from = GattUuid.Companion.from(characteristic);
        C24552a<Vehicle> c24552a = this.f66291g.get(from);
        if (i == 0) {
            if (from != null) {
                C34778Nn6.m93405b(vehicle, characteristic);
                if (c24552a != null) {
                    c24552a.onNext(vehicle);
                }
                if (c24552a != null) {
                    c24552a.onComplete();
                }
                m55804G0(vehicle, "onRead: " + from);
                return;
            }
            return;
        }
        EnumC16110c m55818a = EnumC16110c.f66269c.m55818a(i);
        if (from == null) {
            i2 = -1;
        } else {
            i2 = C16114b.$EnumSwitchMapping$0[from.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                vehicleException = new VehicleException(VehicleException.EnumC16097a.ON_READ_UNKNOWN, m55818a, null, 4, null);
            } else {
                vehicleException = new VehicleException(VehicleException.EnumC16097a.ON_READ_LOCK, m55818a, null, 4, null);
            }
        } else {
            vehicleException = new VehicleException(VehicleException.EnumC16097a.ON_READ_AUTH, m55818a, null, 4, null);
        }
        if (c24552a != null) {
            c24552a.onError(vehicleException);
        }
    }

    /* renamed from: t0 */
    public final void m55759t0(Vehicle vehicle, BluetoothGattCharacteristic characteristic, int i) {
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        Command from = Command.Companion.from(characteristic);
        if (i == 0) {
            if (Intrinsics.areEqual(characteristic.getUuid(), GattUuid.COMMAND.getUuid()) && from != null) {
                m55804G0(vehicle, "onWrite: " + from);
                return;
            }
            return;
        }
        EnumC16110c m55818a = EnumC16110c.f66269c.m55818a(i);
        m55804G0(vehicle, "onWrite failed: " + m55818a + " for command: " + from);
    }

    /* renamed from: u0 */
    public final void m55757u0(Vehicle vehicle, BluetoothGatt gatt, int i, InterfaceC23444H<Vehicle> emitter) {
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        Intrinsics.checkNotNullParameter(gatt, "gatt");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        if (i != 0) {
            if (i == 2) {
                m55804G0(vehicle, "onConnection: CONNECTED");
                this.f66293i = false;
                synchronized (this.f66296l) {
                    gatt.discoverServices();
                }
                return;
            }
            return;
        }
        synchronized (this.f66296l) {
            gatt.close();
            Unit unit = Unit.INSTANCE;
        }
        m55804G0(vehicle, "onConnection: DISCONNECTED");
        if (this.f66293i) {
            this.f66293i = false;
            emitter.onError(new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, null, 6, null));
            return;
        }
        this.f66295k.onNext(Unit.INSTANCE);
    }

    /* renamed from: v0 */
    public final void m55755v0(final Vehicle vehicle, final BluetoothGatt gatt, int i, InterfaceC23444H<Vehicle> emitter) {
        Object obj;
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        Intrinsics.checkNotNullParameter(gatt, "gatt");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        if (i == 0) {
            List<BluetoothGattService> services = gatt.getServices();
            if (services == null) {
                services = CollectionsKt__CollectionsKt.emptyList();
            }
            Iterator<T> it = services.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((BluetoothGattService) obj).getUuid(), GattUuid.BIRD_SERVICE.getUuid())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            final BluetoothGattService bluetoothGattService = (BluetoothGattService) obj;
            this.f66289e = bluetoothGattService;
            if (bluetoothGattService != null) {
                Observable subscribeOn = Observable.fromCallable(new Callable() { // from class: um6
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Unit m55753w0;
                        m55753w0 = C16112d.m55753w0(C16112d.this, vehicle, gatt, bluetoothGattService);
                        return m55753w0;
                    }
                }).subscribeOn(this.f66286b.mo44187a());
                final C16133o c16133o = new C16133o(emitter, vehicle);
                subscribeOn.subscribe(new InterfaceC23484g() { // from class: vm6
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj2) {
                        C16112d.m55751x0(Function1.this, obj2);
                    }
                });
                return;
            }
            return;
        }
        emitter.onError(new VehicleException(VehicleException.EnumC16097a.DISCOVERY, EnumC16110c.f66269c.m55818a(i), null, 4, null));
    }

    /* renamed from: y0 */
    public final AbstractC23442F<Vehicle> m55749y0(final GattUuid uuid, final Vehicle vehicle, long j) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33152N = AbstractC23442F.m33161E(new Callable() { // from class: Sm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean m55747z0;
                m55747z0 = C16112d.m55747z0(C16112d.this, vehicle, uuid);
                return m55747z0;
            }
        }).m33142Y(this.f66286b.mo44187a()).m33152N(this.f66286b.mo44187a());
        final C16134p c16134p = new C16134p(uuid, vehicle);
        AbstractC23442F<Vehicle> m33146T = m33152N.m33165A(new InterfaceC23492o() { // from class: Tm6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55816A0;
                m55816A0 = C16112d.m55816A0(Function1.this, obj);
                return m55816A0;
            }
        }).m33146T(j);
        Intrinsics.checkNotNullExpressionValue(m33146T, "internal fun read(uuid: …   .retry(retryCount)\n  }");
        return m33146T;
    }
}
