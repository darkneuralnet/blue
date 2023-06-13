package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.ScanlessRideItem;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33291He4;
import p000.J35;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f\u0012\b\b\u0001\u0010&\u001a\u00020#\u0012\b\b\u0001\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LHe4;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "onBannerRemoved", "Lio/reactivex/Observable;", "closeImmediately", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "LaM;", "b", "LaM;", "birdManager", "LEa;", "c", "LEa;", "analyticsManager", "LBl5;", DateTokenConverter.CONVERTER_KEY, "LBl5;", "scanlessRideManager", "LpU4;", "e", "LpU4;", "rideMapStateManager", "Ldr4;", "f", "Ldr4;", "reactiveLocationManager", "LsJ4;", "g", "LsJ4;", "requirementPresenter", "Lve4;", "h", "Lve4;", "quickStartUnselectedBannerUi", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LTq4;LaM;LEa;LBl5;LpU4;Ldr4;LsJ4;Lve4;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuickStartUnselectedPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickStartUnselectedPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/QuickStartUnselectedPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,114:1\n180#2:115\n180#2:116\n*S KotlinDebug\n*F\n+ 1 QuickStartUnselectedPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/QuickStartUnselectedPresenterImpl\n*L\n71#1:115\n99#1:116\n*E\n"})
/* renamed from: He4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33291He4 implements FlightBanner {

    /* renamed from: a */
    public final C36207Tq4 f13690a;

    /* renamed from: b */
    public final InterfaceC10636aM f13691b;

    /* renamed from: c */
    public final InterfaceC1880Ea f13692c;

    /* renamed from: d */
    public final InterfaceC31951Bl5 f13693d;

    /* renamed from: e */
    public final InterfaceC46893pU4 f13694e;

    /* renamed from: f */
    public final InterfaceC40001dr4 f13695f;

    /* renamed from: g */
    public final InterfaceC48572sJ4 f13696g;

    /* renamed from: h */
    public final InterfaceC50543ve4 f13697h;

    /* renamed from: i */
    public final ScopeProvider f13698i;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: He4$a */
    /* loaded from: classes2.dex */
    public static final class C3187a extends Lambda implements Function1<J35.C3879a, Boolean> {

        /* renamed from: g */
        public static final C3187a f13699g = new C3187a();

        public C3187a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(J35.C3879a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m101226c() == RideRequirementReason.RIDE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: He4$b */
    /* loaded from: classes2.dex */
    public static final class C3188b extends Lambda implements Function1<J35.C3879a, Unit> {

        /* renamed from: g */
        public static final C3188b f13700g = new C3188b();

        public C3188b() {
            super(1);
        }

        /* renamed from: a */
        public final void m103595a(J35.C3879a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(J35.C3879a c3879a) {
            m103595a(c3879a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/ScanlessRideItem;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: He4$c */
    /* loaded from: classes2.dex */
    public static final class C3189c extends Lambda implements Function1<List<? extends ScanlessRideItem>, Optional<ScanlessRideItem>> {

        /* renamed from: g */
        public static final C3189c f13701g = new C3189c();

        public C3189c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<ScanlessRideItem> invoke(List<ScanlessRideItem> it) {
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(it, "it");
            Optional.C14443a c14443a = Optional.f63040c;
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) it);
            return c14443a.m59033b(firstOrNull);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: He4$d */
    /* loaded from: classes2.dex */
    public static final class C3190d extends Lambda implements Function2<Optional<ScanlessRideItem>, Optional<ScanlessRideItem>, Boolean> {

        /* renamed from: g */
        public static final C3190d f13702g = new C3190d();

        public C3190d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<ScanlessRideItem> t1, Optional<ScanlessRideItem> t2) {
            String str;
            WireBird bird;
            WireBird bird2;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            ScanlessRideItem m59035e = t1.m59035e();
            String str2 = null;
            if (m59035e != null && (bird2 = m59035e.getBird()) != null) {
                str = bird2.getCode();
            } else {
                str = null;
            }
            ScanlessRideItem m59035e2 = t2.m59035e();
            if (m59035e2 != null && (bird = m59035e2.getBird()) != null) {
                str2 = bird.getCode();
            }
            return Boolean.valueOf(Intrinsics.areEqual(str, str2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "item", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQuickStartUnselectedPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickStartUnselectedPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/QuickStartUnselectedPresenterImpl$onBannerShown$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
    /* renamed from: He4$e */
    /* loaded from: classes2.dex */
    public static final class C3191e extends Lambda implements Function1<Optional<ScanlessRideItem>, InterfaceC23434B<? extends Optional<ScanlessRideItem>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: He4$e$a */
        /* loaded from: classes2.dex */
        public static final class C3192a extends Lambda implements Function1<WireBird, Unit> {

            /* renamed from: g */
            public static final C3192a f13704g = new C3192a();

            public C3192a() {
                super(1);
            }

            /* renamed from: a */
            public final void m103585a(WireBird wireBird) {
                C41318g46.m40151m("Chirp bird on scanless ride banner shown.", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
                m103585a(wireBird);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: He4$e$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C3193b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C3193b f13705b = new C3193b();

            public C3193b() {
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

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: He4$e$c */
        /* loaded from: classes2.dex */
        public static final class C3194c extends Lambda implements Function1<WireBird, Optional<ScanlessRideItem>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<ScanlessRideItem> f13706g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3194c(Optional<ScanlessRideItem> optional) {
                super(1);
                this.f13706g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<ScanlessRideItem> invoke(WireBird it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f13706g;
            }
        }

        public C3191e() {
            super(1);
        }

        /* renamed from: e */
        public static final void m103588e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m103587f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final Optional m103586g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23434B<? extends Optional<ScanlessRideItem>> invoke(Optional<ScanlessRideItem> item) {
            WireBird bird;
            Intrinsics.checkNotNullParameter(item, "item");
            ScanlessRideItem m59035e = item.m59035e();
            if (m59035e != null && (bird = m59035e.getBird()) != null) {
                if (!C33291He4.this.f13690a.m82623f8().m73665a().getRideConfig().getEnableScanlessRideBannerChirp()) {
                    bird = null;
                }
                if (bird != null) {
                    Observable<WireBird> mo71605D0 = C33291He4.this.f13691b.mo71605D0(bird, false);
                    final C3192a c3192a = C3192a.f13704g;
                    Observable<WireBird> doOnNext = mo71605D0.doOnNext(new InterfaceC23484g() { // from class: Ie4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C33291He4.C3191e.m103588e(Function1.this, obj);
                        }
                    });
                    final C3193b c3193b = C3193b.f13705b;
                    Observable<WireBird> doOnError = doOnNext.doOnError(new InterfaceC23484g() { // from class: Je4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C33291He4.C3191e.m103587f(Function1.this, obj);
                        }
                    });
                    final C3194c c3194c = new C3194c(item);
                    return doOnError.map(new InterfaceC23492o() { // from class: Ke4
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Optional m103586g;
                            m103586g = C33291He4.C3191e.m103586g(Function1.this, obj);
                            return m103586g;
                        }
                    }).onErrorReturnItem(item);
                }
            }
            return Observable.just(item);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: He4$f */
    /* loaded from: classes2.dex */
    public static final class C3195f extends Lambda implements Function1<Pair<? extends Optional<ScanlessRideItem>, ? extends Location>, Unit> {
        public C3195f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<ScanlessRideItem>, ? extends Location> pair) {
            invoke2((Pair<Optional<ScanlessRideItem>, ? extends Location>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<ScanlessRideItem>, ? extends Location> pair) {
            WireBird bird;
            Location location = pair.component2();
            ScanlessRideItem m59035e = pair.component1().m59035e();
            if (m59035e != null && (bird = m59035e.getBird()) != null) {
                InterfaceC50543ve4 interfaceC50543ve4 = C33291He4.this.f13697h;
                Intrinsics.checkNotNullExpressionValue(location, "location");
                interfaceC50543ve4.mo6561W7(bird, location);
                InterfaceC1880Ea interfaceC1880Ea = C33291He4.this.f13692c;
                double currentTimeMillis = (System.currentTimeMillis() - C33291He4.this.f13692c.mo55933f()) / 1000.0d;
                int batteryLevel = bird.getBatteryLevel();
                String model = bird.getModel();
                if (model == null) {
                    model = "unknown";
                }
                interfaceC1880Ea.mo55905y(new C34929Oe4(null, null, null, "rider_map", currentTimeMillis, batteryLevel, model, 7, null));
                return;
            }
            InterfaceC50543ve4 interfaceC50543ve42 = C33291He4.this.f13697h;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            interfaceC50543ve42.mo6561W7(null, location);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: He4$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C3196g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3196g f13708b = new C3196g();

        public C3196g() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00032&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/ScanlessRideItem;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: He4$h */
    /* loaded from: classes2.dex */
    public static final class C3197h extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends ScanlessRideItem>>, ScanlessRideItem> {

        /* renamed from: g */
        public static final C3197h f13709g = new C3197h();

        public C3197h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ScanlessRideItem invoke(Pair<Unit, ? extends List<ScanlessRideItem>> pair) {
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<ScanlessRideItem> availableBirds = pair.component2();
            Intrinsics.checkNotNullExpressionValue(availableBirds, "availableBirds");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) availableBirds);
            return (ScanlessRideItem) firstOrNull;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "scanlessRideItem", "", C17296a.f69688o, "(Lco/bird/android/model/ScanlessRideItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: He4$i */
    /* loaded from: classes2.dex */
    public static final class C3198i extends Lambda implements Function1<ScanlessRideItem, Unit> {
        public C3198i() {
            super(1);
        }

        /* renamed from: a */
        public final void m103582a(ScanlessRideItem scanlessRideItem) {
            InterfaceC1880Ea interfaceC1880Ea = C33291He4.this.f13692c;
            int batteryLevel = scanlessRideItem.getBird().getBatteryLevel();
            String model = scanlessRideItem.getBird().getModel();
            if (model == null) {
                model = "unknown";
            }
            interfaceC1880Ea.mo55905y(new C35163Pe4(null, null, null, "rider_map", batteryLevel, model, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScanlessRideItem scanlessRideItem) {
            m103582a(scanlessRideItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "scanlessRideItem", "", C17296a.f69688o, "(Lco/bird/android/model/ScanlessRideItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: He4$j */
    /* loaded from: classes2.dex */
    public static final class C3199j extends Lambda implements Function1<ScanlessRideItem, Unit> {
        public C3199j() {
            super(1);
        }

        /* renamed from: a */
        public final void m103581a(ScanlessRideItem scanlessRideItem) {
            C33291He4.this.f13697h.mo6560k(true);
            InterfaceC31951Bl5 interfaceC31951Bl5 = C33291He4.this.f13693d;
            Intrinsics.checkNotNullExpressionValue(scanlessRideItem, "scanlessRideItem");
            interfaceC31951Bl5.mo89856a(scanlessRideItem);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScanlessRideItem scanlessRideItem) {
            m103581a(scanlessRideItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: He4$k */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C3200k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3200k f13712b = new C3200k();

        public C3200k() {
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

    public C33291He4(C36207Tq4 reactiveConfig, InterfaceC10636aM birdManager, InterfaceC1880Ea analyticsManager, InterfaceC31951Bl5 scanlessRideManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC40001dr4 reactiveLocationManager, InterfaceC48572sJ4 requirementPresenter, InterfaceC50543ve4 quickStartUnselectedBannerUi, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scanlessRideManager, "scanlessRideManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        Intrinsics.checkNotNullParameter(quickStartUnselectedBannerUi, "quickStartUnselectedBannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f13690a = reactiveConfig;
        this.f13691b = birdManager;
        this.f13692c = analyticsManager;
        this.f13693d = scanlessRideManager;
        this.f13694e = rideMapStateManager;
        this.f13695f = reactiveLocationManager;
        this.f13696g = requirementPresenter;
        this.f13697h = quickStartUnselectedBannerUi;
        this.f13698i = scopeProvider;
    }

    /* renamed from: k */
    public static final boolean m103606k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: l */
    public static final Unit m103605l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final Optional m103604m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final boolean m103603n(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: o */
    public static final InterfaceC23434B m103602o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m103601p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m103600q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m103599r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m103598s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m103597t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        Observable<J35.C3879a> mo14400e = this.f13696g.mo14400e();
        final C3187a c3187a = C3187a.f13699g;
        Observable<J35.C3879a> filter = mo14400e.filter(new InterfaceC23494q() { // from class: xe4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m103606k;
                m103606k = C33291He4.m103606k(Function1.this, obj);
                return m103606k;
            }
        });
        final C3188b c3188b = C3188b.f13700g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: ye4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m103605l;
                m103605l = C33291He4.m103605l(Function1.this, obj);
                return m103605l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "requirementPresenter.req….RIDE }\n    .map { Unit }");
        return map;
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        this.f13697h.mo6560k(false);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Z84<List<ScanlessRideItem>> mo89852e = this.f13693d.mo89852e();
        final C3189c c3189c = C3189c.f13701g;
        Observable<R> map = mo89852e.map(new InterfaceC23492o() { // from class: ze4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m103604m;
                m103604m = C33291He4.m103604m(Function1.this, obj);
                return m103604m;
            }
        });
        final C3190d c3190d = C3190d.f13702g;
        Observable distinctUntilChanged = map.distinctUntilChanged(new InterfaceC23481d() { // from class: Ae4
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m103603n;
                m103603n = C33291He4.m103603n(Function2.this, obj, obj2);
                return m103603n;
            }
        });
        final C3191e c3191e = new C3191e();
        Observable observeOn = distinctUntilChanged.flatMap(new InterfaceC23492o() { // from class: Be4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m103602o;
                m103602o = C33291He4.m103602o(Function1.this, obj);
                return m103602o;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onBannerSho…      }, (Timber::e))\n  }");
        Object m33094as = C24527f.m31950a(observeOn, this.f13695f.mo43616p()).m33094as(AutoDispose.m45239a(this.f13698i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3195f c3195f = new C3195f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ce4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33291He4.m103601p(Function1.this, obj);
            }
        };
        final C3196g c3196g = C3196g.f13708b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: De4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33291He4.m103600q(Function1.this, obj);
            }
        });
        Observable m74575T = C37279Yf5.m74575T(C24527f.m31950a(this.f13697h.mo6559t4(), this.f13693d.mo89852e()), C3197h.f13709g);
        final C3198i c3198i = new C3198i();
        Observable observeOn2 = m74575T.doOnNext(new InterfaceC23484g() { // from class: Ee4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33291He4.m103599r(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onBannerSho…      }, (Timber::e))\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f13698i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3199j c3199j = new C3199j();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Fe4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33291He4.m103598s(Function1.this, obj);
            }
        };
        final C3200k c3200k = C3200k.f13712b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Ge4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33291He4.m103597t(Function1.this, obj);
            }
        });
    }
}
