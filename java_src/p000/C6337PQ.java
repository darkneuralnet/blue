package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.wire.configs.BirdPlusConfig;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0014*\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R5\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u001c*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00140\u00140\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R'\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R'\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R'\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R'\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00068"}, m28432d2 = {"LPQ;", "LJQ;", "Lio/reactivex/c;", "refresh", "", "subscriptionPlanId", "", "trial", "m", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlus", "K", "userSubscriptionId", "Q", "a0", "Lio/reactivex/Observable;", "e0", "d0", "codename", "c0", "", "enabled", "k", "LoR;", C17296a.f69688o, "LoR;", "birdPlusViewRepository", "LZ84;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "b0", "()LZ84;", "birdPlusViews", "c", "getPromotedBirdPlusViews", "promotedBirdPlusViews", DateTokenConverter.CONVERTER_KEY, "getActiveBirdPlusViews", "activeBirdPlusViews", "e", "getAvailableBirdPlusViews", "availableBirdPlusViews", "f", "getIneligibleBirdPlusViews", "ineligibleBirdPlusViews", "La94;", "g", "La94;", "birdPlusesRelay", "LTq4;", "reactiveConfig", "LRh6;", "userStream", "<init>", "(LoR;LTq4;LRh6;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n180#2:171\n180#2:174\n52#3,2:172\n766#4:175\n857#4,2:176\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl\n*L\n70#1:171\n84#1:174\n78#1:172,2\n166#1:175\n166#1:176,2\n*E\n"})
/* renamed from: PQ */
/* loaded from: classes4.dex */
public final class C6337PQ implements InterfaceC4077JQ {

    /* renamed from: a */
    public final InterfaceC26980oR f28422a;

    /* renamed from: b */
    public final Lazy f28423b;

    /* renamed from: c */
    public final Lazy f28424c;

    /* renamed from: d */
    public final Lazy f28425d;

    /* renamed from: e */
    public final Lazy f28426e;

    /* renamed from: f */
    public final Lazy f28427f;

    /* renamed from: g */
    public final C37791a94<List<BirdPlusView>> f28428g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PQ$a */
    /* loaded from: classes4.dex */
    public static final class C6338a extends Lambda implements Function1<User, Unit> {
        public C6338a() {
            super(1);
        }

        /* renamed from: a */
        public final void m90325a(User user) {
            C6337PQ.this.f28422a.mo10285u1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m90325a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PQ$b */
    /* loaded from: classes4.dex */
    public static final class C6339b extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C6339b f28430g = new C6339b();

        public C6339b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BirdPlusConfig birdPlus = it.getBirdPlus();
            return Boolean.valueOf(birdPlus != null ? Intrinsics.areEqual(birdPlus.getEnabled(), Boolean.TRUE) : false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PQ$c */
    /* loaded from: classes4.dex */
    public static final class C6340c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C6340c f28431g = new C6340c();

        public C6340c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Possible recoverable error while streaming bird plus views from database.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PQ$d */
    /* loaded from: classes4.dex */
    public static final class C6341d extends Lambda implements Function1<Pair<? extends List<? extends BirdPlusView>, ? extends Boolean>, Unit> {
        public C6341d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends BirdPlusView>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<BirdPlusView>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<BirdPlusView>, Boolean> pair) {
            Boolean enabled = pair.component2();
            C37791a94 c37791a94 = C6337PQ.this.f28428g;
            C6337PQ c6337pq = C6337PQ.this;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            c37791a94.accept(c6337pq.m90327k(pair.component1(), enabled.booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PQ$e */
    /* loaded from: classes4.dex */
    public static final class C6342e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C6342e f28433g = new C6342e();

        public C6342e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Uncaught error while streaming bird plus views from database, stream closed.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$activeBirdPlusViews$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$activeBirdPlusViews$2\n*L\n44#1:171\n44#1:172,2\n*E\n"})
    /* renamed from: PQ$f */
    /* loaded from: classes4.dex */
    public static final class C6343f extends Lambda implements Function0<Z84<List<? extends BirdPlusView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$activeBirdPlusViews$2$activePassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n1#3:174\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$activeBirdPlusViews$2$activePassesObservable$1\n*L\n40#1:171\n40#1:172,2\n*E\n"})
        /* renamed from: PQ$f$a */
        /* loaded from: classes4.dex */
        public static final class C6344a extends Lambda implements Function1<List<? extends BirdPlusView>, List<? extends BirdPlusView>> {

            /* renamed from: g */
            public static final C6344a f28435g = new C6344a();

            public C6344a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<BirdPlusView> invoke(List<BirdPlusView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((BirdPlusView) obj).isActive()) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                return arrayList;
            }
        }

        public C6343f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends BirdPlusView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(C6337PQ.this.f28428g, C6344a.f28435g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) C6337PQ.this.f28428g.getValue()) {
                if (((BirdPlusView) obj).isActive()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$availableBirdPlusViews$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$availableBirdPlusViews$2\n*L\n53#1:171\n53#1:172,2\n*E\n"})
    /* renamed from: PQ$g */
    /* loaded from: classes4.dex */
    public static final class C6345g extends Lambda implements Function0<Z84<List<? extends BirdPlusView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$availableBirdPlusViews$2$availablePassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n1#3:174\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$availableBirdPlusViews$2$availablePassesObservable$1\n*L\n49#1:171\n49#1:172,2\n*E\n"})
        /* renamed from: PQ$g$a */
        /* loaded from: classes4.dex */
        public static final class C6346a extends Lambda implements Function1<List<? extends BirdPlusView>, List<? extends BirdPlusView>> {

            /* renamed from: g */
            public static final C6346a f28437g = new C6346a();

            public C6346a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<BirdPlusView> invoke(List<BirdPlusView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((BirdPlusView) obj).isAvailable()) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                return arrayList;
            }
        }

        public C6345g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends BirdPlusView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(C6337PQ.this.f28428g, C6346a.f28437g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) C6337PQ.this.f28428g.getValue()) {
                if (((BirdPlusView) obj).isAvailable()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PQ$h */
    /* loaded from: classes4.dex */
    public static final class C6347h extends Lambda implements Function0<Z84<List<? extends BirdPlusView>>> {
        public C6347h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends BirdPlusView>> invoke2() {
            return Z84.f47888d.m73663b(C6337PQ.this.f28428g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$ineligibleBirdPlusViews$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$ineligibleBirdPlusViews$2\n*L\n62#1:171\n62#1:172,2\n*E\n"})
    /* renamed from: PQ$i */
    /* loaded from: classes4.dex */
    public static final class C6348i extends Lambda implements Function0<Z84<List<? extends BirdPlusView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$ineligibleBirdPlusViews$2$ineligiblePassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n1#3:174\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$ineligibleBirdPlusViews$2$ineligiblePassesObservable$1\n*L\n58#1:171\n58#1:172,2\n*E\n"})
        /* renamed from: PQ$i$a */
        /* loaded from: classes4.dex */
        public static final class C6349a extends Lambda implements Function1<List<? extends BirdPlusView>, List<? extends BirdPlusView>> {

            /* renamed from: g */
            public static final C6349a f28440g = new C6349a();

            public C6349a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<BirdPlusView> invoke(List<BirdPlusView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((BirdPlusView) obj).isIneligible()) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                return arrayList;
            }
        }

        public C6348i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends BirdPlusView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(C6337PQ.this.f28428g, C6349a.f28440g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) C6337PQ.this.f28428g.getValue()) {
                if (((BirdPlusView) obj).isIneligible()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/BirdPlusView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$promotedBirdPlusViews$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$promotedBirdPlusViews$2\n*L\n35#1:171\n35#1:172,2\n*E\n"})
    /* renamed from: PQ$j */
    /* loaded from: classes4.dex */
    public static final class C6350j extends Lambda implements Function0<Z84<List<? extends BirdPlusView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$promotedBirdPlusViews$2$promotedPassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n1#3:174\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$promotedBirdPlusViews$2$promotedPassesObservable$1\n*L\n31#1:171\n31#1:172,2\n*E\n"})
        /* renamed from: PQ$j$a */
        /* loaded from: classes4.dex */
        public static final class C6351a extends Lambda implements Function1<List<? extends BirdPlusView>, List<? extends BirdPlusView>> {

            /* renamed from: g */
            public static final C6351a f28442g = new C6351a();

            public C6351a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<BirdPlusView> invoke(List<BirdPlusView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    BirdPlusView birdPlusView = (BirdPlusView) next;
                    if (!birdPlusView.isActive() && !birdPlusView.isAvailable()) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                return arrayList;
            }
        }

        public C6350j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends BirdPlusView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(C6337PQ.this.f28428g, C6351a.f28442g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) C6337PQ.this.f28428g.getValue()) {
                BirdPlusView birdPlusView = (BirdPlusView) obj;
                if (birdPlusView.isActive() || birdPlusView.isAvailable()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: PQ$k */
    /* loaded from: classes4.dex */
    public static final class C6352k<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C6352k<T1, T2, R> f28443a = new C6352k<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    public C6337PQ(InterfaceC26980oR birdPlusViewRepository, C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        List emptyList;
        Intrinsics.checkNotNullParameter(birdPlusViewRepository, "birdPlusViewRepository");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f28422a = birdPlusViewRepository;
        lazy = LazyKt__LazyJVMKt.lazy(new C6347h());
        this.f28423b = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C6350j());
        this.f28424c = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C6343f());
        this.f28425d = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C6345g());
        this.f28426e = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C6348i());
        this.f28427f = lazy5;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f28428g = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6338a c6338a = new C6338a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: KQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C6337PQ.m90332f(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<List<BirdPlusView>> mo10302F1 = birdPlusViewRepository.mo10302F1();
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C6339b c6339b = C6339b.f28430g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: LQ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m90331g;
                m90331g = C6337PQ.m90331g(Function1.this, obj);
                return m90331g;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(mo10302F1, distinctUntilChanged, C6352k.f28443a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C6340c c6340c = C6340c.f28431g;
        Observable retry = combineLatest.doOnError(new InterfaceC23484g() { // from class: MQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C6337PQ.m90330h(Function1.this, obj);
            }
        }).retry(1L);
        Intrinsics.checkNotNullExpressionValue(retry, "Observables.combineLates…base.\") }\n      .retry(1)");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6341d c6341d = new C6341d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: NQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C6337PQ.m90329i(Function1.this, obj);
            }
        };
        final C6342e c6342e = C6342e.f28433g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: OQ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C6337PQ.m90328j(Function1.this, obj);
            }
        });
    }

    /* renamed from: f */
    public static final void m90332f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final Boolean m90331g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m90330h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m90329i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m90328j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: K */
    public AbstractC23461c mo90344K(BirdPlusView birdPlus) {
        Intrinsics.checkNotNullParameter(birdPlus, "birdPlus");
        AbstractC23461c m33063X = this.f28422a.mo10300K(birdPlus).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdPlusViewRepository.t…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: Q */
    public AbstractC23461c mo90343Q(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        AbstractC23461c m33063X = this.f28422a.mo10292Q(userSubscriptionId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdPlusViewRepository.c…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: a0 */
    public AbstractC23461c mo90341a0(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        AbstractC23461c m33063X = this.f28422a.mo10288a0(userSubscriptionId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdPlusViewRepository.r…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: b0 */
    public Z84<List<BirdPlusView>> mo90339b0() {
        return (Z84) this.f28423b.getValue();
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: c0 */
    public Observable<BirdPlusView> mo90337c0(String codename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Observable<BirdPlusView> subscribeOn = this.f28422a.mo10286s1(codename).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "birdPlusViewRepository.s…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: d0 */
    public Observable<BirdPlusView> mo90335d0(String subscriptionPlanId) {
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        Observable<BirdPlusView> subscribeOn = this.f28422a.mo10299K0(subscriptionPlanId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "birdPlusViewRepository.s…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: e0 */
    public Observable<BirdPlusView> mo90333e0(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        Observable<BirdPlusView> subscribeOn = this.f28422a.mo10289Z0(userSubscriptionId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "birdPlusViewRepository.s…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    /* renamed from: k */
    public final List<BirdPlusView> m90327k(List<BirdPlusView> list, boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BirdPlusView) obj).isPurchased()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return list;
    }

    @Override // p000.InterfaceC4077JQ
    /* renamed from: m */
    public AbstractC23461c mo90326m(String subscriptionPlanId, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        AbstractC23461c m33063X = this.f28422a.mo10287m(subscriptionPlanId, z).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdPlusViewRepository.b…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC4077JQ
    public AbstractC23461c refresh() {
        AbstractC23461c m33063X = this.f28422a.mo10284v1().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdPlusViewRepository.f…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
