package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.model.payments.response.AwaitAction;
import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.HttpException;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC37918aN4;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u00012B\u0011\b\u0002\u0012\u0006\u0010A\u001a\u00020\u0001¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u001c\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\u001b\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J\u001b\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00120\u0017j\u0002`\u00182\u0006\u0010\u0016\u001a\u00020\u0012H\u0096\u0003J\u0019\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001J\u001d\u0010\u001f\u001a\u00020\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u001dH\u0096\u0001JE\u0010)\u001a\u00020\u00012:\u0010(\u001a6\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0 j\u0002`'H\u0096\u0001J1\u0010-\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000b0\n0*j\b\u0012\u0004\u0012\u00020+`,H\u0096\u0001JE\u0010.\u001a\u00020\u00012:\u0010(\u001a6\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0 j\u0002`'H\u0096\u0001J\t\u0010/\u001a\u00020\u0012H\u0096\u0001R+\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020&00j\u0002`18BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010Dj\u0002`E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001c\u0010K\u001a\u0002078\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b8\u0010:\"\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010RR4\u0010Z\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00040Tj\u0002`U8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001c\u0010a\u001a\u00020]8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b2\u0010`\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, m28432d2 = {"LvW5;", "LpI4;", "request", "x", "Lkotlin/Pair;", "LFM4;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "y", "t", "(LpI4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LaN4;", "Lcom/github/kittinunf/fuel/core/FuelError;", "s", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "LOY;", "body", "l", "", "Ljava/nio/charset/Charset;", "charset", DateTokenConverter.CONVERTER_KEY, "header", "", "Lcom/github/kittinunf/fuel/core/HeaderValues;", "get", "", "value", "i", "", "map", "g", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "readBytes", "totalBytes", "", "Lcom/github/kittinunf/fuel/core/ProgressCallback;", "handler", "e", "Lkotlin/Triple;", "", "Lcom/github/kittinunf/fuel/core/ResponseResultOf;", "h", "j", "toString", "Lkotlin/Function1;", "Lcom/github/kittinunf/fuel/core/InterruptCallback;", "b", "Lkotlin/Lazy;", "w", "()Lkotlin/jvm/functions/Function1;", "interruptCallback", "LII4;", "c", "v", "()LII4;", "executor", "Lfk0;", "u", "()Lfk0;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LpI4;", "wrapped", "n", "()LOY;", "", "Lcom/github/kittinunf/fuel/core/RequestFeatures;", "k", "()Ljava/util/Map;", "enabledFeatures", "p", "(LII4;)V", "executionOptions", "LLH1;", "getHeaders", "()LLH1;", "headers", "LWT2;", "m", "()LWT2;", "method", "", "Lcom/github/kittinunf/fuel/core/Parameters;", "getParameters", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "parameters", "getRequest", "()LpI4;", "Ljava/net/URL;", C17296a.f69688o, "()Ljava/net/URL;", "(Ljava/net/URL;)V", "url", "<init>", "(LpI4;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: vW5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50468vW5 implements InterfaceC46785pI4 {

    /* renamed from: b */
    public final Lazy f114189b;

    /* renamed from: c */
    public final Lazy f114190c;

    /* renamed from: d */
    public final Lazy f114191d;

    /* renamed from: e */
    public final InterfaceC46785pI4 f114192e;

    /* renamed from: g */
    public static final C29568b f114188g = new C29568b(null);

    /* renamed from: f */
    public static final String f114187f = C50468vW5.class.getCanonicalName();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "com/github/kittinunf/fuel/core/requests/SuspendableRequest$awaitResult$4$2$1$1"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: vW5$a */
    /* loaded from: classes5.dex */
    public static final class C29567a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f114193g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29567a(Throwable th) {
            super(0);
            this.f114193g = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "[RequestTask] execution error\n\r\t" + this.f114193g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"LvW5$b;", "", "LpI4;", "request", "LvW5;", C17296a.f69688o, "", "kotlin.jvm.PlatformType", "FEATURE", "Ljava/lang/String;", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vW5$b */
    /* loaded from: classes5.dex */
    public static final class C29568b {
        private C29568b() {
        }

        /* renamed from: a */
        public final C50468vW5 m8542a(InterfaceC46785pI4 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            InterfaceC46785pI4 interfaceC46785pI4 = request.mo8557k().get(C50468vW5.f114187f);
            if (interfaceC46785pI4 == null) {
                interfaceC46785pI4 = new C50468vW5(request, null);
            }
            if (request != interfaceC46785pI4) {
                Map<String, InterfaceC46785pI4> mo8557k = request.mo8557k();
                String FEATURE = C50468vW5.f114187f;
                Intrinsics.checkNotNullExpressionValue(FEATURE, "FEATURE");
                mo8557k.put(FEATURE, interfaceC46785pI4);
            }
            return (C50468vW5) interfaceC46785pI4;
        }

        public /* synthetic */ C29568b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086@"}, m28432d2 = {"Lkotlin/coroutines/Continuation;", "LFM4;", "continuation", "", AwaitAction.ACTION_TYPE}, m28431k = 3, m28430mv = {1, 4, 0})
    @DebugMetadata(m28419c = "com.github.kittinunf.fuel.core.requests.SuspendableRequest", m28418f = "SuspendableRequest.kt", m28417i = {0}, m28416l = {64}, m28415m = AwaitAction.ACTION_TYPE, m28414n = {"this"}, m28413s = {"L$0"})
    /* renamed from: vW5$c */
    /* loaded from: classes5.dex */
    public static final class C29569c extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f114194h;

        /* renamed from: i */
        public int f114195i;

        /* renamed from: k */
        public Object f114197k;

        public C29569c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114194h = obj;
            this.f114195i |= Integer.MIN_VALUE;
            return C50468vW5.this.m8550r(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u0086@"}, m28432d2 = {"Lkotlin/coroutines/Continuation;", "LaN4;", "LFM4;", "Lcom/github/kittinunf/fuel/core/FuelError;", "continuation", "", "awaitResult"}, m28431k = 3, m28430mv = {1, 4, 0})
    @DebugMetadata(m28419c = "com.github.kittinunf.fuel.core.requests.SuspendableRequest", m28418f = "SuspendableRequest.kt", m28417i = {0, 0}, m28416l = {40}, m28415m = "awaitResult", m28414n = {"this", "it"}, m28413s = {"L$0", "L$1"})
    /* renamed from: vW5$d */
    /* loaded from: classes5.dex */
    public static final class C29570d extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f114198h;

        /* renamed from: i */
        public int f114199i;

        /* renamed from: k */
        public Object f114201k;

        /* renamed from: l */
        public Object f114202l;

        public C29570d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114198h = obj;
            this.f114199i |= Integer.MIN_VALUE;
            return C50468vW5.this.m8549s(this);
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: vW5$e */
    /* loaded from: classes5.dex */
    public static final class C29571e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f114203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29571e(Throwable th) {
            super(0);
            this.f114203g = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Throwable th;
            StringBuilder sb = new StringBuilder();
            sb.append("[RequestTask] on failure ");
            Throwable th2 = this.f114203g;
            if (!(th2 instanceof FuelError)) {
                th2 = null;
            }
            FuelError fuelError = (FuelError) th2;
            if (fuelError == null || (th = fuelError.m52053c()) == null) {
                th = this.f114203g;
            }
            sb.append(th);
            return sb.toString();
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: vW5$f */
    /* loaded from: classes5.dex */
    public static final class C29572f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f114204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29572f(Throwable th) {
            super(0);
            this.f114204g = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "[RequestTask] execution error\n\r\t" + this.f114204g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lfk0;", "b", "()Lfk0;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: vW5$g */
    /* loaded from: classes5.dex */
    public static final class C29573g extends Lambda implements Function0<InterfaceC41113fk0> {
        public C29573g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC41113fk0 invoke() {
            return C50468vW5.this.m8546v().m102550b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0082@"}, m28432d2 = {"LpI4;", "request", "Lkotlin/coroutines/Continuation;", "Lkotlin/Pair;", "LFM4;", "continuation", "", "executeRequest"}, m28431k = 3, m28430mv = {1, 4, 0})
    @DebugMetadata(m28419c = "com.github.kittinunf.fuel.core.requests.SuspendableRequest", m28418f = "SuspendableRequest.kt", m28417i = {0, 0, 0}, m28416l = {21}, m28415m = "executeRequest", m28414n = {"this", "request", "$this$runCatching"}, m28413s = {"L$0", "L$1", "L$2"})
    /* renamed from: vW5$h */
    /* loaded from: classes5.dex */
    public static final class C29574h extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f114206h;

        /* renamed from: i */
        public int f114207i;

        /* renamed from: k */
        public Object f114209k;

        /* renamed from: l */
        public Object f114210l;

        /* renamed from: m */
        public Object f114211m;

        /* renamed from: n */
        public Object f114212n;

        public C29574h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114206h = obj;
            this.f114207i |= Integer.MIN_VALUE;
            return C50468vW5.this.m8548t(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LII4;", "b", "()LII4;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: vW5$i */
    /* loaded from: classes5.dex */
    public static final class C29575i extends Lambda implements Function0<II4> {
        public C29575i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final II4 invoke() {
            return C50468vW5.this.getRequest().mo8565c();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Function1;", "LpI4;", "", "Lcom/github/kittinunf/fuel/core/InterruptCallback;", "b", "()Lkotlin/jvm/functions/Function1;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: vW5$j */
    /* loaded from: classes5.dex */
    public static final class C29576j extends Lambda implements Function0<Function1<? super InterfaceC46785pI4, ? extends Unit>> {
        public C29576j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Function1<InterfaceC46785pI4, Unit> invoke() {
            return C50468vW5.this.m8546v().m102546f();
        }
    }

    public C50468vW5(InterfaceC46785pI4 interfaceC46785pI4) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        this.f114192e = interfaceC46785pI4;
        lazy = LazyKt__LazyJVMKt.lazy(new C29576j());
        this.f114189b = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C29575i());
        this.f114190c = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C29573g());
        this.f114191d = lazy3;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: a */
    public URL mo8567a() {
        return this.f114192e.mo8567a();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: b */
    public void mo8566b(URL url) {
        Intrinsics.checkNotNullParameter(url, "<set-?>");
        this.f114192e.mo8566b(url);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: c */
    public II4 mo8565c() {
        return this.f114192e.mo8565c();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: d */
    public InterfaceC46785pI4 mo8564d(String body, Charset charset) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return this.f114192e.mo8564d(body, charset);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: e */
    public InterfaceC46785pI4 mo8563e(Function2<? super Long, ? super Long, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f114192e.mo8563e(handler);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: f */
    public void mo8562f(List<? extends Pair<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f114192e.mo8562f(list);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: g */
    public InterfaceC46785pI4 mo8561g(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return this.f114192e.mo8561g(map);
    }

    @Override // p000.InterfaceC46785pI4
    public Collection<String> get(String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return this.f114192e.get(header);
    }

    @Override // p000.InterfaceC46785pI4
    public LH1 getHeaders() {
        return this.f114192e.getHeaders();
    }

    @Override // p000.InterfaceC46785pI4
    public List<Pair<String, Object>> getParameters() {
        return this.f114192e.getParameters();
    }

    @Override // p000.MI4
    public InterfaceC46785pI4 getRequest() {
        return this.f114192e.getRequest();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: h */
    public Triple<InterfaceC46785pI4, FM4, AbstractC37918aN4<byte[], FuelError>> mo8560h() {
        return this.f114192e.mo8560h();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: i */
    public InterfaceC46785pI4 mo8559i(String header, Object value) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f114192e.mo8559i(header, value);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: j */
    public InterfaceC46785pI4 mo8558j(Function2<? super Long, ? super Long, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f114192e.mo8558j(handler);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: k */
    public Map<String, InterfaceC46785pI4> mo8557k() {
        return this.f114192e.mo8557k();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: l */
    public InterfaceC46785pI4 mo8556l(InterfaceC6029OY body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return this.f114192e.mo8556l(body);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: m */
    public WT2 mo8555m() {
        return this.f114192e.mo8555m();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: n */
    public InterfaceC6029OY mo8554n() {
        return this.f114192e.mo8554n();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: p */
    public void mo8552p(II4 ii4) {
        Intrinsics.checkNotNullParameter(ii4, "<set-?>");
        this.f114192e.mo8552p(ii4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8550r(Continuation<? super FM4> continuation) throws FuelError {
        C29569c c29569c;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C29569c) {
            c29569c = (C29569c) continuation;
            int i2 = c29569c.f114195i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29569c.f114195i = i2 - Integer.MIN_VALUE;
                Object obj = c29569c.f114194h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29569c.f114195i;
                if (i == 0) {
                    if (i == 1) {
                        C50468vW5 c50468vW5 = (C50468vW5) c29569c.f114197k;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c29569c.f114197k = this;
                    c29569c.f114195i = 1;
                    obj = m8549s(c29569c);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((AbstractC37918aN4) obj).mo71513a();
            }
        }
        c29569c = new C29569c(continuation);
        Object obj2 = c29569c.f114194h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29569c.f114195i;
        if (i == 0) {
        }
        return ((AbstractC37918aN4) obj2).mo71513a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8549s(Continuation<? super AbstractC37918aN4<FM4, ? extends FuelError>> continuation) {
        C29570d c29570d;
        Object coroutine_suspended;
        int i;
        Object m116783constructorimpl;
        C50468vW5 c50468vW5;
        Object m116783constructorimpl2;
        Pair<? extends InterfaceC46785pI4, FM4> pair;
        Object m116783constructorimpl3;
        Throwable m116786exceptionOrNullimpl;
        Object m116783constructorimpl4;
        Throwable m116786exceptionOrNullimpl2;
        Object m116783constructorimpl5;
        Throwable m116786exceptionOrNullimpl3;
        if (continuation instanceof C29570d) {
            c29570d = (C29570d) continuation;
            int i2 = c29570d.f114199i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29570d.f114199i = i2 - Integer.MIN_VALUE;
                Object obj = c29570d.f114198h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29570d.f114199i;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC46785pI4 interfaceC46785pI4 = (InterfaceC46785pI4) c29570d.f114202l;
                        c50468vW5 = (C50468vW5) c29570d.f114201k;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            if (Result.m116790isSuccessimpl(m116783constructorimpl2)) {
                            }
                            m116783constructorimpl4 = Result.m116783constructorimpl(m116783constructorimpl2);
                            m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
                            if (m116786exceptionOrNullimpl2 != null) {
                            }
                            if (!Result.m116790isSuccessimpl(m116783constructorimpl4)) {
                            }
                            m116786exceptionOrNullimpl3 = Result.m116786exceptionOrNullimpl(m116783constructorimpl5);
                            if (m116786exceptionOrNullimpl3 != null) {
                            }
                            ResultKt.throwOnFailure(m116783constructorimpl5);
                            return m116783constructorimpl5;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(m8544x(getRequest()));
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                        try {
                            InterfaceC46785pI4 interfaceC46785pI42 = (InterfaceC46785pI4) m116783constructorimpl;
                            c29570d.f114201k = this;
                            c29570d.f114202l = interfaceC46785pI42;
                            c29570d.f114199i = 1;
                            obj = m8548t(interfaceC46785pI42, c29570d);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c50468vW5 = this;
                        } catch (Throwable th3) {
                            th = th3;
                            c50468vW5 = this;
                            Result.Companion companion4 = Result.Companion;
                            m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            if (Result.m116790isSuccessimpl(m116783constructorimpl2)) {
                            }
                            m116783constructorimpl4 = Result.m116783constructorimpl(m116783constructorimpl2);
                            m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
                            if (m116786exceptionOrNullimpl2 != null) {
                            }
                            if (!Result.m116790isSuccessimpl(m116783constructorimpl4)) {
                            }
                            m116786exceptionOrNullimpl3 = Result.m116786exceptionOrNullimpl(m116783constructorimpl5);
                            if (m116786exceptionOrNullimpl3 != null) {
                            }
                            ResultKt.throwOnFailure(m116783constructorimpl5);
                            return m116783constructorimpl5;
                        }
                    } else {
                        m116783constructorimpl2 = Result.m116783constructorimpl(m116783constructorimpl);
                        c50468vW5 = this;
                        if (Result.m116790isSuccessimpl(m116783constructorimpl2)) {
                            try {
                                pair = (Pair) m116783constructorimpl2;
                                m116783constructorimpl3 = Result.m116783constructorimpl(c50468vW5.m8543y(pair));
                                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl3);
                            } catch (Throwable th4) {
                                Result.Companion companion5 = Result.Companion;
                                m116783constructorimpl2 = ResultKt.createFailure(th4);
                            }
                            if (m116786exceptionOrNullimpl == null) {
                                ResultKt.throwOnFailure(m116783constructorimpl3);
                                m116783constructorimpl4 = Result.m116783constructorimpl((FM4) m116783constructorimpl3);
                                m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
                                if (m116786exceptionOrNullimpl2 != null) {
                                    C47303qA1 c47303qA1 = C47303qA1.f104815c;
                                    c47303qA1.m18033b(new C29571e(m116786exceptionOrNullimpl2));
                                    if ((m116786exceptionOrNullimpl2 instanceof FuelError) && ((FuelError) m116786exceptionOrNullimpl2).m52054b()) {
                                        c47303qA1.m18033b(new C29572f(m116786exceptionOrNullimpl2));
                                        c50468vW5.m8545w().invoke(c50468vW5.getRequest());
                                    }
                                }
                                if (!Result.m116790isSuccessimpl(m116783constructorimpl4)) {
                                    m116783constructorimpl5 = Result.m116783constructorimpl(new AbstractC37918aN4.C10665c((FM4) m116783constructorimpl4));
                                } else {
                                    m116783constructorimpl5 = Result.m116783constructorimpl(m116783constructorimpl4);
                                }
                                m116786exceptionOrNullimpl3 = Result.m116786exceptionOrNullimpl(m116783constructorimpl5);
                                if (m116786exceptionOrNullimpl3 != null) {
                                    m116783constructorimpl5 = Result.m116783constructorimpl(new AbstractC37918aN4.C10664b((FuelError) m116786exceptionOrNullimpl3));
                                }
                                ResultKt.throwOnFailure(m116783constructorimpl5);
                                return m116783constructorimpl5;
                            }
                            C47303qA1.f104815c.m18033b(new C29567a(m116786exceptionOrNullimpl));
                            throw FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, pair.getSecond());
                        }
                        m116783constructorimpl4 = Result.m116783constructorimpl(m116783constructorimpl2);
                        m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
                        if (m116786exceptionOrNullimpl2 != null) {
                        }
                        if (!Result.m116790isSuccessimpl(m116783constructorimpl4)) {
                        }
                        m116786exceptionOrNullimpl3 = Result.m116786exceptionOrNullimpl(m116783constructorimpl5);
                        if (m116786exceptionOrNullimpl3 != null) {
                        }
                        ResultKt.throwOnFailure(m116783constructorimpl5);
                        return m116783constructorimpl5;
                    }
                }
                m116783constructorimpl2 = Result.m116783constructorimpl((Pair) obj);
                if (Result.m116790isSuccessimpl(m116783constructorimpl2)) {
                }
                m116783constructorimpl4 = Result.m116783constructorimpl(m116783constructorimpl2);
                m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
                if (m116786exceptionOrNullimpl2 != null) {
                }
                if (!Result.m116790isSuccessimpl(m116783constructorimpl4)) {
                }
                m116786exceptionOrNullimpl3 = Result.m116786exceptionOrNullimpl(m116783constructorimpl5);
                if (m116786exceptionOrNullimpl3 != null) {
                }
                ResultKt.throwOnFailure(m116783constructorimpl5);
                return m116783constructorimpl5;
            }
        }
        c29570d = new C29570d(continuation);
        Object obj2 = c29570d.f114198h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29570d.f114199i;
        if (i == 0) {
        }
        m116783constructorimpl2 = Result.m116783constructorimpl((Pair) obj2);
        if (Result.m116790isSuccessimpl(m116783constructorimpl2)) {
        }
        m116783constructorimpl4 = Result.m116783constructorimpl(m116783constructorimpl2);
        m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
        if (m116786exceptionOrNullimpl2 != null) {
        }
        if (!Result.m116790isSuccessimpl(m116783constructorimpl4)) {
        }
        m116786exceptionOrNullimpl3 = Result.m116786exceptionOrNullimpl(m116783constructorimpl5);
        if (m116786exceptionOrNullimpl3 != null) {
        }
        ResultKt.throwOnFailure(m116783constructorimpl5);
        return m116783constructorimpl5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object m8548t(InterfaceC46785pI4 interfaceC46785pI4, Continuation<? super Pair<? extends InterfaceC46785pI4, FM4>> continuation) {
        C29574h c29574h;
        Object coroutine_suspended;
        int i;
        C50468vW5 c50468vW5;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof C29574h) {
            c29574h = (C29574h) continuation;
            int i2 = c29574h.f114207i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29574h.f114207i = i2 - Integer.MIN_VALUE;
                Object obj = c29574h.f114206h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29574h.f114207i;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC46785pI4 = (InterfaceC46785pI4) c29574h.f114212n;
                        C50468vW5 c50468vW52 = (C50468vW5) c29574h.f114211m;
                        InterfaceC46785pI4 interfaceC46785pI42 = (InterfaceC46785pI4) c29574h.f114210l;
                        c50468vW5 = (C50468vW5) c29574h.f114209k;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        InterfaceC41113fk0 m8547u = m8547u();
                        c29574h.f114209k = this;
                        c29574h.f114210l = interfaceC46785pI4;
                        c29574h.f114211m = this;
                        c29574h.f114212n = interfaceC46785pI4;
                        c29574h.f114207i = 1;
                        obj = m8547u.mo40978b(interfaceC46785pI4, c29574h);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c50468vW5 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        c50468vW5 = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl(new Pair(interfaceC46785pI4, obj));
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    ResultKt.throwOnFailure(m116783constructorimpl);
                    return m116783constructorimpl;
                }
                throw FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, new FM4(c50468vW5.mo8567a(), 0, null, null, 0L, null, 62, null));
            }
        }
        c29574h = new C29574h(continuation);
        Object obj2 = c29574h.f114206h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29574h.f114207i;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl(new Pair(interfaceC46785pI4, obj2));
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    @Override // p000.InterfaceC46785pI4
    public String toString() {
        return this.f114192e.toString();
    }

    /* renamed from: u */
    public final InterfaceC41113fk0 m8547u() {
        return (InterfaceC41113fk0) this.f114191d.getValue();
    }

    /* renamed from: v */
    public final II4 m8546v() {
        return (II4) this.f114190c.getValue();
    }

    /* renamed from: w */
    public final Function1<InterfaceC46785pI4, Unit> m8545w() {
        return (Function1) this.f114189b.getValue();
    }

    /* renamed from: x */
    public final InterfaceC46785pI4 m8544x(InterfaceC46785pI4 interfaceC46785pI4) {
        return m8546v().m102543i().invoke(interfaceC46785pI4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FM4 m8543y(Pair<? extends InterfaceC46785pI4, FM4> pair) {
        Object m116783constructorimpl;
        FM4 fm4;
        Object m116783constructorimpl2;
        Throwable m116786exceptionOrNullimpl;
        InterfaceC46785pI4 component1 = pair.component1();
        FM4 component2 = pair.component2();
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(m8546v().m102541k().invoke(component1, component2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
            try {
                fm4 = (FM4) m116783constructorimpl;
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl = ResultKt.createFailure(th2);
            }
            if (m8546v().m102540l().invoke(fm4).booleanValue()) {
                m116783constructorimpl2 = Result.m116783constructorimpl(fm4);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
                if (m116786exceptionOrNullimpl != null) {
                    ResultKt.throwOnFailure(m116783constructorimpl2);
                    return (FM4) m116783constructorimpl2;
                }
                throw FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, component2);
            }
            throw FuelError.f69982c.m52051a(new HttpException(fm4.m107280d(), fm4.m107281c()), fm4);
        }
        m116783constructorimpl2 = Result.m116783constructorimpl(m116783constructorimpl);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    public /* synthetic */ C50468vW5(InterfaceC46785pI4 interfaceC46785pI4, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC46785pI4);
    }
}
