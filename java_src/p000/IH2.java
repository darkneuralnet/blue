package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.EndSelectedRideButton;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.RideStatusBottomSheetButton;
import co.bird.android.model.RideStatusLockButton;
import co.bird.android.model.RideStatusUnlockButton;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.SelectedRideButton;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireUserGuest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.IH2;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R:\u0010,\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0' )*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0018\u00010&0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R5\u00104\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/ )*\n\u0012\u0004\u0012\u00020/\u0018\u00010.0.0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R'\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b0\u00106¨\u0006:"}, m28432d2 = {"LIH2;", "", "", "v", "r", "o", "k", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "getScopeProvider", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LMH2;", "b", "LMH2;", "ui", "LrH2;", "c", "LrH2;", "converter", "LYR4;", DateTokenConverter.CONVERTER_KEY, "LYR4;", "rideManager", "LWg6;", "e", "LWg6;", "userGuestManager", "LpU4;", "f", "LpU4;", "rideMapStateManager", "LoF3;", "g", "LoF3;", "parkingManager", "Lio/reactivex/subjects/d;", "Lio/reactivex/F;", "", "LH6;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/d;", "uiUpdateSubject", "LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/SelectedRideButton;", "i", "Lkotlin/Lazy;", "j", "()LZ84;", "selectedRide", "La94;", "()La94;", "mutableSelectedRideRelay", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LMH2;LrH2;LYR4;LWg6;LpU4;LoF3;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManageRidesDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,196:1\n237#2:197\n180#2:200\n237#2:201\n82#3,2:198\n*S KotlinDebug\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter\n*L\n86#1:197\n130#1:200\n192#1:201\n92#1:198,2\n*E\n"})
/* renamed from: IH2 */
/* loaded from: classes3.dex */
public final class IH2 {

    /* renamed from: a */
    public final ScopeProvider f15056a;

    /* renamed from: b */
    public final MH2 f15057b;

    /* renamed from: c */
    public final C47960rH2 f15058c;

    /* renamed from: d */
    public final YR4 f15059d;

    /* renamed from: e */
    public final InterfaceC36821Wg6 f15060e;

    /* renamed from: f */
    public final InterfaceC46893pU4 f15061f;

    /* renamed from: g */
    public final InterfaceC46164oF3 f15062g;

    /* renamed from: h */
    public final C24558d<AbstractC23442F<List<C3023H6>>> f15063h;

    /* renamed from: i */
    public final Lazy f15064i;

    /* renamed from: j */
    public final Lazy f15065j;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStatusBottomSheetButton;", "button", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/RideStatusBottomSheetButton;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nManageRidesDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter$handleButtonClicks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    /* renamed from: IH2$a */
    /* loaded from: classes3.dex */
    public static final class C3469a extends Lambda implements Function1<RideStatusBottomSheetButton, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IH2$a$a */
        /* loaded from: classes3.dex */
        public static final class C3470a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C3470a f15067g = new C3470a();

            public C3470a() {
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

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IH2$a$b */
        /* loaded from: classes3.dex */
        public static final class C3471b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C3471b f15068g = new C3471b();

            public C3471b() {
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

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IH2$a$c */
        /* loaded from: classes3.dex */
        public static final class C3472c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C3472c f15069g = new C3472c();

            public C3472c() {
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

        public C3469a() {
            super(1);
        }

        /* renamed from: e */
        public static final void m102595e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m102594f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m102593g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(RideStatusBottomSheetButton button) {
            String str;
            String str2;
            WireRide ride;
            Intrinsics.checkNotNullParameter(button, "button");
            if (button instanceof SelectedRideButton) {
                IH2.this.m102613i().accept(Optional.f63040c.m59032c(button));
                return AbstractC23461c.m33039p();
            } else if (button instanceof EndSelectedRideButton) {
                YR4 yr4 = IH2.this.f15059d;
                SelectedRideButton selectedRideButton = (SelectedRideButton) ((Optional) IH2.this.m102612j().m73665a()).m59035e();
                String str3 = null;
                if (selectedRideButton != null) {
                    str = selectedRideButton.getRideId();
                } else {
                    str = null;
                }
                RideState mo75038i1 = yr4.mo75038i1(str);
                MH2 mh2 = IH2.this.f15057b;
                if (mo75038i1 != null && (ride = mo75038i1.getRide()) != null) {
                    str2 = ride.getId();
                } else {
                    str2 = null;
                }
                if (!mh2.m95455Pl(str2)) {
                    mo75038i1 = null;
                }
                if (mo75038i1 == null) {
                    mo75038i1 = RideStatesKt.firstActivePrimaryThenGuestOrNull(IH2.this.f15059d.mo75032o0().m73665a());
                }
                if (mo75038i1 != null) {
                    AbstractC23461c mo75025v0 = IH2.this.f15059d.mo75025v0(mo75038i1.getRide().getId(), RideState.Status.ENDED);
                    final C3470a c3470a = C3470a.f15067g;
                    return mo75025v0.m33084B(new InterfaceC23484g() { // from class: FH2
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IH2.C3469a.m102595e(Function1.this, obj);
                        }
                    });
                }
                SelectedRideButton selectedRideButton2 = (SelectedRideButton) ((Optional) IH2.this.m102612j().m73665a()).m59035e();
                if (selectedRideButton2 != null) {
                    str3 = selectedRideButton2.getRideId();
                }
                C41318g46.m40160d("no ride state found for " + str3 + " to end ride", new Object[0]);
                return AbstractC23461c.m33080F(new NoSuchElementException(IH2.this.f15057b.getString(C45871nl4.manage_rides_error_no_ride_found_to_end, new Object[0])));
            } else if (button instanceof RideStatusLockButton) {
                RideStatusLockButton rideStatusLockButton = (RideStatusLockButton) button;
                RideState mo75038i12 = IH2.this.f15059d.mo75038i1(rideStatusLockButton.getRideId());
                if (mo75038i12 != null) {
                    AbstractC23461c mo75025v02 = IH2.this.f15059d.mo75025v0(mo75038i12.getRide().getId(), RideState.Status.LOCKED);
                    final C3471b c3471b = C3471b.f15068g;
                    return mo75025v02.m33084B(new InterfaceC23484g() { // from class: GH2
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IH2.C3469a.m102594f(Function1.this, obj);
                        }
                    });
                }
                C41318g46.m40160d("no ride state found for " + rideStatusLockButton.getRideId() + " to lock", new Object[0]);
                return AbstractC23461c.m33080F(new NoSuchElementException(IH2.this.f15057b.getString(C45871nl4.manage_rides_error_no_ride_found_to_lock, new Object[0])));
            } else if (button instanceof RideStatusUnlockButton) {
                RideStatusUnlockButton rideStatusUnlockButton = (RideStatusUnlockButton) button;
                RideState mo75038i13 = IH2.this.f15059d.mo75038i1(rideStatusUnlockButton.getRideId());
                if (mo75038i13 != null) {
                    AbstractC23461c mo75025v03 = IH2.this.f15059d.mo75025v0(mo75038i13.getRide().getId(), RideState.Status.UNLOCKED);
                    final C3472c c3472c = C3472c.f15069g;
                    return mo75025v03.m33084B(new InterfaceC23484g() { // from class: HH2
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IH2.C3469a.m102593g(Function1.this, obj);
                        }
                    });
                }
                C41318g46.m40160d("no ride state found for " + rideStatusUnlockButton.getRideId() + " to unlock", new Object[0]);
                return AbstractC23461c.m33080F(new NoSuchElementException(IH2.this.f15057b.getString(C45871nl4.manage_rides_error_no_ride_found_to_unlock, new Object[0])));
            } else {
                return AbstractC23461c.m33039p();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IH2$b */
    /* loaded from: classes3.dex */
    public static final class C3473b extends Lambda implements Function1<Throwable, Unit> {
        public C3473b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            MH2 mh2 = IH2.this.f15057b;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            mh2.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"La94;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/SelectedRideButton;", "b", "()La94;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IH2$c */
    /* loaded from: classes3.dex */
    public static final class C3474c extends Lambda implements Function0<C37791a94<Optional<SelectedRideButton>>> {

        /* renamed from: g */
        public static final C3474c f15071g = new C3474c();

        public C3474c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C37791a94<Optional<SelectedRideButton>> invoke() {
            return C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: IH2$d */
    /* loaded from: classes3.dex */
    public static final class C3475d<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C3475d<T1, T2, T3, T4, T5, R> f15072a = new C3475d<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\n \u0002*\u0004\u0018\u00010\n0\n2d\u0010\t\u001a`\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RideUpdateState;", "LFH3;", "", "Lco/bird/android/model/wire/WireUserGuest;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/SelectedRideButton;", "<name for destructuring parameter 0>", "LvH2;", C17296a.f69688o, "(LRe4;)LvH2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nManageRidesDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter$observeRideStates$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1#2:197\n1045#3:198\n766#3:199\n857#3,2:200\n1559#3:202\n1590#3,3:203\n288#3,2:206\n1593#3:208\n*S KotlinDebug\n*F\n+ 1 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter$observeRideStates$1\n*L\n105#1:198\n112#1:199\n112#1:200,2\n113#1:202\n113#1:203,3\n122#1:206,2\n113#1:208\n*E\n"})
    /* renamed from: IH2$e */
    /* loaded from: classes3.dex */
    public static final class C3476e extends Lambda implements Function1<C35631Re4<? extends RideStates, ? extends RideUpdateState, ? extends FH3, ? extends List<? extends WireUserGuest>, ? extends Optional<SelectedRideButton>>, C50330vH2> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ManageRidesDialogPresenter.kt\nco/bird/android/feature/rider/bottomsheets/ManageRidesDialogPresenter$observeRideStates$1\n*L\n1#1,328:1\n107#2,3:329\n*E\n"})
        /* renamed from: IH2$e$a */
        /* loaded from: classes3.dex */
        public static final class C3477a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                DateTime startedAt;
                int compareValues;
                RideState rideState = (RideState) t;
                DateTime dateTime = null;
                if (RideStatesKt.isPrimaryRide(rideState)) {
                    startedAt = null;
                } else {
                    startedAt = rideState.getRide().getStartedAt();
                    if (startedAt == null) {
                        startedAt = DateTime.now();
                    }
                }
                RideState rideState2 = (RideState) t2;
                if (!RideStatesKt.isPrimaryRide(rideState2) && (dateTime = rideState2.getRide().getStartedAt()) == null) {
                    dateTime = DateTime.now();
                }
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(startedAt, dateTime);
                return compareValues;
            }
        }

        public C3476e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C50330vH2 invoke(C35631Re4<RideStates, ? extends RideUpdateState, ? extends FH3, ? extends List<WireUserGuest>, Optional<SelectedRideButton>> c35631Re4) {
            RideState rideState;
            List sortedWith;
            int collectionSizeOrDefault;
            boolean z;
            Object obj;
            String rideId;
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            RideStates m86500a = c35631Re4.m86500a();
            c35631Re4.m86499b();
            FH3 parkingStatus = c35631Re4.m86498c();
            List<WireUserGuest> userGuests = c35631Re4.m86497d();
            SelectedRideButton m59035e = c35631Re4.m86496e().m59035e();
            if (m59035e != null && (rideId = m59035e.getRideId()) != null) {
                rideState = IH2.this.f15059d.mo75038i1(rideId);
            } else {
                rideState = null;
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(m86500a.getRideStates(), new C3477a());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : sortedWith) {
                if (RideStateKt.isInRide((RideState) obj2)) {
                    arrayList.add(obj2);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            int i = 0;
            for (Object obj3 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RideState rideState2 = (RideState) obj3;
                boolean z2 = true;
                if (rideState != null && RideStateKt.isInRide(rideState)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = Intrinsics.areEqual(m59035e.getRideId(), rideState2.getRide().getId());
                } else if (i != 0) {
                    z2 = false;
                }
                Intrinsics.checkNotNullExpressionValue(parkingStatus, "parkingStatus");
                Intrinsics.checkNotNullExpressionValue(userGuests, "userGuests");
                Iterator<T> it = userGuests.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(rideState2.getRide().getUserGuestId(), ((WireUserGuest) obj).getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                arrayList2.add(new C49145tH2(rideState2, parkingStatus, (WireUserGuest) obj, z2));
                i = i2;
            }
            return new C50330vH2(arrayList2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LvH2;", "kotlin.jvm.PlatformType", RequestHeadersFactory.MODEL, "", C17296a.f69688o, "(LvH2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IH2$f */
    /* loaded from: classes3.dex */
    public static final class C3478f extends Lambda implements Function1<C50330vH2, Unit> {
        public C3478f() {
            super(1);
        }

        /* renamed from: a */
        public final void m102589a(C50330vH2 model) {
            String m8938c = model.m8938c();
            C41318g46.m40163a("Received model for rendering in bottom sheet: " + m8938c, new Object[0]);
            if (model.m8939b().size() <= 1) {
                IH2.this.f15057b.dismissDialog();
                return;
            }
            C24558d c24558d = IH2.this.f15063h;
            C47960rH2 c47960rH2 = IH2.this.f15058c;
            Intrinsics.checkNotNullExpressionValue(model, "model");
            c24558d.onNext(c47960rH2.m16124s(model));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50330vH2 c50330vH2) {
            m102589a(c50330vH2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/F;", "", "LH6;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lio/reactivex/F;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IH2$g */
    /* loaded from: classes3.dex */
    public static final class C3479g extends Lambda implements Function1<AbstractC23442F<List<? extends C3023H6>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: g */
        public static final C3479g f15075g = new C3479g();

        public C3479g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(AbstractC23442F<List<C3023H6>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IH2$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3480h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3480h f15076b = new C3480h();

        public C3480h() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IH2$i */
    /* loaded from: classes3.dex */
    public static final class C3481i extends Lambda implements Function1<List<? extends C3023H6>, InterfaceC23496h> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IH2$i$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C3482a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C3482a f15078b = new C3482a();

            public C3482a() {
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

        public C3481i() {
            super(1);
        }

        /* renamed from: d */
        public static final Unit m102584d(IH2 this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            this$0.f15057b.m95454o(it);
            return Unit.INSTANCE;
        }

        /* renamed from: e */
        public static final void m102583e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(final List<C3023H6> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final IH2 ih2 = IH2.this;
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: JH2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m102584d;
                    m102584d = IH2.C3481i.m102584d(IH2.this, it);
                    return m102584d;
                }
            });
            final C3482a c3482a = C3482a.f15078b;
            return m33078H.m33084B(new InterfaceC23484g() { // from class: KH2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IH2.C3481i.m102583e(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/SelectedRideButton;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IH2$j */
    /* loaded from: classes3.dex */
    public static final class C3483j extends Lambda implements Function0<Z84<Optional<SelectedRideButton>>> {
        public C3483j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<SelectedRideButton>> invoke() {
            return Z84.f47888d.m73663b(IH2.this.m102613i());
        }
    }

    public IH2(ScopeProvider scopeProvider, MH2 ui, C47960rH2 converter, YR4 rideManager, InterfaceC36821Wg6 userGuestManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC46164oF3 parkingManager) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(userGuestManager, "userGuestManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(parkingManager, "parkingManager");
        this.f15056a = scopeProvider;
        this.f15057b = ui;
        this.f15058c = converter;
        this.f15059d = rideManager;
        this.f15060e = userGuestManager;
        this.f15061f = rideMapStateManager;
        this.f15062g = parkingManager;
        C24558d<AbstractC23442F<List<C3023H6>>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Single<List<AdapterSection>>>()");
        this.f15063h = m31902e;
        lazy = LazyKt__LazyJVMKt.lazy(new C3483j());
        this.f15064i = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(C3474c.f15071g);
        this.f15065j = lazy2;
    }

    /* renamed from: l */
    public static final InterfaceC23496h m102610l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m102609m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m102608n() {
    }

    /* renamed from: p */
    public static final C50330vH2 m102606p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C50330vH2) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m102605q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m102603s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m102602t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23496h m102601u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public final C37791a94<Optional<SelectedRideButton>> m102613i() {
        return (C37791a94) this.f15065j.getValue();
    }

    /* renamed from: j */
    public final Z84<Optional<SelectedRideButton>> m102612j() {
        return (Z84) this.f15064i.getValue();
    }

    /* renamed from: k */
    public final void m102611k() {
        Observable<RideStatusBottomSheetButton> observeOn = this.f15057b.m95456B1().observeOn(C23454a.m33087a());
        final C3469a c3469a = new C3469a();
        AbstractC23461c flatMapCompletable = observeOn.flatMapCompletable(new InterfaceC23492o() { // from class: xH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102610l;
                m102610l = IH2.m102610l(Function1.this, obj);
                return m102610l;
            }
        });
        final C3473b c3473b = new C3473b();
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: yH2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IH2.m102609m(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "private fun handleButton…)\n      .subscribe {}\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f15056a));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: zH2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                IH2.m102608n();
            }
        });
    }

    /* renamed from: o */
    public final void m102607o() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<RideStates> startWith = this.f15059d.mo75032o0().startWith((Z84<RideStates>) this.f15059d.mo75032o0().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith, "rideManager.rideStates.s…rideManager.rideStates())");
        Observable<RideUpdateState> startWith2 = this.f15061f.mo15903f().startWith((Z84<RideUpdateState>) this.f15061f.mo15903f().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith2, "rideMapStateManager.ride…ger.rideStatusUpdating())");
        Observable<FH3> startWith3 = this.f15062g.mo21501i().startWith((Observable<FH3>) this.f15062g.mo21500j());
        Intrinsics.checkNotNullExpressionValue(startWith3, "parkingManager.parkingSt…ger.currentParkingStatus)");
        Observable<List<WireUserGuest>> startWith4 = this.f15060e.mo64137b().startWith((Z84<List<WireUserGuest>>) this.f15060e.mo64137b().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith4, "userGuestManager.activeU…nager.activeUserGuests())");
        Observable<Optional<SelectedRideButton>> startWith5 = m102612j().startWith((Z84<Optional<SelectedRideButton>>) m102612j().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith5, "selectedRide.startWith(selectedRide())");
        Observable combineLatest = Observable.combineLatest(startWith, startWith2, startWith3, startWith4, startWith5, C3475d.f15072a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        Observable distinctUntilChanged = combineLatest.observeOn(C24542a.m31934a()).distinctUntilChanged();
        final C3476e c3476e = new C3476e();
        Observable observeOn = distinctUntilChanged.map(new InterfaceC23492o() { // from class: AH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C50330vH2 m102606p;
                m102606p = IH2.m102606p(Function1.this, obj);
                return m102606p;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun observeRideS…l))\n        }\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f15056a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3478f c3478f = new C3478f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: BH2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IH2.m102605q(Function1.this, obj);
            }
        });
    }

    /* renamed from: r */
    public final void m102604r() {
        List emptyList;
        AbstractC24490k<AbstractC23442F<List<C3023H6>>> flowable = this.f15063h.toFlowable(EnumC23460b.LATEST);
        final C3479g c3479g = C3479g.f15075g;
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: CH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102603s;
                m102603s = IH2.m102603s(Function1.this, obj);
                return m102603s;
            }
        });
        final C3480h c3480h = C3480h.f15076b;
        AbstractC24490k m32195I = m32149f0.m32195I(new InterfaceC23484g() { // from class: DH2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IH2.m102602t(Function1.this, obj);
            }
        });
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24490k m32111s0 = m32195I.m32206C0(emptyList).m32111s0(C23454a.m33087a());
        final C3481i c3481i = new C3481i();
        AbstractC23461c m32162Z = m32111s0.m32162Z(new InterfaceC23492o() { // from class: EH2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102601u;
                m102601u = IH2.m102601u(Function1.this, obj);
                return m102601u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32162Z, "private fun observeUiUpd…r)\n      .subscribe()\n  }");
        Object m33041n = m32162Z.m33041n(AutoDispose.m45239a(this.f15056a));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: v */
    public final void m102600v() {
        m102604r();
        m102607o();
        m102611k();
    }
}
