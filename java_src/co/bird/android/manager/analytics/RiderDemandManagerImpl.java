package co.bird.android.manager.analytics;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.manager.analytics.RiderDemandManagerImpl;
import co.bird.android.model.Balance;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.configs.LocalConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Address;
import com.stripe.android.model.Card;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001\tBc\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\b\b\u0001\u0010-\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, m28432d2 = {"Lco/bird/android/manager/analytics/RiderDemandManagerImpl;", "LZ85;", "LVX0;", "", DateTokenConverter.CONVERTER_KEY, "", Stripe3ds2AuthParams.FIELD_SOURCE, "b", "", C17296a.f69688o, "LLifecycleOwner;", "owner", "onStart", "Lgl;", "Lgl;", "preference", "LYR4;", "c", "LYR4;", "rideManager", "LEa;", "LEa;", "analyticsManager", "LTq4;", "e", "LTq4;", "reactiveConfig", "Llh6;", "f", "Llh6;", "userManager", "LRh6;", "g", "LRh6;", "userStream", "Lq54;", "h", "Lq54;", "privateBirdsManager", "Lbn;", "i", "Lbn;", "areaManager", "j", "LLifecycleOwner;", "processLifecycleOwner", "LAM3;", "k", "LAM3;", "paymentManagerV2", "Ldr4;", "l", "Ldr4;", "reactiveLocationManager", "m", "Z", "applicationLaunched", "<init>", "(Lgl;LYR4;LEa;LTq4;Llh6;LRh6;Lq54;Lbn;LLifecycleOwner;LAM3;Ldr4;)V", "n", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderDemandManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,177:1\n199#2:178\n237#2:180\n237#2:182\n44#3:179\n44#3:181\n*S KotlinDebug\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl\n*L\n70#1:178\n136#1:180\n173#1:182\n136#1:179\n173#1:181\n*E\n"})
/* loaded from: classes4.dex */
public final class RiderDemandManagerImpl implements Z85, VX0 {

    /* renamed from: n */
    public static final C16082a f66203n = new C16082a(null);

    /* renamed from: b */
    public final C22454gl f66204b;

    /* renamed from: c */
    public final YR4 f66205c;

    /* renamed from: d */
    public final InterfaceC1880Ea f66206d;

    /* renamed from: e */
    public final C36207Tq4 f66207e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f66208f;

    /* renamed from: g */
    public final InterfaceC35660Rh6 f66209g;

    /* renamed from: h */
    public final InterfaceC47256q54 f66210h;

    /* renamed from: i */
    public final InterfaceC12495bn f66211i;

    /* renamed from: j */
    public final LifecycleOwner f66212j;

    /* renamed from: k */
    public final AM3 f66213k;

    /* renamed from: l */
    public final InterfaceC40001dr4 f66214l;

    /* renamed from: m */
    public boolean f66215m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/manager/analytics/RiderDemandManagerImpl$a;", "", "", "DELAY_AFTER_FOREGROUND_SECONDS", "J", "<init>", "()V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$a */
    /* loaded from: classes4.dex */
    public static final class C16082a {
        public /* synthetic */ C16082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16082a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lorg/joda/time/DateTime;", "appForegroundTime", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lorg/joda/time/DateTime;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$b */
    /* loaded from: classes4.dex */
    public static final class C16083b extends Lambda implements Function1<DateTime, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "optional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$b$a */
        /* loaded from: classes4.dex */
        public static final class C16084a extends Lambda implements Function1<Optional<DateTime>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ DateTime f66217g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16084a(DateTime dateTime) {
                super(1);
                this.f66217g = dateTime;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<DateTime> optional) {
                Intrinsics.checkNotNullParameter(optional, "optional");
                DateTime m59035e = optional.m59035e();
                boolean z = false;
                if (m59035e != null && m59035e.isAfter(this.f66217g.toInstant())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$b$b */
        /* loaded from: classes4.dex */
        public static final class C16085b extends Lambda implements Function1<Optional<DateTime>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ RiderDemandManagerImpl f66218g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$b$b$a */
            /* loaded from: classes4.dex */
            public static final class C16086a extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public static final C16086a f66219g = new C16086a();

                public C16086a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    C41318g46.m40161c(th, "Error while attempting to start session...", new Object[0]);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16085b(RiderDemandManagerImpl riderDemandManagerImpl) {
                super(1);
                this.f66218g = riderDemandManagerImpl;
            }

            /* renamed from: d */
            public static final void m55873d(Optional it) {
                Intrinsics.checkNotNullParameter(it, "$it");
                Object m59035e = it.m59035e();
                C41318g46.m40163a("Called user/start-session on app foreground after receiving location update: " + m59035e, new Object[0]);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23496h invoke(final Optional<DateTime> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC23461c m33065U = this.f66218g.f66208f.mo26964n().m33065U(1L);
                final C16086a c16086a = C16086a.f66219g;
                return m33065U.m33084B(new InterfaceC23484g() { // from class: g95
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        RiderDemandManagerImpl.C16083b.C16085b.invoke$lambda$0(Function1.this, obj);
                    }
                }).m33029z(new InterfaceC23478a() { // from class: h95
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        RiderDemandManagerImpl.C16083b.C16085b.m55873d(Optional.this);
                    }
                }).m33069Q();
            }
        }

        public C16083b() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(DateTime appForegroundTime) {
            Intrinsics.checkNotNullParameter(appForegroundTime, "appForegroundTime");
            Z84<Optional<DateTime>> mo43612t = RiderDemandManagerImpl.this.f66214l.mo43612t();
            final C16084a c16084a = new C16084a(appForegroundTime);
            AbstractC24507p<Optional<DateTime>> firstElement = mo43612t.filter(new InterfaceC23494q() { // from class: e95
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = RiderDemandManagerImpl.C16083b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).firstElement();
            final C16085b c16085b = new C16085b(RiderDemandManagerImpl.this);
            return firstElement.m32074A(new InterfaceC23492o() { // from class: f95
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = RiderDemandManagerImpl.C16083b.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$c */
    /* loaded from: classes4.dex */
    public static final class C16087c extends Lambda implements Function2<Optional<BirdPayment>, Optional<BirdPayment>, Boolean> {

        /* renamed from: g */
        public static final C16087c f66220g = new C16087c();

        public C16087c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<BirdPayment> t1, Optional<BirdPayment> t2) {
            String str;
            PaymentMethod stripePaymentMethod;
            PaymentMethod stripePaymentMethod2;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            BirdPayment m59035e = t1.m59035e();
            String str2 = null;
            if (m59035e != null && (stripePaymentMethod2 = m59035e.getStripePaymentMethod()) != null) {
                str = stripePaymentMethod2.f75358id;
            } else {
                str = null;
            }
            BirdPayment m59035e2 = t2.m59035e();
            if (m59035e2 != null && (stripePaymentMethod = m59035e2.getStripePaymentMethod()) != null) {
                str2 = stripePaymentMethod.f75358id;
            }
            return Boolean.valueOf(Intrinsics.areEqual(str, str2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "optional", "Lkotlin/Pair;", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderDemandManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl$onStart$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
    /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$d */
    /* loaded from: classes4.dex */
    public static final class C16088d extends Lambda implements Function1<Optional<BirdPayment>, Pair<? extends String, ? extends String>> {

        /* renamed from: g */
        public static final C16088d f66221g = new C16088d();

        public C16088d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<String, String> invoke(Optional<BirdPayment> optional) {
            String str;
            String str2;
            PaymentMethod.Card card;
            PaymentMethod.BillingDetails billingDetails;
            Address address;
            PaymentMethod.BillingDetails billingDetails2;
            Address address2;
            boolean z = false;
            C41318g46.m40163a("checking to see if payment method should trigger home update location = " + optional.m59035e(), new Object[0]);
            BirdPayment m59035e = optional.m59035e();
            if (m59035e == null) {
                return null;
            }
            PaymentMethod stripePaymentMethod = m59035e.getStripePaymentMethod();
            if (stripePaymentMethod == null || (billingDetails2 = stripePaymentMethod.billingDetails) == null || (address2 = billingDetails2.address) == null || (str = address2.getPostalCode()) == null) {
                Card stripeCard = m59035e.getStripeCard();
                if (stripeCard != null) {
                    str = stripeCard.getAddressZip();
                } else {
                    str = null;
                }
            }
            PaymentMethod stripePaymentMethod2 = m59035e.getStripePaymentMethod();
            if (stripePaymentMethod2 == null || (billingDetails = stripePaymentMethod2.billingDetails) == null || (address = billingDetails.address) == null || (str2 = address.getCountry()) == null) {
                Card stripeCard2 = m59035e.getStripeCard();
                if (stripeCard2 != null) {
                    str2 = stripeCard2.getCountry();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    PaymentMethod stripePaymentMethod3 = m59035e.getStripePaymentMethod();
                    if (stripePaymentMethod3 != null && (card = stripePaymentMethod3.card) != null) {
                        str2 = card.country;
                    } else {
                        str2 = null;
                    }
                }
            }
            Pair<String, String> m28425to = TuplesKt.m28425to(str, str2);
            if (m28425to == null) {
                return null;
            }
            String component1 = m28425to.component1();
            String component2 = m28425to.component2();
            if (component1 != null && component2 != null) {
                z = true;
            }
            if (!z) {
                return null;
            }
            return m28425to;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderDemandManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl$trackRiderDemand$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1747#2,3:178\n1747#2,3:181\n1747#2,3:184\n1747#2,3:187\n1747#2,3:190\n*S KotlinDebug\n*F\n+ 1 RiderDemandManagerImpl.kt\nco/bird/android/manager/analytics/RiderDemandManagerImpl$trackRiderDemand$1\n*L\n94#1:178,3\n95#1:181,3\n96#1:184,3\n97#1:187,3\n98#1:190,3\n*E\n"})
    /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$f */
    /* loaded from: classes4.dex */
    public static final class C16091f extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f66225h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16091f(String str) {
            super(1);
            this.f66225h = str;
        }

        /* renamed from: a */
        public final void m55867a(Long l) {
            Boolean bool;
            User m37750B0;
            Long l2;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            Boolean bool8;
            Boolean bool9;
            Boolean bool10;
            Boolean bool11;
            Boolean bool12;
            Boolean bool13;
            Boolean bool14;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = true;
            boolean z6 = !RiderDemandManagerImpl.this.f66211i.mo64001e().getValue().isEmpty();
            List<Area> value = RiderDemandManagerImpl.this.f66211i.mo64001e().getValue();
            boolean m59037c = RiderDemandManagerImpl.this.f66210h.mo18213a().getValue().m59037c();
            User m37750B02 = RiderDemandManagerImpl.this.f66204b.m37750B0();
            Optional<Balance> value2 = RiderDemandManagerImpl.this.f66208f.mo26977K().getValue();
            InterfaceC1880Ea interfaceC1880Ea = RiderDemandManagerImpl.this.f66206d;
            boolean mo76578g = RiderDemandManagerImpl.this.f66209g.mo76578g();
            Boolean bool15 = null;
            if (m37750B02 != null) {
                bool = Boolean.valueOf(UserKt.isInRegistration(m37750B02));
            } else {
                bool = null;
            }
            boolean m36358a = C42149hU4.m36358a(RiderDemandManagerImpl.this.f66205c.mo75057R().getValue());
            if (RiderDemandManagerImpl.this.f66204b.m37750B0() != null) {
                l2 = Long.valueOf(m37750B0.getRideCount());
            } else {
                l2 = null;
            }
            LocalConfig localConfig = RiderDemandManagerImpl.this.f66207e.m82623f8().m73665a().getLocalConfig();
            if (localConfig != null) {
                bool2 = Boolean.valueOf(localConfig.getWeatherAlert());
            } else {
                bool2 = null;
            }
            if (m37750B02 != null) {
                bool3 = Boolean.valueOf(UserKt.isCharger(m37750B02));
            } else {
                bool3 = null;
            }
            if (m37750B02 != null) {
                bool4 = Boolean.valueOf(UserKt.isOperator(m37750B02));
            } else {
                bool4 = null;
            }
            if (m37750B02 != null) {
                bool5 = Boolean.valueOf(m37750B02.getTester());
            } else {
                bool5 = null;
            }
            if (m37750B02 != null) {
                bool6 = Boolean.valueOf(m37750B02.getAdmin());
            } else {
                bool6 = null;
            }
            if (m59037c) {
                bool7 = Boolean.valueOf(RiderDemandManagerImpl.this.f66210h.mo18197q());
            } else {
                bool7 = null;
            }
            if (m59037c) {
                bool8 = Boolean.valueOf(RiderDemandManagerImpl.this.f66210h.mo18199o());
            } else {
                bool8 = null;
            }
            if (m37750B02 != null) {
                bool9 = Boolean.valueOf(UserKt.isAdminDomain(m37750B02));
            } else {
                bool9 = null;
            }
            Balance m59035e = value2.m59035e();
            if (m59035e != null) {
                bool10 = m59035e.getAutoPayActive();
            } else {
                bool10 = null;
            }
            if (z6) {
                List<Area> list = value;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Area area : list) {
                        if (area.getNoRides()) {
                            z4 = true;
                            break;
                        }
                    }
                }
                z4 = false;
                bool11 = Boolean.valueOf(z4);
            } else {
                bool11 = null;
            }
            if (z6) {
                List<Area> list2 = value;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (Area area2 : list2) {
                        if (area2.getNoParking()) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                bool12 = Boolean.valueOf(z3);
            } else {
                bool12 = null;
            }
            if (z6) {
                List<Area> list3 = value;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (Area area3 : list3) {
                        if (area3.getPreferredParking()) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                bool13 = Boolean.valueOf(z2);
            } else {
                bool13 = null;
            }
            if (z6) {
                List<Area> list4 = value;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    for (Area area4 : list4) {
                        if (C23356io.m33476f(area4)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                bool14 = Boolean.valueOf(z);
            } else {
                bool14 = null;
            }
            if (z6) {
                List<Area> list5 = value;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    for (Area area5 : list5) {
                        if (area5.getOperational()) {
                            break;
                        }
                    }
                }
                z5 = false;
                bool15 = Boolean.valueOf(z5);
            }
            Boolean valueOf = Boolean.valueOf(mo76578g);
            Boolean valueOf2 = Boolean.valueOf(m36358a);
            Boolean bool16 = Boolean.FALSE;
            interfaceC1880Ea.mo55905y(new Y85(null, null, null, valueOf, bool, valueOf2, null, bool2, bool3, bool16, bool4, bool16, bool5, bool6, bool7, bool8, bool9, bool10, l2, bool11, bool12, bool13, bool14, bool15, this.f66225h, 71, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m55867a(l);
            return Unit.INSTANCE;
        }
    }

    public RiderDemandManagerImpl(C22454gl preference, YR4 rideManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream, InterfaceC47256q54 privateBirdsManager, InterfaceC12495bn areaManager, LifecycleOwner processLifecycleOwner, AM3 paymentManagerV2, InterfaceC40001dr4 reactiveLocationManager) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        this.f66204b = preference;
        this.f66205c = rideManager;
        this.f66206d = analyticsManager;
        this.f66207e = reactiveConfig;
        this.f66208f = userManager;
        this.f66209g = userStream;
        this.f66210h = privateBirdsManager;
        this.f66211i = areaManager;
        this.f66212j = processLifecycleOwner;
        this.f66213k = paymentManagerV2;
        this.f66214l = reactiveLocationManager;
    }

    /* renamed from: l */
    public static final InterfaceC23496h m55884l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final boolean m55883n(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: o */
    public static final InterfaceC23496h m55882o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m55881p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.Z85
    /* renamed from: a */
    public boolean mo55891a() {
        return this.f66205c.mo75061N();
    }

    @Override // p000.Z85
    /* renamed from: b */
    public void mo55890b(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23442F<Long> m33133f0 = AbstractC23442F.m33133f0(5L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(m33133f0, "timer(DELAY_AFTER_FOREGR…ECONDS, TimeUnit.SECONDS)");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33135e = m33133f0.m33135e(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16091f c16091f = new C16091f(source);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: a95
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RiderDemandManagerImpl.m55881p(Function1.this, obj);
            }
        });
    }

    @Override // p000.Z85
    /* renamed from: d */
    public void mo55889d() {
        this.f66212j.getLifecycle().mo67008a(this);
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        if (this.f66204b.m37575s0().getUserRole() == UserRole.RIDER) {
            if (!this.f66215m) {
                mo55890b("app_launch");
                this.f66215m = true;
            } else {
                mo55890b("app_open");
            }
        }
        Observable just = Observable.just(DateTime.now());
        final C16083b c16083b = new C16083b();
        AbstractC23461c flatMapCompletable = just.flatMapCompletable(new InterfaceC23492o() { // from class: b95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m55884l;
                m55884l = RiderDemandManagerImpl.m55884l(Function1.this, obj);
                return m55884l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onStart(own…))\n      .subscribe()\n  }");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Z84<Optional<BirdPayment>> mo85677e = this.f66213k.mo85677e();
        final C16087c c16087c = C16087c.f66220g;
        Observable<Optional<BirdPayment>> distinctUntilChanged = mo85677e.distinctUntilChanged(new InterfaceC23481d() { // from class: c95
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m55883n;
                m55883n = RiderDemandManagerImpl.m55883n(Function2.this, obj, obj2);
                return m55883n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "paymentManagerV2.default…stripePaymentMethod?.id }");
        Observable skip = C37279Yf5.m74575T(distinctUntilChanged, C16088d.f66221g).distinctUntilChanged().skip(1L);
        final C16089e c16089e = new C16089e();
        AbstractC23461c flatMapCompletable2 = skip.flatMapCompletable(new InterfaceC23492o() { // from class: d95
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m55882o;
                m55882o = RiderDemandManagerImpl.m55882o(Function1.this, obj);
                return m55882o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "override fun onStart(own…))\n      .subscribe()\n  }");
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        Object m33041n2 = flatMapCompletable2.m33041n(AutoDispose.m45239a(m45197b2));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$e */
    /* loaded from: classes4.dex */
    public static final class C16089e extends Lambda implements Function1<Pair<? extends String, ? extends String>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.manager.analytics.RiderDemandManagerImpl$e$a */
        /* loaded from: classes4.dex */
        public static final class C16090a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C16090a f66223g = new C16090a();

            public C16090a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while updating user home location: ", new Object[0]);
            }
        }

        public C16089e() {
            super(1);
        }

        /* renamed from: c */
        public static final void m55868c(String str, String str2) {
            C41318g46.m40163a("Updated user home location to " + str + " / " + str2, new Object[0]);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final String component1 = pair.component1();
            final String component2 = pair.component2();
            C41318g46.m40163a("updating user home location now...", new Object[0]);
            AbstractC23461c m33065U = RiderDemandManagerImpl.this.f66208f.mo26956w0("PAYMENTS", component1, component2).m33065U(1L);
            final C16090a c16090a = C16090a.f66223g;
            return m33065U.m33084B(new InterfaceC23484g() { // from class: i95
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    RiderDemandManagerImpl.C16089e.invoke$lambda$0(Function1.this, obj);
                }
            }).m33029z(new InterfaceC23478a() { // from class: j95
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    RiderDemandManagerImpl.C16089e.m55868c(component1, component2);
                }
            }).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends String, ? extends String> pair) {
            return invoke2((Pair<String, String>) pair);
        }
    }
}
