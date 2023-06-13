package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.Model_Kt;
import co.bird.android.model.ReservationPriceKt;
import co.bird.android.model.RideRequirement;
import co.bird.android.model.analytics.RiderReserveButtonTapped;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.widget.ReservationBannerView;
import co.bird.api.response.ReservationCancelResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C42652iK4;
import p000.InterfaceC48572sJ4;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BO\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0001\u0010#\u001a\u00020 \u0012\b\b\u0001\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"LiK4;", "Lco/bird/android/model/FlightBanner;", "", "", "i", "onBannerShown", "Lco/bird/android/model/wire/configs/Config;", "j", "LEa;", C17296a.f69688o, "LEa;", "analyticsManager", "LTq4;", "b", "LTq4;", "reactiveConfig", "LMK4;", "c", "LMK4;", "reservationManager", "LpU4;", DateTokenConverter.CONVERTER_KEY, "LpU4;", "rideMapStateManager", "Le13;", "e", "Le13;", "navigator", "LsJ4;", "f", "LsJ4;", "requirementPresenter", "LqK4;", "g", "LqK4;", "reservationBannerUi", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LEa;LTq4;LMK4;LpU4;Le13;LsJ4;LqK4;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReservationBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ReservationBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,107:1\n180#2:108\n180#2:109\n*S KotlinDebug\n*F\n+ 1 ReservationBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ReservationBannerPresenterImpl\n*L\n80#1:108\n97#1:109\n*E\n"})
/* renamed from: iK4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42652iK4 implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC1880Ea f87156a;

    /* renamed from: b */
    public final C36207Tq4 f87157b;

    /* renamed from: c */
    public final MK4 f87158c;

    /* renamed from: d */
    public final InterfaceC46893pU4 f87159d;

    /* renamed from: e */
    public final InterfaceC40099e13 f87160e;

    /* renamed from: f */
    public final InterfaceC48572sJ4 f87161f;

    /* renamed from: g */
    public final InterfaceC47396qK4 f87162g;

    /* renamed from: h */
    public final ScopeProvider f87163h;

    /* renamed from: i */
    public final /* synthetic */ C27923rS f87164i;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/widget/ReservationBannerView$a;", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/ReservationBannerView$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK4$a */
    /* loaded from: classes2.dex */
    public static final class C23210a extends Lambda implements Function1<ReservationBannerView.EnumC16574a, Boolean> {

        /* renamed from: g */
        public static final C23210a f87165g = new C23210a();

        public C23210a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ReservationBannerView.EnumC16574a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == ReservationBannerView.EnumC16574a.BEFORE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/widget/ReservationBannerView$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/ReservationBannerView$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK4$b */
    /* loaded from: classes2.dex */
    public static final class C23211b extends Lambda implements Function1<ReservationBannerView.EnumC16574a, Unit> {
        public C23211b() {
            super(1);
        }

        /* renamed from: a */
        public final void m34156a(ReservationBannerView.EnumC16574a enumC16574a) {
            C41318g46.m40163a("CTA clicked reservation before", new Object[0]);
            C42652iK4.this.f87156a.mo55956N(new RiderReserveButtonTapped(C32972Fv0.m106251a(C42652iK4.this.m34166j()), ReservationPriceKt.reservationPrice(C42652iK4.this.m34166j())));
            C42652iK4.this.f87156a.mo55905y(new DL4(null, null, null, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReservationBannerView.EnumC16574a enumC16574a) {
            m34156a(enumC16574a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/widget/ReservationBannerView$a;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/RideRequirement;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReservationBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ReservationBannerPresenterImpl$onBannerShown$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
    /* renamed from: iK4$c */
    /* loaded from: classes2.dex */
    public static final class C23212c extends Lambda implements Function1<Pair<? extends ReservationBannerView.EnumC16574a, ? extends Optional<WireBird>>, InterfaceC24574u<? extends RideRequirement>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iK4$c$a */
        /* loaded from: classes2.dex */
        public static final class C23213a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42652iK4 f87168g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23213a(C42652iK4 c42652iK4) {
                super(1);
                this.f87168g = c42652iK4;
            }

            /* renamed from: a */
            public final void m34151a(InterfaceC23465c interfaceC23465c) {
                this.f87168g.f87162g.mo14388k(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m34151a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iK4$c$b */
        /* loaded from: classes2.dex */
        public static final class C23214b extends Lambda implements Function2<RideRequirement, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42652iK4 f87169g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23214b(C42652iK4 c42652iK4) {
                super(2);
                this.f87169g = c42652iK4;
            }

            /* renamed from: a */
            public final void m34150a(RideRequirement rideRequirement, Throwable th) {
                this.f87169g.f87162g.mo14388k(false);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement, Throwable th) {
                m34150a(rideRequirement, th);
                return Unit.INSTANCE;
            }
        }

        public C23212c() {
            super(1);
        }

        /* renamed from: d */
        public static final void m34152d(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends RideRequirement> invoke(Pair<? extends ReservationBannerView.EnumC16574a, Optional<WireBird>> pair) {
            String str;
            WireBird m59035e;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<WireBird> component2 = pair.component2();
            Config m34166j = C42652iK4.this.m34166j();
            if (component2 != null && (m59035e = component2.m59035e()) != null) {
                str = m59035e.getExternalFeedType();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, WireBird.ZIG_ZAG_EXTERNAL_FEED_TYPE) && m34166j.getZigzagConfig().getEnabled() && m34166j.getZigzagConfig().getDeeplinkUrl() != null) {
                String deeplinkUrl = m34166j.getZigzagConfig().getDeeplinkUrl();
                if (deeplinkUrl != null) {
                    C42652iK4.this.f87160e.mo37021g0(deeplinkUrl);
                }
                return AbstractC24507p.m32024u();
            }
            AbstractC24507p m32066I = InterfaceC48572sJ4.C28260a.checkRequirements$default(C42652iK4.this.f87161f, component2.m59035e(), RideRequirementReason.RESERVATION, null, 4, null).m32066I(C23454a.m33087a());
            final C23213a c23213a = new C23213a(C42652iK4.this);
            AbstractC24507p m32027r = m32066I.m32027r(new InterfaceC23484g() { // from class: jK4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42652iK4.C23212c.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C23214b c23214b = new C23214b(C42652iK4.this);
            return m32027r.m32028q(new InterfaceC23479b() { // from class: kK4
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    C42652iK4.C23212c.m34152d(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK4$d */
    /* loaded from: classes2.dex */
    public static final class C23215d extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public static final C23215d f87170g = new C23215d();

        public C23215d() {
            super(1);
        }

        /* renamed from: a */
        public final void m34149a(RideRequirement rideRequirement) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m34149a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iK4$e */
    /* loaded from: classes2.dex */
    public static final class C23216e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23216e f87171g = new C23216e();

        public C23216e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/widget/ReservationBannerView$a;", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/ReservationBannerView$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK4$f */
    /* loaded from: classes2.dex */
    public static final class C23217f extends Lambda implements Function1<ReservationBannerView.EnumC16574a, Boolean> {

        /* renamed from: g */
        public static final C23217f f87172g = new C23217f();

        public C23217f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ReservationBannerView.EnumC16574a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == ReservationBannerView.EnumC16574a.IN_PROGRESS) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/widget/ReservationBannerView$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/widget/ReservationBannerView$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK4$g */
    /* loaded from: classes2.dex */
    public static final class C23218g extends Lambda implements Function1<ReservationBannerView.EnumC16574a, Unit> {
        public C23218g() {
            super(1);
        }

        /* renamed from: a */
        public final void m34147a(ReservationBannerView.EnumC16574a enumC16574a) {
            C41318g46.m40163a("CTA clicked reservation in progress", new Object[0]);
            C42652iK4.this.f87156a.mo55905y(new C49767uK4(null, null, null, C42652iK4.this.f87158c.mo83798e().getValue().m59038b().getId(), Double.valueOf(Model_Kt.durationSeconds(C42652iK4.this.f87158c.mo83798e().getValue().m59038b())), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReservationBannerView.EnumC16574a enumC16574a) {
            m34147a(enumC16574a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/widget/ReservationBannerView$a;", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/response/ReservationCancelResponse;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/widget/ReservationBannerView$a;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iK4$h */
    /* loaded from: classes2.dex */
    public static final class C23219h extends Lambda implements Function1<ReservationBannerView.EnumC16574a, InterfaceC23447K<? extends HM4<ReservationCancelResponse>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iK4$h$a */
        /* loaded from: classes2.dex */
        public static final class C23220a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42652iK4 f87175g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23220a(C42652iK4 c42652iK4) {
                super(1);
                this.f87175g = c42652iK4;
            }

            /* renamed from: a */
            public final void m34142a(InterfaceC23465c interfaceC23465c) {
                this.f87175g.f87162g.mo14388k(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m34142a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C23219h() {
            super(1);
        }

        /* renamed from: d */
        public static final void m34143d(C42652iK4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f87162g.mo14388k(false);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends HM4<ReservationCancelResponse>> invoke(ReservationBannerView.EnumC16574a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<HM4<ReservationCancelResponse>> mo83793m = C42652iK4.this.f87158c.mo83793m(C42652iK4.this.f87158c.mo83798e().getValue().m59038b().getId());
            final C23220a c23220a = new C23220a(C42652iK4.this);
            AbstractC23442F<HM4<ReservationCancelResponse>> m33102v = mo83793m.m33102v(new InterfaceC23484g() { // from class: lK4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42652iK4.C23219h.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C42652iK4 c42652iK4 = C42652iK4.this;
            return m33102v.m33110r(new InterfaceC23478a() { // from class: mK4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42652iK4.C23219h.m34143d(C42652iK4.this);
                }
            });
        }
    }

    public C42652iK4(InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, MK4 reservationManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC40099e13 navigator, InterfaceC48572sJ4 requirementPresenter, InterfaceC47396qK4 reservationBannerUi, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(reservationManager, "reservationManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        Intrinsics.checkNotNullParameter(reservationBannerUi, "reservationBannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f87156a = analyticsManager;
        this.f87157b = reactiveConfig;
        this.f87158c = reservationManager;
        this.f87159d = rideMapStateManager;
        this.f87160e = navigator;
        this.f87161f = requirementPresenter;
        this.f87162g = reservationBannerUi;
        this.f87163h = scopeProvider;
        this.f87164i = new C27923rS(reservationBannerUi, rideMapStateManager, reactiveConfig, scopeProvider);
    }

    /* renamed from: k */
    public static final boolean m34165k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: l */
    public static final void m34164l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final InterfaceC24574u m34163m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m34162n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m34161o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final boolean m34160p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q */
    public static final void m34159q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m34158r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    /* renamed from: i */
    public void m34167i() {
        this.f87164i.m15940b();
    }

    /* renamed from: j */
    public final Config m34166j() {
        return C36441Uq4.m80769c(this.f87157b, this.f87159d.mo15902g().getValue().m59035e());
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        FlightBanner.DefaultImpls.onBannerRemoved(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        Observable<ReservationBannerView.EnumC16574a> mo14391De = this.f87162g.mo14391De();
        final C23210a c23210a = C23210a.f87165g;
        Observable<ReservationBannerView.EnumC16574a> filter = mo14391De.filter(new InterfaceC23494q() { // from class: aK4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34165k;
                m34165k = C42652iK4.m34165k(Function1.this, obj);
                return m34165k;
            }
        });
        final C23211b c23211b = new C23211b();
        Observable<ReservationBannerView.EnumC16574a> doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: bK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42652iK4.m34164l(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onBannerSho…gurePricingStringUi()\n  }");
        Observable m31950a = C24527f.m31950a(doOnNext, this.f87159d.mo15902g());
        final C23212c c23212c = new C23212c();
        Observable flatMapMaybe = m31950a.flatMapMaybe(new InterfaceC23492o() { // from class: cK4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m34163m;
                m34163m = C42652iK4.m34163m(Function1.this, obj);
                return m34163m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun onBannerSho…gurePricingStringUi()\n  }");
        Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f87163h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23215d c23215d = C23215d.f87170g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: dK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42652iK4.m34162n(Function1.this, obj);
            }
        };
        final C23216e c23216e = C23216e.f87171g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: eK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42652iK4.m34161o(Function1.this, obj);
            }
        });
        Observable<ReservationBannerView.EnumC16574a> mo14391De2 = this.f87162g.mo14391De();
        final C23217f c23217f = C23217f.f87172g;
        Observable<ReservationBannerView.EnumC16574a> filter2 = mo14391De2.filter(new InterfaceC23494q() { // from class: fK4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34160p;
                m34160p = C42652iK4.m34160p(Function1.this, obj);
                return m34160p;
            }
        });
        final C23218g c23218g = new C23218g();
        Observable<ReservationBannerView.EnumC16574a> doOnNext2 = filter2.doOnNext(new InterfaceC23484g() { // from class: gK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42652iK4.m34159q(Function1.this, obj);
            }
        });
        final C23219h c23219h = new C23219h();
        Observable<R> flatMapSingle = doOnNext2.flatMapSingle(new InterfaceC23492o() { // from class: hK4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m34158r;
                m34158r = C42652iK4.m34158r(Function1.this, obj);
                return m34158r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onBannerSho…gurePricingStringUi()\n  }");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f87163h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        m34167i();
    }
}
