package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.itemlease.ItemLeaseExemption;
import co.bird.android.model.itemlease.LeaseItemAvailabilityResponse;
import co.bird.android.model.itemlease.p022enum.ItemLeaseExemptionType;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import co.bird.android.model.wire.configs.LeaseTypeConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringBuilderKt;
import p000.InterfaceC40099e13;
import p000.TI1;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 92\u00020\u0001:\u0001\u0013BS\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\b\u00104\u001a\u0004\u0018\u000102¢\u0006\u0004\b;\u0010<J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006="}, m28432d2 = {"LTI1;", "", "", "m", "n", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "l", "i", "", "resolution", "z", "q", "o", "p", "LMc2;", C17296a.f69688o, "LMc2;", "itemLeaseManager", "LoI5;", "b", "LoI5;", "smartlockManager", "LYI1;", "c", "LYI1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "e", "Le13;", "navigator", "Lgl;", "f", "Lgl;", "appPreference", "LTq4;", "g", "LTq4;", "reactiveConfig", "LEa;", "h", "LEa;", "analyticsManager", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "k", "()Z", "isMandatory", "j", "isLeaseRequired", "<init>", "(LMc2;LoI5;LYI1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LTq4;LEa;Lco/bird/android/model/wire/WireBird;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeasePromptPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeasePromptPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,259:1\n1#2:260\n288#3,2:261\n180#4:263\n180#4:264\n180#4:265\n*S KotlinDebug\n*F\n+ 1 HelmetLeasePromptPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptPresenter\n*L\n121#1:261,2\n146#1:263\n160#1:264\n224#1:265\n*E\n"})
/* renamed from: TI1 */
/* loaded from: classes3.dex */
public final class TI1 {

    /* renamed from: j */
    public static final C7753a f35190j = new C7753a(null);

    /* renamed from: a */
    public final InterfaceC34441Mc2 f35191a;

    /* renamed from: b */
    public final InterfaceC46193oI5 f35192b;

    /* renamed from: c */
    public final YI1 f35193c;

    /* renamed from: d */
    public final ScopeProvider f35194d;

    /* renamed from: e */
    public final InterfaceC40099e13 f35195e;

    /* renamed from: f */
    public final C22454gl f35196f;

    /* renamed from: g */
    public final C36207Tq4 f35197g;

    /* renamed from: h */
    public final InterfaceC1880Ea f35198h;

    /* renamed from: i */
    public final WireBird f35199i;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"LTI1$a;", "", "", "REQUEST_CODE", "I", "", "RESOLUTION_ACCEPTED", "Ljava/lang/String;", "RESOLUTION_DECLINED", "RESOLUTION_MISSING", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: TI1$a */
    /* loaded from: classes3.dex */
    public static final class C7753a {
        public /* synthetic */ C7753a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7753a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nHelmetLeasePromptPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeasePromptPresenter.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptPresenter$setupClickListeners$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
    /* renamed from: TI1$b */
    /* loaded from: classes3.dex */
    public static final class C7754b extends Lambda implements Function1<Unit, Unit> {
        public C7754b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            List<WirePhysicalLock> physicalLocks;
            Object firstOrNull;
            TI1.this.m83923z("accepted");
            WireBird wireBird = TI1.this.f35199i;
            if (wireBird != null) {
                TI1.this.f35191a.mo55675f(wireBird, ItemLeaseType.HELMET);
            }
            WireBird wireBird2 = TI1.this.f35199i;
            boolean z = false;
            if (wireBird2 != null && (physicalLocks = wireBird2.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) firstOrNull;
                if (wirePhysicalLock != null && wirePhysicalLock.isSolebe()) {
                    z = true;
                }
            }
            if (z) {
                InterfaceC40099e13.C19924a.goToHelmetLeaseSolebe$default(TI1.this.f35195e, TI1.this.f35199i, null, 1284, 2, null);
            } else {
                TI1.this.f35195e.mo36948s1(TI1.this.f35199i, 1284);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TI1$c */
    /* loaded from: classes3.dex */
    public static final class C7755c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7755c f35201g = new C7755c();

        public C7755c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling helmet button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TI1$d */
    /* loaded from: classes3.dex */
    public static final class C7756d extends Lambda implements Function1<Unit, Unit> {
        public C7756d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            ItemLeaseExemptionType itemLeaseExemptionType;
            TI1.this.m83923z("declined");
            WireBird wireBird = TI1.this.f35199i;
            if (wireBird != null) {
                TI1 ti1 = TI1.this;
                InterfaceC34441Mc2 interfaceC34441Mc2 = ti1.f35191a;
                ItemLeaseType itemLeaseType = ItemLeaseType.HELMET;
                if (ti1.m83938k()) {
                    itemLeaseExemptionType = ItemLeaseExemptionType.PERSONAL_HELMET;
                } else {
                    itemLeaseExemptionType = ItemLeaseExemptionType.DECLINED_SUGGESTION;
                }
                interfaceC34441Mc2.mo55708A(new ItemLeaseExemption(wireBird, itemLeaseType, itemLeaseExemptionType, null, 8, null));
            }
            TI1.this.f35192b.mo21399h();
            TI1.this.f35195e.mo37050b1(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TI1$e */
    /* loaded from: classes3.dex */
    public static final class C7757e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7757e f35203g = new C7757e();

        public C7757e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling have own helmet button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TI1$f */
    /* loaded from: classes3.dex */
    public static final class C7758f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TI1$f$a */
        /* loaded from: classes3.dex */
        public static final class C7759a extends Lambda implements Function1<LeaseItemAvailabilityResponse, Unit> {

            /* renamed from: g */
            public static final C7759a f35205g = new C7759a();

            public C7759a() {
                super(1);
            }

            /* renamed from: a */
            public final void m83918a(LeaseItemAvailabilityResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LeaseItemAvailabilityResponse leaseItemAvailabilityResponse) {
                m83918a(leaseItemAvailabilityResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: TI1$f$b */
        /* loaded from: classes3.dex */
        public static final class C7760b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C7760b f35206g = new C7760b();

            public C7760b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Failed to make API call to update lease item availability, ignoring.", new Object[0]);
            }
        }

        public C7758f() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m83920c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Unit) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final void m83919d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC34441Mc2 interfaceC34441Mc2 = TI1.this.f35191a;
            ItemLeaseType itemLeaseType = ItemLeaseType.HELMET;
            WireBird wireBird = TI1.this.f35199i;
            AbstractC23442F<LeaseItemAvailabilityResponse> mo55661o = interfaceC34441Mc2.mo55661o(itemLeaseType, false, null, wireBird != null ? wireBird.getId() : null);
            final C7759a c7759a = C7759a.f35205g;
            AbstractC23442F<R> m33157I = mo55661o.m33157I(new InterfaceC23492o() { // from class: UI1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Unit m83920c;
                    m83920c = TI1.C7758f.m83920c(Function1.this, obj);
                    return m83920c;
                }
            });
            final C7760b c7760b = C7760b.f35206g;
            return m33157I.m33106t(new InterfaceC23484g() { // from class: VI1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TI1.C7758f.m83919d(Function1.this, obj);
                }
            }).m33148R(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TI1$g */
    /* loaded from: classes3.dex */
    public static final class C7761g extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TI1$g$a */
        /* loaded from: classes3.dex */
        public static final class C7762a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ TI1 f35208g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7762a(TI1 ti1) {
                super(1);
                this.f35208g = ti1;
            }

            /* renamed from: a */
            public final void m83914a(DialogResponse dialogResponse) {
                this.f35208g.f35195e.mo37050b1(0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m83914a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TI1$g$b */
        /* loaded from: classes3.dex */
        public static final class C7763b extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ TI1 f35209g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7763b(TI1 ti1) {
                super(1);
                this.f35209g = ti1;
            }

            /* renamed from: a */
            public final void m83913a(DialogResponse dialogResponse) {
                WireBird wireBird = this.f35209g.f35199i;
                if (wireBird != null) {
                    this.f35209g.f35191a.mo55708A(new ItemLeaseExemption(wireBird, ItemLeaseType.HELMET, ItemLeaseExemptionType.MISSING_HELMET, null, 8, null));
                }
                this.f35209g.f35195e.mo37050b1(-1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m83913a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        public C7761g() {
            super(1);
        }

        /* renamed from: c */
        public static final void m83915c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TI1.this.m83923z("report_missing");
            if (TI1.this.m83938k()) {
                AbstractC23442F<DialogResponse> birdDialog = TI1.this.f35193c.birdDialog(PJ2.f28255d, false, false);
                final C7762a c7762a = new C7762a(TI1.this);
                return birdDialog.m33101w(new InterfaceC23484g() { // from class: WI1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        TI1.C7761g.invoke$lambda$0(Function1.this, obj);
                    }
                });
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(DialogResponse.OTHER);
            final C7763b c7763b = new C7763b(TI1.this);
            return m33158H.m33101w(new InterfaceC23484g() { // from class: XI1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TI1.C7761g.m83915c(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TI1$h */
    /* loaded from: classes3.dex */
    public static final class C7764h extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C7764h f35210g = new C7764h();

        public C7764h() {
            super(1);
        }

        /* renamed from: a */
        public final void m83912a(DialogResponse dialogResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m83912a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TI1$i */
    /* loaded from: classes3.dex */
    public static final class C7765i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C7765i f35211g = new C7765i();

        public C7765i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling have own helmet button click", new Object[0]);
        }
    }

    public TI1(InterfaceC34441Mc2 itemLeaseManager, InterfaceC46193oI5 smartlockManager, YI1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f35191a = itemLeaseManager;
        this.f35192b = smartlockManager;
        this.f35193c = ui;
        this.f35194d = scopeProvider;
        this.f35195e = navigator;
        this.f35196f = appPreference;
        this.f35197g = reactiveConfig;
        this.f35198h = analyticsManager;
        this.f35199i = wireBird;
    }

    /* renamed from: r */
    public static final void m83931r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m83930s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m83929t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m83928u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m83927v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m83926w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m83925x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m83924y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public final void m83940i() {
        int i;
        int i2;
        WirePhysicalLock wirePhysicalLock;
        List<WirePhysicalLockTutorialStep> tutorialSteps;
        Object lastOrNull;
        List<WirePhysicalLock> physicalLocks;
        Object obj;
        boolean z;
        String m83934o = m83934o();
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        if (m83934o != null) {
            sb.append(this.f35193c.getString(C45871nl4.rent_a_helmet_fee_description, m83934o));
        }
        String m98489d = C34026Ki1.m98489d(this.f35197g, this.f35199i);
        if (m98489d != null) {
            StringsKt__StringBuilderKt.append(sb, " ", this.f35193c.getString(C45871nl4.rent_a_helmet_fine_description, m98489d));
        }
        String m83933p = m83933p();
        if (m83933p != null) {
            StringsKt__StringBuilderKt.append(sb, " ", this.f35193c.getString(C45871nl4.rent_a_helmet_return_refund_description, m83933p));
        }
        this.f35193c.m75275Sl(sb.toString());
        this.f35193c.m75269Yl(m83938k());
        YI1 yi1 = this.f35193c;
        if (m83938k()) {
            i = C45871nl4.i_have_my_own_helmet;
        } else {
            i = C45871nl4.rate_app_no;
        }
        yi1.m75274Tl(i);
        this.f35193c.m75270Xl(!m83939j());
        if (m83934o != null) {
            i2 = C45871nl4.rent_helmet_with_cost_button_title;
        } else {
            i2 = C45871nl4.rent_helmet_without_cost_button_title;
        }
        YI1 yi12 = this.f35193c;
        Object[] objArr = new Object[1];
        if (m83934o == null) {
            m83934o = "";
        }
        objArr[0] = m83934o;
        yi12.m75271Wl(yi12.getString(i2, objArr));
        WireBird wireBird = this.f35199i;
        String str = null;
        if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
            Iterator<T> it = physicalLocks.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((WirePhysicalLock) obj).getPurpose() == PhysicalLockPurpose.HELMET) {
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
            wirePhysicalLock = (WirePhysicalLock) obj;
        } else {
            wirePhysicalLock = null;
        }
        if (wirePhysicalLock != null && (tutorialSteps = wirePhysicalLock.getTutorialSteps()) != null) {
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) tutorialSteps);
            WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep = (WirePhysicalLockTutorialStep) lastOrNull;
            if (wirePhysicalLockTutorialStep != null) {
                str = wirePhysicalLockTutorialStep.getImageUrl();
            }
        }
        if (str != null) {
            this.f35193c.m75273Ul(str);
            return;
        }
        if (wirePhysicalLock != null && wirePhysicalLock.isBrainLock()) {
            z2 = true;
        }
        if (z2) {
            this.f35193c.m75272Vl(C48193rg4.ic_hero_helmet_in_basket2);
        }
    }

    /* renamed from: j */
    public final boolean m83939j() {
        return Intrinsics.areEqual(C36441Uq4.m80769c(this.f35197g, this.f35199i).getComplianceConfig().getHelmetLeaseRequiredIfAvailable(), Boolean.TRUE);
    }

    /* renamed from: k */
    public final boolean m83938k() {
        return C36441Uq4.m80769c(this.f35197g, this.f35199i).getComplianceConfig().getHelmetRequiredForRide();
    }

    /* renamed from: l */
    public final void m83937l(int i, int i2, Intent intent) {
        if (i == 1284) {
            C41318g46.m40163a("Returned from HelmetLeaseUnlockTutorialScreen, with resultCode " + i2, new Object[0]);
            if (i2 == -1) {
                this.f35195e.mo37050b1(-1);
            }
        }
    }

    /* renamed from: m */
    public final void m83936m() {
    }

    /* renamed from: n */
    public final void m83935n() {
        String str;
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f35197g, this.f35199i).getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f35198h;
        WireBird wireBird = this.f35199i;
        if (wireBird != null) {
            str = wireBird.getId();
        } else {
            str = null;
        }
        interfaceC1880Ea.mo55905y(new JI1(null, null, null, str, m83938k(), C36441Uq4.m80769c(this.f35197g, this.f35199i).getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
        m83940i();
        m83932q();
    }

    /* renamed from: o */
    public final String m83934o() {
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f35197g, this.f35199i).getLeaseConfig().getLeaseTypes().getHelmet();
        if (helmet.getInitialChargeAmount() < 1) {
            return null;
        }
        return C51916xx1.f118396a.m4408d(helmet.getInitialChargeAmount(), C45097mS5.m25591o(C36441Uq4.m80769c(this.f35197g, this.f35199i).getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
    }

    /* renamed from: p */
    public final String m83933p() {
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f35197g, this.f35199i).getLeaseConfig().getLeaseTypes().getHelmet();
        if (helmet.getReturnRefundAmount() < 1) {
            return null;
        }
        return C51916xx1.f118396a.m4408d(helmet.getReturnRefundAmount(), C45097mS5.m25591o(C36441Uq4.m80769c(this.f35197g, this.f35199i).getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
    }

    /* renamed from: q */
    public final void m83932q() {
        Object m33094as = this.f35193c.m75277Ql().m33094as(AutoDispose.m45239a(this.f35194d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7754b c7754b = new C7754b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: LI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TI1.m83926w(Function1.this, obj);
            }
        };
        final C7755c c7755c = C7755c.f35201g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: MI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TI1.m83925x(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f35193c.m75278Pl().m33094as(AutoDispose.m45239a(this.f35194d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7756d c7756d = new C7756d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: NI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TI1.m83924y(Function1.this, obj);
            }
        };
        final C7757e c7757e = C7757e.f35203g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: OI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TI1.m83931r(Function1.this, obj);
            }
        });
        Observable<Unit> m75276Rl = this.f35193c.m75276Rl();
        final C7758f c7758f = new C7758f();
        Observable observeOn = m75276Rl.flatMapSingle(new InterfaceC23492o() { // from class: PI1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m83930s;
                m83930s = TI1.m83930s(Function1.this, obj);
                return m83930s;
            }
        }).observeOn(C23454a.m33087a());
        final C7761g c7761g = new C7761g();
        Observable flatMapSingle = observeOn.flatMapSingle(new InterfaceC23492o() { // from class: QI1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m83929t;
                m83929t = TI1.m83929t(Function1.this, obj);
                return m83929t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "private fun setupClickLi…tton click\")\n      })\n  }");
        Object m33094as3 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f35194d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7764h c7764h = C7764h.f35210g;
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: RI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TI1.m83928u(Function1.this, obj);
            }
        };
        final C7765i c7765i = C7765i.f35211g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: SI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TI1.m83927v(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public final void m83923z(String str) {
        String str2;
        LeaseTypeConfig helmet = C36441Uq4.m80769c(this.f35197g, this.f35199i).getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f35198h;
        WireBird wireBird = this.f35199i;
        if (wireBird != null) {
            str2 = wireBird.getId();
        } else {
            str2 = null;
        }
        interfaceC1880Ea.mo55905y(new II1(null, null, null, str, str2, m83938k(), C36441Uq4.m80769c(this.f35197g, this.f35199i).getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), 7, null));
    }
}
