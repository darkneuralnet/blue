package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.Headers;
import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.core.FuelError;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C49278tW0;
import p000.InterfaceC41113fk0;
import p000.LH1;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0011B/\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019\u0012\b\b\u0002\u0010#\u001a\u00020\u0019\u0012\u0006\u0010*\u001a\u00020$¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m28432d2 = {"LAN1;", "Lfk0;", "LpI4;", "request", "LFM4;", C17296a.f69688o, "b", "(LpI4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "connection", "", "f", "e", "i", "h", "Ljava/io/InputStream;", DateTokenConverter.CONVERTER_KEY, "g", "j", "LWT2;", "method", "k", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "proxy", "", "Z", "getUseHttpCache", "()Z", "setUseHttpCache", "(Z)V", "useHttpCache", "c", "getDecodeContent", "setDecodeContent", "decodeContent", "Lfk0$a;", "Lfk0$a;", "getHook", "()Lfk0$a;", "setHook", "(Lfk0$a;)V", "hook", "<init>", "(Ljava/net/Proxy;ZZLfk0$a;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: AN1 */
/* loaded from: classes5.dex */
public final class AN1 implements InterfaceC41113fk0 {

    /* renamed from: e */
    public static final List<String> f438e;

    /* renamed from: f */
    public static final C0081g f439f = new C0081g(null);

    /* renamed from: a */
    public final Proxy f440a;

    /* renamed from: b */
    public boolean f441b;

    /* renamed from: c */
    public boolean f442c;

    /* renamed from: d */
    public InterfaceC41113fk0.InterfaceC20497a f443d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/io/InputStream;", "b", "()Ljava/io/InputStream;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: AN1$a */
    /* loaded from: classes5.dex */
    public static final class C0075a extends Lambda implements Function0<InputStream> {

        /* renamed from: g */
        public final /* synthetic */ L74 f444g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0075a(L74 l74) {
            super(0);
            this.f444g = l74;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InputStream invoke() {
            L74 l74 = this.f444g;
            return l74 instanceof BufferedInputStream ? (BufferedInputStream) l74 : new BufferedInputStream(l74, C47896rA1.f106566t.m16314b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()J"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: AN1$b */
    /* loaded from: classes5.dex */
    public static final class C0076b extends Lambda implements Function0<Long> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef f445g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0076b(Ref.ObjectRef objectRef) {
            super(0);
            this.f445g = objectRef;
        }

        /* renamed from: b */
        public final long m115847b() {
            Long l = (Long) this.f445g.element;
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(m115847b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "readBytes", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: AN1$c */
    /* loaded from: classes5.dex */
    public static final class C0077c extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC46785pI4 f447h;

        /* renamed from: i */
        public final /* synthetic */ Ref.ObjectRef f448i;

        /* renamed from: j */
        public final /* synthetic */ WeakReference f449j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0077c(InterfaceC46785pI4 interfaceC46785pI4, Ref.ObjectRef objectRef, WeakReference weakReference) {
            super(1);
            this.f447h = interfaceC46785pI4;
            this.f448i = objectRef;
            this.f449j = weakReference;
        }

        /* renamed from: a */
        public final void m115846a(long j) {
            long j2;
            H74 m102542j = this.f447h.mo8565c().m102542j();
            Long l = (Long) this.f448i.element;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = j;
            }
            m102542j.m104386a(j, j2);
            AN1.this.m115854f(this.f447h, (HttpURLConnection) this.f449j.get());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m115846a(l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "key", "values", "", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: AN1$d */
    /* loaded from: classes5.dex */
    public static final class C0078d extends Lambda implements Function2<String, String, Unit> {

        /* renamed from: g */
        public final /* synthetic */ HttpURLConnection f450g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0078d(HttpURLConnection httpURLConnection) {
            super(2);
            this.f450g = httpURLConnection;
        }

        /* renamed from: a */
        public final void m115845a(String key, String values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(values, "values");
            this.f450g.setRequestProperty(key, values);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            m115845a(str, str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "key", "value", "", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: AN1$e */
    /* loaded from: classes5.dex */
    public static final class C0079e extends Lambda implements Function2<String, String, Unit> {

        /* renamed from: g */
        public final /* synthetic */ HttpURLConnection f451g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0079e(HttpURLConnection httpURLConnection) {
            super(2);
            this.f451g = httpURLConnection;
        }

        /* renamed from: a */
        public final void m115844a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f451g.addRequestProperty(key, value);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            m115844a(str, str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "writtenBytes", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: AN1$f */
    /* loaded from: classes5.dex */
    public static final class C0080f extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC46785pI4 f453h;

        /* renamed from: i */
        public final /* synthetic */ Long f454i;

        /* renamed from: j */
        public final /* synthetic */ HttpURLConnection f455j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0080f(InterfaceC46785pI4 interfaceC46785pI4, Long l, HttpURLConnection httpURLConnection) {
            super(1);
            this.f453h = interfaceC46785pI4;
            this.f454i = l;
            this.f455j = httpURLConnection;
        }

        /* renamed from: a */
        public final void m115843a(long j) {
            long j2;
            H74 m102544h = this.f453h.mo8565c().m102544h();
            Long l = this.f454i;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = j;
            }
            m102544h.m104386a(j, j2);
            AN1.this.m115854f(this.f453h, this.f455j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m115843a(l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LAN1$g;", "", "LWT2;", "method", "b", "", "", "SUPPORTED_DECODING", "Ljava/util/List;", "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: AN1$g */
    /* loaded from: classes5.dex */
    public static final class C0081g {
        private C0081g() {
        }

        /* renamed from: b */
        public final WT2 m115841b(WT2 wt2) {
            return wt2 == WT2.PATCH ? WT2.POST : wt2;
        }

        public /* synthetic */ C0081g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"gzip", "deflate; q=0.5"});
        f438e = listOf;
    }

    public AN1(Proxy proxy, boolean z, boolean z2, InterfaceC41113fk0.InterfaceC20497a hook) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.f440a = proxy;
        this.f441b = z;
        this.f442c = z2;
        this.f443d = hook;
    }

    @Override // p000.InterfaceC41113fk0
    /* renamed from: a */
    public FM4 mo40979a(InterfaceC46785pI4 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            return m115855e(request);
        } catch (IOException e) {
            this.f443d.mo10115d(request, e);
            throw FuelError.f69982c.m52051a(e, new FM4(request.mo8567a(), 0, null, null, 0L, null, 62, null));
        } catch (InterruptedException e2) {
            throw FuelError.f69982c.m52051a(e2, new FM4(request.mo8567a(), 0, null, null, 0L, null, 62, null));
        }
    }

    @Override // p000.InterfaceC41113fk0
    /* renamed from: b */
    public Object mo40978b(InterfaceC46785pI4 interfaceC46785pI4, Continuation<? super FM4> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        SafeContinuation safeContinuation = new SafeContinuation(intercepted);
        try {
            safeContinuation.resumeWith(Result.m116783constructorimpl(m115855e(interfaceC46785pI4)));
        } catch (IOException e) {
            this.f443d.mo10115d(interfaceC46785pI4, e);
            FuelError m52051a = FuelError.f69982c.m52051a(e, new FM4(interfaceC46785pI4.mo8567a(), 0, null, null, 0L, null, 62, null));
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(m52051a)));
        } catch (InterruptedException e2) {
            FuelError m52051a2 = FuelError.f69982c.m52051a(e2, new FM4(interfaceC46785pI4.mo8567a(), 0, null, null, 0L, null, 62, null));
            Result.Companion companion2 = Result.Companion;
            safeContinuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(m52051a2)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (orThrow == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* renamed from: d */
    public final InputStream m115856d(InterfaceC46785pI4 interfaceC46785pI4, HttpURLConnection httpURLConnection) {
        BufferedInputStream bufferedInputStream = null;
        try {
            InputStream mo10117b = this.f443d.mo10117b(interfaceC46785pI4, httpURLConnection.getInputStream());
            if (mo10117b != null) {
                if (mo10117b instanceof BufferedInputStream) {
                    bufferedInputStream = (BufferedInputStream) mo10117b;
                } else {
                    bufferedInputStream = new BufferedInputStream(mo10117b, 8192);
                }
            }
            return bufferedInputStream;
        } catch (IOException unused) {
            InputStream mo10117b2 = this.f443d.mo10117b(interfaceC46785pI4, httpURLConnection.getErrorStream());
            if (mo10117b2 != null) {
                if (mo10117b2 instanceof BufferedInputStream) {
                    return (BufferedInputStream) mo10117b2;
                }
                return new BufferedInputStream(mo10117b2, 8192);
            }
            return bufferedInputStream;
        }
    }

    /* renamed from: e */
    public final FM4 m115855e(InterfaceC46785pI4 interfaceC46785pI4) throws IOException, InterruptedException {
        HttpURLConnection m115853g = m115853g(interfaceC46785pI4);
        m115851i(interfaceC46785pI4, m115853g);
        return m115852h(interfaceC46785pI4, m115853g);
    }

    /* renamed from: f */
    public final void m115854f(InterfaceC46785pI4 interfaceC46785pI4, HttpURLConnection httpURLConnection) throws InterruptedException {
        boolean m61161a = C39247cd0.m61161a(interfaceC46785pI4);
        if (!m61161a) {
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
            if (!currentThread.isInterrupted()) {
                return;
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        throw new InterruptedException("[HttpClient] could not ensure Request was active: cancelled=" + m61161a);
    }

    /* renamed from: g */
    public final HttpURLConnection m115853g(InterfaceC46785pI4 interfaceC46785pI4) {
        URLConnection uRLConnection;
        URL mo8567a = interfaceC46785pI4.mo8567a();
        Proxy proxy = this.f440a;
        if (proxy == null || (uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(mo8567a.openConnection(proxy))) == null) {
            uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(mo8567a.openConnection());
        }
        if (uRLConnection != null) {
            return (HttpURLConnection) uRLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.Long] */
    /* renamed from: h */
    public final FM4 m115852h(InterfaceC46785pI4 interfaceC46785pI4, HttpURLConnection httpURLConnection) throws IOException, InterruptedException {
        boolean z;
        int collectionSizeOrDefault;
        Object lastOrNull;
        Object lastOrNull2;
        T t;
        boolean z2;
        boolean z3;
        boolean isBlank;
        boolean z4;
        InputStream byteArrayInputStream;
        long j;
        CharSequence trim;
        List split$default;
        m115854f(interfaceC46785pI4, httpURLConnection);
        this.f443d.mo10116c(interfaceC46785pI4);
        LH1.C4792a c4792a = LH1.f21034f;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields, "connection.headerFields");
        LH1 m97403c = c4792a.m97403c(headerFields);
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it = m97403c.get("Transfer-Encoding").iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            split$default = StringsKt__StringsKt.split$default((CharSequence) ((String) it.next()), new char[]{CoreConstants.COMMA_CHAR}, false, 0, 6, (Object) null);
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, split$default);
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList<String> arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (String str : arrayList) {
            if (str != null) {
                trim = StringsKt__StringsKt.trim((CharSequence) str);
                arrayList2.add(trim.toString());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull(m97403c.get(Headers.CONTENT_ENCODING));
        String str2 = (String) lastOrNull;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        lastOrNull2 = CollectionsKt___CollectionsKt.lastOrNull(m97403c.get("Content-Length"));
        String str3 = (String) lastOrNull2;
        if (str3 != null) {
            t = Long.valueOf(Long.parseLong(str3));
        } else {
            t = 0;
        }
        objectRef.element = t;
        Boolean m102549c = interfaceC46785pI4.mo8565c().m102549c();
        if (m102549c != null) {
            z2 = m102549c.booleanValue();
        } else {
            z2 = this.f442c;
        }
        if (z2 && str2 != null && (!Intrinsics.areEqual(str2, "identity"))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            m97403c.remove(Headers.CONTENT_ENCODING);
            m97403c.remove("Content-Length");
            objectRef.element = null;
        }
        m97403c.remove("Transfer-Encoding");
        if (!arrayList2.isEmpty()) {
            for (String str4 : arrayList2) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str4);
                if ((!isBlank) && (!Intrinsics.areEqual(str4, "identity"))) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            m97403c.remove("Content-Length");
            objectRef.element = -1L;
        }
        InputStream m115856d = m115856d(interfaceC46785pI4, httpURLConnection);
        if (m115856d == null || (byteArrayInputStream = C49269tV0.m12284c(m115856d, arrayList2, null, 2, null)) == null) {
            byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
        }
        if (z3 && str2 != null) {
            byteArrayInputStream = C49269tV0.m12283d(byteArrayInputStream, str2, null, 2, null);
        }
        L74 l74 = new L74(byteArrayInputStream, new C0077c(interfaceC46785pI4, objectRef, new WeakReference(httpURLConnection)));
        URL mo8567a = interfaceC46785pI4.mo8567a();
        Long l = (Long) objectRef.element;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage == null) {
            responseMessage = "";
        }
        return new FM4(mo8567a, responseCode, responseMessage, m97403c, j, C49278tW0.C28729c.m12260b(C49278tW0.f110565g, new C0075a(l74), new C0076b(objectRef), null, 4, null));
    }

    /* renamed from: i */
    public final void m115851i(InterfaceC46785pI4 interfaceC46785pI4, HttpURLConnection httpURLConnection) throws IOException, InterruptedException {
        boolean z;
        m115854f(interfaceC46785pI4, httpURLConnection);
        httpURLConnection.setConnectTimeout(Math.max(interfaceC46785pI4.mo8565c().m102538n(), 0));
        httpURLConnection.setReadTimeout(Math.max(interfaceC46785pI4.mo8565c().m102537o(), 0));
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(interfaceC46785pI4.mo8565c().m102539m());
            httpsURLConnection.setHostnameVerifier(interfaceC46785pI4.mo8565c().m102547e());
        }
        if (interfaceC46785pI4.mo8565c().m102548d()) {
            C35790Rw1.m86191a(httpURLConnection, interfaceC46785pI4.mo8555m());
            if (httpURLConnection.getRequestMethod() != interfaceC46785pI4.mo8555m().m78343a()) {
                httpURLConnection.setRequestMethod(f439f.m115841b(interfaceC46785pI4.mo8555m()).m78343a());
                httpURLConnection.setRequestProperty("X-HTTP-Method-Override", interfaceC46785pI4.mo8555m().m78343a());
            }
        } else {
            httpURLConnection.setRequestMethod(f439f.m115841b(interfaceC46785pI4.mo8555m()).m78343a());
            if (Intrinsics.areEqual(interfaceC46785pI4.mo8555m().m78343a(), "PATCH")) {
                httpURLConnection.setRequestProperty("X-HTTP-Method-Override", interfaceC46785pI4.mo8555m().m78343a());
            }
        }
        httpURLConnection.setDoInput(true);
        Boolean m102536p = interfaceC46785pI4.mo8565c().m102536p();
        if (m102536p != null) {
            z = m102536p.booleanValue();
        } else {
            z = this.f441b;
        }
        httpURLConnection.setUseCaches(z);
        httpURLConnection.setInstanceFollowRedirects(false);
        interfaceC46785pI4.getHeaders().m97407q(new C0078d(httpURLConnection), new C0079e(httpURLConnection));
        httpURLConnection.setRequestProperty("TE", LH1.f21034f.m97405a(new EH1("TE"), f438e));
        this.f443d.mo10118a(httpURLConnection, interfaceC46785pI4);
        m115849k(httpURLConnection, interfaceC46785pI4.mo8555m());
        m115850j(httpURLConnection, interfaceC46785pI4);
        httpURLConnection.connect();
    }

    /* renamed from: j */
    public final void m115850j(HttpURLConnection httpURLConnection, InterfaceC46785pI4 interfaceC46785pI4) {
        Long l;
        OutputStream outputStream;
        InterfaceC6029OY mo8554n = interfaceC46785pI4.mo8554n();
        if (!httpURLConnection.getDoOutput()) {
            return;
        }
        if (mo8554n.isEmpty()) {
            httpURLConnection.setFixedLengthStreamingMode(0L);
            return;
        }
        Long mo12269a = mo8554n.mo12269a();
        long j = -1;
        if (mo12269a != null && mo12269a.longValue() != -1) {
            httpURLConnection.setFixedLengthStreamingMode(mo12269a.longValue());
        } else {
            httpURLConnection.setChunkedStreamingMode(4096);
        }
        if (interfaceC46785pI4.mo8565c().m102544h().m104385b()) {
            outputStream = httpURLConnection.getOutputStream();
        } else {
            if (mo12269a != null) {
                j = mo12269a.longValue();
            }
            if (j > 0) {
                Intrinsics.checkNotNull(mo12269a);
                l = Long.valueOf(mo12269a.longValue());
            } else {
                l = null;
            }
            OutputStream outputStream2 = httpURLConnection.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream2, "connection.outputStream");
            O74 o74 = new O74(outputStream2, new C0080f(interfaceC46785pI4, l, httpURLConnection));
            int m16314b = C47896rA1.f106566t.m16314b();
            if (o74 instanceof BufferedOutputStream) {
                outputStream = (BufferedOutputStream) o74;
            } else {
                outputStream = new BufferedOutputStream(o74, m16314b);
            }
        }
        Intrinsics.checkNotNullExpressionValue(outputStream, "outputStream");
        mo8554n.writeTo(outputStream);
        httpURLConnection.getOutputStream().flush();
    }

    /* renamed from: k */
    public final void m115849k(HttpURLConnection httpURLConnection, WT2 wt2) {
        switch (C52755zN1.$EnumSwitchMapping$0[wt2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                httpURLConnection.setDoOutput(false);
                return;
            case 5:
            case 6:
            case 7:
            case 8:
                httpURLConnection.setDoOutput(true);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ AN1(Proxy proxy, boolean z, boolean z2, InterfaceC41113fk0.InterfaceC20497a interfaceC20497a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : proxy, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, interfaceC20497a);
    }
}
