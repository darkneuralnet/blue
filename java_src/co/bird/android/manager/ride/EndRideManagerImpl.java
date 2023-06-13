package co.bird.android.manager.ride;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.manager.ride.EndRideManagerImpl;
import co.bird.android.model.RideState;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.EndRideConfig;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001SBK\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\b\b\u0001\u0010.\u001a\u00020\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R0\u00108\u001a\n 0*\u0004\u0018\u00010/0/8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\r\u00101\u0012\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/ 0*\n\u0012\u0004\u0012\u00020/\u0018\u00010:0:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010?R\u0018\u0010H\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR \u0010M\u001a\b\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b\u001a\u0010LR \u0010O\u001a\b\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\b>\u0010LR \u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\b!\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020\n0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bS\u0010L¨\u0006X"}, m28432d2 = {"Lco/bird/android/manager/ride/EndRideManagerImpl;", "LXc1;", "LVX0;", "LLifecycleOwner;", "owner", "", "onStart", "onStop", "Lco/bird/android/model/wire/WireRide;", "ride", "", "b", "Lio/reactivex/c;", "j", "", "n", "k", "e", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LYR4;", "c", "LYR4;", "rideManager", "Lbn;", DateTokenConverter.CONVERTER_KEY, "Lbn;", "areaManager", "Lpv0;", "Lpv0;", "configManager", "LTq4;", "f", "LTq4;", "reactiveConfig", "LEa;", "g", "LEa;", "analyticsManager", "Ldr4;", "h", "Ldr4;", "reactiveLocationManager", "i", "LLifecycleOwner;", "processLifecycleOwner", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "N", "()Lorg/joda/time/DateTime;", "setLastForegroundTime$ride_release", "(Lorg/joda/time/DateTime;)V", "getLastForegroundTime$ride_release$annotations", "()V", "lastForegroundTime", "LAG;", "Lco/bird/android/buava/Optional;", "LAG;", "firstLocationUpdatePostForeground", "La94;", "l", "La94;", "mutableWaitingForEndRideConditions", "m", "mutableLocationUpdatedAfterForegrounding", "mutableAreasRefreshedAfterForegrounding", "o", "mutableNestsRefreshedAfterForegrounding", "p", "Ljava/lang/String;", "endRideSessionId", "LZ84;", "q", "LZ84;", "()LZ84;", "waitingForEndRideConditions", "r", "locationUpdatedAfterForegrounding", "s", "areasRefreshedAfterForegrounding", "t", C17296a.f69688o, "nestsRefreshedAfterForegrounding", "<init>", "(Landroid/content/Context;LYR4;Lbn;Lpv0;LTq4;LEa;Ldr4;LLifecycleOwner;)V", "u", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEndRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n44#2:286\n44#2:288\n218#3:287\n237#3:289\n1#4:290\n*S KotlinDebug\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl\n*L\n93#1:286\n109#1:288\n93#1:287\n109#1:289\n*E\n"})
/* loaded from: classes4.dex */
public final class EndRideManagerImpl implements InterfaceC37014Xc1, VX0 {

    /* renamed from: u */
    public static final C16193a f66475u = new C16193a(null);

    /* renamed from: b */
    public final Context f66476b;

    /* renamed from: c */
    public final YR4 f66477c;

    /* renamed from: d */
    public final InterfaceC12495bn f66478d;

    /* renamed from: e */
    public final InterfaceC47153pv0 f66479e;

    /* renamed from: f */
    public final C36207Tq4 f66480f;

    /* renamed from: g */
    public final InterfaceC1880Ea f66481g;

    /* renamed from: h */
    public final InterfaceC40001dr4 f66482h;

    /* renamed from: i */
    public final LifecycleOwner f66483i;

    /* renamed from: j */
    public DateTime f66484j;

    /* renamed from: k */
    public final C0058AG<Optional<DateTime>> f66485k;

    /* renamed from: l */
    public final C37791a94<Boolean> f66486l;

    /* renamed from: m */
    public final C37791a94<Boolean> f66487m;

    /* renamed from: n */
    public final C37791a94<Boolean> f66488n;

    /* renamed from: o */
    public final C37791a94<Boolean> f66489o;

    /* renamed from: p */
    public String f66490p;

    /* renamed from: q */
    public final Z84<Boolean> f66491q;

    /* renamed from: r */
    public final Z84<Boolean> f66492r;

    /* renamed from: s */
    public final Z84<Boolean> f66493s;

    /* renamed from: t */
    public final Z84<Boolean> f66494t;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/manager/ride/EndRideManagerImpl$a;", "", "", "WAIT_FOR_END_RIDE_CONDITION_BUFFER_MS", "J", "<init>", "()V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$a */
    /* loaded from: classes4.dex */
    public static final class C16193a {
        public /* synthetic */ C16193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16193a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "lastUpdateTime", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEndRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl$onStart$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n1#2:286\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$b */
    /* loaded from: classes4.dex */
    public static final class C16194b extends Lambda implements Function1<Optional<DateTime>, DateTime> {
        public C16194b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DateTime invoke(Optional<DateTime> lastUpdateTime) {
            Intrinsics.checkNotNullParameter(lastUpdateTime, "lastUpdateTime");
            DateTime m59035e = lastUpdateTime.m59035e();
            if (m59035e == null || !m59035e.isAfter(EndRideManagerImpl.this.m55571N())) {
                return null;
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lorg/joda/time/DateTime;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$c */
    /* loaded from: classes4.dex */
    public static final class C16195c extends Lambda implements Function1<DateTime, Unit> {
        public C16195c() {
            super(1);
        }

        /* renamed from: a */
        public final void m55527a(DateTime it) {
            C41318g46.m40163a("captured first location update post app foreground " + it, new Object[0]);
            C0058AG c0058ag = EndRideManagerImpl.this.f66485k;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c0058ag.accept(c14443a.m59032c(it));
            EndRideManagerImpl.this.f66487m.accept(Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DateTime dateTime) {
            m55527a(dateTime);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEndRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl$onStart$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n1#2:286\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$d */
    /* loaded from: classes4.dex */
    public static final class C16196d extends Lambda implements Function1<Optional<DateTime>, DateTime> {
        public C16196d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DateTime invoke(Optional<DateTime> optional) {
            DateTime m59035e = optional.m59035e();
            if (!EndRideManagerImpl.this.f66477c.mo75061N()) {
                m59035e = null;
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lorg/joda/time/DateTime;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lorg/joda/time/DateTime;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$e */
    /* loaded from: classes4.dex */
    public static final class C16197e extends Lambda implements Function1<DateTime, InterfaceC23496h> {
        public C16197e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(DateTime it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("refreshing configs now post foreground location lock", new Object[0]);
            return EndRideManagerImpl.this.f66479e.mo2288E();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "lastRequestTime", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEndRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl$waitForEndRideConditions$areasCompletable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n1#2:286\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$f */
    /* loaded from: classes4.dex */
    public static final class C16198f extends Lambda implements Function1<Optional<DateTime>, DateTime> {
        public C16198f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DateTime invoke(Optional<DateTime> lastRequestTime) {
            DateTime dateTime;
            Intrinsics.checkNotNullParameter(lastRequestTime, "lastRequestTime");
            DateTime m59035e = lastRequestTime.m59035e();
            if (m59035e != null) {
                Optional optional = (Optional) EndRideManagerImpl.this.f66485k.getValue();
                if (optional != null) {
                    dateTime = (DateTime) optional.m59035e();
                } else {
                    dateTime = null;
                }
                if (m59035e.isAfter(dateTime)) {
                    return m59035e;
                }
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lorg/joda/time/DateTime;", "lastRequestTime", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "c", "(Lorg/joda/time/DateTime;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$g */
    /* loaded from: classes4.dex */
    public static final class C16199g extends Lambda implements Function1<DateTime, InterfaceC23447K<? extends Optional<DateTime>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "lastUpdateTime", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$g$a */
        /* loaded from: classes4.dex */
        public static final class C16200a extends Lambda implements Function1<Optional<DateTime>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ DateTime f66501g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16200a(DateTime dateTime) {
                super(1);
                this.f66501g = dateTime;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<DateTime> lastUpdateTime) {
                Intrinsics.checkNotNullParameter(lastUpdateTime, "lastUpdateTime");
                DateTime m59035e = lastUpdateTime.m59035e();
                boolean z = false;
                if (m59035e != null && m59035e.isAfter(this.f66501g)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$g$b */
        /* loaded from: classes4.dex */
        public static final class C16201b extends Lambda implements Function1<Optional<DateTime>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EndRideManagerImpl f66502g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16201b(EndRideManagerImpl endRideManagerImpl) {
                super(1);
                this.f66502g = endRideManagerImpl;
            }

            /* renamed from: a */
            public final void m55518a(Optional<DateTime> optional) {
                this.f66502g.f66488n.accept(Boolean.TRUE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Optional<DateTime> optional) {
                m55518a(optional);
                return Unit.INSTANCE;
            }
        }

        public C16199g() {
            super(1);
        }

        /* renamed from: d */
        public static final void m55520d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Optional<DateTime>> invoke(DateTime lastRequestTime) {
            Intrinsics.checkNotNullParameter(lastRequestTime, "lastRequestTime");
            Z84<Optional<DateTime>> mo63993w = EndRideManagerImpl.this.f66478d.mo63993w();
            final C16200a c16200a = new C16200a(lastRequestTime);
            AbstractC23442F<Optional<DateTime>> firstOrError = mo63993w.filter(new InterfaceC23494q() { // from class: ud1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = EndRideManagerImpl.C16199g.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).firstOrError();
            final C16201b c16201b = new C16201b(EndRideManagerImpl.this);
            return firstOrError.m33101w(new InterfaceC23484g() { // from class: vd1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.C16199g.m55520d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$h */
    /* loaded from: classes4.dex */
    public static final class C16202h extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C16202h f66503g = new C16202h();

        public C16202h() {
            super(1);
        }

        /* renamed from: a */
        public final void m55517a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("starting waitForForeground area update check", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m55517a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$i */
    /* loaded from: classes4.dex */
    public static final class C16203i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16203i f66504g = new C16203i();

        public C16203i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while waiting for area update post app foreground, ignoring", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$j */
    /* loaded from: classes4.dex */
    public static final class C16204j extends Lambda implements Function1<Config, Boolean> {
        public C16204j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getLoadedAt().isAfter(EndRideManagerImpl.this.m55571N()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$k */
    /* loaded from: classes4.dex */
    public static final class C16205k extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C16205k f66506g = new C16205k();

        public C16205k() {
            super(1);
        }

        /* renamed from: a */
        public final void m55516a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("starting waitForForeground config update check", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m55516a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$l */
    /* loaded from: classes4.dex */
    public static final class C16206l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16206l f66507g = new C16206l();

        public C16206l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while waiting for config update post app foreground, ignoring", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "lastUpdateTime", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$m */
    /* loaded from: classes4.dex */
    public static final class C16207m extends Lambda implements Function1<Optional<DateTime>, Boolean> {
        public C16207m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<DateTime> lastUpdateTime) {
            Intrinsics.checkNotNullParameter(lastUpdateTime, "lastUpdateTime");
            DateTime m59035e = lastUpdateTime.m59035e();
            boolean z = false;
            if (m59035e != null && m59035e.isAfter(EndRideManagerImpl.this.m55571N())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$n */
    /* loaded from: classes4.dex */
    public static final class C16208n extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C16208n f66509g = new C16208n();

        public C16208n() {
            super(1);
        }

        /* renamed from: a */
        public final void m55514a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("starting waitForForeground location update check", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m55514a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$o */
    /* loaded from: classes4.dex */
    public static final class C16209o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16209o f66510g = new C16209o();

        public C16209o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while waiting for location update post app foreground, ignoring", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "lastRequestTime", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEndRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl$waitForEndRideConditions$parkingNestsCompletable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n1#2:286\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$p */
    /* loaded from: classes4.dex */
    public static final class C16210p extends Lambda implements Function1<Optional<DateTime>, DateTime> {
        public C16210p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DateTime invoke(Optional<DateTime> lastRequestTime) {
            DateTime dateTime;
            Intrinsics.checkNotNullParameter(lastRequestTime, "lastRequestTime");
            DateTime m59035e = lastRequestTime.m59035e();
            if (m59035e != null) {
                Optional optional = (Optional) EndRideManagerImpl.this.f66485k.getValue();
                if (optional != null) {
                    dateTime = (DateTime) optional.m59035e();
                } else {
                    dateTime = null;
                }
                if (m59035e.isAfter(dateTime)) {
                    return m59035e;
                }
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lorg/joda/time/DateTime;", "lastRequestTime", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "c", "(Lorg/joda/time/DateTime;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$q */
    /* loaded from: classes4.dex */
    public static final class C16211q extends Lambda implements Function1<DateTime, InterfaceC23447K<? extends Optional<DateTime>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "lastUpdateTime", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$q$a */
        /* loaded from: classes4.dex */
        public static final class C16212a extends Lambda implements Function1<Optional<DateTime>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ DateTime f66513g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16212a(DateTime dateTime) {
                super(1);
                this.f66513g = dateTime;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<DateTime> lastUpdateTime) {
                Intrinsics.checkNotNullParameter(lastUpdateTime, "lastUpdateTime");
                DateTime m59035e = lastUpdateTime.m59035e();
                boolean z = false;
                if (m59035e != null && m59035e.isAfter(this.f66513g)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$q$b */
        /* loaded from: classes4.dex */
        public static final class C16213b extends Lambda implements Function1<Optional<DateTime>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EndRideManagerImpl f66514g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16213b(EndRideManagerImpl endRideManagerImpl) {
                super(1);
                this.f66514g = endRideManagerImpl;
            }

            /* renamed from: a */
            public final void m55507a(Optional<DateTime> optional) {
                this.f66514g.f66489o.accept(Boolean.TRUE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Optional<DateTime> optional) {
                m55507a(optional);
                return Unit.INSTANCE;
            }
        }

        public C16211q() {
            super(1);
        }

        /* renamed from: d */
        public static final void m55509d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Optional<DateTime>> invoke(DateTime lastRequestTime) {
            Intrinsics.checkNotNullParameter(lastRequestTime, "lastRequestTime");
            Z84<Optional<DateTime>> mo64016F = EndRideManagerImpl.this.f66478d.mo64016F();
            final C16212a c16212a = new C16212a(lastRequestTime);
            AbstractC23442F<Optional<DateTime>> firstOrError = mo64016F.filter(new InterfaceC23494q() { // from class: wd1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = EndRideManagerImpl.C16211q.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).firstOrError();
            final C16213b c16213b = new C16213b(EndRideManagerImpl.this);
            return firstOrError.m33101w(new InterfaceC23484g() { // from class: xd1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.C16211q.m55509d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$r */
    /* loaded from: classes4.dex */
    public static final class C16214r extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C16214r f66515g = new C16214r();

        public C16214r() {
            super(1);
        }

        /* renamed from: a */
        public final void m55506a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("starting waitForForeground nest update check", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m55506a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.EndRideManagerImpl$s */
    /* loaded from: classes4.dex */
    public static final class C16215s extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16215s f66516g = new C16215s();

        public C16215s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while waiting for nests update post app foreground, ignoring", new Object[0]);
        }
    }

    public EndRideManagerImpl(Context context, YR4 rideManager, InterfaceC12495bn areaManager, InterfaceC47153pv0 configManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC40001dr4 reactiveLocationManager, LifecycleOwner processLifecycleOwner) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        this.f66476b = context;
        this.f66477c = rideManager;
        this.f66478d = areaManager;
        this.f66479e = configManager;
        this.f66480f = reactiveConfig;
        this.f66481g = analyticsManager;
        this.f66482h = reactiveLocationManager;
        this.f66483i = processLifecycleOwner;
        this.f66484j = DateTime.now();
        C0058AG<Optional<DateTime>> m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<Optional<D…Time>>(Optional.absent())");
        this.f66485k = m115950h;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Boolean bool = Boolean.FALSE;
        C37791a94<Boolean> create$default = C37791a94.C10586a.create$default(c10586a, bool, null, 2, null);
        this.f66486l = create$default;
        C37791a94<Boolean> create$default2 = C37791a94.C10586a.create$default(c10586a, bool, null, 2, null);
        this.f66487m = create$default2;
        C37791a94<Boolean> create$default3 = C37791a94.C10586a.create$default(c10586a, bool, null, 2, null);
        this.f66488n = create$default3;
        C37791a94<Boolean> create$default4 = C37791a94.C10586a.create$default(c10586a, bool, null, 2, null);
        this.f66489o = create$default4;
        Z84.C10119a c10119a = Z84.f47888d;
        this.f66491q = c10119a.m73663b(create$default);
        this.f66492r = c10119a.m73663b(create$default2);
        this.f66493s = c10119a.m73663b(create$default3);
        this.f66494t = c10119a.m73663b(create$default4);
        processLifecycleOwner.getLifecycle().mo67008a(this);
    }

    /* renamed from: O */
    public static final void m55570O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23496h m55569P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m55568Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m55567R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m55566S() {
        C41318g46.m40163a("completing waitForForeground config update", new Object[0]);
    }

    /* renamed from: T */
    public static final boolean m55565T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: U */
    public static final InterfaceC23447K m55564U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m55563V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m55562W() {
        C41318g46.m40163a("completing waitForForeground areas update", new Object[0]);
    }

    /* renamed from: X */
    public static final void m55561X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m55560Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m55559Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m55557a0() {
        C41318g46.m40163a("completing waitForForeground nests update", new Object[0]);
    }

    /* renamed from: b0 */
    public static final void m55555b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23496h m55554c0() {
        return AbstractC23461c.m33057c0(250L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d0 */
    public static final void m55552d0(long j) {
        C41318g46.m40163a("Timed out while waiting " + j + " seconds for overall stream to complete, ignoring end ride conditions checks now", new Object[0]);
    }

    /* renamed from: e0 */
    public static final void m55550e0(EndRideManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f66486l.accept(Boolean.FALSE);
    }

    /* renamed from: f0 */
    public static final void m55548f0(EndRideManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f66486l.accept(Boolean.FALSE);
    }

    /* renamed from: g0 */
    public static final boolean m55547g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    public static /* synthetic */ void getLastForegroundTime$ride_release$annotations() {
    }

    /* renamed from: h0 */
    public static final void m55546h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m55545i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m55543j0() {
        C41318g46.m40163a("completing waitForForeground location update", new Object[0]);
    }

    /* renamed from: N */
    public final DateTime m55571N() {
        return this.f66484j;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: a */
    public Z84<Boolean> mo55558a() {
        return this.f66494t;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p000.InterfaceC37014Xc1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo55556b(WireRide wireRide) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long roundToLong;
        long roundToLong2;
        long roundToLong3;
        long roundToLong4;
        YR4 yr4 = this.f66477c;
        if (wireRide != null) {
            str = wireRide.getId();
        } else {
            str = null;
        }
        RideState mo75038i1 = yr4.mo75038i1(str);
        if (mo75038i1 == null) {
            return false;
        }
        EndRideConfig endRide = mo75038i1.getRideConfig().getRideConfig().getEndRide();
        Float waitForForegroundLocationSeconds = endRide.getWaitForForegroundLocationSeconds();
        if (waitForForegroundLocationSeconds != null) {
            roundToLong4 = MathKt__MathJVMKt.roundToLong(waitForForegroundLocationSeconds.floatValue());
            if (Intrinsics.compare(roundToLong4, 0L) == 1) {
                z = true;
                if (!z) {
                    Float waitForForegroundConfigSeconds = endRide.getWaitForForegroundConfigSeconds();
                    if (waitForForegroundConfigSeconds != null) {
                        roundToLong3 = MathKt__MathJVMKt.roundToLong(waitForForegroundConfigSeconds.floatValue());
                        if (Intrinsics.compare(roundToLong3, 0L) == 1) {
                            z2 = true;
                            if (!z2) {
                                Float waitForForegroundAreasSeconds = endRide.getWaitForForegroundAreasSeconds();
                                if (waitForForegroundAreasSeconds != null) {
                                    roundToLong2 = MathKt__MathJVMKt.roundToLong(waitForForegroundAreasSeconds.floatValue());
                                    if (Intrinsics.compare(roundToLong2, 0L) == 1) {
                                        z3 = true;
                                        if (!z3) {
                                            Float waitForForegroundParkingNestsSeconds = endRide.getWaitForForegroundParkingNestsSeconds();
                                            if (waitForForegroundParkingNestsSeconds != null) {
                                                roundToLong = MathKt__MathJVMKt.roundToLong(waitForForegroundParkingNestsSeconds.floatValue());
                                                if (Intrinsics.compare(roundToLong, 0L) == 1) {
                                                    z4 = true;
                                                    if (!z4) {
                                                        return false;
                                                    }
                                                }
                                            }
                                            z4 = false;
                                            if (!z4) {
                                            }
                                        }
                                    }
                                }
                                z3 = false;
                                if (!z3) {
                                }
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
                return true;
            }
        }
        z = false;
        if (!z) {
        }
        return true;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: d */
    public Z84<Boolean> mo55553d() {
        return this.f66491q;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: e */
    public void mo55551e() {
        this.f66490p = null;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: f */
    public Z84<Boolean> mo55549f() {
        return this.f66493s;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: j */
    public AbstractC23461c mo55544j(WireRide wireRide) {
        String str;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        List listOfNotNull;
        Comparable maxOrNull;
        AbstractC23461c abstractC23461c;
        AbstractC23461c abstractC23461c2;
        AbstractC23461c abstractC23461c3;
        AbstractC23461c abstractC23461c4;
        long roundToLong;
        long roundToLong2;
        long roundToLong3;
        long roundToLong4;
        this.f66486l.accept(Boolean.TRUE);
        YR4 yr4 = this.f66477c;
        if (wireRide != null) {
            str = wireRide.getId();
        } else {
            str = null;
        }
        RideState mo75038i1 = yr4.mo75038i1(str);
        if (mo75038i1 == null) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        Config rideConfig = mo75038i1.getRideConfig();
        Float waitForForegroundLocationSeconds = rideConfig.getRideConfig().getEndRide().getWaitForForegroundLocationSeconds();
        if (waitForForegroundLocationSeconds != null) {
            roundToLong4 = MathKt__MathJVMKt.roundToLong(waitForForegroundLocationSeconds.floatValue());
            l = Long.valueOf(roundToLong4);
        } else {
            l = null;
        }
        Float waitForForegroundConfigSeconds = rideConfig.getRideConfig().getEndRide().getWaitForForegroundConfigSeconds();
        if (waitForForegroundConfigSeconds != null) {
            roundToLong3 = MathKt__MathJVMKt.roundToLong(waitForForegroundConfigSeconds.floatValue());
            l2 = Long.valueOf(roundToLong3);
        } else {
            l2 = null;
        }
        Float waitForForegroundAreasSeconds = rideConfig.getRideConfig().getEndRide().getWaitForForegroundAreasSeconds();
        if (waitForForegroundAreasSeconds != null) {
            roundToLong2 = MathKt__MathJVMKt.roundToLong(waitForForegroundAreasSeconds.floatValue());
            l3 = Long.valueOf(roundToLong2);
        } else {
            l3 = null;
        }
        Float waitForForegroundParkingNestsSeconds = rideConfig.getRideConfig().getEndRide().getWaitForForegroundParkingNestsSeconds();
        if (waitForForegroundParkingNestsSeconds != null) {
            roundToLong = MathKt__MathJVMKt.roundToLong(waitForForegroundParkingNestsSeconds.floatValue());
            l4 = Long.valueOf(roundToLong);
        } else {
            l4 = null;
        }
        DateTime lastForegroundTime = this.f66484j;
        Intrinsics.checkNotNullExpressionValue(lastForegroundTime, "lastForegroundTime");
        int m19254h = C46880pT0.m19254h(lastForegroundTime);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Long[]{l, l2, l3, l4});
        maxOrNull = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) listOfNotNull);
        Long l5 = (Long) maxOrNull;
        long j = 1;
        if (l5 != null) {
            j = l5.longValue() + 1;
        }
        final long j2 = j;
        if (m19254h > j2) {
            C41318g46.m40163a("app has already been foregrounded for " + m19254h + " seconds which is longer than the max waiting seconds value (" + j2 + "), ", new Object[0]);
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: md1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    EndRideManagerImpl.m55548f0(EndRideManagerImpl.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete()\n        .doOn…onditions.accept(false) }");
            return m33029z;
        }
        if (l != null) {
            long longValue = l.longValue();
            C41318g46.m40163a("waiting for up to " + longValue + " seconds (waitForForegroundLocationSeconds) for post foreground location update", new Object[0]);
            Z84<Optional<DateTime>> mo43612t = this.f66482h.mo43612t();
            final C16207m c16207m = new C16207m();
            AbstractC23461c m33061Z = mo43612t.filter(new InterfaceC23494q() { // from class: cd1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m55547g0;
                    m55547g0 = EndRideManagerImpl.m55547g0(Function1.this, obj);
                    return m55547g0;
                }
            }).firstOrError().m33159G().m33061Z(longValue, TimeUnit.SECONDS);
            final C16208n c16208n = C16208n.f66509g;
            AbstractC23461c m33081E = m33061Z.m33081E(new InterfaceC23484g() { // from class: dd1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55546h0(Function1.this, obj);
                }
            });
            final C16209o c16209o = C16209o.f66510g;
            abstractC23461c = m33081E.m33084B(new InterfaceC23484g() { // from class: ed1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55545i0(Function1.this, obj);
                }
            }).m33029z(new InterfaceC23478a() { // from class: fd1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    EndRideManagerImpl.m55543j0();
                }
            }).m33069Q();
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c == null) {
            abstractC23461c = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(abstractC23461c, "complete()");
        }
        if (l2 != null) {
            long longValue2 = l2.longValue();
            C41318g46.m40163a("waiting for up to " + longValue2 + " seconds (waitForForegroundConfigSeconds) for post foreground config update", new Object[0]);
            C36207Tq4 c36207Tq4 = this.f66480f;
            String partnerId = mo75038i1.getRide().getPartnerId();
            if (partnerId == null) {
                WireBird bird = mo75038i1.getRide().getBird();
                if (bird != null) {
                    partnerId = bird.getPartnerId();
                } else {
                    partnerId = null;
                }
            }
            Z84<Config> m82612g8 = c36207Tq4.m82612g8(partnerId);
            final C16204j c16204j = new C16204j();
            AbstractC23461c m33061Z2 = m82612g8.filter(new InterfaceC23494q() { // from class: gd1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m55565T;
                    m55565T = EndRideManagerImpl.m55565T(Function1.this, obj);
                    return m55565T;
                }
            }).firstOrError().m33159G().m33061Z(longValue2, TimeUnit.SECONDS);
            final C16205k c16205k = C16205k.f66506g;
            AbstractC23461c m33081E2 = m33061Z2.m33081E(new InterfaceC23484g() { // from class: hd1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55568Q(Function1.this, obj);
                }
            });
            final C16206l c16206l = C16206l.f66507g;
            abstractC23461c2 = m33081E2.m33084B(new InterfaceC23484g() { // from class: id1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55567R(Function1.this, obj);
                }
            }).m33029z(new InterfaceC23478a() { // from class: kd1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    EndRideManagerImpl.m55566S();
                }
            }).m33069Q();
        } else {
            abstractC23461c2 = null;
        }
        if (abstractC23461c2 == null) {
            abstractC23461c2 = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(abstractC23461c2, "complete()");
        }
        if (l3 != null) {
            long longValue3 = l3.longValue();
            C41318g46.m40163a("waiting for up to " + longValue3 + " seconds (waitForForegroundAreasSeconds) for post foreground area update", new Object[0]);
            AbstractC23442F firstOrError = C37279Yf5.m74575T(this.f66478d.mo64017D(), new C16198f()).firstOrError();
            final C16199g c16199g = new C16199g();
            AbstractC23461c m33061Z3 = firstOrError.m33165A(new InterfaceC23492o() { // from class: ld1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m55564U;
                    m55564U = EndRideManagerImpl.m55564U(Function1.this, obj);
                    return m55564U;
                }
            }).m33159G().m33061Z(longValue3, TimeUnit.SECONDS);
            final C16202h c16202h = C16202h.f66503g;
            AbstractC23461c m33029z2 = m33061Z3.m33081E(new InterfaceC23484g() { // from class: nd1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55563V(Function1.this, obj);
                }
            }).m33029z(new InterfaceC23478a() { // from class: od1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    EndRideManagerImpl.m55562W();
                }
            });
            final C16203i c16203i = C16203i.f66504g;
            abstractC23461c3 = m33029z2.m33084B(new InterfaceC23484g() { // from class: pd1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55561X(Function1.this, obj);
                }
            }).m33069Q();
        } else {
            abstractC23461c3 = null;
        }
        if (abstractC23461c3 == null) {
            abstractC23461c3 = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(abstractC23461c3, "complete()");
        }
        if (l4 != null) {
            long longValue4 = l4.longValue();
            C41318g46.m40163a("waiting for up to " + longValue4 + " seconds (waitForForegroundParkingNestsSeconds) for post foreground parking nest update", new Object[0]);
            AbstractC23442F firstOrError2 = C37279Yf5.m74575T(this.f66478d.mo64018C(), new C16210p()).firstOrError();
            final C16211q c16211q = new C16211q();
            AbstractC23461c m33061Z4 = firstOrError2.m33165A(new InterfaceC23492o() { // from class: qd1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m55560Y;
                    m55560Y = EndRideManagerImpl.m55560Y(Function1.this, obj);
                    return m55560Y;
                }
            }).m33159G().m33061Z(longValue4, TimeUnit.SECONDS);
            final C16214r c16214r = C16214r.f66515g;
            AbstractC23461c m33029z3 = m33061Z4.m33081E(new InterfaceC23484g() { // from class: rd1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55559Z(Function1.this, obj);
                }
            }).m33029z(new InterfaceC23478a() { // from class: sd1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    EndRideManagerImpl.m55557a0();
                }
            });
            final C16215s c16215s = C16215s.f66516g;
            abstractC23461c4 = m33029z3.m33084B(new InterfaceC23484g() { // from class: td1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EndRideManagerImpl.m55555b0(Function1.this, obj);
                }
            }).m33069Q();
        } else {
            abstractC23461c4 = null;
        }
        if (abstractC23461c4 == null) {
            AbstractC23461c m33039p2 = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p2, "complete()");
            abstractC23461c4 = m33039p2;
        }
        AbstractC23461c m33029z4 = AbstractC23461c.m33073M(abstractC23461c, abstractC23461c2, abstractC23461c3, abstractC23461c4).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: Zc1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m55554c0;
                m55554c0 = EndRideManagerImpl.m55554c0();
                return m55554c0;
            }
        })).m33060a0(j2, TimeUnit.SECONDS, AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: ad1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                EndRideManagerImpl.m55552d0(j2);
            }
        })).m33029z(new InterfaceC23478a() { // from class: bd1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                EndRideManagerImpl.m55550e0(EndRideManagerImpl.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z4, "mergeArray(\n      locati…onditions.accept(false) }");
        return m33029z4;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: k */
    public String mo55542k() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f66490p = uuid;
        return uuid;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: l */
    public Z84<Boolean> mo55541l() {
        return this.f66492r;
    }

    @Override // p000.InterfaceC37014Xc1
    /* renamed from: n */
    public String mo55540n() {
        return this.f66490p;
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        C41318g46.m40163a("onAppForeground called", new Object[0]);
        this.f66484j = DateTime.now();
        this.f66485k.accept(Optional.f63040c.m59034a());
        C37791a94<Boolean> c37791a94 = this.f66486l;
        Boolean bool = Boolean.FALSE;
        c37791a94.accept(bool);
        this.f66487m.accept(bool);
        this.f66488n.accept(bool);
        this.f66489o.accept(bool);
        AbstractC24507p m32065J = C37279Yf5.m74575T(this.f66482h.mo43612t(), new C16194b()).firstElement().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "override fun onStart(own…))\n      .subscribe()\n  }");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m32048b = m32065J.m32048b(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16195c c16195c = new C16195c();
        ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: Yc1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EndRideManagerImpl.m55570O(Function1.this, obj);
            }
        });
        AbstractC24507p firstElement = C37279Yf5.m74575T(this.f66485k, new C16196d()).firstElement();
        final C16197e c16197e = new C16197e();
        AbstractC23461c m33069Q = firstElement.m32074A(new InterfaceC23492o() { // from class: jd1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m55569P;
                m55569P = EndRideManagerImpl.m55569P(Function1.this, obj);
                return m55569P;
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "override fun onStart(own…))\n      .subscribe()\n  }");
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(m45197b2));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.VX0
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        C41318g46.m40163a("onAppBackground called", new Object[0]);
        this.f66485k.accept(Optional.f63040c.m59034a());
        C37791a94<Boolean> c37791a94 = this.f66486l;
        Boolean bool = Boolean.FALSE;
        c37791a94.accept(bool);
        this.f66487m.accept(bool);
        this.f66488n.accept(bool);
        this.f66489o.accept(bool);
    }
}
