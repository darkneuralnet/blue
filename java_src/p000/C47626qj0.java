package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p000.C47626qj0;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002\b\rB\u0011\b\u0002\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\t¨\u0006$"}, m28432d2 = {"Lqj0;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "", C17296a.f69688o, "Ljava/util/Set;", "headersToRedact", "", "LQY;", "b", "Ljava/util/List;", "decoders", "Lmj0;", "c", "Lmj0;", "collector", "LbJ4;", DateTokenConverter.CONVERTER_KEY, "LbJ4;", "requestProcessor", "LKM4;", "e", "LKM4;", "responseProcessor", "", "f", "skipPaths", "Lqj0$a;", "builder", "<init>", "(Lqj0$a;)V", "g", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChuckerInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1747#2,3:199\n*S KotlinDebug\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor\n*L\n74#1:199,3\n*E\n"})
/* renamed from: qj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47626qj0 implements Interceptor {

    /* renamed from: g */
    public static final C27659b f105664g = new C27659b(null);

    /* renamed from: h */
    public static final List<ZU3> f105665h;

    /* renamed from: a */
    public final Set<String> f105666a;

    /* renamed from: b */
    public final List<InterfaceC6796QY> f105667b;

    /* renamed from: c */
    public final C45254mj0 f105668c;

    /* renamed from: d */
    public final C38475bJ4 f105669d;

    /* renamed from: e */
    public final KM4 f105670e;

    /* renamed from: f */
    public final Set<String> f105671f;

    @Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b?\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\r\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010#\u001a\u0004\b\u0014\u0010$\"\u0004\b%\u0010&R(\u0010/\u001a\b\u0012\u0004\u0012\u00020)0(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00108\u001a\b\u0012\u0004\u0012\u000201008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010:\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010#\u001a\u0004\b2\u0010$\"\u0004\b9\u0010&R(\u0010>\u001a\b\u0012\u0004\u0012\u00020)0;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.¨\u0006@"}, m28432d2 = {"Lqj0$a;", "", "Lmj0;", "collector", "b", "Lqj0;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "setContext$com_github_ChuckerTeam_Chucker_library", "(Landroid/content/Context;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmj0;", "e", "()Lmj0;", "setCollector$com_github_ChuckerTeam_Chucker_library", "(Lmj0;)V", "", "c", "J", "j", "()J", "setMaxContentLength$com_github_ChuckerTeam_Chucker_library", "(J)V", "maxContentLength", "Lc80;", DateTokenConverter.CONVERTER_KEY, "Lc80;", "()Lc80;", "setCacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library", "(Lc80;)V", "cacheDirectoryProvider", "", "Z", "()Z", "setAlwaysReadResponseBody$com_github_ChuckerTeam_Chucker_library", "(Z)V", "alwaysReadResponseBody", "", "", "Ljava/util/Set;", "i", "()Ljava/util/Set;", "setHeadersToRedact$com_github_ChuckerTeam_Chucker_library", "(Ljava/util/Set;)V", "headersToRedact", "", "LQY;", "g", "Ljava/util/List;", "h", "()Ljava/util/List;", "setDecoders$com_github_ChuckerTeam_Chucker_library", "(Ljava/util/List;)V", "decoders", "setCreateShortcut$com_github_ChuckerTeam_Chucker_library", "createShortcut", "", "k", "setSkipPaths$com_github_ChuckerTeam_Chucker_library", "skipPaths", "<init>", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nChuckerInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor$Builder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,198:1\n13579#2,2:199\n*S KotlinDebug\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor$Builder\n*L\n177#1:199,2\n*E\n"})
    /* renamed from: qj0$a */
    /* loaded from: classes5.dex */
    public static final class C27658a {

        /* renamed from: a */
        public Context f105672a;

        /* renamed from: b */
        public C45254mj0 f105673b;

        /* renamed from: c */
        public long f105674c;

        /* renamed from: d */
        public InterfaceC38963c80 f105675d;

        /* renamed from: e */
        public boolean f105676e;

        /* renamed from: f */
        public Set<String> f105677f;

        /* renamed from: g */
        public List<? extends InterfaceC6796QY> f105678g;

        /* renamed from: h */
        public boolean f105679h;

        /* renamed from: i */
        public Set<String> f105680i;

        public C27658a(Context context) {
            Set<String> emptySet;
            List<? extends InterfaceC6796QY> emptyList;
            Intrinsics.checkNotNullParameter(context, "context");
            this.f105672a = context;
            this.f105674c = 250000L;
            emptySet = SetsKt__SetsKt.emptySet();
            this.f105677f = emptySet;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.f105678g = emptyList;
            this.f105679h = true;
            this.f105680i = new LinkedHashSet();
        }

        /* renamed from: a */
        public final C47626qj0 m17196a() {
            return new C47626qj0(this, null);
        }

        /* renamed from: b */
        public final C27658a m17195b(C45254mj0 collector) {
            Intrinsics.checkNotNullParameter(collector, "collector");
            this.f105673b = collector;
            return this;
        }

        /* renamed from: c */
        public final boolean m17194c() {
            return this.f105676e;
        }

        /* renamed from: d */
        public final InterfaceC38963c80 m17193d() {
            return this.f105675d;
        }

        /* renamed from: e */
        public final C45254mj0 m17192e() {
            return this.f105673b;
        }

        /* renamed from: f */
        public final Context m17191f() {
            return this.f105672a;
        }

        /* renamed from: g */
        public final boolean m17190g() {
            return this.f105679h;
        }

        /* renamed from: h */
        public final List<InterfaceC6796QY> m17189h() {
            return this.f105678g;
        }

        /* renamed from: i */
        public final Set<String> m17188i() {
            return this.f105677f;
        }

        /* renamed from: j */
        public final long m17187j() {
            return this.f105674c;
        }

        /* renamed from: k */
        public final Set<String> m17186k() {
            return this.f105680i;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lqj0$b;", "", "", "LZU3;", "BUILT_IN_DECODERS", "Ljava/util/List;", "", "MAX_CONTENT_LENGTH", "J", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qj0$b */
    /* loaded from: classes5.dex */
    public static final class C27659b {
        public /* synthetic */ C27659b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27659b() {
        }
    }

    static {
        List<ZU3> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(ZU3.f48682a);
        f105665h = listOf;
    }

    public /* synthetic */ C47626qj0(C27658a c27658a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27658a);
    }

    /* renamed from: c */
    public static final File m17197c(C27658a builder) {
        Intrinsics.checkNotNullParameter(builder, "$builder");
        return builder.m17191f().getFilesDir();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(chain, "chain");
        HttpTransaction httpTransaction = new HttpTransaction();
        Request request = chain.request();
        boolean z2 = false;
        if (C43475jj0.f93239a.m30039d()) {
            Set<String> set = this.f105671f;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (Intrinsics.areEqual(str, request.url().encodedPath())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                z2 = true;
            }
        }
        if (z2) {
            this.f105669d.m64684c(request, httpTransaction);
        }
        try {
            Response proceed = chain.proceed(request);
            if (z2) {
                return this.f105670e.m98969f(proceed, httpTransaction);
            }
            return proceed;
        } catch (IOException e) {
            httpTransaction.setError(e.toString());
            this.f105668c.m25140e(httpTransaction);
            throw e;
        }
    }

    public C47626qj0(final C27658a c27658a) {
        Set<String> mutableSet;
        List<InterfaceC6796QY> plus;
        Set<String> set;
        mutableSet = CollectionsKt___CollectionsKt.toMutableSet(c27658a.m17188i());
        this.f105666a = mutableSet;
        plus = CollectionsKt___CollectionsKt.plus((Collection) c27658a.m17189h(), (Iterable) f105665h);
        this.f105667b = plus;
        C45254mj0 m17192e = c27658a.m17192e();
        C45254mj0 c45254mj0 = m17192e == null ? new C45254mj0(c27658a.m17191f(), false, null, 6, null) : m17192e;
        this.f105668c = c45254mj0;
        this.f105669d = new C38475bJ4(c27658a.m17191f(), c45254mj0, c27658a.m17187j(), mutableSet, plus);
        InterfaceC38963c80 m17193d = c27658a.m17193d();
        this.f105670e = new KM4(c45254mj0, m17193d == null ? new InterfaceC38963c80() { // from class: pj0
            @Override // p000.InterfaceC38963c80
            /* renamed from: a */
            public final File mo18896a() {
                File m17197c;
                m17197c = C47626qj0.m17197c(C47626qj0.C27658a.this);
                return m17197c;
            }
        } : m17193d, c27658a.m17187j(), mutableSet, c27658a.m17194c(), plus);
        set = CollectionsKt___CollectionsKt.toSet(c27658a.m17186k());
        this.f105671f = set;
        if (c27658a.m17190g()) {
            C43475jj0.f93239a.m30042a(c27658a.m17191f());
        }
    }
}
