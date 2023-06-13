package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AlarmType;
import co.bird.android.model.GattUuid;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH&JD\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&JD\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J>\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0015\u001a\u00020\u0006H&J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH&J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH&J2\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH&JJ\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\nH'J(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH&J*\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\nH&J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\bH&J\b\u0010-\u001a\u00020\u001aH&J\b\u0010.\u001a\u00020\u001aH&J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\n0/H&J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002010/2\u0006\u0010\t\u001a\u00020\bH&¨\u00063"}, m28432d2 = {"LpJ;", "", "", "timeoutSeconds", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/Vehicle;", "j", "Lco/bird/android/model/wire/WireBird;", "bird", "", "canTreatAsBluetoothOverride", "k", "forRide", "onFailDisconnect", "onSuccessDisconnect", "Lkotlin/Function0;", "unlockedExternally", "l", "lockedExternally", "e", "vehicle", "failIfClosed", "timeout", "r", C17296a.f69688o, "", "i", "g", "b", "Lco/bird/android/model/AlarmType;", "type", "n", "enabled", "LKY;", "bluetoothWakeStarted", "LbE5;", "sleepStarted", "autoUpdateBirdState", DateTokenConverter.CONVERTER_KEY, "c", "minutes", "f", "m", "h", "release", "o", "Lio/reactivex/F;", "q", "", "p", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pJ */
/* loaded from: classes2.dex */
public interface InterfaceC27246pJ {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pJ$a */
    /* loaded from: classes2.dex */
    public static final class C27247a {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: pJ$a$a */
        /* loaded from: classes2.dex */
        public static final class C27248a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public static final C27248a f103444g = new C27248a();

            public C27248a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: pJ$a$b */
        /* loaded from: classes2.dex */
        public static final class C27249b extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public static final C27249b f103445g = new C27249b();

            public C27249b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        /* renamed from: a */
        public static List<UUID> m19539a(InterfaceC27246pJ interfaceC27246pJ, WireBird receiver) {
            List<UUID> listOf;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!WireBirdKt.isBdCompatible(receiver)) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(GattUuid.BIRD_SERVICE.getUuid());
                return listOf;
            }
            return null;
        }

        public static /* synthetic */ Observable alarm$default(InterfaceC27246pJ interfaceC27246pJ, WireBird wireBird, AlarmType alarmType, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = true;
                }
                if ((i & 8) != 0) {
                    z2 = false;
                }
                return interfaceC27246pJ.mo19544n(wireBird, alarmType, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alarm");
        }

        public static /* synthetic */ Observable connect$default(InterfaceC27246pJ interfaceC27246pJ, Vehicle vehicle, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if (obj == null) {
                boolean z5 = (i & 2) != 0 ? false : z;
                boolean z6 = (i & 4) != 0 ? false : z2;
                if ((i & 8) != 0) {
                    z3 = true;
                }
                return interfaceC27246pJ.mo19540r(vehicle, z5, z6, z3, (i & 16) != 0 ? false : z4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
        }

        public static /* synthetic */ Observable enableDeepSleep$default(InterfaceC27246pJ interfaceC27246pJ, WireBird wireBird, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                return interfaceC27246pJ.mo19554d(wireBird, z, (i & 4) != 0 ? null : c4464ky, (i & 8) != 0 ? null : c38431bE5, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableDeepSleep");
        }

        public static /* synthetic */ Observable enableLights$default(InterfaceC27246pJ interfaceC27246pJ, WireBird wireBird, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z2 = false;
                }
                return interfaceC27246pJ.mo19555c(wireBird, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableLights");
        }

        public static /* synthetic */ Observable flashLights$default(InterfaceC27246pJ interfaceC27246pJ, WireBird wireBird, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 1;
                }
                if ((i2 & 4) != 0) {
                    z = false;
                }
                return interfaceC27246pJ.mo19552f(wireBird, i, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flashLights");
        }

        public static /* synthetic */ Observable lock$default(InterfaceC27246pJ interfaceC27246pJ, WireBird wireBird, boolean z, boolean z2, boolean z3, Function0 function0, int i, Object obj) {
            boolean z4;
            boolean z5;
            boolean z6;
            if (obj == null) {
                if ((i & 2) != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if ((i & 4) != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i & 8) != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                C27248a c27248a = function0;
                if ((i & 16) != 0) {
                    c27248a = C27248a.f103444g;
                }
                return interfaceC27246pJ.mo19553e(wireBird, z4, z5, z6, c27248a);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ Observable scan$default(InterfaceC27246pJ interfaceC27246pJ, WireBird wireBird, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC27246pJ.mo19547k(wireBird, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scan");
        }

        public static /* synthetic */ Observable scanBatch$default(InterfaceC27246pJ interfaceC27246pJ, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 10;
                }
                return interfaceC27246pJ.mo19548j(i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scanBatch");
        }

        public static /* synthetic */ Observable unlock$default(InterfaceC27246pJ interfaceC27246pJ, WireBird wireBird, boolean z, boolean z2, boolean z3, Function0 function0, int i, Object obj) {
            boolean z4;
            boolean z5;
            boolean z6;
            if (obj == null) {
                if ((i & 2) != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if ((i & 4) != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i & 8) != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                C27249b c27249b = function0;
                if ((i & 16) != 0) {
                    c27249b = C27249b.f103445g;
                }
                return interfaceC27246pJ.mo19546l(wireBird, z4, z5, z6, c27249b);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    /* renamed from: a */
    Observable<Boolean> mo19557a(Vehicle vehicle);

    /* renamed from: b */
    void mo19556b(WireBird wireBird);

    /* renamed from: c */
    Observable<Vehicle> mo19555c(WireBird wireBird, boolean z, boolean z2);

    @Deprecated(message = "Use RxBleBirdBluetoothManager#deepSleep ")
    /* renamed from: d */
    Observable<Vehicle> mo19554d(WireBird wireBird, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, boolean z2, boolean z3);

    /* renamed from: e */
    Observable<Vehicle> mo19553e(WireBird wireBird, boolean z, boolean z2, boolean z3, Function0<Boolean> function0);

    /* renamed from: f */
    Observable<Vehicle> mo19552f(WireBird wireBird, int i, boolean z);

    /* renamed from: g */
    void mo19551g(WireBird wireBird, boolean z);

    /* renamed from: h */
    Observable<Vehicle> mo19550h(WireBird wireBird);

    /* renamed from: i */
    void mo19549i(WireBird wireBird);

    /* renamed from: j */
    Observable<List<Vehicle>> mo19548j(int i);

    /* renamed from: k */
    Observable<Vehicle> mo19547k(WireBird wireBird, boolean z);

    /* renamed from: l */
    Observable<Vehicle> mo19546l(WireBird wireBird, boolean z, boolean z2, boolean z3, Function0<Boolean> function0);

    /* renamed from: m */
    Observable<Vehicle> mo19545m(WireBird wireBird);

    /* renamed from: n */
    Observable<Vehicle> mo19544n(WireBird wireBird, AlarmType alarmType, boolean z, boolean z2);

    /* renamed from: o */
    void mo19543o();

    /* renamed from: p */
    AbstractC23442F<String> mo19542p(WireBird wireBird);

    /* renamed from: q */
    AbstractC23442F<Boolean> mo19541q();

    /* renamed from: r */
    Observable<Vehicle> mo19540r(Vehicle vehicle, boolean z, boolean z2, boolean z3, boolean z4);

    void release();
}
