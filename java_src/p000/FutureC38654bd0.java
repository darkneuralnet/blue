package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.core.FuelError;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 T2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001XJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u001b\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0096\u0001J\u001b\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00040\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u0004H\u0096\u0003J\u0019\u0010\u0012\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001J\u001d\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0096\u0001JE\u0010\u001f\u001a\u00020\u00012:\u0010\u001e\u001a6\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0016j\u0002`\u001dH\u0096\u0001J1\u0010%\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!0 j\b\u0012\u0004\u0012\u00020\"`$H\u0096\u0001JE\u0010&\u001a\u00020\u00012:\u0010\u001e\u001a6\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0016j\u0002`\u001dH\u0096\u0001J\u0011\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0096\u0001J\u0011\u0010+\u001a\n **\u0004\u0018\u00010\u00030\u0003H\u0096\u0001J)\u0010.\u001a\n **\u0004\u0018\u00010\u00030\u00032\u0006\u0010(\u001a\u00020\u00172\u000e\u0010-\u001a\n **\u0004\u0018\u00010,0,H\u0096\u0003J\t\u0010/\u001a\u00020'H\u0096\u0001J\t\u00100\u001a\u00020'H\u0096\u0001R\u001a\u00105\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R$\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010=j\u0002`>8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001c\u0010F\u001a\u00020B8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b6\u0010C\"\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR4\u0010V\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100P0Oj\u0002`Q8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001c\u0010[\u001a\u00020W8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\b1\u0010Z¨\u0006\\"}, m28432d2 = {"Lbd0;", "LpI4;", "Ljava/util/concurrent/Future;", "LFM4;", "", "toString", "LOY;", "body", "l", "Ljava/nio/charset/Charset;", "charset", DateTokenConverter.CONVERTER_KEY, "header", "", "Lcom/github/kittinunf/fuel/core/HeaderValues;", "get", "", "value", "i", "", "map", "g", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "readBytes", "totalBytes", "", "Lcom/github/kittinunf/fuel/core/ProgressCallback;", "handler", "e", "Lkotlin/Triple;", "LaN4;", "", "Lcom/github/kittinunf/fuel/core/FuelError;", "Lcom/github/kittinunf/fuel/core/ResponseResultOf;", "h", "j", "", "p0", "cancel", "kotlin.jvm.PlatformType", "r", "Ljava/util/concurrent/TimeUnit;", "p1", "s", "isCancelled", "isDone", "b", "Lbd0;", "t", "()Lbd0;", "request", "c", "LpI4;", "wrapped", "Ljava/util/concurrent/Future;", "future", "n", "()LOY;", "", "Lcom/github/kittinunf/fuel/core/RequestFeatures;", "k", "()Ljava/util/Map;", "enabledFeatures", "LII4;", "()LII4;", "p", "(LII4;)V", "executionOptions", "LLH1;", "getHeaders", "()LLH1;", "headers", "LWT2;", "m", "()LWT2;", "method", "", "Lkotlin/Pair;", "Lcom/github/kittinunf/fuel/core/Parameters;", "getParameters", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "parameters", "Ljava/net/URL;", C17296a.f69688o, "()Ljava/net/URL;", "(Ljava/net/URL;)V", "url", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: bd0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class FutureC38654bd0 implements InterfaceC46785pI4, Future<FM4> {

    /* renamed from: e */
    public static final String f57762e;

    /* renamed from: f */
    public static final C12457a f57763f = new C12457a(null);

    /* renamed from: b */
    public final FutureC38654bd0 f57764b;

    /* renamed from: c */
    public final InterfaceC46785pI4 f57765c;

    /* renamed from: d */
    public final Future<FM4> f57766d;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"Lbd0$a;", "", "LpI4;", "request", "Lbd0;", "b", "", "FEATURE", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: bd0$a */
    /* loaded from: classes5.dex */
    public static final class C12457a {
        private C12457a() {
        }

        /* renamed from: a */
        public final String m64265a() {
            return FutureC38654bd0.f57762e;
        }

        /* renamed from: b */
        public final FutureC38654bd0 m64264b(InterfaceC46785pI4 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            InterfaceC46785pI4 interfaceC46785pI4 = request.mo8557k().get(m64265a());
            if (!(interfaceC46785pI4 instanceof FutureC38654bd0)) {
                interfaceC46785pI4 = null;
            }
            return (FutureC38654bd0) interfaceC46785pI4;
        }

        public /* synthetic */ C12457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String canonicalName = FutureC38654bd0.class.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "CancellableRequest::class.java.canonicalName");
        f57762e = canonicalName;
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: a */
    public URL mo8567a() {
        return this.f57765c.mo8567a();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: b */
    public void mo8566b(URL url) {
        Intrinsics.checkNotNullParameter(url, "<set-?>");
        this.f57765c.mo8566b(url);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: c */
    public II4 mo8565c() {
        return this.f57765c.mo8565c();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f57766d.cancel(z);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: d */
    public InterfaceC46785pI4 mo8564d(String body, Charset charset) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return this.f57765c.mo8564d(body, charset);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: e */
    public InterfaceC46785pI4 mo8563e(Function2<? super Long, ? super Long, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f57765c.mo8563e(handler);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: f */
    public void mo8562f(List<? extends Pair<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f57765c.mo8562f(list);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: g */
    public InterfaceC46785pI4 mo8561g(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return this.f57765c.mo8561g(map);
    }

    @Override // p000.InterfaceC46785pI4
    public Collection<String> get(String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return this.f57765c.get(header);
    }

    @Override // p000.InterfaceC46785pI4
    public LH1 getHeaders() {
        return this.f57765c.getHeaders();
    }

    @Override // p000.InterfaceC46785pI4
    public List<Pair<String, Object>> getParameters() {
        return this.f57765c.getParameters();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: h */
    public Triple<InterfaceC46785pI4, FM4, AbstractC37918aN4<byte[], FuelError>> mo8560h() {
        return this.f57765c.mo8560h();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: i */
    public InterfaceC46785pI4 mo8559i(String header, Object value) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f57765c.mo8559i(header, value);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f57766d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f57766d.isDone();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: j */
    public InterfaceC46785pI4 mo8558j(Function2<? super Long, ? super Long, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f57765c.mo8558j(handler);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: k */
    public Map<String, InterfaceC46785pI4> mo8557k() {
        return this.f57765c.mo8557k();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: l */
    public InterfaceC46785pI4 mo8556l(InterfaceC6029OY body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return this.f57765c.mo8556l(body);
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: m */
    public WT2 mo8555m() {
        return this.f57765c.mo8555m();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: n */
    public InterfaceC6029OY mo8554n() {
        return this.f57765c.mo8554n();
    }

    @Override // p000.InterfaceC46785pI4
    /* renamed from: p */
    public void mo8552p(II4 ii4) {
        Intrinsics.checkNotNullParameter(ii4, "<set-?>");
        this.f57765c.mo8552p(ii4);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: r */
    public FM4 get() {
        return this.f57766d.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: s */
    public FM4 get(long j, TimeUnit timeUnit) {
        return this.f57766d.get(j, timeUnit);
    }

    @Override // p000.MI4
    /* renamed from: t */
    public FutureC38654bd0 getRequest() {
        return this.f57764b;
    }

    @Override // p000.InterfaceC46785pI4
    public String toString() {
        return "Cancellable[\n\r\t" + this.f57765c + "\n\r] done=" + isDone() + " cancelled=" + isCancelled();
    }
}
