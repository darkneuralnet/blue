package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010G\u001a\u00020D\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010M\u0012\u0006\u0010U\u001a\u00020Q\u0012\u0006\u0010Z\u001a\u00020V\u0012\u0016\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0+j\u0002`[\u0012\u001c\u0010c\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:0]j\u0002`^¢\u0006\u0004\bd\u0010eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R$\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b\n\u0010\u001f\"\u0004\b$\u0010!R$\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R8\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+j\u0002`.0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b&\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b\u0019\u00106\"\u0004\b7\u00108R2\u0010A\u001a\u0012\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00070+j\u0002`;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R'\u0010C\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+j\u0002`.8\u0006¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\b#\u0010>R\u0017\u0010G\u001a\u00020D8\u0006¢\u0006\f\n\u0004\b=\u0010E\u001a\u0004\b\u000f\u0010FR\u0019\u0010L\u001a\u0004\u0018\u00010H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010KR\u0019\u0010P\u001a\u0004\u0018\u00010M8\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\b\u001d\u0010OR\u0017\u0010U\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\b\u001a\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010Z\u001a\u00020V8\u0006¢\u0006\f\n\u0004\b'\u0010W\u001a\u0004\bX\u0010YR'\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0+j\u0002`[8\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b4\u0010>R8\u0010c\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:0]j\u0002`^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010_\u001a\u0004\bB\u0010`\"\u0004\ba\u0010b¨\u0006f"}, m28432d2 = {"LII4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LH74;", C17296a.f69688o, "LH74;", "h", "()LH74;", "requestProgress", "b", "j", "responseProgress", "c", "I", "n", "()I", "r", "(I)V", "timeoutInMillisecond", DateTokenConverter.CONVERTER_KEY, "o", "s", "timeoutReadInMillisecond", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setDecodeContent", "(Ljava/lang/Boolean;)V", "decodeContent", "f", "setAllowRedirects", "allowRedirects", "g", "p", "setUseHttpCache", "useHttpCache", "", "Lkotlin/Function1;", "LpI4;", "", "Lcom/github/kittinunf/fuel/core/InterruptCallback;", "Ljava/util/Collection;", "()Ljava/util/Collection;", "setInterruptCallbacks", "(Ljava/util/Collection;)V", "interruptCallbacks", "i", "Z", "()Z", "q", "(Z)V", "forceMethods", "LFM4;", "Lcom/github/kittinunf/fuel/core/ResponseValidator;", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "setResponseValidator", "(Lkotlin/jvm/functions/Function1;)V", "responseValidator", "k", "interruptCallback", "Lfk0;", "Lfk0;", "()Lfk0;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Ljavax/net/ssl/SSLSocketFactory;", "m", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "socketFactory", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "getExecutorService", "()Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "getCallbackExecutor", "()Ljava/util/concurrent/Executor;", "callbackExecutor", "Lcom/github/kittinunf/fuel/core/RequestTransformer;", "requestTransformer", "Lkotlin/Function2;", "Lcom/github/kittinunf/fuel/core/ResponseTransformer;", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "setResponseTransformer", "(Lkotlin/jvm/functions/Function2;)V", "responseTransformer", "<init>", "(Lfk0;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: II4 */
/* loaded from: classes5.dex */
public final class II4 {

    /* renamed from: a */
    public final H74 f15275a;

    /* renamed from: b */
    public final H74 f15276b;

    /* renamed from: c */
    public int f15277c;

    /* renamed from: d */
    public int f15278d;

    /* renamed from: e */
    public Boolean f15279e;

    /* renamed from: f */
    public Boolean f15280f;

    /* renamed from: g */
    public Boolean f15281g;

    /* renamed from: h */
    public Collection<Function1<InterfaceC46785pI4, Unit>> f15282h;

    /* renamed from: i */
    public boolean f15283i;

    /* renamed from: j */
    public Function1<? super FM4, Boolean> f15284j;

    /* renamed from: k */
    public final Function1<InterfaceC46785pI4, Unit> f15285k;

    /* renamed from: l */
    public final InterfaceC41113fk0 f15286l;

    /* renamed from: m */
    public final SSLSocketFactory f15287m;

    /* renamed from: n */
    public final HostnameVerifier f15288n;

    /* renamed from: o */
    public final ExecutorService f15289o;

    /* renamed from: p */
    public final Executor f15290p;

    /* renamed from: q */
    public final Function1<InterfaceC46785pI4, InterfaceC46785pI4> f15291q;

    /* renamed from: r */
    public Function2<? super InterfaceC46785pI4, ? super FM4, FM4> f15292r;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LpI4;", "request", "", C17296a.f69688o, "(LpI4;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: II4$a */
    /* loaded from: classes5.dex */
    public static final class C3488a extends Lambda implements Function1<InterfaceC46785pI4, Unit> {
        public C3488a() {
            super(1);
        }

        /* renamed from: a */
        public final void m102532a(InterfaceC46785pI4 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<T> it = II4.this.m102545g().iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(request);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46785pI4 interfaceC46785pI4) {
            m102532a(interfaceC46785pI4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFM4;", "response", "", C17296a.f69688o, "(LFM4;)Z"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: II4$b */
    /* loaded from: classes5.dex */
    public static final class C3489b extends Lambda implements Function1<FM4, Boolean> {

        /* renamed from: g */
        public static final C3489b f15294g = new C3489b();

        public C3489b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m102531a(FM4 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (!JM4.m100648b(response) && !JM4.m100649a(response)) {
                return true;
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(FM4 fm4) {
            return Boolean.valueOf(m102531a(fm4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public II4(InterfaceC41113fk0 client, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ExecutorService executorService, Executor callbackExecutor, Function1<? super InterfaceC46785pI4, ? extends InterfaceC46785pI4> requestTransformer, Function2<? super InterfaceC46785pI4, ? super FM4, FM4> responseTransformer) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        Intrinsics.checkNotNullParameter(requestTransformer, "requestTransformer");
        Intrinsics.checkNotNullParameter(responseTransformer, "responseTransformer");
        this.f15286l = client;
        this.f15287m = sSLSocketFactory;
        this.f15288n = hostnameVerifier;
        this.f15289o = executorService;
        this.f15290p = callbackExecutor;
        this.f15291q = requestTransformer;
        this.f15292r = responseTransformer;
        this.f15275a = new H74(null, 1, null);
        this.f15276b = new H74(null, 1, null);
        this.f15277c = 15000;
        this.f15278d = 15000;
        this.f15282h = new ArrayList();
        this.f15284j = C3489b.f15294g;
        this.f15285k = new C3488a();
    }

    /* renamed from: a */
    public final Boolean m102551a() {
        return this.f15280f;
    }

    /* renamed from: b */
    public final InterfaceC41113fk0 m102550b() {
        return this.f15286l;
    }

    /* renamed from: c */
    public final Boolean m102549c() {
        return this.f15279e;
    }

    /* renamed from: d */
    public final boolean m102548d() {
        return this.f15283i;
    }

    /* renamed from: e */
    public final HostnameVerifier m102547e() {
        return this.f15288n;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof II4) {
                II4 ii4 = (II4) obj;
                return Intrinsics.areEqual(this.f15286l, ii4.f15286l) && Intrinsics.areEqual(this.f15287m, ii4.f15287m) && Intrinsics.areEqual(this.f15288n, ii4.f15288n) && Intrinsics.areEqual(this.f15289o, ii4.f15289o) && Intrinsics.areEqual(this.f15290p, ii4.f15290p) && Intrinsics.areEqual(this.f15291q, ii4.f15291q) && Intrinsics.areEqual(this.f15292r, ii4.f15292r);
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Function1<InterfaceC46785pI4, Unit> m102546f() {
        return this.f15285k;
    }

    /* renamed from: g */
    public final Collection<Function1<InterfaceC46785pI4, Unit>> m102545g() {
        return this.f15282h;
    }

    /* renamed from: h */
    public final H74 m102544h() {
        return this.f15275a;
    }

    public int hashCode() {
        InterfaceC41113fk0 interfaceC41113fk0 = this.f15286l;
        int hashCode = (interfaceC41113fk0 != null ? interfaceC41113fk0.hashCode() : 0) * 31;
        SSLSocketFactory sSLSocketFactory = this.f15287m;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f15288n;
        int hashCode3 = (hashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        ExecutorService executorService = this.f15289o;
        int hashCode4 = (hashCode3 + (executorService != null ? executorService.hashCode() : 0)) * 31;
        Executor executor = this.f15290p;
        int hashCode5 = (hashCode4 + (executor != null ? executor.hashCode() : 0)) * 31;
        Function1<InterfaceC46785pI4, InterfaceC46785pI4> function1 = this.f15291q;
        int hashCode6 = (hashCode5 + (function1 != null ? function1.hashCode() : 0)) * 31;
        Function2<? super InterfaceC46785pI4, ? super FM4, FM4> function2 = this.f15292r;
        return hashCode6 + (function2 != null ? function2.hashCode() : 0);
    }

    /* renamed from: i */
    public final Function1<InterfaceC46785pI4, InterfaceC46785pI4> m102543i() {
        return this.f15291q;
    }

    /* renamed from: j */
    public final H74 m102542j() {
        return this.f15276b;
    }

    /* renamed from: k */
    public final Function2<InterfaceC46785pI4, FM4, FM4> m102541k() {
        return this.f15292r;
    }

    /* renamed from: l */
    public final Function1<FM4, Boolean> m102540l() {
        return this.f15284j;
    }

    /* renamed from: m */
    public final SSLSocketFactory m102539m() {
        return this.f15287m;
    }

    /* renamed from: n */
    public final int m102538n() {
        return this.f15277c;
    }

    /* renamed from: o */
    public final int m102537o() {
        return this.f15278d;
    }

    /* renamed from: p */
    public final Boolean m102536p() {
        return this.f15281g;
    }

    /* renamed from: q */
    public final void m102535q(boolean z) {
        this.f15283i = z;
    }

    /* renamed from: r */
    public final void m102534r(int i) {
        this.f15277c = i;
    }

    /* renamed from: s */
    public final void m102533s(int i) {
        this.f15278d = i;
    }

    public String toString() {
        return "RequestExecutionOptions(client=" + this.f15286l + ", socketFactory=" + this.f15287m + ", hostnameVerifier=" + this.f15288n + ", executorService=" + this.f15289o + ", callbackExecutor=" + this.f15290p + ", requestTransformer=" + this.f15291q + ", responseTransformer=" + this.f15292r + ")";
    }
}
