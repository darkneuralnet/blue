package p000;

import ch.qos.logback.core.net.ssl.SSL;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.net.Proxy;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000.InterfaceC41113fk0;
import p000.LH1;
@Metadata(m28433d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b}\u0010~J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J<\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J4\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0016R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00107\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-\"\u0004\b6\u0010/R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER:\u0010M\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b0\nj\u0002`\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010S\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010O\u001a\u0004\bG\u0010P\"\u0004\bQ\u0010RR+\u0010Y\u001a\u00020T2\u0006\u0010\u0014\u001a\u00020T8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0015\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010^\u001a\u00020Z2\u0006\u0010\u0014\u001a\u00020Z8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0015\u001a\u0004\b@\u0010[\"\u0004\b\\\u0010]R+\u0010c\u001a\u00020_2\u0006\u0010\u0014\u001a\u00020_8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b4\u0010`\"\u0004\ba\u0010bRJ\u0010h\u001a8\u00124\u00122\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030ej\u0002`f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030ej\u0002`f0ej\u0002`g0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HRV\u0010n\u001aD\u0012@\u0012>\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020j0ij\u0002`k\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020j0ij\u0002`k0ej\u0002`l0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010HR+\u0010t\u001a\u00020o2\u0006\u0010\u0014\u001a\u00020o8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010\u0015\u001a\u0004\b*\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006\u0080\u0001"}, m28432d2 = {"LrA1;", "", "LLI4;", "LpI4;", "request", "c", "LWT2;", "method", "", "path", "", "Lkotlin/Pair;", "Lcom/github/kittinunf/fuel/core/Parameters;", "parameters", "m", "LMI4;", "convertible", "n", C17296a.f69688o, "Lfk0;", "<set-?>", "Lkotlin/properties/ReadWriteProperty;", "e", "()Lfk0;", "setClient", "(Lfk0;)V", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Ljava/net/Proxy;", "b", "Ljava/net/Proxy;", "k", "()Ljava/net/Proxy;", "setProxy", "(Ljava/net/Proxy;)V", "proxy", "Ljava/lang/String;", "getBasePath", "()Ljava/lang/String;", "setBasePath", "(Ljava/lang/String;)V", "basePath", "", DateTokenConverter.CONVERTER_KEY, "I", "getTimeoutInMillisecond", "()I", "setTimeoutInMillisecond", "(I)V", "timeoutInMillisecond", "getTimeoutReadInMillisecond", "setTimeoutReadInMillisecond", "timeoutReadInMillisecond", "f", "j", "setProgressBufferSize", "progressBufferSize", "Lfk0$a;", "g", "Lfk0$a;", "()Lfk0$a;", "setHook", "(Lfk0$a;)V", "hook", "", "h", "Ljava/util/Map;", "getBaseHeaders", "()Ljava/util/Map;", "setBaseHeaders", "(Ljava/util/Map;)V", "baseHeaders", "i", "Ljava/util/List;", "getBaseParams", "()Ljava/util/List;", "setBaseParams", "(Ljava/util/List;)V", "baseParams", "Ljava/security/KeyStore;", "Ljava/security/KeyStore;", "()Ljava/security/KeyStore;", "setKeystore", "(Ljava/security/KeyStore;)V", "keystore", "Ljavax/net/ssl/SSLSocketFactory;", "l", "()Ljavax/net/ssl/SSLSocketFactory;", "setSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)V", "socketFactory", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "setExecutorService", "(Ljava/util/concurrent/ExecutorService;)V", "executorService", "", "Lkotlin/Function1;", "Lcom/github/kittinunf/fuel/core/RequestTransformer;", "Lcom/github/kittinunf/fuel/core/FoldableRequestInterceptor;", "requestInterceptors", "Lkotlin/Function2;", "LFM4;", "Lcom/github/kittinunf/fuel/core/ResponseTransformer;", "Lcom/github/kittinunf/fuel/core/FoldableResponseInterceptor;", "o", "responseInterceptors", "Ljava/util/concurrent/Executor;", "p", "()Ljava/util/concurrent/Executor;", "setCallbackExecutor", "(Ljava/util/concurrent/Executor;)V", "callbackExecutor", "", "q", "Z", "getForceMethods", "()Z", "setForceMethods", "(Z)V", "forceMethods", "<init>", "()V", "t", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: rA1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47896rA1 implements LI4 {

    /* renamed from: b */
    public Proxy f106568b;

    /* renamed from: c */
    public String f106569c;

    /* renamed from: h */
    public Map<String, String> f106574h;

    /* renamed from: i */
    public List<? extends Pair<String, ? extends Object>> f106575i;

    /* renamed from: j */
    public KeyStore f106576j;

    /* renamed from: k */
    public final ReadWriteProperty f106577k;

    /* renamed from: l */
    public final ReadWriteProperty f106578l;

    /* renamed from: m */
    public final ReadWriteProperty f106579m;

    /* renamed from: n */
    public final List<Function1<Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4>, Function1<InterfaceC46785pI4, InterfaceC46785pI4>>> f106580n;

    /* renamed from: o */
    public final List<Function1<Function2<? super InterfaceC46785pI4, ? super FM4, FM4>, Function2<InterfaceC46785pI4, FM4, FM4>>> f106581o;

    /* renamed from: p */
    public final ReadWriteProperty f106582p;

    /* renamed from: q */
    public boolean f106583q;

    /* renamed from: r */
    public static final /* synthetic */ KProperty[] f106564r = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(C47896rA1.class, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "getClient()Lcom/github/kittinunf/fuel/core/Client;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(C47896rA1.class, "socketFactory", "getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(C47896rA1.class, "hostnameVerifier", "getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(C47896rA1.class, "executorService", "getExecutorService()Ljava/util/concurrent/ExecutorService;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(C47896rA1.class, "callbackExecutor", "getCallbackExecutor()Ljava/util/concurrent/Executor;", 0))};

    /* renamed from: t */
    public static final C27861b f106566t = new C27861b(null);

    /* renamed from: s */
    public static final ReadWriteProperty f106565s = AZ0.m115553a(C27860a.f106584g);

    /* renamed from: a */
    public final ReadWriteProperty f106567a = AZ0.m115553a(new C27865f());

    /* renamed from: d */
    public int f106570d = 15000;

    /* renamed from: e */
    public int f106571e = 15000;

    /* renamed from: f */
    public int f106572f = 8192;

    /* renamed from: g */
    public InterfaceC41113fk0.InterfaceC20497a f106573g = new C49880uX0();

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LrA1;", "b", "()LrA1;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$a */
    /* loaded from: classes5.dex */
    public static final class C27860a extends Lambda implements Function0<C47896rA1> {

        /* renamed from: g */
        public static final C27860a f106584g = new C27860a();

        public C27860a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C47896rA1 invoke() {
            return new C47896rA1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LrA1$b;", "", "LrA1;", "<set-?>", "instance$delegate", "Lkotlin/properties/ReadWriteProperty;", C17296a.f69688o, "()LrA1;", "setInstance", "(LrA1;)V", "instance", "", "b", "()I", "progressBufferSize", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: rA1$b */
    /* loaded from: classes5.dex */
    public static final class C27861b {

        /* renamed from: a */
        public static final /* synthetic */ KProperty[] f106585a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(C27861b.class, "instance", "getInstance()Lcom/github/kittinunf/fuel/core/FuelManager;", 0))};

        private C27861b() {
        }

        /* renamed from: a */
        public final C47896rA1 m16315a() {
            return (C47896rA1) C47896rA1.f106565s.getValue(C47896rA1.f106566t, f106585a[0]);
        }

        /* renamed from: b */
        public final int m16314b() {
            return C47896rA1.f106566t.m16315a().m16321j();
        }

        public /* synthetic */ C27861b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LpI4;", "r", C17296a.f69688o, "(LpI4;)LpI4;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$c */
    /* loaded from: classes5.dex */
    public static final class C27862c extends Lambda implements Function1<InterfaceC46785pI4, InterfaceC46785pI4> {

        /* renamed from: g */
        public static final C27862c f106586g = new C27862c();

        public C27862c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC46785pI4 invoke(InterfaceC46785pI4 r) {
            Intrinsics.checkNotNullParameter(r, "r");
            return r;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LpI4;", "<anonymous parameter 0>", "LFM4;", "res", C17296a.f69688o, "(LpI4;LFM4;)LFM4;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$d */
    /* loaded from: classes5.dex */
    public static final class C27863d extends Lambda implements Function2<InterfaceC46785pI4, FM4, FM4> {

        /* renamed from: g */
        public static final C27863d f106587g = new C27863d();

        public C27863d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FM4 invoke(InterfaceC46785pI4 interfaceC46785pI4, FM4 res) {
            Intrinsics.checkNotNullParameter(interfaceC46785pI4, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(res, "res");
            return res;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/util/concurrent/Executor;", "b", "()Ljava/util/concurrent/Executor;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$e */
    /* loaded from: classes5.dex */
    public static final class C27864e extends Lambda implements Function0<Executor> {

        /* renamed from: g */
        public static final C27864e f106588g = new C27864e();

        public C27864e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Executor invoke() {
            return C52329yf1.m3013a().mo8275a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lfk0;", "b", "()Lfk0;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$f */
    /* loaded from: classes5.dex */
    public static final class C27865f extends Lambda implements Function0<InterfaceC41113fk0> {
        public C27865f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC41113fk0 invoke() {
            return new AN1(C47896rA1.this.m16320k(), false, false, C47896rA1.this.m16324g(), 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/util/concurrent/ExecutorService;", "b", "()Ljava/util/concurrent/ExecutorService;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$g */
    /* loaded from: classes5.dex */
    public static final class C27866g extends Lambda implements Function0<ExecutorService> {

        /* renamed from: g */
        public static final C27866g f106590g = new C27866g();

        @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "command", "Ljava/lang/Runnable;", "newThread"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: rA1$g$a */
        /* loaded from: classes5.dex */
        public static final class ThreadFactoryC27867a implements ThreadFactory {

            /* renamed from: b */
            public static final ThreadFactoryC27867a f106591b = new ThreadFactoryC27867a();

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setPriority(5);
                thread.setDaemon(true);
                return thread;
            }
        }

        public C27866g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ExecutorService invoke() {
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(ThreadFactoryC27867a.f106591b);
            Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "Executors.newCachedThrea…e\n            }\n        }");
            return newCachedThreadPool;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljavax/net/ssl/HostnameVerifier;", "b", "()Ljavax/net/ssl/HostnameVerifier;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$h */
    /* loaded from: classes5.dex */
    public static final class C27868h extends Lambda implements Function0<HostnameVerifier> {

        /* renamed from: g */
        public static final C27868h f106592g = new C27868h();

        public C27868h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final HostnameVerifier invoke() {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            Intrinsics.checkNotNullExpressionValue(defaultHostnameVerifier, "HttpsURLConnection.getDefaultHostnameVerifier()");
            return defaultHostnameVerifier;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljavax/net/ssl/SSLSocketFactory;", "b", "()Ljavax/net/ssl/SSLSocketFactory;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: rA1$i */
    /* loaded from: classes5.dex */
    public static final class C27869i extends Lambda implements Function0<SSLSocketFactory> {
        public C27869i() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
            if (r0 != null) goto L5;
         */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final SSLSocketFactory invoke() {
            SSLSocketFactory defaultSSLSocketFactory;
            KeyStore m16322i = C47896rA1.this.m16322i();
            if (m16322i != null) {
                TrustManagerFactory trustFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustFactory.init(m16322i);
                SSLContext sslContext = SSLContext.getInstance(SSL.DEFAULT_PROTOCOL);
                Intrinsics.checkNotNullExpressionValue(trustFactory, "trustFactory");
                sslContext.init(null, trustFactory.getTrustManagers(), null);
                Intrinsics.checkNotNullExpressionValue(sslContext, "sslContext");
                defaultSSLSocketFactory = sslContext.getSocketFactory();
            }
            defaultSSLSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
            Intrinsics.checkNotNullExpressionValue(defaultSSLSocketFactory, "keystore?.let {\n        …DefaultSSLSocketFactory()");
            return defaultSSLSocketFactory;
        }
    }

    public C47896rA1() {
        List<? extends Pair<String, ? extends Object>> emptyList;
        List<Function1<Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4>, Function1<InterfaceC46785pI4, InterfaceC46785pI4>>> mutableListOf;
        List<Function1<Function2<? super InterfaceC46785pI4, ? super FM4, FM4>, Function2<InterfaceC46785pI4, FM4, FM4>>> mutableListOf2;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f106575i = emptyList;
        this.f106577k = AZ0.m115553a(new C27869i());
        this.f106578l = AZ0.m115553a(C27868h.f106592g);
        this.f106579m = AZ0.m115553a(C27866g.f106590g);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(HE3.f13115b);
        this.f106580n = mutableListOf;
        mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(C42393ht4.m35624b(this));
        this.f106581o = mutableListOf2;
        this.f106582p = AZ0.m115553a(C27864e.f106588g);
    }

    @Override // p000.LI4
    /* renamed from: a */
    public InterfaceC46785pI4 mo16330a(String path, List<? extends Pair<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(path, "path");
        return m16318m(WT2.GET, path, list);
    }

    /* renamed from: c */
    public final InterfaceC46785pI4 m16328c(InterfaceC46785pI4 interfaceC46785pI4) {
        Set<String> keySet = interfaceC46785pI4.getHeaders().keySet();
        LH1.C4792a c4792a = LH1.f21034f;
        Map<String, String> map = this.f106574h;
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        LH1 m97403c = c4792a.m97403c(map);
        for (String str : keySet) {
            m97403c.remove(str);
        }
        InterfaceC46785pI4 mo8561g = interfaceC46785pI4.mo8561g(m97403c);
        InterfaceC41113fk0 m16326e = m16326e();
        SSLSocketFactory m16319l = m16319l();
        HostnameVerifier m16323h = m16323h();
        Executor m16327d = m16327d();
        List<Function1<Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4>, Function1<InterfaceC46785pI4, InterfaceC46785pI4>>> list = this.f106580n;
        Function1<InterfaceC46785pI4, InterfaceC46785pI4> function1 = C27862c.f106586g;
        if (!list.isEmpty()) {
            ListIterator<Function1<Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4>, Function1<InterfaceC46785pI4, InterfaceC46785pI4>>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                function1 = listIterator.previous().invoke(function1);
            }
        }
        Function1<InterfaceC46785pI4, InterfaceC46785pI4> function12 = function1;
        List<Function1<Function2<? super InterfaceC46785pI4, ? super FM4, FM4>, Function2<InterfaceC46785pI4, FM4, FM4>>> list2 = this.f106581o;
        Function2<InterfaceC46785pI4, FM4, FM4> function2 = C27863d.f106587g;
        if (!list2.isEmpty()) {
            ListIterator<Function1<Function2<? super InterfaceC46785pI4, ? super FM4, FM4>, Function2<InterfaceC46785pI4, FM4, FM4>>> listIterator2 = list2.listIterator(list2.size());
            while (listIterator2.hasPrevious()) {
                function2 = listIterator2.previous().invoke(function2);
            }
        }
        II4 ii4 = new II4(m16326e, m16319l, m16323h, m16325f(), m16327d, function12, function2);
        ii4.m102534r(this.f106570d);
        ii4.m102533s(this.f106571e);
        ii4.m102535q(this.f106583q);
        Unit unit = Unit.INSTANCE;
        mo8561g.mo8552p(ii4);
        return mo8561g;
    }

    /* renamed from: d */
    public final Executor m16327d() {
        return (Executor) this.f106582p.getValue(this, f106564r[4]);
    }

    /* renamed from: e */
    public final InterfaceC41113fk0 m16326e() {
        return (InterfaceC41113fk0) this.f106567a.getValue(this, f106564r[0]);
    }

    /* renamed from: f */
    public final ExecutorService m16325f() {
        return (ExecutorService) this.f106579m.getValue(this, f106564r[3]);
    }

    /* renamed from: g */
    public final InterfaceC41113fk0.InterfaceC20497a m16324g() {
        return this.f106573g;
    }

    /* renamed from: h */
    public final HostnameVerifier m16323h() {
        return (HostnameVerifier) this.f106578l.getValue(this, f106564r[2]);
    }

    /* renamed from: i */
    public final KeyStore m16322i() {
        return this.f106576j;
    }

    /* renamed from: j */
    public final int m16321j() {
        return this.f106572f;
    }

    /* renamed from: k */
    public final Proxy m16320k() {
        return this.f106568b;
    }

    /* renamed from: l */
    public final SSLSocketFactory m16319l() {
        return (SSLSocketFactory) this.f106577k.getValue(this, f106564r[1]);
    }

    /* renamed from: m */
    public InterfaceC46785pI4 m16318m(WT2 method, String path, List<? extends Pair<String, ? extends Object>> list) {
        List<? extends Pair<String, ? extends Object>> plus;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(path, "path");
        String str = this.f106569c;
        if (list != null) {
            plus = CollectionsKt___CollectionsKt.plus((Collection) this.f106575i, (Iterable) list);
        } else {
            plus = this.f106575i;
        }
        return m16328c(m16317n(new C34908Oc1(method, path, str, plus).getRequest()));
    }

    /* renamed from: n */
    public InterfaceC46785pI4 m16317n(MI4 convertible) {
        Intrinsics.checkNotNullParameter(convertible, "convertible");
        return m16328c(convertible.getRequest());
    }
}
