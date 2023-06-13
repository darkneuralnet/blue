package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import co.bird.android.model.AuthenticationException;
import co.bird.android.model.LoginException;
import co.bird.android.model.NotLoggedInException;
import co.bird.android.model.UpdateRequestException;
import co.bird.android.model.UpdateRequiredException;
import co.bird.android.model.User;
import co.bird.android.model.UserSuspendedException;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\bB1\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR.\u0010\"\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001e0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010!¨\u0006%"}, m28432d2 = {"Lmy2;", "Liy2;", "", "skipAuthTokenRefresh", "Lio/reactivex/F;", "Lco/bird/android/model/User;", "b", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lhq;", "Lhq;", "authTokenManager", "Lpv0;", "c", "Lpv0;", "configManager", "Llh6;", DateTokenConverter.CONVERTER_KEY, "Llh6;", "userManager", "LRh6;", "e", "LRh6;", "userStream", "f", "()Z", "isLoggedIn", "Lio/reactivex/functions/o;", "Lio/reactivex/k;", "", "", "()Lio/reactivex/functions/o;", "retryWhen", "<init>", "(Landroid/content/Context;Lhq;Lpv0;Llh6;LRh6;)V", "login_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: my2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45406my2 implements InterfaceC43034iy2 {

    /* renamed from: f */
    public static final C26324a f99149f = new C26324a(null);

    /* renamed from: g */
    public static final Class<? extends LoginException>[] f99150g = {LoginException.class, NotLoggedInException.class, UpdateRequiredException.class, UpdateRequestException.class, UserSuspendedException.class, AuthenticationException.class};

    /* renamed from: a */
    public final Context f99151a;

    /* renamed from: b */
    public final InterfaceC22767hq f99152b;

    /* renamed from: c */
    public final InterfaceC47153pv0 f99153c;

    /* renamed from: d */
    public final InterfaceC44647lh6 f99154d;

    /* renamed from: e */
    public final InterfaceC35660Rh6 f99155e;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"Lmy2$a;", "", "", "Ljava/lang/Class;", "Lco/bird/android/model/LoginException;", "LOGIN_EXCEPTIONS", "[Ljava/lang/Class;", "", "RETRY_WHEN_INITIAL_DELAY_MS", "J", "RETRY_WHEN_MAX_DELAY_MS", "<init>", "()V", "login_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: my2$a */
    /* loaded from: classes4.dex */
    public static final class C26324a {
        public /* synthetic */ C26324a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26324a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: my2$b */
    /* loaded from: classes4.dex */
    public static final class C26325b extends Lambda implements Function1<Pair<? extends Config, ? extends User>, Unit> {
        public C26325b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Config, ? extends User> pair) {
            invoke2((Pair<Config, User>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Config, User> pair) {
            boolean m22046b;
            User component2 = pair.component2();
            m22046b = C45999ny2.m22046b(component2, C45406my2.this.f99151a, pair.component1());
            if (!m22046b) {
                if (component2.getSuspendedAt() != null) {
                    throw new UserSuspendedException();
                }
                return;
            }
            throw new UpdateRequiredException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/User;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: my2$c */
    /* loaded from: classes4.dex */
    public static final class C26326c extends Lambda implements Function1<Pair<? extends Config, ? extends User>, InterfaceC23447K<? extends User>> {

        /* renamed from: g */
        public static final C26326c f99157g = new C26326c();

        public C26326c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends User> invoke(Pair<Config, User> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            User component2 = pair.component2();
            if (pair.component1().getIdentificationConfig().getEnableIdentificationService()) {
                return AbstractC23442F.m33158H(component2);
            }
            return AbstractC23442F.m33158H(component2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: my2$d */
    /* loaded from: classes4.dex */
    public static final class C26327d extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends User>> {

        /* renamed from: g */
        public static final C26327d f99158g = new C26327d();

        public C26327d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends User> invoke(Throwable throwable) {
            boolean m22047a;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            m22047a = C45999ny2.m22047a(throwable);
            if (m22047a) {
                return AbstractC23442F.m33100x(new AuthenticationException());
            }
            return AbstractC23442F.m33100x(throwable);
        }
    }

    public C45406my2(Context context, InterfaceC22767hq authTokenManager, InterfaceC47153pv0 configManager, InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f99151a = context;
        this.f99152b = authTokenManager;
        this.f99153c = configManager;
        this.f99154d = userManager;
        this.f99155e = userStream;
    }

    /* renamed from: g */
    public static final void m24616g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final InterfaceC23447K m24615h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final InterfaceC23447K m24614i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC43034iy2
    /* renamed from: a */
    public InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<Object>> mo24622a() {
        Class<? extends LoginException>[] clsArr = f99150g;
        InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<Object>> m85585a = SN4.m85594j((Class[]) Arrays.copyOf(clsArr, clsArr.length)).m85583c(500L, AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS, 2.0d).m85585a();
        Intrinsics.checkNotNullExpressionValue(m85585a, "failWhenInstanceOf(*LOGI…DS, 2.0)\n        .build()");
        return m85585a;
    }

    @Override // p000.InterfaceC43034iy2
    /* renamed from: b */
    public AbstractC23442F<User> mo24621b(boolean z) {
        AbstractC23461c mo15258i;
        if (!m24617f()) {
            AbstractC23442F<User> m33100x = AbstractC23442F.m33100x(new NotLoggedInException(null, 1, null));
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotLoggedInException())");
            return m33100x;
        }
        if (z) {
            mo15258i = AbstractC23461c.m33039p();
        } else {
            mo15258i = this.f99152b.mo15258i();
        }
        AbstractC23442F m33042m = mo15258i.m33063X(C24542a.m31932c()).m33042m(C24523e.f91168a.m31954c(this.f99153c.mo2277l0(null), this.f99154d.mo26963n1()).firstOrError());
        final C26325b c26325b = new C26325b();
        AbstractC23442F m33101w = m33042m.m33101w(new InterfaceC23484g() { // from class: jy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45406my2.m24616g(Function1.this, obj);
            }
        });
        final C26326c c26326c = C26326c.f99157g;
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: ky2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24615h;
                m24615h = C45406my2.m24615h(Function1.this, obj);
                return m24615h;
            }
        });
        final C26327d c26327d = C26327d.f99158g;
        AbstractC23442F<User> m33150P = m33165A.m33150P(new InterfaceC23492o() { // from class: ly2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24614i;
                m24614i = C45406my2.m24614i(Function1.this, obj);
                return m24614i;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "override fun verifyLogin…le)\n        }\n      }\n  }");
        return m33150P;
    }

    /* renamed from: f */
    public boolean m24617f() {
        return this.f99152b.mo15257j();
    }
}
