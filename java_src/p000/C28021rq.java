package p000;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.TokenPair;
import co.bird.android.model.TokenPairState;
import co.bird.android.model.User;
import com.auth0.android.jwt.JWT;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Response;
import org.joda.time.DateTime;
import org.json.JSONObject;
import p000.AbstractC2999H1;
import p000.AbstractC5699Np;
import p000.C28021rq;
import p000.C37791a94;
import p000.InterfaceC22767hq;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u00032*?B!\b\u0007\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010;\u001a\u000209¢\u0006\u0004\bN\u0010OJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\f\u0010\u001e\u001a\u00020\u001d*\u00020\u0013H\u0002J\u001a\u0010!\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002J-\u0010'\u001a\u00020\u00052#\u0010&\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00050\"H\u0016J/\u0010)\u001a\u00020\u00052%\u0010\u0004\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\"H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J8\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(-\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b.\u0010/J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u000200H\u0016J\b\u00104\u001a\u000200H\u0016R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010:R'\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0=0<8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010>\u001a\u0004\b?\u0010@R'\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030=0<8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b6\u0010@R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0=0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010DR \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030=0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010DR\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010J¨\u0006P"}, m28432d2 = {"Lrq;", "Lhq;", "Lkotlin/Function0;", "", "update", "", "O", "Lio/reactivex/F;", "LNp;", "z", "Lrq$b;", "authState", "Lrq$d;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "legacyToken", "LH1;", "errorIfNotPresent", "E", "y", "Lcom/auth0/android/jwt/JWT;", "refreshJwt", "H", "LHM4;", "Lco/bird/android/model/TokenPair;", "K", "token", "F", "G", "v", "", "D", "Lco/bird/android/model/TokenPairState;", "newTokenPair", "N", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "lastAuthHeader", "action", "k", "tokenPair", "h", "c", "j", "T", "authHeaderResult", "g", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lio/reactivex/c;", "i", "b", "e", "f", "Lgl;", C17296a.f69688o, "Lgl;", "appPreference", "LLp;", "LLp;", "authClient", "LZ84;", "Lco/bird/android/buava/Optional;", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()LZ84;", "tokenPairState", "legacyAuthToken", "La94;", "La94;", "mutableTokenPairState", "mutableLegacyAuthToken", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Lio/reactivex/F;", "sharedAuthHeaderSingle", "LRh6;", "userStream", "<init>", "(Lgl;LRh6;LLp;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nAuthTokenManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTokenManagerImpl.kt\nco/bird/android/auth/manager/AuthTokenManagerImpl\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n9#2,4:283\n1#3:287\n*S KotlinDebug\n*F\n+ 1 AuthTokenManagerImpl.kt\nco/bird/android/auth/manager/AuthTokenManagerImpl\n*L\n99#1:283,4\n*E\n"})
/* renamed from: rq */
/* loaded from: classes2.dex */
public final class C28021rq implements InterfaceC22767hq {

    /* renamed from: i */
    public static final C28024c f107743i = new C28024c(null);

    /* renamed from: a */
    public final C22454gl f107744a;

    /* renamed from: b */
    public final InterfaceC5093Lp f107745b;

    /* renamed from: c */
    public final Lazy f107746c;

    /* renamed from: d */
    public final Lazy f107747d;

    /* renamed from: e */
    public final C37791a94<Optional<TokenPairState>> f107748e;

    /* renamed from: f */
    public final C37791a94<Optional<String>> f107749f;

    /* renamed from: g */
    public final ReentrantReadWriteLock f107750g;

    /* renamed from: h */
    public final AbstractC23442F<AbstractC5699Np> f107751h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$a */
    /* loaded from: classes2.dex */
    public static final class C28022a extends Lambda implements Function1<User, Unit> {
        public C28022a() {
            super(1);
        }

        /* renamed from: a */
        public final void m15240a(User user) {
            InterfaceC22767hq.C22768a.reset$default(C28021rq.this, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m15240a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lrq$b;", "", "", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "legacyAuthToken", "Lco/bird/android/model/TokenPairState;", "b", "Lco/bird/android/model/TokenPairState;", "()Lco/bird/android/model/TokenPairState;", "tokenPairState", "<init>", "(Ljava/lang/String;Lco/bird/android/model/TokenPairState;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rq$b */
    /* loaded from: classes2.dex */
    public static final class C28023b {

        /* renamed from: a */
        public final String f107753a;

        /* renamed from: b */
        public final TokenPairState f107754b;

        public C28023b(String str, TokenPairState tokenPairState) {
            this.f107753a = str;
            this.f107754b = tokenPairState;
        }

        /* renamed from: a */
        public final String m15239a() {
            return this.f107753a;
        }

        /* renamed from: b */
        public final TokenPairState m15238b() {
            return this.f107754b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lrq$c;", "", "", "ACCESS_TOKEN_LEEWAY_SECONDS", "I", "<init>", "()V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rq$c */
    /* loaded from: classes2.dex */
    public static final class C28024c {
        public /* synthetic */ C28024c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28024c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rq$e */
    /* loaded from: classes2.dex */
    public static final class C28026e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C28026e f107758g = new C28026e();

        public C28026e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/TokenPairState;", "it", C17296a.f69688o, "(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$f */
    /* loaded from: classes2.dex */
    public static final class C28027f extends Lambda implements Function1<TokenPairState, TokenPairState> {

        /* renamed from: g */
        public static final C28027f f107759g = new C28027f();

        public C28027f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TokenPairState invoke(TokenPairState tokenPairState) {
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lrq$b;", "authState", "Lio/reactivex/K;", "LNp;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lrq$b;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$g */
    /* loaded from: classes2.dex */
    public static final class C28028g extends Lambda implements Function1<C28023b, InterfaceC23447K<? extends AbstractC5699Np>> {
        public C28028g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends AbstractC5699Np> invoke(C28023b authState) {
            AbstractC23442F m15242y;
            Intrinsics.checkNotNullParameter(authState, "authState");
            C28025d m15279C = C28021rq.this.m15279C(authState);
            C28021rq c28021rq = C28021rq.this;
            String m15235c = m15279C.m15235c();
            if (m15235c == null || (m15242y = c28021rq.m15242y(m15235c)) == null) {
                JWT m15236b = m15279C.m15236b();
                if (m15236b != null) {
                    return c28021rq.m15274H(m15236b);
                }
                AbstractC23442F m33158H = AbstractC23442F.m33158H(m15279C.m15237a());
                Intrinsics.checkNotNullExpressionValue(m33158H, "just(headerResult)");
                return m33158H;
            }
            return m15242y;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$h */
    /* loaded from: classes2.dex */
    public static final class C28029h extends Lambda implements Function0<Z84<Optional<String>>> {
        public C28029h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<String>> invoke() {
            return Z84.f47888d.m73663b(C28021rq.this.f107749f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "<anonymous parameter 0>", "newToken", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$i */
    /* loaded from: classes2.dex */
    public static final class C28030i extends Lambda implements Function2<Optional<String>, Optional<String>, Optional<String>> {
        public C28030i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Optional<String> invoke(Optional<String> optional, Optional<String> newToken) {
            Intrinsics.checkNotNullParameter(optional, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            C28021rq.this.f107744a.m37733F1(newToken.m59035e());
            return newToken;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TokenPairState;", "<anonymous parameter 0>", "newTokenPair", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$j */
    /* loaded from: classes2.dex */
    public static final class C28031j extends Lambda implements Function2<Optional<TokenPairState>, Optional<TokenPairState>, Optional<TokenPairState>> {
        public C28031j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Optional<TokenPairState> invoke(Optional<TokenPairState> optional, Optional<TokenPairState> newTokenPair) {
            Intrinsics.checkNotNullParameter(optional, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(newTokenPair, "newTokenPair");
            C28021rq.this.f107744a.m37700N2(newTokenPair.m59035e());
            return newTokenPair;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/TokenPairState;", "it", C17296a.f69688o, "(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$k */
    /* loaded from: classes2.dex */
    public static final class C28032k extends Lambda implements Function1<TokenPairState, TokenPairState> {

        /* renamed from: g */
        public static final C28032k f107764g = new C28032k();

        public C28032k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TokenPairState invoke(TokenPairState tokenPairState) {
            if (tokenPairState != null) {
                return TokenPairState.copy$default(tokenPairState, null, true, 1, null);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/TokenPairState;", "tokenPairState", C17296a.f69688o, "(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$l */
    /* loaded from: classes2.dex */
    public static final class C28033l extends Lambda implements Function1<TokenPairState, TokenPairState> {
        public C28033l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final TokenPairState invoke(TokenPairState tokenPairState) {
            TokenPair tokenPair;
            TokenPair tokenPair2;
            if (tokenPairState != null && (tokenPair2 = tokenPairState.getTokenPair()) != null) {
                JWT accessJwt = tokenPair2.getAccessJwt();
                JSONObject newPayload = C47015ph2.m18976d(accessJwt).put("exp", (DateTime.now().getMillis() / 1000) + 300);
                Intrinsics.checkNotNullExpressionValue(newPayload, "newPayload");
                tokenPair = new TokenPair(C47015ph2.m18979a(accessJwt, newPayload), tokenPair2.getRefreshJwt());
            } else {
                tokenPair = null;
            }
            return C28021rq.this.m15268N(tokenPairState, tokenPair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/TokenPair;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$m */
    /* loaded from: classes2.dex */
    public static final class C28034m extends Lambda implements Function1<HM4<TokenPair>, Unit> {
        public C28034m() {
            super(1);
        }

        /* renamed from: a */
        public final void m15228a(HM4<TokenPair> hm4) {
            TokenPair m103944a = hm4.m103944a();
            if (hm4.m103939f() && m103944a != null) {
                C28021rq.this.f107748e.accept(Optional.f63040c.m59032c(new TokenPairState(m103944a, false)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<TokenPair> hm4) {
            m15228a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/TokenPair;", "response", "LNp;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)LNp;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$n */
    /* loaded from: classes2.dex */
    public static final class C28035n extends Lambda implements Function1<HM4<TokenPair>, AbstractC5699Np> {
        public C28035n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC5699Np invoke(HM4<TokenPair> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            int m103943b = response.m103943b() / 100;
            if (response.m103939f()) {
                C28021rq c28021rq = C28021rq.this;
                return new AbstractC5699Np.C5700a(c28021rq.m15275G(c28021rq.mo15263d().m73665a().m59038b().getTokenPair().getAccessJwt()));
            } else if (m103943b == 4) {
                return AbstractC2999H1.C3003d.f12725a;
            } else {
                Response m103937h = response.m103937h();
                Intrinsics.checkNotNullExpressionValue(m103937h, "response.raw()");
                return new AbstractC2999H1.C3002c(m103937h);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TokenPairState;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rq$o */
    /* loaded from: classes2.dex */
    public static final class C28036o extends Lambda implements Function0<Z84<Optional<TokenPairState>>> {
        public C28036o() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<TokenPairState>> invoke() {
            return Z84.f47888d.m73663b(C28021rq.this.f107748e);
        }
    }

    public C28021rq(C22454gl appPreference, InterfaceC35660Rh6 userStream, InterfaceC5093Lp authClient) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(authClient, "authClient");
        this.f107744a = appPreference;
        this.f107745b = authClient;
        lazy = LazyKt__LazyJVMKt.lazy(new C28036o());
        this.f107746c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C28029h());
        this.f107747d = lazy2;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f107748e = c10586a.m71835a(c14443a.m59033b(appPreference.m37742D0()), new C28031j());
        this.f107749f = c10586a.m71835a(c14443a.m59033b(appPreference.m37743D()), new C28030i());
        this.f107750g = new ReentrantReadWriteLock(true);
        this.f107751h = C37279Yf5.m74551i0(m15241z());
        Observable<User> mo76576i = userStream.mo76576i();
        final C28022a c28022a = new C28022a();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: iq
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28021rq.m15246u(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final C28023b m15281A(C28021rq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.m15245v();
    }

    /* renamed from: B */
    public static final InterfaceC23447K m15280B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final Unit m15273I(C28021rq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mo15259h(C28032k.f107764g);
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m15272J(C28021rq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mo15259h(new C28033l());
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final AbstractC5699Np m15270L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC5699Np) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m15269M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m15246u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final Unit m15244w(C28021rq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m15267O(C28026e.f107758g);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m15243x(C28021rq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mo15259h(C28027f.f107759g);
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public final C28025d m15279C(C28023b c28023b) {
        if (c28023b.m15238b() == null) {
            return new C28025d(m15277E(c28023b.m15239a(), AbstractC2999H1.C3000a.f12722a), c28023b.m15239a(), null, 4, null);
        }
        if (!c28023b.m15238b().getRefreshRequested() && !m15278D(c28023b.m15238b().getTokenPair().getAccessJwt())) {
            return new C28025d(new AbstractC5699Np.C5700a(m15275G(c28023b.m15238b().getTokenPair().getAccessJwt())), null, null, 6, null);
        }
        if (C47015ph2.m18977c(c28023b.m15238b().getTokenPair().getRefreshJwt(), 0)) {
            return new C28025d(AbstractC2999H1.C3004e.f12726a, null, null, 6, null);
        }
        return new C28025d(new AbstractC5699Np.C5700a(m15275G(c28023b.m15238b().getTokenPair().getAccessJwt())), null, c28023b.m15238b().getTokenPair().getRefreshJwt(), 2, null);
    }

    /* renamed from: D */
    public final boolean m15278D(JWT jwt) {
        Date m53435c = jwt.m53435c();
        if (m53435c != null) {
            return DateTime.now().plusSeconds(600).isAfter(m53435c.getTime());
        }
        return false;
    }

    /* renamed from: E */
    public final AbstractC5699Np m15277E(String str, AbstractC2999H1 abstractC2999H1) {
        return str != null ? new AbstractC5699Np.C5700a(m15276F(str)) : abstractC2999H1;
    }

    /* renamed from: F */
    public final String m15276F(String str) {
        return "Bird " + str;
    }

    /* renamed from: G */
    public final String m15275G(JWT jwt) {
        return "Bearer " + jwt;
    }

    /* renamed from: H */
    public final AbstractC23442F<AbstractC5699Np> m15274H(JWT jwt) {
        return m15271K(this.f107745b.m96326a(m15275G(jwt)));
    }

    /* renamed from: K */
    public final AbstractC23442F<AbstractC5699Np> m15271K(AbstractC23442F<HM4<TokenPair>> abstractC23442F) {
        final C28034m c28034m = new C28034m();
        AbstractC23442F<HM4<TokenPair>> m33101w = abstractC23442F.m33101w(new InterfaceC23484g() { // from class: jq
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28021rq.m15269M(Function1.this, obj);
            }
        });
        final C28035n c28035n = new C28035n();
        AbstractC23442F m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: kq
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC5699Np m15270L;
                m15270L = C28021rq.m15270L(Function1.this, obj);
                return m15270L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "private fun Single<Respo…())\n        }\n      }\n  }");
        return m33157I;
    }

    /* renamed from: N */
    public final TokenPairState m15268N(TokenPairState tokenPairState, TokenPair tokenPair) {
        TokenPairState tokenPairState2;
        if (tokenPair != null) {
            if (tokenPairState == null || (tokenPairState2 = TokenPairState.copy$default(tokenPairState, tokenPair, false, 2, null)) == null) {
                tokenPairState2 = new TokenPairState(tokenPair, false);
            }
            return tokenPairState2;
        }
        return null;
    }

    /* renamed from: O */
    public final void m15267O(Function0<String> function0) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f107750g.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            this.f107749f.accept(Optional.f63040c.m59033b(function0.invoke()));
            Unit unit = Unit.INSTANCE;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: a */
    public Z84<Optional<String>> mo15266a() {
        return (Z84) this.f107747d.getValue();
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: b */
    public AbstractC23461c mo15265b() {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: qq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m15243x;
                m15243x = C28021rq.m15243x(C28021rq.this);
                return m15243x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n      upd…eTokenPair { null }\n    }");
        return m33078H;
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: c */
    public String mo15264c() {
        AbstractC5699Np m15237a = m15279C(m15245v()).m15237a();
        if (!(m15237a instanceof AbstractC5699Np.C5700a)) {
            m15237a = null;
        }
        AbstractC5699Np.C5700a c5700a = (AbstractC5699Np.C5700a) m15237a;
        if (c5700a == null) {
            return null;
        }
        return c5700a.m93366b();
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: d */
    public Z84<Optional<TokenPairState>> mo15263d() {
        return (Z84) this.f107746c.getValue();
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: e */
    public AbstractC23461c mo15262e() {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: oq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m15244w;
                m15244w = C28021rq.m15244w(C28021rq.this);
                return m15244w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n      upd…yAuthToken { null }\n    }");
        return m33078H;
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: f */
    public AbstractC23461c mo15261f() {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: pq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m15272J;
                m15272J = C28021rq.m15272J(C28021rq.this);
                return m15272J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n      upd…wTokenPair)\n      }\n    }");
        return m33078H;
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: g */
    public <T> T mo15260g(Function1<? super AbstractC5699Np, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock readLock = this.f107750g.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "lock.readLock()");
        readLock.lock();
        try {
            AbstractC5699Np m33132g = this.f107751h.m33132g();
            Intrinsics.checkNotNullExpressionValue(m33132g, "sharedAuthHeaderSingle.blockingGet()");
            return action.invoke(m33132g);
        } finally {
            readLock.unlock();
        }
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: h */
    public void mo15259h(Function1<? super TokenPairState, TokenPairState> update) {
        Intrinsics.checkNotNullParameter(update, "update");
        ReentrantReadWriteLock.WriteLock writeLock = this.f107750g.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            this.f107748e.accept(Optional.f63040c.m59033b(update.invoke(mo15263d().m73665a().m59035e())));
            Unit unit = Unit.INSTANCE;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: i */
    public AbstractC23461c mo15258i() {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: nq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m15273I;
                m15273I = C28021rq.m15273I(C28021rq.this);
                return m15273I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n      upd…Requested = true) }\n    }");
        return m33078H;
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: j */
    public boolean mo15257j() {
        TokenPairState m59035e = mo15263d().m73665a().m59035e();
        if (m59035e == null) {
            return false;
        }
        return !C47015ph2.m18977c(m59035e.getTokenPair().getRefreshJwt(), 0);
    }

    @Override // p000.InterfaceC22767hq
    /* renamed from: k */
    public void mo15256k(Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.WriteLock writeLock = this.f107750g.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            String mo15264c = mo15264c();
            C37791a94<Optional<String>> c37791a94 = this.f107749f;
            Optional.C14443a c14443a = Optional.f63040c;
            c37791a94.accept(c14443a.m59034a());
            this.f107748e.accept(c14443a.m59034a());
            action.invoke(mo15264c);
            Unit unit = Unit.INSTANCE;
        } finally {
            writeLock.unlock();
        }
    }

    /* renamed from: v */
    public final C28023b m15245v() {
        return new C28023b(mo15266a().m73665a().m59035e(), mo15263d().m73665a().m59035e());
    }

    /* renamed from: y */
    public final AbstractC23442F<AbstractC5699Np> m15242y(String str) {
        return m15271K(this.f107745b.m96325b(new C49978uh1(str)));
    }

    /* renamed from: z */
    public final AbstractC23442F<AbstractC5699Np> m15241z() {
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: lq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C28021rq.C28023b m15281A;
                m15281A = C28021rq.m15281A(C28021rq.this);
                return m15281A;
            }
        });
        final C28028g c28028g = new C28028g();
        AbstractC23442F<AbstractC5699Np> m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: mq
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m15280B;
                m15280B = C28021rq.m15280B(Function1.this, obj);
                return m15280B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun getAuthHeade…lt)\n        }\n      }\n  }");
        return m33165A;
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lrq$d;", "", "LNp;", C17296a.f69688o, "LNp;", "()LNp;", "headerResult", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "shouldExchangeWithToken", "Lcom/auth0/android/jwt/JWT;", "Lcom/auth0/android/jwt/JWT;", "()Lcom/auth0/android/jwt/JWT;", "needsRefreshUsingJwt", "<init>", "(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rq$d */
    /* loaded from: classes2.dex */
    public static final class C28025d {

        /* renamed from: a */
        public final AbstractC5699Np f107755a;

        /* renamed from: b */
        public final String f107756b;

        /* renamed from: c */
        public final JWT f107757c;

        public C28025d(AbstractC5699Np headerResult, String str, JWT jwt) {
            Intrinsics.checkNotNullParameter(headerResult, "headerResult");
            this.f107755a = headerResult;
            this.f107756b = str;
            this.f107757c = jwt;
        }

        /* renamed from: a */
        public final AbstractC5699Np m15237a() {
            return this.f107755a;
        }

        /* renamed from: b */
        public final JWT m15236b() {
            return this.f107757c;
        }

        /* renamed from: c */
        public final String m15235c() {
            return this.f107756b;
        }

        public /* synthetic */ C28025d(AbstractC5699Np abstractC5699Np, String str, JWT jwt, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC5699Np, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : jwt);
        }
    }
}
