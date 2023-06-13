package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.CurrentRental;
import co.bird.android.model.CurrentRentalResponse;
import co.bird.android.model.DeliveryWindow;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.RentalPlansResponse;
import co.bird.android.model.User;
import co.bird.android.model.constant.RentalKind;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.configs.RentalConfig;
import co.bird.api.request.CancelLongTermRentalBody;
import co.bird.api.request.EndLongTermRentalBody;
import co.bird.api.request.ScheduleLongTermRentalBody;
import co.bird.api.response.CollectionResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00106\u001a\u000204¢\u0006\u0004\bI\u0010JJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002JD\u0010\n\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00020\u0002 \t*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00020\u0002\u0018\u00010\u00070\u0007H\u0002J\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0002J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016J$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010$\u001a\u00020#H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010'\u001a\u00020&H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010'\u001a\u00020&H\u0016R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105RB\u0010;\u001a0\u0012,\u0012*\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`9 \t*\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`9\u0018\u00010808078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R&\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b080\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010<\u001a\u0004\b1\u0010=R-\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002080?8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010@\u001a\u0004\bA\u0010BR&\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002080D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010E¨\u0006K"}, m28432d2 = {"LQx4;", "LCx4;", "", "Lco/bird/android/model/CurrentRental;", "rentals", "", "O", "Lio/reactivex/Observable;", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "G", "plans", "D", "plan", "", "E", "(Lco/bird/android/model/RentalPlan;)Ljava/lang/Integer;", "M", "Landroid/location/Location;", "location", "", "radius", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/Area;", "f", "LHM4;", "Lco/bird/android/model/RentalPlansResponse;", "b", "g", "latitude", "longitude", "B", "Lio/reactivex/p;", "Ltg1;", "i", "Lco/bird/api/request/ScheduleLongTermRentalBody;", "body", C17296a.f69688o, "", "rentalId", "e", DateTokenConverter.CONVERTER_KEY, "Lxx4;", "Lxx4;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LTq4;", "LTq4;", "reactiveConfig", "Ldr4;", "c", "Ldr4;", "locationManager", "LOn;", "LOn;", "areaRepo", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/coreinterface/manager/RentalPlans;", "Lio/reactivex/subjects/a;", "allOnDemandPlans", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "onDemandPlan", "LZ84;", "Lkotlin/Lazy;", "h", "()LZ84;", "currentRentals", "La94;", "La94;", "mutableLongTermRentals", "LRh6;", "userStream", "<init>", "(LRh6;Lxx4;LTq4;Ldr4;LOn;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRentalManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentalManagerImpl.kt\nco/bird/android/manager/ride/RentalManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n180#2:231\n180#2:232\n288#3,2:233\n1789#3,3:235\n1789#3,3:238\n*S KotlinDebug\n*F\n+ 1 RentalManagerImpl.kt\nco/bird/android/manager/ride/RentalManagerImpl\n*L\n81#1:231\n85#1:232\n189#1:233,2\n207#1:235,3\n220#1:238,3\n*E\n"})
/* renamed from: Qx4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35568Qx4 implements InterfaceC32292Cx4 {

    /* renamed from: a */
    public final InterfaceC51919xx4 f31283a;

    /* renamed from: b */
    public final C36207Tq4 f31284b;

    /* renamed from: c */
    public final InterfaceC40001dr4 f31285c;

    /* renamed from: d */
    public final InterfaceC6137On f31286d;

    /* renamed from: e */
    public final C24552a<Optional<List<RentalPlan>>> f31287e;

    /* renamed from: f */
    public final Observable<Optional<RentalPlan>> f31288f;

    /* renamed from: g */
    public final Lazy f31289g;

    /* renamed from: h */
    public final C37791a94<Optional<List<CurrentRental>>> f31290h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RentalConfig;", "config", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/RentalConfig;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$a */
    /* loaded from: classes4.dex */
    public static final class C7010a extends Lambda implements Function1<RentalConfig, Boolean> {

        /* renamed from: g */
        public static final C7010a f31291g = new C7010a();

        public C7010a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RentalConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RentalConfig;", "it", "Lio/reactivex/B;", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/RentalConfig;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$b */
    /* loaded from: classes4.dex */
    public static final class C7011b extends Lambda implements Function1<RentalConfig, InterfaceC23434B<? extends List<? extends RentalPlan>>> {
        public C7011b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends List<RentalPlan>> invoke(RentalConfig it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getEnabled()) {
                return C35568Qx4.this.m87547G();
            }
            C35568Qx4.this.f31287e.onNext(Optional.f63040c.m59034a());
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$c */
    /* loaded from: classes4.dex */
    public static final class C7012c extends Lambda implements Function1<User, Unit> {
        public C7012c() {
            super(1);
        }

        /* renamed from: a */
        public final void m87510a(User user) {
            C35568Qx4.this.m87541M();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m87510a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/CurrentRentalResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$d */
    /* loaded from: classes4.dex */
    public static final class C7013d extends Lambda implements Function1<HM4<CurrentRentalResponse>, Unit> {
        public C7013d() {
            super(1);
        }

        /* renamed from: a */
        public final void m87509a(HM4<CurrentRentalResponse> hm4) {
            List listOf;
            CurrentRentalResponse m103944a = hm4.m103944a();
            if (m103944a != null) {
                C35568Qx4 c35568Qx4 = C35568Qx4.this;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m103944a.getItem());
                c35568Qx4.m87539O(listOf);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<CurrentRentalResponse> hm4) {
            m87509a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/CurrentRental;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$e */
    /* loaded from: classes4.dex */
    public static final class C7014e extends Lambda implements Function0<Z84<Optional<List<? extends CurrentRental>>>> {
        public C7014e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Optional<List<? extends CurrentRental>>> invoke2() {
            return Z84.f47888d.m73663b(C35568Qx4.this.f31290h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/CurrentRentalResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$f */
    /* loaded from: classes4.dex */
    public static final class C7015f extends Lambda implements Function1<HM4<CurrentRentalResponse>, Unit> {
        public C7015f() {
            super(1);
        }

        /* renamed from: a */
        public final void m87508a(HM4<CurrentRentalResponse> hm4) {
            List listOf;
            CurrentRentalResponse m103944a = hm4.m103944a();
            if (m103944a != null) {
                C35568Qx4 c35568Qx4 = C35568Qx4.this;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m103944a.getItem());
                c35568Qx4.m87539O(listOf);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<CurrentRentalResponse> hm4) {
            m87508a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/RentalPlansResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$g */
    /* loaded from: classes4.dex */
    public static final class C7016g extends Lambda implements Function1<HM4<RentalPlansResponse>, InterfaceC23447K<? extends RentalPlansResponse>> {

        /* renamed from: g */
        public static final C7016g f31297g = new C7016g();

        public C7016g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends RentalPlansResponse> invoke(HM4<RentalPlansResponse> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            RentalPlansResponse m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                return AbstractC23442F.m33158H(m103944a);
            }
            return AbstractC23442F.m33100x(C38816bt2.f59712b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/RentalPlan;", "Lco/bird/android/coreinterface/manager/RentalPlans;", "rentalPlans", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$h */
    /* loaded from: classes4.dex */
    public static final class C7017h extends Lambda implements Function1<Optional<List<? extends RentalPlan>>, Optional<RentalPlan>> {
        public C7017h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<RentalPlan> invoke(Optional<List<RentalPlan>> rentalPlans) {
            Intrinsics.checkNotNullParameter(rentalPlans, "rentalPlans");
            List<RentalPlan> m59035e = rentalPlans.m59035e();
            if (m59035e == null) {
                return Optional.f63040c.m59034a();
            }
            RentalPlan m87550D = C35568Qx4.this.m87550D(m59035e);
            if (m87550D == null) {
                return Optional.f63040c.m59034a();
            }
            return Optional.f63040c.m59032c(m87550D);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Landroid/location/Location;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$i */
    /* loaded from: classes4.dex */
    public static final class C7018i extends Lambda implements Function1<Long, Location> {
        public C7018i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Location invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C35568Qx4.this.f31285c.mo43616p().m73665a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/u;", "Lco/bird/android/model/RentalPlansResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$j */
    /* loaded from: classes4.dex */
    public static final class C7019j extends Lambda implements Function1<Location, InterfaceC24574u<? extends RentalPlansResponse>> {
        public C7019j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends RentalPlansResponse> invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return C35568Qx4.this.m87552B(location.getLatitude(), location.getLongitude()).m33125j0().m32065J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RentalPlansResponse;", "response", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RentalPlansResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$k */
    /* loaded from: classes4.dex */
    public static final class C7020k extends Lambda implements Function1<RentalPlansResponse, List<? extends RentalPlan>> {

        /* renamed from: g */
        public static final C7020k f31301g = new C7020k();

        public C7020k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<RentalPlan> invoke(RentalPlansResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.getPlans();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qx4$l */
    /* loaded from: classes4.dex */
    public static final class C7021l extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C7021l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> it) {
            C24552a c24552a = C35568Qx4.this.f31287e;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c24552a.onNext(c14443a.m59032c(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/CurrentRental;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qx4$m */
    /* loaded from: classes4.dex */
    public static final class C7022m extends Lambda implements Function1<HM4<CollectionResponse<CurrentRental>>, Unit> {
        public C7022m() {
            super(1);
        }

        /* renamed from: a */
        public final void m87502a(HM4<CollectionResponse<CurrentRental>> hm4) {
            CollectionResponse<CurrentRental> m103944a = hm4.m103944a();
            if (m103944a != null) {
                C35568Qx4.this.m87539O(m103944a.getItems());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<CollectionResponse<CurrentRental>> hm4) {
            m87502a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/CurrentRentalResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRentalManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentalManagerImpl.kt\nco/bird/android/manager/ride/RentalManagerImpl$scheduleRental$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
    /* renamed from: Qx4$n */
    /* loaded from: classes4.dex */
    public static final class C7023n extends Lambda implements Function1<HM4<CurrentRentalResponse>, Unit> {
        public C7023n() {
            super(1);
        }

        /* renamed from: a */
        public final void m87501a(HM4<CurrentRentalResponse> hm4) {
            List listOf;
            CurrentRentalResponse m103944a = hm4.m103944a();
            if (m103944a != null) {
                C35568Qx4 c35568Qx4 = C35568Qx4.this;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m103944a.getItem());
                c35568Qx4.m87539O(listOf);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<CurrentRentalResponse> hm4) {
            m87501a(hm4);
            return Unit.INSTANCE;
        }
    }

    public C35568Qx4(InterfaceC35660Rh6 userStream, InterfaceC51919xx4 client, C36207Tq4 reactiveConfig, InterfaceC40001dr4 locationManager, InterfaceC6137On areaRepo) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(areaRepo, "areaRepo");
        this.f31283a = client;
        this.f31284b = reactiveConfig;
        this.f31285c = locationManager;
        this.f31286d = areaRepo;
        Optional.C14443a c14443a = Optional.f63040c;
        C24552a<Optional<List<RentalPlan>>> m31921g = C24552a.m31921g(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<Optional<R…    Optional.absent()\n  )");
        this.f31287e = m31921g;
        Observable<Optional<List<RentalPlan>>> distinctUntilChanged = m31921g.distinctUntilChanged();
        final C7017h c7017h = new C7017h();
        Observable map = distinctUntilChanged.map(new InterfaceC23492o() { // from class: Kx4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m87548F;
                m87548F = C35568Qx4.m87548F(Function1.this, obj);
                return m87548F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "allOnDemandPlans.distinc….of(shortestPlan)\n      }");
        this.f31288f = map;
        lazy = LazyKt__LazyJVMKt.lazy(new C7014e());
        this.f31289g = lazy;
        this.f31290h = C37791a94.C10586a.create$default(C37791a94.f49908h, c14443a.m59034a(), null, 2, null);
        Observable<RentalConfig> m82838K8 = reactiveConfig.m82838K8();
        final C7010a c7010a = C7010a.f31291g;
        Observable<RentalConfig> distinctUntilChanged2 = m82838K8.distinctUntilChanged(new InterfaceC23492o() { // from class: Lx4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m87516w;
                m87516w = C35568Qx4.m87516w(Function1.this, obj);
                return m87516w;
            }
        });
        final C7011b c7011b = new C7011b();
        Observable<R> switchMap = distinctUntilChanged2.switchMap(new InterfaceC23492o() { // from class: Mx4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m87515x;
                m87515x = C35568Qx4.m87515x(Function1.this, obj);
                return m87515x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "reactiveConfig.onDemandC…      }\n        }\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        Observable<User> mo76576i = userStream.mo76576i();
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7012c c7012c = new C7012c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Nx4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35568Qx4.m87514y(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m87553A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23447K m87551C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final Optional m87548F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final Location m87546H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Location) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC24574u m87545I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final List m87544J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m87543K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m87542L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m87540N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final Boolean m87516w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23434B m87515x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m87514y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m87513z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public AbstractC23442F<RentalPlansResponse> m87552B(double d, double d2) {
        AbstractC23442F<HM4<RentalPlansResponse>> m4382e = this.f31283a.m4382e(d, d2, RentalKind.ON_DEMAND);
        final C7016g c7016g = C7016g.f31297g;
        AbstractC23442F<RentalPlansResponse> m33152N = m4382e.m33165A(new InterfaceC23492o() { // from class: Px4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87551C;
                m87551C = C35568Qx4.m87551C(Function1.this, obj);
                return m87551C;
            }
        }).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "client.getAvailability(\n…dSchedulers.mainThread())");
        return m33152N;
    }

    /* renamed from: D */
    public final RentalPlan m87550D(List<RentalPlan> list) {
        Object firstOrNull;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        RentalPlan rentalPlan = (RentalPlan) firstOrNull;
        if (rentalPlan == null) {
            return null;
        }
        if (list.size() == 1) {
            return rentalPlan;
        }
        for (RentalPlan rentalPlan2 : list) {
            Integer m87549E = m87549E(rentalPlan);
            Integer m87549E2 = m87549E(rentalPlan2);
            if (m87549E == null || (m87549E2 != null && m87549E.intValue() > m87549E2.intValue())) {
                rentalPlan = rentalPlan2;
            }
        }
        return rentalPlan;
    }

    /* renamed from: E */
    public final Integer m87549E(RentalPlan rentalPlan) {
        Integer num = null;
        for (DeliveryWindow deliveryWindow : rentalPlan.getDeliveryWindows()) {
            if (num == null && deliveryWindow.getOnDemandEstimatedTime() != null) {
                num = deliveryWindow.getOnDemandEstimatedTime();
            } else if (num != null && deliveryWindow.getOnDemandEstimatedTime() != null) {
                int intValue = num.intValue();
                Integer onDemandEstimatedTime = deliveryWindow.getOnDemandEstimatedTime();
                Intrinsics.checkNotNull(onDemandEstimatedTime);
                if (intValue > onDemandEstimatedTime.intValue()) {
                    num = deliveryWindow.getOnDemandEstimatedTime();
                }
            }
        }
        return num;
    }

    /* renamed from: G */
    public final Observable<List<RentalPlan>> m87547G() {
        Observable<Long> interval = Observable.interval(0L, 1L, TimeUnit.MINUTES);
        final C7018i c7018i = new C7018i();
        Observable<R> map = interval.map(new InterfaceC23492o() { // from class: Dx4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Location m87546H;
                m87546H = C35568Qx4.m87546H(Function1.this, obj);
                return m87546H;
            }
        });
        final C7019j c7019j = new C7019j();
        Observable flatMapMaybe = map.flatMapMaybe(new InterfaceC23492o() { // from class: Hx4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m87545I;
                m87545I = C35568Qx4.m87545I(Function1.this, obj);
                return m87545I;
            }
        });
        final C7020k c7020k = C7020k.f31301g;
        Observable map2 = flatMapMaybe.map(new InterfaceC23492o() { // from class: Ix4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m87544J;
                m87544J = C35568Qx4.m87544J(Function1.this, obj);
                return m87544J;
            }
        });
        final C7021l c7021l = new C7021l();
        return map2.doOnNext(new InterfaceC23484g() { // from class: Jx4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35568Qx4.m87543K(Function1.this, obj);
            }
        });
    }

    /* renamed from: M */
    public void m87541M() {
        this.f31290h.m71836j();
    }

    /* renamed from: O */
    public final void m87539O(List<CurrentRental> list) {
        Object obj;
        List listOfNotNull;
        boolean z;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                CurrentRental currentRental = (CurrentRental) obj;
                if (currentRental.getCompletedAt() == null && currentRental.getCanceledAt() == null) {
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
        C37791a94<Optional<List<CurrentRental>>> c37791a94 = this.f31290h;
        Optional.C14443a c14443a = Optional.f63040c;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((CurrentRental) obj);
        c37791a94.accept(c14443a.m59032c(listOfNotNull));
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: a */
    public AbstractC24507p<C49375tg1> mo87538a(ScheduleLongTermRentalBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        AbstractC23442F<HM4<CurrentRentalResponse>> m4386a = this.f31283a.m4386a(body);
        final C7023n c7023n = new C7023n();
        AbstractC23442F<HM4<CurrentRentalResponse>> m33101w = m4386a.m33101w(new InterfaceC23484g() { // from class: Ex4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35568Qx4.m87540N(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun scheduleRen…dSchedulers.mainThread())");
        AbstractC24507p<C49375tg1> m32066I = NM4.m94019b(m33101w).m32056T(C24542a.m31932c()).m32066I(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32066I, "override fun scheduleRen…dSchedulers.mainThread())");
        return m32066I;
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: b */
    public AbstractC23442F<HM4<RentalPlansResponse>> mo87537b(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<HM4<RentalPlansResponse>> m33152N = this.f31283a.m4382e(location.getLatitude(), location.getLongitude(), RentalKind.DROP_OFF).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "client.getAvailability(\n…dSchedulers.mainThread())");
        return m33152N;
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: c */
    public Observable<Optional<RentalPlan>> mo87536c() {
        return this.f31288f;
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: d */
    public AbstractC24507p<C49375tg1> mo87535d(String rentalId) {
        Intrinsics.checkNotNullParameter(rentalId, "rentalId");
        AbstractC23442F<HM4<CurrentRentalResponse>> m4385b = this.f31283a.m4385b(new EndLongTermRentalBody(rentalId));
        final C7015f c7015f = new C7015f();
        AbstractC23442F<HM4<CurrentRentalResponse>> m33101w = m4385b.m33101w(new InterfaceC23484g() { // from class: Gx4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35568Qx4.m87553A(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun endRental(r…edulers.mainThread())\n  }");
        AbstractC24507p<C49375tg1> m32066I = NM4.m94019b(m33101w).m32056T(C24542a.m31932c()).m32066I(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32066I, "override fun endRental(r…edulers.mainThread())\n  }");
        return m32066I;
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: e */
    public AbstractC24507p<C49375tg1> mo87534e(String rentalId) {
        Intrinsics.checkNotNullParameter(rentalId, "rentalId");
        AbstractC23442F<HM4<CurrentRentalResponse>> m4383d = this.f31283a.m4383d(new CancelLongTermRentalBody(rentalId));
        final C7013d c7013d = new C7013d();
        AbstractC23442F<HM4<CurrentRentalResponse>> m33101w = m4383d.m33101w(new InterfaceC23484g() { // from class: Fx4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35568Qx4.m87513z(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun cancelRenta…edulers.mainThread())\n  }");
        AbstractC24507p<C49375tg1> m32066I = NM4.m94019b(m33101w).m32056T(C24542a.m31932c()).m32066I(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32066I, "override fun cancelRenta…edulers.mainThread())\n  }");
        return m32066I;
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: f */
    public AbstractC23442F<List<Area>> mo87533f(Location location, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<List<Area>> m33142Y = this.f31286d.mo74273I0(location, d).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "areaRepo.fetchRentalArea…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: g */
    public AbstractC23442F<HM4<RentalPlansResponse>> mo87532g(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<HM4<RentalPlansResponse>> m33152N = this.f31283a.m4382e(location.getLatitude(), location.getLongitude(), RentalKind.PICK_UP).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "client.getAvailability(\n…dSchedulers.mainThread())");
        return m33152N;
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: h */
    public Z84<Optional<List<CurrentRental>>> mo87531h() {
        return (Z84) this.f31289g.getValue();
    }

    @Override // p000.InterfaceC32292Cx4
    /* renamed from: i */
    public AbstractC24507p<C49375tg1> mo87530i() {
        AbstractC23442F<HM4<CollectionResponse<CurrentRental>>> m4384c = this.f31283a.m4384c(0, 1, true);
        final C7022m c7022m = new C7022m();
        AbstractC23442F<HM4<CollectionResponse<CurrentRental>>> m33101w = m4384c.m33101w(new InterfaceC23484g() { // from class: Ox4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35568Qx4.m87542L(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun refreshRent…edulers.mainThread())\n  }");
        AbstractC24507p<C49375tg1> m32066I = NM4.m94019b(m33101w).m32056T(C24542a.m31932c()).m32066I(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32066I, "override fun refreshRent…edulers.mainThread())\n  }");
        return m32066I;
    }
}
