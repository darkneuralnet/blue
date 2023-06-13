package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AlarmType;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.BrainState;
import co.bird.android.model.constant.MechanicalLockKind;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.InterfaceC10636aM;
import p000.InterfaceC27246pJ;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+¨\u0006/"}, m28432d2 = {"Lip0;", "LTo0;", "Lco/bird/android/model/persistence/Bird;", "bird", "", "lock", "Lio/reactivex/c;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/wire/WireBird;", "useBluetooth", "z", "", "retryAttempts", "delayMillis", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "k", "c", "g", "", "duration", "f", "b", "i", "j", "sleep", "", "sessionId", "e", "h", "LaM;", "LaM;", "birdManager", "LpJ;", "LpJ;", "bluetoothManager", "Lrd5;", "Lrd5;", "rxBleBirdBluetoothManager", "Lgl;", "Lgl;", "preference", "LRR;", "LRR;", "birdRepo", "<init>", "(LaM;LpJ;Lrd5;Lgl;LRR;)V", "command_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ip0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42942ip0 implements InterfaceC36185To0 {

    /* renamed from: a */
    public final InterfaceC10636aM f91321a;

    /* renamed from: b */
    public final InterfaceC27246pJ f91322b;

    /* renamed from: c */
    public final InterfaceC48164rd5 f91323c;

    /* renamed from: d */
    public final C22454gl f91324d;

    /* renamed from: e */
    public final InterfaceC7168RR f91325e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ip0$a */
    /* loaded from: classes4.dex */
    public static final class C24589a extends Lambda implements Function1<Vehicle, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Bird f91327h;

        /* renamed from: i */
        public final /* synthetic */ boolean f91328i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24589a(Bird bird, boolean z) {
            super(1);
            this.f91327h = bird;
            this.f91328i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C42942ip0.this.m31827C(this.f91327h, this.f91328i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ip0$b */
    /* loaded from: classes4.dex */
    public static final class C24590b extends Lambda implements Function1<Vehicle, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Bird f91330h;

        /* renamed from: i */
        public final /* synthetic */ boolean f91331i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24590b(Bird bird, boolean z) {
            super(1);
            this.f91330h = bird;
            this.f91331i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C42942ip0.this.m31827C(this.f91330h, this.f91331i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "wireBird", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/persistence/Bird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ip0$c */
    /* loaded from: classes4.dex */
    public static final class C24591c extends Lambda implements Function1<Bird, Bird> {

        /* renamed from: g */
        public static final C24591c f91332g = new C24591c();

        public C24591c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Bird invoke(Bird wireBird) {
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            if (wireBird.getLocked() == wireBird.getAckLocked()) {
                return wireBird;
            }
            Intrinsics.checkNotNull(null);
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/k;", "", "kotlin.jvm.PlatformType", "throwable", "Lna4;", C17296a.f69688o, "(Lio/reactivex/k;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ip0$d */
    /* loaded from: classes4.dex */
    public static final class C24592d extends Lambda implements Function1<AbstractC24490k<Throwable>, InterfaceC45761na4<?>> {

        /* renamed from: g */
        public final /* synthetic */ long f91333g;

        /* renamed from: h */
        public final /* synthetic */ long f91334h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24592d(long j, long j2) {
            super(1);
            this.f91333g = j;
            this.f91334h = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC45761na4<?> invoke(AbstractC24490k<Throwable> throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return throwable.m32145g1(this.f91333g).m32103v(this.f91334h, TimeUnit.MILLISECONDS);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ip0$e */
    /* loaded from: classes4.dex */
    public static final class C24593e extends Lambda implements Function1<Vehicle, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ Bird f91335g;

        /* renamed from: h */
        public final /* synthetic */ boolean f91336h;

        /* renamed from: i */
        public final /* synthetic */ C42942ip0 f91337i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24593e(Bird bird, boolean z, C42942ip0 c42942ip0) {
            super(1);
            this.f91335g = bird;
            this.f91336h = z;
            this.f91337i = c42942ip0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Vehicle it) {
            BrainState brainState;
            Bird copy;
            AbstractC23461c mo71578d1;
            Intrinsics.checkNotNullParameter(it, "it");
            Bird bird = this.f91335g;
            Lifecycle lifecycle = bird.getLifecycle();
            if (this.f91336h) {
                brainState = BrainState.ASLEEP;
            } else {
                brainState = BrainState.AVAILABLE;
            }
            copy = bird.copy((r88 & 1) != 0 ? bird.f66670id : null, (r88 & 2) != 0 ? bird.model : null, (r88 & 4) != 0 ? bird.taskId : null, (r88 & 8) != 0 ? bird.batteryLevel : 0, (r88 & 16) != 0 ? bird.estimatedRange : null, (r88 & 32) != 0 ? bird.distance : 0, (r88 & 64) != 0 ? bird.location : null, (r88 & 128) != 0 ? bird.code : null, (r88 & 256) != 0 ? bird.stickerId : null, (r88 & 512) != 0 ? bird.serialNumber : null, (r88 & 1024) != 0 ? bird.disconnected : false, (r88 & 2048) != 0 ? bird.collect : false, (r88 & 4096) != 0 ? bird.submerged : false, (r88 & 8192) != 0 ? bird.lost : false, (r88 & 16384) != 0 ? bird.locked : false, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r88 & 65536) != 0 ? bird.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r88 & 524288) != 0 ? bird.label : null, (r88 & 1048576) != 0 ? bird.actions : null, (r88 & 2097152) != 0 ? bird.bountyId : null, (r88 & 4194304) != 0 ? bird.bountyPrice : null, (r88 & 8388608) != 0 ? bird.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r88 & 33554432) != 0 ? bird.bountyOverdue : false, (r88 & 67108864) != 0 ? bird.bountyKind : null, (r88 & 134217728) != 0 ? bird.brandName : null, (r88 & 268435456) != 0 ? bird.taskKind : null, (r88 & 536870912) != 0 ? bird.gpsAt : null, (r88 & 1073741824) != 0 ? bird.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r89 & 1) != 0 ? bird.bluetooth : false, (r89 & 2) != 0 ? bird.cellular : false, (r89 & 4) != 0 ? bird.startedAt : null, (r89 & 8) != 0 ? bird.dueAt : null, (r89 & 16) != 0 ? bird.asleep : false, (r89 & 32) != 0 ? bird.imei : null, (r89 & 64) != 0 ? bird.boardProtocol : null, (r89 & 128) != 0 ? bird.physicalLock : null, (r89 & 256) != 0 ? bird.physicalLocks : null, (r89 & 512) != 0 ? bird.priorityCollect : false, (r89 & 1024) != 0 ? bird.down : false, (r89 & 2048) != 0 ? bird.needsInspection : false, (r89 & 4096) != 0 ? bird.partnerId : null, (r89 & 8192) != 0 ? bird.nestId : null, (r89 & 16384) != 0 ? bird.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.partnerBirdState : null, (r89 & 65536) != 0 ? bird.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.lifecycle : Lifecycle.copy$default(lifecycle, null, null, brainState, null, 11, null), (r89 & 524288) != 0 ? bird.offline : false, (r89 & 1048576) != 0 ? bird.license : null, (r89 & 2097152) != 0 ? bird.areaKey : null, (r89 & 4194304) != 0 ? bird.nestPurpose : null, (r89 & 8388608) != 0 ? bird.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r89 & 33554432) != 0 ? bird.badgeType : null, (r89 & 67108864) != 0 ? bird.bountyReasons : null, (r89 & 134217728) != 0 ? bird.ephemeralId : null, (r89 & 268435456) != 0 ? bird.bleMacAddress : null, (r89 & 536870912) != 0 ? bird.hasHelmet : null, (r89 & 1073741824) != 0 ? bird.locationUpdatedAt : null);
            if (this.f91336h) {
                mo71578d1 = this.f91337i.f91321a.mo71572m1(this.f91335g.getId());
            } else {
                mo71578d1 = this.f91337i.f91321a.mo71578d1(this.f91335g.getId());
            }
            return mo71578d1.m33049i(this.f91337i.f91325e.mo39430c1(copy));
        }
    }

    public C42942ip0(InterfaceC10636aM birdManager, InterfaceC27246pJ bluetoothManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, C22454gl preference, InterfaceC7168RR birdRepo) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(birdRepo, "birdRepo");
        this.f91321a = birdManager;
        this.f91322b = bluetoothManager;
        this.f91323c = rxBleBirdBluetoothManager;
        this.f91324d = preference;
        this.f91325e = birdRepo;
    }

    /* renamed from: A */
    public static final void m31829A(C42942ip0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f91322b.release();
    }

    /* renamed from: B */
    public static final void m31828B(C42942ip0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f91322b.release();
    }

    /* renamed from: D */
    public static final InterfaceC23496h m31826D(C42942ip0 this$0, Bird bird, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        return this$0.m31827C(bird, z);
    }

    /* renamed from: E */
    public static final void m31825E(C42942ip0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f91322b.release();
    }

    /* renamed from: F */
    public static final InterfaceC23496h m31824F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23496h m31823G(C42942ip0 this$0, Bird bird, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        return this$0.m31827C(bird, z);
    }

    /* renamed from: H */
    public static final void m31822H(C42942ip0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f91322b.release();
    }

    /* renamed from: I */
    public static final InterfaceC23496h m31821I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m31820J(C42942ip0 this$0, Bird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        return this$0.f91321a.mo71582a(bird.getId()).firstOrError();
    }

    /* renamed from: K */
    public static final Bird m31819K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Bird) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC45761na4 m31818L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m31817M(C42942ip0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f91322b.release();
    }

    /* renamed from: N */
    public static final InterfaceC23496h m31816N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m31815O(C42942ip0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f91322b.release();
    }

    /* renamed from: C */
    public final AbstractC23461c m31827C(Bird bird, boolean z) {
        Bird copy;
        List listOf;
        InterfaceC7168RR interfaceC7168RR = this.f91325e;
        copy = bird.copy((r88 & 1) != 0 ? bird.f66670id : null, (r88 & 2) != 0 ? bird.model : null, (r88 & 4) != 0 ? bird.taskId : null, (r88 & 8) != 0 ? bird.batteryLevel : 0, (r88 & 16) != 0 ? bird.estimatedRange : null, (r88 & 32) != 0 ? bird.distance : 0, (r88 & 64) != 0 ? bird.location : null, (r88 & 128) != 0 ? bird.code : null, (r88 & 256) != 0 ? bird.stickerId : null, (r88 & 512) != 0 ? bird.serialNumber : null, (r88 & 1024) != 0 ? bird.disconnected : false, (r88 & 2048) != 0 ? bird.collect : false, (r88 & 4096) != 0 ? bird.submerged : false, (r88 & 8192) != 0 ? bird.lost : false, (r88 & 16384) != 0 ? bird.locked : z, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r88 & 65536) != 0 ? bird.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r88 & 524288) != 0 ? bird.label : null, (r88 & 1048576) != 0 ? bird.actions : null, (r88 & 2097152) != 0 ? bird.bountyId : null, (r88 & 4194304) != 0 ? bird.bountyPrice : null, (r88 & 8388608) != 0 ? bird.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r88 & 33554432) != 0 ? bird.bountyOverdue : false, (r88 & 67108864) != 0 ? bird.bountyKind : null, (r88 & 134217728) != 0 ? bird.brandName : null, (r88 & 268435456) != 0 ? bird.taskKind : null, (r88 & 536870912) != 0 ? bird.gpsAt : null, (r88 & 1073741824) != 0 ? bird.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r89 & 1) != 0 ? bird.bluetooth : false, (r89 & 2) != 0 ? bird.cellular : false, (r89 & 4) != 0 ? bird.startedAt : null, (r89 & 8) != 0 ? bird.dueAt : null, (r89 & 16) != 0 ? bird.asleep : false, (r89 & 32) != 0 ? bird.imei : null, (r89 & 64) != 0 ? bird.boardProtocol : null, (r89 & 128) != 0 ? bird.physicalLock : null, (r89 & 256) != 0 ? bird.physicalLocks : null, (r89 & 512) != 0 ? bird.priorityCollect : false, (r89 & 1024) != 0 ? bird.down : false, (r89 & 2048) != 0 ? bird.needsInspection : false, (r89 & 4096) != 0 ? bird.partnerId : null, (r89 & 8192) != 0 ? bird.nestId : null, (r89 & 16384) != 0 ? bird.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.partnerBirdState : null, (r89 & 65536) != 0 ? bird.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.lifecycle : null, (r89 & 524288) != 0 ? bird.offline : false, (r89 & 1048576) != 0 ? bird.license : null, (r89 & 2097152) != 0 ? bird.areaKey : null, (r89 & 4194304) != 0 ? bird.nestPurpose : null, (r89 & 8388608) != 0 ? bird.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r89 & 33554432) != 0 ? bird.badgeType : null, (r89 & 67108864) != 0 ? bird.bountyReasons : null, (r89 & 134217728) != 0 ? bird.ephemeralId : null, (r89 & 268435456) != 0 ? bird.bleMacAddress : null, (r89 & 536870912) != 0 ? bird.hasHelmet : null, (r89 & 1073741824) != 0 ? bird.locationUpdatedAt : null);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{interfaceC7168RR.mo39430c1(copy), mo31814a(bird, z, false)});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(listOf(\n      bir…Bluetooth = false)\n    ))");
        return m33037r;
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: a */
    public AbstractC23461c mo31814a(final Bird bird, final boolean z, boolean z2) {
        AbstractC23461c m33049i;
        AbstractC23461c m33049i2;
        Intrinsics.checkNotNullParameter(bird, "bird");
        WireBird m114027f = C0613BT.m114027f(bird);
        if (z2 && z) {
            if (!Bird_Kt.isSwappable(bird) && !Bird_Kt.isES500(bird)) {
                Observable doFinally = InterfaceC27246pJ.C27247a.lock$default(this.f91322b, m114027f, false, true, true, null, 18, null).doFinally(new InterfaceC23478a() { // from class: Zo0
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C42942ip0.m31825E(C42942ip0.this);
                    }
                });
                final C24589a c24589a = new C24589a(bird, z);
                m33049i2 = doFinally.flatMapCompletable(new InterfaceC23492o() { // from class: ap0
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m31824F;
                        m31824F = C42942ip0.m31824F(Function1.this, obj);
                        return m31824F;
                    }
                });
            } else {
                m33049i2 = this.f91323c.mo15660z(C0613BT.m114026g(bird)).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: Uo0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23496h m31826D;
                        m31826D = C42942ip0.m31826D(C42942ip0.this, bird, z);
                        return m31826D;
                    }
                }));
            }
            Intrinsics.checkNotNullExpressionValue(m33049i2, "override fun lockBird(bi…able.complete()\n    }\n  }");
            return m33049i2;
        } else if (z2 && !z) {
            if (!Bird_Kt.isSwappable(bird) && !Bird_Kt.isES500(bird)) {
                Observable doFinally2 = InterfaceC27246pJ.C27247a.unlock$default(this.f91322b, m114027f, false, true, false, null, 26, null).doFinally(new InterfaceC23478a() { // from class: cp0
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C42942ip0.m31822H(C42942ip0.this);
                    }
                });
                final C24590b c24590b = new C24590b(bird, z);
                m33049i = doFinally2.flatMapCompletable(new InterfaceC23492o() { // from class: dp0
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m31821I;
                        m31821I = C42942ip0.m31821I(Function1.this, obj);
                        return m31821I;
                    }
                });
            } else {
                m33049i = this.f91323c.mo15669q(C0613BT.m114026g(bird)).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: bp0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23496h m31823G;
                        m31823G = C42942ip0.m31823G(C42942ip0.this, bird, z);
                        return m31823G;
                    }
                }));
            }
            Intrinsics.checkNotNullExpressionValue(m33049i, "override fun lockBird(bi…able.complete()\n    }\n  }");
            return m33049i;
        } else if (!z2) {
            return this.f91321a.mo71575j(bird.getId(), z);
        } else {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: b */
    public AbstractC23461c mo31813b(Bird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return m31789z(C0613BT.m114027f(bird), z);
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: c */
    public AbstractC23461c mo31812c(Bird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (z) {
            return this.f91323c.mo15663w(C0613BT.m114026g(bird));
        }
        if (this.f91324d.m37575s0().getUserRole() == UserRole.RIDER) {
            return this.f91321a.mo71584Y0(bird.getId());
        }
        return this.f91321a.mo71604E0(bird.getId(), MechanicalLockKind.CABLE);
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: d */
    public AbstractC23461c mo31811d(final Bird bird, long j, long j2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F m33042m = this.f91321a.mo71570x0(bird.getId()).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: fp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m31820J;
                m31820J = C42942ip0.m31820J(C42942ip0.this, bird);
                return m31820J;
            }
        }));
        final C24591c c24591c = C24591c.f91332g;
        AbstractC23461c m33159G = m33042m.m33157I(new InterfaceC23492o() { // from class: gp0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Bird m31819K;
                m31819K = C42942ip0.m31819K(Function1.this, obj);
                return m31819K;
            }
        }).m33159G();
        final C24592d c24592d = new C24592d(j, j2);
        AbstractC23461c m33064V = m33159G.m33064V(new InterfaceC23492o() { // from class: hp0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m31818L;
                m31818L = C42942ip0.m31818L(Function1.this, obj);
                return m31818L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33064V, "retryAttempts: Long, del… TimeUnit.MILLISECONDS) }");
        return m33064V;
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: e */
    public AbstractC23461c mo31810e(Bird bird, boolean z, boolean z2, String sessionId) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        WireBird m114027f = C0613BT.m114027f(bird);
        if (z2) {
            Observable doFinally = InterfaceC27246pJ.C27247a.enableDeepSleep$default(this.f91322b, m114027f, z, new C4464KY(null, bird.getId(), bird.getModel(), null, null, sessionId, null, EnumC12346bH.SINGLE.name(), null, null, null, 1881, null), null, false, false, 56, null).doFinally(new InterfaceC23478a() { // from class: Vo0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42942ip0.m31817M(C42942ip0.this);
                }
            });
            final C24593e c24593e = new C24593e(bird, z, this);
            AbstractC23461c flatMapCompletable = doFinally.flatMapCompletable(new InterfaceC23492o() { // from class: Wo0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m31816N;
                    m31816N = C42942ip0.m31816N(Function1.this, obj);
                    return m31816N;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun sleepBird(b…able.complete()\n    }\n  }");
            return flatMapCompletable;
        } else if (z) {
            return this.f91321a.mo71568z0(bird.getId(), new C38431bE5(null, bird.getId(), bird.getModel(), null, null, sessionId, EnumC12346bH.SINGLE.name(), XD5.API.name(), null, null, null, 1817, null));
        } else {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: f */
    public AbstractC23461c mo31809f(Bird bird, int i) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23461c ignoreElements = this.f91321a.mo71577e1(C0613BT.m114027f(bird), AlarmCommand.ON, Integer.valueOf(i)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(ignoreElements, "birdManager.alarm(bird =…)\n      .ignoreElements()");
        return ignoreElements;
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: g */
    public AbstractC23461c mo31808g(Bird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (z) {
            return this.f91323c.mo15661y(C0613BT.m114026g(bird));
        }
        return this.f91321a.mo71604E0(bird.getId(), MechanicalLockKind.HELMET);
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: h */
    public AbstractC23461c mo31807h(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23461c ignoreElements = this.f91322b.mo19545m(C0613BT.m114027f(bird)).doFinally(new InterfaceC23478a() { // from class: Xo0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C42942ip0.m31815O(C42942ip0.this);
            }
        }).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(ignoreElements, "bluetoothManager.softRes…}\n      .ignoreElements()");
        return ignoreElements;
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: i */
    public AbstractC23461c mo31806i(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return m31789z(bird, z);
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: j */
    public AbstractC23461c mo31805j(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23461c ignoreElements = this.f91322b.mo19552f(C0613BT.m114027f(bird), 1, true).doFinally(new InterfaceC23478a() { // from class: Yo0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C42942ip0.m31828B(C42942ip0.this);
            }
        }).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(ignoreElements, "bluetoothManager.flashLi…}\n      .ignoreElements()");
        return ignoreElements;
    }

    @Override // p000.InterfaceC36185To0
    /* renamed from: k */
    public AbstractC23461c mo31804k(Bird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (z) {
            return this.f91323c.mo15681e(C0613BT.m114026g(bird));
        }
        return this.f91321a.mo71604E0(bird.getId(), MechanicalLockKind.BATTERY);
    }

    /* renamed from: z */
    public final AbstractC23461c m31789z(WireBird wireBird, boolean z) {
        WireBird copy;
        AbstractC23461c ignoreElements;
        if (z) {
            if (WireBirdKt.isBdCompatible(wireBird)) {
                ignoreElements = this.f91323c.mo15675k(C0613BT.m114025h(wireBird));
            } else {
                InterfaceC27246pJ interfaceC27246pJ = this.f91322b;
                copy = wireBird.copy((r91 & 1) != 0 ? wireBird.f66717id : null, (r91 & 2) != 0 ? wireBird.model : null, (r91 & 4) != 0 ? wireBird.taskId : null, (r91 & 8) != 0 ? wireBird.batteryLevel : 0, (r91 & 16) != 0 ? wireBird.estimatedRange : null, (r91 & 32) != 0 ? wireBird.distance : 0, (r91 & 64) != 0 ? wireBird.location : null, (r91 & 128) != 0 ? wireBird.code : null, (r91 & 256) != 0 ? wireBird.stickerId : null, (r91 & 512) != 0 ? wireBird.serialNumber : null, (r91 & 1024) != 0 ? wireBird.disconnected : false, (r91 & 2048) != 0 ? wireBird.collect : false, (r91 & 4096) != 0 ? wireBird.submerged : false, (r91 & 8192) != 0 ? wireBird.lost : false, (r91 & 16384) != 0 ? wireBird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.ackLocked : false, (r91 & 65536) != 0 ? wireBird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.broken : false, (r91 & 524288) != 0 ? wireBird.label : null, (r91 & 1048576) != 0 ? wireBird.actions : null, (r91 & 2097152) != 0 ? wireBird.bountyId : null, (r91 & 4194304) != 0 ? wireBird.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.bountyLost : false, (r91 & 33554432) != 0 ? wireBird.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird.bountyKind : null, (r91 & 134217728) != 0 ? wireBird.brandName : null, (r91 & 268435456) != 0 ? wireBird.taskKind : null, (r91 & 536870912) != 0 ? wireBird.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird.token : null, (r92 & 1) != 0 ? wireBird.bluetooth : true, (r92 & 2) != 0 ? wireBird.cellular : false, (r92 & 4) != 0 ? wireBird.startedAt : null, (r92 & 8) != 0 ? wireBird.dueAt : null, (r92 & 16) != 0 ? wireBird.asleep : false, (r92 & 32) != 0 ? wireBird.imei : null, (r92 & 64) != 0 ? wireBird.boardProtocol : null, (r92 & 128) != 0 ? wireBird.physicalLock : null, (r92 & 256) != 0 ? wireBird.priorityCollect : false, (r92 & 512) != 0 ? wireBird.down : false, (r92 & 1024) != 0 ? wireBird.needsInspection : false, (r92 & 2048) != 0 ? wireBird.partnerId : null, (r92 & 4096) != 0 ? wireBird.nestId : null, (r92 & 8192) != 0 ? wireBird.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.peril : false, (r92 & 65536) != 0 ? wireBird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.offline : false, (r92 & 524288) != 0 ? wireBird.license : null, (r92 & 1048576) != 0 ? wireBird.areaKey : null, (r92 & 2097152) != 0 ? wireBird.fleetId : null, (r92 & 4194304) != 0 ? wireBird.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.scannedAt : null, (r92 & 33554432) != 0 ? wireBird.badgeType : null, (r92 & 67108864) != 0 ? wireBird.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? wireBird.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird.bleMacAddress : null, (r93 & 1) != 0 ? wireBird.cellId : null, (r93 & 2) != 0 ? wireBird.externalFeedType : null);
                ignoreElements = InterfaceC27246pJ.C27247a.alarm$default(interfaceC27246pJ, copy, AlarmType.CHIRP, true, false, 8, null).doFinally(new InterfaceC23478a() { // from class: ep0
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C42942ip0.m31829A(C42942ip0.this);
                    }
                }).ignoreElements();
            }
            Intrinsics.checkNotNullExpressionValue(ignoreElements, "{\n      if (bird.isBdCom…eElements()\n      }\n    }");
            return ignoreElements;
        }
        AbstractC23461c ignoreElements2 = InterfaceC10636aM.C10637a.alarm$default(this.f91321a, wireBird, AlarmCommand.AUTO, null, 4, null).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(ignoreElements2, "{\n      birdManager.alar…  .ignoreElements()\n    }");
        return ignoreElements2;
    }
}
