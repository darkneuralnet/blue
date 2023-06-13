package p000;

import android.location.Location;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdScan;
import co.bird.android.model.ScanlessRideItem;
import co.bird.android.model.User;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C35227Pl5;
import p000.C37791a94;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001\u0012B9\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\f\u0010\r\u001a\u00020\u000b*\u00020\bH\u0002J\f\u0010\u000e\u001a\u00020\u000b*\u00020\bH\u0002J\f\u0010\u000f\u001a\u00020\u000b*\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R5\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 -*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b%\u00100R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R5\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 -*\n\u0012\u0004\u0012\u00020\u0006\u0018\u000106060,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b\u0019\u00100R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000606028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006G"}, m28432d2 = {"LPl5;", "LBl5;", "", "x", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/ScanlessRideItem;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/wire/WireBird;", "", "rssiDelta", "", "K", "w", "v", "B", "scanlessRideItem", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "bird", "c", "LTq4;", "LTq4;", "config", "LRh6;", "b", "LRh6;", "getUserStream", "()LRh6;", "userStream", "LMD;", "LMD;", "rxBleManager", "LaM;", "LaM;", "birdManager", "Ldr4;", "e", "Ldr4;", "reactiveLocationManager", "LEa;", "f", "LEa;", "analyticsManager", "LZ84;", "kotlin.jvm.PlatformType", "g", "Lkotlin/Lazy;", "()LZ84;", "availableScanlessRideVehicles", "La94;", "h", "La94;", "mutableAvailableScanlessRideVehicles", "Lco/bird/android/buava/Optional;", "i", "currentScanlessRideRequest", "j", "mutableCurrentScanlessRideRequest", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "k", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "mainThreadScanningTrackingQueue", "Landroid/location/Location;", "l", "Landroid/location/Location;", "lastLocation", "<init>", "(LTq4;LRh6;LMD;LaM;Ldr4;LEa;)V", "m", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n180#2:344\n180#2:345\n180#2:349\n1747#3,3:346\n*S KotlinDebug\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl\n*L\n83#1:344\n91#1:345\n207#1:349\n130#1:346,3\n*E\n"})
/* renamed from: Pl5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35227Pl5 implements InterfaceC31951Bl5 {

    /* renamed from: m */
    public static final C6463d f28984m = new C6463d(null);

    /* renamed from: a */
    public final C36207Tq4 f28985a;

    /* renamed from: b */
    public final InterfaceC35660Rh6 f28986b;

    /* renamed from: c */
    public final InterfaceC5225MD f28987c;

    /* renamed from: d */
    public final InterfaceC10636aM f28988d;

    /* renamed from: e */
    public final InterfaceC40001dr4 f28989e;

    /* renamed from: f */
    public final InterfaceC1880Ea f28990f;

    /* renamed from: g */
    public final Lazy f28991g;

    /* renamed from: h */
    public final C37791a94<List<ScanlessRideItem>> f28992h;

    /* renamed from: i */
    public final Lazy f28993i;

    /* renamed from: j */
    public final C37791a94<Optional<ScanlessRideItem>> f28994j;

    /* renamed from: k */
    public final ConcurrentLinkedQueue<Long> f28995k;

    /* renamed from: l */
    public Location f28996l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$a */
    /* loaded from: classes4.dex */
    public static final class C6460a extends Lambda implements Function1<User, Unit> {
        public C6460a() {
            super(1);
        }

        /* renamed from: a */
        public final void m89830a(User user) {
            C35227Pl5.this.f28992h.m71836j();
            C35227Pl5.this.mo89853d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m89830a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$b */
    /* loaded from: classes4.dex */
    public static final class C6461b extends Lambda implements Function1<Long, Unit> {
        public C6461b() {
            super(1);
        }

        /* renamed from: a */
        public final void m89829a(Long l) {
            Iterator it = C35227Pl5.this.f28995k.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "mainThreadScanningTrackingQueue.iterator()");
            long j = 0;
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "currentValues.next()");
                j += ((Number) next).longValue();
                it.remove();
            }
            if (j > 0) {
                C35227Pl5.this.f28990f.mo55905y(new C10286ZX(null, null, null, AbstractComponentTracker.LINGERING_TIMEOUT, j, j / 10000.0d, "ScanlessRideManagerImpl", 7, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m89829a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pl5$c */
    /* loaded from: classes4.dex */
    public static final class C6462c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C6462c f28999g = new C6462c();

        public C6462c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error in stream reporting main thread operations", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LPl5$d;", "", "", "SCAN_TIME_ON_MAIN_THREAD_REPORTING_PERIOD_MS", "J", "<init>", "()V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$d */
    /* loaded from: classes4.dex */
    public static final class C6463d {
        public /* synthetic */ C6463d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6463d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$e */
    /* loaded from: classes4.dex */
    public static final class C6464e extends Lambda implements Function0<Z84<List<? extends ScanlessRideItem>>> {
        public C6464e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends ScanlessRideItem>> invoke2() {
            return Z84.f47888d.m73663b(C35227Pl5.this.f28992h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$f */
    /* loaded from: classes4.dex */
    public static final class C6465f extends Lambda implements Function0<Z84<Optional<ScanlessRideItem>>> {
        public C6465f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<ScanlessRideItem>> invoke() {
            return Z84.f47888d.m73663b(C35227Pl5.this.f28994j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pl5$g */
    /* loaded from: classes4.dex */
    public static final class C6466g extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C6466g f29002g = new C6466g();

        public C6466g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getRideConfig().getEnableScanlessRideStart());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "scanlessRideEnabled", "Lio/reactivex/B;", "", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$h */
    /* loaded from: classes4.dex */
    public static final class C6467h extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends List<? extends ScanlessRideItem>>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$observeAvailableScanlessRideVehicles$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
        /* renamed from: Pl5$h$a */
        /* loaded from: classes4.dex */
        public static final class C6468a extends Lambda implements Function1<List<? extends WireBird>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C35227Pl5 f29004g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6468a(C35227Pl5 c35227Pl5) {
                super(1);
                this.f29004g = c35227Pl5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(List<? extends WireBird> list) {
                return invoke2((List<WireBird>) list);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(List<WireBird> list) {
                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                Location m73665a = this.f29004g.f28989e.mo43616p().m73665a();
                float distanceTo = this.f29004g.f28996l.distanceTo(m73665a);
                double scanlessUpdateDistance = this.f29004g.f28985a.m82623f8().m73665a().getRideConfig().getScanlessUpdateDistance();
                C41318g46.m40163a("checking to see if user has moved " + scanlessUpdateDistance + " meters, moved " + distanceTo + " meters", new Object[0]);
                float scanlessUpdateDistance2 = (float) this.f29004g.f28985a.m82623f8().m73665a().getRideConfig().getScanlessUpdateDistance();
                this.f29004g.f28996l = m73665a;
                Unit unit = Unit.INSTANCE;
                return Boolean.valueOf(distanceTo > scanlessUpdateDistance2);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/B;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "e", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$observeAvailableScanlessRideVehicles$2$2\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,343:1\n52#2,2:344\n*S KotlinDebug\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$observeAvailableScanlessRideVehicles$2$2\n*L\n180#1:344,2\n*E\n"})
        /* renamed from: Pl5$h$b */
        /* loaded from: classes4.dex */
        public static final class C6469b extends Lambda implements Function1<List<? extends WireBird>, InterfaceC23434B<? extends List<? extends ScanlessRideItem>>> {

            /* renamed from: g */
            public final /* synthetic */ C35227Pl5 f29005g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "t", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Pl5$h$b$a */
            /* loaded from: classes4.dex */
            public static final class C6470a extends Lambda implements Function1<Long, Boolean> {

                /* renamed from: g */
                public static final C6470a f29006g = new C6470a();

                public C6470a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Long t) {
                    Intrinsics.checkNotNullParameter(t, "t");
                    return Boolean.valueOf(t.longValue() > 0);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "t", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Pl5$h$b$b */
            /* loaded from: classes4.dex */
            public static final class C6471b extends Lambda implements Function1<Long, Boolean> {

                /* renamed from: g */
                public static final C6471b f29007g = new C6471b();

                public C6471b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Long t) {
                    Intrinsics.checkNotNullParameter(t, "t");
                    return Boolean.valueOf(t.longValue() > 0);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012 \u0010\u0004\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Pl5$h$b$c */
            /* loaded from: classes4.dex */
            public static final class C6472c extends Lambda implements Function1<Pair<? extends List<? extends ScanlessRideItem>, ? extends Boolean>, List<? extends ScanlessRideItem>> {

                /* renamed from: g */
                public static final C6472c f29008g = new C6472c();

                public C6472c() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ List<? extends ScanlessRideItem> invoke(Pair<? extends List<? extends ScanlessRideItem>, ? extends Boolean> pair) {
                    return invoke2((Pair<? extends List<ScanlessRideItem>, Boolean>) pair);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final List<ScanlessRideItem> invoke2(Pair<? extends List<ScanlessRideItem>, Boolean> pair) {
                    List<ScanlessRideItem> emptyList;
                    Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                    List<ScanlessRideItem> component1 = pair.component1();
                    Boolean shouldExpire = pair.component2();
                    int size = component1.size();
                    C41318g46.m40163a("received " + size + " scan results, shouldExpire = " + shouldExpire, new Object[0]);
                    Intrinsics.checkNotNullExpressionValue(shouldExpire, "shouldExpire");
                    if (shouldExpire.booleanValue()) {
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                        return emptyList;
                    }
                    return component1;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Pl5$h$b$d */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C6473d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

                /* renamed from: b */
                public static final C6473d f29009b = new C6473d();

                public C6473d() {
                    super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
            /* renamed from: Pl5$h$b$e */
            /* loaded from: classes4.dex */
            public static final class C6474e<T1, T2, R> implements InterfaceC23480c {

                /* renamed from: a */
                public static final C6474e<T1, T2, R> f29010a = new C6474e<>();

                @Override // io.reactivex.functions.InterfaceC23480c
                /* renamed from: a */
                public final Pair<T1, T2> apply(T1 t1, T2 t2) {
                    return TuplesKt.m28425to(t1, t2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6469b(C35227Pl5 c35227Pl5) {
                super(1);
                this.f29005g = c35227Pl5;
            }

            /* renamed from: f */
            public static final Boolean m89820f(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Boolean) tmp0.invoke(obj);
            }

            /* renamed from: g */
            public static final List m89819g(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (List) tmp0.invoke(obj);
            }

            /* renamed from: h */
            public static final void m89818h(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: e */
            public final InterfaceC23434B<? extends List<ScanlessRideItem>> invoke(List<WireBird> birds) {
                List emptyList;
                List emptyList2;
                Intrinsics.checkNotNullParameter(birds, "birds");
                if (this.f29005g.f28987c.mo73605b() != InterfaceC5225MD.EnumC5227b.READY) {
                    C41318g46.m40163a("bluetooth not enabled while checking for scanless rides eligible birds, returning without scan", new Object[0]);
                    emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    return Observable.just(emptyList2);
                }
                int size = birds.size();
                C41318g46.m40163a("got " + size + " nearby birds, starting quickstart scan...", new Object[0]);
                C40463ee3 c40463ee3 = C40463ee3.f78649a;
                Observable m89865C = this.f29005g.m89865C();
                Observable<Long> interval = Observable.interval(0L, (long) this.f29005g.f28985a.m82623f8().m73665a().getRideConfig().getScanlessRideBirdCacheExpirationTimeSeconds(), TimeUnit.SECONDS);
                final C6470a c6470a = C6470a.f29006g;
                Observable<Long> takeUntil = interval.takeUntil(new InterfaceC23494q() { // from class: Sl5
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = C35227Pl5.C6467h.C6469b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                final C6471b c6471b = C6471b.f29007g;
                Observable distinctUntilChanged = takeUntil.map(new InterfaceC23492o() { // from class: Tl5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Boolean m89820f;
                        m89820f = C35227Pl5.C6467h.C6469b.m89820f(Function1.this, obj);
                        return m89820f;
                    }
                }).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "interval(0, config.confi…  .distinctUntilChanged()");
                Observable combineLatest = Observable.combineLatest(m89865C, distinctUntilChanged, C6474e.f29010a);
                Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
                final C6472c c6472c = C6472c.f29008g;
                Observable map = combineLatest.map(new InterfaceC23492o() { // from class: Ul5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m89819g;
                        m89819g = C35227Pl5.C6467h.C6469b.m89819g(Function1.this, obj);
                        return m89819g;
                    }
                });
                final C6473d c6473d = C6473d.f29009b;
                Observable doOnError = map.doOnError(new InterfaceC23484g() { // from class: Vl5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C35227Pl5.C6467h.C6469b.m89818h(Function1.this, obj);
                    }
                });
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return doOnError.onErrorReturnItem(emptyList);
            }
        }

        public C6467h() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23434B m89826c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends List<ScanlessRideItem>> invoke(Boolean scanlessRideEnabled) {
            List emptyList;
            Intrinsics.checkNotNullParameter(scanlessRideEnabled, "scanlessRideEnabled");
            C41318g46.m40163a("scanlessRideEnabled updated to " + scanlessRideEnabled, new Object[0]);
            if (!scanlessRideEnabled.booleanValue()) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return Observable.just(emptyList);
            }
            Z84<List<WireBird>> mo71591R0 = C35227Pl5.this.f28988d.mo71591R0();
            final C6468a c6468a = new C6468a(C35227Pl5.this);
            Observable<List<WireBird>> filter = mo71591R0.filter(new InterfaceC23494q() { // from class: Ql5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C35227Pl5.C6467h.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C6469b c6469b = new C6469b(C35227Pl5.this);
            return filter.switchMap(new InterfaceC23492o() { // from class: Rl5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m89826c;
                    m89826c = C35227Pl5.C6467h.m89826c(Function1.this, obj);
                    return m89826c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$observeAvailableScanlessRideVehicles$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n1549#2:344\n1620#2,3:345\n*S KotlinDebug\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$observeAvailableScanlessRideVehicles$3\n*L\n205#1:344\n205#1:345,3\n*E\n"})
    /* renamed from: Pl5$i */
    /* loaded from: classes4.dex */
    public static final class C6475i extends Lambda implements Function1<List<? extends ScanlessRideItem>, Unit> {
        public C6475i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ScanlessRideItem> list) {
            invoke2((List<ScanlessRideItem>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ScanlessRideItem> it) {
            int collectionSizeOrDefault;
            InterfaceC10636aM interfaceC10636aM = C35227Pl5.this.f28988d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            List<ScanlessRideItem> list = it;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (ScanlessRideItem scanlessRideItem : list) {
                arrayList.add(scanlessRideItem.getBird());
            }
            interfaceC10636aM.mo71601H0(arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/ScanlessRideItem;", "it", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$removeScanlessBirdIfExists$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n819#2:344\n847#2,2:345\n*S KotlinDebug\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$removeScanlessBirdIfExists$1\n*L\n123#1:344\n123#1:345,2\n*E\n"})
    /* renamed from: Pl5$j */
    /* loaded from: classes4.dex */
    public static final class C6476j extends Lambda implements Function1<List<? extends ScanlessRideItem>, List<? extends ScanlessRideItem>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f29012g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6476j(WireBird wireBird) {
            super(1);
            this.f29012g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<ScanlessRideItem> invoke(List<ScanlessRideItem> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            WireBird wireBird = this.f29012g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : it) {
                if (!((ScanlessRideItem) obj).getBird().isSame(wireBird)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "scanResult", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$k */
    /* loaded from: classes4.dex */
    public static final class C6477k extends Lambda implements Function1<C36154Tk5, Boolean> {
        public C6477k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 scanResult) {
            boolean z;
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            long currentTimeMillis = System.currentTimeMillis();
            boolean m80900y = C36388Uk5.m80900y(scanResult);
            boolean m80946E = C36388Uk5.m80946E(scanResult);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                C35227Pl5.this.f28995k.add(Long.valueOf(currentTimeMillis2 - currentTimeMillis));
            }
            if (!m80900y && !m80946E) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LTk5;", "kotlin.jvm.PlatformType", "", "results", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n1054#2:344\n*S KotlinDebug\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$2\n*L\n234#1:344\n*E\n"})
    /* renamed from: Pl5$l */
    /* loaded from: classes4.dex */
    public static final class C6478l extends Lambda implements Function1<List<C36154Tk5>, List<? extends C36154Tk5>> {

        /* renamed from: g */
        public static final C6478l f29014g = new C6478l();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$2\n*L\n1#1,328:1\n234#2:329\n*E\n"})
        /* renamed from: Pl5$l$a */
        /* loaded from: classes4.dex */
        public static final class C6479a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((C36154Tk5) t2).m83015b()), Integer.valueOf(((C36154Tk5) t).m83015b()));
                return compareValues;
            }
        }

        public C6478l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C36154Tk5> invoke(List<C36154Tk5> results) {
            List<C36154Tk5> sortedWith;
            Intrinsics.checkNotNullParameter(results, "results");
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(results, new C6479a());
            return sortedWith;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001d\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\u0006\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LTk5;", "kotlin.jvm.PlatformType", "it", "", "", C17296a.f69688o, "(Ljava/util/List;)Ljava/lang/Iterable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$m */
    /* loaded from: classes4.dex */
    public static final class C6480m extends Lambda implements Function1<List<? extends C36154Tk5>, Iterable<? extends C36154Tk5>> {

        /* renamed from: g */
        public static final C6480m f29015g = new C6480m();

        public C6480m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Iterable<C36154Tk5> invoke(List<? extends C36154Tk5> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LTk5;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$n */
    /* loaded from: classes4.dex */
    public static final class C6481n extends Lambda implements Function1<C36154Tk5, String> {

        /* renamed from: g */
        public static final C6481n f29016g = new C6481n();

        public C6481n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C36154Tk5 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return C36388Uk5.m80913l(result);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LTk5;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$o */
    /* loaded from: classes4.dex */
    public static final class C6482o extends Lambda implements Function1<C36154Tk5, InterfaceC24574u<? extends Pair<? extends WireBird, ? extends C36154Tk5>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdScan;", "birdScan", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "LTk5;", C17296a.f69688o, "(Lco/bird/android/model/BirdScan;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Pl5$o$a */
        /* loaded from: classes4.dex */
        public static final class C6483a extends Lambda implements Function1<BirdScan, Pair<? extends WireBird, ? extends C36154Tk5>> {

            /* renamed from: g */
            public final /* synthetic */ C36154Tk5 f29018g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6483a(C36154Tk5 c36154Tk5) {
                super(1);
                this.f29018g = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireBird, C36154Tk5> invoke(BirdScan birdScan) {
                WireBird copy;
                Intrinsics.checkNotNullParameter(birdScan, "birdScan");
                WireBird bird = birdScan.getBird();
                if (bird != null) {
                    C36154Tk5 c36154Tk5 = this.f29018g;
                    copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : false, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : birdScan.getEphemeralId(), (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
                    return TuplesKt.m28425to(copy, c36154Tk5);
                }
                return null;
            }
        }

        public C6482o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<WireBird, C36154Tk5>> invoke(C36154Tk5 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            String m80913l = C36388Uk5.m80913l(result);
            if (m80913l == null) {
                return AbstractC24507p.m32024u();
            }
            return C37279Yf5.m74575T(C38096ag5.m70884k(C35227Pl5.this.f28988d.mo71586W0(m80913l, MapMode.RIDER, ScanIntention.QUICKSTART, false, null)), new C6483a(result)).firstOrError().m33125j0().m32065J();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00052X\u0010\u0006\u001aT\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "LTk5;", "kotlin.jvm.PlatformType", "", "list", "Lco/bird/android/model/ScanlessRideItem;", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1963#2,14:344\n1603#2,9:358\n1855#2:367\n1856#2:370\n1612#2:371\n1054#2:372\n1#3:368\n1#3:369\n*S KotlinDebug\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$7\n*L\n273#1:344,14\n276#1:358,9\n276#1:367\n276#1:370\n276#1:371\n288#1:372\n276#1:369\n*E\n"})
    /* renamed from: Pl5$q */
    /* loaded from: classes4.dex */
    public static final class C6485q extends Lambda implements Function1<List<Pair<? extends WireBird, ? extends C36154Tk5>>, List<? extends ScanlessRideItem>> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$7\n*L\n1#1,328:1\n288#2:329\n*E\n"})
        /* renamed from: Pl5$q$a */
        /* loaded from: classes4.dex */
        public static final class C6486a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Double.valueOf(((ScanlessRideItem) t2).getScore()), Double.valueOf(((ScanlessRideItem) t).getScore()));
                return compareValues;
            }
        }

        public C6485q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<ScanlessRideItem> invoke(List<Pair<WireBird, C36154Tk5>> list) {
            Object next;
            List<ScanlessRideItem> emptyList;
            C36154Tk5 c36154Tk5;
            List<ScanlessRideItem> sortedWith;
            Object firstOrNull;
            Double d;
            Integer num;
            Integer num2;
            WireBird bird;
            WireBird bird2;
            C36154Tk5 scanResult;
            boolean z;
            ScanlessRideItem scanlessRideItem;
            Intrinsics.checkNotNullParameter(list, "list");
            List<Pair<WireBird, C36154Tk5>> list2 = list;
            Iterator<T> it = list2.iterator();
            String str = null;
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int m83015b = ((C36154Tk5) ((Pair) next).getSecond()).m83015b();
                    do {
                        Object next2 = it.next();
                        int m83015b2 = ((C36154Tk5) ((Pair) next2).getSecond()).m83015b();
                        if (m83015b < m83015b2) {
                            next = next2;
                            m83015b = m83015b2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair = (Pair) next;
            if (pair != null && (c36154Tk5 = (C36154Tk5) pair.getSecond()) != null) {
                int m83015b3 = c36154Tk5.m83015b();
                C35227Pl5 c35227Pl5 = C35227Pl5.this;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    WireBird wireBird = (WireBird) pair2.component1();
                    C36154Tk5 c36154Tk52 = (C36154Tk5) pair2.component2();
                    Double valueOf = Double.valueOf(c35227Pl5.m89857K(wireBird, c36154Tk52.m83015b() - m83015b3));
                    if (valueOf.doubleValue() > 0.0d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        scanlessRideItem = new ScanlessRideItem(wireBird, c36154Tk52, valueOf.doubleValue());
                    } else {
                        scanlessRideItem = null;
                    }
                    if (scanlessRideItem != null) {
                        arrayList.add(scanlessRideItem);
                    }
                }
                sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new C6486a());
                C35227Pl5 c35227Pl52 = C35227Pl5.this;
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) sortedWith);
                ScanlessRideItem scanlessRideItem2 = (ScanlessRideItem) firstOrNull;
                InterfaceC1880Ea interfaceC1880Ea = c35227Pl52.f28990f;
                int size = sortedWith.size();
                if (scanlessRideItem2 != null) {
                    d = Double.valueOf(scanlessRideItem2.getScore());
                } else {
                    d = null;
                }
                if (scanlessRideItem2 != null && (scanResult = scanlessRideItem2.getScanResult()) != null) {
                    num = Integer.valueOf(scanResult.m83015b());
                } else {
                    num = null;
                }
                if (scanlessRideItem2 != null && (bird2 = scanlessRideItem2.getBird()) != null) {
                    num2 = Integer.valueOf(bird2.getBatteryLevel());
                } else {
                    num2 = null;
                }
                if (scanlessRideItem2 != null && (bird = scanlessRideItem2.getBird()) != null) {
                    str = bird.getModel();
                }
                interfaceC1880Ea.mo55905y(new C35397Qe4(null, null, null, size, d, num, num2, str, 7, null));
                return sortedWith;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    public C35227Pl5(C36207Tq4 config, InterfaceC35660Rh6 userStream, InterfaceC5225MD rxBleManager, InterfaceC10636aM birdManager, InterfaceC40001dr4 reactiveLocationManager, InterfaceC1880Ea analyticsManager) {
        Lazy lazy;
        List emptyList;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(rxBleManager, "rxBleManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f28985a = config;
        this.f28986b = userStream;
        this.f28987c = rxBleManager;
        this.f28988d = birdManager;
        this.f28989e = reactiveLocationManager;
        this.f28990f = analyticsManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C6464e());
        this.f28991g = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f28992h = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6465f());
        this.f28993i = lazy2;
        this.f28994j = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        this.f28995k = new ConcurrentLinkedQueue<>();
        this.f28996l = C37068Xi1.f43709a.m76547a();
        C41318g46.m40163a("init called", new Object[0]);
        m89833x();
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6460a c6460a = new C6460a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ml5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35227Pl5.m89838s(Function1.this, obj);
            }
        });
        Observable<Long> interval = Observable.interval(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(interval, "interval(SCAN_TIME_ON_MA…S, TimeUnit.MILLISECONDS)");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = interval.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6461b c6461b = new C6461b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Nl5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35227Pl5.m89837t(Function1.this, obj);
            }
        };
        final C6462c c6462c = C6462c.f28999g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ol5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35227Pl5.m89836u(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m89867A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final String m89864D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC24574u m89863E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final boolean m89862F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G */
    public static final List m89861G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final boolean m89860H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: I */
    public static final List m89859I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final Iterable m89858J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m89838s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m89837t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m89836u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Boolean m89832y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23434B m89831z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final double m89866B(int i) {
        return 1.0d - ((Math.abs(i) / 6.0d) * 0.1d);
    }

    /* renamed from: C */
    public final Observable<List<ScanlessRideItem>> m89865C() {
        long roundToLong;
        Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(this.f28987c, 2, true, null, 4, null);
        final C6477k c6477k = new C6477k();
        Observable filter = scanBleDevices$default.filter(new InterfaceC23494q() { // from class: Cl5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m89860H;
                m89860H = C35227Pl5.m89860H(Function1.this, obj);
                return m89860H;
            }
        });
        roundToLong = MathKt__MathJVMKt.roundToLong(this.f28985a.m82623f8().m73665a().getRideConfig().getScanlessRideBluetoothScanDuration());
        Observable take = filter.buffer(roundToLong, TimeUnit.SECONDS).take(1L);
        final C6478l c6478l = C6478l.f29014g;
        Observable map = take.map(new InterfaceC23492o() { // from class: Gl5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m89859I;
                m89859I = C35227Pl5.m89859I(Function1.this, obj);
                return m89859I;
            }
        });
        final C6480m c6480m = C6480m.f29015g;
        Observable flatMapIterable = map.flatMapIterable(new InterfaceC23492o() { // from class: Hl5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Iterable m89858J;
                m89858J = C35227Pl5.m89858J(Function1.this, obj);
                return m89858J;
            }
        });
        final C6481n c6481n = C6481n.f29016g;
        Observable distinct = flatMapIterable.distinct(new InterfaceC23492o() { // from class: Il5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m89864D;
                m89864D = C35227Pl5.m89864D(Function1.this, obj);
                return m89864D;
            }
        });
        final C6482o c6482o = new C6482o();
        Observable flatMapMaybe = distinct.flatMapMaybe(new InterfaceC23492o() { // from class: Jl5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m89863E;
                m89863E = C35227Pl5.m89863E(Function1.this, obj);
                return m89863E;
            }
        });
        final C6484p c6484p = C6484p.f29019g;
        Observable take2 = flatMapMaybe.filter(new InterfaceC23494q() { // from class: Kl5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m89862F;
                m89862F = C35227Pl5.m89862F(Function1.this, obj);
                return m89862F;
            }
        }).buffer(this.f28985a.m82623f8().m73665a().getRideConfig().getScanlessRideMaxApiScanLimit()).take(1L);
        final C6485q c6485q = new C6485q();
        Observable<List<ScanlessRideItem>> map2 = take2.map(new InterfaceC23492o() { // from class: Ll5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m89861G;
                m89861G = C35227Pl5.m89861G(Function1.this, obj);
                return m89861G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "private fun scanBleObser…)\n          }\n      }\n  }");
        return map2;
    }

    /* renamed from: K */
    public final double m89857K(WireBird wireBird, int i) {
        return m89834w(wireBird) * m89835v(wireBird) * m89866B(i);
    }

    @Override // p000.InterfaceC31951Bl5
    /* renamed from: a */
    public void mo89856a(ScanlessRideItem scanlessRideItem) {
        Intrinsics.checkNotNullParameter(scanlessRideItem, "scanlessRideItem");
        this.f28994j.accept(Optional.f63040c.m59032c(scanlessRideItem));
    }

    @Override // p000.InterfaceC31951Bl5
    /* renamed from: b */
    public Z84<Optional<ScanlessRideItem>> mo89855b() {
        return (Z84) this.f28993i.getValue();
    }

    @Override // p000.InterfaceC31951Bl5
    /* renamed from: c */
    public void mo89854c(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f28992h.m71837i(new C6476j(bird));
    }

    @Override // p000.InterfaceC31951Bl5
    /* renamed from: d */
    public void mo89853d() {
        this.f28994j.m71836j();
    }

    @Override // p000.InterfaceC31951Bl5
    /* renamed from: e */
    public Z84<List<ScanlessRideItem>> mo89852e() {
        return (Z84) this.f28991g.getValue();
    }

    /* renamed from: v */
    public final double m89835v(WireBird wireBird) {
        if (wireBird.getBatteryLevel() >= 20) {
            return wireBird.getBatteryLevel() / 100.0d;
        }
        return 0.0d;
    }

    /* renamed from: w */
    public final double m89834w(WireBird wireBird) {
        if (WireBirdKt.isB3Model(wireBird) || WireBirdKt.isB2Model(wireBird) || WireBirdKt.isBikeShare(wireBird) || WireBirdKt.isSModel(wireBird)) {
            return 1.0d;
        }
        if (WireBirdKt.isRfModel(wireBird)) {
            return 0.8d;
        }
        if (WireBirdKt.isOKBModel(wireBird)) {
            return 0.5d;
        }
        if (WireBirdKt.isCruiserModel(wireBird) || WireBirdKt.isPrivateBird(wireBird)) {
            return 0.0d;
        }
        return 0.3d;
    }

    /* renamed from: x */
    public final void m89833x() {
        Z84<Config> m82623f8 = this.f28985a.m82623f8();
        final C6466g c6466g = C6466g.f29002g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: Dl5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m89832y;
                m89832y = C35227Pl5.m89832y(Function1.this, obj);
                return m89832y;
            }
        }).distinctUntilChanged();
        final C6467h c6467h = new C6467h();
        Observable switchMap = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: El5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m89831z;
                m89831z = C35227Pl5.m89831z(Function1.this, obj);
                return m89831z;
            }
        });
        final C6475i c6475i = new C6475i();
        Observable doOnNext = switchMap.doOnNext(new InterfaceC23484g() { // from class: Fl5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35227Pl5.m89867A(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun observeAvail…ScanlessRideVehicles)\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f28992h);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "LTk5;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pl5$p */
    /* loaded from: classes4.dex */
    public static final class C6484p extends Lambda implements Function1<Pair<? extends WireBird, ? extends C36154Tk5>, Boolean> {

        /* renamed from: g */
        public static final C6484p f29019g = new C6484p();

        public C6484p() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<WireBird, ? extends C36154Tk5> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(WireBirdKt.isAvailable(pair.component1()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends WireBird, ? extends C36154Tk5> pair) {
            return invoke2((Pair<WireBird, ? extends C36154Tk5>) pair);
        }
    }
}
