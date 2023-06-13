package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C36519Uz1;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR5\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \r*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f0\f0\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LUz1;", "LQz1;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "view", "", "g", "(Lco/bird/android/model/wire/WireFrequentFlyerView;)V", "LPz1;", C17296a.f69688o, "LPz1;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LZ84;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "getData", "()LZ84;", MessageExtension.FIELD_DATA, "La94;", "c", "La94;", "mutableData", "LRh6;", "userStream", "LTq4;", "config", "<init>", "(LPz1;LRh6;LTq4;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFrequentFlyerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerManagerImpl.kt\nco/bird/android/manager/ride/FrequentFlyerManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,62:1\n180#2:63\n180#2:64\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerManagerImpl.kt\nco/bird/android/manager/ride/FrequentFlyerManagerImpl\n*L\n46#1:63\n51#1:64\n*E\n"})
/* renamed from: Uz1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36519Uz1 implements InterfaceC35583Qz1 {

    /* renamed from: a */
    public final InterfaceC35349Pz1 f38395a;

    /* renamed from: b */
    public final Lazy f38396b;

    /* renamed from: c */
    public final C37791a94<Optional<WireFrequentFlyerView>> f38397c;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Uz1$a */
    /* loaded from: classes4.dex */
    public static final class C8527a extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C8527a f38398g = new C8527a();

        public C8527a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getFrequentFlyer().getEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "frequentFlyerEnabled", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uz1$b */
    /* loaded from: classes4.dex */
    public static final class C8528b extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Optional<WireFrequentFlyerView>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC35660Rh6 f38399g;

        /* renamed from: h */
        public final /* synthetic */ C36519Uz1 f38400h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/u;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/User;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Uz1$b$a */
        /* loaded from: classes4.dex */
        public static final class C8529a extends Lambda implements Function1<User, InterfaceC24574u<? extends Optional<WireFrequentFlyerView>>> {

            /* renamed from: g */
            public final /* synthetic */ C36519Uz1 f38401g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFrequentFlyerView;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireFrequentFlyerView;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Uz1$b$a$a */
            /* loaded from: classes4.dex */
            public static final class C8530a extends Lambda implements Function1<WireFrequentFlyerView, Optional<WireFrequentFlyerView>> {

                /* renamed from: g */
                public static final C8530a f38402g = new C8530a();

                public C8530a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Optional<WireFrequentFlyerView> invoke(WireFrequentFlyerView it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional.f63040c.m59032c(it);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8529a(C36519Uz1 c36519Uz1) {
                super(1);
                this.f38401g = c36519Uz1;
            }

            /* renamed from: c */
            public static final Optional m80508c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Optional) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends Optional<WireFrequentFlyerView>> invoke(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC24507p m32065J = C37279Yf5.m74559e0(this.f38401g.f38395a.m89194a(), 3, 1).m32065J();
                final C8530a c8530a = C8530a.f38402g;
                return m32065J.m32067H(new InterfaceC23492o() { // from class: Wz1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m80508c;
                        m80508c = C36519Uz1.C8528b.C8529a.m80508c(Function1.this, obj);
                        return m80508c;
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8528b(InterfaceC35660Rh6 interfaceC35660Rh6, C36519Uz1 c36519Uz1) {
            super(1);
            this.f38399g = interfaceC35660Rh6;
            this.f38400h = c36519Uz1;
        }

        /* renamed from: b */
        public static final InterfaceC24574u m80511b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Optional<WireFrequentFlyerView>> invoke(Boolean frequentFlyerEnabled) {
            Intrinsics.checkNotNullParameter(frequentFlyerEnabled, "frequentFlyerEnabled");
            if (frequentFlyerEnabled.booleanValue()) {
                Observable<User> mo76579f = this.f38399g.mo76579f();
                final C8529a c8529a = new C8529a(this.f38400h);
                return mo76579f.switchMapMaybe(new InterfaceC23492o() { // from class: Vz1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m80511b;
                        m80511b = C36519Uz1.C8528b.m80511b(Function1.this, obj);
                        return m80511b;
                    }
                });
            }
            return Observable.just(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uz1$c */
    /* loaded from: classes4.dex */
    public static final class C8531c extends Lambda implements Function1<User, Unit> {
        public C8531c() {
            super(1);
        }

        /* renamed from: a */
        public final void m80506a(User user) {
            C36519Uz1.this.f38397c.m71836j();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m80506a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uz1$d */
    /* loaded from: classes4.dex */
    public static final class C8532d extends Lambda implements Function0<Z84<Optional<WireFrequentFlyerView>>> {
        public C8532d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireFrequentFlyerView>> invoke() {
            return Z84.f47888d.m73663b(C36519Uz1.this.f38397c);
        }
    }

    public C36519Uz1(InterfaceC35349Pz1 client, InterfaceC35660Rh6 userStream, C36207Tq4 config) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f38395a = client;
        lazy = LazyKt__LazyJVMKt.lazy(new C8532d());
        this.f38396b = lazy;
        C37791a94<Optional<WireFrequentFlyerView>> createNonRedundant$default = C37791a94.C10586a.createNonRedundant$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        this.f38397c = createNonRedundant$default;
        Z84<Config> m82623f8 = config.m82623f8();
        final C8527a c8527a = C8527a.f38398g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: Rz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m80516d;
                m80516d = C36519Uz1.m80516d(Function1.this, obj);
                return m80516d;
            }
        }).distinctUntilChanged();
        final C8528b c8528b = new C8528b(userStream, this);
        Observable switchMap = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: Sz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m80515e;
                m80515e = C36519Uz1.m80515e(Function1.this, obj);
                return m80515e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "config.config.map { it.f…sent())\n        }\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(createNonRedundant$default);
        Observable<User> mo76576i = userStream.mo76576i();
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8531c c8531c = new C8531c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Tz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36519Uz1.m80514f(Function1.this, obj);
            }
        });
    }

    /* renamed from: d */
    public static final Boolean m80516d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final InterfaceC23434B m80515e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m80514f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public final void m80513g(WireFrequentFlyerView wireFrequentFlyerView) {
        this.f38397c.accept(Optional.f63040c.m59033b(wireFrequentFlyerView));
    }

    @Override // p000.InterfaceC35583Qz1
    public Z84<Optional<WireFrequentFlyerView>> getData() {
        return (Z84) this.f38396b.getValue();
    }
}
