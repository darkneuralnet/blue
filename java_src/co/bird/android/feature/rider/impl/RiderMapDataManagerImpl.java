package co.bird.android.feature.rider.impl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.rider.impl.RiderMapDataManagerImpl;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.MapGeocacheConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLngBounds;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC51298wu6;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0001\u0010$\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001c\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001c\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006-"}, m28432d2 = {"Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;", "Lq95;", "LVX0;", "LLifecycleOwner;", "owner", "", "onCreate", "Lcom/google/android/gms/maps/model/LatLngBounds;", "region", "Lio/reactivex/c;", C17296a.f69688o, "b", "LTq4;", "LTq4;", "reactiveConfig", "Lwu6;", "Lvt4;", "c", "Lwu6;", "pointRadiusBirdManager", DateTokenConverter.CONVERTER_KEY, "geocachedBirdManager", "e", "pointRadiusAreaManager", "f", "geocachedAreaManager", "g", "pointRadiusNestManager", "h", "geocachedNestManager", "Lbn;", "i", "Lbn;", "areaManager", "j", "LLifecycleOwner;", "processLifecycleOwner", "", "s", "()Ljava/util/List;", "birdManagers", "q", "areaManagers", "<init>", "(LTq4;Lwu6;Lwu6;Lwu6;Lwu6;Lwu6;Lwu6;Lbn;LLifecycleOwner;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderMapDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n44#2:132\n180#3:133\n1#4:134\n1549#5:135\n1620#5,3:136\n1549#5:139\n1620#5,3:140\n1549#5:143\n1620#5,3:144\n*S KotlinDebug\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl\n*L\n49#1:132\n49#1:133\n90#1:135\n90#1:136,3\n110#1:139\n110#1:140,3\n121#1:143\n121#1:144,3\n*E\n"})
/* loaded from: classes3.dex */
public final class RiderMapDataManagerImpl implements InterfaceC47297q95, VX0 {

    /* renamed from: b */
    public final C36207Tq4 f65173b;

    /* renamed from: c */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> f65174c;

    /* renamed from: d */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> f65175d;

    /* renamed from: e */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> f65176e;

    /* renamed from: f */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> f65177f;

    /* renamed from: g */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> f65178g;

    /* renamed from: h */
    public final InterfaceC51298wu6<? extends InterfaceC50693vt4> f65179h;

    /* renamed from: i */
    public final InterfaceC12495bn f65180i;

    /* renamed from: j */
    public final LifecycleOwner f65181j;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.RiderMapDataManagerImpl$a */
    /* loaded from: classes3.dex */
    public static final class C15509a extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C15509a f65182g = new C15509a();

        public C15509a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MapGeocacheConfig clientNestGeocacheConfig = it.getRiderMapConfig().getClientNestGeocacheConfig();
            return Boolean.valueOf(clientNestGeocacheConfig != null ? Intrinsics.areEqual(clientNestGeocacheConfig.getEnabled(), Boolean.TRUE) : false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.RiderMapDataManagerImpl$b */
    /* loaded from: classes3.dex */
    public static final class C15510b extends Lambda implements Function1<Boolean, Unit> {
        public C15510b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            RiderMapDataManagerImpl.this.f65180i.mo63990z();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lio/reactivex/c;", "sources", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderMapDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$refreshNearbyAreas$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,131:1\n37#2,2:132\n*S KotlinDebug\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$refreshNearbyAreas$2\n*L\n115#1:132,2\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.impl.RiderMapDataManagerImpl$c */
    /* loaded from: classes3.dex */
    public static final class C15511c extends Lambda implements Function1<List<? extends AbstractC23461c>, InterfaceC23496h> {

        /* renamed from: g */
        public static final C15511c f65184g = new C15511c();

        public C15511c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<? extends AbstractC23461c> sources) {
            Intrinsics.checkNotNullParameter(sources, "sources");
            AbstractC23461c[] abstractC23461cArr = (AbstractC23461c[]) sources.toArray(new AbstractC23461c[0]);
            return C37279Yf5.m74522z((AbstractC23461c[]) Arrays.copyOf(abstractC23461cArr, abstractC23461cArr.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.RiderMapDataManagerImpl$d */
    /* loaded from: classes3.dex */
    public static final class C15512d extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51298wu6<? extends InterfaceC50693vt4> f65185g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15512d(InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu6) {
            super(1);
            this.f65185g = interfaceC51298wu6;
        }

        /* renamed from: a */
        public final void m56997a(InterfaceC23465c interfaceC23465c) {
            InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu6 = this.f65185g;
            C41318g46.m40163a("calling refresh nearby birds on manager: " + interfaceC51298wu6, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m56997a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.RiderMapDataManagerImpl$e */
    /* loaded from: classes3.dex */
    public static final class C15513e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC51298wu6<? extends InterfaceC50693vt4> f65186g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15513e(InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu6) {
            super(1);
            this.f65186g = interfaceC51298wu6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu6 = this.f65186g;
            C41318g46.m40163a(interfaceC51298wu6 + " failed to refresh nearby birds", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lio/reactivex/c;", "kotlin.jvm.PlatformType", "sources", "Lio/reactivex/h;", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderMapDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$refreshNearbyBirds$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,131:1\n37#2,2:132\n*S KotlinDebug\n*F\n+ 1 RiderMapDataManagerImpl.kt\nco/bird/android/feature/rider/impl/RiderMapDataManagerImpl$refreshNearbyBirds$2\n*L\n104#1:132,2\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.impl.RiderMapDataManagerImpl$f */
    /* loaded from: classes3.dex */
    public static final class C15514f extends Lambda implements Function1<List<? extends AbstractC23461c>, InterfaceC23496h> {

        /* renamed from: g */
        public static final C15514f f65187g = new C15514f();

        public C15514f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<? extends AbstractC23461c> sources) {
            Intrinsics.checkNotNullParameter(sources, "sources");
            AbstractC23461c[] abstractC23461cArr = (AbstractC23461c[]) sources.toArray(new AbstractC23461c[0]);
            return C37279Yf5.m74522z((AbstractC23461c[]) Arrays.copyOf(abstractC23461cArr, abstractC23461cArr.length));
        }
    }

    public RiderMapDataManagerImpl(C36207Tq4 reactiveConfig, InterfaceC51298wu6<? extends InterfaceC50693vt4> pointRadiusBirdManager, InterfaceC51298wu6<? extends InterfaceC50693vt4> geocachedBirdManager, InterfaceC51298wu6<? extends InterfaceC50693vt4> pointRadiusAreaManager, InterfaceC51298wu6<? extends InterfaceC50693vt4> geocachedAreaManager, InterfaceC51298wu6<? extends InterfaceC50693vt4> pointRadiusNestManager, InterfaceC51298wu6<? extends InterfaceC50693vt4> geocachedNestManager, InterfaceC12495bn areaManager, LifecycleOwner processLifecycleOwner) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(pointRadiusBirdManager, "pointRadiusBirdManager");
        Intrinsics.checkNotNullParameter(geocachedBirdManager, "geocachedBirdManager");
        Intrinsics.checkNotNullParameter(pointRadiusAreaManager, "pointRadiusAreaManager");
        Intrinsics.checkNotNullParameter(geocachedAreaManager, "geocachedAreaManager");
        Intrinsics.checkNotNullParameter(pointRadiusNestManager, "pointRadiusNestManager");
        Intrinsics.checkNotNullParameter(geocachedNestManager, "geocachedNestManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        this.f65173b = reactiveConfig;
        this.f65174c = pointRadiusBirdManager;
        this.f65175d = geocachedBirdManager;
        this.f65176e = pointRadiusAreaManager;
        this.f65177f = geocachedAreaManager;
        this.f65178g = pointRadiusNestManager;
        this.f65179h = geocachedNestManager;
        this.f65180i = areaManager;
        this.f65181j = processLifecycleOwner;
    }

    /* renamed from: A */
    public static final void m57018A(InterfaceC51298wu6 manager) {
        Intrinsics.checkNotNullParameter(manager, "$manager");
        C41318g46.m40163a(manager + " successfully refreshed nearby birds", new Object[0]);
    }

    /* renamed from: B */
    public static final void m57017B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final Boolean m57005t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m57004u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final List m57003v(RiderMapDataManagerImpl this$0, LatLngBounds region) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(region, "$region");
        List<InterfaceC51298wu6<? extends InterfaceC50693vt4>> m57007q = this$0.m57007q();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m57007q, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = m57007q.iterator();
        while (it.hasNext()) {
            arrayList.add(InterfaceC51298wu6.C29992a.refresh$default((InterfaceC51298wu6) it.next(), region, null, 2, null));
        }
        return arrayList;
    }

    /* renamed from: w */
    public static final InterfaceC23496h m57002w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23496h m57001x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final List m57000y(RiderMapDataManagerImpl this$0, LatLngBounds region) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(region, "$region");
        List<InterfaceC51298wu6<? extends InterfaceC50693vt4>> m57006s = this$0.m57006s();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m57006s, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = m57006s.iterator();
        while (it.hasNext()) {
            final InterfaceC51298wu6 interfaceC51298wu6 = (InterfaceC51298wu6) it.next();
            AbstractC23461c refresh$default = InterfaceC51298wu6.C29992a.refresh$default(interfaceC51298wu6, region, null, 2, null);
            final C15512d c15512d = new C15512d(interfaceC51298wu6);
            AbstractC23461c m33029z = refresh$default.m33081E(new InterfaceC23484g() { // from class: x95
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    RiderMapDataManagerImpl.m56999z(Function1.this, obj);
                }
            }).m33029z(new InterfaceC23478a() { // from class: y95
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    RiderMapDataManagerImpl.m57018A(InterfaceC51298wu6.this);
                }
            });
            final C15513e c15513e = new C15513e(interfaceC51298wu6);
            arrayList.add(m33029z.m33084B(new InterfaceC23484g() { // from class: z95
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    RiderMapDataManagerImpl.m57017B(Function1.this, obj);
                }
            }));
        }
        return arrayList;
    }

    /* renamed from: z */
    public static final void m56999z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47297q95
    /* renamed from: a */
    public AbstractC23461c mo18057a(final LatLngBounds region) {
        Intrinsics.checkNotNullParameter(region, "region");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: v95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m57000y;
                m57000y = RiderMapDataManagerImpl.m57000y(RiderMapDataManagerImpl.this, region);
                return m57000y;
            }
        });
        final C15514f c15514f = C15514f.f65187g;
        AbstractC23461c m33164B = m33161E.m33164B(new InterfaceC23492o() { // from class: w95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57001x;
                m57001x = RiderMapDataManagerImpl.m57001x(Function1.this, obj);
                return m57001x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "fromCallable {\n      bir…s.toTypedArray())\n      }");
        return m33164B;
    }

    @Override // p000.InterfaceC47297q95
    /* renamed from: b */
    public AbstractC23461c mo18056b(final LatLngBounds region) {
        Intrinsics.checkNotNullParameter(region, "region");
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: t95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m57003v;
                m57003v = RiderMapDataManagerImpl.m57003v(RiderMapDataManagerImpl.this, region);
                return m57003v;
            }
        });
        final C15511c c15511c = C15511c.f65184g;
        AbstractC23461c m33164B = m33161E.m33164B(new InterfaceC23492o() { // from class: u95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57002w;
                m57002w = RiderMapDataManagerImpl.m57002w(Function1.this, obj);
                return m57002w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "fromCallable {\n      are…s.toTypedArray())\n      }");
        return m33164B;
    }

    @Override // p000.VX0
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        Z84<Config> m82623f8 = this.f65173b.m82623f8();
        final C15509a c15509a = C15509a.f65182g;
        Observable skip = m82623f8.map(new InterfaceC23492o() { // from class: r95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m57005t;
                m57005t = RiderMapDataManagerImpl.m57005t(Function1.this, obj);
                return m57005t;
            }
        }).distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "reactiveConfig.config\n  …lChanged()\n      .skip(1)");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = skip.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15510b c15510b = new C15510b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: s95
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RiderMapDataManagerImpl.m57004u(Function1.this, obj);
            }
        });
    }

    /* renamed from: q */
    public final List<InterfaceC51298wu6<? extends InterfaceC50693vt4>> m57007q() {
        List<InterfaceC51298wu6<? extends InterfaceC50693vt4>> listOfNotNull;
        InterfaceC51298wu6[] interfaceC51298wu6Arr = new InterfaceC51298wu6[2];
        InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu6 = this.f65177f;
        if (!interfaceC51298wu6.isEnabled().m73665a().booleanValue()) {
            interfaceC51298wu6 = null;
        }
        interfaceC51298wu6Arr[0] = interfaceC51298wu6;
        interfaceC51298wu6Arr[1] = this.f65176e;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) interfaceC51298wu6Arr);
        return listOfNotNull;
    }

    /* renamed from: s */
    public final List<InterfaceC51298wu6<? extends InterfaceC50693vt4>> m57006s() {
        List<InterfaceC51298wu6<? extends InterfaceC50693vt4>> listOfNotNull;
        InterfaceC51298wu6[] interfaceC51298wu6Arr = new InterfaceC51298wu6[2];
        InterfaceC51298wu6<? extends InterfaceC50693vt4> interfaceC51298wu6 = this.f65175d;
        if (!interfaceC51298wu6.isEnabled().m73665a().booleanValue()) {
            interfaceC51298wu6 = null;
        }
        interfaceC51298wu6Arr[0] = interfaceC51298wu6;
        interfaceC51298wu6Arr[1] = this.f65174c;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) interfaceC51298wu6Arr);
        return listOfNotNull;
    }
}
