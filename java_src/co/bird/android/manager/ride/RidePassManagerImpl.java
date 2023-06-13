package co.bird.android.manager.ride;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.ride.RidePassManagerImpl;
import co.bird.android.model.User;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
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
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013*\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR5\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u001e*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00130\u00130\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R'\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R'\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R'\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R'\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, m28432d2 = {"Lco/bird/android/manager/ride/RidePassManagerImpl;", "LWU4;", "LFq2;", "Lio/reactivex/Observable;", "", "enabled", "Lio/reactivex/c;", "refresh", "", "linkCode", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/RidePassView;", "G0", "y0", "ridePass", DateTokenConverter.CONVERTER_KEY, "userSubscriptionId", "C0", "O", "", "t", "LGX4;", "b", "LGX4;", "ridePassViewRepository", "LTq4;", "c", "LTq4;", "reactiveConfig", "LZ84;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "E0", "()LZ84;", "ridePasses", "e", "getPromotedRidePasses", "promotedRidePasses", "f", "F0", "activeRidePasses", "g", "getAvailableRidePasses", "availableRidePasses", "h", "D0", "ineligibleRidePasses", "La94;", "i", "La94;", "ridePassesRelay", "LRh6;", "userStream", "<init>", "(LGX4;LTq4;LRh6;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n180#2:139\n180#2:142\n52#3,2:140\n766#4:143\n857#4,2:144\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl\n*L\n71#1:139\n85#1:142\n79#1:140,2\n134#1:143\n134#1:144,2\n*E\n"})
/* loaded from: classes4.dex */
public final class RidePassManagerImpl implements WU4, InterfaceC32929Fq2 {

    /* renamed from: b */
    public final GX4 f66517b;

    /* renamed from: c */
    public final C36207Tq4 f66518c;

    /* renamed from: d */
    public final Lazy f66519d;

    /* renamed from: e */
    public final Lazy f66520e;

    /* renamed from: f */
    public final Lazy f66521f;

    /* renamed from: g */
    public final Lazy f66522g;

    /* renamed from: h */
    public final Lazy f66523h;

    /* renamed from: i */
    public final C37791a94<List<RidePassView>> f66524i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$a */
    /* loaded from: classes4.dex */
    public static final class C16216a extends Lambda implements Function1<User, Unit> {
        public C16216a() {
            super(1);
        }

        /* renamed from: a */
        public final void m55484a(User user) {
            RidePassManagerImpl.this.f66517b.mo96672O0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m55484a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$b */
    /* loaded from: classes4.dex */
    public static final class C16217b extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C16217b f66526g = new C16217b();

        public C16217b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getRidePass().getEnabled() || it.getRidePass().getEnabledV2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$c */
    /* loaded from: classes4.dex */
    public static final class C16218c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16218c f66527g = new C16218c();

        public C16218c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Possible recoverable error while streaming ride pass views from database.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/RidePassView;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$d */
    /* loaded from: classes4.dex */
    public static final class C16219d extends Lambda implements Function1<Pair<? extends List<? extends RidePassView>, ? extends Boolean>, Unit> {
        public C16219d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends RidePassView>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<RidePassView>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<RidePassView>, Boolean> pair) {
            Boolean enabled = pair.component2();
            C37791a94 c37791a94 = RidePassManagerImpl.this.f66524i;
            RidePassManagerImpl ridePassManagerImpl = RidePassManagerImpl.this;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            c37791a94.accept(ridePassManagerImpl.m55486t(pair.component1(), enabled.booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$e */
    /* loaded from: classes4.dex */
    public static final class C16220e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16220e f66529g = new C16220e();

        public C16220e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Uncaught error while streaming ride pass views from database, stream closed.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$activeRidePasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$activeRidePasses$2\n*L\n45#1:139\n45#1:140,2\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$f */
    /* loaded from: classes4.dex */
    public static final class C16221f extends Lambda implements Function0<Z84<List<? extends RidePassView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$activeRidePasses$2$activePassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n1#3:142\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$activeRidePasses$2$activePassesObservable$1\n*L\n41#1:139\n41#1:140,2\n*E\n"})
        /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$f$a */
        /* loaded from: classes4.dex */
        public static final class C16222a extends Lambda implements Function1<List<? extends RidePassView>, List<? extends RidePassView>> {

            /* renamed from: g */
            public static final C16222a f66531g = new C16222a();

            public C16222a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<RidePassView> invoke(List<RidePassView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((RidePassView) obj).isActive()) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                return arrayList;
            }
        }

        public C16221f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends RidePassView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(RidePassManagerImpl.this.f66524i, C16222a.f66531g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) RidePassManagerImpl.this.f66524i.getValue()) {
                if (((RidePassView) obj).isActive()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$availableRidePasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$availableRidePasses$2\n*L\n54#1:139\n54#1:140,2\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$g */
    /* loaded from: classes4.dex */
    public static final class C16223g extends Lambda implements Function0<Z84<List<? extends RidePassView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$availableRidePasses$2$availablePassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n1#3:142\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$availableRidePasses$2$availablePassesObservable$1\n*L\n50#1:139\n50#1:140,2\n*E\n"})
        /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$g$a */
        /* loaded from: classes4.dex */
        public static final class C16224a extends Lambda implements Function1<List<? extends RidePassView>, List<? extends RidePassView>> {

            /* renamed from: g */
            public static final C16224a f66533g = new C16224a();

            public C16224a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<RidePassView> invoke(List<RidePassView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((RidePassView) obj).isAvailable()) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                return arrayList;
            }
        }

        public C16223g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends RidePassView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(RidePassManagerImpl.this.f66524i, C16224a.f66533g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) RidePassManagerImpl.this.f66524i.getValue()) {
                if (((RidePassView) obj).isAvailable()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$h */
    /* loaded from: classes4.dex */
    public static final class C16225h extends Lambda implements Function1<List<? extends RidePassView>, Boolean> {
        public C16225h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends RidePassView> list) {
            return invoke2((List<RidePassView>) list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
            if ((!r2.isEmpty()) != false) goto L6;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke2(List<RidePassView> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z = (RidePassManagerImpl.this.f66518c.m82623f8().m73665a().getRidePass().getEnabled() || RidePassManagerImpl.this.f66518c.m82623f8().m73665a().getRidePass().getEnabledV2()) ? true : true;
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$ineligibleRidePasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$ineligibleRidePasses$2\n*L\n63#1:139\n63#1:140,2\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$i */
    /* loaded from: classes4.dex */
    public static final class C16226i extends Lambda implements Function0<Z84<List<? extends RidePassView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$ineligibleRidePasses$2$ineligiblePassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n1#3:142\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$ineligibleRidePasses$2$ineligiblePassesObservable$1\n*L\n59#1:139\n59#1:140,2\n*E\n"})
        /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$i$a */
        /* loaded from: classes4.dex */
        public static final class C16227a extends Lambda implements Function1<List<? extends RidePassView>, List<? extends RidePassView>> {

            /* renamed from: g */
            public static final C16227a f66536g = new C16227a();

            public C16227a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<RidePassView> invoke(List<RidePassView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((RidePassView) obj).isIneligible()) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return null;
                }
                return arrayList;
            }
        }

        public C16226i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends RidePassView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(RidePassManagerImpl.this.f66524i, C16227a.f66536g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) RidePassManagerImpl.this.f66524i.getValue()) {
                if (((RidePassView) obj).isIneligible()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$promotedRidePasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$promotedRidePasses$2\n*L\n36#1:139\n36#1:140,2\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$j */
    /* loaded from: classes4.dex */
    public static final class C16228j extends Lambda implements Function0<Z84<List<? extends RidePassView>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "list", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$promotedRidePasses$2$promotedPassesObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n1#3:142\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl$promotedRidePasses$2$promotedPassesObservable$1\n*L\n32#1:139\n32#1:140,2\n*E\n"})
        /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$j$a */
        /* loaded from: classes4.dex */
        public static final class C16229a extends Lambda implements Function1<List<? extends RidePassView>, List<? extends RidePassView>> {

            /* renamed from: g */
            public static final C16229a f66538g = new C16229a();

            public C16229a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<RidePassView> invoke(List<RidePassView> list) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    RidePassView ridePassView = (RidePassView) next;
                    if (!ridePassView.isActive() && !ridePassView.isAvailable()) {
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

        public C16228j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends RidePassView>> invoke2() {
            Observable m74575T = C37279Yf5.m74575T(RidePassManagerImpl.this.f66524i, C16229a.f66538g);
            Z84.C10119a c10119a = Z84.f47888d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) RidePassManagerImpl.this.f66524i.getValue()) {
                RidePassView ridePassView = (RidePassView) obj;
                if (ridePassView.isActive() || ridePassView.isAvailable()) {
                    arrayList.add(obj);
                }
            }
            return c10119a.m73662c(m74575T, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$k */
    /* loaded from: classes4.dex */
    public static final class C16230k extends Lambda implements Function0<Z84<List<? extends RidePassView>>> {
        public C16230k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends RidePassView>> invoke2() {
            return Z84.f47888d.m73663b(RidePassManagerImpl.this.f66524i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: co.bird.android.manager.ride.RidePassManagerImpl$l */
    /* loaded from: classes4.dex */
    public static final class C16231l<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C16231l<T1, T2, R> f66540a = new C16231l<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    public RidePassManagerImpl(GX4 ridePassViewRepository, C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        List emptyList;
        Intrinsics.checkNotNullParameter(ridePassViewRepository, "ridePassViewRepository");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f66517b = ridePassViewRepository;
        this.f66518c = reactiveConfig;
        lazy = LazyKt__LazyJVMKt.lazy(new C16230k());
        this.f66519d = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16228j());
        this.f66520e = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16221f());
        this.f66521f = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C16223g());
        this.f66522g = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C16226i());
        this.f66523h = lazy5;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f66524i = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16216a c16216a = new C16216a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: XU4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RidePassManagerImpl.m55492l(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<List<RidePassView>> mo96666t1 = ridePassViewRepository.mo96666t1();
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C16217b c16217b = C16217b.f66526g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: YU4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m55491n;
                m55491n = RidePassManagerImpl.m55491n(Function1.this, obj);
                return m55491n;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(mo96666t1, distinctUntilChanged, C16231l.f66540a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C16218c c16218c = C16218c.f66527g;
        Observable retry = combineLatest.doOnError(new InterfaceC23484g() { // from class: ZU4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RidePassManagerImpl.m55490o(Function1.this, obj);
            }
        }).retry(1L);
        Intrinsics.checkNotNullExpressionValue(retry, "Observables.combineLates…base.\") }\n      .retry(1)");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16219d c16219d = new C16219d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: aV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RidePassManagerImpl.m55489p(Function1.this, obj);
            }
        };
        final C16220e c16220e = C16220e.f66529g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: bV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RidePassManagerImpl.m55488q(Function1.this, obj);
            }
        });
    }

    /* renamed from: l */
    public static final void m55492l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final Boolean m55491n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m55490o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m55489p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m55488q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final Boolean m55487s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    @Override // p000.WU4
    /* renamed from: C0 */
    public AbstractC23461c mo55505C0(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        AbstractC23461c m33063X = this.f66517b.mo96680C0(userSubscriptionId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "ridePassViewRepository.c…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.WU4
    /* renamed from: D0 */
    public Z84<List<RidePassView>> mo55504D0() {
        return (Z84) this.f66523h.getValue();
    }

    @Override // p000.WU4
    /* renamed from: E0 */
    public Z84<List<RidePassView>> mo55503E0() {
        return (Z84) this.f66519d.getValue();
    }

    @Override // p000.WU4
    /* renamed from: F0 */
    public Z84<List<RidePassView>> mo55502F0() {
        return (Z84) this.f66521f.getValue();
    }

    @Override // p000.WU4
    /* renamed from: G0 */
    public AbstractC23442F<RidePassView> mo55501G0(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        AbstractC23442F<RidePassView> m33142Y = this.f66517b.mo96670P0(linkCode).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "ridePassViewRepository.g…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.WU4
    /* renamed from: O */
    public Observable<RidePassView> mo55500O(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Observable<RidePassView> subscribeOn = this.f66517b.mo96673O(linkCode).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "ridePassViewRepository.s…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.WU4
    /* renamed from: d */
    public AbstractC23461c mo55497d(RidePassView ridePass) {
        Intrinsics.checkNotNullParameter(ridePass, "ridePass");
        AbstractC23461c m33063X = this.f66517b.mo96667d(ridePass).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "ridePassViewRepository.t…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.WU4
    public Observable<Boolean> enabled() {
        List<RidePassView> emptyList;
        Z84<List<RidePassView>> mo55503E0 = mo55503E0();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<RidePassView>> defaultIfEmpty = mo55503E0.defaultIfEmpty(emptyList);
        final C16225h c16225h = new C16225h();
        Observable map = defaultIfEmpty.map(new InterfaceC23492o() { // from class: cV4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m55487s;
                m55487s = RidePassManagerImpl.m55487s(Function1.this, obj);
                return m55487s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun enabled(): …it.isNotEmpty()\n    }\n  }");
        return map;
    }

    @Override // p000.WU4
    public AbstractC23461c refresh() {
        AbstractC23461c m33063X = this.f66517b.mo96677L0().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "ridePassViewRepository.f…scribeOn(Schedulers.io())");
        return m33063X;
    }

    /* renamed from: t */
    public final List<RidePassView> m55486t(List<RidePassView> list, boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((RidePassView) obj).isPurchased()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return list;
    }

    @Override // p000.WU4
    /* renamed from: y0 */
    public AbstractC23461c mo55485y0(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        AbstractC23461c m33063X = this.f66517b.mo96665y0(linkCode).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "ridePassViewRepository.b…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
