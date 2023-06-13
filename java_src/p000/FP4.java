package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Banner;
import co.bird.android.model.Deal;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.SystemSettingsReason;
import co.bird.android.model.User;
import co.bird.android.model.constant.CouponDisplayTag;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.wire.WireBannerStep;
import co.bird.android.model.wire.WireCouponDisplayView;
import co.bird.android.model.wire.WireCouponDisplayViewKt;
import co.bird.android.model.wire.configs.BirdPlusConfig;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RentalConfigKt;
import co.bird.android.model.wire.configs.RidePassConfig;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p000.C37791a94;
import p000.FP4;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u000e\b\u0001\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[\u0012\b\b\u0001\u0010D\u001a\u00020A\u0012\b\b\u0001\u0010H\u001a\u00020E\u0012\b\b\u0001\u0010L\u001a\u00020I\u0012\b\b\u0001\u0010P\u001a\u00020M\u0012\n\b\u0001\u0010S\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b^\u0010_J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J!\u0010\f\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0014\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00110\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u001a\u0010\u0018\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000eH\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000e0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006`"}, m28432d2 = {"LFP4;", "LxC;", "LfP4;", "", C17296a.f69688o, "Lco/bird/android/model/Banner;", "banner", "e", "", "Lco/bird/android/model/wire/WireBannerStep;", "", "rideCount", "W", "(Ljava/util/List;I)Lco/bird/android/model/Banner;", "", "X", "(Lco/bird/android/model/Banner;)Z", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/model/wire/configs/BirdPlusConfig;", "birdPlusConfig", "z0", "Lco/bird/android/model/persistence/RidePassView;", "Lco/bird/android/model/wire/configs/RidePassConfig;", "ridePassConfig", "A0", "", "linkCode", "Y", "requirementBannerShown", "y0", "LTq4;", "c", "LTq4;", "reactiveConfig", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "LEa;", "LEa;", "analyticsManager", "LV74;", "f", "LV74;", "promoManager", "LBf1;", "g", "LBf1;", "ephemeralPromoManager", "LYR4;", "h", "LYR4;", "rideManager", "LRh6;", "i", "LRh6;", "userStream", "LWU4;", "j", "LWU4;", "ridePassManager", "LJQ;", "k", "LJQ;", "birdPlusManager", "LhY4;", "l", "LhY4;", "ridePresenter", "LKP4;", "m", "LKP4;", "ui", "Le13;", "n", "Le13;", "navigator", "LZr1;", "o", "LZr1;", "flightBannerCoordinatorPresenter", "p", "Ljava/lang/String;", "ridePassLinkCode", "q", "Lco/bird/android/model/Banner;", "lastShownBanner", "La94;", "r", "La94;", "showChargerMarketing", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(LTq4;Lgl;LEa;LV74;LBf1;LYR4;LRh6;LWU4;LJQ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LhY4;LKP4;Le13;LZr1;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n180#2:292\n180#2:293\n180#2:294\n180#2:295\n180#2:296\n180#2:297\n180#2:298\n1747#3,3:299\n1747#3,3:302\n603#4:305\n1#5:306\n*S KotlinDebug\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl\n*L\n91#1:292\n103#1:293\n120#1:294\n135#1:295\n166#1:296\n186#1:297\n210#1:298\n217#1:299,3\n222#1:302,3\n266#1:305\n*E\n"})
/* renamed from: FP4 */
/* loaded from: classes2.dex */
public final class FP4 extends C30060xC implements InterfaceC40918fP4 {

    /* renamed from: c */
    public final C36207Tq4 f9296c;

    /* renamed from: d */
    public final C22454gl f9297d;

    /* renamed from: e */
    public final InterfaceC1880Ea f9298e;

    /* renamed from: f */
    public final V74 f9299f;

    /* renamed from: g */
    public final InterfaceC31893Bf1 f9300g;

    /* renamed from: h */
    public final YR4 f9301h;

    /* renamed from: i */
    public final InterfaceC35660Rh6 f9302i;

    /* renamed from: j */
    public final WU4 f9303j;

    /* renamed from: k */
    public final InterfaceC4077JQ f9304k;

    /* renamed from: l */
    public final InterfaceC42185hY4 f9305l;

    /* renamed from: m */
    public final KP4 f9306m;

    /* renamed from: n */
    public final InterfaceC40099e13 f9307n;

    /* renamed from: o */
    public final InterfaceC37617Zr1 f9308o;

    /* renamed from: p */
    public final String f9309p;

    /* renamed from: q */
    public Banner f9310q;

    /* renamed from: r */
    public final C37791a94<Boolean> f9311r;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Deal;", "kotlin.jvm.PlatformType", "optionalDeal", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$A */
    /* loaded from: classes2.dex */
    public static final class C2237A extends Lambda implements Function1<Optional<Deal>, Unit> {
        public C2237A() {
            super(1);
        }

        /* renamed from: a */
        public final void m107191a(Optional<Deal> optional) {
            if (!optional.m59037c()) {
                FP4.this.f9308o.mo40694N1(FlightBannerNode.FlightBanner.DEAL);
            } else {
                FP4.this.f9308o.mo40695M1(FlightBannerNode.FlightBanner.DEAL);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Deal> optional) {
            m107191a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2238a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Banner.values().length];
            try {
                iArr[Banner.HOW_TO_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Banner.PERSONAL_RENTALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Banner.CONNECTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl\n*L\n1#1,328:1\n266#2:329\n*E\n"})
    /* renamed from: FP4$b */
    /* loaded from: classes2.dex */
    public static final class C2239b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WireBannerStep) t).getRides()), Integer.valueOf(((WireBannerStep) t2).getRides()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBannerStep;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBannerStep;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$c */
    /* loaded from: classes2.dex */
    public static final class C2240c extends Lambda implements Function1<WireBannerStep, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ int f9313g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2240c(int i) {
            super(1);
            this.f9313g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireBannerStep it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f9313g >= it.getRides()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBannerStep;", "it", "Lco/bird/android/model/Banner;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBannerStep;)Lco/bird/android/model/Banner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$d */
    /* loaded from: classes2.dex */
    public static final class C2241d extends Lambda implements Function1<WireBannerStep, Banner> {

        /* renamed from: g */
        public static final C2241d f9314g = new C2241d();

        public C2241d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Banner invoke(WireBannerStep it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Banner.Companion.from(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCouponDisplayView;", "couponsDisplayViews", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl$onCreate$10\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n288#2,2:292\n*S KotlinDebug\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl$onCreate$10\n*L\n142#1:292,2\n*E\n"})
    /* renamed from: FP4$e */
    /* loaded from: classes2.dex */
    public static final class C2242e extends Lambda implements Function1<List<? extends WireCouponDisplayView>, Optional<WireCouponDisplayView>> {

        /* renamed from: g */
        public static final C2242e f9315g = new C2242e();

        public C2242e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireCouponDisplayView> invoke(List<WireCouponDisplayView> couponsDisplayViews) {
            Object obj;
            boolean z;
            Intrinsics.checkNotNullParameter(couponsDisplayViews, "couponsDisplayViews");
            Optional.C14443a c14443a = Optional.f63040c;
            Iterator<T> it = couponsDisplayViews.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    WireCouponDisplayView wireCouponDisplayView = (WireCouponDisplayView) obj;
                    if (wireCouponDisplayView.getTag() == CouponDisplayTag.APPLIES_TO_NEXT_RIDE && !WireCouponDisplayViewKt.expired(wireCouponDisplayView)) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return c14443a.m59033b(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCouponDisplayView;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$f */
    /* loaded from: classes2.dex */
    public static final class C2243f extends Lambda implements Function1<Optional<WireCouponDisplayView>, InterfaceC23434B<? extends Boolean>> {

        /* renamed from: g */
        public static final C2243f f9316g = new C2243f();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FP4$f$a */
        /* loaded from: classes2.dex */
        public static final class C2244a extends Lambda implements Function1<Long, Boolean> {

            /* renamed from: g */
            public static final C2244a f9317g = new C2244a();

            public C2244a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        }

        public C2243f() {
            super(1);
        }

        /* renamed from: c */
        public static final Boolean m107185c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Boolean> invoke(Optional<WireCouponDisplayView> it) {
            DateTime dateTime;
            Observable empty;
            int coerceAtLeast;
            Intrinsics.checkNotNullParameter(it, "it");
            WireCouponDisplayView m59035e = it.m59035e();
            if (m59035e != null) {
                dateTime = m59035e.getExpiresAt();
            } else {
                dateTime = null;
            }
            if (m59035e != null && dateTime != null) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Seconds.secondsBetween(DateTime.now(), dateTime).getSeconds(), 0);
                Observable<Long> timer = Observable.timer(coerceAtLeast, TimeUnit.SECONDS);
                final C2244a c2244a = C2244a.f9317g;
                empty = timer.map(new InterfaceC23492o() { // from class: GP4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Boolean m107185c;
                        m107185c = FP4.C2243f.m107185c(Function1.this, obj);
                        return m107185c;
                    }
                });
            } else {
                empty = Observable.empty();
            }
            return empty.startWith((Observable) Boolean.valueOf(it.m59037c()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "shouldShowCouponDisplayBanner", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$g */
    /* loaded from: classes2.dex */
    public static final class C2245g extends Lambda implements Function1<Boolean, Unit> {
        public C2245g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean shouldShowCouponDisplayBanner) {
            Intrinsics.checkNotNullExpressionValue(shouldShowCouponDisplayBanner, "shouldShowCouponDisplayBanner");
            if (shouldShowCouponDisplayBanner.booleanValue()) {
                FP4.this.f9308o.mo40695M1(FlightBannerNode.FlightBanner.COUPON_DISPLAY);
            } else {
                FP4.this.f9308o.mo40694N1(FlightBannerNode.FlightBanner.COUPON_DISPLAY);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$h */
    /* loaded from: classes2.dex */
    public static final class C2246h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2246h f9319g = new C2246h();

        public C2246h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while refreshing bird plus views, ignoring.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birdPlusPlans", "", "Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$i */
    /* loaded from: classes2.dex */
    public static final class C2247i extends Lambda implements Function1<List<? extends BirdPlusView>, Unit> {
        public C2247i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BirdPlusView> list) {
            invoke2((List<BirdPlusView>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<BirdPlusView> birdPlusPlans) {
            FP4 fp4 = FP4.this;
            Intrinsics.checkNotNullExpressionValue(birdPlusPlans, "birdPlusPlans");
            if (fp4.m107192z0(birdPlusPlans, FP4.this.f9296c.m82623f8().m73665a().getBirdPlus())) {
                FP4.this.f9308o.mo40695M1(FlightBannerNode.FlightBanner.BIRD_PLUS);
            } else {
                FP4.this.f9308o.mo40694N1(FlightBannerNode.FlightBanner.BIRD_PLUS);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/BirdPlusView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$j */
    /* loaded from: classes2.dex */
    public static final class C2248j extends Lambda implements Function1<List<? extends BirdPlusView>, Unit> {

        /* renamed from: g */
        public static final C2248j f9321g = new C2248j();

        public C2248j() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<BirdPlusView> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BirdPlusView> list) {
            invoke2((List<BirdPlusView>) list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$k */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2249k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2249k f9322b = new C2249k();

        public C2249k() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$l */
    /* loaded from: classes2.dex */
    public static final class C2250l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2250l f9323g = new C2250l();

        public C2250l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while refreshing ride passes, ignoring", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$m */
    /* loaded from: classes2.dex */
    public static final class C2251m extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C2251m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            Boolean requirementBannerShown = pair.component2();
            if (!pair.component1().booleanValue()) {
                FP4.this.f9306m.mo96963a(Banner.CONNECTIVITY);
                return;
            }
            FP4 fp4 = FP4.this;
            Banner banner = fp4.f9310q;
            Intrinsics.checkNotNullExpressionValue(requirementBannerShown, "requirementBannerShown");
            fp4.m107194y0(banner, requirementBannerShown.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "ridePassViewList", "", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$n */
    /* loaded from: classes2.dex */
    public static final class C2252n extends Lambda implements Function1<List<? extends RidePassView>, Unit> {
        public C2252n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RidePassView> list) {
            invoke2((List<RidePassView>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RidePassView> ridePassViewList) {
            FP4 fp4 = FP4.this;
            Intrinsics.checkNotNullExpressionValue(ridePassViewList, "ridePassViewList");
            if (fp4.m107247A0(ridePassViewList, FP4.this.f9296c.m82623f8().m73665a().getRidePass())) {
                FP4.this.f9308o.mo40695M1(FlightBannerNode.FlightBanner.RIDE_PASS);
            } else {
                FP4.this.f9308o.mo40694N1(FlightBannerNode.FlightBanner.RIDE_PASS);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$o */
    /* loaded from: classes2.dex */
    public static final class C2253o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2253o f9326g = new C2253o();

        public C2253o() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRideBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl$onCreate$22\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n288#2,2:292\n*S KotlinDebug\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl$onCreate$22\n*L\n207#1:292,2\n*E\n"})
    /* renamed from: FP4$p */
    /* loaded from: classes2.dex */
    public static final class C2254p extends Lambda implements Function1<List<? extends RidePassView>, Boolean> {
        public C2254p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends RidePassView> list) {
            return invoke2((List<RidePassView>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<RidePassView> it) {
            Object obj;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (FP4.this.f9296c.m82623f8().m73665a().getRidePass().getEnabled() || FP4.this.f9296c.m82623f8().m73665a().getRidePass().getEnabledV2()) {
                FP4 fp4 = FP4.this;
                Iterator<T> it2 = it.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual(((RidePassView) obj).getLinkCode(), fp4.f9309p)) {
                        break;
                    }
                }
                if (obj != null) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/persistence/RidePassView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl$onCreate$23\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n223#2,2:292\n*S KotlinDebug\n*F\n+ 1 RideBannerPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideBannerPresenterImpl$onCreate$23\n*L\n209#1:292,2\n*E\n"})
    /* renamed from: FP4$q */
    /* loaded from: classes2.dex */
    public static final class C2255q extends Lambda implements Function1<List<? extends RidePassView>, RidePassView> {
        public C2255q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RidePassView invoke(List<RidePassView> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FP4 fp4 = FP4.this;
            for (RidePassView ridePassView : it) {
                if (Intrinsics.areEqual(ridePassView.getLinkCode(), fp4.f9309p)) {
                    return ridePassView;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "ridePassFromDeeplink", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$r */
    /* loaded from: classes2.dex */
    public static final class C2256r extends Lambda implements Function1<RidePassView, Unit> {
        public C2256r() {
            super(1);
        }

        /* renamed from: a */
        public final void m107183a(RidePassView ridePassView) {
            FP4 fp4 = FP4.this;
            fp4.m107223Y(fp4.f9296c.m82623f8().m73665a().getRidePass(), ridePassView.getLinkCode());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m107183a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$s */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2257s extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2257s f9330b = new C2257s();

        public C2257s() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$t */
    /* loaded from: classes2.dex */
    public static final class C2258t extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2258t f9331g = new C2258t();

        public C2258t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C41318g46.m40159e(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$u */
    /* loaded from: classes2.dex */
    public static final class C2259u extends Lambda implements Function1<Boolean, Unit> {
        public C2259u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            C37791a94 c37791a94 = FP4.this.f9311r;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37791a94.accept(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$v */
    /* loaded from: classes2.dex */
    public static final class C2260v extends Lambda implements Function1<User, Integer> {

        /* renamed from: g */
        public static final C2260v f9333g = new C2260v();

        public C2260v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getRideCount());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "", "Lco/bird/android/model/wire/WireBannerStep;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$w */
    /* loaded from: classes2.dex */
    public static final class C2261w extends Lambda implements Function1<Config, List<? extends WireBannerStep>> {

        /* renamed from: g */
        public static final C2261w f9334g = new C2261w();

        public C2261w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBannerStep> invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getBannerSteps();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003 \u0002*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", "", "Lco/bird/android/model/wire/WireBannerStep;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Banner;", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FP4$x */
    /* loaded from: classes2.dex */
    public static final class C2262x extends Lambda implements Function1<Triple<? extends Integer, ? extends Boolean, ? extends List<? extends WireBannerStep>>, Pair<? extends Banner, ? extends Boolean>> {
        public C2262x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<Banner, Boolean> invoke(Triple<Integer, Boolean, ? extends List<WireBannerStep>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Integer rideCount = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            List<WireBannerStep> steps = triple.component3();
            FP4 fp4 = FP4.this;
            Intrinsics.checkNotNullExpressionValue(steps, "steps");
            Intrinsics.checkNotNullExpressionValue(rideCount, "rideCount");
            return new Pair<>(fp4.m107225W(steps, rideCount.intValue()), Boolean.valueOf(booleanValue));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Banner;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$y */
    /* loaded from: classes2.dex */
    public static final class C2263y extends Lambda implements Function1<Pair<? extends Banner, ? extends Boolean>, Unit> {
        public C2263y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Banner, ? extends Boolean> pair) {
            invoke2((Pair<? extends Banner, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Banner, Boolean> pair) {
            FP4.this.f9310q = pair.component1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Banner;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FP4$z */
    /* loaded from: classes2.dex */
    public static final class C2264z extends Lambda implements Function1<Pair<? extends Banner, ? extends Boolean>, Unit> {
        public C2264z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Banner, ? extends Boolean> pair) {
            invoke2((Pair<? extends Banner, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Banner, Boolean> pair) {
            boolean booleanValue = pair.component2().booleanValue();
            FP4.this.m107194y0(pair.component1(), booleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FP4(C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC1880Ea analyticsManager, V74 promoManager, InterfaceC31893Bf1 ephemeralPromoManager, YR4 rideManager, InterfaceC35660Rh6 userStream, WU4 ridePassManager, InterfaceC4077JQ birdPlusManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC42185hY4 ridePresenter, KP4 ui, InterfaceC40099e13 navigator, InterfaceC37617Zr1 flightBannerCoordinatorPresenter, String str) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(ephemeralPromoManager, "ephemeralPromoManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(birdPlusManager, "birdPlusManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ridePresenter, "ridePresenter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(flightBannerCoordinatorPresenter, "flightBannerCoordinatorPresenter");
        this.f9296c = reactiveConfig;
        this.f9297d = preference;
        this.f9298e = analyticsManager;
        this.f9299f = promoManager;
        this.f9300g = ephemeralPromoManager;
        this.f9301h = rideManager;
        this.f9302i = userStream;
        this.f9303j = ridePassManager;
        this.f9304k = birdPlusManager;
        this.f9305l = ridePresenter;
        this.f9306m = ui;
        this.f9307n = navigator;
        this.f9308o = flightBannerCoordinatorPresenter;
        this.f9309p = str;
        this.f9310q = Banner.NONE;
        this.f9311r = C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.FALSE, null, 2, null);
    }

    /* renamed from: Z */
    public static final void m107222Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m107220a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23434B m107219b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m107218c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m107217d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23434B m107216e0(FP4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f9304k.mo90339b0();
    }

    /* renamed from: f0 */
    public static final void m107215f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m107214g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m107213h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m107212i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23434B m107211j0(FP4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f9303j.mo55503E0();
    }

    /* renamed from: k0 */
    public static final void m107210k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m107209l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m107208m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final boolean m107207n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o0 */
    public static final RidePassView m107206o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RidePassView) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m107205p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m107204q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final Integer m107203r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final List m107202s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final Pair m107201t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m107200u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m107199v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m107198w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final Optional m107196x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: A0 */
    public final boolean m107247A0(List<RidePassView> list, RidePassConfig ridePassConfig) {
        boolean z;
        boolean z2;
        if (ridePassConfig.getEnabledV2()) {
            if (!list.isEmpty()) {
                List<RidePassView> list2 = list;
                boolean z3 = list2 instanceof Collection;
                if (!z3 || !list2.isEmpty()) {
                    for (RidePassView ridePassView : list2) {
                        if (ridePassView.isIneligible()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    return true;
                }
                if (!z3 || !list2.isEmpty()) {
                    for (RidePassView ridePassView2 : list2) {
                        if (ridePassView2.isAvailable()) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2 && this.f9297d.m37586p1(list.get(0).getLinkCode(), ridePassConfig.getSessionsShown())) {
                    return true;
                }
            }
        } else if (ridePassConfig.getEnabled() && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final Banner m107225W(List<WireBannerStep> list, int i) {
        Sequence asSequence;
        Sequence filter;
        Sequence sortedWith;
        Sequence map;
        Object lastOrNull;
        Intrinsics.checkNotNullParameter(list, "<this>");
        asSequence = CollectionsKt___CollectionsKt.asSequence(list);
        filter = SequencesKt___SequencesKt.filter(asSequence, new C2240c(i));
        sortedWith = SequencesKt___SequencesKt.sortedWith(filter, new C2239b());
        map = SequencesKt___SequencesKt.map(sortedWith, C2241d.f9314g);
        lastOrNull = SequencesKt___SequencesKt.lastOrNull(map);
        Banner banner = (Banner) lastOrNull;
        if (banner != null) {
            if (!m107224X(banner)) {
                banner = null;
            }
            if (banner != null) {
                return banner;
            }
        }
        return Banner.NONE;
    }

    /* renamed from: X */
    public final boolean m107224X(Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "<this>");
        if (banner == Banner.PERSONAL_RENTALS && this.f9297d.m37730G0()) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public final void m107223Y(RidePassConfig ridePassConfig, String str) {
        if (ridePassConfig.getEnabledV2()) {
            this.f9307n.mo37153I2(str);
        } else if (ridePassConfig.getEnabled()) {
            this.f9307n.mo36971o2(str);
        }
    }

    /* renamed from: a */
    public void m107221a() {
        Observable<Boolean> m87862b = C35514Qr4.m87862b();
        Intrinsics.checkNotNullExpressionValue(m87862b, "observeInternetConnectivity()");
        Observable observeOn = C24527f.m31950a(m87862b, this.f9305l.mo35028e()).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeInternetConnectiv…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2251m c2251m = new C2251m();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107222Z(Function1.this, obj);
            }
        };
        final C2258t c2258t = C2258t.f9331g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: iP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107220a0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f9296c.m82611g9().m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2259u c2259u = new C2259u();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: oP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107209l0(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<User> mo76579f = this.f9302i.mo76579f();
        final C2260v c2260v = C2260v.f9333g;
        Object map = mo76579f.map(new InterfaceC23492o() { // from class: pP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m107203r0;
                m107203r0 = FP4.m107203r0(Function1.this, obj);
                return m107203r0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "userStream.updateEvents().map { it.rideCount }");
        Z84<Boolean> mo35028e = this.f9305l.mo35028e();
        Z84<Config> m82623f8 = this.f9296c.m82623f8();
        final C2261w c2261w = C2261w.f9334g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: qP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m107202s0;
                m107202s0 = FP4.m107202s0(Function1.this, obj);
                return m107202s0;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        Observable m31955b = c24523e.m31955b(map, mo35028e, distinctUntilChanged);
        final C2262x c2262x = new C2262x();
        Observable map2 = m31955b.map(new InterfaceC23492o() { // from class: sP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m107201t0;
                m107201t0 = FP4.m107201t0(Function1.this, obj);
                return m107201t0;
            }
        });
        final C2263y c2263y = new C2263y();
        Observable observeOn2 = map2.doOnNext(new InterfaceC23484g() { // from class: tP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107200u0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate() …      }, (Timber::e))\n  }");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2264z c2264z = new C2264z();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: uP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107199v0(Function1.this, obj);
            }
        });
        Observable<Optional<Deal>> observeOn3 = this.f9300g.mo90006b().observeOn(C23454a.m33087a());
        final C2237A c2237a = new C2237A();
        Observable<Optional<Deal>> doOnNext = observeOn3.doOnNext(new InterfaceC23484g() { // from class: vP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107198w0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate() …      }, (Timber::e))\n  }");
        Object m33094as4 = doOnNext.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as4).subscribe();
        Z84<List<WireCouponDisplayView>> mo27798d = this.f9299f.mo27798d();
        final C2242e c2242e = C2242e.f9315g;
        Observable distinctUntilChanged2 = mo27798d.map(new InterfaceC23492o() { // from class: wP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m107196x0;
                m107196x0 = FP4.m107196x0(Function1.this, obj);
                return m107196x0;
            }
        }).distinctUntilChanged();
        final C2243f c2243f = C2243f.f9316g;
        Observable observeOn4 = distinctUntilChanged2.switchMap(new InterfaceC23492o() { // from class: rP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m107219b0;
                m107219b0 = FP4.m107219b0(Function1.this, obj);
                return m107219b0;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "promoManager.couponDispl…dSchedulers.mainThread())");
        Object m33094as5 = observeOn4.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2245g c2245g = new C2245g();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: xP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107218c0(Function1.this, obj);
            }
        });
        AbstractC23461c refresh = this.f9304k.refresh();
        final C2246h c2246h = C2246h.f9319g;
        Observable m33043l = refresh.m33084B(new InterfaceC23484g() { // from class: yP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107217d0(Function1.this, obj);
            }
        }).m33069Q().m33043l(Observable.defer(new Callable() { // from class: zP4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m107216e0;
                m107216e0 = FP4.m107216e0(FP4.this);
                return m107216e0;
            }
        }));
        final C2247i c2247i = new C2247i();
        Observable doOnNext2 = m33043l.doOnNext(new InterfaceC23484g() { // from class: AP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107215f0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun onCreate() …      }, (Timber::e))\n  }");
        Object m33094as6 = doOnNext2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2248j c2248j = C2248j.f9321g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: BP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107214g0(Function1.this, obj);
            }
        };
        final C2249k c2249k = C2249k.f9322b;
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: CP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107213h0(Function1.this, obj);
            }
        });
        AbstractC23461c refresh2 = this.f9303j.refresh();
        final C2250l c2250l = C2250l.f9323g;
        Observable m33043l2 = refresh2.m33084B(new InterfaceC23484g() { // from class: DP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107212i0(Function1.this, obj);
            }
        }).m33069Q().m33043l(Observable.defer(new Callable() { // from class: EP4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m107211j0;
                m107211j0 = FP4.m107211j0(FP4.this);
                return m107211j0;
            }
        }));
        final C2252n c2252n = new C2252n();
        Observable doOnNext3 = m33043l2.doOnNext(new InterfaceC23484g() { // from class: hP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107210k0(Function1.this, obj);
            }
        });
        final C2253o c2253o = C2253o.f9326g;
        Observable doOnError = doOnNext3.doOnError(new InterfaceC23484g() { // from class: jP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107208m0(Function1.this, obj);
            }
        });
        final C2254p c2254p = new C2254p();
        Observable filter = doOnError.filter(new InterfaceC23494q() { // from class: kP4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m107207n0;
                m107207n0 = FP4.m107207n0(Function1.this, obj);
                return m107207n0;
            }
        });
        final C2255q c2255q = new C2255q();
        Observable map3 = filter.map(new InterfaceC23492o() { // from class: lP4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RidePassView m107206o0;
                m107206o0 = FP4.m107206o0(Function1.this, obj);
                return m107206o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "override fun onCreate() …      }, (Timber::e))\n  }");
        Object m33094as7 = map3.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2256r c2256r = new C2256r();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: mP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107205p0(Function1.this, obj);
            }
        };
        final C2257s c2257s = C2257s.f9330b;
        ((ObservableSubscribeProxy) m33094as7).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: nP4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                FP4.m107204q0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC40918fP4
    /* renamed from: e */
    public void mo41419e(Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        int i = C2238a.$EnumSwitchMapping$0[banner.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C41318g46.m40157g("Unknown banner: " + banner, new Object[0]);
                    return;
                }
                this.f9307n.mo37013h2(SystemSettingsReason.CONNECTIVITY);
                return;
            }
            this.f9298e.mo55905y(new C51326wx4(null, null, null, RentalConfigKt.rentalKind(this.f9296c.m82623f8().m73665a().getRentalConfigs()).toString(), 7, null));
            this.f9307n.mo37173F0(I35.LONG_TERM_RENTAL_SETUP.ordinal());
            this.f9297d.m37580r();
            this.f9306m.mo96963a(Banner.NONE);
        } else if (this.f9296c.m82623f8().getValue().getRiderTutorial() != null) {
            if (this.f9296c.m82623f8().getValue().getRideConfig().getEnableMultiModalTutorialSelection()) {
                this.f9307n.mo37165G2();
            } else {
                InterfaceC40099e13.C19924a.goToRiderTutorial$default(this.f9307n, null, 1, null);
            }
        } else {
            this.f9307n.mo37024f3();
        }
    }

    /* renamed from: y0 */
    public final void m107194y0(Banner banner, boolean z) {
        if (banner == Banner.HOW_TO_RIDE && z) {
            this.f9306m.mo96963a(Banner.NONE);
        } else {
            this.f9306m.mo96963a(banner);
        }
    }

    /* renamed from: z0 */
    public final boolean m107192z0(List<BirdPlusView> list, BirdPlusConfig birdPlusConfig) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        BirdPlusDisplayView display;
        if (birdPlusConfig != null) {
            z = Intrinsics.areEqual(birdPlusConfig.getEnabled(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        List<BirdPlusView> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (BirdPlusView birdPlusView : list2) {
                BirdPlusSubscriptionPlanView subscriptionPlan = birdPlusView.getSubscriptionPlan();
                if (subscriptionPlan != null && (display = subscriptionPlan.getDisplay()) != null) {
                    str = display.getBannerTitle();
                } else {
                    str = null;
                }
                if (str != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (!z3) {
            return false;
        }
        return true;
    }
}
