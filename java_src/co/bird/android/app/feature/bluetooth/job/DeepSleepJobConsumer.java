package co.bird.android.app.feature.bluetooth.job;

import co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer;
import co.bird.android.coreinterface.core.job.JobConsumer;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC27246pJ;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;", "Lco/bird/android/coreinterface/core/job/JobConsumer;", "Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;", "payload", "", "n", "LpJ;", "k", "LpJ;", "m", "()LpJ;", "setBluetoothManager", "(LpJ;)V", "bluetoothManager", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DeepSleepJobConsumer extends JobConsumer<DeepSleepPayload> {

    /* renamed from: k */
    public InterfaceC27246pJ f61328k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer$a */
    /* loaded from: classes2.dex */
    public static final class C13693a extends Lambda implements Function1<Vehicle, Unit> {
        public C13693a() {
            super(1);
        }

        /* renamed from: a */
        public final void m60778a(Vehicle it) {
            InterfaceC27246pJ m60783m = DeepSleepJobConsumer.this.m60783m();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            m60783m.mo19557a(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m60778a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "vehicle", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer$b */
    /* loaded from: classes2.dex */
    public static final class C13694b extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public static final C13694b f61330g = new C13694b();

        public C13694b() {
            super(1);
        }

        /* renamed from: a */
        public final void m60777a(Vehicle vehicle) {
            C41318g46.m40151m("Enable deep sleep for vehicle: " + vehicle, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m60777a(vehicle);
            return Unit.INSTANCE;
        }
    }

    public DeepSleepJobConsumer() {
        H22.f12748a.mo24083O2(this);
    }

    /* renamed from: o */
    public static final void m60781o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m60780p(DeepSleepJobConsumer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m60783m().release();
    }

    /* renamed from: q */
    public static final void m60779q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public final InterfaceC27246pJ m60783m() {
        InterfaceC27246pJ interfaceC27246pJ = this.f61328k;
        if (interfaceC27246pJ != null) {
            return interfaceC27246pJ;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bluetoothManager");
        return null;
    }

    @Override // co.bird.android.coreinterface.core.job.JobConsumer
    /* renamed from: n */
    public void handle(DeepSleepPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        InterfaceC27246pJ m60783m = m60783m();
        WireBird m60775b = payload.m60775b();
        boolean m60774c = payload.m60774c();
        String id = payload.m60775b().getId();
        String uuid = UUID.randomUUID().toString();
        EnumC12346bH enumC12346bH = EnumC12346bH.SINGLE;
        String name = enumC12346bH.name();
        String model = payload.m60775b().getModel();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString()");
        C4464KY c4464ky = new C4464KY(null, id, model, null, null, uuid, null, name, null, null, null, 1881, null);
        String id2 = payload.m60775b().getId();
        String uuid2 = UUID.randomUUID().toString();
        String name2 = enumC12346bH.name();
        String name3 = XD5.BLUETOOTH.name();
        String model2 = payload.m60775b().getModel();
        Intrinsics.checkNotNullExpressionValue(uuid2, "toString()");
        Observable enableDeepSleep$default = InterfaceC27246pJ.C27247a.enableDeepSleep$default(m60783m, m60775b, m60774c, c4464ky, new C38431bE5(null, id2, model2, null, null, uuid2, name2, name3, null, null, null, 1817, null), false, false, 48, null);
        final C13693a c13693a = new C13693a();
        Observable doAfterTerminate = enableDeepSleep$default.doAfterNext(new InterfaceC23484g() { // from class: dW0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DeepSleepJobConsumer.m60781o(Function1.this, obj);
            }
        }).doAfterTerminate(new InterfaceC23478a() { // from class: eW0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                DeepSleepJobConsumer.m60780p(DeepSleepJobConsumer.this);
            }
        });
        final C13694b c13694b = C13694b.f61330g;
        doAfterTerminate.doOnNext(new InterfaceC23484g() { // from class: fW0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                DeepSleepJobConsumer.m60779q(Function1.this, obj);
            }
        }).ignoreElements().m33069Q().subscribe();
    }
}
