package co.bird.android.manager.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.bluetooth.internal.C16098a;
import co.bird.android.manager.bluetooth.internal.VehicleException;
import co.bird.android.model.AlarmType;
import co.bird.android.model.BdVehicleConnection;
import co.bird.android.model.GattUuid;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.C26613D0;
import no.nordicsemi.android.ble.data.Data;
import okhttp3.internal.http2.Http2Connection;
import p000.AbstractC30179xU;
@Metadata(m28433d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001T\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002&)B\u0017\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010?\u001a\u00020=¢\u0006\u0004\bZ\u0010[J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020\u001fH\u0014J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0010H\u0016J%\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0010H\u0016J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0013H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J&\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u00020\u001dH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002080!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010:\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001d0!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010AR\"\u0010F\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u00040\u00040C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010ER$\u0010G\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u001d0\u001d0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER\"\u0010J\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u001d0\u001d0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010IR\"\u0010M\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010\u00070\u00070K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006]"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/a;", "LYo2;", "LCk6;", "Lsm6;", "Lco/bird/android/model/Vehicle;", "vehicle", "Lkotlin/Function1;", "", "command", "Lco/bird/android/manager/bluetooth/internal/a$c;", "loggingInfo", "Lio/reactivex/c;", "c0", "Lio/reactivex/F;", "d0", "token", "", "locking", "X", "", "ecuType", "maxSpeed", "a0", "enabled", "W", "response", "b0", "(Ljava/lang/String;)Ljava/lang/Boolean;", "msg", "", "e0", "LxU$b;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lio/reactivex/Observable;", "p", "i", C17296a.f69688o, "s", "b", "o", "lightOn", "c", "Y", "(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;", "j", "Lco/bird/android/model/AlarmType;", "type", "h", "q", "minutes", "n", "m", "g", "f", "r", "release", "Lco/bird/android/model/Vehicle$ConnectionState;", "e", DateTokenConverter.CONVERTER_KEY, "k", "l", "LaY;", "LaY;", "scheduler", "Landroid/bluetooth/BluetoothGattCharacteristic;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "commandCharacteristic", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "vehicleSubject", "disconnectingSubject", "Lio/reactivex/subjects/d;", "Lio/reactivex/subjects/d;", "disconnectedSubject", "Lma4;", "Lma4;", "notificationRelay", "", "Ljava/lang/Object;", "lock", "Ljava/util/concurrent/Semaphore;", "Ljava/util/concurrent/Semaphore;", "bluetoothLock", "co/bird/android/manager/bluetooth/internal/a$d", "t", "Lco/bird/android/manager/bluetooth/internal/a$d;", "gattCallback", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;LaY;)V", "u", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBDVehicleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BDVehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/BDVehicleManagerImpl\n+ 2 Singles.kt\nio/reactivex/rxkotlin/SinglesKt\n+ 3 ThreadSafeUtility.kt\nco/bird/android/manager/bluetooth/internal/ThreadSafeUtilityKt\n*L\n1#1,450:1\n119#2:451\n35#3,5:452\n*S KotlinDebug\n*F\n+ 1 BDVehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/BDVehicleManagerImpl\n*L\n257#1:451\n347#1:452,5\n*E\n"})
/* renamed from: co.bird.android.manager.bluetooth.internal.a */
/* loaded from: classes4.dex */
public final class C16098a extends AbstractC37357Yo2<C32177Ck6> implements InterfaceC48847sm6 {

    /* renamed from: u */
    public static final C16100b f66241u = new C16100b(null);

    /* renamed from: l */
    public final InterfaceC10732aY f66242l;

    /* renamed from: m */
    public BluetoothGattCharacteristic f66243m;

    /* renamed from: n */
    public final C24552a<Vehicle> f66244n;

    /* renamed from: o */
    public C24552a<Unit> f66245o;

    /* renamed from: p */
    public final C24558d<Unit> f66246p;

    /* renamed from: q */
    public final C45168ma4<String> f66247q;

    /* renamed from: r */
    public final Object f66248r;

    /* renamed from: s */
    public final Semaphore f66249s;

    /* renamed from: t */
    public final C16102d f66250t;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"co/bird/android/manager/bluetooth/internal/a$a", "LCk6;", "Landroid/bluetooth/BluetoothDevice;", "device", "", DateTokenConverter.CONVERTER_KEY, "k", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$a */
    /* loaded from: classes4.dex */
    public static final class C16099a extends C32177Ck6 {
        public C16099a() {
        }

        @Override // p000.C32177Ck6, p000.InterfaceC30597yU
        /* renamed from: d */
        public void mo3464d(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            super.mo3464d(device);
            C16098a.this.f66245o.onNext(Unit.INSTANCE);
        }

        @Override // p000.C32177Ck6, p000.InterfaceC30597yU
        /* renamed from: k */
        public void mo3457k(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            super.mo3457k(device);
            Object obj = C16098a.this.f66248r;
            C16098a c16098a = C16098a.this;
            synchronized (obj) {
                c16098a.m5219v();
                Unit unit = Unit.INSTANCE;
            }
            String address = device.getAddress();
            C41318g46.m40151m("onLinkLossOccurred: " + address, new Object[0]);
            C16098a.this.f66246p.onNext(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/a$b;", "", "", "LIGHTS_COMMAND_ACK_PREFIX", "Ljava/lang/String;", "LIGHTS_COMMAND_PREFIX", "LOCK_COMMAND_ACK_PREFIX", "LOCK_COMMAND_PREFIX", "MAX_SPEED_COMMAND_ACK_PREFIX", "MAX_SPEED_COMMAND_PREFIX", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$b */
    /* loaded from: classes4.dex */
    public static final class C16100b {
        public /* synthetic */ C16100b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16100b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/a$c;", "", "", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "tag", "<init>", "(Ljava/lang/String;)V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$c */
    /* loaded from: classes4.dex */
    public static final class C16101c {

        /* renamed from: a */
        public final String f66252a;

        public C16101c() {
            this(null, 1, null);
        }

        /* renamed from: a */
        public final String m55830a() {
            return this.f66252a;
        }

        public C16101c(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f66252a = tag;
        }

        public /* synthetic */ C16101c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Unknown Command" : str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0014¨\u0006\f"}, m28432d2 = {"co/bird/android/manager/bluetooth/internal/a$d", "LxU$b;", "", "o2", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", "S2", "X4", "c5", "Y4", "a5", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBDVehicleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BDVehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/BDVehicleManagerImpl$gattCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"})
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$d */
    /* loaded from: classes4.dex */
    public static final class C16102d extends AbstractC30179xU.AbstractC30181b {
        public C16102d() {
        }

        /* renamed from: i5 */
        public static final void m55828i5(C16098a this$0, BluetoothDevice bluetoothDevice, Data data) {
            String str;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bluetoothDevice, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] m22621c = data.m22621c();
            if (m22621c != null) {
                C45168ma4 c45168ma4 = this$0.f66247q;
                Charset defaultCharset = Charset.defaultCharset();
                Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
                c45168ma4.accept(new String(m22621c, defaultCharset));
            }
            byte[] m22621c2 = data.m22621c();
            if (m22621c2 != null) {
                Charset defaultCharset2 = Charset.defaultCharset();
                Intrinsics.checkNotNullExpressionValue(defaultCharset2, "defaultCharset()");
                str = new String(m22621c2, defaultCharset2);
            } else {
                str = null;
            }
            C41318g46.m40151m("received command notification " + str, new Object[0]);
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: S2 */
        public boolean mo3749S2(BluetoothGatt gatt) {
            Intrinsics.checkNotNullParameter(gatt, "gatt");
            C41318g46.m40151m("isRequiredServiceSupported reached", new Object[0]);
            BluetoothGattService service = gatt.getService(GattUuid.BD_BIRD_SERVICE.getUuid());
            if (service != null) {
                C16098a.this.f66243m = service.getCharacteristic(GattUuid.BD_COMMAND.getUuid());
                BluetoothGattCharacteristic bluetoothGattCharacteristic = C16098a.this.f66243m;
                C41318g46.m40151m("isRequiredServiceSupported returning " + bluetoothGattCharacteristic, new Object[0]);
                if (C16098a.this.f66243m == null) {
                    return false;
                }
                return true;
            }
            C41318g46.m40151m("failed to find required services", new Object[0]);
            return false;
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: X4 */
        public void mo22981X4() {
            C41318g46.m40151m("device disconnected", new Object[0]);
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: Y4 */
        public void mo22975Y4() {
            super.mo22975Y4();
            C41318g46.m40151m("device ready", new Object[0]);
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: a5 */
        public void mo22963a5() {
            super.mo22963a5();
            C41318g46.m40151m("manager ready", new Object[0]);
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: c5 */
        public void mo3748c5() {
            C41318g46.m40151m("onServicesInvalidated called ", new Object[0]);
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: o2 */
        public void mo3747o2() {
            super.mo3747o2();
            C41318g46.m40151m("Setting command notification", new Object[0]);
            C16098a c16098a = C16098a.this;
            C32636Ej6 m5226M = c16098a.m5226M(c16098a.f66243m);
            final C16098a c16098a2 = C16098a.this;
            m5226M.m108551h(new QS0() { // from class: Cv
                @Override // p000.QS0
                /* renamed from: b */
                public final void mo3746b(BluetoothDevice bluetoothDevice, Data data) {
                    C16098a.C16102d.m55828i5(C16098a.this, bluetoothDevice, data);
                }
            });
            C16098a c16098a3 = C16098a.this;
            c16098a3.m5215z(c16098a3.f66243m).mo22507k();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "token", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$e */
    /* loaded from: classes4.dex */
    public static final class C16103e extends Lambda implements Function1<String, String> {

        /* renamed from: h */
        public final /* synthetic */ boolean f66255h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16103e(boolean z) {
            super(1);
            this.f66255h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return C16098a.this.m55839W(token, this.f66255h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "token", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$f */
    /* loaded from: classes4.dex */
    public static final class C16104f extends Lambda implements Function1<String, String> {

        /* renamed from: h */
        public final /* synthetic */ boolean f66257h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16104f(boolean z) {
            super(1);
            this.f66257h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return C16098a.this.m55838X(token, this.f66257h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "response", "Lio/reactivex/K;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$g */
    /* loaded from: classes4.dex */
    public static final class C16105g extends Lambda implements Function1<String, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f66259h;

        /* renamed from: i */
        public final /* synthetic */ String f66260i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16105g(Vehicle vehicle, String str) {
            super(1);
            this.f66259h = vehicle;
            this.f66260i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Vehicle> invoke(String response) {
            WireBird copy;
            Vehicle copy2;
            Intrinsics.checkNotNullParameter(response, "response");
            C16098a c16098a = C16098a.this;
            Vehicle vehicle = this.f66259h;
            String str = this.f66260i;
            c16098a.m55831e0(vehicle, str + " response received: " + response);
            Boolean m55834b0 = C16098a.this.m55834b0(response);
            if (m55834b0 == null) {
                VehicleException.EnumC16097a enumC16097a = VehicleException.EnumC16097a.ON_READ_LOCK;
                String str2 = this.f66260i;
                return AbstractC23442F.m33100x(new VehicleException(enumC16097a, null, "Could not parse " + str2 + " response", 2, null));
            }
            copy = r3.copy((r91 & 1) != 0 ? r3.f66717id : null, (r91 & 2) != 0 ? r3.model : null, (r91 & 4) != 0 ? r3.taskId : null, (r91 & 8) != 0 ? r3.batteryLevel : 0, (r91 & 16) != 0 ? r3.estimatedRange : null, (r91 & 32) != 0 ? r3.distance : 0, (r91 & 64) != 0 ? r3.location : null, (r91 & 128) != 0 ? r3.code : null, (r91 & 256) != 0 ? r3.stickerId : null, (r91 & 512) != 0 ? r3.serialNumber : null, (r91 & 1024) != 0 ? r3.disconnected : false, (r91 & 2048) != 0 ? r3.collect : false, (r91 & 4096) != 0 ? r3.submerged : false, (r91 & 8192) != 0 ? r3.lost : false, (r91 & 16384) != 0 ? r3.locked : m55834b0.booleanValue(), (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.ackLocked : false, (r91 & 65536) != 0 ? r3.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.broken : false, (r91 & 524288) != 0 ? r3.label : null, (r91 & 1048576) != 0 ? r3.actions : null, (r91 & 2097152) != 0 ? r3.bountyId : null, (r91 & 4194304) != 0 ? r3.bountyPrice : null, (r91 & 8388608) != 0 ? r3.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.bountyLost : false, (r91 & 33554432) != 0 ? r3.bountyOverdue : false, (r91 & 67108864) != 0 ? r3.bountyKind : null, (r91 & 134217728) != 0 ? r3.brandName : null, (r91 & 268435456) != 0 ? r3.taskKind : null, (r91 & 536870912) != 0 ? r3.gpsAt : null, (r91 & 1073741824) != 0 ? r3.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r3.token : null, (r92 & 1) != 0 ? r3.bluetooth : false, (r92 & 2) != 0 ? r3.cellular : false, (r92 & 4) != 0 ? r3.startedAt : null, (r92 & 8) != 0 ? r3.dueAt : null, (r92 & 16) != 0 ? r3.asleep : false, (r92 & 32) != 0 ? r3.imei : null, (r92 & 64) != 0 ? r3.boardProtocol : null, (r92 & 128) != 0 ? r3.physicalLock : null, (r92 & 256) != 0 ? r3.priorityCollect : false, (r92 & 512) != 0 ? r3.down : false, (r92 & 1024) != 0 ? r3.needsInspection : false, (r92 & 2048) != 0 ? r3.partnerId : null, (r92 & 4096) != 0 ? r3.nestId : null, (r92 & 8192) != 0 ? r3.lastRideEndedAt : null, (r92 & 16384) != 0 ? r3.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.peril : false, (r92 & 65536) != 0 ? r3.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.offline : false, (r92 & 524288) != 0 ? r3.license : null, (r92 & 1048576) != 0 ? r3.areaKey : null, (r92 & 2097152) != 0 ? r3.fleetId : null, (r92 & 4194304) != 0 ? r3.nestPurpose : null, (r92 & 8388608) != 0 ? r3.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.scannedAt : null, (r92 & 33554432) != 0 ? r3.badgeType : null, (r92 & 67108864) != 0 ? r3.bountyReasons : null, (r92 & 134217728) != 0 ? r3.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r3.ephemeralId : null, (r92 & 536870912) != 0 ? r3.hasHelmet : false, (r92 & 1073741824) != 0 ? r3.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r3.bleMacAddress : null, (r93 & 1) != 0 ? r3.cellId : null, (r93 & 2) != 0 ? this.f66259h.getBird().externalFeedType : null);
            copy2 = r2.copy((r35 & 1) != 0 ? r2.device : null, (r35 & 2) != 0 ? r2.bird : copy, (r35 & 4) != 0 ? r2.battery : 0, (r35 & 8) != 0 ? r2.distance : 0, (r35 & 16) != 0 ? r2.locked : m55834b0.booleanValue(), (r35 & 32) != 0 ? r2.energyMode : null, (r35 & 64) != 0 ? r2.authenticated : false, (r35 & 128) != 0 ? r2.connected : false, (r35 & 256) != 0 ? r2.rxDevice : null, (r35 & 512) != 0 ? r2.rssi : null, (r35 & 1024) != 0 ? r2.beaconHash : null, (r35 & 2048) != 0 ? r2.proximityUUID : null, (r35 & 4096) != 0 ? r2.imei : null, (r35 & 8192) != 0 ? r2.serialNumber : null, (r35 & 16384) != 0 ? r2.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.fault : null, (r35 & 65536) != 0 ? this.f66259h.vehicleVersion : null);
            C16098a.this.f66244n.onNext(this.f66259h);
            return AbstractC23442F.m33158H(copy2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/Vehicle;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$h */
    /* loaded from: classes4.dex */
    public static final class C16106h extends Lambda implements Function1<InterfaceC23444H<Vehicle>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<String, String> f66261g;

        /* renamed from: h */
        public final /* synthetic */ String f66262h;

        /* renamed from: i */
        public final /* synthetic */ Vehicle f66263i;

        /* renamed from: j */
        public final /* synthetic */ C16098a f66264j;

        /* renamed from: k */
        public final /* synthetic */ C16101c f66265k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16106h(Function1<? super String, String> function1, String str, Vehicle vehicle, C16098a c16098a, C16101c c16101c) {
            super(1);
            this.f66261g = function1;
            this.f66262h = str;
            this.f66263i = vehicle;
            this.f66264j = c16098a;
            this.f66265k = c16101c;
        }

        /* renamed from: c */
        public static final void m55825c(C16098a this$0, Vehicle vehicle, C16101c loggingInfo, InterfaceC23444H emitter, BluetoothDevice bluetoothDevice, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
            Intrinsics.checkNotNullParameter(loggingInfo, "$loggingInfo");
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(bluetoothDevice, "<anonymous parameter 0>");
            String m55830a = loggingInfo.m55830a();
            this$0.m55831e0(vehicle, m55830a + " - fail called, status: " + i);
            VehicleException.EnumC16097a enumC16097a = VehicleException.EnumC16097a.WRITE;
            String m55830a2 = loggingInfo.m55830a();
            emitter.onError(new VehicleException(enumC16097a, null, "Failed to write " + m55830a2 + " status: " + i, 2, null));
        }

        /* renamed from: d */
        public static final void m55824d(C16098a this$0, Vehicle vehicle, C16101c loggingInfo, InterfaceC23444H emitter, BluetoothDevice it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
            Intrinsics.checkNotNullParameter(loggingInfo, "$loggingInfo");
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(it, "it");
            String m55830a = loggingInfo.m55830a();
            this$0.m55831e0(vehicle, m55830a + " - write completed");
            emitter.onSuccess(vehicle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Vehicle> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<Vehicle> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            String invoke = this.f66261g.invoke(this.f66262h);
            if (this.f66263i.getAuthenticated()) {
                C16098a c16098a = this.f66264j;
                Vehicle vehicle = this.f66263i;
                String m55830a = this.f66265k.m55830a();
                c16098a.m55831e0(vehicle, m55830a + " - writing command");
                C16098a c16098a2 = this.f66264j;
                BluetoothGattCharacteristic bluetoothGattCharacteristic = c16098a2.f66243m;
                byte[] bytes = invoke.getBytes(Charsets.US_ASCII);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                C26613D0 m22633W = c16098a2.m5223P(bluetoothGattCharacteristic, bytes).m22633W();
                final C16098a c16098a3 = this.f66264j;
                final Vehicle vehicle2 = this.f66263i;
                final C16101c c16101c = this.f66265k;
                C26613D0 mo22461l = m22633W.mo22461l(new InterfaceC32397Dj1() { // from class: Dv
                    @Override // p000.InterfaceC32397Dj1
                    /* renamed from: a */
                    public final void mo22490a(BluetoothDevice bluetoothDevice, int i) {
                        C16098a.C16106h.m55825c(C16098a.this, vehicle2, c16101c, emitter, bluetoothDevice, i);
                    }
                });
                final C16098a c16098a4 = this.f66264j;
                final Vehicle vehicle3 = this.f66263i;
                final C16101c c16101c2 = this.f66265k;
                mo22461l.mo22462j(new InterfaceC52220yT5() { // from class: Ev
                    @Override // p000.InterfaceC52220yT5
                    /* renamed from: c */
                    public final void mo3469c(BluetoothDevice bluetoothDevice) {
                        C16098a.C16106h.m55824d(C16098a.this, vehicle3, c16101c2, emitter, bluetoothDevice);
                    }
                }).mo22507k();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSingles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Singles.kt\nio/reactivex/rxkotlin/SinglesKt$zipWith$1\n+ 2 BDVehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/BDVehicleManagerImpl\n*L\n1#1,126:1\n257#2:127\n*E\n"})
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$i */
    /* loaded from: classes4.dex */
    public static final class C16107i<T1, T2, R> implements InterfaceC23480c<Boolean, String, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Boolean bool, String str) {
            return (R) str;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "token", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.bluetooth.internal.a$j */
    /* loaded from: classes4.dex */
    public static final class C16108j extends Lambda implements Function1<String, String> {

        /* renamed from: h */
        public final /* synthetic */ int f66267h;

        /* renamed from: i */
        public final /* synthetic */ int f66268i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16108j(int i, int i2) {
            super(1);
            this.f66267h = i;
            this.f66268i = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return C16098a.this.m55835a0(token, this.f66267h, this.f66268i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16098a(Context context, InterfaceC10732aY scheduler) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f66242l = scheduler;
        C24552a<Vehicle> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Vehicle>()");
        this.f66244n = m31922e;
        C24552a<Unit> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Unit>()");
        this.f66245o = m31922e2;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f66246p = m31902e;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f66247q = m25409g;
        this.f66248r = new Object();
        this.f66249s = new Semaphore(1);
        this.f66250t = new C16102d();
        mo5227L(new C16099a());
    }

    /* renamed from: U */
    public static final Vehicle m55841U(C16098a this$0, Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        this$0.m55831e0(vehicle, "connect called");
        if (!this$0.f66245o.m31919i()) {
            try {
                synchronized (this$0.f66248r) {
                    String address = vehicle.getDevice().getAddress();
                    this$0.m55831e0(vehicle, "connecting to " + address);
                    this$0.mo5227L(this$0.f46660k);
                    this$0.m5218w(vehicle.getDevice()).m23125I();
                    Unit unit = Unit.INSTANCE;
                }
                return vehicle;
            } catch (Exception e) {
                String message = e.getMessage();
                this$0.m55831e0(vehicle, "connect: request failed '" + message + "'.");
                throw new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, e.getMessage(), 2, null);
            }
        }
        this$0.m55831e0(vehicle, "connect: authenticating after disconnecting is an error, this object cannot be reused after disconnecting.");
        throw new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, "Attempting to reuse object after disconnect.", 2, null);
    }

    /* renamed from: V */
    public static final Boolean m55840V(C16098a this$0, Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        this$0.m55831e0(vehicle, "disconnect");
        this$0.f66245o.onNext(Unit.INSTANCE);
        try {
            this$0.m5217x().m23125I();
        } catch (Exception e) {
            String message = e.getMessage();
            this$0.m55831e0(vehicle, "disconnect: exception caught, but ignoring: " + message + " ");
        }
        return Boolean.FALSE;
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m55836Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC30179xU
    /* renamed from: C */
    public AbstractC30179xU.AbstractC30181b mo3768C() {
        return this.f66250t;
    }

    /* renamed from: W */
    public final String m55839W(String str, boolean z) {
        return BdVehicleConnection.LIGHTS_COMMAND_PREFIX + str + ",0," + (z ? 1 : 0) + "$\r\n";
    }

    /* renamed from: X */
    public final String m55838X(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        return BdVehicleConnection.LOCK_COMMAND_PREFIX + str + "," + str2 + "$\r\n";
    }

    /* renamed from: Y */
    public final AbstractC23442F<Vehicle> m55837Y(Vehicle vehicle, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        if (z) {
            str = "lock";
        } else {
            str = "unlock";
        }
        AbstractC23442F<String> m55832d0 = m55832d0(vehicle, new C16104f(z), new C16101c(str));
        final C16105g c16105g = new C16105g(vehicle, str);
        AbstractC23442F<R> m33165A = m55832d0.m33165A(new InterfaceC23492o() { // from class: zv
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55836Z;
                m55836Z = C16098a.m55836Z(Function1.this, obj);
                return m55836Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "internal fun lockInterna…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33165A, this.f66249s);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: a */
    public AbstractC23442F<Boolean> mo13697a(final Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Bv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean m55840V;
                m55840V = C16098a.m55840V(C16098a.this, vehicle);
                return m55840V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      tra…      }\n      false\n    }");
        return K36.m99283f(m33161E, this.f66249s);
    }

    /* renamed from: a0 */
    public final String m55835a0(String str, int i, int i2) {
        return BdVehicleConnection.MAX_SPEED_COMMAND_PREFIX + str + "," + i + "," + i2 + ",,$\r\n";
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: b */
    public AbstractC23442F<Vehicle> mo13696b(Vehicle vehicle) {
        Vehicle copy;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        copy = vehicle.copy((r35 & 1) != 0 ? vehicle.device : null, (r35 & 2) != 0 ? vehicle.bird : null, (r35 & 4) != 0 ? vehicle.battery : 0, (r35 & 8) != 0 ? vehicle.distance : 0, (r35 & 16) != 0 ? vehicle.locked : false, (r35 & 32) != 0 ? vehicle.energyMode : null, (r35 & 64) != 0 ? vehicle.authenticated : false, (r35 & 128) != 0 ? vehicle.connected : false, (r35 & 256) != 0 ? vehicle.rxDevice : null, (r35 & 512) != 0 ? vehicle.rssi : null, (r35 & 1024) != 0 ? vehicle.beaconHash : null, (r35 & 2048) != 0 ? vehicle.proximityUUID : null, (r35 & 4096) != 0 ? vehicle.imei : null, (r35 & 8192) != 0 ? vehicle.serialNumber : null, (r35 & 16384) != 0 ? vehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? vehicle.fault : null, (r35 & 65536) != 0 ? vehicle.vehicleVersion : null);
        AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(copy);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle.copy(distance = 0))");
        return m33158H;
    }

    /* renamed from: b0 */
    public final Boolean m55834b0(String str) {
        boolean contains$default;
        boolean contains$default2;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "+ACK:BKSCT,1$", false, 2, (Object) null);
        if (!contains$default) {
            contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "+ACK:BKSCT,0$", false, 2, (Object) null);
            if (!contains$default2) {
                return null;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: c */
    public AbstractC23442F<Vehicle> mo13695c(Vehicle vehicle, boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        return m55837Y(vehicle, false);
    }

    /* renamed from: c0 */
    public final AbstractC23461c m55833c0(Vehicle vehicle, Function1<? super String, String> function1, C16101c c16101c) {
        AbstractC23461c abstractC23461c;
        String token = vehicle.getBird().getToken();
        if (token != null) {
            abstractC23461c = C45832nh5.m23305k(new C16106h(function1, token, vehicle, this, c16101c)).m33159G().m33063X(this.f66242l.mo44187a()).m33070P(this.f66242l.mo44187a());
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c == null) {
            VehicleException.EnumC16097a enumC16097a = VehicleException.EnumC16097a.WRITE;
            String m55830a = c16101c.m55830a();
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new VehicleException(enumC16097a, null, "Failed to write " + m55830a, 2, null));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(VehicleException(e…ite ${loggingInfo.tag}\"))");
            return m33080F;
        }
        return abstractC23461c;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: d */
    public Vehicle.ConnectionState mo13694d(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        if (this.f66245o.m31919i()) {
            return Vehicle.ConnectionState.CLOSED;
        }
        int m5235A = m5235A();
        if (m5235A != 0) {
            if (m5235A != 1) {
                if (m5235A != 2) {
                    if (m5235A != 3) {
                        return Vehicle.ConnectionState.CLOSED;
                    }
                    return Vehicle.ConnectionState.CONNECTED;
                }
                return Vehicle.ConnectionState.CONNECTED;
            }
            return Vehicle.ConnectionState.DISCONNECTED;
        }
        return Vehicle.ConnectionState.DISCONNECTED;
    }

    /* renamed from: d0 */
    public final AbstractC23442F<String> m55832d0(Vehicle vehicle, Function1<? super String, String> function1, C16101c c16101c) {
        AbstractC23442F m33046j0 = m55833c0(vehicle, function1, c16101c).m33046j0(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(m33046j0, "sendCommand(vehicle, com…fo).toSingleDefault(true)");
        AbstractC23442F<String> firstOrError = this.f66247q.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "notificationRelay.firstOrError()");
        AbstractC23442F<String> m33103u0 = m33046j0.m33103u0(firstOrError, new C16107i());
        Intrinsics.checkExpressionValueIsNotNull(m33103u0, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return m33103u0;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: e */
    public Observable<Vehicle.ConnectionState> mo13693e(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Vehicle.ConnectionState> just = Observable.just(mo13694d(vehicle));
        Intrinsics.checkNotNullExpressionValue(just, "just(getConnectionState(vehicle))");
        return just;
    }

    /* renamed from: e0 */
    public final void m55831e0(Vehicle vehicle, String str) {
        String serialNumber = vehicle.getBird().getSerialNumber();
        String name = Thread.currentThread().getName();
        C41318g46.m40151m("bluetooth ble " + serialNumber + ": " + str + ", on thread=" + name, new Object[0]);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: f */
    public AbstractC23442F<Vehicle> mo13692f(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle)");
        return m33158H;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: g */
    public AbstractC23442F<Vehicle> mo13691g(Vehicle vehicle, int i, int i2) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        C16108j c16108j = new C16108j(i, i2);
        AbstractC23442F m33046j0 = m55833c0(vehicle, c16108j, new C16101c("maxSpeed:" + i2)).m33046j0(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33046j0, "override fun setMaxSpeed…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33046j0, this.f66249s);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: h */
    public AbstractC23442F<Vehicle> mo13690h(Vehicle vehicle, AlarmType type) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(type, "type");
        AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle)");
        return m33158H;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: i */
    public AbstractC23442F<Vehicle> mo13689i(final Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Av
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Vehicle m55841U;
                m55841U = C16098a.m55841U(C16098a.this, vehicle);
                return m55841U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      tra…    }\n      vehicle\n    }");
        return K36.m99283f(m33161E, this.f66249s);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: j */
    public AbstractC23442F<Vehicle> mo13688j(Vehicle vehicle) {
        Vehicle copy;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        if (!this.f66245o.m31919i()) {
            copy = vehicle.copy((r35 & 1) != 0 ? vehicle.device : null, (r35 & 2) != 0 ? vehicle.bird : null, (r35 & 4) != 0 ? vehicle.battery : 0, (r35 & 8) != 0 ? vehicle.distance : 0, (r35 & 16) != 0 ? vehicle.locked : false, (r35 & 32) != 0 ? vehicle.energyMode : null, (r35 & 64) != 0 ? vehicle.authenticated : true, (r35 & 128) != 0 ? vehicle.connected : false, (r35 & 256) != 0 ? vehicle.rxDevice : null, (r35 & 512) != 0 ? vehicle.rssi : null, (r35 & 1024) != 0 ? vehicle.beaconHash : null, (r35 & 2048) != 0 ? vehicle.proximityUUID : null, (r35 & 4096) != 0 ? vehicle.imei : null, (r35 & 8192) != 0 ? vehicle.serialNumber : null, (r35 & 16384) != 0 ? vehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? vehicle.fault : null, (r35 & 65536) != 0 ? vehicle.vehicleVersion : null);
            this.f66244n.onNext(copy);
            AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(copy);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(v)");
            return m33158H;
        }
        throw new VehicleException(VehicleException.EnumC16097a.CONNECTION, null, null, 6, null);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: k */
    public Observable<Unit> mo13687k(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Unit> hide = this.f66245o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "disconnectingSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: l */
    public Observable<Unit> mo13686l(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Unit> hide = this.f66246p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "disconnectedSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: m */
    public AbstractC23442F<Vehicle> mo13685m(Vehicle vehicle, boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle)");
        return m33158H;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: n */
    public AbstractC23442F<Vehicle> mo13684n(Vehicle vehicle, int i) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle)");
        return m33158H;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: o */
    public AbstractC23442F<Vehicle> mo13683o(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        return m55837Y(vehicle, true);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: p */
    public Observable<Vehicle> mo13682p(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Vehicle> hide = this.f66244n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: q */
    public AbstractC23442F<Vehicle> mo13681q(Vehicle vehicle, boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        C16103e c16103e = new C16103e(z);
        AbstractC23442F m33046j0 = m55833c0(vehicle, c16103e, new C16101c("lights:" + z)).m33046j0(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33046j0, "override fun lights(vehi…ration(bluetoothLock)\n  }");
        return K36.m99283f(m33046j0, this.f66249s);
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: r */
    public AbstractC23442F<Vehicle> mo13680r(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle)");
        return m33158H;
    }

    @Override // p000.InterfaceC48847sm6
    public void release() {
        Semaphore semaphore = this.f66249s;
        semaphore.acquire();
        try {
            this.f66245o.onNext(Unit.INSTANCE);
            synchronized (this.f66248r) {
                try {
                    m5217x().mo22507k();
                } catch (Exception e) {
                    C41318g46.m40159e(e);
                }
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            semaphore.release();
        }
    }

    @Override // p000.InterfaceC48847sm6
    /* renamed from: s */
    public AbstractC23442F<Vehicle> mo13679s(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Vehicle> m33158H = AbstractC23442F.m33158H(vehicle);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(vehicle)");
        return m33158H;
    }
}
