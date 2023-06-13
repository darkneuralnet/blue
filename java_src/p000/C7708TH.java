package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer;
import co.bird.android.app.feature.bluetooth.job.DeepSleepPayload;
import co.bird.android.buava.Optional;
import co.bird.android.coreinterface.manager.ApiSleepFailure;
import co.bird.android.coreinterface.manager.BirdActionPermissionDenied;
import co.bird.android.coreinterface.manager.BluetoothLockFailure;
import co.bird.android.coreinterface.manager.BluetoothWakeFailure;
import co.bird.android.coreinterface.manager.LockBirdException;
import co.bird.android.coreinterface.manager.PowerlineLockFailure;
import co.bird.android.coreinterface.manager.ToggleLightsException;
import co.bird.android.coreinterface.manager.UpdateRemoteLockStateFailure;
import co.bird.android.model.BirdActionsAndSettings;
import co.bird.android.model.PrivateBirdAction;
import co.bird.android.model.PrivateBirdSetting;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdEvent;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.api.request.BirdSettingsBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.AbstractC26684u0;
import okhttp3.internal.http2.Http2Connection;
import p000.C41318g46;
import p000.C7708TH;
import p000.InterfaceC27246pJ;
import p000.InterfaceC38356b66;
import retrofit2.HttpException;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020>\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010L\u001a\u00020I¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u001a\u001a\n \u0010*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u001d\u001a\n \u0010*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0002J&\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016J\u001f\u0010(\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0000¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J'\u0010+\u001a\n \u0010*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b-\u0010.J\"\u00100\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010/\u001a\u00020\fH\u0016J\u0018\u00101\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\fH\u0016R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006V"}, m28432d2 = {"LTH;", "LgH;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "R", "", "throwable", "Ljava/lang/Exception;", AbstractC26684u0.f100690q, "", "birdId", "", "lock", "Lio/reactivex/F;", "LzT;", "kotlin.jvm.PlatformType", "I0", "x0", "Lio/reactivex/c;", "P0", "S", "birdModel", "sessionId", "K0", "w0", "S0", "y0", "on", "b0", "c0", "v0", "X", "Lco/bird/android/model/BirdActionsAndSettings;", C17296a.f69688o, "Lco/bird/android/model/PrivateBirdSetting;", "settings", DateTokenConverter.CONVERTER_KEY, "powerline", "bluetooth", "z0", "(Lio/reactivex/c;Lio/reactivex/c;)Lio/reactivex/c;", "e", "n0", "(Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/c;", "q0", "(Ljava/lang/String;Z)Lio/reactivex/c;", "sleep", "c", "b", "LpJ;", "LpJ;", "bluetoothManager", "LuL;", "LuL;", "birdEventManager", "LfH;", "LfH;", "birdActionsApi", "Lq54;", "Lq54;", "privateBirdsManager", "LEa;", "LEa;", "analyticsManager", "LQh2;", "f", "LQh2;", "jobProducer", "Li66;", "g", "Li66;", "traceProvider", "LTq4;", "h", "LTq4;", "reactiveConfig", "Lg46$b;", "W", "()Lg46$b;", "logger", "V", "()Z", "forceBluetooth", "<init>", "(LpJ;LuL;LfH;Lq54;LEa;LQh2;Li66;LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TH */
/* loaded from: classes2.dex */
public final class C7708TH implements InterfaceC20792gH {

    /* renamed from: a */
    public final InterfaceC27246pJ f35094a;

    /* renamed from: b */
    public final InterfaceC29169uL f35095b;

    /* renamed from: c */
    public final InterfaceC20345fH f35096c;

    /* renamed from: d */
    public final InterfaceC47256q54 f35097d;

    /* renamed from: e */
    public final InterfaceC1880Ea f35098e;

    /* renamed from: f */
    public final InterfaceC35422Qh2 f35099f;

    /* renamed from: g */
    public final InterfaceC42524i66 f35100g;

    /* renamed from: h */
    public final C36207Tq4 f35101h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdEvent;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBirdEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$A */
    /* loaded from: classes2.dex */
    public static final class C7709A extends Lambda implements Function1<WireBirdEvent, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f35102g;

        /* renamed from: h */
        public final /* synthetic */ boolean f35103h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7709A(String str, boolean z) {
            super(1);
            this.f35102g = str;
            this.f35103h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireBirdEvent it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it.getBirdId(), this.f35102g) && it.getValue() == this.f35103h) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$B */
    /* loaded from: classes2.dex */
    public static final class C7710B extends Lambda implements Function1<Throwable, Unit> {
        public C7710B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7708TH.this.m84072W().mo7221o("[powerline] Failed to receive push notification before timeout", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$C */
    /* loaded from: classes2.dex */
    public static final class C7711C extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ String f35106h;

        /* renamed from: i */
        public final /* synthetic */ String f35107i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7711C(String str, String str2) {
            super(1);
            this.f35106h = str;
            this.f35107i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return InterfaceC27246pJ.C27247a.enableDeepSleep$default(C7708TH.this.f35094a, bird, false, new C4464KY(null, bird.getId(), this.f35106h, null, null, this.f35107i, null, EnumC12346bH.SINGLE.name(), null, null, null, 1881, null), null, false, false, 24, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "LzT;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$D */
    /* loaded from: classes2.dex */
    public static final class C7712D extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends C31014zT>> {

        /* renamed from: h */
        public final /* synthetic */ String f35109h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7712D(String str) {
            super(1);
            this.f35109h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends C31014zT> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C7708TH.this.f35096c.m41627g(new C9395XG(this.f35109h, false));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "LzT;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$E */
    /* loaded from: classes2.dex */
    public static final class C7713E extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends C31014zT>> {
        public C7713E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends C31014zT> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return AbstractC23442F.m33100x(C7708TH.this.m84024y0(throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "privateBirds", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdActionsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdActionsManagerImpl.kt\nco/bird/android/app/manager/BirdActionsManagerImpl$findPrivateBird$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
    /* renamed from: TH$a */
    /* loaded from: classes2.dex */
    public static final class C7714a extends Lambda implements Function1<Optional<List<? extends WireBird>>, InterfaceC23447K<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ String f35111g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7714a(String str) {
            super(1);
            this.f35111g = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireBird> invoke(Optional<List<WireBird>> privateBirds) {
            WireBird copy;
            Intrinsics.checkNotNullParameter(privateBirds, "privateBirds");
            List<WireBird> m59035e = privateBirds.m59035e();
            WireBird wireBird = null;
            if (m59035e != null) {
                String str = this.f35111g;
                Iterator<T> it = m59035e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((WireBird) next).getId(), str)) {
                        wireBird = next;
                        break;
                    }
                }
                wireBird = wireBird;
            }
            WireBird wireBird2 = wireBird;
            if (wireBird2 == null) {
                return AbstractC23442F.m33100x(new IllegalArgumentException("You can only get actions for birds you rent, or own."));
            }
            copy = wireBird2.copy((r91 & 1) != 0 ? wireBird2.f66717id : null, (r91 & 2) != 0 ? wireBird2.model : null, (r91 & 4) != 0 ? wireBird2.taskId : null, (r91 & 8) != 0 ? wireBird2.batteryLevel : 0, (r91 & 16) != 0 ? wireBird2.estimatedRange : null, (r91 & 32) != 0 ? wireBird2.distance : 0, (r91 & 64) != 0 ? wireBird2.location : null, (r91 & 128) != 0 ? wireBird2.code : null, (r91 & 256) != 0 ? wireBird2.stickerId : null, (r91 & 512) != 0 ? wireBird2.serialNumber : null, (r91 & 1024) != 0 ? wireBird2.disconnected : false, (r91 & 2048) != 0 ? wireBird2.collect : false, (r91 & 4096) != 0 ? wireBird2.submerged : false, (r91 & 8192) != 0 ? wireBird2.lost : false, (r91 & 16384) != 0 ? wireBird2.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird2.ackLocked : false, (r91 & 65536) != 0 ? wireBird2.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird2.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird2.broken : false, (r91 & 524288) != 0 ? wireBird2.label : null, (r91 & 1048576) != 0 ? wireBird2.actions : null, (r91 & 2097152) != 0 ? wireBird2.bountyId : null, (r91 & 4194304) != 0 ? wireBird2.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird2.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird2.bountyLost : false, (r91 & 33554432) != 0 ? wireBird2.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird2.bountyKind : null, (r91 & 134217728) != 0 ? wireBird2.brandName : null, (r91 & 268435456) != 0 ? wireBird2.taskKind : null, (r91 & 536870912) != 0 ? wireBird2.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird2.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird2.token : null, (r92 & 1) != 0 ? wireBird2.bluetooth : true, (r92 & 2) != 0 ? wireBird2.cellular : false, (r92 & 4) != 0 ? wireBird2.startedAt : null, (r92 & 8) != 0 ? wireBird2.dueAt : null, (r92 & 16) != 0 ? wireBird2.asleep : false, (r92 & 32) != 0 ? wireBird2.imei : null, (r92 & 64) != 0 ? wireBird2.boardProtocol : null, (r92 & 128) != 0 ? wireBird2.physicalLock : null, (r92 & 256) != 0 ? wireBird2.priorityCollect : false, (r92 & 512) != 0 ? wireBird2.down : false, (r92 & 1024) != 0 ? wireBird2.needsInspection : false, (r92 & 2048) != 0 ? wireBird2.partnerId : null, (r92 & 4096) != 0 ? wireBird2.nestId : null, (r92 & 8192) != 0 ? wireBird2.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird2.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird2.peril : false, (r92 & 65536) != 0 ? wireBird2.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird2.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird2.offline : false, (r92 & 524288) != 0 ? wireBird2.license : null, (r92 & 1048576) != 0 ? wireBird2.areaKey : null, (r92 & 2097152) != 0 ? wireBird2.fleetId : null, (r92 & 4194304) != 0 ? wireBird2.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird2.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird2.scannedAt : null, (r92 & 33554432) != 0 ? wireBird2.badgeType : null, (r92 & 67108864) != 0 ? wireBird2.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird2.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? wireBird2.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird2.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird2.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird2.bleMacAddress : null, (r93 & 1) != 0 ? wireBird2.cellId : null, (r93 & 2) != 0 ? wireBird2.externalFeedType : null);
            return AbstractC23442F.m33158H(copy);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "doesOwnOrRent", "Lio/reactivex/K;", "Lco/bird/android/model/BirdActionsAndSettings;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$b */
    /* loaded from: classes2.dex */
    public static final class C7715b extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends BirdActionsAndSettings>> {

        /* renamed from: h */
        public final /* synthetic */ String f35113h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LT24;", "it", "Lco/bird/android/model/BirdActionsAndSettings;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LT24;)Lco/bird/android/model/BirdActionsAndSettings;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TH$b$a */
        /* loaded from: classes2.dex */
        public static final class C7716a extends Lambda implements Function1<T24, BirdActionsAndSettings> {

            /* renamed from: g */
            public static final C7716a f35114g = new C7716a();

            public C7716a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final BirdActionsAndSettings invoke(T24 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new BirdActionsAndSettings(it.m84407b(), it.m84406c());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7715b(String str) {
            super(1);
            this.f35113h = str;
        }

        /* renamed from: c */
        public static final BirdActionsAndSettings m84015c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (BirdActionsAndSettings) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends BirdActionsAndSettings> invoke(Boolean doesOwnOrRent) {
            Intrinsics.checkNotNullParameter(doesOwnOrRent, "doesOwnOrRent");
            if (!doesOwnOrRent.booleanValue()) {
                return AbstractC23442F.m33100x(new IllegalArgumentException("You can only get actions for birds you rent, or own."));
            }
            AbstractC23442F<T24> m33146T = C7708TH.this.f35096c.m41632b(this.f35113h).m33146T(1L);
            final C7716a c7716a = C7716a.f35114g;
            return m33146T.m33157I(new InterfaceC23492o() { // from class: UH
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    BirdActionsAndSettings m84015c;
                    m84015c = C7708TH.C7715b.m84015c(Function1.this, obj);
                    return m84015c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$c */
    /* loaded from: classes2.dex */
    public static final class C7717c extends Lambda implements Function1<WireBird, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ boolean f35116h;

        /* renamed from: i */
        public final /* synthetic */ String f35117i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7717c(boolean z, String str) {
            super(1);
            this.f35116h = z;
            this.f35117i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            if (C7708TH.this.m84074V()) {
                return C7708TH.this.m84067b0(bird, this.f35116h);
            }
            C7708TH c7708th = C7708TH.this;
            AbstractC23461c m33159G = c7708th.m84066c0(this.f35117i, this.f35116h).m33159G();
            Intrinsics.checkNotNullExpressionValue(m33159G, "lightsPowerline(birdId, on).ignoreElement()");
            AbstractC23461c m84067b0 = C7708TH.this.m84067b0(bird, this.f35116h);
            Intrinsics.checkNotNullExpressionValue(m84067b0, "lightsBluetooth(bird = bird, on = on)");
            return c7708th.m84022z0(m33159G, m84067b0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "throwable", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$d */
    /* loaded from: classes2.dex */
    public static final class C7718d extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ boolean f35118g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7718d(boolean z) {
            super(1);
            this.f35118g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return AbstractC23461c.m33080F(new ToggleLightsException(this.f35118g, throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "LzT;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$e */
    /* loaded from: classes2.dex */
    public static final class C7719e extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends C31014zT>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f35120h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7719e(boolean z) {
            super(1);
            this.f35120h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends C31014zT> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C41318g46.AbstractC20723b m84072W = C7708TH.this.m84072W();
            String str = this.f35120h ? "on" : "off";
            m84072W.mo7214x("Failed to turn lights " + str + " through powerline.", new Object[0]);
            return AbstractC23442F.m33100x(C7708TH.this.m84030v0(throwable, this.f35120h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$f */
    /* loaded from: classes2.dex */
    public static final class C7720f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC38356b66 f35121g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7720f(InterfaceC38356b66 interfaceC38356b66) {
            super(1);
            this.f35121g = interfaceC38356b66;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC38356b66.C12294a.incrementMetric$default(this.f35121g, "failures_occurred", 0L, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$g */
    /* loaded from: classes2.dex */
    public static final class C7721g extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f35122g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC38356b66 f35123h;

        /* renamed from: i */
        public final /* synthetic */ C7708TH f35124i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7721g(boolean z, InterfaceC38356b66 interfaceC38356b66, C7708TH c7708th) {
            super(1);
            this.f35122g = z;
            this.f35123h = interfaceC38356b66;
            this.f35124i = c7708th;
        }

        /* renamed from: a */
        public final void m84011a(WireBird bird) {
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            if (WireBirdKt.isAsleep(bird) || !this.f35122g) {
                this.f35123h.mo64961b("requested_wake", "true");
                this.f35124i.m84082R(bird);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m84011a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$h */
    /* loaded from: classes2.dex */
    public static final class C7722h extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends WireBird>> {

        /* renamed from: h */
        public final /* synthetic */ String f35126h;

        /* renamed from: i */
        public final /* synthetic */ boolean f35127i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC38356b66 f35128j;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TH$h$a */
        /* loaded from: classes2.dex */
        public static final class C7723a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC38356b66 f35129g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7723a(InterfaceC38356b66 interfaceC38356b66) {
                super(1);
                this.f35129g = interfaceC38356b66;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC38356b66.C12294a.incrementMetric$default(this.f35129g, "failures_occurred", 0L, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7722h(String str, boolean z, InterfaceC38356b66 interfaceC38356b66) {
            super(1);
            this.f35126h = str;
            this.f35127i = z;
            this.f35128j = interfaceC38356b66;
        }

        /* renamed from: d */
        public static final WireBird m84007d(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "$bird");
            return bird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends WireBird> invoke(final WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23461c m84040q0 = C7708TH.this.m84040q0(this.f35126h, this.f35127i);
            final C7723a c7723a = new C7723a(this.f35128j);
            return m84040q0.m33084B(new InterfaceC23484g() { // from class: VH
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7708TH.C7722h.invoke$lambda$0(Function1.this, obj);
                }
            }).m33065U(3L).m33048i0(new Callable() { // from class: WH
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    WireBird m84007d;
                    m84007d = C7708TH.C7722h.m84007d(WireBird.this);
                    return m84007d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "j", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$i */
    /* loaded from: classes2.dex */
    public static final class C7724i extends Lambda implements Function1<WireBird, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ boolean f35131h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC38356b66 f35132i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TH$i$a */
        /* loaded from: classes2.dex */
        public static final class C7725a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C7708TH f35133g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7725a(C7708TH c7708th) {
                super(1);
                this.f35133g = c7708th;
            }

            /* renamed from: a */
            public final void m83988a(InterfaceC23465c interfaceC23465c) {
                this.f35133g.m84072W().mo7221o("Starting bluetooth locking/unlocking", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m83988a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TH$i$b */
        /* loaded from: classes2.dex */
        public static final class C7726b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC38356b66 f35134g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7726b(InterfaceC38356b66 interfaceC38356b66) {
                super(1);
                this.f35134g = interfaceC38356b66;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC38356b66.C12294a.incrementMetric$default(this.f35134g, "failures_occurred", 0L, 2, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TH$i$c */
        /* loaded from: classes2.dex */
        public static final class C7727c extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C7708TH f35135g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7727c(C7708TH c7708th) {
                super(1);
                this.f35135g = c7708th;
            }

            /* renamed from: a */
            public final void m83987a(InterfaceC23465c interfaceC23465c) {
                this.f35135g.m84072W().mo7221o("Awaiting powerline acknowledgement.", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m83987a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TH$i$d */
        /* loaded from: classes2.dex */
        public static final class C7728d extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC38356b66 f35136g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7728d(InterfaceC38356b66 interfaceC38356b66) {
                super(1);
                this.f35136g = interfaceC38356b66;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC38356b66.C12294a.incrementMetric$default(this.f35136g, "failures_occurred", 0L, 2, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TH$i$e */
        /* loaded from: classes2.dex */
        public static final class C7729e extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C7708TH f35137g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7729e(C7708TH c7708th) {
                super(1);
                this.f35137g = c7708th;
            }

            /* renamed from: a */
            public final void m83986a(InterfaceC23465c interfaceC23465c) {
                this.f35137g.m84072W().mo7221o("Starting bluetooth locking/unlocking", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m83986a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TH$i$f */
        /* loaded from: classes2.dex */
        public static final class C7730f extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC38356b66 f35138g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7730f(InterfaceC38356b66 interfaceC38356b66) {
                super(1);
                this.f35138g = interfaceC38356b66;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC38356b66.C12294a.incrementMetric$default(this.f35138g, "failures_occurred", 0L, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7724i(boolean z, InterfaceC38356b66 interfaceC38356b66) {
            super(1);
            this.f35131h = z;
            this.f35132i = interfaceC38356b66;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final void m83996k(InterfaceC38356b66 lockTrace) {
            Intrinsics.checkNotNullParameter(lockTrace, "$lockTrace");
            lockTrace.mo64961b("bluetooth", "true");
        }

        /* renamed from: l */
        public static final void m83995l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: m */
        public static final void m83994m(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: n */
        public static final void m83993n(InterfaceC38356b66 lockTrace) {
            Intrinsics.checkNotNullParameter(lockTrace, "$lockTrace");
            lockTrace.mo64961b("powerline", "true");
        }

        /* renamed from: o */
        public static final void m83992o(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: p */
        public static final void m83991p(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: q */
        public static final void m83990q(InterfaceC38356b66 lockTrace) {
            Intrinsics.checkNotNullParameter(lockTrace, "$lockTrace");
            lockTrace.mo64961b("bluetooth", "true");
        }

        /* renamed from: r */
        public static final void m83989r(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: j */
        public final InterfaceC23496h invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            if (C7708TH.this.m84074V()) {
                AbstractC23461c m84046n0 = C7708TH.this.m84046n0(bird, this.f35131h);
                final C7725a c7725a = new C7725a(C7708TH.this);
                AbstractC23461c m33070P = m84046n0.m33081E(new InterfaceC23484g() { // from class: XH
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C7708TH.C7724i.invoke$lambda$0(Function1.this, obj);
                    }
                }).m33070P(C24542a.m31932c());
                final InterfaceC38356b66 interfaceC38356b66 = this.f35132i;
                AbstractC23461c m33029z = m33070P.m33029z(new InterfaceC23478a() { // from class: YH
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C7708TH.C7724i.m83996k(InterfaceC38356b66.this);
                    }
                });
                final C7726b c7726b = new C7726b(this.f35132i);
                return m33029z.m33084B(new InterfaceC23484g() { // from class: ZH
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C7708TH.C7724i.m83995l(Function1.this, obj);
                    }
                });
            }
            C7708TH c7708th = C7708TH.this;
            AbstractC23461c m84085P0 = c7708th.m84085P0(bird.getId(), this.f35131h);
            final C7727c c7727c = new C7727c(C7708TH.this);
            AbstractC23461c m33070P2 = m84085P0.m33081E(new InterfaceC23484g() { // from class: aI
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7708TH.C7724i.m83994m(Function1.this, obj);
                }
            }).m33070P(C24542a.m31932c());
            final InterfaceC38356b66 interfaceC38356b662 = this.f35132i;
            AbstractC23461c m33029z2 = m33070P2.m33029z(new InterfaceC23478a() { // from class: bI
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C7708TH.C7724i.m83993n(InterfaceC38356b66.this);
                }
            });
            final C7728d c7728d = new C7728d(this.f35132i);
            AbstractC23461c m33084B = m33029z2.m33084B(new InterfaceC23484g() { // from class: cI
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7708TH.C7724i.m83992o(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33084B, "override fun lock(birdId… { lockTrace.stop() }\n  }");
            AbstractC23461c m84046n02 = C7708TH.this.m84046n0(bird, this.f35131h);
            final C7729e c7729e = new C7729e(C7708TH.this);
            AbstractC23461c m33070P3 = m84046n02.m33081E(new InterfaceC23484g() { // from class: dI
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7708TH.C7724i.m83991p(Function1.this, obj);
                }
            }).m33070P(C24542a.m31932c());
            final InterfaceC38356b66 interfaceC38356b663 = this.f35132i;
            AbstractC23461c m33029z3 = m33070P3.m33029z(new InterfaceC23478a() { // from class: eI
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C7708TH.C7724i.m83990q(InterfaceC38356b66.this);
                }
            });
            final C7730f c7730f = new C7730f(this.f35132i);
            AbstractC23461c m33084B2 = m33029z3.m33084B(new InterfaceC23484g() { // from class: fI
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7708TH.C7724i.m83989r(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33084B2, "override fun lock(birdId… { lockTrace.stop() }\n  }");
            return c7708th.m84022z0(m33084B, m33084B2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "throwable", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$j */
    /* loaded from: classes2.dex */
    public static final class C7731j extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ boolean f35139g;

        /* renamed from: h */
        public final /* synthetic */ String f35140h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7731j(boolean z, String str) {
            super(1);
            this.f35139g = z;
            this.f35140h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable throwable) {
            String str;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (this.f35139g) {
                str = "lock";
            } else {
                str = "unlock";
            }
            String str2 = this.f35140h;
            return AbstractC23461c.m33080F(new LockBirdException("Failure to " + str + " bird " + str2, throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$k */
    /* loaded from: classes2.dex */
    public static final class C7732k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC38356b66 f35141g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7732k(InterfaceC38356b66 interfaceC38356b66) {
            super(1);
            this.f35141g = interfaceC38356b66;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f35141g.mo64961b("success", "false");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "LzT;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$l */
    /* loaded from: classes2.dex */
    public static final class C7733l extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends C31014zT>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f35143h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f35144i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7733l(boolean z, WireBird wireBird) {
            super(1);
            this.f35143h = z;
            this.f35144i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends C31014zT> invoke(Vehicle it) {
            String str;
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.AbstractC20723b m84072W = C7708TH.this.m84072W();
            if (this.f35143h) {
                str = "locked";
            } else {
                str = "unlocked";
            }
            m84072W.mo7221o("[bluetooth] Updating server that we " + str + " the bird", new Object[0]);
            return C7708TH.this.m84099I0(this.f35144i.getId(), this.f35143h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/B;", "LzT;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$m */
    /* loaded from: classes2.dex */
    public static final class C7734m extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends C31014zT>> {
        public C7734m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends C31014zT> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return Observable.error(C7708TH.this.m84032u0(throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$n */
    /* loaded from: classes2.dex */
    public static final class C7735n extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f35147h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7735n(boolean z) {
            super(1);
            this.f35147h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.AbstractC20723b m84072W = C7708TH.this.m84072W();
            String str = this.f35147h ? "lock" : "unlock";
            m84072W.mo7221o("[powerline] FAILED to send " + str + " request to API", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "throwable", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$o */
    /* loaded from: classes2.dex */
    public static final class C7736o extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: g */
        public static final C7736o f35148g = new C7736o();

        public C7736o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return AbstractC23461c.m33080F(new PowerlineLockFailure(throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$p */
    /* loaded from: classes2.dex */
    public static final class C7737p extends Lambda implements Function1<Unit, Unit> {
        public C7737p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C7708TH.this.m84072W().mo7221o("Successfully performed action through powerline.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$q */
    /* loaded from: classes2.dex */
    public static final class C7738q extends Lambda implements Function1<Throwable, Unit> {
        public C7738q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7708TH.this.m84072W().mo7220p(th, "Failed to perform action through powerline.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$r */
    /* loaded from: classes2.dex */
    public static final class C7739r extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Unit>> {

        /* renamed from: g */
        public static final C7739r f35151g = new C7739r();

        public C7739r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$s */
    /* loaded from: classes2.dex */
    public static final class C7740s extends Lambda implements Function1<Unit, Unit> {
        public C7740s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C7708TH.this.m84072W().mo7221o("Successfully performed action through bluetooth.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$t */
    /* loaded from: classes2.dex */
    public static final class C7741t extends Lambda implements Function1<Throwable, Unit> {
        public C7741t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7708TH.this.m84072W().mo7220p(th, "Failed to perform action through bluetooth.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$u */
    /* loaded from: classes2.dex */
    public static final class C7742u extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Unit>> {

        /* renamed from: g */
        public static final C7742u f35154g = new C7742u();

        public C7742u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "LzT;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$v */
    /* loaded from: classes2.dex */
    public static final class C7743v extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends C31014zT>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f35156h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7743v(boolean z) {
            super(1);
            this.f35156h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends C31014zT> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return AbstractC23442F.m33100x(C7708TH.this.m84026x0(this.f35156h, throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LzT;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LzT;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$w */
    /* loaded from: classes2.dex */
    public static final class C7744w extends Lambda implements Function1<C31014zT, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C38431bE5 f35157g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7744w(C38431bE5 c38431bE5) {
            super(1);
            this.f35157g = c38431bE5;
        }

        /* renamed from: a */
        public final void m83982a(C31014zT c31014zT) {
            C39024cE5.toSleepEndedEvent$default(this.f35157g, true, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C31014zT c31014zT) {
            m83982a(c31014zT);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TH$x */
    /* loaded from: classes2.dex */
    public static final class C7745x extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C38431bE5 f35158g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7745x(C38431bE5 c38431bE5) {
            super(1);
            this.f35158g = c38431bE5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C39024cE5.toSleepEndedEvent$default(this.f35158g, false, null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "throwable", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$y */
    /* loaded from: classes2.dex */
    public static final class C7746y extends Lambda implements Function1<Throwable, InterfaceC23496h> {
        public C7746y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return AbstractC23461c.m33080F(C7708TH.this.m84028w0(throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "doesOwnOrRent", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TH$z */
    /* loaded from: classes2.dex */
    public static final class C7747z extends Lambda implements Function1<Boolean, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f35161h;

        /* renamed from: i */
        public final /* synthetic */ PrivateBirdSetting f35162i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7747z(String str, PrivateBirdSetting privateBirdSetting) {
            super(1);
            this.f35161h = str;
            this.f35162i = privateBirdSetting;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean doesOwnOrRent) {
            Intrinsics.checkNotNullParameter(doesOwnOrRent, "doesOwnOrRent");
            return !doesOwnOrRent.booleanValue() ? AbstractC23461c.m33080F(new IllegalArgumentException("You can only get actions for birds you rent, or own.")) : C7708TH.this.f35096c.m41629e(new BirdSettingsBody(this.f35161h, this.f35162i)).m33146T(1L).m33159G();
        }
    }

    public C7708TH(InterfaceC27246pJ bluetoothManager, InterfaceC29169uL birdEventManager, InterfaceC20345fH birdActionsApi, InterfaceC47256q54 privateBirdsManager, InterfaceC1880Ea analyticsManager, InterfaceC35422Qh2 jobProducer, InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(birdEventManager, "birdEventManager");
        Intrinsics.checkNotNullParameter(birdActionsApi, "birdActionsApi");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(jobProducer, "jobProducer");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f35094a = bluetoothManager;
        this.f35095b = birdEventManager;
        this.f35096c = birdActionsApi;
        this.f35097d = privateBirdsManager;
        this.f35098e = analyticsManager;
        this.f35099f = jobProducer;
        this.f35100g = traceProvider;
        this.f35101h = reactiveConfig;
    }

    /* renamed from: A0 */
    public static final Unit m84115A0() {
        return Unit.INSTANCE;
    }

    /* renamed from: B0 */
    public static final void m84113B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m84111C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final InterfaceC23434B m84109D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final Unit m84107E0() {
        return Unit.INSTANCE;
    }

    /* renamed from: F0 */
    public static final void m84105F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final void m84103G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final InterfaceC23434B m84101H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final InterfaceC23447K m84097J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m84093L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m84091M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final InterfaceC23496h m84089N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final InterfaceC23496h m84087O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final boolean m84083Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: R0 */
    public static final void m84081R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m84078T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final InterfaceC23434B m84077T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m84076U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final InterfaceC23447K m84075U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final InterfaceC23447K m84073V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23496h m84070Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m84069Z(C7708TH this$0, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.AbstractC20723b m84072W = this$0.m84072W();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        m84072W.mo7221o("Successfully turned lights " + str + " through powerline.", new Object[0]);
    }

    /* renamed from: a0 */
    public static final InterfaceC23496h m84068a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m84065d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m84064e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m84062f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23447K m84060g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final InterfaceC23496h m84058h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC23496h m84056i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m84054j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m84052k0(InterfaceC38356b66 lockTrace) {
        Intrinsics.checkNotNullParameter(lockTrace, "$lockTrace");
        lockTrace.mo64961b("success", "false");
    }

    /* renamed from: l0 */
    public static final void m84050l0(InterfaceC38356b66 lockTrace) {
        Intrinsics.checkNotNullParameter(lockTrace, "$lockTrace");
        lockTrace.mo64961b("success", "true");
    }

    /* renamed from: m0 */
    public static final void m84048m0(InterfaceC38356b66 lockTrace) {
        Intrinsics.checkNotNullParameter(lockTrace, "$lockTrace");
        lockTrace.stop();
    }

    /* renamed from: o0 */
    public static final InterfaceC23447K m84044o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23434B m84042p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m84038r0(C7708TH this$0, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.AbstractC20723b m84072W = this$0.m84072W();
        if (z) {
            str = "lock";
        } else {
            str = "unlock";
        }
        m84072W.mo7221o("[powerline] Successfully sent " + str + " request to API", new Object[0]);
    }

    /* renamed from: s0 */
    public static final void m84036s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC23496h m84034t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public final AbstractC23442F<C31014zT> m84099I0(String str, boolean z) {
        AbstractC23442F<C31014zT> m41626h = this.f35096c.m41626h(new C8973WG(str, z));
        final C7743v c7743v = new C7743v(z);
        AbstractC23442F<C31014zT> m33150P = m41626h.m33150P(new InterfaceC23492o() { // from class: MH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84097J0;
                m84097J0 = C7708TH.m84097J0(Function1.this, obj);
                return m84097J0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "private fun sendUpdateLo…ror(lock, throwable))\n  }");
        return m33150P;
    }

    /* renamed from: K0 */
    public final AbstractC23461c m84095K0(String str, String str2, String str3) {
        C38431bE5 c38431bE5 = new C38431bE5(null, str, str2, null, null, str3, EnumC12346bH.SINGLE.name(), XD5.API.name(), null, null, null, 1817, null);
        this.f35098e.mo55905y(c38431bE5);
        AbstractC23442F<C31014zT> m33146T = this.f35096c.m41628f(new C13483cH(str)).m33146T(3L);
        final C7744w c7744w = new C7744w(c38431bE5);
        AbstractC23442F<C31014zT> m33101w = m33146T.m33101w(new InterfaceC23484g() { // from class: CH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84093L0(Function1.this, obj);
            }
        });
        final C7745x c7745x = new C7745x(c38431bE5);
        AbstractC23461c m33159G = m33101w.m33106t(new InterfaceC23484g() { // from class: EH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84091M0(Function1.this, obj);
            }
        }).m33159G();
        final C7746y c7746y = new C7746y();
        AbstractC23461c m33067S = m33159G.m33067S(new InterfaceC23492o() { // from class: FH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84089N0;
                m84089N0 = C7708TH.m84089N0(Function1.this, obj);
                return m84089N0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33067S, "private fun sleepApi(bir…piError(throwable)) }\n  }");
        return m33067S;
    }

    /* renamed from: P0 */
    public final AbstractC23461c m84085P0(String str, boolean z) {
        Observable<WireBirdEvent> mo6980c = this.f35095b.mo6980c();
        final C7709A c7709a = new C7709A(str, z);
        AbstractC23442F<WireBirdEvent> firstOrError = mo6980c.filter(new InterfaceC23494q() { // from class: hH
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m84083Q0;
                m84083Q0 = C7708TH.m84083Q0(Function1.this, obj);
                return m84083Q0;
            }
        }).timeout(30L, TimeUnit.SECONDS).firstOrError();
        final C7710B c7710b = new C7710B();
        AbstractC23461c m33159G = firstOrError.m33106t(new InterfaceC23484g() { // from class: sH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84081R0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun waitForLockE…   }\n    .ignoreElement()");
        return m33159G;
    }

    /* renamed from: R */
    public final void m84082R(WireBird wireBird) {
        WireBird copy;
        C41318g46.AbstractC20723b m84072W = m84072W();
        String id = wireBird.getId();
        m84072W.mo7221o("Submitting job to wake up bird: " + id, new Object[0]);
        InterfaceC35422Qh2 interfaceC35422Qh2 = this.f35099f;
        copy = wireBird.copy((r91 & 1) != 0 ? wireBird.f66717id : null, (r91 & 2) != 0 ? wireBird.model : null, (r91 & 4) != 0 ? wireBird.taskId : null, (r91 & 8) != 0 ? wireBird.batteryLevel : 0, (r91 & 16) != 0 ? wireBird.estimatedRange : null, (r91 & 32) != 0 ? wireBird.distance : 0, (r91 & 64) != 0 ? wireBird.location : null, (r91 & 128) != 0 ? wireBird.code : null, (r91 & 256) != 0 ? wireBird.stickerId : null, (r91 & 512) != 0 ? wireBird.serialNumber : null, (r91 & 1024) != 0 ? wireBird.disconnected : false, (r91 & 2048) != 0 ? wireBird.collect : false, (r91 & 4096) != 0 ? wireBird.submerged : false, (r91 & 8192) != 0 ? wireBird.lost : false, (r91 & 16384) != 0 ? wireBird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.ackLocked : false, (r91 & 65536) != 0 ? wireBird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.broken : false, (r91 & 524288) != 0 ? wireBird.label : null, (r91 & 1048576) != 0 ? wireBird.actions : null, (r91 & 2097152) != 0 ? wireBird.bountyId : null, (r91 & 4194304) != 0 ? wireBird.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.bountyLost : false, (r91 & 33554432) != 0 ? wireBird.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird.bountyKind : null, (r91 & 134217728) != 0 ? wireBird.brandName : null, (r91 & 268435456) != 0 ? wireBird.taskKind : null, (r91 & 536870912) != 0 ? wireBird.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird.token : null, (r92 & 1) != 0 ? wireBird.bluetooth : true, (r92 & 2) != 0 ? wireBird.cellular : false, (r92 & 4) != 0 ? wireBird.startedAt : null, (r92 & 8) != 0 ? wireBird.dueAt : null, (r92 & 16) != 0 ? wireBird.asleep : true, (r92 & 32) != 0 ? wireBird.imei : null, (r92 & 64) != 0 ? wireBird.boardProtocol : null, (r92 & 128) != 0 ? wireBird.physicalLock : null, (r92 & 256) != 0 ? wireBird.priorityCollect : false, (r92 & 512) != 0 ? wireBird.down : false, (r92 & 1024) != 0 ? wireBird.needsInspection : false, (r92 & 2048) != 0 ? wireBird.partnerId : null, (r92 & 4096) != 0 ? wireBird.nestId : null, (r92 & 8192) != 0 ? wireBird.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.peril : false, (r92 & 65536) != 0 ? wireBird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.offline : false, (r92 & 524288) != 0 ? wireBird.license : null, (r92 & 1048576) != 0 ? wireBird.areaKey : null, (r92 & 2097152) != 0 ? wireBird.fleetId : null, (r92 & 4194304) != 0 ? wireBird.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.scannedAt : null, (r92 & 33554432) != 0 ? wireBird.badgeType : null, (r92 & 67108864) != 0 ? wireBird.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? wireBird.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird.bleMacAddress : null, (r93 & 1) != 0 ? wireBird.cellId : null, (r93 & 2) != 0 ? wireBird.externalFeedType : null);
        interfaceC35422Qh2.mo86442a(new DeepSleepPayload(copy, false), Reflection.getOrCreateKotlinClass(DeepSleepJobConsumer.class));
    }

    /* renamed from: S */
    public final AbstractC23442F<WireBird> m84080S(String str) {
        AbstractC23442F<Optional<List<WireBird>>> firstOrError = this.f35097d.mo18213a().observeOn(C24542a.m31934a()).firstOrError();
        final C7714a c7714a = new C7714a(str);
        AbstractC23442F m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: BH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84078T;
                m84078T = C7708TH.m84078T(Function1.this, obj);
                return m84078T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "birdId: String): Single<…th = true))\n      }\n    }");
        return m33165A;
    }

    /* renamed from: S0 */
    public final AbstractC23461c m84079S0(String str, String str2, String str3) {
        AbstractC23442F<WireBird> m84080S = m84080S(str);
        final C7711C c7711c = new C7711C(str2, str3);
        Observable<R> m33162D = m84080S.m33162D(new InterfaceC23492o() { // from class: pH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m84077T0;
                m84077T0 = C7708TH.m84077T0(Function1.this, obj);
                return m84077T0;
            }
        });
        final C7712D c7712d = new C7712D(str);
        AbstractC23442F firstOrError = m33162D.flatMapSingle(new InterfaceC23492o() { // from class: qH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84075U0;
                m84075U0 = C7708TH.m84075U0(Function1.this, obj);
                return m84075U0;
            }
        }).firstOrError();
        final C7713E c7713e = new C7713E();
        return firstOrError.m33150P(new InterfaceC23492o() { // from class: rH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84073V0;
                m84073V0 = C7708TH.m84073V0(Function1.this, obj);
                return m84073V0;
            }
        }).m33159G();
    }

    /* renamed from: V */
    public final boolean m84074V() {
        return this.f35101h.m82623f8().m73665a().getPrivateBirdConfig().getMobileConfig().getEnableBluetoothActions();
    }

    /* renamed from: W */
    public final C41318g46.AbstractC20723b m84072W() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("bird-actions-manager");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"bird-actions-manager\")");
        return m40153k;
    }

    /* renamed from: X */
    public final boolean m84071X(Throwable th) {
        if (!(th instanceof HttpException) || ((HttpException) th).m15616a() != 403) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC20792gH
    /* renamed from: a */
    public AbstractC23442F<BirdActionsAndSettings> mo39771a(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<Boolean> m33152N = this.f35097d.mo18208f(birdId).m33152N(C24542a.m31932c());
        final C7715b c7715b = new C7715b(birdId);
        AbstractC23442F m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: oH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84076U;
                m84076U = C7708TH.m84076U(Function1.this, obj);
                return m84076U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun getActionsS…)\n        }\n      }\n    }");
        return m33165A;
    }

    @Override // p000.InterfaceC20792gH
    /* renamed from: b */
    public AbstractC23461c mo39770b(String birdId, final boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<WireBird> m84080S = m84080S(birdId);
        final C7717c c7717c = new C7717c(z, birdId);
        AbstractC23461c m33029z = m84080S.m33164B(new InterfaceC23492o() { // from class: lH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84070Y;
                m84070Y = C7708TH.m84070Y(Function1.this, obj);
                return m84070Y;
            }
        }).m33029z(new InterfaceC23478a() { // from class: mH
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C7708TH.m84069Z(C7708TH.this, z);
            }
        });
        final C7718d c7718d = new C7718d(z);
        AbstractC23461c m33067S = m33029z.m33067S(new InterfaceC23492o() { // from class: nH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84068a0;
                m84068a0 = C7708TH.m84068a0(Function1.this, obj);
                return m84068a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33067S, "override fun lights(bird…cause = throwable))\n    }");
        return m33067S;
    }

    /* renamed from: b0 */
    public final AbstractC23461c m84067b0(WireBird wireBird, boolean z) {
        return this.f35094a.mo19555c(wireBird, z, true).firstOrError().m33159G();
    }

    @Override // p000.InterfaceC20792gH
    /* renamed from: c */
    public AbstractC23461c mo39769c(String birdId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        if (z) {
            return m84095K0(birdId, str, uuid);
        }
        AbstractC23461c m84079S0 = m84079S0(birdId, str, uuid);
        Intrinsics.checkNotNullExpressionValue(m84079S0, "wakeBluetooth(birdId, birdModel, sessionId)");
        return m84079S0;
    }

    /* renamed from: c0 */
    public final AbstractC23442F<C31014zT> m84066c0(String str, boolean z) {
        AbstractC23442F<C31014zT> m41630d = this.f35096c.m41630d(new C10181ZG(str, z));
        final C7719e c7719e = new C7719e(z);
        AbstractC23442F<C31014zT> m33150P = m41630d.m33150P(new InterfaceC23492o() { // from class: DH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84065d0;
                m84065d0 = C7708TH.m84065d0(Function1.this, obj);
                return m84065d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "private fun lightsPowerl…Error(throwable, on))\n  }");
        return m33150P;
    }

    @Override // p000.InterfaceC20792gH
    /* renamed from: d */
    public AbstractC23461c mo39768d(String birdId, PrivateBirdSetting settings) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        AbstractC23442F<Boolean> m33152N = this.f35097d.mo18208f(birdId).m33152N(C24542a.m31932c());
        final C7747z c7747z = new C7747z(birdId, settings);
        AbstractC23461c m33164B = m33152N.m33164B(new InterfaceC23492o() { // from class: LH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84087O0;
                m84087O0 = C7708TH.m84087O0(Function1.this, obj);
                return m84087O0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun updateSetti…reElement()\n      }\n    }");
        return m33164B;
    }

    @Override // p000.InterfaceC20792gH
    /* renamed from: e */
    public AbstractC23461c mo39767e(String birdId, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        InterfaceC42524i66 interfaceC42524i66 = this.f35100g;
        if (z) {
            str = "bird_actions_lock";
        } else {
            str = "bird_actions_unlock";
        }
        final InterfaceC38356b66 start = interfaceC42524i66.mo34441a(str).start();
        AbstractC23442F<WireBird> m84080S = m84080S(birdId);
        final C7720f c7720f = new C7720f(start);
        AbstractC23442F<WireBird> m33152N = m84080S.m33106t(new InterfaceC23484g() { // from class: NH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84064e0(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C7721g c7721g = new C7721g(z, start, this);
        AbstractC23442F<WireBird> m33152N2 = m33152N.m33101w(new InterfaceC23484g() { // from class: OH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84062f0(Function1.this, obj);
            }
        }).m33152N(C24542a.m31932c());
        final C7722h c7722h = new C7722h(birdId, z, start);
        AbstractC23442F<R> m33165A = m33152N2.m33165A(new InterfaceC23492o() { // from class: PH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84060g0;
                m84060g0 = C7708TH.m84060g0(Function1.this, obj);
                return m84060g0;
            }
        });
        final C7724i c7724i = new C7724i(z, start);
        AbstractC23461c m33164B = m33165A.m33164B(new InterfaceC23492o() { // from class: QH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84058h0;
                m84058h0 = C7708TH.m84058h0(Function1.this, obj);
                return m84058h0;
            }
        });
        final C7731j c7731j = new C7731j(z, birdId);
        AbstractC23461c m33067S = m33164B.m33067S(new InterfaceC23492o() { // from class: RH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84056i0;
                m84056i0 = C7708TH.m84056i0(Function1.this, obj);
                return m84056i0;
            }
        });
        final C7732k c7732k = new C7732k(start);
        AbstractC23461c m33030y = m33067S.m33084B(new InterfaceC23484g() { // from class: SH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84054j0(Function1.this, obj);
            }
        }).m33085A(new InterfaceC23478a() { // from class: iH
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C7708TH.m84052k0(InterfaceC38356b66.this);
            }
        }).m33029z(new InterfaceC23478a() { // from class: jH
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C7708TH.m84050l0(InterfaceC38356b66.this);
            }
        }).m33030y(new InterfaceC23478a() { // from class: kH
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C7708TH.m84048m0(InterfaceC38356b66.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33030y, "override fun lock(birdId… { lockTrace.stop() }\n  }");
        return m33030y;
    }

    /* renamed from: n0 */
    public final AbstractC23461c m84046n0(WireBird bird, boolean z) {
        WireBird copy;
        Observable unlock$default;
        WireBird copy2;
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (z) {
            InterfaceC27246pJ interfaceC27246pJ = this.f35094a;
            copy2 = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : true, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
            unlock$default = InterfaceC27246pJ.C27247a.lock$default(interfaceC27246pJ, copy2, false, false, true, null, 16, null);
        } else {
            InterfaceC27246pJ interfaceC27246pJ2 = this.f35094a;
            copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : true, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
            unlock$default = InterfaceC27246pJ.C27247a.unlock$default(interfaceC27246pJ2, copy, false, false, false, null, 24, null);
        }
        Observable retry = unlock$default.retry(1L);
        final C7733l c7733l = new C7733l(z, bird);
        Observable flatMapSingle = retry.flatMapSingle(new InterfaceC23492o() { // from class: JH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84044o0;
                m84044o0 = C7708TH.m84044o0(Function1.this, obj);
                return m84044o0;
            }
        });
        final C7734m c7734m = new C7734m();
        return flatMapSingle.onErrorResumeNext(new InterfaceC23492o() { // from class: KH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m84042p0;
                m84042p0 = C7708TH.m84042p0(Function1.this, obj);
                return m84042p0;
            }
        }).firstElement().m32053W(AbstractC23442F.m33100x(new BluetoothLockFailure(null))).m33159G();
    }

    /* renamed from: q0 */
    public final AbstractC23461c m84040q0(String birdId, final boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33029z = this.f35096c.m41624j(new C10610aH(birdId, z)).m33159G().m33029z(new InterfaceC23478a() { // from class: GH
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C7708TH.m84038r0(C7708TH.this, z);
            }
        });
        final C7735n c7735n = new C7735n(z);
        AbstractC23461c m33084B = m33029z.m33084B(new InterfaceC23484g() { // from class: HH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84036s0(Function1.this, obj);
            }
        });
        final C7736o c7736o = C7736o.f35148g;
        AbstractC23461c m33067S = m33084B.m33067S(new InterfaceC23492o() { // from class: IH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84034t0;
                m84034t0 = C7708TH.m84034t0(Function1.this, obj);
                return m84034t0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33067S, "@VisibleForTesting\n  int…ckFailure(throwable))\n  }");
        return m33067S;
    }

    /* renamed from: u0 */
    public final Exception m84032u0(Throwable th) {
        Exception bluetoothLockFailure;
        if (th instanceof IllegalArgumentException) {
            return (Exception) th;
        }
        if (th instanceof UpdateRemoteLockStateFailure) {
            return (Exception) th;
        }
        if (m84071X(th)) {
            bluetoothLockFailure = new BirdActionPermissionDenied(PrivateBirdAction.LOCK, th);
        } else {
            bluetoothLockFailure = new BluetoothLockFailure(th);
        }
        return bluetoothLockFailure;
    }

    /* renamed from: v0 */
    public final Exception m84030v0(Throwable th, boolean z) {
        if (m84071X(th)) {
            return new BirdActionPermissionDenied(PrivateBirdAction.LIGHTS, th);
        }
        return new ToggleLightsException(z, th);
    }

    /* renamed from: w0 */
    public final Exception m84028w0(Throwable th) {
        if (m84071X(th)) {
            return new BirdActionPermissionDenied(PrivateBirdAction.SLEEP, th);
        }
        return new ApiSleepFailure(th);
    }

    /* renamed from: x0 */
    public final Exception m84026x0(boolean z, Throwable th) {
        if (m84071X(th)) {
            return new BirdActionPermissionDenied(PrivateBirdAction.LOCK, th);
        }
        return new UpdateRemoteLockStateFailure(z, th);
    }

    /* renamed from: y0 */
    public final Exception m84024y0(Throwable th) {
        if (m84071X(th)) {
            return new BirdActionPermissionDenied(PrivateBirdAction.SLEEP, th);
        }
        return new BluetoothWakeFailure(th);
    }

    /* renamed from: z0 */
    public final AbstractC23461c m84022z0(AbstractC23461c powerline, AbstractC23461c bluetooth) {
        Intrinsics.checkNotNullParameter(powerline, "powerline");
        Intrinsics.checkNotNullParameter(bluetooth, "bluetooth");
        AbstractC23442F m33048i0 = powerline.m33048i0(new Callable() { // from class: tH
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m84115A0;
                m84115A0 = C7708TH.m84115A0();
                return m84115A0;
            }
        });
        final C7737p c7737p = new C7737p();
        AbstractC23442F m33101w = m33048i0.m33101w(new InterfaceC23484g() { // from class: uH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84113B0(Function1.this, obj);
            }
        });
        final C7738q c7738q = new C7738q();
        Observable m33123k0 = m33101w.m33106t(new InterfaceC23484g() { // from class: vH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84111C0(Function1.this, obj);
            }
        }).m33123k0();
        final C7739r c7739r = C7739r.f35151g;
        Observable onErrorResumeNext = m33123k0.onErrorResumeNext(new InterfaceC23492o() { // from class: wH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m84109D0;
                m84109D0 = C7708TH.m84109D0(Function1.this, obj);
                return m84109D0;
            }
        });
        AbstractC23442F m33048i02 = bluetooth.m33048i0(new Callable() { // from class: xH
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m84107E0;
                m84107E0 = C7708TH.m84107E0();
                return m84107E0;
            }
        });
        final C7740s c7740s = new C7740s();
        AbstractC23442F m33101w2 = m33048i02.m33101w(new InterfaceC23484g() { // from class: yH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84105F0(Function1.this, obj);
            }
        });
        final C7741t c7741t = new C7741t();
        Observable m33123k02 = m33101w2.m33106t(new InterfaceC23484g() { // from class: zH
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7708TH.m84103G0(Function1.this, obj);
            }
        }).m33123k0();
        final C7742u c7742u = C7742u.f35154g;
        AbstractC23461c m33159G = Observable.merge(onErrorResumeNext, m33123k02.onErrorResumeNext(new InterfaceC23492o() { // from class: AH
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m84101H0;
                m84101H0 = C7708TH.m84101H0(Function1.this, obj);
                return m84101H0;
            }
        })).firstOrError().m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "internal fun race(powerl…OrError().ignoreElement()");
        return m33159G;
    }
}
