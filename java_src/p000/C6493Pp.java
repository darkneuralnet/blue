package p000;

import co.bird.android.coreinterface.manager.AuthRejectionException;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p000.AbstractC2999H1;
import p000.AbstractC45608nJ4;
import p000.AbstractC5384Mp;
import p000.AbstractC5699Np;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\b*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000f0\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LPp;", "LOp;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "authHeader", "LnJ4;", "b", "Lhq;", C17296a.f69688o, "Lhq;", "authTokenManager", "Lio/reactivex/Observable;", "LMp;", "Lkotlin/Lazy;", "()Lio/reactivex/Observable;", "authErrors", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "authErrorsSubject", "<init>", "(Lhq;)V", "auth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAuthInterceptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthInterceptorImpl.kt\nco/bird/android/auth/api/interceptor/AuthInterceptorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* renamed from: Pp */
/* loaded from: classes2.dex */
public final class C6493Pp implements InterfaceC6181Op {

    /* renamed from: a */
    public final InterfaceC22767hq f29108a;

    /* renamed from: b */
    public final Lazy f29109b;

    /* renamed from: c */
    public final C24558d<AbstractC5384Mp> f29110c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "LMp;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pp$a */
    /* loaded from: classes2.dex */
    public static final class C6494a extends Lambda implements Function0<Observable<AbstractC5384Mp>> {
        public C6494a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<AbstractC5384Mp> invoke() {
            return C6493Pp.this.f29110c.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LNp;", "authHeaderResult", "LnJ4;", C17296a.f69688o, "(LNp;)LnJ4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pp$b */
    /* loaded from: classes2.dex */
    public static final class C6495b extends Lambda implements Function1<AbstractC5699Np, AbstractC45608nJ4> {

        /* renamed from: h */
        public final /* synthetic */ Interceptor.Chain f29113h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6495b(Interceptor.Chain chain) {
            super(1);
            this.f29113h = chain;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC45608nJ4 invoke(AbstractC5699Np authHeaderResult) {
            boolean z;
            Intrinsics.checkNotNullParameter(authHeaderResult, "authHeaderResult");
            if (authHeaderResult instanceof AbstractC2999H1.C3002c) {
                return new AbstractC45608nJ4.C26457a(((AbstractC2999H1.C3002c) authHeaderResult).m104500b(), null, 2, null);
            }
            if (!(authHeaderResult instanceof AbstractC2999H1.C3001b)) {
                if (authHeaderResult instanceof AbstractC2999H1.C3000a) {
                    return C6493Pp.this.m89745b(this.f29113h, null);
                }
                if (authHeaderResult instanceof AbstractC5699Np.C5700a) {
                    return C6493Pp.this.m89745b(this.f29113h, ((AbstractC5699Np.C5700a) authHeaderResult).m93366b());
                }
                if (authHeaderResult instanceof AbstractC2999H1.C3004e) {
                    z = true;
                } else {
                    z = authHeaderResult instanceof AbstractC2999H1.C3003d;
                }
                if (z) {
                    return AbstractC45608nJ4.C26458b.f99744a;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw ((AbstractC2999H1.C3001b) authHeaderResult).m104502a();
        }
    }

    public C6493Pp(InterfaceC22767hq authTokenManager) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        this.f29108a = authTokenManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C6494a());
        this.f29109b = lazy;
        C24558d<AbstractC5384Mp> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<AuthError>()");
        this.f29110c = m31902e;
    }

    @Override // p000.InterfaceC6181Op
    /* renamed from: a */
    public Observable<AbstractC5384Mp> mo89746a() {
        Object value = this.f29109b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-authErrors>(...)");
        return (Observable) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r7 != null) goto L9;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC45608nJ4 m89745b(Interceptor.Chain chain, String str) {
        Request request;
        Method m85878a;
        boolean isBlank;
        Request request2 = chain.request();
        boolean z = true;
        AbstractC5384Mp.C5386b c5386b = null;
        r2 = null;
        InterfaceC36098Te3 interfaceC36098Te3 = null;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!(!isBlank)) {
                str = null;
            }
            if (str != null) {
                request = request2.newBuilder().header("Authorization", str).build();
            }
        }
        request = request2;
        Response proceed = chain.proceed(request);
        if (proceed.code() == 401) {
            S92 s92 = (S92) request2.tag(S92.class);
            if (s92 != null && (m85878a = s92.m85878a()) != null) {
                interfaceC36098Te3 = (InterfaceC36098Te3) m85878a.getAnnotation(InterfaceC36098Te3.class);
            }
            if (interfaceC36098Te3 == null) {
                z = false;
            }
            c5386b = new AbstractC5384Mp.C5386b(request, z);
        }
        return new AbstractC45608nJ4.C26457a(proceed, c5386b);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        AbstractC45608nJ4 abstractC45608nJ4 = (AbstractC45608nJ4) this.f29108a.mo15260g(new C6495b(chain));
        AbstractC5384Mp authError = abstractC45608nJ4.getAuthError();
        if (authError != null) {
            this.f29110c.onNext(authError);
        }
        if (abstractC45608nJ4 instanceof AbstractC45608nJ4.C26457a) {
            return ((AbstractC45608nJ4.C26457a) abstractC45608nJ4).m23978c();
        }
        if (abstractC45608nJ4 instanceof AbstractC45608nJ4.C26458b) {
            throw new AuthRejectionException(chain.request());
        }
        throw new NoWhenBranchMatchedException();
    }
}
